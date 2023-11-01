import com.example.spockframeworkdemo.SpockFrameworkDemoApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders

import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.result.ContentResultMatchers
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import spock.lang.Specification
import spock.lang.Unroll

import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessRequest
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = [SpockFrameworkDemoApplication.class])
@AutoConfigureMockMvc
@AutoConfigureRestDocs('target/generated-snippets')
class PetControllerSpec extends Specification {
    @Autowired
    MockMvc mockMvc

    @Unroll
    "API Pet FindById(#id) - #description"() {

        when:
        def response = mockMvc.perform(RestDocumentationRequestBuilders.get("/v1/pets/{id}",id)
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
        then:
        response.andExpect(new ContentResultMatchers().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcRestDocumentation.document(snippetId,
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint())))
        where:
        snippetId               | description                           | id | expected
        'devops-cenario-1'      | 'Cenário buscando um cachorro'        | 1  | [id: 1, nome: 'Doguingo', idade: 0, raca: 'Viralata', porte: 'GRANDE', tipo: 'CACHORRO']
        'devops-cenario-2'      | 'Cenário buscando um gato'            | 2  | [id: 2, nome: 'Gatinho', idade: 0, raca: 'Viralata', porte: 'GRANDE', tipo: 'GATO']

    }

}
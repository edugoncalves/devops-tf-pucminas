package com.example.spockframeworkdemo.controller.V1_0

import spock.lang.Specification
import spock.lang.Unroll

class CalculadoraSpec extends Specification{
    @Unroll
   def "Caculadora Teste Soma #a+#b=#c"(){
            expect:
            a+b== c
            where:
            a | b | c
            1 | 3 | 4
            7 | 4 | 11
            0 | 0 | 4
        }
    @Unroll
    def "Máximo entre dois números #a e #b "(int a, int b, int c) {
        expect:
        Math.max(a, b) == c

        where:
        a | b | c
        1 | 3 | 3
        7 | 4 | 7
        0 | 0 | 0
    }


}

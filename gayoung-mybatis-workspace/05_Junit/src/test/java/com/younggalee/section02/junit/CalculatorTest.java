package com.younggalee.section02.junit;

import com.younggalee.section02.junit.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/*
    ## 단정문 ##
    1. 테스트 예상결과와 실제결과를 비교하는 문장
    2. 예상 결과와 일치하면 테스트 성공으로 판단
    3. Junit 단정문, hamcrest, assertj-core**등에서 제공
       >> assertj-core 많이 사용
 */
class CalculatorTest {

    // Fixture(테스트할 대상 또는 테스트에 필요한 객체) 준비
    private Calculator calc = null;

    @BeforeEach
    //@Test
    void setUp() {
        calc = new Calculator();
        //assertNotNull(calc); // 특정 객체가 null이 아닌지를 비교
    }

    @AfterEach
    void tearDown() {
        System.out.println("단위테스트 완료");
    }


    @DisplayName("두 수의 합 확인")
    @Test
    void sum() {
        int result = calc.sum(4, 5);
        assertEquals(9, result); // Junit의 반정문 / 예상값, 실제값
        //assertEquals(10, result);

        // assertj - assertThat(실제값).isEqualTo(기대값)
        assertThat(result).isEqualTo(9);
    }

    @DisplayName("랜덤 값 구하기")
    @Test
    void random() {
        int result = calc.random();
        assertThat(result).isGreaterThanOrEqualTo(100);

        assertThat(result).isLessThanOrEqualTo(200);
        assertThat(result).isBetween(100,200);
    }
}
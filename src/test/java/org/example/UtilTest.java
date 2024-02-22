package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
  @author   yaroslavkuzenko
  @project   lab2_TDD
  @class  UtilTest
  @version  1.0.0 
  @since 21.02.2024 - 18.47
*/

class UtilTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenRomanStringIsEmptyThenThrowsException(){
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Util.convertRomanToArabic("");
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals(exception.getMessage(), "йкес дуриствітство");
    }

    @Test
    void whenRomanStringIsNullThenThrowsException(){
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Util.convertRomanToArabic(null);
        });
        Assertions.assertSame(exception.getClass(), NullPointerException.class);
    }

    @Test
    void whenRomanStringIsTrashThenThrowsException(){
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Util.convertRomanToArabic("XsI");
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals(exception.getMessage(), "містить символи, що не є складовими римських чисел");
    }

    @Test
    public void whenNumberIs_I_Then_1(){
        assertEquals(Util.convertRomanToArabic("I"), 1);
    }

    @Test
    public void whenNumberIs_III_Then_3(){
        assertEquals(Util.convertRomanToArabic("III"), 3);
    }

    @Test
    public void whenNumberIs_V_Then_5(){
        assertEquals(Util.convertRomanToArabic("V"), 5);
    }

    @Test
    public void whenNumberIs_IV_Then_4(){
        assertEquals(Util.convertRomanToArabic("IV"), 4);
    }

    @Test
    public void whenNumberIs_VI_Then_6(){
        assertEquals(Util.convertRomanToArabic("VI"), 6);
    }

    @Test
    public void whenNumberIs_X_Then_10(){
        assertEquals(Util.convertRomanToArabic("X"), 10);
    }

    @Test
    public void whenNumberIs_IX_Then_9(){
        assertEquals(Util.convertRomanToArabic("IX"), 9);
    }

    @Test
    public void whenNumberIs_XI_Then_11(){
        assertEquals(Util.convertRomanToArabic("XI"), 11);
    }

    @Test
    public void whenNumberIs_XXX_Then_30(){
        assertEquals(Util.convertRomanToArabic("XXX"), 30);
    }

    @Test void whenNumberIs_XXXVII_Then_37(){
        assertEquals(Util.convertRomanToArabic("XXXVII"), 37);
    }

    @Test void whenNumberIs_L_Then_50(){
        assertEquals(Util.convertRomanToArabic("L"), 50);
    }

    @Test void whenNumberIs_XL_Then_40(){
        assertEquals(Util.convertRomanToArabic("XL"), 40);
    }

    @Test void whenNumberIs_LX_Then_60(){
        assertEquals(Util.convertRomanToArabic("LX"), 60);
    }

    @Test void whenNumberIs_C_Then_100(){
        assertEquals(Util.convertRomanToArabic("C"), 100);
    }

    @Test void whenNumberIs_XC_Then_90(){
        assertEquals(Util.convertRomanToArabic("XC"), 90);
    }

    @Test void whenNumberIs_CXX_Then_120(){
        assertEquals(Util.convertRomanToArabic("CXX"), 120);
    }

    @Test void whenNumberIs_XCIX_Then_99(){
        assertEquals(Util.convertRomanToArabic("XCIX"), 99);
    }

    @Test void whenNumberIs_CL_Then_150(){
        assertEquals(Util.convertRomanToArabic("CL"), 150);
    }

    @Test void whenNumberIs_CCC_Then_300(){
        assertEquals(Util.convertRomanToArabic("CCC"), 300);
    }

    @Test void whenNumberIs_D_Then_500(){
        assertEquals(Util.convertRomanToArabic("D"), 500);
    }

    @Test void whenNumberIs_CD_Then_400(){
        assertEquals(Util.convertRomanToArabic("CD"), 400);
    }

    @Test void whenNumberIs_DCCC_Then_800(){
        assertEquals(Util.convertRomanToArabic("DCCC"), 800);
    }

    @Test void whenNumberIs_M_Then_1000(){
        assertEquals(Util.convertRomanToArabic("M"), 1000);
    }

    @Test void whenNumberIs_CM_Then_900(){
        assertEquals(Util.convertRomanToArabic("CM"), 900);
    }

    @Test void whenNumberIs_MC_Then_1100(){
        assertEquals(Util.convertRomanToArabic("MC"), 1100);
    }

    @Test void whenNumberIs_MD_Then_1500(){
        assertEquals(Util.convertRomanToArabic("MD"), 1500);
    }

    @Test void whenNumberIs_MDCC_Then_1700(){
        assertEquals(Util.convertRomanToArabic("MDCC"), 1700);
    }

    @Test void whenNumberIs_MCDL_Then_1450(){
        assertEquals(Util.convertRomanToArabic("MCDL"), 1450);
    }

    @Test void whenNumberIs_MM_Then_2000(){
        assertEquals(Util.convertRomanToArabic("MM"), 2000);
    }

    @Test void whenNumberIs_MMMCMXCIX_Then_3999(){
        assertEquals(Util.convertRomanToArabic("MMMCMXCIX"), 3999);
    }

}
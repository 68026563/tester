import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class gradecalculatorTest {

    @Test

    public void TC1_MaxBoundary_A() {

        assertEquals("A", gradecalculator.calculateGrade(100));

    }

    @Test

    public void TC2_MinBoundary_A() {

        assertEquals("A", gradecalculculator.calculateGrade(80));

    }

    @Test

    public void TC3_MaxBoundary_BPlus() {

        assertEquals("B+", gradecalculator.calculateGrade(79));

    }

    @Test

    public void TC4_MinBoundary_BPlus() {

        assertEquals("B+", gradecalculator.calculateGrade(75));

    }

    @Test

    public void TC5_MinBoundary_B() {

        assertEquals("B", gradecalculator.calculateGrade(70));

    }

    @Test

    public void TC6_MinBoundary_CPlus() {

        assertEquals("C+", gradecalculator.calculateGrade(65));

    }

    @Test

    public void TC7_MinBoundary_C() {

        assertEquals("C", gradecalculator.calculateGrade(60));

    }

    @Test

    public void TC8_MinBoundary_DPlus() {

        assertEquals("D+", gradecalculator.calculateGrade(55));

    }

    @Test

    public void TC9_MinBoundary_D() {

        assertEquals("D", gradecalculator.calculateGrade(50));

    }

    @Test

    public void TC10_MaxBoundary_F() {

        assertEquals("F", gradecalculator.calculateGrade(49));

    }

    @Test

    public void TC11_MinBoundary_F() {

        assertEquals("F", gradecalculator.calculateGrade(0));

    }

    @Test

    public void TC12_Invalid_BelowZero() {

        assertThrows(IllegalArgumentException.class, () -> {

            gradecalculator.calculateGrade(-1);

        });

    }

    @Test

    public void TC13_Invalid_AboveHundred() {

        assertThrows(IllegalArgumentException.class, () -> {

            gradecalculator.calculateGrade(101);

        });

    }

}

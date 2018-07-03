package ru.levelup.Titova_Oxana.qa.homework_1.task_1_3;


import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.Stream;

import static junit.framework.TestCase.assertEquals;

public class TestRtriangle {

    @Test
    public void object_is_right_triangle() {

        Rtriangle rtriangle=RtriangleProvider.getRtriangle();

        int[] sidesOfTriangle = Utils.getSortedSquaresSides(rtriangle);

        int sumSquaresCathetus = sidesOfTriangle[0] + sidesOfTriangle[1];
        int squareHypotenuse = sidesOfTriangle[2];

        assertEquals(sumSquaresCathetus, squareHypotenuse);
    }



    private static class Utils {

        public static int[] getSortedSquaresSides(Rtriangle rtriangle) {
            return Stream.of(
                    Math.pow((rtriangle.getApexX2() - rtriangle.getApexX1()), 2) + (int) Math.pow((rtriangle.getApexY2() - rtriangle.getApexY1()), 2),
                    Math.pow((rtriangle.getApexX3() - rtriangle.getApexX1()), 2) + (int) Math.pow((rtriangle.getApexY3() - rtriangle.getApexY1()), 2),
                    Math.pow((rtriangle.getApexX3() - rtriangle.getApexX2()), 2) + (int) Math.pow((rtriangle.getApexY3() - rtriangle.getApexY2()), 2)
            ).sorted().mapToInt(
                    Double::intValue
            ).toArray();
        }
    }

}



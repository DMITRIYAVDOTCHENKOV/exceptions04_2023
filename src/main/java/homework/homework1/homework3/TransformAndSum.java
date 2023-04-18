package homework.homework1.homework3;

import homework.homework1.homework3.myException.MyArrayDataException;
import homework.homework1.homework3.myException.MyArraySizeException;

import static java.lang.Integer.valueOf;

public class TransformAndSum {

    static int transformAndSum(String[][] in) throws MyArraySizeException, MyArrayDataException {
        int arrDim = 4;
        int sum = 0;

        if (in.length != 4) {
            throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.", arrDim, arrDim));
        }

        for (String[] strings : in) {
            if (strings.length != 4) {
                throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.", arrDim, arrDim));
            }
        }

        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                try {
                    sum += valueOf(in[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В позиции [%d][%d] исходного массива находится не " +
                            "целое число - %s.", i, j, in[i][j]));
                }
            }
        }

        return sum;
    }
}

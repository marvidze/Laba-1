package realization;

public class Number {
    // числовое значение объекта
    private int _value;
    // простое ли числовое значение объекта
    private boolean _isSimple;

    private static Number[] arrayNumbers;

    /*
     * конструктор класса Number определяет значение полей ._value и ._isSimple
     * принимает int value - числовое значение объекта
     */

    public Number(int value) {
        _value = value;

        _isSimple = true;
        for (int i = 2; i < value; i++) {
            if (_value % i == 0) {
                _isSimple = false;
                break;
            }
        }
        if (_value < 2)
            _isSimple = true;
    }

    /*
     * разделяет полученную строку и добавляет объекты в массив
     * принимает String line - строка с числами через пробел
     * возврещает arrayNumbers - массив из чисел строки line
     */

    // static public String[] createSimpleArray() {

    // String[] simpleArray = new String[arrayNumbers.length];
    // int index = 0;
    // for (int i = 0; i < arrayNumbers.length; i++) {
    // if (arrayNumbers[i]._isSimple == true) {
    // simpleArray[index] = Integer.toString(arrayNumbers[i]._value);
    // index++;
    // }
    // }

    // return simpleArray;
    // }

    static public Number[] splitLine(String line) {
        String[] arrayLine = line.split(" ");
        arrayNumbers = new Number[arrayLine.length];

        for (int i = 0; i < arrayLine.length; i++) {
            arrayNumbers[i] = new Number(Integer.parseInt(arrayLine[i]));
        }

        return arrayNumbers;
    }

    static public String createSimpleLine() {
        String simpleLine = "";

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i]._isSimple) {
                simpleLine += Integer.toString(arrayNumbers[i]._value) + " ";
            }
        }

        return simpleLine;
    }
}

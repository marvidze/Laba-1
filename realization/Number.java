package realization;

public class Number {
    // числовое значение объекта
    private int _value;
    // простое ли числовое значение объекта
    private boolean _isSimple;

    // массив элементов Number
    private static Number[] arrayNumbers;

    // конструктор по умолчанию
    public Number() {
        _value = 0;
        _isSimple = true;
    }

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

    // делит полученную строку на числа и создаёт массив типа Number
    static public Number[] splitLine(String line) {
        String[] arrayLine = line.split(" ");
        arrayNumbers = new Number[arrayLine.length];

        for (int i = 0; i < arrayLine.length; i++) {
            arrayNumbers[i] = new Number(Integer.parseInt(arrayLine[i]));
        }

        return arrayNumbers;
    }

    // создаёт строку простых чисел для вывда на консоль
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

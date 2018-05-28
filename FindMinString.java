package Lab1Code;

public class FindMinString extends InsertSorting {

    public FindMinString(String[] enteredLines) {
        this.enteredLines = enteredLines;
    }

    public String findAndPrintMinStringAndLength() {
        sortLinesByLengthMinToMax();
        System.out.println("Min line is: " + enteredLines[0]);
        System.out.println("It's length is: " + enteredLines[0].length());

        return enteredLines[0];
    }
}

package Lab1Code;

public class InsertSorting {
    String[] enteredLines;

    protected String[] sortLinesByLengthMinToMax (){
        for (int i = 1; i < enteredLines.length; i++){
            for (int j = i; j > 0 && enteredLines[j-1].length() > enteredLines[j].length(); j--){
                String temp = enteredLines[j-1];
                enteredLines[j-1] = enteredLines[j];
                enteredLines[j] = temp;
            }
        }
        return enteredLines;
    }
}

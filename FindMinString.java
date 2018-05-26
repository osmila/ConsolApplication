public class FindMinString {
    String[] enteredLines;

    public FindMinString(String[] enteredLines) {
        this.enteredLines = enteredLines;
    }

    public String[] sortLinesByLengthMinToMax (){
        for (int i = 1; i < enteredLines.length; i++){
            for (int j = i; j > 0 && enteredLines[j-1].length() > enteredLines[j].length(); j--){
                String temp = enteredLines[j-1];
                enteredLines[j-1] = enteredLines[j];
                enteredLines[j] = temp;
            }

        }
        return enteredLines;
    }

    public void printMinStringAndLength(){
        System.out.println("Min line is:" + enteredLines[0]);
        System.out.println("It's length is:" + enteredLines[0].length());
    }
}

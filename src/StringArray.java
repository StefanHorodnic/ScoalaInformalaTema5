public class StringArray {

    public static void main(String[] args) {

        String[] strings = new String[]{"PrimulString","AlDoileaString","AlTreileaString"};

        String addedString = "";

        for (int i = 0; i < strings.length; i++) {
            addedString = addedString + strings[i];
        }

        System.out.println(addedString);
    }
}

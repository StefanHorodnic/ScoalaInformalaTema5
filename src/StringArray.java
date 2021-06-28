public class StringArray {

    public static void main(String[] args) {

        String[] strings = new String[]{"PrimulString", "AlDoileaString", "AlTreileaString"};

        StringBuilder addedString = new StringBuilder();

        for (String string : strings) {
            addedString.append(string);
        }

        System.out.println(addedString);
    }
}

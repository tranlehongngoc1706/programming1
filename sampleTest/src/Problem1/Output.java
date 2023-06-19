package Problem1;

public class Output {
    public String Output(String str) {
        // use i = 0, j = 1 then i++ and ++j to compare each pair of letters (except when i == str.length-1 because when
        // i represents the index of the last letter, there is no letter for j to represent.

        int j = 1;
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);


            if (i == (str.length() - 1))
                break;

            if (Character.isUpperCase(character) && Character.isLowerCase(str.charAt(j)) || Character.isLowerCase(character) && Character.isUpperCase(str.charAt(j))) {
                output += str.substring(i,j) + '&';
            } else {
                output += str.substring(i,j);
            }
            ++j;

        }

        // plus the last character of the input into the output
        // (if it's a letter, has already been guaranteed by the hasNoneAlphabetic() method )
        output += str.substring(str.length() - 1);
        return output;
    }
}

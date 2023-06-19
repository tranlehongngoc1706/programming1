package Problem1;

public class hasNoneAlphabetic {
    public boolean hasNoneAlphabetic(String str) {
        boolean has = false;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if ((!Character.isAlphabetic(character)))
                has = true;
        }
        return has;
    }
}

package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2+string1;
    }

    public char getChar(String string, int index) {
        return index>=0 && index<string.length() ? string.charAt(index) : ' ';
    }

    public String iCantSee(String string) {
        return new String(new char[string.length()]).replace('\0', ' ');
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {

        StringBuilder sb = new StringBuilder();
        for(int c:string.toCharArray()) {
            sb.append(
                    Character.isLowerCase(c)?
                            (char) Character.toUpperCase(c) :
                            (char) Character.toLowerCase(c)
            );
        }
        return sb.toString();
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<string1.length(); i++) {
            if(i>=string2.length()){
                sb.append(string1.substring(i));
                break;
            }
            sb.append(string1.charAt(i));
            sb.append(string2.charAt(i));
        }
        if(string2.length()>string1.length()){
            sb.append(string2.substring(string2.length()-string1.length()));
        }

        return sb.toString();
    }
}

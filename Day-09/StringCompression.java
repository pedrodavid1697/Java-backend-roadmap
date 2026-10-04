public class StringCompression {

    public static String compress(String text) {
        if(text.isEmpty() ){
            return "";
        }
        String result = "";
        int count =1;
        for(int i=0; i<text.length(); i++) {
            if(i+1<text.length() && text.charAt(i) == text.charAt(i+1) ) {
                count++;
            }
            else {
                result = result + text.charAt(i)+count;
                count =1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String text = "aaabbccccdd";
        System.out.println(compress(text));
    }
}

public class UsernameValidator {

    public static boolean isValidUsername(String username) {
        if(username.length()<5) {
            return false;
        }
        for(int i=0; i<username.length(); i++) {
            char user = username.charAt(i);
            if(user==' '){
                return false;
            }
            if (!Character.isLetter(user) &&  (!Character.isDigit(user)) ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

//        String username = "David123";
//        String username = "Dav";
//        String username = "David Pedro";
        String username = "David@123";
        if(isValidUsername(username)) {
            System.out.println(username + " is "+"Valid");
        }
        else {
            System.out.println(username + " is "+"Invalid");
        }
    }
}

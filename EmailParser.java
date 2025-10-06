public class EmailParser{
    public static void main(String[] emailArgs){
        String email = emailArgs[0];
        int userIndex = email.indexOf("@");
        String username = email.substring(0,userIndex);
        int dotIndex = username.indexOf(".");
        String firstName = username.substring(0,dotIndex);
        String lastName = username.substring(dotIndex+1);
        System.out.println(firstName+" "+lastName);
    }
}

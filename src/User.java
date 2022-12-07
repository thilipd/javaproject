
import java.util.Scanner;

class User {
    String userName;
    String email;
    String password;

    Scanner sc = new Scanner(System.in);

    // register(){

    // }

    String login() {

        System.out.println("Please Enter your email :");

        String mailId = sc.nextLine();

        System.out.println("Please enter your password :");

        String pwd = sc.nextLine();

        if (this.email.equals(mailId) && this.password.equals(pwd)) {

            String res = "Login successful";
            return res;

        } else {

            String res = "invalid details";
            return res;
        }

    }

}

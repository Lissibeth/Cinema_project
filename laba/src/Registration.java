import java.util.Scanner;

public class Registration{
   public Client RegistrationClient(){
       String string_name = null;
       String string_number = null;
       String string_mail = null;
       int cost = 0;
       System.out.println(" Введите ваше имя ");
       Scanner input = new Scanner(System.in);
       string_name = input.nextLine();
       System.out.println(" Введите ваш номер ");
       Scanner inputt = new Scanner(System.in);
       string_number = inputt.nextLine();
       System.out.println(" Введите ваш mail ");
       Scanner inputtt = new Scanner(System.in);
       string_mail = inputtt.nextLine();
       System.out.println(" Введите ваш бюджет ");
       Scanner inputttt = new Scanner(System.in);
       cost = inputttt.nextInt();
       return new Client(string_name, string_number, string_mail, cost);
   }
    public Admin RegistrationAdmin(Admin new_admin){
        int number;
        System.out.println(" Введите пароль ");
        Scanner inpul = new Scanner(System.in);
        number = inpul.nextInt();
        if (new_admin.CheckParol()) {
            String string_name = null;
            String string_sex = null;
            int age = 0;
            System.out.println(" Введите ваше имя ");
            Scanner input = new Scanner(System.in);
            string_name = input.nextLine();
            System.out.println(" Введите ваш пол ");
            Scanner inputt = new Scanner(System.in);
            string_sex = inputt.nextLine();
            ;
            System.out.println(" Введите ваш возраст ");
            Scanner inputttt = new Scanner(System.in);
            age = inputttt.nextInt();
            return new Admin(string_name, string_sex, age);
        }
        return new Admin(null,null, 0);
    }
}

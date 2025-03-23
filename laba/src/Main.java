import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hall first = new Hall(3, 2);
        first.SetInf(200);
        //    first.SetInf();
        Cinema Kino = new Cinema("Империя Грез", 100, first, "г Москва ул Бауманская д 5", 2);
        String[] VariantFormats = new String[2];
        VariantFormats[0] = "2D";
        VariantFormats[1] = "3D";
        Kino.SetFormat(VariantFormats);
        //     Kino.GetCinemaInf();
        System.out.println();
        Film Bond = new Film(" Джеймс Бонд ", 2023, " Бондиана ", 180, " 2D ");
        //      Bond.GetInfFilm();
        Session Morning = new Session(Kino, Bond, " 10:00 ");
        Morning.GetInfSession();
        Client James = new Client(" Бонд, Джеймс Бонд ", " 007 ", " Agent007@bk.ru ", 300);
        James.GetInfoClient();

        CaseMenu firstChoise = new CaseMenu();
        firstChoise.start(Bond, Morning, first, James);
        Admin director = new Admin("Ми6"," Мужской ", 53);
        director.start(first);
        Registration registr = new Registration();
        int number;
        do {
            System.out.println(" Введите 1 - зарегистрироваться как админ, введите 2 - зарегистрироваться как клиент, введите 3 - чтобы выйти ");
            Scanner inpul = new Scanner(System.in);
            number = inpul.nextInt();
            switch(number) {
                case 1:
                    Admin new_admin = registr.RegistrationAdmin(director);
                    System.out.println(" Добро пожаловать, новый админ " + new_admin );
                    new_admin.start(first);
                    break;
                case 2:
                    Client new_client = registr.RegistrationClient();
                    System.out.println(" Добро пожаловать, новый клиент " + new_client);
                    CaseMenu secondChoise = new CaseMenu();
                    secondChoise.start( Bond, Morning, first, new_client);
                    break;
                case 3:
                    break;
            }
        } while(number!=3);
    }
}
// Администратор вводит пароль 1 раз, функция в администраторе = сделать int а не void; добавить, когда нет денег;
// Администратор и Клиент наследники одного класса person. Должен быть класс Регистрации. Можно создать нового клиента
// Можно чоздвть ноыого Админа (доход не зависит от какого-то Админстратора (доход одинаковый)
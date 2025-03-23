import java.util.Scanner;

public class Admin extends Person {
    private final int parol = 111;

    public Admin(String Name, String Sex, int age ){
        this.Name = Name;
        this.Sex = Sex;
        this.age = age;
    }
    private void printMenu() {
        System.out.println("1. Вывод общей выручки за все Сеансы;");
        System.out.println("2. Вывод количества проданных билетов;");
        System.out.println("3. Выход из приложения;");
    }

    public boolean CheckParol() {
        int number;
        System.out.println(" Введите пароль ");
        Scanner inputt = new Scanner(System.in);
        number = inputt.nextInt();
        if (number == parol) {
            return true;
        }
        return false;
    }

    public void start(Hall hall) {
            int key;
            Scanner inputt = new Scanner(System.in);
            key = inputt.nextInt();
            if (CheckParol()) {
                do {
                    printMenu();
                    System.out.print("Введите номер меню: ");
                    Scanner input = new Scanner(System.in);
                    key = inputt.nextInt();
                    switch (key) {
                        case 1:
                            System.out.println(hall.Summ());
                            break;
                        case 2:
                            System.out.println(hall.AmountClients());
                            break;
                        case 3:
                            break;
                    }
                } while (key != 3);
            }
    }
}

    //  public void Doxod(Hall hall){
   //     Scanner input = new Scanner(System.in);
   //     int number = input.nextInt();
   //     if (number == parol){
  //          hall.Summ();
  //      }
 //  }

  // public void AllSoldTickets(Hall hall){
  //     Scanner input = new Scanner(System.in);
  //     int number = input.nextInt();
 //      if (number == parol){
   //       System.out.println(hall.AmountClients());
   //    }
  // }


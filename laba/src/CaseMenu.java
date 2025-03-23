import java.util.Scanner;

public class CaseMenu {
    private int scanner;


     public CaseMenu() {
       Scanner input = new Scanner(System.in);
       this.scanner = input.nextInt();
   }

    private void printMenu() {
        System.out.println("1. Выбор по времени сеанса;");
        System.out.println("2. Выбор по стоимости билета;");
        System.out.println("3. Выбор по названию фильма;");
        System.out.println("4. Выход из приложения;");
    }

    public void start(Film film, Session session, Hall hall ,Client user) {
        if (this.scanner != 0) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер меню: ");
                Scanner inputt = new Scanner(System.in);
                key = inputt.nextInt();
                switch (key) {
                    case 1:
                        session.ShowTimeSession(session);
                        System.out.println(" Если время подходит - введите 1, если нет - 0");
                        int choisse = inputt.nextInt();
                        System.out.println(" Выберете ряд и место из свободных");
                        hall.FreePlaces();
                        int roww = inputt.nextInt();
                        int coll = inputt.nextInt();
                        if ((choisse == 1 ) && (hall.FreeOrNot(roww,coll))){
                            hall.Booked(roww,coll,user,hall);
                        }
                        break;
                    case 2:
                        System.out.print("Ознакомтесь с ценами на билет");
                        hall.GetInf();
                        if (user.CheckCost(hall.GetPrice())){
                            System.out.println(" Если хотите приобрести билет - введите 1, если нет - 0");
                            Scanner console = new Scanner(System.in);
                            int choissen = console.nextInt();
                            System.out.println(" Выберете ряд и место из свободных");
                            hall.FreePlaces();
                            Scanner rowss = new Scanner(System.in);
                            int rowww = rowss.nextInt();
                            Scanner colss = new Scanner(System.in);
                            int colll = colss.nextInt();
                            if ((choissen == 1 ) && (hall.FreeOrNot(rowww,colll))){
                                hall.Booked(rowww,colll,user,hall);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Ознакомтесь с названиями фильмов");
                        film.ShowFilmNames();
                        if (user.CheckCost(hall.GetPrice())){
                            System.out.println(" Если хотите приобрести билет - введите 1, если нет - 0");
                            Scanner console = new Scanner(System.in);
                            int choissen = console.nextInt();
                            System.out.println(" Выберете ряд и место из свободных");
                            hall.FreePlaces();
                            Scanner rowss = new Scanner(System.in);
                            int rowww = rowss.nextInt();
                            Scanner colss = new Scanner(System.in);
                            int colll = colss.nextInt();
                            if ((choissen == 1 ) && (hall.FreeOrNot(rowww,colll))){
                                hall.Booked(rowww,colll,user,hall);
                            }
                        }
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...\n");
                }
            } while (key != 4);
        }
    }
}

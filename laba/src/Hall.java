public class Hall {
    private int[][]inf = null;
    private int row , cols ;
    private int price = 200;
    private int[][]free = null;
    private int sum;
    private int amount;
    public  Hall(int row, int cols){
        inf = new int[row][cols];
        free = new int[row][cols];
        this.row = row;
        this.cols = cols;
        for (int i=0; i < free.length;i++){
            for (int j=0;j < free[i].length;j++){
                free[i][j]=0;
            }
        }
    }

    public void SetInf (int price){
        for (int i = 0; i < inf.length; i++) {
            for (int j = 0; j < inf[i].length; j++) {
                this.inf[i][j] = price;
            }
        }
    }
    public void SetInfFree(){
        for (int i = 0; i < inf.length; i++) {
            for (int j = 0; j < inf[i].length; j++) {
                this.free[i][j] = 0;
            }
        }
    }
    public void GetInf(){
        for (int i=0; i < inf.length; i++){
            for (int j=0;j < inf[i].length;j++){
                System.out.println("Ряд " + i + " Место " + j + " Цена " + inf[i][j]);
            }
        }
    }
    public void FreePlaces(){
        for (int i=0; i< free.length;i++){
            for (int j=0; j<free[i].length;j++){
                System.out.println("Ряд(Row) = " + i + " Место(Col) = " + j + " Сколько человек сидит = " + free[i][j]);
            }
        }
    System.out.println();
    }
    public boolean FreeOrNot(int chosenRow, int chosenCol){
        if (free[chosenRow][chosenCol] == 0){
            return true;
        }
        return false;
    }
    public void Booked(int chosenRow, int chosenCol, Client client, Hall hall){
        if (client.CheckCost(hall.price)) {
            this.free[chosenRow][chosenCol] = 1;
            this.sum = this.sum + inf[chosenRow][chosenCol];
            client.BuyTicket(client, hall.price);
        }
        if (!client.CheckCost(hall.price)){
            System.out.println(" У вас нет денег! Пополните баланс! ");
        }
    }
    public int Summ(){
        return this.sum;
    }
    public int GetPrice(){
        return price;
    }
    public void Libiration(){
        for (int i = 0; i < free.length; i++){
            for (int j = 0; j < free[i].length; j++){
                this.free[i][j]=0;
            }
        }
    }
    public int AmountClients(){
        this.amount = 0;
        for (int i = 0; i < free.length; i++){
            for (int j = 0; j < free[i].length; j++){
                if(free[i][j] == 1){
                   this.amount++;
                }
            }
        }
    return amount;
    }
 }

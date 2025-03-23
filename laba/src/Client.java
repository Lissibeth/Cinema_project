public class Client extends Person{
    private String Name;
    private String CallNumber;
    private String Mail;
    private int Cost;
    public Client(String Name, String CallNumber, String Mail, int Cost){
        this.Name = Name;
        this.CallNumber = CallNumber;
        this.Mail = Mail;
        this.Cost = Cost;
    }
    public void SetInfoClient (String Name, String CallNumber, String Mail, int Cost){
        this.Name = Name;
        this.CallNumber = CallNumber;
        this.Mail = Mail;
        this.Cost = Cost;
    }
    public void GetInfoClient(){
        System.out.println(" ФИO " + Name + " Номер телефона " + CallNumber + " Майл " + Mail + " Бюджет " + Cost);
    }
    public boolean CheckCost(int Amount){
        if (this.Cost >= Amount){
            return true;
        }
    return false;
    }

    public void BuyTicket(Client client,int Amount){
        System.out.println("Вычитаем из суммы " + Amount);
        client.Cost = client.Cost - Amount;
        System.out.println(" Ваш баланс теперь " + client.Cost);
    }
}

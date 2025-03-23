public class Cinema {
    private String Name;
    private int MaxAmount;
    private Hall FirstHall;
    private String Address;
    private String[] Format;
    private int amount;
    public Cinema (String Name, int MaxAmount, Hall FirstHall, String Address, int amount){
        this.Name = Name;
        this.MaxAmount = MaxAmount;
        this.FirstHall = FirstHall;
        this.Address = Address;
        this.amount = amount;
        Format = new String[amount];
    }
    public void SetFormat(String[] VariantFormats){
        for (int i =0; i < Format.length; i++){
            Format[i] = VariantFormats[i];
        }
    }
    public void GetCinemaInf(){
        System.out.println("Название = " + Name + " Максимальная вместимость = " + MaxAmount + " Адрес = " + Address);
        System.out.println(" Информация о зале ");
        FirstHall.GetInf();
        for (int i=0; i < Format.length; i++){
            System.out.print (Format[i]);
        }
    }
}

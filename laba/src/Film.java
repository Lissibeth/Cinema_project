public class Film {
    private String Name;
    private int Year;
    private String Gener;
    private int TimeMin;
    private String Format;

    public Film(String Name, int Year, String Gener, int TimeMin, String Format){
        this.Name = Name;
        this.Year = Year;
        this.Gener = Gener;
        this.TimeMin = TimeMin;
        this.Format = Format;
    }
    public void SetInfFilm(String Name, int Year, String Gener, int TimeMin, String Format){
        this.Name = Name;
        this.Year = Year;
        this.Gener = Gener;
        this.TimeMin = TimeMin;
        this.Format = Format;
    }
    public void GetInfFilm(){
        System.out.println("Название " + Name + " Год " + Year + " Жанр " + Gener + " Продолжительность " + TimeMin + " Формат " + Format);
    }
    public void ShowFilmNames(){
        System.out.println(this.Name);
    }
}

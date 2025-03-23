public class Session {
    private Cinema FirstCinema;
    private Film ChosenFilm;
    private String TimeSession;
    public Session (Cinema FirstCinema, Film ChosenFilm, String TimeSession){
        this.FirstCinema = FirstCinema;
        this.ChosenFilm = ChosenFilm;
        this.TimeSession = TimeSession;
    }
    public void SetInfSession(Cinema FirstCinema, Film ChosenFilm, String TimeSession){
        this.FirstCinema = FirstCinema;
        this.ChosenFilm = ChosenFilm;
        this.TimeSession = TimeSession;
    }
    public void GetInfSession(){
        System.out.println(" Кинотеатр, в котором будет сеанс ");
        FirstCinema.GetCinemaInf();
        System.out.println();
        System.out.println(" Название Фильма на сеансе ");
        ChosenFilm.GetInfFilm();
        System.out.println(" Время сеанса " + TimeSession);
    }
    public void ShowTimeSession(Session session){
        System.out.println(" Время сеанса " + session.TimeSession);
    }
}

public interface InterFilm {
	public String titulo();
	public String duration();
	public String genre();
	public int parental_ratting();
	public float rating();
	public String description();
	public String cast();

public class Film implements InterFilm{
	
	public String title(){
		String title = "";

}
	public String duration(){}
	
	public String genre(){}
	
	public int parental_ratting(){}
	
	public float rating(){}
	
	public String description(){}
	
	public String cast(){}

	

}

public class Film{
	public static void main(String argc[]){
	String title = "";
	String duration; 
	String genre = "";
	int parental_rating;
	float rating;
	String description = "";
	String cast = "";
	
	title = "Parasite";
	duration = "2h 12 min";
	genre = "Triller";
	parental_rating = 18;
	rating = 9;
	description = " Parasite follows the Kim family struggling to make ends meet until son Ki-woo comes across an unexpected opportunity. With no experience teaching English, he decides to accept a job tutoring Da-hye, a daughter from the wealthy Park family. And thus,a mission ensues for the entire Kim family to infiltrate the lavish household.";
	cast = "Song Kang-ho (father, Kim Ki-taek)\nJang Hye-jin (mother, Kim Chung-sook)\nChoi Woo-shik (son, Kim Ki-woo a.k.a. Kevin)\nPark So-dam (daughter, Kim Ki-jeong a.k.a. Jessica)\nLee Sun-kyun (father, Park Dong-ik)\nCho Yeo-jeong (mother, Choi Yeon-gyo)\nJung Hyeon-jun (son, Park Da-song)\nJung Ji-so (daughter, Park Da-hye)\nLee Jung-eun (the housekeeper, Gook Moon-gwang)\nPark Myung-hoon (the housekeeper’s husband, Geun-sae)\nPark Geun-rok (the chauffeur, Yoon)\nPark Seo-joon (Min-hyuk)";

	System.out.println("\nRating: "+rating);
	System.out.println("\nGenre: "+genre);
	System.out.println("\nTitle: "+title);
	System.out.println("\nDuration: "+duration);
	System.out.println("\nParental Rating: "+parental_rating);
	System.out.println("\nDescription: "+description);
	System.out.println("\nCast: "+cast);
	}
}
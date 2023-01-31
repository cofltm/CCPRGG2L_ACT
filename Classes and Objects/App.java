public class App {
    public static void main(String[] args) {
        
        Movies m1 = new Movies ("20th Century Girl", "Melodrama", "PG-13", "Korean", 
        2022, "South Korea", "Bang Woo - Ri", "English", "Beginning");
        
        System.out.println(" ");
        
        Movies m2 = new Movies ("Howl's Moving Castle", "Fantasy", "U", "Japanese", 
        2004, "Japan", "Hayao Miyazaki", "English", "Sekai no Yakusoku");

        System.out.println(" ");
        m1.displayInfo();
        m1.play();
        System.out.println(" ");
        m2.displayInfo();
        m2.play();
        
    }
}

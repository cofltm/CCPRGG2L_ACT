class Movies {
    
  private String title = "20th Century Girl";
  private String genre = "Melodrama";
  private String rating = "PG-13";
  private String language = "Korean";
  private int releaseYear = 2022;
  private String country = "South Korea";
  private String director = "Bang Woo-Ri";
  private String subtitle = "English";
  private String soundtrack = "Beginning";

  public Movies(String title, String genre, String rating, String language, int releaseYear,
    String country, String director, String subtitle, String soundtrack) {

    this.title = title;
    this.genre = genre;
    this.rating = rating;
    this.language = language;
    this.releaseYear = releaseYear;
    this.country = country;
    this.director = director;
    this.subtitle = subtitle;
    this.soundtrack = soundtrack;
  }

  public void displayInfo() {
    System.out.println("Title: " + title);
    System.out.println("Genre: " + genre);
    System.out.println("Rating: " + rating);
    System.out.println("Language: " + language);
    System.out.println("Release year: " + releaseYear);
    System.out.println("Country: " + country);
    System.out.println("Director: " + director);
    System.out.println(" ");
  }

  public void play() {
    System.out.println("Subtitle: " + subtitle);
    System.out.println("Soundtrack: " + soundtrack);
    System.out.println(" ");
  }

  public String getTitle() {
      return title;
  }

  public String getGenre() {
      return genre;
  }

  public String getRating() {
      return rating;
  }

  public String getLanguage() {
      return language;
  }

  public int getReleaseYear() {
      return releaseYear;
  }

  public String getCountry() {
      return country;
  }

  public String getDirector() {
      return director;
  }
}

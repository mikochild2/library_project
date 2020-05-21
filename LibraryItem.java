public class LibraryItem{
    private long id;
    private String title;
    private Author [] authors;
    private String publisher;
    private int pages;
    private String genre;
    private String subgenre;
    private int totalCopies;
    private int availCopies;


    public LibraryItem(long id, String title, Author authors[], String publisher, int pages, String genre, String subgenre, int totalCopies, int availCopies){
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.pages = pages;
        this.genre = genre;
        this.subgenre = subgenre;
        this.totalCopies = totalCopies;
        this.availCopies = availCopies; 
    }
}
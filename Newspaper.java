public class Newspaper extends Periodicals {
    String location;

    public Newspaper(long id, String title, Author[] authors, String publisher, int pages, String genre,
            String subgenre, int totalCopies, int availCopies, double edition, String location, FormatOptions formatOption) {
        super(id, title, authors, publisher, pages, genre, subgenre, totalCopies, availCopies, edition, formatOption);
        this.location = location;
    }
    
}
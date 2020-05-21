public class Ebooks extends LibraryItem {
    private String series;
    private String format;
    private String artist;

    public Ebooks(long id, String title, Author[] authors, String publisher, int pages, String genre, String subgenre, int totalCopies, int availCopies, String series, String format, String artist) {
        super(id, title, authors, publisher, pages, genre, subgenre, totalCopies, availCopies);
        this.series = series;
        this.format = format;
        this.artist = artist;
    }

    //getters

    //setters
}
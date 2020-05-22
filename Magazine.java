public class Magazine extends Periodicals {

    public Magazine(long id, String title, Author[] authors, String publisher, int pages, String genre, String subgenre, int totalCopies, int availCopies, double edition, FormatOptions formatOption) {
        super(id, title, authors, publisher, pages, genre, subgenre, totalCopies, availCopies, edition, formatOption);
    }
    
}
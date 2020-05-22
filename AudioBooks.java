public class AudioBooks extends LibraryItem {
    Narrator[] narrators;
    //will add length in time

    public AudioBooks(long id, String title, Author[] authors, String publisher, int pages, String genre,
            String subgenre, int totalCopies, int availCopies, Narrator narrators[], FormatOptions formatOption) {
        super(id, title, authors, publisher, pages, genre, subgenre, totalCopies, availCopies, formatOption);
        this.narrators = narrators;
    }

    //getters

    //setters
}
public class Ebooks extends LibraryItem implements Loanable, Reservable{
    private String series;
    private String artist;

    public Ebooks(long id, String title, Author[] authors, String publisher, int pages, String genre, String subgenre, int totalCopies, int availCopies, String series, String artist, FormatOptions formatOption) {
        super(id, title, authors, publisher, pages, genre, subgenre, totalCopies, availCopies, formatOption);
        this.series = series;
        this.artist = artist;
    }

    //getters
    public String getSeries(){
        return series;
    }

    public String getArtist(){
        return artist;
    }


    //setters

    public void setSeries(String series){
        this.series = series;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }



    @Override
    public String toString(){
        return super.toString() + "Series: " + getSeries() + "Artist: " + getArtist();
    }


    @Override
    public boolean isLoanable() {
        return false;
    }

    @Override
    public boolean isReservable() {
        return false;
    }
}
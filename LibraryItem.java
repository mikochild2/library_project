public class LibraryItem{
    private long id;
    private String title;
    private Author [] authors; //I want to be able to add multiple authors to an item
    private String publisher;
    private int pages; // more of my subclasses use pages than not
    private String genre;
    private String subgenre;
    private int totalCopies;
    private int availCopies;
    private FormatOptions formatOption;
    //more variables in my outline that I will add later after I get this working


    public LibraryItem(long id, String title, Author[] authors, String publisher,
            int pages, String genre, String subgenre, int totalCopies, int availCopies, FormatOptions formatOption) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.pages = pages;
        this.genre = genre;
        this.subgenre = subgenre;
        this.totalCopies = totalCopies;
        this.availCopies = availCopies; 
        this.formatOption = formatOption;
    }

    public void itemAdded(){
        System.out.println(String.format("Book added!\nID: %S\n Title: %s\n'Author(s): %s\n Publisher: %s\n Genre: %s\n Subgenre: %s\nPages: %s\nTotal Copies: %s\n Available Copies: %s", id, title, authors, publisher, genre, subgenre, pages, totalCopies, availCopies));
    }
    

    //Getters

    public FormatOptions getFormatOption(){
        return formatOption;
    }

    public long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getPublisher(){
        return publisher;
    }

    public int getPages(){
        return pages;
    }

    public String getGenre(){
        return genre;
    }

    public String getSubgenre(){
        return subgenre;
    }
    
    public int getTotalCopies(){
        return totalCopies;
    }

    public int getAvailCopies(){
        return availCopies;
    }

    //setters

    public void setFormatOption(FormatOptions formatOption){
        this.formatOption = formatOption;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setSubgenre(String subgenre){
        this.subgenre = subgenre;
    }
    
    public void setTotalCopies(int totalCopies){
        this.totalCopies = totalCopies;
    }

    public void setAvailCopies(int availCopies){
        this.availCopies = availCopies;
    }

    @Override
    public String toString(){
        return "\nTitle: " + title + "Author(s): " + authors + "Publisher: " + publisher + "Genere: " + genre + "Subgenre: " + subgenre + "Pages: " + pages + "Total Copies: " + totalCopies + "Available Copies: " + availCopies;
    }
}
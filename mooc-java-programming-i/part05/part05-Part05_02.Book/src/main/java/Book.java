public class Book {
    private String author;
    private String name;
    private int pages;

    public Book (String  author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor () {
        return this.author;
    }

    public String getName () {
        return this.name;
    }

    public int getPages () {
        return this.pages;
    }

    public String toString () {
        return author + ", " + name + ", " + pages + " pages";
    }
}

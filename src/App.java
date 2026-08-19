public class App {
    String author;
    String name;
    int yearPublish;


    public App(String author, String name, int yearPublish) {

        this.author = author;
        this.name = name;
        this.yearPublish = yearPublish;
    }
    public String getAuthor() {

        return this.author;
    }
    public String getName() {
        return this.name;

    }
    public int getYearPublish() {

        return this.yearPublish;
    }

    public void setYearPublish(int yearPublish) {

        this.yearPublish=yearPublish;
    }


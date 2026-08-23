public class Book {
    private Author author ;
    private String name;

    private int yearPublish;


    // Конструктор с параметрами для удобного создания книг
    public Book(Author author, String name, int yearPublish) {
        this.author = author;
        this.name = name;
        this.yearPublish = yearPublish;
    }


    public String getAuthorName() {
        return this.author.toString(); // Возвращает строку с именем
    }


    public String getName() {
        return this.name;

    }

    public int getYearPublish() {

        return this.yearPublish;
    }

    public void setYearPublish(int yearPublish) {

        this.yearPublish = yearPublish;
    }

}
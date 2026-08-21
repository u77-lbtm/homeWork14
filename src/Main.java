public class Main {
    String Author;
    String name;
    int yearPublish;
    public static void main(String[] args) {
        Book book1 = new Book("Brain Backs ", "Black Hat ", 2020);
        System.out.println("book1.getAuthorName() = " + book1.getAuthorName());
        System.out.println("book1.getName() = " + book1.getName());
        System.out.println("book1.getYearPublish() = " + book1.getYearPublish());
        System.out.println("");

        Book book2 = new Book("Brain Red ", "Red Hat ", 2023);
        System.out.println("book2.getAuthorName() = " + book2.getAuthorName());
        System.out.println("book2.getName() = " + book2.getName());
        System.out.println("book2.getYearPublish() = " + book2.getYearPublish());
        System.out.println("");

        Book book3 = new Book("Dolev Farhi", "Blach Hat Bash ", 2023);
        System.out.println("book3.getAuthorName() = " + book3.getAuthorName());
        System.out.println("book3.getName() = " + book3.getName());
        System.out.println("book3.getYearPublish() = " + book3.getYearPublish());
        System.out.println("");


        Author author1 = new Author("Alex ", "Robachevsky ");
        System.out.println("author1.getFirstName() = " + author1.getFirstName());
        System.out.println("author1.getLastName() = " + author1.getLastName());

        Author author2 = new Author("Dolev ","Farhi ");
        System.out.println("author2 = " + author2);
        System.out.println("");

        book3.setYearPublish(2024);
        System.out.println("book3.getYearPublish() = " + book3.getYearPublish());

    }
}

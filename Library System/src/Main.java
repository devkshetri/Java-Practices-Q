public class Main {

    public static void main(String[] args) {

        EBook ebook = new EBook();
        PhysicalBook book = new PhysicalBook();

        ebook.search("Java");
        book.search("Java");
    }
}
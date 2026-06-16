public interface Searchable {

    void search(String keyword);
}

class EBook implements Searchable {

    public void search(String keyword) {
        System.out.println("Searching EBook for: " + keyword);
    }
}
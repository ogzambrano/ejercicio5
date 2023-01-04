public class Main {
    public static CocheCRUD cochecrud;
    public static void main(String[] args) {
        cochecrud = new CocheCRUDImpl();
        cochecrud.save();
        cochecrud.findAll();
        cochecrud.delete();
    }
}
public class Praktikum {

    public static void main(String[] args) {
        String name = "Some Name";
        Account account = new Account(name);
        if (account.checkNameToEmboss()) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Invalid name!");
        }
    }

}

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        try {
            if ((name.length() >= 3 && name.length() <= 19)
                    && !name.endsWith(" ")
                    && !name.startsWith(" ")) {
                int count = 0;
                for (int i = 0; i < name.length(); i++) {
                    if (name.charAt(i) == ' ') {
                        count++;
                    }
                }
                if (count == 1) {
                    return true;
                }
            }
        } catch (NullPointerException e) {
            throw e;
        }
        return false;
    }

}

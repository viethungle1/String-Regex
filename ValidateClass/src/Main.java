public class Main {
    private static ValidateClass accountExample;
    public static final String[] validAccount = {"C0223G", "A0323K","M0318G", "P0323A"};

    public static void main(String args[]) {
        accountExample = new ValidateClass();
        for (String account : validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
    }
}
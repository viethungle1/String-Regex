public class Main {
    private static ValidatePhone accountExample;
    public static final String[] validAccount = {"(84)-(0978489648)", "(a8)-(22222222)","(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String args[]) {
        accountExample = new ValidatePhone();
        for (String account : validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
    }
}
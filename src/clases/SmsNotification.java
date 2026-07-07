package clases;

/**
 * SmsNotification
 */
public final record SmsNotification(int number, String message) implements Notification {

    public SmsNotification {
        validarNumero(number);
    }

    private void validarNumero(int number) {
        if (String.valueOf(number).length() != 10) {
            throw new IllegalArgumentException("Invalid phone number!");
        }
    }
    
}

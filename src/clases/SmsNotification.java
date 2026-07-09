package clases;

/**
 * SmsNotification
 */
public final record SmsNotification(String number, String message) implements Notification {

    public SmsNotification {
        validarNumero(number);
    }

    private void validarNumero(String number) {
        if (!number.matches("\\d+") || number.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number!");
        }
    }
    
}

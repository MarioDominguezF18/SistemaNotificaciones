package clases;

/**
 * PushNotification
 */
public final record PushNotification(String token, String message) implements Notification {

    public PushNotification {
        validarToken(token);
    }

    private void validarToken(String token) {
        if (token == null || token.isBlank()) {
            throw new IllegalArgumentException("Invalid token!");
        }
    }
    
}

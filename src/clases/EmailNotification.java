package clases;

/**
 * EmailNotification
 */
public final record EmailNotification(String email, String subject, String message) implements Notification {

    public EmailNotification {
        validarCorreo(email);
    }

    private void validarCorreo(String correo) {
        if (!correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            throw new IllegalArgumentException("Invalid email!");
        }
    }
    

}

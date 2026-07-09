package test;


import clases.EmailNotification;
import clases.Notification;
import clases.PushNotification;
import clases.SmsNotification;

public class Test {
    public static void main(String[] args) {
        int emailC = 0, smsC = 0, pushC = 0;
        Notification[] notifications = {
            new PushNotification("abc456xyz872", "Push"),
            new EmailNotification("mario@empresa.com", "notification", "hola"),
            new SmsNotification("1928162799", "notification"),
            new EmailNotification("juanito@empresa.com", "notification", "hola"),
            new SmsNotification("5567981279", "notification"),
            new PushNotification("abc123xyz987", "Push"),
            new SmsNotification("5512345678", "notification"),
            new PushNotification("abc123xyz987", "Push"),
            new EmailNotification("Carlitos@empresa.com", "notification", "hola"),
            new PushNotification("abc123xyz987", "Push"),
            new SmsNotification("5512345678", "notification"),
        };
        
        for (Notification notification : notifications) {
            switch(notification){
                case EmailNotification emailNotification -> emailC++;
                case SmsNotification smsNotification-> smsC++;
                case PushNotification  pushNotification-> pushC++;
            }  
        }

        System.out.println("========= RESUMEN =========");
        System.out.println("Correos enviados: " + emailC);
        System.out.println("SMS enviados: " + smsC);
        System.out.println("Push enviados: " + pushC);
        System.out.println("Total: " + notifications.length);
    }
}

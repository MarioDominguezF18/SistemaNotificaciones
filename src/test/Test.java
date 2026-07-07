package test;

import javax.management.Notification;

import clases.EmailNotification;
import clases.PushNotification;
import clases.SmsNotification;

public class Test {
    public static void main(String[] args) {
        int emailC = 0, smsC = 0, pushC = 0;
        Notification[] notifications ={
            // new EmailNotification(null, null, null),
            // new SmsNotification(0, null),
            // new PushNotification(null, null),
        };

        for (Notification notification : notifications) {
            String type = notification.getClass().getSimpleName();
            switch(type){
                case "EmailNotification" -> emailC++;
                case "SmsNotification" -> smsC++;
                case "PushNotification" -> pushC++;
            }
        }

        System.out.println("========= RESUMEN =========");
        System.out.println("Correos enviados: " + emailC);
        System.out.println("SMS enviados: " + smsC);
        System.out.println("Push enviados: " + pushC);
        System.out.println("Total: " + notifications.length);
    }
}

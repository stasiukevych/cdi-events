package cdievents.buissness.observers;

import cdievents.buissness.Notification;
import cdievents.buissness.NotificationByType;
import cdievents.buissness.NotificationByType.NotificationType;
import jakarta.enterprise.event.Observes;

public class NotificationYearObserver {

  public void accept(
      @Observes @NotificationByType(typeOf = NotificationType.YEAR) Notification notification
  ) {
    System.out.println("Start creation of year notification");
    System.out.println("Notify: " + notification.getMessage());
    System.out.println("Ent creation of year notification");
  }
}
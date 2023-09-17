package cdievents.buissness;

import jakarta.enterprise.util.AnnotationLiteral;

public class NotificationBinding extends AnnotationLiteral<NotificationByType> implements
    NotificationByType {

  NotificationType type;

  public NotificationBinding(NotificationType type) {
    this.type = type;
  }

  @Override
  public NotificationType typeOf() {
    return type;
  }
}
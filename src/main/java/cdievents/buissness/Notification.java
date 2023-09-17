package cdievents.buissness;

import java.util.Date;
import java.util.Objects;

public class Notification {

  private String message;
  private Date dateOfCreation;

  public Notification() {

  }

  public Notification(String message, Date dateOfCreation) {
    this.message = message;
    this.dateOfCreation = dateOfCreation;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Date getDateOfCreation() {
    return dateOfCreation;
  }

  public void setDateOfCreation(Date dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification that = (Notification) o;
    return Objects.equals(message, that.message) && Objects.equals(dateOfCreation,
        that.dateOfCreation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, dateOfCreation);
  }

  @Override
  public String toString() {
    return "Notification{" +
        "message='" + message + '\'' +
        ", dateOfCreation=" + dateOfCreation +
        '}';
  }
}
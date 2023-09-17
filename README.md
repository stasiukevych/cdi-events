# CDI Events with dynamic qulifier

## Events

Beans may produce and consume events. This facility allows beans to interact in a completely
decoupled fashion, with no compile-time dependency between the interacting beans. Most importantly,
it allows stateful beans in one architectural tier of the application to synchronize their internal
state with state changes that occur in a different tier.

An event comprises:

- A Java object - the event object;
- A set of instances of qualifier types - the event qualifiers

copied
from [cdi tutorials](https://jakarta.ee/specifications/cdi/4.0/jakarta-cdi-spec-4.0.html#events)

## Project

Was described the second one. Used the
qualifier [NotificationByType.java](/src/main/java/cdievents/buissness/NotificationByType.java)
for dynamic choosing which observer will be invoked. All observers are
in [observers package](/src/main/java/cdievents/buissness/observers). For testing, you can use a
simple controller which fire
different [Notification.java](/src/main/java/cdievents/buissness/Notification.java) related on
notification type.
# Lösungen — 08 JOptionPane

## Lösung E46
```java
import javax.swing.*;

void main() {
    JOptionPane.showMessageDialog(
        null,
        "Java 25 läuft!",
        "Status",
        JOptionPane.INFORMATION_MESSAGE
    );
}
```

## Lösung E47
```java
import javax.swing.*;

void main() {
    String text = JOptionPane.showInputDialog(
        null,
        "Ganze Zahl:",
        "Eingabe",
        JOptionPane.QUESTION_MESSAGE
    );

    long zahl = Long.parseLong(text);
    long quadrat = zahl * zahl;

    JOptionPane.showMessageDialog(
        null,
        "Quadrat: " + quadrat,
        "Ergebnis",
        JOptionPane.INFORMATION_MESSAGE
    );
}
```

## Lösung E48
```java
import javax.swing.*;

void main() {
    int result = JOptionPane.showConfirmDialog(
        null,
        "Wirklich speichern?",
        "Speichern",
        JOptionPane.YES_NO_OPTION
    );

    if (result == JOptionPane.YES_OPTION) {
        IO.println("Gespeichert");
    }
}
```

## Lösung E49
```java
import javax.swing.*;

void main() {
    String text = JOptionPane.showInputDialog(
        null,
        "Text eingeben:"
    );

    if (text == null) {
        IO.println("Abgebrochen");
    } else {
        IO.println(text);
    }
}
```

**Wichtig:** `null` und `""` sind unterschiedliche Zustände.

## Lösung E50
```java
import javax.swing.*;

void main() {
    String text = JOptionPane.showInputDialog(
        null,
        "Ganze Zahl:",
        "Zahlenprüfer",
        JOptionPane.QUESTION_MESSAGE
    );

    if (text == null) {
        return;
    }

    long zahl = Long.parseLong(text);

    String result;

    if (zahl > 0) {
        result = "positiv";
    } else if (zahl < 0) {
        result = "negativ";
    } else {
        result = "null";
    }

    JOptionPane.showMessageDialog(
        null,
        result,
        "Ergebnis",
        JOptionPane.INFORMATION_MESSAGE
    );
}
```

Bei `"abc"` bleibt weiterhin `NumberFormatException` als unbehandelter Laufzeitfehler. Die systematische Exception-Behandlung gehört zu einem späteren Kapitel.

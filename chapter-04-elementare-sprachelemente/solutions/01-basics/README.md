# Lösungen — 01 Basics

Öffne diese Datei erst nach dem eigenen Versuch.

---

## Lösung E01

```java
void main() {
    IO.println("Hallo Java 25!");
}
```

**Warum:** `main` ist kleingeschrieben; `void` bedeutet kein Rückgabewert.

**Ausgabe**
```text
Hallo Java 25!
```

**Prüfungsfalle:** `Main` wäre ein anderer Bezeichner.

---

## Lösung E02

```java
void main() {
    String name = "Ada";
    int age = 36;
    int testScore = 95;

    IO.println(name + ", " + age + ", " + testScore);
}
```

**Warum**
- `2name` beginnt mit einer Ziffer.
- `class` ist ein Schlüsselwort.
- `test-score` enthält den Minusoperator.

**Ausgabe**
```text
Ada, 36, 95
```

---

## Lösung E03

**Mit Import**
```java
import javax.swing.*;

void main() {
    JOptionPane.showMessageDialog(null, "Hallo");
}
```

**Ohne Import**
```java
void main() {
    javax.swing.JOptionPane.showMessageDialog(null, "Hallo");
}
```

Beide Varianten referenzieren dieselbe Klasse. Der Import verkürzt nur den im Quellcode nötigen Namen.

---

## Lösung E04

```java
void main(String[] args) {
    for (String arg : args) {
        IO.println(arg);
    }
}
```

**Beispiel**
```text
rot
gruen
blau
```

Die Enhanced-for-Schleife liefert jedes Arrayelement nacheinander.

---

## Lösung E05

```java
void main() {
    var random = new Random();

    int lucky = random.nextInt(10) + 1;

    IO.println("Ihre Glückszahl: " + lucky);
}
```

`nextInt(10)` liefert `0..9`; `+1` verschiebt auf `1..10`.

**Prüfungsfalle:** Die obere Grenze ist exklusiv (= exclusive).

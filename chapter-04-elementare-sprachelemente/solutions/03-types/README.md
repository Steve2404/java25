# Lösungen — 03 Variablen und Datentypen

Öffne diese Datei erst nach dem eigenen Versuch.

---

## Lösung E11

```java
void main() {
    var a = 10;
    var b = 10L;
    var c = 10.0;
    var d = 'x';

    IO.println(a);
    IO.println(b);
    IO.println(c);
    IO.println(d);
}
```

**Typen:** `int`, `long`, `double`, `char`.

**Warum:** `var` lässt den Compiler den Typ einmal aus dem Initialisierungsausdruck ableiten. Danach bleibt der Typ statisch.

---

## Lösung E12

```java
void main() {
    char c = 65;
    int code = c;

    IO.println(c);
    IO.println(code);

    char same = '\u0041';
    IO.println(same);
}
```

**Ausgabe**
```text
A
65
A
```

---

## Lösung E13

```java
void main() {
    int x = 7;
    int result = 0;

    if (x > 5) {
        result = x * 2;
    }

    IO.println(result);
}
```

**Warum:** `result` muss außerhalb des `if` deklariert werden, wenn es danach noch sichtbar sein soll.

---

## Lösung E14

```java
void main() {
    byte b = 100;
    short s = b;
    int i = s;
    long l = i;
    double d = l;

    IO.println(d);
}
```

**Ausgabe:** `100.0`

---

## Lösung E15

```java
void main() {
    double d = 12.9;
    int i = (int) d;

    IO.println(d);
    IO.println(i);
}
```

**Ergebnis:** `12.9` und `12`.

Bei `-12.9` entsteht `-12`. Der Cast schneidet in Richtung null ab; er rundet nicht.

---

## Lösung E16

```java
void main() {
    byte b = 10;
    short s = 20;

    int result = b + s;

    IO.println(result);
}
```

**Warum:** kleinere Ganzzahltypen werden bei binärer Arithmetik mindestens zu `int` promotet.

---

## Lösung E17

```java
void main() {
    final double DM_PRO_EURO = 1.95583;
    double dm = 19.5583;

    double euro = dm / DM_PRO_EURO;

    IO.println(euro);
}
```

**Ausgabe:** ungefähr `10.0`.

`final` verhindert eine spätere Neuzuweisung.

---

## Lösung E18

```java
void main() {
    int a = 2;
    long b = 3L;
    double c = 4.5;

    double result = a + b * c;

    IO.println(result);
}
```

**Zwischenschritte**
- `b * c` → `3L * 4.5` → `13.5` vom Typ `double`
- `a + 13.5` → `15.5` vom Typ `double`

**Ausgabe:** `15.5`

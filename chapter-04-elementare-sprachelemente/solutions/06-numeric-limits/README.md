# Lösungen — 06 Numerische Grenzfälle

## Lösung E32
```java
void main() {
    int x = Integer.MAX_VALUE;
    x++;
    IO.println(x);
    IO.println(x == Integer.MIN_VALUE);
}
```

## Lösung E33
```java
void main() {
    long x = Long.MAX_VALUE / 2 + 1;
    long y = x * 2;

    IO.println(x);
    IO.println(y);
}
```
Das Ergebnis läuft über den `long`-Wertebereich.

## Lösung E34
```java
void main() {
    double a = 1.0 / 0.0;
    double b = 0.0 / 0.0;

    IO.println(a);
    IO.println(b);
    IO.println(Double.isInfinite(a));
    IO.println(Double.isNaN(b));
}
```

## Lösung E35
```java
void main() {
    double d = 0.1 + 0.2;

    IO.println(d == 0.3);
    IO.printf("%.17f%n", d);

    double eps = 1e-12;
    boolean nearlyEqual = Math.abs(d - 0.3) < eps;
    IO.println(nearlyEqual);
}
```

Die Toleranz ist nur eine Übungsidee; in realen Programmen muss sie zur Aufgabe passen.

## Lösung E36
```java
void main() {
    int i = 0;

    while (1.0 + Math.scalb(1.0, -i) > 1.0) {
        i++;
    }

    IO.println(i - 1);
}
```

Typisches Ergebnis: `52`.

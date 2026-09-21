# Lösungen — 05 Operatoren und Ausdrücke

## Lösung E24
```java
void main() {
    int a = 7 / 2;
    double b = 7 / 2.0;
    double c = (double) (7 / 2);

    IO.println(a);
    IO.println(b);
    IO.println(c);
}
```
Ergebnisse: `3`, `3.5`, `3.0`.

## Lösung E25
```java
void main() {
    byte b = 10;
    short s = 20;
    int result = b + s;
    IO.println(result);
}
```

## Lösung E26
```java
void main() {
    int i = 5;
    int a = i++;
    int b = ++i;
    IO.println("i=" + i + ", a=" + a + ", b=" + b);
}
```
Ausgabe: `i=7, a=5, b=7`.

## Lösung E27
```java
void main() {
    int temperatur = Simput.gint("Temperatur: ");
    String text = temperatur >= 30 ? "heiß" : "normal";
    IO.println(text);
}
```

## Lösung E28
```java
void main() {
    int x = Simput.gint("x: ");
    boolean safe = x != 0 && 10 / x > 2;
    IO.println(safe);
}
```
Bei `x==0` wird die Division nicht ausgewertet.

## Lösung E29
```java
void main() {
    boolean sensorA = true;
    boolean sensorB = false;
    boolean warning = sensorA ^ sensorB;
    IO.println(warning);
}
```

Wahrheitstabelle:
```text
false ^ false = false
false ^ true  = true
true  ^ false = true
true  ^ true  = false
```

## Lösung E30
```java
void main() {
    int zahl = Simput.gint("Zahl: ");
    IO.println(zahl % 2 == 0 ? "gerade" : "ungerade");
}
```

## Lösung E31
```java
void main() {
    int a = 2;
    long b = 3L;
    double c = 4.0;

    double result = a + b * c / 2;

    IO.println(result);
}
```

Zwischenschritte:
- `b*c = 12.0` → `double`
- `12.0/2 = 6.0`
- `2+6.0 = 8.0`

Endtyp: `double`.

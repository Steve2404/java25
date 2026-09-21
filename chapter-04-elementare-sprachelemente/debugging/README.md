# Debugging Pack — Kapitel 4

**Regel:** Erst selbst entscheiden: **Kompiliert der Code? Wenn nein, warum? Wenn ja, was passiert zur Laufzeit?**  
Lösungen: [../solutions/debugging/README.md](../solutions/debugging/README.md)

## D01 — float-Literal
```java
void main() {
    float f = 3.14;
    IO.println(f);
}
```

## D02 — Scope
```java
void main() {
    if (true) {
        int x = 5;
    }
    IO.println(x);
}
```

## D03 — Zuweisung in if
```java
void main() {
    boolean aktiv = true;
    if (aktiv = false) {
        IO.println("aktiv");
    }
}
```

## D04 — Cast zu spät
```java
double x = (double) (5 / 2);
```

## D05 — byte + byte
```java
byte a = 10;
byte b = 20;
byte c = a + b;
```

## D06 — fehlendes Update
```java
void main() {
    int i = 0;
    while (i < 5) {
        IO.println(i);
    }
}
```

## D07 — Semikolon nach while
```java
int i = 0;
while (i < 3);
{
    i++;
}
```

## D08 — switch ohne break
```java
int n = 1;
String text = "";
switch (n) {
    case 1: text = "A";
    case 2: text = "B";
    default: text = "C";
}
```

## D09 — continue
```java
for (int i = 0; i < 3; i++) {
    if (i == 1) continue;
    IO.println(i);
}
```

## D10 — parseLong
```java
String s = "12x";
long n = Long.parseLong(s);
```

## D11 — null aus InputDialog
```java
String s = JOptionPane.showInputDialog(null, "Zahl?");
long n = Long.parseLong(s);
```

## D12 — falsche Confirm-Konstante
```java
int result = JOptionPane.showConfirmDialog(
    null, "Weiter?", "Frage", JOptionPane.YES_NO_OPTION
);
if (result == JOptionPane.YES_NO_OPTION) {
    IO.println("Ja gewählt");
}
```

## D13 — void zuweisen
```java
String result = JOptionPane.showMessageDialog(null, "Hallo");
```

## D14 — String direkt in long
```java
long zahl = JOptionPane.showInputDialog(null, "Zahl?");
```

## D15 — Overflow
```java
int x = Integer.MAX_VALUE;
int y = x + 1;
IO.println(y);
```

## D16 — double exakt vergleichen
```java
double d = 0.1 + 0.2;
if (d == 0.3) {
    IO.println("gleich");
}
```

### Arbeitsauftrag je Aufgabe
1. Kompiliert?
2. Falls nein: Fehlerklasse nennen.
3. Falls ja: Ausgabe / Laufzeitverhalten bestimmen.
4. Fehler korrigieren oder erklären.
5. Eine kurze Regel formulieren.

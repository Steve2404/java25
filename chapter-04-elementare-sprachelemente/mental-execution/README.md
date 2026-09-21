# Mental-Execution Pack — Kapitel 4

Bestimme **ohne IDE** die Ausgabe und alle wichtigen Zwischenwerte.  
Lösungen: [../solutions/mental-execution/README.md](../solutions/mental-execution/README.md)

## M01
```java
int a = 2, b = 3;
IO.println("R=" + a + b * 2);
```

## M02
```java
int i = 3;
int a = i++;
int b = ++i;
IO.println(i + ":" + a + ":" + b);
```

## M03
```java
int x = 0;
int y = 5;
boolean b = x != 0 && ++y > 5;
IO.println(y + ":" + b);
```

## M04
```java
int n = 7;
String s = n % 2 == 0 ? "A" : n > 5 ? "B" : "C";
IO.println(s);
```

## M05
```java
int n = 3;
int r = switch (n) {
    case 1 -> 10;
    case 2, 3 -> 20;
    default -> 30;
};
IO.println(r);
```

## M06
```java
int n = 2;
int r = 0;
switch (n) {
    case 1: r += 1;
    case 2: r += 2;
    case 3: r += 4;
}
IO.println(r);
```

## M07
```java
int sum = 0;
for (int i = 1; i <= 4; i++) {
    sum += i;
}
IO.println(sum);
```

## M08
```java
int sum = 0;
for (int i = 0; i < 5; i++) {
    if (i == 2) continue;
    sum += i;
}
IO.println(sum);
```

## M09
```java
int i = 0;
while (true) {
    i++;
    if (i == 4) break;
    IO.print(i);
}
IO.println(":Ende");
```

## M10
```java
int count = 0;
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 2; j++) {
        count++;
    }
}
IO.println(count);
```

## M11
```java
int count = 0;
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (j == 1) break;
        count++;
    }
}
IO.println(count);
```

## M12
```java
int count = 0;
outer:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == 1 && j == 1) break outer;
        count++;
    }
}
IO.println(count);
```

## M13
```java
int x = Integer.MAX_VALUE;
x++;
IO.println(x < 0);
```

## M14
```java
double d = 0.1 + 0.2;
IO.println(d == 0.3);
```

## M15
Angenommen der Benutzer klickt **Nein**:
```java
int result = JOptionPane.showConfirmDialog(
    null, "Weiter?", "Frage", JOptionPane.YES_NO_CANCEL_OPTION
);
if (result == JOptionPane.YES_OPTION) {
    IO.println("A");
} else {
    IO.println("B");
}
```

## M16
```java
String s = "12";
long n = Long.parseLong(s);
if (n > 10) {
    n += 5;
}
IO.println(n);
```

### Methode
Für jede Aufgabe:
1. Startzustand notieren.
2. Ausdruck in Auswertungsreihenfolge zerlegen.
3. Seiteneffekte sofort in der Zustandstabelle eintragen.
4. Kontrollpfad markieren.
5. Ausgabe erst ganz am Ende notieren.

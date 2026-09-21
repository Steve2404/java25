# Lösungen — 07 Ablaufsteuerung

## Lösung E37
```java
void main() {
    int zahl = Simput.gint("Zahl: ");

    if (zahl > 0) {
        IO.println("positiv");
    } else if (zahl < 0) {
        IO.println("negativ");
    } else {
        IO.println("null");
    }
}
```

## Lösung E38
```java
void main() {
    int zahl = Simput.gint("1..5: ");

    String wort = switch (zahl) {
        case 1 -> "eins";
        case 2 -> "zwei";
        case 3 -> "drei";
        case 4 -> "vier";
        case 5 -> "fünf";
        default -> "unbekannt";
    };

    IO.println(wort);
}
```

## Lösung E39
```java
void main() {
    int n = Simput.gint("n: ");
    int sum = 0;

    for (int i = 1; i <= n; i++) {
        sum += i;
    }

    IO.println(sum);
}
```

## Lösung E40
```java
void main() {
    int n = Simput.gint("Start: ");

    while (n >= 0) {
        IO.println(n);
        n--;
    }
}
```

## Lösung E41
```java
void main() {
    int zahl;

    do {
        zahl = Simput.gint("Positive Zahl: ");
    } while (zahl <= 0);

    IO.println("Akzeptiert: " + zahl);
}
```

## Lösung E42
```java
void main() {
    for (int i = 1; i <= 10; i++) {
        if (i % 2 == 0) {
            continue;
        }
        IO.println(i);
    }
}
```

## Lösung E43
```java
void main() {
    long n = Simput.glong("n: ");
    long teiler = 0;

    for (long i = 2; i < n; i++) {
        if (n % i == 0) {
            teiler = i;
            break;
        }
    }

    if (teiler == 0) {
        IO.println("Kein Teiler gefunden.");
    } else {
        IO.println("Erster Teiler: " + teiler);
    }
}
```

## Lösung E44
```java
void main() {
    long n = Simput.glong("n: ");

    if (n < 2) {
        IO.println("Keine Primzahl.");
        return;
    }

    long grenze = (long) Math.sqrt(n);
    boolean teilerGefunden = false;

    for (long i = 2; i <= grenze; i++) {
        if (n % i == 0) {
            teilerGefunden = true;
            break;
        }
    }

    IO.println(teilerGefunden ? "Keine Primzahl." : "Primzahl.");
}
```

## Lösung E45
```java
void main() {
    long a = Simput.glong("a: ");
    long b = Simput.glong("b: ");

    long x = a;
    long y = b;

    while (y != 0) {
        long rest = x % y;
        x = y;
        y = rest;
    }

    IO.println("GGT: " + x);
}
```

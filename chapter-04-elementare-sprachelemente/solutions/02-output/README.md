# Lösungen — 02 Ausgabe

## Lösung E06
```java
void main() {
    IO.println("Java");
    IO.println("25");
    IO.println("Start!");
}
```

```text
Java
25
Start!
```

---

## Lösung E07
```java
void main() {
    IO.println("3.3 + 2 = " + (3.3 + 2));
}
```

Die Klammer erzwingt zuerst die numerische Addition. Ohne Klammer würde links früh ein String entstehen.

---

## Lösung E08
```java
void main() {
    IO.printf("%12.5f%n", Math.PI);
}
```

`12` = Feldbreite, `.5` = fünf Nachkommastellen, `f` = Gleitkomma.

---

## Lösung E09
```java
void main() {
    IO.println("Name:\t\"Ada\"\nJava 25");
}
```

```text
Name:   "Ada"
Java 25
```

---

## Lösung E10
```java
void main() {
    String produkt = "Kabel";
    int menge = 3;
    double preis = 4.95;
    double gesamt = menge * preis;

    IO.printf("%-10s %5s %10s %10s%n", "Produkt", "Menge", "Preis", "Gesamt");
    IO.printf("%-10s %5d %10.2f %10.2f%n", produkt, menge, preis, gesamt);
}
```

**Erwarteter Kernwert:** Gesamtpreis `14.85`.

**Prüfungsfalle:** Feldbreite und Genauigkeit (= précision) nicht verwechseln.

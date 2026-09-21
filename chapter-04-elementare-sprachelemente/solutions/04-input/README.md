# Lösungen — 04 Konsoleneingabe

Öffne diese Datei erst nach dem eigenen Versuch.

---

## Lösung E19

```java
void main() {
    int alter = Simput.gint("Alter: ");
    double groesse = Simput.gdouble("Größe: ");
    char initiale = Simput.gchar("Initiale: ");

    IO.println("Alter: " + alter);
    IO.println("Größe: " + groesse);
    IO.println("Initiale: " + initiale);
}
```

---

## Lösung E20

```java
void main() {
    double breite = Simput.gdouble("Breite: ");
    double hoehe = Simput.gdouble("Höhe: ");

    double flaeche = breite * hoehe;
    double umfang = 2 * (breite + hoehe);

    IO.println("Fläche: " + flaeche);
    IO.println("Umfang: " + umfang);
}
```

---

## Lösung E21

```java
void main() {
    int gesamt = Simput.gint("Sekunden: ");

    int minuten = gesamt / 60;
    int rest = gesamt % 60;

    IO.println(minuten + " Minuten, " + rest + " Sekunden");
}
```

**Warum:** `/` zählt volle 60er-Gruppen, `%` liefert den verbleibenden Rest.

---

## Lösung E22

```java
void main() {
    double a = Simput.gdouble("a: ");
    double b = Simput.gdouble("b: ");

    double summe = a + b;
    double differenz = a - b;
    double produkt = a * b;
    double quotient = a / b;

    IO.println("Summe: " + summe);
    IO.println("Differenz: " + differenz);
    IO.println("Produkt: " + produkt);
    IO.println("Quotient: " + quotient);
}
```

---

## Lösung E23

```java
void main() {
    int a = Simput.gint("a: ");
    int b = Simput.gint("b: ");
    int c = Simput.gint("c: ");

    int zwischen = a + b;
    int result = zwischen * c;

    IO.println(result);
}
```

Für `2,3,4`:
- `a+b = 5`
- `5*4 = 20`

Dagegen wäre `a + b*c = 2 + 12 = 14`.

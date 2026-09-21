# 01 — Basics

Diese Datei enthält nur Aufgaben. **Keine Lösungen.**

---

## E01 — Kompakter Programmeinstieg

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Schreibe ein minimales Java-25-Programm mit `void main()`, das exakt `Hallo Java 25!` ausgibt.

### 2. Eingaben / Ausgaben
Keine Eingabe. Ausgabe: `Hallo Java 25!`

### 3. Constraints / Randfälle
Keine eigene Klasse deklarieren. Kein `public static void main(String[] args)`.

### 4. Teilaufgaben
- [ ] `void main()` korrekt schreiben
- [ ] genau eine Ausgabe erzeugen
- [ ] Groß-/Kleinschreibung prüfen
- [ ] Programm ausführen
- [ ] Ausgabe exakt vergleichen

### 5. Denkweg
Prüfe Name, Rückgabetyp und Methodenrumpf getrennt.

### 6. Pseudocode
```text
PROGRAMM START
  BEGRÜSSUNG AUSGEBEN
PROGRAMM ENDE
```

### 7. Java-Skelett
```java
void main() {
    // TODO: Begrüßung ausgeben
}
```

### 8. Schnelltests
- startet ohne Argumente
- exakt eine Zeile
- Text exakt `Hallo Java 25!`

**Reflexion:** Warum wäre `Main` ein anderer Name als `main`?

---

## E02 — Ungültige Bezeichner reparieren

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Repariere alle ungültigen Variablennamen, ohne die gespeicherten Werte zu verändern.

### 2. Eingaben / Ausgaben
Keine Eingabe. Ausgabe soll Name, Alter und Punktzahl enthalten.

### 3. Constraints / Randfälle
Keine Schlüsselwörter als Bezeichner. Kein Name darf mit einer Ziffer beginnen oder `-` enthalten.

### 4. Teilaufgaben
- [ ] ungültige Namen markieren
- [ ] gültige Ersatznamen wählen
- [ ] alle Verwendungen konsistent ändern
- [ ] kompilieren
- [ ] Ausgabe kontrollieren

### 5. Denkweg
Unterscheide: Ziffer am Anfang, Schlüsselwort, Operator im Namen.

### 6. Pseudocode
```text
GÜLTIGE NAMEN FESTLEGEN
WERTE SPEICHERN
WERTE AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    String 2name = "Ada";
    int class = 36;
    int test-score = 95;

    // TODO: reparieren und ausgeben
}
```

### 8. Schnelltests
- Werte bleiben `Ada`, `36`, `95`
- keine Compilerfehler

**Reflexion:** Warum ist `class` unzulässig, aber `main` als Bezeichner grundsätzlich erlaubt?

---

## E03 — Import oder vollständig qualifizierter Name

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Zeige dieselbe `JOptionPane`-Meldung einmal mit Import und einmal ohne Import.

### 2. Eingaben / Ausgaben
Keine Eingabe. Dialogtext: `Hallo`.

### 3. Constraints / Randfälle
Variante A: `import javax.swing.*;`. Variante B: kein Import.

### 4. Teilaufgaben
- [ ] Variante A schreiben
- [ ] Variante B schreiben
- [ ] beide kompilieren
- [ ] erklären, was der Import verkürzt
- [ ] bestätigen, dass dieselbe Klasse verwendet wird

### 5. Denkweg
Import beeinflusst Namensauflösung (= résolution de noms), nicht die Identität der Klasse.

### 6. Pseudocode
```text
A: IMPORTIEREN -> KURZEN NAMEN BENUTZEN
B: KEIN IMPORT -> VOLLEN KLASSENNAMEN BENUTZEN
```

### 7. Java-Skelett
```java
// TODO Variante A

// TODO Variante B separat testen
```

### 8. Schnelltests
- beide Varianten zeigen `Hallo`
- keine eigene `JOptionPane`-Klasse

**Reflexion:** Erzeugt `import` ein Objekt?

---

## E04 — Kommandozeilenargumente mit Enhanced-for

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Gib jedes Element von `String[] args` in einer eigenen Zeile aus.

### 2. Eingaben / Ausgaben
Beispiel: `rot gruen blau` -> drei Zeilen in derselben Reihenfolge.

### 3. Constraints / Randfälle
Enhanced-for verwenden. Keine Indexvariable.

### 4. Teilaufgaben
- [ ] passende `main`-Signatur schreiben
- [ ] Enhanced-for über `args`
- [ ] jedes Element genau einmal ausgeben
- [ ] Reihenfolge erhalten
- [ ] Fall ohne Argumente testen

### 5. Denkweg
Ein Array produziert nacheinander seine Elemente für die Iterationsvariable.

### 6. Pseudocode
```text
FÜR JEDES argument IN args
  argument AUSGEBEN
```

### 7. Java-Skelett
```java
void main(String[] args) {
    // TODO: Enhanced-for
}
```

### 8. Schnelltests
- 3 Argumente -> 3 Zeilen
- 0 Argumente -> 0 Zeilen

**Reflexion:** Warum braucht diese Schleife keinen Index?

---

## E05 — Glückszahl mit Random

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Erzeuge eine Zufallszahl von 1 bis einschließlich 10.

### 2. Eingaben / Ausgaben
Keine Eingabe. Ausgabe z. B. `Ihre Glückszahl: 7`.

### 3. Constraints / Randfälle
`Random.nextInt(10)` verwenden und den Bereich korrekt verschieben.

### 4. Teilaufgaben
- [ ] `Random` erzeugen
- [ ] Wert in `0..9` erzeugen
- [ ] auf `1..10` verschieben
- [ ] Ergebnis speichern
- [ ] ausgeben

### 5. Denkweg
Die obere Grenze von `nextInt(bound)` ist exklusiv.

### 6. Pseudocode
```text
RANDOM ERZEUGEN
n = ZUFALL 0 BIS 9
n = n + 1
n AUSGEBEN
```

### 7. Java-Skelett
```java
void main() {
    var random = new Random();
    // TODO: 1..10
    // TODO: Ausgabe
}
```

### 8. Schnelltests
- nie 0
- nie > 10
- mehrere Läufe können verschiedene Werte liefern

**Reflexion:** Warum reicht `nextInt(10)` allein nicht?

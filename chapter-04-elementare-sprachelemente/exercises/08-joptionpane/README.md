# 08 — JOptionPane, Parsing und Fehlerwege

Nur Aufgaben. Lösungen liegen unter `solutions/08-joptionpane`.

---

## E46 — Meldungsdialog

**Schwierigkeit:** 🟢 Einfach

### 1. Einfache Reformulierung
Zeige eine Informationsmeldung mit Text und Titel an.

### 2. Eingaben / Ausgaben
Text `Java 25 läuft!`, Titel `Status`.

### 3. Constraints / Randfälle
Nutze die Vier-Parameter-Variante von `showMessageDialog()`.

### 4. Teilaufgaben
- [ ] Swing importieren
- [ ] `parentComponent=null`
- [ ] Nachricht setzen
- [ ] Titel setzen
- [ ] `INFORMATION_MESSAGE` verwenden

### 5. Denkweg
Die vier Argumente steuern Elternfenster, Inhalt, Titel und Nachrichtentyp.

### 6. Pseudocode
```text
MESSAGE_DIALOG(null, text, title, information)
```

### 7. Java-Skelett
```java
import javax.swing.*;

void main() {
    // TODO
}
```

### 8. Schnelltests
Dialog erscheint; Titel und Text stimmen.

---

## E47 — GUI-Zahl einlesen und quadrieren

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Lies eine ganze Zahl als String ein, parse sie zu `long` und zeige ihr Quadrat.

### 2. Eingaben / Ausgaben
`12` → `144`.

### 3. Constraints / Randfälle
Nur Erfolgsweg. Noch keine Exception-Behandlung.

### 4. Teilaufgaben
- [ ] `showInputDialog()`
- [ ] Rückgabewert in String
- [ ] `Long.parseLong()`
- [ ] Quadrat berechnen
- [ ] Ergebnisdialog

### 5. Denkweg
GUI liefert Text; erst Parsing erzeugt die Zahl.

### 6. Pseudocode
```text
text = INPUT_DIALOG
zahl = PARSE_LONG(text)
quadrat = zahl*zahl
MESSAGE_DIALOG(quadrat)
```

### 7. Java-Skelett
```java
import javax.swing.*;

void main() {
    // TODO
}
```

### 8. Schnelltests
2 → 4, 12 → 144, -3 → 9.

---

## E48 — Confirm-Dialog korrekt auswerten

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Frage `Wirklich speichern?` mit Ja/Nein und gib nur bei Ja `Gespeichert` aus.

### 2. Eingaben / Ausgaben
Ja → `Gespeichert`; Nein → keine Erfolgsmeldung.

### 3. Constraints / Randfälle
`YES_NO_OPTION` zur Konfiguration, `YES_OPTION` zur Auswertung.

### 4. Teilaufgaben
- [ ] Dialog konfigurieren
- [ ] Rückgabewert speichern
- [ ] mit `YES_OPTION` vergleichen
- [ ] bei true ausgeben
- [ ] Rollen der Konstanten erklären

### 5. Denkweg
Konfiguration hinein, Benutzerentscheidung heraus.

### 6. Pseudocode
```text
result = CONFIRM(YES_NO_OPTION)
WENN result == YES_OPTION
  AUSGEBEN gespeichert
```

### 7. Java-Skelett
```java
import javax.swing.*;

void main() {
    // TODO
}
```

### 8. Schnelltests
Ja und Nein testen.

---

## E49 — Abbrechen als null erkennen

**Schwierigkeit:** 🟡 Mittel

### 1. Einfache Reformulierung
Öffne einen Eingabedialog. Wenn der Benutzer abbricht, gib in der Konsole `Abgebrochen` aus; sonst zeige den eingegebenen Text.

### 2. Eingaben / Ausgaben
Abbrechen → `Abgebrochen`; Text `abc` → `abc`.

### 3. Constraints / Randfälle
Noch kein `try/catch`. Prüfe nur `null`.

### 4. Teilaufgaben
- [ ] String empfangen
- [ ] `text == null` prüfen
- [ ] Abbruchpfad
- [ ] Normalpfad
- [ ] `null` von `""` unterscheiden

### 5. Denkweg
Abbrechen ist ein eigener Zustand, nicht automatisch leerer Text.

### 6. Pseudocode
```text
text = INPUT_DIALOG
WENN text == null
  abgebrochen
SONST
  text AUSGEBEN
```

### 7. Java-Skelett
```java
import javax.swing.*;

void main() {
    // TODO
}
```

### 8. Schnelltests
Abbrechen, leer bestätigen, `abc`.

---

## E50 — Kleiner GUI-Zahlenprüfer

**Schwierigkeit:** 🔴 Schwer

### 1. Einfache Reformulierung
Lies per GUI eine ganze Zahl ein. Bei Abbruch endet die Methode. Sonst parse die Zahl und zeige an, ob sie positiv, negativ oder null ist.

### 2. Eingaben / Ausgaben
`8` → `positiv`; `-3` → `negativ`; `0` → `null`.

### 3. Constraints / Randfälle
Abbruch mit `null` behandeln. Ungültigen Text noch nicht mit `try/catch` behandeln.

### 4. Teilaufgaben
- [ ] Input-Dialog
- [ ] null-Prüfung
- [ ] bei Abbruch `return`
- [ ] parseLong
- [ ] `if / else if / else`
- [ ] Ergebnistext
- [ ] Message-Dialog

### 5. Denkweg
Trenne Abbruch, Parsing, Fachlogik und Darstellung.

### 6. Pseudocode
```text
text = INPUT
WENN text == null
  RETURN
zahl = PARSE(text)
WENN zahl>0 -> positiv
SONST WENN zahl<0 -> negativ
SONST -> null
MESSAGE(result)
```

### 7. Java-Skelett
```java
import javax.swing.*;

void main() {
    // TODO
}
```

### 8. Schnelltests
8, -3, 0, Abbrechen.

**Reflexion:** Welcher zusätzliche Fehlerweg bleibt bei `"abc"` noch offen?

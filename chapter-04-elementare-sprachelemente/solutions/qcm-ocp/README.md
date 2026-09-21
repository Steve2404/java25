# Lösungen — QCM / OCP-Stil Kapitel 4

| Q | Antwort | Kernregel |
|---|---|---|
| 01 | B | `*` zuerst, danach String-Verkettung |
| 02 | B | Ganzzahldivision vor Cast |
| 03 | B | `byte+byte -> int` |
| 04 | B | Post-/Präinkrement |
| 05 | C | Short-Circuit |
| 06 | C | Block-Scope |
| 07 | B | `char + int -> int` |
| 08 | B | Arrow-`switch` |
| 09 | C | Fall-through |
| 10 | B | `continue` + for-Update |
| 11 | C | leere while durch `;` |
| 12 | B | unlabeled `break` → innerste passende Schleife |
| 13 | C | int-Overflow |
| 14 | A | IEEE-754 Infinity |
| 15 | B | Input-Dialog liefert String |
| 16 | C | Konfiguration vs. Antwort |
| 17 | C | Abbruch kann null liefern |
| 18 | B | außerhalb long-Bereich |
| 19 | C | JVM-/Programmausführung |
| 20 | B | Inhalt wird erst zur Laufzeit geparst |

## Ausgewählte Erklärungen

**Q04:** `i++` liefert 2, danach `i=3`; `++i` setzt auf 4 und liefert 4; Summe 6, End-`i=4`.

**Q05:** Wenn links bei `&&` bereits `false` ist, wird rechts nicht ausgewertet.

**Q09:** Ohne `break` läuft die klassische `switch` ab dem Treffer weiter.

**Q11:** Der Strichpunkt ist der Schleifenrumpf; `i` bleibt 0.

**Q16:** Gleichartige `int`-Konstanten können unterschiedliche semantische Rollen haben.

**Q20:** Der Compiler sieht einen gültigen `String`-Parameter; `parseLong` bewertet den Inhalt erst zur Laufzeit.

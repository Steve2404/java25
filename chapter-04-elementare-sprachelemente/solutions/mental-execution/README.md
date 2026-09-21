# Lösungen — Mental Execution Kapitel 4

- **M01:** `R=26`
- **M02:** `5:3:5`
- **M03:** `5:false`
- **M04:** `B`
- **M05:** `20`
- **M06:** `6`
- **M07:** `10`
- **M08:** `8`
- **M09:** `123:Ende`
- **M10:** `6`
- **M11:** `3`
- **M12:** `4`
- **M13:** `true`
- **M14:** typischerweise `false`
- **M15:** `B`
- **M16:** `17`

## Wichtige Begründungen

**M02:** `i++` liefert 3 und erhöht auf 4; `++i` erhöht auf 5 und liefert 5.

**M03:** Wegen Short-Circuit wird `++y` nicht ausgeführt.

**M06:** klassisches Fall-through ab `case 2`: `2 + 4 = 6`.

**M08:** `i==2` wird übersprungen; addiert werden `0+1+3+4`.

**M11:** Unlabeled `break` beendet nur die innere Schleife.

**M12:** `break outer` beendet die äußere Schleife bei `i=1,j=1`.

**M13:** `Integer.MAX_VALUE + 1` wrappt zu `Integer.MIN_VALUE`.

**M15:** `NO_OPTION != YES_OPTION`.

/**
 * EXERCICE 31 - Wochenverbrauch mit for-Schleife summieren
 * =======================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein Testsystem hat sieben Tageswerte bereits als ganze Zahlen vorliegen. Fuer die Wochenmeldung sollen sie mit einer Zaehlschleife addiert werden.
 *
 * Notions du cours :
 * klassische `for`-Schleife, Initialisierung, Bedingung, Update, Akkumulator.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Summiere die sieben festen Tageswerte mit einer indexgesteuerten for-Schleife.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du gehst sieben Schubladen der Reihe nach durch und legst jeden gefundenen Wert auf denselben Summenstapel.
 *
 * -- Essayons a la main --
 * [3,4,5,2,6,1,4] -> 25.
 *
 * -- Le plan --
 * 1. Lege das Array mit sieben Werten an.
 * 2. Setze `summe` auf 0.
 * 3. Starte `i` bei 0.
 * 4. Laufe bis `i < werte.length`.
 * 5. Addiere `werte[i]` pro Durchgang.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Schleife ist die wiederholte Arbeitsbox. Eine eigene Methode ist noch nicht noetig.
 *
 * Exemples a verifier :
 * - 3+4+5+2+6+1+4 -> 25
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Arrayindizes beginnen bei 0.
 * - Das Update `i++` passiert nach jedem Rumpf.
 */
void main() {
    int[] werte = {3, 4, 5, 2, 6, 1, 4};
    int summe = 0;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(summe);
    ExerciseChecker.check("Wochensumme 25", summe == 25);
    ExerciseChecker.summary();
}

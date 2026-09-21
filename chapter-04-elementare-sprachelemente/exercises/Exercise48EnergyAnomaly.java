/**
 * EXERCICE 48 - Energieverbrauch auf Anomalie pruefen
 * ==================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Ein Serverraum hat sieben historische Tagesverbraeuche. Der heutige Wert gilt als auffaellig, wenn er mehr als 50 Prozent ueber dem historischen Durchschnitt liegt.
 *
 * Notions du cours :
 * Array, Enhanced-for, Akkumulator, double-Division, Vergleich, kombinierte Regeln.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Berechne den Durchschnitt der Historie und klassifiziere den heutigen Wert 24.0.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du berechnest zuerst, was an normalen Tagen typisch ist. Dann fragst du, ob heute viel groesser als dieses typische Niveau ist.
 *
 * -- Essayons a la main --
 * Historie 10,12,11,13,9,10,11 -> Summe 76 -> Durchschnitt 76/7 ≈10.857. Grenze *1.5 ≈16.286. Heute 24 > Grenze -> Anomalie.
 *
 * -- Le plan --
 * 1. Speichere die historischen Werte in einem Array.
 * 2. Summiere mit Enhanced-for.
 * 3. Berechne den Durchschnitt als double.
 * 4. Berechne die 150%-Grenze.
 * 5. Vergleiche heutigen Wert mit der Grenze.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Ja, Durchschnitt und Klassifikation waeren spaeter gute getrennte Funktionen. Hier bleiben sie im main, damit nur bekannte Sprachmittel noetig sind.
 *
 * Exemples a verifier :
 * - Historie oben + heute 24 -> Anomalie true
 * - heute 12 -> Anomalie false
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Achte auf double-Division bei `summe / werte.length`.
 * - Enhanced-for braucht keinen Index.
 */
void main() {
    double[] historie = {10, 12, 11, 13, 9, 10, 11};
    double heute = 24.0;
    double summe = 0.0;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println("Durchschnitt: " + durchschnitt);
    IO.println("Anomalie: " + anomalie);
    ExerciseChecker.check("24 ist Anomalie", anomalie);
    ExerciseChecker.summary();
}

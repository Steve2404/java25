/**
 * EXERCICE 12 - Sensorwert gezielt verengen
 * ========================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein Sensor liefert 12.9 Einheiten, das alte Zielsystem akzeptiert aber nur ganze Einheiten. Das Programm soll den bewussten Informationsverlust sichtbar machen.
 *
 * Notions du cours :
 * Narrowing-Cast `double -> int`, Abschneiden in Richtung null.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Caste den Messwert nach `int` und vergleiche Original und Zielwert.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du hast 12.9 Liter, aber dein altes Display kann nur ganze Zahlen zeigen. Beim Cast wird nicht gerundet; der Nachkommateil faellt weg.
 *
 * -- Essayons a la main --
 * 12.9 -> 12. Auch -12.9 -> -12.
 *
 * -- Le plan --
 * 1. Speichere 12.9 als `double`.
 * 2. Caste nach `int`.
 * 3. Gib beide Werte aus.
 * 4. Pruefe, dass 12 entsteht.
 * 5. Erklaere dir selbst den Unterschied zu Rundung.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Der Cast ist genau der Mechanismus, den wir beobachten wollen.
 *
 * Exemples a verifier :
 * - 12.9 -> 12
 * - -12.9 -> -12
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Syntax: `(int) wert`.
 * - Der Cast rundet nicht automatisch.
 */
void main() {
    double raw = 12.9;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println("raw=" + raw + ", legacy=" + legacy);
    ExerciseChecker.check("Abgeschnitten auf 12", legacy == 12);
    ExerciseChecker.summary();
}

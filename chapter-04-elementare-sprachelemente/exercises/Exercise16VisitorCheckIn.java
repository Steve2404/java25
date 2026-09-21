/**
 * EXERCICE 16 - Besucher-Check-in mit Simput
 * =========================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Am Empfang werden Alter, Koerpergroesse und Initiale eines Besuchers eingelesen. Jede Eingabe soll direkt den passenden Java-Typ bekommen.
 *
 * Notions du cours :
 * `Simput.gint()`, `Simput.gdouble()`, `Simput.gchar()`, Zieltypen.
 *
 * Rappel express du decoupage en "boites magiques" : voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Lies die drei Werte mit den typgerechten Simput-Methoden ein und gib sie wieder aus.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Drei Tueren sind beschriftet: ganze Zahl, Dezimalzahl, einzelnes Zeichen. Jede Eingabe muss durch die passende Tuer gehen.
 *
 * -- Essayons a la main --
 * Testlauf: 33, 1.82, L. Danach muessen genau diese drei Werte in den passenden Variablen stehen.
 *
 * -- Le plan --
 * 1. Lies das Alter als `int`.
 * 2. Lies die Groesse als `double`.
 * 3. Lies die Initiale als `char`.
 * 4. Gib alle Werte aus.
 * 5. Fuehre den Testlauf mit 33 / 1.82 / L durch.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die drei Eingaben sind gleichartig und bleiben in einem linearen Check-in-Ablauf.
 *
 * Exemples a verifier :
 * - Eingaben `33`, `1.82`, `L` -> Variablen 33, 1.82, 'L'
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Nutze fuer jeden Zieltyp die passende Simput-Methode.
 * - Ein `char` repraesentiert genau ein Zeichen.
 */
void main() {
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(alter);
    IO.println(groesse);
    IO.println(initiale);
    
    ExerciseChecker.check("Test-Alter 33", alter == 33);
    ExerciseChecker.check("Test-Groesse 1.82", Math.abs(groesse - 1.82) < 1e-12);
    ExerciseChecker.check("Test-Initiale L", initiale == 'L');
    ExerciseChecker.summary();
}

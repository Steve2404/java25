/**
 * EXERCICE 18 - Laufzeit in Stunden, Minuten und Sekunden zerlegen
 * ===============================================================
 *
 * Niveau : moyen
 *
 * Histoire :
 * Ein Monitoring-Tool erhaelt eine Gesamtlaufzeit in Sekunden und soll sie fuer einen Bericht in Stunden, Minuten und Restsekunden darstellen.
 *
 * Notions du cours :
 * `Simput.gint()`, Ganzzahldivision, Restoperator `%`.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Zerlege die eingegebenen Sekunden ohne Gleitkomma in Stunden, Minuten und Sekunden.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du packst Sekunden zuerst in grosse 3600er-Kisten, dann den Rest in 60er-Kisten. Was danach uebrig bleibt, sind einzelne Sekunden.
 *
 * -- Essayons a la main --
 * 3665 Sekunden = 1 Stunde, Rest 65; 65 = 1 Minute, Rest 5.
 *
 * -- Le plan --
 * 1. Lies `gesamt` als int.
 * 2. Berechne volle Stunden mit `/ 3600`.
 * 3. Berechne den Rest mit `% 3600`.
 * 4. Berechne Minuten und Restsekunden aus diesem Rest.
 * 5. Gib alle drei Teile aus.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die drei Schritte gehoeren zu derselben Zerlegung und sollen sichtbar bleiben.
 *
 * Exemples a verifier :
 * - 3665 -> 1 h, 1 min, 5 s
 * - 59 -> 0 h, 0 min, 59 s
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Ganzzahldivision zaehlt volle Gruppen.
 * - Der Restoperator liefert das, was nicht in die volle Gruppe passt.
 */
void main() {
    int gesamt = Simput.gint("Gesamtsekunden: ");
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(stunden + "h " + minuten + "m " + sekunden + "s");
    ExerciseChecker.check("3665 -> 1:1:5",
            stunden == 1 && minuten == 1 && sekunden == 5);
    ExerciseChecker.summary();
}

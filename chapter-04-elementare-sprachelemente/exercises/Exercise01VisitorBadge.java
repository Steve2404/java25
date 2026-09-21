/**
 * EXERCICE 01 - Besucherbadge fuer ein IT-Labor erstellen
 * ======================================================
 *
 * Niveau : facile
 *
 * Histoire :
 * Ein Besucher kommt in ein IT-Labor. Aus Vorname und Raumnummer soll ein eindeutiger Badge-Text entstehen, den ein Empfangs-PC anzeigen kann.
 *
 * Notions du cours :
 * kompakter Programmeinstieg `void main()`, gueltige Bezeichner, Variablen, String-Verkettung.
 *
 * -- Rappel du decoupage en "boites magiques" --
Une étape mérite mentalement sa propre petite boîte lorsqu’elle peut être expliquée seule, revient plusieurs fois ou cache sa propre recette. Dans ce chapitre, on ne crée pas artificiellement de nouvelles méthodes si elles n’ont pas encore été étudiées : la boîte peut rester une étape mentale du programme.
 *
 * ==================================================================
 * TODO 1 : Baue den Badge-Text exakt aus den vorhandenen Daten.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Du hast zwei kleine Zettel: auf einem steht der Name, auf dem anderen die Raumnummer. Du sollst daraus einen einzigen gut lesbaren Zettel machen.
 *
 * -- Essayons a la main --
 * prenom = "Ada", raum = 204. Von Hand entsteht: "Ada - Raum 204".
 *
 * -- Le plan --
 * 1. Lies die zwei bereits vorhandenen Werte.
 * 2. Lege eine neue String-Variable `badge` an.
 * 3. Verbinde Name, festen Text und Raumnummer.
 * 4. Gib den Badge aus.
 * 5. Lass den Checker den exakten Text pruefen.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Fuer diese eine lineare Aufgabe reicht ein kleiner Ablauf im `main()`.
 *
 * Exemples a verifier :
 * - Ada + 204 -> `Ada - Raum 204`
 * - Linus + 12 -> `Linus - Raum 12`
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Ein String wird mit `+` verkettet.
 * - Ein Variablenname darf nicht mit einer Ziffer beginnen.
 */
void main() {
    String prenom = "Ada";
    int raum = 204;
    
    // TODO 1
    // Ecris ton code ici.
    
    IO.println(badge);
    ExerciseChecker.check("Badge exakt", badge.equals("Ada - Raum 204"));
    ExerciseChecker.summary();
}

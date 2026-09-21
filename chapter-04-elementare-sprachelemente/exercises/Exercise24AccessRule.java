/**
 * EXERCICE 24 - Zutrittsregel aus mehreren Bedingungen bauen
 * =========================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Ein Technikraum darf betreten werden, wenn eine Person einen gueltigen Badge hat UND entweder Administrator ist ODER innerhalb der Servicezeit kommt.
 *
 * Notions du cours :
 * `&&`, `||`, Klammern, relationale Bedingungen.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Formuliere die Zutrittsregel so, dass die logische Gruppierung eindeutig ist.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Es gibt eine Pflichtkarte: der Badge. Danach reicht eine von zwei Zusatzbedingungen. Ohne Badge ist die Tuer immer zu.
 *
 * -- Essayons a la main --
 * badge=true, admin=false, serviceZeit=true -> true && (false || true) -> true.
 *
 * -- Le plan --
 * 1. Lege die drei booleans an.
 * 2. Formuliere die innere Alternative admin ODER Servicezeit.
 * 3. Klammer diese Alternative.
 * 4. Verknuepfe sie mit dem Badge ueber UND.
 * 5. Pruefe den Beispielzustand.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Die Klammern sollen die Geschaeftsregel direkt lesbar machen.
 *
 * Exemples a verifier :
 * - true,false,true -> Zutritt true
 * - false,true,true -> Zutritt false
 * - true,false,false -> Zutritt false
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Schreibe `badgeGueltig && (admin || serviceZeit)`.
 * - Klammern machen die Geschaeftsregel explizit.
 */
void main() {
    boolean badgeGueltig = true;
    boolean admin = false;
    boolean serviceZeit = true;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Zutritt erlaubt", zutritt);
    ExerciseChecker.summary();
}

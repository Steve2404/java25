/**
 * EXERCICE 39 - Preview: primitive Statuswerte direkt mit switch klassifizieren
 * ======================================================================
 *
 * Niveau : difficile
 *
 * Histoire :
 * Ein Embedded-Status kommt als primitiver `int`, und ein Service-Schalter als primitiver `boolean`. Die Java-25-Preview soll beide Faelle ohne Wrapper-Umweg ausdruecken.
 *
 * Notions du cours :
 * Java-25-Preview, primitives Typmuster `case int i`, `boolean` als switch-Selektor, Exhaustivitaet, `--enable-preview`.
 *
 * Rappel express du decoupage en "boites magiques" :
 * voir Exercise01VisitorBadge.java.
 *
 * ==================================================================
 * TODO 1 : Baue einen Preview-switch fuer Status 13 und einen zweiten fuer `serviceMode=true`.
 * ==================================================================
 *
 * -- Le probleme, explique comme a un tout petit enfant --
 * Normalerweise kennt switch nur bestimmte Eingangstypen und Pattern-Regeln. Die Preview oeffnet neue Tueren fuer primitive Werte. Dafuer musst du diese Tueren beim Kompilieren und Ausfuehren ausdruecklich freischalten.
 *
 * -- Essayons a la main --
 * status=13 -> nicht 0/1 -> `case int i when 2..25` -> `error: 13`. boolean true -> SERVICE.
 *
 * -- Le plan --
 * 1. Klassifiziere den int-Status mit Konstanten und primitivem Typmuster.
 * 2. Nutze einen Guard fuer 2 bis 25.
 * 3. Decke uebrige ints mit `case int i` ab.
 * 4. Schalte den boolean-Wert mit `case false` und `case true`.
 * 5. Kompiliere und starte mit Preview-Freigabe.
 *
 * -- Ce plan a-t-il besoin d'une boite magique separee ? --
 * Nein. Beide switch-Ausdruecke zeigen zwei Seiten derselben Preview-Funktion.
 *
 * Exemples a verifier :
 * - 13 -> `error: 13`
 * - true -> `SERVICE`
 *
 * Indices techniques Java
 * (a lire seulement si le plan a la main est clair mais que
 * la traduction en code bloque) :
 * - Kompilieren: `javac --enable-preview --release 25 ...`.
 * - Ausfuehren: `java --enable-preview ...`.
 * - Die Preview muss in beiden Phasen aktiviert sein.
 */
void main() {
    int status = 13;
    boolean serviceMode = true;
    
    // TODO 1
    // Ecris ton code ici.
    
    ExerciseChecker.check("Status 13", statusText.equals("error: 13"));
    ExerciseChecker.check("Service true", modeText.equals("SERVICE"));
    ExerciseChecker.summary();
}

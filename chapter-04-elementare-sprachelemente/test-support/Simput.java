import java.util.Scanner;

/**
 * Nur Test-/CI-Unterstützung.
 *
 * Im eigentlichen Kurs kann die dort verwendete Simput-Bibliothek benutzt werden.
 * Diese kleine Ersatzklasse existiert nur, damit die Übungslösungen in GitHub Actions
 * gegen Java 25 kompiliert und mit vorgegebenem stdin ausgeführt werden können.
 */
final class Simput {
    private static final Scanner SCANNER = new Scanner(System.in);

    private Simput() {
    }

    static int gint(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextInt();
    }

    static long glong(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextLong();
    }

    static double gdouble(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextDouble();
    }

    static char gchar(String prompt) {
        System.out.print(prompt);
        return SCANNER.next().charAt(0);
    }
}

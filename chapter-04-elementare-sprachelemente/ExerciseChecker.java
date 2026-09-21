final class ExerciseChecker {
    private static int total = 0;
    private static int passed = 0;

    private ExerciseChecker() {
    }

    static void check(String label, boolean condition) {
        total++;

        if (condition) {
            passed++;
            System.out.println("[PASS] " + label);
        } else {
            System.out.println("[FAIL] " + label);
        }
    }

    static void summary() {
        System.out.println(
                "\n--- Resultat: " + passed + "/" + total + " Tests bestanden ---\n"
        );

        total = 0;
        passed = 0;
    }
}

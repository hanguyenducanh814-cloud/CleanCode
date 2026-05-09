public class TriangleClassifier {

    public static String classify(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            return "Không phải là tam giác";
        }

        if (a == b && b == c) {
            return "Tam giác đều";
        }

        if (a == b || b == c || a == c) {

            if (isRightTriangle(a, b, c)) {
                return "Tam giác vuông cân";
            }
            return "Tam giác cân";
        }

        if (isRightTriangle(a, b, c)) {
            return "Tam giác vuông";
        }

        return "Tam giác thường";
    }

    private static boolean isRightTriangle(double a, double b, double c) {
        return (a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a);
    }

    public static void main(String[] args) {
        System.out.println(classify(3, 3, 3));
        System.out.println(classify(3, 4, 5));
        System.out.println(classify(1, 2, 10));
    }
}

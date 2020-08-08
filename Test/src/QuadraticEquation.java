public class QuadraticEquation {

        public static Roots findRoots(double a, double b, double c) {
            //throw new UnsupportedOperationException("Waiting to be implemented.");
            double root1 =0.0, root2 = 0.0;
            Roots r = new Roots(root1,root2);
            double determinant = b * b - 4 * a * c;
            if(determinant > 0) {
                root1= (-b + Math.sqrt(determinant)) / (2 * a);
                root2= (-b - Math.sqrt(determinant)) / (2 * a);

                System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
            }
            // Condition for real and equal roots
            else if(determinant == 0) {
                root1 = root2 = -b / (2 * a);

                System.out.format("root1 = root2 = %.2f;", root1);
            }

            return r;
        }

        public static void main(String[] args) {
            Roots roots = QuadraticEquation.findRoots(2, 10, 8);
            System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
        }
    }

    class Roots {
        public final double x1, x2;

        public Roots(double x1, double x2) {
            this.x1 = x1;
            this.x2 = x2;
        }
    }


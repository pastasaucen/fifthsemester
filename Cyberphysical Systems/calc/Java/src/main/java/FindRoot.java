import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;

public class FindRoot
{
    public static void main(String[] args)
    {
        BisectionSolver solver = new BisectionSolver();
        double result = solver.solve(100000, new Function(), -10, 10);
        System.out.println("Result: " + result);
    }

    private static class Function implements UnivariateFunction {
        public double value(double x) { return Math.cos(x)-x;}
    }
}

import com.dev.model.QuadraticEquation;

import org.junit.Assert;
import org.junit.Test;

public class CalculateQuadraticEquationTest {
    private QuadraticEquation quadraticEquationTwoRoots;
    private QuadraticEquation quadraticEquationOneRoot;
    private QuadraticEquation quadraticEquationNoRoots;

    public CalculateQuadraticEquationTest() {
        quadraticEquationTwoRoots = new QuadraticEquation(1, -8, 15);
        quadraticEquationOneRoot = new QuadraticEquation(1, -6, 9);
        quadraticEquationNoRoots = new QuadraticEquation(1, 1, 15);
    }

    @Test
    public void testDiscriminant() {
        Double d1 = quadraticEquationTwoRoots.getD();
        Double d2 = quadraticEquationOneRoot.getD();
        Double d3 = quadraticEquationNoRoots.getD();
        Assert.assertEquals("Test : ", 4, d1, 0.01);
        Assert.assertEquals("Test : ", 0, d2, 0.01);
        Assert.assertEquals("Test : ", -59, d3, 0.01);
    }

    @Test
    public void testIsQuadraticEquationHasRoots() {
        boolean hasTwoRoots = quadraticEquationTwoRoots.isEquationHasRoots();
        boolean hasOneRoot = quadraticEquationOneRoot.isEquationHasRoots();
        boolean hasNotRoots = quadraticEquationNoRoots.isEquationHasRoots();
        Assert.assertEquals("Test : ", true, hasTwoRoots);
        Assert.assertEquals("Test : ", true, hasOneRoot);
        Assert.assertEquals("Test : ", false, hasNotRoots);
    }

    @Test
    public void testQuadraticEquationHasTwoRoots() {
        Double x1 = quadraticEquationTwoRoots.getX1();
        Double x2 = quadraticEquationTwoRoots.getX2();
        Assert.assertEquals("Test x1: ", 3, x1, 0.01);
        Assert.assertEquals("Test x2: ", 5, x2, 0.01);
    }

    @Test
    public void testQuadraticEquationHasOneRoot() {
        Double x1 = quadraticEquationOneRoot.getX1();
        Double x2 = quadraticEquationOneRoot.getX2();
        Assert.assertEquals("Test x1: ", 3, x1, 0.01);
        Assert.assertEquals("Test x2: ", null, x2);
    }

    @Test
    public void testQuadraticEquationHaveNotRoots() {
        Double x1 = quadraticEquationNoRoots.getX1();
        Double x2 = quadraticEquationNoRoots.getX2();
        Assert.assertEquals("Test x1: ", null, x1);
        Assert.assertEquals("Test x2: ", null, x2);
    }

    @Test
    public void testQuadraticEquationZeroA() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(0, -8, 15);
        Assert.assertTrue(quadraticEquation.getX1().isNaN());
    }
}

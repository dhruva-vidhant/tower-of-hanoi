public class Main {

    public static void main(String[] args) {

        // Example: Solve a tower
        TowerModel model = new TowerModel(3);
        model.print();
        TowerSolver solver = new TowerSolver();
        solver.solve(model);
        model.print();

        //Run test suite
        TestSuite test = new TestSuite();
        test.run();

    }
}


public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        solve(3, 0, 2, 1);
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //

    public void solve(int num, int source, int dest, int aux) {
        if(num==1) {
            model.move(source, dest);
            return;
        }
        solve(num-1, source, aux, dest);
        solve(1, source, dest, aux);
        solve(num-1, aux, dest, source);
    }

}

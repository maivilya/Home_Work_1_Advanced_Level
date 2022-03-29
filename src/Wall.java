public class Wall extends Barrier {
    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    protected boolean moving(Actions actions){
        System.out.println(super.getName() + " height: " + this.height);

        actions.Run();

        if (getHeight() <= actions.getJumpHeight()) {
            System.out.println("Прыжок выполнен");

            return true;
        } else {
            System.out.println("Прыжок не выполнен");

            return false;
        }
    }

}

public class Robot implements Actions {
    int id;
    int runDistance;
    int jumpHeight;

    public Robot(int id, int runDistance, int jumpHeight) {
        this.id = id;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void Run() {
        System.out.println("Robot which have id:" + id + " is running " + this.getRunDistance() + " m");
    }

    @Override
    public void Jump() {
        System.out.println("Robot which have id:" + id + " is jumping " + this.getJumpHeight() + " cm");
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }

}

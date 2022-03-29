public class Cat implements Actions {
    String name;
    int runDistance;
    int jumpHeight;

    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void Run() {
        System.out.println("Cat " + name + " is running " + this.getRunDistance() + " m");
    }

    @Override
    public void Jump() {
        System.out.println("Cat " + name + " is jumping " + this.getJumpHeight() + " cm");
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

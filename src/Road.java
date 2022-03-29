public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println(super.getName() + " length: " + this.length);

        actions.Run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Дистанция пройдена");

            return true;
        } else {
            System.out.println("Дистанция не пройдена");

            return false;
        }
    }


}

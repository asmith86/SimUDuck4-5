package version5;

public final class ModelDuck implements Duck {

    private FlyBehavior fly;
    private QuackBehavior quack;

    public ModelDuck(FlyBehavior fb, QuackBehavior qb) {
        this.setFlyBehavior(fb);
        this.setQuackBehavior(qb);

    }

    @Override
    public void display() {
        System.out.println("I'm a Model Duck");
    }

    @Override
    public void setFlyBehavior(FlyBehavior fb) {
        if (null == fb) {
            throw new IllegalArgumentException("FlyBehavior cannot be null");
        }
        this.fly = fb;
    }

    @Override
    public void setQuackBehavior(QuackBehavior qb) {
        if (null == qb) {
            throw new IllegalArgumentException("QuackBehavior cannot be null");
        }
        this.quack = qb;
    }

    @Override
    public void performQuack() {
        this.quack.quack();
    }

    @Override
    public void performFly() {
        this.fly.fly();
    }

    @Override
    public void swim() {
        System.out.println("Model Duck swims!");

    }

}

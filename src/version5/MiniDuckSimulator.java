package version5;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck(new FlyWithWings(), new Quack());
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
                
                mallard.setFlyBehavior(new FlyRocketPowered());
                mallard.setQuackBehavior(new Squeak());
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck(new FlyNoWay(), new MuteQuack());
		model.display();
		model.performFly();
                
		model.setFlyBehavior( new FlyRocketPowered() );
		model.performFly();
	}

}

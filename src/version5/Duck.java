package version5;

/**
 * The main difference with this 5th version is that the class
 * provides methods for setting fly and quack behaviors at runtime.
 * Otherwise, everything else is the same.
 * 
 * @author jlombardo
 *
 */
public interface Duck {
	// Instance variables of interface type
	// Each duck has a reference to something that implements the behaviors
	// via an interface. Hey, isn't this composition the DIP way!!!
	// Only problem is we still have the limitation that all Ducks
	// have fly and quack behaviors, even thought that is not always needed.
	
	
	
	
	public abstract void setFlyBehavior(FlyBehavior fb);
	public abstract void setQuackBehavior(QuackBehavior qb);
	public abstract void display();
	public abstract void performQuack();
	public abstract void performFly();
	public abstract void swim();
	
	
	
	// OTHER DUCK-LIKE METHODS
}

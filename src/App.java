public class App {
    public static void main(String args[]) {
        Weapon knife = new Knife();
        knife.Attack();

        Weapon gun = new Gun(10);
        gun.Attack();

        gun.Attack();

        Knife knife2 = new Knife();
        Weapon gun2 = new Gun(10);

        knife2.Attack();
        gun2.Attack();
        gun2.Attack();

    }

    
}
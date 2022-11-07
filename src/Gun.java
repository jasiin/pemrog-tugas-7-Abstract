public class Gun extends Weapon {
    public int bullets;

    public Gun(int bullets) {
        this.bullets = bullets;
    }

    @Override
    public void Attack() {
        bullets -= 1;
        System.out.println("Senjata");
        System.out.println("Menembak peluru");
        System.out.println("sisa peluru : " + bullets);

    }
}

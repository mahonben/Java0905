package Test.P303_8;

public class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Monster(String name) {
        this.name = name;
        hp = maxHp;
    }

    public void attack(Monster enemy) {
        enemy.setHp(getHp()-10);
    }

    public static void battle(Monster a, Monster b) {
        while (a.hp > 0 && b.hp > 0){
            Monster attacker = (Math.random() < 0.5) ? a: b;
            Monster defender = (attacker == a) ? b: a;
            defender.attack(defender);
            System.out.printf("[%s]의 공격 -> [%s]의 체력: %d/%d\n",
                    attacker.getName(), defender.getName(), defender.getHp(), maxHp);
        }
    }




}

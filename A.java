public class A extends Monster {
  public A () {
    name2 = "スライム";
    HP2 = 200;
    AttackPower2 = 100;
    MagicPower2 = 80;
    AttackGuard2 = 50;
    MagicGuard2 = 30;
    Speed2 = 120;
  }
  public static String name = "スライム";
  public static int HP = 200;
  public static int AttackPower = 100;
  public static int MagicPower = 80;
  public static int AttackGuard = 50;
  public static int MagicGuard = 30;
  public static int Speed = 120;

  public static String skill1name = "はじける";
  public static String skill2name = "体当たり";
  public static String skill3name = "火の魔法";
  public static String skill4name = "奇跡の進撃";

  public static void showA() {
    System.out.println("ーーーーーーーーーーーーーーーーー");
    System.out.println("モンスター名：" + name);
    System.out.println("ーーーーーーーーーーーーーーーーー");
    System.out.println("攻撃力：" + AttackPower);
    System.out.println("魔法力：" + MagicPower);
    System.out.println("物理防御力：" + AttackGuard);
    System.out.println("魔法防御力：" + MagicGuard);
    System.out.println("素早さ：" + Speed);
    System.out.println("ーーーーーーーーーーーーーーーーー");
    System.out.println("スキル");
    System.out.println("1." + skill1name);
    System.out.println("2." + skill2name);
    System.out.println("3." + skill3name);
    System.out.println("4." + skill4name);
    System.out.println("ーーーーーーーーーーーーーーーーー");
  }

  public int attack(int hit, Monster enemy) {
    if (hit <= 45) {
      return skill1(enemy);
    } else if (hit > 45 && hit <= 65) {
      return skill2(enemy);
    } else if (hit > 65 && hit <= 95) {
      return skill3(enemy);
    } else {
      return skill4(enemy);
    }
  }

  public int skill1(Monster enemy) {
    int damage = AttackPower - enemy.AttackGuard2;
    System.out.println("スキル「" + skill1name + "」 " + damage + "のダメージ");
    return damage;
  }
  public int skill2(Monster enemy) {
    int damage = AttackPower / 10 * 15 - enemy.AttackGuard2;
    System.out.println("スキル「" + skill2name + "」 " + damage + "のダメージ");
    return damage;
  }
  public int skill3(Monster enemy) {
    int damage = MagicPower - enemy.MagicGuard2;
    System.out.println("スキル「" + skill3name + "」 " + damage + "のダメージ");
    return damage;
  }
  public int skill4(Monster enemy) {
    int damage = AttackPower * 5 - enemy.AttackGuard2;
    System.out.println("スキル「" + skill4name + "」 " + damage + "のダメージ");
    return damage;
  }
}
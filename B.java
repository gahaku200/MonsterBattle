public class B extends Monster {
  public B () {
    name2 = "ゴースト";
    HP2 = 250;
    AttackPower2 = 70;
    MagicPower2 = 150;
    AttackGuard2 = 35;
    MagicGuard2 = 80;
    Speed2 = 80;
  }
  public static String name = "ゴースト";
  public static int HP = 250;
  public static int AttackPower = 70;
  public static int MagicPower = 150;
  public static int AttackGuard = 35;
  public static int MagicGuard = 80;
  public static int Speed = 80;

  public static String skill1name = "火の魔法";
  public static String skill2name = "氷の魔法";
  public static String skill3name = "いなずま";
  public static String skill4name = "はたく";

  public static void showB() {
    System.out.println("ーーーーーーーーーーーーーーーーー");
    System.out.println("モンスター名：" + name);
    System.out.println("ーーーーーーーーーーーーーーーーー");
    System.out.println("攻撃力：" + AttackPower);
    System.out.println("魔法力：" + MagicPower);
    System.out.println("物理防御力：" + AttackGuard);
    System.out.println("魔法防御力：" + MagicGuard);
    System.out.println("素早さ：" + Speed);
    System.out.println("ーーーーーーーーーーーーーーーーー");
    System.out.println("技名");
    System.out.println("1." + skill1name);
    System.out.println("2." + skill2name);
    System.out.println("3." + skill3name);
    System.out.println("4." + skill4name);
    System.out.println("ーーーーーーーーーーーーーーーーー");
  }

  public int attack(int hit, Monster enemy) {
    if (hit <= 30) {
      return skill1(enemy);
    } else if (hit > 30 && hit <= 60) {
      return skill2(enemy);
    } else if (hit > 60 && hit <= 80) {
      return skill3(enemy);
    } else {
      return skill4(enemy);
    }
  }

  public int skill1(Monster enemy) {
    int damage = MagicPower - enemy.MagicGuard2;
    System.out.println("スキル「" + skill1name + "」 " + damage + "のダメージ");
    return damage;
  }
  public int skill2(Monster enemy) {
    int damage = MagicPower / 10 * 12 - enemy.MagicGuard2;
    System.out.println("スキル「" + skill2name + "」 " + damage + "のダメージ");
    return damage;
  }
  public int skill3(Monster enemy) {
    int damage = MagicPower * 2 - enemy.MagicGuard2;
    System.out.println("スキル「" + skill3name + "」 " + damage + "のダメージ");
    return damage;
  }
  public int skill4(Monster enemy) {
    int damage = AttackPower - enemy.AttackGuard2;
    if (damage < 0) {
      damage = 0;
    }
    System.out.println("スキル「" + skill4name + "」 " + damage + "のダメージ");
    return damage;
  }
}
public class C extends Monster {
  public C () {
    name2 = "オーク";
    HP2 = 300;
    AttackPower2 = 150;
    MagicPower2 = 60;
    AttackGuard2 = 20;
    MagicGuard2 = 20;
    Speed2 = 50;
  }
  public static String name = "オーク";
  public static int HP = 300;
  public static int AttackPower = 150;
  public static int MagicPower = 60;
  public static int AttackGuard = 20;
  public static int MagicGuard = 20;
  public static int Speed = 50;

  public static String skill1name = "ヤリ突き";
  public static String skill2name = "氷の魔法";
  public static String skill3name = "メガトンパンチ";
  public static String skill4name = "やりなぎ払い";

  public static void showC() {
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
    if (hit <= 25) {
      return skill1(enemy);
    } else if (hit > 25 && hit <= 50) {
      return skill2(enemy);
    } else if (hit > 50 && hit <= 75) {
      return skill3(enemy);
    } else {
      return skill4(enemy);
    }
  }

  public int skill1(Monster enemy) {
    int damage = AttackPower / 10 * 15 - enemy.AttackGuard2;
    System.out.println("スキル「" + skill1name + "」 " + damage + "のダメージ");
    return damage;
  }
  public int skill2(Monster enemy) {
    int damage = MagicPower / 10 * 12 - enemy.MagicGuard2;
    System.out.println("スキル「" + skill2name + "」 " + damage + "のダメージ");
    return damage;
  }
  public int skill3(Monster enemy) {
    int damage = AttackPower / 10 * 12 - enemy.AttackGuard2;
    System.out.println("スキル「" + skill3name + "」 " + damage + "のダメージ");
    return damage;
  }
  public int skill4(Monster enemy) {
    int damage = AttackPower / 10 * 18 - enemy.AttackGuard2;
    System.out.println("スキル「" + skill4name + "」 " + damage + "のダメージ");
    return damage;
  }
}
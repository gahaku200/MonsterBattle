public class D extends Monster {
  public D () {
    name2 = "ドラゴン";
    HP2 = 350;
    AttackPower2 = 150;
    MagicPower2 = 120;
    AttackGuard2 = 80;
    MagicGuard2 = 50;
    Speed2 = 60;
  }
  public static String name = "ドラゴン";
  public static int HP = 350;
  public static int AttackPower = 150;
  public static int MagicPower = 120;
  public static int AttackGuard = 80;
  public static int MagicGuard = 50;
  public static int Speed = 60;

  public static String skill1name = "切り裂く";
  public static String skill2name = "しゃくねつ";
  public static String skill3name = "かみつく";
  public static String skill4name = "ふぶき";

  public static void showD() {
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
    if (hit <= 40) {
      return skill1(enemy);
    } else if (hit > 40 && hit <= 50) {
      return skill2(enemy);
    } else if (hit > 50 && hit <= 80) {
      return skill3(enemy);
    } else {
      return skill4(enemy);
    }
  }

  public int skill1(Monster enemy) {
    int damage = AttackPower / 10 * 12 - enemy.AttackGuard2;
    System.out.println("スキル「" + skill1name + "」 " + damage + "のダメージ");
    return damage;
  }
  public int skill2(Monster enemy) {
    int damage = MagicPower * 2 - enemy.MagicGuard2;
    System.out.println("スキル「" + skill2name + "」 " + damage + "のダメージ");
    return damage;
  }
  public int skill3(Monster enemy) {
    int damage = AttackPower / 10 * 15 - enemy.AttackGuard2;
    System.out.println("スキル「" + skill3name + "」 " + damage + "のダメージ");
    return damage;
  }
  public int skill4(Monster enemy) {
    int damage = MagicPower / 10 * 15 - enemy.MagicGuard2;
    System.out.println("スキル「" + skill4name + "」 " + damage + "のダメージ");
    return damage;
  }
}
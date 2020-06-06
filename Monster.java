import java.util.*;

public class Monster {
  public String name2;
  public int HP2;
  public int AttackPower2;
  public int MagicPower2;
  public int AttackGuard2;
  public int MagicGuard2;
  public int Speed2;
  String[] monsters = {A.name, B.name, C.name, D.name};
  
  public static void viewMonster() {
    System.out.println("ーーーーーーーーーーーーーーーーー");
    System.out.println("1." + A.name);
    System.out.println("2." + B.name);
    System.out.println("3." + C.name);
    System.out.println("4." + D.name);
  }

  public static void show() {
    Scanner sc = new Scanner(System.in);

    
    System.out.println("見たいモンスターを番号で選んでください。");
    viewMonster();

    int shownum = sc.nextInt();
    while(shownum < 1 || shownum > 4) {
      System.out.println("1〜4の番号で選択してください");
      shownum = sc.nextInt();
    }

    if (shownum == 1) {
      A.showA();
    } else if (shownum == 2) {
      B.showB();
    } else if (shownum == 3) {
      C.showC();
    } else {
      D.showD();
    }
  }

  public int choise1() {
    Scanner sc = new Scanner(System.in);

    System.out.println("");
    System.out.println("☆自分のモンスターを番号で選んでください。");
    viewMonster();

    int mychoise = sc.nextInt();
    while(mychoise < 1 || mychoise > 4) {
      System.out.println("1〜4の番号で選択してください");
      mychoise = sc.nextInt();
    } 
    
    System.out.println("");
    System.out.println("あなたは" + monsters[mychoise - 1] +"を選びました！");
    System.out.println("");

    return mychoise;
  }

  public int choise2() {
    Scanner sc = new Scanner(System.in);

    System.out.println("☆相手のモンスターを番号で選んでください。");
    viewMonster();

    int enemychoise = sc.nextInt();
    while(enemychoise < 1 || enemychoise > 4) {
      System.out.println("1〜4の番号で選択してください");
      enemychoise = sc.nextInt();
    } 

    System.out.println("");
    System.out.println("相手のモンスターは" + monsters[enemychoise - 1] + "に決まりました！");
    System.out.println("");

    return enemychoise;
  }

  public int attack(int hit, Monster enemy) {
    return 1;
  }

  public int skill1() {
    return 1;
  }
  public int skill2() {
    return 1;
  }
  public int skill3() {
    return 1;
  }
  public int skill4() {
    return 1;
  }
}
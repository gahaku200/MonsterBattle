import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("カードオブモンスターへようこそ！");
    System.out.println("☆1〜2の番号で選択してください☆");
    System.out.println("1.遊ぶ　2.終わる");
    start1();
    start2();

  }
  
  public static void start1() {
    Scanner sc = new Scanner(System.in);
    int start1num = sc.nextInt();
    if (start1num == 1) {
      return;
    } else if (start1num == 2) {
      System.exit(0);
    } else {
      System.out.println("1〜2の番号で選択してください");
      start1();
    }
    
  }

  public static void start2() {
    System.out.println("");
    System.out.println("☆1〜3の番号で選択してください☆");
    System.out.println("1.モンスターを選ぶ　2.モンスターを見る　3.戻る");

    Scanner sc = new Scanner(System.in);
    int start2num = sc.nextInt();

    if (start2num == 1) {
      int yourMonster = new Monster().choise1();
      int enemyMonster = new Monster().choise2();
      vs(yourMonster, enemyMonster);
    } else if (start2num == 2) {
      Monster.show();
    } else if (start2num == 3) {
      String[] args = {};
      main(args);
    } else {
      System.out.println("1〜3の番号で選択してください");
      start2();
    }

    System.out.println("");
    start2();
  }

  public static void vs(int num1, int num2) {
    System.out.println("ーーーーーーーーーーーーーーーーー");
    System.out.println("戦闘を開始しますか？");
    System.out.println("☆1〜2の番号で選択してください☆");
    System.out.println("1.戦闘を開始する　2.戻る");

    Scanner sc = new Scanner(System.in);
    int battle = sc.nextInt();
    if (battle == 2) {
      start2();
    }
    while (battle != 1) {
      System.out.println("1〜2の番号で選択してください");
      System.out.println("1.戦闘を開始する　2.戻る");
      battle = sc.nextInt();
    }

    Monster myMons;
    if (num1 == 1) {
      myMons = new A();
    } else if (num1 == 2) {
      myMons = new B();
    } else if (num1 == 3) {
      myMons = new C();
    } else {
      myMons = new D();
    }

    Monster enemyMons;
    if (num2 == 1) {
      enemyMons = new A();
    } else if (num2 == 2) {
      enemyMons = new B();
    } else if (num2 == 3) {
      enemyMons = new C();
    } else {
      enemyMons = new D();
    }

    fight(myMons, enemyMons);
  }

  public static void fight(Monster myMons, Monster enemyMons) {
    System.out.println("");
    System.out.println("ーーーーーーーーーーーーーーーーー");
    System.out.println("あなたのモンスター：" + myMons.name2 + " HP：" + myMons.HP2);
    System.out.println("相手のモンスター：" + enemyMons.name2 + " HP：" + enemyMons.HP2);

    fight2();
    fight3(myMons, enemyMons);
  }

  public static void fight2() {
    System.out.println("");
    System.out.println("☆1〜2の番号で選択してください☆");
    System.out.println("1.攻撃　2.タイトルに戻る");

    Scanner sc = new Scanner(System.in);
    int fightchoise = sc.nextInt();
    System.out.println("");
    if (fightchoise == 1) {
      return;
    } else if (fightchoise == 2) {
      String[] args = {};
      main(args);
    } else {
      fight2();
    }
  }

  public static void fight3(Monster myMons, Monster enemyMons) {
    if (myMons.Speed2 > enemyMons.Speed2) {
      System.out.println("あなたの攻撃！");
      int hit = (int)(Math.random() * 100 + 1);
      int damage = myMons.attack(hit, enemyMons);
      enemyMons.HP2 -= damage;
      if (enemyMons.HP2 <= 0) {
        System.out.println("");
        System.out.println("相手の" + enemyMons.name2 + "をやっつけた！おめでとう！");
        String[] args = {};
        main(args);
      }

      System.out.println("相手の攻撃！");
      int hit2 = (int)(Math.random() * 100 + 1);
      int damage2 = enemyMons.attack(hit2, myMons);
      myMons.HP2 -= damage2;
      if (myMons.HP2 <= 0) {
        System.out.println("");
        System.out.println("あなたの" + myMons.name2 + "はやられてしまった。残念！");
        String[] args = {};
        main(args);
      }
    } else {
      System.out.println("相手の攻撃！");
      int hit2 = (int)(Math.random() * 100 + 1);
      int damage2 = enemyMons.attack(hit2, myMons);
      myMons.HP2 -= damage2;
      if (myMons.HP2 <= 0) {
        System.out.println("");
        System.out.println("あなたの" + myMons.name2 + "はやられてしまった。残念！");
        String[] args = {};
        main(args);
      }

      System.out.println("あなたの攻撃！");
      int hit = (int)(Math.random() * 100 + 1);
      int damage = myMons.attack(hit, enemyMons);
      enemyMons.HP2 -= damage;
      if (enemyMons.HP2 <= 0) {
        System.out.println("");
        System.out.println("相手の" + enemyMons.name2 + "をやっつけた！おめでとう！");
        String[] args = {};
        main(args);
      }
    }
    fight(myMons, enemyMons);
  }
}
package jp.ac.uryukyu.ie.e205733;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        if (this.hitPoint>0){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
            hero.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
    //-----------------ここからアクセサ-----------------
    /**
     * クラス外から敵の名前を受け取るメソッド
     * @return name 敵の名前
     */
    public String getName(){
        return this.name;
    }
    /**
     * クラス外から敵のHPを受け取るメソッド
     * @return hitPoint 敵のHP
     */
    public int gethitPoint(){
        return this.hitPoint;
    }
    /**
     * クラス外から敵の攻撃力を受け取るメソッド
     * @return attack 敵の攻撃力
     */
    public int getattack(){
        return this.attack;
    }
    /**
     * クラス外から敵の生存状態を確認するメソッド
     * @return dead 敵の生死
     */
    public boolean getdead(){
        return this.dead;
    }
    /**
     * クラス外から敵の名前を設定するメソッド
     * @param name 敵の名前
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * クラス外から敵のHPを設定するメソッド
     * @param hp　敵のHP
     */
    public void gethitPoint(int hp){
        this.hitPoint = hp;
    }
    /**
     * クラス外から敵の攻撃力を設定するメソッド
     * @param atk　敵の攻撃力
     */
    public void getattack(int atk){
        this.attack = atk;
    }
    /**
     * クラス外から敵の生存状態を設定するメソッド
     * @param life　敵の生死
     */
    public void getdead(boolean life){
        this.dead = life;
    }

    //-----------------ここまでアクセサ--------------------

}
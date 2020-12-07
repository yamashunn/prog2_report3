package jp.ac.uryukyu.ie.e205733;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
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
    public void sethitPoint(int hp){
        this.hitPoint = hp;
    }
    /**
     * クラス外から敵の攻撃力を設定するメソッド
     * @param atk　敵の攻撃力
     */
    public void setattack(int atk){
        this.attack = atk;
    }
    /**
     * クラス外から敵の生存状態を設定するメソッド
     * @param life　敵の生死
     */
    public void setdead(boolean life){
        this.dead = life;
    }

    //-----------------ここまでアクセサ--------------------

}
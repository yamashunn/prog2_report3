package jp.ac.uryukyu.ie.e205733;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
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
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
    //-----------------ここからアクセサ-----------------

    
    /**
     * クラス外からHeroのHPを受け取るメソッド
     * @return hitPoint HeroのHP
     */
    public int gethitPoint(){
        return this.hitPoint;
    }
    /**
     * クラス外からHeroの攻撃力を受け取るメソッド
     * @return attack Heroの攻撃力
     */
    public int getattack(){
        return this.attack;
    }
    
    /**
     * クラス外からHeroの名前を設定するメソッド
     * @param name Heroの名前
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * クラス外からHeroのHPを設定するメソッド
     * @param hp　HeroのHP
     */
    public void sethitPoint(int hp){
        this.hitPoint = hp;
    }
    /**
     * クラス外からHeroの攻撃力を設定するメソッド
     * @param atk　Heroの攻撃力
     */
    public void setattack(int atk){
        this.attack = atk;
    }
    /**
     * クラス外からHeroの生存状態を設定するメソッド
     * @param life　Heroの生死
     */
    public void setdead(boolean life){
        this.dead = life;
    }

    //-----------------ここまでアクセサ--------------------

}

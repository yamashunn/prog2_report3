package jp.ac.uryukyu.ie.e205733;

/**
 * 戦士クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Warrior extends Hero{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 戦士名
     * @param maximumHP 戦士のHP
     * @param attack 戦士の攻撃力
     */
    public Warrior (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }
    public void attackWithWeponSkill(LivingThing opponent){
        int damege = (int)(attack * 1.5);
        if (this.dead==false){
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n",name,opponent.getName(),damege);
            opponent.wounded(damege);
        }
    }
}
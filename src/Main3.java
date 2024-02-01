
public class Main3 {

	public static void main(String[] args) {
		
		//System.out.println(Hero.name);
		//static参照できないは　インスタンス化しないと見れない
		//これをstaticフィールドにするとどうなるか
		
		Hero.setRandomMoney();
		//Heroをインスタンス化しなくてもメソッドを呼び出せる
		
		
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Hero.money = 100;
		System.out.println(h1.money);
		System.out.println(h2.money);
		
		
		h1.money = 300;
		
		System.out.println(h1.money);
		System.out.println(h2.money);
		
		//クラスでmoneyが共有される
		
		
	}

}

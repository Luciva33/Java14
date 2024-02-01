
public class Hero {
	String name;
	int hp;
	static int money;
	
	//staticをつけると静的フィールド
	
	
	
	public static void setRandomMoney() {
	
		Hero.money = (int)(Math.random()*1000);
		//staticメソッド
		//メソッド自体がクラスに属する
		//インスタンスにメソッドの分身が準備される
		
		
		//String s = this.name; 
		//staticのフィールドがついてないとできない
		//どのインスタンスの名前か判断できない
				
		//run(); staticメソッドに普通のメソッドは使えない
		
		
	}
	
	
	public void run() {
		
		System.out.println("逃げる");
		//setRandomMoney();//逆はいける
	}
	
	
	
	@Override
	public boolean equals(Object o) {
		// TODO 自動生成されたメソッド・スタブ
		if(this == o) {return true;}
		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
}
/*オーバーライドして同じインスタンスとみなした
 * 名前が同じであれば、同じとみなす
 * 
 * 
 * */

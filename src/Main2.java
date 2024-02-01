
public class Main2 {

	public static void main(String[] args) {
		//等値と等価
		
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;
	
		if(h1.equals(h2)) {
			System.out.println("同じ内容です");
		}else {
			System.out.println("違う内容です");
		}
	
	
	}

}

/*  違う内容です
 
	違うインスタンスだからアドレスがちがう　参照型
	==を使う判定とequalsを使う判定は意味が微妙に違う
	==　     は等値　（同一の存在であること）
	equals	 は等価　（同じ内容であること）
	*/
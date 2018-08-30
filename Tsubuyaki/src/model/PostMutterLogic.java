package model;

import java.util.List;

public class PostMutterLogic {
	public void execute(Mutter mutter,List<Mutter>mutterList){
		mutterList.add(0,mutter);  //先頭に呟きを追加
	}

}

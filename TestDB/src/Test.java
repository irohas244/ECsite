
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TestUserDAO dao = new TestUserDAO();
		dao.select("taro","123");

		//追加部分2
        dao.selectAll();
        //追加部分3
        dao.selectByName("taro");

        //追加部分4
        dao.selectByPassword("123");
        //追加部分5
        dao.updateUserNameByUserName("taro","saburo");

        //追加部分6
        dao.insert(4, "shiro", "012");
        //追加部分7
        dao.delete("shiro");
	}

}

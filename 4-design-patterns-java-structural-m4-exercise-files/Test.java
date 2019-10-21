import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Test{
      public static void main(String[] args) {
		Menu mainMenu = new Menu("Main", "/main");
		MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
		mainMenu.add(safetyMenuItem);
		Menu claimsSubMenu = new Menu("Claims", "/claims");
		mainMenu.add(claimsSubMenu);
		MenuItem personalClaimsMenu1 = new MenuItem("Personal Claim", "/personalClaims");
		claimsSubMenu.add(personalClaimsMenu1);
	        MenuItem personalClaimsMenu2 = new MenuItem("Personal Claim", "/personalClaims");
	        claimsSubMenu.add(personalClaimsMenu2);
		System.out.println(mainMenu.toString());
	}
}

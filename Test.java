
import java.util.ArrayList;
import java.util.List;

class Test {
	
	String name;
	String url;
	List<String> li = new ArrayList<>();
	li.add("sam");li.add("ryio");li.add("caro");
	
	public String getName() {
		return name;
	}
	
	public String getUrl() {
		return url;
	}	
	
//	public abstract String toString();
	
	String print(MenuComponent menuComponent) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(": ");
		builder.append(url);
		builder.append("\n");
		return builder.toString();
	}
}

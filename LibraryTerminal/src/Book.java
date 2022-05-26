
import java.util.ArrayList;

public class Book extends Media {
	ArrayList<String> author = new ArrayList<>();	
	
	@Override
	public void consume() {
		// TODO Auto-generated method stub
		
	}

	public Book(String title, int condition, ArrayList<String> author) {
		super(title, condition);
		this.author = author;
	}

	public ArrayList<String> getAuthor() {
		return author;
	}

	public void setAuthor(ArrayList<String> author) {
		this.author = author;
	}

}

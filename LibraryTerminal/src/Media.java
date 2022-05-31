import java.util.ArrayList;

abstract class Media {

	String title;

//	enum status { CHECKEDOUT, ONSHELF, LOST, InCart};
	//enum variable for media status
	Status mediaStatus = Status.ONSHELF;
	
	public Status getMediaStatus() {
		return mediaStatus;
	}


	public void setMediaStatus(Status mediaStatus) {
		this.mediaStatus = mediaStatus;
	}


	int condition;
	// Add date object. Calendar.
	
	
	public abstract void consume();
	// read for book, watch for movie, listen for audiobooks


	public Media(String title, int condition, Status mediaStatus) {
		this.title = title;
		this.condition = condition;
		this.mediaStatus = mediaStatus;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getCondition() {
		return condition;
	}


	public void setCondition(int condition) {
		this.condition = condition;
	}
	
	
	@Override
	public String toString() {
		return "Media [title=" + title + ", mediaStatus=" + mediaStatus + ", condition=" + condition + "]";
	}


	protected abstract Object getAuthor();


	protected abstract Object getDirector();


	
	
}

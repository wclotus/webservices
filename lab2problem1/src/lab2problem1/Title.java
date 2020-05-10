package lab2problem1;

public class Title {
	private String title;
	
	public Title(String title)
    {
        this.title = title;
    }
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String toString()
    {
        return ""+this.title;
    }


}

package lab2problem1;

public class Description {
	private String description;
	public Description(String description)
    {
        this.description = description;
    }
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String toString()
    {
        return ""+this.description;
    }

}

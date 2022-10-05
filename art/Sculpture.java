package art;
public class Sculpture extends Art {

	private String material;
	
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}
	
	public void viewArt() {
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Description: " + getDescription());
		System.out.println("Material : " + getMaterial() + "\n");
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}

class Animal{	
    	    private String animalType;
    	    
    	    public void setAnimalType(String type)
    	    {
    	        this.animalType=type;
    	    }
    	    public String getAnimalType() {
    	        return animalType;
    	    }
    	
    	}
    	class Dog extends Animal{
    	
    	    protected String breedName;
    	    protected String gender;
    	
    	    Dog()
    	    {
    	        setAnimalType("Dog");
    	    }
    	    
    	    public void setBrideName(String brideName) {
    	        this.breedName = brideName;
    	    }
    	    public void setGender(String gender) {
    	        this.gender = gender;
    	    }
    	    public String getBrideName() {
    	        return breedName;
    	    }
    	
    	    public String getGender() {
    	        return gender;
    	    }
    	       
    	
    	}
    	
    	class GermenShefred extends Dog{
    	
        public String name;
    	    public String color;
    	
    	    GermenShefred()
    	    {
            setBrideName("GermenShfred");
    	    }
    	
    	    public void setName(String name) {
    	        this.name = name;
    	    }
    	    public void setColor(String color) {
    	        this.color = color;
    	    }
    	
    	    public String getName() {
    	        return name;
    	    }
    	    public String getColor() {
    	        return color;
    	    }
    	}
    	class Cat extends Animal{
    	
    	    protected String brideName;
    	    protected String gender;
    	
    	    Cat()
    	    {
    	        setAnimalType("Cat");
    	    }
    	    public void setBrideName(String brideName) {
    	        this.brideName = brideName;
	    }
	    public void setGender(String gender) {
	        this.gender = gender;
	    }
	
	    
	}
	class Persian extends Cat{
	    
	    public String name;
	    public String color;
    	
    	    Persian()
    	    {
    	        setBrideName("Persian");
    	    }
    	
    	    public void setName(String name) {
    	        this.name = name;
    	    }
    	    public void setColor(String color) {
    	        this.color = color;
    	    }
    	
    	    public String getName() {
    	        return name;
    	    }
    	    public String getColor() {
    	        return color;
    	    }
    	    public String getBreedeName() {
    	        return null;
    	    }
    	}
    	
    	public class Ass2_11 {
    	    public static void main(String[] args) {
    	        GermenShefred dog=new GermenShefred();
    	        Persian cat=new Persian();
    	
    	        dog.setName("Max");
    	        dog.setColor("Black");
    	        cat.setName("XYZ");
    	        cat.setColor("Orange");
	
        System.out.println(dog.getAnimalType()+":-\n"+dog.getBrideName()+"\n"+dog.getName()+"\n"+dog.getColor()+"\n");
        System.out.println(cat.getAnimalType()+":-\n"+cat.getBreedeName()+"\n"+cat.getName()+"\n"+cat.getColor());
    }
}
    
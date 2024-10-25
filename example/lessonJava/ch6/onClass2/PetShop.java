package lessonJava.ch6.onClass2;

public class PetShop {
    Pet[] pets;
    int foot;
    public PetShop(int len){
        pets = new Pet[len];
    }
    public PetShop(Pet[] tar){
        this.pets = tar;
    }
    public boolean add(Pet pet){
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = pet;
                return true;
            }
        }
        return false;
    }
    public Pet[] search(String keyWord){
        PetShop tem = new PetShop(pets.length);
        for (Pet pet : pets) {
            if (pet != null && (pet.getName().equals(keyWord) || pet.getColor().equals(keyWord))) {
                tem.add(pet);
            }
        }
        return tem.pets;
    }
    public void printPets() {
        for (Pet pet : pets) {
            if (pet != null)
                System.out.println("Name: " + pet.getName() + ", Color: " + pet.getColor() + ", age: " + pet.getAge());
        }
    }
}

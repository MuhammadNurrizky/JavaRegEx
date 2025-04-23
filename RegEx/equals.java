public class equals {
    public static void main(String[] args) {
        boolean animal = isValidAnimal("cat");
        System.out.println(animal);
    }

    public static boolean isValidAnimal(String animal) {
        if (animal.equals("cat")) {
            return true;
        }else if (animal.equals("dog")) {
            return true;
        } else {
            return false;
        }
    }
}

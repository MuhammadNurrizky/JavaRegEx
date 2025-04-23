public class RhymeGame {
    public static void main(String[] args) {
        String animal = "cat";
        if (rhymingAnimal(animal)) {
            System.out.println("kalimat ini sesuai dengan pola regex");
        } else {
            System.out.println("kalimat ini tidak sesuai dengan pola regex");
        }
    }

    private static boolean rhymingAnimal(String animal){
        return animal.matches("[a-zA-Z](at|AT)");
    }
}

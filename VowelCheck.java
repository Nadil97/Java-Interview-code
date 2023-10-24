public class VowelCheck {
    public static void main(String []args){
        System.out.println(vowelCheck("Nadil"));
        System.out.println(vowelCheck("tv"));
    }
    public static boolean vowelCheck (String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}

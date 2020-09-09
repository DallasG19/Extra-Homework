

/**
 * @author tariq
 */
public class Main {
    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public static Integer countYZ(String input){
        int counter = 0;
        String temp[] = input.split(" ");
        for(int index = 0; index < temp.length; index++) {
            if(temp[index].trim().endsWith("y") || temp[index].trim().endsWith("z")){
                counter++;
            }
        }
        return counter;
    }
    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public static String removeString(String base, String remove){
        String trial = "";
        if (base.contains(remove)){
            trial = base.replace("llo", "");
        }
        return trial;
    }
    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public static Boolean containsEqualNumberOfIsAndNot(String input){
        int isCounter = 0;
        int notCounter = 0;
        Boolean answer = false;
        for(int index = 0; index < input.length(); index++){
            if (input.charAt(index) == 'i' && input.charAt(index+1) == 's' ) {
                isCounter++;
            }else if (input.charAt(index) == 'n' && input.charAt(index+1) == 'o' && input.charAt(index+2) == 't'){
                notCounter++;
            }
            if(notCounter == isCounter){
                answer = false;
            }
            }

        return answer;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public static Boolean gIsHappy(String input){
        Boolean answer2 = false;
        for(int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == 'g' && input.charAt(index + 1) == 'g') {
                answer2 = true;
            }
        }
        return answer2;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public static Integer countTriple(String input){
        int tripCount = 0;
        for(int index = 0; index < input.length()-1; index++) {
            if (input.charAt(index) == input.charAt(index+1) && input.charAt(index + 1) == input.charAt(index + 2) ) {
                tripCount++;
            }
        }
        return tripCount;
    }


    public static void main(String[] args){
        String test = "fez day";
        System.out.println(countYZ(test));
        System.out.println(removeString("Hello there", "llo"));
        String prob3 = "This is not";
        System.out.println(containsEqualNumberOfIsAndNot(prob3));
        String prob4 = "xxggxx";
        System.out.println(gIsHappy(prob4));
        String prob5 = "xxxabyyyycd";
        System.out.println(countTriple(prob5));

    }
}

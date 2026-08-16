/* given a non empty string and an int N , return the string made starting with char 0,
and then every Nth char of the string. so is N is 3 , use char 0,3,6... abd so on.
N is 1 or more 

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"

 */
public class everyNth {
    public String everyNth(String str, int n) {
        String result = "";
        // look at every Nth char 
        //if the N is 2 then it will pick up the variable which has difference of 1 space.
        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);

        }
        return result ;

    }
    
}

/* given a string , return a new string whhere last 3 chars are now in upper cae .
if the string has less than 3 chars , uppercase whatever is their . 
note that str.toUppercase() returns the upper case version of a string .

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */
public class endUp {
    public String endUp(String str) {
        if (str.length() <= 3 ) return str.toUpperCase();
        int cut= str.length() - 3 ;
        String front = str.substring(0, cut);
        String back = str.substring(cut);
        // this takes from cut to end 

        return front + back.toUpperCase(); 

    }
    
}

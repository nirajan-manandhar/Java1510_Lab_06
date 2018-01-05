
package ca.bcit.comp1510.lab6;

/**
 * Name stores first, middle and last.
 * @author nirajan
 * @version 1.0
 *
 */
public class Name {
    /**
     * Declares the first name variable.
     */
    private String first;
    
    /**
     * Declares the middle name variable.
     */
    private String middle;
    
    /**
     * Declares the last name variable.
     */
    private String last;
    
    /**
     * Contructs an object of type name.
     * @param first a string.
     * @param middle a string.
     * @param last a string.
     */
    public Name(String first, String middle, String last) {
        
        first = first.trim();
        middle = middle.trim();
        last = last.trim();
        
        if (first.equals("")) {
            this.first = "Jane";
        } else {
            String lower = first.substring(1).toLowerCase();
            String upper = first.substring(0, 1).toUpperCase();
            String newString = upper + lower;            
            this.first = newString;
        }
        
        if (middle.equals("")) {
            this.first = "Shelly";
        } else {
            String lower = middle.substring(1).toLowerCase();
            String upper = middle.substring(0, 1).toUpperCase();
            String newString = upper + lower;            
            this.middle = newString;
        }
        
        if (last.equals("")) {
            this.first = "Smith";
        } else {
            String lower = last.substring(1).toLowerCase();
            String upper = last.substring(0, 1).toUpperCase();
            String newString = upper + lower;            
            this.last = newString;
        }

    }

    /**
     * Returns the first name as a string.
     * @return first as a string.
     */
    public String getFirst() {
        return first;
    }

    /**
     * Sets the first name.
     * @param first a string.
     */
    public void setFirst(String first) {
        
        first = first.trim();
        
        if (!first.equals(null) || !first.equals("")) {
            
            String lower = first.substring(1).toLowerCase();
            String upper = first.substring(0, 1).toUpperCase();
            String newString = upper + lower;            
            this.first = newString;
 
        }  
    }

    /**
     * Return the middle name as a string.
     * @return middle as a string.
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * Sets the middle name.
     * @param middle a string.
     */
    public void setMiddle(String middle) {
        
        middle = middle.trim();
        
        if (!middle.equals(null) || !middle.equals("")) {
            
            String lower = middle.substring(1).toLowerCase();
            String upper = first.substring(0, 1).toUpperCase();
            String newString = upper + lower;            
            this.middle = newString;
 
        }
    }

    /**
     * Return the last name as a string.
     * @return last as a string.
     */
    public String getLast() {
        return last;
    }

    /**
     * Sets the last name.
     * @param last a string.
     */
    public void setLast(String last) {
        
        last = last.trim();
        
        if (!last.equals(null) || !last.equals("")) {
            
            String lower = last.substring(1).toLowerCase();
            String upper = last.substring(0, 1).toUpperCase();
            String newString = upper + lower;            
            this.last = newString;
        }
    }
    
    /**
     * Returns the full name separated by spaces.
     * @return FullName as a string
     */
    public String getFullName() {
        String fullName = this.first + " " + this.middle + " " + this.last;
        return fullName;
    }
    
    /**
     * Returns the length of names.
     * @return length as int.
     */
    public int length() {
        return (first.length() + middle.length() + last.length());
    }
    
    /**
     * Returns the initials.
     * @return initials as String.
     */
    public String initials() {
        String f = first.substring(0, 1).toUpperCase();
        String m = middle.substring(0, 1).toUpperCase();
        String l = last.substring(0, 1).toUpperCase();
        String initials = f + m + l;
        return initials;
    }
    
    /**
     * Returns index.
     * @param index an int.
     * @return letter as char.
     */
    public char getCharacter(int index) {
        String full = this.first + this.middle + this.last;
        int length = full.length();
        char letter;
        
        if (index <= length) {
            letter = full.charAt(index);
        } else {
            letter = '@';
        }
        return letter;
    }
    
    /**
     * Returns the name formally.
     * @param first1 a string.
     * @param middle1 a string.
     * @param last1 a string.
     * @return formal as String.
     */
    public String formal(String first1, String middle1, String last1) {
        this.first = first1;
        this.middle = middle1;
        this.last = last1;
        return last + ", " + first + " " + middle;
    }
    
   /**
    * Compares two strings.
    * @param first1 a string.
    * @return compare as boolean.
    */
    public boolean compare(String first1) {
        boolean answer = first1.equals(this.first);
        return answer;
    }
    
    /**
     * Compares two name.
     * @param name a string.
     * @return nameCheck as boolean.
     */
    public boolean nameCheck(String name) {
        String fullname1 = this.first + this.middle + this.last;
        boolean check = fullname1.equals(name);
        return check;

    }

    
    


   
}

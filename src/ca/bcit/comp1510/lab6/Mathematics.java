package ca.bcit.comp1510.lab6;

import java.util.Random;

/**
 * Mathematics.
 * Contains mathematic methods.
 * @author nirajanmanandhar
 * @version 1.0
 *
 */
public class Mathematics {
    /**
     * A final double.
     * 
     */
    public static final double PI = 3.14159;
    
    /**
     * A final double.
     * 
     */
    public static final double ONE_FOOT_TO_KILOMETRE_RATIO = 0.0003048;
    
    /**
    * Returns the area of the circle with the specified radius.
    *
    * @param radius
    * of the circle.
    * @return area as a double
    */
    public double getCircleArea(double radius) {
        double area = PI * (radius * radius);
        return area;
    }
    
    /**
    * Returns the area of the square with the specified edge length.
    *
    * @param edgeLength
    * of the square.
    * @return area as a double
    */
    public double getSquareArea(double edgeLength) {
        double area = (edgeLength * edgeLength);
        return area;
    }
    
    /**
    * Returns the sum of the specified values.
    *
    * @param first
    * operand
    * @param second
    * operand
    * @return sum of the operands
    */
    public double add(double first, double second) {
        double sum = (first + second);
        return sum;
    }
    
    /**
    * Returns the product of the specified values.
    *
    * @param first
    * operand
    * @param second
    * operand
    * @return product of the operands
    */
    public double multiply(double first, double second) {
        double product = (first * second);
        return product;
    }
    
    /**
    * Returns the difference of the specified values.
    *
    * @param first
    * operand
    * @param second
    * operand
    * @return difference of the operands
    */
    public double subtract(double first, double second) {
        double difference = (first - second);
        return difference;
    }
    
    /**
    * Returns the quotient of the specified values. If the divisor is zero,
    * returns zero instead of NaN or infinity.
    *
    * @param first
    * operand
    * @param second
    * operand
    * @return quotient of the operands
    * 
    */
    public double divide(double first, double second) {
        if (second == 0) {
            return 0;
        }   else {
            double quotient = (first / second);
            return quotient;
        }
    }
    
    /**
    * Returns the absolute value of the specified integer.
    *
    * @param number
    * to test
    * @return absolute value of number
    */
    public int absoluteValue(int number) {
        if (number < 0) {
            return -number;
        }
        number = Math.abs(number);
        return number;
    }
    
    /**
    * Returns a random number between 10 and 20 inclusive,
    * but NOT 15.
    * @return random number in range [10, 20] excluding 15.
    */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        Random generator = new Random();
        int number;
        final int ten = 10;
        final int eleven = 11;
        final int fifteen = 15;
        number = generator.nextInt(eleven) + ten;
        while (number == fifteen) {
            number = generator.nextInt(eleven) + ten;
        }
        return number;
    }
    
    /**
    * Converts the specified number of feet to kilometres.
    * @param feet to convert
    * @return kilometres in the specified number of feet
    */
    public double convertFeetToKilometres(double feet) {
        double kilometres = feet * ONE_FOOT_TO_KILOMETRE_RATIO;
        return kilometres;
    }
    
    /**
    * Returns the sum of the positive integers between 0 and the specified
    * number inclusive. If the specified number is negative, returns zero.
    *
    * @param number
    * upper bound
    * @return sum as an integer
    */
    public int sumOfInts(int number) {
        
        if (number <= 0) {
            return 0;
        } else {
            int sum = (number * (number + 1)) / 2;
            return sum; 
        }
    }
    
    /**
    * Returns true if the specified value is positive, else false.
    *
    * @param number
    * to test
    * @return true if number is positive, else false.
    */
    public boolean isPositive(int number) {
        if (number > 0) {
            return true;
        }
        return false;
    }
    
    /**
    * Returns true if the specified value is even, else false.
    *
    * @param number
    * to test
    * @return true if number is even, else false.
    */
    public boolean isEven(int number) {
        int remainder;
        remainder = number % 2;
        
        if (remainder == 0) {
            return true;
        }
        return false;
    }
    
    /**
    * Returns sum of the even numbers between 0 and the specified value,
    * inclusive.
    *
    * @param number
    * upper bound
    * @return sum of the even numbers between 0 and number
    */
    public int sumOfEvens(int number) {
        
        
        if (number > 0) {
            
            int total = 0;
            int sum = 0;
            int count = 1;
            
            while (count <= number) {
                sum++;
                int remainder;
                remainder = sum % 2;
                
                if (remainder == 0) {
                    total = total + sum;
                }
                count++;
            }
            return total;
            
        } else if (number < 0) {
            
            int total = 0;
            int sum = 0;
            int count = -1;
            
            while (count >= number) {
                sum--;
                int remainder;
                remainder = sum % 2;
                
                if (remainder == 0) {
                    total = total + sum;
                }
                count--;
            }
            return total;
        }
        return number;    
        
    }
    
    /**total
    * Returns the sum of the numbers between zero and the
    * first parameter that are divisible by the second
    * number. For example, sumOfProducts(10, 3) will return
    * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return
    * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will
    * return -2 + -4 + -6 + -8 + -10 = -30.
    * @param bound the upper bound
    * @param divisor the divisor
    * @return sum
    */
    public int sumOfProducts(int bound, int divisor) {
        int total = 0;
        int sum = 0;
        int count = 1;
        
        if (bound > 0) {
            
            total = 0;
            sum = 0;
            count = 1;
            
            while (count <= bound) {
                sum++;
                int remainder;
                remainder = sum % divisor;
                
                if (remainder == 0) {
                    total = total + sum;
                }
                count++;
            }
            return total;
            
        } else if (bound < 0) {
            
            total = 0;
            sum = 0;
            count = -1;
            
            while (count >= bound) {
                sum--;
                int remainder;
                remainder = sum % divisor;
                
                if (remainder == 0) {
                    total = total + sum;
                }
                count--;
            }
            return total;
        }
        return bound;
 
        }
    }


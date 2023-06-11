package dsa.recursion.array.assignment3;

import java.util.Arrays;

/* 
   Given is an Array of Employee Salary, add the tax 10% in each salary 
   and return the new array which contains (salary + tax).   
 */
public class EmployeeSalary {
	
	public static int[] addTax(int[] salaries, double taxRate, int index) {
        if (index == salaries.length) {
            return new int[0]; // Base case: reached the end of the array
        }

        int currentSalary = salaries[index];
        double taxAmount = currentSalary * taxRate;
        int updatedSalary = (int) (currentSalary + taxAmount);

        int[] remainingSalaries = addTax(salaries, taxRate, index + 1);
        int[] updatedSalaries = new int[remainingSalaries.length + 1];
        updatedSalaries[0] = updatedSalary;
        
        for (int i = 0; i < remainingSalaries.length; i++) {
            updatedSalaries[i + 1] = remainingSalaries[i];
        }

        return updatedSalaries;
    }
	    
	    public static void main(String[] args) {
	        int[] salaries = {5000, 8000, 10000};
	        
	        int[] updatedSalaries = addTax(salaries, 0.1, 0);
	        
	        System.out.println(Arrays.toString(updatedSalaries));
	    }
}

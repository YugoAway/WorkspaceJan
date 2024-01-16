import javax.swing.JOptionPane;

public class guess {

	public static void main(String[] args) {
		 String input = JOptionPane.showInputDialog("Think of a number between 1 and 10 and press OK when you're ready.");

	        int randomNumber = (int) (Math.random() * 10) + 1;

	        if (input != null && !input.isEmpty()) {
	            try {
	                int userGuess = Integer.parseInt(input);
	                if (userGuess >= 1 && userGuess <= 10) {
	                    if (userGuess == randomNumber) {
	                        JOptionPane.showMessageDialog(null, "Congratulations! Your guess is correct.");
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Sorry, your guess is incorrect. The correct number was: " + randomNumber);
	                    }
	                } else {
	                    JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10.");
	                }
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
	            }
	        }
	    }
	}
	            
	        
	    
	         
	
	

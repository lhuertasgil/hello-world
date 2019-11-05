public class testingSavingsAccount {

        public static void main (String[] args) {

            savingsAccount saver1 = new savingsAccount(2000);
            savingsAccount saver2 = new savingsAccount(3000);

            savingsAccount.modifyInterestRate(4);
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterests2();
            saver1.display();
            saver2.display();

            System.out.println("New Interest");

            savingsAccount.modifyInterestRate(5);
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterests2();
            saver1.display();
            saver2.display();

        } //end of main







} //end of class

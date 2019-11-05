public class savingsAccount {

        private static float annualInterestRate;
        private double savingsBalance;


       private savingsAccount() {

                savingsBalance = 0;
                annualInterestRate = 0;

        }

        savingsAccount(double balance) {

           savingsBalance = balance;
           annualInterestRate = 0;

        }

        static void modifyInterestRate(double newInterest) {

                annualInterestRate = (float) newInterest;

        }

        public void calculateMonthlyInterest() {

           System.out.println("Current balance Saver 1: %.2f " + savingsBalance);
           double monthlyInterest;
           monthlyInterest = (double) (savingsBalance * annualInterestRate / 12);
           savingsBalance = monthlyInterest;
           System.out.println("New balance Saver 1: %.2f " + savingsBalance);

        }

    public void calculateMonthlyInterests2() {

        System.out.println("Current balance Saver 2: %.2f " + savingsBalance);
        double monthlyInterest;
        monthlyInterest = (double) (savingsBalance * annualInterestRate / 12);
        savingsBalance = monthlyInterest;
        System.out.println("New balance Saver 2: %.2f " + savingsBalance);

    }

        public float display() {
              return (float) savingsBalance;
        }



} //end of class

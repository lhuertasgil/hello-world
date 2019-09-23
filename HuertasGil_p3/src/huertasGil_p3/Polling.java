package huertasGil_p3;
import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
 
        String[] topics = {"Health", "Self Care", "Freedom", "Financial", "Social"};
        String highestPointIssue="" , lowestPointIssue="" ;
        int [][] ratings = new int [topics.length][];
        int avgRating[] = new int[topics.length];
        int i;
        int j;
        int people;
        int rating;
        int highestPointTotal = 0 , lowestPointTotal= 0;

        for( i = 0; i < ratings.length; i++) {
               ratings[i] = new int[10];
               for( j=0;j<ratings[i].length;j++)
                      ratings[i][j] = 0;
        }
       
        System.out.print("Enter the number of people rating: ");
        people = scnr.nextInt();
       

        for( i = 0; i < people; i++) {
               System.out.println("Rate the topics below");
               
               for( j = 0; j < topics.length; j++) {
                      System.out.print(topics[j]);
                      rating = scnr.nextInt();
                     
                      ratings[j][rating-1]++;
               }
        }
       

        for( i = 0; i<ratings.length; i++) {
               avgRating[i] = 0;
               
               for( j = 0; j<ratings[i].length; j++)
                      avgRating[i] += (ratings[i][j]*(j+1));
              
               if(i == 0) {
                      highestPointTotal = avgRating[i];
                      lowestPointTotal= avgRating[i];
                      highestPointIssue = topics[i];
                      lowestPointIssue = topics[i];
               }
               else {
                      if(avgRating[i] > highestPointTotal) {
                            highestPointIssue = topics[i];
                            highestPointTotal = avgRating[i];
                      }
                     
                      if(avgRating[i] < lowestPointTotal) {
                            lowestPointIssue = topics[i];
                            lowestPointTotal= avgRating[i];
                      }
               }
              
               avgRating[i] = avgRating[i]/people;
        }

        System.out.print("          ");
        for(i=0;i<10;i++) {
        System.out.print("         "+ (i+1));
        }
        System.out.printf("  Average");
        System.out.println();
        
        
        for( i = 0; i<ratings.length; i++) {
               System.out.printf("%-10s",topics[i]);
               for( j = 0; j<ratings[i].length; j++)
                      System.out.print("         " + ratings[i][j]);
               System.out.println("      " + avgRating[i]);
        }
        
        System.out.println("Highest: "+ highestPointIssue + " " + highestPointTotal);
        System.out.println("Lowest: " + lowestPointIssue + " " +  lowestPointTotal);
		
		scnr.close();
		
	}

}

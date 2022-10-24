import java.util.Scanner;
public class BattingAverage {
    public static void main(String[] args) {

        int Matches, runs, innings,notout;
        float avg;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of matches played: ");
        Matches = inp.nextInt();

        while(true){
            System.out.println("Enter the number of innings batted: ");
            innings = inp.nextInt();
            if(innings <= Matches)
                break;
            System.out.println("Enter the number of Innings correctly i.e., <=Matches.");
        }

        while(true){
            System.out.println("Enter the number of times player remained notout: ");
            notout = inp.nextInt();
            if(notout <= innings)
                break;
            System.out.println("Enter the number of times player was notout, correctly i.e., <= innings.");
        }

        System.out.println("Enter runs scored:");
        runs = inp.nextInt();

        if(innings == notout)
            avg = runs;
        else
            avg = runs/(innings-notout);
        System.out.println("Batting Average = " + avg);
    }
}
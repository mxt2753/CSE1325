/*
Name: Mary-Rose tRacy 
P12
Credit to rof rice for the baseline
*/
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
public class ThreadsOfSudoku 
{
    public static void main(String[] args) 
    {
        try 
        {
            if(args.length<2) 
            {
                System.err.println("usage: java ThreadsOfSudoku threads puzzleFilename [puzzleName]");
                System.exit(-1);
            }
            Scanner in = new Scanner(new File(args[1]));
            String name = (args.length > 1) ? args[2] : null;
            Sudoku sud = new Sudoku(in, name);
            System.out.println(sud + "\n\n");
            
            int numThreads = Integer.parseInt(args[0]);
            
            // Split the search field into 81 different sub-puzzles
            int index = 0;
            for(int y=1; y<=9; ++y) {
                for(int x=1; x<=9; ++x) {
                    suds[index++] = new Sudoku(sud, new int[]{x, y});
                }
            }
            //START HEREVVVVV
            ArrayList<Thread> threads=new ArrayList<>();
            int PThread = 81 / numThreads;
            //we to get the NThreads and begin them
            int i;
            for (i=0;i<numThreads;++i)
             {
                //then i'm gonna copy solve suds ints then use them
                //we can make them static or maybe final either way still works. 
                final int first=i*PThread;
                final int last=(i==numThreads-1)?80:(first+PThread-1);
                final int id=i+1;
                Thread Thr=new Thread(()->solveSuds(first,last,id));
                threads.add(Thr);
                Thr.start();
            }
            for(Thread Thr:threads) 
            {
                Thr.join();
            }
            System.out.println("Found "+solutions.size()+" solutions");
            for(var s:solutions)System.out.println(s);
        }
        catch(Exception e)
        {
            e.printStackTrace(System.err);
            System.exit(-1);
        }
    }
    private static synchronized void addToSolutions(Sudoku Sol) 
    {
        solutions.add(Sol);
    }
    //STOPPPVVV
    private static void solveSuds(int first, int last, int id) {
        System.out.println("Thread " + id + " will solve " + first + " to " + last);
        for(int i=first; i<=last; ++i) {
            System.out.println("Thread " + id + " solving " + i);// + "\n\n" + suds[i]);
            if(suds[i].solve()) addToSolutions(suds[i]);
        }
    }
    private static Sudoku[] suds = new Sudoku[81];
    private static HashSet<Sudoku> solutions = new HashSet<>();
}

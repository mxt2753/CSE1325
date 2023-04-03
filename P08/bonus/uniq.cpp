//From previous problems my includes
#include <iostream>
#include <string>
/*
#include <algorithm>
#include <vector>
don't think i need these ones
*/
int main(int ArgCount, char *ArgVector[]) //we need to reference ArgCount and ArgVector that is dereferenced. kept on getting errors on that one
{
    //now let's check to see if the user does a.out w/out any letters. if not then say error
    if (ArgCount<2) 
    {
        std::cout << "User didn't run with a sentence...exiting with error" << std::endl;
        return 1;
    }
    /*if (ArgCount< 2) 
    {
        std::cerr << "error " << ArgVector[0] << "has ooccured" << std::endl;
        return 1;
    }
    */
    //we need to store the string in a vector for a string
    std::string PastArgument=ArgVector[1];
    //we need to print out the first thing
    std::cout<<PastArgument;
    //now let's check for the arguments with a while loop
    int i;
    for(i=2;i<ArgCount;++i) 
    {
        //store present arugment in a string/vect
        std::string PresentArgument=ArgVector[i];
        //print out space before each thing you spit out
        if(PresentArgument!=PastArgument) 
        {
            std::cout<< " " <<PresentArgument;
            //and that's if the past word = the present word
            PastArgument= PresentArgument;
        }
    }
    //at the end \n it
    std::cout<<std::endl;
    //return and exit
    return 0;
}
/*                                           ~~~I'm gonna copy and paste these outputs, just to make it easier~~~
// 2=this 4=is 1=a 2=duplicate 
Problem 1:
INPUT: ./a.out this this is is is is a duplicate duplicate
OUTPUT: This is a duplicate
Problem 2: 
WRONG VVVVV
2=rah 1=bish 1=bam 1=bah 2=flibbit 1= floo 1=rah bish= 1 1= bam 1=bah 1=flibbit 1=floo
./a.out rah rah bish bam bah flibbit flibbit floo rah bish bam bah flibbit floo
WRONG^^^^
ACTUALLY IT'S THIS:
INPUT: ./a.out rah rah bish bam bah flibbit flibbit floo 
OUTPUT: rah bish bam bah flibbit floo
*/ 



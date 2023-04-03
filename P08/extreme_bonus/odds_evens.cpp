//let's include all of the includes we need to get
#include <iostream>
#include <vector>
#include <iterator>
#include <sstream>
//instead of copiling it with different sections. we are going to do it all in the main
int main() 
{
    std::string StngLine;
    //let's deal with the int
    std::vector<int> TheNums;//make the IntNums of the user a vector.
    int IntNum;
    // Read input of user
    while(std::getline(std::cin,StngLine))
    {
        std::istringstream ISS(StngLine); //isstringstream command to collect all what is being said to the computer
        while(ISS>>IntNum)
        {
           TheNums.push_back(IntNum);
        }
    }
    //printing the number of Elements
    std::cout<<"Number of Elements: "<<TheNums.size()<<std::endl; //all of it
    // Print the elementts:
    std::cout<<"Elements: ";
    for(const auto&NumOfE :TheNums) //number of Elements
    {
        std::cout<<NumOfE<<' ';
    }
    std::cout<<std::endl;
    // Print elements that are even
    std::cout << "Even indices: ";
    for(size_t i=0;i<TheNums.size();i+=2) //int the num size has to +=2
    {
        std::cout <<TheNums[i] << ' '; //print with spaces
    }
    std::cout<<std::endl;
    // Print the elements that are odd
    std::cout << "Odd indices: ";
    for (size_t i=1;i<TheNums.size();i+=2) 
    {
        std::cout<<TheNums[i]<<' '; //print with spaces
    }
    std::cout<<std::endl;
    return 0;
}

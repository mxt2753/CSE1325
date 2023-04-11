#include "vending_machine.h"
//Name: Mary-Rose Tracy
//ID#:1001852753
//Vending_Machine.cpp
/* Vending_machine:
-items : Item[] <<vector>>
+add(name : std::string, price : int)
+buy(index : int)
+menu() : std::string
 
*/ 
void vending_machine::add(const std::string&name,int price) //no capital??? for V ||add= get the item
{
    items.emplace_back(name, price);
    //emplace_back inserts new element at end of Vect
}
void vending_machine::buy(int index) ////+buy(index : int)
{
    if (index>=0&&index<items.size())
    {
        std::cout<<"\n#### Buying "<<items[index].to_string()<<std::endl;
        //if(IDX>=0&&IOIDX < Tostring.size()) {
        //std::cout << "#### buying " << inventory[IOIDX].tostring() << std::endl;
    }
}
std::string vending_machine::menu()const //+menu() : std::string
{
    std::string EndOfTot;
    for(size_t i=0;i<items.size();++i)
    {
        EndOfTot+=std::to_string(i)+") "+items[i].to_string()+"\n";
    }
    return EndOfTot;
}
////


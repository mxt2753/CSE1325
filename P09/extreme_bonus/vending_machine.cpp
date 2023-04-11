#include "vending_machine.h"
//Name: Mary-Rose Tracy
//ID#:1001852753
//Vending_Machine.cpp
/*
vending_machine:
-items : Item[] <<vector>>
+Vending_machine()
+Vending_machine(is : std::istream&)
+add(name : std::string, price : int)
+buy(index : int)
+menu() : std::string

*/ 
vending_machine::vending_machine()
{
    //we don't put anything in here
}

vending_machine::vending_machine(std::istream& is)
{
    Item item;
    while(is>>item)
    {
        items.push_back(item);
    }
}
void vending_machine::add(const std::string& name, int price)
{
    items.push_back(Item{name,price});
}
void vending_machine::buy(int index)
{
    std::cout<<"#### Buying "<<items[index]<<std::endl<<std::endl;
}
std::ostream& operator<<(std::ostream& OStringStr,const vending_machine& VendMachinePrint)
{
    for(size_t i=0;i<VendMachinePrint.items.size();++i)
    {
        OStringStr<<i<<") "<<VendMachinePrint.items[i]<<std::endl;
    }
    return OStringStr;
}

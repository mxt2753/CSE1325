//Name: Mary-Rose Tracy
//ID#:1001852753
//vend.cpp

#include "vending_machine.h"
#include <iostream>
//Vend:
//+main() : int

int main()
{
    vending_machine VendMachinePrint;

    VendMachinePrint.add("Peanut butter crackers",169);
    VendMachinePrint.add("Oreos",189);
    VendMachinePrint.add("Cookies",195);//let's add cookies. eventhough it doesn't say to we are going to just to make it different compared to full_credit
    
    std::cout<<"======================\n";
    std::cout<<"Welcome to UTA Vending\n";
    std::cout<<"======================\n";
    std::cout<<VendMachinePrint;
    VendMachinePrint.buy(1); //still picks oreos
    return 0;
}

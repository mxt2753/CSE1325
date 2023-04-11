//Name: Mary-Rose Tracy
//ID#:1001852753
//vend.cpp
#include "vending_machine.h"
#include <iostream>
#include <fstream>
//Vend:
//+main() : int

int main()
{
    std::ifstream products_file
    {
        "products.txt"
    };
    vending_machine VendMachinePrint
    {
        products_file
    };
    while(true)
    {
        std::cout<<"======================\n";
        std::cout<<"Welcome to UTA Vending\n";
        std::cout<<"======================\n";
        std::cout<<VendMachinePrint;
        int index;
        std::cout<<"\nProduct? ";
        std::cin>>index;
        if(index<0)
        {
            break;
        }
        VendMachinePrint.buy(index);
    }
    return 0;
}

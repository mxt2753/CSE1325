#ifndef VENDING_MACHINE_H
#define VENDING_MACHINE_H
//Name: Mary-Rose Tracy
//ID#:1001852753
//Vending Machine.h
/*Vending_machine:
-items : Item[] <<vector>>
+add(name : std::string, price : int)
+buy(index : int)
+menu() : std::string

*/ 
#include "item.h"
#include <string>
#include <iostream>
#include <vector>

class vending_machine
{
    public: void add(std::string name,int price);//no & this time
    //public:void add(const std::string&name,int price);
            void buy(int index); // same as last time
            friend std::ostream& operator<<(std::ostream& OStringStr,const vending_machine& VendMachinePrint);
            //std::string menu()const;

    private: std::vector<Item>items;
    //private:std::vector<Item>items;
};
#endif



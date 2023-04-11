//Name: Mary-Rose Tracy
//ID#:1001852753
//Vending Machine.h
/* vending_machine:
-items : Item[] <<vector>>
+Vending_machine()
+Vending_machine(is : std::istream&)
+add(name : std::string, price : int)
+buy(index : int)
+menu() : std::string

*/ 
#pragma once
//pragma is preporcessor direct, and makes it include once. kept on getting errors without it
#include "item.h"
//#include <string> nope don't need it 
#include <iostream>
#include <vector>

class vending_machine
{
    public: vending_machine();
            vending_machine(std::istream& is);
            void add(const std::string& name, int price);
            void buy(int index);
            //public: void add(std::string name,int price);//no & this time
            //public:void add(const std::string&name,int price);
            //void buy(int index); // same as last time
            //friend std::ostream& operator<<(std::ostream& OStringStr,const vending_machine& VendMachinePrint);
            friend std::ostream& operator<<(std::ostream& OStringStr,const vending_machine& VendMachinePrint);
  private:std::vector<Item>items;
  //private: std::vector<Item>items;
  //private:std::vector<Item>items;
};


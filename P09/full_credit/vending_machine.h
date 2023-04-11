#ifndef VENDING_MACHINE_H
#define VENDING_MACHINE_H
//Name: Mary-Rose Tracy
//ID#:1001852753
//Vending Machine.h
/* Vending_machine:
-items : Item[] <<vector>>
+add(name : std::string, price : int)
+buy(index : int)
+menu() : std::string
 
*/ 
#include "item.h"
#include <string> //DEF NEED 
#include <iostream> //NOT SURE IF I NEED
#include <vector> //DEF NEED
class vending_machine //not with Capital V?
{
    public:void add(const std::string&name,int price);
    //void insert the item(const std::string&name, int cost);
        void buy(int index);
        //void purchase(int item_index);
        std::string menu()const;
        //menu to display items
    private:std::vector<Item>items;
    //uncpatital items = inventory
};
#endif



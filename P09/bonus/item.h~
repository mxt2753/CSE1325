#include <iostream>
#include <string>
//Name: Mary-Rose Tracy
//ID#:1001852753
//Vending item.h
#ifndef ITEM_H
#define ITEM_H
/* Item:
-_name : std::string
-_price : int
+Item()
+Item(name : std::string, price : int)
+operator<<(os : std::ostream&, item : Item& <<const>> ) : std::ostream&<<friend>>
+operator>>(is : std::istream&, item : Item&) : std::istream& <<friend>>

*/ 
class Item
{
    public:Item();
        Item(std::string name, int price);
        //Friend operator but what it does it that can allow for public, protects and private. kinda like overide, 
        friend std::ostream& operator<<(std::ostream& os,const Item&item);
        friend std::istream& operator>>(std::istream& is,Item& item);
    private:std::string _name;
            int _price;
};

#endif
////////////////////////// Another Try 
/*
class Item
{
    public:Item(std::string name, int price); 
            std::string item to_string() const;
private: std::string _item_name;
         int price; }; 
*/ 

#include <string>
#include <iostream>
//Name: Mary-Rose Tracy
//ID#:1001852753
//Vending item.h
#pragma once
/* Item:
-_name : std::string
-_price : int
+Item()
+Item(name : std::string, price : int)
+operator<<(os : std::ostream&, item : Item& <<const>> ) : std::ostream&<<friend>>
+operator>>(is : std::istream&, Item : Item&) : std::istream& <<friend>>

*/ 
class Item
{
  public: Item();
          Item(const std::string& name,int price); //only had to change this practically separate it from private
          //Friend operator but what it does it that can allow for public, protects and private. kinda like overide, 
          //nah im gonna do OStringStr
          friend std::ostream& operator<<(std::ostream& OStringStr,const Item& item);
          friend std::istream& operator>>(std::istream& is,Item& item);
  private: std::string _name;// kept on getting errors till I figured out it's this
           int _price;
};
////////////////////////// Another Try 
/*
class Item
{
    public:Item(std::string name, int price); 
            std::string item to_string() const;
private: std::string _item_name;
         int price; }; 
*/ 


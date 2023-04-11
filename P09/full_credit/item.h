//Name: Mary-Rose Tracy
//ID#:1001852753
//Vending item.h
#include <string>
#ifndef ITEM_H
#define ITEM_H
/* Item:
-_name : std::string
-_price : int
+Item(name : std::string, price : int)
+to_string() : std::string
*/ 
class Item
{ 
    public:Item(const std::string& name,int price);
            std::string to_string()const;
    private: std::string _name;
             int _price; };
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

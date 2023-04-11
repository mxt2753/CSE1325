#include "item.h"
//Name: Mary-Rose Tracy
//ID#:1001852753
// item.cpp
#include <iomanip>
#include <sstream>
#include <stdexcept>
/*
Item:
-_name : std::string
-_price : int
+Item(name : std::string, price : int)
+to_string() : std::string
*/
//         -_name : std::string    +Item(int price) 
Item::Item(const std::string&name,int price): _name{name},_price{price} //we need _price & price the same with name
//Item::Item(std::string name, int cost) : _item_name{name}, _item_cost{cost} { gonnd do price
{
    //The Warning of the Code or if somethign is wrong
    if(price<0)
    {
        throw std::runtime_error("Price is not possibly negative...exiting\n");
    }
}
//+to_string():std::string
std::string Item::to_string()const //has to be a cons because if not it wont work.
{
    std::ostringstream OStringStr;
    OStringStr<< _name<<" ($"<<std::fixed<<std::setprecision(2)<< _price/100.0<<")";
    return OStringStr.str();
}

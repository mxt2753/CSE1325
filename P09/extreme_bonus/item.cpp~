#include "item.h"
//Name: Mary-Rose Tracy
//ID#:1001852753
//item.cpp
//#include <iomanip>
//#include <sstream>
//#include <stdexcept>
/*Item:
-_name : std::string
-_price : int
+Item()
+Item(name : std::string, price : int)
+operator<<(os : std::ostream&, item : Item& <<const>> ) : std::ostream&<<friend>>
+operator>>(is : std::istream&, Item : Item&) : std::istream& <<friend>> */ 
Item::Item() : _name{""}, _price{0}
{
    //We don't put anything in here 
}
Item::Item(const std::string& name,int price):_name{name},_price{price}
{
    if(price<0)
    {
        throw std::runtime_error("Price is not possibly negative...exiting\n");
    }
}

std::ostream& operator<<(std::ostream& OStringStr,const Item& item) //kind of the same with OS Stream
{
    OStringStr<<item._name<<" ($"<<item._price/100.0<<")";
    return OStringStr;
}
std::istream& operator>>(std::istream& is,Item& item) //kind of the same with istream
{
    std::getline(is,item._name);
    is>>item._price;
    is.ignore();
    return is;
}

#include <iostream>
#include <string> //not .h
//using namespace std; 
int main() 
{
    //char str[100];
    std::string name;
    std:: cout << "What's your name? ";
    std::getline(std::cin, name);
    std:: cout << "Hello, " <<name<< "!\n";
    /*
    cout<<"Enter Your Name: ";
    cin>>str;
    cout<<"\\n Hello, "<<str "!";
    cout<<endl;
    */
    return 0; 
    //std::cout << "Hello, Mary-Rose Tracy!" << std::endl;
}

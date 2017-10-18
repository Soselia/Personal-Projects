/*
Izzy Brooks
Rewards Brooks.cpp
this program calculates a discount total based on a tiered rewards program and sales amount
*/

#include <iostream>
using namespace std;
//i decided to use a bunch of static variables because i wanted to break these down into sections.
//whilke i could have placed tsome of them in certain methods it was neater to place them all here
// saves the reward level
static char re;
//discount from the level
static double disc;
//the amount of money they spent before discounts
static double sales;
//the amount of money spent with discounts
static double total;
// the amount of money the discount saved them
static double disct;
int intro()
{
// this method simply asks their reward level then how much they spent
 cout << "what is your current reward level?\n";
 cout << "gold = g silver = s bronze = b\n";
 cin >>   re  ;
 if (re != 'g'&&re != 's'&& re != 'b')
 {
  cout << " the valid in puts are\n ";
  cout << "gold = g silver = s bronze = b\n";  
  cin >> re;
 }
 cout << "what is the sales total?\n";
 cin >> sales;
 if (sales<0)
 {
 cout << "the amount must be greater than zero";
 cin  >> sales;         
 }
}
int calc()
{
    // i use a switch here to set the discount amount based on the input of the user
  switch (re)
  {
  //after researching a conditional statement this seemed like the optimal place to use one 
   case 'b': disc = (sales>200.00) ? 4.00 : 5.75;  break;
   case 's':  disc = (sales>200.00) ? 8.00 : 10.25;  break;
   case 'g':  disc = (sales>200.00) ? 12.00 : 15.5;  break;    
  }

  // this runs some basic math to get the savings amount then runs that through to get the total
  disct = (disc*sales)/100;
  if (disct>= 30.00)
  {
  disct = 30.00;
  }
   total = sales - disct;
}
int output()
{
 //this simply outputs the discount and total in a neat manner
 cout << "thank you for shopping with Izzymart\n";
 cout << "your discount total is ";
 cout << disct;
 cout << "\nmaking your total spent ";
 cout << total;
}
int main()
{
    // the main just plays all of the methods 
     intro();
     calc();
     output();
    cout<< "\n";
system("PAUSE");
// sorry if i missed something
}

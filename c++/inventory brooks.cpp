/*
izzy brooks 
inventory brooks
this program asks how many of an item were sent then how many were sold then gives stats based off of this

*/
#include <iostream>
#include <iomanip>
using namespace std;
/*
the total variable is for how much stock is still remaining
s total is the total sold 
sh total is for the total shipped
half stock is for keeping track of how many stores have sold half or more
sold out is for keeping track of how many stores sold out of product
*/
static int total = 0;
static int stotal;
static int shtotal;
static int halfstock = 0;
static int soldout = 0;
int firstinput()
{
    /*
    r is just a generic counter for the for loop
    shipped is the temp for getting the amount shipped to a store
    sold is the input variable for number of sold
    temp total is only for seeing if the store is half or fully out
    */
    int r;
    int shipped = 0;
    int sold;
    int temptotal;
  for (r=1 ; r < 13;r++) 
// if the store number is 5 it skips it
  if(r != 5)
  {
       // this is pretty self explanatory just getting user input
cout << " how many was sent to store " << r <<"\n";
cin >> shipped;
cout << " how many were sold in store " << r <<"\n";
cin >> sold;
// for telling if a bad input was given
while (sold < 0 || sold > shipped)
        {
cout << " please input a valid amount sold \n";
cin >> sold;
        }
        // this is for incereasing the totals for later calculations
        stotal += sold;
        shtotal += shipped;
        total += shipped - sold;
        temptotal = shipped - sold;
        // for telling if something is half or full out
       if (temptotal <= (shipped/2) && temptotal > 0)
       {
        halfstock++;
       }
       if (temptotal <= 0)
       {
            soldout++;
       }
   }       
}
int stats()
{ 
    // just the variables for average and percent
    double average = 0.0;
    double percent;
    double stemp = stotal;
    double shtemp = shtotal;
     average = stemp/11.0;
 percent = stemp/shtemp;
 percent *= 100;
    /*
    name of company
    all the stats needed
    */
cout << "izzys computer company\n";
cout << "the total number of computers sent to stores was " << shtotal << "\n";
cout << "the total sold was " << stotal << "\n";
cout << "the remaining total is " << total << endl;
cout << "the number of sold out stores is " << soldout << endl;
cout << "the number of stores who sold more then half " << halfstock << endl;
/*
this one is a bit weird
if the average or percent is below 10 it only prints to 3 to keep it at
like 3.09 so there isnt too many decimals
if its above it prints like 10.02
so there is the correnct amount
*/
if (average <10.0)
{
  cout << "the average sold is " <<setprecision(3)<<average<<endl;
}
else
{
 cout << "the average sold is " <<setprecision(4)<<average<<endl;    
}
if (percent <10.0)
{
  cout << "the percent sold is " <<setprecision(3)<<percent<<endl;
}
else
{
 cout << "the percent sold is " <<setprecision(4)<<percent<<endl;  
}

 if (percent > 50)
 {
 cout << " the sales are good we should continue this product";            
 }
 else
 {
 cout << "the sales arent doing so hot lets stop carrying this item for now ";  
 }
}
int main()
{
    // just running the two methods
    firstinput();
    stats();
cout<< "\n";
system("PAUSE");
}

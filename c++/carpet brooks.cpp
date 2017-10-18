/* Izzy brooks
*carpet.cpp
*this program calculates the cost of carpeting for a room
*/
#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
    // this is the string for the name of the room
    string room;
    // sarea and syards are the square area and yards variables
    int length,width,padding,sarea,syards;
   // costc costl are cost of carpeting and cost of labor
    double price,total,costc,costl,sub,taxt;
    // labor was set in the guidlines so it is fixed
    double labor = 6.03;
   //tax was also set in the guidlines
    double tax = 5.7;
    //this section of code simply defines the variables
    cout << "enter the name of the room to be carpeted ";   
    cin >> room;
    cout << "enter the length of the room in feet ";
    cin >> length;
    cout << "enter the width of the room in feet ";
    cin >> width;
    cout << "enter the price of the carpet per yard ";
    cin >> price;
    cout << "enter the padding cost ";
    cin >> padding;
    //this section does simple math so the next section has the right numbers
    sarea = length*width;
    syards = (sarea/9)+1;
    costc = price * syards;
    costl = labor *syards;
    sub = costc + costl + padding;
    // the tax total is done by  multiplying and dividing by 100 since that is the easiest not by hand method
    taxt = (sub *tax)/100;
    total = taxt +sub;
    // this section prints out the information with the \n for spacing to make it neat
    cout << "total square feet is ";
    cout << sarea;
    cout << "\ntotal square yards is ";
    cout << syards;
    cout << "\ntotal cost of the carpet needed ";
    cout << costc;
    cout << "\ntotal cost of labor ";
    cout << costl;
    cout << "\npadding cost ";
    cout << padding;
    cout << "\nsubtotal ";
    cout << sub ;
    cout << "\ntax ";
    // set precision simply sets how many numbers are allowed to display from the int or double
    cout << setprecision(3) << taxt << endl;
    cout << "\ntotal " ;
    cout << setprecision(5) << total << endl;
    cout<< "\n";
    system("PAUSE");
    
}

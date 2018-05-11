using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animals
{
    public class Human : Animal
    {
        public string Greet()
        {
            return "Hello, I am Human!";
        }

        public bool HasFourLegs()
        {
            return false;
        }

        public string WhoAmI()
        {
            return "Human";
        }
    }
}

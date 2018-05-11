using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animals
{
    public class Dog : Animal
    {
        public string Greet()
        {
            return "Meow";
        }

        public bool HasFourLegs()
        {
            return false;
        }

        public string WhoAmI()
        {
            return "Dog!";
        }
    }
}

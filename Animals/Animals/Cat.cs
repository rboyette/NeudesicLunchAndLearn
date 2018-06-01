using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animals
{
    public class Cat : Animal
    {
       
        public string Greet()
        {
            return "Meow";
        }

        public bool HasFourLegs()
        {
            return true;
        }

        public string WhoAmI()
        {
            return "I am a cat";
        }
    }
}

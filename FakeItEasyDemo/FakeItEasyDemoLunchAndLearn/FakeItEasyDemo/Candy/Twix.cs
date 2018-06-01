using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FakeItEasyDemo.Candy
{
    public class Twix : ICandy
    {
        public bool DoesMelt()
        {
            return true;
        }

        public bool IsChewable()
        {
            return true;
        }

        public bool IsHardCandy()
        {
            return false;
        }

        public string Name()
        {
            return "Twix";
        }
    }
}

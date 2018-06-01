using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FakeItEasyDemo.Candy
{
    public class Lollipop : ICandy
    {
        public bool DoesMelt()
        {
            return false;
        }

        public bool IsChewable()
        {
            return false;
        }

        public bool IsHardCandy()
        {
            return true;
        }

        public string Name()
        {
            return "Lollipop";
        }
    }
}

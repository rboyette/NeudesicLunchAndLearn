using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FakeItEasyDemo.Candy
{
    public class HotTomales : ICandy
    {
        public bool DoesMelt()
        {
            return false;
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
            return "Hot Tomales";
        }
    }
}

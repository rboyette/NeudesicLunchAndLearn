using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FakeItEasyDemo
{
    public class CandyShop : ICandyShop
    {
        private List<ICandy> candies;

        public CandyShop()
        {
            candies = new List<ICandy>();
        }

        public void AddItem(ICandy candy)
        {
            candies.Add(candy);
        }

        public void DeleteItem(ICandy candy)
        {
            if (HasItem(candy.Name()))
            {
                candies.Remove(candy);
            }

        }

        public ICandy GetBestSellingCandy()
        {
            return candies.Where(x => x.Name() == "Lollipop").First();
        }

        public bool HasItem(string item)
        {
            return candies.Exists(x => x.Name() == item);
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FakeItEasyDemo
{
    public interface ICandyShop
    {
        ICandy GetBestSellingCandy();
        bool HasItem(string item);
        void AddItem(ICandy candy);
        void DeleteItem(ICandy candy);

    }
}

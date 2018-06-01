using FakeItEasy;
using FakeItEasyDemo;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FakeItEasyDemoLunchAndLearn.Tests
{
    [TestFixture]
    public class CandyTest
    {
        [Test]
        public void TestFakeItEasyReturnBestSellingCandyShouldBeTwix()
        {
            var shop = A.Fake<ICandyShop>();
            var twix = A.Fake<ICandy>();

            A.CallTo(() => twix.Name()).Returns("Twix");

            A.CallTo(() => shop.GetBestSellingCandy()).Returns(twix);

            var actual = shop.GetBestSellingCandy();

            Assert.AreEqual(twix.Name(), actual.Name());
        }


        [Test]
        public void TestFakeItEasyReturnBestSellingCandyShouldBeHotTomales()
        {
            var shop = A.Fake<ICandyShop>();
            var hotTomales = A.Fake<ICandy>();

            A.CallTo(() => hotTomales.Name()).Returns("Hot Tomales");

            A.CallTo(() => shop.GetBestSellingCandy()).Returns(hotTomales);

            var actual = shop.GetBestSellingCandy();

            Assert.AreEqual(hotTomales.Name(), actual.Name());
        }

        [Test]
        public void TestShopHasCandyThatIWantShouldReturnFalse()
        {
            var shop = A.Fake<ICandyShop>();
            var hotTomales = A.Fake<ICandy>();

            A.CallTo(() => hotTomales.Name()).Returns("Hot Tomales");

            A.CallTo(() => shop.HasItem(hotTomales.Name())).Returns(false);

            var actual = shop.HasItem(hotTomales.Name());

            Assert.IsFalse(actual);
        }
    }
}

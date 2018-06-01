using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Animals;

namespace Animals.Test
{
    [TestFixture] 
    public class AnimalTest
    {
        [Test]
        public void TestCatGreeting()
        {
            //arrange
            var expected = "Meow";
            var cat = new Cat();
            //act

            var actual = cat.Greet();

            //assert

            Assert.AreEqual(expected, actual);
        }

        [Test]
        public void TestCatHasFourLegs()
        {
            var expected = true;
            var cat = new Cat();

            
            var actual = cat.HasFourLegs();

            Assert.AreEqual(expected, actual);
            //OR
            Assert.IsTrue(actual);
        }

        [Test]
        public void TestCatWhoAmI()
        {
            var expected = "I am a cat";
            var cat = new Cat();

            var actual = cat.WhoAmI();

            Assert.AreEqual(expected, actual);
        }


        [Test]
        public void TestDogGreeting()
        {

        }

        [Test]
        public void TestDogHasFourLegs()
        {

        }

        [Test]
        public void TestDogWhoAmI()
        {

        }

        [Test]
        public void TestHumanGreeting()
        {

        }

        [Test]
        public void TestHumanHasFourLegs()
        {

        }

        [Test]
        public void TestHumanWhoAmI()
        {

        }
    }
}

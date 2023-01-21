# **sharedBirthdays:**  


The birthday problem is a question where most people's intuition is proved incorrect by mathematics. The problem is: Given a group of N people, how large must N be so that there is a 50% chance that at least 2 of the N people have the same birthday?

#### Write a method with two parameters, the number of people in a group and the number of days in the year. The method will generate random birthdays for the number of people and then determine how many pairs of people have the same birthday. You don't have to generate actual days of the year for the birthdays. You can simply use ints.

Here are two ways to generate random ints in Java. One uses an object of type Random and the other uses the random method from the Math class.

```
// fist approach 
Random r = new Random();
int max = 10;
int x = r.nextInt(max);
// x will now hold a value between 0 and 9 inclusive.
// The distribution of values in uniform.
```

```
1// second approach
int max = 10;
int x = (int) (Math.random() * max);
// x will now hold a value between 0 and 9 inclusive.
// The distribution of values in uniform.
```

If three people (Olivia, Kelly, Isabelle) share the same birthday, that is 3 pairs of people:

    pair 1: Olivia and Kelly
    pair 2: Olivia and Isabelle
    pair 3: Kelly and Isabelle

```
/* Perform an experiment simulating the birthday problem.
   Pick random birthdays for the given number of people.  
   Return the number of pairs of people that share the same birthday.
   pre: numPeople > 0, numDaysInYear > 0
   post: The number of pairs of people that share a birthday after randomly assigning birthdays.
*/
```
```
public static int sharedBirthdays(int numPeople, int numDaysInYear) {

}
```

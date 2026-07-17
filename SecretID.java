Problem:
Given an integer N, check whether it is a Magical Number.

Steps:
  -> Square the number.
  -> Split the squared number into two parts.
     -If the square has even digits → split equally.
     -If the square has odd digits → the right part gets one extra digit.
  -> Add the two parts.
  -> If the sum equals the original number, it is a Magical Number.

  i/p: 45
  
  process:
      45² = 2025
      20 | 25
      20 + 25 = 45

  o/p: It is a Magical Number


  square = n * n;
             ====================CODE====================
count = numOf(square);

rightDigits = (count + 1) / 2;

div = 1;

repeat rightDigits times
    div *= 10;

left = square / div;

right = square % div;

if(left + right == n)
    Magical
else
    Not Magical

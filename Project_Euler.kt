fun main(args : Array<String>) {
  var digits:ArrayList<Int> = ArrayList<Int>();

  var n:Int = 15;
  var k:Int = 3;
  var sum:Int = 0;

  // 일의 자리에 1이라는 값을 준다.
  // 최대 자릿수에서부터 곱하기 2를 하며 제곱수를 계산한다.
  // 해당 자릿수의 값이 10이 넘어가면(올림이 발생하면) 상위 자릿수의 계산 결과에 1을 더한다.
  // 해당 자릿수가 최상위 자릿수면 배열(리스트)에서 자릿수를 하나 늘린다.
  // 제곱 계산이 끝나면 배열의 자릿수를 더한다.
  digits.add(1);
  for(i in 1 .. k)
  {
    var maxDigitLength = digits.size - 1;
    var j = maxDigitLength;
    while(j > -1)
    {
      var v = digits[j] * n;
      if(v >= 10)
      {
        if(j == maxDigitLength)
        {
          digits.add((v / 10));
        }
        else
        {
          digits[j+1] += (v / 10);
        }

       digits[j] = v % 10;
      }
      else
      {
        digits[j] = v;
      }
      j--;
    }
  }

  for(i in 0 .. digits.size - 1)
  {
    sum += digits[i]; 
  }

  println("2^1000 Digit's summary is $sum");
}
package DSA;

public class Recursion {
  public static void main(String[] args) {

    int n = 5;
    printName("Mahesh", n);
    System.out.println();
    print(1,n);
    System.out.println();
    printRev(n);
    System.out.println();
    otherPrint(1, n);
    System.out.println();

    System.out.println("Sum: "+sum(n));
    System.out.println("Factorial: "+factorial(n));
  }

  public static int printName(String name, int n){ //functional

    if(n == 0)
    return 0;

    System.out.println(name);

    return printName(name, n-1);
  }

  public static int print(int i, int n){ //functional

    if(i > n)
    return n;

    System.out.println(i);

    return print(i+1, n);
  }

  public static int printRev(int n){ //functional
    if(n<1)
    return n;

    System.out.println(n);

    return  printRev(n-1);
  }

public static void otherPrint(int i, int n){//parametrized

  if(n<i){
    return ;
  }

  otherPrint(i+1, n);
  System.out.println(i);
}


public static int sum(int n){   //parametrized

  if(n == 0)
  return 0;
  
  return  n+sum(n-1);
}

public static int factorial(int n){   //parametrized

  if(n<1)
  return 1;

  return n*factorial(n-1);
}

}

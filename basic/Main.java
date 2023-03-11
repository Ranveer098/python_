}

class CurrentAccount extends Accounts {
  int draftLimit;

  public CurrentAccount(int balance, int accno, String name, String address) {
    super(balance, accno, name, address);
  }

  public void setDraftLimit(int dl) {
    this.draftLimit = dl;
  }

  public int getDraftLimit() {
    return draftLimit;
  }

public void display() {
System.out.println(this.accno+" "+this.name+" "+this.balance+"
"+this.address);
System.out.println(this.draftLimit);
}

  public void deposit(int amt) {
    int res1 = this.balance + amt;
    System.out.println(res1);
  }

  public void withdrawl(int amt) {
    int res2 = this.balance - amt;
    System.out.println(res2);
  }
}

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int accno = Integer.parseInt(sc.nextLine());
    int balance = Integer.parseInt(sc.nextLine());
    String name = sc.nextLine();
    String address = sc.nextLine();
    int type = Integer.parseInt(sc.nextLine());
    if (type == 1) {
      SavingsAccount s = new SavingsAccount(balance, accno, name, address);
      s.setRoi(Integer.parseInt(sc.nextLine()));
      s.display();
      s.calcamt(balance);
      int dw = Integer.parseInt(sc.nextLine());
      int amt = Integer.parseInt(sc.nextLine());
      if (dw == 1) {
        s.deposit(amt);
      }
      if (dw == 2) {
        s.withdrawl(amt);
      }
    }
    if (type == 2) {
      CurrentAccount c = new CurrentAccount(balance, accno, name, address);
      c.setDraftLimit(Integer.parseInt(sc.nextLine()));
      c.display();
      int dw1 = Integer.parseInt(sc.nextLine());
      int amt1 = Integer.parseInt(sc.nextLine());
      if (dw1 == 1) {
        c.deposit(amt1);
      }
      if (dw1 == 2) {
        c.withdrawl(amt1);
      }
    }
  }
}

import java.io.*;
import java.util.*;
import java.lang.Math;

abstract class maths {
abstract public void rectanglePerimeter();
abstract public void squarePerimeter();
abstract public void trianglePerimeter();
abstract public void trapezoidPerimeter();
abstract public void circlePerimeter();
}

class perimeter extends maths {
  public int length;
  public int breadth;
  public int side;
  public int t1;
  public int t2;
  public int t3;
  public int tr1;
  public int tr2;
  public int tr3;
  public int tr4;
  public int radius;
  public int[] peri = new int[5];

  public void rectanglePerimeter() {
    this.peri[0] = 2 * (length + breadth);
    System.out.println(this.peri[0]);
  }

  public void squarePerimeter() {
    this.peri[1] = 4 * side;
    System.out.println(this.peri[1]);
  }

  public void trianglePerimeter() {
    this.peri[2] = t1 + t2 + t3;
    System.out.println(this.peri[2]);
  }

  public void trapezoidPerimeter() {
    this.peri[3] = tr1 + tr2 + tr3 + tr4;
    System.out.println(this.peri[3]);
  }

  public void circlePerimeter() {
    this.peri[4] = (int) Math.PI * 2 * radius;
    System.out.println(this.peri[4]);
  }

  public void calculateSum() {
    int sum = 0, i;
    for (i = 0; i < 5; i++) {
      sum += this.peri[i];
    }
    System.out.println(sum);
  }

  public void sortPerimeter() {
    Arrays.sort(this.peri);
    for (int i = 0; i < 5; i++) {
      System.out.print(this.peri[i] + " ");
    }
  }
}

class Main {
  public static void main(String[] args) {
    perimeter p = new perimeter();
    Scanner sc = new Scanner(System.in);
    p.length = sc.nextInt();
    p.breadth = sc.nextInt();
    p.rectanglePerimeter();
    p.side = sc.nextInt();
    p.squarePerimeter();
    p.t1 = sc.nextInt();
    p.t2 = sc.nextInt();
    p.t3 = sc.nextInt();
    p.trianglePerimeter();
    p.tr1 = sc.nextInt();
    p.tr2 = sc.nextInt();
    p.tr3 = sc.nextInt();
    p.tr4 = sc.nextInt();
    p.trapezoidPerimeter();
    p.radius = sc.nextInt();
    p.circlePerimeter();
    p.calculateSum();
    p.sortPerimeter();
  }
}
import java.io.*;
import java.util.*;

abstract class ItemType {
public abstract double calculateAmount();
}

class wooden extends ItemType {
  private int noOfItems;
  private double cost;

  public int getNoOfItems() {
    return noOfItems;
  }

  public void setNoOfItems(int noOfItems) {
    this.noOfItems = noOfItems;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public wooden() {
    this.noOfItems = 0;
    this.cost = (double) 0;
  }

  public wooden(int noOfItems, double cost) {
    this.noOfItems = noOfItems;
    this.cost = cost;
  }

  public double calculateAmount() {
    return noOfItems * cost;
  }
}

class electronics extends ItemType {
  private String type;
  private double amount;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public electronics() {
    this.type = null;
    this.amount = (double) 0;
  }

  public electronics(String type, double amount) {
    this.type = type;
    this.amount = amount;
  }

  public double calculateAmount() {
    double result = 0;
    if (type.contains("Academics")) {
      result = amount - (0.05 * amount);
    } else if (type.contains("Commercial")) {
      result = amount;
    }
    return result;
  }
}

class Main {
  public static void main(String[] args) {
    int choice;
    Scanner sc = new Scanner(System.in);
    choice = Integer.parseInt(sc.nextLine());
    wooden w = new wooden();
    electronics e = new electronics();
    if (choice == 1) {
      w.setNoOfItems(Integer.parseInt(sc.nextLine()));
      w.setCost(Double.parseDouble(sc.nextLine()));
      double res = w.calculateAmount();
      System.out.println(res);
    }
    if (choice == 2) {
      e.setType(sc.nextLine());
      e.setAmount(Double.parseDouble(sc.nextLine()));
      double orgAmount = e.calculateAmount();
      System.out.println(orgAmount);
    }
  }
}
import java.lang.*;
import java.io.*;

abstract class Complex{
abstract float Real(float real1,float real2);
abstract float Imaginary(float imag1,float imag2);
abstract float Real1(float real1,float real2,float imag1,float imag2);
abstract float Imaginary1(float real1,float real2,float imag1,float imag2);
}

class Addition extends Complex {
  float Real(float real1, float real2) {
    return real1 + real2;
  }

  float Imaginary(float imag1, float imag2) {
    return imag1 + imag2;
  }

  float Imaginary1(float real1, float real2, float imag1, float imag2) {
    return 0;
  }

  float Real1(float real1, float real2, float imag1, float imag2) {
    return 0;
  }
}

class Subtraction extends Complex {
  float Real(float real1, float real2) {
    return real1 - real2;
  }

  float Imaginary(float imag1, float imag2) {
    return imag1 - imag2;
  }

  float Imaginary1(float real1, float real2, float imag1, float imag2) {
    return 0;
  }

  float Real1(float real1, float real2, float imag1, float imag2) {
    return 0;
  }
}

class Multiplication extends Complex {
  float Real1(float real1, float real2, float imag1, float imag2) {
    return ((real1 * real2) - (imag1 * imag2));
  }

  float Imaginary1(float real1, float real2, float imag1, float imag2) {
    return ((real1 * imag2) + (imag1 * real2));
  }

  float Imaginary(float imag1, float imag2) {
    return 0;
  }

  float Real(float real1, float real2) {
    return 0;
  }
}

class Division extends Complex {
  float Real1(float real1, float real2, float imag1, float imag2) {
    return (((real1 * real2) + (imag1 * imag2)) / ((real2 * real2) + (imag2 * imag2)));
  }

  float Imaginary1(float real1, float real2, float imag1, float imag2) {
    return (((imag1 * real2) - (real1 * imag2)) / ((real2 * real2) + (imag2 * imag2)));
  }

  float Imaginary(float imag1, float imag2) {
    return 0;
  }

  float Real(float real1, float real2) {
    return 0;
  }
}

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    float real1 = sc.nextFloat();
    float imag1 = sc.nextFloat();
    float real2 = sc.nextFloat();
    float imag2 = sc.nextFloat();
    Complex b;
    b = new Addition();
    System.out.printf("Addition:\n\t%.4f", b.Real(real1, real2));
    if (b.Imaginary(imag1, imag2) >= 0) {
      System.out.print(" +");
    } else {
      System.out.print(" ");
    }
    System.out.printf("%.4f i", b.Imaginary(imag1, imag2));
    b = new Subtraction();
    System.out.printf("\nSubtraction:\n\t%.4f", b.Real(real1, real2));
    if (b.Imaginary(imag1, imag2) >= 0) {
      System.out.print(" +");
    } else {
      System.out.print(" ");
    }
    System.out.printf("%.4f i", b.Imaginary(imag1, imag2));
    b = new Multiplication();
    System.out.printf("\nMultiplication:\n\t%.4f", b.Real1(real1, real2, imag1, imag2));
    if (b.Imaginary1(real1, real2, imag1, imag2) >= 0) {
      System.out.print(" +");
    } else {
      System.out.print(" ");
    }
    System.out.printf("%.4f i", b.Imaginary1(real1, real2, imag1, imag2));
    b = new Division();
    System.out.printf("\nDivision:\n\t%.4f", b.Real1(real1, real2, imag1, imag2));
    if (b.Imaginary1(real1, real2, imag1, imag2) >= 0) {
      System.out.print(" +");
    } else {
      System.out.print(" ");
    }
    System.out.printf("%.4f i", b.Imaginary1(real1, real2, imag1, imag2));
  }
}
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

abstract class Account{
String name;
int number;
int balance;
Date startDate;
public Account(String name, int number, int balance, Date startDate) {
this.name = name;
this.number = number;
this.balance = balance;
this.startDate = startDate;
}
abstract public double calculateInterest(Date dueDate);
}

class CurrentAccount extends Account {
  public CurrentAccount(String name, int number, int balance, Date startDate) {
    super(name, number, balance, startDate);
  }

  public double calculateInterest(Date dueDate) {
    double interest;
    interest = (balance * 5 * (monthsDifference(startDate,
        dueDate) / 12)) / 100;
    return interest;
  }

  public int monthsDifference(Date startDate, Date endDate) {
    Calendar c1 = new GregorianCalendar();
    c1.setTime(startDate);
    Calendar c2 = new GregorianCalendar();
    c2.setTime(endDate);
    int ans = (c2.get(c2.YEAR) - c1.get(c1.YEAR)) * 12;
    ans += c2.get(c2.MONTH) - c1.get(c1.MONTH);
    return ans;
  }
}

class SavingsAccount extends Account {
  public SavingsAccount(String name, int number, int balance, Date startDate) {
    super(name, number, balance, startDate);
  }

  public double calculateInterest(Date dueDate) {
    double interest;
    interest = (balance * 12 * (monthsDifference(startDate,
        dueDate) / 12)) / 100;
    return interest;
  }

  public int monthsDifference(Date startDate, Date endDate) {
    Calendar c1 = new GregorianCalendar();
    c1.setTime(startDate);
    Calendar c2 = new GregorianCalendar();
    c2.setTime(endDate);
    int ans = (c2.get(c2.YEAR) - c1.get(c1.YEAR)) * 12;
    ans += c2.get(c2.MONTH) - c1.get(c1.MONTH);
    return ans;
  }
}

class AccountsMain {
  public static void main(String args[]) throws ParseException {
    Scanner myObj = new Scanner(System.in);
    int type = Integer.parseInt(myObj.nextLine());
    String name = myObj.nextLine();
    int number = Integer.parseInt(myObj.nextLine());
    int balance = Integer.parseInt(myObj.nextLine());
    String dateString = myObj.nextLine();
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date startDate = formatter.parse(dateString);
    dateString = myObj.nextLine();
    Date dueDate = formatter.parse(dateString);
    if (type == 1) {
      SavingsAccount sObj = new SavingsAccount(name, number, balance,
          startDate);
      System.out.println(sObj.calculateInterest(dueDate));
    } else {
      CurrentAccount cObj = new CurrentAccount(name, number, balance,
          startDate);
      System.out.println(cObj.calculateInterest(dueDate));
    }
    myObj.close();
  }
}
import java.io.*;
import java.lang.Math.*;
import java.util.*;
import java.text.*;

abstract class Shape {
abstract void rectangleArea(int l,int b);
abstract void squareArea(int s);
abstract void circleArea(int r);
}

class Area extends Shape {
  public void rectangleArea(int l, int b) {
    System.out.println(l * b);
  }

  public void squareArea(int s) {
    System.out.println(s * s);
  }

  public void circleArea(int r) {
    DecimalFormat d = new DecimalFormat("0.00");
    double res = Math.PI * r * r;
    System.out.println(d.format(res));
  }
}

class Main {
  public static void main(String[] args) {
    int length, breadth, radius, side;
    Scanner sc = new Scanner(System.in);
    length = sc.nextInt();
    breadth = sc.nextInt();
    side = sc.nextInt();
    radius = sc.nextInt();
    Area a = new Area();
    a.rectangleArea(length, breadth);
    a.squareArea(side);
    a.circleArea(radius);
  }
}
import java.util.Scanner;

abstract class AbstractClass {
int val;
abstract int getValue();
abstract int divisorSum(int n);
}

class Calculator extends AbstractClass {
  public int getValue() {
    Scanner in = new Scanner(System.in);
    val = in.nextInt();
    in.close();
    return val;
  }

  public int divisorSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }
    return sum;
  }
}

class Solution {
  public static void main(String[] args) {
    Calculator calObj = new Calculator();
    int value = calObj.getValue();
    int a = calObj.divisorSum(value);
    System.out.println(a);
  }
}
import java.io.*;
import java.util.*;
import java.text.*;

abstract class marks {
  abstract public void getPercentage();
}

class A extends marks {
  DecimalFormat d = new DecimalFormat("0.00");
  public int marks1;
  public int marks2;
  public int marks3;

  A() {
    this.marks1 = 0;
    this.marks2 = 0;
    this.marks3 = 0;
  }

A(int m1,int m2,int m3) {
this.marks1 = m1;
this.marks2 = m2;
this.marks3 = m3;
}

public void getPercentage() {
int total = marks1+marks2+marks3;
double percent = (total/300.0)*100.0;
System.out.println(d.format(percent))
package com.factory.example;


public class AppFactory {

 public static D createD() {
     return new D();
 }

 public static C createC() {
     D d = createD();
     return new C(d);
 }

 public static B createB() {
     C c = createC();
     return new B(c);
 }

 public static A createA() {
     B b = createB();
     return new A(b);
 }
}

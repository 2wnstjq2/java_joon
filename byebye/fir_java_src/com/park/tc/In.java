package com.park.tc;
import com.park.tc.State;
import java.util.Scanner;
import java.util.Date;

public class In {
 Date date = new Date();
 
 public In(){
 }
 void in(State state, Scanner s){
  int num = 0;
  String name = "";
  String carnumber = "";
     
  System.out.println("==============================================\n 주차 할 곳의 번호를 고르시오.");
     num = s.nextInt();
     
  if(state.box[num].getNum() != " O "){
   System.out.print("Name : ");
   name = s.next();
   
   System.out.print("Car number : ");
   carnumber = s.next();
   
   state.box[num].setName(name);
   state.box[num].setcarNumber(carnumber);
   state.box[num].setNum(" O ");
   state.box[num].setIn(date.toString());
   state.box[num].intime = System.currentTimeMillis ();
   state.box[num].outtime = System.currentTimeMillis ();
   
   state.clear();
   state.clear();
   System.out.println(" ("+num+")set parking.");
  }
  else{
   System.out.println("No parking area or Wrong Car number.");
  }
  state.print_state();
 }
}
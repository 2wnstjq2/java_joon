package com.park.tc;
import com.park.tc.State;

public class Manage {
 Manage(){
 }
 
 void inform(State state){
  
  System.out.println("==============================================\n << 현재 주차 칸 별 정보  >>");
  
  for(int i=0; i<state.box.length; i++){
   state.charge_inform(i);
   System.out.println("Name : "+state.box[i].getName());
   System.out.println("Car Number : "+state.box[i].getcarNumber());
  }
 }
}
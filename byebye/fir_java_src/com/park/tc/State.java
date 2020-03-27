package com.park.tc;
import java.util.Date;

public class State { 
 final static int MAX = 8;
 Date date = new Date();
 
 public Space box[] = new  Space[MAX];
 
 public State(){
  this.create(MAX);
 }

 public void create(int a){
  for(int i=0; i<a; i++){
   box[i] = new  Space();
  }
  
  for(int i=0; i<a; i++){
   box[i].setNum("("+i+")");
   //나머지 것들 초기값?
  }
 }
 
 public void print_state(){
  System.out.println("==============================================\n << 현재 주차장 상태 >>");
  for(int i=0; i<MAX/2; i++){
   System.out.print("["+box[i].getNum()+"]");
  }
  
  System.out.println();
  
  for(int i=MAX/2; i<MAX; i++){
   System.out.print("["+box[i].getNum()+"]");
  }
  
  System.out.println();
 }
 
 public void init(int a){
  box[a].setNum("("+a+")");
  box[a].setName("");
  box[a].setcarNumber("");
  box[a].setIn("");
  box[a].setOut("");
  box[a].setCharge(0);
 }
 
 public void charges(int a){
  if(box[a].getNum() == " ■ "){
   box[a].charge = ((int)((box[a].outtime - box[a].intime)/100));
  }
 }
 
 public void charge_inform(int i){
  System.out.println("==============================================\n [ "+i+" ]");
  System.out.println("주차시간 : "+box[i].getIn());
  System.out.println("출차시간 : "+box[i].getOut());
  if(box[i].getNum() == " ■ "){
   box[i].outtime = (int) System.currentTimeMillis ();
  }
  charges(i);
  System.out.println("주차요금 : "+box[i].getCharge()+"원");
 }
 public void clear(){
  for(int i=0; i<25; i++)
   System.out.println();
 }
}
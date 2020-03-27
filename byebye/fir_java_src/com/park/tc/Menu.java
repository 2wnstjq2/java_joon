package com.park.tc;
import java.util.Scanner;
import com.park.tc.State;;

public class Menu {
 State state = new State();
 In in = new In();
 Out out = new Out();
 Manage manage = new Manage();
 
 public void play(Scanner s){
  state.clear();
  
  System.out.println("  Menu  ");
  state.print_state();
  select(state, s);
 }
 
 public void select(State state, Scanner s){
    int l = 1;
    
    try {
     while(l != 4)
     { 
      System.out.println(" [1] in [2] out  [3] state [4]Exit");
      l = s.nextInt();
      
      if(l==1){
       state.clear();
       state.clear();
       System.out.println("==============================================\n * 1) 주차\\n 2) 출차\\n 3) 관리\\n 4) 종료 * ");
     state.print_state();
     in.in(state, s);
      }  
      else if(l==2){
       state.clear();
       state.clear();
       System.out.println("==============================================\n * ������ �����ϼ̽��ϴ�. * ");
     state.print_state();
     out.out(state, s);
      }
      else if(l==3){
       state.clear();
       System.out.println("==============================================\n * ������ �����ϼ̽��ϴ�. * ");
     state.print_state();
     manage.inform(state);
      }
      else if(l==4){
       state.clear();
       state.clear();
       System.out.println("==============================================\n * ���α׷��� �����մϴ�. * ");
     break;
      }
      else{
       state.clear();
       System.out.println("==============================================\n * 1, 2, 3, 4�� ���� �߿��� ���ÿ�. * ");
      }
   }
    }
    catch (Exception e) {
     
    }
 }
}
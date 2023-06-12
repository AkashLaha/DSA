package com.akash.hackerrank;

import java.util.*;
import java.util.List;
public class ScoreBoard {
    public static void main(String[] args) {
        List<Integer> ranked=new ArrayList<>();
        ranked.add(100);
        ranked.add(90);
        ranked.add(90);
        ranked.add(80);
        List<Integer> player=new ArrayList<>();
        player.add(70);
        player.add(80);
        player.add(105);
        List<Integer> list= new ArrayList<>();
        List<Integer> newlist= new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int count;
        for(int i=0;i<ranked.size();i++){
            if(ranked.get(i)<min){
                list.add(ranked.get(i));
            }
            min= ranked.get(i);
        }
        for(int i=0;i< player.size();i++){
            count=search(player.get(i),list);
            newlist.add(count+1);
        }
        System.out.println(newlist);

    }
    public static int search(int n,List<Integer> list){
        int start=0;
        int end=list.size()-1;
        while(start<=end){
            int mid=(end+start)/2;
            if(n== list.get(mid)){
                return mid;
            }
            else if(list.get(mid)>n){

                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end+1;
    }
}

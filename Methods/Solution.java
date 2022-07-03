package Methods;
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in "+new Sports().getName());      
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
    	System.out.println(super.getName());
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
    	String name = getName();   //Name of child class game 	
    	super.getNumberOfTeamMembers();
    	System.out.println(name);
         System.out.println("Each team has 11 players in " +name);
}
}
public class Solution {

    public static void main(String[] args) {
        Soccer obj = new Soccer();
         obj.getNumberOfTeamMembers();
    }
}

/*
Output
Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class

*/
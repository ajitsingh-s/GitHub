package comhackerRank;
class Sports{
    String getName(){
        return "Generic Sports";
    }
    Sports getNumberOfTeamMembers(){
        System.out.print("Each team has n numbers of players in ");
		 return new Sports();
    }
}
class Soccer extends Sports{
	
    String getName(){
		System.out.println(super.getName());
        return "Soccer Class";
    }
	@Override
    Soccer getNumberOfTeamMembers(){
		String str = getName();
		Sports obj = super.getNumberOfTeamMembers();
		System.out.println(obj.getName());
		System.out.println(str);
        System.out.print("Each team has 11 numbers of players in ");
		System.out.println(str);
		return  new Soccer();
    }
	 public static void main(String[] args){
         
        Soccer obj =new Soccer();
		obj.getNumberOfTeamMembers();
		 
    }       

}


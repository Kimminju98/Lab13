package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {

	public static void whatFriend(Friend friend) { // parameter is Friend class's reference
		
		if(friend instanceof ClassFriend) { // if friend's instance is ClassFriend
			((ClassFriend)friend).classFriend();  // call ClassFriend's classFriend method
		}
		else if(friend instanceof SchoolFriend) { // if friend's instance is SchoolFriend
			((SchoolFriend)friend).schoolFriend(); // call SchoolFriend's schooFriend method
		}
		else if(friend instanceof Friend) { // if friend's instance is Friend
			friend.justFriend(); // call Friend's justFriend method
		}
	}
	public static void main(String[]args) {
		Friend friend1 = new Friend(); // instantiate Friend class
		SchoolFriend friend2 = new SchoolFriend(); // instantiate SchoolFriend class
		ClassFriend friend3 = new ClassFriend(); // instantiate ClassFriend class
		
		InstanceOf.whatFriend(friend1); //give friend1 reference to whatFriend method of InstanceOf class 
		InstanceOf.whatFriend(friend2); //give friend2 reference to whatFriend method of InstanceOf class 
		InstanceOf.whatFriend(friend3); //give friend3 reference to whatFriend method of InstanceOf class 
	}
}

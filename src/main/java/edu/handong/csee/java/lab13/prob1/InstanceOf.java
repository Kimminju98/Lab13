package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {

	public static void whatFriend(Friend friend) {
		
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
		Friend friend1 = new Friend();
		SchoolFriend friend2 = new SchoolFriend();
		ClassFriend friend3 = new ClassFriend();
		
		InstanceOf.whatFriend(friend1);
		InstanceOf.whatFriend(friend2);
		InstanceOf.whatFriend(friend3);
	}
}

package Prototype1;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException; 

import java.util.ArrayList;
import java.util.Arrays; 
import java.util.*; 

import java.util.Scanner;

import Prototype1.FeedDenizen;
import Prototype1.Post;
import Prototype1.Account;
import Prototype1.Comment;
import Prototype1.Endorsement;


public class BlackMirror implements SocialMediaPlatform {

	ArrayList<Account> accounts = new ArrayList<Account>();
	Account graveyard = new Account(0, "", "");


	@Override
	public int createAccount(String handle) throws IllegalHandleException, InvalidHandleException {
		return createAccount(handle, "");
	}

	@Override
	public int createAccount(String handle, String description) throws IllegalHandleException, InvalidHandleException {
		if (!(0 < handle.length() && handle.length() < 31)){	
			throw new InvalidHandleException();
		}
		char[] array = handle.toCharArray();
		for (char i : array ){
			int ascii = i;
			if (!(64 < ascii && ascii < 123)){
				throw new InvalidHandleException();
			}
		}
		for (Account i : accounts){
			if (handle.equals(i.getHandle())) {
			throw new IllegalHandleException();
				}
		}
		int next_index = accounts.size();
		accounts.add(new Account(next_index, handle, description));
		return next_index;
	}

	@Override
	public void removeAccount(int id) throws AccountIDNotRecognisedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAccount(String handle) throws HandleNotRecognisedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeAccountHandle(String oldHandle, String newHandle)
			throws HandleNotRecognisedException, IllegalHandleException, InvalidHandleException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAccountDescription(String handle, String description) throws HandleNotRecognisedException {
		// TODO Auto-generated method stub

	}

	@Override
	public String showAccount(String handle) throws HandleNotRecognisedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createPost(String handle, String message) throws HandleNotRecognisedException, InvalidPostException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int endorsePost(String handle, int id)
			throws HandleNotRecognisedException, PostIDNotRecognisedException, NotActionablePostException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int commentPost(String handle, int id, String message) throws HandleNotRecognisedException,
			PostIDNotRecognisedException, NotActionablePostException, InvalidPostException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deletePost(int id) throws PostIDNotRecognisedException {
		// TODO Auto-generated method stub

	}

	@Override
	public String showIndividualPost(int id) throws PostIDNotRecognisedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StringBuilder showPostChildrenDetails(int id)
			throws PostIDNotRecognisedException, NotActionablePostException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumberOfAccounts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalOriginalPosts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalEndorsmentPosts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalCommentPosts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMostEndorsedPost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMostEndorsedAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void erasePlatform() {
		// TODO Auto-generated method stub

	}

	@Override
	public void savePlatform(String filename) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadPlatform(String filename) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

	}

}

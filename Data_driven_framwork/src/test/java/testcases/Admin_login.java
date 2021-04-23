package testcases;

import java.io.IOException;
import java.util.NoSuchElementException;

import project_methods.Login_into_account;

public class Admin_login {

	public static void main(String[] args) throws IOException,NullPointerException, InterruptedException, Exception, NoSuchElementException {
		
		Login_into_account test = new Login_into_account();
		test.login();
		

	}

}

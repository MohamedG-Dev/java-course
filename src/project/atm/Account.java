package project.atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

	private int customerNumber;
	private int pinNumber;
	private double checkBalance = 0;
	private double savingsBalance = 0;

	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public double getCheckBalance() {
		return checkBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public double calculateCheckingWithdraw(double amount) {
		checkBalance = checkBalance - amount;
		return checkBalance;
	}

	public double calculateSavingsWithdraw(double amount) {
		savingsBalance = savingsBalance - amount;
		return savingsBalance;
	}

	public double calculateCheckingDeposit(double amount) {
		checkBalance = checkBalance + amount;
		return checkBalance;
	}

	public double calculateSavingsDeposit(double amount) {
		savingsBalance = savingsBalance + amount;
		return savingsBalance;
	}

	public void getCheckingWithdrawalInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkBalance));
		System.out.println("Amount you want to withdraw from checking account");

		double amount = input.nextDouble();
		if (checkBalance - amount >= 0) {
			calculateCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkBalance));

		} else {
			System.out.println("Insufficient Balance or Balance cannot be negative." + "\n");
		}
	}

	public void getSavingsWithdrawalInput() {
		System.out.println("savings account balance: " + moneyFormat.format(savingsBalance));
		System.out.println("Amount you want to withdraw from savings account");
		double amount = input.nextDouble();
		if (savingsBalance - amount >= 0) {
			calculateSavingsWithdraw(amount);
			System.out.println("New savings account balance: " + moneyFormat.format(savingsBalance));
		} else {
			System.out.println("Insufficient Balance or Balance cannot be negative.");
		}
	}

	public void getCheckingDepositInput() {
		System.out.println("Checking account balance: " + moneyFormat.format(checkBalance));
		System.out.println("Amount you want to deposit into the Checking account");
		double amount = input.nextDouble();

		if (checkBalance + amount >= 0) {
			calculateCheckingDeposit(amount);
			System.out.println("New checking account balance is: " + moneyFormat.format(checkBalance));
		} else {
			System.out.println("Balance cannot be negative.");
		}
	}

	public void getSavingsDepositInput() {
		System.out.println("savings account balance: " + moneyFormat.format(savingsBalance));
		System.out.println("Amount you want to deposit from savings account");
		double amount = input.nextDouble();
		if (savingsBalance + amount >= 0) {
			calculateSavingsDeposit(amount);
			System.out.println("New savings account balance: " + moneyFormat.format(savingsBalance));
		} else {
			System.out.println("\n" + "Balance cannot be negative." + "\n");
		}
	}
}

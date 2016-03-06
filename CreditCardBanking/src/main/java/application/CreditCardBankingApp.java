package application;

import java.util.List;
import java.util.Scanner;

import model.CreditCardCustomerInfoPOJO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.CalculateBillAmountServiceInterface;
import service.NonDefaultServiceInterface;

public class CreditCardBankingApp {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		System.out
				.println("================================================================");
		System.out
				.println("=**            Credit Card Banking Application               **=");
		System.out
				.println("================================================================");
		System.out
				.println("*                    =====  Menu =====                         *");
		System.out
				.println("*  1. Calculate total bill amount                              *");
		System.out
				.println("*  2. List non default customers                               *");
		System.out
				.println("*  3. Make credit card payments                                *");
		System.out
				.println("================================================================");
		System.out.println("   Select your option : ");
		Scanner userInput = new Scanner(System.in);
		int userOption = userInput.nextInt();

		CalculateBillAmountServiceInterface calculateBillAmountService = null;
		NonDefaultServiceInterface nonDefaultService = null;

		switch (userOption) {
		case 1: {

			System.out.println("  Your Bill Amount : ");
			Scanner userBillAmount = new Scanner(System.in);
			float billAmount = userBillAmount.nextFloat();
			System.out.println("  Enter your Card type : ");
			Scanner userCardType = new Scanner(System.in);
			String cardType = userCardType.next();
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"application-context.xml");
			calculateBillAmountService = (CalculateBillAmountServiceInterface) context
					.getBean("calculateBillAmountService");
			System.out.println("The Total bill amount calculated :"
					+ calculateBillAmountService.callService(cardType,
							billAmount));
			break;
		}
		case 2: {
			System.out.println("  Enter Card type : ");
			Scanner userCardType = new Scanner(System.in);
			String cardType = userCardType.next();
			System.out.println("  Enter payment indicator : ");
			Scanner userPaymentIndicator = new Scanner(System.in);
			String paymentIndicator = userPaymentIndicator.next();
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"nondefault-context.xml");
			nonDefaultService = (NonDefaultServiceInterface) context
					.getBean("nonDefaultService");
			List<CreditCardCustomerInfoPOJO> creditcardInfoList = nonDefaultService
					.callService(cardType, paymentIndicator);
			System.out
					.println("List of customers in the above payment indicator :");
			for (CreditCardCustomerInfoPOJO creditcardInfo : creditcardInfoList) {
				System.out.println(creditcardInfo.toString());
			}
			break;
		}
		case 3: {
			System.out.println("User option :" + userOption);
			break;
		}
		default: {
			System.out.println("Invalid user option...!!!");
			break;
		}
		}
	}
}

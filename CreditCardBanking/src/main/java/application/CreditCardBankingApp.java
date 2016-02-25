package application;

import java.util.Scanner;

import model.DefaulterServicePOJO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.CalculateBillAmountServiceInterface;
import config.DefaulterConfiguration;

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

		CalculateBillAmountServiceInterface service = null;

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
			service = (CalculateBillAmountServiceInterface) context
					.getBean("calculateBillAmountService");
			System.out.println("The Total bill amount calculated :"
					+ service.callService(cardType, billAmount));
			break;
		}
		case 2: {
			System.out.println("User option :" + userOption);
			System.out.println("  Enter your Card type : ");
			Scanner userCardType = new Scanner(System.in);
			String cardType = userCardType.next();
			System.out.println("  Enter your Default Indicator : ");
			Scanner userDefaultIndicator = new Scanner(System.in);
			byte defaultIndicator = userDefaultIndicator.nextByte();
			ApplicationContext context = new AnnotationConfigApplicationContext(
					DefaulterConfiguration.class);
			DefaulterServicePOJO defaulterServicePOJO = (DefaulterServicePOJO) context
					.getBean("defaulterServicePOJO");
			defaulterServicePOJO.setUserCardType(cardType);
			defaulterServicePOJO.setDefaultIndicator(defaultIndicator);

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

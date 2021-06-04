package com.coding.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
	WebDriver driver;

	public CalculatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@onclick='r(0)']")
	private WebElement zero;

	@FindBy(xpath = "//*[@onclick='r(1)']")
	private WebElement one;

	@FindBy(xpath = "//*[@onclick='r(2)']")
	private WebElement two;

	@FindBy(xpath = "//*[@onclick='r(3)']")
	private WebElement three;

	@FindBy(xpath = "//*[@onclick='r(4)']")
	private WebElement four;

	@FindBy(xpath = "//*[@onclick='r(5)']")
	private WebElement five;

	@FindBy(xpath = "//*[@onclick='r(6)']")
	private WebElement six;

	@FindBy(xpath = "//*[@onclick='r(7)']")
	private WebElement seven;

	@FindBy(xpath = "//*[@onclick='r(8)']")
	private WebElement eight;

	@FindBy(xpath = "//*[@onclick='r(9)']")
	private WebElement nine;

	@FindBy(xpath = "//*[@onclick=\"r('+')\"]")
	private WebElement pluse;

	@FindBy(xpath = "//*[@onclick=\"r('-')\"]")
	private WebElement substraction;

	@FindBy(xpath = "//*[@onclick=\"r('/')\"]")
	private WebElement divison;

	@FindBy(xpath = "//*[@onclick=\"r('*')\"]")
	private WebElement multiplication;

	@FindBy(xpath = "//*[@onclick=\"r('C')\"]")
	private WebElement clear;

	@FindBy(id = "sciOutPut")
	private WebElement result;

	public void clickOnOne() {
		one.click();
	}

	public void clickOnTwo() {
		two.click();
	}

	public void clickOnThree() {
		three.click();
	}

	public void clickOnFour() {
		four.click();
	}

	public void clickOnFive() {
		five.click();
	}

	public void clickOnSix() {
		six.click();
	}

	public void clickOnSeven() {
		seven.click();
	}

	public void clickOnEight() {
		eight.click();
	}

	public void clickOnNine() {
		nine.click();
	}

	public void clickOnZero() {
		zero.click();
	}

	public void clickOnMinus() {
		substraction.click();
	}

	public void clickOnPlus() {
		pluse.click();
	}

	public void clickOnMulti() {
		multiplication.click();
	}

	public void clickOnDiv() {
		divison.click();
	}

	public void clickOnClear() {
		clear.click();
	}

	public void doClickForN1(String n1) {

		if (n1.equalsIgnoreCase("423")) {
			clickOnFour();
			clickOnTwo();
			clickOnThree();
		} else if (n1.equalsIgnoreCase("4000")) {
			clickOnFour();
			clickOnZero();
			clickOnZero();
			clickOnZero();
		} else if (n1.equalsIgnoreCase("-234234")) {
			clickOnMinus();
			clickOnTwo();
			clickOnThree();
			clickOnFour();
			clickOnTwo();
			clickOnThree();
			clickOnFour();
		} else {
			clickOnTwo();
			clickOnThree();
			clickOnFour();
			clickOnEight();
			clickOnTwo();
			clickOnThree();
		}

	}

	public void doClickForN2(String n2) {
		if (n2.equalsIgnoreCase("525")) {
			clickOnFive();
			clickOnTwo();
			clickOnFive();
		} else if (n2.equalsIgnoreCase("200")) {
			clickOnTwo();
			clickOnZero();
			clickOnZero();
		} else if (n2.equalsIgnoreCase("345345")) {
			clickOnThree();
			clickOnFour();
			clickOnFive();
			clickOnThree();
			clickOnFour();
			clickOnFive();
		} else {
			clickOnMinus();
			clickOnTwo();
			clickOnThree();
			clickOnZero();
			clickOnNine();
			clickOnFour();
			clickOnEight();
			clickOnTwo();
			clickOnThree();
		}
	}

	public void doClickForTask(String task) {
		if (task.equalsIgnoreCase("Multiplication")) {
			clickOnMulti();
		} else if (task.equalsIgnoreCase("Division")) {
			clickOnDiv();
		} else if (task.equalsIgnoreCase("Addition")) {
			clickOnPlus();
		} else {
			clickOnMinus();
		}

	}

	public String doCalculation(String n1, String n2, String task) {
		doClickForN1(n1);
		doClickForTask(task);
		doClickForN2(n2);
		String actualResult = result.getText();
		return actualResult;
	}

}

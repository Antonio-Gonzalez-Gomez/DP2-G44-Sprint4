package acme.testing.administrator.dashboard;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;

import acme.testing.AcmeOneTest;

public class AdministratorDashboardShowTest extends AcmeOneTest{
	
	@ParameterizedTest
	@CsvFileSource(resources="/administrator/dashboard/show-dashboard.csv", encoding = "utf-8", numLinesToSkip=1)
	@Order(10)
	public void showDashboard(final int recordIndex) {
		super.signIn("administrator", "administrator");
		
		super.clickOnMenu("Administrator", "Dashboard");
		
		super.checkExists(By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[normalize-space(text()) = '7.41']"));
		super.checkExists(By.xpath("/html/body/div[2]/div/table/tbody/tr[2]/td[normalize-space(text()) = '0.80']"));
		
		
		super.signOut();
	}

}

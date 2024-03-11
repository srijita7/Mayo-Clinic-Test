package runner;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.swing.JProgressBar;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import pages.ApplyNowPage;
import pages.AcetaminophenPage;

import pages.AppointmentsLocationPageObject;
import pages.AppointmentsPageObject;
import pages.BeyondCancerPage;
import pages.BookSubPage;
import pages.CancerPage;
import pages.CartPage;
import pages.CoughSymptomsPageObject;
import pages.DiabetesPageObjects;
import pages.DrugsAndSupplementsPage;
import pages.EmailPreviewPageObject;
import pages.FindDoctorPage;
import pages.HealthyDietPageObject;
import pages.HealthyLifestylePageObject;
import pages.Giftdetailpage;
import pages.HealthLibararyPage;
import pages.HomePageObject;
import pages.JobsPage;
import pages.NewAppointmentsPageObject;
import pages.NewslettersPageObject;
import pages.PneumoniaPageObject;
import pages.ResearchPage;
import pages.SearchJobsPage;
import pages.SymptomsPageObject;
import pages.TestProceduresPageObject;
import pages.WhenToSeeADoctorPageObject;
import utils.*;

public class RunTest {
	static WebDriver driver;
	static int testCaseNo = 1;
	WebDriverHelper helper;
	Base baseObjBase = new Base();

	Reporter reporter;
	ExtentReports extentReports;
	AcetaminophenPage acetaminophenPageObject=new AcetaminophenPage();
	DrugsAndSupplementsPage drugsAndSupplementsPageObject=new DrugsAndSupplementsPage();
	HomePageObject homePageObject=new HomePageObject();
	AppointmentsPageObject appointmentsPageObject=new AppointmentsPageObject();
	AppointmentsLocationPageObject appointmentsLocationPageObject=new AppointmentsLocationPageObject();
	NewAppointmentsPageObject newAppointmentsPageObject=new NewAppointmentsPageObject(); 
	TestProceduresPageObject testProceduresPageObject = new TestProceduresPageObject();
	HealthyLifestylePageObject healthyLifestylePageObject = new HealthyLifestylePageObject();
	HealthyDietPageObject healthyDietPageObject = new HealthyDietPageObject();
	HealthLibararyPage healthLibararyPageObject=new HealthLibararyPage();
	SymptomsPageObject symptomsPageObject=new SymptomsPageObject();
	CoughSymptomsPageObject coughSymptomsPageObject=new CoughSymptomsPageObject();
	WhenToSeeADoctorPageObject whenToSeeADoctorPageObject=new WhenToSeeADoctorPageObject();
	EmailPreviewPageObject emailPreviewPageObject=new EmailPreviewPageObject();
	DiabetesPageObjects objDiabetes= new DiabetesPageObjects();
	FindDoctorPage objDoctors= new FindDoctorPage();
	Giftdetailpage giftPageObject = new Giftdetailpage();
	BookSubPage bookSubPage=new BookSubPage();
	CancerPage cancerPage=new CancerPage();
	BeyondCancerPage beyondCancerPage=new BeyondCancerPage();
	CartPage cartPage=new CartPage();
	JobsPage jobsPage=new JobsPage();
	SearchJobsPage searchJobsPage=new SearchJobsPage();
	ResearchPage researchPage=new ResearchPage();
	ApplyNowPage applyNowPage=new ApplyNowPage();
	NewslettersPageObject newslettersPageObject=new NewslettersPageObject();
	PneumoniaPageObject pneumoniaPageObject=new PneumoniaPageObject();
	ExtentTest extentTest;

	String homePageLoad="opened home page";
	String testFail=" failed since one or more steps failed";
	String expectedURL="https://links.e.response.mayoclinic.org/subscription";
	
	TestCaseProgress testCaseProgress=new TestCaseProgress(7);

	@BeforeTest
	public void initialSetup() {
		reporter = new Reporter();
		extentReports = reporter.createReports("Mayo Clinic Test Report");
	}

	@BeforeMethod
	public void setUp(Method method) {
		LoggerHandler.logInfo("Test case " + testCaseNo + " : " + method.getName());
		extentTest = extentReports.createTest("Test case " + testCaseNo + " : " + method.getName());
		try {
			driver = baseObjBase.openBrowser();
			helper=WebDriverHelper.initializer(driver);
			LoggerHandler.logInfo(homePageLoad);
			extentTest.pass(homePageLoad);
		} catch (Exception e) {
			LoggerHandler.logError("not " + homePageLoad);
			extentTest.fail("not " + homePageLoad);
		}
	}
	
	@Test(priority = 1, testName = "Search Diabetes (TC1)", enabled = false)
	public void searchDiabetes() {
		homePageObject.clickOnSearchBar(driver, extentTest);
		homePageObject.searchDiabetes(driver, extentTest);
		objDiabetes.clickDiabetes(driver, extentTest);
		objDiabetes.clickSymptomsAndCauses(driver, extentTest);
		objDiabetes.clickDiagnosisTreatment(driver, extentTest);
		objDiabetes.clickDoctorsDepartments(driver, extentTest);
		objDiabetes.verifyFirst(driver, extentTest);

	}

	@Test(priority = 2, testName = "Find a Doctor(TC2)", enabled = false)
	public void findDoctor() {
		homePageObject.careAtMayo(driver, extentTest);
		objDoctors.searchDoctor(driver, extentTest);
		objDoctors.selectFirst(driver, extentTest);
		objDoctors.sendMessage(driver, extentTest);
		objDoctors.verify(driver, extentTest);
	}

	@Test(priority = 3, testName = "Search Drugs", enabled = false)
	public void searchDrugs() {
		homePageObject.clickOnHealthLibrary(driver, extentTest);
		healthLibararyPageObject.clickDrugsAndSupplements(driver,extentTest);
		drugsAndSupplementsPageObject.clickSearchDrugsAndSupplementsBar(driver,extentTest);
		drugsAndSupplementsPageObject.sendAcetaminophen(driver,extentTest);
		drugsAndSupplementsPageObject.clickSearchButton(driver,extentTest);
		drugsAndSupplementsPageObject.clickAcetaminophen(driver,extentTest);
		acetaminophenPageObject.scrollBeforeUse(driver,extentTest);
		acetaminophenPageObject.clickBeforeUse(driver,extentTest);
		acetaminophenPageObject.scrollProperUse(driver,extentTest);
		acetaminophenPageObject.clickProperUse(driver,extentTest);
		acetaminophenPageObject.scrollPrecautions(driver,extentTest);
		acetaminophenPageObject.clickPrecautions(driver,extentTest);
		acetaminophenPageObject.scrollSideEffects(driver,extentTest);
		acetaminophenPageObject.clickSideEffects(driver,extentTest);
		acetaminophenPageObject.verifySideEffectsText(driver,extentTest, "Side Effects");
		try {
			Screenshot.takess(driver);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	@Test(priority = 4, testName = "MRI (TC4)", enabled = false)
	public void navigateMRI() {
		homePageObject.clickOnHealthLibrary(driver,extentTest);
		homePageObject.clickTest(driver, extentTest);
		testProceduresPageObject.clickM(driver, extentTest);
		testProceduresPageObject.clickMri(driver, extentTest);
		String headerText = testProceduresPageObject.getHeaderText(driver);
		testProceduresPageObject.verifyHeaderText(driver, extentTest, "Overview", headerText);
		testProceduresPageObject.takeSnapshot(driver, extentTest);
	}
    @Test(priority = 5, testName = "Healthy Diet (TC5)", enabled = false)
	public void navigateHealthyDiet(){
		homePageObject.clickOnHealthLibrary(driver,extentTest);
		homePageObject.clickHealthyLifestyle(driver, extentTest);
		healthyLifestylePageObject.clickNutrition(driver, extentTest);
		healthyLifestylePageObject.clickHealthyDiet(driver, extentTest);
		String labelText = healthyDietPageObject.getLabelText(driver);
		healthyDietPageObject.verifyLabelText(driver, extentTest, "Healthy diets", labelText);
		healthyDietPageObject.takeSnapshot(driver, extentTest);
	}
    
    @Test(priority = 6, testName = "Giving to MayoClinic", enabled = false)
	public void givetomayo() {
		try {
			homePageObject.clickGivingToMayo(driver, extentTest);

			homePageObject.clickGiveNow(driver, extentTest);

			giftPageObject.clickAmount(driver, extentTest);

			giftPageObject.clickDesignate(driver, extentTest);

			giftPageObject.clickMedicalEducation(driver, extentTest);
			giftPageObject.clickAnonymously(driver, extentTest);
			giftPageObject.clickTitle(driver, extentTest);

			giftPageObject.clickMr(driver, extentTest);

			giftPageObject.clickFirstName(driver, extentTest);

			giftPageObject.clickLastName(driver, extentTest);

			giftPageObject.clickCountry(driver, extentTest);

			giftPageObject.clickIndia(driver, extentTest);

			giftPageObject.clickState(driver, extentTest);

			giftPageObject.clickNA(driver, extentTest);

			giftPageObject.clickAddress(driver, extentTest);

			giftPageObject.clickCity(driver, extentTest);

			giftPageObject.clickZip(driver, extentTest);

			giftPageObject.clickPhoneNumber(driver, extentTest);

			giftPageObject.clickEmail(driver, extentTest);

			giftPageObject.clickMakeMyGiftButton(driver, extentTest);
			giftPageObject.verifyCompletePaymentText(driver, extentTest);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			e.getMessage();
		}
	}

	@Test(priority = 7, testName = "TC-7", enabled = false)
	public void bookSubscription() {
		homePageObject.clickOnHealthLibrary(driver, extentTest);
		homePageObject.clickOnBookSubscription(driver, extentTest);
		bookSubPage.clickOnViewCancer(driver,extentTest,helper);
		cancerPage.clickOnBeyondCancer(driver,extentTest,helper);
		beyondCancerPage.clickOnInput(driver,extentTest,helper);
		beyondCancerPage.sendKeysToInput(driver,extentTest,helper);
		beyondCancerPage.clickOnAddToCart(driver,extentTest,helper);
		cartPage.checkOrderSummary(driver,extentTest,helper);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
			Thread.currentThread().interrupt();
		}
	}

	

	@Test(priority = 8, testName = "view symptoms(TC8)")
	public void viewSymptomsFunctionalityTest() {
		homePageObject.clickOnHealthLibrary(driver, extentTest);
		homePageObject.clickOnSymptoms(driver, extentTest);
		symptomsPageObject.clickOnKeyC(driver, extentTest);
		symptomsPageObject.clickOnCough(driver, extentTest);
		coughSymptomsPageObject.clickOnWhenToSeeADoctor(driver, extentTest);

		String whenToSeeADoctorHeaderText = whenToSeeADoctorPageObject.getHeaderText(driver, extentTest);
		whenToSeeADoctorPageObject.verifyHeaderText(driver, extentTest, "When to see a doctor", whenToSeeADoctorHeaderText);

		whenToSeeADoctorPageObject.scrollToClickHereForAnEmailPreview(driver, extentTest);
		whenToSeeADoctorPageObject.clickOnClickHereForAnEmailPreviewLink(driver, extentTest);

		emailPreviewPageObject.scrollToGetCareNow(driver, extentTest);
		emailPreviewPageObject.clickOnGetCareNow(driver, extentTest);
		String startAppointmentTitleText = appointmentsPageObject.getTitleText(driver, extentTest);
		appointmentsPageObject.verifyTitleText(driver, extentTest, "Start your appointment request here.", startAppointmentTitleText);
	}

	@Test(priority = 9, testName = "request appointment (TC9)", groups = { "srijita" })
	public void requestAppointmentFunctionalityTest() {
		homePageObject.clickOnRequestAppointment(driver, extentTest);
		appointmentsPageObject.clickOnNewPatients(driver, extentTest);
		appointmentsLocationPageObject.clickOnLocationOutsideUS(driver, extentTest);
		newAppointmentsPageObject.clickOnContinue(driver, extentTest);
		newAppointmentsPageObject.clickOnStart(driver, extentTest);
		newAppointmentsPageObject.clickOnYes(driver, extentTest);
		newAppointmentsPageObject.clickOnContinue(driver, extentTest);
		newAppointmentsPageObject.clickOnYes(driver, extentTest);
		newAppointmentsPageObject.clickOnContinue(driver, extentTest);
		newAppointmentsPageObject.clickOnIDoNotHaveAnyMedicalRecords(driver, extentTest);
		newAppointmentsPageObject.clickOnContinue(driver, extentTest);
		newAppointmentsPageObject.clickOnYes(driver, extentTest);
		newAppointmentsPageObject.clickOnContinue(driver, extentTest);
		newAppointmentsPageObject.clickOnYes(driver, extentTest);
		newAppointmentsPageObject.clickOnContinue(driver, extentTest);

		String patientInformationSpanText = newAppointmentsPageObject.getPatientInformationSectionText(driver,
				extentTest);
		newAppointmentsPageObject.verifyPatientInformationSectionText(driver, extentTest, "Patient Information",
				patientInformationSpanText);

		newAppointmentsPageObject.clickOnLogo(driver, extentTest);
		newAppointmentsPageObject.clickOnExitRequestButton(driver, extentTest);

		String newPatientsHeaderText = appointmentsPageObject.getHeaderText(driver, extentTest);
		appointmentsPageObject.verifyHeaderText(driver, extentTest, "New Patients", newPatientsHeaderText);

		String startAppointmentTitleText = appointmentsPageObject.getTitleText(driver, extentTest);
		appointmentsPageObject.verifyTitleText(driver, extentTest, "Start your appointment request here.", startAppointmentTitleText);
  }

	@Test(priority=10,testName = "TC-10", enabled = false)
	public void exploreCareer(){
		homePageObject.clickOnExploreCareer(driver, extentTest);
		jobsPage.clickOnSearchByRole(driver,extentTest,helper);
		jobsPage.sendDataToSearchByRole(driver,extentTest,helper);
		jobsPage.clickOnSearchLocation(driver,extentTest,helper);
		jobsPage.sendDataToSearchLocation(driver,extentTest,helper);
		jobsPage.clickOnMinnesota(driver,extentTest,helper);
		jobsPage.clickOnSearchIcon(driver,extentTest,helper);
		searchJobsPage.clickOnAreaOfInterest(driver,extentTest,helper);
		searchJobsPage.clickOnCriticalCare(driver,extentTest,helper);
		searchJobsPage.clickOnResearch(driver,extentTest,helper);
		researchPage.clickOnApplyNow(driver,extentTest,helper);
		applyNowPage.checkMessage(driver, extentTest,helper);
		try{
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getMessage();
			Thread.currentThread().interrupt();
		}
	}
	
	@Test(priority = 26, testName = "TC 26")
	public void newsletterSubscription()
	{
		homePageObject.clickOnNewsletters(driver, extentTest);
		newslettersPageObject.clickOnEmail(driver, extentTest);
		newslettersPageObject.enterEmail(driver, extentTest);
		newslettersPageObject.clickOnFirstName(driver, extentTest);
		newslettersPageObject.enterFirstName(driver, extentTest);
		newslettersPageObject.clickOnAllCommunications(driver, extentTest);
		newslettersPageObject.clickOnSubmit(driver, extentTest);
		
		homePageObject.verifyURL(driver, expectedURL);
		String actualPreferencesText=newslettersPageObject.getText(driver, extentTest);
		newslettersPageObject.verifyText(driver, extentTest, "Thank you for updating your preferences.", actualPreferencesText);
	}
	
	@Test(priority = 27, testName = "TC 27")
	public void pneumoniaDiagnosis()
	{
		homePageObject.clickOnSearchIcon(driver, extentTest);
		homePageObject.clickOnTopSearchBar(driver, extentTest);
		homePageObject.enterTextInTopSearchBar(driver, extentTest);
		homePageObject.clickOnPneumoniaCause(driver, extentTest);
		pneumoniaPageObject.clickOnFirstLink(driver, extentTest);
		pneumoniaPageObject.clickOnDiagnosis(driver, extentTest);
		String imageText=pneumoniaPageObject.getImageText(driver, extentTest);
		pneumoniaPageObject.verifyImageText(driver, extentTest, "Chest X-ray showing pneumonia", imageText);
	}
	
	@Test(priority = 28, testName = "TC 28")
	public void requestAppointmentForReturningPatients()
	{
		homePageObject.clickOnRequestAppointment(driver, extentTest);	
		appointmentsPageObject.clickOnReturningPatients(driver, extentTest);
		appointmentsPageObject.clickOnHaveNotSeenMayoClinicProvider(driver, extentTest);
		String requestAnAppointmentText=appointmentsPageObject.getRequestAnAppointmentText(driver, extentTest);
		appointmentsPageObject.verifyRequestAnAppointmentText(driver, extentTest, "The easiest way to request an appointment for a new concern is to call us or submit an online request.",requestAnAppointmentText);
	}
	
	@Test(priority = 29, testName = "TC 29")
	public void radiologySearch()
	{
		homePageObject.clickOnRequestAppointment(driver, extentTest);
		appointmentsPageObject.clickOnReferringPhysicians(driver, extentTest);
		appointmentsPageObject.clickOnMedicalDepartments(driver, extentTest);
		appointmentsPageObject.clickOnRadiology(driver, extentTest);
		String advancedImageText=appointmentsPageObject.getAdvancedImagingText(driver, extentTest);
		appointmentsPageObject.verifyAdvancedImagingText(driver, extentTest, "Advanced imaging for complex conditions", advancedImageText);
	}
	
	@Test(priority = 30, testName = "TC 30")
	public void pinkEyeSymptoms()
	{
		homePageObject.clickOnHealthLibrary(driver, extentTest);
		homePageObject.clickOnSymptoms(driver, extentTest);
		symptomsPageObject.clickOnOneOrMoreSymptoms(driver, extentTest);
		symptomsPageObject.clickOnEyeDiscomfort(driver, extentTest);
		symptomsPageObject.clickOnRedness(driver, extentTest);
		symptomsPageObject.clickOnFindCauses(driver, extentTest);
		symptomsPageObject.clickOnPinkEye(driver, extentTest);
		String imageText=symptomsPageObject.getImageText(driver, extentTest);
		symptomsPageObject.verifyImageText(driver, extentTest, "Pink eye (conjunctivitis)", imageText);
	}
	

	@AfterMethod
	public void tearDown() {
		testCaseProgress.setTestcaseNo(testCaseNo);
		testCaseProgress.setVisible(true);
		testCaseProgress.checkProgress();
		testCaseNo++;
		driver.quit();
	}

	@AfterTest
	public void flushReporter() {
		extentReports.flush();
		SendEmail.sendMail(extentTest);
	}

}
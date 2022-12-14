package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.example.MyPetsObjects.MeetingAppointmentPage;
import org.openqa.selenium.WebDriver;

public class MeetingAppointmentPageSteps {
    private WebDriver webDriver;
    public MeetingAppointmentPageSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^User open the kebab menu$")
    public void userOpenTheKebabMenu() throws InterruptedException {
        MeetingAppointmentPage meetingAppointmentPage = new MeetingAppointmentPage(webDriver);
        meetingAppointmentPage.isDisplayed();
        meetingAppointmentPage.setKebabMenu();
        Thread.sleep(3000);
    }

    @When("^User click meeting appointment$")
    public void userClickMeetingAppointment() throws InterruptedException {
        MeetingAppointmentPage meetingAppointmentPage = new MeetingAppointmentPage(webDriver);
        meetingAppointmentPage.setMyMeetingAppointment();
        Thread.sleep(3000);
    }

    @Then("^User will get routed to the meeting appointment list page$")
    public void userWillGetRoutedToTheMeetingAppointmentListPage() throws InterruptedException {
        MeetingAppointmentPage meetingAppointmentPage = new MeetingAppointmentPage(webDriver);
        meetingAppointmentPage.setMeetingCard();
        meetingAppointmentPage.setTextDate();
        meetingAppointmentPage.setDateMeeting();
        meetingAppointmentPage.setTextTime();
        meetingAppointmentPage.setTimeMeeting();
        meetingAppointmentPage.setTextPlace();
        meetingAppointmentPage.setPlaceMeeting();
        meetingAppointmentPage.setTextStatus();
        meetingAppointmentPage.setStatusMeeting();
        meetingAppointmentPage.setTextPetName();
        meetingAppointmentPage.setPetName();
        meetingAppointmentPage.setTextSeeker();
        meetingAppointmentPage.setSeekerName();
        Thread.sleep(3000);
    }

    @And("^User click edit meeting appointment$")
    public void userClickEditMeetingAppointment() throws InterruptedException {
        MeetingAppointmentPage meetingAppointmentPage = new MeetingAppointmentPage(webDriver);
        meetingAppointmentPage.setEditMeeting();
        Thread.sleep(3000);
    }

    @Then("^User set the date meeting on \"([^\"]*)\" and the month on \"([^\"]*)\" and the year on \"([^\"]*)\"$")
    public void userSetTheDateMeetingOnAndTheMonthOnAndTheYearOn(String dates, String months, String years) throws InterruptedException {
        MeetingAppointmentPage meetingAppointmentPage = new MeetingAppointmentPage(webDriver);
        meetingAppointmentPage.setUpdateDate(dates, months, years);
        Thread.sleep(3000);
    }

    @And("^User set the time meeting on \"([^\"]*)\" and the minute on \"([^\"]*)\"$")
    public void userSetTheTimeMeetingOnAndTheMinuteOn(String hours, String minutes) throws InterruptedException {
        MeetingAppointmentPage meetingAppointmentPage = new MeetingAppointmentPage(webDriver);
        meetingAppointmentPage.setUpdateTime(hours, minutes);
        Thread.sleep(3000);
    }

    @Then("^User click update button$")
    public void userClickUpdateButton() throws InterruptedException {
        MeetingAppointmentPage meetingAppointmentPage = new MeetingAppointmentPage(webDriver);
        meetingAppointmentPage.setUpdateButton();
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();
    }

    @Then("^User click cancel button for meeting appointment$")
    public void userClickCancelButtonForMeetingAppointment() throws InterruptedException {
        MeetingAppointmentPage meetingAppointmentPage = new MeetingAppointmentPage(webDriver);
        meetingAppointmentPage.setCancelUpdate();
        Thread.sleep(3000);
    }

    @And("^User click done button for meeting appointment$")
    public void userClickDoneButtonForMeetingAppointment() throws InterruptedException {
        MeetingAppointmentPage meetingAppointmentPage = new MeetingAppointmentPage(webDriver);
        meetingAppointmentPage.setDoneMeeting();
        Thread.sleep(7000);
        webDriver.switchTo().alert().accept();
    }

    @And("^User click cancel meeting for meeting appointment$")
    public void userClickCancelMeetingForMeetingAppointment() throws InterruptedException {
        MeetingAppointmentPage meetingAppointmentPage = new MeetingAppointmentPage(webDriver);
        meetingAppointmentPage.setCancelMeeting();
        Thread.sleep(7000);
        webDriver.switchTo().alert().accept();
    }
}

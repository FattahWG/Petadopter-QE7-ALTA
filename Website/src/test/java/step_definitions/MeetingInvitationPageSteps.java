package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import com.example.MyPetsObjects.MeetingInvitationPage;
import org.openqa.selenium.WebDriver;

public class MeetingInvitationPageSteps {
    private WebDriver webDriver;
    public MeetingInvitationPageSteps(){
        super();
        this.webDriver =Hooks.webDriver;
    }

    @And("^User click create meeting button$")
    public void userClickCreateMeetingButton() throws InterruptedException {
        MeetingInvitationPage meetingAppointmentPage = new MeetingInvitationPage(webDriver);
        meetingAppointmentPage.setCreateMeeting();
        Thread.sleep(3000);
    }

    @Then("^User set the date on \"([^\"]*)\" and the month \"([^\"]*)\" and the year on \"([^\"]*)\"$")
    public void userSetTheDateOnAndTheMonthAndTheYearOn(String dates, String months, String years) throws InterruptedException {
        MeetingInvitationPage meetingAppointmentPage = new MeetingInvitationPage(webDriver);
        meetingAppointmentPage.setInputDate(dates, months, years);
        Thread.sleep(3000);
    }

    @And("^User set the time on \"([^\"]*)\" and the minute on \"([^\"]*)\"$")
    public void userSetTheTimeOnAndTheMinuteOn(String hours, String minutes) throws InterruptedException {
        MeetingInvitationPage meetingAppointmentPage = new MeetingInvitationPage(webDriver);
        meetingAppointmentPage.setInputTime(hours, minutes);
        Thread.sleep(3000);
    }

    @Then("^User click add button$")
    public void userClickAddButton() throws InterruptedException {
        MeetingInvitationPage meetingAppointmentPage = new MeetingInvitationPage(webDriver);
        meetingAppointmentPage.setAddButton();
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();
        Thread.sleep(3000);
    }

    @Then("^User click cancel button for meeting invitation$")
    public void userClickCancelButtonForMeetingInvitation() throws InterruptedException {
        MeetingInvitationPage meetingAppointmentPage = new MeetingInvitationPage(webDriver);
        Thread.sleep(3000);
        meetingAppointmentPage.setCancelButton();
    }
}

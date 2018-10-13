package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter{

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.println(tr.getName() + " pass");

    }
    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.println(tr.getName() + " fail");
        System.out.println(tr.getThrowable().getMessage());
        //take screenshot...
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        System.out.println(tr.getName() + " skipped");

    }

}
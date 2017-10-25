package Run;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Created by ariel.hazan on 24-Oct-17.
 */
public class MyThread extends Thread {
    private Class testClass;
    private int failTest, passTest;

    public MyThread(Class testClass) {
        this.testClass = testClass;

    }

    @Override
    public void run() {
        // System.out.println("Thread Name: " + this.getName() + ", Thread ID: "
        // + this.getId());

        Result result = JUnitCore.runClasses(testClass);

        failTest = result.getFailureCount();
        passTest = result.getRunCount() - failTest;
        System.out.println("Fail: " + failTest);
        System.out.println("Pass: " + passTest);
    }
}

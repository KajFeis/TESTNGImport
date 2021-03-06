package test.thread.parallelization.sample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.thread.parallelization.TestNgRunStateTracker;

import java.util.concurrent.TimeUnit;

import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.METHOD_NAME;
import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.CLASS_NAME;
import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.CLASS_INSTANCE;
import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.TEST_NAME;
import static test.thread.parallelization.TestNgRunStateTracker.EventInfo.SUITE_NAME;
import static test.thread.parallelization.TestNgRunStateTracker.TestNgRunEvent.TEST_METHOD_EXECUTION;

public class TestClassDThreeMethodsWithNoDepsSample {

    @Parameters({ "suiteName", "testName", "sleepFor" })
    @Test
    public void testMethodA(String suiteName, String testName, String sleepFor) throws InterruptedException {
        long time = System.currentTimeMillis();

        TestNgRunStateTracker.logEvent(
                TestNgRunStateTracker.EventLog.builder()
                        .setEvent(TEST_METHOD_EXECUTION)
                        .setTimeOfEvent(time)
                        .setThread(Thread.currentThread())
                        .addData(METHOD_NAME, "testMethodA")
                        .addData(CLASS_NAME, getClass().getCanonicalName())
                        .addData(CLASS_INSTANCE, this)
                        .addData(TEST_NAME, testName)
                        .addData(SUITE_NAME, suiteName)
                        .build()
        );

        TimeUnit.SECONDS.sleep(Integer.parseInt(sleepFor));
    }

    @Parameters({ "suiteName", "testName", "sleepFor" })
    @Test
    public void testMethodB(String suiteName, String testName, String sleepFor) throws InterruptedException {
        long time = System.currentTimeMillis();

        TestNgRunStateTracker.logEvent(
                TestNgRunStateTracker.EventLog.builder()
                        .setEvent(TEST_METHOD_EXECUTION)
                        .setTimeOfEvent(time)
                        .setThread(Thread.currentThread())
                        .addData(METHOD_NAME, "testMethodB")
                        .addData(CLASS_NAME, getClass().getCanonicalName())
                        .addData(CLASS_INSTANCE, this)
                        .addData(TEST_NAME, testName)
                        .addData(SUITE_NAME, suiteName)
                        .build()
        );

        TimeUnit.SECONDS.sleep(Integer.parseInt(sleepFor));
    }

    @Parameters({ "suiteName", "testName", "sleepFor" })
    @Test
    public void testMethodC(String suiteName, String testName, String sleepFor) throws InterruptedException {
        long time = System.currentTimeMillis();

        TestNgRunStateTracker.logEvent(
                TestNgRunStateTracker.EventLog.builder()
                        .setEvent(TEST_METHOD_EXECUTION)
                        .setTimeOfEvent(time)
                        .setThread(Thread.currentThread())
                        .addData(METHOD_NAME, "testMethodC")
                        .addData(CLASS_NAME, getClass().getCanonicalName())
                        .addData(CLASS_INSTANCE, this)
                        .addData(TEST_NAME, testName)
                        .addData(SUITE_NAME, suiteName)
                        .build()
        );

        TimeUnit.SECONDS.sleep(Integer.parseInt(sleepFor));
    }
}

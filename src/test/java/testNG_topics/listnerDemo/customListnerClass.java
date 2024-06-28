package testNG_topics.listnerDemo;

import org.testng.IExecutionListener;

public class customListnerClass implements IExecutionListener {

    @Override
    public void onExecutionStart() {
        // Excel File Read , JSON File, Allure Report Start, Reporting, Logs starting

        // Email to QA lead automation started!!
        long startTime= System.currentTimeMillis();
        System.out.println(" ****   *** Started execution at - "+ startTime + "****   *** ");

    }

    @Override
    public void onExecutionFinish() {
        long endTime= System.currentTimeMillis();
        System.out.println("****   *** Finished execution at- "+ endTime +"****   *** ");

        // Send email to the QA lead automation started!
        // Write Java code to write the Email to QA lead
        //
    }

}

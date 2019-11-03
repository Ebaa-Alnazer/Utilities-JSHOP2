package utilities.jshop2;

import junit.framework.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utilities.jshop2.basic.basic;
import utilities.jshop2.basicModified.basicModified;
import utilities.jshop2.testPreprocessing.testpreprocessing;
import utilities.jshop2.testcycles.testcycles;
import utilities.jshop2.testcyclesbigexample.testcyclesbigexample;
import utilities.jshop2.testcyclesmodified.testcyclesmodified;
import utilities.jshop2.testpreprocessingmodified.testpreprocessingmodified;
import utilities.jshop2.testpreprocessingmodifiedCycles.testpreprocessingmodifiedcycles;

class MyJSHOP2FindUtilitiesTest {

    @Test
    public void TestfindUtilitiesBasic() {
        Domain domain = new basic();
        MyJSHOP2.getInstance().initialize(domain, null);
        MyJSHOP2.getInstance().setAlgorithmArgs(4, 0);
        MyJSHOP2.getInstance().findUtilities();
        Assert.assertEquals(2.0, domain.methods[0][0].getEstimationFactor());
        TaskAtom pickupTask = null;
        TaskAtom dropTask = null;
        for (int p = 0; p < domain.primitiveTasks.length; p++) {
            if (MyJSHOP2.getInstance().primitivetasks.get(p).getHead().getHead() == 0)
                pickupTask = MyJSHOP2.getInstance().primitivetasks.get(p);
            else dropTask = MyJSHOP2.getInstance().primitivetasks.get(p);
        }
        Assert.assertEquals(2.0, pickupTask.getUtility());
        Assert.assertEquals(1.0, dropTask.getUtility());
        Assert.assertEquals(2.0, MyJSHOP2.getInstance().compoundtasks.get(0).getUtility());
    }

    @Test
    public void TestFindUtilitiesBasicModified() {
        Domain domain = new basicModified();
        MyJSHOP2.getInstance().initialize(domain, null);
        MyJSHOP2.getInstance().setAlgorithmArgs(4, 1);
        MyJSHOP2.getInstance().findUtilities();
        Assert.assertEquals(1.0, domain.methods[0][0].getEstimationFactor());
        Assert.assertEquals(1.0, domain.methods[0][1].getEstimationFactor());
        TaskAtom pickupTask = null;
        TaskAtom dropTask = null;
        for (int p = 0; p < domain.primitiveTasks.length; p++) {
            if (MyJSHOP2.getInstance().primitivetasks.get(p).getHead().getHead() == 0)
                pickupTask = MyJSHOP2.getInstance().primitivetasks.get(p);
            else dropTask = MyJSHOP2.getInstance().primitivetasks.get(p);
        }
        Assert.assertEquals(2.0, pickupTask.getUtility());
        Assert.assertEquals(1.0, dropTask.getUtility());
        Assert.assertEquals(1.0, MyJSHOP2.getInstance().compoundtasks.get(0).getUtility());
    }

    @Test
    public void TestFindUtilitiesBasicModifiedRiskNeutral() {
        Domain domain = new basicModified();
        MyJSHOP2.getInstance().initialize(domain, null);
        MyJSHOP2.getInstance().setAlgorithmArgs(4, 2);
        MyJSHOP2.getInstance().findUtilities();
        Assert.assertEquals(1.5, domain.methods[0][0].getEstimationFactor());
        Assert.assertEquals(1.5, domain.methods[0][1].getEstimationFactor());
        TaskAtom pickupTask = null;
        TaskAtom dropTask = null;
        for (int p = 0; p < domain.primitiveTasks.length; p++) {
            if (MyJSHOP2.getInstance().primitivetasks.get(p).getHead().getHead() == 0)
                pickupTask = MyJSHOP2.getInstance().primitivetasks.get(p);
            else dropTask = MyJSHOP2.getInstance().primitivetasks.get(p);
        }
        Assert.assertEquals(2.0, pickupTask.getUtility());
        Assert.assertEquals(1.0, dropTask.getUtility());
        Assert.assertEquals(1.5, MyJSHOP2.getInstance().compoundtasks.get(0).getUtility());
    }

    @Test
    public void TestFindUtilitiestestpreProcessing() {
        Domain domain = new testpreprocessing();
        MyJSHOP2.getInstance().initialize(domain, null);
        MyJSHOP2.getInstance().setAlgorithmArgs(4, 0);
        MyJSHOP2.getInstance().findUtilities();
        Assert.assertEquals(5.0, domain.methods[0][0].getEstimationFactor());
        Assert.assertEquals(8.0, domain.methods[1][0].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[1][1].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[1][2].getEstimationFactor());
        Assert.assertEquals(5.0, MyJSHOP2.getInstance().compoundtasks.get(0).getUtility());
        Assert.assertEquals(5.0, MyJSHOP2.getInstance().compoundtasks.get(1).getUtility());
        for (int p = 0; p < domain.primitiveTasks.length; p++) {
            int head = MyJSHOP2.getInstance().primitivetasks.get(p).getHead().getHead();
            switch (head) {
                case 0:
                    Assert.assertEquals(2.0, MyJSHOP2.getInstance().primitivetasks.get(p).getUtility());
                    break;
                case 1:
                    Assert.assertEquals(3.0, MyJSHOP2.getInstance().primitivetasks.get(p).getUtility());
                    break;
                case 2:
                    Assert.assertEquals(3.0, MyJSHOP2.getInstance().primitivetasks.get(p).getUtility());
                    break;
                case 3:
                    Assert.assertEquals(5.0, MyJSHOP2.getInstance().primitivetasks.get(p).getUtility());
                    break;
                case 4:
                    Assert.assertEquals(8.0, MyJSHOP2.getInstance().primitivetasks.get(p).getUtility());
                    break;
            }
        }
    }

    @Test
    public void TestFindUtilitiestestpreprocessingmodified() {
        Domain domain = new testpreprocessingmodified();
        MyJSHOP2.getInstance().initialize(domain, null);
        MyJSHOP2.getInstance().setAlgorithmArgs(4, 0);
        MyJSHOP2.getInstance().findUtilities();
        Assert.assertEquals(8.0, domain.methods[0][0].getEstimationFactor());
        Assert.assertEquals(10.0, domain.methods[1][0].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[1][1].getEstimationFactor());
        Assert.assertEquals(10.0, domain.methods[1][2].getEstimationFactor());
        Assert.assertEquals(3.0, domain.methods[2][0].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[2][1].getEstimationFactor());
        Assert.assertEquals(8.0, domain.methods[3][0].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[3][1].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[3][2].getEstimationFactor());
        Assert.assertEquals(8.0, MyJSHOP2.getInstance().compoundtasks.get(0).getUtility());
        Assert.assertEquals(5.0, MyJSHOP2.getInstance().compoundtasks.get(1).getUtility());
        Assert.assertEquals(3.0, MyJSHOP2.getInstance().compoundtasks.get(2).getUtility());
        Assert.assertEquals(5.0, MyJSHOP2.getInstance().compoundtasks.get(3).getUtility());
        for (int p = 0; p < domain.primitiveTasks.length; p++) {
            int head = MyJSHOP2.getInstance().primitivetasks.get(p).getHead().getHead();
            switch (head) {
                case 0:
                    Assert.assertEquals(2.0, MyJSHOP2.getInstance().primitivetasks.get(p).getUtility());
                    break;
                case 1:
                    Assert.assertEquals(3.0, MyJSHOP2.getInstance().primitivetasks.get(p).getUtility());
                    break;
                case 2:
                    Assert.assertEquals(3.0, MyJSHOP2.getInstance().primitivetasks.get(p).getUtility());
                    break;
                case 3:
                    Assert.assertEquals(5.0, MyJSHOP2.getInstance().primitivetasks.get(p).getUtility());
                    break;
                case 4:
                    Assert.assertEquals(8.0, MyJSHOP2.getInstance().primitivetasks.get(p).getUtility());
                    break;
                case 5:
                    Assert.assertEquals(10.0, MyJSHOP2.getInstance().primitivetasks.get(p).getUtility());
                    break;
            }
        }

    }

    @Test
    public void TestFindUtilitiestestpreprocessingmodifiedRiskSeeking() {
        Domain domain = new testpreprocessingmodified();
        MyJSHOP2.getInstance().initialize(domain, null);
        MyJSHOP2.getInstance().setAlgorithmArgs(4, 1);
        MyJSHOP2.getInstance().findUtilities();
        Assert.assertEquals(2.0, domain.methods[0][0].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[1][0].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[1][1].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[1][2].getEstimationFactor());
        Assert.assertEquals(3.0, domain.methods[2][0].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[2][1].getEstimationFactor());
        Assert.assertEquals(8.0, domain.methods[3][0].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[3][1].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[3][2].getEstimationFactor());
        Assert.assertEquals(2.0, MyJSHOP2.getInstance().compoundtasks.get(0).getUtility());
        Assert.assertEquals(2.0, MyJSHOP2.getInstance().compoundtasks.get(1).getUtility());
        Assert.assertEquals(2.0, MyJSHOP2.getInstance().compoundtasks.get(2).getUtility());
        Assert.assertEquals(2.0, MyJSHOP2.getInstance().compoundtasks.get(3).getUtility());

    }

    // todo fix values and reenable
    @Disabled
    @Test
    public void TestFindUtilitiestestpreprocessingmodifiedCycles(){
        Domain domain = new testpreprocessingmodifiedcycles();
        MyJSHOP2.getInstance().initialize(domain, null);
        MyJSHOP2.getInstance().setAlgorithmArgs(1000, 0);
        MyJSHOP2.getInstance().findUtilities();
        Assert.assertEquals(1000.0, domain.methods[0][0].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[1][0].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[1][1].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[1][2].getEstimationFactor());
        Assert.assertEquals(3.0, domain.methods[2][0].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[2][1].getEstimationFactor());
        Assert.assertEquals(8.0, domain.methods[3][0].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[3][1].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[3][2].getEstimationFactor());
        Assert.assertEquals(1000.0, MyJSHOP2.getInstance().compoundtasks.get(0).getUtility());
        Assert.assertEquals(5.0, MyJSHOP2.getInstance().compoundtasks.get(1).getUtility());
        Assert.assertEquals(3.0, MyJSHOP2.getInstance().compoundtasks.get(2).getUtility());
        Assert.assertEquals(8.0, MyJSHOP2.getInstance().compoundtasks.get(3).getUtility());
    }

    @Test
    public void TestFindUtilitiestestpreprocessingmodifiedCyclesRiskSeeking(){
        Domain domain = new testpreprocessingmodifiedcycles();
        MyJSHOP2.getInstance().initialize(domain, null);
        MyJSHOP2.getInstance().setAlgorithmArgs(1000, 1);
        MyJSHOP2.getInstance().findUtilities();
        Assert.assertEquals(1000.0, domain.methods[0][0].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[1][0].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[1][1].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[1][2].getEstimationFactor());
        Assert.assertEquals(3.0, domain.methods[2][0].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[2][1].getEstimationFactor());
        Assert.assertEquals(8.0, domain.methods[3][0].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[3][1].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[3][2].getEstimationFactor());
        Assert.assertEquals(1000.0, MyJSHOP2.getInstance().compoundtasks.get(0).getUtility());
        Assert.assertEquals(2.0, MyJSHOP2.getInstance().compoundtasks.get(1).getUtility());
        Assert.assertEquals(2.0, MyJSHOP2.getInstance().compoundtasks.get(2).getUtility());
        Assert.assertEquals(2.0, MyJSHOP2.getInstance().compoundtasks.get(3).getUtility());
    }


    @Test
    public void TestFindUtilitiestestpreprocessingmodifiedCycles2(){
        Domain domain = new testcycles();
        MyJSHOP2.getInstance().initialize(domain, null);
        MyJSHOP2.getInstance().setAlgorithmArgs(1000, 0);
        MyJSHOP2.getInstance().findUtilities();
        Assert.assertEquals(1000.0, domain.methods[0][0].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[0][1].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[1][0].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[1][1].getEstimationFactor());
        Assert.assertEquals(20.0, domain.methods[1][2].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[2][0].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[2][1].getEstimationFactor());
        Assert.assertEquals(5.0, MyJSHOP2.getInstance().compoundtasks.get(0).getUtility());
       Assert.assertEquals(2.0, MyJSHOP2.getInstance().compoundtasks.get(1).getUtility());
        Assert.assertEquals(5.0, MyJSHOP2.getInstance().compoundtasks.get(2).getUtility());
    }

    @Test
    public void TestFindUtilitiestestcycles(){
        Domain domain = new testcyclesmodified();
        MyJSHOP2.getInstance().initialize(domain, null);
        MyJSHOP2.getInstance().setAlgorithmArgs(1000, 0);
        MyJSHOP2.getInstance().findUtilities();
        Assert.assertEquals(1000.0, domain.methods[0][0].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[0][1].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[1][0].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[1][1].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[1][2].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[2][0].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[2][1].getEstimationFactor());
        Assert.assertEquals(5.0, MyJSHOP2.getInstance().compoundtasks.get(0).getUtility());
        Assert.assertEquals(2.0, MyJSHOP2.getInstance().compoundtasks.get(1).getUtility());
        Assert.assertEquals(5.0, MyJSHOP2.getInstance().compoundtasks.get(2).getUtility());
    }

    @Test
    public void TestFindUtilitiestestcyclesbigexample(){
        Domain domain = new testcyclesbigexample();
        MyJSHOP2.getInstance().initialize(domain, null);
        MyJSHOP2.getInstance().setAlgorithmArgs(1000, 0);
        MyJSHOP2.getInstance().findUtilities();
        Assert.assertEquals(5.0, domain.methods[0][0].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[0][1].getEstimationFactor());
        Assert.assertEquals(20.0, domain.methods[1][0].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[1][1].getEstimationFactor());
        Assert.assertEquals(14.0, domain.methods[1][2].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[2][0].getEstimationFactor());
        Assert.assertEquals(5.0, domain.methods[2][1].getEstimationFactor());
        Assert.assertEquals(1000.0, domain.methods[3][0].getEstimationFactor());
        Assert.assertEquals(2.0, domain.methods[3][1].getEstimationFactor());
        Assert.assertEquals(5.0, MyJSHOP2.getInstance().compoundtasks.get(0).getUtility());
        Assert.assertEquals(2.0, MyJSHOP2.getInstance().compoundtasks.get(1).getUtility());
        Assert.assertEquals(5.0, MyJSHOP2.getInstance().compoundtasks.get(2).getUtility());
        Assert.assertEquals(2.0, MyJSHOP2.getInstance().compoundtasks.get(3).getUtility());
    }
}
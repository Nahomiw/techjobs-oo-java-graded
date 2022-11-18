package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertTrue((test_job1.getId()+1) == test_job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job newJob= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(newJob instanceof Job);

        assertTrue(newJob.getEmployer() instanceof Employer);

        assertEquals(newJob.getEmployer().getValue(),"ACME");

        assertEquals(newJob.getName(), "Product tester");

        assertTrue(newJob.getLocation() instanceof Location);

        assertEquals(newJob.getLocation().getValue(),"Desert");

        assertTrue(newJob.getPositionType() instanceof PositionType);

        assertEquals(newJob.getPositionType().getValue(),"Quality control");

        assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(newJob.getCoreCompetency().getValue(),"Persistence");

    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = test_job6.toString();
        int firstChar = 0;
        if (jobString.startsWith("\n") == true) {
            firstChar = (int)'\n';
        }
        int lastChar = 0;
        if (jobString.endsWith("\n") == true){
            lastChar = (int)'\n';
        }
        assertEquals('\n', firstChar);
        assertEquals('\n', lastChar);

    }


    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char n = 'N';
        char p = 'P';
        assertTrue(aJob.toString().contains("Product tester"));
        assertEquals(n, aJob.toString().charAt(7));
        assertEquals(p, aJob.toString().charAt(13));
        assertEquals(p, aJob.toString().charAt(108));
        assertEquals(aJob.getEmployer().toString(),"ACME");
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job();

        assertEquals("\n" + "ID: " + job1.getId() + "\n" + "Name: Data not available\n" +
                "Employer: Data not available\n" + "Location: Data not available\n" +
                "Position Type: Data not available\n" + "Core Competency: Data not available\n", job1.toString());
    }
}



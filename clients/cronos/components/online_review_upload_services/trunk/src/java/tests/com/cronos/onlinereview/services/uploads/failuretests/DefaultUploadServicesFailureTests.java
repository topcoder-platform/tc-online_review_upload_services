/*
 * Copyright (C) 2007 TopCoder Inc., All Rights Reserved.
 */
package com.cronos.onlinereview.services.uploads.failuretests;

import com.cronos.onlinereview.services.uploads.ConfigurationException;
import com.cronos.onlinereview.services.uploads.InvalidProjectException;
import com.cronos.onlinereview.services.uploads.InvalidUserException;
import com.cronos.onlinereview.services.uploads.ManagersProvider;
import com.cronos.onlinereview.services.uploads.impl.DefaultUploadServices;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.File;


/**
 * <p>Failure test cases for DefaultUploadServices.</p>
 *
 * @author victorsam, onsky
 * @version 1.1
 *
 * @since 1.0
 */
public class DefaultUploadServicesFailureTests extends TestCase {
    /**
     * <p>The DefaultUploadServices instance used for testing.</p>
     */
    private DefaultUploadServices services;

    /**
     * <p>Setup test environment.</p>
     *
     * @throws Exception to JUnit
     */
    protected void setUp() throws Exception {
        FailureTestHelper.loadXMLConfig(FailureTestHelper.CONFIG_FILE);
        FailureTestHelper.loadXMLConfig("com.topcoder.util.log", FailureTestHelper.TEST_FILES + "logging.xml");

        services = new DefaultUploadServices();
    }

    /**
     * <p>Tears down test environment.</p>
     *
     * @throws Exception to JUnit
     */
    protected void tearDown() throws Exception {
        services = null;

        FailureTestHelper.clearConfig();
    }

    /**
     * <p>Return all tests.</p>
     *
     * @return all tests
     */
    public static Test suite() {
        return new TestSuite(DefaultUploadServicesFailureTests.class);
    }

    /**
     * <p>Tests ctor DefaultUploadServices#DefaultUploadServices(ManagersProvider) for failure. It tests the
     * case that when managersProvider is null and expects IllegalArgumentException.</p>
     */
    public void testCtor_NullManagersProvider() {
        try {
            new DefaultUploadServices((ManagersProvider) null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests ctor DefaultUploadServices#DefaultUploadServices(String) for failure. It tests the case that
     * when namespace is null and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testCtor_NullNamespace() throws Exception {
        try {
            new DefaultUploadServices((String) null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests ctor DefaultUploadServices#DefaultUploadServices(String) for failure. It tests the case that
     * when namespace is empty and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testCtor_EmptyNamespace() throws Exception {
        try {
            new DefaultUploadServices(" ");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests ctor DefaultUploadServices#DefaultUploadServices(String) for failure. Expects for
     * ConfigurationException.</p>
     */
    public void testCtor3_UnknowNamespace() {
        try {
            new DefaultUploadServices("unknown");
            fail("ConfigurationException expected.");
        } catch (ConfigurationException e) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadSubmission(long,long,String) for failure. It tests the case that
     * when projectId is negative and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadSubmission_NegativeProjectId()
        throws Exception {
        try {
            services.uploadSubmission(-1, 1, "filename");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadSubmission(long,long,String) for failure. It tests the case that
     * when userId is negative and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadSubmission_NegativeUserId() throws Exception {
        try {
            services.uploadSubmission(1, -1, "filename");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadSubmission(long,long,String) for failure. It tests the case that
     * when filename is null and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadSubmission_NullFilename() throws Exception {
        try {
            services.uploadSubmission(1, 1, null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadSubmission(long,long,String) for failure. It tests the case that
     * when filename is empty and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadSubmission_EmptyFilename() throws Exception {
        try {
            services.uploadSubmission(1, 1, " ");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadFinalFix(long,long,String) for failure. It tests the case that when
     * projectId is negative and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadFinalFix_NegativeProjectId()
        throws Exception {
        try {
            services.uploadFinalFix(-1, 1, "filename");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadFinalFix(long,long,String) for failure. It tests the case that when
     * userId is negative and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadFinalFix_NegativeUserId() throws Exception {
        try {
            services.uploadFinalFix(1, -1, "filename");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadFinalFix(long,long,String) for failure. It tests the case that when
     * filename is null and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadFinalFix_NullFilename() throws Exception {
        try {
            services.uploadFinalFix(1, 1, null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadFinalFix(long,long,String) for failure. It tests the case that when
     * filename is empty and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadFinalFix_EmptyFilename() throws Exception {
        try {
            services.uploadFinalFix(1, 1, " ");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadTestCases(long,long,String) for failure. It tests the case that
     * when projectId is negative and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadTestCases_NegativeProjectId()
        throws Exception {
        try {
            services.uploadTestCases(-1, 1, "filename");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadTestCases(long,long,String) for failure. It tests the case that
     * when userId is negative and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadTestCases_NegativeUserId() throws Exception {
        try {
            services.uploadTestCases(1, -1, "filename");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadTestCases(long,long,String) for failure. It tests the case that
     * when filename is null and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadTestCases_NullFilename() throws Exception {
        try {
            services.uploadTestCases(1, 1, null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadTestCases(long,long,String) for failure. It tests the case that
     * when filename is empty and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadTestCases_EmptyFilename() throws Exception {
        try {
            services.uploadTestCases(1, 1, " ");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#setSubmissionStatus(long,long,String) for failure. It tests the case that
     * when submissionId is negative and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testSetSubmissionStatus_NegativeSubmissionId()
        throws Exception {
        try {
            services.setSubmissionStatus(-1, 1, "operator");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#setSubmissionStatus(long,long,String) for failure. It tests the case that
     * when submissionStatusId is negative and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testSetSubmissionStatus_NegativeSubmissionStatusId()
        throws Exception {
        try {
            services.setSubmissionStatus(1, -1, "operator");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#setSubmissionStatus(long,long,String) for failure. It tests the case that
     * when operator is null and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testSetSubmissionStatus_NullOperator()
        throws Exception {
        try {
            services.setSubmissionStatus(1, 1, null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#setSubmissionStatus(long,long,String) for failure. It tests the case that
     * when operator is empty and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testSetSubmissionStatus_EmptyOperator()
        throws Exception {
        try {
            services.setSubmissionStatus(1, 1, " ");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadSpecification(long,long,String) for failure. It tests the case that
     * when projectId is negative and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadSpecification_failure1() throws Exception {
        try {
            services.uploadSpecification(-1, 1, "test_file");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadSpecification(long,long,String) for failure. It tests the case that
     * when userId is negative and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadSpecification_failure2() throws Exception {
        try {
            services.uploadSpecification(1, -1, "test_file");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadSpecification(long,long,String) for failure. It tests the case that
     * when filename is null and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadSpecification_failure3() throws Exception {
        try {
            services.uploadSpecification(1, 1, null);
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadSpecification(long,long,String) for failure. It tests the case that
     * when filename is empty and expects IllegalArgumentException.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadSpecification_failure4() throws Exception {
        try {
            services.uploadSpecification(1, 1, " ");
            fail("IllegalArgumentException expected.");
        } catch (IllegalArgumentException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadSpecification(long,long,String) for failure. It tests the case that
     * the project doesn't exist.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadSpecification_failure5() throws Exception {
        try {
            services.uploadSpecification(1, 1, "testfile");
            fail("InvalidProjectException expected.");
        } catch (InvalidProjectException iae) {
            //good
        }
    }

    /**
     * <p>Tests DefaultUploadServices#uploadSpecification(long,long,String) for failure. It tests the case that
     * the resource doesn't exist.</p>
     *
     * @throws Exception to JUnit
     */
    public void testUploadSpecification_failure6() throws Exception {
        MockResourceManager.setState(-1);
        try {
            services.uploadSpecification(10, 1, "testfile");
            fail("InvalidUserException expected.");
        } catch (InvalidUserException iae) {
            //good
            // should fail because no "Specification Submitter" role is defined
        } finally {
            MockResourceManager.setState(0);
        }
    }
}

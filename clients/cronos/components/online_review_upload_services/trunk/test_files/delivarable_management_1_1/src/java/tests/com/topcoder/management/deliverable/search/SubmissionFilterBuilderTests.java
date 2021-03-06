/*
 * Copyright (C) 2006 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.management.deliverable.search;

import com.topcoder.search.builder.filter.EqualToFilter;
import junit.framework.TestCase;

/**
 * Unit test for SubmissionFilterBuilder.
 *
 * @author singlewood
 * @version 1.1
 */
public class SubmissionFilterBuilderTests extends TestCase {

    /**
     * The name of the field under which SearchBuilder Filters can be built in order to filter on the id of the
     * Submission.
     */
    private static final String SUBMISSION_ID_FIELD_NAME = "submission_id";

    /**
     * The name of the field under which SearchBuilder Filters can be built in order to filter on the id of the Upload
     * that is associated with the Submission.
     */
    private static final String UPLOAD_ID_FIELD_NAME = "upload_id";

    /**
     * The name of the field under which SearchBuilder Filters can be built in order to filter on the project the
     * submission is associated with.
     */
    private static final String PROJECT_ID_FIELD_NAME = "project_id";

    /**
     * The name of the field under which SearchBuilder Filters can be built in order to filter on the id of the resource
     * the Submission is associated with.
     */
    private static final String RESOURCE_ID_FIELD_NAME = "resource_id";

    /**
     * The name of the field under which SearchBuilder Filters can be built in order to filter on the submission status
     * of the Submissions.
     */
    private static final String SUBMISSION_STATUS_ID_FIELD_NAME = "submission_status_id";

    /**
     * The name of the field under which SearchBuilder Filters can be built in order to filter on the submission type
     * of the Submissions.
     */
    private static final String SUBMISSION_TYPE_ID_FIELD_NAME = "submission_type_id";

    /**
     * Create the test instance.
     *
     * @throws Exception exception to JUnit.
     */
    public void setUp() throws Exception {
        // no operation.
    }

    /**
     * Clean the config.
     *
     * @throws Exception exception to JUnit.
     */
    public void tearDown() throws Exception {
        // no operation.
    }

    /**
     * Tests the behavior of createSubmissionIdFilter. Set the parameter deliverableId = 0 IllegalArgumentException
     * should be thrown.
     */
    public void testCreateSubmissionIdFilter_Invalid1() {
        try {
            SubmissionFilterBuilder.createSubmissionIdFilter(0);
            fail("IllegalArgumentException should be thrown because of the invalid parameter.");
        } catch (IllegalArgumentException e) {
            // expected.
        }
    }

    /**
     * Build a Filter using createSubmissionIdFilter, Check if it returns a correct filter. If it is correct, the return
     * filter will be a EqualToFilter, and it's name and value field is set by createSubmissionIdFilter. No exception
     * should be thrown.
     */
    public void testCreateSubmissionIdFilter_Accuracy1() {
        EqualToFilter equalToFilter = (EqualToFilter) SubmissionFilterBuilder.createSubmissionIdFilter(44);
        assertEquals("createSubmissionIdFilter doesn't build a correct filter", SUBMISSION_ID_FIELD_NAME,
                equalToFilter.getName());
        assertEquals("createSubmissionIdFilter doesn't build a correct filter", new Long(44), equalToFilter
                .getValue());
    }

    /**
     * Tests the behavior of createUploadIdFilter. Set the parameter deliverableId = 0 IllegalArgumentException should
     * be thrown.
     */
    public void testCreateUploadIdFilter_Invalid1() {
        try {
            SubmissionFilterBuilder.createUploadIdFilter(0);
            fail("IllegalArgumentException should be thrown because of the invalid parameter.");
        } catch (IllegalArgumentException e) {
            // expected.
        }
    }

    /**
     * Build a Filter using createUploadIdFilter, Check if it returns a correct filter. If it is correct, the return
     * filter will be a EqualToFilter, and it's name and value field is set by createUploadIdFilter. No exception should
     * be thrown.
     */
    public void testCreateUploadIdFilter_Accuracy1() {
        EqualToFilter equalToFilter = (EqualToFilter) SubmissionFilterBuilder.createUploadIdFilter(22);
        assertEquals("createUploadIdFilter doesn't build a correct filter", UPLOAD_ID_FIELD_NAME,
                equalToFilter.getName());
        assertEquals("createUploadIdFilter doesn't build a correct filter", new Long(22), equalToFilter
                .getValue());
    }

    /**
     * Tests the behavior of createProjectIdFilter. Set the parameter deliverableId = 0 IllegalArgumentException should
     * be thrown.
     */
    public void testCreateProjectIdFilter_Invalid1() {
        try {
            SubmissionFilterBuilder.createProjectIdFilter(0);
            fail("IllegalArgumentException should be thrown because of the invalid parameter.");
        } catch (IllegalArgumentException e) {
            // expected.
        }
    }

    /**
     * Build a Filter using createProjectIdFilter, Check if it returns a correct filter. If it is correct, the return
     * filter will be a EqualToFilter, and it's name and value field is set by createProjectIdFilter. No exception
     * should be thrown.
     */
    public void testCreateProjectIdFilter_Accuracy1() {
        EqualToFilter equalToFilter = (EqualToFilter) SubmissionFilterBuilder.createProjectIdFilter(33);
        assertEquals("createProjectIdFilter doesn't build a correct filter", PROJECT_ID_FIELD_NAME,
                equalToFilter.getName());
        assertEquals("createProjectIdFilter doesn't build a correct filter", new Long(33), equalToFilter
                .getValue());
    }

    /**
     * Tests the behavior of createResourceIdFilter. Set the parameter deliverableId = 0 IllegalArgumentException should
     * be thrown.
     */
    public void testCreateResourceIdFilter_Invalid1() {
        try {
            SubmissionFilterBuilder.createResourceIdFilter(0);
            fail("IllegalArgumentException should be thrown because of the invalid parameter.");
        } catch (IllegalArgumentException e) {
            // expected.
        }
    }

    /**
     * Build a Filter using createResourceIdFilter. Check if it returns a correct filter. If it is correct, the return
     * filter will be a EqualToFilter, and it's name and value field is set by createResourceIdFilter. No exception
     * should be thrown.
     */
    public void testCreateResourceIdFilter_Accuracy1() {
        EqualToFilter equalToFilter = (EqualToFilter) SubmissionFilterBuilder.createResourceIdFilter(55);
        assertEquals("createResourceIdFilter doesn't build a correct filter", RESOURCE_ID_FIELD_NAME,
                equalToFilter.getName());
        assertEquals("createResourceIdFilter doesn't build a correct filter", new Long(55), equalToFilter
                .getValue());
    }

    /**
     * Tests the behavior of createSubmissionStatusIdFilter. Set the parameter deliverableId = 0
     * IllegalArgumentException should be thrown.
     */
    public void testCreateSubmissionStatusIdFilter_Invalid1() {
        try {
            SubmissionFilterBuilder.createSubmissionStatusIdFilter(0);
            fail("IllegalArgumentException should be thrown because of the invalid parameter.");
        } catch (IllegalArgumentException e) {
            // expected.
        }
    }

    /**
     * Build a Filter using createSubmissionStatusIdFilter, Check if it returns a correct filter. If it is correct, the
     * return filter will be a EqualToFilter, and it's name and value field is set by createSubmissionStatusIdFilter. No
     * exception should be thrown.
     */
    public void testCreateSubmissionStatusIdFilter_Accuracy1() {
        EqualToFilter equalToFilter = (EqualToFilter) SubmissionFilterBuilder
                .createSubmissionStatusIdFilter(33);
        assertEquals("createSubmissionStatusIdFilter doesn't build a correct filter",
                SUBMISSION_STATUS_ID_FIELD_NAME, equalToFilter.getName());
        assertEquals("createSubmissionStatusIdFilter doesn't build a correct filter", new Long(33),
                equalToFilter.getValue());
    }

    /**
     * Build a Filter using createSubmissionTypeIdFilter, Check if it returns a correct filter. If it is correct, the
     * return filter will be a EqualToFilter, and it's name and value field is set by createSubmissionTypeIdFilter. No
     * exception should be thrown.
     */
    public void testCreateSubmissionTypeIdFilter_Accuracy1() {
        EqualToFilter equalToFilter = (EqualToFilter) SubmissionFilterBuilder
                .createSubmissionTypeIdFilter(33);
        assertEquals("createSubmissionTypeIdFilter doesn't build a correct filter",
                SUBMISSION_TYPE_ID_FIELD_NAME, equalToFilter.getName());
        assertEquals("createSubmissionTypeIdFilter doesn't build a correct filter", new Long(33),
                equalToFilter.getValue());
    }

    /**
     * Tests the behavior of createSubmissionTypeIdFilter. Set the parameter deliverableId = 0 IllegalArgumentException
     * should be thrown.
     */
    public void testCreateSubmissionTypeIdFilter_Invalid1() {
        try {
            SubmissionFilterBuilder.createSubmissionTypeIdFilter(0);
            fail("IllegalArgumentException should be thrown because of the invalid parameter.");
        } catch (IllegalArgumentException e) {
            // expected.
        }
    }
}

package org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies;

/**
 * Uses:
 * android.app.Activity
 * android.content.Context
 * android.content.Intent
 * android.os.Bundle
 * android.view.LayoutInflater
 * android.view.View
 * android.view.View.OnClickListener
 * android.view.ViewGroup
 * android.widget.Button
 *
 * androidx.annotation.NonNull
 * androidx.annotation.Nullable
 * androidx.annotation.RestrictTo
 * androidx.annotation.RestrictTo.Scope
 *
 * io.swagger.client.api.StudiesApi
 * io.swagger.client.model.GermplasmSummaryListResponse
 * io.swagger.client.model.NewObservationDbIdsResponse
 * io.swagger.client.model.NewObservationUnitDbIdsResponse
 * io.swagger.client.model.ObservationUnitPositionsResponse
 * io.swagger.client.model.ObservationUnitsResponse1
 * io.swagger.client.model.ObservationsResponse
 * io.swagger.client.model.SeasonsResponse
 * io.swagger.client.model.StudiesResponse
 * io.swagger.client.model.StudyObservationVariablesResponse
 * io.swagger.client.model.StudyResponse
 * io.swagger.client.model.StudySearchRequest
 * io.swagger.client.model.StudyTypesResponse
 * io.swagger.client.model.SuccessfulSearchResponse
 *
 * org.wheatgenetics.androidlibrary.mstrdtl.Consts
 * org.wheatgenetics.androidlibrary.mstrdtl.Utils
 *
 *
 * searchStudiesPost():
 * org.wheatgenetics.brapi1_3.studies.StudySearchRequestAlertDialog
 * org.wheatgenetics.brapi1_3.studies.StudySearchRequestAlertDialog.Handler
 *
 * studiesStudyDbIdLayoutsPut():
 * org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest
 * org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestListActivity
 *
 * studiesStudyDbIdObservationsPut():
 * org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest
 * org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestListActivity
 *
 * studiesStudyDbIdObservationunitsPut():
 * org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests
 * org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequestsListActivity
 *
 *
 * org.wheatgenetics.androidlibrarybuilder.R
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.ConfirmAlertDialog
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.ConfirmAlertDialog.Handler
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.Fragment
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.Utils
 *
 * org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest
 * org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequestAlertDialog
 * org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequestAlertDialog.Handler
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .SearchStudiesSearchResultsDbIdGetAlertDialog
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .SearchStudiesSearchResultsDbIdGetAlertDialog.Handler
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .SearchStudiesSearchResultsDbIdGetAlertDialog.Parameters
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.SeasonsGetAlertDialog
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.SeasonsGetAlertDialog.Handler
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.SeasonsGetAlertDialog.Parameters
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesGetAlertDialog
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesGetAlertDialog.Handler
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesGetAlertDialog.Parameters
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesStudyDbIdGetAlertDialog
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesStudyDbIdGetAlertDialog.Handler
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudiesStudyDbIdGetAlertDialog.Parameters
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudiesStudyDbIdObservationsGetAlertDialog
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudiesStudyDbIdObservationsGetAlertDialog.Handler
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudiesStudyDbIdObservationsGetAlertDialog.Parameters
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudiesStudyDbIdObservationunitsGetAlertDialog
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudiesStudyDbIdObservationunitsGetAlertDialog.Handler
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudiesStudyDbIdObservationunitsGetAlertDialog.Parameters
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudiesStudyDbIdObservationunitsPutAlertDialog
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudiesStudyDbIdObservationunitsPutAlertDialog.Handler
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudiesStudyDbIdObservationunitsPutAlertDialog.Parameters
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesStudyDbIdTableGetAlertDialog
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudiesStudyDbIdTableGetAlertDialog.Handler
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudiesStudyDbIdTableGetAlertDialog.Parameters
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog.Handler
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
 *     .StudyDbIdPagePageSizeAlertDialog.Parameters
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudytypesGetAlertDialog
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudytypesGetAlertDialog.Handler
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudytypesGetAlertDialog.Parameters
 */
public class Fragment extends org.wheatgenetics.androidlibrarybuilder.brapi1_3.Fragment
{
    // region Types
    @java.lang.SuppressWarnings({"UnnecessaryInterfaceModifier"}) public interface Helper
    {
        public abstract org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest
        getStudyLayoutRequest();

        public abstract void setStudyLayoutRequest(
        org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest studyLayoutRequest);


        public abstract org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest
        getNewObservationsRequest();

        public abstract void setNewObservationsRequest(
        org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest newObservationsRequest);


        public abstract org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests
        getNewObservationUnitRequests();

        public abstract void setNewObservationUnitRequests(
        org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests
        newObservationUnitRequests);
    }

    private class StudiesStudyDbIdLayoutsPutCallback
    extends org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.ObservationUnitPositionsResponse> {}

    private class StudiesStudyDbIdLayoutsGetCallback extends org.wheatgenetics
    .androidlibrarybuilder.brapi1_3.studies.Fragment.StudiesStudyDbIdLayoutsPutCallback
    {
        @java.lang.Override @androidx.annotation.RestrictTo(
        androidx.annotation.RestrictTo.Scope.SUBCLASSES) protected void handleSuccess(
        final io.swagger.client.model.ObservationUnitPositionsResponse result)
        {
            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                .Fragment.this.setStudyLayoutRequest(null == result ? null :
                    new org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest(result));
            super.handleSuccess(result);
        }
    }
    // endregion

    private static final int
        STUDY_LAYOUT_REQUEST_LIST_ACTIVITY_REQUEST_CODE          = 1,
        NEW_OBSERVATIONS_REQUEST_LIST_ACTIVITY_REQUEST_CODE      = 2,
        NEW_OBSERVATION_UNIT_REQUESTS_LIST_ACTIVITY_REQUEST_CODE = 3;

    // region Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.Helper helper;
    private io.swagger.client.api.StudiesApi                 studiesApiInstance = null; // lazy load

    // region searchStudiesPost() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
        io.swagger.client.model.SuccessfulSearchResponse>
            successfulSearchResponseCallbackInstance = null;                            // lazy load
    private org.wheatgenetics.brapi1_3.studies.StudySearchRequestAlertDialog
        studySearchRequestAlertDialogInstance = null;                                   // lazy load
    private io.swagger.client.model.StudySearchRequest studySearchRequestInstance = null;      // ll
    // endregion

    // region searchStudiesSearchResultsDbIdGet() and studiesGet() Field
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
        io.swagger.client.model.StudiesResponse> studiesResponseCallbackInstance = null;// lazy load
    // endregion

    // region searchStudiesSearchResultsDbIdGet() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
        .SearchStudiesSearchResultsDbIdGetAlertDialog
            searchStudiesSearchResultsDbIdGetAlertDialogInstance = null;                // lazy load
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
        .SearchStudiesSearchResultsDbIdGetAlertDialog.Parameters
            searchStudiesSearchResultsDbIdGetParametersInstance = null;                 // lazy load
    // endregion

    // region seasonsGet() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
        io.swagger.client.model.SeasonsResponse> seasonsResponseCallbackInstance = null;// lazy load
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.SeasonsGetAlertDialog
        seasonsGetAlertDialogInstance = null;                                           // lazy load
    private
        org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.SeasonsGetAlertDialog.Parameters
            seasonsGetAlertDialogParametersInstance = null;                             // lazy load
    // endregion

    // region studiesGet() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesGetAlertDialog
        studiesGetAlertDialogInstance = null;                                           // lazy load
    private
        org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesGetAlertDialog.Parameters
            studiesGetAlertDialogParametersInstance = null;                             // lazy load
    // endregion

    // region studiesStudyDbIdGet() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
        io.swagger.client.model.StudyResponse> studyResponseCallbackInstance = null;    // lazy load
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesStudyDbIdGetAlertDialog
        studiesStudyDbIdGetAlertDialogInstance = null;                                  // lazy load
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
        .StudiesStudyDbIdGetAlertDialog.Parameters studiesStudyDbIdGetParametersInstance = null;//ll
    // endregion

    // region studiesStudyDbIdGermplasmGet(), studiesStudyDbIdLayoutsGet(), studiesStudyDbIdLayoutsPut() and studiesStudyDbIdObservationvariablesGet() Field
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies                    // lazy load
        .StudyDbIdPagePageSizeAlertDialog.Parameters studyDbIdPagePageSizeParametersInstance = null;
    // endregion

    // region studiesStudyDbIdGermplasmGet() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
        io.swagger.client.model.GermplasmSummaryListResponse>
            germplasmSummaryListResponseCallbackInstance = null;                        // lazy load
    private
        org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog
            studiesStudyDbIdGermplasmGetAlertDialogInstance = null;                     // lazy load
    // endregion

    // region studiesStudyDbIdLayoutsGet() and studiesStudyDbIdLayoutsPut() Field
    private android.widget.Button studiesStudyDbIdLayoutsPutButton;
    // endregion

    // region studiesStudyDbIdLayoutsGet() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
        .StudiesStudyDbIdLayoutsGetCallback studiesStudyDbIdLayoutsGetCallbackInstance = null; // ll
    private
        org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog
            studiesStudyDbIdLayoutsGetAlertDialogInstance = null;                       // lazy load
    // endregion

    // region studiesStudyDbIdLayoutsPut() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
        .StudiesStudyDbIdLayoutsPutCallback studiesStudyDbIdLayoutsPutCallbackInstance = null; // ll
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.ConfirmAlertDialog
        studiesStudyDbIdLayoutsPutAlertDialogInstance = null;                           // lazy load
    private org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest studyLayoutRequest;
    private android.content.Intent studyLayoutRequestListIntentInstance = null;         // lazy load
    // endregion

    // region studiesStudyDbIdObservationsGet() and studiesStudyDbIdObservationsPut() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
        .StudiesStudyDbIdObservationsGetAlertDialog.Parameters
            studiesStudyDbIdObservationsGetParametersInstance = null;                   // lazy load
    private android.widget.Button studiesStudyDbIdObservationsPutButton;
    // endregion

    // region studiesStudyDbIdObservationsGet() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
        io.swagger.client.model.ObservationsResponse>
            observationsResponseCallbackInstance = null;                                // lazy load
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
        .StudiesStudyDbIdObservationsGetAlertDialog
            studiesStudyDbIdObservationsGetAlertDialogInstance = null;                  // lazy load
    // endregion

    // region studiesStudyDbIdObservationsPut() and studiesStudyDbIdTablePost() Field
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
        io.swagger.client.model.NewObservationDbIdsResponse>
            newObservationDbIdsResponseCallbackInstance = null;                         // lazy load
    // endregion

    // region studiesStudyDbIdObservationsPut() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.ConfirmAlertDialog
        studiesStudyDbIdObservationsPutAlertDialogInstance = null;                      // lazy load
    private org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest newObservationsRequest;
    private android.content.Intent newObservationsRequestListIntentInstance = null;     // lazy load
    // endregion

    // region studiesStudyDbIdObservationunitsGet() and studiesStudyDbIdObservationunitsPut() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
        .StudiesStudyDbIdObservationunitsGetAlertDialog.Parameters
            studiesStudyDbIdObservationunitsGetParametersInstance = null;               // lazy load
    private android.widget.Button studiesStudyDbIdObservationunitsPutButton;
    // endregion

    // region studiesStudyDbIdObservationunitsGet() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
        io.swagger.client.model.ObservationUnitsResponse1>
            observationUnitsResponse1CallbackInstance = null;                           // lazy load
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
        .StudiesStudyDbIdObservationunitsGetAlertDialog
            studiesStudyDbIdObservationunitsGetAlertDialogInstance = null;              // lazy load
    // endregion

    // region studiesStudyDbIdObservationunitsPut() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
        io.swagger.client.model.NewObservationUnitDbIdsResponse>
            newObservationUnitDbIdsResponseCallbackInstance = null;                     // lazy load
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
        .StudiesStudyDbIdObservationunitsPutAlertDialog.Parameters
            studiesStudyDbIdObservationunitsPutParametersInstance = null;               // lazy load
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
        .StudiesStudyDbIdObservationunitsPutAlertDialog
            studiesStudyDbIdObservationunitsPutAlertDialogInstance = null;              // lazy load
    private org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests
        newObservationUnitRequests;
    private android.content.Intent newObservationUnitRequestsListIntentInstance = null; // lazy load
    // endregion

    // region studiesStudyDbIdObservationvariablesGet() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
        io.swagger.client.model.StudyObservationVariablesResponse>
            studyObservationVariablesResponseCallbackInstance = null;                   // lazy load
    private
        org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog
            studiesStudyDbIdObservationvariablesGetAlertDialogInstance = null;          // lazy load
    // endregion

    // region studiesStudyDbIdTableGet() and studiesStudyDbIdTablePost() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
        .StudiesStudyDbIdTableGetAlertDialog.Parameters
            studiesStudyDbIdTableGetParametersInstance = null;                          // lazy load
    private android.widget.Button studiesStudyDbIdTablePostButton;
    // endregion

    // region studiesStudyDbIdTableGet() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
        java.lang.String> stringCallbackInstance = null;                                // lazy load
    private
        org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesStudyDbIdTableGetAlertDialog
            studiesStudyDbIdTableGetAlertDialogInstance = null;                         // lazy load
    // endregion

    // region studiesStudyDbIdTablePost() Fields
    private org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequestAlertDialog
        newObservationsTableRequestAlertDialogInstance = null;                          // lazy load
    private org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest
        newObservationsTableRequestInstance = null;                                     // lazy load
    // endregion

    // region studytypesGet() Fields
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
        io.swagger.client.model.StudyTypesResponse> studyTypesResponseCallbackInstance = null; // ll
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudytypesGetAlertDialog
        studytypesGetAlertDialogInstance = null;                                        // lazy load
    private
        org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudytypesGetAlertDialog.Parameters
            studytypesGetParametersInstance = null;                                     // lazy load
    // endregion
    // endregion

    // region Private Methods
    private io.swagger.client.api.StudiesApi studiesApi()
    {
        if (null == this.studiesApiInstance)
            this.studiesApiInstance = new io.swagger.client.api.StudiesApi(this.apiClient());
        return this.studiesApiInstance;
    }

    private void setPutOrPostButtonEnabled(
    @androidx.annotation.Nullable final android.widget.Button putOrPostButton,
                                  final boolean               enabled        )
    {
        if (null != putOrPostButton)
        {
            final android.app.Activity activity = this.getActivity();
            if (null != activity) activity.runOnUiThread(new java.lang.Runnable()
                { @java.lang.Override public void run() { putOrPostButton.setEnabled(enabled); } });
        }
    }

    // region searchStudiesPost() Private Methods
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.SuccessfulSearchResponse> successfulSearchResponseCallback()
    {
        if (null == this.successfulSearchResponseCallbackInstance)
            this.successfulSearchResponseCallbackInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
                    io.swagger.client.model.SuccessfulSearchResponse>() {};
        return this.successfulSearchResponseCallbackInstance;
    }

    private void searchStudiesPost()
    {
        try
        {
            this.studiesApi().searchStudiesPostAsync(
                /* body          => */ this.studySearchRequestInstance        ,
                /* authorization => */ this.authorization                   (),
                /* callback      => */ this.successfulSearchResponseCallback());
        }
        catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private org.wheatgenetics.brapi1_3.studies.StudySearchRequestAlertDialog
    studySearchRequestAlertDialog()
    {
        if (null == this.studySearchRequestAlertDialogInstance)
            this.studySearchRequestAlertDialogInstance =
                new org.wheatgenetics.brapi1_3.studies.StudySearchRequestAlertDialog(
                    this.getActivity(),
                    new org.wheatgenetics.brapi1_3.studies.StudySearchRequestAlertDialog.Handler()
                    {
                        @java.lang.Override public void handleDone()
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                .Fragment.this.searchStudiesPost();
                        }
                    });
        return this.studySearchRequestAlertDialogInstance;
    }

    private io.swagger.client.model.StudySearchRequest studySearchRequest()
    {
        if (null == this.studySearchRequestInstance) this.studySearchRequestInstance =
            new io.swagger.client.model.StudySearchRequest();
        return this.studySearchRequestInstance;
    }

    private void showStudySearchRequestAlertDialog()
    { this.studySearchRequestAlertDialog().show(this.studySearchRequest()); }
    // endregion

    // region searchStudiesSearchResultsDbIdGet() and studiesGet() Private Method
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.StudiesResponse> studiesResponseCallback()
    {
        if (null == this.studiesResponseCallbackInstance) this.studiesResponseCallbackInstance =
            new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
                io.swagger.client.model.StudiesResponse>() {};
        return this.studiesResponseCallbackInstance;
    }
    // endregion

    // region searchStudiesSearchResultsDbIdGet() Private Methods
    private void searchStudiesSearchResultsDbIdGet()
    {
        if (null != this.searchStudiesSearchResultsDbIdGetParametersInstance)
            try
            {
                this.studiesApi().searchStudiesSearchResultsDbIdGetAsync(
                    /* searchResultsDbId => */ this
                        .searchStudiesSearchResultsDbIdGetParametersInstance.getSearchResultsDbId(),
                    /* page => */
                        this.searchStudiesSearchResultsDbIdGetParametersInstance.getPage(),
                    /* pageSize => */
                        this.searchStudiesSearchResultsDbIdGetParametersInstance.getPageSize(),
                    /* authorization => */ this.authorization          (),
                    /* callback      => */ this.studiesResponseCallback());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
    .SearchStudiesSearchResultsDbIdGetAlertDialog searchStudiesSearchResultsDbIdGetAlertDialog()
    {
        if (null == this.searchStudiesSearchResultsDbIdGetAlertDialogInstance)
            this.searchStudiesSearchResultsDbIdGetAlertDialogInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .SearchStudiesSearchResultsDbIdGetAlertDialog(this.getActivity(),
                        new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                            .SearchStudiesSearchResultsDbIdGetAlertDialog.Handler()
                            {
                                @java.lang.Override public void handleDone()
                                {
                                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                        .Fragment.this.searchStudiesSearchResultsDbIdGet();
                                }
                            });
        return this.searchStudiesSearchResultsDbIdGetAlertDialogInstance;
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
    .SearchStudiesSearchResultsDbIdGetAlertDialog.Parameters
    searchStudiesSearchResultsDbIdGetParameters()
    {
        if (null == this.searchStudiesSearchResultsDbIdGetParametersInstance)
            this.searchStudiesSearchResultsDbIdGetParametersInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .SearchStudiesSearchResultsDbIdGetAlertDialog.Parameters();
        return this.searchStudiesSearchResultsDbIdGetParametersInstance;
    }

    private void showSearchStudiesSearchResultsDbIdGetAlertDialog()
    {
        this.searchStudiesSearchResultsDbIdGetAlertDialog().show(
            this.searchStudiesSearchResultsDbIdGetParameters());
    }
    // endregion

    // region seasonsGet() Private Methods
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.SeasonsResponse> seasonsResponseCallback()
    {
        if (null == this.seasonsResponseCallbackInstance) this.seasonsResponseCallbackInstance =
            new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
                io.swagger.client.model.SeasonsResponse>() {};
        return this.seasonsResponseCallbackInstance;
    }

    private void seasonsGet()
    {
        if (null != this.seasonsGetAlertDialogParametersInstance)
            try
            {
                this.studiesApi().seasonsGetAsync(
                    /* seasonDbId => */
                        this.seasonsGetAlertDialogParametersInstance.getSeasonDbId(),
                    /* season   => */ this.seasonsGetAlertDialogParametersInstance.getSeason  (),
                    /* year     => */ this.seasonsGetAlertDialogParametersInstance.getYear    (),
                    /* page     => */ this.seasonsGetAlertDialogParametersInstance.getPage    (),
                    /* pageSize => */ this.seasonsGetAlertDialogParametersInstance.getPageSize(),
                    /* authorization => */ this.authorization          (),
                    /* callback      => */ this.seasonsResponseCallback());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.SeasonsGetAlertDialog
    seasonsGetAlertDialog()
    {
        if (null == this.seasonsGetAlertDialogInstance) this.seasonsGetAlertDialogInstance =
            new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.SeasonsGetAlertDialog(
                this.getActivity(), new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .SeasonsGetAlertDialog.Handler()
                    {
                        @java.lang.Override public void handleDone()
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                .Fragment.this.seasonsGet();
                        }
                    });
        return this.seasonsGetAlertDialogInstance;
    }

    private
    org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.SeasonsGetAlertDialog.Parameters
    seasonsGetAlertDialogParameters()
    {
        if (null == this.seasonsGetAlertDialogParametersInstance)
            this.seasonsGetAlertDialogParametersInstance = new org.wheatgenetics
                .androidlibrarybuilder.brapi1_3.studies.SeasonsGetAlertDialog.Parameters();
        return this.seasonsGetAlertDialogParametersInstance;
    }

    private void showSeasonsGetAlertDialog()
    { this.seasonsGetAlertDialog().show(this.seasonsGetAlertDialogParameters()); }
    // endregion

    // region studiesGet() Private Methods
    private void studiesGet()
    {
        if (null != this.studiesGetAlertDialogParametersInstance)
            try
            {
                this.studiesApi().studiesGetAsync(
                    /* commonCropName => */
                        this.studiesGetAlertDialogParametersInstance.getCommonCropName(),
                    /* studyType     => */null,                             // deprecated
                    /* studyTypeDbId => */
                        this.studiesGetAlertDialogParametersInstance.getStudyTypeDbId(),
                    /* programDbId => */
                        this.studiesGetAlertDialogParametersInstance.getProgramDbId(),
                    /* locationDbId => */
                        this.studiesGetAlertDialogParametersInstance.getLocationDbId(),
                    /* seasonDbId => */
                        this.studiesGetAlertDialogParametersInstance.getSeasonDbId(),
                    /* trialDbId => */ this.studiesGetAlertDialogParametersInstance.getTrialDbId(),
                    /* studyDbId => */ this.studiesGetAlertDialogParametersInstance.getStudyDbId(),
                    /* germplasmDbIds           => */null,             // deprecated
                    /* observationVariableDbIds => */null,       // deprecated
                    /* active    => */ this.studiesGetAlertDialogParametersInstance.getActive   (),
                    /* sortBy    => */ this.studiesGetAlertDialogParametersInstance.getSortBy   (),
                    /* sortOrder => */ this.studiesGetAlertDialogParametersInstance.getSortOrder(),
                    /* page      => */ this.studiesGetAlertDialogParametersInstance.getPage     (),
                    /* pageSize  => */ this.studiesGetAlertDialogParametersInstance.getPageSize (),
                    /* authorization => */ this.authorization          (),
                    /* callback      => */ this.studiesResponseCallback());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesGetAlertDialog
    studiesGetAlertDialog()
    {
        if (null == this.studiesGetAlertDialogInstance) this.studiesGetAlertDialogInstance =
            new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesGetAlertDialog(
                this.getActivity(), new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .StudiesGetAlertDialog.Handler()
                    {
                        @java.lang.Override public void handleDone()
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                .Fragment.this.studiesGet();
                        }
                    });
        return this.studiesGetAlertDialogInstance;
    }

    private
    org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesGetAlertDialog.Parameters
    studiesGetAlertDialogParameters()
    {
        if (null == this.studiesGetAlertDialogParametersInstance)
            this.studiesGetAlertDialogParametersInstance = new org.wheatgenetics
                .androidlibrarybuilder.brapi1_3.studies.StudiesGetAlertDialog.Parameters();
        return this.studiesGetAlertDialogParametersInstance;
    }

    private void showStudiesGetAlertDialog()
    { this.studiesGetAlertDialog().show(this.studiesGetAlertDialogParameters());}
    // endregion

    // region studiesStudyDbIdGet() Private Methods
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.StudyResponse> studyResponseCallback()
    {
        if (null == this.studyResponseCallbackInstance) this.studyResponseCallbackInstance =
            new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
                io.swagger.client.model.StudyResponse>() {};
        return this.studyResponseCallbackInstance;
    }

    private void studiesStudyDbIdGet()
    {
        if (null != this.studiesStudyDbIdGetParametersInstance)
            try
            {
                this.studiesApi().studiesStudyDbIdGetAsync(
                    /* studyDbId => */ this.studiesStudyDbIdGetParametersInstance.getStudyDbId(),
                    /* authorization => */ this.authorization        (),
                    /* callback      => */ this.studyResponseCallback());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesStudyDbIdGetAlertDialog
    studiesStudyDbIdGetAlertDialog()
    {
        if (null == this.studiesStudyDbIdGetAlertDialogInstance)
            this.studiesStudyDbIdGetAlertDialogInstance = new org.wheatgenetics
                .androidlibrarybuilder.brapi1_3.studies.StudiesStudyDbIdGetAlertDialog(
                this.getActivity(), new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .StudiesStudyDbIdGetAlertDialog.Handler()
                    {
                        @java.lang.Override public void handleDone()
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                .Fragment.this.studiesStudyDbIdGet();
                        }
                    });
        return this.studiesStudyDbIdGetAlertDialogInstance;
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
    .StudiesStudyDbIdGetAlertDialog.Parameters studiesStudyDbIdGetParameters()
    {
        if (null == this.studiesStudyDbIdGetParametersInstance)
            this.studiesStudyDbIdGetParametersInstance = new org.wheatgenetics
                .androidlibrarybuilder.brapi1_3.studies.StudiesStudyDbIdGetAlertDialog.Parameters();
        return this.studiesStudyDbIdGetParametersInstance;
    }

    private void showStudiesStudyDbIdGetAlertDialog()
    { this.studiesStudyDbIdGetAlertDialog().show(this.studiesStudyDbIdGetParameters()); }
    // endregion

    // region studiesStudyDbIdGermplasmGet(), studiesStudyDbIdLayoutsGet() and studiesStudyDbIdObservationvariablesGet() Private Method
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
    .StudyDbIdPagePageSizeAlertDialog.Parameters studyDbIdPagePageSizeParameters()
    {
        if (null == this.studyDbIdPagePageSizeParametersInstance)
            this.studyDbIdPagePageSizeParametersInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .StudyDbIdPagePageSizeAlertDialog.Parameters();
        return this.studyDbIdPagePageSizeParametersInstance;
    }
    // endregion

    // region studiesStudyDbIdGermplasmGet() Private Methods
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.GermplasmSummaryListResponse> germplasmSummaryListResponseCallback()
    {
        if (null == this.germplasmSummaryListResponseCallbackInstance)
            this.germplasmSummaryListResponseCallbackInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
                    io.swagger.client.model.GermplasmSummaryListResponse>() {};
        return this.germplasmSummaryListResponseCallbackInstance;
    }

    private void studiesStudyDbIdGermplasmGet()
    {
        if (null != this.studyDbIdPagePageSizeParametersInstance)
            try
            {
                this.studiesApi().studiesStudyDbIdGermplasmGetAsync(
                    /* studyDbId => */ this.studyDbIdPagePageSizeParametersInstance.getStudyDbId(),
                    /* page      => */ this.studyDbIdPagePageSizeParametersInstance.getPage     (),
                    /* pageSize  => */ this.studyDbIdPagePageSizeParametersInstance.getPageSize (),
                    /* authorization => */ this.authorization                       (),
                    /* callback      => */ this.germplasmSummaryListResponseCallback());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private
    org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog
    studiesStudyDbIdGermplasmGetAlertDialog()
    {
        if (null == this.studiesStudyDbIdGermplasmGetAlertDialogInstance)
            this.studiesStudyDbIdGermplasmGetAlertDialogInstance = new org.wheatgenetics
                .androidlibrarybuilder.brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog(
                    this.getActivity(), new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                        .StudyDbIdPagePageSizeAlertDialog.Handler()
                        {
                            @java.lang.Override public void handleDone()
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                    .Fragment.this.studiesStudyDbIdGermplasmGet();
                            }
                        },"StudiesApi.studiesStudyDbIdGermplasmGet()");
        return this.studiesStudyDbIdGermplasmGetAlertDialogInstance;
    }

    private void showStudiesStudyDbIdGermplasmGetAlertDialog()
    { this.studiesStudyDbIdGermplasmGetAlertDialog().show(this.studyDbIdPagePageSizeParameters()); }
    // endregion

    // region studiesStudyDbIdLayoutsGet() Private Methods
    private org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest getStudyLayoutRequest()
    { return null == this.helper ? null : this.helper.getStudyLayoutRequest(); }

    private void setStudiesStudyDbIdLayoutsPutButtonEnabled()
    {
        final boolean enabled;
        {
            final org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest
                actualStudyLayoutRequest = this.getStudyLayoutRequest();

            // noinspection SimplifiableConditionalExpression
            enabled = null == actualStudyLayoutRequest ?
                false : actualStudyLayoutRequest.size() > 0;
        }
        this.setPutOrPostButtonEnabled(this.studiesStudyDbIdLayoutsPutButton, enabled);
    }

    private void setStudyLayoutRequest(
    final org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest studyLayoutRequest)
    {
        if (null != this.helper) this.helper.setStudyLayoutRequest(studyLayoutRequest);
        this.setStudiesStudyDbIdLayoutsPutButtonEnabled();
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.ObservationUnitPositionsResponse> studiesStudyDbIdLayoutsGetCallback()
    {
        if (null == this.studiesStudyDbIdLayoutsGetCallbackInstance)
            this.studiesStudyDbIdLayoutsGetCallbackInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3
                    .studies.Fragment.StudiesStudyDbIdLayoutsGetCallback();
        return this.studiesStudyDbIdLayoutsGetCallbackInstance;
    }

    private void studiesStudyDbIdLayoutsGet()
    {
        if (null != this.studyDbIdPagePageSizeParametersInstance)
            try
            {
                this.studiesApi().studiesStudyDbIdLayoutsGetAsync(
                    /* studyDbId => */ this.studyDbIdPagePageSizeParametersInstance.getStudyDbId(),
                    /* page      => */ this.studyDbIdPagePageSizeParametersInstance.getPage     (),
                    /* pageSize  => */ this.studyDbIdPagePageSizeParametersInstance.getPageSize (),
                    /* authorization => */ this.authorization                     (),
                    /* callback      => */ this.studiesStudyDbIdLayoutsGetCallback());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private
    org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog
    studiesStudyDbIdLayoutsGetAlertDialog()
    {
        if (null == this.studiesStudyDbIdLayoutsGetAlertDialogInstance)
            this.studiesStudyDbIdLayoutsGetAlertDialogInstance = new org.wheatgenetics
                .androidlibrarybuilder.brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog(
                    this.getActivity(), new org.wheatgenetics.androidlibrarybuilder
                    .brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog.Handler()
                    {
                        @java.lang.Override public void handleDone()
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                .Fragment.this.studiesStudyDbIdLayoutsGet();
                        }
                    },"StudiesApi.studiesStudyDbIdLayoutsGet()");
        return this.studiesStudyDbIdLayoutsGetAlertDialogInstance;
    }

    private void showStudiesStudyDbIdLayoutsGetAlertDialog()
    { this.studiesStudyDbIdLayoutsGetAlertDialog().show(this.studyDbIdPagePageSizeParameters()); }
    // endregion

    // region studiesStudyDbIdLayoutsPut() Private Methods
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
    .Fragment.StudiesStudyDbIdLayoutsPutCallback studiesStudyDbIdLayoutsPutCallback()
    {
        if (null == this.studiesStudyDbIdLayoutsPutCallbackInstance)
            this.studiesStudyDbIdLayoutsPutCallbackInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .Fragment.StudiesStudyDbIdLayoutsPutCallback();
        return this.studiesStudyDbIdLayoutsPutCallbackInstance;
    }

    private void studiesStudyDbIdLayoutsPut()
    {
        this.setStudyLayoutRequest(this.studyLayoutRequest);
        if (null != this.studyDbIdPagePageSizeParametersInstance)
            try
            {
                this.studiesApi().studiesStudyDbIdLayoutsPutAsync(
                    /* studyDbId => */ this.studyDbIdPagePageSizeParametersInstance.getStudyDbId(),
                    /* body      => */ this.getStudyLayoutRequest()                               ,
                    /* authorization => */ this.authorization                                   (),
                    /* callback      => */ this.studiesStudyDbIdLayoutsPutCallback              ());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private java.lang.String getStudyLayoutRequestAsString()
    {
        return org.wheatgenetics.androidlibrarybuilder.brapi1_3.Utils.getNullableAsString(
            this.studyLayoutRequest);
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.ConfirmAlertDialog
    studiesStudyDbIdLayoutsPutAlertDialog()
    {
        if (null == this.studiesStudyDbIdLayoutsPutAlertDialogInstance)
            this.studiesStudyDbIdLayoutsPutAlertDialogInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.ConfirmAlertDialog(
                    this.getActivity(), new org.wheatgenetics
                    .androidlibrarybuilder.brapi1_3.ConfirmAlertDialog.Handler()
                    {
                        @java.lang.Override public void handleDone()
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3
                                .studies.Fragment.this.studiesStudyDbIdLayoutsPut();
                        }

                        @java.lang.Override public java.lang.String getConfirmTextViewText()
                        {
                            return org.wheatgenetics.androidlibrarybuilder.brapi1_3
                                .studies.Fragment.this.getStudyLayoutRequestAsString();
                        }
                    },"StudiesApi.studiesStudyDbIdLayoutsPut()");
        return this.studiesStudyDbIdLayoutsPutAlertDialogInstance;
    }

    private void showStudiesStudyDbIdLayoutsPutAlertDialog()
    { this.studiesStudyDbIdLayoutsPutAlertDialog().show(); }

    private void setStudyLayoutRequest(@androidx.annotation.Nullable final java.lang.String json)
    {
        if (null == json)
            this.studyLayoutRequest = null;
        else
        {
            final java.lang.String trimmedJson = json.trim();
            if (trimmedJson.length() <= 0)
                this.studyLayoutRequest = null;
            else
            {
                if (null == this.studyLayoutRequest) this.studyLayoutRequest =
                    new org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequest();
                this.studyLayoutRequest.fromJson(trimmedJson);
            }
        }
    }

    private android.content.Intent studyLayoutRequestListIntent()
    {
        if (null == this.studyLayoutRequestListIntentInstance)
            this.studyLayoutRequestListIntentInstance = new android.content.Intent(
                this.getActivity()                                                         ,
                org.wheatgenetics.brapi1_3.studies.slr.StudyLayoutRequestListActivity.class);
        return org.wheatgenetics.androidlibrary.mstrdtl.Utils.putJsonIntoIntent(
            this.getStudyLayoutRequest(), this.studyLayoutRequestListIntentInstance);
    }

    private void showStudyLayoutRequestListActivity()
    {
        this.startActivityForResult(
            /* intent      => */ this.studyLayoutRequestListIntent(),
            /* requestCode => */ org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                .STUDY_LAYOUT_REQUEST_LIST_ACTIVITY_REQUEST_CODE);
    }
    // endregion

    // region studiesStudyDbIdObservationsGet() Private Methods
    private org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest
    getNewObservationsRequest()
    { return null == this.helper ? null : this.helper.getNewObservationsRequest(); }

    private void setStudiesStudyDbIdObservationsPutButtonEnabled()
    {
        final boolean enabled;
        {
            final org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest
                newObservationsRequest = this.getNewObservationsRequest();

            // noinspection SimplifiableConditionalExpression
            enabled = null == newObservationsRequest ? false : newObservationsRequest.size() > 0;
        }
        this.setPutOrPostButtonEnabled(this.studiesStudyDbIdObservationsPutButton, enabled);
    }

    private void setNewObservationsRequest(
    final org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest newObservationsRequest)
    {
        if (null != this.helper) this.helper.setNewObservationsRequest(newObservationsRequest);
        this.setStudiesStudyDbIdObservationsPutButtonEnabled();
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.ObservationsResponse> observationsResponseCallback()
    {
        if (null == this.observationsResponseCallbackInstance)
            this.observationsResponseCallbackInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
                    io.swagger.client.model.ObservationsResponse>()
                    {
                        @java.lang.Override @androidx.annotation.RestrictTo(
                        androidx.annotation.RestrictTo.Scope.SUBCLASSES)
                        protected void handleSuccess(
                        final io.swagger.client.model.ObservationsResponse result)
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                                .this.setNewObservationsRequest(null == result ? null : new
                                    org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest(
                                        result));
                            super.handleSuccess(result);
                        }
                    };
        return this.observationsResponseCallbackInstance;
    }

    private void studiesStudyDbIdObservationsGet()
    {
        if (null != this.studiesStudyDbIdObservationsGetParametersInstance)
            try
            {
                this.studiesApi().studiesStudyDbIdObservationsGetAsync(
                    /* studyDbId => */
                        this.studiesStudyDbIdObservationsGetParametersInstance.getStudyDbId(),
                    /* observationVariableDbIds => */
                        this.studiesStudyDbIdObservationsGetParametersInstance
                            .getObservationVariableDbIds(),
                    /* page => */
                        this.studiesStudyDbIdObservationsGetParametersInstance.getPage(),
                    /* pageSize => */
                        this.studiesStudyDbIdObservationsGetParametersInstance.getPageSize(),
                    /* authorization => */ this.authorization               (),
                    /* callback      => */ this.observationsResponseCallback());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
    .StudiesStudyDbIdObservationsGetAlertDialog studiesStudyDbIdObservationsGetAlertDialog()
    {
        if (null == this.studiesStudyDbIdObservationsGetAlertDialogInstance)
            this.studiesStudyDbIdObservationsGetAlertDialogInstance = new org.wheatgenetics
                .androidlibrarybuilder.brapi1_3.studies.StudiesStudyDbIdObservationsGetAlertDialog(
                    this.getActivity(), new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .StudiesStudyDbIdObservationsGetAlertDialog.Handler()
                    {
                        @java.lang.Override public void handleDone()
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                .Fragment.this.studiesStudyDbIdObservationsGet();
                        }
                    });
        return this.studiesStudyDbIdObservationsGetAlertDialogInstance;
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
    .StudiesStudyDbIdObservationsGetAlertDialog.Parameters
    studiesStudyDbIdObservationsGetParameters()
    {
        if (null == this.studiesStudyDbIdObservationsGetParametersInstance)
            this.studiesStudyDbIdObservationsGetParametersInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .StudiesStudyDbIdObservationsGetAlertDialog.Parameters();
        return this.studiesStudyDbIdObservationsGetParametersInstance;
    }

    private void showStudiesStudyDbIdObservationsGetAlertDialog()
    {
        this.studiesStudyDbIdObservationsGetAlertDialog().show(
            this.studiesStudyDbIdObservationsGetParameters());
    }
    // endregion

    // region studiesStudyDbIdObservationsPut() and studiesStudyDbIdTablePost() Private Method
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.NewObservationDbIdsResponse> newObservationDbIdsResponseCallback()
    {
        if (null == this.newObservationDbIdsResponseCallbackInstance)
            this.newObservationDbIdsResponseCallbackInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
                    io.swagger.client.model.NewObservationDbIdsResponse>() {};
        return this.newObservationDbIdsResponseCallbackInstance;
    }
    // endregion

    // region studiesStudyDbIdObservationsPut() Private Methods
    private void studiesStudyDbIdObservationsPut()
    {
        this.setNewObservationsRequest(this.newObservationsRequest);
        if (null != this.studiesStudyDbIdObservationsGetParametersInstance)
            try
            {
                this.studiesApi().studiesStudyDbIdObservationsPutAsync(
                    /* studyDbId => */
                        this.studiesStudyDbIdObservationsGetParametersInstance.getStudyDbId(),
                    /* body          => */ this.getNewObservationsRequest          (),
                    /* authorization => */ this.authorization                      (),
                    /* callback      => */ this.newObservationDbIdsResponseCallback());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private java.lang.String getNewObservationsRequestAsString()
    {
        return org.wheatgenetics.androidlibrarybuilder.brapi1_3.Utils.getNullableAsString(
            this.newObservationsRequest);
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.ConfirmAlertDialog
    studiesStudyDbIdObservationsPutAlertDialog()
    {
        if (null == this.studiesStudyDbIdObservationsPutAlertDialogInstance)
            this.studiesStudyDbIdObservationsPutAlertDialogInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.ConfirmAlertDialog(
                    this.getActivity(), new org.wheatgenetics
                    .androidlibrarybuilder.brapi1_3.BaseConfirmAlertDialog.Handler()
                    {
                        @java.lang.Override public void handleDone()
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3
                                .studies.Fragment.this.studiesStudyDbIdObservationsPut();
                        }

                        @java.lang.Override public java.lang.String getConfirmTextViewText()
                        {
                            return org.wheatgenetics.androidlibrarybuilder.brapi1_3
                                .studies.Fragment.this.getNewObservationsRequestAsString();
                        }
                    },"StudiesApi.studiesStudyDbIdObservationsPut()");
        return this.studiesStudyDbIdObservationsPutAlertDialogInstance;
    }

    private void showStudiesStudyDbIdObservationsPutAlertDialog()
    { this.studiesStudyDbIdObservationsPutAlertDialog().show(); }

    private void setNewObservationsRequest(
    @androidx.annotation.Nullable final java.lang.String json)
    {
        if (null == json)
            this.newObservationsRequest = null;
        else
        {
            final java.lang.String trimmedJson = json.trim();
            if (trimmedJson.length() <= 0)
                this.newObservationsRequest = null;
            else
            {
                if (null == this.newObservationsRequest) this.newObservationsRequest =
                    new org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequest();
                this.newObservationsRequest.fromJson(trimmedJson);
            }
        }
    }

    private android.content.Intent newObservationsRequestListIntent()
    {
        if (null == this.newObservationsRequestListIntentInstance)
            this.newObservationsRequestListIntentInstance = new android.content.Intent(
                this.getActivity()                                                             ,
                org.wheatgenetics.brapi1_3.studies.nor.NewObservationsRequestListActivity.class);
        return org.wheatgenetics.androidlibrary.mstrdtl.Utils.putJsonIntoIntent(
            this.getNewObservationsRequest(), this.newObservationsRequestListIntentInstance);
    }

    private void showNewObservationsRequestListActivity()
    {
        this.startActivityForResult(
            /* intent      => */ this.newObservationsRequestListIntent(),
            /* requestCode => */ org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                .NEW_OBSERVATIONS_REQUEST_LIST_ACTIVITY_REQUEST_CODE);
    }
    // endregion

    // region studiesStudyDbIdObservationunitsGet() Private Methods
    private org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests
    getNewObservationUnitRequests()
    { return null == this.helper ? null : this.helper.getNewObservationUnitRequests(); }

    private void setStudiesStudyDbIdObservationunitsPutButtonEnabled()
    {
        final boolean enabled;
        {
            final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests
                newObservationUnitRequests = this.getNewObservationUnitRequests();

            // noinspection SimplifiableConditionalExpression
            enabled = null == newObservationUnitRequests ?
                false : newObservationUnitRequests.size() > 0;
        }
        this.setPutOrPostButtonEnabled(this.studiesStudyDbIdObservationunitsPutButton, enabled);
    }

    private void setNewObservationUnitRequests(final
    org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests newObservationUnitRequests)
    {
        if (null != this.helper)
            this.helper.setNewObservationUnitRequests(newObservationUnitRequests);
        this.setStudiesStudyDbIdObservationunitsPutButtonEnabled();
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.ObservationUnitsResponse1> observationUnitsResponse1Callback()
    {
        if (null == this.observationUnitsResponse1CallbackInstance)
            this.observationUnitsResponse1CallbackInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
                io.swagger.client.model.ObservationUnitsResponse1>()
                {
                    @java.lang.Override @androidx.annotation.RestrictTo(
                    androidx.annotation.RestrictTo.Scope.SUBCLASSES) protected void handleSuccess(
                    final io.swagger.client.model.ObservationUnitsResponse1 result)
                    {
                        org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.this
                            .setNewObservationUnitRequests(null == result ? null : new
                                org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests(
                                    result));
                        super.handleSuccess(result);
                    }
                };
        return this.observationUnitsResponse1CallbackInstance;
    }

    private void studiesStudyDbIdObservationunitsGet()
    {
        if (null != this.studiesStudyDbIdObservationunitsGetParametersInstance)
            try
            {
                this.studiesApi().studiesStudyDbIdObservationunitsGetAsync(
                    /* studyDbId => */
                        this.studiesStudyDbIdObservationunitsGetParametersInstance.getStudyDbId(),
                    /* observationLevel => */
                        this.studiesStudyDbIdObservationunitsGetParametersInstance
                            .getObservationLevel(),
                    /* page => */
                        this.studiesStudyDbIdObservationunitsGetParametersInstance.getPage(),
                    /* pageSize => */
                        this.studiesStudyDbIdObservationunitsGetParametersInstance.getPageSize(),
                    /* authorization => */ this.authorization                    (),
                    /* callback      => */ this.observationUnitsResponse1Callback());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
    .StudiesStudyDbIdObservationunitsGetAlertDialog studiesStudyDbIdObservationunitsGetAlertDialog()
    {
        if (null == this.studiesStudyDbIdObservationunitsGetAlertDialogInstance)
            this.studiesStudyDbIdObservationunitsGetAlertDialogInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .StudiesStudyDbIdObservationunitsGetAlertDialog(this.getActivity(),
                        new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                        .StudiesStudyDbIdObservationunitsGetAlertDialog.Handler()
                        {
                            @java.lang.Override public void handleDone()
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                    .Fragment.this.studiesStudyDbIdObservationunitsGet();
                            }
                        });
        return this.studiesStudyDbIdObservationunitsGetAlertDialogInstance;
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
    .StudiesStudyDbIdObservationunitsGetAlertDialog.Parameters
    studiesStudyDbIdObservationunitsGetParameters()
    {
        if (null == this.studiesStudyDbIdObservationunitsGetParametersInstance)
            this.studiesStudyDbIdObservationunitsGetParametersInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .StudiesStudyDbIdObservationunitsGetAlertDialog.Parameters();
        return this.studiesStudyDbIdObservationunitsGetParametersInstance;
    }

    private void showStudiesStudyDbIdObservationUnitsGetAlertDialog()
    {
        this.studiesStudyDbIdObservationunitsGetAlertDialog().show(
            this.studiesStudyDbIdObservationunitsGetParameters());
    }
    // endregion

    // region studiesStudyDbIdObservationunitsPut() Private Methods
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.NewObservationUnitDbIdsResponse>
    newObservationUnitDbIdsResponseCallback()
    {
        if (null == this.newObservationUnitDbIdsResponseCallbackInstance)
            this.newObservationUnitDbIdsResponseCallbackInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
                    io.swagger.client.model.NewObservationUnitDbIdsResponse>() {};
        return this.newObservationUnitDbIdsResponseCallbackInstance;
    }

    private void studiesStudyDbIdObservationunitsPut()
    {
        this.setNewObservationUnitRequests(this.newObservationUnitRequests);
        final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests
            newObservationUnitRequests = this.getNewObservationUnitRequests();
        if (null != this.studiesStudyDbIdObservationunitsGetParametersInstance
        &&  null != newObservationUnitRequests
        &&  null != this.studiesStudyDbIdObservationunitsPutParametersInstance)
        {
            final org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests
                populatedNewObservationUnitRequests =
                    new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests(
                        newObservationUnitRequests                                                ,
                        this.studiesStudyDbIdObservationunitsPutParametersInstance.getOperator  (),
                        this.studiesStudyDbIdObservationunitsPutParametersInstance.getUploadedBy());
            try
            {
                this.studiesApi().studiesStudyDbIdObservationunitsPutAsync(
                    /* studyDbId => */
                        this.studiesStudyDbIdObservationunitsGetParametersInstance.getStudyDbId(),
                    /* body          => */ populatedNewObservationUnitRequests.getList (),
                    /* authorization => */ this.authorization                          (),
                    /* callback      => */ this.newObservationUnitDbIdsResponseCallback());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
        }
    }

    private java.lang.String getNewObservationUnitRequestsAsString()
    {
        return org.wheatgenetics.androidlibrarybuilder.brapi1_3.Utils.getNullableAsString(
            this.newObservationUnitRequests);
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
    .StudiesStudyDbIdObservationunitsPutAlertDialog studiesStudyDbIdObservationunitsPutAlertDialog()
    {
        if (null == this.studiesStudyDbIdObservationunitsPutAlertDialogInstance)
            this.studiesStudyDbIdObservationunitsPutAlertDialogInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                .StudiesStudyDbIdObservationunitsPutAlertDialog(this.getActivity(),
                    new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .StudiesStudyDbIdObservationunitsPutAlertDialog.Handler()
                    {
                        @java.lang.Override public void handleDone()
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                .Fragment.this.studiesStudyDbIdObservationunitsPut();
                        }

                        @java.lang.Override public java.lang.String getConfirmTextViewText()
                        {
                            return org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                .Fragment.this.getNewObservationUnitRequestsAsString();
                        }
                    });
        return this.studiesStudyDbIdObservationunitsPutAlertDialogInstance;
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
    .StudiesStudyDbIdObservationunitsPutAlertDialog.Parameters
    studiesStudyDbIdObservationunitsPutParameters()
    {
        if (null == this.studiesStudyDbIdObservationunitsPutParametersInstance)
            this.studiesStudyDbIdObservationunitsPutParametersInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .StudiesStudyDbIdObservationunitsPutAlertDialog.Parameters();
        return this.studiesStudyDbIdObservationunitsPutParametersInstance;
    }

    private void showStudiesStudyDbIdObservationunitsPutAlertDialog()
    {
        this.studiesStudyDbIdObservationunitsPutAlertDialog().show(
            this.studiesStudyDbIdObservationunitsPutParameters());
    }

    private void setNewObservationUnitRequests(
    @androidx.annotation.Nullable final java.lang.String json)
    {
        if (null == json)
            this.newObservationUnitRequests = null;
        else
        {
            final java.lang.String trimmedJson = json.trim();
            if (trimmedJson.length() <= 0)
                this.newObservationUnitRequests = null;
            else
            {
                if (null == this.newObservationUnitRequests) this.newObservationUnitRequests =
                    new org.wheatgenetics.brapi1_3.studies.nour.NewObservationUnitRequests();
                this.newObservationUnitRequests.fromJson(trimmedJson);
            }
        }
    }

    private android.content.Intent newObservationUnitRequestsListIntent()
    {
        if (null == this.newObservationUnitRequestsListIntentInstance)
            this.newObservationUnitRequestsListIntentInstance = new android.content.Intent(
                this.getActivity(), org.wheatgenetics.brapi1_3.studies
                    .nour.NewObservationUnitRequestsListActivity.class);
        return org.wheatgenetics.androidlibrary.mstrdtl.Utils.putJsonIntoIntent(
            this.getNewObservationUnitRequests()             ,
            this.newObservationUnitRequestsListIntentInstance);
    }

    private void showNewObservationUnitRequestsListActivity()
    {
        this.startActivityForResult(
            /* intent      => */ this.newObservationUnitRequestsListIntent(),
            /* requestCode => */ org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                .NEW_OBSERVATION_UNIT_REQUESTS_LIST_ACTIVITY_REQUEST_CODE);
    }
    // endregion

    // region studiesStudyDbIdObservationvariablesGet() Private Methods
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.StudyObservationVariablesResponse>
    studyObservationVariablesResponseCallback()
    {
        if (null == this.studyObservationVariablesResponseCallbackInstance)
            this.studyObservationVariablesResponseCallbackInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
                    io.swagger.client.model.StudyObservationVariablesResponse>() {};
        return this.studyObservationVariablesResponseCallbackInstance;
    }

    private void studiesStudyDbIdObservationvariablesGet()
    {
        if (null != this.studyDbIdPagePageSizeParametersInstance)
            try
            {
                this.studiesApi().studiesStudyDbIdObservationvariablesGetAsync(
                    /* studyDbId => */ this.studyDbIdPagePageSizeParametersInstance.getStudyDbId(),
                    /* page      => */ this.studyDbIdPagePageSizeParametersInstance.getPage     (),
                    /* pageSize  => */ this.studyDbIdPagePageSizeParametersInstance.getPageSize (),
                    /* authorization => */ this.authorization                            (),
                    /* callback      => */ this.studyObservationVariablesResponseCallback());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private
    org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog
    studiesStudyDbIdObservationvariablesGetAlertDialog()
    {
        if (null == this.studiesStudyDbIdObservationvariablesGetAlertDialogInstance)
            this.studiesStudyDbIdObservationvariablesGetAlertDialogInstance = new org.wheatgenetics
                .androidlibrarybuilder.brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog(
                    this.getActivity(), new org.wheatgenetics.androidlibrarybuilder
                    .brapi1_3.studies.StudyDbIdPagePageSizeAlertDialog.Handler()
                    {
                        @java.lang.Override public void handleDone()
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                .Fragment.this.studiesStudyDbIdObservationvariablesGet();
                        }
                    },"StudiesApi.studiesStudyDbIdObservationvariablesGet()");
        return this.studiesStudyDbIdObservationvariablesGetAlertDialogInstance;
    }

    private void showStudiesStudyDbIdObservationvariablesGetAlertDialog()
    {
        this.studiesStudyDbIdObservationvariablesGetAlertDialog().show(
            this.studyDbIdPagePageSizeParameters());
    }
    // endregion

    // region studiesStudyDbIdTableGet() Private Methods
    private void enableStudiesStudyDbIdTablePostButton()
    { this.setPutOrPostButtonEnabled(this.studiesStudyDbIdTablePostButton,true); }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    java.lang.String> stringCallback()
    {
        if (null == this.stringCallbackInstance) this.stringCallbackInstance =
            new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
            java.lang.String>()
            {
                @java.lang.Override @androidx.annotation.RestrictTo(
                androidx.annotation.RestrictTo.Scope.SUBCLASSES) protected void handleSuccess(
                final java.lang.String result)
                {
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.
                        Fragment.this.enableStudiesStudyDbIdTablePostButton();
                    super.handleSuccess(result);
                }
            };
        return this.stringCallbackInstance;
    }

    private void studiesStudyDbIdTableGet()
    {
        if (null != this.studiesStudyDbIdTableGetParametersInstance)
            try
            {
                this.studiesApi().studiesStudyDbIdTableGetAsync(
                    /* studyDbId => */
                        this.studiesStudyDbIdTableGetParametersInstance.getStudyDbId(),
                    /* format => */ this.studiesStudyDbIdTableGetParametersInstance.getFormat(),
                    /* authorization => */ this.authorization (),
                    /* callback      => */ this.stringCallback());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private
    org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudiesStudyDbIdTableGetAlertDialog
    studiesStudyDbIdTableGetAlertDialog()
    {
        if (null == this.studiesStudyDbIdTableGetAlertDialogInstance)
            this.studiesStudyDbIdTableGetAlertDialogInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .StudiesStudyDbIdTableGetAlertDialog(this.getActivity(),
                        new org.wheatgenetics.androidlibrarybuilder.brapi1_3
                        .studies.StudiesStudyDbIdTableGetAlertDialog.Handler()
                        {
                            @java.lang.Override public void handleDone()
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                    .Fragment.this.studiesStudyDbIdTableGet();
                            }
                        });
        return this.studiesStudyDbIdTableGetAlertDialogInstance;
    }

    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
    .StudiesStudyDbIdTableGetAlertDialog.Parameters studiesStudyDbIdTableGetParameters()
    {
        if (null == this.studiesStudyDbIdTableGetParametersInstance)
            this.studiesStudyDbIdTableGetParametersInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                    .StudiesStudyDbIdTableGetAlertDialog.Parameters();
        return this.studiesStudyDbIdTableGetParametersInstance;
    }

    private void showStudiesStudyDbIdTableGetAlertDialog()
    { this.studiesStudyDbIdTableGetAlertDialog().show(this.studiesStudyDbIdTableGetParameters()); }
    // endregion

    // region studiesStudyDbIdTablePost() Private Methods
    private void studiesStudyDbIdTablePost()
    {
        if (null != this.studiesStudyDbIdTableGetParametersInstance
        &&  null != this.newObservationsTableRequestInstance       )
            try
            {
                this.studiesApi().studiesStudyDbIdTablePostAsync(
                    /* studyDbId => */
                        this.studiesStudyDbIdTableGetParametersInstance.getStudyDbId(),
                    /* body => */ this.newObservationsTableRequestInstance,
                    /* authorization => */ this.authorization                      (),
                    /* callback      => */ this.newObservationDbIdsResponseCallback());
            }
        catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequestAlertDialog
    newObservationsTableRequestAlertDialog()
    {
        if (null == this.newObservationsTableRequestAlertDialogInstance)
            this.newObservationsTableRequestAlertDialogInstance =
                new org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequestAlertDialog(
                    this.getActivity(), new org.wheatgenetics.brapi1_3.studies
                    .NewObservationsTableRequestAlertDialog.Handler()
                    {
                        @java.lang.Override public void handleDone()
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                .Fragment.this.studiesStudyDbIdTablePost();
                        }
                    });
        return this.newObservationsTableRequestAlertDialogInstance;
    }

    private org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest
    newObservationsTableRequest()
    {
        if (null == this.newObservationsTableRequestInstance)
            this.newObservationsTableRequestInstance =
                new org.wheatgenetics.brapi1_3.studies.NewObservationsTableRequest();
        return this.newObservationsTableRequestInstance;
    }

    private void showNewObservationsTableRequestAlertDialog()
    {
        if (null != this.studiesStudyDbIdTableGetParametersInstance)
            this.newObservationsTableRequestAlertDialog().show(this.newObservationsTableRequest(),
                this.studiesStudyDbIdTableGetParametersInstance.getFormat());
    }
    // endregion

    // region studytypesGet() Private Methods
    private org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
    io.swagger.client.model.StudyTypesResponse> studyTypesResponseCallback()
    {
        if (null == this.studyTypesResponseCallbackInstance)
            this.studyTypesResponseCallbackInstance =
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.ApiCallback<
                    io.swagger.client.model.StudyTypesResponse>() {};
        return this.studyTypesResponseCallbackInstance;
    }

    private void studytypesGet()
    {
        if (null != this.studytypesGetParametersInstance)
            try
            {
                this.studiesApi().studytypesGetAsync(
                    /* studyTypeDbId => */ this.studytypesGetParametersInstance.getStudyTypeDbId(),
                    /* page          => */ this.studytypesGetParametersInstance.getPage         (),
                    /* pageSize      => */ this.studytypesGetParametersInstance.getPageSize     (),
                    /* authorization => */ this.authorization                                   (),
                    /* callback      => */ this.studyTypesResponseCallback                      ());
            }
            catch (final java.lang.Throwable t) { this.setResponseTextViewTextFromThread(t); }
    }

    private
    org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudytypesGetAlertDialog
    studytypesGetAlertDialog()
    {
        if (null == this.studytypesGetAlertDialogInstance) this.studytypesGetAlertDialogInstance =
            new org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudytypesGetAlertDialog(
                this.getActivity(), new org.wheatgenetics.androidlibrarybuilder
                .brapi1_3.studies.StudytypesGetAlertDialog.Handler()
                {
                    @java.lang.Override public void handleDone()
                    {
                        org.wheatgenetics.androidlibrarybuilder.brapi1_3
                            .studies.Fragment.this.studytypesGet();
                    }
                });
        return this.studytypesGetAlertDialogInstance;
    }

    private
    org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.StudytypesGetAlertDialog.Parameters
    studytypesGetParameters()
    {
        if (null == this.studytypesGetParametersInstance) this.studytypesGetParametersInstance =
            new org.wheatgenetics.androidlibrarybuilder.brapi1_3
                .studies.StudytypesGetAlertDialog.Parameters();
        return this.studytypesGetParametersInstance;
    }

    private void showStudytypesGetAlertDialog()
    { this.studytypesGetAlertDialog().show(this.studytypesGetParameters()); }
    // endregion
    // endregion

    public Fragment() {}

    // region Overridden Method
    @java.lang.Override public void onAttach(
    @androidx.annotation.NonNull final android.content.Context context)
    {
        super.onAttach(context);

        if (context instanceof
        org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.Helper)
            this.helper =
                (org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment.Helper) context;
        else
            throw new java.lang.RuntimeException(context.toString() + " must implement Helper");
    }

    @java.lang.Override @androidx.annotation.Nullable public android.view.View onCreateView(
    @androidx.annotation.NonNull  final android.view.LayoutInflater inflater          ,
    @androidx.annotation.Nullable final android.view.ViewGroup      container         ,
    @androidx.annotation.Nullable final android.os.Bundle           savedInstanceState)
    {
        final android.view.View rootView = this.inflate(inflater, container,
            org.wheatgenetics.androidlibrarybuilder.R.layout.fragment_brapi1_3_studies);
        if (null != rootView)
        {
            // The following eighteen ids are from fragment_brapi1_3_studies.xml.
            {
                final android.widget.Button searchStudiesPostButton = rootView.findViewById(
                    org.wheatgenetics.androidlibrarybuilder.R.id.searchStudiesPostButton);
                if (null != searchStudiesPostButton) searchStudiesPostButton.setOnClickListener(
                    new android.view.View.OnClickListener()
                    {
                        @java.lang.Override public void onClick(final android.view.View v)
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                                .this.showStudySearchRequestAlertDialog();
                        }
                    });
            }
            {
                final android.widget.Button searchStudiesSearchResultsDbIdGetButton =
                    rootView.findViewById(org.wheatgenetics.androidlibrarybuilder
                        .R.id.searchStudiesSearchResultsDbIdGetButton);
                if (null != searchStudiesSearchResultsDbIdGetButton)
                    searchStudiesSearchResultsDbIdGetButton.setOnClickListener(
                        new android.view.View.OnClickListener()
                        {
                            @java.lang.Override public void onClick(final android.view.View v)
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                                    .this.showSearchStudiesSearchResultsDbIdGetAlertDialog();
                            }
                        });
            }
            {
                final android.widget.Button seasonsGetButton = rootView.findViewById(
                    org.wheatgenetics.androidlibrarybuilder.R.id.seasonsGetButton);
                if (null != seasonsGetButton) seasonsGetButton.setOnClickListener(
                    new android.view.View.OnClickListener()
                    {
                        @java.lang.Override public void onClick(final android.view.View v)
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                                .this.showSeasonsGetAlertDialog();
                        }
                    });
            }
            {
                final android.widget.Button studiesGetButton = rootView.findViewById(
                    org.wheatgenetics.androidlibrarybuilder.R.id.studiesGetButton);
                if (null != studiesGetButton) studiesGetButton.setOnClickListener(
                    new android.view.View.OnClickListener()
                    {
                        @java.lang.Override public void onClick(final android.view.View v)
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                                .this.showStudiesGetAlertDialog();
                        }
                    });
            }
            {
                final android.widget.Button studiesStudyDbIdGetButton = rootView.findViewById(
                    org.wheatgenetics.androidlibrarybuilder.R.id.studiesStudyDbIdGetButton);
                if (null != studiesStudyDbIdGetButton) studiesStudyDbIdGetButton.setOnClickListener(
                    new android.view.View.OnClickListener()
                    {
                        @java.lang.Override public void onClick(final android.view.View v)
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                                .this.showStudiesStudyDbIdGetAlertDialog();
                        }
                    });
            }
            {
                final android.widget.Button studiesStudyDbIdGermplasmGetButton =
                    rootView.findViewById(org.wheatgenetics.androidlibrarybuilder
                        .R.id.studiesStudyDbIdGermplasmGetButton);
                if (null != studiesStudyDbIdGermplasmGetButton)
                    studiesStudyDbIdGermplasmGetButton.setOnClickListener(
                        new android.view.View.OnClickListener()
                        {
                            @java.lang.Override public void onClick(final android.view.View v)
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                    .Fragment.this.showStudiesStudyDbIdGermplasmGetAlertDialog();
                            }
                        });
            }
            {
                final android.widget.Button studiesStudyDbIdLayoutsGetButton =
                    rootView.findViewById(org.wheatgenetics.androidlibrarybuilder
                        .R.id.studiesStudyDbIdLayoutsGetButton);
                if (null != studiesStudyDbIdLayoutsGetButton)
                    studiesStudyDbIdLayoutsGetButton.setOnClickListener(
                        new android.view.View.OnClickListener()
                        {
                            @java.lang.Override public void onClick(final android.view.View v)
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                    .Fragment.this.showStudiesStudyDbIdLayoutsGetAlertDialog();
                            }
                        });
            }
            {
                this.studiesStudyDbIdLayoutsPutButton = rootView.findViewById(
                    org.wheatgenetics.androidlibrarybuilder.R.id.studiesStudyDbIdLayoutsPutButton);
                if (null != this.studiesStudyDbIdLayoutsPutButton)
                    this.studiesStudyDbIdLayoutsPutButton.setOnClickListener(
                        new android.view.View.OnClickListener()
                        {
                            @java.lang.Override public void onClick(final android.view.View v)
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                    .Fragment.this.showStudyLayoutRequestListActivity();
                            }
                        });
            }
            {
                final android.widget.Button studiesStudyDbIdObservationsGetButton =
                    rootView.findViewById(org.wheatgenetics.androidlibrarybuilder
                        .R.id.studiesStudyDbIdObservationsGetButton);
                if (null != studiesStudyDbIdObservationsGetButton)
                    studiesStudyDbIdObservationsGetButton.setOnClickListener(
                        new android.view.View.OnClickListener()
                        {
                            @java.lang.Override public void onClick(final android.view.View v)
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                    .Fragment.this.showStudiesStudyDbIdObservationsGetAlertDialog();
                            }
                        });
            }
            {
                this.studiesStudyDbIdObservationsPutButton = rootView.findViewById(
                    org.wheatgenetics.androidlibrarybuilder
                        .R.id.studiesStudyDbIdObservationsPutButton);
                if (null != this.studiesStudyDbIdObservationsPutButton)
                    this.studiesStudyDbIdObservationsPutButton.setOnClickListener(
                        new android.view.View.OnClickListener()
                        {
                            @java.lang.Override public void onClick(final android.view.View v)
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                    .Fragment.this.showNewObservationsRequestListActivity();
                            }
                        });
            }
            {
                final android.widget.Button studiesStudyDbIdObservationunitsGetButton =
                    rootView.findViewById(org.wheatgenetics.androidlibrarybuilder
                        .R.id.studiesStudyDbIdObservationunitsGetButton);
                if (null != studiesStudyDbIdObservationunitsGetButton)
                    studiesStudyDbIdObservationunitsGetButton.setOnClickListener(
                        new android.view.View.OnClickListener()
                        {
                            @java.lang.Override public void onClick(final android.view.View v)
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                                    .this.showStudiesStudyDbIdObservationUnitsGetAlertDialog();
                            }
                        });
            }
            {
                this.studiesStudyDbIdObservationunitsPutButton = rootView.findViewById(
                    org.wheatgenetics.androidlibrarybuilder
                        .R.id.studiesStudyDbIdObservationunitsPutButton);
                if (null != this.studiesStudyDbIdObservationunitsPutButton)
                    this.studiesStudyDbIdObservationunitsPutButton.setOnClickListener(
                        new android.view.View.OnClickListener()
                        {
                            @java.lang.Override public void onClick(final android.view.View v)
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies
                                    .Fragment.this.showNewObservationUnitRequestsListActivity();
                            }
                        });
            }
            {
                final android.widget.Button studiesStudyDbIdObservationvariablesGetButton =
                    rootView.findViewById(org.wheatgenetics.androidlibrarybuilder
                        .R.id.studiesStudyDbIdObservationvariablesGetButton);
                if (null != studiesStudyDbIdObservationvariablesGetButton)
                    studiesStudyDbIdObservationvariablesGetButton.setOnClickListener(
                        new android.view.View.OnClickListener()
                        {
                            @java.lang.Override public void onClick(final android.view.View v)
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                                    .this.showStudiesStudyDbIdObservationvariablesGetAlertDialog();
                            }
                        });
            }
            {
                final android.widget.Button studiesStudyDbIdTableGetButton = rootView.findViewById(
                    org.wheatgenetics.androidlibrarybuilder.R.id.studiesStudyDbIdTableGetButton);
                if (null != studiesStudyDbIdTableGetButton)
                    studiesStudyDbIdTableGetButton.setOnClickListener(
                        new android.view.View.OnClickListener()
                        {
                            @java.lang.Override public void onClick(final android.view.View v)
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                                    .this.showStudiesStudyDbIdTableGetAlertDialog();
                            }
                        });
            }
            {
                this.studiesStudyDbIdTablePostButton = rootView.findViewById(
                    org.wheatgenetics.androidlibrarybuilder.R.id.studiesStudyDbIdTablePostButton);
                if (null != this.studiesStudyDbIdTablePostButton)
                    this.studiesStudyDbIdTablePostButton.setOnClickListener(
                        new android.view.View.OnClickListener()
                        {
                            @java.lang.Override public void onClick(final android.view.View v)
                            {
                                org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                                    .this.showNewObservationsTableRequestAlertDialog();
                            }
                        });
            }
            {
                final android.widget.Button studytypesGetButton = rootView.findViewById(
                    org.wheatgenetics.androidlibrarybuilder.R.id.studytypesGetButton);
                if (null != studytypesGetButton) studytypesGetButton.setOnClickListener(
                    new android.view.View.OnClickListener()
                    {
                        @java.lang.Override public void onClick(final android.view.View v)
                        {
                            org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                                .this.showStudytypesGetAlertDialog();
                        }
                    });
            }
            this.findResponseTextViewById(rootView,
                org.wheatgenetics.androidlibrarybuilder.R.id.studiesResponseTextView);
        }
        return rootView;
    }

    @java.lang.Override public void onResume()
    {
        super.onResume();

        this.setStudiesStudyDbIdLayoutsPutButtonEnabled         ();
        this.setStudiesStudyDbIdObservationsPutButtonEnabled    ();
        this.setStudiesStudyDbIdObservationunitsPutButtonEnabled();
    }

    @java.lang.Override public void onActivityResult(final int requestCode,
    final int resultCode, final android.content.Intent data)
    {
        if (android.app.Activity.RESULT_OK == resultCode && null != data)
        {
            final boolean dataHasJson; final java.lang.String json;
            {
                final java.lang.String JSON_KEY =
                    org.wheatgenetics.androidlibrary.mstrdtl.Consts.JSON_KEY;
                dataHasJson = data.hasExtra(JSON_KEY)                           ;
                json        = dataHasJson ? data.getStringExtra(JSON_KEY) : null;
            }

            switch (requestCode)
            {
                case org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                .STUDY_LAYOUT_REQUEST_LIST_ACTIVITY_REQUEST_CODE:
                    if (dataHasJson)
                        this.setStudyLayoutRequest(json);
                    else
                        this.studyLayoutRequest = null;
                    this.showStudiesStudyDbIdLayoutsPutAlertDialog(); break;

                case org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                .NEW_OBSERVATIONS_REQUEST_LIST_ACTIVITY_REQUEST_CODE:
                    if (dataHasJson)
                        this.setNewObservationsRequest(json);
                    else
                        this.newObservationsRequest = null;
                    this.showStudiesStudyDbIdObservationsPutAlertDialog(); break;

                case org.wheatgenetics.androidlibrarybuilder.brapi1_3.studies.Fragment
                .NEW_OBSERVATION_UNIT_REQUESTS_LIST_ACTIVITY_REQUEST_CODE:
                    if (dataHasJson)
                        this.setNewObservationUnitRequests(json);
                    else
                        this.newObservationUnitRequests = null;
                    this.showStudiesStudyDbIdObservationunitsPutAlertDialog(); break;
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @java.lang.Override public void onDetach() { this.helper = null; super.onDetach(); }
    // endregion
}
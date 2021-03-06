package org.wheatgenetics.androidlibrarybuilder.brapi1_3;

/**
 * Uses:
 * android.os.Bundle
 * android.view.LayoutInflater
 * android.view.View
 * android.view.ViewGroup
 * android.widget.TextView
 *
 * androidx.annotation.NonNull
 * androidx.annotation.Nullable
 *
 * org.wheatgenetics.androidlibrarybuilder.R
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.Fragment
 */
public class StubFragment extends org.wheatgenetics.androidlibrarybuilder.brapi1_3.Fragment
{
    private static final java.lang.String ARGUMENT_KEY = "resource_name";

    public StubFragment() {}

    @java.lang.Override @androidx.annotation.Nullable public android.view.View onCreateView(
    @androidx.annotation.NonNull  final android.view.LayoutInflater inflater          ,
    @androidx.annotation.Nullable final android.view.ViewGroup      container         ,
    @androidx.annotation.Nullable final android.os.Bundle           savedInstanceState)
    {
        final android.view.View rootView = this.inflate(inflater, container,
            org.wheatgenetics.androidlibrarybuilder.R.layout.fragment_brapi1_3_stub);
        if (null != rootView)
        {
            final java.lang.String resourceName;
            {
                final android.os.Bundle arguments = this.getArguments();
                if (null == arguments)
                    resourceName = "ERROR";
                else
                {
                    final java.lang.String ARGUMENT_KEY =
                        org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.ARGUMENT_KEY;
                    resourceName = arguments.containsKey(ARGUMENT_KEY) ?
                        arguments.getString(ARGUMENT_KEY) : "ERROR";
                }
            }

            final android.widget.TextView textView = rootView.findViewById(
                org.wheatgenetics.androidlibrarybuilder.R.id.stubTextView);      // From fragment_-
            if (null != textView) textView.setText(this.getString(               //  brapi_stub.xml.
                org.wheatgenetics.androidlibrarybuilder.R.string.stubTextViewFormatString,
                resourceName                                                             ));
        }
        return rootView;
    }

    static org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment instantiate(
    @androidx.annotation.NonNull final java.lang.String resourceName)
    {
        final org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment result =
            new org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment();
        {
            final android.os.Bundle arguments = new android.os.Bundle();
            arguments.putString(
                org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.ARGUMENT_KEY,
                resourceName                                                              );
            result.setArguments(arguments);
        }
        return result;
    }
}
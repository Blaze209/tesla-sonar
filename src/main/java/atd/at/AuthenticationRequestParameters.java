package atd.at;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import atd.ax.getSDKReferenceNumber;
import atd.e.getSDKTransactionID;
import com.adyen.threeds2.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AuthenticationRequestParameters<C extends atd.e.getSDKTransactionID, L extends atd.ax.getSDKReferenceNumber> extends LinearLayout implements atd.av.getSDKReferenceNumber.getSDKTransactionID {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 1;
    private static char[] getSDKReferenceNumber = {30820, 30960, 30945, 30950, 30958, 30960, 30953, 30949, 30948, 30951, 30947, 30953, 30955, 30761, 30839, 30810, 30805, 30805, 30802, 30797, 30800, 30806, 30808, 30805, 30839, 30836, 30799, 30800, 30841, 30839, 30800, 30842};
    private L getSDKTransactionID;

    AuthenticationRequestParameters(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        View.inflate(context, R.layout.a3ds2_view_challenge_container, this);
        View.inflate(context, getSDKTransactionID(), (ViewGroup) findViewById(R.id.scrollView_content));
        ((atd.av.getSDKReferenceNumber) findViewById(R.id.toolbarView)).setToolbarListener(this);
    }

    @Override // atd.av.getSDKReferenceNumber.getSDKTransactionID
    public final void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = (getDeviceData + 113) % 128;
        L l11 = this.getSDKTransactionID;
        if (l11 != null) {
            l11.getSDKReferenceNumber();
            getDeviceData = (AuthenticationRequestParameters + 105) % 128;
        }
    }

    public final L getSDKReferenceNumber() {
        int i11 = getDeviceData;
        L l11 = this.getSDKTransactionID;
        AuthenticationRequestParameters = (i11 + 9) % 128;
        return l11;
    }

    protected abstract int getSDKTransactionID();

    public void setChallengeListener(L l11) {
        int i11 = getDeviceData + 1;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            this.getSDKTransactionID = l11;
        } else {
            this.getSDKTransactionID = l11;
            throw null;
        }
    }
}

package atd.au;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.b;
import com.adyen.threeds2.ProgressDialog;
import com.adyen.threeds2.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID implements DialogInterface.OnDismissListener, ProgressDialog {
    private static int getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;
    private final DialogInterface.OnDismissListener getDeviceData;
    private b getSDKAppID;

    public getSDKAppID(@NonNull Activity activity, @NonNull DialogInterface.OnDismissListener onDismissListener) {
        this.getDeviceData = onDismissListener;
        b bVarCreate = new b.a(activity, R.style.ThreeDS2Theme_ProgressDialog).setView(LayoutInflater.from(activity).inflate(R.layout.a3ds2_widget_progress_dialog, (ViewGroup) null)).b(false).create();
        this.getSDKAppID = bVarCreate;
        bVarCreate.setOnDismissListener(this);
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i11 = getSDKTransactionID + 11;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            getsdkappid.getSDKAppID = null;
            getsdkappid.getDeviceData.onDismiss(dialogInterface);
            throw null;
        }
        getsdkappid.getSDKAppID = null;
        getsdkappid.getDeviceData.onDismiss(dialogInterface);
        int i12 = getSDKReferenceNumber;
        int i13 = i12 & 81;
        int i14 = i13 + ((i12 ^ 81) | i13);
        getSDKTransactionID = i14 % 128;
        if (i14 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * (-947)) + (i12 * 949);
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = i14 + (((~(i16 | i13)) | i15) * (-948)) + ((~((~i13) | i15 | i16)) * (-948)) + ((i11 | i16) * 948);
        if (i17 == 1) {
            return AuthenticationRequestParameters(objArr);
        }
        if (i17 == 2) {
            return getSDKTransactionID(objArr);
        }
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i18 = getSDKTransactionID;
        getSDKReferenceNumber = ((((i18 | 2) << 1) - (i18 ^ 2)) - 1) % 128;
        b bVar = getsdkappid.getSDKAppID;
        if (bVar != null) {
            int i19 = i18 & 99;
            getSDKReferenceNumber = ((((i18 | 99) & (~i19)) - (~(-(-(i19 << 1))))) - 1) % 128;
            bVar.show();
            int i21 = getSDKReferenceNumber;
            int i22 = i21 & 83;
            getSDKTransactionID = (((i21 | 83) & (~i22)) + (i22 << 1)) % 128;
        }
        int i23 = getSDKTransactionID;
        getSDKReferenceNumber = ((i23 & 7) + (i23 | 7)) % 128;
        return null;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = getSDKTransactionID;
        int i12 = (i11 ^ 103) + ((i11 & 103) << 1);
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 != 0) {
            b bVar = getsdkappid.getSDKAppID;
            throw null;
        }
        b bVar2 = getsdkappid.getSDKAppID;
        if (bVar2 != null) {
            try {
                bVar2.dismiss();
                int i13 = getSDKReferenceNumber;
                int i14 = i13 & 123;
                int i15 = -(-(i13 | 123));
                getSDKTransactionID = ((i14 & i15) + (i15 | i14)) % 128;
                return null;
            } catch (IllegalStateException unused) {
            }
        }
        int i16 = getSDKTransactionID;
        getSDKReferenceNumber = ((i16 ^ 95) + ((i16 & 95) << 1)) % 128;
        return null;
    }

    @Override // com.adyen.threeds2.ProgressDialog
    public final void hide() {
        getDeviceData(new Object[]{this}, -464125639, 464125641, System.identityHashCode(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        getDeviceData(new Object[]{this, dialogInterface}, 1514243641, -1514243640, System.identityHashCode(this));
    }

    @Override // com.adyen.threeds2.ProgressDialog
    public final void show() {
        getDeviceData(new Object[]{this}, 2109636937, -2109636937, System.identityHashCode(this));
    }
}

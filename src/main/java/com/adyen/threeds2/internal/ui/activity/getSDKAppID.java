package com.adyen.threeds2.internal.ui.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.o;
import com.adyen.threeds2.R;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID extends o {
    private static int getDeviceData = 0;
    private static int getSDKReferenceNumber = 1;

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * (-501)) + (i12 * 503);
        int i15 = ~i12;
        return ((i14 + (((~(i12 | i11)) | (~(i15 | i13))) * (-502))) + ((~(((~i13) | i15) | i11)) * (-502))) + (((~((~i11) | i13)) | i15) * HttpStatusCode.BAD_GATEWAY_502) != 1 ? getSDKAppID(objArr) : getSDKTransactionID(objArr);
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        LayoutInflater layoutInflater = (LayoutInflater) objArr[1];
        ViewGroup viewGroup = (ViewGroup) objArr[2];
        getsdkappid.getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getsdkappid.setCancelable(false);
        View viewInflate = layoutInflater.inflate(R.layout.a3ds2_widget_progress_dialog, viewGroup, false);
        int i11 = getDeviceData + 59;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return viewInflate;
        }
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (View) getSDKAppID(new Object[]{this, layoutInflater, viewGroup, bundle}, -2018900597, 2018900598, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getSDKAppID getsdkappid = new getSDKAppID();
        int i11 = getDeviceData;
        int i12 = (i11 & 121) + (i11 | 121);
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 27 / 0;
        }
        return getsdkappid;
    }

    public static getSDKAppID getSDKAppID() {
        return (getSDKAppID) getSDKAppID(new Object[0], 1941931959, -1941931959, (int) System.currentTimeMillis());
    }
}

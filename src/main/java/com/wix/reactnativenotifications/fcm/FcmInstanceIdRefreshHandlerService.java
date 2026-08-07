package com.wix.reactnativenotifications.fcm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.i;
import kj0.b;
import kj0.c;

/* JADX INFO: loaded from: classes8.dex */
public class FcmInstanceIdRefreshHandlerService extends i {
    public static void j(Context context, Intent intent) {
        i.d(context, FcmInstanceIdRefreshHandlerService.class, 2400, intent);
    }

    @Override // androidx.core.app.i
    protected void g(@NonNull Intent intent) {
        c cVarE = b.e(this);
        if (cVarE == null) {
            return;
        }
        if (intent.getBooleanExtra("isAppInit", false)) {
            cVarE.b();
        } else if (intent.getBooleanExtra("doManualRefresh", false)) {
            cVarE.a();
        } else {
            cVarE.c();
        }
    }
}

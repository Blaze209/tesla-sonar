package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.api.ApiException;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 implements d0 {
    c0() {
    }

    @Override // com.google.android.play.core.integrity.d0
    public final ApiException a(Bundle bundle) {
        int i11 = bundle.getInt(AnalyticsAttribute.Error);
        if (i11 == 0) {
            return null;
        }
        return new StandardIntegrityException(i11, bundle.getBoolean("is.error.remediable"), null);
    }
}

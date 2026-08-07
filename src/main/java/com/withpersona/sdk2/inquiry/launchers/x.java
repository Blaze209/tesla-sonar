package com.withpersona.sdk2.inquiry.launchers;

import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.contract.ActivityResultContracts$RequestPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/g0;", "", "", "b", "()Lcom/withpersona/sdk2/inquiry/launchers/g0;", "launchers_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class x {
    public static final g0<String, Boolean> b() {
        return h0.a(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.w
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                x.c(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z11) {
        new a0().a(z11);
    }
}

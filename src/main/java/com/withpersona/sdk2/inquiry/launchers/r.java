package com.withpersona.sdk2.inquiry.launchers;

import android.net.Uri;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.contract.ActivityResultContracts$OpenDocument;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/g0;", "", "", "Landroid/net/Uri;", "b", "()Lcom/withpersona/sdk2/inquiry/launchers/g0;", "launchers_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r {
    public static final g0<String[], Uri> b() {
        return new g0<>(new ActivityResultContracts$OpenDocument(), new ActivityResultCallback() { // from class: com.withpersona.sdk2.inquiry.launchers.q
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.c((Uri) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Uri uri) {
        new t().a(uri);
    }
}

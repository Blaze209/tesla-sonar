package nh0;

import androidx.p002activity.result.ActivityResultCallback;
import com.withpersona.sdk2.inquiry.launchers.g0;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderContract;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/g0;", "Lnh0/e;", "Lcom/withpersona/sdk2/inquiry/nfc/a;", "b", "()Lcom/withpersona/sdk2/inquiry/launchers/g0;", "nfc_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {
    public static final g0<PassportNfcReaderConfig, com.withpersona.sdk2.inquiry.nfc.a> b() {
        return new g0<>(new PassportNfcReaderContract(), new ActivityResultCallback() { // from class: nh0.g
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                h.c((com.withpersona.sdk2.inquiry.nfc.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.withpersona.sdk2.inquiry.nfc.a result) {
        s.k(result, "result");
        new j().a(result);
    }
}

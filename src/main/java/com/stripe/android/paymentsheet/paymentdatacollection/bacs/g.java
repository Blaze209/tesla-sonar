package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import androidx.p002activity.result.ActivityResultLauncher;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/g;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/b;", "<init>", "()V", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$a;", "activityResultLauncher", "Lb80/c;", "a", "(Landroidx/activity/result/ActivityResultLauncher;)Lb80/c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f53328a = new g();

    private g() {
    }

    @Override // com.stripe.android.paymentsheet.paymentdatacollection.bacs.b
    public b80.c a(ActivityResultLauncher<BacsMandateConfirmationContract.Args> activityResultLauncher) {
        s.k(activityResultLauncher, "activityResultLauncher");
        return new f(activityResultLauncher);
    }
}

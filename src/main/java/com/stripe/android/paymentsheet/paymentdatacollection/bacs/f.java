package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import androidx.p002activity.result.ActivityResultLauncher;
import b80.BacsMandateData;
import com.stripe.android.paymentsheet.y;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/f;", "Lb80/c;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$a;", "activityResultLauncher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "Lb80/e;", "data", "Lcom/stripe/android/paymentsheet/y$b;", "appearance", "Ljn0/h0;", "a", "(Lb80/e;Lcom/stripe/android/paymentsheet/y$b;)V", "Landroidx/activity/result/ActivityResultLauncher;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f implements b80.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<BacsMandateConfirmationContract.Args> activityResultLauncher;

    public f(ActivityResultLauncher<BacsMandateConfirmationContract.Args> activityResultLauncher) {
        s.k(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
    }

    @Override // b80.c
    public void a(BacsMandateData data, y.Appearance appearance) {
        s.k(data, "data");
        s.k(appearance, "appearance");
        this.activityResultLauncher.b(new BacsMandateConfirmationContract.Args(data.getEmail(), data.getName(), data.getSortCode(), data.getAccountNumber(), appearance));
    }
}

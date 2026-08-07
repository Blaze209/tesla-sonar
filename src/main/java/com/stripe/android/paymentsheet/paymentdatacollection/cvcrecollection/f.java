package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import androidx.p002activity.result.ActivityResultLauncher;
import c80.CvcRecollectionData;
import com.stripe.android.paymentsheet.y;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/f;", "Lc80/f;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract$a;", "activityResultLauncher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "Lc80/d;", "data", "Lcom/stripe/android/paymentsheet/y$b;", "appearance", "", "isLiveMode", "Ljn0/h0;", "a", "(Lc80/d;Lcom/stripe/android/paymentsheet/y$b;Z)V", "Landroidx/activity/result/ActivityResultLauncher;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f implements c80.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<CvcRecollectionContract.Args> activityResultLauncher;

    public f(ActivityResultLauncher<CvcRecollectionContract.Args> activityResultLauncher) {
        s.k(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
    }

    @Override // c80.f
    public void a(CvcRecollectionData data, y.Appearance appearance, boolean isLiveMode) {
        s.k(data, "data");
        s.k(appearance, "appearance");
        ActivityResultLauncher<CvcRecollectionContract.Args> activityResultLauncher = this.activityResultLauncher;
        String lastFour = data.getLastFour();
        if (lastFour == null) {
            lastFour = "";
        }
        activityResultLauncher.b(new CvcRecollectionContract.Args(lastFour, data.getBrand(), appearance, !isLiveMode));
    }
}

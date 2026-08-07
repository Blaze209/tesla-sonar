package r90;

import android.app.Activity;
import android.os.Build;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/app/Activity;", "Ljn0/h0;", "a", "(Landroid/app/Activity;)V", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {
    public static final void a(Activity activity) {
        s.k(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            b bVar = b.f107376a;
            activity.overrideActivityTransition(1, bVar.a(), bVar.b());
        } else {
            b bVar2 = b.f107376a;
            activity.overridePendingTransition(bVar2.a(), bVar2.b());
        }
    }
}

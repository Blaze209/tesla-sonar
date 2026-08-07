package s90;

import android.app.Activity;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/app/Activity;", "Lkotlin/Function0;", "Ljn0/h0;", "argsProvider", "", "a", "(Landroid/app/Activity;Lwn0/a;)Z", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {
    public static final boolean a(Activity activity, wn0.a<h0> argsProvider) {
        s.k(activity, "<this>");
        s.k(argsProvider, "argsProvider");
        try {
            argsProvider.invoke();
            return false;
        } catch (IllegalArgumentException unused) {
            activity.finish();
            return true;
        }
    }
}

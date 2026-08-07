package g70;

import a70.Unvalidated;
import androidx.p002activity.result.ActivityResultCallback;
import h.b;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg70/a;", "", "Lh/b;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCallback;", "La70/c;", "activityResultCallback", "Ljn0/h0;", "b", "(Lh/b;Landroidx/activity/result/ActivityResultCallback;)V", "c", "()V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {
    void b(b activityResultCaller, ActivityResultCallback<Unvalidated> activityResultCallback);

    void c();

    /* JADX INFO: renamed from: g70.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C1386a {
        public static void b(a aVar, b activityResultCaller, ActivityResultCallback<Unvalidated> activityResultCallback) {
            s.k(activityResultCaller, "activityResultCaller");
            s.k(activityResultCallback, "activityResultCallback");
        }

        public static void a(a aVar) {
        }
    }
}

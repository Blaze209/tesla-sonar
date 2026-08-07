package bd0;

import android.os.Handler;
import android.os.Looper;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbd0/b;", "", "<init>", "()V", "Lkotlin/Function0;", "Ljn0/h0;", "action", "b", "(Lwn0/a;)V", "logging_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f17041a = new b();

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(wn0.a aVar) {
        aVar.invoke();
    }

    public final void b(final wn0.a<h0> action) {
        s.k(action, "action");
        if (s.f(Looper.getMainLooper(), Looper.myLooper())) {
            action.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: bd0.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.c(action);
                }
            });
        }
    }
}

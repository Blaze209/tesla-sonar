package zl0;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.core.t;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t f128431a = yl0.a.d(new Callable() { // from class: zl0.a
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return b.a.f128432a;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final t f128432a = new c(new Handler(Looper.getMainLooper()), true);
    }

    public static t b() {
        return yl0.a.e(f128431a);
    }
}

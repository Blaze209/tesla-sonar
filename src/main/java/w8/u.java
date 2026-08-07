package w8;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f121418a = new u() { // from class: w8.t
        @Override // w8.u
        public final p[] d() {
            return u.f();
        }
    };

    static /* synthetic */ p[] f() {
        return new p[0];
    }

    default p[] b(Uri uri, Map<String, List<String>> map) {
        return d();
    }

    p[] d();

    default u a(t9.q.a aVar) {
        return this;
    }

    default u c(int i11) {
        return this;
    }

    @Deprecated
    default u e(boolean z11) {
        return this;
    }
}

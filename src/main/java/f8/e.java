package f8;

import a8.o2;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import p7.u;
import s7.i0;
import w8.q;

/* JADX INFO: loaded from: classes3.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final e f64547a = new c();

    f e(Uri uri, u uVar, List<u> list, i0 i0Var, Map<String, List<String>> map, q qVar, o2 o2Var);

    default e a(t9.q.a aVar) {
        return this;
    }

    default e b(boolean z11) {
        return this;
    }

    default e c(int i11) {
        return this;
    }

    default u d(u uVar) {
        return uVar;
    }
}

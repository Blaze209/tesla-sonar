package wb;

import android.content.Context;
import androidx.work.c0;
import androidx.work.j0;
import androidx.work.k;
import androidx.work.l;
import androidx.work.u0;
import com.google.common.util.concurrent.s;
import java.util.Collections;
import java.util.List;
import lb.e1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    protected f() {
    }

    public static f h(Context context) {
        f fVarV = e1.s(context).v();
        if (fVarV != null) {
            return fVarV;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    public final d a(String str, l lVar, c0 c0Var) {
        return b(str, lVar, Collections.singletonList(c0Var));
    }

    public abstract d b(String str, l lVar, List<c0> list);

    public abstract s<Void> c(String str);

    public abstract s<Void> d(u0 u0Var);

    public abstract s<Void> e(String str, k kVar, j0 j0Var);

    public final s<Void> f(String str, l lVar, c0 c0Var) {
        return g(str, lVar, Collections.singletonList(c0Var));
    }

    public abstract s<Void> g(String str, l lVar, List<c0> list);
}

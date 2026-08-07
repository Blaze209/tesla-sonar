package ts;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface q0 {

    public interface a {
        q0 a(Context context, List<l> list, k kVar, us.c cVar, us.c cVar2, boolean z11, Executor executor, b bVar);
    }

    public interface b {
    }

    void a(long j11);

    void b(int i11);

    void c(p pVar);

    void d();

    void e(i0 i0Var);

    int f();

    void flush();

    Surface m();

    void release();
}

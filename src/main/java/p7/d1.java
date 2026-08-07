package p7;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface d1 {

    public interface a {
        d1 a(Context context, i iVar, l lVar, b bVar, Executor executor, long j11, boolean z11);
    }

    public interface b {
    }

    void a(long j11);

    boolean b(int i11);

    void c(int i11, int i12, u uVar, List<Object> list, long j11);

    void d(b1 b1Var);

    Surface e(int i11);

    void f(List<Object> list);

    void flush();

    int g(int i11);

    void h(n0 n0Var);

    void i(int i11);

    void initialize();

    void n();

    void release();
}

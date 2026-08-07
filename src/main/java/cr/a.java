package cr;

import android.os.Looper;
import com.google.android.exoplayer2.v1;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface a extends v1.d, com.google.android.exoplayer2.source.p, ss.d.a, com.google.android.exoplayer2.drm.i {
    void H(List<com.google.android.exoplayer2.source.o.b> list, com.google.android.exoplayer2.source.o.b bVar);

    void a(Exception exc);

    void b(fr.e eVar);

    void c(String str);

    void d(String str);

    void e(String str, long j11, long j12);

    void f(int i11, long j11);

    void g(Exception exc);

    void h(long j11, int i11);

    void i(String str, long j11, long j12);

    void j(long j11);

    void k(Exception exc);

    void l(Object obj, long j11);

    void m(int i11, long j11, long j12);

    void o(fr.e eVar);

    void p(fr.e eVar);

    void r(fr.e eVar);

    void release();

    void s(com.google.android.exoplayer2.u0 u0Var, fr.g gVar);

    void t(v1 v1Var, Looper looper);

    void w(com.google.android.exoplayer2.u0 u0Var, fr.g gVar);

    void x();

    void z(b bVar);
}

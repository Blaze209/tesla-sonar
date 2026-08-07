package a8;

import android.os.Looper;
import androidx.media3.exoplayer.audio.AudioSink;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface a extends p7.j0.d, androidx.media3.exoplayer.source.s, s8.d.a, androidx.media3.exoplayer.drm.h {
    void A(z7.b bVar);

    void C(List<androidx.media3.exoplayer.source.r.b> list, androidx.media3.exoplayer.source.r.b bVar);

    void G(b bVar);

    void J(p7.j0 j0Var, Looper looper);

    void P(b bVar);

    void a(Exception exc);

    void c(String str);

    void c0(int i11, int i12, boolean z11);

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

    void o(AudioSink.a aVar);

    void p(AudioSink.a aVar);

    void r(z7.b bVar);

    void release();

    void s(p7.u uVar, z7.c cVar);

    void u(z7.b bVar);

    void w(z7.b bVar);

    void x();

    void y(p7.u uVar, z7.c cVar);
}

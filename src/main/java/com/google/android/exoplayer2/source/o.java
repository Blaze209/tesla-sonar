package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.x0;
import cr.q1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface o {

    public static final class b extends es.j {
        public b(Object obj) {
            super(obj);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }

        public b(Object obj, long j11) {
            super(obj, j11);
        }

        public b(Object obj, long j11, int i11) {
            super(obj, j11, i11);
        }

        public b(Object obj, int i11, int i12, long j11) {
            super(obj, i11, i12, j11);
        }

        public b(es.j jVar) {
            super(jVar);
        }
    }

    public interface c {
        void a(o oVar, f2 f2Var);
    }

    x0 a();

    void b();

    default f2 c() {
        return null;
    }

    default boolean d() {
        return true;
    }

    void e(c cVar);

    void f(p pVar);

    n g(b bVar, ss.b bVar2, long j11);

    void h(Handler handler, p pVar);

    void i(n nVar);

    void j(c cVar);

    void k(c cVar, ss.z zVar, q1 q1Var);

    void l(c cVar);

    void n(Handler handler, com.google.android.exoplayer2.drm.i iVar);

    void o(com.google.android.exoplayer2.drm.i iVar);

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40503a = q.f40509b;

        a a(com.google.android.exoplayer2.upstream.b bVar);

        o b(x0 x0Var);

        a c(gr.k kVar);

        default a d(ss.f fVar) {
            return this;
        }
    }
}

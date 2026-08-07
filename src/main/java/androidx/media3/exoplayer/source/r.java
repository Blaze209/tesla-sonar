package androidx.media3.exoplayer.source;

import a8.o2;
import android.os.Handler;
import p7.r0;

/* JADX INFO: loaded from: classes3.dex */
public interface r {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f11103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f11106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f11107e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f11103a.equals(obj) ? this : new b(obj, this.f11104b, this.f11105c, this.f11106d, this.f11107e);
        }

        public boolean b() {
            return this.f11104b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11103a.equals(bVar.f11103a) && this.f11104b == bVar.f11104b && this.f11105c == bVar.f11105c && this.f11106d == bVar.f11106d && this.f11107e == bVar.f11107e;
        }

        public int hashCode() {
            return ((((((((527 + this.f11103a.hashCode()) * 31) + this.f11104b) * 31) + this.f11105c) * 31) + ((int) this.f11106d)) * 31) + this.f11107e;
        }

        public b(Object obj, long j11) {
            this(obj, -1, -1, j11, -1);
        }

        public b(Object obj, long j11, int i11) {
            this(obj, -1, -1, j11, i11);
        }

        public b(Object obj, int i11, int i12, long j11) {
            this(obj, i11, i12, j11, -1);
        }

        private b(Object obj, int i11, int i12, long j11, int i13) {
            this.f11103a = obj;
            this.f11104b = i11;
            this.f11105c = i12;
            this.f11106d = j11;
            this.f11107e = i13;
        }
    }

    public interface c {
        void a(r rVar, r0 r0Var);
    }

    p7.y a();

    void b();

    default r0 c() {
        return null;
    }

    default boolean d() {
        return true;
    }

    void e(Handler handler, s sVar);

    void f(Handler handler, androidx.media3.exoplayer.drm.h hVar);

    void h(q qVar);

    void j(c cVar);

    default boolean k(p7.y yVar) {
        return false;
    }

    void l(s sVar);

    void n(c cVar, v7.q qVar, o2 o2Var);

    void o(androidx.media3.exoplayer.drm.h hVar);

    q r(b bVar, s8.b bVar2, long j11);

    void t(c cVar);

    void u(c cVar);

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11102a = t.f11113b;

        @Deprecated
        default a b(boolean z11) {
            return this;
        }

        default a c(int i11) {
            return this;
        }

        a d(e8.k kVar);

        a f(androidx.media3.exoplayer.upstream.b bVar);

        r g(p7.y yVar);

        default a a(t9.q.a aVar) {
            return this;
        }

        default a e(s8.e.a aVar) {
            return this;
        }
    }

    default void i(p7.y yVar) {
    }
}

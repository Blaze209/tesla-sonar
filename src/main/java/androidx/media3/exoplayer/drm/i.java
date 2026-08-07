package androidx.media3.exoplayer.drm;

import a8.o2;
import android.os.Looper;
import p7.u;

/* JADX INFO: loaded from: classes.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f9806a = new a();

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9807a = new b() { // from class: e8.j
            @Override // androidx.media3.exoplayer.drm.i.b
            public final void release() {
                androidx.media3.exoplayer.drm.i.b.a();
            }
        };

        static /* synthetic */ void a() {
        }

        void release();
    }

    default void b() {
    }

    default b c(h.a aVar, u uVar) {
        return b.f9807a;
    }

    DrmSession d(h.a aVar, u uVar);

    int e(u uVar);

    void f(Looper looper, o2 o2Var);

    default void release() {
    }

    class a implements i {
        a() {
        }

        @Override // androidx.media3.exoplayer.drm.i
        public DrmSession d(h.a aVar, u uVar) {
            if (uVar.f101548s == null) {
                return null;
            }
            return new l(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // androidx.media3.exoplayer.drm.i
        public int e(u uVar) {
            return uVar.f101548s != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.i
        public void f(Looper looper, o2 o2Var) {
        }
    }
}

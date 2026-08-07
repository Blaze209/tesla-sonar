package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.u0;
import cr.q1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f39834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final j f39835b;

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f39836a = new b() { // from class: gr.j
            @Override // com.google.android.exoplayer2.drm.j.b
            public final void release() {
                com.google.android.exoplayer2.drm.j.b.a();
            }
        };

        static /* synthetic */ void a() {
        }

        void release();
    }

    static {
        a aVar = new a();
        f39834a = aVar;
        f39835b = aVar;
    }

    DrmSession a(i.a aVar, u0 u0Var);

    default void b() {
    }

    default b c(i.a aVar, u0 u0Var) {
        return b.f39836a;
    }

    int d(u0 u0Var);

    void e(Looper looper, q1 q1Var);

    default void release() {
    }

    class a implements j {
        a() {
        }

        @Override // com.google.android.exoplayer2.drm.j
        public DrmSession a(i.a aVar, u0 u0Var) {
            if (u0Var.f40715o == null) {
                return null;
            }
            return new m(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // com.google.android.exoplayer2.drm.j
        public int d(u0 u0Var) {
            return u0Var.f40715o != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.j
        public void e(Looper looper, q1 q1Var) {
        }
    }
}

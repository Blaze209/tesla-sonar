package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f9553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.g<c> f9554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioManager f9555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f9556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9557f;

    public interface b {
        void q(int i11);

        void z(int i11, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f9560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9561d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9562e;

        public c(int i11, int i12, boolean z11, int i13, int i14) {
            this.f9558a = i11;
            this.f9559b = i12;
            this.f9560c = z11;
            this.f9561d = i13;
            this.f9562e = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d extends BroadcastReceiver {
        private d() {
        }

        public static /* synthetic */ void a(d dVar) {
            if (c3.this.f9556e == null) {
                return;
            }
            c3.this.f9554c.g(c3.this.s(((c) c3.this.f9554c.d()).f9558a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c3.this.f9554c.e(new Runnable() { // from class: androidx.media3.exoplayer.d3
                @Override // java.lang.Runnable
                public final void run() {
                    c3.d.a(this.f9576a);
                }
            });
        }
    }

    public c3(Context context, b bVar, final int i11, Looper looper, Looper looper2, s7.j jVar) {
        this.f9552a = context.getApplicationContext();
        this.f9553b = bVar;
        s7.g<c> gVar = new s7.g<>(new c(i11, 0, false, 0, 0), looper, looper2, jVar, new s7.g.a() { // from class: androidx.media3.exoplayer.o2
            @Override // s7.g.a
            public final void a(Object obj, Object obj2) {
                this.f10606a.y((c3.c) obj, (c3.c) obj2);
            }
        });
        this.f9554c = gVar;
        gVar.e(new Runnable() { // from class: androidx.media3.exoplayer.t2
            @Override // java.lang.Runnable
            public final void run() {
                c3.m(this.f11130a, i11);
            }
        });
    }

    public static /* synthetic */ c a(c3 c3Var, boolean z11, c cVar) {
        int i11;
        c3Var.getClass();
        int i12 = cVar.f9558a;
        if (cVar.f9560c == z11) {
            i11 = cVar.f9559b;
        } else {
            i11 = z11 ? 0 : c3Var.f9557f;
        }
        return new c(i12, i11, z11, cVar.f9561d, cVar.f9562e);
    }

    public static /* synthetic */ c b(int i11, c cVar) {
        return new c(i11, cVar.f9559b, cVar.f9560c, cVar.f9561d, cVar.f9562e);
    }

    public static /* synthetic */ c c(c cVar) {
        return cVar;
    }

    public static /* synthetic */ c d(int i11, c cVar) {
        int i12 = cVar.f9558a;
        int i13 = cVar.f9561d;
        return new c(i12, (i11 < i13 || i11 > cVar.f9562e) ? cVar.f9559b : i11, i11 == 0, i13, cVar.f9562e);
    }

    public static /* synthetic */ c e(c cVar) {
        int i11 = cVar.f9558a;
        int i12 = cVar.f9559b;
        int i13 = cVar.f9561d;
        return new c(i11, i12 > i13 ? i12 - 1 : i13, i12 <= 1, i13, cVar.f9562e);
    }

    public static /* synthetic */ c f(c3 c3Var, int i11, c cVar) {
        c3Var.getClass();
        if (cVar.f9559b <= cVar.f9561d) {
            return cVar;
        }
        ((AudioManager) s7.a.f(c3Var.f9555d)).adjustStreamVolume(cVar.f9558a, -1, i11);
        return c3Var.s(cVar.f9558a);
    }

    public static /* synthetic */ c g(c3 c3Var, int i11, int i12, c cVar) {
        c3Var.getClass();
        if (i11 == cVar.f9559b || i11 < cVar.f9561d || i11 > cVar.f9562e) {
            return cVar;
        }
        ((AudioManager) s7.a.f(c3Var.f9555d)).setStreamVolume(cVar.f9558a, i11, i12);
        return c3Var.s(cVar.f9558a);
    }

    public static /* synthetic */ c h(c3 c3Var, int i11, c cVar) {
        c3Var.getClass();
        return cVar.f9558a == i11 ? cVar : c3Var.s(i11);
    }

    public static /* synthetic */ c i(c3 c3Var, c cVar) {
        d dVar = c3Var.f9556e;
        if (dVar != null) {
            try {
                c3Var.f9552a.unregisterReceiver(dVar);
            } catch (RuntimeException e11) {
                s7.t.j("StreamVolumeManager", "Error unregistering stream volume receiver", e11);
            }
            c3Var.f9556e = null;
        }
        return cVar;
    }

    public static /* synthetic */ c j(c3 c3Var, boolean z11, int i11, c cVar) {
        c3Var.getClass();
        if (cVar.f9560c == z11) {
            return cVar;
        }
        s7.a.f(c3Var.f9555d);
        c3Var.f9555d.adjustStreamVolume(cVar.f9558a, z11 ? -100 : 100, i11);
        return c3Var.s(cVar.f9558a);
    }

    public static /* synthetic */ c k(c3 c3Var, int i11, c cVar) {
        c3Var.getClass();
        if (cVar.f9559b >= cVar.f9562e) {
            return cVar;
        }
        ((AudioManager) s7.a.f(c3Var.f9555d)).adjustStreamVolume(cVar.f9558a, 1, i11);
        return c3Var.s(cVar.f9558a);
    }

    public static /* synthetic */ void m(c3 c3Var, int i11) {
        c3Var.f9555d = (AudioManager) s7.a.j((AudioManager) c3Var.f9552a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        d dVar = new d();
        try {
            c3Var.f9552a.registerReceiver(dVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            c3Var.f9556e = dVar;
        } catch (RuntimeException e11) {
            s7.t.j("StreamVolumeManager", "Error registering stream volume receiver", e11);
        }
        c3Var.f9554c.g(c3Var.s(i11));
    }

    public static /* synthetic */ c n(c cVar) {
        int i11 = cVar.f9558a;
        int i12 = cVar.f9559b;
        int i13 = cVar.f9562e;
        return new c(i11, i12 < i13 ? i12 + 1 : i13, false, cVar.f9561d, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c s(int i11) {
        s7.a.f(this.f9555d);
        return new c(i11, q7.f.f(this.f9555d, i11), q7.f.g(this.f9555d, i11), q7.f.e(this.f9555d, i11), q7.f.d(this.f9555d, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(c cVar, c cVar2) {
        boolean z11 = cVar.f9560c;
        if (!z11 && cVar2.f9560c) {
            this.f9557f = cVar.f9559b;
        }
        int i11 = cVar.f9559b;
        int i12 = cVar2.f9559b;
        if (i11 != i12 || z11 != cVar2.f9560c) {
            this.f9553b.z(i12, cVar2.f9560c);
        }
        int i13 = cVar.f9558a;
        int i14 = cVar2.f9558a;
        if (i13 == i14 && cVar.f9561d == cVar2.f9561d && cVar.f9562e == cVar2.f9562e) {
            return;
        }
        this.f9553b.q(i14);
    }

    @SuppressLint({"WrongConstant"})
    public void A(final boolean z11, final int i11) {
        this.f9554c.h(new ou.h() { // from class: androidx.media3.exoplayer.a3
            @Override // ou.h
            public final Object apply(Object obj) {
                return c3.a(this.f9336a, z11, (c3.c) obj);
            }
        }, new ou.h() { // from class: androidx.media3.exoplayer.b3
            @Override // ou.h
            public final Object apply(Object obj) {
                return c3.j(this.f9542a, z11, i11, (c3.c) obj);
            }
        });
    }

    public void B(final int i11) {
        this.f9554c.h(new ou.h() { // from class: androidx.media3.exoplayer.y2
            @Override // ou.h
            public final Object apply(Object obj) {
                return c3.b(i11, (c3.c) obj);
            }
        }, new ou.h() { // from class: androidx.media3.exoplayer.z2
            @Override // ou.h
            public final Object apply(Object obj) {
                return c3.h(this.f11413a, i11, (c3.c) obj);
            }
        });
    }

    @SuppressLint({"WrongConstant"})
    public void C(final int i11, final int i12) {
        this.f9554c.h(new ou.h() { // from class: androidx.media3.exoplayer.w2
            @Override // ou.h
            public final Object apply(Object obj) {
                return c3.d(i11, (c3.c) obj);
            }
        }, new ou.h() { // from class: androidx.media3.exoplayer.x2
            @Override // ou.h
            public final Object apply(Object obj) {
                return c3.g(this.f11398a, i11, i12, (c3.c) obj);
            }
        });
    }

    @SuppressLint({"WrongConstant"})
    public void r(final int i11) {
        this.f9554c.h(new ou.h() { // from class: androidx.media3.exoplayer.u2
            @Override // ou.h
            public final Object apply(Object obj) {
                return c3.e((c3.c) obj);
            }
        }, new ou.h() { // from class: androidx.media3.exoplayer.v2
            @Override // ou.h
            public final Object apply(Object obj) {
                return c3.f(this.f11177a, i11, (c3.c) obj);
            }
        });
    }

    public int t() {
        return this.f9554c.d().f9562e;
    }

    public int u() {
        return this.f9554c.d().f9561d;
    }

    public int v() {
        return this.f9554c.d().f9559b;
    }

    @SuppressLint({"WrongConstant"})
    public void w(final int i11) {
        this.f9554c.h(new ou.h() { // from class: androidx.media3.exoplayer.r2
            @Override // ou.h
            public final Object apply(Object obj) {
                return c3.n((c3.c) obj);
            }
        }, new ou.h() { // from class: androidx.media3.exoplayer.s2
            @Override // ou.h
            public final Object apply(Object obj) {
                return c3.k(this.f10670a, i11, (c3.c) obj);
            }
        });
    }

    public boolean x() {
        return this.f9554c.d().f9560c;
    }

    public void z() {
        this.f9554c.h(new ou.h() { // from class: androidx.media3.exoplayer.p2
            @Override // ou.h
            public final Object apply(Object obj) {
                return c3.c((c3.c) obj);
            }
        }, new ou.h() { // from class: androidx.media3.exoplayer.q2
            @Override // ou.h
            public final Object apply(Object obj) {
                return c3.i(this.f10638a, (c3.c) obj);
            }
        });
    }
}

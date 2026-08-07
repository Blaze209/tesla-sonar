package androidx.media3.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
class k4 implements v.d {
    private Surface A;
    private SurfaceHolder B;
    private TextureView C;
    private o E;
    private MediaController F;
    private long G;
    private long H;
    private ne I;
    private Bundle J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f11844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final re f11845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final o6 f11846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f11847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ve f11848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f11849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final IBinder.DeathRecipient f11850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f11851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s7.s<p7.j0.d> f11852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f11853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.collection.b<Integer> f11854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Handler f11855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ve f11856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f11857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f11858o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PendingIntent f11860q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private p7.j0.b f11867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private p7.j0.b f11868y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p7.j0.b f11869z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ne f11859p = ne.F;
    private s7.e0 D = s7.e0.f110405c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private te f11866w = te.f12414b;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.google.common.collect.x<androidx.media3.session.a> f11861r = com.google.common.collect.x.r();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.common.collect.x<androidx.media3.session.a> f11862s = com.google.common.collect.x.r();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.common.collect.x<androidx.media3.session.a> f11863t = com.google.common.collect.x.r();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.google.common.collect.x<androidx.media3.session.a> f11864u = com.google.common.collect.x.r();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.google.common.collect.z<String, androidx.media3.session.a> f11865v = com.google.common.collect.z.m();

    /* JADX INFO: Access modifiers changed from: private */
    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f11870a;

        public b(Looper looper) {
            this.f11870a = new Handler(looper, new Handler.Callback() { // from class: androidx.media3.session.l4
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f11905a.c(message);
                }
            });
        }

        private void b() {
            try {
                k4.this.E.L0(k4.this.f11846c);
            } catch (RemoteException unused) {
                s7.t.i("MCImplBase", "Error in sending flushCommandQueue");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c(Message message) {
            if (message.what == 1) {
                b();
            }
            return true;
        }

        public void d() {
            if (this.f11870a.hasMessages(1)) {
                b();
            }
            this.f11870a.removeCallbacksAndMessages(null);
        }

        public void e() {
            if (k4.this.E == null || this.f11870a.hasMessages(1)) {
                return;
            }
            this.f11870a.sendEmptyMessage(1);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f11873b;

        public c(int i11, long j11) {
            this.f11872a = i11;
            this.f11873b = j11;
        }

        static /* synthetic */ int a(c cVar) {
            return cVar.f11872a;
        }

        static /* synthetic */ long b(c cVar) {
            return cVar.f11873b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface d {
        void a(o oVar, int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f11874a;

        public e(Bundle bundle) {
            this.f11874a = bundle;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            v vVarZ3 = k4.this.z3();
            v vVarZ4 = k4.this.z3();
            Objects.requireNonNull(vVarZ4);
            vVarZ3.l1(new ga.j(vVarZ4));
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            v vVarZ3;
            ga.j jVar;
            try {
                try {
                    if (k4.this.f11848e.e().equals(componentName.getPackageName())) {
                        p pVarR2 = p.a.R2(iBinder);
                        if (pVarR2 != null) {
                            pVarR2.m2(k4.this.f11846c, new g(k4.this.x3().getPackageName(), Process.myPid(), this.f11874a, k4.this.f11844a.e1()).b());
                            return;
                        } else {
                            s7.t.d("MCImplBase", "Service interface is missing.");
                            vVarZ3 = k4.this.z3();
                            v vVarZ4 = k4.this.z3();
                            Objects.requireNonNull(vVarZ4);
                            jVar = new ga.j(vVarZ4);
                        }
                    } else {
                        s7.t.d("MCImplBase", "Expected connection to " + k4.this.f11848e.e() + " but is connected to " + componentName);
                        vVarZ3 = k4.this.z3();
                        v vVarZ5 = k4.this.z3();
                        Objects.requireNonNull(vVarZ5);
                        jVar = new ga.j(vVarZ5);
                    }
                } catch (RemoteException unused) {
                    s7.t.i("MCImplBase", "Service " + componentName + " has died prematurely");
                    vVarZ3 = k4.this.z3();
                    v vVarZ6 = k4.this.z3();
                    Objects.requireNonNull(vVarZ6);
                    jVar = new ga.j(vVarZ6);
                }
                vVarZ3.l1(jVar);
            } catch (Throwable th2) {
                v vVarZ7 = k4.this.z3();
                v vVarZ8 = k4.this.z3();
                Objects.requireNonNull(vVarZ8);
                vVarZ7.l1(new ga.j(vVarZ8));
                throw th2;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            v vVarZ3 = k4.this.z3();
            v vVarZ4 = k4.this.z3();
            Objects.requireNonNull(vVarZ4);
            vVarZ3.l1(new ga.j(vVarZ4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        private f() {
        }

        public static /* synthetic */ void a(f fVar, o oVar, int i11) {
            k4 k4Var = k4.this;
            oVar.o2(k4Var.f11846c, i11, k4Var.A);
        }

        public static /* synthetic */ void b(f fVar, o oVar, int i11) {
            k4 k4Var = k4.this;
            oVar.o2(k4Var.f11846c, i11, k4Var.A);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            if (k4.this.C == null || k4.this.C.getSurfaceTexture() != surfaceTexture) {
                return;
            }
            k4.this.A = new Surface(surfaceTexture);
            k4.this.t3(new d() { // from class: androidx.media3.session.o4
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i13) {
                    k4.f.a(this.f12087a, oVar, i13);
                }
            });
            k4.this.P3(i11, i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (k4.this.C != null && k4.this.C.getSurfaceTexture() == surfaceTexture) {
                k4.this.A = null;
                k4.this.t3(new d() { // from class: androidx.media3.session.p4
                    @Override // androidx.media3.session.k4.d
                    public final void a(o oVar, int i11) {
                        oVar.o2(k4.this.f11846c, i11, null);
                    }
                });
                k4.this.P3(0, 0);
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
            if (k4.this.C == null || k4.this.C.getSurfaceTexture() != surfaceTexture) {
                return;
            }
            k4.this.P3(i11, i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            if (k4.this.B != surfaceHolder) {
                return;
            }
            k4.this.P3(i12, i13);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (k4.this.B != surfaceHolder) {
                return;
            }
            k4.this.A = surfaceHolder.getSurface();
            k4.this.t3(new d() { // from class: androidx.media3.session.m4
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    k4.f.b(this.f11963a, oVar, i11);
                }
            });
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            k4.this.P3(surfaceFrame.width(), surfaceFrame.height());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (k4.this.B != surfaceHolder) {
                return;
            }
            k4.this.A = null;
            k4.this.t3(new d() { // from class: androidx.media3.session.n4
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.o2(k4.this.f11846c, i11, null);
                }
            });
            k4.this.P3(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k4(Context context, v vVar, ve veVar, Bundle bundle, Looper looper) {
        p7.j0.b bVar = p7.j0.b.f101382b;
        this.f11867x = bVar;
        this.f11868y = bVar;
        this.f11869z = n3(bVar, bVar);
        this.f11852i = new s7.s<>(looper, s7.j.f110429a, new s7.s.b() { // from class: androidx.media3.session.v0
            @Override // s7.s.b
            public final void a(Object obj, p7.q qVar) {
                ((p7.j0.d) obj).V(this.f12484a.z3(), new p7.j0.c(qVar));
            }
        });
        this.f11855l = new Handler(looper);
        this.f11844a = vVar;
        s7.a.g(context, "context must not be null");
        s7.a.g(veVar, "token must not be null");
        this.f11847d = context;
        this.f11845b = new re();
        this.f11846c = new o6(this);
        this.f11854k = new androidx.collection.b<>();
        this.f11848e = veVar;
        this.f11849f = bundle;
        this.f11850g = new IBinder.DeathRecipient() { // from class: androidx.media3.session.w0
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                k4.k1(this.f12557a);
            }
        };
        this.f11851h = new f();
        this.J = Bundle.EMPTY;
        this.f11857n = veVar.h() != 0 ? new e(bundle) : null;
        this.f11853j = new b(looper);
        this.G = -9223372036854775807L;
        this.H = -9223372036854775807L;
    }

    private static int A3(p7.r0 r0Var, int i11, int i12, int i13) {
        if (i11 == -1) {
            return i11;
        }
        while (i12 < i13) {
            p7.r0.d dVar = new p7.r0.d();
            r0Var.r(i12, dVar);
            i11 -= (dVar.f101495o - dVar.f101494n) + 1;
            i12++;
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void B2(k4 k4Var, com.google.common.util.concurrent.s sVar, int i11) {
        ga.v vVar;
        k4Var.getClass();
        try {
            vVar = (ga.v) s7.a.g((ga.v) sVar.get(), "SessionResult must not be null");
        } catch (InterruptedException e11) {
            e = e11;
            s7.t.j("MCImplBase", "Session operation failed", e);
            vVar = new ga.v(-1);
        } catch (CancellationException e12) {
            s7.t.j("MCImplBase", "Session operation cancelled", e12);
            vVar = new ga.v(1);
        } catch (ExecutionException e13) {
            e = e13;
            s7.t.j("MCImplBase", "Session operation failed", e);
            vVar = new ga.v(-1);
        }
        k4Var.o4(i11, vVar);
    }

    private c C3(p7.r0 r0Var, int i11, long j11) {
        if (r0Var.u()) {
            return null;
        }
        p7.r0.d dVar = new p7.r0.d();
        p7.r0.b bVar = new p7.r0.b();
        if (i11 == -1 || i11 >= r0Var.t()) {
            i11 = r0Var.e(T());
            j11 = r0Var.r(i11, dVar).c();
        }
        return D3(r0Var, dVar, bVar, i11, s7.q0.b1(j11));
    }

    private static c D3(p7.r0 r0Var, p7.r0.d dVar, p7.r0.b bVar, int i11, long j11) {
        s7.a.c(i11, 0, r0Var.t());
        r0Var.r(i11, dVar);
        if (j11 == -9223372036854775807L) {
            j11 = dVar.d();
            if (j11 == -9223372036854775807L) {
                return null;
            }
        }
        int i12 = dVar.f101494n;
        r0Var.j(i12, bVar);
        while (i12 < dVar.f101495o && bVar.f101464e != j11) {
            int i13 = i12 + 1;
            if (r0Var.j(i13, bVar).f101464e > j11) {
                break;
            }
            i12 = i13;
        }
        r0Var.j(i12, bVar);
        return new c(i12, j11 - bVar.f101464e);
    }

    private static p7.r0.b E3(p7.r0 r0Var, int i11, int i12) {
        p7.r0.b bVar = new p7.r0.b();
        r0Var.j(i11, bVar);
        bVar.f101462c = i12;
        return bVar;
    }

    public static /* synthetic */ void G1(k4 k4Var, List list, int i11, int i12, o oVar, int i13) {
        k4Var.getClass();
        p7.g gVar = new p7.g(s7.i.i(list, new ga.i()));
        if (((ve) s7.a.f(k4Var.f11856m)).d() >= 2) {
            oVar.a1(k4Var.f11846c, i13, i11, i12, gVar);
        } else {
            oVar.p2(k4Var.f11846c, i13, i12, gVar);
            oVar.M0(k4Var.f11846c, i13, i11, i12);
        }
    }

    public static /* synthetic */ void I1(k4 k4Var, boolean z11, boolean z12, int i11, v.c cVar) {
        com.google.common.util.concurrent.s<ga.v> sVar = (com.google.common.util.concurrent.s) s7.a.g(cVar.T(k4Var.z3(), k4Var.f11864u), "MediaController.Listener#onSetCustomLayout() must not return null");
        if (z11) {
            cVar.O(k4Var.z3(), k4Var.f11864u);
        }
        if (z12) {
            cVar.z(k4Var.z3(), k4Var.f11863t);
        }
        k4Var.p4(i11, sVar);
    }

    private boolean I3(int i11) {
        if (this.f11869z.c(i11)) {
            return true;
        }
        s7.t.i("MCImplBase", "Controller isn't allowed to call command= " + i11);
        return false;
    }

    private static ne K3(ne neVar, int i11, List<p7.y> list, long j11, long j12) {
        int size;
        p7.r0 r0Var = neVar.f12029j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < r0Var.t(); i13++) {
            arrayList.add(r0Var.r(i13, new p7.r0.d()));
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            arrayList.add(i14 + i11, q3(list.get(i14)));
        }
        e4(r0Var, arrayList, arrayList2);
        p7.r0 r0VarO3 = o3(arrayList, arrayList2);
        if (neVar.f12029j.u()) {
            size = 0;
        } else {
            int size2 = neVar.f12022c.f12456a.f101397c;
            if (size2 >= i11) {
                size2 += list.size();
            }
            i12 = size2;
            size = neVar.f12022c.f12456a.f101400f;
            if (size >= i11) {
                size += list.size();
            }
        }
        return N3(neVar, r0VarO3, i12, size, j11, j12, 5);
    }

    public static /* synthetic */ void L2(final k4 k4Var, int i11) {
        k4Var.f11854k.remove(Integer.valueOf(i11));
        ve veVar = k4Var.f11856m;
        if (veVar == null || veVar.d() >= 5 || !k4Var.f11854k.isEmpty()) {
            return;
        }
        k4Var.f11855l.postDelayed(new Runnable() { // from class: androidx.media3.session.d4
            @Override // java.lang.Runnable
            public final void run() {
                k4.U0(this.f11600a);
            }
        }, 500L);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    private static ne L3(ne neVar, int i11, int i12, boolean z11, long j11, long j12) {
        int i13;
        p7.r0 r0Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ne neVarN3;
        p7.r0 r0Var2 = neVar.f12029j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i21 = 0; i21 < r0Var2.t(); i21++) {
            if (i21 < i11 || i21 >= i12) {
                arrayList.add(r0Var2.r(i21, new p7.r0.d()));
            }
        }
        e4(r0Var2, arrayList, arrayList2);
        p7.r0 r0VarO3 = o3(arrayList, arrayList2);
        int iA3 = 0;
        int iY3 = y3(neVar);
        int i22 = neVar.f12022c.f12456a.f101400f;
        p7.r0.d dVar = new p7.r0.d();
        boolean z12 = iY3 >= i11 && iY3 < i12;
        if (r0VarO3.u()) {
            i13 = iY3;
            r0Var = r0Var2;
            i14 = i11;
            i15 = i12;
            i17 = -1;
        } else {
            if (!z12) {
                i13 = iY3;
                r0Var = r0Var2;
                i14 = i11;
                i15 = i12;
                if (i13 >= i15) {
                    i18 = i13 - (i15 - i14);
                    iA3 = A3(r0Var, i22, i14, i15);
                } else {
                    i16 = i22;
                    i17 = i13;
                }
                if (z12) {
                    i19 = 4;
                    neVarN3 = N3(neVar, r0VarO3, i17, i16, j11, j12, 4);
                } else if (i17 == -1) {
                    neVarN3 = O3(neVar, r0VarO3, ue.f12444k, ue.f12445l, 4);
                    i19 = 4;
                } else if (z11) {
                    i19 = 4;
                    neVarN3 = N3(neVar, r0VarO3, i17, i16, j11, j12, 4);
                } else {
                    i19 = 4;
                    p7.r0.d dVarR = r0VarO3.r(i17, new p7.r0.d());
                    long jC = dVarR.c();
                    long jE = dVarR.e();
                    p7.j0.e eVar = new p7.j0.e(null, i17, dVarR.f101483c, null, i16, jC, jC, -1, -1);
                    neVarN3 = O3(neVar, r0VarO3, eVar, new ue(eVar, false, SystemClock.elapsedRealtime(), jE, jC, me.c(jC, jE), 0L, -9223372036854775807L, jE, jC), 4);
                }
                int i23 = neVarN3.f12044y;
                return i23 != 1 ? neVarN3 : neVarN3;
            }
            int iL4 = l4(neVar.f12027h, neVar.f12028i, iY3, r0Var2, i11, i12);
            i13 = iY3;
            r0Var = r0Var2;
            i14 = i11;
            i15 = i12;
            if (iL4 == -1) {
                iL4 = r0VarO3.e(neVar.f12028i);
            } else if (iL4 >= i15) {
                iL4 -= i15 - i14;
            }
            i18 = iL4;
            iA3 = r0VarO3.r(i18, dVar).f101494n;
            i17 = i18;
        }
        i16 = iA3;
        if (z12) {
            i19 = 4;
            neVarN3 = N3(neVar, r0VarO3, i17, i16, j11, j12, 4);
        } else if (i17 == -1) {
            neVarN3 = O3(neVar, r0VarO3, ue.f12444k, ue.f12445l, 4);
            i19 = 4;
        } else if (z11) {
            i19 = 4;
            neVarN3 = N3(neVar, r0VarO3, i17, i16, j11, j12, 4);
        } else {
            i19 = 4;
            p7.r0.d dVarR2 = r0VarO3.r(i17, new p7.r0.d());
            long jC2 = dVarR2.c();
            long jE2 = dVarR2.e();
            p7.j0.e eVar2 = new p7.j0.e(null, i17, dVarR2.f101483c, null, i16, jC2, jC2, -1, -1);
            neVarN3 = O3(neVar, r0VarO3, eVar2, new ue(eVar2, false, SystemClock.elapsedRealtime(), jE2, jC2, me.c(jC2, jE2), 0L, -9223372036854775807L, jE2, jC2), 4);
        }
        int i24 = neVarN3.f12044y;
        return i24 != 1 ? neVarN3 : neVarN3;
    }

    private ne M3(ne neVar, p7.r0 r0Var, c cVar) {
        int i11 = neVar.f12022c.f12456a.f101400f;
        int i12 = cVar.f11872a;
        p7.r0.b bVar = new p7.r0.b();
        r0Var.j(i11, bVar);
        p7.r0.b bVar2 = new p7.r0.b();
        r0Var.j(i12, bVar2);
        boolean z11 = i11 != i12;
        long j11 = cVar.f11873b;
        long jB1 = s7.q0.b1(D()) - bVar.p();
        if (!z11 && j11 == jB1) {
            return neVar;
        }
        s7.a.h(neVar.f12022c.f12456a.f101403i == -1);
        p7.j0.e eVar = new p7.j0.e(null, bVar.f101462c, neVar.f12022c.f12456a.f101398d, null, i11, s7.q0.O1(bVar.f101464e + jB1), s7.q0.O1(bVar.f101464e + jB1), -1, -1);
        r0Var.j(i12, bVar2);
        p7.r0.d dVar = new p7.r0.d();
        r0Var.r(bVar2.f101462c, dVar);
        long jO1 = s7.q0.O1(bVar2.f101464e + j11);
        p7.j0.e eVar2 = new p7.j0.e(null, bVar2.f101462c, dVar.f101483c, null, i12, jO1, jO1, -1, -1);
        ne neVarO = neVar.o(eVar, eVar2, 1);
        if (z11 || j11 < jB1) {
            return neVarO.s(new ue(eVar2, false, SystemClock.elapsedRealtime(), dVar.e(), jO1, me.c(jO1, dVar.e()), 0L, -9223372036854775807L, -9223372036854775807L, jO1));
        }
        long jMax = Math.max(0L, s7.q0.b1(neVarO.f12022c.f12462g) - (j11 - jB1));
        long jO2 = s7.q0.O1(bVar2.f101464e + j11 + jMax);
        return neVarO.s(new ue(eVar2, false, SystemClock.elapsedRealtime(), dVar.e(), jO2, me.c(jO2, dVar.e()), s7.q0.O1(jMax), -9223372036854775807L, -9223372036854775807L, jO2));
    }

    private static ne N3(ne neVar, p7.r0 r0Var, int i11, int i12, long j11, long j12, int i13) {
        p7.y yVar = r0Var.r(i11, new p7.r0.d()).f101483c;
        p7.j0.e eVar = neVar.f12022c.f12456a;
        p7.j0.e eVar2 = new p7.j0.e(null, i11, yVar, null, i12, j11, j12, eVar.f101403i, eVar.f101404j);
        boolean z11 = neVar.f12022c.f12457b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ue ueVar = neVar.f12022c;
        return O3(neVar, r0Var, eVar2, new ue(eVar2, z11, jElapsedRealtime, ueVar.f12459d, ueVar.f12460e, ueVar.f12461f, ueVar.f12462g, ueVar.f12463h, ueVar.f12464i, ueVar.f12465j), i13);
    }

    private static ne O3(ne neVar, p7.r0 r0Var, p7.j0.e eVar, ue ueVar, int i11) {
        return new ne.b(neVar).B(r0Var).o(neVar.f12022c.f12456a).n(eVar).z(ueVar).h(i11).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P3(final int i11, final int i12) {
        if (this.D.b() == i11 && this.D.a() == i12) {
            return;
        }
        this.D = new s7.e0(i11, i12);
        this.f11852i.k(24, new s7.s.a() { // from class: androidx.media3.session.q3
            @Override // s7.s.a
            public final void invoke(Object obj) {
                ((p7.j0.d) obj).onSurfaceSizeChanged(i11, i12);
            }
        });
    }

    private void Q3(int i11, int i12, int i13) {
        int i14;
        int i15;
        p7.r0 r0Var = this.f11859p.f12029j;
        int iT = r0Var.t();
        int iMin = Math.min(i12, iT);
        int i16 = iMin - i11;
        int iMin2 = Math.min(i13, iT - i16);
        if (i11 >= iT || i11 == iMin || i11 == iMin2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i17 = 0; i17 < iT; i17++) {
            arrayList.add(r0Var.r(i17, new p7.r0.d()));
        }
        s7.q0.a1(arrayList, i11, iMin, iMin2);
        e4(r0Var, arrayList, arrayList2);
        p7.r0 r0VarO3 = o3(arrayList, arrayList2);
        if (r0VarO3.u()) {
            return;
        }
        int iR = R();
        if (iR >= i11 && iR < iMin) {
            i15 = (iR - i11) + iMin2;
        } else {
            if (iMin > iR || iMin2 <= iR) {
                if (iMin <= iR || iMin2 > iR) {
                    i14 = iR;
                } else {
                    i15 = iR + i16;
                }
                p7.r0.d dVar = new p7.r0.d();
                u4(N3(this.f11859p, r0VarO3, i14, r0VarO3.r(i14, dVar).f101494n + (this.f11859p.f12022c.f12456a.f101400f - r0Var.r(iR, dVar).f101494n), D(), Q(), 5), 0, null, null, null);
            }
            i15 = iR - i16;
        }
        i14 = i15;
        p7.r0.d dVar2 = new p7.r0.d();
        u4(N3(this.f11859p, r0VarO3, i14, r0VarO3.r(i14, dVar2).f101494n + (this.f11859p.f12022c.f12456a.f101400f - r0Var.r(iR, dVar2).f101494n), D(), Q(), 5), 0, null, null, null);
    }

    private void S3(ne neVar, final ne neVar2, final Integer num, final Integer num2, final Integer num3, final Integer num4) {
        if (num != null) {
            this.f11852i.h(0, new s7.s.a() { // from class: androidx.media3.session.q1
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).a0(neVar2.f12029j, num.intValue());
                }
            });
        }
        if (num3 != null) {
            this.f11852i.h(11, new s7.s.a() { // from class: androidx.media3.session.c2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ne neVar3 = neVar2;
                    ((p7.j0.d) obj).H(neVar3.f12023d, neVar3.f12024e, num3.intValue());
                }
            });
        }
        final p7.y yVarC = neVar2.C();
        if (num4 != null) {
            this.f11852i.h(1, new s7.s.a() { // from class: androidx.media3.session.l2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).U(yVarC, num4.intValue());
                }
            });
        }
        PlaybackException playbackException = neVar.f12020a;
        final PlaybackException playbackException2 = neVar2.f12020a;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.c(playbackException2))) {
            this.f11852i.h(10, new s7.s.a() { // from class: androidx.media3.session.m2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).d0(playbackException2);
                }
            });
            if (playbackException2 != null) {
                this.f11852i.h(10, new s7.s.a() { // from class: androidx.media3.session.n2
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        ((p7.j0.d) obj).F(playbackException2);
                    }
                });
            }
        }
        if (!neVar.D.equals(neVar2.D)) {
            this.f11852i.h(2, new s7.s.a() { // from class: androidx.media3.session.o2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).S(neVar2.D);
                }
            });
        }
        if (!neVar.f12045z.equals(neVar2.f12045z)) {
            this.f11852i.h(14, new s7.s.a() { // from class: androidx.media3.session.p2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).Z(neVar2.f12045z);
                }
            });
        }
        if (neVar.f12042w != neVar2.f12042w) {
            this.f11852i.h(3, new s7.s.a() { // from class: androidx.media3.session.q2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onIsLoadingChanged(neVar2.f12042w);
                }
            });
        }
        if (neVar.f12044y != neVar2.f12044y) {
            this.f11852i.h(4, new s7.s.a() { // from class: androidx.media3.session.s2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onPlaybackStateChanged(neVar2.f12044y);
                }
            });
        }
        if (num2 != null) {
            this.f11852i.h(5, new s7.s.a() { // from class: androidx.media3.session.t2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onPlayWhenReadyChanged(neVar2.f12039t, num2.intValue());
                }
            });
        }
        if (neVar.f12043x != neVar2.f12043x) {
            this.f11852i.h(6, new s7.s.a() { // from class: androidx.media3.session.r1
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onPlaybackSuppressionReasonChanged(neVar2.f12043x);
                }
            });
        }
        if (neVar.f12041v != neVar2.f12041v) {
            this.f11852i.h(7, new s7.s.a() { // from class: androidx.media3.session.s1
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onIsPlayingChanged(neVar2.f12041v);
                }
            });
        }
        if (!neVar.f12026g.equals(neVar2.f12026g)) {
            this.f11852i.h(12, new s7.s.a() { // from class: androidx.media3.session.t1
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).v(neVar2.f12026g);
                }
            });
        }
        if (neVar.f12027h != neVar2.f12027h) {
            this.f11852i.h(8, new s7.s.a() { // from class: androidx.media3.session.u1
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onRepeatModeChanged(neVar2.f12027h);
                }
            });
        }
        if (neVar.f12028i != neVar2.f12028i) {
            this.f11852i.h(9, new s7.s.a() { // from class: androidx.media3.session.w1
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onShuffleModeEnabledChanged(neVar2.f12028i);
                }
            });
        }
        if (!neVar.f12032m.equals(neVar2.f12032m)) {
            this.f11852i.h(15, new s7.s.a() { // from class: androidx.media3.session.x1
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).Q(neVar2.f12032m);
                }
            });
        }
        if (neVar.f12033n != neVar2.f12033n) {
            this.f11852i.h(22, new s7.s.a() { // from class: androidx.media3.session.y1
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onVolumeChanged(neVar2.f12033n);
                }
            });
        }
        if (!neVar.f12034o.equals(neVar2.f12034o)) {
            this.f11852i.h(20, new s7.s.a() { // from class: androidx.media3.session.z1
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).E(neVar2.f12034o);
                }
            });
        }
        if (!neVar.f12035p.f107106a.equals(neVar2.f12035p.f107106a)) {
            this.f11852i.h(27, new s7.s.a() { // from class: androidx.media3.session.a2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onCues(neVar2.f12035p.f107106a);
                }
            });
            this.f11852i.h(27, new s7.s.a() { // from class: androidx.media3.session.b2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).B(neVar2.f12035p);
                }
            });
        }
        if (!neVar.f12036q.equals(neVar2.f12036q)) {
            this.f11852i.h(29, new s7.s.a() { // from class: androidx.media3.session.d2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).D(neVar2.f12036q);
                }
            });
        }
        if (neVar.f12037r != neVar2.f12037r || neVar.f12038s != neVar2.f12038s) {
            this.f11852i.h(30, new s7.s.a() { // from class: androidx.media3.session.e2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ne neVar3 = neVar2;
                    ((p7.j0.d) obj).onDeviceVolumeChanged(neVar3.f12037r, neVar3.f12038s);
                }
            });
        }
        if (!neVar.f12031l.equals(neVar2.f12031l)) {
            this.f11852i.h(25, new s7.s.a() { // from class: androidx.media3.session.f2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).b(neVar2.f12031l);
                }
            });
        }
        if (neVar.A != neVar2.A) {
            this.f11852i.h(16, new s7.s.a() { // from class: androidx.media3.session.h2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onSeekBackIncrementChanged(neVar2.A);
                }
            });
        }
        if (neVar.B != neVar2.B) {
            this.f11852i.h(17, new s7.s.a() { // from class: androidx.media3.session.i2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onSeekForwardIncrementChanged(neVar2.B);
                }
            });
        }
        if (neVar.C != neVar2.C) {
            this.f11852i.h(18, new s7.s.a() { // from class: androidx.media3.session.j2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onMaxSeekToPreviousPositionChanged(neVar2.C);
                }
            });
        }
        if (!neVar.E.equals(neVar2.E)) {
            this.f11852i.h(19, new s7.s.a() { // from class: androidx.media3.session.k2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).K(neVar2.E);
                }
            });
        }
        this.f11852i.f();
    }

    public static /* synthetic */ void U0(k4 k4Var) {
        ne neVar = k4Var.I;
        if (neVar != null) {
            k4Var.Z3(neVar, ne.c.f12072c);
        }
    }

    public static /* synthetic */ void c0(k4 k4Var, int i11, p7.y yVar, o oVar, int i12) {
        if (((ve) s7.a.f(k4Var.f11856m)).d() >= 2) {
            oVar.u0(k4Var.f11846c, i12, i11, yVar.g());
        } else {
            oVar.d2(k4Var.f11846c, i12, i11 + 1, yVar.g());
            oVar.l0(k4Var.f11846c, i12, i11);
        }
    }

    private static void e4(p7.r0 r0Var, List<p7.r0.d> list, List<p7.r0.b> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            p7.r0.d dVar = list.get(i11);
            int i12 = dVar.f101494n;
            int i13 = dVar.f101495o;
            if (i12 == -1 || i13 == -1) {
                dVar.f101494n = list2.size();
                dVar.f101495o = list2.size();
                list2.add(p3(i11));
            } else {
                dVar.f101494n = list2.size();
                dVar.f101495o = list2.size() + (i13 - i12);
                while (i12 <= i13) {
                    list2.add(E3(r0Var, i12, i11));
                    i12++;
                }
            }
        }
    }

    private void f4(int i11, int i12) {
        int iT = this.f11859p.f12029j.t();
        int iMin = Math.min(i12, iT);
        if (i11 >= iT || i11 == iMin || iT == 0) {
            return;
        }
        boolean z11 = R() >= i11 && R() < iMin;
        ne neVarL3 = L3(this.f11859p, i11, iMin, false, D(), Q());
        int i13 = this.f11859p.f12022c.f12456a.f101397c;
        u4(neVarL3, 0, null, z11 ? 4 : null, i13 >= i11 && i13 < iMin ? 3 : null);
    }

    private void g4(int i11, int i12, List<p7.y> list) {
        int iT = this.f11859p.f12029j.t();
        if (i11 > iT) {
            return;
        }
        if (this.f11859p.f12029j.u()) {
            r4(list, -1, -9223372036854775807L, false);
            return;
        }
        int iMin = Math.min(i12, iT);
        ne neVarL3 = L3(K3(this.f11859p, iMin, list, D(), Q()), i11, iMin, true, D(), Q());
        int i13 = this.f11859p.f12022c.f12456a.f101397c;
        boolean z11 = i13 >= i11 && i13 < iMin;
        u4(neVarL3, 0, null, z11 ? 4 : null, z11 ? 3 : null);
    }

    private boolean h4() {
        int i11 = Build.VERSION.SDK_INT >= 29 ? 4097 : 1;
        Intent intent = new Intent("androidx.media3.session.MediaSessionService");
        intent.setClassName(this.f11848e.e(), this.f11848e.g());
        try {
            if (this.f11847d.bindService(intent, this.f11857n, i11)) {
                return true;
            }
            s7.t.i("MCImplBase", "bind to " + this.f11848e + " failed");
            return false;
        } catch (SecurityException e11) {
            s7.t.j("MCImplBase", "bind to " + this.f11848e + " not allowed", e11);
            return false;
        }
    }

    private void i3(int i11, List<p7.y> list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f11859p.f12029j.u()) {
            r4(list, -1, -9223372036854775807L, false);
        } else {
            u4(K3(this.f11859p, Math.min(i11, this.f11859p.f12029j.t()), list, D(), Q()), 0, null, null, this.f11859p.f12029j.u() ? 3 : null);
        }
    }

    private boolean i4(Bundle bundle) {
        try {
            o.a.R2((IBinder) s7.a.j(this.f11848e.a())).O1(this.f11846c, this.f11845b.c(), new g(this.f11847d.getPackageName(), Process.myPid(), bundle, this.f11844a.e1()).b());
            return true;
        } catch (RemoteException e11) {
            s7.t.j("MCImplBase", "Failed to call connection request.", e11);
            return false;
        }
    }

    private void j3() {
        TextureView textureView = this.C;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            this.C = null;
        }
        SurfaceHolder surfaceHolder = this.B;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f11851h);
            this.B = null;
        }
        if (this.A != null) {
            this.A = null;
        }
    }

    private static com.google.common.collect.x<androidx.media3.session.a> j4(List<androidx.media3.session.a> list, List<androidx.media3.session.a> list2, Bundle bundle, te teVar, p7.j0.b bVar) {
        if (!list2.isEmpty()) {
            return androidx.media3.session.a.d(list2, teVar, bVar);
        }
        boolean z11 = false;
        boolean z12 = (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bVar.d(6, 7)) ? false : true;
        if (!bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT") && !bVar.d(8, 9)) {
            z11 = true;
        }
        return androidx.media3.session.a.f(list, z12, z11);
    }

    public static /* synthetic */ void k1(k4 k4Var) {
        v vVarZ3 = k4Var.z3();
        v vVarZ4 = k4Var.z3();
        Objects.requireNonNull(vVarZ4);
        vVarZ3.l1(new ga.j(vVarZ4));
    }

    private static com.google.common.collect.x<androidx.media3.session.a> k4(List<androidx.media3.session.a> list, List<androidx.media3.session.a> list2, te teVar, p7.j0.b bVar, Bundle bundle) {
        if (list.isEmpty()) {
            list = androidx.media3.session.a.i(list2, bVar, bundle);
        }
        return androidx.media3.session.a.d(list, teVar, bVar);
    }

    private static int l4(int i11, boolean z11, int i12, p7.r0 r0Var, int i13, int i14) {
        int iT = r0Var.t();
        for (int i15 = 0; i15 < iT && (i12 = r0Var.i(i12, i11, z11)) != -1; i15++) {
            if (i12 < i13 || i12 >= i14) {
                return i12;
            }
        }
        return -1;
    }

    public static /* synthetic */ void m1(k4 k4Var, Bundle bundle, boolean z11, boolean z12, v.c cVar) {
        cVar.W(k4Var.z3(), bundle);
        if (z11) {
            cVar.O(k4Var.z3(), k4Var.f11864u);
        }
        if (z12) {
            cVar.z(k4Var.z3(), k4Var.f11863t);
        }
    }

    private static int m3(int i11) {
        if (i11 == 1) {
            return 0;
        }
        return i11;
    }

    private void m4(int i11, long j11) {
        int i12;
        int i13;
        ne neVarM3;
        p7.r0 r0Var = this.f11859p.f12029j;
        if ((r0Var.u() || i11 < r0Var.t()) && !m()) {
            int i14 = g() == 1 ? 1 : 2;
            ne neVar = this.f11859p;
            ne neVarL = neVar.l(i14, neVar.f12020a);
            c cVarC3 = C3(r0Var, i11, j11);
            if (cVarC3 == null) {
                i12 = 1;
                i13 = 2;
                p7.j0.e eVar = new p7.j0.e(null, i11, null, null, i11, j11 == -9223372036854775807L ? 0L : j11, j11 == -9223372036854775807L ? 0L : j11, -1, -1);
                ne neVar2 = this.f11859p;
                p7.r0 r0Var2 = neVar2.f12029j;
                boolean z11 = this.f11859p.f12022c.f12457b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ue ueVar = this.f11859p.f12022c;
                neVarM3 = O3(neVar2, r0Var2, eVar, new ue(eVar, z11, jElapsedRealtime, ueVar.f12459d, j11 == -9223372036854775807L ? 0L : j11, 0, 0L, ueVar.f12463h, ueVar.f12464i, j11 == -9223372036854775807L ? 0L : j11), 1);
            } else {
                i12 = 1;
                i13 = 2;
                neVarM3 = M3(neVarL, r0Var, cVarC3);
            }
            int i15 = (this.f11859p.f12029j.u() || neVarM3.f12022c.f12456a.f101397c == this.f11859p.f12022c.f12456a.f101397c) ? 0 : i12;
            if (i15 == 0 && neVarM3.f12022c.f12456a.f101401g == this.f11859p.f12022c.f12456a.f101401g) {
                return;
            }
            u4(neVarM3, null, null, Integer.valueOf(i12), i15 != 0 ? Integer.valueOf(i13) : null);
        }
    }

    private static p7.j0.b n3(p7.j0.b bVar, p7.j0.b bVar2) {
        p7.j0.b bVarF = me.f(bVar, bVar2);
        return bVarF.c(32) ? bVarF : bVarF.b().a(32).f();
    }

    private void n4(long j11) {
        long jD = D() + j11;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jD = Math.min(jD, duration);
        }
        m4(R(), Math.max(jD, 0L));
    }

    private static p7.r0 o3(List<p7.r0.d> list, List<p7.r0.b> list2) {
        return new p7.r0.c(new com.google.common.collect.x.a().j(list).k(), new com.google.common.collect.x.a().j(list2).k(), me.d(list.size()));
    }

    private void o4(int i11, ga.v vVar) {
        o oVar = this.E;
        if (oVar == null) {
            return;
        }
        try {
            oVar.a2(this.f11846c, i11, vVar.b());
        } catch (RemoteException unused) {
            s7.t.i("MCImplBase", "Error in sending");
        }
    }

    private static p7.r0.b p3(int i11) {
        return new p7.r0.b().v(null, null, i11, -9223372036854775807L, 0L, p7.b.f101195g, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p4(final int i11, final com.google.common.util.concurrent.s<ga.v> sVar) {
        sVar.b(new Runnable() { // from class: androidx.media3.session.o0
            @Override // java.lang.Runnable
            public final void run() {
                k4.B2(this.f12079a, sVar, i11);
            }
        }, com.google.common.util.concurrent.w.b());
    }

    private static p7.r0.d q3(p7.y yVar) {
        return new p7.r0.d().h(0, yVar, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
    }

    public static /* synthetic */ void r2(k4 k4Var, boolean z11, boolean z12, int i11, v.c cVar) {
        com.google.common.util.concurrent.s<ga.v> sVar = (com.google.common.util.concurrent.s) s7.a.g(cVar.T(k4Var.z3(), k4Var.f11864u), "MediaController.Listener#onSetCustomLayout() must not return null");
        if (z11) {
            cVar.O(k4Var.z3(), k4Var.f11864u);
        }
        if (z12) {
            cVar.z(k4Var.z3(), k4Var.f11863t);
        }
        k4Var.p4(i11, sVar);
    }

    private com.google.common.util.concurrent.s<ga.v> r3(o oVar, d dVar, boolean z11) {
        if (oVar == null) {
            return com.google.common.util.concurrent.m.d(new ga.v(-4));
        }
        re.a aVarA = this.f11845b.a(new ga.v(1));
        int iS = aVarA.S();
        if (z11) {
            if (this.f11854k.isEmpty()) {
                this.I = this.f11859p;
            }
            this.f11854k.add(Integer.valueOf(iS));
        }
        try {
            dVar.a(oVar, iS);
            return aVarA;
        } catch (RemoteException e11) {
            s7.t.j("MCImplBase", "Cannot connect to the service or the session is gone", e11);
            this.f11854k.remove(Integer.valueOf(iS));
            this.f11845b.e(iS, new ga.v(-100));
            return aVarA;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r26v0 ??, still in use, count: 1, list:
          (r26v0 ?? I:p7.j0$e) from 0x0133: CONSTRUCTOR (r25v0 ?? I:androidx.media3.session.ue) = 
          (r26v0 ?? I:p7.j0$e)
          (r27v0 ?? I:boolean)
          (r28v0 ?? I:long)
          (r30v0 ?? I:long)
          (r32v0 ?? I:long)
          (r34v0 ?? I:int)
          (r35v0 ?? I:long)
          (r37v0 ?? I:long)
          (r39v0 ?? I:long)
          (r41v0 ?? I:long)
         A[MD:(p7.j0$e, boolean, long, long, long, int, long, long, long, long):void (m)] (LINE:308) call: androidx.media3.session.ue.<init>(p7.j0$e, boolean, long, long, long, int, long, long, long, long):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private void r4(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r26v0 ??, still in use, count: 1, list:
          (r26v0 ?? I:p7.j0$e) from 0x0133: CONSTRUCTOR (r25v0 ?? I:androidx.media3.session.ue) = 
          (r26v0 ?? I:p7.j0$e)
          (r27v0 ?? I:boolean)
          (r28v0 ?? I:long)
          (r30v0 ?? I:long)
          (r32v0 ?? I:long)
          (r34v0 ?? I:int)
          (r35v0 ?? I:long)
          (r37v0 ?? I:long)
          (r39v0 ?? I:long)
          (r41v0 ?? I:long)
         A[MD:(p7.j0$e, boolean, long, long, long, int, long, long, long, long):void (m)] (LINE:308) call: androidx.media3.session.ue.<init>(p7.j0$e, boolean, long, long, long, int, long, long, long, long):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r44v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    private void s3(d dVar) {
        this.f11853j.e();
        r3(this.E, dVar, true);
    }

    private void s4(boolean z11, int i11) {
        int I = I();
        if (I == 1) {
            I = 0;
        }
        ne neVar = this.f11859p;
        if (neVar.f12039t == z11 && neVar.f12043x == I) {
            return;
        }
        this.G = me.e(neVar, this.G, this.H, z3().g1());
        this.H = SystemClock.elapsedRealtime();
        u4(this.f11859p.j(z11, i11, I), null, Integer.valueOf(i11), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t3(d dVar) {
        this.f11853j.e();
        com.google.common.util.concurrent.s<ga.v> sVarR3 = r3(this.E, dVar, true);
        try {
            LegacyConversions.j0(sVarR3, 3000L);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11);
        } catch (TimeoutException e12) {
            if (sVarR3 instanceof re.a) {
                int iS = ((re.a) sVarR3).S();
                this.f11854k.remove(Integer.valueOf(iS));
                this.f11845b.e(iS, new ga.v(-1));
            }
            s7.t.j("MCImplBase", "Synchronous command takes too long on the session side.", e12);
        }
    }

    private com.google.common.util.concurrent.s<ga.v> u3(se seVar, d dVar) {
        return v3(0, seVar, dVar);
    }

    private void u4(ne neVar, Integer num, Integer num2, Integer num3, Integer num4) {
        ne neVar2 = this.f11859p;
        this.f11859p = neVar;
        S3(neVar2, neVar, num, num2, num3, num4);
    }

    private com.google.common.util.concurrent.s<ga.v> v3(int i11, se seVar, d dVar) {
        return r3(seVar != null ? H3(seVar) : G3(i11), dVar, false);
    }

    private void v4(ue ueVar) {
        if (this.f11854k.isEmpty()) {
            ue ueVar2 = this.f11859p.f12022c;
            if (ueVar2.f12458c >= ueVar.f12458c || !me.b(ueVar, ueVar2)) {
                return;
            }
            this.f11859p = this.f11859p.s(ueVar);
        }
    }

    private static int y3(ne neVar) {
        int i11 = neVar.f12022c.f12456a.f101397c;
        if (i11 == -1) {
            return 0;
        }
        return i11;
    }

    public static /* synthetic */ void z1(k4 k4Var) {
        e eVar = k4Var.f11857n;
        if (eVar != null) {
            k4Var.f11847d.unbindService(eVar);
            k4Var.f11857n = null;
        }
        k4Var.f11846c.j3();
    }

    @Override // androidx.media3.session.v.d
    public long A() {
        return this.f11859p.B;
    }

    @Override // androidx.media3.session.v.d
    public void A0(final int i11) {
        if (I3(20)) {
            s7.a.a(i11 >= 0);
            s3(new d() { // from class: androidx.media3.session.c4
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i12) {
                    oVar.l0(this.f11563a.f11846c, i12, i11);
                }
            });
            f4(i11, i11 + 1);
        }
    }

    @Override // androidx.media3.session.v.d
    public long B() {
        return this.f11859p.f12022c.f12465j;
    }

    @Override // androidx.media3.session.v.d
    public void B0(final int i11) {
        if (I3(34)) {
            s3(new d() { // from class: androidx.media3.session.m1
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i12) {
                    oVar.i0(this.f11958a.f11846c, i12, i11);
                }
            });
            final int i12 = this.f11859p.f12037r - 1;
            if (i12 >= i0().f101417b) {
                ne neVar = this.f11859p;
                this.f11859p = neVar.d(i12, neVar.f12038s);
                this.f11852i.h(30, new s7.s.a() { // from class: androidx.media3.session.n1
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        p7.j0.d dVar = (p7.j0.d) obj;
                        dVar.onDeviceVolumeChanged(i12, this.f11987a.f11859p.f12038s);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    public int B3() {
        if (this.f11859p.f12029j.u()) {
            return -1;
        }
        return this.f11859p.f12029j.i(R(), m3(this.f11859p.f12027h), this.f11859p.f12028i);
    }

    @Override // androidx.media3.session.v.d
    public void C() {
        if (I3(12)) {
            s3(new d() { // from class: androidx.media3.session.n3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.Y0(this.f11990a.f11846c, i11);
                }
            });
            n4(A());
        }
    }

    @Override // androidx.media3.session.v.d
    public void C0(final p7.w0 w0Var) {
        if (I3(29)) {
            s3(new d() { // from class: androidx.media3.session.g1
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.Q2(this.f11699a.f11846c, i11, w0Var.K());
                }
            });
            ne neVar = this.f11859p;
            if (w0Var != neVar.E) {
                this.f11859p = neVar.x(w0Var);
                this.f11852i.h(19, new s7.s.a() { // from class: androidx.media3.session.h1
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        ((p7.j0.d) obj).K(w0Var);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public long D() {
        long jE = me.e(this.f11859p, this.G, this.H, z3().g1());
        this.G = jE;
        return jE;
    }

    @Override // androidx.media3.session.v.d
    public void D0(p7.j0.d dVar) {
        this.f11852i.c(dVar);
    }

    @Override // androidx.media3.session.v.d
    public void E() {
        if (I3(4)) {
            s3(new d() { // from class: androidx.media3.session.r0
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.U1(this.f12178a.f11846c, i11);
                }
            });
            m4(R(), -9223372036854775807L);
        }
    }

    @Override // androidx.media3.session.v.d
    public void F() {
        if (I3(7)) {
            s3(new d() { // from class: androidx.media3.session.u0
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.R1(this.f12420a.f11846c, i11);
                }
            });
            p7.r0 r0VarJ = J();
            if (r0VarJ.u() || m()) {
                return;
            }
            boolean zP = P();
            p7.r0.d dVarR = r0VarJ.r(R(), new p7.r0.d());
            if (dVarR.f101489i && dVarR.g()) {
                if (zP) {
                    m4(F3(), -9223372036854775807L);
                }
            } else if (!zP || D() > v()) {
                m4(R(), 0L);
            } else {
                m4(F3(), -9223372036854775807L);
            }
        }
    }

    public int F3() {
        if (this.f11859p.f12029j.u()) {
            return -1;
        }
        return this.f11859p.f12029j.p(R(), m3(this.f11859p.f12027h), this.f11859p.f12028i);
    }

    @Override // androidx.media3.session.v.d
    public void G(final boolean z11) {
        if (I3(1)) {
            s3(new d() { // from class: androidx.media3.session.d1
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.c1(this.f11596a.f11846c, i11, z11);
                }
            });
            s4(z11, 1);
        } else if (z11) {
            s7.t.i("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    @Override // androidx.media3.session.v.d
    public float G0() {
        return this.f11859p.f12033n;
    }

    o G3(int i11) {
        s7.a.a(i11 != 0);
        if (this.f11866w.b(i11)) {
            return this.E;
        }
        s7.t.i("MCImplBase", "Controller isn't allowed to call command, commandCode=" + i11);
        return null;
    }

    @Override // androidx.media3.session.v.d
    public r7.e H() {
        return this.f11859p.f12035p;
    }

    @Override // androidx.media3.session.v.d
    public p7.d H0() {
        return this.f11859p.f12034o;
    }

    o H3(se seVar) {
        s7.a.a(seVar.f12347a == 0);
        if (this.f11866w.c(seVar)) {
            return this.E;
        }
        s7.t.i("MCImplBase", "Controller isn't allowed to call custom session command:" + seVar.f12348b);
        return null;
    }

    @Override // androidx.media3.session.v.d
    public int I() {
        return this.f11859p.f12043x;
    }

    @Override // androidx.media3.session.v.d
    public void I0(final int i11, final int i12) {
        if (I3(33)) {
            s3(new d() { // from class: androidx.media3.session.u2
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i13) {
                    oVar.e2(this.f12422a.f11846c, i13, i11, i12);
                }
            });
            p7.m mVarI0 = i0();
            ne neVar = this.f11859p;
            if (neVar.f12037r == i11 || mVarI0.f101417b > i11) {
                return;
            }
            int i13 = mVarI0.f101418c;
            if (i13 == 0 || i11 <= i13) {
                this.f11859p = neVar.d(i11, neVar.f12038s);
                this.f11852i.h(30, new s7.s.a() { // from class: androidx.media3.session.v2
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        p7.j0.d dVar = (p7.j0.d) obj;
                        dVar.onDeviceVolumeChanged(i11, this.f12487a.f11859p.f12038s);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public p7.r0 J() {
        return this.f11859p.f12029j;
    }

    @Override // androidx.media3.session.v.d
    public void J0(final int i11, final p7.y yVar) {
        if (I3(20)) {
            s7.a.a(i11 >= 0);
            s3(new d() { // from class: androidx.media3.session.q0
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i12) {
                    k4.c0(this.f12137a, i11, yVar, oVar, i12);
                }
            });
            g4(i11, i11 + 1, com.google.common.collect.x.s(yVar));
        }
    }

    boolean J3() {
        return this.f11858o;
    }

    @Override // androidx.media3.session.v.d
    public void K() {
        if (I3(9)) {
            s3(new d() { // from class: androidx.media3.session.a1
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.H1(this.f11478a.f11846c, i11);
                }
            });
            p7.r0 r0VarJ = J();
            if (r0VarJ.u() || m()) {
                return;
            }
            if (q()) {
                m4(B3(), -9223372036854775807L);
                return;
            }
            p7.r0.d dVarR = r0VarJ.r(R(), new p7.r0.d());
            if (dVarR.f101489i && dVarR.g()) {
                m4(R(), -9223372036854775807L);
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public void K0(final int i11, final List<p7.y> list) {
        if (I3(20)) {
            s7.a.a(i11 >= 0);
            s3(new d() { // from class: androidx.media3.session.b0
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i12) {
                    oVar.p2(this.f11509a.f11846c, i12, i11, new p7.g(s7.i.i(list, new ga.i())));
                }
            });
            i3(i11, list);
        }
    }

    @Override // androidx.media3.session.v.d
    public void L(TextureView textureView) {
        if (I3(27)) {
            if (textureView == null) {
                k3();
                return;
            }
            if (this.C == textureView) {
                return;
            }
            j3();
            this.C = textureView;
            textureView.setSurfaceTextureListener(this.f11851h);
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture == null) {
                t3(new d() { // from class: androidx.media3.session.i1
                    @Override // androidx.media3.session.k4.d
                    public final void a(o oVar, int i11) {
                        oVar.o2(this.f11770a.f11846c, i11, null);
                    }
                });
                P3(0, 0);
            } else {
                this.A = new Surface(surfaceTexture);
                t3(new d() { // from class: androidx.media3.session.j1
                    @Override // androidx.media3.session.k4.d
                    public final void a(o oVar, int i11) {
                        k4 k4Var = this.f11801a;
                        oVar.o2(k4Var.f11846c, i11, k4Var.A);
                    }
                });
                P3(textureView.getWidth(), textureView.getHeight());
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public long L0() {
        return this.f11859p.f12022c.f12460e;
    }

    @Override // androidx.media3.session.v.d
    public void M(final int i11, final long j11) {
        if (I3(10)) {
            s7.a.a(i11 >= 0);
            s3(new d() { // from class: androidx.media3.session.z0
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i12) {
                    oVar.j2(this.f12653a.f11846c, i12, i11, j11);
                }
            });
            m4(i11, j11);
        }
    }

    @Override // androidx.media3.session.v.d
    public void M0(final int i11, final int i12, final int i13) {
        if (I3(20)) {
            s7.a.a(i11 >= 0 && i11 <= i12 && i13 >= 0);
            s3(new d() { // from class: androidx.media3.session.b3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i14) {
                    oVar.D0(this.f11514a.f11846c, i14, i11, i12, i13);
                }
            });
            Q3(i11, i12, i13);
        }
    }

    @Override // androidx.media3.session.v.d
    public p7.j0.b N() {
        return this.f11869z;
    }

    @Override // androidx.media3.session.v.d
    public void N0(final List<p7.y> list) {
        if (I3(20)) {
            s3(new d() { // from class: androidx.media3.session.n0
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.c2(this.f11985a.f11846c, i11, new p7.g(s7.i.i(list, new ga.i())));
                }
            });
            i3(J().t(), list);
        }
    }

    @Override // androidx.media3.session.v.d
    public p7.e1 O() {
        return this.f11859p.f12031l;
    }

    @Override // androidx.media3.session.v.d
    @Deprecated
    public void O0(final int i11) {
        if (I3(25)) {
            s3(new d() { // from class: androidx.media3.session.t3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i12) {
                    oVar.D1(this.f12354a.f11846c, i12, i11);
                }
            });
            p7.m mVarI0 = i0();
            ne neVar = this.f11859p;
            if (neVar.f12037r == i11 || mVarI0.f101417b > i11) {
                return;
            }
            int i12 = mVarI0.f101418c;
            if (i12 == 0 || i11 <= i12) {
                this.f11859p = neVar.d(i11, neVar.f12038s);
                this.f11852i.h(30, new s7.s.a() { // from class: androidx.media3.session.u3
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        p7.j0.d dVar = (p7.j0.d) obj;
                        dVar.onDeviceVolumeChanged(i11, this.f12425a.f11859p.f12038s);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public boolean P() {
        return F3() != -1;
    }

    @Override // androidx.media3.session.v.d
    public com.google.common.util.concurrent.s<ga.v> P0(final se seVar, final Bundle bundle) {
        return u3(seVar, new d() { // from class: androidx.media3.session.j0
            @Override // androidx.media3.session.k4.d
            public final void a(o oVar, int i11) {
                oVar.j1(this.f11798a.f11846c, i11, seVar.b(), bundle);
            }
        });
    }

    @Override // androidx.media3.session.v.d
    public long Q() {
        ue ueVar = this.f11859p.f12022c;
        return !ueVar.f12457b ? D() : ueVar.f12456a.f101402h;
    }

    @Override // androidx.media3.session.v.d
    public te Q0() {
        return this.f11866w;
    }

    @Override // androidx.media3.session.v.d
    public int R() {
        return y3(this.f11859p);
    }

    @Override // androidx.media3.session.v.d
    public com.google.common.collect.x<androidx.media3.session.a> R0() {
        return this.f11863t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R3(ue ueVar) {
        if (isConnected()) {
            v4(ueVar);
        }
    }

    @Override // androidx.media3.session.v.d
    public void S(SurfaceView surfaceView) {
        if (I3(27)) {
            l3(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.session.v.d
    public Bundle S0() {
        return this.f11849f;
    }

    @Override // androidx.media3.session.v.d
    public boolean T() {
        return this.f11859p.f12028i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T3(p7.j0.b bVar) {
        boolean z11;
        boolean z12;
        if (isConnected() && !Objects.equals(this.f11868y, bVar)) {
            this.f11868y = bVar;
            p7.j0.b bVar2 = this.f11869z;
            p7.j0.b bVarN3 = n3(this.f11867x, bVar);
            this.f11869z = bVarN3;
            if (Objects.equals(bVarN3, bVar2)) {
                z11 = false;
                z12 = false;
            } else {
                com.google.common.collect.x<androidx.media3.session.a> xVar = this.f11863t;
                com.google.common.collect.x<androidx.media3.session.a> xVar2 = this.f11864u;
                com.google.common.collect.x<androidx.media3.session.a> xVarK4 = k4(this.f11862s, this.f11861r, this.f11866w, this.f11869z, this.J);
                this.f11863t = xVarK4;
                this.f11864u = j4(xVarK4, this.f11861r, this.J, this.f11866w, this.f11869z);
                z11 = !this.f11863t.equals(xVar);
                z12 = !this.f11864u.equals(xVar2);
                this.f11852i.k(13, new s7.s.a() { // from class: androidx.media3.session.i0
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        ((p7.j0.d) obj).R(this.f11769a.f11869z);
                    }
                });
            }
            if (z12) {
                z3().j1(new s7.n() { // from class: androidx.media3.session.k0
                    @Override // s7.n
                    public final void accept(Object obj) {
                        k4 k4Var = this.f11841a;
                        ((v.c) obj).O(k4Var.z3(), k4Var.f11864u);
                    }
                });
            }
            if (z11) {
                z3().j1(new s7.n() { // from class: androidx.media3.session.l0
                    @Override // s7.n
                    public final void accept(Object obj) {
                        k4 k4Var = this.f11898a;
                        ((v.c) obj).z(k4Var.z3(), k4Var.f11863t);
                    }
                });
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public void U() {
        if (I3(11)) {
            s3(new d() { // from class: androidx.media3.session.x0
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.C2(this.f12602a.f11846c, i11);
                }
            });
            n4(-W());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U3(final te teVar, p7.j0.b bVar) {
        boolean z11;
        boolean z12;
        if (isConnected()) {
            boolean zEquals = Objects.equals(this.f11867x, bVar);
            boolean zEquals2 = Objects.equals(this.f11866w, teVar);
            if (zEquals && zEquals2) {
                return;
            }
            this.f11866w = teVar;
            boolean z13 = false;
            if (zEquals) {
                z11 = false;
            } else {
                this.f11867x = bVar;
                p7.j0.b bVar2 = this.f11869z;
                p7.j0.b bVarN3 = n3(bVar, this.f11868y);
                this.f11869z = bVarN3;
                z11 = !Objects.equals(bVarN3, bVar2);
            }
            if (!zEquals2 || z11) {
                com.google.common.collect.x<androidx.media3.session.a> xVar = this.f11863t;
                com.google.common.collect.x<androidx.media3.session.a> xVar2 = this.f11864u;
                com.google.common.collect.x<androidx.media3.session.a> xVarK4 = k4(this.f11862s, this.f11861r, teVar, this.f11869z, this.J);
                this.f11863t = xVarK4;
                this.f11864u = j4(xVarK4, this.f11861r, this.J, teVar, this.f11869z);
                z12 = !this.f11863t.equals(xVar);
                z13 = !this.f11864u.equals(xVar2);
            } else {
                z12 = false;
            }
            if (z11) {
                this.f11852i.k(13, new s7.s.a() { // from class: androidx.media3.session.e0
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        ((p7.j0.d) obj).R(this.f11622a.f11869z);
                    }
                });
            }
            if (!zEquals2) {
                z3().j1(new s7.n() { // from class: androidx.media3.session.f0
                    @Override // s7.n
                    public final void accept(Object obj) {
                        v.c cVar = (v.c) obj;
                        cVar.n(this.f11660a.z3(), teVar);
                    }
                });
            }
            if (z13) {
                z3().j1(new s7.n() { // from class: androidx.media3.session.g0
                    @Override // s7.n
                    public final void accept(Object obj) {
                        k4 k4Var = this.f11698a;
                        ((v.c) obj).O(k4Var.z3(), k4Var.f11864u);
                    }
                });
            }
            if (z12) {
                z3().j1(new s7.n() { // from class: androidx.media3.session.h0
                    @Override // s7.n
                    public final void accept(Object obj) {
                        k4 k4Var = this.f11728a;
                        ((v.c) obj).z(k4Var.z3(), k4Var.f11863t);
                    }
                });
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public p7.e0 V() {
        return this.f11859p.f12045z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V3(k kVar) {
        if (this.E != null) {
            s7.t.d("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
            z3().release();
            return;
        }
        this.E = kVar.f11828c;
        this.f11860q = kVar.f11829d;
        this.f11866w = kVar.f11830e;
        p7.j0.b bVar = kVar.f11831f;
        this.f11867x = bVar;
        p7.j0.b bVar2 = kVar.f11832g;
        this.f11868y = bVar2;
        p7.j0.b bVarN3 = n3(bVar, bVar2);
        this.f11869z = bVarN3;
        com.google.common.collect.x<androidx.media3.session.a> xVar = kVar.f11836k;
        this.f11861r = xVar;
        com.google.common.collect.x<androidx.media3.session.a> xVar2 = kVar.f11837l;
        this.f11862s = xVar2;
        com.google.common.collect.x<androidx.media3.session.a> xVarK4 = k4(xVar2, xVar, this.f11866w, bVarN3, kVar.f11834i);
        this.f11863t = xVarK4;
        this.f11864u = j4(xVarK4, this.f11861r, kVar.f11834i, this.f11866w, this.f11869z);
        com.google.common.collect.z.a aVar = new com.google.common.collect.z.a();
        for (int i11 = 0; i11 < kVar.f11839n.size(); i11++) {
            androidx.media3.session.a aVar2 = kVar.f11839n.get(i11);
            se seVar = aVar2.f11456a;
            if (seVar != null && seVar.f12347a == 0) {
                aVar.f(seVar.f12348b, aVar2);
            }
        }
        this.f11865v = aVar.c();
        this.f11859p = kVar.f11835j;
        MediaSession.Token tokenF = kVar.f11838m;
        if (tokenF == null) {
            tokenF = this.f11848e.f();
        }
        MediaSession.Token token = tokenF;
        if (token != null) {
            this.F = new MediaController(this.f11847d, token);
        }
        try {
            kVar.f11828c.asBinder().linkToDeath(this.f11850g, 0);
            this.f11856m = new ve(this.f11848e.i(), 0, kVar.f11826a, kVar.f11827b, this.f11848e.e(), kVar.f11828c, kVar.f11833h, token);
            this.J = kVar.f11834i;
            z3().i1();
        } catch (RemoteException unused) {
            z3().release();
        }
    }

    @Override // androidx.media3.session.v.d
    public long W() {
        return this.f11859p.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W3(final int i11, final se seVar, final Bundle bundle) {
        if (isConnected()) {
            z3().j1(new s7.n() { // from class: androidx.media3.session.a0
                @Override // s7.n
                public final void accept(Object obj) {
                    k4 k4Var = this.f11474a;
                    k4Var.p4(i11, (com.google.common.util.concurrent.s) s7.a.g(((v.c) obj).q(k4Var.z3(), seVar, bundle), "ControllerCallback#onCustomCommand() must not return null"));
                }
            });
        }
    }

    @Override // androidx.media3.session.v.d
    public void X(final Surface surface) {
        if (I3(27)) {
            j3();
            this.A = surface;
            t3(new d() { // from class: androidx.media3.session.l1
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.o2(this.f11899a.f11846c, i11, surface);
                }
            });
            int i11 = surface == null ? 0 : -1;
            P3(i11, i11);
        }
    }

    public void X3(int i11, final ga.u uVar) {
        if (isConnected()) {
            z3().j1(new s7.n() { // from class: androidx.media3.session.d0
                @Override // s7.n
                public final void accept(Object obj) {
                    v.c cVar = (v.c) obj;
                    cVar.I(this.f11594a.z3(), uVar);
                }
            });
        }
    }

    @Override // androidx.media3.session.v.d
    public void Y(final List<p7.y> list, final boolean z11) {
        if (I3(20)) {
            s3(new d() { // from class: androidx.media3.session.i4
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.E1(this.f11774a.f11846c, i11, new p7.g(s7.i.i(list, new ga.i())), z11);
                }
            });
            r4(list, -1, -9223372036854775807L, z11);
        }
    }

    public void Y3(final Bundle bundle) {
        if (isConnected()) {
            com.google.common.collect.x<androidx.media3.session.a> xVar = this.f11863t;
            com.google.common.collect.x<androidx.media3.session.a> xVar2 = this.f11864u;
            this.J = bundle;
            com.google.common.collect.x<androidx.media3.session.a> xVarK4 = k4(this.f11862s, this.f11861r, this.f11866w, this.f11869z, bundle);
            this.f11863t = xVarK4;
            this.f11864u = j4(xVarK4, this.f11861r, this.J, this.f11866w, this.f11869z);
            final boolean z11 = !this.f11863t.equals(xVar);
            final boolean z12 = !this.f11864u.equals(xVar2);
            z3().j1(new s7.n() { // from class: androidx.media3.session.g4
                @Override // s7.n
                public final void accept(Object obj) {
                    k4.m1(this.f11704a, bundle, z12, z11, (v.c) obj);
                }
            });
        }
    }

    @Override // androidx.media3.session.v.d
    public void Z(final int i11) {
        if (I3(34)) {
            s3(new d() { // from class: androidx.media3.session.h3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i12) {
                    oVar.B2(this.f11731a.f11846c, i12, i11);
                }
            });
            final int i12 = this.f11859p.f12037r + 1;
            int i13 = i0().f101418c;
            if (i13 == 0 || i12 <= i13) {
                ne neVar = this.f11859p;
                this.f11859p = neVar.d(i12, neVar.f12038s);
                this.f11852i.h(30, new s7.s.a() { // from class: androidx.media3.session.i3
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        p7.j0.d dVar = (p7.j0.d) obj;
                        dVar.onDeviceVolumeChanged(i12, this.f11772a.f11859p.f12038s);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z3(ne neVar, ne.c cVar) {
        if (isConnected()) {
            ne neVar2 = this.I;
            if (neVar2 != null) {
                this.I = me.g(neVar2, neVar, cVar, this.f11869z);
                if (!this.f11854k.isEmpty()) {
                    return;
                }
                neVar = this.I;
                cVar = ne.c.f12072c;
                this.I = null;
            }
            ne neVar3 = this.f11859p;
            ne neVarG = me.g(neVar3, neVar, cVar, this.f11869z);
            this.f11859p = neVarG;
            Integer numValueOf = (neVar3.f12023d.equals(neVar.f12023d) && neVar3.f12024e.equals(neVar.f12024e)) ? null : Integer.valueOf(neVarG.f12025f);
            Integer numValueOf2 = !Objects.equals(neVar3.C(), neVarG.C()) ? Integer.valueOf(neVarG.f12021b) : null;
            Integer numValueOf3 = !neVar3.f12029j.equals(neVarG.f12029j) ? Integer.valueOf(neVarG.f12030k) : null;
            int i11 = neVar3.f12040u;
            int i12 = neVarG.f12040u;
            S3(neVar3, neVarG, numValueOf3, (i11 == i12 && neVar3.f12039t == neVarG.f12039t) ? null : Integer.valueOf(i12), numValueOf, numValueOf2);
        }
    }

    @Override // androidx.media3.session.v.d
    public PlaybackException a() {
        return this.f11859p.f12020a;
    }

    @Override // androidx.media3.session.v.d
    public void a0(final int i11, final int i12) {
        if (I3(20)) {
            s7.a.a(i11 >= 0 && i12 >= i11);
            s3(new d() { // from class: androidx.media3.session.b4
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i13) {
                    oVar.M0(this.f11518a.f11846c, i13, i11, i12);
                }
            });
            f4(i11, i12);
        }
    }

    public void a4() {
        this.f11852i.k(26, new z7.t());
    }

    @Override // androidx.media3.session.v.d
    public void b() {
        if (I3(2)) {
            s3(new d() { // from class: androidx.media3.session.c1
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.r2(this.f11559a.f11846c, i11);
                }
            });
            ne neVar = this.f11859p;
            if (neVar.f12044y == 1) {
                u4(neVar.l(neVar.f12029j.u() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public void b0() {
        if (I3(8)) {
            s3(new d() { // from class: androidx.media3.session.s3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.m0(this.f12230a.f11846c, i11);
                }
            });
            if (B3() != -1) {
                m4(B3(), -9223372036854775807L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b4(final int i11, List<androidx.media3.session.a> list) {
        if (isConnected()) {
            com.google.common.collect.x<androidx.media3.session.a> xVar = this.f11863t;
            com.google.common.collect.x<androidx.media3.session.a> xVar2 = this.f11864u;
            this.f11861r = com.google.common.collect.x.n(list);
            com.google.common.collect.x<androidx.media3.session.a> xVarK4 = k4(this.f11862s, list, this.f11866w, this.f11869z, this.J);
            this.f11863t = xVarK4;
            this.f11864u = j4(xVarK4, list, this.J, this.f11866w, this.f11869z);
            final boolean z11 = !this.f11863t.equals(xVar);
            final boolean z12 = !this.f11864u.equals(xVar2);
            z3().j1(new s7.n() { // from class: androidx.media3.session.c0
                @Override // s7.n
                public final void accept(Object obj) {
                    k4.I1(this.f11555a, z12, z11, i11, (v.c) obj);
                }
            });
        }
    }

    @Override // androidx.media3.session.v.d
    public boolean c() {
        return this.f11859p.f12042w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c4(final int i11, List<androidx.media3.session.a> list) {
        if (isConnected()) {
            com.google.common.collect.x<androidx.media3.session.a> xVar = this.f11863t;
            com.google.common.collect.x<androidx.media3.session.a> xVar2 = this.f11864u;
            this.f11862s = com.google.common.collect.x.n(list);
            com.google.common.collect.x<androidx.media3.session.a> xVarK4 = k4(list, this.f11861r, this.f11866w, this.f11869z, this.J);
            this.f11863t = xVarK4;
            this.f11864u = j4(xVarK4, this.f11861r, this.J, this.f11866w, this.f11869z);
            final boolean z11 = !this.f11863t.equals(xVar);
            final boolean z12 = !this.f11864u.equals(xVar2);
            z3().j1(new s7.n() { // from class: androidx.media3.session.h4
                @Override // s7.n
                public final void accept(Object obj) {
                    k4.r2(this.f11733a, z12, z11, i11, (v.c) obj);
                }
            });
        }
    }

    @Override // androidx.media3.session.v.d
    public void connect() {
        boolean zH4;
        if (this.f11848e.h() == 0) {
            this.f11857n = null;
            zH4 = i4(this.f11849f);
        } else {
            this.f11857n = new e(this.f11849f);
            zH4 = h4();
        }
        if (zH4) {
            return;
        }
        v vVarZ3 = z3();
        v vVarZ4 = z3();
        Objects.requireNonNull(vVarZ4);
        vVarZ3.l1(new ga.j(vVarZ4));
    }

    @Override // androidx.media3.session.v.d
    public void d() {
        if (I3(1)) {
            s3(new d() { // from class: androidx.media3.session.y0
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.F(this.f12628a.f11846c, i11);
                }
            });
            s4(false, 1);
        }
    }

    @Override // androidx.media3.session.v.d
    @Deprecated
    public void d0(final boolean z11) {
        if (I3(26)) {
            s3(new d() { // from class: androidx.media3.session.l3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.f2(this.f11903a.f11846c, i11, z11);
                }
            });
            ne neVar = this.f11859p;
            if (neVar.f12038s != z11) {
                this.f11859p = neVar.d(neVar.f12037r, z11);
                this.f11852i.h(30, new s7.s.a() { // from class: androidx.media3.session.m3
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        p7.j0.d dVar = (p7.j0.d) obj;
                        dVar.onDeviceVolumeChanged(this.f11961a.f11859p.f12037r, z11);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    public void d4(int i11, final PendingIntent pendingIntent) {
        if (!isConnected() || Objects.equals(this.f11860q, pendingIntent)) {
            return;
        }
        this.f11860q = pendingIntent;
        z3().j1(new s7.n() { // from class: androidx.media3.session.z
            @Override // s7.n
            public final void accept(Object obj) {
                v.c cVar = (v.c) obj;
                cVar.M(this.f12651a.z3(), pendingIntent);
            }
        });
    }

    @Override // androidx.media3.session.v.d
    public p7.i0 e() {
        return this.f11859p.f12026g;
    }

    @Override // androidx.media3.session.v.d
    public void e0(p7.j0.d dVar) {
        this.f11852i.j(dVar);
    }

    @Override // androidx.media3.session.v.d
    public void f() {
        MediaController mediaController;
        if (!I3(1)) {
            s7.t.i("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.F) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        s3(new d() { // from class: androidx.media3.session.b1
            @Override // androidx.media3.session.k4.d
            public final void a(o oVar, int i11) {
                oVar.b1(this.f11512a.f11846c, i11);
            }
        });
        s4(true, 1);
    }

    @Override // androidx.media3.session.v.d
    @Deprecated
    public void f0() {
        if (I3(26)) {
            s3(new d() { // from class: androidx.media3.session.e3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.E(this.f11626a.f11846c, i11);
                }
            });
            final int i11 = this.f11859p.f12037r + 1;
            int i12 = i0().f101418c;
            if (i12 == 0 || i11 <= i12) {
                ne neVar = this.f11859p;
                this.f11859p = neVar.d(i11, neVar.f12038s);
                this.f11852i.h(30, new s7.s.a() { // from class: androidx.media3.session.f3
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        p7.j0.d dVar = (p7.j0.d) obj;
                        dVar.onDeviceVolumeChanged(i11, this.f11664a.f11859p.f12038s);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public int g() {
        return this.f11859p.f12044y;
    }

    @Override // androidx.media3.session.v.d
    public int g0() {
        return this.f11859p.f12037r;
    }

    @Override // androidx.media3.session.v.d
    public long getDuration() {
        return this.f11859p.f12022c.f12459d;
    }

    @Override // androidx.media3.session.v.d
    public int h() {
        return this.f11859p.f12027h;
    }

    @Override // androidx.media3.session.v.d
    public long h0() {
        return this.f11859p.f12022c.f12463h;
    }

    @Override // androidx.media3.session.v.d
    public void i(final int i11) {
        if (I3(15)) {
            s3(new d() { // from class: androidx.media3.session.e1
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i12) {
                    oVar.A0(this.f11623a.f11846c, i12, i11);
                }
            });
            ne neVar = this.f11859p;
            if (neVar.f12027h != i11) {
                this.f11859p = neVar.p(i11);
                this.f11852i.h(8, new s7.s.a() { // from class: androidx.media3.session.f1
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        ((p7.j0.d) obj).onRepeatModeChanged(i11);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public p7.m i0() {
        return this.f11859p.f12036q;
    }

    @Override // androidx.media3.session.v.d
    public boolean isConnected() {
        return this.E != null;
    }

    @Override // androidx.media3.session.v.d
    public boolean isPlaying() {
        return this.f11859p.f12041v;
    }

    @Override // androidx.media3.session.v.d
    public void j(final p7.i0 i0Var) {
        if (I3(13)) {
            s3(new d() { // from class: androidx.media3.session.v1
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.C0(this.f12485a.f11846c, i11, i0Var.c());
                }
            });
            if (this.f11859p.f12026g.equals(i0Var)) {
                return;
            }
            this.f11859p = this.f11859p.k(i0Var);
            this.f11852i.h(12, new s7.s.a() { // from class: androidx.media3.session.g2
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).v(i0Var);
                }
            });
            this.f11852i.f();
        }
    }

    @Override // androidx.media3.session.v.d
    public void j0(final p7.e0 e0Var) {
        if (I3(19)) {
            s3(new d() { // from class: androidx.media3.session.o1
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.F0(this.f12082a.f11846c, i11, e0Var.e());
                }
            });
            if (this.f11859p.f12032m.equals(e0Var)) {
                return;
            }
            this.f11859p = this.f11859p.n(e0Var);
            this.f11852i.h(15, new s7.s.a() { // from class: androidx.media3.session.p1
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).Q(e0Var);
                }
            });
            this.f11852i.f();
        }
    }

    @Override // androidx.media3.session.v.d
    public void k(final float f11) {
        if (I3(24)) {
            s3(new d() { // from class: androidx.media3.session.o3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.q0(this.f12085a.f11846c, i11, f11);
                }
            });
            ne neVar = this.f11859p;
            if (neVar.f12033n != f11) {
                this.f11859p = neVar.z(f11);
                this.f11852i.h(22, new s7.s.a() { // from class: androidx.media3.session.p3
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        ((p7.j0.d) obj).onVolumeChanged(f11);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public void k0(final List<p7.y> list, final int i11, final long j11) {
        if (I3(20)) {
            s3(new d() { // from class: androidx.media3.session.f4
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i12) {
                    oVar.k1(this.f11666a.f11846c, i12, new p7.g(s7.i.i(list, new ga.i())), i11, j11);
                }
            });
            r4(list, i11, j11, false);
        }
    }

    public void k3() {
        if (I3(27)) {
            j3();
            t3(new d() { // from class: androidx.media3.session.c3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.o2(this.f11562a.f11846c, i11, null);
                }
            });
            P3(0, 0);
        }
    }

    @Override // androidx.media3.session.v.d
    public void l(final float f11) {
        if (I3(13)) {
            s3(new d() { // from class: androidx.media3.session.w2
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.t0(this.f12559a.f11846c, i11, f11);
                }
            });
            p7.i0 i0Var = this.f11859p.f12026g;
            if (i0Var.f101379a != f11) {
                final p7.i0 i0VarD = i0Var.d(f11);
                this.f11859p = this.f11859p.k(i0VarD);
                this.f11852i.h(12, new s7.s.a() { // from class: androidx.media3.session.x2
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        ((p7.j0.d) obj).v(i0VarD);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public void l0(final int i11) {
        if (I3(10)) {
            s7.a.a(i11 >= 0);
            s3(new d() { // from class: androidx.media3.session.a4
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i12) {
                    oVar.i2(this.f11482a.f11846c, i12, i11);
                }
            });
            m4(i11, -9223372036854775807L);
        }
    }

    public void l3(SurfaceHolder surfaceHolder) {
        if (I3(27) && surfaceHolder != null && this.B == surfaceHolder) {
            k3();
        }
    }

    @Override // androidx.media3.session.v.d
    public boolean m() {
        return this.f11859p.f12022c.f12457b;
    }

    @Override // androidx.media3.session.v.d
    public void m0(final p7.y yVar, final boolean z11) {
        if (I3(31)) {
            s3(new d() { // from class: androidx.media3.session.m0
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.T0(this.f11955a.f11846c, i11, yVar.g(), z11);
                }
            });
            r4(Collections.singletonList(yVar), -1, -9223372036854775807L, z11);
        }
    }

    @Override // androidx.media3.session.v.d
    public long n() {
        return this.f11859p.f12022c.f12462g;
    }

    @Override // androidx.media3.session.v.d
    public void o(SurfaceView surfaceView) {
        if (I3(27)) {
            t4(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.session.v.d
    public void o0(final p7.d dVar, final boolean z11) {
        if (I3(35)) {
            s3(new d() { // from class: androidx.media3.session.x3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.C1(this.f12605a.f11846c, i11, dVar.d(), z11);
                }
            });
            if (this.f11859p.f12034o.equals(dVar)) {
                return;
            }
            this.f11859p = this.f11859p.a(dVar);
            this.f11852i.h(20, new s7.s.a() { // from class: androidx.media3.session.z3
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).E(dVar);
                }
            });
            this.f11852i.f();
        }
    }

    @Override // androidx.media3.session.v.d
    public p7.a1 p() {
        return this.f11859p.D;
    }

    @Override // androidx.media3.session.v.d
    public p7.e0 p0() {
        return this.f11859p.f12032m;
    }

    @Override // androidx.media3.session.v.d
    public boolean q() {
        return B3() != -1;
    }

    @Override // androidx.media3.session.v.d
    public void q0(final p7.y yVar, final long j11) {
        if (I3(31)) {
            s3(new d() { // from class: androidx.media3.session.e4
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.k0(this.f11627a.f11846c, i11, yVar.g(), j11);
                }
            });
            r4(Collections.singletonList(yVar), -1, j11, false);
        }
    }

    <T> void q4(final int i11, T t11) {
        this.f11845b.e(i11, t11);
        z3().l1(new Runnable() { // from class: androidx.media3.session.g3
            @Override // java.lang.Runnable
            public final void run() {
                k4.L2(this.f11702a, i11);
            }
        });
    }

    @Override // androidx.media3.session.v.d
    public int r() {
        return this.f11859p.f12022c.f12456a.f101403i;
    }

    @Override // androidx.media3.session.v.d
    public void r0(final int i11, final int i12) {
        if (I3(20)) {
            s7.a.a(i11 >= 0 && i12 >= 0);
            s3(new d() { // from class: androidx.media3.session.r3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i13) {
                    oVar.r0(this.f12182a.f11846c, i13, i11, i12);
                }
            });
            Q3(i11, i11 + 1, i12);
        }
    }

    @Override // androidx.media3.session.v.d
    public void release() {
        o oVar = this.E;
        if (this.f11858o) {
            return;
        }
        this.f11858o = true;
        this.f11856m = null;
        this.f11855l.removeCallbacksAndMessages(null);
        this.f11853j.d();
        this.E = null;
        if (oVar != null) {
            int iC = this.f11845b.c();
            try {
                oVar.asBinder().unlinkToDeath(this.f11850g, 0);
                oVar.y1(this.f11846c, iC);
            } catch (RemoteException unused) {
            }
        }
        this.f11852i.i();
        this.f11845b.b(30000L, new Runnable() { // from class: androidx.media3.session.y2
            @Override // java.lang.Runnable
            public final void run() {
                k4.z1(this.f12630a);
            }
        });
    }

    @Override // androidx.media3.session.v.d
    public p7.w0 s() {
        return this.f11859p.E;
    }

    @Override // androidx.media3.session.v.d
    public boolean s0() {
        return this.f11859p.f12038s;
    }

    @Override // androidx.media3.session.v.d
    public void seekTo(final long j11) {
        if (I3(5)) {
            s3(new d() { // from class: androidx.media3.session.r2
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.n0(this.f12180a.f11846c, i11, j11);
                }
            });
            m4(R(), j11);
        }
    }

    @Override // androidx.media3.session.v.d
    public void stop() {
        if (I3(3)) {
            s3(new d() { // from class: androidx.media3.session.j3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.U0(this.f11803a.f11846c, i11);
                }
            });
            ne neVar = this.f11859p;
            ue ueVar = this.f11859p.f12022c;
            p7.j0.e eVar = ueVar.f12456a;
            boolean z11 = ueVar.f12457b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ue ueVar2 = this.f11859p.f12022c;
            long j11 = ueVar2.f12459d;
            long j12 = ueVar2.f12456a.f101401g;
            int iC = me.c(j12, j11);
            ue ueVar3 = this.f11859p.f12022c;
            ne neVarS = neVar.s(new ue(eVar, z11, jElapsedRealtime, j11, j12, iC, 0L, ueVar3.f12463h, ueVar3.f12464i, ueVar3.f12456a.f101401g));
            this.f11859p = neVarS;
            if (neVarS.f12044y != 1) {
                this.f11859p = neVarS.l(1, neVarS.f12020a);
                this.f11852i.h(4, new s7.s.a() { // from class: androidx.media3.session.k3
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        ((p7.j0.d) obj).onPlaybackStateChanged(1);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public boolean t() {
        return this.f11859p.f12039t;
    }

    public void t4(SurfaceHolder surfaceHolder) {
        if (I3(27)) {
            if (surfaceHolder == null) {
                k3();
                return;
            }
            if (this.B == surfaceHolder) {
                return;
            }
            j3();
            this.B = surfaceHolder;
            surfaceHolder.addCallback(this.f11851h);
            final Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                this.A = null;
                t3(new d() { // from class: androidx.media3.session.j4
                    @Override // androidx.media3.session.k4.d
                    public final void a(o oVar, int i11) {
                        oVar.o2(this.f11804a.f11846c, i11, null);
                    }
                });
                P3(0, 0);
            } else {
                this.A = surface;
                t3(new d() { // from class: androidx.media3.session.y3
                    @Override // androidx.media3.session.k4.d
                    public final void a(o oVar, int i11) {
                        oVar.o2(this.f12631a.f11846c, i11, surface);
                    }
                });
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                P3(surfaceFrame.width(), surfaceFrame.height());
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public void u(final boolean z11) {
        if (I3(14)) {
            s3(new d() { // from class: androidx.media3.session.s0
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.z1(this.f12226a.f11846c, i11, z11);
                }
            });
            ne neVar = this.f11859p;
            if (neVar.f12028i != z11) {
                this.f11859p = neVar.t(z11);
                this.f11852i.h(9, new s7.s.a() { // from class: androidx.media3.session.t0
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        ((p7.j0.d) obj).onShuffleModeEnabledChanged(z11);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public void u0(final boolean z11, final int i11) {
        if (I3(34)) {
            s3(new d() { // from class: androidx.media3.session.z2
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i12) {
                    oVar.i1(this.f12657a.f11846c, i12, z11, i11);
                }
            });
            ne neVar = this.f11859p;
            if (neVar.f12038s != z11) {
                this.f11859p = neVar.d(neVar.f12037r, z11);
                this.f11852i.h(30, new s7.s.a() { // from class: androidx.media3.session.a3
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        p7.j0.d dVar = (p7.j0.d) obj;
                        dVar.onDeviceVolumeChanged(this.f11480a.f11859p.f12037r, z11);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public long v() {
        return this.f11859p.C;
    }

    @Override // androidx.media3.session.v.d
    public void v0() {
        if (I3(20)) {
            s3(new d() { // from class: androidx.media3.session.d3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.s1(this.f11599a.f11846c, i11);
                }
            });
            f4(0, Integer.MAX_VALUE);
        }
    }

    @Override // androidx.media3.session.v.d
    public long w() {
        return this.f11859p.f12022c.f12464i;
    }

    @Override // androidx.media3.session.v.d
    public int w0() {
        return this.f11859p.f12022c.f12461f;
    }

    public ve w3() {
        return this.f11856m;
    }

    @Override // androidx.media3.session.v.d
    public int x() {
        return this.f11859p.f12022c.f12456a.f101400f;
    }

    @Override // androidx.media3.session.v.d
    public void x0() {
        if (I3(6)) {
            s3(new d() { // from class: androidx.media3.session.k1
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.F1(this.f11842a.f11846c, i11);
                }
            });
            if (F3() != -1) {
                m4(F3(), -9223372036854775807L);
            }
        }
    }

    public Context x3() {
        return this.f11847d;
    }

    @Override // androidx.media3.session.v.d
    public void y(TextureView textureView) {
        if (I3(27) && textureView != null && this.C == textureView) {
            k3();
        }
    }

    @Override // androidx.media3.session.v.d
    @Deprecated
    public void y0() {
        if (I3(26)) {
            s3(new d() { // from class: androidx.media3.session.v3
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i11) {
                    oVar.I2(this.f12489a.f11846c, i11);
                }
            });
            final int i11 = this.f11859p.f12037r - 1;
            if (i11 >= i0().f101417b) {
                ne neVar = this.f11859p;
                this.f11859p = neVar.d(i11, neVar.f12038s);
                this.f11852i.h(30, new s7.s.a() { // from class: androidx.media3.session.w3
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        p7.j0.d dVar = (p7.j0.d) obj;
                        dVar.onDeviceVolumeChanged(i11, this.f12561a.f11859p.f12038s);
                    }
                });
                this.f11852i.f();
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public int z() {
        return this.f11859p.f12022c.f12456a.f101404j;
    }

    @Override // androidx.media3.session.v.d
    public void z0(final int i11, final int i12, final List<p7.y> list) {
        if (I3(20)) {
            s7.a.a(i11 >= 0 && i11 <= i12);
            s3(new d() { // from class: androidx.media3.session.p0
                @Override // androidx.media3.session.k4.d
                public final void a(o oVar, int i13) {
                    k4.G1(this.f12109a, list, i11, i12, oVar, i13);
                }
            });
            g4(i11, i12, list);
        }
    }

    v z3() {
        return this.f11844a;
    }
}

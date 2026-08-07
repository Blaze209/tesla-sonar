package androidx.media3.session;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
class s5 implements v.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f12232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f12233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ve f12234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s7.s<p7.j0.d> f12235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f12236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s7.h f12237f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Bundle f12239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f12240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ha.i f12241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ha.e f12242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f12243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f12244m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f12247p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private e f12245n = new e();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e f12246o = new e();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private d f12248q = new d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f12249r = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f12250s = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.common.collect.x<androidx.media3.session.a> f12238g = com.google.common.collect.x.r();

    class a extends ResultReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.a0 f12251a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Handler handler, com.google.common.util.concurrent.a0 a0Var) {
            super(handler);
            this.f12251a = a0Var;
        }

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i11, Bundle bundle) {
            com.google.common.util.concurrent.a0 a0Var = this.f12251a;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            a0Var.M(new ga.v(i11, bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b extends ha.e.b {
        private b() {
        }

        @Override // ha.e.b
        public void a() {
            ha.e eVarP1 = s5.this.P1();
            if (eVarP1 != null) {
                s5.this.H1(eVarP1.c());
            }
        }

        @Override // ha.e.b
        public void b() {
            s5.this.Q1().release();
        }

        @Override // ha.e.b
        public void c() {
            s5.this.Q1().release();
        }

        /* synthetic */ b(s5 s5Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c extends ha.i.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Handler f12254d;

        public c(Looper looper) {
            this.f12254d = new Handler(looper, new Handler.Callback() { // from class: androidx.media3.session.u5
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return s5.c.o(this.f12429a, message);
                }
            });
        }

        public static /* synthetic */ boolean o(c cVar, Message message) {
            cVar.getClass();
            if (message.what == 1) {
                s5 s5Var = s5.this;
                s5Var.U1(false, s5Var.f12246o);
            }
            return true;
        }

        public static /* synthetic */ void p(c cVar, String str, Bundle bundle, v.c cVar2) {
            v vVarQ1 = s5.this.Q1();
            Bundle bundle2 = Bundle.EMPTY;
            se seVar = new se(str, bundle2);
            if (bundle == null) {
                bundle = bundle2;
            }
            s5.W1(cVar2.q(vVarQ1, seVar, bundle));
        }

        public static /* synthetic */ void q(c cVar, boolean z11, v.c cVar2) {
            cVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z11);
            s5.W1(cVar2.q(s5.this.Q1(), new se("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY), bundle));
        }

        private void s() {
            if (this.f12254d.hasMessages(1)) {
                return;
            }
            this.f12254d.sendEmptyMessageDelayed(1, s5.this.f12240i);
        }

        @Override // ha.i.a
        public void a(ha.i.e eVar) {
            s5 s5Var = s5.this;
            s5Var.f12246o = s5Var.f12246o.c(eVar);
            s();
        }

        @Override // ha.i.a
        public void b(final boolean z11) {
            s5.this.Q1().j1(new s7.n() { // from class: androidx.media3.session.t5
                @Override // s7.n
                public final void accept(Object obj) {
                    s5.c.q(this.f12357a, z11, (v.c) obj);
                }
            });
        }

        @Override // ha.i.a
        public void c(Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            s5 s5Var = s5.this;
            s5Var.f12246o = s5Var.f12246o.h(bundle);
            s5.this.f12247p = true;
            s();
        }

        @Override // ha.i.a
        public void d(ha.k kVar) {
            s5 s5Var = s5.this;
            s5Var.f12246o = s5Var.f12246o.b(kVar);
            s();
        }

        @Override // ha.i.a
        public void e(ha.p pVar) {
            s5 s5Var = s5.this;
            s5Var.f12246o = s5Var.f12246o.d(s5.J1(pVar));
            s();
        }

        @Override // ha.i.a
        public void f(List<ha.l.h> list) {
            s5 s5Var = s5.this;
            s5Var.f12246o = s5Var.f12246o.e(s5.I1(list));
            s();
        }

        @Override // ha.i.a
        public void g(CharSequence charSequence) {
            s5 s5Var = s5.this;
            s5Var.f12246o = s5Var.f12246o.f(charSequence);
            s();
        }

        @Override // ha.i.a
        public void h(int i11) {
            s5 s5Var = s5.this;
            s5Var.f12246o = s5Var.f12246o.g(i11);
            s();
        }

        @Override // ha.i.a
        public void i() {
            s5.this.Q1().release();
        }

        @Override // ha.i.a
        public void j(final String str, final Bundle bundle) {
            if (str == null) {
                return;
            }
            s5.this.Q1().j1(new s7.n() { // from class: androidx.media3.session.v5
                @Override // s7.n
                public final void accept(Object obj) {
                    s5.c.p(this.f12492a, str, bundle, (v.c) obj);
                }
            });
        }

        @Override // ha.i.a
        public void k() {
            if (!s5.this.f12244m) {
                s5.this.Z1();
                return;
            }
            s5 s5Var = s5.this;
            s5Var.f12246o = s5Var.f12246o.a(s5.J1(s5.this.f12241j.j()), s5.this.f12241j.n(), s5.this.f12241j.o());
            b(s5.this.f12241j.q());
            this.f12254d.removeMessages(1);
            s5 s5Var2 = s5.this;
            s5Var2.U1(false, s5Var2.f12246o);
        }

        @Override // ha.i.a
        public void l(int i11) {
            s5 s5Var = s5.this;
            s5Var.f12246o = s5Var.f12246o.i(i11);
            s();
        }

        public void r() {
            this.f12254d.removeCallbacksAndMessages(null);
        }
    }

    public s5(Context context, v vVar, ve veVar, Bundle bundle, Looper looper, s7.h hVar, long j11) {
        this.f12235d = new s7.s<>(looper, s7.j.f110429a, new s7.s.b() { // from class: androidx.media3.session.k5
            @Override // s7.s.b
            public final void a(Object obj, p7.q qVar) {
                ((p7.j0.d) obj).V(this.f11877a.Q1(), new p7.j0.c(qVar));
            }
        });
        this.f12232a = context;
        this.f12233b = vVar;
        this.f12236e = new c(looper);
        this.f12234c = veVar;
        this.f12239h = bundle;
        this.f12237f = hVar;
        this.f12240i = j11;
    }

    private void B1(final List<p7.y> list, final int i11) {
        final ArrayList arrayList = new ArrayList();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        Runnable runnable = new Runnable() { // from class: androidx.media3.session.l5
            @Override // java.lang.Runnable
            public final void run() {
                s5.i1(this.f11906a, atomicInteger, list, arrayList, i11);
            }
        };
        for (int i12 = 0; i12 < list.size(); i12++) {
            byte[] bArr = list.get(i12).f101685e.f101286k;
            if (bArr == null) {
                arrayList.add(null);
                runnable.run();
            } else {
                com.google.common.util.concurrent.s<Bitmap> sVarA = this.f12237f.a(bArr);
                arrayList.add(sVarA);
                Handler handler = Q1().f12470e;
                Objects.requireNonNull(handler);
                sVarA.b(runnable, new b8.t(handler));
            }
        }
    }

    private static d C1(boolean z11, e eVar, d dVar, e eVar2, String str, long j11, boolean z12, int i11, long j12, String str2, boolean z13, Context context) {
        int iN1;
        p7.e0 e0VarD;
        p7.e0 e0Var;
        te teVarY;
        com.google.common.collect.x<androidx.media3.session.a> xVarV;
        int iN;
        List<ha.l.h> list = eVar.f12265d;
        List<ha.l.h> list2 = eVar2.f12265d;
        boolean z14 = list != list2;
        pe peVarF = z14 ? pe.F(list2) : ((pe) dVar.f12256a.f12029j).y();
        boolean z15 = eVar.f12264c != eVar2.f12264c || z11;
        long jO1 = O1(eVar.f12263b);
        long jO2 = O1(eVar2.f12263b);
        boolean z16 = jO1 != jO2 || z11;
        long jL = LegacyConversions.l(eVar2.f12264c);
        boolean z17 = z14;
        if (z15 || z16 || z17) {
            boolean z18 = z15;
            iN1 = N1(eVar2.f12265d, jO2);
            ha.k kVar = eVar2.f12264c;
            boolean z19 = kVar != null;
            if (z19 && z18) {
                e0VarD = LegacyConversions.F(kVar, i11);
            } else if (z19 || !z16) {
                e0VarD = dVar.f12256a.f12045z;
            } else {
                e0VarD = iN1 == -1 ? p7.e0.K : LegacyConversions.D(eVar2.f12265d.get(iN1).c(), i11);
            }
            if (iN1 == -1 && z18) {
                if (z19) {
                    s7.t.i("MCImplLegacy", "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem.");
                    peVarF = peVarF.A(LegacyConversions.z(eVar2.f12264c, i11), jL);
                    iN1 = peVarF.t() - 1;
                } else {
                    peVarF = peVarF.z();
                    iN1 = 0;
                }
            } else if (iN1 != -1) {
                peVarF = peVarF.z();
                if (z19) {
                    peVarF = peVarF.C(iN1, LegacyConversions.B(((p7.y) s7.a.f(peVarF.G(iN1))).f101681a, eVar2.f12264c, i11), jL);
                }
            } else {
                iN1 = 0;
            }
            e0Var = e0VarD;
        } else {
            ne neVar = dVar.f12256a;
            iN1 = neVar.f12022c.f12456a.f101397c;
            e0Var = neVar.f12045z;
        }
        pe peVar = peVarF;
        int i12 = iN1;
        ha.i.e eVar3 = eVar2.f12262a;
        p7.j0.b bVarR = LegacyConversions.R(eVar2.f12263b, eVar3 != null ? eVar3.e() : 0, j11, z12);
        CharSequence charSequence = eVar.f12266e;
        CharSequence charSequence2 = eVar2.f12266e;
        p7.e0 e0VarG = charSequence == charSequence2 ? dVar.f12256a.f12032m : LegacyConversions.G(charSequence2);
        int iW = LegacyConversions.W(eVar2.f12267f);
        boolean zC0 = LegacyConversions.c0(eVar2.f12268g);
        ha.p pVar = eVar.f12263b;
        ha.p pVar2 = eVar2.f12263b;
        if (pVar != pVar2 || z13) {
            teVarY = LegacyConversions.Y(pVar2, z12);
            xVarV = LegacyConversions.v(eVar2.f12263b, bVarR, eVar2.f12269h);
        } else {
            teVarY = dVar.f12257b;
            xVarV = dVar.f12259d;
        }
        te teVar = teVarY;
        com.google.common.collect.x<androidx.media3.session.a> xVar = xVarV;
        PlaybackException playbackExceptionK = LegacyConversions.K(eVar2.f12263b, context);
        ga.u uVarA0 = LegacyConversions.a0(eVar2.f12263b, context);
        long jI = LegacyConversions.i(eVar2.f12263b, eVar2.f12264c, j12);
        long jF = LegacyConversions.f(eVar2.f12263b, eVar2.f12264c, j12);
        int iE = LegacyConversions.e(eVar2.f12263b, eVar2.f12264c, j12);
        long jD0 = LegacyConversions.d0(eVar2.f12263b, eVar2.f12264c, j12);
        boolean zR = LegacyConversions.r(eVar2.f12264c);
        p7.i0 i0VarM = LegacyConversions.M(eVar2.f12263b);
        p7.d dVarB = LegacyConversions.b(eVar2.f12262a);
        boolean zJ = LegacyConversions.J(eVar2.f12263b);
        try {
            iN = LegacyConversions.N(eVar2.f12263b, eVar2.f12264c, j12);
        } catch (LegacyConversions.ConversionException unused) {
            s7.t.d("MCImplLegacy", String.format("Received invalid playback state %s from package %s. Keeping the previous state.", Integer.valueOf(eVar2.f12263b.q()), str));
            iN = dVar.f12256a.f12044y;
        }
        int i13 = iN;
        boolean zQ = LegacyConversions.q(eVar2.f12263b);
        p7.m mVarJ = LegacyConversions.j(eVar2.f12262a, str2);
        int iK = LegacyConversions.k(eVar2.f12262a);
        boolean zO = LegacyConversions.o(eVar2.f12262a);
        ne neVar2 = dVar.f12256a;
        return K1(peVar, e0Var, i12, e0VarG, iW, zC0, teVar, bVarR, xVar, eVar2.f12269h, playbackExceptionK, uVarA0, jL, jI, jF, iE, jD0, zR, i0VarM, dVarB, zJ, i13, zQ, mVarJ, iK, zO, neVar2.A, neVar2.B, neVar2.C);
    }

    private static int D1(int i11, int i12, int i13) {
        return i11 < i12 ? i11 : i11 + i13;
    }

    private static int E1(int i11, int i12, int i13) {
        int i14 = i13 - i12;
        if (i11 < i12) {
            return i11;
        }
        if (i11 < i13) {
            return -1;
        }
        return i11 - i14;
    }

    public static /* synthetic */ void F0(s5 s5Var, ha.l.j jVar) {
        ha.i iVar = new ha.i(s5Var.f12232a, jVar);
        s5Var.f12241j = iVar;
        iVar.s(s5Var.f12236e, s5Var.Q1().f12470e);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x001f  */
    private static Pair<Integer, Integer> F1(e eVar, d dVar, e eVar2, d dVar2, long j11) {
        Integer num = 3;
        Integer num2 = 0;
        boolean zU = dVar.f12256a.f12029j.u();
        boolean zU2 = dVar2.f12256a.f12029j.u();
        if (zU && zU2) {
            num = null;
            num2 = null;
        } else if (!zU || zU2) {
            p7.y yVar = (p7.y) s7.a.j(dVar.f12256a.C());
            if (!((pe) dVar2.f12256a.f12029j).x(yVar)) {
                num2 = 4;
            } else if (yVar.equals(dVar2.f12256a.C())) {
                long jI = LegacyConversions.i(eVar.f12263b, eVar.f12264c, j11);
                long jI2 = LegacyConversions.i(eVar2.f12263b, eVar2.f12264c, j11);
                if (jI2 == 0 && dVar2.f12256a.f12027h == 1) {
                    num = num2;
                } else if (Math.abs(jI - jI2) > 100) {
                    num2 = 5;
                    num = null;
                } else {
                    num = null;
                    num2 = null;
                }
            } else {
                num = 1;
            }
        }
        return Pair.create(num2, num);
    }

    private void G1() {
        Q1().l1(new Runnable() { // from class: androidx.media3.session.h5
            @Override // java.lang.Runnable
            public final void run() {
                s5.t0(this.f11737a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H1(final ha.l.j jVar) {
        Q1().l1(new Runnable() { // from class: androidx.media3.session.q4
            @Override // java.lang.Runnable
            public final void run() {
                s5.F0(this.f12145a, jVar);
            }
        });
        Q1().f12470e.postDelayed(new Runnable() { // from class: androidx.media3.session.b5
            @Override // java.lang.Runnable
            public final void run() {
                s5.Z0(this.f11521a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<ha.l.h> I1(List<ha.l.h> list) {
        return list == null ? Collections.EMPTY_LIST : me.h(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ha.p J1(ha.p pVar) {
        if (pVar == null) {
            return null;
        }
        if (pVar.k() > BitmapDescriptorFactory.HUE_RED) {
            return pVar;
        }
        s7.t.i("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        return new ha.p.c(pVar).h(pVar.q(), pVar.m(), 1.0f, pVar.j()).b();
    }

    private static d K1(pe peVar, p7.e0 e0Var, int i11, p7.e0 e0Var2, int i12, boolean z11, te teVar, p7.j0.b bVar, com.google.common.collect.x<androidx.media3.session.a> xVar, Bundle bundle, PlaybackException playbackException, ga.u uVar, long j11, long j12, long j13, int i13, long j14, boolean z12, p7.i0 i0Var, p7.d dVar, boolean z13, int i14, boolean z14, p7.m mVar, int i15, boolean z15, long j15, long j16, long j17) {
        ue ueVar = new ue(L1(i11, peVar.G(i11), j12, z12), z12, SystemClock.elapsedRealtime(), j11, j13, i13, j14, -9223372036854775807L, j11, j13);
        p7.j0.e eVar = ue.f12444k;
        return new d(new ne(playbackException, 0, ueVar, eVar, eVar, 0, i0Var, i12, z11, p7.e1.f101328e, peVar, 0, e0Var2, 1.0f, dVar, r7.e.f107103d, mVar, i15, z15, z13, 1, 0, i14, z14, false, e0Var, j15, j16, j17, p7.a1.f101183b, p7.w0.F), teVar, bVar, xVar, bundle, uVar);
    }

    private static p7.j0.e L1(int i11, p7.y yVar, long j11, boolean z11) {
        return new p7.j0.e(null, i11, yVar, null, i11, j11, j11, z11 ? 0 : -1, z11 ? 0 : -1);
    }

    private static ue M1(p7.j0.e eVar, boolean z11, long j11, long j12, int i11, long j13) {
        return new ue(eVar, z11, SystemClock.elapsedRealtime(), j11, j12, i11, j13, -9223372036854775807L, j11, j12);
    }

    private static int N1(List<ha.l.h> list, long j11) {
        if (list != null && j11 != -1) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (list.get(i11).d() == j11) {
                    return i11;
                }
            }
        }
        return -1;
    }

    private static long O1(ha.p pVar) {
        if (pVar == null) {
            return -1L;
        }
        return pVar.c();
    }

    private static Bundle R1(Bundle bundle) {
        return bundle == null ? Bundle.EMPTY : bundle;
    }

    private static String S1(ha.i iVar) {
        MediaController.PlaybackInfo playbackInfo;
        if (Build.VERSION.SDK_INT >= 30 && (playbackInfo = ((MediaController) iVar.f()).getPlaybackInfo()) != null) {
            return playbackInfo.getVolumeControlId();
        }
        return null;
    }

    private void T1(List<com.google.common.util.concurrent.s<Bitmap>> list, List<p7.y> list2, int i11) {
        Bitmap bitmap;
        for (int i12 = 0; i12 < list.size(); i12++) {
            com.google.common.util.concurrent.s<Bitmap> sVar = list.get(i12);
            if (sVar != null) {
                try {
                    bitmap = (Bitmap) com.google.common.util.concurrent.m.b(sVar);
                } catch (CancellationException | ExecutionException e11) {
                    s7.t.c("MCImplLegacy", "Failed to get bitmap", e11);
                    bitmap = null;
                }
            } else {
                bitmap = null;
            }
            this.f12241j.a(LegacyConversions.w(list2.get(i12), bitmap), i11 + i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1(boolean z11, final e eVar) {
        if (this.f12243l || !this.f12244m) {
            return;
        }
        d dVarC1 = C1(z11, this.f12245n, this.f12248q, eVar, this.f12241j.h(), this.f12241j.e(), this.f12241j.r(), this.f12241j.m(), Q1().g1(), S1(this.f12241j), this.f12247p, this.f12232a);
        Pair<Integer, Integer> pairF1 = F1(this.f12245n, this.f12248q, eVar, dVarC1, Q1().g1());
        d2(z11, eVar, true, dVarC1, (Integer) pairF1.first, (Integer) pairF1.second);
        if (this.f12247p) {
            this.f12247p = false;
            Q1().j1(new s7.n() { // from class: androidx.media3.session.j5
                @Override // s7.n
                public final void accept(Object obj) {
                    ((v.c) obj).W(this.f11805a.Q1(), eVar.f12269h);
                }
            });
        }
    }

    private boolean V1() {
        return !this.f12248q.f12256a.f12029j.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void W1(Future<T> future) {
    }

    public static /* synthetic */ void X0(d dVar, p7.j0.d dVar2) {
        ne neVar = dVar.f12256a;
        dVar2.onDeviceVolumeChanged(neVar.f12037r, neVar.f12038s);
    }

    private void X1() {
        p7.r0.d dVar = new p7.r0.d();
        s7.a.h(Y1() && V1());
        ne neVar = this.f12248q.f12256a;
        pe peVar = (pe) neVar.f12029j;
        int i11 = neVar.f12022c.f12456a.f101397c;
        p7.y yVar = peVar.r(i11, dVar).f101483c;
        if (peVar.H(i11) == -1) {
            p7.y.i iVar = yVar.f101688h;
            if (iVar.f101797a != null) {
                if (this.f12248q.f12256a.f12039t) {
                    ha.i.f fVarP = this.f12241j.p();
                    p7.y.i iVar2 = yVar.f101688h;
                    fVarP.f(iVar2.f101797a, R1(iVar2.f101799c));
                } else {
                    ha.i.f fVarP2 = this.f12241j.p();
                    p7.y.i iVar3 = yVar.f101688h;
                    fVarP2.j(iVar3.f101797a, R1(iVar3.f101799c));
                }
            } else if (iVar.f101798b != null) {
                if (this.f12248q.f12256a.f12039t) {
                    ha.i.f fVarP3 = this.f12241j.p();
                    p7.y.i iVar4 = yVar.f101688h;
                    fVarP3.e(iVar4.f101798b, R1(iVar4.f101799c));
                } else {
                    ha.i.f fVarP4 = this.f12241j.p();
                    p7.y.i iVar5 = yVar.f101688h;
                    fVarP4.i(iVar5.f101798b, R1(iVar5.f101799c));
                }
            } else if (this.f12248q.f12256a.f12039t) {
                this.f12241j.p().d(yVar.f101681a, R1(yVar.f101688h.f101799c));
            } else {
                this.f12241j.p().h(yVar.f101681a, R1(yVar.f101688h.f101799c));
            }
        } else if (this.f12248q.f12256a.f12039t) {
            this.f12241j.p().c();
        } else {
            this.f12241j.p().g();
        }
        if (this.f12248q.f12256a.f12022c.f12456a.f101401g != 0) {
            this.f12241j.p().l(this.f12248q.f12256a.f12022c.f12456a.f101401g);
        }
        if (N().c(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < peVar.t(); i12++) {
                if (i12 != i11 && peVar.H(i12) == -1) {
                    arrayList.add(peVar.r(i12, dVar).f101483c);
                }
            }
            B1(arrayList, 0);
        }
    }

    private boolean Y1() {
        return this.f12248q.f12256a.f12044y != 1;
    }

    public static /* synthetic */ void Z0(s5 s5Var) {
        if (s5Var.f12243l || s5Var.f12241j.r()) {
            return;
        }
        s5Var.Z1();
    }

    public static /* synthetic */ void a1(s5 s5Var, d dVar, v.c cVar) {
        W1(cVar.T(s5Var.Q1(), dVar.f12259d));
        cVar.O(s5Var.Q1(), dVar.f12259d);
        cVar.z(s5Var.Q1(), dVar.f12259d);
    }

    private void a2(int i11, long j11) {
        Integer num;
        Integer num2;
        int i12;
        long j12;
        long j13;
        long j14;
        int i13 = i11;
        long j15 = j11;
        s7.a.a(i13 >= 0);
        int iR = R();
        p7.r0 r0Var = this.f12248q.f12256a.f12029j;
        if ((r0Var.u() || i13 < r0Var.t()) && !m()) {
            if (i13 != iR) {
                long jH = ((pe) this.f12248q.f12256a.f12029j).H(i13);
                if (jH != -1) {
                    this.f12241j.p().s(jH);
                    num = 2;
                } else {
                    s7.t.i("MCImplLegacy", "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=" + i13);
                    i13 = iR;
                    num = null;
                }
            } else {
                i13 = iR;
                num = null;
            }
            long jD = D();
            if (j15 == -9223372036854775807L) {
                num2 = null;
                j15 = jD;
            } else {
                this.f12241j.p().l(j15);
                num2 = 1;
            }
            if (num == null) {
                long jL0 = L0();
                long duration = getDuration();
                long jMax = j15 < jD ? j15 : Math.max(j15, jL0);
                j12 = jMax;
                i12 = duration == -9223372036854775807L ? 0 : (int) ((100 * jMax) / duration);
                j13 = jMax - j15;
                j14 = duration;
            } else {
                i12 = 0;
                j12 = 0;
                j13 = 0;
                j14 = -9223372036854775807L;
            }
            ne neVarS = this.f12248q.f12256a.s(M1(L1(i13, !r0Var.u() ? r0Var.r(i13, new p7.r0.d()).f101483c : null, j15, false), false, j14, j12, i12, j13));
            if (neVarS.f12044y != 1) {
                neVarS = neVarS.l(2, null);
            }
            ne neVar = neVarS;
            d dVar = this.f12248q;
            e2(new d(neVar, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), num2, num);
        }
    }

    public static /* synthetic */ void d1(s5 s5Var, d dVar, v.c cVar) {
        W1(cVar.T(s5Var.Q1(), dVar.f12259d));
        cVar.O(s5Var.Q1(), dVar.f12259d);
        cVar.z(s5Var.Q1(), dVar.f12259d);
    }

    private void d2(boolean z11, e eVar, boolean z12, final d dVar, final Integer num, final Integer num2) {
        e eVar2 = this.f12245n;
        final d dVar2 = this.f12248q;
        if (eVar2 != eVar) {
            this.f12245n = new e(eVar);
        }
        if (z12) {
            this.f12246o = this.f12245n;
        }
        this.f12248q = dVar;
        if (z11) {
            Q1().i1();
            if (dVar2.f12259d.equals(dVar.f12259d)) {
                return;
            }
            Q1().f12470e.post(new Runnable() { // from class: androidx.media3.session.m5
                @Override // java.lang.Runnable
                public final void run() {
                    s5 s5Var = this.f11964a;
                    s5Var.Q1().j1(new s7.n() { // from class: androidx.media3.session.i5
                        @Override // s7.n
                        public final void accept(Object obj) {
                            s5.a1(this.f11777a, dVar, (v.c) obj);
                        }
                    });
                }
            });
            return;
        }
        if (!dVar2.f12256a.f12029j.equals(dVar.f12256a.f12029j)) {
            this.f12235d.h(0, new s7.s.a() { // from class: androidx.media3.session.w4
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    s5.o1(dVar, (p7.j0.d) obj);
                }
            });
        }
        if (!Objects.equals(eVar2.f12266e, eVar.f12266e)) {
            this.f12235d.h(15, new s7.s.a() { // from class: androidx.media3.session.y4
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).Q(dVar.f12256a.f12032m);
                }
            });
        }
        if (num != null) {
            this.f12235d.h(11, new s7.s.a() { // from class: androidx.media3.session.z4
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).H(dVar2.f12256a.f12022c.f12456a, dVar.f12256a.f12022c.f12456a, num.intValue());
                }
            });
        }
        if (num2 != null) {
            this.f12235d.h(1, new s7.s.a() { // from class: androidx.media3.session.a5
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).U(dVar.f12256a.C(), num2.intValue());
                }
            });
        }
        if (!me.a(eVar2.f12263b, eVar.f12263b)) {
            final PlaybackException playbackExceptionK = LegacyConversions.K(eVar.f12263b, this.f12232a);
            this.f12235d.h(10, new s7.s.a() { // from class: androidx.media3.session.c5
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).d0(playbackExceptionK);
                }
            });
            if (playbackExceptionK != null) {
                this.f12235d.h(10, new s7.s.a() { // from class: androidx.media3.session.d5
                    @Override // s7.s.a
                    public final void invoke(Object obj) {
                        ((p7.j0.d) obj).F(playbackExceptionK);
                    }
                });
            }
        }
        if (eVar2.f12264c != eVar.f12264c) {
            this.f12235d.h(14, new s7.s.a() { // from class: androidx.media3.session.e5
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).Z(this.f11630a.f12248q.f12256a.f12045z);
                }
            });
        }
        if (dVar2.f12256a.f12044y != dVar.f12256a.f12044y) {
            this.f12235d.h(4, new s7.s.a() { // from class: androidx.media3.session.f5
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onPlaybackStateChanged(dVar.f12256a.f12044y);
                }
            });
        }
        if (dVar2.f12256a.f12039t != dVar.f12256a.f12039t) {
            this.f12235d.h(5, new s7.s.a() { // from class: androidx.media3.session.g5
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onPlayWhenReadyChanged(dVar.f12256a.f12039t, 4);
                }
            });
        }
        if (dVar2.f12256a.f12041v != dVar.f12256a.f12041v) {
            this.f12235d.h(7, new s7.s.a() { // from class: androidx.media3.session.n5
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onIsPlayingChanged(dVar.f12256a.f12041v);
                }
            });
        }
        if (!dVar2.f12256a.f12026g.equals(dVar.f12256a.f12026g)) {
            this.f12235d.h(12, new s7.s.a() { // from class: androidx.media3.session.o5
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).v(dVar.f12256a.f12026g);
                }
            });
        }
        if (dVar2.f12256a.f12027h != dVar.f12256a.f12027h) {
            this.f12235d.h(8, new s7.s.a() { // from class: androidx.media3.session.p5
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onRepeatModeChanged(dVar.f12256a.f12027h);
                }
            });
        }
        if (dVar2.f12256a.f12028i != dVar.f12256a.f12028i) {
            this.f12235d.h(9, new s7.s.a() { // from class: androidx.media3.session.q5
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).onShuffleModeEnabledChanged(dVar.f12256a.f12028i);
                }
            });
        }
        if (!dVar2.f12256a.f12034o.equals(dVar.f12256a.f12034o)) {
            this.f12235d.h(20, new s7.s.a() { // from class: androidx.media3.session.r5
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).E(dVar.f12256a.f12034o);
                }
            });
        }
        if (!dVar2.f12256a.f12036q.equals(dVar.f12256a.f12036q)) {
            this.f12235d.h(29, new s7.s.a() { // from class: androidx.media3.session.r4
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).D(dVar.f12256a.f12036q);
                }
            });
        }
        ne neVar = dVar2.f12256a;
        int i11 = neVar.f12037r;
        ne neVar2 = dVar.f12256a;
        if (i11 != neVar2.f12037r || neVar.f12038s != neVar2.f12038s) {
            this.f12235d.h(30, new s7.s.a() { // from class: androidx.media3.session.s4
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    s5.X0(dVar, (p7.j0.d) obj);
                }
            });
        }
        if (!dVar2.f12258c.equals(dVar.f12258c)) {
            this.f12235d.h(13, new s7.s.a() { // from class: androidx.media3.session.t4
                @Override // s7.s.a
                public final void invoke(Object obj) {
                    ((p7.j0.d) obj).R(dVar.f12258c);
                }
            });
        }
        if (!dVar2.f12257b.equals(dVar.f12257b)) {
            Q1().j1(new s7.n() { // from class: androidx.media3.session.u4
                @Override // s7.n
                public final void accept(Object obj) {
                    ((v.c) obj).n(this.f12427a.Q1(), dVar.f12257b);
                }
            });
        }
        if (!dVar2.f12259d.equals(dVar.f12259d)) {
            Q1().j1(new s7.n() { // from class: androidx.media3.session.v4
                @Override // s7.n
                public final void accept(Object obj) {
                    s5.d1(this.f12490a, dVar, (v.c) obj);
                }
            });
        }
        if (dVar.f12261f != null) {
            Q1().j1(new s7.n() { // from class: androidx.media3.session.x4
                @Override // s7.n
                public final void accept(Object obj) {
                    ((v.c) obj).I(this.f12608a.Q1(), dVar.f12261f);
                }
            });
        }
        this.f12235d.f();
    }

    private void e2(d dVar, Integer num, Integer num2) {
        d2(false, this.f12245n, false, dVar, num, num2);
    }

    public static /* synthetic */ void i1(s5 s5Var, AtomicInteger atomicInteger, List list, List list2, int i11) {
        s5Var.getClass();
        if (atomicInteger.incrementAndGet() == list.size()) {
            s5Var.T1(list2, list, i11);
        }
    }

    public static /* synthetic */ void o1(d dVar, p7.j0.d dVar2) {
        ne neVar = dVar.f12256a;
        dVar2.a0(neVar.f12029j, neVar.f12030k);
    }

    public static /* synthetic */ void t0(s5 s5Var) {
        s5Var.getClass();
        ha.e eVar = new ha.e(s5Var.f12232a, s5Var.f12234c.b(), new b(s5Var, null), s5Var.f12233b.d1());
        s5Var.f12242k = eVar;
        eVar.a();
    }

    @Override // androidx.media3.session.v.d
    public long A() {
        return this.f12248q.f12256a.B;
    }

    @Override // androidx.media3.session.v.d
    public void A0(int i11) {
        a0(i11, i11 + 1);
    }

    @Override // androidx.media3.session.v.d
    public long B() {
        return L0();
    }

    @Override // androidx.media3.session.v.d
    public void B0(int i11) {
        int iG0 = g0() - 1;
        if (iG0 >= i0().f101417b) {
            ne neVarD = this.f12248q.f12256a.d(iG0, s0());
            d dVar = this.f12248q;
            e2(new d(neVarD, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        }
        this.f12241j.b(-1, i11);
    }

    @Override // androidx.media3.session.v.d
    public void C() {
        this.f12241j.p().a();
    }

    @Override // androidx.media3.session.v.d
    public long D() {
        long jE = me.e(this.f12248q.f12256a, this.f12249r, this.f12250s, Q1().g1());
        this.f12249r = jE;
        return jE;
    }

    @Override // androidx.media3.session.v.d
    public void D0(p7.j0.d dVar) {
        this.f12235d.c(dVar);
    }

    @Override // androidx.media3.session.v.d
    public void E() {
        a2(R(), 0L);
    }

    @Override // androidx.media3.session.v.d
    public void F() {
        this.f12241j.p().r();
    }

    @Override // androidx.media3.session.v.d
    public void G(boolean z11) {
        ne neVar = this.f12248q.f12256a;
        if (neVar.f12039t == z11) {
            return;
        }
        this.f12249r = me.e(neVar, this.f12249r, this.f12250s, Q1().g1());
        this.f12250s = SystemClock.elapsedRealtime();
        ne neVarJ = this.f12248q.f12256a.j(z11, 1, 0);
        d dVar = this.f12248q;
        e2(new d(neVarJ, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        if (Y1() && V1()) {
            if (z11) {
                this.f12241j.p().c();
            } else {
                this.f12241j.p().b();
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public float G0() {
        return 1.0f;
    }

    @Override // androidx.media3.session.v.d
    public r7.e H() {
        s7.t.i("MCImplLegacy", "Session doesn't support getting Cue");
        return r7.e.f107103d;
    }

    @Override // androidx.media3.session.v.d
    public p7.d H0() {
        return this.f12248q.f12256a.f12034o;
    }

    @Override // androidx.media3.session.v.d
    public int I() {
        return 0;
    }

    @Override // androidx.media3.session.v.d
    public void I0(int i11, int i12) {
        p7.m mVarI0 = i0();
        int i13 = mVarI0.f101417b;
        int i14 = mVarI0.f101418c;
        if (i13 <= i11 && (i14 == 0 || i11 <= i14)) {
            ne neVarD = this.f12248q.f12256a.d(i11, s0());
            d dVar = this.f12248q;
            e2(new d(neVarD, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        }
        this.f12241j.v(i11, i12);
    }

    @Override // androidx.media3.session.v.d
    public p7.r0 J() {
        return this.f12248q.f12256a.f12029j;
    }

    @Override // androidx.media3.session.v.d
    public void J0(int i11, p7.y yVar) {
        z0(i11, i11 + 1, com.google.common.collect.x.s(yVar));
    }

    @Override // androidx.media3.session.v.d
    public void K() {
        this.f12241j.p().q();
    }

    @Override // androidx.media3.session.v.d
    public void K0(int i11, List<p7.y> list) {
        s7.a.a(i11 >= 0);
        if (list.isEmpty()) {
            return;
        }
        pe peVar = (pe) this.f12248q.f12256a.f12029j;
        if (peVar.u()) {
            c2(list);
            return;
        }
        int iMin = Math.min(i11, J().t());
        ne neVarV = this.f12248q.f12256a.v(peVar.D(iMin, list), D1(R(), iMin, list.size()), 0);
        d dVar = this.f12248q;
        e2(new d(neVarV, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        if (Y1()) {
            B1(list, iMin);
        }
    }

    @Override // androidx.media3.session.v.d
    public void L(TextureView textureView) {
        s7.t.i("MCImplLegacy", "Session doesn't support setting TextureView");
    }

    @Override // androidx.media3.session.v.d
    public long L0() {
        return this.f12248q.f12256a.f12022c.f12460e;
    }

    @Override // androidx.media3.session.v.d
    public void M(int i11, long j11) {
        a2(i11, j11);
    }

    @Override // androidx.media3.session.v.d
    public void M0(int i11, int i12, int i13) {
        s7.a.a(i11 >= 0 && i11 <= i12 && i13 >= 0);
        pe peVar = (pe) this.f12248q.f12256a.f12029j;
        int iT = peVar.t();
        int iMin = Math.min(i12, iT);
        int i14 = iMin - i11;
        int i15 = iT - i14;
        int i16 = i15 - 1;
        int iMin2 = Math.min(i13, i15);
        if (i11 >= iT || i11 == iMin || i11 == iMin2) {
            return;
        }
        int iE1 = E1(R(), i11, iMin);
        if (iE1 == -1) {
            iE1 = s7.q0.r(i11, 0, i16);
            s7.t.i("MCImplLegacy", "Currently playing item will be removed and added back to mimic move. Assumes item at " + iE1 + " would be the new current item");
        }
        ne neVarV = this.f12248q.f12256a.v(peVar.B(i11, iMin, iMin2), D1(iE1, iMin2, i14), 0);
        d dVar = this.f12248q;
        e2(new d(neVarV, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        if (Y1()) {
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 < i14; i17++) {
                arrayList.add(this.f12245n.f12265d.get(i11));
                this.f12241j.t(this.f12245n.f12265d.get(i11).c());
            }
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                this.f12241j.a(((ha.l.h) arrayList.get(i18)).c(), i18 + iMin2);
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public p7.j0.b N() {
        return this.f12248q.f12258c;
    }

    @Override // androidx.media3.session.v.d
    public void N0(List<p7.y> list) {
        K0(Integer.MAX_VALUE, list);
    }

    @Override // androidx.media3.session.v.d
    public p7.e1 O() {
        s7.t.i("MCImplLegacy", "Session doesn't support getting VideoSize");
        return p7.e1.f101328e;
    }

    @Override // androidx.media3.session.v.d
    @Deprecated
    public void O0(int i11) {
        I0(i11, 1);
    }

    @Override // androidx.media3.session.v.d
    public boolean P() {
        return this.f12244m;
    }

    @Override // androidx.media3.session.v.d
    public com.google.common.util.concurrent.s<ga.v> P0(se seVar, Bundle bundle) {
        if (this.f12248q.f12257b.c(seVar)) {
            this.f12241j.p().m(seVar.f12348b, bundle);
            return com.google.common.util.concurrent.m.d(new ga.v(0));
        }
        com.google.common.util.concurrent.a0 a0VarQ = com.google.common.util.concurrent.a0.Q();
        this.f12241j.u(seVar.f12348b, bundle, new a(Q1().f12470e, a0VarQ));
        return a0VarQ;
    }

    public ha.e P1() {
        return this.f12242k;
    }

    @Override // androidx.media3.session.v.d
    public long Q() {
        return D();
    }

    @Override // androidx.media3.session.v.d
    public te Q0() {
        return this.f12248q.f12257b;
    }

    v Q1() {
        return this.f12233b;
    }

    @Override // androidx.media3.session.v.d
    public int R() {
        return this.f12248q.f12256a.f12022c.f12456a.f101397c;
    }

    @Override // androidx.media3.session.v.d
    public com.google.common.collect.x<androidx.media3.session.a> R0() {
        return this.f12248q.f12259d;
    }

    @Override // androidx.media3.session.v.d
    public void S(SurfaceView surfaceView) {
        s7.t.i("MCImplLegacy", "Session doesn't support clearing SurfaceView");
    }

    @Override // androidx.media3.session.v.d
    public Bundle S0() {
        return this.f12239h;
    }

    @Override // androidx.media3.session.v.d
    public boolean T() {
        return this.f12248q.f12256a.f12028i;
    }

    @Override // androidx.media3.session.v.d
    public void U() {
        this.f12241j.p().k();
    }

    @Override // androidx.media3.session.v.d
    public p7.e0 V() {
        p7.y yVarC = this.f12248q.f12256a.C();
        return yVarC == null ? p7.e0.K : yVarC.f101685e;
    }

    @Override // androidx.media3.session.v.d
    public long W() {
        return this.f12248q.f12256a.A;
    }

    @Override // androidx.media3.session.v.d
    public void X(Surface surface) {
        s7.t.i("MCImplLegacy", "Session doesn't support setting Surface");
    }

    @Override // androidx.media3.session.v.d
    public void Y(List<p7.y> list, boolean z11) {
        c2(list);
    }

    @Override // androidx.media3.session.v.d
    public void Z(int i11) {
        int iG0 = g0();
        int i12 = i0().f101418c;
        if (i12 == 0 || iG0 + 1 <= i12) {
            ne neVarD = this.f12248q.f12256a.d(iG0 + 1, s0());
            d dVar = this.f12248q;
            e2(new d(neVarD, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        }
        this.f12241j.b(1, i11);
    }

    void Z1() {
        if (this.f12243l || this.f12244m) {
            return;
        }
        this.f12244m = true;
        U1(true, new e(this.f12241j.i(), J1(this.f12241j.j()), this.f12241j.g(), I1(this.f12241j.k()), this.f12241j.l(), this.f12241j.n(), this.f12241j.o(), this.f12241j.d()));
    }

    @Override // androidx.media3.session.v.d
    public PlaybackException a() {
        return this.f12248q.f12256a.f12020a;
    }

    @Override // androidx.media3.session.v.d
    public void a0(int i11, int i12) {
        s7.a.a(i11 >= 0 && i12 >= i11);
        int iT = J().t();
        int iMin = Math.min(i12, iT);
        if (i11 >= iT || i11 == iMin) {
            return;
        }
        pe peVarE = ((pe) this.f12248q.f12256a.f12029j).E(i11, iMin);
        int iE1 = E1(R(), i11, iMin);
        if (iE1 == -1) {
            iE1 = s7.q0.r(i11, 0, peVarE.t() - 1);
            s7.t.i("MCImplLegacy", "Currently playing item is removed. Assumes item at " + iE1 + " is the new current item");
        }
        ne neVarV = this.f12248q.f12256a.v(peVarE, iE1, 0);
        d dVar = this.f12248q;
        e2(new d(neVarV, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        if (Y1()) {
            while (i11 < iMin && i11 < this.f12245n.f12265d.size()) {
                this.f12241j.t(this.f12245n.f12265d.get(i11).c());
                i11++;
            }
        }
    }

    @Override // androidx.media3.session.v.d
    public void b() {
        ne neVar = this.f12248q.f12256a;
        if (neVar.f12044y != 1) {
            return;
        }
        ne neVarL = neVar.l(neVar.f12029j.u() ? 4 : 2, null);
        d dVar = this.f12248q;
        e2(new d(neVarL, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        if (V1()) {
            X1();
        }
    }

    @Override // androidx.media3.session.v.d
    public void b0() {
        this.f12241j.p().q();
    }

    public void b2(p7.y yVar) {
        q0(yVar, -9223372036854775807L);
    }

    @Override // androidx.media3.session.v.d
    public boolean c() {
        return false;
    }

    public void c2(List<p7.y> list) {
        k0(list, 0, -9223372036854775807L);
    }

    @Override // androidx.media3.session.v.d
    public void connect() {
        if (this.f12234c.h() == 0) {
            H1((ha.l.j) s7.a.j(this.f12234c.a()));
        } else {
            G1();
        }
    }

    @Override // androidx.media3.session.v.d
    public void d() {
        G(false);
    }

    @Override // androidx.media3.session.v.d
    @Deprecated
    public void d0(boolean z11) {
        u0(z11, 1);
    }

    @Override // androidx.media3.session.v.d
    public p7.i0 e() {
        return this.f12248q.f12256a.f12026g;
    }

    @Override // androidx.media3.session.v.d
    public void e0(p7.j0.d dVar) {
        this.f12235d.j(dVar);
    }

    @Override // androidx.media3.session.v.d
    public void f() {
        G(true);
    }

    @Override // androidx.media3.session.v.d
    @Deprecated
    public void f0() {
        Z(1);
    }

    @Override // androidx.media3.session.v.d
    public int g() {
        return this.f12248q.f12256a.f12044y;
    }

    @Override // androidx.media3.session.v.d
    public int g0() {
        ne neVar = this.f12248q.f12256a;
        if (neVar.f12036q.f101416a == 1) {
            return neVar.f12037r;
        }
        ha.i iVar = this.f12241j;
        if (iVar != null) {
            return LegacyConversions.k(iVar.i());
        }
        return 0;
    }

    @Override // androidx.media3.session.v.d
    public long getDuration() {
        return this.f12248q.f12256a.f12022c.f12459d;
    }

    @Override // androidx.media3.session.v.d
    public int h() {
        return this.f12248q.f12256a.f12027h;
    }

    @Override // androidx.media3.session.v.d
    public long h0() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.session.v.d
    public void i(int i11) {
        if (i11 != h()) {
            ne neVarP = this.f12248q.f12256a.p(i11);
            d dVar = this.f12248q;
            e2(new d(neVarP, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        }
        this.f12241j.p().o(LegacyConversions.O(i11));
    }

    @Override // androidx.media3.session.v.d
    public p7.m i0() {
        return this.f12248q.f12256a.f12036q;
    }

    @Override // androidx.media3.session.v.d
    public boolean isConnected() {
        return this.f12244m;
    }

    @Override // androidx.media3.session.v.d
    public boolean isPlaying() {
        return this.f12248q.f12256a.f12041v;
    }

    @Override // androidx.media3.session.v.d
    public void j(p7.i0 i0Var) {
        if (!i0Var.equals(e())) {
            ne neVarK = this.f12248q.f12256a.k(i0Var);
            d dVar = this.f12248q;
            e2(new d(neVarK, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        }
        this.f12241j.p().n(i0Var.f101379a);
    }

    @Override // androidx.media3.session.v.d
    public void j0(p7.e0 e0Var) {
        s7.t.i("MCImplLegacy", "Session doesn't support setting playlist metadata");
    }

    @Override // androidx.media3.session.v.d
    public void k(float f11) {
        s7.t.i("MCImplLegacy", "Session doesn't support setting player volume");
    }

    @Override // androidx.media3.session.v.d
    public void k0(List<p7.y> list, int i11, long j11) {
        if (list.isEmpty()) {
            v0();
            return;
        }
        ne neVarW = this.f12248q.f12256a.w(pe.f12130g.D(0, list), M1(L1(i11, list.get(i11), j11 == -9223372036854775807L ? 0L : j11, false), false, -9223372036854775807L, 0L, 0, 0L), 0);
        d dVar = this.f12248q;
        e2(new d(neVarW, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        if (Y1()) {
            X1();
        }
    }

    @Override // androidx.media3.session.v.d
    public void l(float f11) {
        if (f11 != e().f101379a) {
            ne neVarK = this.f12248q.f12256a.k(new p7.i0(f11));
            d dVar = this.f12248q;
            e2(new d(neVarK, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        }
        this.f12241j.p().n(f11);
    }

    @Override // androidx.media3.session.v.d
    public void l0(int i11) {
        a2(i11, 0L);
    }

    @Override // androidx.media3.session.v.d
    public boolean m() {
        return this.f12248q.f12256a.f12022c.f12457b;
    }

    @Override // androidx.media3.session.v.d
    public void m0(p7.y yVar, boolean z11) {
        b2(yVar);
    }

    @Override // androidx.media3.session.v.d
    public long n() {
        return this.f12248q.f12256a.f12022c.f12462g;
    }

    @Override // androidx.media3.session.v.d
    public void o(SurfaceView surfaceView) {
        s7.t.i("MCImplLegacy", "Session doesn't support setting SurfaceView");
    }

    @Override // androidx.media3.session.v.d
    public void o0(p7.d dVar, boolean z11) {
        s7.t.i("MCImplLegacy", "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // androidx.media3.session.v.d
    public p7.a1 p() {
        return p7.a1.f101183b;
    }

    @Override // androidx.media3.session.v.d
    public p7.e0 p0() {
        return this.f12248q.f12256a.f12032m;
    }

    @Override // androidx.media3.session.v.d
    public boolean q() {
        return this.f12244m;
    }

    @Override // androidx.media3.session.v.d
    public void q0(p7.y yVar, long j11) {
        k0(com.google.common.collect.x.s(yVar), 0, j11);
    }

    @Override // androidx.media3.session.v.d
    public int r() {
        return -1;
    }

    @Override // androidx.media3.session.v.d
    public void r0(int i11, int i12) {
        M0(i11, i11 + 1, i12);
    }

    @Override // androidx.media3.session.v.d
    public void release() {
        if (this.f12243l) {
            return;
        }
        this.f12243l = true;
        ha.e eVar = this.f12242k;
        if (eVar != null) {
            eVar.b();
            this.f12242k = null;
        }
        ha.i iVar = this.f12241j;
        if (iVar != null) {
            iVar.w(this.f12236e);
            this.f12236e.r();
            this.f12241j = null;
        }
        this.f12244m = false;
        this.f12235d.i();
    }

    @Override // androidx.media3.session.v.d
    public p7.w0 s() {
        return p7.w0.F;
    }

    @Override // androidx.media3.session.v.d
    public boolean s0() {
        ne neVar = this.f12248q.f12256a;
        if (neVar.f12036q.f101416a == 1) {
            return neVar.f12038s;
        }
        ha.i iVar = this.f12241j;
        return iVar != null && LegacyConversions.o(iVar.i());
    }

    @Override // androidx.media3.session.v.d
    public void seekTo(long j11) {
        a2(R(), j11);
    }

    @Override // androidx.media3.session.v.d
    public void stop() {
        ne neVar = this.f12248q.f12256a;
        if (neVar.f12044y == 1) {
            return;
        }
        ue ueVar = neVar.f12022c;
        p7.j0.e eVar = ueVar.f12456a;
        long j11 = ueVar.f12459d;
        long j12 = eVar.f101401g;
        ne neVarS = neVar.s(M1(eVar, false, j11, j12, me.c(j12, j11), 0L));
        ne neVar2 = this.f12248q.f12256a;
        if (neVar2.f12044y != 1) {
            neVarS = neVarS.l(1, neVar2.f12020a);
        }
        ne neVar3 = neVarS;
        d dVar = this.f12248q;
        e2(new d(neVar3, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        this.f12241j.p().t();
    }

    @Override // androidx.media3.session.v.d
    public boolean t() {
        return this.f12248q.f12256a.f12039t;
    }

    @Override // androidx.media3.session.v.d
    public void u(boolean z11) {
        if (z11 != T()) {
            ne neVarT = this.f12248q.f12256a.t(z11);
            d dVar = this.f12248q;
            e2(new d(neVarT, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        }
        this.f12241j.p().p(LegacyConversions.P(z11));
    }

    @Override // androidx.media3.session.v.d
    public void u0(boolean z11, int i11) {
        if (z11 != s0()) {
            ne neVarD = this.f12248q.f12256a.d(g0(), z11);
            d dVar = this.f12248q;
            e2(new d(neVarD, dVar.f12257b, dVar.f12258c, dVar.f12259d, dVar.f12260e, null), null, null);
        }
        this.f12241j.b(z11 ? -100 : 100, i11);
    }

    @Override // androidx.media3.session.v.d
    public long v() {
        return this.f12248q.f12256a.C;
    }

    @Override // androidx.media3.session.v.d
    public void v0() {
        a0(0, Integer.MAX_VALUE);
    }

    @Override // androidx.media3.session.v.d
    public long w() {
        return getDuration();
    }

    @Override // androidx.media3.session.v.d
    public int w0() {
        return this.f12248q.f12256a.f12022c.f12461f;
    }

    @Override // androidx.media3.session.v.d
    public int x() {
        return R();
    }

    @Override // androidx.media3.session.v.d
    public void x0() {
        this.f12241j.p().r();
    }

    @Override // androidx.media3.session.v.d
    public void y(TextureView textureView) {
        s7.t.i("MCImplLegacy", "Session doesn't support clearing TextureView");
    }

    @Override // androidx.media3.session.v.d
    @Deprecated
    public void y0() {
        B0(1);
    }

    @Override // androidx.media3.session.v.d
    public int z() {
        return -1;
    }

    @Override // androidx.media3.session.v.d
    public void z0(int i11, int i12, List<p7.y> list) {
        s7.a.a(i11 >= 0 && i11 <= i12);
        int iT = ((pe) this.f12248q.f12256a.f12029j).t();
        if (i11 > iT) {
            return;
        }
        int iMin = Math.min(i12, iT);
        K0(iMin, list);
        a0(i11, iMin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ne f12256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final te f12257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p7.j0.b f12258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.google.common.collect.x<androidx.media3.session.a> f12259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f12260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ga.u f12261f;

        public d() {
            this.f12256a = ne.F.u(pe.f12130g);
            this.f12257b = te.f12414b;
            this.f12258c = p7.j0.b.f101382b;
            this.f12259d = com.google.common.collect.x.r();
            this.f12260e = Bundle.EMPTY;
            this.f12261f = null;
        }

        public d(ne neVar, te teVar, p7.j0.b bVar, com.google.common.collect.x<androidx.media3.session.a> xVar, Bundle bundle, ga.u uVar) {
            this.f12256a = neVar;
            this.f12257b = teVar;
            this.f12258c = bVar;
            this.f12259d = xVar;
            this.f12260e = bundle == null ? Bundle.EMPTY : bundle;
            this.f12261f = uVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ha.i.e f12262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ha.p f12263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ha.k f12264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<ha.l.h> f12265d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final CharSequence f12266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f12267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f12268g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Bundle f12269h;

        public e() {
            this.f12262a = null;
            this.f12263b = null;
            this.f12264c = null;
            this.f12265d = Collections.EMPTY_LIST;
            this.f12266e = null;
            this.f12267f = 0;
            this.f12268g = 0;
            this.f12269h = Bundle.EMPTY;
        }

        public e a(ha.p pVar, int i11, int i12) {
            return new e(this.f12262a, pVar, this.f12264c, this.f12265d, this.f12266e, i11, i12, this.f12269h);
        }

        public e b(ha.k kVar) {
            return new e(this.f12262a, this.f12263b, kVar, this.f12265d, this.f12266e, this.f12267f, this.f12268g, this.f12269h);
        }

        public e c(ha.i.e eVar) {
            return new e(eVar, this.f12263b, this.f12264c, this.f12265d, this.f12266e, this.f12267f, this.f12268g, this.f12269h);
        }

        public e d(ha.p pVar) {
            return new e(this.f12262a, pVar, this.f12264c, this.f12265d, this.f12266e, this.f12267f, this.f12268g, this.f12269h);
        }

        public e e(List<ha.l.h> list) {
            return new e(this.f12262a, this.f12263b, this.f12264c, list, this.f12266e, this.f12267f, this.f12268g, this.f12269h);
        }

        public e f(CharSequence charSequence) {
            return new e(this.f12262a, this.f12263b, this.f12264c, this.f12265d, charSequence, this.f12267f, this.f12268g, this.f12269h);
        }

        public e g(int i11) {
            return new e(this.f12262a, this.f12263b, this.f12264c, this.f12265d, this.f12266e, i11, this.f12268g, this.f12269h);
        }

        public e h(Bundle bundle) {
            return new e(this.f12262a, this.f12263b, this.f12264c, this.f12265d, this.f12266e, this.f12267f, this.f12268g, bundle);
        }

        public e i(int i11) {
            return new e(this.f12262a, this.f12263b, this.f12264c, this.f12265d, this.f12266e, this.f12267f, i11, this.f12269h);
        }

        public e(ha.i.e eVar, ha.p pVar, ha.k kVar, List<ha.l.h> list, CharSequence charSequence, int i11, int i12, Bundle bundle) {
            this.f12262a = eVar;
            this.f12263b = pVar;
            this.f12264c = kVar;
            this.f12265d = (List) s7.a.f(list);
            this.f12266e = charSequence;
            this.f12267f = i11;
            this.f12268g = i12;
            this.f12269h = bundle == null ? Bundle.EMPTY : bundle;
        }

        public e(e eVar) {
            this.f12262a = eVar.f12262a;
            this.f12263b = eVar.f12263b;
            this.f12264c = eVar.f12264c;
            this.f12265d = eVar.f12265d;
            this.f12266e = eVar.f12266e;
            this.f12267f = eVar.f12267f;
            this.f12268g = eVar.f12268g;
            this.f12269h = eVar.f12269h;
        }
    }

    @Override // androidx.media3.session.v.d
    public void C0(p7.w0 w0Var) {
    }
}

package androidx.media3.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.va.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes3.dex */
class va extends ha.l.b {
    private static final int A;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media3.session.f<ha.n.b> f12503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s8 f12504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ha.n f12505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g f12506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e f12507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ha.l f12508k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final i f12509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ComponentName f12510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ha.r f12511n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f12512o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile long f12513p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.common.util.concurrent.l<Bitmap> f12514q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f12515r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private h f12516s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Bundle f12517t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.google.common.collect.x<androidx.media3.session.a> f12518u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.google.common.collect.x<androidx.media3.session.a> f12519v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private te f12520w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private p7.j0.b f12521x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private PlaybackException f12522y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p7.j0.b f12523z;

    class a implements com.google.common.util.concurrent.l<t7.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t7.g f12524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f12525b;

        a(t7.g gVar, boolean z11) {
            this.f12524a = gVar;
            this.f12525b = z11;
        }

        public static /* synthetic */ void a(a aVar, t7.i iVar, boolean z11, t7.g gVar) {
            oe oeVarK0 = va.this.f12504g.k0();
            me.i(oeVarK0, iVar);
            int iG = oeVarK0.g();
            if (iG == 1) {
                oeVarK0.q1();
            } else if (iG == 4) {
                oeVarK0.r1();
            }
            if (z11) {
                oeVarK0.p1();
            }
            va.this.f12504g.G0(gVar, new p7.j0.b.a().c(31, 2).e(1, z11).f());
        }

        @Override // com.google.common.util.concurrent.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final t7.i iVar) {
            Handler handlerX = va.this.f12504g.X();
            s8 s8Var = va.this.f12504g;
            final t7.g gVar = this.f12524a;
            final boolean z11 = this.f12525b;
            s7.q0.m1(handlerX, s8Var.K(gVar, new Runnable() { // from class: androidx.media3.session.ua
                @Override // java.lang.Runnable
                public final void run() {
                    va.a.a(this.f12437a, iVar, z11, gVar);
                }
            }));
        }

        @Override // com.google.common.util.concurrent.l
        public void onFailure(Throwable th2) {
        }
    }

    class b implements com.google.common.util.concurrent.l<List<p7.y>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t7.g f12527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12528b;

        b(t7.g gVar, int i11) {
            this.f12527a = gVar;
            this.f12528b = i11;
        }

        public static /* synthetic */ void a(b bVar, int i11, List list, t7.g gVar) {
            if (i11 == -1) {
                va.this.f12504g.k0().N0(list);
            } else {
                va.this.f12504g.k0().K0(i11, list);
            }
            va.this.f12504g.G0(gVar, new p7.j0.b.a().a(20).f());
        }

        @Override // com.google.common.util.concurrent.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final List<p7.y> list) {
            Handler handlerX = va.this.f12504g.X();
            s8 s8Var = va.this.f12504g;
            final t7.g gVar = this.f12527a;
            final int i11 = this.f12528b;
            s7.q0.m1(handlerX, s8Var.K(gVar, new Runnable() { // from class: androidx.media3.session.wa
                @Override // java.lang.Runnable
                public final void run() {
                    va.b.a(this.f12573a, i11, list, gVar);
                }
            }));
        }

        @Override // com.google.common.util.concurrent.l
        public void onFailure(Throwable th2) {
        }
    }

    class c extends ha.r {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Handler f12530f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ oe f12531g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f12532h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, int i12, int i13, String str, Handler handler, oe oeVar, int i14) {
            super(i11, i12, i13, str);
            this.f12530f = handler;
            this.f12531g = oeVar;
            this.f12532h = i14;
        }

        public static /* synthetic */ void e(oe oeVar, int i11, int i12) {
            if (oeVar.c0(26) || oeVar.c0(34)) {
                if (i11 == -100) {
                    if (oeVar.c0(34)) {
                        oeVar.u0(true, i12);
                        return;
                    } else {
                        oeVar.d0(true);
                        return;
                    }
                }
                if (i11 == -1) {
                    if (oeVar.c0(34)) {
                        oeVar.B0(i12);
                        return;
                    } else {
                        oeVar.y0();
                        return;
                    }
                }
                if (i11 == 1) {
                    if (oeVar.c0(34)) {
                        oeVar.Z(i12);
                        return;
                    } else {
                        oeVar.f0();
                        return;
                    }
                }
                if (i11 == 100) {
                    if (oeVar.c0(34)) {
                        oeVar.u0(false, i12);
                        return;
                    } else {
                        oeVar.d0(false);
                        return;
                    }
                }
                if (i11 != 101) {
                    s7.t.i("VolumeProviderCompat", "onAdjustVolume: Ignoring unknown direction: " + i11);
                    return;
                }
                if (oeVar.c0(34)) {
                    oeVar.u0(!oeVar.o1(), i12);
                } else {
                    oeVar.d0(!oeVar.o1());
                }
            }
        }

        public static /* synthetic */ void f(oe oeVar, int i11, int i12) {
            if (oeVar.c0(25) || oeVar.c0(33)) {
                if (oeVar.c0(33)) {
                    oeVar.I0(i11, i12);
                } else {
                    oeVar.O0(i11);
                }
            }
        }

        @Override // ha.r
        public void b(final int i11) {
            Handler handler = this.f12530f;
            final oe oeVar = this.f12531g;
            final int i12 = this.f12532h;
            s7.q0.m1(handler, new Runnable() { // from class: androidx.media3.session.ya
                @Override // java.lang.Runnable
                public final void run() {
                    va.c.e(oeVar, i11, i12);
                }
            });
        }

        @Override // ha.r
        public void c(final int i11) {
            Handler handler = this.f12530f;
            final oe oeVar = this.f12531g;
            final int i12 = this.f12532h;
            s7.q0.m1(handler, new Runnable() { // from class: androidx.media3.session.xa
                @Override // java.lang.Runnable
                public final void run() {
                    va.c.f(oeVar, i11, i12);
                }
            });
        }
    }

    private static final class d {
        public static void a(ha.l lVar, ComponentName componentName) {
            try {
                ((MediaSession) s7.a.f(lVar.d())).setMediaButtonBroadcastReceiver(componentName);
            } catch (IllegalArgumentException e11) {
                if (!Build.MANUFACTURER.equals("motorola")) {
                    throw e11;
                }
                s7.t.e("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e11);
            }
        }
    }

    private static class e extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.session.f<ha.n.b> f12533a;

        public e(Looper looper, androidx.media3.session.f<ha.n.b> fVar) {
            super(looper);
            this.f12533a = fVar;
        }

        public void a(t7.g gVar, long j11) {
            removeMessages(1001, gVar);
            sendMessageDelayed(obtainMessage(1001, gVar), j11);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            t7.g gVar = (t7.g) message.obj;
            if (this.f12533a.p(gVar)) {
                ((t7.f) s7.a.j(gVar.c())).c(0);
                this.f12533a.t(gVar);
            }
        }
    }

    private static final class f implements t7.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ha.n.b f12534a;

        public f(ha.n.b bVar) {
            this.f12534a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != f.class) {
                return false;
            }
            return Objects.equals(this.f12534a, ((f) obj).f12534a);
        }

        public int hashCode() {
            return u5.c.b(this.f12534a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class g implements t7.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Uri f12537c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p7.e0 f12535a = p7.e0.K;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f12536b = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f12538d = -9223372036854775807L;

        class a implements com.google.common.util.concurrent.l<Bitmap> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p7.e0 f12540a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f12541b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f12542c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f12543d;

            a(p7.e0 e0Var, String str, Uri uri, long j11) {
                this.f12540a = e0Var;
                this.f12541b = str;
                this.f12542c = uri;
                this.f12543d = j11;
            }

            @Override // com.google.common.util.concurrent.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Bitmap bitmap) {
                if (this != va.this.f12514q) {
                    return;
                }
                va.T0(va.this.f12508k, LegacyConversions.H(this.f12540a, this.f12541b, this.f12542c, this.f12543d, bitmap));
                va.this.f12504g.D0();
            }

            @Override // com.google.common.util.concurrent.l
            public void onFailure(Throwable th2) {
                if (this != va.this.f12514q) {
                    return;
                }
                s7.t.i("MediaSessionLegacyStub", va.C0(th2));
            }
        }

        public g() {
        }

        public static /* synthetic */ void G(g gVar, AtomicInteger atomicInteger, List list, List list2) {
            gVar.getClass();
            if (atomicInteger.incrementAndGet() == list.size()) {
                gVar.I(list2, list);
            }
        }

        private void I(List<com.google.common.util.concurrent.s<Bitmap>> list, List<p7.y> list2) {
            Bitmap bitmap;
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < list.size(); i11++) {
                com.google.common.util.concurrent.s<Bitmap> sVar = list.get(i11);
                if (sVar != null) {
                    try {
                        bitmap = (Bitmap) com.google.common.util.concurrent.m.b(sVar);
                    } catch (CancellationException | ExecutionException e11) {
                        s7.t.c("MediaSessionLegacyStub", "Failed to get bitmap", e11);
                        bitmap = null;
                    }
                } else {
                    bitmap = null;
                }
                arrayList.add(LegacyConversions.S(list2.get(i11), i11, bitmap));
            }
            va.W0(va.this.f12508k, arrayList);
        }

        private void K() {
            p7.e0 e0Var;
            Uri uri;
            g gVar;
            Bitmap bitmap;
            Uri uri2;
            oe oeVarK0 = va.this.f12504g.k0();
            p7.y yVarF1 = oeVarK0.f1();
            p7.e0 e0VarK1 = oeVarK0.k1();
            long jJ1 = oeVarK0.n1() ? -9223372036854775807L : oeVarK0.j1();
            String str = yVarF1 != null ? yVarF1.f101681a : "";
            Uri uri3 = (yVarF1 == null || (uri2 = yVarF1.f101688h.f101797a) == null) ? null : uri2;
            if (Objects.equals(this.f12535a, e0VarK1) && Objects.equals(this.f12536b, str) && Objects.equals(this.f12537c, uri3) && this.f12538d == jJ1) {
                return;
            }
            this.f12536b = str;
            this.f12537c = uri3;
            this.f12535a = e0VarK1;
            this.f12538d = jJ1;
            com.google.common.util.concurrent.s<Bitmap> sVarB = va.this.f12504g.Y().b(e0VarK1);
            if (sVarB != null) {
                va.this.f12514q = null;
                if (sVarB.isDone()) {
                    try {
                        Uri uri4 = uri3;
                        e0Var = e0VarK1;
                        uri = uri4;
                        gVar = this;
                        bitmap = (Bitmap) com.google.common.util.concurrent.m.b(sVarB);
                    } catch (CancellationException | ExecutionException e11) {
                        s7.t.i("MediaSessionLegacyStub", va.C0(e11));
                        Uri uri5 = uri3;
                        e0Var = e0VarK1;
                        uri = uri5;
                        gVar = this;
                        bitmap = null;
                    }
                } else {
                    va vaVar = va.this;
                    Uri uri6 = uri3;
                    e0Var = e0VarK1;
                    a aVar = new a(e0Var, str, uri6, jJ1);
                    gVar = this;
                    str = str;
                    uri = uri6;
                    jJ1 = jJ1;
                    vaVar.f12514q = aVar;
                    com.google.common.util.concurrent.l lVar = va.this.f12514q;
                    Handler handlerX = va.this.f12504g.X();
                    Objects.requireNonNull(handlerX);
                    com.google.common.util.concurrent.m.a(sVarB, lVar, new b8.t(handlerX));
                    bitmap = null;
                }
            } else {
                Uri uri7 = uri3;
                e0Var = e0VarK1;
                uri = uri7;
                gVar = this;
                bitmap = null;
            }
            va.T0(va.this.f12508k, LegacyConversions.H(e0Var, str, uri, jJ1, bitmap));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L(p7.r0 r0Var) {
            if (!va.this.M0() || r0Var.u()) {
                va.W0(va.this.f12508k, null);
                return;
            }
            final List<p7.y> listC = LegacyConversions.C(r0Var);
            final ArrayList arrayList = new ArrayList();
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            Runnable runnable = new Runnable() { // from class: androidx.media3.session.za
                @Override // java.lang.Runnable
                public final void run() {
                    va.g.G(this.f12674a, atomicInteger, listC, arrayList);
                }
            };
            for (int i11 = 0; i11 < listC.size(); i11++) {
                p7.e0 e0Var = listC.get(i11).f101685e;
                if (e0Var.f101286k == null) {
                    arrayList.add(null);
                    runnable.run();
                } else {
                    com.google.common.util.concurrent.s<Bitmap> sVarA = va.this.f12504g.Y().a(e0Var.f101286k);
                    arrayList.add(sVarA);
                    Handler handlerX = va.this.f12504g.X();
                    Objects.requireNonNull(handlerX);
                    sVarA.b(runnable, new b8.t(handlerX));
                }
            }
        }

        @Override // androidx.media3.session.t7.f
        public void C(int i11, p7.j0.b bVar) {
            if (J()) {
                return;
            }
            oe oeVarK0 = va.this.f12504g.k0();
            va.this.N0(oeVarK0);
            va.this.b1(oeVarK0);
        }

        @Override // androidx.media3.session.t7.f
        public void D(int i11, p7.d dVar) {
            if (va.this.f12504g.k0().i0().f101416a == 0) {
                va.this.f12508k.q(LegacyConversions.k0(dVar));
            }
        }

        public boolean J() {
            return va.this.f12522y != null;
        }

        @Override // androidx.media3.session.t7.f
        public void a(int i11, int i12) {
            va.this.f12508k.v(LegacyConversions.O(i12));
        }

        @Override // androidx.media3.session.t7.f
        public void b(int i11, p7.y yVar, int i12) {
            if (J()) {
                return;
            }
            K();
            if (yVar == null) {
                va.this.f12508k.u(0);
            } else {
                va.this.f12508k.u(LegacyConversions.l0(yVar.f101685e.f101284i));
            }
            va vaVar = va.this;
            vaVar.b1(vaVar.f12504g.k0());
        }

        @Override // androidx.media3.session.t7.f
        public void c(int i11) {
        }

        @Override // androidx.media3.session.t7.f
        public void d(int i11, PlaybackException playbackException) {
            if (J()) {
                return;
            }
            va vaVar = va.this;
            vaVar.b1(vaVar.f12504g.k0());
        }

        @Override // androidx.media3.session.t7.f
        public void e(int i11, p7.i0 i0Var) {
            if (J()) {
                return;
            }
            va vaVar = va.this;
            vaVar.b1(vaVar.f12504g.k0());
        }

        @Override // androidx.media3.session.t7.f
        public void f(int i11, p7.m mVar) {
            oe oeVarK0 = va.this.f12504g.k0();
            va.this.f12511n = va.x0(oeVarK0);
            if (va.this.f12511n != null) {
                va.this.f12508k.r(va.this.f12511n);
            } else {
                va.this.f12508k.q(LegacyConversions.k0(oeVarK0.d1()));
            }
        }

        @Override // androidx.media3.session.t7.f
        public void g(int i11, ue ueVar, boolean z11, boolean z12, int i12) {
            if (J()) {
                return;
            }
            va vaVar = va.this;
            vaVar.b1(vaVar.f12504g.k0());
        }

        @Override // androidx.media3.session.t7.f
        public void i(int i11, boolean z11) {
            va.this.f12508k.x(LegacyConversions.P(z11));
        }

        @Override // androidx.media3.session.t7.f
        public void j(int i11, boolean z11) {
            if (J()) {
                return;
            }
            va vaVar = va.this;
            vaVar.b1(vaVar.f12504g.k0());
        }

        @Override // androidx.media3.session.t7.f
        public void l(int i11, se seVar, Bundle bundle) {
            va.this.f12508k.i(seVar.f12348b, bundle);
        }

        @Override // androidx.media3.session.t7.f
        public void n(int i11, int i12, PlaybackException playbackException) {
            if (J()) {
                return;
            }
            va vaVar = va.this;
            vaVar.b1(vaVar.f12504g.k0());
        }

        @Override // androidx.media3.session.t7.f
        public void p(int i11, int i12) {
            if (J()) {
                return;
            }
            va vaVar = va.this;
            vaVar.b1(vaVar.f12504g.k0());
        }

        @Override // androidx.media3.session.t7.f
        public void q(int i11, p7.j0.e eVar, p7.j0.e eVar2, int i12) {
            if (J()) {
                return;
            }
            va vaVar = va.this;
            vaVar.b1(vaVar.f12504g.k0());
        }

        @Override // androidx.media3.session.t7.f
        public void r(int i11, oe oeVar, oe oeVar2) {
            p7.r0 r0VarG1 = oeVar2.g1();
            if (oeVar == null || !Objects.equals(oeVar.g1(), r0VarG1)) {
                v(i11, r0VarG1, 0);
            }
            p7.e0 e0VarL1 = oeVar2.l1();
            if (oeVar == null || !Objects.equals(oeVar.l1(), e0VarL1)) {
                t(i11, e0VarL1);
            }
            p7.e0 e0VarK1 = oeVar2.k1();
            if (oeVar == null || !Objects.equals(oeVar.k1(), e0VarK1)) {
                y(i11, e0VarK1);
            }
            if (oeVar == null || oeVar.T() != oeVar2.T()) {
                i(i11, oeVar2.T());
            }
            if (oeVar == null || oeVar.h() != oeVar2.h()) {
                a(i11, oeVar2.h());
            }
            f(i11, oeVar2.i0());
            va.this.N0(oeVar2);
            p7.y yVarF1 = oeVar2.f1();
            if (oeVar == null || !Objects.equals(oeVar.f1(), yVarF1)) {
                b(i11, yVarF1, 3);
            } else {
                if (J()) {
                    return;
                }
                va.this.b1(oeVar2);
            }
        }

        @Override // androidx.media3.session.t7.f
        public void t(int i11, p7.e0 e0Var) {
            if (J()) {
                return;
            }
            CharSequence charSequenceL = va.this.f12508k.b().l();
            CharSequence charSequence = e0Var.f101276a;
            if (TextUtils.equals(charSequenceL, charSequence)) {
                return;
            }
            va vaVar = va.this;
            vaVar.X0(vaVar.f12508k, charSequence);
        }

        @Override // androidx.media3.session.t7.f
        public void v(int i11, p7.r0 r0Var, int i12) {
            if (J()) {
                return;
            }
            L(r0Var);
            K();
        }

        @Override // androidx.media3.session.t7.f
        public void x(int i11, boolean z11, int i12) {
            if (J()) {
                return;
            }
            va vaVar = va.this;
            vaVar.b1(vaVar.f12504g.k0());
        }

        @Override // androidx.media3.session.t7.f
        public void y(int i11, p7.e0 e0Var) {
            if (J()) {
                return;
            }
            K();
        }

        @Override // androidx.media3.session.t7.f
        public void z(int i11, int i12, boolean z11) {
            if (va.this.f12511n != null) {
                ha.r rVar = va.this.f12511n;
                if (z11) {
                    i12 = 0;
                }
                rVar.d(i12);
            }
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f12545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f12547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f12548d;
    }

    private final class i extends BroadcastReceiver {
        private i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            KeyEvent keyEvent;
            if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                va.this.f12508k.b().c(keyEvent);
            }
        }

        /* synthetic */ i(va vaVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface j {
        void a(t7.g gVar);
    }

    static {
        A = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public va(s8 s8Var, Uri uri, Handler handler, Bundle bundle, boolean z11, com.google.common.collect.x<androidx.media3.session.a> xVar, com.google.common.collect.x<androidx.media3.session.a> xVar2, te teVar, p7.j0.b bVar, Bundle bundle2) {
        ComponentName componentNameG0;
        boolean z12;
        PendingIntent foregroundService;
        this.f12504g = s8Var;
        this.f12512o = z11;
        this.f12518u = xVar;
        this.f12519v = xVar2;
        this.f12520w = teVar;
        this.f12521x = bVar;
        this.f12517t = new Bundle(bundle2);
        Context contextA0 = s8Var.a0();
        this.f12505h = ha.n.a(contextA0);
        this.f12506i = new g();
        androidx.media3.session.f<ha.n.b> fVar = new androidx.media3.session.f<>(s8Var);
        this.f12503f = fVar;
        this.f12513p = DataPersistorKt.EXPIRATION_TIME;
        this.f12507j = new e(s8Var.X().getLooper(), fVar);
        if (!xVar2.isEmpty()) {
            a1();
        }
        ComponentName componentNameO0 = O0(contextA0);
        this.f12510m = componentNameO0;
        if (componentNameO0 == null || Build.VERSION.SDK_INT < 31) {
            componentNameG0 = G0(contextA0, "androidx.media3.session.MediaLibraryService");
            componentNameG0 = componentNameG0 == null ? G0(contextA0, "androidx.media3.session.MediaSessionService") : componentNameG0;
            z12 = (componentNameG0 == null || componentNameG0.equals(componentNameO0)) ? false : true;
        } else {
            z12 = false;
            componentNameG0 = componentNameO0;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", uri);
        a aVar = null;
        if (componentNameG0 == null) {
            i iVar = new i(this, aVar);
            this.f12509l = iVar;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            intentFilter.addDataScheme((String) s7.q0.l(uri.getScheme()));
            s7.q0.p1(contextA0, iVar, intentFilter);
            intent.setPackage(contextA0.getPackageName());
            foregroundService = PendingIntent.getBroadcast(contextA0, 0, intent, A);
            componentNameG0 = new ComponentName(contextA0, contextA0.getClass());
        } else {
            intent.setComponent(componentNameG0);
            foregroundService = z12 ? Build.VERSION.SDK_INT >= 26 ? PendingIntent.getForegroundService(contextA0, 0, intent, A) : PendingIntent.getService(contextA0, 0, intent, A) : PendingIntent.getBroadcast(contextA0, 0, intent, A);
            this.f12509l = null;
        }
        String strJoin = TextUtils.join(".", new String[]{"androidx.media3.session.id", s8Var.c0()});
        int i11 = Build.VERSION.SDK_INT;
        ha.l lVar = new ha.l(contextA0, strJoin, i11 >= 31 ? null : componentNameG0, i11 < 31 ? foregroundService : null, bundle);
        this.f12508k = lVar;
        if (i11 >= 31 && componentNameO0 != null) {
            d.a(lVar, componentNameO0);
        }
        PendingIntent pendingIntentL0 = s8Var.l0();
        if (pendingIntentL0 != null) {
            lVar.w(pendingIntentL0);
        }
        lVar.k(this, handler);
    }

    private void A0(se seVar, j jVar) {
        B0(seVar, 0, jVar, this.f12508k.c());
    }

    private void B0(final se seVar, final int i11, final j jVar, final ha.n.b bVar) {
        Object objValueOf;
        if (bVar != null) {
            s7.q0.m1(this.f12504g.X(), new Runnable() { // from class: androidx.media3.session.ia
                @Override // java.lang.Runnable
                public final void run() {
                    va.a0(this.f11784a, seVar, i11, bVar, jVar);
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("RemoteUserInfo is null, ignoring command=");
        if (seVar == null) {
            objValueOf = seVar;
            objValueOf = Integer.valueOf(i11);
        }
        objValueOf = seVar;
        sb2.append(objValueOf);
        s7.t.b("MediaSessionLegacyStub", sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String C0(Throwable th2) {
        return "Failed to load bitmap: " + th2.getMessage();
    }

    public static /* synthetic */ void F(va vaVar, oe oeVar) {
        vaVar.f12508k.p(vaVar.w0(oeVar));
        vaVar.f12506i.L(oeVar.N().c(17) ? oeVar.J() : p7.r0.f101451a);
    }

    public static /* synthetic */ void G(j jVar, t7.g gVar) {
        try {
            jVar.a(gVar);
        } catch (RemoteException e11) {
            s7.t.j("MediaSessionLegacyStub", "Exception in " + gVar, e11);
        }
    }

    private static ComponentName G0(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    public static /* synthetic */ void I(va vaVar, ha.j jVar, t7.g gVar) {
        vaVar.getClass();
        String strG = jVar.g();
        if (TextUtils.isEmpty(strG)) {
            s7.t.i("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
            return;
        }
        oe oeVarK0 = vaVar.f12504g.k0();
        if (!oeVarK0.c0(17)) {
            s7.t.i("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
            return;
        }
        p7.r0 r0VarJ = oeVarK0.J();
        p7.r0.d dVar = new p7.r0.d();
        for (int i11 = 0; i11 < r0VarJ.t(); i11++) {
            if (TextUtils.equals(r0VarJ.r(i11, dVar).f101483c.f101681a, strG)) {
                oeVarK0.A0(i11);
                return;
            }
        }
    }

    private void J0(final p7.y yVar, final boolean z11) {
        y0(31, new j() { // from class: androidx.media3.session.ga
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                va vaVar = this.f11715a;
                com.google.common.util.concurrent.m.a(vaVar.f12504g.I0(gVar, com.google.common.collect.x.s(yVar), -1, -9223372036854775807L), vaVar.new a(gVar, z11), com.google.common.util.concurrent.w.b());
            }
        }, this.f12508k.c(), false);
    }

    private void K0(final ha.j jVar, final int i11) {
        if (jVar != null) {
            if (i11 == -1 || i11 >= 0) {
                y0(20, new j() { // from class: androidx.media3.session.w9
                    @Override // androidx.media3.session.va.j
                    public final void a(t7.g gVar) {
                        va.P(this.f12570a, jVar, i11, gVar);
                    }
                }, this.f12508k.c(), false);
            }
        }
    }

    public static /* synthetic */ void L(va vaVar, se seVar, Bundle bundle, t7.g gVar) {
        s8 s8Var = vaVar.f12504g;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        L0(s8Var.z0(gVar, seVar, bundle));
    }

    private static <T> void L0(Future<T> future) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M0() {
        return this.f12521x.c(17) && this.f12504g.k0().N().c(17);
    }

    public static /* synthetic */ void O(va vaVar, se seVar, Bundle bundle, ResultReceiver resultReceiver, t7.g gVar) {
        s8 s8Var = vaVar.f12504g;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        com.google.common.util.concurrent.s<ga.v> sVarZ0 = s8Var.z0(gVar, seVar, bundle);
        if (resultReceiver != null) {
            Q0(resultReceiver, sVarZ0);
        } else {
            L0(sVarZ0);
        }
    }

    private static ComponentName O0(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (listQueryBroadcastReceivers.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found " + listQueryBroadcastReceivers.size());
    }

    public static /* synthetic */ void P(va vaVar, ha.j jVar, int i11, t7.g gVar) {
        vaVar.getClass();
        if (TextUtils.isEmpty(jVar.g())) {
            s7.t.i("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
        } else {
            com.google.common.util.concurrent.m.a(vaVar.f12504g.x0(gVar, com.google.common.collect.x.s(LegacyConversions.x(jVar))), vaVar.new b(gVar, i11), com.google.common.util.concurrent.w.b());
        }
    }

    private static void Q0(final ResultReceiver resultReceiver, final com.google.common.util.concurrent.s<ga.v> sVar) {
        sVar.b(new Runnable() { // from class: androidx.media3.session.la
            @Override // java.lang.Runnable
            public final void run() {
                va.e0(sVar, resultReceiver);
            }
        }, com.google.common.util.concurrent.w.b());
    }

    private static void S0(ha.l lVar, PendingIntent pendingIntent) {
        lVar.n(pendingIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void T0(ha.l lVar, ha.k kVar) {
        lVar.o(kVar);
    }

    public static /* synthetic */ void U(va vaVar, p7.k0 k0Var, t7.g gVar) {
        p7.y yVarF1 = vaVar.f12504g.k0().f1();
        if (yVarF1 == null) {
            return;
        }
        L0(vaVar.f12504g.J0(gVar, yVarF1.f101681a, k0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W0(ha.l lVar, List<ha.l.h> list) {
        lVar.s(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(ha.l lVar, CharSequence charSequence) {
        if (!M0()) {
            charSequence = null;
        }
        lVar.t(charSequence);
    }

    private t7.g Z0(ha.n.b bVar) {
        t7.g gVarK = this.f12503f.k(bVar);
        if (gVarK == null) {
            f fVar = new f(bVar);
            t7.g gVar = new t7.g(bVar, 0, 0, this.f12505h.b(bVar), fVar, Bundle.EMPTY, 0);
            t7.e eVarY0 = this.f12504g.y0(gVar);
            if (!eVarY0.f12380a) {
                fVar.c(0);
                return null;
            }
            this.f12503f.e(gVar.g(), gVar, eVarY0.f12381b, eVarY0.f12382c);
            this.f12504g.H0(gVar);
            gVarK = gVar;
        }
        this.f12507j.a(gVarK, this.f12513p);
        return gVarK;
    }

    public static /* synthetic */ void a0(va vaVar, se seVar, int i11, ha.n.b bVar, j jVar) {
        if (vaVar.f12504g.u0()) {
            return;
        }
        if (!vaVar.f12508k.g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignore incoming session command before initialization. command=");
            sb2.append(seVar == null ? Integer.valueOf(i11) : seVar.f12348b);
            sb2.append(", pid=");
            sb2.append(bVar.b());
            s7.t.i("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        t7.g gVarZ0 = vaVar.Z0(bVar);
        if (gVarZ0 == null) {
            return;
        }
        if (seVar != null) {
            if (!vaVar.f12503f.s(gVarZ0, seVar)) {
                return;
            }
        } else if (!vaVar.f12503f.r(gVarZ0, i11)) {
            return;
        }
        try {
            jVar.a(gVarZ0);
        } catch (RemoteException e11) {
            s7.t.j("MediaSessionLegacyStub", "Exception in " + gVarZ0, e11);
        }
    }

    private void a1() {
        com.google.common.collect.x<androidx.media3.session.a> xVar = this.f12519v;
        te teVar = this.f12520w;
        p7.j0.b bVar = this.f12523z;
        if (bVar == null) {
            bVar = this.f12521x;
        }
        com.google.common.collect.x<androidx.media3.session.a> xVarF = androidx.media3.session.a.f(androidx.media3.session.a.d(xVar, teVar, bVar), true, true);
        this.f12518u = xVarF;
        this.f12517t.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !androidx.media3.session.a.a(xVarF, 2));
        this.f12517t.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true ^ androidx.media3.session.a.a(this.f12518u, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e0(com.google.common.util.concurrent.s sVar, ResultReceiver resultReceiver) {
        ga.v vVar;
        try {
            vVar = (ga.v) s7.a.g((ga.v) sVar.get(), "SessionResult must not be null");
        } catch (InterruptedException e11) {
            e = e11;
            s7.t.j("MediaSessionLegacyStub", "Custom command failed", e);
            vVar = new ga.v(-1);
        } catch (CancellationException e12) {
            s7.t.j("MediaSessionLegacyStub", "Custom command cancelled", e12);
            vVar = new ga.v(1);
        } catch (ExecutionException e13) {
            e = e13;
            s7.t.j("MediaSessionLegacyStub", "Custom command failed", e);
            vVar = new ga.v(-1);
        }
        resultReceiver.send(vVar.f67784a, vVar.f67785b);
    }

    public static /* synthetic */ void f0(va vaVar, int i11, ha.n.b bVar, final j jVar, boolean z11) {
        if (vaVar.f12504g.u0()) {
            return;
        }
        if (!vaVar.f12508k.g()) {
            s7.t.i("MediaSessionLegacyStub", "Ignore incoming player command before initialization. command=" + i11 + ", pid=" + bVar.b());
            return;
        }
        final t7.g gVarZ0 = vaVar.Z0(bVar);
        if (gVarZ0 == null) {
            return;
        }
        if (!vaVar.f12503f.q(gVarZ0, i11)) {
            if (i11 != 1 || vaVar.f12504g.k0().t()) {
                return;
            }
            s7.t.i("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        if (vaVar.f12504g.F0(gVarZ0, i11) != 0) {
            return;
        }
        vaVar.f12504g.K(gVarZ0, new Runnable() { // from class: androidx.media3.session.ka
            @Override // java.lang.Runnable
            public final void run() {
                va.G(jVar, gVarZ0);
            }
        }).run();
        if (z11) {
            vaVar.f12504g.G0(gVarZ0, new p7.j0.b.a().a(i11).f());
        }
    }

    private static long u0(int i11, boolean z11) {
        if (i11 == 1) {
            return z11 ? 516L : 514L;
        }
        if (i11 == 2) {
            return Http2Stream.EMIT_BUFFER_SIZE;
        }
        if (i11 == 3) {
            return 1L;
        }
        if (i11 == 31) {
            return 240640L;
        }
        switch (i11) {
            case 5:
                return 256L;
            case 6:
            case 7:
                return 16L;
            case 8:
            case 9:
                return 32L;
            case 10:
                return ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
            case 11:
                return 8L;
            case 12:
                return 64L;
            case 13:
                return 4194304L;
            case 14:
                return 2621440L;
            case 15:
                return 262144L;
            default:
                return 0L;
        }
    }

    private static p7.y v0(String str, Uri uri, String str2, Bundle bundle) {
        p7.y.c cVar = new p7.y.c();
        if (str == null) {
            str = "";
        }
        return cVar.c(str).e(new p7.y.i.a().f(uri).g(str2).e(bundle).d()).a();
    }

    private ha.p w0(oe oeVar) {
        PlaybackException playbackExceptionA = this.f12522y;
        if (playbackExceptionA == null) {
            playbackExceptionA = oeVar.a();
        }
        boolean z11 = oeVar.c0(16) && !oeVar.t0();
        boolean z12 = playbackExceptionA != null || s7.q0.B1(oeVar, this.f12512o);
        int iQ = playbackExceptionA != null ? 7 : LegacyConversions.Q(oeVar, z12);
        p7.j0.b bVarN = oeVar.N();
        p7.j0.b bVar = this.f12523z;
        p7.j0.b bVarF = bVar != null ? me.f(bVar, bVarN) : me.f(this.f12521x, bVarN);
        long jU0 = 128;
        for (int i11 = 0; i11 < bVarF.g(); i11++) {
            jU0 |= u0(bVarF.f(i11), z12);
        }
        if (!this.f12519v.isEmpty() && !this.f12517t.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS")) {
            jU0 &= -17;
        }
        if (!this.f12519v.isEmpty() && !this.f12517t.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            jU0 &= -33;
        }
        if (!z11) {
            jU0 &= -257;
        }
        long jT = oeVar.c0(17) ? LegacyConversions.T(oeVar.R()) : -1L;
        float f11 = oeVar.e().f101379a;
        float f12 = (oeVar.isPlaying() && z11) ? f11 : BitmapDescriptorFactory.HUE_RED;
        Bundle bundle = playbackExceptionA != null ? new Bundle(playbackExceptionA.f9020c) : new Bundle();
        bundle.putAll(this.f12517t);
        bundle.putFloat("EXO_SPEED", f11);
        p7.y yVarF1 = oeVar.f1();
        if (yVarF1 != null && !"".equals(yVarF1.f101681a)) {
            bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", yVarF1.f101681a);
        }
        long jD = z11 ? oeVar.D() : -1L;
        long jL0 = z11 ? oeVar.L0() : -1L;
        PlaybackException playbackException = playbackExceptionA;
        ha.p.c cVarG = new ha.p.c().h(iQ, jD, f12, SystemClock.elapsedRealtime()).c(jU0).d(jT).e(jL0).g(bundle);
        for (int i12 = 0; i12 < this.f12518u.size(); i12++) {
            androidx.media3.session.a aVar = this.f12518u.get(i12);
            se seVar = aVar.f11456a;
            if (seVar != null && aVar.f11464i && seVar.f12347a == 0 && androidx.media3.session.a.j(aVar, this.f12520w, bVarF)) {
                boolean z13 = aVar.f11458c != 0;
                boolean z14 = aVar.f11460e != null;
                Bundle bundle2 = (z13 || z14) ? new Bundle(seVar.f12349c) : seVar.f12349c;
                if (z13) {
                    bundle2.putInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", aVar.f11458c);
                }
                if (z14) {
                    bundle2.putString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT", ((Uri) s7.a.f(aVar.f11460e)).toString());
                }
                cVarG.a(new ha.p.d.b(seVar.f12348b, aVar.f11461f, aVar.f11459d).b(bundle2).a());
            }
        }
        if (playbackException != null) {
            cVarG.f(LegacyConversions.t(playbackException), playbackException.getMessage());
        }
        return cVarG.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ha.r x0(oe oeVar) {
        int i11;
        if (oeVar.i0().f101416a == 0) {
            return null;
        }
        p7.j0.b bVarN = oeVar.N();
        if (bVarN.d(26, 34)) {
            i11 = bVarN.d(25, 33) ? 2 : 1;
        } else {
            i11 = 0;
        }
        int i12 = i11;
        Handler handler = new Handler(oeVar.F0());
        int iI1 = oeVar.i1();
        p7.m mVarI0 = oeVar.i0();
        return new c(i12, mVarI0.f101418c, iI1, mVarI0.f101419d, handler, oeVar, 1);
    }

    private void y0(final int i11, final j jVar, final ha.n.b bVar, final boolean z11) {
        if (this.f12504g.u0()) {
            return;
        }
        if (bVar != null) {
            s7.q0.m1(this.f12504g.X(), new Runnable() { // from class: androidx.media3.session.ha
                @Override // java.lang.Runnable
                public final void run() {
                    va.f0(this.f11754a, i11, bVar, jVar, z11);
                }
            });
            return;
        }
        s7.t.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i11);
    }

    private void z0(int i11, j jVar) {
        B0(null, i11, jVar, this.f12508k.c());
    }

    @Override // ha.l.b
    public void A() {
        if (this.f12504g.k0().c0(7)) {
            y0(7, new j() { // from class: androidx.media3.session.y9
                @Override // androidx.media3.session.va.j
                public final void a(t7.g gVar) {
                    this.f12644a.f12504g.k0().F();
                }
            }, this.f12508k.c(), true);
        } else {
            y0(6, new j() { // from class: androidx.media3.session.z9
                @Override // androidx.media3.session.va.j
                public final void a(t7.g gVar) {
                    this.f12673a.f12504g.k0().x0();
                }
            }, this.f12508k.c(), true);
        }
    }

    @Override // ha.l.b
    public void B(final long j11) {
        if (j11 < 0) {
            return;
        }
        y0(10, new j() { // from class: androidx.media3.session.t9
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                this.f12406a.f12504g.k0().l0((int) j11);
            }
        }, this.f12508k.c(), true);
    }

    @Override // ha.l.b
    public void C() {
        y0(3, new j() { // from class: androidx.media3.session.fa
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                this.f11677a.f12504g.k0().stop();
            }
        }, this.f12508k.c(), true);
    }

    public androidx.media3.session.f<ha.n.b> D0() {
        return this.f12503f;
    }

    public t7.f E0() {
        return this.f12506i;
    }

    public t7.e F0(t7 t7Var) {
        return new t7.e.a(t7Var).c(this.f12520w).b(this.f12521x).d(this.f12518u).e(this.f12519v).a();
    }

    public ha.l H0() {
        return this.f12508k;
    }

    void I0(ha.n.b bVar) {
        y0(1, new j() { // from class: androidx.media3.session.ja
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                va vaVar = this.f11810a;
                s7.q0.H0(vaVar.f12504g.k0(), vaVar.f12504g.S0());
            }
        }, bVar, true);
    }

    void N0(oe oeVar) {
        int i11 = oeVar.c0(20) ? 4 : 0;
        if (this.f12515r != i11) {
            this.f12515r = i11;
            this.f12508k.m(i11);
        }
    }

    public void P0() {
        if (Build.VERSION.SDK_INT < 31) {
            if (this.f12510m == null) {
                S0(this.f12508k, null);
            } else {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", this.f12504g.o0());
                intent.setComponent(this.f12510m);
                S0(this.f12508k, PendingIntent.getBroadcast(this.f12504g.a0(), 0, intent, A));
            }
        }
        if (this.f12509l != null) {
            this.f12504g.a0().unregisterReceiver(this.f12509l);
        }
        this.f12508k.h();
    }

    public void R0(te teVar, p7.j0.b bVar) {
        if (this.f12522y != null) {
            return;
        }
        boolean z11 = this.f12521x.c(17) != bVar.c(17);
        this.f12520w = teVar;
        this.f12521x = bVar;
        if (!this.f12519v.isEmpty()) {
            boolean z12 = this.f12517t.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
            boolean z13 = this.f12517t.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
            a1();
            if (this.f12517t.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z12 || this.f12517t.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z13) {
                H0().l(this.f12517t);
            }
        }
        if (z11) {
            c1(this.f12504g.k0());
        } else {
            b1(this.f12504g.k0());
        }
    }

    public void U0(com.google.common.collect.x<androidx.media3.session.a> xVar) {
        this.f12518u = xVar;
    }

    public void V0(com.google.common.collect.x<androidx.media3.session.a> xVar) {
        this.f12519v = xVar;
        boolean z11 = this.f12517t.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z12 = this.f12517t.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        a1();
        if (this.f12517t.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z11 && this.f12517t.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z12) {
            return;
        }
        H0().l(this.f12517t);
    }

    public void Y0() {
        this.f12508k.j(true);
    }

    @Override // ha.l.b
    public void b(ha.j jVar) {
        K0(jVar, -1);
    }

    public void b1(final oe oeVar) {
        s7.q0.m1(this.f12504g.X(), new Runnable() { // from class: androidx.media3.session.ma
            @Override // java.lang.Runnable
            public final void run() {
                va vaVar = this.f11975a;
                vaVar.f12508k.p(vaVar.w0(oeVar));
            }
        });
    }

    @Override // ha.l.b
    public void c(ha.j jVar, int i11) {
        K0(jVar, i11);
    }

    public void c1(final oe oeVar) {
        s7.q0.m1(this.f12504g.X(), new Runnable() { // from class: androidx.media3.session.x9
            @Override // java.lang.Runnable
            public final void run() {
                va.F(this.f12619a, oeVar);
            }
        });
    }

    @Override // ha.l.b
    public void d(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        s7.a.j(str);
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            resultReceiver.send(0, this.f12504g.n0().k());
        } else {
            final se seVar = new se(str, Bundle.EMPTY);
            A0(seVar, new j() { // from class: androidx.media3.session.ca
                @Override // androidx.media3.session.va.j
                public final void a(t7.g gVar) {
                    va.O(this.f11574a, seVar, bundle, resultReceiver, gVar);
                }
            });
        }
    }

    @Override // ha.l.b
    public void e(String str, final Bundle bundle) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        final se seVar = new se(str, Bundle.EMPTY);
        A0(seVar, new j() { // from class: androidx.media3.session.u9
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                va.L(this.f12434a, seVar, bundle, gVar);
            }
        });
    }

    @Override // ha.l.b
    public void f() {
        y0(12, new j() { // from class: androidx.media3.session.s9
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                this.f12331a.f12504g.k0().C();
            }
        }, this.f12508k.c(), true);
    }

    @Override // ha.l.b
    public boolean g(Intent intent) {
        return this.f12504g.C0(new t7.g((ha.n.b) s7.a.f(this.f12508k.c()), 0, 0, false, null, Bundle.EMPTY, 0), intent);
    }

    @Override // ha.l.b
    public void h() {
        y0(1, new j() { // from class: androidx.media3.session.sa
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                s7.q0.F0(this.f12332a.f12504g.k0());
            }
        }, this.f12508k.c(), true);
    }

    @Override // ha.l.b
    public void i() {
        y0(1, new j() { // from class: androidx.media3.session.qa
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                this.f12167a.f12504g.q0(gVar, true);
            }
        }, this.f12508k.c(), false);
    }

    @Override // ha.l.b
    public void j(String str, Bundle bundle) {
        J0(v0(str, null, null, bundle), true);
    }

    @Override // ha.l.b
    public void k(String str, Bundle bundle) {
        J0(v0(null, null, str, bundle), true);
    }

    @Override // ha.l.b
    public void l(Uri uri, Bundle bundle) {
        J0(v0(null, uri, null, bundle), true);
    }

    @Override // ha.l.b
    public void m() {
        y0(2, new j() { // from class: androidx.media3.session.ea
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                this.f11637a.f12504g.k0().b();
            }
        }, this.f12508k.c(), true);
    }

    @Override // ha.l.b
    public void n(String str, Bundle bundle) {
        J0(v0(str, null, null, bundle), false);
    }

    @Override // ha.l.b
    public void o(String str, Bundle bundle) {
        J0(v0(null, null, str, bundle), false);
    }

    @Override // ha.l.b
    public void p(Uri uri, Bundle bundle) {
        J0(v0(null, uri, null, bundle), false);
    }

    @Override // ha.l.b
    public void q(final ha.j jVar) {
        if (jVar == null) {
            return;
        }
        y0(20, new j() { // from class: androidx.media3.session.da
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                va.I(this.f11609a, jVar, gVar);
            }
        }, this.f12508k.c(), true);
    }

    @Override // ha.l.b
    public void r() {
        y0(11, new j() { // from class: androidx.media3.session.ba
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                this.f11535a.f12504g.k0().U();
            }
        }, this.f12508k.c(), true);
    }

    @Override // ha.l.b
    public void s(final long j11) {
        y0(5, new j() { // from class: androidx.media3.session.pa
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                this.f12126a.f12504g.k0().seekTo(j11);
            }
        }, this.f12508k.c(), true);
    }

    @Override // ha.l.b
    public void t(boolean z11) {
    }

    boolean t0() {
        return this.f12510m != null;
    }

    @Override // ha.l.b
    public void u(final float f11) {
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        y0(13, new j() { // from class: androidx.media3.session.ta
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                this.f12408a.f12504g.k0().l(f11);
            }
        }, this.f12508k.c(), true);
    }

    @Override // ha.l.b
    public void v(ha.q qVar) {
        w(qVar, null);
    }

    @Override // ha.l.b
    public void w(ha.q qVar, Bundle bundle) {
        final p7.k0 k0VarU = LegacyConversions.U(qVar);
        if (k0VarU != null) {
            z0(40010, new j() { // from class: androidx.media3.session.v9
                @Override // androidx.media3.session.va.j
                public final void a(t7.g gVar) {
                    va.U(this.f12501a, k0VarU, gVar);
                }
            });
            return;
        }
        s7.t.i("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + qVar);
    }

    @Override // ha.l.b
    public void x(final int i11) {
        y0(15, new j() { // from class: androidx.media3.session.aa
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                this.f11497a.f12504g.k0().i(LegacyConversions.W(i11));
            }
        }, this.f12508k.c(), true);
    }

    @Override // ha.l.b
    public void y(final int i11) {
        y0(14, new j() { // from class: androidx.media3.session.ra
            @Override // androidx.media3.session.va.j
            public final void a(t7.g gVar) {
                this.f12202a.f12504g.k0().u(LegacyConversions.c0(i11));
            }
        }, this.f12508k.c(), true);
    }

    @Override // ha.l.b
    public void z() {
        if (this.f12504g.k0().c0(9)) {
            y0(9, new j() { // from class: androidx.media3.session.na
                @Override // androidx.media3.session.va.j
                public final void a(t7.g gVar) {
                    this.f12004a.f12504g.k0().K();
                }
            }, this.f12508k.c(), true);
        } else {
            y0(8, new j() { // from class: androidx.media3.session.oa
                @Override // androidx.media3.session.va.j
                public final void a(t7.g gVar) {
                    this.f12097a.f12504g.k0().b0();
                }
            }, this.f12508k.c(), true);
        }
    }
}

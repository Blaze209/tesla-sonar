package androidx.media3.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.t7;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class t7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f12361b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<String, t7> f12362c = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s8 f12363a;

    public static final class b extends c<t7, b, d> {

        class a implements d {
            a() {
            }
        }

        public b(Context context, p7.j0 j0Var) {
            super(context, j0Var, new a());
        }

        public t7 d() {
            if (this.f12371h == null) {
                this.f12371h = new ga.a(new androidx.media3.datasource.b(this.f12364a));
            }
            return new t7(this.f12364a, this.f12366c, this.f12365b, this.f12368e, this.f12373j, this.f12374k, this.f12375l, this.f12367d, this.f12369f, this.f12370g, (s7.h) s7.a.f(this.f12371h), this.f12372i, this.f12376m, 0);
        }

        public b e(d dVar) {
            return (b) super.a(dVar);
        }

        public b f(List<androidx.media3.session.a> list) {
            return (b) super.b(list);
        }

        public b g(String str) {
            return (b) super.c(str);
        }
    }

    static abstract class c<SessionT extends t7, BuilderT extends c<SessionT, BuilderT, CallbackT>, CallbackT extends d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f12364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final p7.j0 f12365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f12366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        CallbackT f12367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        PendingIntent f12368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bundle f12369f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Bundle f12370g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        s7.h f12371h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f12372i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        com.google.common.collect.x<androidx.media3.session.a> f12373j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        com.google.common.collect.x<androidx.media3.session.a> f12374k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        com.google.common.collect.x<androidx.media3.session.a> f12375l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f12376m;

        public c(Context context, p7.j0 j0Var, CallbackT callbackt) {
            this.f12364a = (Context) s7.a.f(context);
            this.f12365b = (p7.j0) s7.a.f(j0Var);
            s7.a.a(j0Var.R0());
            this.f12366c = "";
            this.f12367d = callbackt;
            this.f12369f = new Bundle();
            this.f12370g = new Bundle();
            this.f12373j = com.google.common.collect.x.r();
            this.f12374k = com.google.common.collect.x.r();
            this.f12372i = true;
            this.f12376m = true;
            this.f12375l = com.google.common.collect.x.r();
        }

        BuilderT a(CallbackT callbackt) {
            this.f12367d = (CallbackT) s7.a.f(callbackt);
            return this;
        }

        public BuilderT b(List<androidx.media3.session.a> list) {
            this.f12373j = com.google.common.collect.x.n(list);
            return this;
        }

        public BuilderT c(String str) {
            this.f12366c = (String) s7.a.f(str);
            return this;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final te f12377h = new te.b().c().e();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final te f12378i = new te.b().b().c().e();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final p7.j0.b f12379j = new p7.j0.b.a().d().f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f12380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final te f12381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p7.j0.b f12382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.google.common.collect.x<androidx.media3.session.a> f12383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.google.common.collect.x<androidx.media3.session.a> f12384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Bundle f12385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PendingIntent f12386g;

        public static class a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private com.google.common.collect.x<androidx.media3.session.a> f12389c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private com.google.common.collect.x<androidx.media3.session.a> f12390d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Bundle f12391e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private PendingIntent f12392f;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private p7.j0.b f12388b = e.f12379j;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private te f12387a = e.f12377h;

            public a(t7 t7Var) {
            }

            public e a() {
                return new e(true, this.f12387a, this.f12388b, this.f12389c, this.f12390d, this.f12391e, this.f12392f);
            }

            public a b(p7.j0.b bVar) {
                this.f12388b = (p7.j0.b) s7.a.f(bVar);
                return this;
            }

            public a c(te teVar) {
                this.f12387a = (te) s7.a.f(teVar);
                return this;
            }

            public a d(List<androidx.media3.session.a> list) {
                this.f12389c = list == null ? null : com.google.common.collect.x.n(list);
                return this;
            }

            public a e(List<androidx.media3.session.a> list) {
                this.f12390d = list == null ? null : com.google.common.collect.x.n(list);
                return this;
            }
        }

        public static e a(te teVar, p7.j0.b bVar) {
            return new e(true, teVar, bVar, null, null, null, null);
        }

        public static e b() {
            return new e(false, te.f12414b, p7.j0.b.f101382b, com.google.common.collect.x.r(), com.google.common.collect.x.r(), Bundle.EMPTY, null);
        }

        private e(boolean z11, te teVar, p7.j0.b bVar, com.google.common.collect.x<androidx.media3.session.a> xVar, com.google.common.collect.x<androidx.media3.session.a> xVar2, Bundle bundle, PendingIntent pendingIntent) {
            this.f12380a = z11;
            this.f12381b = teVar;
            this.f12382c = bVar;
            this.f12383d = xVar;
            this.f12384e = xVar2;
            this.f12385f = bundle;
            this.f12386g = pendingIntent;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ha.n.b f12393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f12395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f12396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final f f12397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Bundle f12398f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f12399g;

        g(ha.n.b bVar, int i11, int i12, boolean z11, f fVar, Bundle bundle, int i13) {
            this.f12393a = bVar;
            this.f12394b = i11;
            this.f12395c = i12;
            this.f12396d = z11;
            this.f12397e = fVar;
            this.f12398f = bundle;
            this.f12399g = i13;
        }

        static g a() {
            return new g(new ha.n.b("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY, 0);
        }

        public Bundle b() {
            return new Bundle(this.f12398f);
        }

        f c() {
            return this.f12397e;
        }

        public int d() {
            return this.f12394b;
        }

        public int e() {
            return this.f12395c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            g gVar = (g) obj;
            f fVar = this.f12397e;
            return (fVar == null && gVar.f12397e == null) ? this.f12393a.equals(gVar.f12393a) : Objects.equals(fVar, gVar.f12397e);
        }

        public String f() {
            return this.f12393a.a();
        }

        ha.n.b g() {
            return this.f12393a;
        }

        public boolean h() {
            return this.f12396d;
        }

        public int hashCode() {
            return Objects.hash(this.f12397e, this.f12393a);
        }

        public String toString() {
            return "ControllerInfo {pkg=" + this.f12393a.a() + ", uid=" + this.f12393a.c() + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public interface h {
        void a(t7 t7Var);

        boolean b(t7 t7Var);
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.common.collect.x<p7.y> f12400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f12402c;

        public i(List<p7.y> list, int i11, long j11) {
            this.f12400a = com.google.common.collect.x.n(list);
            this.f12401b = i11;
            this.f12402c = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f12400a.equals(iVar.f12400a) && this.f12401b == iVar.f12401b && this.f12402c == iVar.f12402c;
        }

        public int hashCode() {
            return (((this.f12400a.hashCode() * 31) + this.f12401b) * 31) + ru.h.c(this.f12402c);
        }
    }

    t7(Context context, String str, p7.j0 j0Var, PendingIntent pendingIntent, com.google.common.collect.x<androidx.media3.session.a> xVar, com.google.common.collect.x<androidx.media3.session.a> xVar2, com.google.common.collect.x<androidx.media3.session.a> xVar3, d dVar, Bundle bundle, Bundle bundle2, s7.h hVar, boolean z11, boolean z12, int i11) {
        synchronized (f12361b) {
            HashMap<String, t7> map = f12362c;
            if (map.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            map.put(str, this);
        }
        this.f12363a = b(context, str, j0Var, pendingIntent, xVar, xVar2, xVar3, dVar, bundle, bundle2, hVar, z11, z12, i11);
    }

    static t7 l(Uri uri) {
        synchronized (f12361b) {
            try {
                for (t7 t7Var : f12362c.values()) {
                    if (Objects.equals(t7Var.p(), uri)) {
                        return t7Var;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void a() {
        this.f12363a.M();
    }

    s8 b(Context context, String str, p7.j0 j0Var, PendingIntent pendingIntent, com.google.common.collect.x<androidx.media3.session.a> xVar, com.google.common.collect.x<androidx.media3.session.a> xVar2, com.google.common.collect.x<androidx.media3.session.a> xVar3, d dVar, Bundle bundle, Bundle bundle2, s7.h hVar, boolean z11, boolean z12, int i11) {
        return new s8(this, context, str, j0Var, pendingIntent, xVar, xVar2, xVar3, dVar, bundle, bundle2, hVar, z11, z12);
    }

    public final s7.h c() {
        return this.f12363a.Y();
    }

    public com.google.common.collect.x<androidx.media3.session.a> d() {
        return this.f12363a.b0();
    }

    public final String e() {
        return this.f12363a.c0();
    }

    s8 f() {
        return this.f12363a;
    }

    final IBinder g() {
        return this.f12363a.e0();
    }

    public com.google.common.collect.x<androidx.media3.session.a> h() {
        return this.f12363a.f0();
    }

    public g i() {
        return this.f12363a.g0();
    }

    public final MediaSession.Token j() {
        return this.f12363a.h0();
    }

    public final p7.j0 k() {
        return this.f12363a.k0().Z0();
    }

    public final PendingIntent m() {
        return this.f12363a.l0();
    }

    public final boolean n() {
        return this.f12363a.S0();
    }

    public final ve o() {
        return this.f12363a.n0();
    }

    final Uri p() {
        return this.f12363a.o0();
    }

    final void q(n nVar, g gVar) {
        this.f12363a.N(nVar, gVar);
    }

    final boolean r() {
        return this.f12363a.u0();
    }

    public final void s() {
        try {
            synchronized (f12361b) {
                f12362c.remove(this.f12363a.c0());
            }
            this.f12363a.M0();
        } catch (Exception unused) {
        }
    }

    final void t(h hVar) {
        this.f12363a.Q0(hVar);
    }

    interface f {
        default void A(int i11, long j11) {
        }

        default void E(int i11, float f11) {
        }

        default void F(int i11, boolean z11) {
        }

        default void a(int i11, int i12) {
        }

        default void c(int i11) {
        }

        default void d(int i11, PlaybackException playbackException) {
        }

        default void g(int i11, ue ueVar, boolean z11, boolean z12, int i12) {
        }

        default void i(int i11, boolean z11) {
        }

        default void j(int i11, boolean z11) {
        }

        default void l(int i11, se seVar, Bundle bundle) {
        }

        default void n(int i11, int i12, PlaybackException playbackException) {
        }

        default void p(int i11, int i12) {
        }

        default void r(int i11, oe oeVar, oe oeVar2) {
        }

        default void s(int i11, long j11) {
        }

        default void w(int i11) {
        }

        default void x(int i11, boolean z11, int i12) {
        }

        default void z(int i11, int i12, boolean z11) {
        }

        default void B(int i11, ga.g<?> gVar) {
        }

        default void C(int i11, p7.j0.b bVar) {
        }

        default void D(int i11, p7.d dVar) {
        }

        default void e(int i11, p7.i0 i0Var) {
        }

        default void f(int i11, p7.m mVar) {
        }

        default void h(int i11, p7.e1 e1Var) {
        }

        default void k(int i11, p7.w0 w0Var) {
        }

        default void o(int i11, ga.v vVar) {
        }

        default void t(int i11, p7.e0 e0Var) {
        }

        default void u(int i11, p7.a1 a1Var) {
        }

        default void y(int i11, p7.e0 e0Var) {
        }

        default void b(int i11, p7.y yVar, int i12) {
        }

        default void v(int i11, p7.r0 r0Var, int i12) {
        }

        default void q(int i11, p7.j0.e eVar, p7.j0.e eVar2, int i12) {
        }

        default void m(int i11, ne neVar, p7.j0.b bVar, boolean z11, boolean z12) {
        }
    }

    public interface d {
        default com.google.common.util.concurrent.s<ga.v> a(t7 t7Var, g gVar, p7.k0 k0Var) {
            return com.google.common.util.concurrent.m.d(new ga.v(-6));
        }

        default com.google.common.util.concurrent.s<ga.v> b(t7 t7Var, g gVar, se seVar, Bundle bundle) {
            return com.google.common.util.concurrent.m.d(new ga.v(-6));
        }

        default com.google.common.util.concurrent.s<List<p7.y>> c(t7 t7Var, g gVar, List<p7.y> list) {
            Iterator<p7.y> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f101682b == null) {
                    return com.google.common.util.concurrent.m.c(new UnsupportedOperationException());
                }
            }
            return com.google.common.util.concurrent.m.d(list);
        }

        default e d(t7 t7Var, g gVar) {
            return new e.a(t7Var).a();
        }

        default com.google.common.util.concurrent.s<i> e(t7 t7Var, g gVar, List<p7.y> list, final int i11, final long j11) {
            return s7.q0.M1(c(t7Var, gVar, list), new com.google.common.util.concurrent.f() { // from class: ga.k
                @Override // com.google.common.util.concurrent.f
                public final com.google.common.util.concurrent.s apply(Object obj) {
                    return com.google.common.util.concurrent.m.d(new t7.i((List) obj, i11, j11));
                }
            });
        }

        default com.google.common.util.concurrent.s<i> f(t7 t7Var, g gVar) {
            return com.google.common.util.concurrent.m.c(new UnsupportedOperationException());
        }

        default com.google.common.util.concurrent.s<ga.v> g(t7 t7Var, g gVar, String str, p7.k0 k0Var) {
            return com.google.common.util.concurrent.m.d(new ga.v(-6));
        }

        default void i(t7 t7Var, g gVar) {
        }

        default void j(t7 t7Var, g gVar) {
        }

        default boolean k(t7 t7Var, g gVar, Intent intent) {
            return false;
        }

        @Deprecated
        default int m(t7 t7Var, g gVar, int i11) {
            return 0;
        }

        default void h(t7 t7Var, g gVar, p7.j0.b bVar) {
        }
    }
}

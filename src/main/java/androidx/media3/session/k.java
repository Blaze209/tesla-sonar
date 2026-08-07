package androidx.media3.session;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f11828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f11829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final te f11830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p7.j0.b f11831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p7.j0.b f11832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f11833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f11834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ne f11835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.common.collect.x<androidx.media3.session.a> f11836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.google.common.collect.x<androidx.media3.session.a> f11837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MediaSession.Token f11838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.google.common.collect.x<androidx.media3.session.a> f11839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f11814o = s7.q0.N0(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f11815p = s7.q0.N0(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f11816q = s7.q0.N0(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f11817r = s7.q0.N0(9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f11818s = s7.q0.N0(14);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f11819t = s7.q0.N0(13);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f11820u = s7.q0.N0(3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f11821v = s7.q0.N0(4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f11822w = s7.q0.N0(5);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f11823x = s7.q0.N0(6);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f11824y = s7.q0.N0(11);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f11825z = s7.q0.N0(7);
    private static final String A = s7.q0.N0(8);
    private static final String B = s7.q0.N0(10);
    private static final String C = s7.q0.N0(12);

    private final class b extends Binder {
        private b() {
        }

        public k a() {
            return k.this;
        }
    }

    public k(int i11, int i12, o oVar, PendingIntent pendingIntent, com.google.common.collect.x<androidx.media3.session.a> xVar, com.google.common.collect.x<androidx.media3.session.a> xVar2, com.google.common.collect.x<androidx.media3.session.a> xVar3, te teVar, p7.j0.b bVar, p7.j0.b bVar2, Bundle bundle, Bundle bundle2, ne neVar, MediaSession.Token token) {
        this.f11826a = i11;
        this.f11827b = i12;
        this.f11828c = oVar;
        this.f11829d = pendingIntent;
        this.f11836k = xVar;
        this.f11837l = xVar2;
        this.f11839n = xVar3;
        this.f11830e = teVar;
        this.f11831f = bVar;
        this.f11832g = bVar2;
        this.f11833h = bundle;
        this.f11834i = bundle2;
        this.f11835j = neVar;
        this.f11838m = token;
    }

    public static k d(Bundle bundle) {
        IBinder binder = bundle.getBinder(B);
        if (binder instanceof b) {
            return ((b) binder).a();
        }
        int i11 = bundle.getInt(f11814o, 0);
        final int i12 = bundle.getInt(A, 0);
        IBinder iBinder = (IBinder) s7.a.f(androidx.core.app.h.a(bundle, f11815p));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f11816q);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f11817r);
        com.google.common.collect.x xVarD = parcelableArrayList != null ? s7.i.d(new ou.h() { // from class: androidx.media3.session.h
            @Override // ou.h
            public final Object apply(Object obj) {
                return a.e((Bundle) obj, i12);
            }
        }, parcelableArrayList) : com.google.common.collect.x.r();
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f11818s);
        com.google.common.collect.x xVarD2 = parcelableArrayList2 != null ? s7.i.d(new ou.h() { // from class: androidx.media3.session.i
            @Override // ou.h
            public final Object apply(Object obj) {
                return a.e((Bundle) obj, i12);
            }
        }, parcelableArrayList2) : com.google.common.collect.x.r();
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(f11819t);
        com.google.common.collect.x xVarD3 = parcelableArrayList3 != null ? s7.i.d(new ou.h() { // from class: androidx.media3.session.j
            @Override // ou.h
            public final Object apply(Object obj) {
                return a.e((Bundle) obj, i12);
            }
        }, parcelableArrayList3) : com.google.common.collect.x.r();
        Bundle bundle2 = bundle.getBundle(f11820u);
        te teVarE = bundle2 == null ? te.f12414b : te.e(bundle2);
        Bundle bundle3 = bundle.getBundle(f11822w);
        p7.j0.b bVarE = bundle3 == null ? p7.j0.b.f101382b : p7.j0.b.e(bundle3);
        Bundle bundle4 = bundle.getBundle(f11821v);
        p7.j0.b bVarE2 = bundle4 == null ? p7.j0.b.f101382b : p7.j0.b.e(bundle4);
        Bundle bundle5 = bundle.getBundle(f11823x);
        Bundle bundle6 = bundle.getBundle(f11824y);
        Bundle bundle7 = bundle.getBundle(f11825z);
        ne neVarB = bundle7 == null ? ne.F : ne.B(bundle7, i12);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(C);
        Bundle bundle8 = bundle6;
        o oVarR2 = o.a.R2(iBinder);
        if (bundle5 == null) {
            bundle5 = Bundle.EMPTY;
        }
        Bundle bundle9 = bundle5;
        if (bundle8 == null) {
            bundle8 = Bundle.EMPTY;
        }
        return new k(i11, i12, oVarR2, pendingIntent, xVarD, xVarD2, xVarD3, teVarE, bVarE2, bVarE, bundle9, bundle8, neVarB, token);
    }

    public Bundle e(int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt(f11814o, this.f11826a);
        androidx.core.app.h.b(bundle, f11815p, this.f11828c.asBinder());
        bundle.putParcelable(f11816q, this.f11829d);
        if (!this.f11836k.isEmpty()) {
            bundle.putParcelableArrayList(f11817r, s7.i.h(this.f11836k, new ou.h() { // from class: ga.b
                @Override // ou.h
                public final Object apply(Object obj) {
                    return ((androidx.media3.session.a) obj).k();
                }
            }));
        }
        if (!this.f11837l.isEmpty()) {
            if (i11 >= 7) {
                bundle.putParcelableArrayList(f11818s, s7.i.h(this.f11837l, new ou.h() { // from class: ga.b
                    @Override // ou.h
                    public final Object apply(Object obj) {
                        return ((androidx.media3.session.a) obj).k();
                    }
                }));
            } else {
                bundle.putParcelableArrayList(f11817r, s7.i.h(androidx.media3.session.a.f(this.f11837l, true, true), new ou.h() { // from class: ga.b
                    @Override // ou.h
                    public final Object apply(Object obj) {
                        return ((androidx.media3.session.a) obj).k();
                    }
                }));
            }
        }
        if (!this.f11839n.isEmpty()) {
            bundle.putParcelableArrayList(f11819t, s7.i.h(this.f11839n, new ou.h() { // from class: ga.b
                @Override // ou.h
                public final Object apply(Object obj) {
                    return ((androidx.media3.session.a) obj).k();
                }
            }));
        }
        bundle.putBundle(f11820u, this.f11830e.f());
        bundle.putBundle(f11821v, this.f11831f.h());
        bundle.putBundle(f11822w, this.f11832g.h());
        bundle.putBundle(f11823x, this.f11833h);
        bundle.putBundle(f11824y, this.f11834i);
        bundle.putBundle(f11825z, this.f11835j.A(me.f(this.f11831f, this.f11832g), false, false).E(i11));
        bundle.putInt(A, this.f11827b);
        MediaSession.Token token = this.f11838m;
        if (token != null) {
            bundle.putParcelable(C, token);
        }
        return bundle;
    }

    public Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putBinder(B, new b());
        return bundle;
    }
}

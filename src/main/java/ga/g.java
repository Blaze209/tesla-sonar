package ga;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import androidx.media3.session.q6;
import com.google.common.collect.x;
import java.util.Iterator;
import java.util.List;
import p7.y;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class g<V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f67677g = q0.N0(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f67678h = q0.N0(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f67679i = q0.N0(2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f67680j = q0.N0(3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f67681k = q0.N0(4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f67682l = q0.N0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f67685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f67686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q6 f67687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f67688f;

    private g(int i11, long j11, q6 q6Var, u uVar, V v11, int i12) {
        this.f67683a = i11;
        this.f67684b = j11;
        this.f67687e = q6Var;
        this.f67688f = uVar;
        this.f67685c = v11;
        this.f67686d = i12;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    private static g<?> a(Bundle bundle, Integer num) {
        u uVar;
        u uVar2;
        int i11;
        Bundle bundle2;
        IBinder iBinderA;
        int i12 = bundle.getInt(f67677g, 0);
        long j11 = bundle.getLong(f67678h, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(f67679i);
        Object objB = null;
        q6 q6VarA = bundle3 == null ? null : q6.a(bundle3);
        Bundle bundle4 = bundle.getBundle(f67682l);
        if (bundle4 == null) {
            if (i12 != 0) {
                uVar2 = new u(i12, "no error message provided");
            } else {
                uVar = null;
            }
            i11 = bundle.getInt(f67681k);
            if (i11 != 1) {
                if (i11 != 2) {
                    s7.a.h(num != null || num.intValue() == 2);
                    bundle2 = bundle.getBundle(f67680j);
                    if (bundle2 != null) {
                        objB = y.b(bundle2);
                    }
                } else if (i11 != 3) {
                    s7.a.h(num != null || num.intValue() == 3);
                    iBinderA = androidx.core.app.h.a(bundle, f67680j);
                    if (iBinderA != null) {
                        objB = s7.i.d(new e(), p7.g.a(iBinderA));
                    }
                } else if (i11 != 4) {
                    throw new IllegalStateException();
                }
            }
            return new g<>(i12, j11, q6VarA, uVar, objB, i11);
        }
        uVar2 = u.a(bundle4);
        uVar = uVar2;
        i11 = bundle.getInt(f67681k);
        if (i11 != 1) {
            if (i11 != 2) {
                s7.a.h(num != null || num.intValue() == 2);
                bundle2 = bundle.getBundle(f67680j);
                if (bundle2 != null) {
                    objB = y.b(bundle2);
                }
            } else if (i11 != 3) {
                s7.a.h(num != null || num.intValue() == 3);
                iBinderA = androidx.core.app.h.a(bundle, f67680j);
                if (iBinderA != null) {
                    objB = s7.i.d(new e(), p7.g.a(iBinderA));
                }
            } else if (i11 != 4) {
                throw new IllegalStateException();
            }
        }
        return new g<>(i12, j11, q6VarA, uVar, objB, i11);
    }

    public static g<?> b(Bundle bundle) {
        return a(bundle, null);
    }

    @SuppressLint({"WrongConstant"})
    public static <V> g<V> c(int i11) {
        return d(new u(i11, "no error message provided", Bundle.EMPTY));
    }

    @SuppressLint({"WrongConstant"})
    public static <V> g<V> d(u uVar) {
        return new g<>(uVar.f67777a, SystemClock.elapsedRealtime(), null, uVar, null, 4);
    }

    public static g<y> e(y yVar, q6 q6Var) {
        h(yVar);
        return new g<>(0, SystemClock.elapsedRealtime(), q6Var, null, yVar, 2);
    }

    public static g<x<y>> f(List<y> list, q6 q6Var) {
        Iterator<y> it = list.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
        return new g<>(0, SystemClock.elapsedRealtime(), q6Var, null, x.n(list), 3);
    }

    private static void h(y yVar) {
        s7.a.e(yVar.f101681a, "mediaId must not be empty");
        s7.a.b(yVar.f101685e.f101292q != null, "mediaMetadata must specify isBrowsable");
        s7.a.b(yVar.f101685e.f101293r != null, "mediaMetadata must specify isPlayable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r2 != 4) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle g() {
        /*
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = ga.g.f67677g
            int r2 = r5.f67683a
            r0.putInt(r1, r2)
            java.lang.String r1 = ga.g.f67678h
            long r2 = r5.f67684b
            r0.putLong(r1, r2)
            androidx.media3.session.q6 r1 = r5.f67687e
            if (r1 == 0) goto L20
            java.lang.String r2 = ga.g.f67679i
            android.os.Bundle r1 = r1.b()
            r0.putBundle(r2, r1)
        L20:
            ga.u r1 = r5.f67688f
            if (r1 == 0) goto L2d
            java.lang.String r2 = ga.g.f67682l
            android.os.Bundle r1 = r1.b()
            r0.putBundle(r2, r1)
        L2d:
            java.lang.String r1 = ga.g.f67681k
            int r2 = r5.f67686d
            r0.putInt(r1, r2)
            V r1 = r5.f67685c
            if (r1 != 0) goto L39
            goto L47
        L39:
            int r2 = r5.f67686d
            r3 = 1
            if (r2 == r3) goto L6c
            r3 = 2
            if (r2 == r3) goto L60
            r1 = 3
            if (r2 == r1) goto L48
            r1 = 4
            if (r2 == r1) goto L6c
        L47:
            return r0
        L48:
            java.lang.String r1 = ga.g.f67680j
            p7.g r2 = new p7.g
            V r3 = r5.f67685c
            com.google.common.collect.x r3 = (com.google.common.collect.x) r3
            ga.f r4 = new ga.f
            r4.<init>()
            com.google.common.collect.x r3 = s7.i.i(r3, r4)
            r2.<init>(r3)
            androidx.core.app.h.b(r0, r1, r2)
            return r0
        L60:
            java.lang.String r2 = ga.g.f67680j
            p7.y r1 = (p7.y) r1
            android.os.Bundle r1 = r1.e()
            r0.putBundle(r2, r1)
            return r0
        L6c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.g.g():android.os.Bundle");
    }
}

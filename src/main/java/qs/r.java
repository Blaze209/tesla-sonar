package qs;

import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.u0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface r extends u {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final es.u f106071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f106072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f106073c;

        public a(es.u uVar, int... iArr) {
            this(uVar, iArr, 0);
        }

        public a(es.u uVar, int[] iArr, int i11) {
            if (iArr.length == 0) {
                ts.u.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f106071a = uVar;
            this.f106072b = iArr;
            this.f106073c = i11;
        }
    }

    public interface b {
        r[] a(a[] aVarArr, ss.d dVar, com.google.android.exoplayer2.source.o.b bVar, f2 f2Var);
    }

    int a();

    void disable();

    void enable();

    u0 f();

    void i(float f11);

    default void c() {
    }

    default void g() {
    }

    default void j(boolean z11) {
    }
}

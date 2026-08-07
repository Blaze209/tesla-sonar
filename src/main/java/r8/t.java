package r8;

import java.util.List;
import p7.r0;
import p7.t0;

/* JADX INFO: loaded from: classes3.dex */
public interface t extends x {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t0 f107269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f107270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f107271c;

        public a(t0 t0Var, int... iArr) {
            this(t0Var, iArr, 0);
        }

        public a(t0 t0Var, int[] iArr, int i11) {
            if (iArr.length == 0) {
                s7.t.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f107269a = t0Var;
            this.f107270b = iArr;
            this.f107271c = i11;
        }
    }

    public interface b {
        t[] a(a[] aVarArr, s8.d dVar, androidx.media3.exoplayer.source.r.b bVar, r0 r0Var);
    }

    int a();

    void disable();

    void enable();

    p7.u f();

    void i(float f11);

    default long k() {
        return -2147483647L;
    }

    boolean l(int i11, long j11);

    void m(long j11, long j12, long j13, List<? extends p8.m> list, p8.n[] nVarArr);

    boolean n(int i11, long j11);

    int o(long j11, List<? extends p8.m> list);

    int p();

    default boolean q(long j11, p8.e eVar, List<? extends p8.m> list) {
        return false;
    }

    Object r();

    int t();

    default void c() {
    }

    default void g() {
    }

    default void j(boolean z11) {
    }
}

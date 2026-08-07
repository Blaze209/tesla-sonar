package w8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public interface o0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f121386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f121387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f121388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f121389d;

        public a(int i11, byte[] bArr, int i12, int i13) {
            this.f121386a = i11;
            this.f121387b = bArr;
            this.f121388c = i12;
            this.f121389d = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f121386a == aVar.f121386a && this.f121388c == aVar.f121388c && this.f121389d == aVar.f121389d && Arrays.equals(this.f121387b, aVar.f121387b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f121386a * 31) + Arrays.hashCode(this.f121387b)) * 31) + this.f121388c) * 31) + this.f121389d;
        }
    }

    void a(s7.c0 c0Var, int i11, int i12);

    void b(long j11, int i11, int i12, int i13, a aVar);

    int c(p7.j jVar, int i11, boolean z11, int i12);

    default int e(p7.j jVar, int i11, boolean z11) {
        return c(jVar, i11, z11, 0);
    }

    default void f(s7.c0 c0Var, int i11) {
        a(c0Var, i11, 0);
    }

    void g(p7.u uVar);

    default void d(long j11) {
    }
}

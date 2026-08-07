package hr;

import com.google.android.exoplayer2.u0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface b0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f73304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f73306d;

        public a(int i11, byte[] bArr, int i12, int i13) {
            this.f73303a = i11;
            this.f73304b = bArr;
            this.f73305c = i12;
            this.f73306d = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f73303a == aVar.f73303a && this.f73305c == aVar.f73305c && this.f73306d == aVar.f73306d && Arrays.equals(this.f73304b, aVar.f73304b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f73303a * 31) + Arrays.hashCode(this.f73304b)) * 31) + this.f73305c) * 31) + this.f73306d;
        }
    }

    default int a(ss.g gVar, int i11, boolean z11) {
        return c(gVar, i11, z11, 0);
    }

    void b(u0 u0Var);

    int c(ss.g gVar, int i11, boolean z11, int i12);

    default void d(ts.d0 d0Var, int i11) {
        f(d0Var, i11, 0);
    }

    void e(long j11, int i11, int i12, int i13, a aVar);

    void f(ts.d0 d0Var, int i11, int i12);
}

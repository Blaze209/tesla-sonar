package p7;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a[] f101337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f101338b;

    public f0(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public f0 a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new f0(this.f101338b, (a[]) s7.q0.g1(this.f101337a, aVarArr));
    }

    public f0 b(f0 f0Var) {
        return f0Var == null ? this : a(f0Var.f101337a);
    }

    public f0 c(long j11) {
        return this.f101338b == j11 ? this : new f0(j11, this.f101337a);
    }

    public a d(int i11) {
        return this.f101337a[i11];
    }

    public int e() {
        return this.f101337a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class == obj.getClass()) {
            f0 f0Var = (f0) obj;
            if (Arrays.equals(this.f101337a, f0Var.f101337a) && this.f101338b == f0Var.f101338b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f101337a) * 31) + ru.h.c(this.f101338b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f101337a));
        if (this.f101338b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f101338b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public f0(long j11, a... aVarArr) {
        this.f101338b = j11;
        this.f101337a = aVarArr;
    }

    public f0(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    public f0(long j11, List<? extends a> list) {
        this(j11, (a[]) list.toArray(new a[0]));
    }

    public interface a {
        default byte[] C() {
            return null;
        }

        default u H() {
            return null;
        }

        default void I(e0.b bVar) {
        }
    }
}

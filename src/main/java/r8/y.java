package r8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x[] f107284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107285c;

    public y(x... xVarArr) {
        this.f107284b = xVarArr;
        this.f107283a = xVarArr.length;
    }

    public x a(int i11) {
        return this.f107284b[i11];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f107284b, ((y) obj).f107284b);
    }

    public int hashCode() {
        if (this.f107285c == 0) {
            this.f107285c = 527 + Arrays.hashCode(this.f107284b);
        }
        return this.f107285c;
    }
}

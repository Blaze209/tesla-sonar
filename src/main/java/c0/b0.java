package c0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final b0 f18254c = new b0(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final b0 f18255d = new b0(1, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final b0 f18256e = new b0(2, 10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public static final b0 f18257f = new b0(3, 10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public static final b0 f18258g = new b0(4, 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public static final b0 f18259h = new b0(5, 10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public static final b0 f18260i = new b0(6, 10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public static final b0 f18261j = new b0(6, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18263b;

    public b0(int i11, int i12) {
        this.f18262a = i11;
        this.f18263b = i12;
    }

    @NonNull
    private static String c(int i11) {
        switch (i11) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public int a() {
        return this.f18263b;
    }

    public int b() {
        return this.f18262a;
    }

    public boolean d() {
        return e() && b() != 1 && a() == 10;
    }

    public boolean e() {
        return (b() == 0 || b() == 2 || a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f18262a == b0Var.b() && this.f18263b == b0Var.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f18262a ^ 1000003) * 1000003) ^ this.f18263b;
    }

    @NonNull
    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f18262a) + ", bitDepth=" + this.f18263b + "}";
    }
}

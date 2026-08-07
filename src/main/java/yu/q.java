package yu;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0<?> f125868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f125869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f125870c;

    private q(Class<?> cls, int i11, int i12) {
        this((a0<?>) a0.b(cls), i11, i12);
    }

    public static q a(Class<?> cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int i11) {
        if (i11 == 0) {
            return DevicePublicKeyStringDef.DIRECT;
        }
        if (i11 == 1) {
            return "provider";
        }
        if (i11 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i11);
    }

    @Deprecated
    public static q h(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q i(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q j(a0<?> a0Var) {
        return new q(a0Var, 0, 1);
    }

    public static q k(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q l(a0<?> a0Var) {
        return new q(a0Var, 1, 0);
    }

    public static q m(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q n(a0<?> a0Var) {
        return new q(a0Var, 1, 1);
    }

    public static q o(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public a0<?> c() {
        return this.f125868a;
    }

    public boolean d() {
        return this.f125870c == 2;
    }

    public boolean e() {
        return this.f125870c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f125868a.equals(qVar.f125868a) && this.f125869b == qVar.f125869b && this.f125870c == qVar.f125870c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f125869b == 1;
    }

    public boolean g() {
        return this.f125869b == 2;
    }

    public int hashCode() {
        return ((((this.f125868a.hashCode() ^ 1000003) * 1000003) ^ this.f125869b) * 1000003) ^ this.f125870c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f125868a);
        sb2.append(", type=");
        int i11 = this.f125869b;
        if (i11 == 1) {
            str = "required";
        } else {
            str = i11 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(b(this.f125870c));
        sb2.append("}");
        return sb2.toString();
    }

    private q(a0<?> a0Var, int i11, int i12) {
        this.f125868a = (a0) z.c(a0Var, "Null dependency anInterface.");
        this.f125869b = i11;
        this.f125870c = i12;
    }
}

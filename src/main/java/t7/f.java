package t7;

import p7.f0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f112705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f112706b;

    public f(float f11, float f12) {
        s7.a.b(f11 >= -90.0f && f11 <= 90.0f && f12 >= -180.0f && f12 <= 180.0f, "Invalid latitude or longitude");
        this.f112705a = f11;
        this.f112706b = f12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f112705a == fVar.f112705a && this.f112706b == fVar.f112706b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + ru.c.a(this.f112705a)) * 31) + ru.c.a(this.f112706b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f112705a + ", longitude=" + this.f112706b;
    }
}

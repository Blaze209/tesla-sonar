package k5;

import android.graphics.Insets;
import android.graphics.Rect;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f84923e = new e(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84927d;

    static class a {
        static Insets a(int i11, int i12, int i13, int i14) {
            return Insets.of(i11, i12, i13, i14);
        }
    }

    private e(int i11, int i12, int i13, int i14) {
        this.f84924a = i11;
        this.f84925b = i12;
        this.f84926c = i13;
        this.f84927d = i14;
    }

    public static e a(e eVar, e eVar2) {
        return c(eVar.f84924a + eVar2.f84924a, eVar.f84925b + eVar2.f84925b, eVar.f84926c + eVar2.f84926c, eVar.f84927d + eVar2.f84927d);
    }

    public static e b(e eVar, e eVar2) {
        return c(Math.max(eVar.f84924a, eVar2.f84924a), Math.max(eVar.f84925b, eVar2.f84925b), Math.max(eVar.f84926c, eVar2.f84926c), Math.max(eVar.f84927d, eVar2.f84927d));
    }

    public static e c(int i11, int i12, int i13, int i14) {
        return (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) ? f84923e : new e(i11, i12, i13, i14);
    }

    public static e d(Rect rect) {
        return c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static e e(e eVar, e eVar2) {
        return c(eVar.f84924a - eVar2.f84924a, eVar.f84925b - eVar2.f84925b, eVar.f84926c - eVar2.f84926c, eVar.f84927d - eVar2.f84927d);
    }

    public static e f(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f84927d == eVar.f84927d && this.f84924a == eVar.f84924a && this.f84926c == eVar.f84926c && this.f84925b == eVar.f84925b;
    }

    public Insets g() {
        return a.a(this.f84924a, this.f84925b, this.f84926c, this.f84927d);
    }

    public int hashCode() {
        return (((((this.f84924a * 31) + this.f84925b) * 31) + this.f84926c) * 31) + this.f84927d;
    }

    public String toString() {
        return "Insets{left=" + this.f84924a + ", top=" + this.f84925b + ", right=" + this.f84926c + ", bottom=" + this.f84927d + CoreConstants.CURLY_RIGHT;
    }
}

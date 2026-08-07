package ru;

import java.io.Serializable;
import java.util.Arrays;
import okhttp3.HttpUrl;
import ou.p;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e f109210d = new e(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f109211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f109212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f109213c;

    private e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static e b(int[] iArr) {
        return iArr.length == 0 ? f109210d : new e(Arrays.copyOf(iArr, iArr.length));
    }

    public static e g() {
        return f109210d;
    }

    public static e h(int i11) {
        return new e(new int[]{i11});
    }

    public static e i(int i11, int i12) {
        return new e(new int[]{i11, i12});
    }

    public static e j(int i11, int i12, int i13) {
        return new e(new int[]{i11, i12, i13});
    }

    public boolean a(int i11) {
        return d(i11) >= 0;
    }

    public int c(int i11) {
        p.k(i11, f());
        return this.f109211a[this.f109212b + i11];
    }

    public int d(int i11) {
        for (int i12 = this.f109212b; i12 < this.f109213c; i12++) {
            if (this.f109211a[i12] == i11) {
                return i12 - this.f109212b;
            }
        }
        return -1;
    }

    public boolean e() {
        return this.f109213c == this.f109212b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (f() != eVar.f()) {
            return false;
        }
        for (int i11 = 0; i11 < f(); i11++) {
            if (c(i11) != eVar.c(i11)) {
                return false;
            }
        }
        return true;
    }

    public int f() {
        return this.f109213c - this.f109212b;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i11 = this.f109212b; i11 < this.f109213c; i11++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f109211a[i11]);
        }
        return iHashCode;
    }

    public int[] k() {
        return Arrays.copyOfRange(this.f109211a, this.f109212b, this.f109213c);
    }

    public String toString() {
        if (e()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(f() * 5);
        sb2.append('[');
        sb2.append(this.f109211a[this.f109212b]);
        int i11 = this.f109212b;
        while (true) {
            i11++;
            if (i11 >= this.f109213c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f109211a[i11]);
        }
    }

    private e(int[] iArr, int i11, int i12) {
        this.f109211a = iArr;
        this.f109212b = i11;
        this.f109213c = i12;
    }
}

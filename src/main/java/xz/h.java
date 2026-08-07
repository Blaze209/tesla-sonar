package xz;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f124162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f124163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f124164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object[] f124165d;

    public h(String str, String str2, p pVar, Object... objArr) {
        this.f124162a = str;
        this.f124163b = str2;
        this.f124164c = pVar;
        this.f124165d = objArr;
    }

    public p a() {
        return this.f124164c;
    }

    Object[] b() {
        return this.f124165d;
    }

    public String c() {
        return this.f124163b;
    }

    public String d() {
        return this.f124162a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f124162a.equals(hVar.f124162a) && this.f124163b.equals(hVar.f124163b) && this.f124164c.equals(hVar.f124164c) && Arrays.equals(this.f124165d, hVar.f124165d);
    }

    public int hashCode() {
        return ((this.f124162a.hashCode() ^ Integer.rotateLeft(this.f124163b.hashCode(), 8)) ^ Integer.rotateLeft(this.f124164c.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f124165d), 24);
    }

    public String toString() {
        return this.f124162a + " : " + this.f124163b + ' ' + this.f124164c + ' ' + Arrays.toString(this.f124165d);
    }
}

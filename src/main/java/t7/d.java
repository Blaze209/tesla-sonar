package t7;

import p7.f0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112699a;

    public d(int i11) {
        this.f112699a = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f112699a == ((d) obj).f112699a;
    }

    public int hashCode() {
        return this.f112699a;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.f112699a;
    }
}

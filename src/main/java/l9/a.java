package l9;

import p7.f0;
import ru.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f89712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f89713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f89714e;

    public a(long j11, long j12, long j13, long j14, long j15) {
        this.f89710a = j11;
        this.f89711b = j12;
        this.f89712c = j13;
        this.f89713d = j14;
        this.f89714e = j15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f89710a == aVar.f89710a && this.f89711b == aVar.f89711b && this.f89712c == aVar.f89712c && this.f89713d == aVar.f89713d && this.f89714e == aVar.f89714e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + h.c(this.f89710a)) * 31) + h.c(this.f89711b)) * 31) + h.c(this.f89712c)) * 31) + h.c(this.f89713d)) * 31) + h.c(this.f89714e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f89710a + ", photoSize=" + this.f89711b + ", photoPresentationTimestampUs=" + this.f89712c + ", videoStartPosition=" + this.f89713d + ", videoSize=" + this.f89714e;
    }
}

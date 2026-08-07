package gu;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f69553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f69554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f69555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f69556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final PendingIntent f69557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f69558i;

    c(int i11, int i12, int i13, long j11, long j12, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f69550a = i11;
        this.f69551b = i12;
        this.f69552c = i13;
        this.f69553d = j11;
        this.f69554e = j12;
        this.f69555f = list;
        this.f69556g = list2;
        this.f69557h = pendingIntent;
        this.f69558i = list3;
    }

    @Override // gu.a
    public final long a() {
        return this.f69553d;
    }

    @Override // gu.a
    public final int b() {
        return this.f69552c;
    }

    @Override // gu.a
    @Deprecated
    public final PendingIntent c() {
        return this.f69557h;
    }

    @Override // gu.a
    public final int d() {
        return this.f69550a;
    }

    @Override // gu.a
    public final int e() {
        return this.f69551b;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f69550a == aVar.d() && this.f69551b == aVar.e() && this.f69552c == aVar.b() && this.f69553d == aVar.a() && this.f69554e == aVar.f() && ((list = this.f69555f) != null ? list.equals(aVar.h()) : aVar.h() == null) && ((list2 = this.f69556g) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((pendingIntent = this.f69557h) != null ? pendingIntent.equals(aVar.c()) : aVar.c() == null) && ((list3 = this.f69558i) != null ? list3.equals(aVar.i()) : aVar.i() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // gu.a
    public final long f() {
        return this.f69554e;
    }

    @Override // gu.a
    final List g() {
        return this.f69556g;
    }

    @Override // gu.a
    final List h() {
        return this.f69555f;
    }

    public final int hashCode() {
        int i11 = ((((this.f69550a ^ 1000003) * 1000003) ^ this.f69551b) * 1000003) ^ this.f69552c;
        long j11 = this.f69553d;
        long j12 = j11 ^ (j11 >>> 32);
        long j13 = this.f69554e;
        long j14 = (j13 >>> 32) ^ j13;
        List list = this.f69555f;
        int iHashCode = ((((((i11 * 1000003) ^ ((int) j12)) * 1000003) ^ ((int) j14)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f69556g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f69557h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.f69558i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // gu.a
    final List i() {
        return this.f69558i;
    }

    public final String toString() {
        return "SplitInstallSessionState{sessionId=" + this.f69550a + ", status=" + this.f69551b + ", errorCode=" + this.f69552c + ", bytesDownloaded=" + this.f69553d + ", totalBytesToDownload=" + this.f69554e + ", moduleNamesNullable=" + String.valueOf(this.f69555f) + ", languagesNullable=" + String.valueOf(this.f69556g) + ", resolutionIntent=" + String.valueOf(this.f69557h) + ", splitFileIntents=" + String.valueOf(this.f69558i) + "}";
    }
}

package p8;

import p7.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f101924j;

    public m(androidx.media3.datasource.a aVar, v7.j jVar, u uVar, int i11, Object obj, long j11, long j12, long j13) {
        super(aVar, jVar, 1, uVar, i11, obj, j11, j12);
        s7.a.f(uVar);
        this.f101924j = j13;
    }

    public long g() {
        long j11 = this.f101924j;
        if (j11 != -1) {
            return j11 + 1;
        }
        return -1L;
    }

    public abstract boolean h();
}

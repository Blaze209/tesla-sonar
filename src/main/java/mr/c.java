package mr;

import hr.l;
import hr.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class c extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f92494b;

    public c(l lVar, long j11) {
        super(lVar);
        ts.a.a(lVar.getPosition() >= j11);
        this.f92494b = j11;
    }

    @Override // hr.u, hr.l
    public long getLength() {
        return super.getLength() - this.f92494b;
    }

    @Override // hr.u, hr.l
    public long getPosition() {
        return super.getPosition() - this.f92494b;
    }

    @Override // hr.u, hr.l
    public long h() {
        return super.h() - this.f92494b;
    }
}

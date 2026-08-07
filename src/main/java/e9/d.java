package e9;

import w8.q;
import w8.z;

/* JADX INFO: loaded from: classes3.dex */
final class d extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f62277b;

    public d(q qVar, long j11) {
        super(qVar);
        s7.a.a(qVar.getPosition() >= j11);
        this.f62277b = j11;
    }

    @Override // w8.z, w8.q
    public long getLength() {
        return super.getLength() - this.f62277b;
    }

    @Override // w8.z, w8.q
    public long getPosition() {
        return super.getPosition() - this.f62277b;
    }

    @Override // w8.z, w8.q
    public long h() {
        return super.h() - this.f62277b;
    }
}

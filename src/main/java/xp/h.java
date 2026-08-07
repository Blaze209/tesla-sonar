package xp;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class h extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i f123933j;

    public h(boolean z11, i iVar) {
        this.f123918a = z11;
        this.f123933j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z11 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f123919b = iVar.B(byteBufferAllocate, 16L);
        this.f123920c = iVar.C(byteBufferAllocate, 32L);
        this.f123921d = iVar.C(byteBufferAllocate, 40L);
        this.f123922e = iVar.B(byteBufferAllocate, 54L);
        this.f123923f = iVar.B(byteBufferAllocate, 56L);
        this.f123924g = iVar.B(byteBufferAllocate, 58L);
        this.f123925h = iVar.B(byteBufferAllocate, 60L);
        this.f123926i = iVar.B(byteBufferAllocate, 62L);
    }

    @Override // xp.d
    public c a(long j11, int i11) {
        return new b(this.f123933j, this, j11, i11);
    }

    @Override // xp.d
    public e b(long j11) {
        return new k(this.f123933j, this, j11);
    }

    @Override // xp.d
    public f c(int i11) {
        return new m(this.f123933j, this, i11);
    }
}

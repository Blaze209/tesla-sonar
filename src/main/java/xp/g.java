package xp;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class g extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i f123932j;

    public g(boolean z11, i iVar) {
        this.f123918a = z11;
        this.f123932j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z11 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f123919b = iVar.B(byteBufferAllocate, 16L);
        this.f123920c = iVar.I(byteBufferAllocate, 28L);
        this.f123921d = iVar.I(byteBufferAllocate, 32L);
        this.f123922e = iVar.B(byteBufferAllocate, 42L);
        this.f123923f = iVar.B(byteBufferAllocate, 44L);
        this.f123924g = iVar.B(byteBufferAllocate, 46L);
        this.f123925h = iVar.B(byteBufferAllocate, 48L);
        this.f123926i = iVar.B(byteBufferAllocate, 50L);
    }

    @Override // xp.d
    public c a(long j11, int i11) {
        return new a(this.f123932j, this, j11, i11);
    }

    @Override // xp.d
    public e b(long j11) {
        return new j(this.f123932j, this, j11);
    }

    @Override // xp.d
    public f c(int i11) {
        return new l(this.f123932j, this, i11);
    }
}

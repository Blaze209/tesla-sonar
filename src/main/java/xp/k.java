package xp;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class k extends e {
    public k(i iVar, d dVar, long j11) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f123918a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = dVar.f123920c + (j11 * ((long) dVar.f123922e));
        this.f123927a = iVar.I(byteBufferAllocate, j12);
        this.f123928b = iVar.C(byteBufferAllocate, 8 + j12);
        this.f123929c = iVar.C(byteBufferAllocate, 16 + j12);
        this.f123930d = iVar.C(byteBufferAllocate, j12 + 40);
    }
}

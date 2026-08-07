package xp;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class j extends e {
    public j(i iVar, d dVar, long j11) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(dVar.f123918a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = dVar.f123920c + (j11 * ((long) dVar.f123922e));
        this.f123927a = iVar.I(byteBufferAllocate, j12);
        this.f123928b = iVar.I(byteBufferAllocate, 4 + j12);
        this.f123929c = iVar.I(byteBufferAllocate, 8 + j12);
        this.f123930d = iVar.I(byteBufferAllocate, j12 + 20);
    }
}

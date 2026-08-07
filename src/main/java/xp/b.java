package xp;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class b extends c {
    public b(i iVar, d dVar, long j11, int i11) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f123918a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = j11 + ((long) (i11 * 16));
        this.f123916a = iVar.C(byteBufferAllocate, j12);
        this.f123917b = iVar.C(byteBufferAllocate, j12 + 8);
    }
}

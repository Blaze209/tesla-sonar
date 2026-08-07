package xp;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class a extends c {
    public a(i iVar, d dVar, long j11, int i11) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(dVar.f123918a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = j11 + ((long) (i11 * 8));
        this.f123916a = iVar.I(byteBufferAllocate, j12);
        this.f123917b = iVar.I(byteBufferAllocate, j12 + 4);
    }
}

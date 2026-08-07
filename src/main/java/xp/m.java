package xp;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class m extends f {
    public m(i iVar, d dVar, int i11) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f123918a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f123931a = iVar.I(byteBufferAllocate, dVar.f123921d + ((long) (i11 * dVar.f123924g)) + 44);
    }
}

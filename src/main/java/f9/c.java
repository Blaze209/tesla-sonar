package f9;

import java.nio.ByteBuffer;
import p7.f0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements a {
    @Override // f9.a
    public final f0 a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) s7.a.f(bVar.f9286d);
        s7.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    protected abstract f0 b(b bVar, ByteBuffer byteBuffer);
}

package ur;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class g implements b {
    @Override // ur.b
    public final a a(d dVar) {
        ByteBuffer byteBuffer = (ByteBuffer) ts.a.e(dVar.f39720c);
        ts.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.j()) {
            return null;
        }
        return b(dVar, byteBuffer);
    }

    protected abstract a b(d dVar, ByteBuffer byteBuffer);
}

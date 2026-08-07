package ll0;

import java.io.EOFException;
import java.nio.ByteBuffer;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0082\u0010¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lll0/k;", "Ljava/nio/ByteBuffer;", "dst", "", "b", "(Lll0/k;Ljava/nio/ByteBuffer;)I", "bb", "copied", "a", "(Lll0/k;Ljava/nio/ByteBuffer;I)I", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {
    private static final int a(k kVar, ByteBuffer byteBuffer, int i11) throws EOFException {
        ml0.a aVarU0;
        while (byteBuffer.hasRemaining() && (aVarU0 = kVar.U0(1)) != null) {
            int iRemaining = byteBuffer.remaining();
            int writePosition = aVarU0.getWritePosition() - aVarU0.getReadPosition();
            if (iRemaining < writePosition) {
                g.c(aVarU0, byteBuffer, iRemaining);
                kVar.s1(aVarU0.getReadPosition());
                return i11 + iRemaining;
            }
            g.c(aVarU0, byteBuffer, writePosition);
            kVar.r1(aVarU0);
            i11 += writePosition;
        }
        return i11;
    }

    public static final int b(k kVar, ByteBuffer dst) throws EOFException {
        p013kotlin.jvm.internal.s.k(kVar, "<this>");
        p013kotlin.jvm.internal.s.k(dst, "dst");
        int iA = a(kVar, dst, 0);
        if (!dst.hasRemaining()) {
            return iA;
        }
        throw new EOFException("Not enough data in packet to fill buffer: " + dst.remaining() + " more bytes required");
    }
}

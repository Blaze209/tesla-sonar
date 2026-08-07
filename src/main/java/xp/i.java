package xp;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes4.dex */
public class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f123934a = 1179403647;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileChannel f123935b;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f123935b = new FileInputStream(file).getChannel();
    }

    private long c(d dVar, long j11, long j12) {
        for (long j13 = 0; j13 < j11; j13++) {
            e eVarB = dVar.b(j13);
            if (eVarB.f123927a == 1) {
                long j14 = eVarB.f123929c;
                if (j14 <= j12 && j12 <= eVarB.f123930d + j14) {
                    return (j12 - j14) + eVarB.f123928b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    protected int B(ByteBuffer byteBuffer, long j11) throws IOException {
        p(byteBuffer, j11, 2);
        return byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
    }

    protected long C(ByteBuffer byteBuffer, long j11) throws IOException {
        p(byteBuffer, j11, 8);
        return byteBuffer.getLong();
    }

    protected String H(ByteBuffer byteBuffer, long j11) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j12 = 1 + j11;
            short sT = t(byteBuffer, j11);
            if (sT == 0) {
                return sb2.toString();
            }
            sb2.append((char) sT);
            j11 = j12;
        }
    }

    protected long I(ByteBuffer byteBuffer, long j11) throws IOException {
        p(byteBuffer, j11, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f123935b.close();
    }

    public d n() throws IOException {
        this.f123935b.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (I(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sT = t(byteBufferAllocate, 4L);
        boolean z11 = t(byteBufferAllocate, 5L) == 2;
        if (sT == 1) {
            return new g(z11, this);
        }
        if (sT == 2) {
            return new h(z11, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List<String> o() throws IOException {
        long j11;
        long j12;
        this.f123935b.position(0L);
        ArrayList arrayList = new ArrayList();
        d dVarN = n();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVarN.f123918a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j13 = dVarN.f123923f;
        int i11 = 0;
        if (j13 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j13 = dVarN.c(0).f123931a;
        }
        long j14 = 0;
        while (true) {
            j11 = 1;
            if (j14 >= j13) {
                j12 = 0;
                break;
            }
            e eVarB = dVarN.b(j14);
            if (eVarB.f123927a == 2) {
                j12 = eVarB.f123928b;
                break;
            }
            j14++;
        }
        if (j12 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j15 = 0;
        while (true) {
            c cVarA = dVarN.a(j12, i11);
            long j16 = j11;
            long j17 = cVarA.f123916a;
            if (j17 == j16) {
                arrayList2.add(Long.valueOf(cVarA.f123917b));
            } else if (j17 == 5) {
                j15 = cVarA.f123917b;
            }
            i11++;
            if (cVarA.f123916a == 0) {
                break;
            }
            j11 = j16;
            j13 = j13;
        }
        if (j15 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jC = c(dVarN, j13, j15);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(H(byteBufferAllocate, ((Long) it.next()).longValue() + jC));
        }
        return arrayList;
    }

    protected void p(ByteBuffer byteBuffer, long j11, int i11) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i11);
        long j12 = 0;
        while (j12 < i11) {
            int i12 = this.f123935b.read(byteBuffer, j11 + j12);
            if (i12 == -1) {
                throw new EOFException();
            }
            j12 += (long) i12;
        }
        byteBuffer.position(0);
    }

    protected short t(ByteBuffer byteBuffer, long j11) throws IOException {
        p(byteBuffer, j11, 1);
        return (short) (byteBuffer.get() & 255);
    }
}

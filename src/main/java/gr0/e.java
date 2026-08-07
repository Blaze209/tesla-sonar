package gr0;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes10.dex */
@g(tags = {4})
public class e extends b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f69429n = LoggerFactory.getLogger((Class<?>) e.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f69430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f69431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f69432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f69433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f69434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f69435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    f f69436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    a f69437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List<m> f69438l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    byte[] f69439m;

    public e() {
        this.f69420a = 4;
    }

    @Override // gr0.b
    int a() {
        a aVar = this.f69437k;
        int iB = (aVar == null ? 0 : aVar.b()) + 13;
        f fVar = this.f69436j;
        int iB2 = iB + (fVar != null ? fVar.b() : 0);
        Iterator<m> it = this.f69438l.iterator();
        while (it.hasNext()) {
            iB2 += it.next().b();
        }
        return iB2;
    }

    @Override // gr0.b
    public void e(ByteBuffer byteBuffer) {
        int iB;
        this.f69430d = mr0.d.l(byteBuffer);
        int iL = mr0.d.l(byteBuffer);
        this.f69431e = iL >>> 2;
        this.f69432f = (iL >> 1) & 1;
        this.f69433g = mr0.d.i(byteBuffer);
        this.f69434h = mr0.d.j(byteBuffer);
        this.f69435i = mr0.d.j(byteBuffer);
        while (byteBuffer.remaining() > 2) {
            int iPosition = byteBuffer.position();
            b bVarA = l.a(this.f69430d, byteBuffer);
            int iPosition2 = byteBuffer.position() - iPosition;
            f69429n.trace("{} - DecoderConfigDescr1 read: {}, size: {}", bVarA, Integer.valueOf(iPosition2), bVarA != null ? Integer.valueOf(bVarA.b()) : null);
            if (bVarA != null && iPosition2 < (iB = bVarA.b())) {
                byte[] bArr = new byte[iB - iPosition2];
                this.f69439m = bArr;
                byteBuffer.get(bArr);
            }
            if (bVarA instanceof f) {
                this.f69436j = (f) bVarA;
            } else if (bVarA instanceof a) {
                this.f69437k = (a) bVarA;
            } else if (bVarA instanceof m) {
                this.f69438l.add((m) bVarA);
            }
        }
    }

    public ByteBuffer g() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(b());
        mr0.e.i(byteBufferAllocate, this.f69420a);
        f(byteBufferAllocate, a());
        mr0.e.i(byteBufferAllocate, this.f69430d);
        mr0.e.i(byteBufferAllocate, (this.f69431e << 2) | (this.f69432f << 1) | 1);
        mr0.e.f(byteBufferAllocate, this.f69433g);
        mr0.e.g(byteBufferAllocate, this.f69434h);
        mr0.e.g(byteBufferAllocate, this.f69435i);
        f fVar = this.f69436j;
        if (fVar != null) {
            byteBufferAllocate.put(fVar.g());
        }
        a aVar = this.f69437k;
        if (aVar != null) {
            byteBufferAllocate.put(aVar.o());
        }
        Iterator<m> it = this.f69438l.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(it.next().g());
        }
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    public void h(a aVar) {
        this.f69437k = aVar;
    }

    public void i(long j11) {
        this.f69435i = j11;
    }

    public void j(int i11) {
        this.f69433g = i11;
    }

    public void k(long j11) {
        this.f69434h = j11;
    }

    public void l(int i11) {
        this.f69430d = i11;
    }

    public void m(int i11) {
        this.f69431e = i11;
    }

    @Override // gr0.b
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DecoderConfigDescriptor");
        sb2.append("{objectTypeIndication=");
        sb2.append(this.f69430d);
        sb2.append(", streamType=");
        sb2.append(this.f69431e);
        sb2.append(", upStream=");
        sb2.append(this.f69432f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f69433g);
        sb2.append(", maxBitRate=");
        sb2.append(this.f69434h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f69435i);
        sb2.append(", decoderSpecificInfo=");
        sb2.append(this.f69436j);
        sb2.append(", audioSpecificInfo=");
        sb2.append(this.f69437k);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f69439m;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(mr0.c.a(bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        Object obj = this.f69438l;
        if (obj == null) {
            obj = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        sb2.append(obj);
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}

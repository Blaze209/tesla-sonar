package gr0;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes10.dex */
@g(tags = {3})
public class h extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Logger f69441q = LoggerFactory.getLogger((Class<?>) h.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f69442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f69443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f69444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f69445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f69446h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f69448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f69449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f69450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f69451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e f69452n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    n f69453o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f69447i = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    List<b> f69454p = new ArrayList();

    public h() {
        this.f69420a = 3;
    }

    @Override // gr0.b
    int a() {
        int i11 = this.f69443e > 0 ? 5 : 3;
        if (this.f69444f > 0) {
            i11 += this.f69447i + 1;
        }
        if (this.f69445g > 0) {
            i11 += 2;
        }
        int iB = i11 + this.f69452n.b() + this.f69453o.b();
        if (this.f69454p.size() <= 0) {
            return iB;
        }
        throw new RuntimeException(" Doesn't handle other descriptors yet");
    }

    @Override // gr0.b
    public void e(ByteBuffer byteBuffer) {
        this.f69442d = mr0.d.h(byteBuffer);
        int iL = mr0.d.l(byteBuffer);
        int i11 = iL >>> 7;
        this.f69443e = i11;
        this.f69444f = (iL >>> 6) & 1;
        this.f69445g = (iL >>> 5) & 1;
        this.f69446h = iL & 31;
        if (i11 == 1) {
            this.f69450l = mr0.d.h(byteBuffer);
        }
        if (this.f69444f == 1) {
            int iL2 = mr0.d.l(byteBuffer);
            this.f69447i = iL2;
            this.f69448j = mr0.d.g(byteBuffer, iL2);
        }
        if (this.f69445g == 1) {
            this.f69451m = mr0.d.h(byteBuffer);
        }
        while (byteBuffer.remaining() > 1) {
            b bVarA = l.a(-1, byteBuffer);
            if (bVarA instanceof e) {
                this.f69452n = (e) bVarA;
            } else if (bVarA instanceof n) {
                this.f69453o = (n) bVarA;
            } else {
                this.f69454p.add(bVarA);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f69444f != hVar.f69444f || this.f69447i != hVar.f69447i || this.f69450l != hVar.f69450l || this.f69442d != hVar.f69442d || this.f69451m != hVar.f69451m || this.f69445g != hVar.f69445g || this.f69449k != hVar.f69449k || this.f69443e != hVar.f69443e || this.f69446h != hVar.f69446h) {
            return false;
        }
        String str = this.f69448j;
        if (str == null ? hVar.f69448j != null : !str.equals(hVar.f69448j)) {
            return false;
        }
        e eVar = this.f69452n;
        if (eVar == null ? hVar.f69452n != null : !eVar.equals(hVar.f69452n)) {
            return false;
        }
        List<b> list = this.f69454p;
        if (list == null ? hVar.f69454p != null : !list.equals(hVar.f69454p)) {
            return false;
        }
        n nVar = this.f69453o;
        n nVar2 = hVar.f69453o;
        return nVar == null ? nVar2 == null : nVar.equals(nVar2);
    }

    public ByteBuffer g() {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[b()]);
        mr0.e.i(byteBufferWrap, 3);
        f(byteBufferWrap, a());
        mr0.e.e(byteBufferWrap, this.f69442d);
        mr0.e.i(byteBufferWrap, (this.f69443e << 7) | (this.f69444f << 6) | (this.f69445g << 5) | (this.f69446h & 31));
        if (this.f69443e > 0) {
            mr0.e.e(byteBufferWrap, this.f69450l);
        }
        if (this.f69444f > 0) {
            mr0.e.i(byteBufferWrap, this.f69447i);
            mr0.e.j(byteBufferWrap, this.f69448j);
        }
        if (this.f69445g > 0) {
            mr0.e.e(byteBufferWrap, this.f69451m);
        }
        ByteBuffer byteBufferG = this.f69452n.g();
        ByteBuffer byteBufferG2 = this.f69453o.g();
        byteBufferWrap.put(byteBufferG.array());
        byteBufferWrap.put(byteBufferG2.array());
        return byteBufferWrap;
    }

    public void h(e eVar) {
        this.f69452n = eVar;
    }

    public int hashCode() {
        int i11 = ((((((((((this.f69442d * 31) + this.f69443e) * 31) + this.f69444f) * 31) + this.f69445g) * 31) + this.f69446h) * 31) + this.f69447i) * 31;
        String str = this.f69448j;
        int iHashCode = (((((((i11 + (str != null ? str.hashCode() : 0)) * 31) + this.f69449k) * 31) + this.f69450l) * 31) + this.f69451m) * 31;
        e eVar = this.f69452n;
        int iHashCode2 = (iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        n nVar = this.f69453o;
        int iHashCode3 = (iHashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        List<b> list = this.f69454p;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public void i(int i11) {
        this.f69442d = i11;
    }

    public void j(n nVar) {
        this.f69453o = nVar;
    }

    @Override // gr0.b
    public String toString() {
        return "ESDescriptor{esId=" + this.f69442d + ", streamDependenceFlag=" + this.f69443e + ", URLFlag=" + this.f69444f + ", oCRstreamFlag=" + this.f69445g + ", streamPriority=" + this.f69446h + ", URLLength=" + this.f69447i + ", URLString='" + this.f69448j + CoreConstants.SINGLE_QUOTE_CHAR + ", remoteODFlag=" + this.f69449k + ", dependsOnEsId=" + this.f69450l + ", oCREsId=" + this.f69451m + ", decoderConfigDescriptor=" + this.f69452n + ", slConfigDescriptor=" + this.f69453o + CoreConstants.CURLY_RIGHT;
    }
}

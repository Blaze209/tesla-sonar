package jr0;

import ch.qos.logback.core.CoreConstants;
import gr0.c;
import gr0.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mr0.e;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<ByteBuffer> f84308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<ByteBuffer> f84309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f84310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f84312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f84313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<ByteBuffer> f84314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f84315m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f84316n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f84317o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f84318p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f84319q;

    public b() {
        this.f84308f = new ArrayList();
        this.f84309g = new ArrayList();
        this.f84310h = true;
        this.f84311i = 1;
        this.f84312j = 0;
        this.f84313k = 0;
        this.f84314l = new ArrayList();
        this.f84315m = 63;
        this.f84316n = 7;
        this.f84317o = 31;
        this.f84318p = 31;
        this.f84319q = 31;
    }

    public void a(ByteBuffer byteBuffer) {
        e.i(byteBuffer, this.f84303a);
        e.i(byteBuffer, this.f84304b);
        e.i(byteBuffer, this.f84305c);
        e.i(byteBuffer, this.f84306d);
        d dVar = new d(byteBuffer);
        dVar.a(this.f84315m, 6);
        dVar.a(this.f84307e, 2);
        dVar.a(this.f84316n, 3);
        dVar.a(this.f84308f.size(), 5);
        for (ByteBuffer byteBuffer2 : this.f84308f) {
            e.e(byteBuffer, byteBuffer2.limit());
            byteBuffer.put((ByteBuffer) byteBuffer2.rewind());
        }
        e.i(byteBuffer, this.f84309g.size());
        for (ByteBuffer byteBuffer3 : this.f84309g) {
            e.e(byteBuffer, byteBuffer3.limit());
            byteBuffer.put((ByteBuffer) byteBuffer3.rewind());
        }
        if (this.f84310h) {
            int i11 = this.f84304b;
            if (i11 == 100 || i11 == 110 || i11 == 122 || i11 == 144) {
                d dVar2 = new d(byteBuffer);
                dVar2.a(this.f84317o, 6);
                dVar2.a(this.f84311i, 2);
                dVar2.a(this.f84318p, 5);
                dVar2.a(this.f84312j, 3);
                dVar2.a(this.f84319q, 5);
                dVar2.a(this.f84313k, 3);
                for (ByteBuffer byteBuffer4 : this.f84314l) {
                    e.e(byteBuffer, byteBuffer4.limit());
                    byteBuffer.put((ByteBuffer) byteBuffer4.reset());
                }
            }
        }
    }

    public long b() {
        int i11;
        Iterator<ByteBuffer> it = this.f84308f.iterator();
        long jLimit = 6;
        while (it.hasNext()) {
            jLimit = jLimit + 2 + ((long) it.next().limit());
        }
        long jLimit2 = jLimit + 1;
        Iterator<ByteBuffer> it2 = this.f84309g.iterator();
        while (it2.hasNext()) {
            jLimit2 = jLimit2 + 2 + ((long) it2.next().limit());
        }
        if (!this.f84310h || ((i11 = this.f84304b) != 100 && i11 != 110 && i11 != 122 && i11 != 144)) {
            return jLimit2;
        }
        long jLimit3 = jLimit2 + 4;
        Iterator<ByteBuffer> it3 = this.f84314l.iterator();
        while (it3.hasNext()) {
            jLimit3 = jLimit3 + 2 + ((long) it3.next().limit());
        }
        return jLimit3;
    }

    public String toString() {
        return "AvcDecoderConfigurationRecord{configurationVersion=" + this.f84303a + ", avcProfileIndication=" + this.f84304b + ", profileCompatibility=" + this.f84305c + ", avcLevelIndication=" + this.f84306d + ", lengthSizeMinusOne=" + this.f84307e + ", hasExts=" + this.f84310h + ", chromaFormat=" + this.f84311i + ", bitDepthLumaMinus8=" + this.f84312j + ", bitDepthChromaMinus8=" + this.f84313k + ", lengthSizeMinusOnePaddingBits=" + this.f84315m + ", numberOfSequenceParameterSetsPaddingBits=" + this.f84316n + ", chromaFormatPaddingBits=" + this.f84317o + ", bitDepthLumaMinus8PaddingBits=" + this.f84318p + ", bitDepthChromaMinus8PaddingBits=" + this.f84319q + CoreConstants.CURLY_RIGHT;
    }

    public b(ByteBuffer byteBuffer) {
        int i11;
        this.f84308f = new ArrayList();
        this.f84309g = new ArrayList();
        this.f84310h = true;
        this.f84311i = 1;
        this.f84312j = 0;
        this.f84313k = 0;
        this.f84314l = new ArrayList();
        this.f84315m = 63;
        this.f84316n = 7;
        this.f84317o = 31;
        this.f84318p = 31;
        this.f84319q = 31;
        this.f84303a = mr0.d.l(byteBuffer);
        this.f84304b = mr0.d.l(byteBuffer);
        this.f84305c = mr0.d.l(byteBuffer);
        this.f84306d = mr0.d.l(byteBuffer);
        c cVar = new c(byteBuffer);
        this.f84315m = cVar.a(6);
        this.f84307e = cVar.a(2);
        this.f84316n = cVar.a(3);
        int iA = cVar.a(5);
        for (int i12 = 0; i12 < iA; i12++) {
            byte[] bArr = new byte[mr0.d.h(byteBuffer)];
            byteBuffer.get(bArr);
            this.f84308f.add(ByteBuffer.wrap(bArr));
        }
        long jL = mr0.d.l(byteBuffer);
        for (int i13 = 0; i13 < jL; i13++) {
            byte[] bArr2 = new byte[mr0.d.h(byteBuffer)];
            byteBuffer.get(bArr2);
            this.f84309g.add(ByteBuffer.wrap(bArr2));
        }
        if (byteBuffer.remaining() < 4) {
            this.f84310h = false;
        }
        if (this.f84310h && ((i11 = this.f84304b) == 100 || i11 == 110 || i11 == 122 || i11 == 144)) {
            c cVar2 = new c(byteBuffer);
            this.f84317o = cVar2.a(6);
            this.f84311i = cVar2.a(2);
            this.f84318p = cVar2.a(5);
            this.f84312j = cVar2.a(3);
            this.f84319q = cVar2.a(5);
            this.f84313k = cVar2.a(3);
            long jL2 = mr0.d.l(byteBuffer);
            for (int i14 = 0; i14 < jL2; i14++) {
                byte[] bArr3 = new byte[mr0.d.h(byteBuffer)];
                byteBuffer.get(bArr3);
                this.f84314l.add(ByteBuffer.wrap(bArr3));
            }
            return;
        }
        this.f84311i = -1;
        this.f84312j = -1;
        this.f84313k = -1;
    }
}

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ss.b f40597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts.d0 f40599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f40600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f40601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f40602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f40603g;

    private static final class a implements ss.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f40604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f40605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ss.a f40606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f40607d;

        public a(long j11, int i11) {
            d(j11, i11);
        }

        @Override // ss.b.a
        public ss.a a() {
            return (ss.a) ts.a.e(this.f40606c);
        }

        public a b() {
            this.f40606c = null;
            a aVar = this.f40607d;
            this.f40607d = null;
            return aVar;
        }

        public void c(ss.a aVar, a aVar2) {
            this.f40606c = aVar;
            this.f40607d = aVar2;
        }

        public void d(long j11, int i11) {
            ts.a.g(this.f40606c == null);
            this.f40604a = j11;
            this.f40605b = j11 + ((long) i11);
        }

        public int e(long j11) {
            return ((int) (j11 - this.f40604a)) + this.f40606c.f111638b;
        }

        @Override // ss.b.a
        public ss.b.a next() {
            a aVar = this.f40607d;
            if (aVar == null || aVar.f40606c == null) {
                return null;
            }
            return aVar;
        }
    }

    public z(ss.b bVar) {
        this.f40597a = bVar;
        int iC = bVar.c();
        this.f40598b = iC;
        this.f40599c = new ts.d0(32);
        a aVar = new a(0L, iC);
        this.f40600d = aVar;
        this.f40601e = aVar;
        this.f40602f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f40606c == null) {
            return;
        }
        this.f40597a.d(aVar);
        aVar.b();
    }

    private static a c(a aVar, long j11) {
        while (j11 >= aVar.f40605b) {
            aVar = aVar.f40607d;
        }
        return aVar;
    }

    private void f(int i11) {
        long j11 = this.f40603g + ((long) i11);
        this.f40603g = j11;
        a aVar = this.f40602f;
        if (j11 == aVar.f40605b) {
            this.f40602f = aVar.f40607d;
        }
    }

    private int g(int i11) {
        a aVar = this.f40602f;
        if (aVar.f40606c == null) {
            aVar.c(this.f40597a.b(), new a(this.f40602f.f40605b, this.f40598b));
        }
        return Math.min(i11, (int) (this.f40602f.f40605b - this.f40603g));
    }

    private static a h(a aVar, long j11, ByteBuffer byteBuffer, int i11) {
        a aVarC = c(aVar, j11);
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarC.f40605b - j11));
            byteBuffer.put(aVarC.f40606c.f111637a, aVarC.e(j11), iMin);
            i11 -= iMin;
            j11 += (long) iMin;
            if (j11 == aVarC.f40605b) {
                aVarC = aVarC.f40607d;
            }
        }
        return aVarC;
    }

    private static a i(a aVar, long j11, byte[] bArr, int i11) {
        a aVarC = c(aVar, j11);
        int i12 = i11;
        while (i12 > 0) {
            int iMin = Math.min(i12, (int) (aVarC.f40605b - j11));
            System.arraycopy(aVarC.f40606c.f111637a, aVarC.e(j11), bArr, i11 - i12, iMin);
            i12 -= iMin;
            j11 += (long) iMin;
            if (j11 == aVarC.f40605b) {
                aVarC = aVarC.f40607d;
            }
        }
        return aVarC;
    }

    private static a j(a aVar, DecoderInputBuffer decoderInputBuffer, b0.b bVar, ts.d0 d0Var) {
        long j11 = bVar.f40394b;
        int iN = 1;
        d0Var.Q(1);
        a aVarI = i(aVar, j11, d0Var.e(), 1);
        long j12 = j11 + 1;
        byte b11 = d0Var.e()[0];
        boolean z11 = (b11 & 128) != 0;
        int i11 = b11 & 127;
        fr.c cVar = decoderInputBuffer.f39719b;
        byte[] bArr = cVar.f66330a;
        if (bArr == null) {
            cVar.f66330a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarI2 = i(aVarI, j12, cVar.f66330a, i11);
        long j13 = j12 + ((long) i11);
        if (z11) {
            d0Var.Q(2);
            aVarI2 = i(aVarI2, j13, d0Var.e(), 2);
            j13 += 2;
            iN = d0Var.N();
        }
        int i12 = iN;
        int[] iArr = cVar.f66333d;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f66334e;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z11) {
            int i13 = i12 * 6;
            d0Var.Q(i13);
            aVarI2 = i(aVarI2, j13, d0Var.e(), i13);
            j13 += (long) i13;
            d0Var.U(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = d0Var.N();
                iArr4[i14] = d0Var.L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f40393a - ((int) (j13 - bVar.f40394b));
        }
        hr.b0.a aVar2 = (hr.b0.a) p0.j(bVar.f40395c);
        cVar.c(i12, iArr2, iArr4, aVar2.f73304b, cVar.f66330a, aVar2.f73303a, aVar2.f73305c, aVar2.f73306d);
        long j14 = bVar.f40394b;
        int i15 = (int) (j13 - j14);
        bVar.f40394b = j14 + ((long) i15);
        bVar.f40393a -= i15;
        return aVarI2;
    }

    private static a k(a aVar, DecoderInputBuffer decoderInputBuffer, b0.b bVar, ts.d0 d0Var) {
        if (decoderInputBuffer.s()) {
            aVar = j(aVar, decoderInputBuffer, bVar, d0Var);
        }
        if (!decoderInputBuffer.i()) {
            decoderInputBuffer.q(bVar.f40393a);
            return h(aVar, bVar.f40394b, decoderInputBuffer.f39720c, bVar.f40393a);
        }
        d0Var.Q(4);
        a aVarI = i(aVar, bVar.f40394b, d0Var.e(), 4);
        int iL = d0Var.L();
        bVar.f40394b += 4;
        bVar.f40393a -= 4;
        decoderInputBuffer.q(iL);
        a aVarH = h(aVarI, bVar.f40394b, decoderInputBuffer.f39720c, iL);
        bVar.f40394b += (long) iL;
        int i11 = bVar.f40393a - iL;
        bVar.f40393a = i11;
        decoderInputBuffer.u(i11);
        return h(aVarH, bVar.f40394b, decoderInputBuffer.f39723f, bVar.f40393a);
    }

    public void b(long j11) {
        a aVar;
        if (j11 == -1) {
            return;
        }
        while (true) {
            aVar = this.f40600d;
            if (j11 < aVar.f40605b) {
                break;
            }
            this.f40597a.e(aVar.f40606c);
            this.f40600d = this.f40600d.b();
        }
        if (this.f40601e.f40604a < aVar.f40604a) {
            this.f40601e = aVar;
        }
    }

    public long d() {
        return this.f40603g;
    }

    public void e(DecoderInputBuffer decoderInputBuffer, b0.b bVar) {
        k(this.f40601e, decoderInputBuffer, bVar, this.f40599c);
    }

    public void l(DecoderInputBuffer decoderInputBuffer, b0.b bVar) {
        this.f40601e = k(this.f40601e, decoderInputBuffer, bVar, this.f40599c);
    }

    public void m() {
        a(this.f40600d);
        this.f40600d.d(0L, this.f40598b);
        a aVar = this.f40600d;
        this.f40601e = aVar;
        this.f40602f = aVar;
        this.f40603g = 0L;
        this.f40597a.a();
    }

    public void n() {
        this.f40601e = this.f40600d;
    }

    public int o(ss.g gVar, int i11, boolean z11) throws EOFException {
        int iG = g(i11);
        a aVar = this.f40602f;
        int i12 = gVar.read(aVar.f40606c.f111637a, aVar.e(this.f40603g), iG);
        if (i12 != -1) {
            f(i12);
            return i12;
        }
        if (z11) {
            return -1;
        }
        throw new EOFException();
    }

    public void p(ts.d0 d0Var, int i11) {
        while (i11 > 0) {
            int iG = g(i11);
            a aVar = this.f40602f;
            d0Var.l(aVar.f40606c.f111637a, aVar.e(this.f40603g), iG);
            i11 -= iG;
            f(iG);
        }
    }
}

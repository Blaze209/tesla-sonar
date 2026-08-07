package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import s7.q0;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s8.b f10937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.c0 f10939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f10940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f10941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f10942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f10943g;

    private static final class a implements s8.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f10944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f10945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s8.a f10946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f10947d;

        public a(long j11, int i11) {
            d(j11, i11);
        }

        @Override // s8.b.a
        public s8.a a() {
            return (s8.a) s7.a.f(this.f10946c);
        }

        public a b() {
            this.f10946c = null;
            a aVar = this.f10947d;
            this.f10947d = null;
            return aVar;
        }

        public void c(s8.a aVar, a aVar2) {
            this.f10946c = aVar;
            this.f10947d = aVar2;
        }

        public void d(long j11, int i11) {
            s7.a.h(this.f10946c == null);
            this.f10944a = j11;
            this.f10945b = j11 + ((long) i11);
        }

        public int e(long j11) {
            return ((int) (j11 - this.f10944a)) + this.f10946c.f110521b;
        }

        @Override // s8.b.a
        public s8.b.a next() {
            a aVar = this.f10947d;
            if (aVar == null || aVar.f10946c == null) {
                return null;
            }
            return aVar;
        }
    }

    public d0(s8.b bVar) {
        this.f10937a = bVar;
        int iC = bVar.c();
        this.f10938b = iC;
        this.f10939c = new s7.c0(32);
        a aVar = new a(0L, iC);
        this.f10940d = aVar;
        this.f10941e = aVar;
        this.f10942f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f10946c == null) {
            return;
        }
        this.f10937a.f(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j11) {
        while (j11 >= aVar.f10945b) {
            aVar = aVar.f10947d;
        }
        return aVar;
    }

    private void g(int i11) {
        long j11 = this.f10943g + ((long) i11);
        this.f10943g = j11;
        a aVar = this.f10942f;
        if (j11 == aVar.f10945b) {
            this.f10942f = aVar.f10947d;
        }
    }

    private int h(int i11) {
        a aVar = this.f10942f;
        if (aVar.f10946c == null) {
            aVar.c(this.f10937a.b(), new a(this.f10942f.f10945b, this.f10938b));
        }
        return Math.min(i11, (int) (this.f10942f.f10945b - this.f10943g));
    }

    private static a i(a aVar, long j11, ByteBuffer byteBuffer, int i11) {
        a aVarD = d(aVar, j11);
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarD.f10945b - j11));
            byteBuffer.put(aVarD.f10946c.f110520a, aVarD.e(j11), iMin);
            i11 -= iMin;
            j11 += (long) iMin;
            if (j11 == aVarD.f10945b) {
                aVarD = aVarD.f10947d;
            }
        }
        return aVarD;
    }

    private static a j(a aVar, long j11, byte[] bArr, int i11) {
        a aVarD = d(aVar, j11);
        int i12 = i11;
        while (i12 > 0) {
            int iMin = Math.min(i12, (int) (aVarD.f10945b - j11));
            System.arraycopy(aVarD.f10946c.f110520a, aVarD.e(j11), bArr, i11 - i12, iMin);
            i12 -= iMin;
            j11 += (long) iMin;
            if (j11 == aVarD.f10945b) {
                aVarD = aVarD.f10947d;
            }
        }
        return aVarD;
    }

    private static a k(a aVar, DecoderInputBuffer decoderInputBuffer, f0.b bVar, s7.c0 c0Var) {
        long j11 = bVar.f10979b;
        int iU = 1;
        c0Var.X(1);
        a aVarJ = j(aVar, j11, c0Var.f(), 1);
        long j12 = j11 + 1;
        byte b11 = c0Var.f()[0];
        boolean z11 = (b11 & 128) != 0;
        int i11 = b11 & 127;
        y7.c cVar = decoderInputBuffer.f9285c;
        byte[] bArr = cVar.f125181a;
        if (bArr == null) {
            cVar.f125181a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j12, cVar.f125181a, i11);
        long j13 = j12 + ((long) i11);
        if (z11) {
            c0Var.X(2);
            aVarJ2 = j(aVarJ2, j13, c0Var.f(), 2);
            j13 += 2;
            iU = c0Var.U();
        }
        int i12 = iU;
        int[] iArr = cVar.f125184d;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f125185e;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z11) {
            int i13 = i12 * 6;
            c0Var.X(i13);
            aVarJ2 = j(aVarJ2, j13, c0Var.f(), i13);
            j13 += (long) i13;
            c0Var.b0(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = c0Var.U();
                iArr4[i14] = c0Var.Q();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f10978a - ((int) (j13 - bVar.f10979b));
        }
        o0.a aVar2 = (o0.a) q0.l(bVar.f10980c);
        cVar.c(i12, iArr2, iArr4, aVar2.f121387b, cVar.f125181a, aVar2.f121386a, aVar2.f121388c, aVar2.f121389d);
        long j14 = bVar.f10979b;
        int i15 = (int) (j13 - j14);
        bVar.f10979b = j14 + ((long) i15);
        bVar.f10978a -= i15;
        return aVarJ2;
    }

    private static a l(a aVar, DecoderInputBuffer decoderInputBuffer, f0.b bVar, s7.c0 c0Var) {
        if (decoderInputBuffer.r()) {
            aVar = k(aVar, decoderInputBuffer, bVar, c0Var);
        }
        if (!decoderInputBuffer.h()) {
            decoderInputBuffer.p(bVar.f10978a);
            return i(aVar, bVar.f10979b, decoderInputBuffer.f9286d, bVar.f10978a);
        }
        c0Var.X(4);
        a aVarJ = j(aVar, bVar.f10979b, c0Var.f(), 4);
        int iQ = c0Var.Q();
        bVar.f10979b += 4;
        bVar.f10978a -= 4;
        decoderInputBuffer.p(iQ);
        a aVarI = i(aVarJ, bVar.f10979b, decoderInputBuffer.f9286d, iQ);
        bVar.f10979b += (long) iQ;
        int i11 = bVar.f10978a - iQ;
        bVar.f10978a = i11;
        decoderInputBuffer.t(i11);
        return i(aVarI, bVar.f10979b, decoderInputBuffer.f9289g, bVar.f10978a);
    }

    public void b(long j11) {
        a aVar;
        if (j11 == -1) {
            return;
        }
        while (true) {
            aVar = this.f10940d;
            if (j11 < aVar.f10945b) {
                break;
            }
            this.f10937a.d(aVar.f10946c);
            this.f10940d = this.f10940d.b();
        }
        if (this.f10941e.f10944a < aVar.f10944a) {
            this.f10941e = aVar;
        }
    }

    public void c(long j11) {
        s7.a.a(j11 <= this.f10943g);
        this.f10943g = j11;
        if (j11 != 0) {
            a aVar = this.f10940d;
            if (j11 != aVar.f10944a) {
                while (this.f10943g > aVar.f10945b) {
                    aVar = aVar.f10947d;
                }
                a aVar2 = (a) s7.a.f(aVar.f10947d);
                a(aVar2);
                a aVar3 = new a(aVar.f10945b, this.f10938b);
                aVar.f10947d = aVar3;
                if (this.f10943g == aVar.f10945b) {
                    aVar = aVar3;
                }
                this.f10942f = aVar;
                if (this.f10941e == aVar2) {
                    this.f10941e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f10940d);
        a aVar4 = new a(this.f10943g, this.f10938b);
        this.f10940d = aVar4;
        this.f10941e = aVar4;
        this.f10942f = aVar4;
    }

    public long e() {
        return this.f10943g;
    }

    public void f(DecoderInputBuffer decoderInputBuffer, f0.b bVar) {
        l(this.f10941e, decoderInputBuffer, bVar, this.f10939c);
    }

    public void m(DecoderInputBuffer decoderInputBuffer, f0.b bVar) {
        this.f10941e = l(this.f10941e, decoderInputBuffer, bVar, this.f10939c);
    }

    public void n() {
        a(this.f10940d);
        this.f10940d.d(0L, this.f10938b);
        a aVar = this.f10940d;
        this.f10941e = aVar;
        this.f10942f = aVar;
        this.f10943g = 0L;
        this.f10937a.a();
    }

    public void o() {
        this.f10941e = this.f10940d;
    }

    public int p(p7.j jVar, int i11, boolean z11) throws EOFException {
        int iH = h(i11);
        a aVar = this.f10942f;
        int i12 = jVar.read(aVar.f10946c.f110520a, aVar.e(this.f10943g), iH);
        if (i12 != -1) {
            g(i12);
            return i12;
        }
        if (z11) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(s7.c0 c0Var, int i11) {
        while (i11 > 0) {
            int iH = h(i11);
            a aVar = this.f10942f;
            c0Var.q(aVar.f10946c.f110520a, aVar.e(this.f10943g), iH);
            i11 -= iH;
            g(iH);
        }
    }
}

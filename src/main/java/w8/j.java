package w8;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p7.j f121325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f121326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f121327d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f121329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f121330g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f121328e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f121324a = new byte[4096];

    static {
        p7.d0.a("media3.extractor");
    }

    public j(p7.j jVar, long j11, long j12) {
        this.f121325b = jVar;
        this.f121327d = j11;
        this.f121326c = j12;
    }

    private void o(int i11) {
        if (i11 != -1) {
            this.f121327d += (long) i11;
        }
    }

    private void p(int i11) {
        int i12 = this.f121329f + i11;
        byte[] bArr = this.f121328e;
        if (i12 > bArr.length) {
            this.f121328e = Arrays.copyOf(this.f121328e, s7.q0.r(bArr.length * 2, 65536 + i12, i12 + PKIFailureInfo.signerNotTrusted));
        }
    }

    private int q(byte[] bArr, int i11, int i12) {
        int i13 = this.f121330g;
        if (i13 == 0) {
            return 0;
        }
        int iMin = Math.min(i13, i12);
        System.arraycopy(this.f121328e, 0, bArr, i11, iMin);
        t(iMin);
        return iMin;
    }

    private int r(byte[] bArr, int i11, int i12, int i13, boolean z11) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i14 = this.f121325b.read(bArr, i11 + i13, i12 - i13);
        if (i14 != -1) {
            return i13 + i14;
        }
        if (i13 == 0 && z11) {
            return -1;
        }
        throw new EOFException();
    }

    private int s(int i11) {
        int iMin = Math.min(this.f121330g, i11);
        t(iMin);
        return iMin;
    }

    private void t(int i11) {
        int i12 = this.f121330g - i11;
        this.f121330g = i12;
        this.f121329f = 0;
        byte[] bArr = this.f121328e;
        byte[] bArr2 = i12 < bArr.length - PKIFailureInfo.signerNotTrusted ? new byte[65536 + i12] : bArr;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        this.f121328e = bArr2;
    }

    @Override // w8.q
    public int a(int i11) throws EOFException, InterruptedIOException {
        int iS = s(i11);
        if (iS == 0) {
            byte[] bArr = this.f121324a;
            iS = r(bArr, 0, Math.min(i11, bArr.length), 0, true);
        }
        o(iS);
        return iS;
    }

    @Override // w8.q
    public boolean c(byte[] bArr, int i11, int i12, boolean z11) throws EOFException, InterruptedIOException {
        int iQ = q(bArr, i11, i12);
        while (iQ < i12 && iQ != -1) {
            iQ = r(bArr, i11, i12, iQ, z11);
        }
        o(iQ);
        return iQ != -1;
    }

    @Override // w8.q
    public int d(byte[] bArr, int i11, int i12) throws EOFException, InterruptedIOException {
        j jVar;
        int iMin;
        p(i12);
        int i13 = this.f121330g;
        int i14 = this.f121329f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            jVar = this;
            iMin = jVar.r(this.f121328e, i14, i12, 0, true);
            if (iMin == -1) {
                return -1;
            }
            jVar.f121330g += iMin;
        } else {
            jVar = this;
            iMin = Math.min(i12, i15);
        }
        System.arraycopy(jVar.f121328e, jVar.f121329f, bArr, i11, iMin);
        jVar.f121329f += iMin;
        return iMin;
    }

    @Override // w8.q
    public void e(byte[] bArr, int i11, int i12) {
        f(bArr, i11, i12, false);
    }

    @Override // w8.q
    public boolean f(byte[] bArr, int i11, int i12, boolean z11) {
        if (!l(i12, z11)) {
            return false;
        }
        System.arraycopy(this.f121328e, this.f121329f - i12, bArr, i11, i12);
        return true;
    }

    @Override // w8.q
    public void g() {
        this.f121329f = 0;
    }

    @Override // w8.q
    public long getLength() {
        return this.f121326c;
    }

    @Override // w8.q
    public long getPosition() {
        return this.f121327d;
    }

    @Override // w8.q
    public long h() {
        return this.f121327d + ((long) this.f121329f);
    }

    @Override // w8.q
    public void i(int i11) throws EOFException, InterruptedIOException {
        l(i11, false);
    }

    @Override // w8.q
    public void k(int i11) throws EOFException, InterruptedIOException {
        m(i11, false);
    }

    @Override // w8.q
    public boolean l(int i11, boolean z11) throws EOFException, InterruptedIOException {
        p(i11);
        int iR = this.f121330g - this.f121329f;
        while (iR < i11) {
            int i12 = i11;
            boolean z12 = z11;
            iR = r(this.f121328e, this.f121329f, i12, iR, z12);
            if (iR == -1) {
                return false;
            }
            this.f121330g = this.f121329f + iR;
            i11 = i12;
            z11 = z12;
        }
        this.f121329f += i11;
        return true;
    }

    @Override // w8.q
    public boolean m(int i11, boolean z11) throws EOFException, InterruptedIOException {
        int iS = s(i11);
        while (iS < i11 && iS != -1) {
            iS = r(this.f121324a, -iS, Math.min(i11, this.f121324a.length + iS), iS, z11);
        }
        o(iS);
        return iS != -1;
    }

    @Override // w8.q, p7.j
    public int read(byte[] bArr, int i11, int i12) throws EOFException, InterruptedIOException {
        int iQ = q(bArr, i11, i12);
        if (iQ == 0) {
            iQ = r(bArr, i11, i12, 0, true);
        }
        o(iQ);
        return iQ;
    }

    @Override // w8.q
    public void readFully(byte[] bArr, int i11, int i12) throws EOFException, InterruptedIOException {
        c(bArr, i11, i12, false);
    }
}

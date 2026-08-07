package hr;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ss.g f73332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f73333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f73334d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f73336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f73337g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f73335e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f73331a = new byte[4096];

    static {
        br.p.a("goog.exo.extractor");
    }

    public e(ss.g gVar, long j11, long j12) {
        this.f73332b = gVar;
        this.f73334d = j11;
        this.f73333c = j12;
    }

    private void n(int i11) {
        if (i11 != -1) {
            this.f73334d += (long) i11;
        }
    }

    private void o(int i11) {
        int i12 = this.f73336f + i11;
        byte[] bArr = this.f73335e;
        if (i12 > bArr.length) {
            this.f73335e = Arrays.copyOf(this.f73335e, p0.q(bArr.length * 2, 65536 + i12, i12 + PKIFailureInfo.signerNotTrusted));
        }
    }

    private int p(byte[] bArr, int i11, int i12) {
        int i13 = this.f73337g;
        if (i13 == 0) {
            return 0;
        }
        int iMin = Math.min(i13, i12);
        System.arraycopy(this.f73335e, 0, bArr, i11, iMin);
        t(iMin);
        return iMin;
    }

    private int q(byte[] bArr, int i11, int i12, int i13, boolean z11) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i14 = this.f73332b.read(bArr, i11 + i13, i12 - i13);
        if (i14 != -1) {
            return i13 + i14;
        }
        if (i13 == 0 && z11) {
            return -1;
        }
        throw new EOFException();
    }

    private int r(int i11) {
        int iMin = Math.min(this.f73337g, i11);
        t(iMin);
        return iMin;
    }

    private void t(int i11) {
        int i12 = this.f73337g - i11;
        this.f73337g = i12;
        this.f73336f = 0;
        byte[] bArr = this.f73335e;
        byte[] bArr2 = i12 < bArr.length - PKIFailureInfo.signerNotTrusted ? new byte[65536 + i12] : bArr;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        this.f73335e = bArr2;
    }

    @Override // hr.l
    public int a(int i11) throws EOFException, InterruptedIOException {
        int iR = r(i11);
        if (iR == 0) {
            byte[] bArr = this.f73331a;
            iR = q(bArr, 0, Math.min(i11, bArr.length), 0, true);
        }
        n(iR);
        return iR;
    }

    @Override // hr.l
    public boolean c(byte[] bArr, int i11, int i12, boolean z11) throws EOFException, InterruptedIOException {
        int iP = p(bArr, i11, i12);
        while (iP < i12 && iP != -1) {
            iP = q(bArr, i11, i12, iP, z11);
        }
        n(iP);
        return iP != -1;
    }

    @Override // hr.l
    public int d(byte[] bArr, int i11, int i12) throws EOFException, InterruptedIOException {
        e eVar;
        int iMin;
        o(i12);
        int i13 = this.f73337g;
        int i14 = this.f73336f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            eVar = this;
            iMin = eVar.q(this.f73335e, i14, i12, 0, true);
            if (iMin == -1) {
                return -1;
            }
            eVar.f73337g += iMin;
        } else {
            eVar = this;
            iMin = Math.min(i12, i15);
        }
        System.arraycopy(eVar.f73335e, eVar.f73336f, bArr, i11, iMin);
        eVar.f73336f += iMin;
        return iMin;
    }

    @Override // hr.l
    public void e(byte[] bArr, int i11, int i12) {
        f(bArr, i11, i12, false);
    }

    @Override // hr.l
    public boolean f(byte[] bArr, int i11, int i12, boolean z11) {
        if (!l(i12, z11)) {
            return false;
        }
        System.arraycopy(this.f73335e, this.f73336f - i12, bArr, i11, i12);
        return true;
    }

    @Override // hr.l
    public void g() {
        this.f73336f = 0;
    }

    @Override // hr.l
    public long getLength() {
        return this.f73333c;
    }

    @Override // hr.l
    public long getPosition() {
        return this.f73334d;
    }

    @Override // hr.l
    public long h() {
        return this.f73334d + ((long) this.f73336f);
    }

    @Override // hr.l
    public void i(int i11) throws EOFException, InterruptedIOException {
        l(i11, false);
    }

    @Override // hr.l
    public void k(int i11) throws EOFException, InterruptedIOException {
        s(i11, false);
    }

    @Override // hr.l
    public boolean l(int i11, boolean z11) throws EOFException, InterruptedIOException {
        o(i11);
        int iQ = this.f73337g - this.f73336f;
        while (iQ < i11) {
            int i12 = i11;
            boolean z12 = z11;
            iQ = q(this.f73335e, this.f73336f, i12, iQ, z12);
            if (iQ == -1) {
                return false;
            }
            this.f73337g = this.f73336f + iQ;
            i11 = i12;
            z11 = z12;
        }
        this.f73336f += i11;
        return true;
    }

    @Override // hr.l, ss.g
    public int read(byte[] bArr, int i11, int i12) throws EOFException, InterruptedIOException {
        int iP = p(bArr, i11, i12);
        if (iP == 0) {
            iP = q(bArr, i11, i12, 0, true);
        }
        n(iP);
        return iP;
    }

    @Override // hr.l
    public void readFully(byte[] bArr, int i11, int i12) throws EOFException, InterruptedIOException {
        c(bArr, i11, i12, false);
    }

    public boolean s(int i11, boolean z11) throws EOFException, InterruptedIOException {
        int iR = r(i11);
        while (iR < i11 && iR != -1) {
            iR = q(this.f73331a, -iR, Math.min(i11, this.f73331a.length + iR), iR, z11);
        }
        n(iR);
        return iR != -1;
    }
}

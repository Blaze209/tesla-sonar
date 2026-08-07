package bj;

import android.util.Log;
import androidx.annotation.NonNull;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f17459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f17460c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f17458a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17461d = 0;

    private boolean b() {
        return this.f17460c.f17446b != 0;
    }

    private int d() {
        try {
            return this.f17459b.get() & 255;
        } catch (Exception unused) {
            this.f17460c.f17446b = 1;
            return 0;
        }
    }

    private void e() {
        this.f17460c.f17448d.f17434a = n();
        this.f17460c.f17448d.f17435b = n();
        this.f17460c.f17448d.f17436c = n();
        this.f17460c.f17448d.f17437d = n();
        int iD = d();
        boolean z11 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f17460c.f17448d;
        bVar.f17438e = (iD & 64) != 0;
        if (z11) {
            bVar.f17444k = g(iPow);
        } else {
            bVar.f17444k = null;
        }
        this.f17460c.f17448d.f17443j = this.f17459b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f17460c;
        cVar.f17447c++;
        cVar.f17449e.add(cVar.f17448d);
    }

    private void f() {
        int iD = d();
        this.f17461d = iD;
        if (iD <= 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            try {
                int i13 = this.f17461d;
                if (i11 >= i13) {
                    return;
                }
                i12 = i13 - i11;
                this.f17459b.get(this.f17458a, i11, i12);
                i11 += i12;
            } catch (Exception e11) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i11 + " count: " + i12 + " blockSize: " + this.f17461d, e11);
                }
                this.f17460c.f17446b = 1;
                return;
            }
        }
    }

    private int[] g(int i11) {
        byte[] bArr = new byte[i11 * 3];
        int[] iArr = null;
        try {
            this.f17459b.get(bArr);
            iArr = new int[256];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = bArr[i13] & 255;
                int i15 = i13 + 2;
                int i16 = bArr[i13 + 1] & 255;
                i13 += 3;
                int i17 = i12 + 1;
                iArr[i12] = (i16 << 8) | (i14 << 16) | (-16777216) | (bArr[i15] & 255);
                i12 = i17;
            }
            return iArr;
        } catch (BufferUnderflowException e11) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e11);
            }
            this.f17460c.f17446b = 1;
            return iArr;
        }
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i11) {
        boolean z11 = false;
        while (!z11 && !b() && this.f17460c.f17447c <= i11) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f17460c.f17448d = new b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i12 = 0; i12 < 11; i12++) {
                        sb2.append((char) this.f17458a[i12]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                c cVar = this.f17460c;
                if (cVar.f17448d == null) {
                    cVar.f17448d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f17460c.f17446b = 1;
            } else {
                z11 = true;
            }
        }
    }

    private void j() {
        d();
        int iD = d();
        b bVar = this.f17460c.f17448d;
        int i11 = (iD & 28) >> 2;
        bVar.f17440g = i11;
        if (i11 == 0) {
            bVar.f17440g = 1;
        }
        bVar.f17439f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f17460c.f17448d;
        bVar2.f17442i = iN * 10;
        bVar2.f17441h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 6; i11++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f17460c.f17446b = 1;
            return;
        }
        l();
        if (!this.f17460c.f17452h || b()) {
            return;
        }
        c cVar = this.f17460c;
        cVar.f17445a = g(cVar.f17453i);
        c cVar2 = this.f17460c;
        cVar2.f17456l = cVar2.f17445a[cVar2.f17454j];
    }

    private void l() {
        this.f17460c.f17450f = n();
        this.f17460c.f17451g = n();
        int iD = d();
        c cVar = this.f17460c;
        cVar.f17452h = (iD & 128) != 0;
        cVar.f17453i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f17460c.f17454j = d();
        this.f17460c.f17455k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f17458a;
            if (bArr[0] == 1) {
                this.f17460c.f17457m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f17461d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f17459b.getShort();
    }

    private void o() {
        this.f17459b = null;
        Arrays.fill(this.f17458a, (byte) 0);
        this.f17460c = new c();
        this.f17461d = 0;
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f17459b.position(Math.min(this.f17459b.position() + iD, this.f17459b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f17459b = null;
        this.f17460c = null;
    }

    @NonNull
    public c c() {
        if (this.f17459b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f17460c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f17460c;
            if (cVar.f17447c < 0) {
                cVar.f17446b = 1;
            }
        }
        return this.f17460c;
    }

    public d p(@NonNull ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f17459b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f17459b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}

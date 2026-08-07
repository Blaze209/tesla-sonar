package h0;

import androidx.annotation.NonNull;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes.dex */
public final class j extends FilterOutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f70126g = "Exif\u0000\u0000".getBytes(h.f70095e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f70127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f70128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteBuffer f70129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f70130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f70131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f70132f;

    static final class a {
        public static boolean a(short s11) {
            return (s11 < -64 || s11 > -49 || s11 == -60 || s11 == -56 || s11 == -52) ? false : true;
        }
    }

    public j(@NonNull OutputStream outputStream, @NonNull i iVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f70128b = new byte[1];
        this.f70129c = ByteBuffer.allocate(4);
        this.f70130d = 0;
        this.f70127a = iVar;
    }

    private int c(int i11, byte[] bArr, int i12, int i13) {
        int iMin = Math.min(i13, i11 - this.f70129c.position());
        this.f70129c.put(bArr, i12, iMin);
        return iMin;
    }

    private void n(@NonNull b bVar) throws IOException {
        k[][] kVarArr = i.f70109i;
        int[] iArr = new int[kVarArr.length];
        int[] iArr2 = new int[kVarArr.length];
        for (k kVar : i.f70107g) {
            for (int i11 = 0; i11 < i.f70109i.length; i11++) {
                this.f70127a.d(i11).remove(kVar.f70134b);
            }
        }
        if (!this.f70127a.d(1).isEmpty()) {
            this.f70127a.d(0).put(i.f70107g[1].f70134b, h.f(0L, this.f70127a.e()));
        }
        if (!this.f70127a.d(2).isEmpty()) {
            this.f70127a.d(0).put(i.f70107g[2].f70134b, h.f(0L, this.f70127a.e()));
        }
        if (!this.f70127a.d(3).isEmpty()) {
            this.f70127a.d(1).put(i.f70107g[3].f70134b, h.f(0L, this.f70127a.e()));
        }
        for (int i12 = 0; i12 < i.f70109i.length; i12++) {
            Iterator<Map.Entry<String, h>> it = this.f70127a.d(i12).entrySet().iterator();
            int i13 = 0;
            while (it.hasNext()) {
                int iJ = it.next().getValue().j();
                if (iJ > 4) {
                    i13 += iJ;
                }
            }
            iArr2[i12] = iArr2[i12] + i13;
        }
        int size = 8;
        for (int i14 = 0; i14 < i.f70109i.length; i14++) {
            if (!this.f70127a.d(i14).isEmpty()) {
                iArr[i14] = size;
                size += (this.f70127a.d(i14).size() * 12) + 6 + iArr2[i14];
            }
        }
        int i15 = size + 8;
        if (!this.f70127a.d(1).isEmpty()) {
            this.f70127a.d(0).put(i.f70107g[1].f70134b, h.f(iArr[1], this.f70127a.e()));
        }
        if (!this.f70127a.d(2).isEmpty()) {
            this.f70127a.d(0).put(i.f70107g[2].f70134b, h.f(iArr[2], this.f70127a.e()));
        }
        if (!this.f70127a.d(3).isEmpty()) {
            this.f70127a.d(1).put(i.f70107g[3].f70134b, h.f(iArr[3], this.f70127a.e()));
        }
        bVar.B(i15);
        bVar.write(f70126g);
        bVar.p(this.f70127a.e() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.c(this.f70127a.e());
        bVar.B(42);
        bVar.t(8L);
        for (int i16 = 0; i16 < i.f70109i.length; i16++) {
            if (!this.f70127a.d(i16).isEmpty()) {
                bVar.B(this.f70127a.d(i16).size());
                int size2 = iArr[i16] + 2 + (this.f70127a.d(i16).size() * 12) + 4;
                for (Map.Entry<String, h> entry : this.f70127a.d(i16).entrySet()) {
                    int i17 = ((k) u5.h.h(i.b.f70118f.get(i16).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f70133a;
                    h value = entry.getValue();
                    int iJ2 = value.j();
                    bVar.B(i17);
                    bVar.B(value.f70099a);
                    bVar.o(value.f70100b);
                    if (iJ2 > 4) {
                        bVar.t(size2);
                        size2 += iJ2;
                    } else {
                        bVar.write(value.f70102d);
                        if (iJ2 < 4) {
                            while (iJ2 < 4) {
                                bVar.n(0);
                                iJ2++;
                            }
                        }
                    }
                }
                bVar.t(0L);
                Iterator<Map.Entry<String, h>> it2 = this.f70127a.d(i16).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f70102d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.c(ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        while (true) {
            int i13 = this.f70131e;
            if ((i13 <= 0 && this.f70132f <= 0 && this.f70130d == 2) || i12 <= 0) {
                break;
            }
            if (i13 > 0) {
                int iMin = Math.min(i12, i13);
                i12 -= iMin;
                this.f70131e -= iMin;
                i11 += iMin;
            }
            int i14 = this.f70132f;
            if (i14 > 0) {
                int iMin2 = Math.min(i12, i14);
                ((FilterOutputStream) this).out.write(bArr, i11, iMin2);
                i12 -= iMin2;
                this.f70132f -= iMin2;
                i11 += iMin2;
            }
            if (i12 == 0) {
                return;
            }
            int i15 = this.f70130d;
            if (i15 == 0) {
                int iC = c(2, bArr, i11, i12);
                i11 += iC;
                i12 -= iC;
                if (this.f70129c.position() < 2) {
                    return;
                }
                this.f70129c.rewind();
                if (this.f70129c.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(this.f70129c.array(), 0, 2);
                this.f70130d = 1;
                this.f70129c.rewind();
                b bVar = new b(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                bVar.p((short) -31);
                n(bVar);
            } else if (i15 != 1) {
                continue;
            } else {
                int iC2 = c(4, bArr, i11, i12);
                i11 += iC2;
                i12 -= iC2;
                if (this.f70129c.position() == 2 && this.f70129c.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(this.f70129c.array(), 0, 2);
                    this.f70129c.rewind();
                }
                if (this.f70129c.position() < 4) {
                    return;
                }
                this.f70129c.rewind();
                short s11 = this.f70129c.getShort();
                if (s11 == -31) {
                    this.f70131e = (this.f70129c.getShort() & HPKE.aead_EXPORT_ONLY) - 2;
                    this.f70130d = 2;
                } else if (a.a(s11)) {
                    ((FilterOutputStream) this).out.write(this.f70129c.array(), 0, 4);
                    this.f70130d = 2;
                } else {
                    ((FilterOutputStream) this).out.write(this.f70129c.array(), 0, 4);
                    this.f70132f = (this.f70129c.getShort() & HPKE.aead_EXPORT_ONLY) - 2;
                }
                this.f70129c.rewind();
            }
        }
        if (i12 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i11, i12);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        byte[] bArr = this.f70128b;
        bArr[0] = (byte) (i11 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}

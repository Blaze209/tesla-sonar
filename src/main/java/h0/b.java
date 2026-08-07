package h0;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
class b extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final OutputStream f70081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteOrder f70082b;

    b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f70081a = outputStream;
        this.f70082b = byteOrder;
    }

    public void B(int i11) throws IOException {
        p((short) i11);
    }

    public void c(ByteOrder byteOrder) {
        this.f70082b = byteOrder;
    }

    public void n(int i11) throws IOException {
        this.f70081a.write(i11);
    }

    public void o(int i11) throws IOException {
        ByteOrder byteOrder = this.f70082b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f70081a.write(i11 & 255);
            this.f70081a.write((i11 >>> 8) & 255);
            this.f70081a.write((i11 >>> 16) & 255);
            this.f70081a.write((i11 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f70081a.write((i11 >>> 24) & 255);
            this.f70081a.write((i11 >>> 16) & 255);
            this.f70081a.write((i11 >>> 8) & 255);
            this.f70081a.write(i11 & 255);
        }
    }

    public void p(short s11) throws IOException {
        ByteOrder byteOrder = this.f70082b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f70081a.write(s11 & 255);
            this.f70081a.write((s11 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f70081a.write((s11 >>> 8) & 255);
            this.f70081a.write(s11 & 255);
        }
    }

    public void t(long j11) throws IOException {
        o((int) j11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f70081a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        this.f70081a.write(bArr, i11, i12);
    }
}

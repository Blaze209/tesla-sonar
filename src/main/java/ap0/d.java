package ap0;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class d extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DataOutputStream f14847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f14848b;

    public d(OutputStream outputStream) {
        this.f14847a = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        this.f14848b = new c();
    }

    public void c(int i11) throws IOException {
        byte[] bArrA = e.a(i11);
        this.f14848b.h(i11);
        if (this.f14848b.b()) {
            this.f14847a.write(bArrA);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f14848b.b()) {
            throw new IllegalStateException("Cannot close stream yet, illegal TLV state.");
        }
        this.f14847a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f14847a.flush();
    }

    public void n(int i11) throws IOException {
        byte[] bArrC = e.c(i11);
        if (this.f14848b.b()) {
            this.f14847a.write(bArrC);
        }
        this.f14848b.i(i11);
    }

    public void o(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("Cannot write null.");
        }
        if (this.f14848b.e()) {
            throw new IllegalStateException("Cannot write value bytes yet. Need to write a tag first.");
        }
        if (this.f14848b.d()) {
            c(bArr.length);
            write(bArr);
        } else {
            write(bArr);
            this.f14848b.j(bArr.length);
        }
    }

    public void p() throws IOException {
        if (this.f14848b.d()) {
            throw new IllegalStateException("Not processing value yet.");
        }
        if (!this.f14848b.e() || this.f14848b.f()) {
            byte[] bArrC = this.f14848b.c();
            int length = bArrC.length;
            this.f14848b.j(length);
            if (this.f14848b.b()) {
                this.f14847a.write(e.a(length));
                this.f14847a.write(bArrC);
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        write(new byte[]{(byte) i11}, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        if (!this.f14848b.e()) {
            if (this.f14848b.d()) {
                this.f14848b.g();
            }
            this.f14848b.k(bArr, i11, i12);
            if (this.f14848b.b()) {
                this.f14847a.write(bArr, i11, i12);
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot write value bytes yet. Need to write a tag first.");
    }
}

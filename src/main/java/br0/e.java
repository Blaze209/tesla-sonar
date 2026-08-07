package br0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f17955d = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17957c;

    protected e(int i11, InputStream inputStream) throws IOException {
        this.f17956b = i11;
        f(inputStream);
    }

    private byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                g(byteArrayOutputStream);
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (IOException e11) {
                    f17955d.log(Level.FINE, "Error closing stream", (Throwable) e11);
                    return byteArray;
                }
            } catch (IOException e12) {
                throw new IllegalStateException("Could not get DG content", e12);
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e13) {
                f17955d.log(Level.FINE, "Error closing stream", (Throwable) e13);
            }
            throw th2;
        }
    }

    @Override // br0.b
    protected void a(OutputStream outputStream) throws IOException {
        ap0.d dVar = outputStream instanceof ap0.d ? (ap0.d) outputStream : new ap0.d(outputStream);
        int iD = d();
        if (this.f17956b != iD) {
            this.f17956b = iD;
        }
        dVar.n(iD);
        byte[] bArrB = b();
        int length = bArrB == null ? 0 : bArrB.length;
        if (this.f17957c != length) {
            this.f17957c = length;
        }
        dVar.o(bArrB);
    }

    public int c() {
        if (this.f17957c <= 0) {
            this.f17957c = b().length;
        }
        return this.f17957c;
    }

    public int d() {
        return this.f17956b;
    }

    protected abstract void e(InputStream inputStream);

    protected void f(InputStream inputStream) throws IOException {
        ap0.b bVar = inputStream instanceof ap0.b ? (ap0.b) inputStream : new ap0.b(inputStream);
        int iN = bVar.n();
        if (iN == this.f17956b) {
            this.f17957c = bVar.c();
            e(bVar);
            return;
        }
        throw new IllegalArgumentException("Was expecting tag " + Integer.toHexString(this.f17956b) + ", found " + Integer.toHexString(iN));
    }

    protected abstract void g(OutputStream outputStream);

    @Override // br0.b
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }
}

package net.time4j.i18n;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes9.dex */
class g extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PushbackInputStream f94653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BufferedReader f94654b = null;

    g(InputStream inputStream) {
        this.f94653a = new PushbackInputStream(inputStream, 3);
    }

    private void c() throws IOException {
        if (this.f94654b != null) {
            return;
        }
        byte[] bArr = new byte[3];
        int i11 = this.f94653a.read(bArr, 0, 3);
        if ((i11 != 3 || bArr[0] != -17 || bArr[1] != -69 || bArr[2] != -65) && i11 > 0) {
            this.f94653a.unread(bArr, 0, i11);
        }
        this.f94654b = new BufferedReader(new InputStreamReader(this.f94653a, "UTF-8"));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        BufferedReader bufferedReader = this.f94654b;
        if (bufferedReader == null) {
            this.f94653a.close();
        } else {
            bufferedReader.close();
        }
    }

    public String n() throws IOException {
        c();
        return this.f94654b.readLine();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i11, int i12) throws IOException {
        c();
        return this.f94654b.read(cArr, i11, i12);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        c();
        return this.f94654b.ready();
    }
}

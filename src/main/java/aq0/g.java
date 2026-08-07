package aq0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes9.dex */
final class g extends BufferedReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f14931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14932d;

    g(Reader reader) {
        super(reader);
        this.f14929a = -2;
    }

    long c() {
        int i11 = this.f14929a;
        return (i11 == 13 || i11 == 10 || i11 == -2 || i11 == -1) ? this.f14930b : this.f14930b + 1;
    }

    @Override // java.io.BufferedReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14932d = true;
        this.f14929a = -1;
        super.close();
    }

    public boolean isClosed() {
        return this.f14932d;
    }

    int n() {
        return this.f14929a;
    }

    long o() {
        return this.f14931c;
    }

    int p() throws IOException {
        super.mark(1);
        int i11 = super.read();
        super.reset();
        return i11;
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read() throws IOException {
        int i11;
        int i12 = super.read();
        if (i12 == 13 || ((i12 == 10 && this.f14929a != 13) || (i12 == -1 && (i11 = this.f14929a) != 13 && i11 != 10 && i11 != -1))) {
            this.f14930b++;
        }
        this.f14929a = i12;
        this.f14931c++;
        return i12;
    }

    @Override // java.io.BufferedReader
    public String readLine() throws IOException {
        if (p() == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i11 = read();
            if (i11 == 13 && p() == 10) {
                read();
            }
            if (i11 == -1 || i11 == 10 || i11 == 13) {
                break;
            }
            sb2.append((char) i11);
        }
        return sb2.toString();
    }

    char[] t(char[] cArr) throws IOException {
        int length = cArr.length;
        super.mark(length);
        super.read(cArr, 0, length);
        super.reset();
        return cArr;
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read(char[] cArr, int i11, int i12) throws IOException {
        int i13;
        int i14;
        int i15;
        char c11;
        if (i12 == 0) {
            return 0;
        }
        int i16 = super.read(cArr, i11, i12);
        if (i16 > 0) {
            int i17 = i11;
            while (true) {
                i13 = i11 + i16;
                if (i17 >= i13) {
                    break;
                }
                char c12 = cArr[i17];
                if (c12 == '\n') {
                    if (i17 > i11) {
                        c11 = cArr[i17 - 1];
                    } else {
                        i14 = this.f14929a;
                    }
                    if (13 != i15) {
                        i15 = i14;
                        i15 = c11;
                        this.f14930b++;
                    } else {
                        i15 = i14;
                        i15 = c11;
                    }
                } else if (c12 == '\r') {
                    this.f14930b++;
                }
                i17++;
            }
            this.f14929a = cArr[i13 - 1];
        } else if (i16 == -1) {
            this.f14929a = -1;
        }
        this.f14931c += (long) i16;
        return i16;
    }
}

package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
final class x0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f8701b = new StringBuilder(128);

    x0(String str) {
        this.f8700a = str;
    }

    private void c() {
        if (this.f8701b.length() > 0) {
            Log.d(this.f8700a, this.f8701b.toString());
            StringBuilder sb2 = this.f8701b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        c();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            char c11 = cArr[i11 + i13];
            if (c11 == '\n') {
                c();
            } else {
                this.f8701b.append(c11);
            }
        }
    }
}

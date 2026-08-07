package eq0;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes9.dex */
public class a extends Writer implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f63131a = new StringBuilder();

    public String toString() {
        return this.f63131a.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f63131a.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) {
        if (cArr != null) {
            this.f63131a.append(cArr, i11, i12);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c11) {
        this.f63131a.append(c11);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f63131a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i11, int i12) {
        this.f63131a.append(charSequence, i11, i12);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}

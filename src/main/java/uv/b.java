package uv;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f116722a = 0;

    b() {
    }

    long getLength() {
        return this.f116722a;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.f116722a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f116722a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i11, int i12) {
        int i13;
        if (i11 >= 0 && i11 <= bArr.length && i12 >= 0 && (i13 = i11 + i12) <= bArr.length && i13 >= 0) {
            this.f116722a += (long) i12;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

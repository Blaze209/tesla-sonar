package okio;

import java.io.RandomAccessFile;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lokio/x;", "Lokio/m;", "", "readWrite", "Ljava/io/RandomAccessFile;", "randomAccessFile", "<init>", "(ZLjava/io/RandomAccessFile;)V", "", "H", "()J", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "C", "(J[BII)I", "Ljn0/h0;", "B", "()V", "e", "Ljava/io/RandomAccessFile;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final RandomAccessFile randomAccessFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z11, RandomAccessFile randomAccessFile) {
        super(z11);
        p013kotlin.jvm.internal.s.k(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    @Override // okio.m
    protected synchronized void B() {
        this.randomAccessFile.close();
    }

    @Override // okio.m
    protected synchronized int C(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        p013kotlin.jvm.internal.s.k(array, "array");
        this.randomAccessFile.seek(fileOffset);
        int i11 = 0;
        while (i11 < byteCount) {
            int i12 = this.randomAccessFile.read(array, arrayOffset, byteCount - i11);
            if (i12 == -1) {
                if (i11 != 0) {
                    break;
                }
                return -1;
            }
            i11 += i12;
        }
        return i11;
    }

    @Override // okio.m
    protected synchronized long H() {
        return this.randomAccessFile.length();
    }
}

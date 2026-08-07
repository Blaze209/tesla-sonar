package vl;

import android.graphics.Bitmap;
import java.io.Closeable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvl/a;", "Ljava/io/Closeable;", "", "frameNumber", "Ltk/a;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(ILtk/a;)V", "Ljn0/h0;", "close", "()V", "a", "I", "n", "()I", "setFrameNumber", "(I)V", "b", "Ltk/a;", "c", "()Ltk/a;", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int frameNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tk.a<Bitmap> bitmap;

    public a(int i11, tk.a<Bitmap> bitmap) {
        s.k(bitmap, "bitmap");
        this.frameNumber = i11;
        this.bitmap = bitmap;
    }

    public final tk.a<Bitmap> c() {
        return this.bitmap;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.bitmap.close();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getFrameNumber() {
        return this.frameNumber;
    }
}

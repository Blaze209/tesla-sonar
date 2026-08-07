package io.legere.pdfiumandroid;

import java.io.Closeable;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0011\u0010\u0006J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/legere/pdfiumandroid/FindResult;", "Ljava/io/Closeable;", "", "Lio/legere/pdfiumandroid/FindHandle;", "handle", "<init>", "(J)V", "findHandle", "", "nativeFindNext", "(J)Z", "nativeFindPrev", "", "nativeGetSchResultIndex", "(J)I", "nativeGetSchCount", "Ljn0/h0;", "nativeCloseFind", "findNext", "()Z", "findPrev", "getSchResultIndex", "()I", "getSchCount", "closeFind", "()V", "close", "J", "getHandle", "()J", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FindResult implements Closeable {
    private final long handle;

    public FindResult(long j11) {
        this.handle = j11;
    }

    private final native void nativeCloseFind(long findHandle);

    private final native boolean nativeFindNext(long findHandle);

    private final native boolean nativeFindPrev(long findHandle);

    private final native int nativeGetSchCount(long findHandle);

    private final native int nativeGetSchResultIndex(long findHandle);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nativeCloseFind(this.handle);
    }

    public final void closeFind() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            nativeCloseFind(this.handle);
            h0 h0Var = h0.f84049a;
        }
    }

    public final boolean findNext() {
        boolean zNativeFindNext;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            zNativeFindNext = nativeFindNext(this.handle);
        }
        return zNativeFindNext;
    }

    public final boolean findPrev() {
        boolean zNativeFindPrev;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            zNativeFindPrev = nativeFindPrev(this.handle);
        }
        return zNativeFindPrev;
    }

    public final long getHandle() {
        return this.handle;
    }

    public final int getSchCount() {
        int iNativeGetSchCount;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            iNativeGetSchCount = nativeGetSchCount(this.handle);
        }
        return iNativeGetSchCount;
    }

    public final int getSchResultIndex() {
        int iNativeGetSchResultIndex;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            iNativeGetSchResultIndex = nativeGetSchResultIndex(this.handle);
        }
        return iNativeGetSchResultIndex;
    }
}

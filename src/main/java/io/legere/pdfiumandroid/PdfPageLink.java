package io.legere.pdfiumandroid;

import android.graphics.RectF;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001d"}, d2 = {"Lio/legere/pdfiumandroid/PdfPageLink;", "Ljava/io/Closeable;", "", "pageLinkPtr", "<init>", "(J)V", "", "countWebLinks", "()I", "index", "length", "", "getURL", "(II)Ljava/lang/String;", "countRects", "(I)I", "linkIndex", "rectIndex", "Landroid/graphics/RectF;", "getRect", "(II)Landroid/graphics/RectF;", "Lkotlin/Pair;", "getTextRange", "(I)Lkotlin/Pair;", "Ljn0/h0;", "close", "()V", "J", "Companion", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfPageLink implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = PdfPageLink.class.getName();
    private final long pageLinkPtr;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0083 ¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0083 ¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0083 ¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0083 ¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/legere/pdfiumandroid/PdfPageLink$Companion;", "", "<init>", "()V", "", "pageLinkPtr", "Ljn0/h0;", "nativeClosePageLink", "(J)V", "", "nativeCountWebLinks", "(J)I", "index", "count", "", "result", "nativeGetURL", "(JII[B)I", "nativeCountRects", "(JI)I", "linkIndex", "rectIndex", "", "nativeGetRect", "(JII)[F", "", "nativeGetTextRange", "(JI)[I", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeClosePageLink(long pageLinkPtr) {
            PdfPageLink.nativeClosePageLink(pageLinkPtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int nativeCountRects(long pageLinkPtr, int index) {
            return PdfPageLink.nativeCountRects(pageLinkPtr, index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int nativeCountWebLinks(long pageLinkPtr) {
            return PdfPageLink.nativeCountWebLinks(pageLinkPtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] nativeGetRect(long pageLinkPtr, int linkIndex, int rectIndex) {
            return PdfPageLink.nativeGetRect(pageLinkPtr, linkIndex, rectIndex);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int[] nativeGetTextRange(long pageLinkPtr, int index) {
            return PdfPageLink.nativeGetTextRange(pageLinkPtr, index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int nativeGetURL(long pageLinkPtr, int index, int count, byte[] result) {
            return PdfPageLink.nativeGetURL(pageLinkPtr, index, count, result);
        }

        private Companion() {
        }
    }

    public PdfPageLink(long j11) {
        this.pageLinkPtr = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeClosePageLink(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeCountRects(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeCountWebLinks(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native float[] nativeGetRect(long j11, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int[] nativeGetTextRange(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeGetURL(long j11, int i11, int i12, byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        INSTANCE.nativeClosePageLink(this.pageLinkPtr);
    }

    public final int countRects(int index) {
        int iNativeCountRects;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            iNativeCountRects = INSTANCE.nativeCountRects(this.pageLinkPtr, index);
        }
        return iNativeCountRects;
    }

    public final int countWebLinks() {
        int iNativeCountWebLinks;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            iNativeCountWebLinks = INSTANCE.nativeCountWebLinks(this.pageLinkPtr);
        }
        return iNativeCountWebLinks;
    }

    public final RectF getRect(int linkIndex, int rectIndex) {
        RectF rectF;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            float[] fArrNativeGetRect = INSTANCE.nativeGetRect(this.pageLinkPtr, linkIndex, rectIndex);
            rectF = new RectF(fArrNativeGetRect[0], fArrNativeGetRect[1], fArrNativeGetRect[2], fArrNativeGetRect[3]);
        }
        return rectF;
    }

    public final Pair<Integer, Integer> getTextRange(int index) {
        Pair<Integer, Integer> pair;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            int[] iArrNativeGetTextRange = INSTANCE.nativeGetTextRange(this.pageLinkPtr, index);
            pair = new Pair<>(Integer.valueOf(iArrNativeGetTextRange[0]), Integer.valueOf(iArrNativeGetTextRange[1]));
        }
        return pair;
    }

    public final String getURL(int index, int length) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                byte[] bArr = new byte[length * 2];
                if (INSTANCE.nativeGetURL(this.pageLinkPtr, index, length, bArr) <= 0) {
                    return "";
                }
                Charset UTF_16LE = StandardCharsets.UTF_16LE;
                s.j(UTF_16LE, "UTF_16LE");
                return new String(bArr, UTF_16LE);
            } catch (NullPointerException e11) {
                Logger logger = Logger.INSTANCE;
                String TAG2 = TAG;
                s.j(TAG2, "TAG");
                logger.e(TAG2, e11, "mContext may be null");
                return null;
            } catch (Exception e12) {
                Logger logger2 = Logger.INSTANCE;
                String TAG3 = TAG;
                s.j(TAG3, "TAG");
                logger2.e(TAG3, e12, "Exception throw from native");
                return null;
            }
        }
    }
}

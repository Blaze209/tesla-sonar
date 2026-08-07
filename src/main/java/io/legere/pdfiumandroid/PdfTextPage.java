package io.legere.pdfiumandroid;

import android.graphics.RectF;
import dalvik.annotation.optimization.FastNative;
import io.legere.pdfiumandroid.util.ConfigKt;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import pn0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 O2\u00020\u0001:\u0001OB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u001bJ\u001d\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u0004\u0018\u00010\u00112\u0006\u0010.\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u0004¢\u0006\u0004\b2\u00103J-\u00109\u001a\u0004\u0018\u0001082\u0006\u00104\u001a\u00020\u00112\f\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010HR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lio/legere/pdfiumandroid/PdfTextPage;", "Ljava/io/Closeable;", "Lio/legere/pdfiumandroid/PdfDocument;", "doc", "", "pageIndex", "", "pagePtr", "", "Lio/legere/pdfiumandroid/PdfDocument$PageCount;", "pageMap", "<init>", "(Lio/legere/pdfiumandroid/PdfDocument;IJLjava/util/Map;)V", "textPageCountChars", "()I", "startIndex", "length", "", "textPageGetTextLegacy", "(II)Ljava/lang/String;", "textPageGetText", "index", "", "textPageGetUnicode", "(I)C", "Landroid/graphics/RectF;", "textPageGetCharBox", "(I)Landroid/graphics/RectF;", "", "x", "y", "xTolerance", "yTolerance", "textPageGetCharIndexAtPos", "(DDDD)I", "count", "textPageCountRects", "(II)I", "rectIndex", "textPageGetRect", "", "wordRanges", "", "Lio/legere/pdfiumandroid/WordRangeRect;", "textPageGetRectsForRanges", "([I)Ljava/util/List;", "rect", "textPageGetBoundedText", "(Landroid/graphics/RectF;I)Ljava/lang/String;", "charIndex", "getFontSize", "(I)D", "findWhat", "", "Lio/legere/pdfiumandroid/FindFlags;", "flags", "Lio/legere/pdfiumandroid/FindResult;", "findStart", "(Ljava/lang/String;Ljava/util/Set;I)Lio/legere/pdfiumandroid/FindResult;", "Lio/legere/pdfiumandroid/PdfPageLink;", "loadWebLink", "()Lio/legere/pdfiumandroid/PdfPageLink;", "Ljn0/h0;", "close", "()V", "Lio/legere/pdfiumandroid/PdfDocument;", "getDoc", "()Lio/legere/pdfiumandroid/PdfDocument;", "I", "getPageIndex", "J", "getPagePtr", "()J", "Ljava/util/Map;", "getPageMap", "()Ljava/util/Map;", "", "isClosed", "Z", "Companion", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfTextPage implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = PdfTextPage.class.getName();
    private final PdfDocument doc;
    private volatile boolean isClosed;
    private final int pageIndex;
    private final Map<Integer, PdfDocument.PageCount> pageMap;
    private final long pagePtr;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0012\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0083 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\nH\u0083 ¢\u0006\u0004\b\u0012\u0010\u0010J\"\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0083 ¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0083 ¢\u0006\u0004\b\u001e\u0010\u001fJ0\u0010$\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0083 ¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b&\u0010'J8\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0017H\u0083 ¢\u0006\u0004\b,\u0010-J0\u00100\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u001cH\u0083 ¢\u0006\u0004\b0\u00101J0\u00103\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u000202H\u0083 ¢\u0006\u0004\b3\u00104J \u00105\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0083 ¢\u0006\u0004\b5\u00106J(\u00107\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0083 ¢\u0006\u0004\b7\u00108J \u0010:\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00109\u001a\u00020\nH\u0083 ¢\u0006\u0004\b:\u0010;R\u001c\u0010=\u001a\n <*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lio/legere/pdfiumandroid/PdfTextPage$Companion;", "", "<init>", "()V", "", "pagePtr", "Ljn0/h0;", "nativeCloseTextPage", "(J)V", "textPagePtr", "", "nativeTextCountChars", "(J)I", "index", "", "nativeTextGetCharBox", "(JI)[D", "rectIndex", "nativeTextGetRect", "", "wordRanges", "nativeTextGetRects", "(J[I)[D", "", "left", "top", "right", "bottom", "", "arr", "nativeTextGetBoundedText", "(JDDDD[S)I", "", "findWhat", "flags", "startIndex", "nativeFindStart", "(JLjava/lang/String;II)J", "nativeLoadWebLink", "(J)J", "x", "y", "xTolerance", "yTolerance", "nativeTextGetCharIndexAtPos", "(JDDDD)I", "count", "result", "nativeTextGetText", "(JII[S)I", "", "nativeTextGetTextByteArray", "(JII[B)I", "nativeTextGetUnicode", "(JI)I", "nativeTextCountRects", "(JII)I", "charIndex", "nativeGetFontSize", "(JI)D", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeCloseTextPage(long pagePtr) {
            PdfTextPage.nativeCloseTextPage(pagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long nativeFindStart(long textPagePtr, String findWhat, int flags, int startIndex) {
            return PdfTextPage.nativeFindStart(textPagePtr, findWhat, flags, startIndex);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final double nativeGetFontSize(long pagePtr, int charIndex) {
            return PdfTextPage.nativeGetFontSize(pagePtr, charIndex);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long nativeLoadWebLink(long textPagePtr) {
            return PdfTextPage.nativeLoadWebLink(textPagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final int nativeTextCountChars(long textPagePtr) {
            return PdfTextPage.nativeTextCountChars(textPagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final int nativeTextCountRects(long textPagePtr, int startIndex, int count) {
            return PdfTextPage.nativeTextCountRects(textPagePtr, startIndex, count);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final int nativeTextGetBoundedText(long textPagePtr, double left, double top, double right, double bottom, short[] arr) {
            return PdfTextPage.nativeTextGetBoundedText(textPagePtr, left, top, right, bottom, arr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final double[] nativeTextGetCharBox(long textPagePtr, int index) {
            return PdfTextPage.nativeTextGetCharBox(textPagePtr, index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int nativeTextGetCharIndexAtPos(long textPagePtr, double x11, double y11, double xTolerance, double yTolerance) {
            return PdfTextPage.nativeTextGetCharIndexAtPos(textPagePtr, x11, y11, xTolerance, yTolerance);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final double[] nativeTextGetRect(long textPagePtr, int rectIndex) {
            return PdfTextPage.nativeTextGetRect(textPagePtr, rectIndex);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final double[] nativeTextGetRects(long textPagePtr, int[] wordRanges) {
            return PdfTextPage.nativeTextGetRects(textPagePtr, wordRanges);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int nativeTextGetText(long textPagePtr, int startIndex, int count, short[] result) {
            return PdfTextPage.nativeTextGetText(textPagePtr, startIndex, count, result);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int nativeTextGetTextByteArray(long textPagePtr, int startIndex, int count, byte[] result) {
            return PdfTextPage.nativeTextGetTextByteArray(textPagePtr, startIndex, count, result);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final int nativeTextGetUnicode(long textPagePtr, int index) {
            return PdfTextPage.nativeTextGetUnicode(textPagePtr, index);
        }

        private Companion() {
        }
    }

    public PdfTextPage(PdfDocument doc, int i11, long j11, Map<Integer, PdfDocument.PageCount> pageMap) {
        s.k(doc, "doc");
        s.k(pageMap, "pageMap");
        this.doc = doc;
        this.pageIndex = i11;
        this.pagePtr = j11;
        this.pageMap = pageMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeCloseTextPage(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeFindStart(long j11, String str, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native double nativeGetFontSize(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeLoadWebLink(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native int nativeTextCountChars(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native int nativeTextCountRects(long j11, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native int nativeTextGetBoundedText(long j11, double d11, double d12, double d13, double d14, short[] sArr);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native double[] nativeTextGetCharBox(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeTextGetCharIndexAtPos(long j11, double d11, double d12, double d13, double d14);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native double[] nativeTextGetRect(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native double[] nativeTextGetRects(long j11, int[] iArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeTextGetText(long j11, int i11, int i12, short[] sArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeTextGetTextByteArray(long j11, int i11, int i12, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native int nativeTextGetUnicode(long j11, int i11);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return;
                }
                PdfDocument.PageCount pageCount = this.pageMap.get(Integer.valueOf(this.pageIndex));
                if (pageCount != null) {
                    if (pageCount.getCount() > 1) {
                        pageCount.setCount(pageCount.getCount() - 1);
                        return;
                    }
                    this.pageMap.remove(Integer.valueOf(this.pageIndex));
                    this.isClosed = true;
                    INSTANCE.nativeCloseTextPage(this.pagePtr);
                    h0 h0Var = h0.f84049a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final FindResult findStart(String findWhat, Set<? extends FindFlags> flags, int startIndex) {
        s.k(findWhat, "findWhat");
        s.k(flags, "flags");
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return null;
                }
                Iterator<T> it = flags.iterator();
                int value = 0;
                while (it.hasNext()) {
                    value |= ((FindFlags) it.next()).getValue();
                }
                return new FindResult(INSTANCE.nativeFindStart(this.pagePtr, findWhat, value, startIndex));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final PdfDocument getDoc() {
        return this.doc;
    }

    public final double getFontSize(int charIndex) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return 0.0d;
                }
                return INSTANCE.nativeGetFontSize(this.pagePtr, charIndex);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final Map<Integer, PdfDocument.PageCount> getPageMap() {
        return this.pageMap;
    }

    public final long getPagePtr() {
        return this.pagePtr;
    }

    public final PdfPageLink loadWebLink() {
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        return new PdfPageLink(INSTANCE.nativeLoadWebLink(this.pagePtr));
    }

    public final int textPageCountChars() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return -1;
                }
                return INSTANCE.nativeTextCountChars(this.pagePtr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int textPageCountRects(int startIndex, int count) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (this.isClosed || this.doc.getIsClosed()) {
                throw new IllegalStateException("Already closed");
            }
            try {
                return INSTANCE.nativeTextCountRects(this.pagePtr, startIndex, count);
            } catch (NullPointerException e11) {
                Logger logger = Logger.INSTANCE;
                String TAG2 = TAG;
                s.j(TAG2, "TAG");
                logger.e(TAG2, e11, "mContext may be null");
                h0 h0Var = h0.f84049a;
                return -1;
            } catch (Exception e12) {
                Logger logger2 = Logger.INSTANCE;
                String TAG3 = TAG;
                s.j(TAG3, "TAG");
                logger2.e(TAG3, e12, "Exception throw from native");
                h0 h0Var2 = h0.f84049a;
                return -1;
            }
        }
    }

    public final String textPageGetBoundedText(RectF rect, int length) {
        s.k(rect, "rect");
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                String str = null;
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return null;
                }
                try {
                    try {
                        short[] sArr = new short[length + 1];
                        int iNativeTextGetBoundedText = INSTANCE.nativeTextGetBoundedText(this.pagePtr, rect.left, rect.top, rect.right, rect.bottom, sArr) - 1;
                        byte[] bArr = new byte[iNativeTextGetBoundedText * 2];
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                        for (int i11 = 0; i11 < iNativeTextGetBoundedText; i11++) {
                            byteBufferWrap.putShort(sArr[i11]);
                        }
                        Charset UTF_16LE = StandardCharsets.UTF_16LE;
                        s.j(UTF_16LE, "UTF_16LE");
                        str = new String(bArr, UTF_16LE);
                    } catch (Exception e11) {
                        Logger logger = Logger.INSTANCE;
                        String TAG2 = TAG;
                        s.j(TAG2, "TAG");
                        logger.e(TAG2, e11, "Exception throw from native");
                    }
                } catch (NullPointerException e12) {
                    Logger logger2 = Logger.INSTANCE;
                    String TAG3 = TAG;
                    s.j(TAG3, "TAG");
                    logger2.e(TAG3, e12, "mContext may be null");
                }
                return str;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final RectF textPageGetCharBox(int index) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return null;
                }
                try {
                    double[] dArrNativeTextGetCharBox = INSTANCE.nativeTextGetCharBox(this.pagePtr, index);
                    RectF rectF = new RectF();
                    rectF.left = (float) dArrNativeTextGetCharBox[0];
                    rectF.right = (float) dArrNativeTextGetCharBox[1];
                    rectF.bottom = (float) dArrNativeTextGetCharBox[2];
                    rectF.top = (float) dArrNativeTextGetCharBox[3];
                    return rectF;
                } catch (NullPointerException e11) {
                    Logger logger = Logger.INSTANCE;
                    String TAG2 = TAG;
                    s.j(TAG2, "TAG");
                    logger.e(TAG2, e11, "mContext may be null");
                    h0 h0Var = h0.f84049a;
                    return null;
                } catch (Exception e12) {
                    Logger logger2 = Logger.INSTANCE;
                    String TAG3 = TAG;
                    s.j(TAG3, "TAG");
                    logger2.e(TAG3, e12, "Exception throw from native");
                    h0 h0Var2 = h0.f84049a;
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int textPageGetCharIndexAtPos(double x11, double y11, double xTolerance, double yTolerance) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return -1;
                }
                try {
                    return INSTANCE.nativeTextGetCharIndexAtPos(this.pagePtr, x11, y11, xTolerance, yTolerance);
                } catch (Exception e11) {
                    Logger logger = Logger.INSTANCE;
                    String TAG2 = TAG;
                    s.j(TAG2, "TAG");
                    logger.e(TAG2, e11, "Exception throw from native");
                    h0 h0Var = h0.f84049a;
                    return -1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final RectF textPageGetRect(int rectIndex) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                RectF rectF = null;
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return null;
                }
                try {
                    double[] dArrNativeTextGetRect = INSTANCE.nativeTextGetRect(this.pagePtr, rectIndex);
                    RectF rectF2 = new RectF();
                    rectF2.left = (float) dArrNativeTextGetRect[0];
                    rectF2.top = (float) dArrNativeTextGetRect[1];
                    rectF2.right = (float) dArrNativeTextGetRect[2];
                    rectF2.bottom = (float) dArrNativeTextGetRect[3];
                    rectF = rectF2;
                } catch (NullPointerException e11) {
                    Logger logger = Logger.INSTANCE;
                    String TAG2 = TAG;
                    s.j(TAG2, "TAG");
                    logger.e(TAG2, e11, "mContext may be null");
                } catch (Exception e12) {
                    Logger logger2 = Logger.INSTANCE;
                    String TAG3 = TAG;
                    s.j(TAG3, "TAG");
                    logger2.e(TAG3, e12, "Exception throw from native");
                }
                return rectF;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final List<WordRangeRect> textPageGetRectsForRanges(int[] wordRanges) {
        s.k(wordRanges, "wordRanges");
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                int i11 = 0;
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return null;
                }
                double[] dArrNativeTextGetRects = INSTANCE.nativeTextGetRects(this.pagePtr, wordRanges);
                if (dArrNativeTextGetRects == null) {
                    h0 h0Var = h0.f84049a;
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int iC = c.c(0, dArrNativeTextGetRects.length - 1, 6);
                if (iC >= 0) {
                    while (true) {
                        RectF rectF = new RectF();
                        rectF.left = (float) dArrNativeTextGetRects[i11];
                        rectF.top = (float) dArrNativeTextGetRects[i11 + 1];
                        rectF.right = (float) dArrNativeTextGetRects[i11 + 2];
                        rectF.bottom = (float) dArrNativeTextGetRects[i11 + 3];
                        arrayList.add(new WordRangeRect((int) dArrNativeTextGetRects[i11 + 4], (int) dArrNativeTextGetRects[i11 + 5], rectF));
                        if (i11 == iC) {
                            break;
                        }
                        i11 += 6;
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String textPageGetText(int startIndex, int length) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return null;
                }
                try {
                    try {
                        byte[] bArr = new byte[length * 2];
                        if (INSTANCE.nativeTextGetTextByteArray(this.pagePtr, startIndex, length, bArr) <= 0) {
                            return "";
                        }
                        Charset UTF_16LE = StandardCharsets.UTF_16LE;
                        s.j(UTF_16LE, "UTF_16LE");
                        return new String(bArr, UTF_16LE);
                    } catch (Exception e11) {
                        Logger logger = Logger.INSTANCE;
                        String TAG2 = TAG;
                        s.j(TAG2, "TAG");
                        logger.e(TAG2, e11, "Exception throw from native");
                        return null;
                    }
                } catch (NullPointerException e12) {
                    Logger logger2 = Logger.INSTANCE;
                    String TAG3 = TAG;
                    s.j(TAG3, "TAG");
                    logger2.e(TAG3, e12, "mContext may be null");
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String textPageGetTextLegacy(int startIndex, int length) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return null;
                }
                try {
                    short[] sArr = new short[length + 1];
                    int iNativeTextGetText = INSTANCE.nativeTextGetText(this.pagePtr, startIndex, length, sArr);
                    if (iNativeTextGetText <= 0) {
                        return "";
                    }
                    int i11 = iNativeTextGetText - 1;
                    byte[] bArr = new byte[i11 * 2];
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    for (int i12 = 0; i12 < i11; i12++) {
                        byteBufferWrap.putShort(sArr[i12]);
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final char textPageGetUnicode(int index) {
        char cNativeTextGetUnicode;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (this.isClosed || this.doc.getIsClosed()) {
                throw new IllegalStateException("Already closed");
            }
            cNativeTextGetUnicode = (char) INSTANCE.nativeTextGetUnicode(this.pagePtr, index);
        }
        return cNativeTextGetUnicode;
    }
}

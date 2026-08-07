package io.legere.pdfiumandroid;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import ch.qos.logback.core.CoreConstants;
import io.legere.pdfiumandroid.util.ConfigKt;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.e;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import z6.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u0080\u00012\u00020\u0001:\n\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0080\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0010\u0010\u0005J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0082 ¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u001d\u0010\u001cJ \u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u001e\u0010\u001cJ \u0010 \u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b \u0010\u001cJ\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b!\u0010\"J(\u0010'\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b*\u0010+J`\u00107\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b7\u00108JP\u0010;\u001a\u00020&2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010:\u001a\u0002092\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b;\u0010<J-\u0010A\u001a\u00020\r2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u0002H\u0002¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0007¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020)¢\u0006\u0004\bE\u0010FJ\u0015\u0010H\u001a\u00020G2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010KJ#\u0010M\u001a\b\u0012\u0004\u0012\u00020G0L2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\bM\u0010NJw\u0010U\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020G0L2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0L2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020S0L2\b\b\u0002\u00103\u001a\u00020&2\b\b\u0002\u00104\u001a\u00020&2\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u0007¢\u0006\u0004\bU\u0010VJg\u0010U\u001a\u00020&2\u0006\u0010:\u001a\u0002092\f\u0010,\u001a\b\u0012\u0004\u0012\u00020G0L2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0L2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020S0L2\b\b\u0002\u00103\u001a\u00020&2\b\b\u0002\u00104\u001a\u00020&2\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u0007¢\u0006\u0004\bU\u0010WJ\r\u0010Y\u001a\u00020X¢\u0006\u0004\bY\u0010ZJ\u0013\u0010[\u001a\b\u0012\u0004\u0012\u00020>0L¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020^2\u0006\u0010]\u001a\u00020GH\u0007¢\u0006\u0004\b_\u0010`J#\u0010a\u001a\b\u0012\u0004\u0012\u00020^0L2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\ba\u0010NJ\u001f\u0010b\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u0007¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\rH\u0016¢\u0006\u0004\bd\u0010eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010f\u001a\u0004\bg\u0010hR \u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020j0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR \u0010m\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020j0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010lR$\u0010o\u001a\u00020&2\u0006\u0010n\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bo\u0010qR$\u0010s\u001a\u0004\u0018\u00010r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010z\u001a\u0004\u0018\u00010y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f¨\u0006\u0085\u0001"}, d2 = {"Lio/legere/pdfiumandroid/PdfDocument;", "Ljava/io/Closeable;", "", "mNativeDocPtr", "<init>", "(J)V", "docPtr", "", "nativeGetPageCount", "(J)I", "pageIndex", "nativeLoadPage", "(JI)J", "Ljn0/h0;", "nativeDeletePage", "(JI)V", "nativeCloseDocument", "fromIndex", "toIndex", "", "nativeLoadPages", "(JII)[J", "", "tag", "nativeGetDocumentMetaText", "(JLjava/lang/String;)Ljava/lang/String;", "bookmarkPtr", "nativeGetFirstChildBookmark", "(JJ)J", "nativeGetSiblingBookmark", "nativeGetBookmarkDestIndex", "pagePtr", "nativeLoadTextPage", "nativeGetBookmarkTitle", "(J)Ljava/lang/String;", "Lio/legere/pdfiumandroid/PdfWriteCallback;", "callback", "flags", "", "nativeSaveAsCopy", "(JLio/legere/pdfiumandroid/PdfWriteCallback;I)Z", "", "nativeGetPageCharCounts", "(J)[I", "pages", "bufferPtr", "drawSizeHor", "drawSizeVer", "", "matrixFloats", "clipFloats", "renderAnnot", "textMask", "canvasColor", "pageBackgroundColor", "nativeRenderPagesWithMatrix", "([JJII[F[FZZII)V", "Landroid/view/Surface;", "surface", "nativeRenderPagesSurfaceWithMatrix", "([JLandroid/view/Surface;[F[FZZII)Z", "", "Lio/legere/pdfiumandroid/PdfDocument$Bookmark;", "tree", "level", "recursiveGetBookmark", "(Ljava/util/List;JJ)V", "getPageCount", "()I", "getPageCharCounts", "()[I", "Lio/legere/pdfiumandroid/PdfPage;", "openPage", "(I)Lio/legere/pdfiumandroid/PdfPage;", "deletePage", "(I)V", "", "openPages", "(II)Ljava/util/List;", "drawSizeX", "drawSizeY", "Landroid/graphics/Matrix;", "matrices", "Landroid/graphics/RectF;", "clipRects", "renderPages", "(JIILjava/util/List;Ljava/util/List;Ljava/util/List;ZZII)V", "(Landroid/view/Surface;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZII)Z", "Lio/legere/pdfiumandroid/PdfDocument$Meta;", "getDocumentMeta", "()Lio/legere/pdfiumandroid/PdfDocument$Meta;", "getTableOfContents", "()Ljava/util/List;", "page", "Lio/legere/pdfiumandroid/PdfTextPage;", "openTextPage", "(Lio/legere/pdfiumandroid/PdfPage;)Lio/legere/pdfiumandroid/PdfTextPage;", "openTextPages", "saveAsCopy", "(Lio/legere/pdfiumandroid/PdfWriteCallback;I)Z", "close", "()V", "J", "getMNativeDocPtr", "()J", "", "Lio/legere/pdfiumandroid/PdfDocument$PageCount;", "pageMap", "Ljava/util/Map;", "textPageMap", "value", "isClosed", "Z", "()Z", "Landroid/os/ParcelFileDescriptor;", "parcelFileDescriptor", "Landroid/os/ParcelFileDescriptor;", "getParcelFileDescriptor", "()Landroid/os/ParcelFileDescriptor;", "setParcelFileDescriptor", "(Landroid/os/ParcelFileDescriptor;)V", "Lio/legere/pdfiumandroid/PdfiumSource;", "source", "Lio/legere/pdfiumandroid/PdfiumSource;", "getSource", "()Lio/legere/pdfiumandroid/PdfiumSource;", "setSource", "(Lio/legere/pdfiumandroid/PdfiumSource;)V", "Companion", "Meta", "Bookmark", "Link", "PageCount", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfDocument implements Closeable {
    public static final int FPDF_INCREMENTAL = 1;
    public static final int FPDF_NO_INCREMENTAL = 2;
    public static final int FPDF_REMOVE_SECURITY = 3;
    private volatile boolean isClosed;
    private final long mNativeDocPtr;
    private ParcelFileDescriptor parcelFileDescriptor;
    private PdfiumSource source;
    private static final String TAG = PdfDocument.class.getName();
    private final Map<Integer, PageCount> pageMap = new LinkedHashMap();
    private final Map<Integer, PageCount> textPageMap = new LinkedHashMap();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lio/legere/pdfiumandroid/PdfDocument$Bookmark;", "", "<init>", "()V", "children", "", "getChildren", "()Ljava/util/List;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "pageIdx", "", "getPageIdx", "()J", "setPageIdx", "(J)V", "mNativePtr", "getMNativePtr", "setMNativePtr", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Bookmark {
        private final List<Bookmark> children = new ArrayList();
        private long mNativePtr;
        private long pageIdx;
        private String title;

        public final List<Bookmark> getChildren() {
            return this.children;
        }

        public final long getMNativePtr() {
            return this.mNativePtr;
        }

        public final long getPageIdx() {
            return this.pageIdx;
        }

        public final String getTitle() {
            return this.title;
        }

        public final void setMNativePtr(long j11) {
            this.mNativePtr = j11;
        }

        public final void setPageIdx(long j11) {
            this.pageIdx = j11;
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/legere/pdfiumandroid/PdfDocument$Link;", "", "bounds", "Landroid/graphics/RectF;", "destPageIdx", "", "uri", "", "<init>", "(Landroid/graphics/RectF;Ljava/lang/Integer;Ljava/lang/String;)V", "getBounds", "()Landroid/graphics/RectF;", "getDestPageIdx", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUri", "()Ljava/lang/String;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Link {
        private final RectF bounds;
        private final Integer destPageIdx;
        private final String uri;

        public Link(RectF bounds, Integer num, String str) {
            s.k(bounds, "bounds");
            this.bounds = bounds;
            this.destPageIdx = num;
            this.uri = str;
        }

        public final RectF getBounds() {
            return this.bounds;
        }

        public final Integer getDestPageIdx() {
            return this.destPageIdx;
        }

        public final String getUri() {
            return this.uri;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006\u001f"}, d2 = {"Lio/legere/pdfiumandroid/PdfDocument$Meta;", "", "<init>", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "author", "getAuthor", "setAuthor", "subject", "getSubject", "setSubject", "keywords", "getKeywords", "setKeywords", "creator", "getCreator", "setCreator", "producer", "getProducer", "setProducer", "creationDate", "getCreationDate", "setCreationDate", "modDate", "getModDate", "setModDate", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Meta {
        private String author;
        private String creationDate;
        private String creator;
        private String keywords;
        private String modDate;
        private String producer;
        private String subject;
        private String title;

        public final String getAuthor() {
            return this.author;
        }

        public final String getCreationDate() {
            return this.creationDate;
        }

        public final String getCreator() {
            return this.creator;
        }

        public final String getKeywords() {
            return this.keywords;
        }

        public final String getModDate() {
            return this.modDate;
        }

        public final String getProducer() {
            return this.producer;
        }

        public final String getSubject() {
            return this.subject;
        }

        public final String getTitle() {
            return this.title;
        }

        public final void setAuthor(String str) {
            this.author = str;
        }

        public final void setCreationDate(String str) {
            this.creationDate = str;
        }

        public final void setCreator(String str) {
            this.creator = str;
        }

        public final void setKeywords(String str) {
            this.keywords = str;
        }

        public final void setModDate(String str) {
            this.modDate = str;
        }

        public final void setProducer(String str) {
            this.producer = str;
        }

        public final void setSubject(String str) {
            this.subject = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lio/legere/pdfiumandroid/PdfDocument$PageCount;", "", "pagePtr", "", "count", "", "<init>", "(JI)V", "getPagePtr", "()J", "getCount", "()I", "setCount", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PageCount {
        private int count;
        private final long pagePtr;

        public PageCount(long j11, int i11) {
            this.pagePtr = j11;
            this.count = i11;
        }

        public static /* synthetic */ PageCount copy$default(PageCount pageCount, long j11, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j11 = pageCount.pagePtr;
            }
            if ((i12 & 2) != 0) {
                i11 = pageCount.count;
            }
            return pageCount.copy(j11, i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getPagePtr() {
            return this.pagePtr;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public final PageCount copy(long pagePtr, int count) {
            return new PageCount(pagePtr, count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageCount)) {
                return false;
            }
            PageCount pageCount = (PageCount) other;
            return this.pagePtr == pageCount.pagePtr && this.count == pageCount.count;
        }

        public final int getCount() {
            return this.count;
        }

        public final long getPagePtr() {
            return this.pagePtr;
        }

        public int hashCode() {
            return (Long.hashCode(this.pagePtr) * 31) + Integer.hashCode(this.count);
        }

        public final void setCount(int i11) {
            this.count = i11;
        }

        public String toString() {
            return "PageCount(pagePtr=" + this.pagePtr + ", count=" + this.count + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public PdfDocument(long j11) {
        this.mNativeDocPtr = j11;
    }

    private final native void nativeCloseDocument(long docPtr);

    private final native void nativeDeletePage(long docPtr, int pageIndex);

    private final native long nativeGetBookmarkDestIndex(long docPtr, long bookmarkPtr);

    private final native String nativeGetBookmarkTitle(long bookmarkPtr);

    private final native String nativeGetDocumentMetaText(long docPtr, String tag);

    private final native long nativeGetFirstChildBookmark(long docPtr, long bookmarkPtr);

    private final native int[] nativeGetPageCharCounts(long docPtr);

    private final native int nativeGetPageCount(long docPtr);

    private final native long nativeGetSiblingBookmark(long docPtr, long bookmarkPtr);

    private final native long nativeLoadPage(long docPtr, int pageIndex);

    private final native long[] nativeLoadPages(long docPtr, int fromIndex, int toIndex);

    private final native long nativeLoadTextPage(long docPtr, long pagePtr);

    private final native boolean nativeRenderPagesSurfaceWithMatrix(long[] pages, Surface surface, float[] matrixFloats, float[] clipFloats, boolean renderAnnot, boolean textMask, int canvasColor, int pageBackgroundColor);

    private final native void nativeRenderPagesWithMatrix(long[] pages, long bufferPtr, int drawSizeHor, int drawSizeVer, float[] matrixFloats, float[] clipFloats, boolean renderAnnot, boolean textMask, int canvasColor, int pageBackgroundColor);

    private final native boolean nativeSaveAsCopy(long docPtr, PdfWriteCallback callback, int flags);

    private final void recursiveGetBookmark(List<Bookmark> tree, long bookmarkPtr, long level) {
        long j11;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
                    return;
                }
                Bookmark bookmark = new Bookmark();
                bookmark.setMNativePtr(bookmarkPtr);
                bookmark.setTitle(nativeGetBookmarkTitle(bookmarkPtr));
                bookmark.setPageIdx(nativeGetBookmarkDestIndex(this.mNativeDocPtr, bookmarkPtr));
                tree.add(bookmark);
                long jNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(this.mNativeDocPtr, bookmarkPtr);
                if (jNativeGetFirstChildBookmark == 0 || level >= 16) {
                    j11 = level;
                } else {
                    recursiveGetBookmark(bookmark.getChildren(), jNativeGetFirstChildBookmark, level);
                    j11 = level + 1;
                }
                long jNativeGetSiblingBookmark = nativeGetSiblingBookmark(this.mNativeDocPtr, bookmarkPtr);
                if (jNativeGetSiblingBookmark != 0 && j11 < 16) {
                    recursiveGetBookmark(tree, jNativeGetSiblingBookmark, j11);
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void renderPages$default(PdfDocument pdfDocument, long j11, int i11, int i12, List list, List list2, List list3, boolean z11, boolean z12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 64) != 0) {
            z11 = false;
        }
        if ((i15 & 128) != 0) {
            z12 = false;
        }
        if ((i15 & 256) != 0) {
            i13 = -8092540;
        }
        if ((i15 & 512) != 0) {
            i14 = -1;
        }
        pdfDocument.renderPages(j11, i11, i12, list, list2, list3, z11, z12, i13, i14);
    }

    public static /* synthetic */ boolean saveAsCopy$default(PdfDocument pdfDocument, PdfWriteCallback pdfWriteCallback, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 2;
        }
        return pdfDocument.saveAsCopy(pdfWriteCallback, i11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
                    return;
                }
                Logger logger = Logger.INSTANCE;
                String TAG2 = TAG;
                s.j(TAG2, "TAG");
                logger.d(TAG2, "PdfDocument.close");
                this.isClosed = true;
                nativeCloseDocument(this.mNativeDocPtr);
                ParcelFileDescriptor parcelFileDescriptor = this.parcelFileDescriptor;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                this.parcelFileDescriptor = null;
                PdfiumSource pdfiumSource = this.source;
                if (pdfiumSource != null) {
                    b.a(pdfiumSource);
                }
                this.source = null;
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void deletePage(int pageIndex) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
                return;
            }
            nativeDeletePage(this.mNativeDocPtr, pageIndex);
            h0 h0Var = h0.f84049a;
        }
    }

    public final Meta getDocumentMeta() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
                return new Meta();
            }
            Meta meta = new Meta();
            meta.setTitle(nativeGetDocumentMetaText(this.mNativeDocPtr, "Title"));
            meta.setAuthor(nativeGetDocumentMetaText(this.mNativeDocPtr, "Author"));
            meta.setSubject(nativeGetDocumentMetaText(this.mNativeDocPtr, "Subject"));
            meta.setKeywords(nativeGetDocumentMetaText(this.mNativeDocPtr, "Keywords"));
            meta.setCreator(nativeGetDocumentMetaText(this.mNativeDocPtr, "Creator"));
            meta.setProducer(nativeGetDocumentMetaText(this.mNativeDocPtr, "Producer"));
            meta.setCreationDate(nativeGetDocumentMetaText(this.mNativeDocPtr, "CreationDate"));
            meta.setModDate(nativeGetDocumentMetaText(this.mNativeDocPtr, "ModDate"));
            return meta;
        }
    }

    public final long getMNativeDocPtr() {
        return this.mNativeDocPtr;
    }

    public final int[] getPageCharCounts() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
                return new int[0];
            }
            return nativeGetPageCharCounts(this.mNativeDocPtr);
        }
    }

    public final int getPageCount() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
                return 0;
            }
            return nativeGetPageCount(this.mNativeDocPtr);
        }
    }

    public final ParcelFileDescriptor getParcelFileDescriptor() {
        return this.parcelFileDescriptor;
    }

    public final PdfiumSource getSource() {
        return this.source;
    }

    public final List<Bookmark> getTableOfContents() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
                return v.m();
            }
            ArrayList arrayList = new ArrayList();
            long jNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(this.mNativeDocPtr, 0L);
            if (jNativeGetFirstChildBookmark != 0) {
                recursiveGetBookmark(arrayList, jNativeGetFirstChildBookmark, 1L);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: isClosed, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    public final PdfPage openPage(int pageIndex) {
        PageCount pageCount;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (this.isClosed) {
                throw new IllegalStateException("Already closed");
            }
            if (this.pageMap.containsKey(Integer.valueOf(pageIndex)) && (pageCount = this.pageMap.get(Integer.valueOf(pageIndex))) != null) {
                pageCount.setCount(pageCount.getCount() + 1);
                return new PdfPage(this, pageIndex, pageCount.getPagePtr(), this.pageMap);
            }
            long jNativeLoadPage = nativeLoadPage(this.mNativeDocPtr, pageIndex);
            this.pageMap.put(Integer.valueOf(pageIndex), new PageCount(jNativeLoadPage, 1));
            return new PdfPage(this, pageIndex, jNativeLoadPage, this.pageMap);
        }
    }

    public final List<PdfPage> openPages(int fromIndex, int toIndex) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
                return v.m();
            }
            long[] jArrNativeLoadPages = nativeLoadPages(this.mNativeDocPtr, fromIndex, toIndex);
            int i11 = fromIndex;
            for (long j11 : jArrNativeLoadPages) {
                if (i11 > toIndex) {
                    break;
                }
                i11++;
            }
            ArrayList arrayList = new ArrayList(jArrNativeLoadPages.length);
            for (long j12 : jArrNativeLoadPages) {
                arrayList.add(new PdfPage(this, i11, j12, this.pageMap));
            }
            return arrayList;
        }
    }

    @e
    public final PdfTextPage openTextPage(PdfPage page) {
        PageCount pageCount;
        s.k(page, "page");
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (this.isClosed) {
                throw new IllegalStateException("Already closed");
            }
            if (this.textPageMap.containsKey(Integer.valueOf(page.getPageIndex())) && (pageCount = this.textPageMap.get(Integer.valueOf(page.getPageIndex()))) != null) {
                pageCount.setCount(pageCount.getCount() + 1);
                return new PdfTextPage(this, page.getPageIndex(), pageCount.getPagePtr(), this.textPageMap);
            }
            long jNativeLoadTextPage = nativeLoadTextPage(this.mNativeDocPtr, page.getPagePtr());
            this.textPageMap.put(Integer.valueOf(page.getPageIndex()), new PageCount(jNativeLoadTextPage, 1));
            return new PdfTextPage(this, page.getPageIndex(), jNativeLoadTextPage, this.textPageMap);
        }
    }

    public final List<PdfTextPage> openTextPages(int fromIndex, int toIndex) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
                return v.m();
            }
            long[] jArrNativeLoadPages = nativeLoadPages(this.mNativeDocPtr, fromIndex, toIndex);
            ArrayList arrayList = new ArrayList(jArrNativeLoadPages.length);
            int length = jArrNativeLoadPages.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                int i13 = i12 + 1;
                arrayList.add(new PdfTextPage(this, fromIndex + i12, jArrNativeLoadPages[i11], this.textPageMap));
                i11++;
                i12 = i13;
            }
            return arrayList;
        }
    }

    public final void renderPages(long bufferPtr, int drawSizeX, int drawSizeY, List<PdfPage> pages, List<? extends Matrix> matrices, List<? extends RectF> clipRects, boolean renderAnnot, boolean textMask, int canvasColor, int pageBackgroundColor) {
        boolean z11;
        s.k(pages, "pages");
        s.k(matrices, "matrices");
        s.k(clipRects, "clipRects");
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (this.isClosed) {
                    z11 = true;
                } else {
                    List<PdfPage> list = pages;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((PdfPage) it.next()).getIsClosed()) {
                                    z11 = true;
                                }
                            }
                        }
                    }
                    z11 = false;
                }
                if (ConfigKt.handleAlreadyClosed(z11)) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = matrices.iterator();
                while (it2.hasNext()) {
                    float[] fArr = new float[9];
                    ((Matrix) it2.next()).getValues(fArr);
                    v.E(arrayList, v.p(Float.valueOf(fArr[0]), Float.valueOf(fArr[2]), Float.valueOf(fArr[5])));
                }
                float[] fArrJ1 = v.j1(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (RectF rectF : clipRects) {
                    v.E(arrayList2, v.p(Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.right), Float.valueOf(rectF.bottom)));
                }
                float[] fArrJ2 = v.j1(arrayList2);
                List<PdfPage> list2 = pages;
                ArrayList arrayList3 = new ArrayList(v.y(list2, 10));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Long.valueOf(((PdfPage) it3.next()).getPagePtr()));
                }
                nativeRenderPagesWithMatrix(v.n1(arrayList3), bufferPtr, drawSizeX, drawSizeY, fArrJ1, fArrJ2, renderAnnot, textMask, canvasColor, pageBackgroundColor);
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean saveAsCopy(PdfWriteCallback callback, int flags) {
        s.k(callback, "callback");
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (ConfigKt.handleAlreadyClosed(this.isClosed)) {
                return false;
            }
            return nativeSaveAsCopy(this.mNativeDocPtr, callback, flags);
        }
    }

    public final void setParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
        this.parcelFileDescriptor = parcelFileDescriptor;
    }

    public final void setSource(PdfiumSource pdfiumSource) {
        this.source = pdfiumSource;
    }

    public static /* synthetic */ boolean renderPages$default(PdfDocument pdfDocument, Surface surface, List list, List list2, List list3, boolean z11, boolean z12, int i11, int i12, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z11 = false;
        }
        if ((i13 & 32) != 0) {
            z12 = false;
        }
        if ((i13 & 64) != 0) {
            i11 = -8092540;
        }
        if ((i13 & 128) != 0) {
            i12 = -1;
        }
        return pdfDocument.renderPages(surface, list, list2, list3, z11, z12, i11, i12);
    }

    public final boolean renderPages(Surface surface, List<PdfPage> pages, List<? extends Matrix> matrices, List<? extends RectF> clipRects, boolean renderAnnot, boolean textMask, int canvasColor, int pageBackgroundColor) {
        boolean z11;
        s.k(surface, "surface");
        s.k(pages, "pages");
        s.k(matrices, "matrices");
        s.k(clipRects, "clipRects");
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (this.isClosed) {
                    z11 = true;
                } else {
                    List<PdfPage> list = pages;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((PdfPage) it.next()).getIsClosed()) {
                                    z11 = true;
                                }
                            }
                        }
                    }
                    z11 = false;
                }
                if (ConfigKt.handleAlreadyClosed(z11)) {
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = matrices.iterator();
                while (it2.hasNext()) {
                    float[] fArr = new float[9];
                    ((Matrix) it2.next()).getValues(fArr);
                    v.E(arrayList, v.p(Float.valueOf(fArr[0]), Float.valueOf(fArr[2]), Float.valueOf(fArr[5])));
                }
                float[] fArrJ1 = v.j1(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (RectF rectF : clipRects) {
                    v.E(arrayList2, v.p(Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.right), Float.valueOf(rectF.bottom)));
                }
                float[] fArrJ2 = v.j1(arrayList2);
                List<PdfPage> list2 = pages;
                ArrayList arrayList3 = new ArrayList(v.y(list2, 10));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Long.valueOf(((PdfPage) it3.next()).getPagePtr()));
                }
                return nativeRenderPagesSurfaceWithMatrix(v.n1(arrayList3), surface, fArrJ1, fArrJ2, renderAnnot, textMask, canvasColor, pageBackgroundColor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

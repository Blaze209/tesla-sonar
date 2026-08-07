package io.legere.pdfiumandroid;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Surface;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dalvik.annotation.optimization.FastNative;
import io.legere.pdfiumandroid.util.ConfigKt;
import io.legere.pdfiumandroid.util.Size;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 g2\u00020\u0001:\u0001gB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0015J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001dJ\r\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010\u001dJ\u0015\u0010$\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%JS\u0010/\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0003\u0010-\u001a\u00020\u00042\b\b\u0003\u0010.\u001a\u00020\u0004¢\u0006\u0004\b/\u00100J]\u0010/\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u00103\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u0004¢\u0006\u0004\b/\u00104JM\u0010/\u001a\u00020+2\u0006\u00106\u001a\u0002052\u0006\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u00103\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u0004¢\u0006\u0004\b/\u00107J_\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u00103\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u0004¢\u0006\u0004\b;\u0010<JO\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u0001082\u0006\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u00103\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u0004¢\u0006\u0004\b;\u0010=J\u0013\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>¢\u0006\u0004\b@\u0010AJE\u0010I\u001a\u00020H2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00042\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020E¢\u0006\u0004\bI\u0010JJE\u0010N\u001a\u00020M2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0004¢\u0006\u0004\bN\u0010OJ=\u0010R\u001a\u00020Q2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u001b¢\u0006\u0004\bR\u0010SJ=\u0010T\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00042\u0006\u0010P\u001a\u00020Q¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020:H\u0016¢\u0006\u0004\bV\u0010WR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010[\u001a\u0004\b\\\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010]\u001a\u0004\b^\u0010_R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010`R\"\u0010a\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006h"}, d2 = {"Lio/legere/pdfiumandroid/PdfPage;", "Ljava/io/Closeable;", "Lio/legere/pdfiumandroid/PdfDocument;", "doc", "", "pageIndex", "", "pagePtr", "", "Lio/legere/pdfiumandroid/PdfDocument$PageCount;", "pageMap", "<init>", "(Lio/legere/pdfiumandroid/PdfDocument;IJLjava/util/Map;)V", "Lio/legere/pdfiumandroid/PdfTextPage;", "openTextPage", "()Lio/legere/pdfiumandroid/PdfTextPage;", "screenDpi", "getPageWidth", "(I)I", "getPageHeight", "getPageWidthPoint", "()I", "getPageHeightPoint", "Landroid/graphics/Matrix;", "getPageMatrix", "()Landroid/graphics/Matrix;", "getPageRotation", "Landroid/graphics/RectF;", "getPageCropBox", "()Landroid/graphics/RectF;", "getPageMediaBox", "getPageBleedBox", "getPageTrimBox", "getPageArtBox", "getPageBoundingBox", "Lio/legere/pdfiumandroid/util/Size;", "getPageSize", "(I)Lio/legere/pdfiumandroid/util/Size;", "bufferPtr", "startX", "startY", "drawSizeX", "drawSizeY", "", "renderAnnot", "canvasColor", "pageBackgroundColor", "renderPage", "(JIIIIZII)Z", "matrix", "clipRect", "textMask", "(JIILandroid/graphics/Matrix;Landroid/graphics/RectF;ZZII)Z", "Landroid/view/Surface;", "surface", "(Landroid/view/Surface;Landroid/graphics/Matrix;Landroid/graphics/RectF;ZZII)Z", "Landroid/graphics/Bitmap;", "bitmap", "Ljn0/h0;", "renderPageBitmap", "(Landroid/graphics/Bitmap;IIIIZZII)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/RectF;ZZII)V", "", "Lio/legere/pdfiumandroid/PdfDocument$Link;", "getPageLinks", "()Ljava/util/List;", "sizeX", "sizeY", "rotate", "", "pageX", "pageY", "Landroid/graphics/Point;", "mapPageCoordsToDevice", "(IIIIIDD)Landroid/graphics/Point;", "deviceX", "deviceY", "Landroid/graphics/PointF;", "mapDeviceCoordsToPage", "(IIIIIII)Landroid/graphics/PointF;", "coords", "Landroid/graphics/Rect;", "mapRectToDevice", "(IIIIILandroid/graphics/RectF;)Landroid/graphics/Rect;", "mapRectToPage", "(IIIIILandroid/graphics/Rect;)Landroid/graphics/RectF;", "close", "()V", "Lio/legere/pdfiumandroid/PdfDocument;", "getDoc", "()Lio/legere/pdfiumandroid/PdfDocument;", "I", "getPageIndex", "J", "getPagePtr", "()J", "Ljava/util/Map;", "isClosed", "Z", "isClosed$pdfiumandroid_release", "()Z", "setClosed$pdfiumandroid_release", "(Z)V", "Companion", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfPage implements Closeable {
    public static final int BOTTOM = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int LEFT = 0;
    public static final int RIGHT = 2;
    private static final String TAG = "PdfPage";
    public static final int TOP = 1;
    private final PdfDocument doc;
    private volatile boolean isClosed;
    private final int pageIndex;
    private final Map<Integer, PdfDocument.PageCount> pageMap;
    private final long pagePtr;

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0083 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0083 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\tH\u0083 ¢\u0006\u0004\b \u0010\fJX\u0010)\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\b)\u0010*Jd\u0010.\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u001d2\b\b\u0002\u0010-\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\b.\u0010/JH\u00100\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\b0\u00101JT\u00102\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u001d2\b\b\u0002\u0010-\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\b2\u00103Jj\u00106\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\b6\u00107JV\u00108\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00152\b\b\u0002\u0010&\u001a\u00020\u001d2\b\b\u0002\u0010-\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\b8\u00109J(\u0010<\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b>\u0010?JP\u0010F\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020CH\u0083 ¢\u0006\u0004\bF\u0010GJP\u0010J\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\bJ\u0010KJ \u0010L\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\bL\u0010MJ \u0010N\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u000fH\u0083 ¢\u0006\u0004\bN\u0010MJ\u0018\u0010O\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\bO\u0010PJ\u0018\u0010Q\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\bQ\u0010PJ\u0018\u0010R\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\bR\u0010PJ\u0018\u0010S\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\bS\u0010TJ\u0018\u0010U\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\bU\u0010TJ\u0018\u0010V\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\bV\u0010TJ\u0018\u0010W\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\bW\u0010TJ\u0018\u0010X\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\bX\u0010TJ\u0018\u0010Y\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\bY\u0010TJ\u0018\u0010Z\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\bZ\u0010TJ%\u0010[\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b[\u0010\u001fJ\u0015\u0010\\\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\\\u0010\fR\u0014\u0010]\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010`R\u0014\u0010b\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\bb\u0010`R\u0014\u0010c\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\bc\u0010`¨\u0006d"}, d2 = {"Lio/legere/pdfiumandroid/PdfPage$Companion;", "", "<init>", "()V", "", "pagePtr", "Ljn0/h0;", "nativeClosePage", "(J)V", "", "pagesPtr", "nativeClosePages", "([J)V", "docPtr", "linkPtr", "", "nativeGetDestPageIndex", "(JJ)I", "", "nativeGetLinkURI", "(JJ)Ljava/lang/String;", "", "nativeGetLinkRect", "(JJ)[F", "Landroid/view/Surface;", "surface", "", "dimensions", "ptrs", "", "nativeLockSurface", "(Landroid/view/Surface;[I[J)Z", "nativeUnlockSurface", "bufferPtr", "startX", "startY", "drawSizeHor", "drawSizeVer", "renderAnnot", "canvasColor", "pageBackgroundColor", "nativeRenderPage", "(JJIIIIZII)Z", "matrix", "clipRect", "textMask", "nativeRenderPageWithMatrix", "(JJII[F[FZZII)Z", "nativeRenderPageSurface", "(JLandroid/view/Surface;IIZII)Z", "nativeRenderPageSurfaceWithMatrix", "(JLandroid/view/Surface;[F[FZZII)Z", "Landroid/graphics/Bitmap;", "bitmap", "nativeRenderPageBitmap", "(JJLandroid/graphics/Bitmap;IIIIZZII)V", "nativeRenderPageBitmapWithMatrix", "(JLandroid/graphics/Bitmap;[F[FZZII)V", "pageIndex", "dpi", "nativeGetPageSizeByIndex", "(JII)[I", "nativeGetPageLinks", "(J)[J", "sizeX", "sizeY", "rotate", "", "pageX", "pageY", "nativePageCoordsToDevice", "(JIIIIIDD)[I", "deviceX", "deviceY", "nativeDeviceCoordsToPage", "(JIIIIIII)[F", "nativeGetPageWidthPixel", "(JI)I", "nativeGetPageHeightPixel", "nativeGetPageWidthPoint", "(J)I", "nativeGetPageHeightPoint", "nativeGetPageRotation", "nativeGetPageMediaBox", "(J)[F", "nativeGetPageCropBox", "nativeGetPageBleedBox", "nativeGetPageTrimBox", "nativeGetPageArtBox", "nativeGetPageBoundingBox", "nativeGetPageMatrix", "lockSurface", "unlockSurface", "TAG", "Ljava/lang/String;", "LEFT", "I", "TOP", "RIGHT", "BOTTOM", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeClosePage(long pagePtr) {
            PdfPage.nativeClosePage(pagePtr);
        }

        private final void nativeClosePages(long[] pagesPtr) {
            PdfPage.nativeClosePages(pagesPtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final float[] nativeDeviceCoordsToPage(long pagePtr, int startX, int startY, int sizeX, int sizeY, int rotate, int deviceX, int deviceY) {
            return PdfPage.nativeDeviceCoordsToPage(pagePtr, startX, startY, sizeX, sizeY, rotate, deviceX, deviceY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int nativeGetDestPageIndex(long docPtr, long linkPtr) {
            return PdfPage.nativeGetDestPageIndex(docPtr, linkPtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] nativeGetLinkRect(long docPtr, long linkPtr) {
            return PdfPage.nativeGetLinkRect(docPtr, linkPtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String nativeGetLinkURI(long docPtr, long linkPtr) {
            return PdfPage.nativeGetLinkURI(docPtr, linkPtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final float[] nativeGetPageArtBox(long pagePtr) {
            return PdfPage.nativeGetPageArtBox(pagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final float[] nativeGetPageBleedBox(long pagePtr) {
            return PdfPage.nativeGetPageBleedBox(pagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final float[] nativeGetPageBoundingBox(long pagePtr) {
            return PdfPage.nativeGetPageBoundingBox(pagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final float[] nativeGetPageCropBox(long pagePtr) {
            return PdfPage.nativeGetPageCropBox(pagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final int nativeGetPageHeightPixel(long pagePtr, int dpi) {
            return PdfPage.nativeGetPageHeightPixel(pagePtr, dpi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final int nativeGetPageHeightPoint(long pagePtr) {
            return PdfPage.nativeGetPageHeightPoint(pagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long[] nativeGetPageLinks(long pagePtr) {
            return PdfPage.nativeGetPageLinks(pagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final float[] nativeGetPageMatrix(long pagePtr) {
            return PdfPage.nativeGetPageMatrix(pagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final float[] nativeGetPageMediaBox(long pagePtr) {
            return PdfPage.nativeGetPageMediaBox(pagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final int nativeGetPageRotation(long pagePtr) {
            return PdfPage.nativeGetPageRotation(pagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int[] nativeGetPageSizeByIndex(long docPtr, int pageIndex, int dpi) {
            return PdfPage.nativeGetPageSizeByIndex(docPtr, pageIndex, dpi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final float[] nativeGetPageTrimBox(long pagePtr) {
            return PdfPage.nativeGetPageTrimBox(pagePtr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final int nativeGetPageWidthPixel(long pagePtr, int dpi) {
            return PdfPage.nativeGetPageWidthPixel(pagePtr, dpi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final int nativeGetPageWidthPoint(long pagePtr) {
            return PdfPage.nativeGetPageWidthPoint(pagePtr);
        }

        private final boolean nativeLockSurface(Surface surface, int[] dimensions, long[] ptrs) {
            return PdfPage.nativeLockSurface(surface, dimensions, ptrs);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @FastNative
        public final int[] nativePageCoordsToDevice(long pagePtr, int startX, int startY, int sizeX, int sizeY, int rotate, double pageX, double pageY) {
            return PdfPage.nativePageCoordsToDevice(pagePtr, startX, startY, sizeX, sizeY, rotate, pageX, pageY);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean nativeRenderPage(long pagePtr, long bufferPtr, int startX, int startY, int drawSizeHor, int drawSizeVer, boolean renderAnnot, int canvasColor, int pageBackgroundColor) {
            return PdfPage.nativeRenderPage(pagePtr, bufferPtr, startX, startY, drawSizeHor, drawSizeVer, renderAnnot, canvasColor, pageBackgroundColor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeRenderPageBitmap(long docPtr, long pagePtr, Bitmap bitmap, int startX, int startY, int drawSizeHor, int drawSizeVer, boolean renderAnnot, boolean textMask, int canvasColor, int pageBackgroundColor) {
            PdfPage.nativeRenderPageBitmap(docPtr, pagePtr, bitmap, startX, startY, drawSizeHor, drawSizeVer, renderAnnot, textMask, canvasColor, pageBackgroundColor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeRenderPageBitmapWithMatrix(long pagePtr, Bitmap bitmap, float[] matrix, float[] clipRect, boolean renderAnnot, boolean textMask, int canvasColor, int pageBackgroundColor) {
            PdfPage.nativeRenderPageBitmapWithMatrix(pagePtr, bitmap, matrix, clipRect, renderAnnot, textMask, canvasColor, pageBackgroundColor);
        }

        static /* synthetic */ void nativeRenderPageBitmapWithMatrix$default(Companion companion, long j11, Bitmap bitmap, float[] fArr, float[] fArr2, boolean z11, boolean z12, int i11, int i12, int i13, Object obj) {
            if ((i13 & 16) != 0) {
                z11 = false;
            }
            if ((i13 & 32) != 0) {
                z12 = false;
            }
            companion.nativeRenderPageBitmapWithMatrix(j11, bitmap, fArr, fArr2, z11, z12, i11, i12);
        }

        private final boolean nativeRenderPageSurface(long pagePtr, Surface surface, int startX, int startY, boolean renderAnnot, int canvasColor, int pageBackgroundColor) {
            return PdfPage.nativeRenderPageSurface(pagePtr, surface, startX, startY, renderAnnot, canvasColor, pageBackgroundColor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean nativeRenderPageSurfaceWithMatrix(long pagePtr, Surface surface, float[] matrix, float[] clipRect, boolean renderAnnot, boolean textMask, int canvasColor, int pageBackgroundColor) {
            return PdfPage.nativeRenderPageSurfaceWithMatrix(pagePtr, surface, matrix, clipRect, renderAnnot, textMask, canvasColor, pageBackgroundColor);
        }

        static /* synthetic */ boolean nativeRenderPageSurfaceWithMatrix$default(Companion companion, long j11, Surface surface, float[] fArr, float[] fArr2, boolean z11, boolean z12, int i11, int i12, int i13, Object obj) {
            if ((i13 & 16) != 0) {
                z11 = false;
            }
            if ((i13 & 32) != 0) {
                z12 = false;
            }
            return companion.nativeRenderPageSurfaceWithMatrix(j11, surface, fArr, fArr2, z11, z12, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean nativeRenderPageWithMatrix(long pagePtr, long bufferPtr, int drawSizeHor, int drawSizeVer, float[] matrix, float[] clipRect, boolean renderAnnot, boolean textMask, int canvasColor, int pageBackgroundColor) {
            return PdfPage.nativeRenderPageWithMatrix(pagePtr, bufferPtr, drawSizeHor, drawSizeVer, matrix, clipRect, renderAnnot, textMask, canvasColor, pageBackgroundColor);
        }

        static /* synthetic */ boolean nativeRenderPageWithMatrix$default(Companion companion, long j11, long j12, int i11, int i12, float[] fArr, float[] fArr2, boolean z11, boolean z12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 64) != 0) {
                z11 = false;
            }
            if ((i15 & 128) != 0) {
                z12 = false;
            }
            return companion.nativeRenderPageWithMatrix(j11, j12, i11, i12, fArr, fArr2, z11, z12, i13, i14);
        }

        private final void nativeUnlockSurface(long[] ptrs) {
            PdfPage.nativeUnlockSurface(ptrs);
        }

        public final boolean lockSurface(Surface surface, int[] dimensions, long[] ptrs) {
            boolean zNativeLockSurface;
            s.k(surface, "surface");
            s.k(dimensions, "dimensions");
            s.k(ptrs, "ptrs");
            synchronized (PdfiumCore.INSTANCE.getLock()) {
                zNativeLockSurface = PdfPage.INSTANCE.nativeLockSurface(surface, dimensions, ptrs);
            }
            return zNativeLockSurface;
        }

        public final void unlockSurface(long[] ptrs) {
            s.k(ptrs, "ptrs");
            synchronized (PdfiumCore.INSTANCE.getLock()) {
                PdfPage.INSTANCE.nativeUnlockSurface(ptrs);
                h0 h0Var = h0.f84049a;
            }
        }

        private Companion() {
        }
    }

    public PdfPage(PdfDocument doc, int i11, long j11, Map<Integer, PdfDocument.PageCount> pageMap) {
        s.k(doc, "doc");
        s.k(pageMap, "pageMap");
        this.doc = doc;
        this.pageIndex = i11;
        this.pagePtr = j11;
        this.pageMap = pageMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeClosePage(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeClosePages(long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native float[] nativeDeviceCoordsToPage(long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeGetDestPageIndex(long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native float[] nativeGetLinkRect(long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String nativeGetLinkURI(long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native float[] nativeGetPageArtBox(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native float[] nativeGetPageBleedBox(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native float[] nativeGetPageBoundingBox(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native float[] nativeGetPageCropBox(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native int nativeGetPageHeightPixel(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native int nativeGetPageHeightPoint(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long[] nativeGetPageLinks(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native float[] nativeGetPageMatrix(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native float[] nativeGetPageMediaBox(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native int nativeGetPageRotation(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int[] nativeGetPageSizeByIndex(long j11, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native float[] nativeGetPageTrimBox(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native int nativeGetPageWidthPixel(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native int nativeGetPageWidthPoint(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeLockSurface(Surface surface, int[] iArr, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native int[] nativePageCoordsToDevice(long j11, int i11, int i12, int i13, int i14, int i15, double d11, double d12);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeRenderPage(long j11, long j12, int i11, int i12, int i13, int i14, boolean z11, int i15, int i16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeRenderPageBitmap(long j11, long j12, Bitmap bitmap, int i11, int i12, int i13, int i14, boolean z11, boolean z12, int i15, int i16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeRenderPageBitmapWithMatrix(long j11, Bitmap bitmap, float[] fArr, float[] fArr2, boolean z11, boolean z12, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeRenderPageSurface(long j11, Surface surface, int i11, int i12, boolean z11, int i13, int i14);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeRenderPageSurfaceWithMatrix(long j11, Surface surface, float[] fArr, float[] fArr2, boolean z11, boolean z12, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeRenderPageWithMatrix(long j11, long j12, int i11, int i12, float[] fArr, float[] fArr2, boolean z11, boolean z12, int i13, int i14);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeUnlockSurface(long[] jArr);

    public static /* synthetic */ void renderPageBitmap$default(PdfPage pdfPage, Bitmap bitmap, int i11, int i12, int i13, int i14, boolean z11, boolean z12, int i15, int i16, int i17, Object obj) {
        if ((i17 & 32) != 0) {
            z11 = false;
        }
        if ((i17 & 64) != 0) {
            z12 = false;
        }
        if ((i17 & 128) != 0) {
            i15 = -8092540;
        }
        if ((i17 & 256) != 0) {
            i16 = -1;
        }
        pdfPage.renderPageBitmap(bitmap, i11, i12, i13, i14, z11, z12, i15, i16);
    }

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
                    INSTANCE.nativeClosePage(this.pagePtr);
                    h0 h0Var = h0.f84049a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final PdfDocument getDoc() {
        return this.doc;
    }

    public final RectF getPageArtBox() {
        RectF rectF;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (this.isClosed || this.doc.getIsClosed()) {
                throw new IllegalStateException("Already closed");
            }
            float[] fArrNativeGetPageArtBox = INSTANCE.nativeGetPageArtBox(this.pagePtr);
            rectF = new RectF();
            rectF.left = fArrNativeGetPageArtBox[0];
            rectF.top = fArrNativeGetPageArtBox[1];
            rectF.right = fArrNativeGetPageArtBox[2];
            rectF.bottom = fArrNativeGetPageArtBox[3];
        }
        return rectF;
    }

    public final RectF getPageBleedBox() {
        RectF rectF;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (this.isClosed || this.doc.getIsClosed()) {
                throw new IllegalStateException("Already closed");
            }
            float[] fArrNativeGetPageBleedBox = INSTANCE.nativeGetPageBleedBox(this.pagePtr);
            rectF = new RectF();
            rectF.left = fArrNativeGetPageBleedBox[0];
            rectF.top = fArrNativeGetPageBleedBox[1];
            rectF.right = fArrNativeGetPageBleedBox[2];
            rectF.bottom = fArrNativeGetPageBleedBox[3];
        }
        return rectF;
    }

    public final RectF getPageBoundingBox() {
        RectF rectF;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (this.isClosed || this.doc.getIsClosed()) {
                throw new IllegalStateException("Already closed");
            }
            float[] fArrNativeGetPageBoundingBox = INSTANCE.nativeGetPageBoundingBox(this.pagePtr);
            rectF = new RectF();
            rectF.left = fArrNativeGetPageBoundingBox[0];
            rectF.top = fArrNativeGetPageBoundingBox[1];
            rectF.right = fArrNativeGetPageBoundingBox[2];
            rectF.bottom = fArrNativeGetPageBoundingBox[3];
        }
        return rectF;
    }

    public final RectF getPageCropBox() {
        RectF rectF;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (this.isClosed || this.doc.getIsClosed()) {
                throw new IllegalStateException("Already closed");
            }
            float[] fArrNativeGetPageCropBox = INSTANCE.nativeGetPageCropBox(this.pagePtr);
            rectF = new RectF();
            rectF.left = fArrNativeGetPageCropBox[0];
            rectF.top = fArrNativeGetPageCropBox[1];
            rectF.right = fArrNativeGetPageCropBox[2];
            rectF.bottom = fArrNativeGetPageCropBox[3];
        }
        return rectF;
    }

    public final int getPageHeight(int screenDpi) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return -1;
                }
                return INSTANCE.nativeGetPageHeightPixel(this.pagePtr, screenDpi);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int getPageHeightPoint() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return -1;
                }
                return INSTANCE.nativeGetPageHeightPoint(this.pagePtr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final List<PdfDocument.Link> getPageLinks() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return v.m();
                }
                ArrayList arrayList = new ArrayList();
                for (long j11 : INSTANCE.nativeGetPageLinks(this.pagePtr)) {
                    Companion companion = INSTANCE;
                    int iNativeGetDestPageIndex = companion.nativeGetDestPageIndex(this.doc.getMNativeDocPtr(), j11);
                    String strNativeGetLinkURI = companion.nativeGetLinkURI(this.doc.getMNativeDocPtr(), j11);
                    float[] fArrNativeGetLinkRect = companion.nativeGetLinkRect(this.doc.getMNativeDocPtr(), j11);
                    if (fArrNativeGetLinkRect.length == 4 && (iNativeGetDestPageIndex != -1 || strNativeGetLinkURI != null)) {
                        arrayList.add(new PdfDocument.Link(new RectF(fArrNativeGetLinkRect[0], fArrNativeGetLinkRect[1], fArrNativeGetLinkRect[2], fArrNativeGetLinkRect[3]), Integer.valueOf(iNativeGetDestPageIndex), strNativeGetLinkURI));
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Matrix getPageMatrix() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return null;
                }
                float[] fArrNativeGetPageMatrix = INSTANCE.nativeGetPageMatrix(this.pagePtr);
                Logger logger = Logger.INSTANCE;
                logger.d(TAG, "pageMatrix[0] = " + fArrNativeGetPageMatrix[0]);
                logger.d(TAG, "pageMatrix[1] = " + fArrNativeGetPageMatrix[1]);
                logger.d(TAG, "pageMatrix[2] = " + fArrNativeGetPageMatrix[2]);
                logger.d(TAG, "pageMatrix[3] = " + fArrNativeGetPageMatrix[3]);
                logger.d(TAG, "pageMatrix[4] = " + fArrNativeGetPageMatrix[4]);
                logger.d(TAG, "pageMatrix[5] = " + fArrNativeGetPageMatrix[5]);
                float[] fArr = {fArrNativeGetPageMatrix[0], fArrNativeGetPageMatrix[1], fArrNativeGetPageMatrix[4], fArrNativeGetPageMatrix[2], fArrNativeGetPageMatrix[3], fArrNativeGetPageMatrix[5], BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};
                Matrix matrix = new Matrix();
                matrix.setValues(fArr);
                return matrix;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final RectF getPageMediaBox() {
        RectF rectF;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (this.isClosed || this.doc.getIsClosed()) {
                throw new IllegalStateException("Already closed");
            }
            float[] fArrNativeGetPageMediaBox = INSTANCE.nativeGetPageMediaBox(this.pagePtr);
            rectF = new RectF();
            rectF.left = fArrNativeGetPageMediaBox[0];
            rectF.top = fArrNativeGetPageMediaBox[1];
            rectF.right = fArrNativeGetPageMediaBox[2];
            rectF.bottom = fArrNativeGetPageMediaBox[3];
        }
        return rectF;
    }

    public final long getPagePtr() {
        return this.pagePtr;
    }

    public final int getPageRotation() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return -1;
                }
                return INSTANCE.nativeGetPageRotation(this.pagePtr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Size getPageSize(int screenDpi) {
        Size size;
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            int[] iArrNativeGetPageSizeByIndex = INSTANCE.nativeGetPageSizeByIndex(this.doc.getMNativeDocPtr(), this.pageIndex, screenDpi);
            size = new Size(iArrNativeGetPageSizeByIndex[0], iArrNativeGetPageSizeByIndex[1]);
        }
        return size;
    }

    public final RectF getPageTrimBox() {
        RectF rectF;
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            if (this.isClosed || this.doc.getIsClosed()) {
                throw new IllegalStateException("Already closed");
            }
            float[] fArrNativeGetPageTrimBox = INSTANCE.nativeGetPageTrimBox(this.pagePtr);
            rectF = new RectF();
            rectF.left = fArrNativeGetPageTrimBox[0];
            rectF.top = fArrNativeGetPageTrimBox[1];
            rectF.right = fArrNativeGetPageTrimBox[2];
            rectF.bottom = fArrNativeGetPageTrimBox[3];
        }
        return rectF;
    }

    public final int getPageWidth(int screenDpi) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return -1;
                }
                return INSTANCE.nativeGetPageWidthPixel(this.pagePtr, screenDpi);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int getPageWidthPoint() {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return -1;
                }
                return INSTANCE.nativeGetPageWidthPoint(this.pagePtr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: isClosed$pdfiumandroid_release, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    public final PointF mapDeviceCoordsToPage(int startX, int startY, int sizeX, int sizeY, int rotate, int deviceX, int deviceY) {
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        float[] fArrNativeDeviceCoordsToPage = INSTANCE.nativeDeviceCoordsToPage(this.pagePtr, startX, startY, sizeX, sizeY, rotate, deviceX, deviceY);
        return new PointF(fArrNativeDeviceCoordsToPage[0], fArrNativeDeviceCoordsToPage[1]);
    }

    public final Point mapPageCoordsToDevice(int startX, int startY, int sizeX, int sizeY, int rotate, double pageX, double pageY) {
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        int[] iArrNativePageCoordsToDevice = INSTANCE.nativePageCoordsToDevice(this.pagePtr, startX, startY, sizeX, sizeY, rotate, pageX, pageY);
        return new Point(iArrNativePageCoordsToDevice[0], iArrNativePageCoordsToDevice[1]);
    }

    public final Rect mapRectToDevice(int startX, int startY, int sizeX, int sizeY, int rotate, RectF coords) {
        s.k(coords, "coords");
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        Point pointMapPageCoordsToDevice = mapPageCoordsToDevice(startX, startY, sizeX, sizeY, rotate, coords.left, coords.top);
        Point pointMapPageCoordsToDevice2 = mapPageCoordsToDevice(startX, startY, sizeX, sizeY, rotate, coords.right, coords.bottom);
        return new Rect(pointMapPageCoordsToDevice.x, pointMapPageCoordsToDevice.y, pointMapPageCoordsToDevice2.x, pointMapPageCoordsToDevice2.y);
    }

    public final RectF mapRectToPage(int startX, int startY, int sizeX, int sizeY, int rotate, Rect coords) {
        s.k(coords, "coords");
        if (this.isClosed || this.doc.getIsClosed()) {
            throw new IllegalStateException("Already closed");
        }
        PointF pointFMapDeviceCoordsToPage = mapDeviceCoordsToPage(startX, startY, sizeX, sizeY, rotate, coords.left, coords.top);
        PointF pointFMapDeviceCoordsToPage2 = mapDeviceCoordsToPage(startX, startY, sizeX, sizeY, rotate, coords.right, coords.bottom);
        return new RectF(pointFMapDeviceCoordsToPage.x, pointFMapDeviceCoordsToPage.y, pointFMapDeviceCoordsToPage2.x, pointFMapDeviceCoordsToPage2.y);
    }

    public final PdfTextPage openTextPage() {
        return this.doc.openTextPage(this);
    }

    public final boolean renderPage(long bufferPtr, int startX, int startY, int drawSizeX, int drawSizeY, boolean renderAnnot, int canvasColor, int pageBackgroundColor) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return false;
                }
                try {
                    return INSTANCE.nativeRenderPage(this.pagePtr, bufferPtr, startX, startY, drawSizeX, drawSizeY, renderAnnot, canvasColor, pageBackgroundColor);
                } catch (NullPointerException e11) {
                    Logger.INSTANCE.e(TAG, e11, "mContext may be null");
                    h0 h0Var = h0.f84049a;
                    return false;
                } catch (Exception e12) {
                    Logger.INSTANCE.e(TAG, e12, "Exception throw from native");
                    h0 h0Var2 = h0.f84049a;
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void renderPageBitmap(Bitmap bitmap, int startX, int startY, int drawSizeX, int drawSizeY, boolean renderAnnot, boolean textMask, int canvasColor, int pageBackgroundColor) {
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return;
                }
                INSTANCE.nativeRenderPageBitmap(this.doc.getMNativeDocPtr(), this.pagePtr, bitmap, startX, startY, drawSizeX, drawSizeY, renderAnnot, textMask, canvasColor, pageBackgroundColor);
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setClosed$pdfiumandroid_release(boolean z11) {
        this.isClosed = z11;
    }

    public static /* synthetic */ boolean renderPage$default(PdfPage pdfPage, long j11, int i11, int i12, Matrix matrix, RectF rectF, boolean z11, boolean z12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 32) != 0) {
            z11 = false;
        }
        if ((i15 & 64) != 0) {
            z12 = false;
        }
        if ((i15 & 128) != 0) {
            i13 = -8092540;
        }
        if ((i15 & 256) != 0) {
            i14 = -1;
        }
        return pdfPage.renderPage(j11, i11, i12, matrix, rectF, z11, z12, i13, i14);
    }

    public static /* synthetic */ void renderPageBitmap$default(PdfPage pdfPage, Bitmap bitmap, Matrix matrix, RectF rectF, boolean z11, boolean z12, int i11, int i12, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z11 = false;
        }
        if ((i13 & 16) != 0) {
            z12 = false;
        }
        if ((i13 & 32) != 0) {
            i11 = -8092540;
        }
        if ((i13 & 64) != 0) {
            i12 = -1;
        }
        pdfPage.renderPageBitmap(bitmap, matrix, rectF, z11, z12, i11, i12);
    }

    public static /* synthetic */ boolean renderPage$default(PdfPage pdfPage, Surface surface, Matrix matrix, RectF rectF, boolean z11, boolean z12, int i11, int i12, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z11 = false;
        }
        if ((i13 & 16) != 0) {
            z12 = false;
        }
        if ((i13 & 32) != 0) {
            i11 = -8092540;
        }
        if ((i13 & 64) != 0) {
            i12 = -1;
        }
        return pdfPage.renderPage(surface, matrix, rectF, z11, z12, i11, i12);
    }

    public final void renderPageBitmap(Bitmap bitmap, Matrix matrix, RectF clipRect, boolean renderAnnot, boolean textMask, int canvasColor, int pageBackgroundColor) {
        s.k(matrix, "matrix");
        s.k(clipRect, "clipRect");
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return;
                }
                float[] fArr = new float[9];
                matrix.getValues(fArr);
                INSTANCE.nativeRenderPageBitmapWithMatrix(this.pagePtr, bitmap, new float[]{fArr[0], fArr[4], fArr[2], fArr[5]}, new float[]{clipRect.left, clipRect.top, clipRect.right, clipRect.bottom}, renderAnnot, textMask, canvasColor, pageBackgroundColor);
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean renderPage(long bufferPtr, int drawSizeX, int drawSizeY, Matrix matrix, RectF clipRect, boolean renderAnnot, boolean textMask, int canvasColor, int pageBackgroundColor) {
        s.k(matrix, "matrix");
        s.k(clipRect, "clipRect");
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return false;
                }
                float[] fArr = new float[9];
                matrix.getValues(fArr);
                return INSTANCE.nativeRenderPageWithMatrix(this.pagePtr, bufferPtr, drawSizeX, drawSizeY, new float[]{fArr[0], fArr[4], fArr[2], fArr[5]}, new float[]{clipRect.left, clipRect.top, clipRect.right, clipRect.bottom}, renderAnnot, textMask, canvasColor, pageBackgroundColor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean renderPage(Surface surface, Matrix matrix, RectF clipRect, boolean renderAnnot, boolean textMask, int canvasColor, int pageBackgroundColor) {
        s.k(surface, "surface");
        s.k(matrix, "matrix");
        s.k(clipRect, "clipRect");
        synchronized (PdfiumCore.INSTANCE.getLock()) {
            try {
                if (ConfigKt.handleAlreadyClosed(this.isClosed || this.doc.getIsClosed())) {
                    return false;
                }
                float[] fArr = new float[9];
                matrix.getValues(fArr);
                return INSTANCE.nativeRenderPageSurfaceWithMatrix(this.pagePtr, surface, new float[]{fArr[0], fArr[4], fArr[2], fArr[5]}, new float[]{clipRect.left, clipRect.top, clipRect.right, clipRect.bottom}, renderAnnot, textMask, canvasColor, pageBackgroundColor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

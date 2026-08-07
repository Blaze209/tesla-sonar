package io.legere.pdfiumandroid;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Surface;
import bo0.m;
import ch.qos.logback.core.CoreConstants;
import io.legere.pdfiumandroid.util.Config;
import io.legere.pdfiumandroid.util.ConfigKt;
import io.legere.pdfiumandroid.util.InitLock;
import io.legere.pdfiumandroid.util.PdfiumNativeSourceBridge;
import io.legere.pdfiumandroid.util.Size;
import java.util.List;
import jn0.e;
import jn0.h0;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import sn0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 z2\u00020\u0001:\u0001zB\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u001cJ\u0017\u0010\u0019\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u001dJ!\u0010\u0019\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u001eJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u001f¢\u0006\u0004\b\u0019\u0010 J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u001f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010!J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0018H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u0018H\u0007¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\"\u001a\u00020\u0018H\u0007¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\bH\u0007¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\bH\u0007¢\u0006\u0004\b/\u0010.J\u001f\u00101\u001a\u0002002\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\bH\u0007¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\bH\u0007¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\bH\u0007¢\u0006\u0004\b5\u00104J\u001f\u00106\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\bH\u0007¢\u0006\u0004\b6\u00107J1\u0010:\u001a\u0004\u0018\u00010\n2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\bH\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010\"\u001a\u00020\u0018H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\bH\u0007¢\u0006\u0004\b?\u00107J\u001f\u0010@\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\bH\u0007¢\u0006\u0004\b@\u00107J]\u0010J\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u00182\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010,\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\b\b\u0002\u0010H\u001a\u00020G2\b\b\u0002\u0010I\u001a\u00020GH\u0007¢\u0006\u0004\bJ\u0010KJ)\u0010M\u001a\u0004\u0018\u0001002\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\b2\u0006\u0010L\u001a\u00020\bH\u0007¢\u0006\u0004\bM\u0010NJ1\u0010P\u001a\u0004\u0018\u00010\n2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\b2\u0006\u0010O\u001a\u0002002\u0006\u0010\u0014\u001a\u00020\bH\u0007¢\u0006\u0004\bP\u0010QJO\u0010W\u001a\u0002002\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020\b2\u0006\u0010V\u001a\u00020UH\u0007¢\u0006\u0004\bW\u0010XJ/\u0010Z\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\b2\u0006\u00109\u001a\u00020\bH\u0007¢\u0006\u0004\bZ\u0010[J-\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0^2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\\\u001a\u00020\b2\u0006\u0010]\u001a\u00020\bH\u0007¢\u0006\u0004\b/\u0010_J\u001f\u0010`\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\bH\u0007¢\u0006\u0004\b`\u00107J\u001f\u0010a\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\bH\u0007¢\u0006\u0004\ba\u00107J\u001f\u0010c\u001a\u00020b2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\bH\u0007¢\u0006\u0004\bc\u0010dJS\u0010g\u001a\u00020G2\u0006\u0010\"\u001a\u00020\u00182\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010,\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\b\b\u0002\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bg\u0010hJS\u0010J\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u00182\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010,\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\b\b\u0002\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bJ\u0010iJ%\u0010k\u001a\b\u0012\u0004\u0012\u00020j0(2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\bH\u0007¢\u0006\u0004\bk\u0010lJW\u0010q\u001a\u00020p2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020\b2\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020mH\u0007¢\u0006\u0004\bq\u0010rJO\u0010s\u001a\u00020U2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020\b2\u0006\u0010V\u001a\u000200H\u0007¢\u0006\u0004\bs\u0010tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010u\u001a\u0004\bv\u0010wR\u0014\u0010x\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010y¨\u0006{"}, d2 = {"Lio/legere/pdfiumandroid/PdfiumCore;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/legere/pdfiumandroid/util/Config;", "config", "<init>", "(Landroid/content/Context;Lio/legere/pdfiumandroid/util/Config;)V", "", "fd", "", "password", "", "nativeOpenDocument", "(ILjava/lang/String;)J", "", "data", "nativeOpenMemDocument", "([BLjava/lang/String;)J", "Lio/legere/pdfiumandroid/util/PdfiumNativeSourceBridge;", "size", "nativeOpenCustomDocument", "(Lio/legere/pdfiumandroid/util/PdfiumNativeSourceBridge;Ljava/lang/String;J)J", "Landroid/os/ParcelFileDescriptor;", "Lio/legere/pdfiumandroid/PdfDocument;", "newDocument", "(Landroid/os/ParcelFileDescriptor;)Lio/legere/pdfiumandroid/PdfDocument;", "parcelFileDescriptor", "(Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)Lio/legere/pdfiumandroid/PdfDocument;", "([B)Lio/legere/pdfiumandroid/PdfDocument;", "([BLjava/lang/String;)Lio/legere/pdfiumandroid/PdfDocument;", "Lio/legere/pdfiumandroid/PdfiumSource;", "(Lio/legere/pdfiumandroid/PdfiumSource;)Lio/legere/pdfiumandroid/PdfDocument;", "(Lio/legere/pdfiumandroid/PdfiumSource;Ljava/lang/String;)Lio/legere/pdfiumandroid/PdfDocument;", "pdfDocument", "getPageCount", "(Lio/legere/pdfiumandroid/PdfDocument;)I", "Ljn0/h0;", "closeDocument", "(Lio/legere/pdfiumandroid/PdfDocument;)V", "", "Lio/legere/pdfiumandroid/PdfDocument$Bookmark;", "getTableOfContents", "(Lio/legere/pdfiumandroid/PdfDocument;)Ljava/util/List;", "pageIndex", "openTextPage", "(Lio/legere/pdfiumandroid/PdfDocument;I)J", "openPage", "Landroid/graphics/RectF;", "getPageMediaBox", "(Lio/legere/pdfiumandroid/PdfDocument;I)Landroid/graphics/RectF;", "closePage", "(Lio/legere/pdfiumandroid/PdfDocument;I)V", "closeTextPage", "textPageCountChars", "(Lio/legere/pdfiumandroid/PdfDocument;I)I", "start", "count", "textPageGetText", "(Lio/legere/pdfiumandroid/PdfDocument;III)Ljava/lang/String;", "Lio/legere/pdfiumandroid/PdfDocument$Meta;", "getDocumentMeta", "(Lio/legere/pdfiumandroid/PdfDocument;)Lio/legere/pdfiumandroid/PdfDocument$Meta;", "getPageWidthPoint", "getPageHeightPoint", "Landroid/graphics/Bitmap;", "bitmap", "startX", "startY", "drawSizeX", "drawSizeY", "", "renderAnnot", "textMask", "renderPageBitmap", "(Lio/legere/pdfiumandroid/PdfDocument;Landroid/graphics/Bitmap;IIIIIZZ)V", "index", "textPageGetRect", "(Lio/legere/pdfiumandroid/PdfDocument;II)Landroid/graphics/RectF;", "sourceRect", "textPageGetBoundedText", "(Lio/legere/pdfiumandroid/PdfDocument;ILandroid/graphics/RectF;I)Ljava/lang/String;", "sizeX", "sizeY", "rotate", "Landroid/graphics/Rect;", "coords", "mapRectToPage", "(Lio/legere/pdfiumandroid/PdfDocument;IIIIIILandroid/graphics/Rect;)Landroid/graphics/RectF;", "startIndex", "textPageCountRects", "(Lio/legere/pdfiumandroid/PdfDocument;III)I", "fromIndex", "toIndex", "", "(Lio/legere/pdfiumandroid/PdfDocument;II)[Ljava/lang/Long;", "getPageWidth", "getPageHeight", "Lio/legere/pdfiumandroid/util/Size;", "getPageSize", "(Lio/legere/pdfiumandroid/PdfDocument;I)Lio/legere/pdfiumandroid/util/Size;", "Landroid/view/Surface;", "surface", "renderPage", "(Lio/legere/pdfiumandroid/PdfDocument;Landroid/view/Surface;IIIIIZ)Z", "(Lio/legere/pdfiumandroid/PdfDocument;Landroid/graphics/Bitmap;IIIIIZ)V", "Lio/legere/pdfiumandroid/PdfDocument$Link;", "getPageLinks", "(Lio/legere/pdfiumandroid/PdfDocument;I)Ljava/util/List;", "", "pageX", "pageY", "Landroid/graphics/Point;", "mapPageCoordsToDevice", "(Lio/legere/pdfiumandroid/PdfDocument;IIIIIIDD)Landroid/graphics/Point;", "mapRectToDevice", "(Lio/legere/pdfiumandroid/PdfDocument;IIIIIILandroid/graphics/RectF;)Landroid/graphics/Rect;", "Lio/legere/pdfiumandroid/util/Config;", "getConfig", "()Lio/legere/pdfiumandroid/util/Config;", "mCurrentDpi", "I", "Companion", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfiumCore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG;
    private static final InitLock isReady;
    private static final Object lock;
    private static final Mutex surfaceMutex;
    private final Config config;
    private final int mCurrentDpi;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/legere/pdfiumandroid/PdfiumCore$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "lock", "getLock", "()Ljava/lang/Object;", "surfaceMutex", "Lkotlinx/coroutines/sync/Mutex;", "getSurfaceMutex", "()Lkotlinx/coroutines/sync/Mutex;", "isReady", "Lio/legere/pdfiumandroid/util/InitLock;", "()Lio/legere/pdfiumandroid/util/InitLock;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object getLock() {
            return PdfiumCore.lock;
        }

        public final Mutex getSurfaceMutex() {
            return PdfiumCore.surfaceMutex;
        }

        public final InitLock isReady() {
            return PdfiumCore.isReady;
        }

        private Companion() {
        }
    }

    static {
        String name = PdfiumCore.class.getName();
        TAG = name;
        lock = new Object();
        surfaceMutex = MutexKt.Mutex$default(false, 1, null);
        isReady = new InitLock();
        Log.d(name, "init");
        new Thread(new Runnable() { // from class: io.legere.pdfiumandroid.a
            @Override // java.lang.Runnable
            public final void run() {
                PdfiumCore._init_$lambda$0();
            }
        }).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PdfiumCore() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0() {
        String str = TAG;
        Log.d(str, "init thread start");
        synchronized (lock) {
            Log.d(str, "init in lock");
            try {
                System.loadLibrary("pdfium");
                System.loadLibrary("pdfiumandroid");
                isReady.markReady();
            } catch (UnsatisfiedLinkError e11) {
                Logger logger = Logger.INSTANCE;
                String TAG2 = TAG;
                s.j(TAG2, "TAG");
                logger.e(TAG2, e11, "Native libraries failed to load");
            }
            Log.d(TAG, "init in lock");
            h0 h0Var = h0.f84049a;
        }
    }

    private final native long nativeOpenCustomDocument(PdfiumNativeSourceBridge data, String password, long size);

    private final native long nativeOpenDocument(int fd2, String password);

    private final native long nativeOpenMemDocument(byte[] data, String password);

    public static /* synthetic */ void renderPageBitmap$default(PdfiumCore pdfiumCore, PdfDocument pdfDocument, Bitmap bitmap, int i11, int i12, int i13, int i14, int i15, boolean z11, boolean z12, int i16, Object obj) {
        if ((i16 & 128) != 0) {
            z11 = false;
        }
        if ((i16 & 256) != 0) {
            z12 = false;
        }
        pdfiumCore.renderPageBitmap(pdfDocument, bitmap, i11, i12, i13, i14, i15, z11, z12);
    }

    @e
    public final void closeDocument(PdfDocument pdfDocument) {
        s.k(pdfDocument, "pdfDocument");
        pdfDocument.close();
    }

    @e
    public final void closePage(PdfDocument pdfDocument, int pageIndex) {
        s.k(pdfDocument, "pdfDocument");
    }

    @e
    public final void closeTextPage(PdfDocument pdfDocument, int pageIndex) {
        s.k(pdfDocument, "pdfDocument");
    }

    public final Config getConfig() {
        return this.config;
    }

    @e
    public final PdfDocument.Meta getDocumentMeta(PdfDocument pdfDocument) {
        s.k(pdfDocument, "pdfDocument");
        return pdfDocument.getDocumentMeta();
    }

    @e
    public final int getPageCount(PdfDocument pdfDocument) {
        s.k(pdfDocument, "pdfDocument");
        return pdfDocument.getPageCount();
    }

    @e
    public final int getPageHeight(PdfDocument pdfDocument, int index) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(index);
        try {
            int pageHeight = pdfPageOpenPage.getPageHeight(this.mCurrentDpi);
            b.a(pdfPageOpenPage, null);
            return pageHeight;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    @e
    public final int getPageHeightPoint(PdfDocument pdfDocument, int pageIndex) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            int pageHeightPoint = pdfPageOpenPage.getPageHeightPoint();
            b.a(pdfPageOpenPage, null);
            return pageHeightPoint;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    @e
    public final List<PdfDocument.Link> getPageLinks(PdfDocument pdfDocument, int pageIndex) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            List<PdfDocument.Link> pageLinks = pdfPageOpenPage.getPageLinks();
            b.a(pdfPageOpenPage, null);
            return pageLinks;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    @e
    public final RectF getPageMediaBox(PdfDocument pdfDocument, int pageIndex) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            RectF pageMediaBox = pdfPageOpenPage.getPageMediaBox();
            b.a(pdfPageOpenPage, null);
            return pageMediaBox;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    @e
    public final Size getPageSize(PdfDocument pdfDocument, int index) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(index);
        try {
            Size pageSize = pdfPageOpenPage.getPageSize(this.mCurrentDpi);
            b.a(pdfPageOpenPage, null);
            return pageSize;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    @e
    public final int getPageWidth(PdfDocument pdfDocument, int index) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(index);
        try {
            int pageWidth = pdfPageOpenPage.getPageWidth(this.mCurrentDpi);
            b.a(pdfPageOpenPage, null);
            return pageWidth;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    @e
    public final int getPageWidthPoint(PdfDocument pdfDocument, int pageIndex) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            int pageWidthPoint = pdfPageOpenPage.getPageWidthPoint();
            b.a(pdfPageOpenPage, null);
            return pageWidthPoint;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    @e
    public final List<PdfDocument.Bookmark> getTableOfContents(PdfDocument pdfDocument) {
        s.k(pdfDocument, "pdfDocument");
        return pdfDocument.getTableOfContents();
    }

    @e
    public final Point mapPageCoordsToDevice(PdfDocument pdfDocument, int pageIndex, int startX, int startY, int sizeX, int sizeY, int rotate, double pageX, double pageY) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            Point pointMapPageCoordsToDevice = pdfPageOpenPage.mapPageCoordsToDevice(startX, startY, sizeX, sizeY, rotate, pageX, pageY);
            b.a(pdfPageOpenPage, null);
            return pointMapPageCoordsToDevice;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    @e
    public final Rect mapRectToDevice(PdfDocument pdfDocument, int pageIndex, int startX, int startY, int sizeX, int sizeY, int rotate, RectF coords) {
        s.k(pdfDocument, "pdfDocument");
        s.k(coords, "coords");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            Rect rectMapRectToDevice = pdfPageOpenPage.mapRectToDevice(startX, startY, sizeX, sizeY, rotate, coords);
            b.a(pdfPageOpenPage, null);
            return rectMapRectToDevice;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    @e
    public final RectF mapRectToPage(PdfDocument pdfDocument, int pageIndex, int startX, int startY, int sizeX, int sizeY, int rotate, Rect coords) {
        s.k(pdfDocument, "pdfDocument");
        s.k(coords, "coords");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            RectF rectFMapRectToPage = pdfPageOpenPage.mapRectToPage(startX, startY, sizeX, sizeY, rotate, coords);
            b.a(pdfPageOpenPage, null);
            return rectFMapRectToPage;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    public final PdfDocument newDocument(ParcelFileDescriptor fd2) {
        s.k(fd2, "fd");
        return newDocument(fd2, (String) null);
    }

    @e
    public final long openPage(PdfDocument pdfDocument, int pageIndex) {
        s.k(pdfDocument, "pdfDocument");
        return pageIndex;
    }

    @e
    public final long openTextPage(PdfDocument pdfDocument, int pageIndex) {
        s.k(pdfDocument, "pdfDocument");
        return pageIndex;
    }

    @e
    public final boolean renderPage(PdfDocument pdfDocument, Surface surface, int pageIndex, int startX, int startY, int drawSizeX, int drawSizeY, boolean renderAnnot) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            int[] iArr = new int[2];
            long[] jArr = new long[2];
            if (surface != null) {
                PdfPage.INSTANCE.lockSurface(surface, iArr, jArr);
            }
            boolean zRenderPage = false;
            long j11 = jArr[0];
            long j12 = jArr[1];
            if (j12 != 0 && j12 != -1 && j11 != 0 && j11 != -1) {
                zRenderPage = pdfPageOpenPage.renderPage(j12, startX, startY, drawSizeX, drawSizeY, (192 & 32) != 0 ? false : renderAnnot, (192 & 64) != 0 ? -8092540 : 0, (192 & 128) != 0 ? -1 : 0);
                if (surface != null) {
                    PdfPage.INSTANCE.unlockSurface(jArr);
                }
            }
            h0 h0Var = h0.f84049a;
            b.a(pdfPageOpenPage, null);
            return zRenderPage;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    @e
    public final void renderPageBitmap(PdfDocument pdfDocument, Bitmap bitmap, int pageIndex, int startX, int startY, int drawSizeX, int drawSizeY, boolean renderAnnot, boolean textMask) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            PdfPage.renderPageBitmap$default(pdfPageOpenPage, bitmap, startX, startY, drawSizeX, drawSizeY, renderAnnot, textMask, 0, 0, KyberEngine.KyberPolyBytes, null);
            h0 h0Var = h0.f84049a;
            b.a(pdfPageOpenPage, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    @e
    public final int textPageCountChars(PdfDocument pdfDocument, int pageIndex) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            PdfTextPage pdfTextPageOpenTextPage = pdfPageOpenPage.openTextPage();
            try {
                int iTextPageCountChars = pdfTextPageOpenTextPage.textPageCountChars();
                b.a(pdfTextPageOpenTextPage, null);
                b.a(pdfPageOpenPage, null);
                return iTextPageCountChars;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(pdfTextPageOpenTextPage, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(pdfPageOpenPage, th4);
                throw th5;
            }
        }
    }

    @e
    public final int textPageCountRects(PdfDocument pdfDocument, int pageIndex, int startIndex, int count) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            PdfTextPage pdfTextPageOpenTextPage = pdfPageOpenPage.openTextPage();
            try {
                int iTextPageCountRects = pdfTextPageOpenTextPage.textPageCountRects(startIndex, count);
                b.a(pdfTextPageOpenTextPage, null);
                b.a(pdfPageOpenPage, null);
                return iTextPageCountRects;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(pdfTextPageOpenTextPage, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(pdfPageOpenPage, th4);
                throw th5;
            }
        }
    }

    @e
    public final String textPageGetBoundedText(PdfDocument pdfDocument, int pageIndex, RectF sourceRect, int size) {
        s.k(pdfDocument, "pdfDocument");
        s.k(sourceRect, "sourceRect");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            PdfTextPage pdfTextPageOpenTextPage = pdfPageOpenPage.openTextPage();
            try {
                String strTextPageGetBoundedText = pdfTextPageOpenTextPage.textPageGetBoundedText(sourceRect, size);
                b.a(pdfTextPageOpenTextPage, null);
                b.a(pdfPageOpenPage, null);
                return strTextPageGetBoundedText;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(pdfTextPageOpenTextPage, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(pdfPageOpenPage, th4);
                throw th5;
            }
        }
    }

    @e
    public final RectF textPageGetRect(PdfDocument pdfDocument, int pageIndex, int index) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            PdfTextPage pdfTextPageOpenTextPage = pdfPageOpenPage.openTextPage();
            try {
                RectF rectFTextPageGetRect = pdfTextPageOpenTextPage.textPageGetRect(index);
                b.a(pdfTextPageOpenTextPage, null);
                b.a(pdfPageOpenPage, null);
                return rectFTextPageGetRect;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(pdfTextPageOpenTextPage, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(pdfPageOpenPage, th4);
                throw th5;
            }
        }
    }

    @e
    public final String textPageGetText(PdfDocument pdfDocument, int pageIndex, int start, int count) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            PdfTextPage pdfTextPageOpenTextPage = pdfPageOpenPage.openTextPage();
            try {
                String strTextPageGetText = pdfTextPageOpenTextPage.textPageGetText(start, count);
                b.a(pdfTextPageOpenTextPage, null);
                b.a(pdfPageOpenPage, null);
                return strTextPageGetText;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(pdfTextPageOpenTextPage, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(pdfPageOpenPage, th4);
                throw th5;
            }
        }
    }

    public PdfiumCore(Context context, Config config) {
        Resources resources;
        DisplayMetrics displayMetrics;
        s.k(config, "config");
        this.config = config;
        ConfigKt.setPdfiumConfig(config);
        Logger logger = Logger.INSTANCE;
        logger.setLogger(config.getLogger());
        String TAG2 = TAG;
        s.j(TAG2, "TAG");
        logger.d(TAG2, "Starting PdfiumAndroid ");
        this.mCurrentDpi = (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? -1 : displayMetrics.densityDpi;
        isReady.waitForReady();
    }

    public final PdfDocument newDocument(ParcelFileDescriptor parcelFileDescriptor, String password) {
        PdfDocument pdfDocument;
        s.k(parcelFileDescriptor, "parcelFileDescriptor");
        synchronized (lock) {
            pdfDocument = new PdfDocument(nativeOpenDocument(parcelFileDescriptor.getFd(), password));
            pdfDocument.setParcelFileDescriptor(parcelFileDescriptor);
            pdfDocument.setSource(null);
        }
        return pdfDocument;
    }

    @e
    public final Long[] openPage(PdfDocument pdfDocument, int fromIndex, int toIndex) {
        s.k(pdfDocument, "pdfDocument");
        return (Long[]) v.m1(new m(fromIndex, toIndex)).toArray(new Long[0]);
    }

    @e
    public final void renderPageBitmap(PdfDocument pdfDocument, Bitmap bitmap, int pageIndex, int startX, int startY, int drawSizeX, int drawSizeY, boolean renderAnnot) {
        s.k(pdfDocument, "pdfDocument");
        PdfPage pdfPageOpenPage = pdfDocument.openPage(pageIndex);
        try {
            PdfPage.renderPageBitmap$default(pdfPageOpenPage, bitmap, startX, startY, drawSizeX, drawSizeY, renderAnnot, false, 0, 0, 448, null);
            h0 h0Var = h0.f84049a;
            b.a(pdfPageOpenPage, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(pdfPageOpenPage, th2);
                throw th3;
            }
        }
    }

    public final PdfDocument newDocument(byte[] data) {
        return newDocument(data, (String) null);
    }

    public final PdfDocument newDocument(byte[] data, String password) {
        PdfDocument pdfDocument;
        synchronized (lock) {
            pdfDocument = new PdfDocument(nativeOpenMemDocument(data, password));
            pdfDocument.setParcelFileDescriptor(null);
            pdfDocument.setSource(null);
        }
        return pdfDocument;
    }

    public /* synthetic */ PdfiumCore(Context context, Config config, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : context, (i11 & 2) != 0 ? new Config(null, null, 3, null) : config);
    }

    public final PdfDocument newDocument(PdfiumSource data) {
        s.k(data, "data");
        return newDocument(data, (String) null);
    }

    public final PdfDocument newDocument(PdfiumSource data, String password) {
        PdfDocument pdfDocument;
        s.k(data, "data");
        synchronized (lock) {
            pdfDocument = new PdfDocument(nativeOpenCustomDocument(new PdfiumNativeSourceBridge(data), password, data.getLength()));
            pdfDocument.setParcelFileDescriptor(null);
            pdfDocument.setSource(data);
        }
        return pdfDocument;
    }
}

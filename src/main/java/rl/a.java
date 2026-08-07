package rl;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import mm.d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001/BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#J/\u0010(\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010$\u001a\u00020 2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J'\u0010*\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010$\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010+J7\u0010-\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0017H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0017H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00104\u001a\u00020\u0017H\u0016¢\u0006\u0004\b4\u00100J\u000f\u00105\u001a\u00020\u0017H\u0016¢\u0006\u0004\b5\u00100J\u000f\u00106\u001a\u00020\u0017H\u0016¢\u0006\u0004\b6\u00100J'\u00109\u001a\u00020\u000b2\u0006\u00108\u001a\u0002072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u0010:J\u0019\u0010<\u001a\u00020\u001c2\b\b\u0001\u0010;\u001a\u00020\u0017H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010@\u001a\u00020\u001c2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u00020\u001c2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0017H\u0016¢\u0006\u0004\bF\u00100J\u000f\u0010G\u001a\u00020\u0017H\u0016¢\u0006\u0004\bG\u00100J\u000f\u0010H\u001a\u00020\u001cH\u0016¢\u0006\u0004\bH\u0010\u001eJ\u000f\u0010I\u001a\u00020\u001cH\u0016¢\u0006\u0004\bI\u0010\u001eJ\u0019\u0010L\u001a\u00020\u001c2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010NR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010OR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010PR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010QR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010RR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010SR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010TR\u0019\u0010Y\u001a\u0004\u0018\u00010U8\u0006¢\u0006\f\n\u0004\bL\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010^R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010`R\u0016\u0010b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010aR\u0016\u0010c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010aR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010eR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010hR\u0016\u0010j\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010aR\u0018\u0010l\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010k¨\u0006m"}, d2 = {"Lrl/a;", "Lql/a;", "Lql/c$b;", "Lmm/d;", "platformBitmapFactory", "Lrl/b;", "bitmapFrameCache", "Lql/d;", "animationInformation", "Lrl/c;", "bitmapFrameRenderer", "", "isNewRenderImplementation", "Ltl/a;", "bitmapFramePreparationStrategy", "Ltl/b;", "bitmapFramePreparer", "Ldm/d;", "roundingOptions", "<init>", "(Lmm/d;Lrl/b;Lql/d;Lrl/c;ZLtl/a;Ltl/b;Ldm/d;)V", "Landroid/graphics/Canvas;", "canvas", "", "frameNumber", "frameType", "q", "(Landroid/graphics/Canvas;II)Z", "Ljn0/h0;", "s", "()V", "Ltk/a;", "Landroid/graphics/Bitmap;", "targetBitmap", "r", "(ILtk/a;)Z", "bitmap", "", "currentBoundsWidth", "currentBoundsHeight", "t", "(ILandroid/graphics/Bitmap;FF)Z", "o", "(ILandroid/graphics/Bitmap;Landroid/graphics/Canvas;)V", "bitmapReference", "p", "(ILtk/a;Landroid/graphics/Canvas;I)Z", "a", "()I", "j", "(I)I", "l", "g", IntegerTokenConverter.CONVERTER_KEY, "b", "Landroid/graphics/drawable/Drawable;", "parent", "m", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;I)Z", "alpha", "k", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "f", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Rect;", "bounds", "e", "(Landroid/graphics/Rect;)V", "c", DateTokenConverter.CONVERTER_KEY, "clear", "n", "Lql/a$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "h", "(Lql/a$a;)V", "Lmm/d;", "Lrl/b;", "Lql/d;", "Lrl/c;", "Z", "Ltl/a;", "Ltl/b;", "", "[F", "getCornerRadii", "()[F", "cornerRadii", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Rect;", "I", "bitmapWidth", "bitmapHeight", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "matrix", "pathFrameNumber", "Lql/a$a;", "animationListener", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements ql.a, ql.c.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Class<a> f108546s = a.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b bitmapFrameCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ql.d animationInformation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c bitmapFrameRenderer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isNewRenderImplementation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final tl.a bitmapFramePreparationStrategy;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final tl.b bitmapFramePreparer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float[] cornerRadii;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Rect bounds;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int bitmapWidth;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int bitmapHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Path path;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Matrix matrix;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int pathFrameNumber;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private ql.a.InterfaceC2242a animationListener;

    public a(d platformBitmapFactory, b bitmapFrameCache, ql.d animationInformation, c bitmapFrameRenderer, boolean z11, tl.a aVar, tl.b bVar, dm.d dVar) {
        s.k(platformBitmapFactory, "platformBitmapFactory");
        s.k(bitmapFrameCache, "bitmapFrameCache");
        s.k(animationInformation, "animationInformation");
        s.k(bitmapFrameRenderer, "bitmapFrameRenderer");
        this.platformBitmapFactory = platformBitmapFactory;
        this.bitmapFrameCache = bitmapFrameCache;
        this.animationInformation = animationInformation;
        this.bitmapFrameRenderer = bitmapFrameRenderer;
        this.isNewRenderImplementation = z11;
        this.bitmapFramePreparationStrategy = aVar;
        this.bitmapFramePreparer = bVar;
        this.cornerRadii = null;
        this.bitmapConfig = Bitmap.Config.ARGB_8888;
        this.paint = new Paint(6);
        this.path = new Path();
        this.matrix = new Matrix();
        this.pathFrameNumber = -1;
        s();
    }

    private final void o(int frameNumber, Bitmap bitmap, Canvas canvas) {
        Rect rect = this.bounds;
        if (rect == null) {
            canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.paint);
        } else if (t(frameNumber, bitmap, rect.width(), rect.height())) {
            canvas.drawPath(this.path, this.paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.paint);
        }
    }

    private final boolean p(int frameNumber, tk.a<Bitmap> bitmapReference, Canvas canvas, int frameType) {
        if (bitmapReference == null || !tk.a.b0(bitmapReference)) {
            return false;
        }
        Bitmap bitmapH = bitmapReference.H();
        s.j(bitmapH, "get(...)");
        o(frameNumber, bitmapH, canvas);
        if (frameType == 3 || this.isNewRenderImplementation) {
            return true;
        }
        this.bitmapFrameCache.b(frameNumber, bitmapReference, frameType);
        return true;
    }

    private final boolean q(Canvas canvas, int frameNumber, int frameType) throws Throwable {
        tk.a<Bitmap> aVarE;
        boolean zP;
        tk.a<Bitmap> aVar = null;
        try {
            boolean z11 = false;
            int i11 = 1;
            if (this.isNewRenderImplementation) {
                tl.a aVar2 = this.bitmapFramePreparationStrategy;
                tk.a<Bitmap> aVarB = aVar2 != null ? aVar2.b(frameNumber, canvas.getWidth(), canvas.getHeight()) : null;
                if (aVarB != null) {
                    try {
                        if (aVarB.J()) {
                            Bitmap bitmapH = aVarB.H();
                            s.j(bitmapH, "get(...)");
                            o(frameNumber, bitmapH, canvas);
                            tk.a.C(aVarB);
                            return true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = aVarB;
                        tk.a.C(aVar);
                        throw th;
                    }
                }
                tl.a aVar3 = this.bitmapFramePreparationStrategy;
                if (aVar3 != null) {
                    aVar3.a(canvas.getWidth(), canvas.getHeight(), null);
                }
                tk.a.C(aVarB);
                return false;
            }
            if (frameType == 0) {
                aVarE = this.bitmapFrameCache.e(frameNumber);
                zP = p(frameNumber, aVarE, canvas, 0);
            } else if (frameType == 1) {
                aVarE = this.bitmapFrameCache.f(frameNumber, this.bitmapWidth, this.bitmapHeight);
                if (r(frameNumber, aVarE) && p(frameNumber, aVarE, canvas, 1)) {
                    z11 = true;
                }
                zP = z11;
                i11 = 2;
            } else if (frameType == 2) {
                try {
                    aVarE = this.platformBitmapFactory.b(this.bitmapWidth, this.bitmapHeight, this.bitmapConfig);
                    if (r(frameNumber, aVarE) && p(frameNumber, aVarE, canvas, 2)) {
                        z11 = true;
                    }
                    zP = z11;
                    i11 = 3;
                } catch (RuntimeException e11) {
                    qk.a.F(f108546s, "Failed to create frame bitmap", e11);
                    tk.a.C(null);
                    return false;
                }
            } else {
                if (frameType != 3) {
                    tk.a.C(null);
                    return false;
                }
                aVarE = this.bitmapFrameCache.d(frameNumber);
                zP = p(frameNumber, aVarE, canvas, 3);
                i11 = -1;
            }
            tk.a.C(aVarE);
            return (zP || i11 == -1) ? zP : q(canvas, frameNumber, i11);
        } catch (Throwable th3) {
            th = th3;
            tk.a.C(aVar);
            throw th;
        }
    }

    private final boolean r(int frameNumber, tk.a<Bitmap> targetBitmap) {
        if (targetBitmap == null || !targetBitmap.J()) {
            return false;
        }
        c cVar = this.bitmapFrameRenderer;
        Bitmap bitmapH = targetBitmap.H();
        s.j(bitmapH, "get(...)");
        boolean zA = cVar.a(frameNumber, bitmapH);
        if (!zA) {
            tk.a.C(targetBitmap);
        }
        return zA;
    }

    private final void s() {
        int iC = this.bitmapFrameRenderer.c();
        this.bitmapWidth = iC;
        if (iC == -1) {
            Rect rect = this.bounds;
            this.bitmapWidth = rect != null ? rect.width() : -1;
        }
        int iD = this.bitmapFrameRenderer.d();
        this.bitmapHeight = iD;
        if (iD == -1) {
            Rect rect2 = this.bounds;
            this.bitmapHeight = rect2 != null ? rect2.height() : -1;
        }
    }

    private final boolean t(int frameNumber, Bitmap bitmap, float currentBoundsWidth, float currentBoundsHeight) {
        if (this.cornerRadii == null) {
            return false;
        }
        if (frameNumber == this.pathFrameNumber) {
            return true;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.matrix.setRectToRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.bitmapWidth, this.bitmapHeight), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, currentBoundsWidth, currentBoundsHeight), Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(this.matrix);
        this.paint.setShader(bitmapShader);
        this.path.addRoundRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, currentBoundsWidth, currentBoundsHeight), this.cornerRadii, Path.Direction.CW);
        this.pathFrameNumber = frameNumber;
        return true;
    }

    @Override // ql.d
    public int a() {
        return this.animationInformation.a();
    }

    @Override // ql.d
    public int b() {
        return this.animationInformation.b();
    }

    @Override // ql.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getBitmapWidth() {
        return this.bitmapWidth;
    }

    @Override // ql.a
    public void clear() {
        if (!this.isNewRenderImplementation) {
            this.bitmapFrameCache.clear();
            return;
        }
        tl.a aVar = this.bitmapFramePreparationStrategy;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // ql.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getBitmapHeight() {
        return this.bitmapHeight;
    }

    @Override // ql.a
    public void e(Rect bounds) {
        this.bounds = bounds;
        this.bitmapFrameRenderer.e(bounds);
        s();
    }

    @Override // ql.a
    public void f(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override // ql.d
    public int g() {
        return this.animationInformation.g();
    }

    @Override // ql.a
    public void h(ql.a.InterfaceC2242a listener) {
        this.animationListener = listener;
    }

    @Override // ql.d
    public int i() {
        return this.animationInformation.i();
    }

    @Override // ql.d
    public int j(int frameNumber) {
        return this.animationInformation.j(frameNumber);
    }

    @Override // ql.a
    public void k(int alpha) {
        this.paint.setAlpha(alpha);
    }

    @Override // ql.d
    public int l() {
        return this.animationInformation.l();
    }

    @Override // ql.a
    public boolean m(Drawable parent, Canvas canvas, int frameNumber) throws Throwable {
        tl.b bVar;
        tl.a aVar;
        s.k(parent, "parent");
        s.k(canvas, "canvas");
        boolean zQ = q(canvas, frameNumber, 0);
        if (!this.isNewRenderImplementation && (bVar = this.bitmapFramePreparer) != null && (aVar = this.bitmapFramePreparationStrategy) != null) {
            tl.a.C2455a.f(aVar, bVar, this.bitmapFrameCache, this, frameNumber, null, 16, null);
        }
        return zQ;
    }

    @Override // ql.c.b
    public void n() {
        if (!this.isNewRenderImplementation) {
            clear();
            return;
        }
        tl.a aVar = this.bitmapFramePreparationStrategy;
        if (aVar != null) {
            aVar.onStop();
        }
    }
}

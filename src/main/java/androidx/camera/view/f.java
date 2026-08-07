package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.NonNull;
import c0.y0;
import c0.z1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final PreviewView.e f3723i = PreviewView.e.FILL_CENTER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Size f3724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f3725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Matrix f3727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f3730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PreviewView.e f3731h = f3723i;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3732a;

        static {
            int[] iArr = new int[PreviewView.e.values().length];
            f3732a = iArr;
            try {
                iArr[PreviewView.e.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3732a[PreviewView.e.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3732a[PreviewView.e.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3732a[PreviewView.e.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3732a[PreviewView.e.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3732a[PreviewView.e.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    f() {
    }

    private static RectF b(RectF rectF, float f11) {
        float f12 = f11 + f11;
        return new RectF(f12 - rectF.right, rectF.top, f12 - rectF.left, rectF.bottom);
    }

    private int e() {
        return !this.f3730g ? this.f3726c : -h0.c.b(this.f3728e);
    }

    private Size f() {
        return h0.s.i(this.f3726c) ? new Size(this.f3725b.height(), this.f3725b.width()) : new Size(this.f3725b.width(), this.f3725b.height());
    }

    private RectF l(Size size, int i11) {
        u5.h.i(m());
        Matrix matrixJ = j(size, i11);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f3724a.getWidth(), this.f3724a.getHeight());
        matrixJ.mapRect(rectF);
        return rectF;
    }

    private boolean m() {
        return (this.f3725b == null || this.f3724a == null || !(!this.f3730g || this.f3728e != -1)) ? false : true;
    }

    private static void p(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.e eVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f3732a[eVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                y0.c("PreviewTransform", "Unexpected crop rect: " + eVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (eVar == PreviewView.e.FIT_CENTER || eVar == PreviewView.e.FIT_START || eVar == PreviewView.e.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    Bitmap a(@NonNull Bitmap bitmap, Size size, int i11) {
        if (!m()) {
            return bitmap;
        }
        Matrix matrixK = k();
        RectF rectFL = l(size, i11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixK);
        matrix.postScale(rectFL.width() / this.f3724a.getWidth(), rectFL.height() / this.f3724a.getHeight());
        matrix.postTranslate(rectFL.left, rectFL.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    Matrix c(Size size, int i11, Rect rect) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        h(size, i11).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rect.width(), rect.height()), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    RectF d(Size size, int i11) {
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, size.getWidth(), size.getHeight());
        Size sizeF = f();
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, sizeF.getWidth(), sizeF.getHeight());
        Matrix matrix = new Matrix();
        p(matrix, rectF2, rectF, this.f3731h);
        matrix.mapRect(rectF2);
        return i11 == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    PreviewView.e g() {
        return this.f3731h;
    }

    Matrix h(@NonNull Size size, int i11) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f3727d);
        matrix.postConcat(j(size, i11));
        return matrix;
    }

    Rect i() {
        return this.f3725b;
    }

    Matrix j(Size size, int i11) {
        u5.h.i(m());
        Matrix matrixD = h0.s.d(new RectF(this.f3725b), n(size) ? new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, size.getWidth(), size.getHeight()) : d(size, i11), this.f3726c);
        if (this.f3729f && this.f3730g) {
            if (h0.s.i(this.f3726c)) {
                matrixD.preScale(1.0f, -1.0f, this.f3725b.centerX(), this.f3725b.centerY());
                return matrixD;
            }
            matrixD.preScale(-1.0f, 1.0f, this.f3725b.centerX(), this.f3725b.centerY());
        }
        return matrixD;
    }

    Matrix k() {
        u5.h.i(m());
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f3724a.getWidth(), this.f3724a.getHeight());
        return h0.s.d(rectF, rectF, e());
    }

    boolean n(Size size) {
        return h0.s.k(size, true, f(), false);
    }

    void o(int i11, int i12) {
        if (this.f3730g) {
            this.f3726c = i11;
            this.f3728e = i12;
        }
    }

    void q(PreviewView.e eVar) {
        this.f3731h = eVar;
    }

    void r(@NonNull z1.h hVar, Size size, boolean z11) {
        y0.a("PreviewTransform", "Transformation info set: " + hVar + " " + size + " " + z11);
        this.f3725b = hVar.a();
        this.f3726c = hVar.b();
        this.f3728e = hVar.d();
        this.f3724a = size;
        this.f3729f = z11;
        this.f3730g = hVar.e();
        this.f3727d = hVar.c();
    }

    void s(Size size, int i11, @NonNull View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            y0.l("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (m()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(k());
            } else {
                Display display = view.getDisplay();
                boolean z11 = false;
                boolean z12 = (!this.f3730g || display == null || display.getRotation() == this.f3728e) ? false : true;
                if (!this.f3730g && e() != 0) {
                    z11 = true;
                }
                if (z12 || z11) {
                    y0.c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFL = l(size, i11);
            view.setPivotX(BitmapDescriptorFactory.HUE_RED);
            view.setPivotY(BitmapDescriptorFactory.HUE_RED);
            view.setScaleX(rectFL.width() / this.f3724a.getWidth());
            view.setScaleY(rectFL.height() / this.f3724a.getHeight());
            view.setTranslationX(rectFL.left - view.getLeft());
            view.setTranslationY(rectFL.top - view.getTop());
        }
    }
}

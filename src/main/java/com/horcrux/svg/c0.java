package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class c0 extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ReadableMap f45341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a0 f45342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f45343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Canvas f45344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f45345e;

    public c0(ReactContext reactContext) {
        super(reactContext);
        this.f45345e = new Paint(1);
    }

    private static <T> T o(T t11) {
        t11.getClass();
        return t11;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f11) {
        p(canvas);
        clip(canvas, paint);
        h(canvas, paint, f11);
        renderMarkers(canvas, paint, f11);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        this.mPath = new Path();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt instanceof h0) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                this.mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return this.mPath;
    }

    void h(Canvas canvas, Paint paint, float f11) {
        n();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.f45343c;
            if (bitmap == null) {
                this.f45343c = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f45344d = new Canvas(this.f45343c);
            } else {
                bitmap.recycle();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f45343c = bitmapCreateBitmap;
                this.f45344d.setBitmap(bitmapCreateBitmap);
            }
            this.f45344d.save();
            this.f45344d.setMatrix(canvas.getMatrix());
        } else {
            this.f45344d = canvas;
        }
        this.elements = new ArrayList<>();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt instanceof h0)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z11 = virtualView instanceof RenderableView;
                        if (z11) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.f45344d, this.mCTM);
                        virtualView.render(this.f45344d, paint, f11);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(this.f45344d, iSaveAndSetupCanvas);
                        if (z11) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                        ArrayList<i0> arrayList = virtualView.elements;
                        if (arrayList != null) {
                            this.elements.addAll(arrayList);
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    if (svgView2.getChildCount() > 0) {
                        View childAt2 = svgView2.getChildAt(0);
                        if (childAt2 instanceof c0) {
                            ((c0) childAt2).mergeProperties(this);
                        }
                    }
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                }
            }
        }
        if (this.mOpacity != 1.0f) {
            this.f45344d.restore();
            int iSave = canvas.save();
            canvas.setMatrix(null);
            this.f45345e.setAlpha((int) (this.mOpacity * 255.0f));
            Bitmap bitmap2 = this.f45343c;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f45345e);
            }
            canvas.restoreToCount(iSave);
        }
        setClientRect(rectF);
        m();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        int iReactTagForTouch;
        VirtualView virtualView;
        int iHitTest;
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        Path clipPath = getClipPath();
        if (clipPath != null) {
            if (this.mClipRegionPath != clipPath) {
                this.mClipRegionPath = clipPath;
                RectF rectF = new RectF();
                this.mClipBounds = rectF;
                clipPath.computeBounds(rectF, true);
                this.mClipRegion = getRegion(clipPath, this.mClipBounds);
            }
            if (!this.mClipRegion.contains(iRound, iRound2)) {
                return -1;
            }
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof VirtualView) {
                if (!(childAt instanceof h0) && (iHitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                    return (virtualView.isResponsible() || iHitTest != childAt.getId()) ? iHitTest : getId();
                }
            } else if ((childAt instanceof SvgView) && (iReactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                return iReactTagForTouch;
            }
        }
        return -1;
    }

    void i(Canvas canvas, Paint paint, float f11) {
        super.draw(canvas, paint, f11);
    }

    a0 j() {
        return this.f45342b;
    }

    Path k(Canvas canvas, Paint paint, Region.Op op2) {
        Path path = new Path();
        Path.Op opValueOf = Path.Op.valueOf(op2.name());
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt instanceof h0) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path pathK = virtualView instanceof c0 ? ((c0) virtualView).k(canvas, paint, op2) : virtualView.getPath(canvas, paint);
                pathK.transform(matrix);
                path.op(pathK, opValueOf);
            }
        }
        return path;
    }

    a0 l() {
        return ((c0) o(getTextRoot())).j();
    }

    void m() {
        l().n();
    }

    void n() {
        l().o(this, this.f45341a);
    }

    void p(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        this.f45342b = new a0(this.mScale, rectF.width(), rectF.height());
    }

    @Override // com.horcrux.svg.RenderableView
    void resetProperties() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    public void setFont(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Map) {
            this.f45341a = dynamic.asMap();
        } else {
            this.f45341a = null;
        }
        invalidate();
    }

    public void setFont(ReadableMap readableMap) {
        this.f45341a = readableMap;
        invalidate();
    }
}

package com.canhub.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0014\u0010 \u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001f¨\u0006-"}, d2 = {"Lcom/canhub/cropper/k;", "Landroid/view/animation/Animation;", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/widget/ImageView;", "imageView", "Lcom/canhub/cropper/CropOverlayView;", "cropOverlayView", "<init>", "(Landroid/widget/ImageView;Lcom/canhub/cropper/CropOverlayView;)V", "", "boundPoints", "Landroid/graphics/Matrix;", "imageMatrix", "Ljn0/h0;", "b", "([FLandroid/graphics/Matrix;)V", "a", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "animation", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "Landroid/widget/ImageView;", "Lcom/canhub/cropper/CropOverlayView;", "c", "[F", "startBoundPoints", DateTokenConverter.CONVERTER_KEY, "endBoundPoints", "Landroid/graphics/RectF;", "e", "Landroid/graphics/RectF;", "startCropWindowRect", "f", "endCropWindowRect", "g", "startImageMatrix", "h", "endImageMatrix", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends Animation implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageView imageView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CropOverlayView cropOverlayView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float[] startBoundPoints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float[] endBoundPoints;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final RectF startCropWindowRect;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final RectF endCropWindowRect;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float[] startImageMatrix;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float[] endImageMatrix;

    public k(ImageView imageView, CropOverlayView cropOverlayView) {
        p013kotlin.jvm.internal.s.k(imageView, "imageView");
        p013kotlin.jvm.internal.s.k(cropOverlayView, "cropOverlayView");
        this.imageView = imageView;
        this.cropOverlayView = cropOverlayView;
        this.startBoundPoints = new float[8];
        this.endBoundPoints = new float[8];
        this.startCropWindowRect = new RectF();
        this.endCropWindowRect = new RectF();
        this.startImageMatrix = new float[9];
        this.endImageMatrix = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public final void a(float[] boundPoints, Matrix imageMatrix) {
        p013kotlin.jvm.internal.s.k(boundPoints, "boundPoints");
        p013kotlin.jvm.internal.s.k(imageMatrix, "imageMatrix");
        System.arraycopy(boundPoints, 0, this.endBoundPoints, 0, 8);
        this.endCropWindowRect.set(this.cropOverlayView.getCropWindowRect());
        imageMatrix.getValues(this.endImageMatrix);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float interpolatedTime, Transformation t11) {
        p013kotlin.jvm.internal.s.k(t11, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.startCropWindowRect;
        float f11 = rectF2.left;
        RectF rectF3 = this.endCropWindowRect;
        rectF.left = f11 + ((rectF3.left - f11) * interpolatedTime);
        float f12 = rectF2.top;
        rectF.top = f12 + ((rectF3.top - f12) * interpolatedTime);
        float f13 = rectF2.right;
        rectF.right = f13 + ((rectF3.right - f13) * interpolatedTime);
        float f14 = rectF2.bottom;
        rectF.bottom = f14 + ((rectF3.bottom - f14) * interpolatedTime);
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            float f15 = this.startBoundPoints[i11];
            fArr[i11] = f15 + ((this.endBoundPoints[i11] - f15) * interpolatedTime);
        }
        CropOverlayView cropOverlayView = this.cropOverlayView;
        cropOverlayView.setCropWindowRect(rectF);
        cropOverlayView.setBounds(fArr, this.imageView.getWidth(), this.imageView.getHeight());
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i12 = 0; i12 < 9; i12++) {
            float f16 = this.startImageMatrix[i12];
            fArr2[i12] = f16 + ((this.endImageMatrix[i12] - f16) * interpolatedTime);
        }
        ImageView imageView = this.imageView;
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    public final void b(float[] boundPoints, Matrix imageMatrix) {
        p013kotlin.jvm.internal.s.k(boundPoints, "boundPoints");
        p013kotlin.jvm.internal.s.k(imageMatrix, "imageMatrix");
        reset();
        System.arraycopy(boundPoints, 0, this.startBoundPoints, 0, 8);
        this.startCropWindowRect.set(this.cropOverlayView.getCropWindowRect());
        imageMatrix.getValues(this.startImageMatrix);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        p013kotlin.jvm.internal.s.k(animation, "animation");
        this.imageView.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        p013kotlin.jvm.internal.s.k(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        p013kotlin.jvm.internal.s.k(animation, "animation");
    }
}

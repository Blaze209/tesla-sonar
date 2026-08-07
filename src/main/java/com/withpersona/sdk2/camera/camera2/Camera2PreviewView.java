package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljn0/h0;", "a", "()V", "w", "h", "orientationDegrees", "setCameraPreviewSize", "(III)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "I", "previewW", "b", "previewH", "Landroid/view/SurfaceView;", "c", "Landroid/view/SurfaceView;", "getSurfaceView", "()Landroid/view/SurfaceView;", "setSurfaceView", "(Landroid/view/SurfaceView;)V", "surfaceView", "Landroid/view/SurfaceHolder;", "getHolder", "()Landroid/view/SurfaceHolder;", "holder", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Camera2PreviewView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int previewW;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int previewH;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private SurfaceView surfaceView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2PreviewView(Context context) {
        super(context);
        s.k(context, "context");
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        addView(surfaceView);
    }

    public final void a() {
        removeAllViews();
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        addView(surfaceView);
        requestLayout();
    }

    public final SurfaceHolder getHolder() {
        SurfaceHolder holder = this.surfaceView.getHolder();
        s.j(holder, "getHolder(...)");
        return holder;
    }

    public final SurfaceView getSurfaceView() {
        return this.surfaceView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.previewW == 0 || this.previewH == 0) {
            this.surfaceView.layout(left, top, right, bottom);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        double dMax = Double.max(((double) measuredWidth) / ((double) this.previewW), ((double) measuredHeight) / ((double) this.previewH));
        int iCeil = (int) Math.ceil(((double) this.previewW) * dMax);
        int iCeil2 = (int) Math.ceil(dMax * ((double) this.previewH));
        int iF = (n.f(iCeil - measuredWidth, 0) / 2) * (-1);
        int iF2 = (n.f(iCeil2 - measuredHeight, 0) / 2) * (-1);
        this.surfaceView.layout(iF, iF2, iCeil + iF, iCeil2 + iF2);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize(Integer.MAX_VALUE, widthMeasureSpec), View.resolveSize(Integer.MAX_VALUE, heightMeasureSpec));
        this.surfaceView.measure(View.MeasureSpec.makeMeasureSpec(this.previewW, 1073741824), View.MeasureSpec.makeMeasureSpec(this.previewH, 1073741824));
    }

    public final void setCameraPreviewSize(int w11, int h11, int orientationDegrees) {
        if (orientationDegrees == 90 || orientationDegrees == 270) {
            this.previewW = h11;
            this.previewH = w11;
        } else {
            this.previewW = w11;
            this.previewH = h11;
        }
        getHolder().setFixedSize(w11, h11);
        requestLayout();
    }

    public final void setSurfaceView(SurfaceView surfaceView) {
        s.k(surfaceView, "<set-?>");
        this.surfaceView = surfaceView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.k(context, "context");
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        addView(surfaceView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2PreviewView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        addView(surfaceView);
    }
}

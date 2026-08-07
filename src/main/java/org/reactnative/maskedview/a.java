package org.reactnative.maskedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.facebook.react.views.view.e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes10.dex */
public class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f99340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f99341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f99342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PorterDuffXfermode f99343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f99344e;

    public a(Context context) {
        super(context);
        this.f99340a = null;
        this.f99341b = false;
        this.f99344e = 2;
        this.f99342c = new Paint(1);
        this.f99343d = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    public static Bitmap h(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private void i() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setVisibility(0);
            Bitmap bitmap = this.f99340a;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f99340a = h(childAt);
            childAt.setVisibility(4);
        }
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f99341b) {
            i();
            this.f99341b = false;
        }
        if (this.f99340a != null) {
            setLayerType(this.f99344e, this.f99342c);
            this.f99342c.setXfermode(this.f99343d);
            canvas.drawBitmap(this.f99340a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f99342c);
            this.f99342c.setXfermode(null);
        }
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f99341b = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        View childAt;
        super.onDescendantInvalidated(view, view2);
        if (!this.f99341b && (childAt = getChildAt(0)) != null && childAt.equals(view)) {
            this.f99341b = true;
        }
        invalidate();
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            this.f99341b = true;
        }
    }

    public void setRenderingMode(String str) {
        this.f99344e = str.equals("software") ? 1 : 2;
    }
}

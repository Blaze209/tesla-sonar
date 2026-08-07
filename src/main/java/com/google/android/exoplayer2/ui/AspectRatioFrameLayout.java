package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f40760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f40761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40762c;

    public interface b {
    }

    private final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f40763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f40764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f40765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f40766d;

        private c() {
        }

        public void a(float f11, float f12, boolean z11) {
            this.f40763a = f11;
            this.f40764b = f12;
            this.f40765c = z11;
            if (this.f40766d) {
                return;
            }
            this.f40766d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f40766d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f40762c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        float f11;
        float f12;
        super.onMeasure(i11, i12);
        if (this.f40761b <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f13 = measuredWidth;
        float f14 = measuredHeight;
        float f15 = f13 / f14;
        float f16 = (this.f40761b / f15) - 1.0f;
        if (Math.abs(f16) <= 0.01f) {
            this.f40760a.a(this.f40761b, f15, false);
            return;
        }
        int i13 = this.f40762c;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    f11 = this.f40761b;
                } else if (i13 == 4) {
                    if (f16 > BitmapDescriptorFactory.HUE_RED) {
                        f11 = this.f40761b;
                    } else {
                        f12 = this.f40761b;
                    }
                }
                measuredWidth = (int) (f14 * f11);
            } else {
                f12 = this.f40761b;
            }
            measuredHeight = (int) (f13 / f12);
        } else if (f16 > BitmapDescriptorFactory.HUE_RED) {
            f12 = this.f40761b;
            measuredHeight = (int) (f13 / f12);
        } else {
            f11 = this.f40761b;
            measuredWidth = (int) (f14 * f11);
        }
        this.f40760a.a(this.f40761b, f15, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f11) {
        if (this.f40761b != f11) {
            this.f40761b = f11;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i11) {
        if (this.f40762c != i11) {
            this.f40762c = i11;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40762c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rs.q.f109167a, 0, 0);
            try {
                this.f40762c = typedArrayObtainStyledAttributes.getInt(rs.q.f109169b, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f40760a = new c();
    }
}

package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f12686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f12687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12688c;

    public interface b {
    }

    private final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f12689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f12690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f12692d;

        private c() {
        }

        public void a(float f11, float f12, boolean z11) {
            this.f12689a = f11;
            this.f12690b = f12;
            this.f12691c = z11;
            if (this.f12692d) {
                return;
            }
            this.f12692d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12692d = false;
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
        return this.f12688c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        float f11;
        float f12;
        super.onMeasure(i11, i12);
        if (this.f12687b <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f13 = measuredWidth;
        float f14 = measuredHeight;
        float f15 = f13 / f14;
        float f16 = (this.f12687b / f15) - 1.0f;
        if (Math.abs(f16) <= 0.01f) {
            this.f12686a.a(this.f12687b, f15, false);
            return;
        }
        int i13 = this.f12688c;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    f11 = this.f12687b;
                } else if (i13 == 4) {
                    if (f16 > BitmapDescriptorFactory.HUE_RED) {
                        f11 = this.f12687b;
                    } else {
                        f12 = this.f12687b;
                    }
                }
                measuredWidth = (int) (f14 * f11);
            } else {
                f12 = this.f12687b;
            }
            measuredHeight = (int) (f13 / f12);
        } else if (f16 > BitmapDescriptorFactory.HUE_RED) {
            f12 = this.f12687b;
            measuredHeight = (int) (f13 / f12);
        } else {
            f11 = this.f12687b;
            measuredWidth = (int) (f14 * f11);
        }
        this.f12686a.a(this.f12687b, f15, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f11) {
        if (this.f12687b != f11) {
            this.f12687b = f11;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i11) {
        if (this.f12688c != i11) {
            this.f12688c = i11;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12688c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ia.z.f77294a, 0, 0);
            try {
                this.f12688c = typedArrayObtainStyledAttributes.getInt(ia.z.f77296b, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f12686a = new c();
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0062a f2556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f2557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ActionMenuView f2558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected c f2559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f2560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ViewPropertyAnimatorCompat f2561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2563h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0062a implements androidx.core.view.w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2564a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2565b;

        protected C0062a() {
        }

        @Override // androidx.core.view.w0
        public void a(View view) {
            this.f2564a = true;
        }

        @Override // androidx.core.view.w0
        public void b(View view) {
            if (this.f2564a) {
                return;
            }
            a aVar = a.this;
            aVar.f2561f = null;
            a.super.setVisibility(this.f2565b);
        }

        @Override // androidx.core.view.w0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f2564a = false;
        }

        public C0062a d(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, int i11) {
            a.this.f2561f = viewPropertyAnimatorCompat;
            this.f2565b = i11;
            return this;
        }
    }

    a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i11, int i12, boolean z11) {
        return z11 ? i11 - i12 : i11 + i12;
    }

    protected int c(View view, int i11, int i12, int i13) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), i12);
        return Math.max(0, (i11 - view.getMeasuredWidth()) - i13);
    }

    protected int e(View view, int i11, int i12, int i13, boolean z11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i14 = i12 + ((i13 - measuredHeight) / 2);
        if (z11) {
            view.layout(i11 - measuredWidth, i14, i11, measuredHeight + i14);
        } else {
            view.layout(i11, i14, i11 + measuredWidth, measuredHeight + i14);
        }
        return z11 ? -measuredWidth : measuredWidth;
    }

    public ViewPropertyAnimatorCompat f(int i11, long j11) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f2561f;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.c();
        }
        if (i11 != 0) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB = ViewCompat.e(this).b(BitmapDescriptorFactory.HUE_RED);
            viewPropertyAnimatorCompatB.e(j11);
            viewPropertyAnimatorCompatB.g(this.f2556a.d(viewPropertyAnimatorCompatB, i11));
            return viewPropertyAnimatorCompatB;
        }
        if (getVisibility() != 0) {
            setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB2 = ViewCompat.e(this).b(1.0f);
        viewPropertyAnimatorCompatB2.e(j11);
        viewPropertyAnimatorCompatB2.g(this.f2556a.d(viewPropertyAnimatorCompatB2, i11));
        return viewPropertyAnimatorCompatB2;
    }

    public int getAnimatedVisibility() {
        return this.f2561f != null ? this.f2556a.f2565b : getVisibility();
    }

    public int getContentHeight() {
        return this.f2560e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, i.j.f73865a, i.a.f73726c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(i.j.f73915j, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f2559d;
        if (cVar != null) {
            cVar.H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2563h = false;
        }
        if (!this.f2563h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f2563h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2563h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2562g = false;
        }
        if (!this.f2562g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f2562g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2562g = false;
        }
        return true;
    }

    public void setContentHeight(int i11) {
        this.f2560e = i11;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        if (i11 != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f2561f;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.c();
            }
            super.setVisibility(i11);
        }
    }

    a(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2556a = new C0062a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i.a.f73724a, typedValue, true) || typedValue.resourceId == 0) {
            this.f2557b = context;
        } else {
            this.f2557b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}

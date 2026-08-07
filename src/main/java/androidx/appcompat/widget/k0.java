package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewPropertyAnimatorCompat;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
class k0 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f2716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Field f2722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f2723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewPropertyAnimatorCompat f2727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.core.widget.j f2728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    b f2729n;

    private static class a extends k.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2730b;

        a(Drawable drawable) {
            super(drawable);
            this.f2730b = true;
        }

        void c(boolean z11) {
            this.f2730b = z11;
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f2730b) {
                super.draw(canvas);
            }
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public void setHotspot(float f11, float f12) {
            if (this.f2730b) {
                super.setHotspot(f11, f12);
            }
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i11, int i12, int i13, int i14) {
            if (this.f2730b) {
                super.setHotspotBounds(i11, i12, i13, i14);
            }
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f2730b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // k.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z11, boolean z12) {
            if (this.f2730b) {
                return super.setVisible(z11, z12);
            }
            return false;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void a() {
            k0 k0Var = k0.this;
            k0Var.f2729n = null;
            k0Var.removeCallbacks(this);
        }

        public void b() {
            k0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            k0 k0Var = k0.this;
            k0Var.f2729n = null;
            k0Var.drawableStateChanged();
        }
    }

    k0(@NonNull Context context, boolean z11) {
        super(context, null, i.a.D);
        this.f2716a = new Rect();
        this.f2717b = 0;
        this.f2718c = 0;
        this.f2719d = 0;
        this.f2720e = 0;
        this.f2725j = z11;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2722g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e11) {
            e11.printStackTrace();
        }
    }

    private void a() {
        this.f2726k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f2721f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f2727l;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.c();
            this.f2727l = null;
        }
    }

    private void b(View view, int i11) {
        performItemClick(view, i11, getItemIdAtPosition(i11));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f2716a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f2716a);
        selector.draw(canvas);
    }

    private void f(int i11, View view) {
        Rect rect = this.f2716a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f2717b;
        rect.top -= this.f2718c;
        rect.right += this.f2719d;
        rect.bottom += this.f2720e;
        try {
            boolean z11 = this.f2722g.getBoolean(this);
            if (view.isEnabled() != z11) {
                this.f2722g.set(this, Boolean.valueOf(!z11));
                if (i11 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
        }
    }

    private void g(int i11, View view) {
        Drawable selector = getSelector();
        boolean z11 = (selector == null || i11 == -1) ? false : true;
        if (z11) {
            selector.setVisible(false, false);
        }
        f(i11, view);
        if (z11) {
            Rect rect = this.f2716a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            l5.a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i11, View view, float f11, float f12) {
        g(i11, view);
        Drawable selector = getSelector();
        if (selector == null || i11 == -1) {
            return;
        }
        l5.a.k(selector, f11, f12);
    }

    private void i(View view, int i11, float f11, float f12) {
        View childAt;
        this.f2726k = true;
        drawableHotspotChanged(f11, f12);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i12 = this.f2721f;
        if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f2721f = i11;
        view.drawableHotspotChanged(f11 - view.getLeft(), f12 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i11, view, f11, f12);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return this.f2726k;
    }

    private void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z11) {
        a aVar = this.f2723h;
        if (aVar != null) {
            aVar.c(z11);
        }
    }

    public int d(int i11, int i12, int i13, int i14, int i15) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        View view = null;
        while (i16 < count) {
            int itemViewType = adapter.getItemViewType(i16);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            view = adapter.getView(i16, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i19 = layoutParams.height;
            view.measure(i11, i19 > 0 ? View.MeasureSpec.makeMeasureSpec(i19, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i16 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i14) {
                return (i15 < 0 || i16 <= i15 || i18 <= 0 || measuredHeight == i14) ? i14 : i18;
            }
            if (i15 >= 0 && i16 >= i15) {
                i18 = measuredHeight;
            }
            i16++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f2729n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        k();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean e(MotionEvent motionEvent, int i11) {
        boolean z11;
        boolean z12;
        androidx.core.widget.j jVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z11 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z11 = true;
                    z12 = false;
                } else {
                    z12 = false;
                    z11 = false;
                }
                if (z11 || z12) {
                    a();
                }
                if (z11) {
                    jVar = this.f2728m;
                    if (jVar != null) {
                        jVar.m(false);
                    }
                    return z11;
                }
                if (this.f2728m == null) {
                    this.f2728m = new androidx.core.widget.j(this);
                }
                this.f2728m.m(true);
                this.f2728m.onTouch(this, motionEvent);
                return z11;
            }
            z11 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i11);
        if (iFindPointerIndex < 0) {
            z12 = false;
            z11 = false;
        } else {
            int x11 = (int) motionEvent.getX(iFindPointerIndex);
            int y11 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x11, y11);
            if (iPointToPosition == -1) {
                z12 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                i(childAt, iPointToPosition, x11, y11);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z11 = true;
                z12 = false;
            }
        }
        if (z11) {
            a();
        } else {
            a();
        }
        if (z11) {
            jVar = this.f2728m;
            if (jVar != null) {
                jVar.m(false);
            }
            return z11;
        }
        if (this.f2728m == null) {
            this.f2728m = new androidx.core.widget.j(this);
        }
        this.f2728m.m(true);
        this.f2728m.onTouch(this, motionEvent);
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f2725j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f2725j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f2725j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f2725j && this.f2724i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f2729n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2729n == null) {
            b bVar = new b();
            this.f2729n = bVar;
            bVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
            }
            k();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2721f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f2729n;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z11) {
        this.f2724i = z11;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f2723h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2717b = rect.left;
        this.f2718c = rect.top;
        this.f2719d = rect.right;
        this.f2720e = rect.bottom;
    }
}

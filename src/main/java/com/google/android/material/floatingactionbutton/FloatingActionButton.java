package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import at.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.e0;
import java.util.List;
import st.k;
import st.n;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class FloatingActionButton extends e0 implements lt.a, n, CoordinatorLayout.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f42113r = l.f128805n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f42114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f42115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f42116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f42117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f42118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f42120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f42124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Rect f42125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f42126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    private final androidx.appcompat.widget.l f42127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    private final lt.b f42128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.d f42129q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            return super.f(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: L */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            return super.l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: M */
        public /* bridge */ /* synthetic */ boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i11) {
            return super.p(coordinatorLayout, floatingActionButton, i11);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void k(@NonNull CoordinatorLayout.f fVar) {
            super.k(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements com.google.android.material.floatingactionbutton.d.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f42133a;

        a(b bVar) {
            this.f42133a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.k
        public void a() {
            this.f42133a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.k
        public void b() {
            this.f42133a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements rt.b {
        c() {
        }

        @Override // rt.b
        public void a(int i11, int i12, int i13, int i14) {
            FloatingActionButton.this.f42125m.set(i11, i12, i13, i14);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i11 + floatingActionButton.f42122j, i12 + FloatingActionButton.this.f42122j, i13 + FloatingActionButton.this.f42122j, i14 + FloatingActionButton.this.f42122j);
        }

        @Override // rt.b
        public void b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // rt.b
        public boolean c() {
            return FloatingActionButton.this.f42124l;
        }
    }

    class d<T extends FloatingActionButton> implements com.google.android.material.floatingactionbutton.d.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final at.l<T> f42136a;

        d(at.l<T> lVar) {
            this.f42136a = lVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void a() {
            this.f42136a.a(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void b() {
            this.f42136a.b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f42136a.equals(this.f42136a);
        }

        public int hashCode() {
            return this.f42136a.hashCode();
        }
    }

    public FloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    private com.google.android.material.floatingactionbutton.d getImpl() {
        if (this.f42129q == null) {
            this.f42129q = h();
        }
        return this.f42129q;
    }

    @NonNull
    private com.google.android.material.floatingactionbutton.d h() {
        return new e(this, new c());
    }

    private int k(int i11) {
        int i12 = this.f42121i;
        if (i12 != 0) {
            return i12;
        }
        Resources resources = getResources();
        if (i11 != -1) {
            return i11 != 1 ? resources.getDimensionPixelSize(zs.e.f128638k) : resources.getDimensionPixelSize(zs.e.f128636j);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? k(1) : k(0);
    }

    private void l(@NonNull Rect rect) {
        j(rect);
        int i11 = -this.f42129q.v();
        rect.inset(i11, i11);
    }

    private void q(@NonNull Rect rect) {
        int i11 = rect.left;
        Rect rect2 = this.f42125m;
        rect.left = i11 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void r() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f42116d;
        if (colorStateList == null) {
            l5.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f42117e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(h.e(colorForState, mode));
    }

    private com.google.android.material.floatingactionbutton.d.k u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // lt.a
    public boolean a() {
        return this.f42128p.c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void e(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(@NonNull at.l<? extends FloatingActionButton> lVar) {
        getImpl().g(new d(lVar));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f42114b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f42115c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().l();
    }

    public int getCustomSize() {
        return this.f42121i;
    }

    public int getExpandedComponentIdHint() {
        return this.f42128p.b();
    }

    public i getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f42118f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f42118f;
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return (k) u5.h.g(getImpl().t());
    }

    public i getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.f42120h;
    }

    int getSizeDimension() {
        return k(this.f42120h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f42116d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f42117e;
    }

    public boolean getUseCompatPadding() {
        return this.f42124l;
    }

    @Deprecated
    public boolean i(@NonNull Rect rect) {
        if (!ViewCompat.U(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        q(rect);
        return true;
    }

    public void j(@NonNull Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        q(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    public void m(b bVar) {
        n(bVar, true);
    }

    void n(b bVar, boolean z11) {
        getImpl().w(u(bVar), z11);
    }

    public boolean o() {
        return getImpl().y();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int sizeDimension = getSizeDimension();
        this.f42122j = (sizeDimension - this.f42123k) / 2;
        getImpl().f0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i11), View.resolveSize(sizeDimension, i12));
        Rect rect = this.f42125m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ut.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ut.a aVar = (ut.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        this.f42128p.d((Bundle) u5.h.g(aVar.f116717c.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ut.a aVar = new ut.a(parcelableOnSaveInstanceState);
        aVar.f116717c.put("expandableWidgetHelper", this.f42128p.e());
        return aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            l(this.f42126n);
            if (!this.f42126n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return getImpl().z();
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f42114b != colorStateList) {
            this.f42114b = colorStateList;
            getImpl().L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f42115c != mode) {
            this.f42115c = mode;
            getImpl().M(mode);
        }
    }

    public void setCompatElevation(float f11) {
        getImpl().N(f11);
    }

    public void setCompatElevationResource(int i11) {
        setCompatElevation(getResources().getDimension(i11));
    }

    public void setCompatHoveredFocusedTranslationZ(float f11) {
        getImpl().Q(f11);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i11) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i11));
    }

    public void setCompatPressedTranslationZ(float f11) {
        getImpl().U(f11);
    }

    public void setCompatPressedTranslationZResource(int i11) {
        setCompatPressedTranslationZ(getResources().getDimension(i11));
    }

    public void setCustomSize(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i11 != this.f42121i) {
            this.f42121i = i11;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        getImpl().g0(f11);
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        if (z11 != getImpl().n()) {
            getImpl().O(z11);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i11) {
        this.f42128p.f(i11);
    }

    public void setHideMotionSpec(i iVar) {
        getImpl().P(iVar);
    }

    public void setHideMotionSpecResource(int i11) {
        setHideMotionSpec(i.d(getContext(), i11));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().e0();
            if (this.f42116d != null) {
                r();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i11) {
        this.f42127o.g(i11);
        r();
    }

    public void setMaxImageSize(int i11) {
        this.f42123k = i11;
        getImpl().S(i11);
    }

    public void setRippleColor(int i11) {
        setRippleColor(ColorStateList.valueOf(i11));
    }

    @Override // android.view.View
    public void setScaleX(float f11) {
        super.setScaleX(f11);
        getImpl().I();
    }

    @Override // android.view.View
    public void setScaleY(float f11) {
        super.setScaleY(f11);
        getImpl().I();
    }

    public void setShadowPaddingEnabled(boolean z11) {
        getImpl().W(z11);
    }

    @Override // st.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        getImpl().X(kVar);
    }

    public void setShowMotionSpec(i iVar) {
        getImpl().Y(iVar);
    }

    public void setShowMotionSpecResource(int i11) {
        setShowMotionSpec(i.d(getContext(), i11));
    }

    public void setSize(int i11) {
        this.f42121i = 0;
        if (i11 != this.f42120h) {
            this.f42120h = i11;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f42116d != colorStateList) {
            this.f42116d = colorStateList;
            r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f42117e != mode) {
            this.f42117e = mode;
            r();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f11) {
        super.setTranslationX(f11);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f11) {
        super.setTranslationY(f11);
        getImpl().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f11) {
        super.setTranslationZ(f11);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z11) {
        if (this.f42124l != z11) {
            this.f42124l = z11;
            getImpl().C();
        }
    }

    @Override // com.google.android.material.internal.e0, android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
    }

    void t(b bVar, boolean z11) {
        getImpl().c0(u(bVar), z11);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f42130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f42131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f42132c;

        public BaseBehavior() {
            this.f42132c = true;
        }

        private static boolean J(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton) {
            int i11;
            Rect rect = floatingActionButton.f42125m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i12 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                i11 = rect.right;
            } else {
                i11 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i12 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i12 = -rect.top;
            }
            if (i12 != 0) {
                ViewCompat.a0(floatingActionButton, i12);
            }
            if (i11 != 0) {
                ViewCompat.Z(floatingActionButton, i11);
            }
        }

        private boolean N(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            return this.f42132c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean O(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!N(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f42130a == null) {
                this.f42130a = new Rect();
            }
            Rect rect = this.f42130a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.n(this.f42131b, false);
                return true;
            }
            floatingActionButton.t(this.f42131b, false);
            return true;
        }

        private boolean P(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!N(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.n(this.f42131b, false);
                return true;
            }
            floatingActionButton.t(this.f42131b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            Rect rect2 = floatingActionButton.f42125m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!J(view)) {
                return false;
            }
            P(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i11) {
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = dependencies.get(i12);
                if (!(view instanceof AppBarLayout)) {
                    if (J(view) && P(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i11);
            K(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(@NonNull CoordinatorLayout.f fVar) {
            if (fVar.f7410h == 0) {
                fVar.f7410h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f128954l3);
            this.f42132c = typedArrayObtainStyledAttributes.getBoolean(m.f128966m3, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.E);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f42118f != colorStateList) {
            this.f42118f = colorStateList;
            getImpl().V(this.f42118f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = f42113r;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.f42125m = new Rect();
        this.f42126n = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = a0.i(context2, attributeSet, m.V2, i11, i12, new int[0]);
        this.f42114b = pt.c.a(context2, typedArrayI, m.X2);
        this.f42115c = d0.n(typedArrayI.getInt(m.Y2, -1), null);
        this.f42118f = pt.c.a(context2, typedArrayI, m.f128918i3);
        this.f42120h = typedArrayI.getInt(m.f128858d3, -1);
        this.f42121i = typedArrayI.getDimensionPixelSize(m.f128846c3, 0);
        this.f42119g = typedArrayI.getDimensionPixelSize(m.Z2, 0);
        float dimension = typedArrayI.getDimension(m.f128822a3, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = typedArrayI.getDimension(m.f128882f3, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = typedArrayI.getDimension(m.f128906h3, BitmapDescriptorFactory.HUE_RED);
        this.f42124l = typedArrayI.getBoolean(m.f128942k3, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(zs.e.f128659u0);
        setMaxImageSize(typedArrayI.getDimensionPixelSize(m.f128894g3, 0));
        i iVarC = i.c(context2, typedArrayI, m.f128930j3);
        i iVarC2 = i.c(context2, typedArrayI, m.f128870e3);
        k kVarM = k.g(context2, attributeSet, i11, i12, k.f111831m).m();
        boolean z11 = typedArrayI.getBoolean(m.f128834b3, false);
        setEnabled(typedArrayI.getBoolean(m.W2, true));
        typedArrayI.recycle();
        androidx.appcompat.widget.l lVar = new androidx.appcompat.widget.l(this);
        this.f42127o = lVar;
        lVar.f(attributeSet, i11);
        this.f42128p = new lt.b(this);
        getImpl().X(kVarM);
        getImpl().x(this.f42114b, this.f42115c, this.f42118f, this.f42119g);
        getImpl().T(dimensionPixelSize);
        getImpl().N(dimension);
        getImpl().Q(dimension2);
        getImpl().U(dimension3);
        getImpl().Y(iVarC);
        getImpl().P(iVarC2);
        getImpl().O(z11);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}

package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.b0;

/* JADX INFO: loaded from: classes5.dex */
public class SearchBar extends Toolbar {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f42581p = zs.l.f128809r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f42582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f42584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.search.b f42585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Drawable f42586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f42587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f42588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f42589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f42590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f42591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f42593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private st.g f42594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AccessibilityManager f42595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final z5.c.a f42596o;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            z5.c.a(SearchBar.this.f42595n, SearchBar.this.f42596o);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            z5.c.b(SearchBar.this.f42595n, SearchBar.this.f42596o);
        }
    }

    static class b extends r6.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f42599c;

        class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(Parcel parcel) {
            this(parcel, null);
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.f42599c);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f42599c = parcel.readString();
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }

    private int d(int i11, int i12) {
        return i11 == 0 ? i12 : i11;
    }

    private void e(st.k kVar, int i11, float f11, float f12, int i12) {
        st.g gVar = new st.g(kVar);
        this.f42594m = gVar;
        gVar.Q(getContext());
        this.f42594m.a0(f11);
        if (f12 >= BitmapDescriptorFactory.HUE_RED) {
            this.f42594m.j0(f12, i12);
        }
        int iD = ht.a.d(this, zs.c.f128579m);
        this.f42594m.b0(ColorStateList.valueOf(i11));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD);
        st.g gVar2 = this.f42594m;
        ViewCompat.t0(this, new RippleDrawable(colorStateListValueOf, gVar2, gVar2));
    }

    private void f() {
        setNavigationIcon(getNavigationIcon() == null ? this.f42586e : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    private void g(int i11, String str, String str2) {
        if (i11 != -1) {
            androidx.core.widget.m.r(this.f42582a, i11);
        }
        setText(str);
        setHint(str2);
        if (getNavigationIcon() == null) {
            androidx.core.view.n.d((ViewGroup.MarginLayoutParams) this.f42582a.getLayoutParams(), getResources().getDimensionPixelSize(zs.e.I));
        }
    }

    private void h() {
        View view = this.f42589h;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i11 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f42589h.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        i(this.f42589h, measuredWidth2, measuredHeight2, i11, measuredHeight2 + measuredHeight);
    }

    private void i(View view, int i11, int i12, int i13, int i14) {
        if (ViewCompat.A(this) == 1) {
            view.layout(getMeasuredWidth() - i13, i12, getMeasuredWidth() - i11, i14);
        } else {
            view.layout(i11, i12, i13, i14);
        }
    }

    private Drawable j(Drawable drawable) {
        int iD;
        if (!this.f42587f || drawable == null) {
            return drawable;
        }
        Integer num = this.f42590i;
        if (num != null) {
            iD = num.intValue();
        } else {
            iD = ht.a.d(this, drawable == this.f42586e ? zs.c.f128589r : zs.c.f128587q);
        }
        Drawable drawableR = l5.a.r(drawable.mutate());
        l5.a.n(drawableR, iD);
        return drawableR;
    }

    private void k(int i11, int i12) {
        View view = this.f42589h;
        if (view != null) {
            view.measure(i11, i12);
        }
    }

    private void l() {
        if (this.f42584c && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(zs.e.G);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = d(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = d(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = d(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = d(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void m() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z11 = getLayoutDirection() == 1;
        ImageButton imageButtonD = b0.d(this);
        if (imageButtonD == null || !imageButtonD.isClickable()) {
            width = 0;
        } else {
            width = z11 ? getWidth() - imageButtonD.getLeft() : imageButtonD.getRight();
        }
        ActionMenuView actionMenuViewA = b0.a(this);
        if (actionMenuViewA != null) {
            right = z11 ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft();
        }
        float f11 = -(z11 ? right : width);
        if (!z11) {
            width = right;
        }
        setHandwritingBoundsOffsets(f11, BitmapDescriptorFactory.HUE_RED, -width, BitmapDescriptorFactory.HUE_RED);
    }

    private void n() {
        if (getLayoutParams() instanceof AppBarLayout.e) {
            AppBarLayout.e eVar = (AppBarLayout.e) getLayoutParams();
            if (this.f42593l) {
                if (eVar.c() == 0) {
                    eVar.g(53);
                }
            } else if (eVar.c() == 53) {
                eVar.g(0);
            }
        }
    }

    private void o() {
        AccessibilityManager accessibilityManager = this.f42595n;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.f42595n.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new a());
        }
    }

    private void q(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    private void setNavigationIconDecorative(boolean z11) {
        ImageButton imageButtonD = b0.d(this);
        if (imageButtonD == null) {
            return;
        }
        imageButtonD.setClickable(!z11);
        imageButtonD.setFocusable(!z11);
        Drawable background = imageButtonD.getBackground();
        if (background != null) {
            this.f42591j = background;
        }
        imageButtonD.setBackgroundDrawable(z11 ? null : this.f42591j);
        m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.f42583b && this.f42589h == null && !(view instanceof ActionMenuView)) {
            this.f42589h = view;
            view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        super.addView(view, i11, layoutParams);
    }

    public View getCenterView() {
        return this.f42589h;
    }

    float getCompatElevation() {
        st.g gVar = this.f42594m;
        return gVar != null ? gVar.w() : ViewCompat.v(this);
    }

    public float getCornerSize() {
        return this.f42594m.J();
    }

    protected int getDefaultMarginVerticalResource() {
        return zs.e.H;
    }

    protected int getDefaultNavigationIconResource() {
        return zs.f.f128672c;
    }

    public CharSequence getHint() {
        return this.f42582a.getHint();
    }

    int getMenuResId() {
        return this.f42592k;
    }

    public int getStrokeColor() {
        return this.f42594m.F().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f42594m.H();
    }

    @NonNull
    public CharSequence getText() {
        return this.f42582a.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.f42582a;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i11) {
        Menu menu = getMenu();
        boolean z11 = menu instanceof androidx.appcompat.view.menu.e;
        if (z11) {
            ((androidx.appcompat.view.menu.e) menu).h0();
        }
        super.inflateMenu(i11);
        this.f42592k = i11;
        if (z11) {
            ((androidx.appcompat.view.menu.e) menu).g0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        st.h.f(this, this.f42594m);
        l();
        n();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        int i11 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (i11 >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        h();
        m();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        k(i11, i12);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setText(bVar.f42599c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        CharSequence text = getText();
        bVar.f42599c = text == null ? null : text.toString();
        return bVar;
    }

    public void p() {
        this.f42585d.b(this);
    }

    public void setCenterView(View view) {
        View view2 = this.f42589h;
        if (view2 != null) {
            removeView(view2);
            this.f42589h = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z11) {
        this.f42593l = z11;
        n();
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        st.g gVar = this.f42594m;
        if (gVar != null) {
            gVar.a0(f11);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.f42582a.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(j(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f42588g) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z11) {
        this.f42585d.a(z11);
    }

    public void setStrokeColor(int i11) {
        if (getStrokeColor() != i11) {
            this.f42594m.l0(ColorStateList.valueOf(i11));
        }
    }

    public void setStrokeWidth(float f11) {
        if (getStrokeWidth() != f11) {
            this.f42594m.m0(f11);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.f42582a.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f42597h;

        public ScrollingViewBehavior() {
            this.f42597h = false;
        }

        private void Y(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(BitmapDescriptorFactory.HUE_RED);
        }

        @Override // com.google.android.material.appbar.d
        protected boolean T() {
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            boolean zL = super.l(coordinatorLayout, view, view2);
            if (!this.f42597h && (view2 instanceof AppBarLayout)) {
                this.f42597h = true;
                Y((AppBarLayout) view2);
            }
            return zL;
        }

        public ScrollingViewBehavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f42597h = false;
        }
    }

    public SearchBar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.R);
    }

    public void setHint(int i11) {
        this.f42582a.setHint(i11);
    }

    public void setText(int i11) {
        this.f42582a.setText(i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = f42581p;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.f42592k = -1;
        this.f42596o = new z5.c.a() { // from class: com.google.android.material.search.a
            @Override // z5.c.a
            public final void onTouchExplorationStateChanged(boolean z11) {
                this.f42629a.setFocusableInTouchMode(z11);
            }
        };
        Context context2 = getContext();
        q(attributeSet);
        this.f42586e = j.a.b(context2, getDefaultNavigationIconResource());
        this.f42585d = new com.google.android.material.search.b();
        TypedArray typedArrayI = a0.i(context2, attributeSet, zs.m.f128838b7, i11, i12, new int[0]);
        st.k kVarM = st.k.e(context2, attributeSet, i11, i12).m();
        int color = typedArrayI.getColor(zs.m.f128886f7, 0);
        float dimension = typedArrayI.getDimension(zs.m.f128922i7, BitmapDescriptorFactory.HUE_RED);
        this.f42584c = typedArrayI.getBoolean(zs.m.f128898g7, true);
        this.f42593l = typedArrayI.getBoolean(zs.m.f128910h7, true);
        boolean z11 = typedArrayI.getBoolean(zs.m.f128946k7, false);
        this.f42588g = typedArrayI.getBoolean(zs.m.f128934j7, false);
        this.f42587f = typedArrayI.getBoolean(zs.m.f128994o7, true);
        if (typedArrayI.hasValue(zs.m.f128958l7)) {
            this.f42590i = Integer.valueOf(typedArrayI.getColor(zs.m.f128958l7, -1));
        }
        int resourceId = typedArrayI.getResourceId(zs.m.f128850c7, -1);
        String string = typedArrayI.getString(zs.m.f128862d7);
        String string2 = typedArrayI.getString(zs.m.f128874e7);
        float dimension2 = typedArrayI.getDimension(zs.m.f128982n7, -1.0f);
        int color2 = typedArrayI.getColor(zs.m.f128970m7, 0);
        typedArrayI.recycle();
        if (!z11) {
            f();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(zs.i.A, this);
        this.f42583b = true;
        this.f42582a = (TextView) findViewById(zs.g.f128687b0);
        ViewCompat.x0(this, dimension);
        g(resourceId, string, string2);
        e(kVarM, color, dimension, dimension2, color2);
        this.f42595n = (AccessibilityManager) getContext().getSystemService("accessibility");
        o();
    }
}

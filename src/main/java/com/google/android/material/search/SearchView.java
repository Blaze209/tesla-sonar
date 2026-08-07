package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.b0;
import com.google.android.material.internal.d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, nt.b {
    private static final int D = zs.l.f128810s;
    private boolean A;

    @NonNull
    private d B;
    private Map<View, Integer> C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final View f42600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ClippableRoundedCornerLayout f42601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f42602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f42603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final FrameLayout f42604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final FrameLayout f42605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final MaterialToolbar f42606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Toolbar f42607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final TextView f42608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final EditText f42609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final ImageButton f42610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final View f42611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final TouchObserverFrameLayout f42612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f42613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final u f42614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    private final nt.c f42615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f42616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final kt.a f42617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Set<c> f42618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SearchBar f42619t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f42620u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f42621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f42622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f42623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f42624y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f42625z;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (searchView.x() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            SearchView.this.f42610k.setVisibility(charSequence.length() > 0 ? 0 : 8);
        }
    }

    static class b extends r6.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f42627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f42628d;

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
            parcel.writeString(this.f42627c);
            parcel.writeInt(this.f42628d);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f42627c = parcel.readString();
            this.f42628d = parcel.readInt();
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface c {
        void a(@NonNull SearchView searchView, @NonNull d dVar, @NonNull d dVar2);
    }

    public enum d {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private void A(@NonNull d dVar, boolean z11) {
        if (this.B.equals(dVar)) {
            return;
        }
        if (z11) {
            if (dVar == d.SHOWN) {
                setModalForAccessibility(true);
            } else if (dVar == d.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        d dVar2 = this.B;
        this.B = dVar;
        Iterator it = new LinkedHashSet(this.f42618s).iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(this, dVar2, dVar);
        }
        N(dVar);
    }

    private void B(boolean z11, boolean z12) {
        if (z12) {
            this.f42606g.setNavigationIcon((Drawable) null);
            return;
        }
        this.f42606g.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42646a.r();
            }
        });
        if (z11) {
            k.b bVar = new k.b(getContext());
            bVar.c(ht.a.d(this, zs.c.f128587q));
            this.f42606g.setNavigationIcon(bVar);
        }
    }

    private void C() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void D() {
        this.f42610k.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.j(this.f42648a, view);
            }
        });
        this.f42609j.addTextChangedListener(new a());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void E() {
        this.f42612m.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.g(this.f42645a, view, motionEvent);
            }
        });
    }

    private void F() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f42611l.getLayoutParams();
        final int i11 = marginLayoutParams.leftMargin;
        final int i12 = marginLayoutParams.rightMargin;
        ViewCompat.E0(this.f42611l, new a0() { // from class: com.google.android.material.search.c
            @Override // androidx.core.view.a0
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.f(marginLayoutParams, i11, i12, view, windowInsetsCompat);
            }
        });
    }

    private void G(int i11, String str, String str2) {
        if (i11 != -1) {
            androidx.core.widget.m.r(this.f42609j, i11);
        }
        this.f42609j.setText(str);
        this.f42609j.setHint(str2);
    }

    private void H() {
        K();
        F();
        J();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void I() {
        this.f42601b.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.m(view, motionEvent);
            }
        });
    }

    private void J() {
        setUpStatusBarSpacer(getStatusBarHeight());
        ViewCompat.E0(this.f42603d, new a0() { // from class: com.google.android.material.search.f
            @Override // androidx.core.view.a0
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.l(this.f42642a, view, windowInsetsCompat);
            }
        });
    }

    private void K() {
        d0.g(this.f42606g, new d0.d() { // from class: com.google.android.material.search.e
            @Override // com.google.android.material.internal.d0.d
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, d0.e eVar) {
                return SearchView.k(this.f42641a, view, windowInsetsCompat, eVar);
            }
        });
    }

    @SuppressLint({"InlinedApi"})
    private void M(ViewGroup viewGroup, boolean z11) {
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != this) {
                if (childAt.findViewById(this.f42601b.getId()) != null) {
                    M((ViewGroup) childAt, z11);
                } else if (z11) {
                    this.C.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    ViewCompat.z0(childAt, 4);
                } else {
                    Map<View, Integer> map = this.C;
                    if (map != null && map.containsKey(childAt)) {
                        ViewCompat.z0(childAt, this.C.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void N(@NonNull d dVar) {
        if (this.f42619t == null || !this.f42616q) {
            return;
        }
        if (dVar.equals(d.SHOWN)) {
            this.f42615p.b();
        } else if (dVar.equals(d.HIDDEN)) {
            this.f42615p.d();
        }
    }

    private void O() {
        MaterialToolbar materialToolbar = this.f42606g;
        if (materialToolbar == null || w(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.f42619t == null) {
            this.f42606g.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable drawableR = l5.a.r(j.a.b(getContext(), defaultNavigationIconResource).mutate());
        if (this.f42606g.getNavigationIconTint() != null) {
            l5.a.n(drawableR, this.f42606g.getNavigationIconTint().intValue());
        }
        this.f42606g.setNavigationIcon(new com.google.android.material.internal.f(this.f42619t.getNavigationIcon(), drawableR));
        P();
    }

    private void P() {
        ImageButton imageButtonD = b0.d(this.f42606g);
        if (imageButtonD == null) {
            return;
        }
        int i11 = this.f42601b.getVisibility() == 0 ? 1 : 0;
        Drawable drawableQ = l5.a.q(imageButtonD.getDrawable());
        if (drawableQ instanceof k.b) {
            ((k.b) drawableQ).e(i11);
        }
        if (drawableQ instanceof com.google.android.material.internal.f) {
            ((com.google.android.material.internal.f) drawableQ).a(i11);
        }
    }

    public static /* synthetic */ WindowInsetsCompat f(ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12, View view, WindowInsetsCompat windowInsetsCompat) {
        marginLayoutParams.leftMargin = i11 + windowInsetsCompat.k();
        marginLayoutParams.rightMargin = i12 + windowInsetsCompat.l();
        return windowInsetsCompat;
    }

    public static /* synthetic */ boolean g(SearchView searchView, View view, MotionEvent motionEvent) {
        if (!searchView.s()) {
            return false;
        }
        searchView.p();
        return false;
    }

    private Window getActivityWindow() {
        Activity activityA = com.google.android.material.internal.c.a(getContext());
        if (activityA == null) {
            return null;
        }
        return activityA.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f42619t;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(zs.e.J);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static /* synthetic */ void h(SearchView searchView) {
        searchView.f42609j.clearFocus();
        SearchBar searchBar = searchView.f42619t;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        d0.l(searchView.f42609j, searchView.f42625z);
    }

    public static /* synthetic */ void i(SearchView searchView) {
        if (searchView.f42609j.requestFocus()) {
            searchView.f42609j.sendAccessibilityEvent(8);
        }
        d0.s(searchView.f42609j, searchView.f42625z);
    }

    public static /* synthetic */ void j(SearchView searchView, View view) {
        searchView.q();
        searchView.z();
    }

    public static /* synthetic */ WindowInsetsCompat k(SearchView searchView, View view, WindowInsetsCompat windowInsetsCompat, d0.e eVar) {
        boolean zM = d0.m(searchView.f42606g);
        searchView.f42606g.setPadding((zM ? eVar.f42330c : eVar.f42328a) + windowInsetsCompat.k(), eVar.f42329b, (zM ? eVar.f42328a : eVar.f42330c) + windowInsetsCompat.l(), eVar.f42331d);
        return windowInsetsCompat;
    }

    public static /* synthetic */ WindowInsetsCompat l(SearchView searchView, View view, WindowInsetsCompat windowInsetsCompat) {
        searchView.getClass();
        int iM = windowInsetsCompat.m();
        searchView.setUpStatusBarSpacer(iM);
        if (!searchView.A) {
            searchView.setStatusBarSpacerEnabledInternal(iM > 0);
        }
        return windowInsetsCompat;
    }

    public static /* synthetic */ boolean m(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z11) {
        this.f42603d.setVisibility(z11 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f11) {
        kt.a aVar = this.f42617r;
        if (aVar == null || this.f42602c == null) {
            return;
        }
        this.f42602c.setBackgroundColor(aVar.c(this.f42624y, f11));
    }

    private void setUpHeaderLayout(int i11) {
        if (i11 != -1) {
            o(LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) this.f42604e, false));
        }
    }

    private void setUpStatusBarSpacer(int i11) {
        if (this.f42603d.getLayoutParams().height != i11) {
            this.f42603d.getLayoutParams().height = i11;
            this.f42603d.requestLayout();
        }
    }

    private boolean u() {
        return this.B.equals(d.HIDDEN) || this.B.equals(d.HIDING);
    }

    private boolean w(@NonNull Toolbar toolbar) {
        return l5.a.q(toolbar.getNavigationIcon()) instanceof k.b;
    }

    public void L() {
        if (this.B.equals(d.SHOWN) || this.B.equals(d.SHOWING)) {
            return;
        }
        this.f42614o.U();
    }

    public void Q() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f42620u = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // nt.b
    public void a(@NonNull androidx.p002activity.b bVar) {
        if (u() || this.f42619t == null) {
            return;
        }
        this.f42614o.V(bVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.f42613n) {
            this.f42612m.addView(view, i11, layoutParams);
        } else {
            super.addView(view, i11, layoutParams);
        }
    }

    @Override // nt.b
    public void b(@NonNull androidx.p002activity.b bVar) {
        if (u() || this.f42619t == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f42614o.a0(bVar);
    }

    @Override // nt.b
    public void c() {
        if (u()) {
            return;
        }
        androidx.p002activity.b bVarN = this.f42614o.N();
        if (Build.VERSION.SDK_INT < 34 || this.f42619t == null || bVarN == null) {
            r();
        } else {
            this.f42614o.p();
        }
    }

    @Override // nt.b
    public void d() {
        if (u() || this.f42619t == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.f42614o.o();
    }

    nt.g getBackHelper() {
        return this.f42614o.r();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public d getCurrentTransitionState() {
        return this.B;
    }

    protected int getDefaultNavigationIconResource() {
        return zs.f.f128671b;
    }

    @NonNull
    public EditText getEditText() {
        return this.f42609j;
    }

    public CharSequence getHint() {
        return this.f42609j.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f42608i;
    }

    public CharSequence getSearchPrefixText() {
        return this.f42608i.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f42620u;
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f42609j.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.f42606g;
    }

    public void o(@NonNull View view) {
        this.f42604e.addView(view);
        this.f42604e.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        st.h.e(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        Q();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setText(bVar.f42627c);
        setVisible(bVar.f42628d == 0);
    }

    @Override // android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        Editable text = getText();
        bVar.f42627c = text == null ? null : text.toString();
        bVar.f42628d = this.f42601b.getVisibility();
        return bVar;
    }

    public void p() {
        this.f42609j.post(new Runnable() { // from class: com.google.android.material.search.l
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.h(this.f42647a);
            }
        });
    }

    public void q() {
        this.f42609j.setText("");
    }

    public void r() {
        if (this.B.equals(d.HIDDEN) || this.B.equals(d.HIDING)) {
            return;
        }
        this.f42614o.M();
    }

    boolean s() {
        return this.f42620u == 48;
    }

    public void setAnimatedNavigationIcon(boolean z11) {
        this.f42621v = z11;
    }

    public void setAutoShowKeyboard(boolean z11) {
        this.f42623x = z11;
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        setUpBackgroundViewElevationOverlay(f11);
    }

    public void setHint(CharSequence charSequence) {
        this.f42609j.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z11) {
        this.f42622w = z11;
    }

    public void setModalForAccessibility(boolean z11) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z11) {
            this.C = new HashMap(viewGroup.getChildCount());
        }
        M(viewGroup, z11);
        if (z11) {
            return;
        }
        this.C = null;
    }

    public void setOnMenuItemClickListener(Toolbar.f fVar) {
        this.f42606g.setOnMenuItemClickListener(fVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f42608i.setText(charSequence);
        this.f42608i.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z11) {
        this.A = true;
        setStatusBarSpacerEnabledInternal(z11);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f42609j.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z11) {
        this.f42606g.setTouchscreenBlocksFocus(z11);
    }

    void setTransitionState(@NonNull d dVar) {
        A(dVar, true);
    }

    public void setUseWindowInsetsController(boolean z11) {
        this.f42625z = z11;
    }

    public void setVisible(boolean z11) {
        boolean z12 = this.f42601b.getVisibility() == 0;
        this.f42601b.setVisibility(z11 ? 0 : 8);
        P();
        A(z11 ? d.SHOWN : d.HIDDEN, z12 != z11);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f42619t = searchBar;
        this.f42614o.S(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f42643a.L();
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: com.google.android.material.search.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f42644a.L();
                        }
                    });
                    this.f42609j.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        O();
        C();
        N(getCurrentTransitionState());
    }

    public boolean t() {
        return this.f42621v;
    }

    public boolean v() {
        return this.f42622w;
    }

    public boolean x() {
        return this.f42619t != null;
    }

    public void y() {
        this.f42609j.postDelayed(new Runnable() { // from class: com.google.android.material.search.d
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.i(this.f42640a);
            }
        }, 100L);
    }

    void z() {
        if (this.f42623x) {
            y();
        }
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.S);
    }

    public void setHint(int i11) {
        this.f42609j.setHint(i11);
    }

    public void setText(int i11) {
        this.f42609j.setText(i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = D;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.f42615p = new nt.c(this);
        this.f42618s = new LinkedHashSet();
        this.f42620u = 16;
        this.B = d.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.a0.i(context2, attributeSet, zs.m.f129006p7, i11, i12, new int[0]);
        this.f42624y = typedArrayI.getColor(zs.m.f129102x7, 0);
        int resourceId = typedArrayI.getResourceId(zs.m.f129113y7, -1);
        int resourceId2 = typedArrayI.getResourceId(zs.m.f129018q7, -1);
        String string = typedArrayI.getString(zs.m.f129030r7);
        String string2 = typedArrayI.getString(zs.m.f129042s7);
        String string3 = typedArrayI.getString(zs.m.A7);
        boolean z11 = typedArrayI.getBoolean(zs.m.B7, false);
        this.f42621v = typedArrayI.getBoolean(zs.m.f129066u7, true);
        this.f42622w = typedArrayI.getBoolean(zs.m.f129054t7, true);
        boolean z12 = typedArrayI.getBoolean(zs.m.f129124z7, false);
        this.f42623x = typedArrayI.getBoolean(zs.m.f129078v7, true);
        this.f42616q = typedArrayI.getBoolean(zs.m.f129090w7, true);
        typedArrayI.recycle();
        LayoutInflater.from(context2).inflate(zs.i.B, this);
        this.f42613n = true;
        this.f42600a = findViewById(zs.g.f128705k0);
        this.f42601b = (ClippableRoundedCornerLayout) findViewById(zs.g.f128703j0);
        this.f42602c = findViewById(zs.g.f128689c0);
        this.f42603d = findViewById(zs.g.f128709m0);
        this.f42604e = (FrameLayout) findViewById(zs.g.f128701i0);
        this.f42605f = (FrameLayout) findViewById(zs.g.f128713o0);
        this.f42606g = (MaterialToolbar) findViewById(zs.g.f128711n0);
        this.f42607h = (Toolbar) findViewById(zs.g.f128697g0);
        this.f42608i = (TextView) findViewById(zs.g.f128707l0);
        this.f42609j = (EditText) findViewById(zs.g.f128699h0);
        this.f42610k = (ImageButton) findViewById(zs.g.f128691d0);
        this.f42611l = findViewById(zs.g.f128695f0);
        this.f42612m = (TouchObserverFrameLayout) findViewById(zs.g.f128693e0);
        this.f42614o = new u(this);
        this.f42617r = new kt.a(context2);
        I();
        C();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        G(resourceId2, string, string2);
        B(z11, z12);
        D();
        E();
        H();
    }
}

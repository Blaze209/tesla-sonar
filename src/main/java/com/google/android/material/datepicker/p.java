package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class p<S> extends y<S> {
    static final Object A = "MONTHS_VIEW_GROUP_TAG";
    static final Object B = "NAVIGATION_PREV_TAG";
    static final Object C = "NAVIGATION_NEXT_TAG";
    static final Object D = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f41978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.material.datepicker.j<S> f41979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.google.android.material.datepicker.a f41980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private n f41981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private u f41982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private l f41983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.android.material.datepicker.c f41984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private RecyclerView f41985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private RecyclerView f41986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f41987w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f41988x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f41989y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private View f41990z;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f41991a;

        a(w wVar) {
            this.f41991a = wVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iG2 = p.this.z().g2() - 1;
            if (iG2 >= 0) {
                p.this.C(this.f41991a.b(iG2));
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f41993a;

        b(int i11) {
            this.f41993a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f41986v.E1(this.f41993a);
        }
    }

    class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.v0(null);
        }
    }

    class d extends a0 {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i11, boolean z11, int i12) {
            super(context, i11, z11);
            this.I = i12;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void S1(@NonNull RecyclerView.c0 c0Var, @NonNull int[] iArr) {
            if (this.I == 0) {
                iArr[0] = p.this.f41986v.getWidth();
                iArr[1] = p.this.f41986v.getWidth();
            } else {
                iArr[0] = p.this.f41986v.getHeight();
                iArr[1] = p.this.f41986v.getHeight();
            }
        }
    }

    class e implements m {
        e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.p.m
        public void a(long j11) {
            if (p.this.f41980p.g().u0(j11)) {
                p.this.f41979o.H1(j11);
                Iterator<x<S>> it = p.this.f42074m.iterator();
                while (it.hasNext()) {
                    it.next().b(p.this.f41979o.B1());
                }
                p.this.f41986v.getAdapter().notifyDataSetChanged();
                if (p.this.f41985u != null) {
                    p.this.f41985u.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    class f extends androidx.core.view.a {
        f() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.X0(false);
        }
    }

    class g extends RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Calendar f41998a = c0.m();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Calendar f41999b = c0.m();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void i(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
            if ((recyclerView.getAdapter() instanceof d0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                d0 d0Var = (d0) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (u5.d<Long, Long> dVar : p.this.f41979o.O2()) {
                    Long l11 = dVar.f115407a;
                    if (l11 != null && dVar.f115408b != null) {
                        this.f41998a.setTimeInMillis(l11.longValue());
                        this.f41999b.setTimeInMillis(dVar.f115408b.longValue());
                        int iC = d0Var.c(this.f41998a.get(1));
                        int iC2 = d0Var.c(this.f41999b.get(1));
                        View viewI = gridLayoutManager.I(iC);
                        View viewI2 = gridLayoutManager.I(iC2);
                        int iM3 = iC / gridLayoutManager.m3();
                        int iM4 = iC2 / gridLayoutManager.m3();
                        int i11 = iM3;
                        while (i11 <= iM4) {
                            View viewI3 = gridLayoutManager.I(gridLayoutManager.m3() * i11);
                            if (viewI3 != null) {
                                canvas.drawRect((i11 != iM3 || viewI == null) ? 0 : viewI.getLeft() + (viewI.getWidth() / 2), viewI3.getTop() + p.this.f41984t.f41944d.c(), (i11 != iM4 || viewI2 == null) ? recyclerView.getWidth() : viewI2.getLeft() + (viewI2.getWidth() / 2), viewI3.getBottom() - p.this.f41984t.f41944d.b(), p.this.f41984t.f41948h);
                            }
                            i11++;
                        }
                    }
                }
            }
        }
    }

    class h extends androidx.core.view.a {
        h() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.H0(p.this.f41990z.getVisibility() == 0 ? p.this.getString(zs.k.U) : p.this.getString(zs.k.S));
        }
    }

    class i extends RecyclerView.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f42002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f42003b;

        i(w wVar, MaterialButton materialButton) {
            this.f42002a = wVar;
            this.f42003b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i11) {
            if (i11 == 0) {
                recyclerView.announceForAccessibility(this.f42003b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void onScrolled(@NonNull RecyclerView recyclerView, int i11, int i12) {
            int iE2 = i11 < 0 ? p.this.z().e2() : p.this.z().g2();
            p.this.f41982r = this.f42002a.b(iE2);
            this.f42003b.setText(this.f42002a.c(iE2));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.F();
        }
    }

    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f42006a;

        k(w wVar) {
            this.f42006a = wVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iE2 = p.this.z().e2() + 1;
            if (iE2 < p.this.f41986v.getAdapter().getItemCount()) {
                p.this.C(this.f42006a.b(iE2));
            }
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j11);
    }

    @NonNull
    public static <T> p<T> A(@NonNull com.google.android.material.datepicker.j<T> jVar, int i11, @NonNull com.google.android.material.datepicker.a aVar, n nVar) {
        p<T> pVar = new p<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i11);
        bundle.putParcelable("GRID_SELECTOR_KEY", jVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", nVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.k());
        pVar.setArguments(bundle);
        return pVar;
    }

    private void B(int i11) {
        this.f41986v.post(new b(i11));
    }

    private void E() {
        ViewCompat.p0(this.f41986v, new f());
    }

    private void r(@NonNull View view, @NonNull w wVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(zs.g.D);
        materialButton.setTag(D);
        ViewCompat.p0(materialButton, new h());
        View viewFindViewById = view.findViewById(zs.g.F);
        this.f41987w = viewFindViewById;
        viewFindViewById.setTag(B);
        View viewFindViewById2 = view.findViewById(zs.g.E);
        this.f41988x = viewFindViewById2;
        viewFindViewById2.setTag(C);
        this.f41989y = view.findViewById(zs.g.N);
        this.f41990z = view.findViewById(zs.g.I);
        D(l.DAY);
        materialButton.setText(this.f41982r.h());
        this.f41986v.n(new i(wVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f41988x.setOnClickListener(new k(wVar));
        this.f41987w.setOnClickListener(new a(wVar));
    }

    @NonNull
    private RecyclerView.p s() {
        return new g();
    }

    static int x(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(zs.e.f128637j0);
    }

    private static int y(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(zs.e.f128651q0) + resources.getDimensionPixelOffset(zs.e.f128653r0) + resources.getDimensionPixelOffset(zs.e.f128649p0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(zs.e.f128641l0);
        int i11 = v.f42057g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(zs.e.f128637j0) * i11) + ((i11 - 1) * resources.getDimensionPixelOffset(zs.e.f128647o0)) + resources.getDimensionPixelOffset(zs.e.f128633h0);
    }

    void C(u uVar) {
        w wVar = (w) this.f41986v.getAdapter();
        int iD = wVar.d(uVar);
        int iD2 = iD - wVar.d(this.f41982r);
        boolean z11 = Math.abs(iD2) > 3;
        boolean z12 = iD2 > 0;
        this.f41982r = uVar;
        if (z11 && z12) {
            this.f41986v.v1(iD - 3);
            B(iD);
        } else if (!z11) {
            B(iD);
        } else {
            this.f41986v.v1(iD + 3);
            B(iD);
        }
    }

    void D(l lVar) {
        this.f41983s = lVar;
        if (lVar == l.YEAR) {
            this.f41985u.getLayoutManager().D1(((d0) this.f41985u.getAdapter()).c(this.f41982r.f42052c));
            this.f41989y.setVisibility(0);
            this.f41990z.setVisibility(8);
            this.f41987w.setVisibility(8);
            this.f41988x.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f41989y.setVisibility(8);
            this.f41990z.setVisibility(0);
            this.f41987w.setVisibility(0);
            this.f41988x.setVisibility(0);
            C(this.f41982r);
        }
    }

    void F() {
        l lVar = this.f41983s;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            D(l.DAY);
        } else if (lVar == l.DAY) {
            D(lVar2);
        }
    }

    @Override // com.google.android.material.datepicker.y
    public boolean b(@NonNull x<S> xVar) {
        return super.b(xVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f41978n = bundle.getInt("THEME_RES_ID_KEY");
        this.f41979o = (com.google.android.material.datepicker.j) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f41980p = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f41981q = (n) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f41982r = (u) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        int i12;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f41978n);
        this.f41984t = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        u uVarL = this.f41980p.l();
        if (r.u(contextThemeWrapper)) {
            i11 = zs.i.f128758t;
            i12 = 1;
        } else {
            i11 = zs.i.f128756r;
            i12 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i11, viewGroup, false);
        viewInflate.setMinimumHeight(y(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(zs.g.J);
        ViewCompat.p0(gridView, new c());
        int i13 = this.f41980p.i();
        gridView.setAdapter((ListAdapter) (i13 > 0 ? new o(i13) : new o()));
        gridView.setNumColumns(uVarL.f42053d);
        gridView.setEnabled(false);
        this.f41986v = (RecyclerView) viewInflate.findViewById(zs.g.M);
        this.f41986v.setLayoutManager(new d(getContext(), i12, false, i12));
        this.f41986v.setTag(A);
        w wVar = new w(contextThemeWrapper, this.f41979o, this.f41980p, this.f41981q, new e());
        this.f41986v.setAdapter(wVar);
        int integer = contextThemeWrapper.getResources().getInteger(zs.h.f128738c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(zs.g.N);
        this.f41985u = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f41985u.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f41985u.setAdapter(new d0(this));
            this.f41985u.j(s());
        }
        if (viewInflate.findViewById(zs.g.D) != null) {
            r(viewInflate, wVar);
        }
        if (!r.u(contextThemeWrapper)) {
            new androidx.recyclerview.widget.u().b(this.f41986v);
        }
        this.f41986v.v1(wVar.d(this.f41982r));
        E();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f41978n);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f41979o);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f41980p);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f41981q);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f41982r);
    }

    com.google.android.material.datepicker.a t() {
        return this.f41980p;
    }

    com.google.android.material.datepicker.c u() {
        return this.f41984t;
    }

    u v() {
        return this.f41982r;
    }

    public com.google.android.material.datepicker.j<S> w() {
        return this.f41979o;
    }

    @NonNull
    LinearLayoutManager z() {
        return (LinearLayoutManager) this.f41986v.getLayoutManager();
    }
}

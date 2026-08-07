package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.a implements androidx.core.view.b.a {
    RunnableC0063c A;
    private b B;
    final f C;
    int D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    d f2607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f2608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f2616t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2617u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f2618v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f2619w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f2620x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    e f2621y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    a f2622z;

    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, i.a.f73736m);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f2607k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f2245i : view2);
            }
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.f2622z = null;
            cVar.D = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public o.e a() {
            a aVar = c.this.f2622z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0063c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f2625a;

        public RunnableC0063c(e eVar) {
            this.f2625a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f2239c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f2239c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f2245i;
            if (view != null && view.getWindowToken() != null && this.f2625a.m()) {
                c.this.f2621y = this.f2625a;
            }
            c.this.A = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.a {

        class a extends m0 {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c f2628j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f2628j = cVar;
            }

            @Override // androidx.appcompat.widget.m0
            public o.e b() {
                e eVar = c.this.f2621y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.m0
            public boolean c() {
                c.this.M();
                return true;
            }

            @Override // androidx.appcompat.widget.m0
            public boolean d() {
                c cVar = c.this;
                if (cVar.A != null) {
                    return false;
                }
                cVar.D();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, i.a.f73735l);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            d1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.M();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i11, int i12, int i13, int i14) {
            boolean frame = super.setFrame(i11, i12, i13, i14);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                l5.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z11) {
            super(context, eVar, view, z11, i.a.f73736m);
            h(8388613);
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f2239c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f2239c.close();
            }
            c.this.f2621y = null;
            super.e();
        }
    }

    private class f implements androidx.appcompat.view.menu.j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar, boolean z11) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.F().e(false);
            }
            androidx.appcompat.view.menu.j.a aVarO = c.this.o();
            if (aVarO != null) {
                aVarO.b(eVar, z11);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) c.this).f2239c) {
                return false;
            }
            c.this.D = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            androidx.appcompat.view.menu.j.a aVarO = c.this.o();
            if (aVarO != null) {
                return aVarO.c(eVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2632a;

        class a implements Parcelable.Creator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i11) {
                return new g[i11];
            }
        }

        g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f2632a);
        }

        g(Parcel parcel) {
            this.f2632a = parcel.readInt();
        }
    }

    public c(Context context) {
        super(context, i.g.f73828c, i.g.f73827b);
        this.f2620x = new SparseBooleanArray();
        this.C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f2245i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof androidx.appcompat.view.menu.k.a) && ((androidx.appcompat.view.menu.k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        return D() | E();
    }

    public Drawable C() {
        d dVar = this.f2607k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f2609m) {
            return this.f2608l;
        }
        return null;
    }

    public boolean D() {
        Object obj;
        RunnableC0063c runnableC0063c = this.A;
        if (runnableC0063c != null && (obj = this.f2245i) != null) {
            ((View) obj).removeCallbacks(runnableC0063c);
            this.A = null;
            return true;
        }
        e eVar = this.f2621y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean E() {
        a aVar = this.f2622z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean F() {
        return this.A != null || G();
    }

    public boolean G() {
        e eVar = this.f2621y;
        return eVar != null && eVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.f2615s) {
            this.f2614r = n.a.b(this.f2238b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f2239c;
        if (eVar != null) {
            eVar.M(true);
        }
    }

    public void I(boolean z11) {
        this.f2618v = z11;
    }

    public void J(ActionMenuView actionMenuView) {
        this.f2245i = actionMenuView;
        actionMenuView.a(this.f2239c);
    }

    public void K(Drawable drawable) {
        d dVar = this.f2607k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f2609m = true;
            this.f2608l = drawable;
        }
    }

    public void L(boolean z11) {
        this.f2610n = z11;
        this.f2611o = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f2610n || G() || (eVar = this.f2239c) == null || this.f2245i == null || this.A != null || eVar.B().isEmpty()) {
            return false;
        }
        RunnableC0063c runnableC0063c = new RunnableC0063c(new e(this.f2238b, this.f2239c, this.f2607k, true));
        this.A = runnableC0063c;
        ((View) this.f2245i).post(runnableC0063c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z11) {
        A();
        super.b(eVar, z11);
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable d() {
        g gVar = new g();
        gVar.f2632a = this.D;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void e(boolean z11) {
        super.e(z11);
        ((View) this.f2245i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f2239c;
        boolean z12 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> arrayListU = eVar.u();
            int size = arrayListU.size();
            for (int i11 = 0; i11 < size; i11++) {
                androidx.core.view.b bVarA = arrayListU.get(i11).a();
                if (bVarA != null) {
                    bVarA.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f2239c;
        ArrayList<androidx.appcompat.view.menu.g> arrayListB = eVar2 != null ? eVar2.B() : null;
        if (this.f2610n && arrayListB != null) {
            int size2 = arrayListB.size();
            if (size2 == 1) {
                z12 = !arrayListB.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z12 = true;
            }
        }
        if (z12) {
            if (this.f2607k == null) {
                this.f2607k = new d(this.f2237a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f2607k.getParent();
            if (viewGroup != this.f2245i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f2607k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2245i;
                actionMenuView.addView(this.f2607k, actionMenuView.i());
            }
        } else {
            d dVar = this.f2607k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f2245i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2607k);
                }
            }
        }
        ((ActionMenuView) this.f2245i).setOverflowReserved(this.f2610n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean f() {
        ArrayList<androidx.appcompat.view.menu.g> arrayListG;
        int size;
        int i11;
        int iO;
        ?? r11;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f2239c;
        View view = null;
        ?? r12 = 0;
        if (eVar != null) {
            arrayListG = eVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i12 = cVar.f2614r;
        int i13 = cVar.f2613q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f2245i;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            androidx.appcompat.view.menu.g gVar = arrayListG.get(i16);
            if (gVar.o()) {
                i14++;
            } else if (gVar.n()) {
                i15++;
            } else {
                z11 = true;
            }
            if (cVar.f2618v && gVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (cVar.f2610n && (z11 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = cVar.f2620x;
        sparseBooleanArray.clear();
        if (cVar.f2616t) {
            int i18 = cVar.f2619w;
            iO = i13 / i18;
            i11 = i18 + ((i13 % i18) / iO);
        } else {
            i11 = 0;
            iO = 0;
        }
        int i19 = 0;
        int i21 = 0;
        ?? r13 = cVar;
        while (i19 < size) {
            androidx.appcompat.view.menu.g gVar2 = arrayListG.get(i19);
            if (gVar2.o()) {
                View viewP = r13.p(gVar2, view, viewGroup);
                if (r13.f2616t) {
                    iO -= ActionMenuView.o(viewP, i11, iO, iMakeMeasureSpec, r12);
                } else {
                    viewP.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewP.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i21 == 0) {
                    i21 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                r11 = r12;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i17 > 0 || z12) && i13 > 0 && (!r13.f2616t || iO > 0);
                boolean z14 = z13;
                if (z13) {
                    View viewP2 = r13.p(gVar2, null, viewGroup);
                    if (r13.f2616t) {
                        int iO2 = ActionMenuView.o(viewP2, i11, iO, iMakeMeasureSpec, 0);
                        iO -= iO2;
                        if (iO2 == 0) {
                            z14 = false;
                        }
                    } else {
                        viewP2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = viewP2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i21 == 0) {
                        i21 = measuredWidth2;
                    }
                    z13 = z15 & (!r13.f2616t ? i13 + i21 <= 0 : i13 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i22 = 0; i22 < i19; i22++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayListG.get(i22);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i17++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                gVar2.u(z13);
                r11 = 0;
            } else {
                r11 = r12;
                gVar2.u(r11);
            }
            i19++;
            r12 = r11;
            size = size;
            view = null;
            r13 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void h(@NonNull Context context, androidx.appcompat.view.menu.e eVar) {
        super.h(context, eVar);
        Resources resources = context.getResources();
        n.a aVarB = n.a.b(context);
        if (!this.f2611o) {
            this.f2610n = aVarB.h();
        }
        if (!this.f2617u) {
            this.f2612p = aVarB.c();
        }
        if (!this.f2615s) {
            this.f2614r = aVarB.d();
        }
        int measuredWidth = this.f2612p;
        if (this.f2610n) {
            if (this.f2607k == null) {
                d dVar = new d(this.f2237a);
                this.f2607k = dVar;
                if (this.f2609m) {
                    dVar.setImageDrawable(this.f2608l);
                    this.f2608l = null;
                    this.f2609m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2607k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f2607k.getMeasuredWidth();
        } else {
            this.f2607k = null;
        }
        this.f2613q = measuredWidth;
        this.f2619w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void j(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.k.a aVar) {
        aVar.d(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f2245i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(Parcelable parcelable) {
        int i11;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i11 = ((g) parcelable).f2632a) > 0 && (menuItemFindItem = this.f2239c.findItem(i11)) != null) {
            l((androidx.appcompat.view.menu.m) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean l(androidx.appcompat.view.menu.m mVar) {
        boolean z11 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.i0() != this.f2239c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.i0();
        }
        View viewB = B(mVar2.getItem());
        if (viewB == null) {
            return false;
        }
        this.D = mVar.getItem().getItemId();
        int size = mVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = mVar.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                z11 = true;
                break;
            }
        }
        a aVar = new a(this.f2238b, mVar, viewB);
        this.f2622z = aVar;
        aVar.g(z11);
        this.f2622z.k();
        super.l(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean n(ViewGroup viewGroup, int i11) {
        if (viewGroup.getChildAt(i11) == this.f2607k) {
            return false;
        }
        return super.n(viewGroup, i11);
    }

    @Override // androidx.appcompat.view.menu.a
    public View p(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.p(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k q(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f2245i;
        androidx.appcompat.view.menu.k kVarQ = super.q(viewGroup);
        if (kVar != kVarQ) {
            ((ActionMenuView) kVarQ).setPresenter(this);
        }
        return kVarQ;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean s(int i11, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }
}

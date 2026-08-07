package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import d5.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static j f6858y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SparseArray<View> f6859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.widget.b> f6860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected d5.f f6861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f6866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.constraintlayout.widget.d f6868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected androidx.constraintlayout.widget.c f6869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f6870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HashMap<String, Integer> f6871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6872n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f6873o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f6874p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f6875q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f6876r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f6877s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SparseArray<d5.e> f6878t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    c f6879u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f6880v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f6881w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ArrayList<d> f6882x;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6883a;

        static {
            int[] iArr = new int[d5.e.b.values().length];
            f6883a = iArr;
            try {
                iArr[d5.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6883a[d5.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6883a[d5.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6883a[d5.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements e5.b.InterfaceC1268b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f6934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f6937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f6939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f6940g;

        c(ConstraintLayout constraintLayout) {
            this.f6934a = constraintLayout;
        }

        private boolean d(int i11, int i12, int i13) {
            if (i11 == i12) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i13 == size;
            }
            return false;
        }

        @Override // e5.b.InterfaceC1268b
        public final void a() {
            int childCount = this.f6934a.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f6934a.getChildAt(i11);
                if (childAt instanceof g) {
                    ((g) childAt).b(this.f6934a);
                }
            }
            int size = this.f6934a.f6860b.size();
            if (size > 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    ((androidx.constraintlayout.widget.b) this.f6934a.f6860b.get(i12)).s(this.f6934a);
                }
            }
        }

        @Override // e5.b.InterfaceC1268b
        @SuppressLint({"WrongCall"})
        public final void b(d5.e eVar, e5.b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i11;
            if (eVar == null) {
                return;
            }
            if (eVar.X() == 8 && !eVar.l0()) {
                aVar.f61792e = 0;
                aVar.f61793f = 0;
                aVar.f61794g = 0;
                return;
            }
            if (eVar.M() == null) {
                return;
            }
            ConstraintLayout.c(ConstraintLayout.this);
            d5.e.b bVar = aVar.f61788a;
            d5.e.b bVar2 = aVar.f61789b;
            int i12 = aVar.f61790c;
            int i13 = aVar.f61791d;
            int i14 = this.f6935b + this.f6936c;
            int i15 = this.f6937d;
            View view = (View) eVar.u();
            int[] iArr = a.f6883a;
            int i16 = iArr[bVar.ordinal()];
            if (i16 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i16 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6939f, i15, -2);
            } else if (i16 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6939f, i15 + eVar.D(), -1);
            } else if (i16 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6939f, i15, -2);
                boolean z11 = eVar.f59472w == 1;
                int i17 = aVar.f61797j;
                if (i17 == e5.b.a.f61786l || i17 == e5.b.a.f61787m) {
                    boolean z12 = view.getMeasuredHeight() == eVar.z();
                    if (aVar.f61797j == e5.b.a.f61787m || !z11 || ((z11 && z12) || (view instanceof g) || eVar.p0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.Y(), 1073741824);
                    }
                }
            }
            int i18 = iArr[bVar2.ordinal()];
            if (i18 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else if (i18 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f6940g, i14, -2);
            } else if (i18 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f6940g, i14 + eVar.W(), -1);
            } else if (i18 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f6940g, i14, -2);
                boolean z13 = eVar.f59474x == 1;
                int i19 = aVar.f61797j;
                if (i19 == e5.b.a.f61786l || i19 == e5.b.a.f61787m) {
                    boolean z14 = view.getMeasuredWidth() == eVar.Y();
                    if (aVar.f61797j == e5.b.a.f61787m || !z13 || ((z13 && z14) || (view instanceof g) || eVar.q0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.z(), 1073741824);
                    }
                }
            }
            d5.f fVar = (d5.f) eVar.M();
            if (fVar != null && d5.k.b(ConstraintLayout.this.f6867i, 256) && view.getMeasuredWidth() == eVar.Y() && view.getMeasuredWidth() < fVar.Y() && view.getMeasuredHeight() == eVar.z() && view.getMeasuredHeight() < fVar.z() && view.getBaseline() == eVar.r() && !eVar.o0() && d(eVar.E(), iMakeMeasureSpec, eVar.Y()) && d(eVar.F(), iMakeMeasureSpec2, eVar.z())) {
                aVar.f61792e = eVar.Y();
                aVar.f61793f = eVar.z();
                aVar.f61794g = eVar.r();
                return;
            }
            d5.e.b bVar3 = d5.e.b.MATCH_CONSTRAINT;
            boolean z15 = bVar == bVar3;
            boolean z16 = bVar2 == bVar3;
            d5.e.b bVar4 = d5.e.b.MATCH_PARENT;
            boolean z17 = bVar2 == bVar4 || bVar2 == d5.e.b.FIXED;
            boolean z18 = bVar == bVar4 || bVar == d5.e.b.FIXED;
            boolean z19 = z15 && eVar.f59439f0 > BitmapDescriptorFactory.HUE_RED;
            boolean z21 = z16 && eVar.f59439f0 > BitmapDescriptorFactory.HUE_RED;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i21 = aVar.f61797j;
            if (i21 != e5.b.a.f61786l && i21 != e5.b.a.f61787m && z15 && eVar.f59472w == 0 && z16 && eVar.f59474x == 0) {
                i11 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof l) && (eVar instanceof m)) {
                    ((l) view).x((m) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.a1(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i22 = eVar.f59478z;
                iMax = i22 > 0 ? Math.max(i22, measuredWidth) : measuredWidth;
                int i23 = eVar.A;
                if (i23 > 0) {
                    iMax = Math.min(i23, iMax);
                }
                int i24 = eVar.C;
                iMax2 = i24 > 0 ? Math.max(i24, measuredHeight) : measuredHeight;
                boolean z22 = z18;
                int i25 = eVar.D;
                if (i25 > 0) {
                    iMax2 = Math.min(i25, iMax2);
                }
                boolean z23 = z17;
                if (!d5.k.b(ConstraintLayout.this.f6867i, 1)) {
                    if (z19 && z23) {
                        iMax = (int) ((iMax2 * eVar.f59439f0) + 0.5f);
                    } else if (z21 && z22) {
                        iMax2 = (int) ((iMax / eVar.f59439f0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    eVar.a1(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i11 = -1;
            }
            boolean z24 = baseline != i11;
            aVar.f61796i = (iMax == aVar.f61790c && iMax2 == aVar.f61791d) ? false : true;
            if (bVar5.f6897g0) {
                z24 = true;
            }
            if (z24 && baseline != -1 && eVar.r() != baseline) {
                aVar.f61796i = true;
            }
            aVar.f61792e = iMax;
            aVar.f61793f = iMax2;
            aVar.f61795h = z24;
            aVar.f61794g = baseline;
            ConstraintLayout.c(ConstraintLayout.this);
        }

        public void c(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f6935b = i13;
            this.f6936c = i14;
            this.f6937d = i15;
            this.f6938e = i16;
            this.f6939f = i11;
            this.f6940g = i12;
        }
    }

    public interface d {
        boolean a(int i11, int i12, int i13, View view, b bVar);
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.f6859a = new SparseArray<>();
        this.f6860b = new ArrayList<>(4);
        this.f6861c = new d5.f();
        this.f6862d = 0;
        this.f6863e = 0;
        this.f6864f = Integer.MAX_VALUE;
        this.f6865g = Integer.MAX_VALUE;
        this.f6866h = true;
        this.f6867i = EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        this.f6868j = null;
        this.f6869k = null;
        this.f6870l = -1;
        this.f6871m = new HashMap<>();
        this.f6872n = -1;
        this.f6873o = -1;
        this.f6874p = -1;
        this.f6875q = -1;
        this.f6876r = 0;
        this.f6877s = 0;
        this.f6878t = new SparseArray<>();
        this.f6879u = new c(this);
        this.f6880v = 0;
        this.f6881w = 0;
        o(null, 0, 0);
    }

    static /* synthetic */ a5.e c(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static j getSharedValues() {
        if (f6858y == null) {
            f6858y = new j();
        }
        return f6858y;
    }

    private d5.e l(int i11) {
        if (i11 == 0) {
            return this.f6861c;
        }
        View viewFindViewById = this.f6859a.get(i11);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i11)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f6861c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f6927v0;
    }

    private void o(AttributeSet attributeSet, int i11, int i12) {
        this.f6861c.G0(this);
        this.f6861c.b2(this.f6879u);
        this.f6859a.put(getId(), this);
        this.f6868j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.V0, i11, i12);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == i.f7154f1) {
                    this.f6862d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6862d);
                } else if (index == i.f7165g1) {
                    this.f6863e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6863e);
                } else if (index == i.f7132d1) {
                    this.f6864f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6864f);
                } else if (index == i.f7143e1) {
                    this.f6865g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6865g);
                } else if (index == i.O2) {
                    this.f6867i = typedArrayObtainStyledAttributes.getInt(index, this.f6867i);
                } else if (index == i.J1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            r(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f6869k = null;
                        }
                    }
                } else if (index == i.f7242n1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        this.f6868j = dVar;
                        dVar.K(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f6868j = null;
                    }
                    this.f6870l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f6861c.c2(this.f6867i);
    }

    private void q() {
        this.f6866h = true;
        this.f6872n = -1;
        this.f6873o = -1;
        this.f6874p = -1;
        this.f6875q = -1;
        this.f6876r = 0;
        this.f6877s = 0;
    }

    private void u() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            d5.e eVarN = n(getChildAt(i11));
            if (eVarN != null) {
                eVarN.v0();
            }
        }
        if (zIsInEditMode) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    l(childAt.getId()).H0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f6870l != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getId() == this.f6870l && (childAt2 instanceof e)) {
                    this.f6868j = ((e) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.d dVar = this.f6868j;
        if (dVar != null) {
            dVar.k(this, true);
        }
        this.f6861c.z1();
        int size = this.f6860b.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                this.f6860b.get(i14).u(this);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = getChildAt(i15);
            if (childAt3 instanceof g) {
                ((g) childAt3).c(this);
            }
        }
        this.f6878t.clear();
        this.f6878t.put(0, this.f6861c);
        this.f6878t.put(getId(), this.f6861c);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt4 = getChildAt(i16);
            this.f6878t.put(childAt4.getId(), n(childAt4));
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt5 = getChildAt(i17);
            d5.e eVarN2 = n(childAt5);
            if (eVarN2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f6861c.b(eVarN2);
                g(zIsInEditMode, childAt5, eVarN2, bVar, this.f6878t);
            }
        }
    }

    private void w(d5.e eVar, b bVar, SparseArray<d5.e> sparseArray, int i11, d5.d.a aVar) {
        View view = this.f6859a.get(i11);
        d5.e eVar2 = sparseArray.get(i11);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f6897g0 = true;
        d5.d.a aVar2 = d5.d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f6897g0 = true;
            bVar2.f6927v0.P0(true);
        }
        eVar.q(aVar2).b(eVar2.q(aVar), bVar.D, bVar.C, true);
        eVar.P0(true);
        eVar.q(d5.d.a.TOP).q();
        eVar.q(d5.d.a.BOTTOM).q();
    }

    private boolean x() {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (getChildAt(i11).isLayoutRequested()) {
                z11 = true;
                break;
            }
        }
        if (z11) {
            u();
        }
        return z11;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.f6860b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                this.f6860b.get(i11).t(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i13 = Integer.parseInt(strArrSplit[0]);
                        int i14 = Integer.parseInt(strArrSplit[1]);
                        int i15 = Integer.parseInt(strArrSplit[2]);
                        int i16 = (int) ((i13 / 1080.0f) * width);
                        int i17 = (int) ((i14 / 1920.0f) * height);
                        int i18 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f11 = i16;
                        float f12 = i17;
                        float f13 = i16 + ((int) ((i15 / 1080.0f) * width));
                        canvas.drawLine(f11, f12, f13, f12, paint);
                        float f14 = i17 + i18;
                        canvas.drawLine(f13, f12, f13, f14, paint);
                        canvas.drawLine(f13, f14, f11, f14, paint);
                        canvas.drawLine(f11, f14, f11, f12, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f11, f12, f13, f14, paint);
                        canvas.drawLine(f11, f14, f13, f12, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        q();
        super.forceLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    public void g(boolean z11, View view, d5.e eVar, b bVar, SparseArray<d5.e> sparseArray) {
        d5.e eVar2;
        d5.e eVar3;
        d5.e eVar4;
        d5.e eVar5;
        b bVar2;
        d5.e eVar6;
        float f11;
        int i11;
        bVar.b();
        bVar.f6929w0 = false;
        eVar.o1(view.getVisibility());
        if (bVar.f6903j0) {
            eVar.Y0(true);
            eVar.o1(8);
        }
        eVar.G0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).q(eVar, this.f6861c.V1());
        }
        if (bVar.f6899h0) {
            d5.h hVar = (d5.h) eVar;
            int i12 = bVar.f6921s0;
            int i13 = bVar.f6923t0;
            float f12 = bVar.f6925u0;
            if (f12 != -1.0f) {
                hVar.E1(f12);
                return;
            } else if (i12 != -1) {
                hVar.C1(i12);
                return;
            } else {
                if (i13 != -1) {
                    hVar.D1(i13);
                    return;
                }
                return;
            }
        }
        int i14 = bVar.f6907l0;
        int i15 = bVar.f6909m0;
        int i16 = bVar.f6911n0;
        int i17 = bVar.f6913o0;
        int i18 = bVar.f6915p0;
        int i19 = bVar.f6917q0;
        float f13 = bVar.f6919r0;
        int i21 = bVar.f6914p;
        if (i21 != -1) {
            d5.e eVar7 = sparseArray.get(i21);
            if (eVar7 != null) {
                eVar.m(eVar7, bVar.f6918r, bVar.f6916q);
            }
            eVar6 = eVar;
            bVar2 = bVar;
        } else {
            if (i14 != -1) {
                d5.e eVar8 = sparseArray.get(i14);
                if (eVar8 != null) {
                    d5.d.a aVar = d5.d.a.LEFT;
                    eVar.g0(aVar, eVar8, aVar, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i18);
                }
            } else if (i15 != -1 && (eVar2 = sparseArray.get(i15)) != null) {
                eVar.g0(d5.d.a.LEFT, eVar2, d5.d.a.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i18);
            }
            if (i16 != -1) {
                d5.e eVar9 = sparseArray.get(i16);
                if (eVar9 != null) {
                    eVar.g0(d5.d.a.RIGHT, eVar9, d5.d.a.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i19);
                }
            } else if (i17 != -1 && (eVar3 = sparseArray.get(i17)) != null) {
                d5.d.a aVar2 = d5.d.a.RIGHT;
                eVar.g0(aVar2, eVar3, aVar2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i19);
            }
            int i22 = bVar.f6900i;
            if (i22 != -1) {
                d5.e eVar10 = sparseArray.get(i22);
                if (eVar10 != null) {
                    d5.d.a aVar3 = d5.d.a.TOP;
                    eVar.g0(aVar3, eVar10, aVar3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f6930x);
                }
            } else {
                int i23 = bVar.f6902j;
                if (i23 != -1 && (eVar4 = sparseArray.get(i23)) != null) {
                    eVar.g0(d5.d.a.TOP, eVar4, d5.d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f6930x);
                }
            }
            int i24 = bVar.f6904k;
            if (i24 != -1) {
                d5.e eVar11 = sparseArray.get(i24);
                if (eVar11 != null) {
                    eVar.g0(d5.d.a.BOTTOM, eVar11, d5.d.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f6932z);
                }
            } else {
                int i25 = bVar.f6906l;
                if (i25 != -1 && (eVar5 = sparseArray.get(i25)) != null) {
                    d5.d.a aVar4 = d5.d.a.BOTTOM;
                    eVar.g0(aVar4, eVar5, aVar4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f6932z);
                }
            }
            int i26 = bVar.f6908m;
            if (i26 != -1) {
                bVar2 = bVar;
                w(eVar, bVar2, sparseArray, i26, d5.d.a.BASELINE);
            } else {
                bVar2 = bVar;
                int i27 = bVar2.f6910n;
                if (i27 != -1) {
                    w(eVar, bVar2, sparseArray, i27, d5.d.a.TOP);
                } else {
                    int i28 = bVar2.f6912o;
                    if (i28 != -1) {
                        w(eVar, bVar2, sparseArray, i28, d5.d.a.BOTTOM);
                        eVar6 = eVar;
                    }
                    if (f13 >= BitmapDescriptorFactory.HUE_RED) {
                        eVar6.R0(f13);
                    }
                    f11 = bVar2.H;
                    if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                        eVar6.i1(f11);
                    }
                }
            }
            eVar6 = eVar;
            if (f13 >= BitmapDescriptorFactory.HUE_RED) {
                eVar6.R0(f13);
            }
            f11 = bVar2.H;
            if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                eVar6.i1(f11);
            }
        }
        if (z11 && ((i11 = bVar2.X) != -1 || bVar2.Y != -1)) {
            eVar6.g1(i11, bVar2.Y);
        }
        if (bVar2.f6893e0) {
            eVar6.U0(d5.e.b.FIXED);
            eVar6.p1(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                eVar6.U0(d5.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.f6885a0) {
                eVar6.U0(d5.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.U0(d5.e.b.MATCH_PARENT);
            }
            eVar6.q(d5.d.a.LEFT).f59425g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            eVar6.q(d5.d.a.RIGHT).f59425g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            eVar6.U0(d5.e.b.MATCH_CONSTRAINT);
            eVar6.p1(0);
        }
        if (bVar2.f6895f0) {
            eVar6.l1(d5.e.b.FIXED);
            eVar6.Q0(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                eVar6.l1(d5.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.f6887b0) {
                eVar6.l1(d5.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.l1(d5.e.b.MATCH_PARENT);
            }
            eVar6.q(d5.d.a.TOP).f59425g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            eVar6.q(d5.d.a.BOTTOM).f59425g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            eVar6.l1(d5.e.b.MATCH_CONSTRAINT);
            eVar6.Q0(0);
        }
        eVar6.I0(bVar2.I);
        eVar6.W0(bVar2.L);
        eVar6.n1(bVar2.M);
        eVar6.S0(bVar2.N);
        eVar6.j1(bVar2.O);
        eVar6.q1(bVar2.f6891d0);
        eVar6.V0(bVar2.P, bVar2.R, bVar2.T, bVar2.V);
        eVar6.m1(bVar2.Q, bVar2.S, bVar2.U, bVar2.W);
    }

    public int getMaxHeight() {
        return this.f6865g;
    }

    public int getMaxWidth() {
        return this.f6864f;
    }

    public int getMinHeight() {
        return this.f6863e;
    }

    public int getMinWidth() {
        return this.f6862d;
    }

    public int getOptimizationLevel() {
        return this.f6861c.P1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f6861c.f59456o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f6861c.f59456o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f6861c.f59456o = "parent";
            }
        }
        if (this.f6861c.v() == null) {
            d5.f fVar = this.f6861c;
            fVar.H0(fVar.f59456o);
            Log.v("ConstraintLayout", " setDebugName " + this.f6861c.v());
        }
        for (d5.e eVar : this.f6861c.w1()) {
            View view = (View) eVar.u();
            if (view != null) {
                if (eVar.f59456o == null && (id2 = view.getId()) != -1) {
                    eVar.f59456o = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar.v() == null) {
                    eVar.H0(eVar.f59456o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar.v());
                }
            }
        }
        this.f6861c.Q(sb2);
        return sb2.toString();
    }

    protected boolean h(int i11, int i12) {
        boolean zA = false;
        if (this.f6882x == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        for (d dVar : this.f6882x) {
            Iterator<d5.e> it = this.f6861c.w1().iterator();
            while (it.hasNext()) {
                View view = (View) it.next().u();
                zA |= dVar.a(size, size2, view.getId(), view, (b) view.getLayoutParams());
            }
        }
        return zA;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object k(int i11, Object obj) {
        if (i11 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f6871m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f6871m.get(str);
    }

    public View m(int i11) {
        return this.f6859a.get(i11);
    }

    public final d5.e n(View view) {
        if (view == this) {
            return this.f6861c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f6927v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f6927v0;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            b bVar = (b) childAt.getLayoutParams();
            d5.e eVar = bVar.f6927v0;
            if ((childAt.getVisibility() != 8 || bVar.f6899h0 || bVar.f6901i0 || bVar.f6905k0 || zIsInEditMode) && !bVar.f6903j0) {
                int iZ = eVar.Z();
                int iA0 = eVar.a0();
                int iY = eVar.Y() + iZ;
                int iZ2 = eVar.z() + iA0;
                childAt.layout(iZ, iA0, iY, iZ2);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iZ, iA0, iY, iZ2);
                }
            }
        }
        int size = this.f6860b.size();
        if (size > 0) {
            for (int i16 = 0; i16 < size; i16++) {
                this.f6860b.get(i16).r(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        boolean zH = this.f6866h | h(i11, i12);
        this.f6866h = zH;
        if (!zH) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).isLayoutRequested()) {
                    this.f6866h = true;
                    break;
                }
            }
        }
        this.f6880v = i11;
        this.f6881w = i12;
        this.f6861c.e2(p());
        if (this.f6866h) {
            this.f6866h = false;
            if (x()) {
                this.f6861c.g2();
            }
        }
        this.f6861c.N1(null);
        t(this.f6861c, this.f6867i, i11, i12);
        s(i11, i12, this.f6861c.Y(), this.f6861c.z(), this.f6861c.W1(), this.f6861c.U1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        d5.e eVarN = n(view);
        if ((view instanceof Guideline) && !(eVarN instanceof d5.h)) {
            b bVar = (b) view.getLayoutParams();
            d5.h hVar = new d5.h();
            bVar.f6927v0 = hVar;
            bVar.f6899h0 = true;
            hVar.F1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.w();
            ((b) view.getLayoutParams()).f6901i0 = true;
            if (!this.f6860b.contains(bVar2)) {
                this.f6860b.add(bVar2);
            }
        }
        this.f6859a.put(view.getId(), view);
        this.f6866h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f6859a.remove(view.getId());
        this.f6861c.y1(n(view));
        this.f6860b.remove(view);
        this.f6866h = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    protected void r(int i11) {
        this.f6869k = new androidx.constraintlayout.widget.c(getContext(), this, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        q();
        super.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        c cVar = this.f6879u;
        int i15 = cVar.f6938e;
        int iResolveSizeAndState = View.resolveSizeAndState(i13 + cVar.f6937d, i11, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i14 + i15, i12, 0) & 16777215;
        int iMin = Math.min(this.f6864f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f6865g, iResolveSizeAndState2);
        if (z11) {
            iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z12) {
            iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f6872n = iMin;
        this.f6873o = iMin2;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.d dVar) {
        this.f6868j = dVar;
    }

    public void setDesignInformation(int i11, Object obj, Object obj2) {
        if (i11 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f6871m == null) {
                this.f6871m = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f6871m.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.View
    public void setId(int i11) {
        this.f6859a.remove(getId());
        super.setId(i11);
        this.f6859a.put(getId(), this);
    }

    public void setMaxHeight(int i11) {
        if (i11 == this.f6865g) {
            return;
        }
        this.f6865g = i11;
        requestLayout();
    }

    public void setMaxWidth(int i11) {
        if (i11 == this.f6864f) {
            return;
        }
        this.f6864f = i11;
        requestLayout();
    }

    public void setMinHeight(int i11) {
        if (i11 == this.f6863e) {
            return;
        }
        this.f6863e = i11;
        requestLayout();
    }

    public void setMinWidth(int i11) {
        if (i11 == this.f6862d) {
            return;
        }
        this.f6862d = i11;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        androidx.constraintlayout.widget.c cVar = this.f6869k;
        if (cVar != null) {
            cVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i11) {
        this.f6867i = i11;
        this.f6861c.c2(i11);
    }

    public void setState(int i11, int i12, int i13) {
        androidx.constraintlayout.widget.c cVar = this.f6869k;
        if (cVar != null) {
            cVar.d(i11, i12, i13);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t(d5.f fVar, int i11, int i12, int i13) {
        int i14;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i15 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f6879u.c(i12, i13, iMax, iMax2, paddingWidth, i15);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (p()) {
                i14 = iMax4;
            }
            int i16 = size - paddingWidth;
            int i17 = size2 - i15;
            v(fVar, mode, i16, mode2, i17);
            fVar.X1(i11, mode, i16, mode2, i17, this.f6872n, this.f6873o, i14, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i14 = iMax3;
        int i18 = size - paddingWidth;
        int i19 = size2 - i15;
        v(fVar, mode, i18, mode2, i19);
        fVar.X1(i11, mode, i18, mode2, i19, this.f6872n, this.f6873o, i14, iMax);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 d5.e$b) = (r2v3 d5.e$b), (r2v0 d5.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    protected void v(d5.f fVar, int i11, int i12, int i13, int i14) {
        d5.e.b bVar;
        c cVar = this.f6879u;
        int i15 = cVar.f6938e;
        int i16 = cVar.f6937d;
        d5.e.b bVar2 = d5.e.b.FIXED;
        int childCount = getChildCount();
        if (i11 == Integer.MIN_VALUE) {
            bVar = d5.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i12 = Math.max(0, this.f6862d);
            }
        } else if (i11 == 0) {
            bVar = d5.e.b.WRAP_CONTENT;
            i12 = childCount == 0 ? Math.max(0, this.f6862d) : 0;
        } else if (i11 != 1073741824) {
            bVar = bVar2;
        } else {
            i12 = Math.min(this.f6864f - i16, i12);
            bVar = bVar2;
        }
        if (i13 == Integer.MIN_VALUE) {
            bVar2 = d5.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.f6863e);
            }
        } else if (i13 == 0) {
            bVar2 = d5.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.f6863e);
            } else {
                i14 = 0;
            }
        } else if (i13 != 1073741824) {
            i14 = 0;
        } else {
            i14 = Math.min(this.f6865g - i15, i14);
        }
        if (i12 != fVar.Y() || i14 != fVar.z()) {
            fVar.T1();
        }
        fVar.r1(0);
        fVar.s1(0);
        fVar.c1(this.f6864f - i16);
        fVar.b1(this.f6865g - i15);
        fVar.f1(0);
        fVar.e1(0);
        fVar.U0(bVar);
        fVar.p1(i12);
        fVar.l1(bVar2);
        fVar.Q0(i14);
        fVar.f1(this.f6862d - i16);
        fVar.e1(this.f6863e - i15);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6859a = new SparseArray<>();
        this.f6860b = new ArrayList<>(4);
        this.f6861c = new d5.f();
        this.f6862d = 0;
        this.f6863e = 0;
        this.f6864f = Integer.MAX_VALUE;
        this.f6865g = Integer.MAX_VALUE;
        this.f6866h = true;
        this.f6867i = EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        this.f6868j = null;
        this.f6869k = null;
        this.f6870l = -1;
        this.f6871m = new HashMap<>();
        this.f6872n = -1;
        this.f6873o = -1;
        this.f6874p = -1;
        this.f6875q = -1;
        this.f6876r = 0;
        this.f6877s = 0;
        this.f6878t = new SparseArray<>();
        this.f6879u = new c(this);
        this.f6880v = 0;
        this.f6881w = 0;
        o(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f6859a = new SparseArray<>();
        this.f6860b = new ArrayList<>(4);
        this.f6861c = new d5.f();
        this.f6862d = 0;
        this.f6863e = 0;
        this.f6864f = Integer.MAX_VALUE;
        this.f6865g = Integer.MAX_VALUE;
        this.f6866h = true;
        this.f6867i = EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
        this.f6868j = null;
        this.f6869k = null;
        this.f6870l = -1;
        this.f6871m = new HashMap<>();
        this.f6872n = -1;
        this.f6873o = -1;
        this.f6874p = -1;
        this.f6875q = -1;
        this.f6876r = 0;
        this.f6877s = 0;
        this.f6878t = new SparseArray<>();
        this.f6879u = new c(this);
        this.f6880v = 0;
        this.f6881w = 0;
        o(attributeSet, i11, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6884a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f6885a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6886b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f6887b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f6888c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public String f6889c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f6890d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f6891d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6892e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        boolean f6893e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6894f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        boolean f6895f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6896g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        boolean f6897g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6898h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        boolean f6899h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f6900i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        boolean f6901i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6902j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        boolean f6903j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f6904k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        boolean f6905k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f6906l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f6907l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f6908m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        int f6909m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f6910n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        int f6911n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f6912o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        int f6913o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f6914p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        int f6915p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f6916q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        int f6917q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f6918r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        float f6919r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f6920s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        int f6921s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f6922t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        int f6923t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f6924u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        float f6925u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f6926v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        d5.e f6927v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f6928w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f6929w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f6930x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f6931y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f6932z;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f6933a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f6933a = sparseIntArray;
                sparseIntArray.append(i.f7375z2, 64);
                sparseIntArray.append(i.f7122c2, 65);
                sparseIntArray.append(i.f7221l2, 8);
                sparseIntArray.append(i.f7232m2, 9);
                sparseIntArray.append(i.f7254o2, 10);
                sparseIntArray.append(i.f7265p2, 11);
                sparseIntArray.append(i.f7331v2, 12);
                sparseIntArray.append(i.f7320u2, 13);
                sparseIntArray.append(i.S1, 14);
                sparseIntArray.append(i.R1, 15);
                sparseIntArray.append(i.N1, 16);
                sparseIntArray.append(i.P1, 52);
                sparseIntArray.append(i.O1, 53);
                sparseIntArray.append(i.T1, 2);
                sparseIntArray.append(i.V1, 3);
                sparseIntArray.append(i.U1, 4);
                sparseIntArray.append(i.E2, 49);
                sparseIntArray.append(i.F2, 50);
                sparseIntArray.append(i.Z1, 5);
                sparseIntArray.append(i.f7098a2, 6);
                sparseIntArray.append(i.f7110b2, 7);
                sparseIntArray.append(i.I1, 67);
                sparseIntArray.append(i.W0, 1);
                sparseIntArray.append(i.f7276q2, 17);
                sparseIntArray.append(i.f7287r2, 18);
                sparseIntArray.append(i.Y1, 19);
                sparseIntArray.append(i.X1, 20);
                sparseIntArray.append(i.J2, 21);
                sparseIntArray.append(i.M2, 22);
                sparseIntArray.append(i.K2, 23);
                sparseIntArray.append(i.H2, 24);
                sparseIntArray.append(i.L2, 25);
                sparseIntArray.append(i.I2, 26);
                sparseIntArray.append(i.G2, 55);
                sparseIntArray.append(i.N2, 54);
                sparseIntArray.append(i.f7177h2, 29);
                sparseIntArray.append(i.f7342w2, 30);
                sparseIntArray.append(i.W1, 44);
                sparseIntArray.append(i.f7199j2, 45);
                sparseIntArray.append(i.f7364y2, 46);
                sparseIntArray.append(i.f7188i2, 47);
                sparseIntArray.append(i.f7353x2, 48);
                sparseIntArray.append(i.L1, 27);
                sparseIntArray.append(i.K1, 28);
                sparseIntArray.append(i.A2, 31);
                sparseIntArray.append(i.f7133d2, 32);
                sparseIntArray.append(i.C2, 33);
                sparseIntArray.append(i.B2, 34);
                sparseIntArray.append(i.D2, 35);
                sparseIntArray.append(i.f7155f2, 36);
                sparseIntArray.append(i.f7144e2, 37);
                sparseIntArray.append(i.f7166g2, 38);
                sparseIntArray.append(i.f7210k2, 39);
                sparseIntArray.append(i.f7309t2, 40);
                sparseIntArray.append(i.f7243n2, 41);
                sparseIntArray.append(i.Q1, 42);
                sparseIntArray.append(i.M1, 43);
                sparseIntArray.append(i.f7298s2, 51);
                sparseIntArray.append(i.P2, 66);
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6884a = -1;
            this.f6886b = -1;
            this.f6888c = -1.0f;
            this.f6890d = true;
            this.f6892e = -1;
            this.f6894f = -1;
            this.f6896g = -1;
            this.f6898h = -1;
            this.f6900i = -1;
            this.f6902j = -1;
            this.f6904k = -1;
            this.f6906l = -1;
            this.f6908m = -1;
            this.f6910n = -1;
            this.f6912o = -1;
            this.f6914p = -1;
            this.f6916q = 0;
            this.f6918r = BitmapDescriptorFactory.HUE_RED;
            this.f6920s = -1;
            this.f6922t = -1;
            this.f6924u = -1;
            this.f6926v = -1;
            this.f6928w = Integer.MIN_VALUE;
            this.f6930x = Integer.MIN_VALUE;
            this.f6931y = Integer.MIN_VALUE;
            this.f6932z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = BitmapDescriptorFactory.HUE_RED;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f6885a0 = false;
            this.f6887b0 = false;
            this.f6889c0 = null;
            this.f6891d0 = 0;
            this.f6893e0 = true;
            this.f6895f0 = true;
            this.f6897g0 = false;
            this.f6899h0 = false;
            this.f6901i0 = false;
            this.f6903j0 = false;
            this.f6905k0 = false;
            this.f6907l0 = -1;
            this.f6909m0 = -1;
            this.f6911n0 = -1;
            this.f6913o0 = -1;
            this.f6915p0 = Integer.MIN_VALUE;
            this.f6917q0 = Integer.MIN_VALUE;
            this.f6919r0 = 0.5f;
            this.f6927v0 = new d5.e();
            this.f6929w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f6884a = bVar.f6884a;
                this.f6886b = bVar.f6886b;
                this.f6888c = bVar.f6888c;
                this.f6890d = bVar.f6890d;
                this.f6892e = bVar.f6892e;
                this.f6894f = bVar.f6894f;
                this.f6896g = bVar.f6896g;
                this.f6898h = bVar.f6898h;
                this.f6900i = bVar.f6900i;
                this.f6902j = bVar.f6902j;
                this.f6904k = bVar.f6904k;
                this.f6906l = bVar.f6906l;
                this.f6908m = bVar.f6908m;
                this.f6910n = bVar.f6910n;
                this.f6912o = bVar.f6912o;
                this.f6914p = bVar.f6914p;
                this.f6916q = bVar.f6916q;
                this.f6918r = bVar.f6918r;
                this.f6920s = bVar.f6920s;
                this.f6922t = bVar.f6922t;
                this.f6924u = bVar.f6924u;
                this.f6926v = bVar.f6926v;
                this.f6928w = bVar.f6928w;
                this.f6930x = bVar.f6930x;
                this.f6931y = bVar.f6931y;
                this.f6932z = bVar.f6932z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                this.L = bVar.L;
                this.M = bVar.M;
                this.N = bVar.N;
                this.O = bVar.O;
                this.f6885a0 = bVar.f6885a0;
                this.f6887b0 = bVar.f6887b0;
                this.P = bVar.P;
                this.Q = bVar.Q;
                this.R = bVar.R;
                this.T = bVar.T;
                this.S = bVar.S;
                this.U = bVar.U;
                this.V = bVar.V;
                this.W = bVar.W;
                this.X = bVar.X;
                this.Y = bVar.Y;
                this.Z = bVar.Z;
                this.f6893e0 = bVar.f6893e0;
                this.f6895f0 = bVar.f6895f0;
                this.f6897g0 = bVar.f6897g0;
                this.f6899h0 = bVar.f6899h0;
                this.f6907l0 = bVar.f6907l0;
                this.f6909m0 = bVar.f6909m0;
                this.f6911n0 = bVar.f6911n0;
                this.f6913o0 = bVar.f6913o0;
                this.f6915p0 = bVar.f6915p0;
                this.f6917q0 = bVar.f6917q0;
                this.f6919r0 = bVar.f6919r0;
                this.f6889c0 = bVar.f6889c0;
                this.f6891d0 = bVar.f6891d0;
                this.f6927v0 = bVar.f6927v0;
                this.E = bVar.E;
                this.F = bVar.F;
            }
        }

        public String a() {
            return this.f6889c0;
        }

        public void b() {
            this.f6899h0 = false;
            this.f6893e0 = true;
            this.f6895f0 = true;
            int i11 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i11 == -2 && this.f6885a0) {
                this.f6893e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i12 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i12 == -2 && this.f6887b0) {
                this.f6895f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f6893e0 = false;
                if (i11 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f6885a0 = true;
                }
            }
            if (i12 == 0 || i12 == -1) {
                this.f6895f0 = false;
                if (i12 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f6887b0 = true;
                }
            }
            if (this.f6888c == -1.0f && this.f6884a == -1 && this.f6886b == -1) {
                return;
            }
            this.f6899h0 = true;
            this.f6893e0 = true;
            this.f6895f0 = true;
            if (!(this.f6927v0 instanceof d5.h)) {
                this.f6927v0 = new d5.h();
            }
            ((d5.h) this.f6927v0).F1(this.Z);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            int i16 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i17 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i11);
            boolean z11 = false;
            boolean z12 = 1 == getLayoutDirection();
            this.f6911n0 = -1;
            this.f6913o0 = -1;
            this.f6907l0 = -1;
            this.f6909m0 = -1;
            this.f6915p0 = this.f6928w;
            this.f6917q0 = this.f6931y;
            float f11 = this.G;
            this.f6919r0 = f11;
            int i18 = this.f6884a;
            this.f6921s0 = i18;
            int i19 = this.f6886b;
            this.f6923t0 = i19;
            float f12 = this.f6888c;
            this.f6925u0 = f12;
            if (z12) {
                int i21 = this.f6920s;
                if (i21 != -1) {
                    this.f6911n0 = i21;
                } else {
                    int i22 = this.f6922t;
                    if (i22 != -1) {
                        this.f6913o0 = i22;
                    } else {
                        i12 = this.f6924u;
                        if (i12 != -1) {
                            this.f6909m0 = i12;
                            z11 = true;
                        }
                        i13 = this.f6926v;
                        if (i13 != -1) {
                            this.f6907l0 = i13;
                            z11 = true;
                        }
                        i14 = this.A;
                        if (i14 != Integer.MIN_VALUE) {
                            this.f6917q0 = i14;
                        }
                        i15 = this.B;
                        if (i15 != Integer.MIN_VALUE) {
                            this.f6915p0 = i15;
                        }
                        if (z11) {
                            this.f6919r0 = 1.0f - f11;
                        }
                        if (this.f6899h0 && this.Z == 1 && this.f6890d) {
                            if (f12 != -1.0f) {
                                this.f6925u0 = 1.0f - f12;
                                this.f6921s0 = -1;
                                this.f6923t0 = -1;
                            } else if (i18 != -1) {
                                this.f6923t0 = i18;
                                this.f6921s0 = -1;
                                this.f6925u0 = -1.0f;
                            } else if (i19 != -1) {
                                this.f6921s0 = i19;
                                this.f6923t0 = -1;
                                this.f6925u0 = -1.0f;
                            }
                        }
                    }
                }
                z11 = true;
                i12 = this.f6924u;
                if (i12 != -1) {
                    this.f6909m0 = i12;
                    z11 = true;
                }
                i13 = this.f6926v;
                if (i13 != -1) {
                    this.f6907l0 = i13;
                    z11 = true;
                }
                i14 = this.A;
                if (i14 != Integer.MIN_VALUE) {
                    this.f6917q0 = i14;
                }
                i15 = this.B;
                if (i15 != Integer.MIN_VALUE) {
                    this.f6915p0 = i15;
                }
                if (z11) {
                    this.f6919r0 = 1.0f - f11;
                }
                if (this.f6899h0) {
                    if (f12 != -1.0f) {
                        this.f6925u0 = 1.0f - f12;
                        this.f6921s0 = -1;
                        this.f6923t0 = -1;
                    } else if (i18 != -1) {
                        this.f6923t0 = i18;
                        this.f6921s0 = -1;
                        this.f6925u0 = -1.0f;
                    } else if (i19 != -1) {
                        this.f6921s0 = i19;
                        this.f6923t0 = -1;
                        this.f6925u0 = -1.0f;
                    }
                }
            } else {
                int i23 = this.f6920s;
                if (i23 != -1) {
                    this.f6909m0 = i23;
                }
                int i24 = this.f6922t;
                if (i24 != -1) {
                    this.f6907l0 = i24;
                }
                int i25 = this.f6924u;
                if (i25 != -1) {
                    this.f6911n0 = i25;
                }
                int i26 = this.f6926v;
                if (i26 != -1) {
                    this.f6913o0 = i26;
                }
                int i27 = this.A;
                if (i27 != Integer.MIN_VALUE) {
                    this.f6915p0 = i27;
                }
                int i28 = this.B;
                if (i28 != Integer.MIN_VALUE) {
                    this.f6917q0 = i28;
                }
            }
            if (this.f6924u == -1 && this.f6926v == -1 && this.f6922t == -1 && this.f6920s == -1) {
                int i29 = this.f6896g;
                if (i29 != -1) {
                    this.f6911n0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i17 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i17;
                    }
                } else {
                    int i31 = this.f6898h;
                    if (i31 != -1) {
                        this.f6913o0 = i31;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i17 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i17;
                        }
                    }
                }
                int i32 = this.f6892e;
                if (i32 != -1) {
                    this.f6907l0 = i32;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i16 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i16;
                    return;
                }
                int i33 = this.f6894f;
                if (i33 != -1) {
                    this.f6909m0 = i33;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i16 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i16;
                }
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6884a = -1;
            this.f6886b = -1;
            this.f6888c = -1.0f;
            this.f6890d = true;
            this.f6892e = -1;
            this.f6894f = -1;
            this.f6896g = -1;
            this.f6898h = -1;
            this.f6900i = -1;
            this.f6902j = -1;
            this.f6904k = -1;
            this.f6906l = -1;
            this.f6908m = -1;
            this.f6910n = -1;
            this.f6912o = -1;
            this.f6914p = -1;
            this.f6916q = 0;
            this.f6918r = BitmapDescriptorFactory.HUE_RED;
            this.f6920s = -1;
            this.f6922t = -1;
            this.f6924u = -1;
            this.f6926v = -1;
            this.f6928w = Integer.MIN_VALUE;
            this.f6930x = Integer.MIN_VALUE;
            this.f6931y = Integer.MIN_VALUE;
            this.f6932z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = BitmapDescriptorFactory.HUE_RED;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f6885a0 = false;
            this.f6887b0 = false;
            this.f6889c0 = null;
            this.f6891d0 = 0;
            this.f6893e0 = true;
            this.f6895f0 = true;
            this.f6897g0 = false;
            this.f6899h0 = false;
            this.f6901i0 = false;
            this.f6903j0 = false;
            this.f6905k0 = false;
            this.f6907l0 = -1;
            this.f6909m0 = -1;
            this.f6911n0 = -1;
            this.f6913o0 = -1;
            this.f6915p0 = Integer.MIN_VALUE;
            this.f6917q0 = Integer.MIN_VALUE;
            this.f6919r0 = 0.5f;
            this.f6927v0 = new d5.e();
            this.f6929w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = a.f6933a.get(index);
                switch (i12) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f6914p);
                        this.f6914p = resourceId;
                        if (resourceId == -1) {
                            this.f6914p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f6916q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6916q);
                        break;
                    case 4:
                        float f11 = typedArrayObtainStyledAttributes.getFloat(index, this.f6918r) % 360.0f;
                        this.f6918r = f11;
                        if (f11 < BitmapDescriptorFactory.HUE_RED) {
                            this.f6918r = (360.0f - f11) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f6884a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6884a);
                        break;
                    case 6:
                        this.f6886b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6886b);
                        break;
                    case 7:
                        this.f6888c = typedArrayObtainStyledAttributes.getFloat(index, this.f6888c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6892e);
                        this.f6892e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f6892e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6894f);
                        this.f6894f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f6894f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6896g);
                        this.f6896g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f6896g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6898h);
                        this.f6898h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f6898h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6900i);
                        this.f6900i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f6900i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6902j);
                        this.f6902j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f6902j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6904k);
                        this.f6904k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f6904k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6906l);
                        this.f6906l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f6906l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6908m);
                        this.f6908m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f6908m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6920s);
                        this.f6920s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f6920s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6922t);
                        this.f6922t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f6922t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6924u);
                        this.f6924u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f6924u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6926v);
                        this.f6926v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f6926v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f6928w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6928w);
                        break;
                    case 22:
                        this.f6930x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6930x);
                        break;
                    case 23:
                        this.f6931y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6931y);
                        break;
                    case 24:
                        this.f6932z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6932z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f6885a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f6885a0);
                        break;
                    case 28:
                        this.f6887b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f6887b0);
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i14 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.Q = i14;
                        if (i14 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(BitmapDescriptorFactory.HUE_RED, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.W = Math.max(BitmapDescriptorFactory.HUE_RED, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                androidx.constraintlayout.widget.d.P(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f6889c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6910n);
                                this.f6910n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f6910n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6912o);
                                this.f6912o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f6912o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i12) {
                                    case 64:
                                        androidx.constraintlayout.widget.d.N(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.d.N(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f6891d0 = typedArrayObtainStyledAttributes.getInt(index, this.f6891d0);
                                        break;
                                    case 67:
                                        this.f6890d = typedArrayObtainStyledAttributes.getBoolean(index, this.f6890d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            b();
        }

        public b(int i11, int i12) {
            super(i11, i12);
            this.f6884a = -1;
            this.f6886b = -1;
            this.f6888c = -1.0f;
            this.f6890d = true;
            this.f6892e = -1;
            this.f6894f = -1;
            this.f6896g = -1;
            this.f6898h = -1;
            this.f6900i = -1;
            this.f6902j = -1;
            this.f6904k = -1;
            this.f6906l = -1;
            this.f6908m = -1;
            this.f6910n = -1;
            this.f6912o = -1;
            this.f6914p = -1;
            this.f6916q = 0;
            this.f6918r = BitmapDescriptorFactory.HUE_RED;
            this.f6920s = -1;
            this.f6922t = -1;
            this.f6924u = -1;
            this.f6926v = -1;
            this.f6928w = Integer.MIN_VALUE;
            this.f6930x = Integer.MIN_VALUE;
            this.f6931y = Integer.MIN_VALUE;
            this.f6932z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = BitmapDescriptorFactory.HUE_RED;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f6885a0 = false;
            this.f6887b0 = false;
            this.f6889c0 = null;
            this.f6891d0 = 0;
            this.f6893e0 = true;
            this.f6895f0 = true;
            this.f6897g0 = false;
            this.f6899h0 = false;
            this.f6901i0 = false;
            this.f6903j0 = false;
            this.f6905k0 = false;
            this.f6907l0 = -1;
            this.f6909m0 = -1;
            this.f6911n0 = -1;
            this.f6913o0 = -1;
            this.f6915p0 = Integer.MIN_VALUE;
            this.f6917q0 = Integer.MIN_VALUE;
            this.f6919r0 = 0.5f;
            this.f6927v0 = new d5.e();
            this.f6929w0 = false;
        }
    }
}

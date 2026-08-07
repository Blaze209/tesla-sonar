package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f6951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f6952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f6953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected d5.i f6954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f6955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f6956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f6957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View[] f6958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected HashMap<Integer, String> f6959i;

    public b(Context context) {
        super(context);
        this.f6951a = new int[32];
        this.f6955e = false;
        this.f6958h = null;
        this.f6959i = new HashMap<>();
        this.f6953c = context;
        o(null);
    }

    private void e(String str) {
        if (str == null || str.length() == 0 || this.f6953c == null) {
            return;
        }
        String strTrim = str.trim();
        int iM = m(strTrim);
        if (iM != 0) {
            this.f6959i.put(Integer.valueOf(iM), strTrim);
            f(iM);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void f(int i11) {
        if (i11 == getId()) {
            return;
        }
        int i12 = this.f6952b + 1;
        int[] iArr = this.f6951a;
        if (i12 > iArr.length) {
            this.f6951a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f6951a;
        int i13 = this.f6952b;
        iArr2[i13] = i11;
        this.f6952b = i13 + 1;
    }

    private void g(String str) {
        if (str == null || str.length() == 0 || this.f6953c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f6889c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    f(childAt.getId());
                }
            }
        }
    }

    private int[] k(String str) {
        String[] strArrSplit = str.split(",");
        int[] iArr = new int[strArrSplit.length];
        int i11 = 0;
        for (String str2 : strArrSplit) {
            int iM = m(str2.trim());
            if (iM != 0) {
                iArr[i11] = iM;
                i11++;
            }
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private int l(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f6953c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int m(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iL = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objK = constraintLayout.k(0, str);
            if (objK instanceof Integer) {
                iL = ((Integer) objK).intValue();
            }
        }
        if (iL == 0 && constraintLayout != null) {
            iL = l(constraintLayout, str);
        }
        if (iL == 0) {
            try {
                iL = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iL == 0 ? this.f6953c.getResources().getIdentifier(str, "id", this.f6953c.getPackageName()) : iL;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f6951a, this.f6952b);
    }

    protected void h() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        i((ConstraintLayout) parent);
    }

    protected void i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i11 = 0; i11 < this.f6952b; i11++) {
            View viewM = constraintLayout.m(this.f6951a[i11]);
            if (viewM != null) {
                viewM.setVisibility(visibility);
                if (elevation > BitmapDescriptorFactory.HUE_RED) {
                    viewM.setTranslationZ(viewM.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void j(ConstraintLayout constraintLayout) {
    }

    protected View[] n(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f6958h;
        if (viewArr == null || viewArr.length != this.f6952b) {
            this.f6958h = new View[this.f6952b];
        }
        for (int i11 = 0; i11 < this.f6952b; i11++) {
            this.f6958h[i11] = constraintLayout.m(this.f6951a[i11]);
        }
        return this.f6958h;
    }

    protected void o(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == i.f7253o1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f6956f = string;
                    setIds(string);
                } else if (index == i.f7264p1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f6957g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f6956f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f6957g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f6955e) {
            super.onMeasure(i11, i12);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(d.a aVar, d5.j jVar, ConstraintLayout.b bVar, SparseArray<d5.e> sparseArray) {
        d.b bVar2 = aVar.f6991e;
        int[] iArr = bVar2.f7029k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.f7031l0;
            if (str != null) {
                if (str.length() > 0) {
                    d.b bVar3 = aVar.f6991e;
                    bVar3.f7029k0 = k(bVar3.f7031l0);
                } else {
                    aVar.f6991e.f7029k0 = null;
                }
            }
        }
        if (jVar == null) {
            return;
        }
        jVar.a();
        if (aVar.f6991e.f7029k0 == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            int[] iArr2 = aVar.f6991e.f7029k0;
            if (i11 >= iArr2.length) {
                return;
            }
            d5.e eVar = sparseArray.get(iArr2[i11]);
            if (eVar != null) {
                jVar.b(eVar);
            }
            i11++;
        }
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void s(ConstraintLayout constraintLayout) {
    }

    protected void setIds(String str) {
        this.f6956f = str;
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.f6952b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i11);
            if (iIndexOf == -1) {
                e(str.substring(i11));
                return;
            } else {
                e(str.substring(i11, iIndexOf));
                i11 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f6957g = str;
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.f6952b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i11);
            if (iIndexOf == -1) {
                g(str.substring(i11));
                return;
            } else {
                g(str.substring(i11, iIndexOf));
                i11 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f6956f = null;
        this.f6952b = 0;
        for (int i11 : iArr) {
            f(i11);
        }
    }

    @Override // android.view.View
    public void setTag(int i11, Object obj) {
        super.setTag(i11, obj);
        if (obj == null && this.f6956f == null) {
            f(i11);
        }
    }

    public void t(ConstraintLayout constraintLayout) {
    }

    public void u(ConstraintLayout constraintLayout) {
        String str;
        int iL;
        if (isInEditMode()) {
            setIds(this.f6956f);
        }
        d5.i iVar = this.f6954d;
        if (iVar == null) {
            return;
        }
        iVar.a();
        for (int i11 = 0; i11 < this.f6952b; i11++) {
            int i12 = this.f6951a[i11];
            View viewM = constraintLayout.m(i12);
            if (viewM == null && (iL = l(constraintLayout, (str = this.f6959i.get(Integer.valueOf(i12))))) != 0) {
                this.f6951a[i11] = iL;
                this.f6959i.put(Integer.valueOf(iL), str);
                viewM = constraintLayout.m(iL);
            }
            if (viewM != null) {
                this.f6954d.b(constraintLayout.n(viewM));
            }
        }
        this.f6954d.c(constraintLayout.f6861c);
    }

    public void v(d5.f fVar, d5.i iVar, SparseArray<d5.e> sparseArray) {
        iVar.a();
        for (int i11 = 0; i11 < this.f6952b; i11++) {
            iVar.b(sparseArray.get(this.f6951a[i11]));
        }
    }

    public void w() {
        if (this.f6954d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f6927v0 = (d5.e) this.f6954d;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6951a = new int[32];
        this.f6955e = false;
        this.f6958h = null;
        this.f6959i = new HashMap<>();
        this.f6953c = context;
        o(attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f6951a = new int[32];
        this.f6955e = false;
        this.f6958h = null;
        this.f6959i = new HashMap<>();
        this.f6953c = context;
        o(attributeSet);
    }

    public void q(d5.e eVar, boolean z11) {
    }
}

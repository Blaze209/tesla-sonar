package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import st.k;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f41687k = l.F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c> f41688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f41689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<d> f41690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Comparator<MaterialButton> f41691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer[] f41692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f41695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f41696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Set<Integer> f41697j;

    class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.w0(AccessibilityNodeInfoCompat.e.b(0, 1, MaterialButtonToggleGroup.this.j(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final st.c f41700e = new st.a(BitmapDescriptorFactory.HUE_RED);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        st.c f41701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        st.c f41702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        st.c f41703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        st.c f41704d;

        c(st.c cVar, st.c cVar2, st.c cVar3, st.c cVar4) {
            this.f41701a = cVar;
            this.f41702b = cVar3;
            this.f41703c = cVar4;
            this.f41704d = cVar2;
        }

        public static c a(c cVar) {
            st.c cVar2 = f41700e;
            return new c(cVar2, cVar.f41704d, cVar2, cVar.f41703c);
        }

        public static c b(c cVar, View view) {
            return d0.m(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            st.c cVar2 = cVar.f41701a;
            st.c cVar3 = cVar.f41704d;
            st.c cVar4 = f41700e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            st.c cVar2 = f41700e;
            return new c(cVar2, cVar2, cVar.f41702b, cVar.f41703c);
        }

        public static c e(c cVar, View view) {
            return d0.m(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            st.c cVar2 = cVar.f41701a;
            st.c cVar3 = f41700e;
            return new c(cVar2, cVar3, cVar.f41702b, cVar3);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i11, boolean z11);
    }

    private class e implements MaterialButton.b {
        private e() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(@NonNull MaterialButton materialButton, boolean z11) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i11 = firstVisibleChildIndex + 1; i11 < getChildCount(); i11++) {
            MaterialButton materialButtonI = i(i11);
            int iMin = Math.min(materialButtonI.getStrokeWidth(), i(i11 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonI);
            if (getOrientation() == 0) {
                n.c(layoutParamsD, 0);
                n.d(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                n.d(layoutParamsD, 0);
            }
            materialButtonI.setLayoutParams(layoutParamsD);
        }
        o(firstVisibleChildIndex);
    }

    @NonNull
    private LinearLayout.LayoutParams d(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void f(int i11, boolean z11) {
        if (i11 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i11);
            return;
        }
        HashSet hashSet = new HashSet(this.f41697j);
        if (z11 && !hashSet.contains(Integer.valueOf(i11))) {
            if (this.f41694g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i11));
        } else {
            if (z11 || !hashSet.contains(Integer.valueOf(i11))) {
                return;
            }
            if (!this.f41695h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i11));
            }
        }
        r(hashSet);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (l(i11)) {
                return i11;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (l(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof MaterialButton) && l(i12)) {
                i11++;
            }
        }
        return i11;
    }

    private void h(int i11, boolean z11) {
        Iterator<d> it = this.f41690c.iterator();
        while (it.hasNext()) {
            it.next().a(this, i11, z11);
        }
    }

    private MaterialButton i(int i11) {
        return (MaterialButton) getChildAt(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int j(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == view) {
                return i11;
            }
            if ((getChildAt(i12) instanceof MaterialButton) && l(i12)) {
                i11++;
            }
        }
        return -1;
    }

    private c k(int i11, int i12, int i13) {
        c cVar = this.f41688a.get(i11);
        if (i12 == i13) {
            return cVar;
        }
        boolean z11 = getOrientation() == 0;
        if (i11 == i12) {
            return z11 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i11 == i13) {
            return z11 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private boolean l(int i11) {
        return getChildAt(i11).getVisibility() != 8;
    }

    private void o(int i11) {
        if (getChildCount() == 0 || i11 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) i(i11).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            n.c(layoutParams, 0);
            n.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void p(int i11, boolean z11) {
        View viewFindViewById = findViewById(i11);
        if (viewFindViewById instanceof MaterialButton) {
            this.f41693f = true;
            ((MaterialButton) viewFindViewById).setChecked(z11);
            this.f41693f = false;
        }
    }

    private static void q(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(BitmapDescriptorFactory.HUE_RED);
        } else {
            bVar.F(cVar.f41701a).v(cVar.f41704d).K(cVar.f41702b).z(cVar.f41703c);
        }
    }

    private void r(Set<Integer> set) {
        Set<Integer> set2 = this.f41697j;
        this.f41697j = new HashSet(set);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int id2 = i(i11).getId();
            p(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                h(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    private void s() {
        TreeMap treeMap = new TreeMap(this.f41691d);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            treeMap.put(i(i11), Integer.valueOf(i11));
        }
        this.f41692e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.l());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f41689b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void u() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            i(i11).setA11yClassName((this.f41694g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i11, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f41688a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        ViewCompat.p0(materialButton, new b());
    }

    public void b(@NonNull d dVar) {
        this.f41690c.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NonNull Canvas canvas) {
        s();
        super.dispatchDraw(canvas);
    }

    public void e(int i11) {
        f(i11, true);
    }

    public void g() {
        r(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f41694g || this.f41697j.isEmpty()) {
            return -1;
        }
        return this.f41697j.iterator().next().intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int id2 = i(i11).getId();
            if (this.f41697j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        Integer[] numArr = this.f41692e;
        if (numArr != null && i12 < numArr.length) {
            return numArr[i12].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i12;
    }

    public boolean m() {
        return this.f41694g;
    }

    void n(@NonNull MaterialButton materialButton, boolean z11) {
        if (this.f41693f) {
            return;
        }
        f(materialButton.getId(), z11);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f41696i;
        if (i11 != -1) {
            r(Collections.singleton(Integer.valueOf(i11)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.n1(accessibilityNodeInfo).v0(AccessibilityNodeInfoCompat.d.b(1, getVisibleButtonCount(), false, m() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        t();
        c();
        super.onMeasure(i11, i12);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f41688a.remove(iIndexOfChild);
        }
        t();
        c();
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            i(i11).setEnabled(z11);
        }
    }

    public void setSelectionRequired(boolean z11) {
        this.f41695h = z11;
    }

    public void setSingleSelection(boolean z11) {
        if (this.f41694g != z11) {
            this.f41694g = z11;
            g();
        }
        u();
    }

    void t() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i11 = 0; i11 < childCount; i11++) {
            MaterialButton materialButtonI = i(i11);
            if (materialButtonI.getVisibility() != 8) {
                k.b bVarV = materialButtonI.getShapeAppearanceModel().v();
                q(bVarV, k(i11, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonI.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.K);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = f41687k;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.f41688a = new ArrayList();
        this.f41689b = new e(this, null);
        this.f41690c = new LinkedHashSet<>();
        this.f41691d = new a();
        this.f41693f = false;
        this.f41697j = new HashSet();
        TypedArray typedArrayI = a0.i(getContext(), attributeSet, m.f129099x4, i11, i12, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(m.B4, false));
        this.f41696i = typedArrayI.getResourceId(m.f129121z4, -1);
        this.f41695h = typedArrayI.getBoolean(m.A4, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(m.f129110y4, true));
        typedArrayI.recycle();
        ViewCompat.z0(this, 1);
    }

    public void setSingleSelection(int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }
}

package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.o0;
import androidx.core.view.ViewCompat;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final o0 f42790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AccessibilityManager f42791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final Rect f42792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f42793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f42794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ColorStateList f42795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f42797k;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.k(i11 < 0 ? materialAutoCompleteTextView.f42790d.u() : materialAutoCompleteTextView.getAdapter().getItem(i11));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i11 < 0) {
                    view = MaterialAutoCompleteTextView.this.f42790d.x();
                    i11 = MaterialAutoCompleteTextView.this.f42790d.w();
                    j11 = MaterialAutoCompleteTextView.this.f42790d.v();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f42790d.j(), view, i11, j11);
            }
            MaterialAutoCompleteTextView.this.f42790d.dismiss();
        }
    }

    private class b<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ColorStateList f42799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ColorStateList f42800b;

        b(Context context, @NonNull int i11, String[] strArr) {
            super(context, i11, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = MaterialAutoCompleteTextView.this.f42797k.getColorForState(iArr2, 0);
            int colorForState2 = MaterialAutoCompleteTextView.this.f42797k.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{ht.a.i(MaterialAutoCompleteTextView.this.f42796j, colorForState), ht.a.i(MaterialAutoCompleteTextView.this.f42796j, colorForState2), MaterialAutoCompleteTextView.this.f42796j});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f42796j);
            if (this.f42800b == null) {
                return colorDrawable;
            }
            l5.a.o(colorDrawable, this.f42799a);
            return new RippleDrawable(this.f42800b, colorDrawable, null);
        }

        private boolean c() {
            return MaterialAutoCompleteTextView.this.f42796j != 0;
        }

        private boolean d() {
            return MaterialAutoCompleteTextView.this.f42797k != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f42797k.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f42800b = e();
            this.f42799a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i11, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                ViewCompat.t0(textView, MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context) {
        this(context, null);
    }

    private TextInputLayout e() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean f() {
        return h() || g();
    }

    private boolean g() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f42791e;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f42791e.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean h() {
        AccessibilityManager accessibilityManager = this.f42791e;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int i() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutE = e();
        int i11 = 0;
        if (adapter == null || textInputLayoutE == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f42790d.w()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutE);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableD = this.f42790d.d();
        if (drawableD != null) {
            drawableD.getPadding(this.f42792f);
            Rect rect = this.f42792f;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutE.getEndIconView().getMeasuredWidth();
    }

    private void j() {
        TextInputLayout textInputLayoutE = e();
        if (textInputLayoutE != null) {
            textInputLayoutE.q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void k(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (f()) {
            this.f42790d.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f42795i;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutE = e();
        return (textInputLayoutE == null || !textInputLayoutE.S()) ? super.getHint() : textInputLayoutE.getHint();
    }

    public float getPopupElevation() {
        return this.f42794h;
    }

    public int getSimpleItemSelectedColor() {
        return this.f42796j;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f42797k;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutE = e();
        if (textInputLayoutE != null && textInputLayoutE.S() && super.getHint() == null && com.google.android.material.internal.k.d()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42790d.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), i()), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z11) {
        if (f()) {
            return;
        }
        super.onWindowFocusChanged(z11);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t11) {
        super.setAdapter(t11);
        this.f42790d.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        o0 o0Var = this.f42790d;
        if (o0Var != null) {
            o0Var.b(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i11) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i11));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f42795i = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof st.g) {
            ((st.g) dropDownBackground).b0(this.f42795i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f42790d.L(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i11) {
        super.setRawInputType(i11);
        j();
    }

    public void setSimpleItemSelectedColor(int i11) {
        this.f42796j = i11;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f42797k = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i11) {
        setSimpleItems(getResources().getStringArray(i11));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (f()) {
            this.f42790d.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.f128557b);
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new b(getContext(), this.f42793g, strArr));
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(wt.a.c(context, attributeSet, i11, 0), attributeSet, i11);
        this.f42792f = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.a0.i(context2, attributeSet, zs.m.U3, i11, zs.l.f128801j, new int[0]);
        if (typedArrayI.hasValue(zs.m.V3) && typedArrayI.getInt(zs.m.V3, 0) == 0) {
            setKeyListener(null);
        }
        this.f42793g = typedArrayI.getResourceId(zs.m.Y3, zs.i.f128753o);
        this.f42794h = typedArrayI.getDimensionPixelOffset(zs.m.W3, zs.e.f128655s0);
        if (typedArrayI.hasValue(zs.m.X3)) {
            this.f42795i = ColorStateList.valueOf(typedArrayI.getColor(zs.m.X3, 0));
        }
        this.f42796j = typedArrayI.getColor(zs.m.Z3, 0);
        this.f42797k = pt.c.a(context2, typedArrayI, zs.m.f128823a4);
        this.f42791e = (AccessibilityManager) context2.getSystemService("accessibility");
        o0 o0Var = new o0(context2);
        this.f42790d = o0Var;
        o0Var.I(true);
        o0Var.C(this);
        o0Var.H(2);
        o0Var.o(getAdapter());
        o0Var.K(new a());
        if (typedArrayI.hasValue(zs.m.f128835b4)) {
            setSimpleItems(typedArrayI.getResourceId(zs.m.f128835b4, 0));
        }
        typedArrayI.recycle();
    }
}

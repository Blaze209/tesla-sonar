package com.reactnativecommunity.picker;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.v;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

/* JADX INFO: loaded from: classes6.dex */
public class h extends v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f48508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f48509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f48510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f48511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f48512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f48513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f48514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f48515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f48516r;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
            if (h.this.f48510l != null) {
                h.this.f48510l.a(i11);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (h.this.f48510l != null) {
                h.this.f48510l.a(-1);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.measure(View.MeasureSpec.makeMeasureSpec(hVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(h.this.getHeight(), 1073741824));
            h hVar2 = h.this;
            hVar2.layout(hVar2.getLeft(), h.this.getTop(), h.this.getRight(), h.this.getBottom());
        }
    }

    public interface c {
        void b();

        void c();
    }

    public interface d {
        void a(int i11);
    }

    public h(Context context) {
        super(context);
        this.f48508j = 0;
        this.f48513o = Integer.MIN_VALUE;
        this.f48514p = false;
        this.f48515q = new a();
        this.f48516r = new b();
        d(context);
        e();
    }

    private void d(Context context) {
        if (com.facebook.react.modules.i18nmanager.a.f().i(context)) {
            setLayoutDirection(1);
            setTextDirection(4);
        } else {
            setLayoutDirection(0);
            setTextDirection(3);
        }
    }

    private void e() {
        setBackgroundResource(com.reactnativecommunity.picker.d.f48503a);
        setBackgroundColor(0);
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    private void setSelectionWithSuppressEvent(int i11) {
        if (i11 != getSelectedItemPosition()) {
            setOnItemSelectedListener(null);
            setSelection(i11, false);
            setOnItemSelectedListener(this.f48515q);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        super.setFocusableInTouchMode(true);
        super.setFocusable(true);
        super.onDetachedFromWindow();
    }

    public void f() {
        Integer num = this.f48512n;
        if (num != null) {
            setSelectionWithSuppressEvent(num.intValue());
            this.f48512n = null;
        }
    }

    public int getMode() {
        return this.f48508j;
    }

    public c getOnFocusListener() {
        return this.f48511m;
    }

    public d getOnSelectListener() {
        return this.f48510l;
    }

    public Integer getPrimaryColor() {
        return this.f48509k;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (getOnItemSelectedListener() == null) {
            setOnItemSelectedListener(this.f48515q);
        }
    }

    @Override // androidx.appcompat.widget.v, android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i11, int i12) {
        int iApplyDimension;
        super.onMeasure(i11, i12);
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition < 0 || getAdapter() == null || selectedItemPosition >= getAdapter().getCount()) {
            iApplyDimension = (int) TypedValue.applyDimension(1, 50.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            View view = getAdapter().getView(selectedItemPosition, null, this);
            measureChild(view, View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            iApplyDimension = view.getMeasuredHeight();
        }
        if (iApplyDimension != this.f48513o) {
            UIManagerModule uIManagerModule = (UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), new i(iApplyDimension));
            }
            this.f48513o = iApplyDimension;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z11) {
        if (this.f48514p && z11) {
            this.f48514p = false;
            c cVar = this.f48511m;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    @Override // androidx.appcompat.widget.v, android.widget.Spinner, android.view.View
    public boolean performClick() {
        this.f48514p = true;
        c cVar = this.f48511m;
        if (cVar != null) {
            cVar.c();
        }
        return super.performClick();
    }

    @Override // android.widget.AbsSpinner, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f48516r);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        ((GradientDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(e.f48504a)).setColor(i11);
    }

    public void setDropdownIconColor(int i11) {
        ((RippleDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(e.f48505b)).setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
    }

    public void setDropdownIconRippleColor(int i11) {
        ((RippleDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(e.f48505b)).setColor(ColorStateList.valueOf(i11));
    }

    public void setOnFocusListener(c cVar) {
        this.f48511m = cVar;
    }

    public void setOnSelectListener(d dVar) {
        this.f48510l = dVar;
    }

    public void setPrimaryColor(Integer num) {
        this.f48509k = num;
    }

    public void setStagedSelection(int i11) {
        this.f48512n = Integer.valueOf(i11);
    }

    public h(Context context, int i11) {
        super(context, i11);
        this.f48508j = 0;
        this.f48513o = Integer.MIN_VALUE;
        this.f48514p = false;
        this.f48515q = new a();
        this.f48516r = new b();
        this.f48508j = i11;
        d(context);
        e();
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48508j = 0;
        this.f48513o = Integer.MIN_VALUE;
        this.f48514p = false;
        this.f48515q = new a();
        this.f48516r = new b();
        d(context);
        e();
    }

    public h(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f48508j = 0;
        this.f48513o = Integer.MIN_VALUE;
        this.f48514p = false;
        this.f48515q = new a();
        this.f48516r = new b();
        d(context);
        e();
    }
}

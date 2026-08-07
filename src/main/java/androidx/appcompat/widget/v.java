package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class v extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f2848i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.widget.d f2849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f2850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m0 f2851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f2852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f2853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f2854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f2855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f2856h;

    class a extends m0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ e f2857j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f2857j = eVar;
        }

        @Override // androidx.appcompat.widget.m0
        public o.e b() {
            return this.f2857j;
        }

        @Override // androidx.appcompat.widget.m0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (v.this.getInternalPopup().a()) {
                return true;
            }
            v.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!v.this.getInternalPopup().a()) {
                v.this.b();
            }
            ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    class c implements g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.b f2860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f2861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f2862c;

        c() {
        }

        @Override // androidx.appcompat.widget.v.g
        public boolean a() {
            androidx.appcompat.app.b bVar = this.f2860a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.v.g
        public void b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public Drawable d() {
            return null;
        }

        @Override // androidx.appcompat.widget.v.g
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f2860a;
            if (bVar != null) {
                bVar.dismiss();
                this.f2860a = null;
            }
        }

        @Override // androidx.appcompat.widget.v.g
        public void e(int i11) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void f(int i11) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void g(int i11, int i12) {
            if (this.f2861b == null) {
                return;
            }
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(v.this.getPopupContext());
            CharSequence charSequence = this.f2862c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.b bVarCreate = aVar.l(this.f2861b, v.this.getSelectedItemPosition(), this).create();
            this.f2860a = bVarCreate;
            ListView listViewF = bVarCreate.f();
            listViewF.setTextDirection(i11);
            listViewF.setTextAlignment(i12);
            this.f2860a.show();
        }

        @Override // androidx.appcompat.widget.v.g
        public int h() {
            return 0;
        }

        @Override // androidx.appcompat.widget.v.g
        public int k() {
            return 0;
        }

        @Override // androidx.appcompat.widget.v.g
        public void l(int i11) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public CharSequence m() {
            return this.f2862c;
        }

        @Override // androidx.appcompat.widget.v.g
        public void n(CharSequence charSequence) {
            this.f2862c = charSequence;
        }

        @Override // androidx.appcompat.widget.v.g
        public void o(ListAdapter listAdapter) {
            this.f2861b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            v.this.setSelection(i11);
            if (v.this.getOnItemClickListener() != null) {
                v.this.performItemClick(null, i11, this.f2861b.getItemId(i11));
            }
            dismiss();
        }
    }

    private static class d implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f2864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f2865b;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2864a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2865b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof x0) {
                    x0 x0Var = (x0) spinnerAdapter;
                    if (x0Var.getDropDownViewTheme() == null) {
                        x0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2865b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2864a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2864a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i11, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i11) {
            SpinnerAdapter spinnerAdapter = this.f2864a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i11);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            SpinnerAdapter spinnerAdapter = this.f2864a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i11);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i11) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            return getDropDownView(i11, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2864a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i11) {
            ListAdapter listAdapter = this.f2865b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i11);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2864a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2864a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class e extends o0 implements g {
        private CharSequence I;
        ListAdapter J;
        private final Rect K;
        private int L;

        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ v f2866a;

            a(v vVar) {
                this.f2866a = vVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
                v.this.setSelection(i11);
                if (v.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    v.this.performItemClick(view, i11, eVar.J.getItemId(i11));
                }
                e.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.U(v.this)) {
                    e.this.dismiss();
                } else {
                    e.this.S();
                    e.super.show();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2869a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f2869a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2869a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            this.K = new Rect();
            C(v.this);
            I(true);
            O(0);
            K(new a(v.this));
        }

        void S() {
            int i11;
            Drawable drawableD = d();
            if (drawableD != null) {
                drawableD.getPadding(v.this.f2856h);
                i11 = h1.b(v.this) ? v.this.f2856h.right : -v.this.f2856h.left;
            } else {
                Rect rect = v.this.f2856h;
                rect.right = 0;
                rect.left = 0;
                i11 = 0;
            }
            int paddingLeft = v.this.getPaddingLeft();
            int paddingRight = v.this.getPaddingRight();
            int width = v.this.getWidth();
            v vVar = v.this;
            int i12 = vVar.f2855g;
            if (i12 == -2) {
                int iA = vVar.a((SpinnerAdapter) this.J, d());
                int i13 = v.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = v.this.f2856h;
                int i14 = (i13 - rect2.left) - rect2.right;
                if (iA > i14) {
                    iA = i14;
                }
                E(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i12 == -1) {
                E((width - paddingLeft) - paddingRight);
            } else {
                E(i12);
            }
            l(h1.b(v.this) ? i11 + (((width - paddingRight) - y()) - T()) : i11 + paddingLeft + T());
        }

        public int T() {
            return this.L;
        }

        boolean U(View view) {
            return ViewCompat.S(view) && view.getGlobalVisibleRect(this.K);
        }

        @Override // androidx.appcompat.widget.v.g
        public void f(int i11) {
            this.L = i11;
        }

        @Override // androidx.appcompat.widget.v.g
        public void g(int i11, int i12) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            S();
            H(2);
            super.show();
            ListView listViewJ = j();
            listViewJ.setChoiceMode(1);
            listViewJ.setTextDirection(i11);
            listViewJ.setTextAlignment(i12);
            P(v.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = v.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            J(new c(bVar));
        }

        @Override // androidx.appcompat.widget.v.g
        public CharSequence m() {
            return this.I;
        }

        @Override // androidx.appcompat.widget.v.g
        public void n(CharSequence charSequence) {
            this.I = charSequence;
        }

        @Override // androidx.appcompat.widget.o0, androidx.appcompat.widget.v.g
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.J = listAdapter;
        }
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f2871a;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i11) {
                return new f[i11];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeByte(this.f2871a ? (byte) 1 : (byte) 0);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f2871a = parcel.readByte() != 0;
        }
    }

    interface g {
        boolean a();

        void b(Drawable drawable);

        Drawable d();

        void dismiss();

        void e(int i11);

        void f(int i11);

        void g(int i11, int i12);

        int h();

        int k();

        void l(int i11);

        CharSequence m();

        void n(CharSequence charSequence);

        void o(ListAdapter listAdapter);
    }

    public v(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i11 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f2856h);
        Rect rect = this.f2856h;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f2854f.g(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.d dVar = this.f2849a;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f2854f;
        return gVar != null ? gVar.k() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f2854f;
        return gVar != null ? gVar.h() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2854f != null ? this.f2855g : super.getDropDownWidth();
    }

    final g getInternalPopup() {
        return this.f2854f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f2854f;
        return gVar != null ? gVar.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2850b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f2854f;
        return gVar != null ? gVar.m() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.d dVar = this.f2849a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.d dVar = this.f2849a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f2854f;
        if (gVar == null || !gVar.a()) {
            return;
        }
        this.f2854f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f2854f == null || View.MeasureSpec.getMode(i11) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f2871a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f2854f;
        fVar.f2871a = gVar != null && gVar.a();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m0 m0Var = this.f2851c;
        if (m0Var == null || !m0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f2854f;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.d dVar = this.f2849a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        androidx.appcompat.widget.d dVar = this.f2849a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i11) {
        g gVar = this.f2854f;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i11);
        } else {
            gVar.f(i11);
            this.f2854f.l(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i11) {
        g gVar = this.f2854f;
        if (gVar != null) {
            gVar.e(i11);
        } else {
            super.setDropDownVerticalOffset(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i11) {
        if (this.f2854f != null) {
            this.f2855g = i11;
        } else {
            super.setDropDownWidth(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f2854f;
        if (gVar != null) {
            gVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i11) {
        setPopupBackgroundDrawable(j.a.b(getPopupContext(), i11));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f2854f;
        if (gVar != null) {
            gVar.n(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.d dVar = this.f2849a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.d dVar = this.f2849a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public v(@NonNull Context context, int i11) {
        this(context, null, i.a.N, i11);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2853e) {
            this.f2852d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2854f != null) {
            Context context = this.f2850b;
            if (context == null) {
                context = getContext();
            }
            this.f2854f.o(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public v(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.N);
    }

    public v(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, -1);
    }

    public v(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, attributeSet, i11, i12, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.v] */
    public v(@NonNull Context context, AttributeSet attributeSet, int i11, int i12, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrQ;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i11);
        this.f2856h = new Rect();
        w0.a(this, getContext());
        b1 b1VarV = b1.v(context, attributeSet, i.j.I2, i11, 0);
        this.f2849a = new androidx.appcompat.widget.d(this);
        if (theme != null) {
            this.f2850b = new n.c(context, theme);
        } else {
            int iN = b1VarV.n(i.j.N2, 0);
            if (iN != 0) {
                this.f2850b = new n.c(context, iN);
            } else {
                this.f2850b = context;
            }
        }
        ?? r11 = -1;
        ?? r12 = 0;
        try {
            if (i12 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2848i, i11, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r11 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r11 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r11 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i12 != 0) {
                            c cVar = new c();
                            this.f2854f = cVar;
                            cVar.n(b1VarV.o(i.j.L2));
                        } else if (i12 == 1) {
                            e eVar = new e(this.f2850b, attributeSet, i11);
                            b1 b1VarV2 = b1.v(this.f2850b, attributeSet, i.j.I2, i11, 0);
                            this.f2855g = b1VarV2.m(i.j.M2, -2);
                            eVar.b(b1VarV2.g(i.j.K2));
                            eVar.n(b1VarV.o(i.j.L2));
                            b1VarV2.w();
                            this.f2854f = eVar;
                            this.f2851c = new a(this, eVar);
                        }
                        charSequenceArrQ = b1VarV.q(i.j.J2);
                        if (charSequenceArrQ != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                            arrayAdapter.setDropDownViewResource(i.g.f73845t);
                            setAdapter(arrayAdapter);
                        }
                        b1VarV.w();
                        this.f2853e = true;
                        spinnerAdapter = this.f2852d;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f2852d = null;
                        }
                        this.f2849a.e(attributeSet, i11);
                    }
                } catch (Exception e12) {
                    e = e12;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r12 != 0) {
                        r12.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i12 != 0) {
                c cVar2 = new c();
                this.f2854f = cVar2;
                cVar2.n(b1VarV.o(i.j.L2));
            } else if (i12 == 1) {
                e eVar2 = new e(this.f2850b, attributeSet, i11);
                b1 b1VarV3 = b1.v(this.f2850b, attributeSet, i.j.I2, i11, 0);
                this.f2855g = b1VarV3.m(i.j.M2, -2);
                eVar2.b(b1VarV3.g(i.j.K2));
                eVar2.n(b1VarV.o(i.j.L2));
                b1VarV3.w();
                this.f2854f = eVar2;
                this.f2851c = new a(this, eVar2);
            }
            charSequenceArrQ = b1VarV.q(i.j.J2);
            if (charSequenceArrQ != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                arrayAdapter2.setDropDownViewResource(i.g.f73845t);
                setAdapter(arrayAdapter2);
            }
            b1VarV.w();
            this.f2853e = true;
            spinnerAdapter = this.f2852d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f2852d = null;
            }
            this.f2849a.e(attributeSet, i11);
        } catch (Throwable th3) {
            th = th3;
            r12 = r11;
        }
    }
}

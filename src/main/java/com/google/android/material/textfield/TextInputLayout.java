package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.j0;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.d0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int C0 = zs.l.f128807p;
    private static final int[][] D0 = {new int[]{R.attr.state_pressed}, new int[0]};
    private ColorStateList A;
    private boolean A0;
    private ColorStateList B;
    private boolean B0;
    private boolean C;
    private CharSequence D;
    private boolean E;
    private st.g F;
    private st.g G;
    private StateListDrawable H;
    private boolean I;
    private st.g J;
    private st.g K;

    @NonNull
    private st.k L;
    private boolean M;
    private final int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private final Rect V;
    private final Rect W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f42804a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final RectF f42805a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final y f42806b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Typeface f42807b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final r f42808c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Drawable f42809c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    EditText f42810d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f42811d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f42812e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final LinkedHashSet<f> f42813e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42814f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Drawable f42815f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42816g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f42817g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f42818h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Drawable f42819h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42820i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private ColorStateList f42821i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u f42822j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private ColorStateList f42823j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f42824k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f42825k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f42826l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f42827l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f42828m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f42829m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    private e f42830n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private ColorStateList f42831n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f42832o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f42833o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f42834p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f42835p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f42836q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f42837q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f42838r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f42839r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f42840s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f42841s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f42842t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    int f42843t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ColorStateList f42844u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f42845u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f42846v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    final com.google.android.material.internal.b f42847v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private androidx.transition.e f42848w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f42849w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private androidx.transition.e f42850x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f42851x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ColorStateList f42852y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private ValueAnimator f42853y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ColorStateList f42854z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f42855z0;

    class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f42856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f42857b;

        a(EditText editText) {
            this.f42857b = editText;
            this.f42856a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.t0(!textInputLayout.A0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f42824k) {
                textInputLayout2.j0(editable);
            }
            if (TextInputLayout.this.f42840s) {
                TextInputLayout.this.x0(editable);
            }
            int lineCount = this.f42857b.getLineCount();
            int i11 = this.f42856a;
            if (lineCount != i11) {
                if (lineCount < i11) {
                    int iB = ViewCompat.B(this.f42857b);
                    int i12 = TextInputLayout.this.f42843t0;
                    if (iB != i12) {
                        this.f42857b.setMinimumHeight(i12);
                    }
                }
                this.f42856a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f42808c.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f42847v0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends androidx.core.view.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TextInputLayout f42861d;

        public d(@NonNull TextInputLayout textInputLayout) {
            this.f42861d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            EditText editText = this.f42861d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f42861d.getHint();
            CharSequence error = this.f42861d.getError();
            CharSequence placeholderText = this.f42861d.getPlaceholderText();
            int counterMaxLength = this.f42861d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f42861d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zQ = this.f42861d.Q();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z11 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f42861d.f42806b.A(accessibilityNodeInfoCompat);
            if (!zIsEmpty) {
                accessibilityNodeInfoCompat.d1(text);
            } else if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfoCompat.d1(string);
                if (!zQ && placeholderText != null) {
                    accessibilityNodeInfoCompat.d1(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.d1(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.H0(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    accessibilityNodeInfoCompat.d1(string);
                }
                accessibilityNodeInfoCompat.Z0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.N0(counterMaxLength);
            if (z11) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.C0(error);
            }
            View viewT = this.f42861d.f42822j.t();
            if (viewT != null) {
                accessibilityNodeInfoCompat.J0(viewT);
            }
            this.f42861d.f42808c.m().o(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.a
        public void h(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f42861d.f42808c.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(@NonNull TextInputLayout textInputLayout);
    }

    public interface g {
        void a(@NonNull TextInputLayout textInputLayout, int i11);
    }

    static class h extends r6.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f42862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f42863d;

        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(@NonNull Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i11) {
                return new h[i11];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f42862c) + "}";
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            TextUtils.writeToParcel(this.f42862c, parcel, i11);
            parcel.writeInt(this.f42863d ? 1 : 0);
        }

        h(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f42862c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f42863d = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }

    private androidx.transition.e A() {
        androidx.transition.e eVar = new androidx.transition.e();
        eVar.l0(nt.i.f(getContext(), zs.c.f128560c0, 87));
        eVar.n0(nt.i.g(getContext(), zs.c.f128572i0, at.b.f14972a));
        return eVar;
    }

    private boolean B() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof com.google.android.material.textfield.h);
    }

    private void C() {
        Iterator<f> it = this.f42813e0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void D(Canvas canvas) {
        st.g gVar;
        if (this.K == null || (gVar = this.J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f42810d.isFocused()) {
            Rect bounds = this.K.getBounds();
            Rect bounds2 = this.J.getBounds();
            float fX = this.f42847v0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = at.b.c(iCenterX, bounds2.left, fX);
            bounds.right = at.b.c(iCenterX, bounds2.right, fX);
            this.K.draw(canvas);
        }
    }

    private void E(@NonNull Canvas canvas) {
        if (this.C) {
            this.f42847v0.l(canvas);
        }
    }

    private void F(boolean z11) {
        ValueAnimator valueAnimator = this.f42853y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f42853y0.cancel();
        }
        if (z11 && this.f42851x0) {
            l(BitmapDescriptorFactory.HUE_RED);
        } else {
            this.f42847v0.c0(BitmapDescriptorFactory.HUE_RED);
        }
        if (B() && ((com.google.android.material.textfield.h) this.F).t0()) {
            y();
        }
        this.f42845u0 = true;
        L();
        this.f42806b.l(true);
        this.f42808c.H(true);
    }

    private st.g G(boolean z11) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(zs.e.B0);
        float f11 = z11 ? dimensionPixelOffset : BitmapDescriptorFactory.HUE_RED;
        EditText editText = this.f42810d;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(zs.e.E);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(zs.e.f128657t0);
        st.k kVarM = st.k.a().E(f11).J(f11).u(dimensionPixelOffset).y(dimensionPixelOffset).m();
        EditText editText2 = this.f42810d;
        st.g gVarM = st.g.m(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        gVarM.setShapeAppearanceModel(kVarM);
        gVarM.d0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return gVarM;
    }

    private static Drawable H(st.g gVar, int i11, int i12, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{ht.a.j(i12, i11, 0.1f), i11}), gVar, gVar);
    }

    private int I(int i11, boolean z11) {
        int compoundPaddingLeft;
        if (z11 || getPrefixText() == null) {
            compoundPaddingLeft = (!z11 || getSuffixText() == null) ? this.f42810d.getCompoundPaddingLeft() : this.f42808c.y();
        } else {
            compoundPaddingLeft = this.f42806b.c();
        }
        return i11 + compoundPaddingLeft;
    }

    private int J(int i11, boolean z11) {
        int compoundPaddingRight;
        if (z11 || getSuffixText() == null) {
            compoundPaddingRight = (!z11 || getPrefixText() == null) ? this.f42810d.getCompoundPaddingRight() : this.f42806b.c();
        } else {
            compoundPaddingRight = this.f42808c.y();
        }
        return i11 - compoundPaddingRight;
    }

    private static Drawable K(Context context, st.g gVar, int i11, int[][] iArr) {
        int iC = ht.a.c(context, zs.c.f128599w, "TextInputLayout");
        st.g gVar2 = new st.g(gVar.E());
        int iJ = ht.a.j(i11, iC, 0.1f);
        gVar2.b0(new ColorStateList(iArr, new int[]{iJ, 0}));
        gVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        st.g gVar3 = new st.g(gVar.E());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    private void L() {
        TextView textView = this.f42842t;
        if (textView == null || !this.f42840s) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.z.a(this.f42804a, this.f42850x);
        this.f42842t.setVisibility(4);
    }

    private boolean R() {
        if (c0()) {
            return true;
        }
        return this.f42832o != null && this.f42828m;
    }

    private boolean T() {
        return this.O == 1 && this.f42810d.getMinLines() <= 1;
    }

    private void U() {
        p();
        q0();
        z0();
        g0();
        k();
        if (this.O != 0) {
            s0();
        }
        a0();
    }

    private void V() {
        if (B()) {
            RectF rectF = this.f42805a0;
            this.f42847v0.o(rectF, this.f42810d.getWidth(), this.f42810d.getGravity());
            if (rectF.width() <= BitmapDescriptorFactory.HUE_RED || rectF.height() <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.Q);
            ((com.google.android.material.textfield.h) this.F).w0(rectF);
        }
    }

    private void W() {
        if (!B() || this.f42845u0) {
            return;
        }
        y();
        V();
    }

    private static void X(@NonNull ViewGroup viewGroup, boolean z11) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            childAt.setEnabled(z11);
            if (childAt instanceof ViewGroup) {
                X((ViewGroup) childAt, z11);
            }
        }
    }

    private void Z() {
        TextView textView = this.f42842t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void a0() {
        EditText editText = this.f42810d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.O;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private boolean d0() {
        return (this.f42808c.G() || ((this.f42808c.A() && M()) || this.f42808c.w() != null)) && this.f42808c.getMeasuredWidth() > 0;
    }

    private boolean e0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f42806b.getMeasuredWidth() > 0;
    }

    private void f0() {
        if (this.f42842t == null || !this.f42840s || TextUtils.isEmpty(this.f42838r)) {
            return;
        }
        this.f42842t.setText(this.f42838r);
        androidx.transition.z.a(this.f42804a, this.f42848w);
        this.f42842t.setVisibility(0);
        this.f42842t.bringToFront();
        announceForAccessibility(this.f42838r);
    }

    private void g0() {
        if (this.O == 1) {
            if (pt.c.k(getContext())) {
                this.P = getResources().getDimensionPixelSize(zs.e.V);
            } else if (pt.c.j(getContext())) {
                this.P = getResources().getDimensionPixelSize(zs.e.U);
            }
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f42810d;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.F;
        }
        int iD = ht.a.d(this.f42810d, zs.c.f128579m);
        int i11 = this.O;
        if (i11 == 2) {
            return K(getContext(), this.F, iD, D0);
        }
        if (i11 == 1) {
            return H(this.F, this.U, iD, D0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.H.addState(new int[0], G(false));
        }
        return this.H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.G == null) {
            this.G = G(true);
        }
        return this.G;
    }

    private void h0(@NonNull Rect rect) {
        st.g gVar = this.J;
        if (gVar != null) {
            int i11 = rect.bottom;
            gVar.setBounds(rect.left, i11 - this.R, rect.right, i11);
        }
        st.g gVar2 = this.K;
        if (gVar2 != null) {
            int i12 = rect.bottom;
            gVar2.setBounds(rect.left, i12 - this.S, rect.right, i12);
        }
    }

    private void i0() {
        if (this.f42832o != null) {
            EditText editText = this.f42810d;
            j0(editText == null ? null : editText.getText());
        }
    }

    private void j() {
        TextView textView = this.f42842t;
        if (textView != null) {
            this.f42804a.addView(textView);
            this.f42842t.setVisibility(0);
        }
    }

    private void k() {
        if (this.f42810d == null || this.O != 1) {
            return;
        }
        if (pt.c.k(getContext())) {
            EditText editText = this.f42810d;
            ViewCompat.F0(editText, ViewCompat.F(editText), getResources().getDimensionPixelSize(zs.e.T), ViewCompat.E(this.f42810d), getResources().getDimensionPixelSize(zs.e.S));
        } else if (pt.c.j(getContext())) {
            EditText editText2 = this.f42810d;
            ViewCompat.F0(editText2, ViewCompat.F(editText2), getResources().getDimensionPixelSize(zs.e.R), ViewCompat.E(this.f42810d), getResources().getDimensionPixelSize(zs.e.Q));
        }
    }

    private static void k0(@NonNull Context context, @NonNull TextView textView, int i11, int i12, boolean z11) {
        textView.setContentDescription(context.getString(z11 ? zs.k.f128768c : zs.k.f128767b, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    private void l0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f42832o;
        if (textView != null) {
            b0(textView, this.f42828m ? this.f42834p : this.f42836q);
            if (!this.f42828m && (colorStateList2 = this.f42852y) != null) {
                this.f42832o.setTextColor(colorStateList2);
            }
            if (!this.f42828m || (colorStateList = this.f42854z) == null) {
                return;
            }
            this.f42832o.setTextColor(colorStateList);
        }
    }

    private void m() {
        st.g gVar = this.F;
        if (gVar == null) {
            return;
        }
        st.k kVarE = gVar.E();
        st.k kVar = this.L;
        if (kVarE != kVar) {
            this.F.setShapeAppearanceModel(kVar);
        }
        if (w()) {
            this.F.j0(this.Q, this.T);
        }
        int iQ = q();
        this.U = iQ;
        this.F.b0(ColorStateList.valueOf(iQ));
        n();
        q0();
    }

    private void m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.A;
        if (colorStateListG == null) {
            colorStateListG = ht.a.g(getContext(), zs.c.f128577l);
        }
        EditText editText = this.f42810d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = l5.a.r(this.f42810d.getTextCursorDrawable()).mutate();
        if (R() && (colorStateList = this.B) != null) {
            colorStateListG = colorStateList;
        }
        l5.a.o(drawableMutate, colorStateListG);
    }

    private void n() {
        if (this.J == null || this.K == null) {
            return;
        }
        if (x()) {
            this.J.b0(this.f42810d.isFocused() ? ColorStateList.valueOf(this.f42825k0) : ColorStateList.valueOf(this.T));
            this.K.b0(ColorStateList.valueOf(this.T));
        }
        invalidate();
    }

    private void o(@NonNull RectF rectF) {
        float f11 = rectF.left;
        int i11 = this.N;
        rectF.left = f11 - i11;
        rectF.right += i11;
    }

    private void p() {
        int i11 = this.O;
        if (i11 == 0) {
            this.F = null;
            this.J = null;
            this.K = null;
            return;
        }
        if (i11 == 1) {
            this.F = new st.g(this.L);
            this.J = new st.g();
            this.K = new st.g();
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException(this.O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.C || (this.F instanceof com.google.android.material.textfield.h)) {
                this.F = new st.g(this.L);
            } else {
                this.F = com.google.android.material.textfield.h.s0(this.L);
            }
            this.J = null;
            this.K = null;
        }
    }

    private void p0() {
        ViewCompat.t0(this.f42810d, getEditTextBoxBackground());
    }

    private int q() {
        return this.O == 1 ? ht.a.i(ht.a.e(this, zs.c.f128599w, 0), this.U) : this.U;
    }

    @NonNull
    private Rect r(@NonNull Rect rect) {
        if (this.f42810d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.W;
        boolean zM = d0.m(this);
        rect2.bottom = rect.bottom;
        int i11 = this.O;
        if (i11 == 1) {
            rect2.left = I(rect.left, zM);
            rect2.top = rect.top + this.P;
            rect2.right = J(rect.right, zM);
            return rect2;
        }
        if (i11 != 2) {
            rect2.left = I(rect.left, zM);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, zM);
            return rect2;
        }
        rect2.left = rect.left + this.f42810d.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f42810d.getPaddingRight();
        return rect2;
    }

    private boolean r0() {
        int iMax;
        if (this.f42810d == null || this.f42810d.getMeasuredHeight() >= (iMax = Math.max(this.f42808c.getMeasuredHeight(), this.f42806b.getMeasuredHeight()))) {
            return false;
        }
        this.f42810d.setMinimumHeight(iMax);
        return true;
    }

    private int s(@NonNull Rect rect, @NonNull Rect rect2, float f11) {
        return T() ? (int) (rect2.top + f11) : rect.bottom - this.f42810d.getCompoundPaddingBottom();
    }

    private void s0() {
        if (this.O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f42804a.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f42804a.requestLayout();
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f42810d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f42810d = editText;
        int i11 = this.f42814f;
        if (i11 != -1) {
            setMinEms(i11);
        } else {
            setMinWidth(this.f42818h);
        }
        int i12 = this.f42816g;
        if (i12 != -1) {
            setMaxEms(i12);
        } else {
            setMaxWidth(this.f42820i);
        }
        this.I = false;
        U();
        setTextInputAccessibilityDelegate(new d(this));
        this.f42847v0.i0(this.f42810d.getTypeface());
        this.f42847v0.a0(this.f42810d.getTextSize());
        int i13 = Build.VERSION.SDK_INT;
        this.f42847v0.X(this.f42810d.getLetterSpacing());
        int gravity = this.f42810d.getGravity();
        this.f42847v0.S((gravity & (-113)) | 48);
        this.f42847v0.Z(gravity);
        this.f42843t0 = ViewCompat.B(editText);
        this.f42810d.addTextChangedListener(new a(editText));
        if (this.f42821i0 == null) {
            this.f42821i0 = this.f42810d.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.f42810d.getHint();
                this.f42812e = hint;
                setHint(hint);
                this.f42810d.setHint((CharSequence) null);
            }
            this.E = true;
        }
        if (i13 >= 29) {
            m0();
        }
        if (this.f42832o != null) {
            j0(this.f42810d.getText());
        }
        o0();
        this.f42822j.f();
        this.f42806b.bringToFront();
        this.f42808c.bringToFront();
        C();
        this.f42808c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.D)) {
            return;
        }
        this.D = charSequence;
        this.f42847v0.g0(charSequence);
        if (this.f42845u0) {
            return;
        }
        V();
    }

    private void setPlaceholderTextEnabled(boolean z11) {
        if (this.f42840s == z11) {
            return;
        }
        if (z11) {
            j();
        } else {
            Z();
            this.f42842t = null;
        }
        this.f42840s = z11;
    }

    private int t(@NonNull Rect rect, float f11) {
        return T() ? (int) (rect.centerY() - (f11 / 2.0f)) : rect.top + this.f42810d.getCompoundPaddingTop();
    }

    @NonNull
    private Rect u(@NonNull Rect rect) {
        if (this.f42810d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.W;
        float fW = this.f42847v0.w();
        rect2.left = rect.left + this.f42810d.getCompoundPaddingLeft();
        rect2.top = t(rect, fW);
        rect2.right = rect.right - this.f42810d.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fW);
        return rect2;
    }

    private void u0(boolean z11, boolean z12) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f42810d;
        boolean z13 = false;
        boolean z14 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f42810d;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        }
        ColorStateList colorStateList2 = this.f42821i0;
        if (colorStateList2 != null) {
            this.f42847v0.M(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f42821i0;
            this.f42847v0.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f42841s0) : this.f42841s0));
        } else if (c0()) {
            this.f42847v0.M(this.f42822j.r());
        } else if (this.f42828m && (textView = this.f42832o) != null) {
            this.f42847v0.M(textView.getTextColors());
        } else if (z13 && (colorStateList = this.f42823j0) != null) {
            this.f42847v0.R(colorStateList);
        }
        if (z14 || !this.f42849w0 || (isEnabled() && z13)) {
            if (z12 || this.f42845u0) {
                z(z11);
                return;
            }
            return;
        }
        if (z12 || !this.f42845u0) {
            F(z11);
        }
    }

    private int v() {
        float fQ;
        if (!this.C) {
            return 0;
        }
        int i11 = this.O;
        if (i11 == 0) {
            fQ = this.f42847v0.q();
        } else {
            if (i11 != 2) {
                return 0;
            }
            fQ = this.f42847v0.q() / 2.0f;
        }
        return (int) fQ;
    }

    private void v0() {
        EditText editText;
        if (this.f42842t == null || (editText = this.f42810d) == null) {
            return;
        }
        this.f42842t.setGravity(editText.getGravity());
        this.f42842t.setPadding(this.f42810d.getCompoundPaddingLeft(), this.f42810d.getCompoundPaddingTop(), this.f42810d.getCompoundPaddingRight(), this.f42810d.getCompoundPaddingBottom());
    }

    private boolean w() {
        return this.O == 2 && x();
    }

    private void w0() {
        EditText editText = this.f42810d;
        x0(editText == null ? null : editText.getText());
    }

    private boolean x() {
        return this.Q > -1 && this.T != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(Editable editable) {
        if (this.f42830n.a(editable) != 0 || this.f42845u0) {
            L();
        } else {
            f0();
        }
    }

    private void y() {
        if (B()) {
            ((com.google.android.material.textfield.h) this.F).u0();
        }
    }

    private void y0(boolean z11, boolean z12) {
        int defaultColor = this.f42831n0.getDefaultColor();
        int colorForState = this.f42831n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f42831n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z11) {
            this.T = colorForState2;
        } else if (z12) {
            this.T = colorForState;
        } else {
            this.T = defaultColor;
        }
    }

    private void z(boolean z11) {
        ValueAnimator valueAnimator = this.f42853y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f42853y0.cancel();
        }
        if (z11 && this.f42851x0) {
            l(1.0f);
        } else {
            this.f42847v0.c0(1.0f);
        }
        this.f42845u0 = false;
        if (B()) {
            V();
        }
        w0();
        this.f42806b.l(false);
        this.f42808c.H(false);
    }

    public boolean M() {
        return this.f42808c.F();
    }

    public boolean N() {
        return this.f42822j.A();
    }

    public boolean O() {
        return this.f42822j.B();
    }

    public boolean P() {
        return this.C;
    }

    final boolean Q() {
        return this.f42845u0;
    }

    public boolean S() {
        return this.E;
    }

    public void Y() {
        this.f42806b.m();
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i11, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i11, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f42804a.addView(view, layoutParams2);
        this.f42804a.setLayoutParams(layoutParams);
        s0();
        setEditText((EditText) view);
    }

    void b0(@NonNull TextView textView, int i11) {
        try {
            androidx.core.widget.m.r(textView, i11);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.m.r(textView, zs.l.f128794c);
        textView.setTextColor(androidx.core.content.b.getColor(getContext(), zs.d.f128608b));
    }

    boolean c0() {
        return this.f42822j.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i11) {
        EditText editText = this.f42810d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i11);
            return;
        }
        if (this.f42812e != null) {
            boolean z11 = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.f42810d.setHint(this.f42812e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i11);
                return;
            } finally {
                this.f42810d.setHint(hint);
                this.E = z11;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i11);
        onProvideAutofillVirtualStructure(viewStructure, i11);
        viewStructure.setChildCount(this.f42804a.getChildCount());
        for (int i12 = 0; i12 < this.f42804a.getChildCount(); i12++) {
            View childAt = this.f42804a.getChildAt(i12);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i12);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i11);
            if (childAt == this.f42810d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0 = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f42855z0) {
            return;
        }
        this.f42855z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.f42847v0;
        boolean zF0 = bVar != null ? bVar.f0(drawableState) : false;
        if (this.f42810d != null) {
            t0(ViewCompat.U(this) && isEnabled());
        }
        o0();
        z0();
        if (zF0) {
            invalidate();
        }
        this.f42855z0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f42810d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    @NonNull
    st.g getBoxBackground() {
        int i11 = this.O;
        if (i11 == 1 || i11 == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.U;
    }

    public int getBoxBackgroundMode() {
        return this.O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return d0.m(this) ? this.L.j().a(this.f42805a0) : this.L.l().a(this.f42805a0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return d0.m(this) ? this.L.l().a(this.f42805a0) : this.L.j().a(this.f42805a0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return d0.m(this) ? this.L.r().a(this.f42805a0) : this.L.t().a(this.f42805a0);
    }

    public float getBoxCornerRadiusTopStart() {
        return d0.m(this) ? this.L.t().a(this.f42805a0) : this.L.r().a(this.f42805a0);
    }

    public int getBoxStrokeColor() {
        return this.f42829m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f42831n0;
    }

    public int getBoxStrokeWidth() {
        return this.R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.S;
    }

    public int getCounterMaxLength() {
        return this.f42826l;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f42824k && this.f42828m && (textView = this.f42832o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f42854z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f42852y;
    }

    public ColorStateList getCursorColor() {
        return this.A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f42821i0;
    }

    public EditText getEditText() {
        return this.f42810d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f42808c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f42808c.n();
    }

    public int getEndIconMinSize() {
        return this.f42808c.o();
    }

    public int getEndIconMode() {
        return this.f42808c.p();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f42808c.q();
    }

    @NonNull
    CheckableImageButton getEndIconView() {
        return this.f42808c.r();
    }

    public CharSequence getError() {
        if (this.f42822j.A()) {
            return this.f42822j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f42822j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f42822j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f42822j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f42808c.s();
    }

    public CharSequence getHelperText() {
        if (this.f42822j.B()) {
            return this.f42822j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f42822j.u();
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f42847v0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f42847v0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f42823j0;
    }

    @NonNull
    public e getLengthCounter() {
        return this.f42830n;
    }

    public int getMaxEms() {
        return this.f42816g;
    }

    public int getMaxWidth() {
        return this.f42820i;
    }

    public int getMinEms() {
        return this.f42814f;
    }

    public int getMinWidth() {
        return this.f42818h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f42808c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f42808c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f42840s) {
            return this.f42838r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f42846v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f42844u;
    }

    public CharSequence getPrefixText() {
        return this.f42806b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f42806b.b();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f42806b.d();
    }

    @NonNull
    public st.k getShapeAppearanceModel() {
        return this.L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f42806b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f42806b.f();
    }

    public int getStartIconMinSize() {
        return this.f42806b.g();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f42806b.h();
    }

    public CharSequence getSuffixText() {
        return this.f42808c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f42808c.x();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f42808c.z();
    }

    public Typeface getTypeface() {
        return this.f42807b0;
    }

    public void i(@NonNull f fVar) {
        this.f42813e0.add(fVar);
        if (this.f42810d != null) {
            fVar.a(this);
        }
    }

    void j0(Editable editable) {
        int iA = this.f42830n.a(editable);
        boolean z11 = this.f42828m;
        int i11 = this.f42826l;
        if (i11 == -1) {
            this.f42832o.setText(String.valueOf(iA));
            this.f42832o.setContentDescription(null);
            this.f42828m = false;
        } else {
            this.f42828m = iA > i11;
            k0(getContext(), this.f42832o, iA, this.f42826l, this.f42828m);
            if (z11 != this.f42828m) {
                l0();
            }
            this.f42832o.setText(s5.a.c().j(getContext().getString(zs.k.f128769d, Integer.valueOf(iA), Integer.valueOf(this.f42826l))));
        }
        if (this.f42810d == null || z11 == this.f42828m) {
            return;
        }
        t0(false);
        z0();
        o0();
    }

    void l(float f11) {
        if (this.f42847v0.x() == f11) {
            return;
        }
        if (this.f42853y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f42853y0 = valueAnimator;
            valueAnimator.setInterpolator(nt.i.g(getContext(), zs.c.f128570h0, at.b.f14973b));
            this.f42853y0.setDuration(nt.i.f(getContext(), zs.c.f128556a0, 167));
            this.f42853y0.addUpdateListener(new c());
        }
        this.f42853y0.setFloatValues(this.f42847v0.x(), f11);
        this.f42853y0.start();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    boolean n0() {
        boolean z11;
        if (this.f42810d == null) {
            return false;
        }
        boolean z12 = true;
        if (e0()) {
            int measuredWidth = this.f42806b.getMeasuredWidth() - this.f42810d.getPaddingLeft();
            if (this.f42809c0 == null || this.f42811d0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f42809c0 = colorDrawable;
                this.f42811d0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrD = androidx.core.widget.m.d(this.f42810d);
            Drawable drawable = drawableArrD[0];
            Drawable drawable2 = this.f42809c0;
            if (drawable != drawable2) {
                androidx.core.widget.m.m(this.f42810d, drawable2, drawableArrD[1], drawableArrD[2], drawableArrD[3]);
                z11 = true;
            } else {
                z11 = false;
            }
        } else if (this.f42809c0 != null) {
            Drawable[] drawableArrD2 = androidx.core.widget.m.d(this.f42810d);
            androidx.core.widget.m.m(this.f42810d, null, drawableArrD2[1], drawableArrD2[2], drawableArrD2[3]);
            this.f42809c0 = null;
            z11 = true;
        } else {
            z11 = false;
        }
        if (d0()) {
            int measuredWidth2 = this.f42808c.z().getMeasuredWidth() - this.f42810d.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f42808c.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + androidx.core.view.n.b((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            Drawable[] drawableArrD3 = androidx.core.widget.m.d(this.f42810d);
            Drawable drawable3 = this.f42815f0;
            if (drawable3 != null && this.f42817g0 != measuredWidth2) {
                this.f42817g0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.m.m(this.f42810d, drawableArrD3[0], drawableArrD3[1], this.f42815f0, drawableArrD3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f42815f0 = colorDrawable2;
                this.f42817g0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArrD3[2];
            Drawable drawable5 = this.f42815f0;
            if (drawable4 != drawable5) {
                this.f42819h0 = drawable4;
                androidx.core.widget.m.m(this.f42810d, drawableArrD3[0], drawableArrD3[1], drawable5, drawableArrD3[3]);
                return true;
            }
        } else if (this.f42815f0 != null) {
            Drawable[] drawableArrD4 = androidx.core.widget.m.d(this.f42810d);
            if (drawableArrD4[2] == this.f42815f0) {
                androidx.core.widget.m.m(this.f42810d, drawableArrD4[0], drawableArrD4[1], this.f42819h0, drawableArrD4[3]);
            } else {
                z12 = z11;
            }
            this.f42815f0 = null;
            return z12;
        }
        return z11;
    }

    void o0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f42810d;
        if (editText == null || this.O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (j0.a(background)) {
            background = background.mutate();
        }
        if (c0()) {
            background.setColorFilter(androidx.appcompat.widget.h.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f42828m && (textView = this.f42832o) != null) {
            background.setColorFilter(androidx.appcompat.widget.h.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            l5.a.c(background);
            this.f42810d.refreshDrawableState();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f42847v0.H(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f42808c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.B0 = false;
        boolean zR0 = r0();
        boolean zN0 = n0();
        if (zR0 || zN0) {
            this.f42810d.post(new Runnable() { // from class: com.google.android.material.textfield.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42985a.f42810d.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        EditText editText = this.f42810d;
        if (editText != null) {
            Rect rect = this.V;
            com.google.android.material.internal.d.a(this, editText, rect);
            h0(rect);
            if (this.C) {
                this.f42847v0.a0(this.f42810d.getTextSize());
                int gravity = this.f42810d.getGravity();
                this.f42847v0.S((gravity & (-113)) | 48);
                this.f42847v0.Z(gravity);
                this.f42847v0.O(r(rect));
                this.f42847v0.W(u(rect));
                this.f42847v0.J();
                if (!B() || this.f42845u0) {
                    return;
                }
                V();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (!this.B0) {
            this.f42808c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.B0 = true;
        }
        v0();
        this.f42808c.x0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f42862c);
        if (hVar.f42863d) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        boolean z11 = i11 == 1;
        if (z11 != this.M) {
            float fA = this.L.r().a(this.f42805a0);
            float fA2 = this.L.t().a(this.f42805a0);
            st.k kVarM = st.k.a().D(this.L.s()).I(this.L.q()).t(this.L.k()).x(this.L.i()).E(fA2).J(fA).u(this.L.l().a(this.f42805a0)).y(this.L.j().a(this.f42805a0)).m();
            this.M = z11;
            setShapeAppearanceModel(kVarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (c0()) {
            hVar.f42862c = getError();
        }
        hVar.f42863d = this.f42808c.E();
        return hVar;
    }

    void q0() {
        EditText editText = this.f42810d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.I || editText.getBackground() == null) && this.O != 0) {
            p0();
            this.I = true;
        }
    }

    public void setBoxBackgroundColor(int i11) {
        if (this.U != i11) {
            this.U = i11;
            this.f42833o0 = i11;
            this.f42837q0 = i11;
            this.f42839r0 = i11;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i11) {
        setBoxBackgroundColor(androidx.core.content.b.getColor(getContext(), i11));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f42833o0 = defaultColor;
        this.U = defaultColor;
        this.f42835p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f42837q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f42839r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i11) {
        if (i11 == this.O) {
            return;
        }
        this.O = i11;
        if (this.f42810d != null) {
            U();
        }
    }

    public void setBoxCollapsedPaddingTop(int i11) {
        this.P = i11;
    }

    public void setBoxCornerFamily(int i11) {
        this.L = this.L.v().C(i11, this.L.r()).H(i11, this.L.t()).s(i11, this.L.j()).w(i11, this.L.l()).m();
        m();
    }

    public void setBoxCornerRadii(float f11, float f12, float f13, float f14) {
        boolean zM = d0.m(this);
        this.M = zM;
        float f15 = zM ? f12 : f11;
        if (!zM) {
            f11 = f12;
        }
        float f16 = zM ? f14 : f13;
        if (!zM) {
            f13 = f14;
        }
        st.g gVar = this.F;
        if (gVar != null && gVar.J() == f15 && this.F.K() == f11 && this.F.s() == f16 && this.F.t() == f13) {
            return;
        }
        this.L = this.L.v().E(f15).J(f11).u(f16).y(f13).m();
        m();
    }

    public void setBoxCornerRadiiResources(int i11, int i12, int i13, int i14) {
        setBoxCornerRadii(getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i12), getContext().getResources().getDimension(i14), getContext().getResources().getDimension(i13));
    }

    public void setBoxStrokeColor(int i11) {
        if (this.f42829m0 != i11) {
            this.f42829m0 = i11;
            z0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f42825k0 = colorStateList.getDefaultColor();
            this.f42841s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f42827l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f42829m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f42829m0 != colorStateList.getDefaultColor()) {
            this.f42829m0 = colorStateList.getDefaultColor();
        }
        z0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f42831n0 != colorStateList) {
            this.f42831n0 = colorStateList;
            z0();
        }
    }

    public void setBoxStrokeWidth(int i11) {
        this.R = i11;
        z0();
    }

    public void setBoxStrokeWidthFocused(int i11) {
        this.S = i11;
        z0();
    }

    public void setBoxStrokeWidthFocusedResource(int i11) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i11));
    }

    public void setBoxStrokeWidthResource(int i11) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i11));
    }

    public void setCounterEnabled(boolean z11) {
        if (this.f42824k != z11) {
            if (z11) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f42832o = appCompatTextView;
                appCompatTextView.setId(zs.g.f128727v0);
                Typeface typeface = this.f42807b0;
                if (typeface != null) {
                    this.f42832o.setTypeface(typeface);
                }
                this.f42832o.setMaxLines(1);
                this.f42822j.e(this.f42832o, 2);
                androidx.core.view.n.d((ViewGroup.MarginLayoutParams) this.f42832o.getLayoutParams(), getResources().getDimensionPixelOffset(zs.e.G0));
                l0();
                i0();
            } else {
                this.f42822j.C(this.f42832o, 2);
                this.f42832o = null;
            }
            this.f42824k = z11;
        }
    }

    public void setCounterMaxLength(int i11) {
        if (this.f42826l != i11) {
            if (i11 > 0) {
                this.f42826l = i11;
            } else {
                this.f42826l = -1;
            }
            if (this.f42824k) {
                i0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i11) {
        if (this.f42834p != i11) {
            this.f42834p = i11;
            l0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f42854z != colorStateList) {
            this.f42854z = colorStateList;
            l0();
        }
    }

    public void setCounterTextAppearance(int i11) {
        if (this.f42836q != i11) {
            this.f42836q = i11;
            l0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f42852y != colorStateList) {
            this.f42852y = colorStateList;
            l0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            m0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (R()) {
                m0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f42821i0 = colorStateList;
        this.f42823j0 = colorStateList;
        if (this.f42810d != null) {
            t0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        X(this, z11);
        super.setEnabled(z11);
    }

    public void setEndIconActivated(boolean z11) {
        this.f42808c.N(z11);
    }

    public void setEndIconCheckable(boolean z11) {
        this.f42808c.O(z11);
    }

    public void setEndIconContentDescription(int i11) {
        this.f42808c.P(i11);
    }

    public void setEndIconDrawable(int i11) {
        this.f42808c.R(i11);
    }

    public void setEndIconMinSize(int i11) {
        this.f42808c.T(i11);
    }

    public void setEndIconMode(int i11) {
        this.f42808c.U(i11);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f42808c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f42808c.W(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f42808c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f42808c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f42808c.Z(mode);
    }

    public void setEndIconVisible(boolean z11) {
        this.f42808c.a0(z11);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f42822j.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f42822j.w();
        } else {
            this.f42822j.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i11) {
        this.f42822j.E(i11);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f42822j.F(charSequence);
    }

    public void setErrorEnabled(boolean z11) {
        this.f42822j.G(z11);
    }

    public void setErrorIconDrawable(int i11) {
        this.f42808c.b0(i11);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f42808c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f42808c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f42808c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f42808c.g0(mode);
    }

    public void setErrorTextAppearance(int i11) {
        this.f42822j.H(i11);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f42822j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z11) {
        if (this.f42849w0 != z11) {
            this.f42849w0 = z11;
            t0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f42822j.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f42822j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z11) {
        this.f42822j.K(z11);
    }

    public void setHelperTextTextAppearance(int i11) {
        this.f42822j.J(i11);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z11) {
        this.f42851x0 = z11;
    }

    public void setHintEnabled(boolean z11) {
        if (z11 != this.C) {
            this.C = z11;
            if (z11) {
                CharSequence hint = this.f42810d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.f42810d.setHint((CharSequence) null);
                }
                this.E = true;
            } else {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.f42810d.getHint())) {
                    this.f42810d.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.f42810d != null) {
                s0();
            }
        }
    }

    public void setHintTextAppearance(int i11) {
        this.f42847v0.P(i11);
        this.f42823j0 = this.f42847v0.p();
        if (this.f42810d != null) {
            t0(false);
            s0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f42823j0 != colorStateList) {
            if (this.f42821i0 == null) {
                this.f42847v0.R(colorStateList);
            }
            this.f42823j0 = colorStateList;
            if (this.f42810d != null) {
                t0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull e eVar) {
        this.f42830n = eVar;
    }

    public void setMaxEms(int i11) {
        this.f42816g = i11;
        EditText editText = this.f42810d;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMaxEms(i11);
    }

    public void setMaxWidth(int i11) {
        this.f42820i = i11;
        EditText editText = this.f42810d;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMaxWidth(i11);
    }

    public void setMaxWidthResource(int i11) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    public void setMinEms(int i11) {
        this.f42814f = i11;
        EditText editText = this.f42810d;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMinEms(i11);
    }

    public void setMinWidth(int i11) {
        this.f42818h = i11;
        EditText editText = this.f42810d;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMinWidth(i11);
    }

    public void setMinWidthResource(int i11) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i11) {
        this.f42808c.i0(i11);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i11) {
        this.f42808c.k0(i11);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z11) {
        this.f42808c.m0(z11);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f42808c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f42808c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f42842t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f42842t = appCompatTextView;
            appCompatTextView.setId(zs.g.f128733y0);
            ViewCompat.z0(this.f42842t, 2);
            androidx.transition.e eVarA = A();
            this.f42848w = eVarA;
            eVarA.r0(67L);
            this.f42850x = A();
            setPlaceholderTextAppearance(this.f42846v);
            setPlaceholderTextColor(this.f42844u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f42840s) {
                setPlaceholderTextEnabled(true);
            }
            this.f42838r = charSequence;
        }
        w0();
    }

    public void setPlaceholderTextAppearance(int i11) {
        this.f42846v = i11;
        TextView textView = this.f42842t;
        if (textView != null) {
            androidx.core.widget.m.r(textView, i11);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f42844u != colorStateList) {
            this.f42844u = colorStateList;
            TextView textView = this.f42842t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f42806b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i11) {
        this.f42806b.o(i11);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f42806b.p(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull st.k kVar) {
        st.g gVar = this.F;
        if (gVar == null || gVar.E() == kVar) {
            return;
        }
        this.L = kVar;
        m();
    }

    public void setStartIconCheckable(boolean z11) {
        this.f42806b.q(z11);
    }

    public void setStartIconContentDescription(int i11) {
        setStartIconContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setStartIconDrawable(int i11) {
        setStartIconDrawable(i11 != 0 ? j.a.b(getContext(), i11) : null);
    }

    public void setStartIconMinSize(int i11) {
        this.f42806b.t(i11);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f42806b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f42806b.v(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f42806b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f42806b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f42806b.y(mode);
    }

    public void setStartIconVisible(boolean z11) {
        this.f42806b.z(z11);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f42808c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i11) {
        this.f42808c.q0(i11);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f42808c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f42810d;
        if (editText != null) {
            ViewCompat.p0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f42807b0) {
            this.f42807b0 = typeface;
            this.f42847v0.i0(typeface);
            this.f42822j.N(typeface);
            TextView textView = this.f42832o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void t0(boolean z11) {
        u0(z11, false);
    }

    void z0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.O == 0) {
            return;
        }
        boolean z11 = false;
        boolean z12 = isFocused() || ((editText2 = this.f42810d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f42810d) != null && editText.isHovered())) {
            z11 = true;
        }
        if (!isEnabled()) {
            this.T = this.f42841s0;
        } else if (c0()) {
            if (this.f42831n0 != null) {
                y0(z12, z11);
            } else {
                this.T = getErrorCurrentTextColors();
            }
        } else if (!this.f42828m || (textView = this.f42832o) == null) {
            if (z12) {
                this.T = this.f42829m0;
            } else if (z11) {
                this.T = this.f42827l0;
            } else {
                this.T = this.f42825k0;
            }
        } else if (this.f42831n0 != null) {
            y0(z12, z11);
        } else {
            this.T = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m0();
        }
        this.f42808c.I();
        Y();
        if (this.O == 2) {
            int i11 = this.Q;
            if (z12 && isEnabled()) {
                this.Q = this.S;
            } else {
                this.Q = this.R;
            }
            if (this.Q != i11) {
                W();
            }
        }
        if (this.O == 1) {
            if (!isEnabled()) {
                this.U = this.f42835p0;
            } else if (z11 && !z12) {
                this.U = this.f42839r0;
            } else if (z12) {
                this.U = this.f42837q0;
            } else {
                this.U = this.f42833o0;
            }
        }
        m();
    }

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.A0);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f42808c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f42808c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f42808c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f42808c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f42808c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f42806b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f42806b.s(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = C0;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.f42814f = -1;
        this.f42816g = -1;
        this.f42818h = -1;
        this.f42820i = -1;
        this.f42822j = new u(this);
        this.f42830n = new e() { // from class: com.google.android.material.textfield.a0
            @Override // com.google.android.material.textfield.TextInputLayout.e
            public final int a(Editable editable) {
                return TextInputLayout.b(editable);
            }
        };
        this.V = new Rect();
        this.W = new Rect();
        this.f42805a0 = new RectF();
        this.f42813e0 = new LinkedHashSet<>();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f42847v0 = bVar;
        this.B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f42804a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = at.b.f14972a;
        bVar.h0(timeInterpolator);
        bVar.e0(timeInterpolator);
        bVar.S(8388659);
        b1 b1VarJ = com.google.android.material.internal.a0.j(context2, attributeSet, zs.m.P8, i11, i12, zs.m.f128972m9, zs.m.f128948k9, zs.m.E9, zs.m.J9, zs.m.N9);
        y yVar = new y(this, b1VarJ);
        this.f42806b = yVar;
        this.C = b1VarJ.a(zs.m.M9, true);
        setHint(b1VarJ.p(zs.m.U8));
        this.f42851x0 = b1VarJ.a(zs.m.L9, true);
        this.f42849w0 = b1VarJ.a(zs.m.G9, true);
        if (b1VarJ.s(zs.m.W8)) {
            setMinEms(b1VarJ.k(zs.m.W8, -1));
        } else if (b1VarJ.s(zs.m.T8)) {
            setMinWidth(b1VarJ.f(zs.m.T8, -1));
        }
        if (b1VarJ.s(zs.m.V8)) {
            setMaxEms(b1VarJ.k(zs.m.V8, -1));
        } else if (b1VarJ.s(zs.m.S8)) {
            setMaxWidth(b1VarJ.f(zs.m.S8, -1));
        }
        this.L = st.k.e(context2, attributeSet, i11, i12).m();
        this.N = context2.getResources().getDimensionPixelOffset(zs.e.D0);
        this.P = b1VarJ.e(zs.m.Z8, 0);
        this.R = b1VarJ.f(zs.m.f128900g9, context2.getResources().getDimensionPixelSize(zs.e.E0));
        this.S = b1VarJ.f(zs.m.f128912h9, context2.getResources().getDimensionPixelSize(zs.e.F0));
        this.Q = this.R;
        float fD = b1VarJ.d(zs.m.f128864d9, -1.0f);
        float fD2 = b1VarJ.d(zs.m.f128852c9, -1.0f);
        float fD3 = b1VarJ.d(zs.m.f128828a9, -1.0f);
        float fD4 = b1VarJ.d(zs.m.f128840b9, -1.0f);
        st.k.b bVarV = this.L.v();
        if (fD >= BitmapDescriptorFactory.HUE_RED) {
            bVarV.E(fD);
        }
        if (fD2 >= BitmapDescriptorFactory.HUE_RED) {
            bVarV.J(fD2);
        }
        if (fD3 >= BitmapDescriptorFactory.HUE_RED) {
            bVarV.y(fD3);
        }
        if (fD4 >= BitmapDescriptorFactory.HUE_RED) {
            bVarV.u(fD4);
        }
        this.L = bVarV.m();
        ColorStateList colorStateListB = pt.c.b(context2, b1VarJ, zs.m.X8);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f42833o0 = defaultColor;
            this.U = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f42835p0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f42837q0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f42839r0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f42837q0 = this.f42833o0;
                ColorStateList colorStateListA = j.a.a(context2, zs.d.f128614h);
                this.f42835p0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f42839r0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.U = 0;
            this.f42833o0 = 0;
            this.f42835p0 = 0;
            this.f42837q0 = 0;
            this.f42839r0 = 0;
        }
        if (b1VarJ.s(zs.m.R8)) {
            ColorStateList colorStateListC = b1VarJ.c(zs.m.R8);
            this.f42823j0 = colorStateListC;
            this.f42821i0 = colorStateListC;
        }
        ColorStateList colorStateListB2 = pt.c.b(context2, b1VarJ, zs.m.f128876e9);
        this.f42829m0 = b1VarJ.b(zs.m.f128876e9, 0);
        this.f42825k0 = androidx.core.content.b.getColor(context2, zs.d.f128615i);
        this.f42841s0 = androidx.core.content.b.getColor(context2, zs.d.f128616j);
        this.f42827l0 = androidx.core.content.b.getColor(context2, zs.d.f128617k);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (b1VarJ.s(zs.m.f128888f9)) {
            setBoxStrokeErrorColor(pt.c.b(context2, b1VarJ, zs.m.f128888f9));
        }
        if (b1VarJ.n(zs.m.N9, -1) != -1) {
            setHintTextAppearance(b1VarJ.n(zs.m.N9, 0));
        }
        this.A = b1VarJ.c(zs.m.f128996o9);
        this.B = b1VarJ.c(zs.m.f129008p9);
        int iN = b1VarJ.n(zs.m.E9, 0);
        CharSequence charSequenceP = b1VarJ.p(zs.m.f129126z9);
        int iK = b1VarJ.k(zs.m.f129115y9, 1);
        boolean zA = b1VarJ.a(zs.m.A9, false);
        int iN2 = b1VarJ.n(zs.m.J9, 0);
        boolean zA2 = b1VarJ.a(zs.m.I9, false);
        CharSequence charSequenceP2 = b1VarJ.p(zs.m.H9);
        int iN3 = b1VarJ.n(zs.m.V9, 0);
        CharSequence charSequenceP3 = b1VarJ.p(zs.m.U9);
        boolean zA3 = b1VarJ.a(zs.m.f128924i9, false);
        setCounterMaxLength(b1VarJ.k(zs.m.f128936j9, -1));
        this.f42836q = b1VarJ.n(zs.m.f128972m9, 0);
        this.f42834p = b1VarJ.n(zs.m.f128948k9, 0);
        setBoxBackgroundMode(b1VarJ.k(zs.m.Y8, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f42834p);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f42836q);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        if (b1VarJ.s(zs.m.F9)) {
            setErrorTextColor(b1VarJ.c(zs.m.F9));
        }
        if (b1VarJ.s(zs.m.K9)) {
            setHelperTextColor(b1VarJ.c(zs.m.K9));
        }
        if (b1VarJ.s(zs.m.O9)) {
            setHintTextColor(b1VarJ.c(zs.m.O9));
        }
        if (b1VarJ.s(zs.m.f128984n9)) {
            setCounterTextColor(b1VarJ.c(zs.m.f128984n9));
        }
        if (b1VarJ.s(zs.m.f128960l9)) {
            setCounterOverflowTextColor(b1VarJ.c(zs.m.f128960l9));
        }
        if (b1VarJ.s(zs.m.W9)) {
            setPlaceholderTextColor(b1VarJ.c(zs.m.W9));
        }
        r rVar = new r(this, b1VarJ);
        this.f42808c = rVar;
        boolean zA4 = b1VarJ.a(zs.m.Q8, true);
        b1VarJ.w();
        ViewCompat.z0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            ViewCompat.B0(this, 1);
        }
        frameLayout.addView(yVar);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    public void setHint(int i11) {
        setHint(i11 != 0 ? getResources().getText(i11) : null);
    }
}

package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.r0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class r<S> extends androidx.fragment.app.o {
    static final Object Q = "CONFIRM_BUTTON_TAG";
    static final Object R = "CANCEL_BUTTON_TAG";
    static final Object S = "TOGGLE_BUTTON_TAG";
    private int A;
    private CharSequence B;
    private int C;
    private CharSequence D;
    private int E;
    private CharSequence F;
    private int G;
    private CharSequence H;
    private TextView I;
    private TextView J;
    private CheckableImageButton K;
    private st.g L;
    private Button M;
    private boolean N;
    private CharSequence O;
    private CharSequence P;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final LinkedHashSet<s<? super S>> f42009m = new LinkedHashSet<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinkedHashSet<View.OnClickListener> f42010n = new LinkedHashSet<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f42011o = new LinkedHashSet<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f42012p = new LinkedHashSet<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f42013q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private j<S> f42014r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private y<S> f42015s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.android.material.datepicker.a f42016t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private n f42017u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p<S> f42018v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f42019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f42020x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f42021y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f42022z;

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = r.this.f42009m.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(r.this.r());
            }
            r.this.dismiss();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = r.this.f42010n.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            r.this.dismiss();
        }
    }

    class c implements androidx.core.view.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f42026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f42027c;

        c(int i11, View view, int i12) {
            this.f42025a = i11;
            this.f42026b = view;
            this.f42027c = i12;
        }

        @Override // androidx.core.view.a0
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            int i11 = windowInsetsCompat.f(WindowInsetsCompat.n.h()).f84925b;
            if (this.f42025a >= 0) {
                this.f42026b.getLayoutParams().height = this.f42025a + i11;
                View view2 = this.f42026b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f42026b;
            view3.setPadding(view3.getPaddingLeft(), this.f42027c + i11, this.f42026b.getPaddingRight(), this.f42026b.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    class d extends x<S> {
        d() {
        }

        @Override // com.google.android.material.datepicker.x
        public void a() {
            r.this.M.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.x
        public void b(S s11) {
            r rVar = r.this;
            rVar.A(rVar.p());
            r.this.M.setEnabled(r.this.l().s1());
        }
    }

    public static final class e<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j<S> f42030a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        com.google.android.material.datepicker.a f42032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        n f42033d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f42031b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42034e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f42035f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f42036g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        CharSequence f42037h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f42038i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        CharSequence f42039j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f42040k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        CharSequence f42041l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f42042m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        CharSequence f42043n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        S f42044o = null;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f42045p = 0;

        private e(j<S> jVar) {
            this.f42030a = jVar;
        }

        private u b() {
            if (!this.f42030a.u1().isEmpty()) {
                u uVarC = u.c(this.f42030a.u1().iterator().next().longValue());
                if (d(uVarC, this.f42032c)) {
                    return uVarC;
                }
            }
            u uVarD = u.d();
            return d(uVarD, this.f42032c) ? uVarD : this.f42032c.l();
        }

        @NonNull
        public static e<Long> c() {
            return new e<>(new z());
        }

        private static boolean d(u uVar, com.google.android.material.datepicker.a aVar) {
            return uVar.compareTo(aVar.l()) >= 0 && uVar.compareTo(aVar.h()) <= 0;
        }

        @NonNull
        public r<S> a() {
            if (this.f42032c == null) {
                this.f42032c = new com.google.android.material.datepicker.a.b().a();
            }
            if (this.f42034e == 0) {
                this.f42034e = this.f42030a.k0();
            }
            S s11 = this.f42044o;
            if (s11 != null) {
                this.f42030a.U0(s11);
            }
            if (this.f42032c.k() == null) {
                this.f42032c.r(b());
            }
            return r.x(this);
        }

        @NonNull
        public e<S> e(com.google.android.material.datepicker.a aVar) {
            this.f42032c = aVar;
            return this;
        }

        @NonNull
        public e<S> f(int i11) {
            this.f42045p = i11;
            return this;
        }

        @NonNull
        public e<S> g(CharSequence charSequence) {
            this.f42041l = charSequence;
            this.f42040k = 0;
            return this;
        }

        @NonNull
        public e<S> h(CharSequence charSequence) {
            this.f42037h = charSequence;
            this.f42036g = 0;
            return this;
        }

        @NonNull
        public e<S> i(S s11) {
            this.f42044o = s11;
            return this;
        }

        @NonNull
        public e<S> j(int i11) {
            this.f42031b = i11;
            return this;
        }

        @NonNull
        public e<S> k(CharSequence charSequence) {
            this.f42035f = charSequence;
            this.f42034e = 0;
            return this;
        }
    }

    private void B() {
        this.I.setText((this.f42022z == 1 && v()) ? this.P : this.O);
    }

    private void C(@NonNull CheckableImageButton checkableImageButton) {
        this.K.setContentDescription(this.f42022z == 1 ? checkableImageButton.getContext().getString(zs.k.R) : checkableImageButton.getContext().getString(zs.k.T));
    }

    public static /* synthetic */ void b(r rVar, View view) {
        rVar.M.setEnabled(rVar.l().s1());
        rVar.K.toggle();
        rVar.f42022z = rVar.f42022z == 1 ? 0 : 1;
        rVar.C(rVar.K);
        rVar.z();
    }

    @NonNull
    private static Drawable j(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, j.a.b(context, zs.f.f128674e));
        stateListDrawable.addState(new int[0], j.a.b(context, zs.f.f128675f));
        return stateListDrawable;
    }

    private void k(Window window) {
        if (this.N) {
            return;
        }
        View viewFindViewById = requireView().findViewById(zs.g.f128700i);
        com.google.android.material.internal.e.a(window, true, com.google.android.material.internal.d0.i(viewFindViewById), null);
        ViewCompat.E0(viewFindViewById, new c(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.N = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j<S> l() {
        if (this.f42014r == null) {
            this.f42014r = (j) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f42014r;
    }

    private static CharSequence m(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String n() {
        return l().s2(requireContext());
    }

    private static int q(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(zs.e.f128635i0);
        int i11 = u.d().f42053d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(zs.e.f128639k0) * i11) + ((i11 - 1) * resources.getDimensionPixelOffset(zs.e.f128645n0));
    }

    private int s(Context context) {
        int i11 = this.f42013q;
        return i11 != 0 ? i11 : l().r0(context);
    }

    private void t(Context context) {
        this.K.setTag(S);
        this.K.setImageDrawable(j(context));
        this.K.setChecked(this.f42022z != 0);
        ViewCompat.p0(this.K, null);
        C(this.K);
        this.K.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.b(this.f42008a, view);
            }
        });
    }

    static boolean u(@NonNull Context context) {
        return y(context, R.attr.windowFullscreen);
    }

    private boolean v() {
        return getResources().getConfiguration().orientation == 2;
    }

    static boolean w(@NonNull Context context) {
        return y(context, zs.c.f128580m0);
    }

    @NonNull
    static <S> r<S> x(@NonNull e<S> eVar) {
        r<S> rVar = new r<>();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", eVar.f42031b);
        bundle.putParcelable("DATE_SELECTOR_KEY", eVar.f42030a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", eVar.f42032c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", eVar.f42033d);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", eVar.f42034e);
        bundle.putCharSequence("TITLE_TEXT_KEY", eVar.f42035f);
        bundle.putInt("INPUT_MODE_KEY", eVar.f42045p);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", eVar.f42036g);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", eVar.f42037h);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", eVar.f42038i);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", eVar.f42039j);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", eVar.f42040k);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", eVar.f42041l);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", eVar.f42042m);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", eVar.f42043n);
        rVar.setArguments(bundle);
        return rVar;
    }

    static boolean y(@NonNull Context context, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(pt.b.d(context, zs.c.M, p.class.getCanonicalName()), new int[]{i11});
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z11;
    }

    private void z() {
        int iS = s(requireContext());
        t tVarA = p.A(l(), iS, this.f42016t, this.f42017u);
        this.f42018v = tVarA;
        if (this.f42022z == 1) {
            tVarA = t.j(l(), iS, this.f42016t);
        }
        this.f42015s = tVarA;
        B();
        A(p());
        r0 r0VarR = getChildFragmentManager().r();
        r0VarR.o(zs.g.K, this.f42015s);
        r0VarR.i();
        this.f42015s.b(new d());
    }

    void A(String str) {
        this.J.setContentDescription(n());
        this.J.setText(str);
    }

    public boolean g(DialogInterface.OnDismissListener onDismissListener) {
        return this.f42012p.add(onDismissListener);
    }

    public boolean i(s<? super S> sVar) {
        return this.f42009m.add(sVar);
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f42011o.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f42013q = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f42014r = (j) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f42016t = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f42017u = (n) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f42019w = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f42020x = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f42022z = bundle.getInt("INPUT_MODE_KEY");
        this.A = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.B = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.C = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.D = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.E = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.F = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.G = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.H = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f42020x;
        if (text == null) {
            text = requireContext().getResources().getText(this.f42019w);
        }
        this.O = text;
        this.P = m(text);
    }

    @Override // androidx.fragment.app.o
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), s(requireContext()));
        Context context = dialog.getContext();
        this.f42021y = u(context);
        this.L = new st.g(context, null, zs.c.M, zs.l.G);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, zs.m.C4, zs.c.M, zs.l.G);
        int color = typedArrayObtainStyledAttributes.getColor(zs.m.D4, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.L.Q(context);
        this.L.b0(ColorStateList.valueOf(color));
        this.L.a0(ViewCompat.v(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f42021y ? zs.i.f128763y : zs.i.f128762x, viewGroup);
        Context context = viewInflate.getContext();
        n nVar = this.f42017u;
        if (nVar != null) {
            nVar.h(context);
        }
        if (this.f42021y) {
            viewInflate.findViewById(zs.g.K).setLayoutParams(new LinearLayout.LayoutParams(q(context), -2));
        } else {
            viewInflate.findViewById(zs.g.L).setLayoutParams(new LinearLayout.LayoutParams(q(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(zs.g.R);
        this.J = textView;
        ViewCompat.r0(textView, 1);
        this.K = (CheckableImageButton) viewInflate.findViewById(zs.g.S);
        this.I = (TextView) viewInflate.findViewById(zs.g.U);
        t(context);
        this.M = (Button) viewInflate.findViewById(zs.g.f128690d);
        if (l().s1()) {
            this.M.setEnabled(true);
        } else {
            this.M.setEnabled(false);
        }
        this.M.setTag(Q);
        CharSequence charSequence = this.B;
        if (charSequence != null) {
            this.M.setText(charSequence);
        } else {
            int i11 = this.A;
            if (i11 != 0) {
                this.M.setText(i11);
            }
        }
        CharSequence charSequence2 = this.D;
        if (charSequence2 != null) {
            this.M.setContentDescription(charSequence2);
        } else if (this.C != 0) {
            this.M.setContentDescription(getContext().getResources().getText(this.C));
        }
        this.M.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(zs.g.f128684a);
        button.setTag(R);
        CharSequence charSequence3 = this.F;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i12 = this.E;
            if (i12 != 0) {
                button.setText(i12);
            }
        }
        CharSequence charSequence4 = this.H;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.G != 0) {
            button.setContentDescription(getContext().getResources().getText(this.G));
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f42012p.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f42013q);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f42014r);
        com.google.android.material.datepicker.a.b bVar = new com.google.android.material.datepicker.a.b(this.f42016t);
        p<S> pVar = this.f42018v;
        u uVarV = pVar == null ? null : pVar.v();
        if (uVarV != null) {
            bVar.c(uVarV.f42055f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f42017u);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f42019w);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f42020x);
        bundle.putInt("INPUT_MODE_KEY", this.f42022z);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.A);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.B);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.C);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.D);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.E);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.F);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.G);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.H);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f42021y) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.L);
            k(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(zs.e.f128643m0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.L, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new jt.a(requireDialog(), rect));
        }
        z();
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.Fragment
    public void onStop() {
        this.f42015s.i();
        super.onStop();
    }

    public String p() {
        return l().J2(getContext());
    }

    public final S r() {
        return l().B1();
    }
}

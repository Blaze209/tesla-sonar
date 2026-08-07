package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.o;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends o implements TimePickerView.d {
    private CharSequence A;
    private CharSequence C;
    private MaterialButton D;
    private Button E;
    private h G;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TimePickerView f43028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ViewStub f43029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i f43030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private m f43031t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private j f43032u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f43033v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f43034w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f43036y;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set<View.OnClickListener> f43024m = new LinkedHashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set<View.OnClickListener> f43025n = new LinkedHashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set<DialogInterface.OnCancelListener> f43026o = new LinkedHashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set<DialogInterface.OnDismissListener> f43027p = new LinkedHashSet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f43035x = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f43037z = 0;
    private int B = 0;
    private int F = 0;
    private int H = 0;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = d.this.f43024m.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            d.this.dismiss();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = d.this.f43025n.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            d.this.dismiss();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            dVar.F = dVar.F == 0 ? 1 : 0;
            d dVar2 = d.this;
            dVar2.v(dVar2.D);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.d$d, reason: collision with other inner class name */
    public static final class C0672d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f43042b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f43044d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CharSequence f43046f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f43048h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h f43041a = new h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f43043c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f43045e = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f43047g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f43049i = 0;

        @NonNull
        public d j() {
            return d.s(this);
        }

        @NonNull
        public C0672d k(int i11) {
            this.f43041a.i(i11);
            return this;
        }

        @NonNull
        public C0672d l(int i11) {
            this.f43042b = Integer.valueOf(i11);
            return this;
        }

        @NonNull
        public C0672d m(int i11) {
            this.f43041a.j(i11);
            return this;
        }

        @NonNull
        public C0672d n(CharSequence charSequence) {
            this.f43048h = charSequence;
            return this;
        }

        @NonNull
        public C0672d o(CharSequence charSequence) {
            this.f43046f = charSequence;
            return this;
        }

        @NonNull
        public C0672d p(int i11) {
            h hVar = this.f43041a;
            int i12 = hVar.f43056d;
            int i13 = hVar.f43057e;
            h hVar2 = new h(i11);
            this.f43041a = hVar2;
            hVar2.j(i13);
            this.f43041a.i(i12);
            return this;
        }

        @NonNull
        public C0672d q(CharSequence charSequence) {
            this.f43044d = charSequence;
            return this;
        }
    }

    public static /* synthetic */ void b(d dVar) {
        j jVar = dVar.f43032u;
        if (jVar instanceof m) {
            ((m) jVar).h();
        }
    }

    private Pair<Integer, Integer> m(int i11) {
        if (i11 == 0) {
            return new Pair<>(Integer.valueOf(this.f43033v), Integer.valueOf(zs.k.f128783r));
        }
        if (i11 == 1) {
            return new Pair<>(Integer.valueOf(this.f43034w), Integer.valueOf(zs.k.f128780o));
        }
        throw new IllegalArgumentException("no icon for mode: " + i11);
    }

    private int q() {
        int i11 = this.H;
        if (i11 != 0) {
            return i11;
        }
        TypedValue typedValueA = pt.b.a(requireContext(), zs.c.W);
        if (typedValueA == null) {
            return 0;
        }
        return typedValueA.data;
    }

    private j r(int i11, @NonNull TimePickerView timePickerView, @NonNull ViewStub viewStub) {
        if (i11 != 0) {
            if (this.f43031t == null) {
                this.f43031t = new m((LinearLayout) viewStub.inflate(), this.G);
            }
            this.f43031t.e();
            return this.f43031t;
        }
        i iVar = this.f43030s;
        if (iVar == null) {
            iVar = new i(timePickerView, this.G);
        }
        this.f43030s = iVar;
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static d s(@NonNull C0672d c0672d) {
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", c0672d.f43041a);
        if (c0672d.f43042b != null) {
            bundle.putInt("TIME_PICKER_INPUT_MODE", c0672d.f43042b.intValue());
        }
        bundle.putInt("TIME_PICKER_TITLE_RES", c0672d.f43043c);
        if (c0672d.f43044d != null) {
            bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", c0672d.f43044d);
        }
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", c0672d.f43045e);
        if (c0672d.f43046f != null) {
            bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", c0672d.f43046f);
        }
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", c0672d.f43047g);
        if (c0672d.f43048h != null) {
            bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", c0672d.f43048h);
        }
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", c0672d.f43049i);
        dVar.setArguments(bundle);
        return dVar;
    }

    private void t(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        h hVar = (h) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.G = hVar;
        if (hVar == null) {
            this.G = new h();
        }
        this.F = bundle.getInt("TIME_PICKER_INPUT_MODE", this.G.f43055c != 1 ? 0 : 1);
        this.f43035x = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f43036y = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.f43037z = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.A = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.B = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.C = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.H = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    private void u() {
        Button button = this.E;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(MaterialButton materialButton) {
        if (materialButton == null || this.f43028q == null || this.f43029r == null) {
            return;
        }
        j jVar = this.f43032u;
        if (jVar != null) {
            jVar.hide();
        }
        j jVarR = r(this.F, this.f43028q, this.f43029r);
        this.f43032u = jVarR;
        jVarR.show();
        this.f43032u.invalidate();
        Pair<Integer, Integer> pairM = m(this.F);
        materialButton.setIconResource(((Integer) pairM.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pairM.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.d
    public void h() {
        this.F = 1;
        v(this.D);
        this.f43031t.h();
    }

    public boolean k(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f43027p.add(onDismissListener);
    }

    public boolean l(@NonNull View.OnClickListener onClickListener) {
        return this.f43024m.add(onClickListener);
    }

    public int n() {
        return this.G.f43056d % 24;
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f43026o.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        t(bundle);
    }

    @Override // androidx.fragment.app.o
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), q());
        Context context = dialog.getContext();
        st.g gVar = new st.g(context, null, zs.c.V, zs.l.K);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, zs.m.V5, zs.c.V, zs.l.K);
        this.f43034w = typedArrayObtainStyledAttributes.getResourceId(zs.m.X5, 0);
        this.f43033v = typedArrayObtainStyledAttributes.getResourceId(zs.m.Y5, 0);
        int color = typedArrayObtainStyledAttributes.getColor(zs.m.W5, 0);
        typedArrayObtainStyledAttributes.recycle();
        gVar.Q(context);
        gVar.b0(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(gVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        gVar.a0(ViewCompat.v(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(zs.i.f128752n, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(zs.g.A);
        this.f43028q = timePickerView;
        timePickerView.E(this);
        this.f43029r = (ViewStub) viewGroup2.findViewById(zs.g.f128728w);
        this.D = (MaterialButton) viewGroup2.findViewById(zs.g.f128732y);
        TextView textView = (TextView) viewGroup2.findViewById(zs.g.f128702j);
        int i11 = this.f43035x;
        if (i11 != 0) {
            textView.setText(i11);
        } else if (!TextUtils.isEmpty(this.f43036y)) {
            textView.setText(this.f43036y);
        }
        v(this.D);
        Button button = (Button) viewGroup2.findViewById(zs.g.f128734z);
        button.setOnClickListener(new a());
        int i12 = this.f43037z;
        if (i12 != 0) {
            button.setText(i12);
        } else if (!TextUtils.isEmpty(this.A)) {
            button.setText(this.A);
        }
        Button button2 = (Button) viewGroup2.findViewById(zs.g.f128730x);
        this.E = button2;
        button2.setOnClickListener(new b());
        int i13 = this.B;
        if (i13 != 0) {
            this.E.setText(i13);
        } else if (!TextUtils.isEmpty(this.C)) {
            this.E.setText(this.C);
        }
        u();
        this.D.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f43032u = null;
        this.f43030s = null;
        this.f43031t = null;
        TimePickerView timePickerView = this.f43028q;
        if (timePickerView != null) {
            timePickerView.E(null);
            this.f43028q = null;
        }
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f43027p.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.G);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.F);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f43035x);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f43036y);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f43037z);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.A);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.B);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.C);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.H);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f43032u instanceof m) {
            view.postDelayed(new Runnable() { // from class: com.google.android.material.timepicker.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.b(this.f43023a);
                }
            }, 100L);
        }
    }

    public int p() {
        return this.G.f43057e;
    }

    @Override // androidx.fragment.app.o
    public void setCancelable(boolean z11) {
        super.setCancelable(z11);
        u();
    }
}

package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.z;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
class m implements TimePickerView.f, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f43075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f43076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextWatcher f43077c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextWatcher f43078d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ChipTextInputComboView f43079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ChipTextInputComboView f43080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f43081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final EditText f43082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EditText f43083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MaterialButtonToggleGroup f43084j;

    class a extends z {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    m.this.f43076b.j(0);
                } else {
                    m.this.f43076b.j(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    class b extends z {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    m.this.f43076b.h(0);
                } else {
                    m.this.f43076b.h(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.this.c(((Integer) view.getTag(zs.g.f128717q0)).intValue());
        }
    }

    class d extends com.google.android.material.timepicker.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f43088e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i11, h hVar) {
            super(context, i11);
            this.f43088e = hVar;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.a
        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.x0(view.getResources().getString(this.f43088e.c(), String.valueOf(this.f43088e.d())));
        }
    }

    class e extends com.google.android.material.timepicker.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f43090e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, int i11, h hVar) {
            super(context, i11);
            this.f43090e = hVar;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.a
        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.x0(view.getResources().getString(zs.k.f128779n, String.valueOf(this.f43090e.f43057e)));
        }
    }

    public m(LinearLayout linearLayout, h hVar) {
        this.f43075a = linearLayout;
        this.f43076b = hVar;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(zs.g.f128724u);
        this.f43079e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(zs.g.f128718r);
        this.f43080f = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(zs.g.f128722t);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(zs.g.f128722t);
        textView.setText(resources.getString(zs.k.f128782q));
        textView2.setText(resources.getString(zs.k.f128781p));
        chipTextInputComboView.setTag(zs.g.f128717q0, 12);
        chipTextInputComboView2.setTag(zs.g.f128717q0, 10);
        if (hVar.f43055c == 0) {
            j();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.c(hVar.e());
        chipTextInputComboView.c(hVar.f());
        this.f43082h = chipTextInputComboView2.e().getEditText();
        this.f43083i = chipTextInputComboView.e().getEditText();
        this.f43081g = new k(chipTextInputComboView2, chipTextInputComboView, hVar);
        chipTextInputComboView2.setChipDelegate(new d(linearLayout.getContext(), zs.k.f128776k, hVar));
        chipTextInputComboView.setChipDelegate(new e(linearLayout.getContext(), zs.k.f128778m, hVar));
        f();
    }

    public static /* synthetic */ void a(m mVar, MaterialButtonToggleGroup materialButtonToggleGroup, int i11, boolean z11) {
        mVar.getClass();
        if (z11) {
            mVar.f43076b.k(i11 == zs.g.f128714p ? 1 : 0);
        }
    }

    private void d() {
        this.f43082h.addTextChangedListener(this.f43078d);
        this.f43083i.addTextChangedListener(this.f43077c);
    }

    private void g() {
        this.f43082h.removeTextChangedListener(this.f43078d);
        this.f43083i.removeTextChangedListener(this.f43077c);
    }

    private void i(h hVar) {
        g();
        Locale locale = this.f43075a.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(hVar.f43057e));
        String str2 = String.format(locale, "%02d", Integer.valueOf(hVar.d()));
        this.f43079e.setText(str);
        this.f43080f.setText(str2);
        d();
        k();
    }

    private void j() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f43075a.findViewById(zs.g.f128716q);
        this.f43084j = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.l
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z11) {
                m.a(this.f43074a, materialButtonToggleGroup2, i11, z11);
            }
        });
        this.f43084j.setVisibility(0);
        k();
    }

    private void k() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f43084j;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.e(this.f43076b.f43059g == 0 ? zs.g.f128712o : zs.g.f128714p);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void c(int i11) {
        this.f43076b.f43058f = i11;
        this.f43079e.setChecked(i11 == 12);
        this.f43080f.setChecked(i11 == 10);
        k();
    }

    public void e() {
        this.f43079e.setChecked(false);
        this.f43080f.setChecked(false);
    }

    public void f() {
        d();
        i(this.f43076b);
        this.f43081g.a();
    }

    public void h() {
        this.f43079e.setChecked(this.f43076b.f43058f == 12);
        this.f43080f.setChecked(this.f43076b.f43058f == 10);
    }

    @Override // com.google.android.material.timepicker.j
    public void hide() {
        View focusedChild = this.f43075a.getFocusedChild();
        if (focusedChild != null) {
            d0.l(focusedChild, false);
        }
        this.f43075a.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.j
    public void invalidate() {
        i(this.f43076b);
    }

    @Override // com.google.android.material.timepicker.j
    public void show() {
        this.f43075a.setVisibility(0);
        c(this.f43076b.f43058f);
    }
}

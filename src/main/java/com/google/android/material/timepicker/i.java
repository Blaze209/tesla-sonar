package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes5.dex */
class i implements ClockHandView.c, TimePickerView.f, TimePickerView.e, ClockHandView.b, j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f43060f = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f43061g = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f43062h = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimePickerView f43063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f43064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f43065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f43066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f43067e = false;

    class a extends com.google.android.material.timepicker.a {
        a(Context context, int i11) {
            super(context, i11);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.a
        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.x0(view.getResources().getString(i.this.f43064b.c(), String.valueOf(i.this.f43064b.d())));
        }
    }

    class b extends com.google.android.material.timepicker.a {
        b(Context context, int i11) {
            super(context, i11);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.a
        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.x0(view.getResources().getString(zs.k.f128779n, String.valueOf(i.this.f43064b.f43057e)));
        }
    }

    public i(TimePickerView timePickerView, h hVar) {
        this.f43063a = timePickerView;
        this.f43064b = hVar;
        h();
    }

    private String[] f() {
        return this.f43064b.f43055c == 1 ? f43061g : f43060f;
    }

    private int g() {
        return (this.f43064b.d() * 30) % 360;
    }

    private void i(int i11, int i12) {
        h hVar = this.f43064b;
        if (hVar.f43057e == i12 && hVar.f43056d == i11) {
            return;
        }
        this.f43063a.performHapticFeedback(4);
    }

    private void k() {
        h hVar = this.f43064b;
        int i11 = 1;
        if (hVar.f43058f == 10 && hVar.f43055c == 1 && hVar.f43056d >= 12) {
            i11 = 2;
        }
        this.f43063a.D(i11);
    }

    private void l() {
        TimePickerView timePickerView = this.f43063a;
        h hVar = this.f43064b;
        timePickerView.L(hVar.f43059g, hVar.d(), this.f43064b.f43057e);
    }

    private void m() {
        n(f43060f, "%d");
        n(f43062h, "%02d");
    }

    private void n(String[] strArr, String str) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr[i11] = h.b(this.f43063a.getResources(), strArr[i11], str);
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f11, boolean z11) {
        this.f43067e = true;
        h hVar = this.f43064b;
        int i11 = hVar.f43057e;
        int i12 = hVar.f43056d;
        if (hVar.f43058f == 10) {
            this.f43063a.setHandRotation(this.f43066d, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) androidx.core.content.b.getSystemService(this.f43063a.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                j(12, true);
            }
        } else {
            int iRound = Math.round(f11);
            if (!z11) {
                this.f43064b.j(((iRound + 15) / 30) * 5);
                this.f43065c = this.f43064b.f43057e * 6;
            }
            this.f43063a.setHandRotation(this.f43065c, z11);
        }
        this.f43067e = false;
        l();
        i(i12, i11);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.e
    public void b(int i11) {
        this.f43064b.k(i11);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void c(int i11) {
        j(i11, true);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void d(float f11, boolean z11) {
        if (this.f43067e) {
            return;
        }
        h hVar = this.f43064b;
        int i11 = hVar.f43056d;
        int i12 = hVar.f43057e;
        int iRound = Math.round(f11);
        h hVar2 = this.f43064b;
        if (hVar2.f43058f == 12) {
            hVar2.j((iRound + 3) / 6);
            this.f43065c = (float) Math.floor(this.f43064b.f43057e * 6);
        } else {
            int i13 = (iRound + 15) / 30;
            if (hVar2.f43055c == 1) {
                i13 %= 12;
                if (this.f43063a.C() == 2) {
                    i13 += 12;
                }
            }
            this.f43064b.h(i13);
            this.f43066d = g();
        }
        if (z11) {
            return;
        }
        l();
        i(i11, i12);
    }

    public void h() {
        if (this.f43064b.f43055c == 0) {
            this.f43063a.J();
        }
        this.f43063a.B(this);
        this.f43063a.G(this);
        this.f43063a.F(this);
        this.f43063a.setOnActionUpListener(this);
        m();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.j
    public void hide() {
        this.f43063a.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.j
    public void invalidate() {
        this.f43066d = g();
        h hVar = this.f43064b;
        this.f43065c = hVar.f43057e * 6;
        j(hVar.f43058f, false);
        l();
    }

    void j(int i11, boolean z11) {
        boolean z12 = i11 == 12;
        this.f43063a.setAnimateOnTouchUp(z12);
        this.f43064b.f43058f = i11;
        this.f43063a.setValues(z12 ? f43062h : f(), z12 ? zs.k.f128779n : this.f43064b.c());
        k();
        this.f43063a.setHandRotation(z12 ? this.f43065c : this.f43066d, z11);
        this.f43063a.setActiveSelection(i11);
        this.f43063a.setMinuteHourDelegate(new a(this.f43063a.getContext(), zs.k.f128776k));
        this.f43063a.setHourClickDelegate(new b(this.f43063a.getContext(), zs.k.f128778m));
    }

    @Override // com.google.android.material.timepicker.j
    public void show() {
        this.f43063a.setVisibility(0);
    }
}

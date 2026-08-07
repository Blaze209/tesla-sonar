package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
class TimePickerView extends ConstraintLayout {
    private final Chip A;
    private final ClockHandView B;
    private final ClockFaceView C;
    private final MaterialButtonToggleGroup D;
    private final View.OnClickListener E;
    private e F;
    private f G;
    private d H;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Chip f43016z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.G != null) {
                TimePickerView.this.G.c(((Integer) view.getTag(zs.g.f128717q0)).intValue());
            }
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            d dVar = TimePickerView.this.H;
            if (dVar == null) {
                return false;
            }
            dVar.h();
            return true;
        }
    }

    class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GestureDetector f43019a;

        c(GestureDetector gestureDetector) {
            this.f43019a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f43019a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
        void h();
    }

    interface e {
        void b(int i11);
    }

    interface f {
        void c(int i11);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    private void H() {
        this.f43016z.setTag(zs.g.f128717q0, 12);
        this.A.setTag(zs.g.f128717q0, 10);
        this.f43016z.setOnClickListener(this.E);
        this.A.setOnClickListener(this.E);
        this.f43016z.setAccessibilityClassName("android.view.View");
        this.A.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void I() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f43016z.setOnTouchListener(cVar);
        this.A.setOnTouchListener(cVar);
    }

    private void K(Chip chip, boolean z11) {
        chip.setChecked(z11);
        ViewCompat.r0(chip, z11 ? 2 : 0);
    }

    public static /* synthetic */ void y(TimePickerView timePickerView, MaterialButtonToggleGroup materialButtonToggleGroup, int i11, boolean z11) {
        if (!z11) {
            timePickerView.getClass();
            return;
        }
        e eVar = timePickerView.F;
        if (eVar != null) {
            eVar.b(i11 == zs.g.f128714p ? 1 : 0);
        }
    }

    public void B(ClockHandView.c cVar) {
        this.B.b(cVar);
    }

    int C() {
        return this.C.K();
    }

    void D(int i11) {
        this.C.O(i11);
    }

    void E(d dVar) {
        this.H = dVar;
    }

    void F(e eVar) {
        this.F = eVar;
    }

    void G(f fVar) {
        this.G = fVar;
    }

    public void J() {
        this.D.setVisibility(0);
    }

    @SuppressLint({"DefaultLocale"})
    public void L(int i11, int i12, int i13) {
        this.D.e(i11 == 1 ? zs.g.f128714p : zs.g.f128712o);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(i13));
        String str2 = String.format(locale, "%02d", Integer.valueOf(i12));
        if (!TextUtils.equals(this.f43016z.getText(), str)) {
            this.f43016z.setText(str);
        }
        if (TextUtils.equals(this.A.getText(), str2)) {
            return;
        }
        this.A.setText(str2);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (view == this && i11 == 0) {
            this.A.sendAccessibilityEvent(8);
        }
    }

    public void setActiveSelection(int i11) {
        K(this.f43016z, i11 == 12);
        K(this.A, i11 == 10);
    }

    public void setAnimateOnTouchUp(boolean z11) {
        this.B.setAnimateOnTouchUp(z11);
    }

    public void setHandRotation(float f11) {
        this.B.setHandRotation(f11);
    }

    public void setHourClickDelegate(androidx.core.view.a aVar) {
        ViewCompat.p0(this.f43016z, aVar);
    }

    public void setMinuteHourDelegate(androidx.core.view.a aVar) {
        ViewCompat.p0(this.A, aVar);
    }

    public void setOnActionUpListener(ClockHandView.b bVar) {
        this.B.setOnActionUpListener(bVar);
    }

    public void setValues(String[] strArr, int i11) {
        this.C.setValues(strArr, i11);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setHandRotation(float f11, boolean z11) {
        this.B.setHandRotation(f11, z11);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.E = new a();
        LayoutInflater.from(context).inflate(zs.i.f128751m, this);
        this.C = (ClockFaceView) findViewById(zs.g.f128706l);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(zs.g.f128716q);
        this.D = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.n
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i12, boolean z11) {
                TimePickerView.y(this.f43092a, materialButtonToggleGroup2, i12, z11);
            }
        });
        this.f43016z = (Chip) findViewById(zs.g.f128726v);
        this.A = (Chip) findViewById(zs.g.f128720s);
        this.B = (ClockHandView) findViewById(zs.g.f128708m);
        I();
        H();
    }
}

package com.reactcommunity.rndatetimepicker;

import android.annotation.SuppressLint;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class h extends TimePickerDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TimePicker f48322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private y f48324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimePickerDialog.OnTimeSetListener f48325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f48326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f48327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f48328g;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f48329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TimePicker f48330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f48331c;

        a(int i11, TimePicker timePicker, int i12) {
            this.f48329a = i11;
            this.f48330b = timePicker;
            this.f48331c = i12;
        }

        private void a() {
            this.f48330b.setHour(this.f48331c);
            this.f48330b.setMinute(this.f48329a);
        }

        private void b() {
            View viewFindFocus = this.f48330b.findFocus();
            if (!(viewFindFocus instanceof EditText)) {
                Log.e("RN-datetimepicker", "could not set selection on time picker, this is a known issue on some Huawei devices");
            } else {
                EditText editText = (EditText) viewFindFocus;
                editText.setSelection(editText.getText().length());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!h.this.i()) {
                a();
            } else if (this.f48329a > 5) {
                a();
                b();
            }
        }
    }

    public h(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i11, int i12, int i13, boolean z11, y yVar) {
        super(context, onTimeSetListener, i11, i12, z11);
        this.f48326e = new Handler();
        this.f48323b = i13;
        this.f48325d = onTimeSetListener;
        this.f48324c = yVar;
        this.f48328g = context;
    }

    private void b(String str) {
        if (f()) {
            throw new RuntimeException(str);
        }
    }

    private void c(TimePicker timePicker, int i11, int i12) {
        b("spinner never needs to be corrected because wrong values are not offered to user (both in scrolling and textInput mode)!");
        a aVar = new a(i12, timePicker, i11);
        this.f48327f = aVar;
        this.f48326e.postDelayed(aVar, 500L);
    }

    private int d() {
        return e(this.f48322a.getCurrentMinute().intValue());
    }

    private int e(int i11) {
        return f() ? i11 * this.f48323b : i11;
    }

    private boolean f() {
        return this.f48324c == y.SPINNER;
    }

    public static boolean g(int i11) {
        return i11 >= 1 && i11 <= 30 && 60 % i11 == 0;
    }

    private boolean h(int i11) {
        b("minutesNeedCorrection is not intended to be used with spinner, spinner won't allow picking invalid values");
        return m() && i11 != l(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        View viewFindViewById = findViewById(this.f48328g.getResources().getIdentifier("input_mode", "id", "android"));
        return viewFindViewById != null && viewFindViewById.hasFocus();
    }

    @SuppressLint({"DefaultLocale"})
    private void j() {
        NumberPicker numberPicker = (NumberPicker) findViewById(this.f48328g.getResources().getIdentifier("minute", "id", "android"));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue((60 / this.f48323b) - 1);
        ArrayList arrayList = new ArrayList(60 / this.f48323b);
        int i11 = 0;
        while (i11 < 60) {
            arrayList.add(String.format("%02d", Integer.valueOf(i11)));
            i11 += this.f48323b;
        }
        numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
    }

    private void k() {
        TimePicker timePicker = this.f48322a;
        if (timePicker == null) {
            Log.e("RN-datetimepicker", "time picker was null");
            return;
        }
        int iIntValue = timePicker.getCurrentMinute().intValue();
        if (!f()) {
            this.f48322a.setCurrentMinute(Integer.valueOf(l(iIntValue)));
        } else {
            j();
            this.f48322a.setCurrentMinute(Integer.valueOf(l(iIntValue) / this.f48323b));
        }
    }

    private int l(int i11) {
        int iRound = Math.round(i11 / this.f48323b);
        int i12 = this.f48323b;
        int i13 = iRound * i12;
        return i13 == 60 ? i13 - i12 : i13;
    }

    private boolean m() {
        return this.f48323b != 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48322a = (TimePicker) findViewById(this.f48328g.getResources().getIdentifier("timePicker", "id", "android"));
        if (m()) {
            k();
        }
    }

    @Override // android.app.TimePickerDialog, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i11) {
        boolean z11 = m() || f();
        TimePicker timePicker = this.f48322a;
        if (timePicker == null || i11 != -1 || !z11) {
            super.onClick(dialogInterface, i11);
            return;
        }
        timePicker.clearFocus();
        int iIntValue = this.f48322a.getCurrentHour().intValue();
        int iD = d();
        if (m()) {
            iD = l(iD);
        }
        TimePickerDialog.OnTimeSetListener onTimeSetListener = this.f48325d;
        if (onTimeSetListener != null) {
            onTimeSetListener.onTimeSet(this.f48322a, iIntValue, iD);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f48326e.removeCallbacks(this.f48327f);
        super.onDetachedFromWindow();
    }

    @Override // android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public void onTimeChanged(TimePicker timePicker, int i11, int i12) {
        int iE = e(i12);
        this.f48326e.removeCallbacks(this.f48327f);
        if (f() || !h(iE)) {
            super.onTimeChanged(timePicker, i11, i12);
        } else {
            c(timePicker, i11, l(iE));
        }
    }

    @Override // android.app.TimePickerDialog
    public void updateTime(int i11, int i12) {
        if (!m()) {
            super.updateTime(i11, i12);
        } else if (f()) {
            super.updateTime(i11, l(d()) / this.f48323b);
        } else {
            super.updateTime(i11, l(i12));
        }
    }

    public h(Context context, int i11, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i12, int i13, int i14, boolean z11, y yVar) {
        super(context, i11, onTimeSetListener, i12, i13, z11);
        this.f48326e = new Handler();
        this.f48323b = i14;
        this.f48325d = onTimeSetListener;
        this.f48324c = yVar;
        this.f48328g = context;
    }
}

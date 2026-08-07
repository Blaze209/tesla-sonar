package com.reactcommunity.rndatetimepicker;

import android.R;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TimePicker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
public class q extends h {
    public q(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i11, int i12, int i13, boolean z11, y yVar) {
        super(context, onTimeSetListener, i11, i12, i13, z11, yVar);
        n(context, i11, i12, z11, yVar);
    }

    private void n(Context context, int i11, int i12, boolean z11, y yVar) {
        if (Build.VERSION.SDK_INT == 24 && yVar == y.SPINNER) {
            try {
                context.obtainStyledAttributes(null, (int[]) Class.forName("com.android.internal.R$styleable").getField("TimePicker").get(null), R.attr.timePickerStyle, 0).recycle();
                TimePicker timePicker = (TimePicker) z.a(TimePickerDialog.class, TimePicker.class, "mTimePicker").get(this);
                Field fieldA = z.a(TimePicker.class, Class.forName("android.widget.TimePicker$TimePickerDelegate"), "mDelegate");
                Object obj = fieldA.get(timePicker);
                Class<?> cls = Class.forName("android.widget.TimePickerSpinnerDelegate");
                if (obj.getClass() != cls) {
                    fieldA.set(timePicker, null);
                    timePicker.removeAllViews();
                    Class cls2 = Integer.TYPE;
                    Constructor<?> constructor = cls.getConstructor(TimePicker.class, Context.class, AttributeSet.class, cls2, cls2);
                    constructor.setAccessible(true);
                    fieldA.set(timePicker, constructor.newInstance(timePicker, context, null, Integer.valueOf(R.attr.timePickerStyle), 0));
                    timePicker.setIs24HourView(Boolean.valueOf(z11));
                    timePicker.setCurrentHour(Integer.valueOf(i11));
                    timePicker.setCurrentMinute(Integer.valueOf(i12));
                    timePicker.setOnTimeChangedListener(this);
                }
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    @Override // com.reactcommunity.rndatetimepicker.h, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.reactcommunity.rndatetimepicker.h, android.app.TimePickerDialog, android.content.DialogInterface.OnClickListener
    public /* bridge */ /* synthetic */ void onClick(DialogInterface dialogInterface, int i11) {
        super.onClick(dialogInterface, i11);
    }

    @Override // com.reactcommunity.rndatetimepicker.h, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
    }

    @Override // com.reactcommunity.rndatetimepicker.h, android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public /* bridge */ /* synthetic */ void onTimeChanged(TimePicker timePicker, int i11, int i12) {
        super.onTimeChanged(timePicker, i11, i12);
    }

    @Override // com.reactcommunity.rndatetimepicker.h, android.app.TimePickerDialog
    public /* bridge */ /* synthetic */ void updateTime(int i11, int i12) {
        super.updateTime(i11, i12);
    }

    public q(Context context, int i11, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i12, int i13, int i14, boolean z11, y yVar) {
        super(context, i11, onTimeSetListener, i12, i13, i14, z11, yVar);
        n(context, i12, i13, z11, yVar);
    }
}

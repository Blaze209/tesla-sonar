package com.reactcommunity.rndatetimepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class x extends androidx.fragment.app.o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TimePickerDialog f48372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TimePickerDialog.OnTimeSetListener f48373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private DialogInterface.OnDismissListener f48374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private DialogInterface.OnClickListener f48375p;

    private TimePickerDialog b(Bundle bundle) {
        androidx.fragment.app.u activity = getActivity();
        TimePickerDialog timePickerDialogC = c(bundle, activity, this.f48373n);
        if (bundle != null) {
            d.s(bundle, timePickerDialogC, this.f48375p);
            if (activity != null) {
                timePickerDialogC.setOnShowListener(d.r(activity, timePickerDialogC, bundle, d.l(bundle) == y.SPINNER));
            }
        }
        return timePickerDialogC;
    }

    static TimePickerDialog c(Bundle bundle, Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        j jVar = new j(bundle);
        int iB = jVar.b();
        int iC = jVar.c();
        boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
        if (bundle != null) {
            zIs24HourFormat = bundle.getBoolean("is24Hour", DateFormat.is24HourFormat(context));
        }
        boolean z11 = zIs24HourFormat;
        int i11 = (bundle == null || !h.g(bundle.getInt("minuteInterval"))) ? 1 : bundle.getInt("minuteInterval");
        y yVarL = d.l(bundle);
        return yVarL == y.SPINNER ? new q(context, i.f48334b, onTimeSetListener, iB, iC, i11, z11, yVarL) : new q(context, onTimeSetListener, iB, iC, i11, z11, yVarL);
    }

    public void d(DialogInterface.OnDismissListener onDismissListener) {
        this.f48374o = onDismissListener;
    }

    void e(DialogInterface.OnClickListener onClickListener) {
        this.f48375p = onClickListener;
    }

    public void f(TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.f48373n = onTimeSetListener;
    }

    public void g(Bundle bundle) {
        j jVar = new j(bundle);
        this.f48372m.updateTime(jVar.b(), jVar.c());
    }

    @Override // androidx.fragment.app.o
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        TimePickerDialog timePickerDialogB = b(getArguments());
        this.f48372m = timePickerDialogB;
        return timePickerDialogB;
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f48374o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}

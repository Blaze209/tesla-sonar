package com.reactcommunity.rndatetimepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.annotation.NonNull;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ValidFragment"})
public class l extends androidx.fragment.app.o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private DatePickerDialog f48340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private DatePickerDialog.OnDateSetListener f48341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private DialogInterface.OnDismissListener f48342o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private DialogInterface.OnClickListener f48343p;

    public static /* synthetic */ void b(Bundle bundle, long j11, long j12, DatePicker datePicker, DatePicker datePicker2, int i11, int i12, int i13) {
        Calendar calendar = Calendar.getInstance(d.m(bundle));
        calendar.set(i11, i12, i13, 0, 0, 0);
        calendar.setTimeInMillis(Math.min(Math.max(calendar.getTimeInMillis(), j11), j12));
        if (datePicker.getYear() == calendar.get(1) && datePicker.getMonth() == calendar.get(2) && datePicker.getDayOfMonth() == calendar.get(5)) {
            return;
        }
        datePicker.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    private DatePickerDialog c(Bundle bundle) {
        final Bundle bundle2;
        androidx.fragment.app.u activity = getActivity();
        DatePickerDialog datePickerDialogD = d(bundle, activity, this.f48341n);
        if (bundle != null) {
            d.s(bundle, datePickerDialogD, this.f48343p);
            if (activity != null) {
                m mVarK = d.k(bundle);
                datePickerDialogD.setOnShowListener(d.d(d.p(datePickerDialogD, mVarK == m.DEFAULT && bundle.getBoolean("startOnYearSelection")), d.r(activity, datePickerDialogD, bundle, mVarK == m.SPINNER)));
            }
        }
        final DatePicker datePicker = datePickerDialogD.getDatePicker();
        final long jO = d.o(bundle);
        final long jN = d.n(bundle);
        if (bundle.containsKey("minimumDate")) {
            datePicker.setMinDate(jO);
        } else {
            datePicker.setMinDate(-2208988800001L);
        }
        if (bundle.containsKey("maximumDate")) {
            datePicker.setMaxDate(jN);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (bundle.containsKey("firstDayOfWeek")) {
            datePicker.setFirstDayOfWeek(bundle.getInt("firstDayOfWeek"));
        }
        if (i11 < 26 || !(bundle.containsKey("maximumDate") || bundle.containsKey("minimumDate"))) {
            bundle2 = bundle;
        } else {
            bundle2 = bundle;
            datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() { // from class: com.reactcommunity.rndatetimepicker.k
                @Override // android.widget.DatePicker.OnDateChangedListener
                public final void onDateChanged(DatePicker datePicker2, int i12, int i13, int i14) {
                    l.b(bundle2, jO, jN, datePicker, datePicker2, i12, i13, i14);
                }
            });
        }
        if (bundle2.containsKey("testID")) {
            datePicker.setTag(bundle2.getString("testID"));
        }
        return datePickerDialogD;
    }

    @NonNull
    static DatePickerDialog d(Bundle bundle, Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
        j jVar = new j(bundle);
        int iF = jVar.f();
        int iD = jVar.d();
        int iA = jVar.a();
        m mVarK = d.k(bundle);
        if (bundle != null && bundle.getString("display", null) != null) {
            mVarK = m.valueOf(bundle.getString("display").toUpperCase(Locale.US));
        }
        m mVar = mVarK;
        return mVar == m.SPINNER ? new p(context, i.f48333a, onDateSetListener, iF, iD, iA, mVar) : new p(context, onDateSetListener, iF, iD, iA, mVar);
    }

    void e(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.f48341n = onDateSetListener;
    }

    void f(DialogInterface.OnDismissListener onDismissListener) {
        this.f48342o = onDismissListener;
    }

    void g(DialogInterface.OnClickListener onClickListener) {
        this.f48343p = onClickListener;
    }

    public void i(Bundle bundle) {
        j jVar = new j(bundle);
        this.f48340m.updateDate(jVar.f(), jVar.d(), jVar.a());
    }

    @Override // androidx.fragment.app.o
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        DatePickerDialog datePickerDialogC = c(getArguments());
        this.f48340m = datePickerDialogC;
        return datePickerDialogC;
    }

    @Override // androidx.fragment.app.o, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f48342o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}

package com.reactcommunity.rndatetimepicker;

import android.R;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.DatePicker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class p extends DatePickerDialog {
    public p(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i11, int i12, int i13, m mVar) {
        super(context, onDateSetListener, i11, i12, i13);
        a(context, i11, i12, i13, mVar);
    }

    private void a(Context context, int i11, int i12, int i13, m mVar) {
        if (Build.VERSION.SDK_INT == 24 && mVar == m.SPINNER) {
            try {
                context.obtainStyledAttributes(null, (int[]) Class.forName("com.android.internal.R$styleable").getField("DatePicker").get(null), R.attr.datePickerStyle, 0).recycle();
                DatePicker datePicker = (DatePicker) z.a(DatePickerDialog.class, DatePicker.class, "mDatePicker").get(this);
                Field fieldA = z.a(DatePicker.class, Class.forName("android.widget.DatePickerSpinnerDelegate"), "mDelegate");
                Object obj = fieldA.get(datePicker);
                if (obj.getClass() != Class.forName("android.widget.DatePickerSpinnerDelegate")) {
                    fieldA.set(datePicker, null);
                    datePicker.removeAllViews();
                    Class cls = Integer.TYPE;
                    Method declaredMethod = DatePicker.class.getDeclaredMethod("createSpinnerUIDelegate", Context.class, AttributeSet.class, cls, cls);
                    declaredMethod.setAccessible(true);
                    fieldA.set(datePicker, declaredMethod.invoke(datePicker, context, null, Integer.valueOf(R.attr.datePickerStyle), 0));
                    datePicker.setCalendarViewShown(false);
                    datePicker.init(i11, i12, i13, this);
                }
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
        if (mVar != m.SPINNER || getDatePicker() == null) {
            return;
        }
        getDatePicker().setCalendarViewShown(false);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
    }

    public p(Context context, int i11, DatePickerDialog.OnDateSetListener onDateSetListener, int i12, int i13, int i14, m mVar) {
        super(context, i11, onDateSetListener, i12, i13, i14);
        a(context, i12, i13, i14, mVar);
    }
}

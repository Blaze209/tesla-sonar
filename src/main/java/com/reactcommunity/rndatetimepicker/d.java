package com.reactcommunity.rndatetimepicker;

import android.R;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static /* synthetic */ void a(DialogInterface.OnShowListener[] onShowListenerArr, DialogInterface dialogInterface) {
        for (DialogInterface.OnShowListener onShowListener : onShowListenerArr) {
            if (onShowListener != null) {
                onShowListener.onShow(dialogInterface);
            }
        }
    }

    public static /* synthetic */ void b(boolean z11, AlertDialog alertDialog, DialogInterface dialogInterface) {
        View viewFindViewById;
        if (z11 && (alertDialog instanceof DatePickerDialog)) {
            DatePicker datePicker = ((DatePickerDialog) alertDialog).getDatePicker();
            int identifier = Resources.getSystem().getIdentifier("date_picker_header_year", "id", "android");
            if (identifier == 0 || (viewFindViewById = datePicker.findViewById(identifier)) == null) {
                return;
            }
            viewFindViewById.performClick();
        }
    }

    public static /* synthetic */ void c(AlertDialog alertDialog, Context context, Bundle bundle, boolean z11, DialogInterface dialogInterface) {
        Button button = alertDialog.getButton(-1);
        Button button2 = alertDialog.getButton(-2);
        Button button3 = alertDialog.getButton(-3);
        int iJ = j(context);
        t(button, "positive", bundle, z11, iJ);
        t(button2, "negative", bundle, z11, iJ);
        t(button3, "neutral", bundle, z11, iJ);
    }

    @NonNull
    public static DialogInterface.OnShowListener d(@NonNull final DialogInterface.OnShowListener... onShowListenerArr) {
        return new DialogInterface.OnShowListener() { // from class: com.reactcommunity.rndatetimepicker.b
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                d.a(onShowListenerArr, dialogInterface);
            }
        };
    }

    public static Bundle e(ReadableMap readableMap) {
        Bundle bundleF = f(readableMap);
        if (readableMap.hasKey("minimumDate") && !readableMap.isNull("minimumDate")) {
            bundleF.putLong("minimumDate", (long) readableMap.getDouble("minimumDate"));
        }
        if (readableMap.hasKey("maximumDate") && !readableMap.isNull("maximumDate")) {
            bundleF.putLong("maximumDate", (long) readableMap.getDouble("maximumDate"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            bundleF.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            bundleF.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            bundleF.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        if (readableMap.hasKey("testID") && !readableMap.isNull("testID")) {
            bundleF.putString("testID", readableMap.getString("testID"));
        }
        if (readableMap.hasKey("fullscreen") && !readableMap.isNull("fullscreen")) {
            bundleF.putBoolean("fullscreen", readableMap.getBoolean("fullscreen"));
        }
        if (readableMap.hasKey("firstDayOfWeek") && !readableMap.isNull("firstDayOfWeek")) {
            bundleF.putInt("firstDayOfWeek", readableMap.getInt("firstDayOfWeek") + 1);
        }
        if (readableMap.hasKey("startOnYearSelection") && !readableMap.isNull("startOnYearSelection")) {
            bundleF.putBoolean("startOnYearSelection", readableMap.getBoolean("startOnYearSelection"));
        }
        return bundleF;
    }

    public static Bundle f(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("value") && !readableMap.isNull("value")) {
            bundle.putLong("value", (long) readableMap.getDouble("value"));
        }
        if (readableMap.hasKey("timeZoneName") && !readableMap.isNull("timeZoneName")) {
            bundle.putString("timeZoneName", readableMap.getString("timeZoneName"));
        }
        if (readableMap.hasKey("title") && !readableMap.isNull("title")) {
            bundle.putString("title", readableMap.getString("title"));
        }
        if (readableMap.hasKey("initialInputMode") && !readableMap.isNull("initialInputMode")) {
            bundle.putString("initialInputMode", readableMap.getString("initialInputMode"));
        }
        return bundle;
    }

    public static Bundle g(ReadableMap readableMap) {
        Bundle bundleF = f(readableMap);
        if (readableMap.hasKey("is24Hour") && !readableMap.isNull("is24Hour")) {
            bundleF.putBoolean("is24Hour", readableMap.getBoolean("is24Hour"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            bundleF.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            bundleF.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("minuteInterval") && !readableMap.isNull("minuteInterval")) {
            bundleF.putInt("minuteInterval", readableMap.getInt("minuteInterval"));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            bundleF.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        return bundleF;
    }

    public static void h(androidx.fragment.app.u uVar, String str, Promise promise) {
        if (uVar == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to close a " + str + " dialog while not attached to an Activity");
            return;
        }
        try {
            androidx.fragment.app.o oVar = (androidx.fragment.app.o) uVar.getSupportFragmentManager().o0(str);
            boolean z11 = oVar != null;
            if (z11) {
                oVar.dismiss();
            }
            promise.resolve(Boolean.valueOf(z11));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    private static Integer i(Bundle bundle, String str) {
        Bundle bundle2;
        int i11;
        Bundle bundle3 = bundle.getBundle("dialogButtons");
        if (bundle3 == null || (bundle2 = bundle3.getBundle(str)) == null || (i11 = (int) bundle2.getDouble("textColor", 0.0d)) == 0) {
            return null;
        }
        return Integer.valueOf(i11);
    }

    public static int j(@NonNull Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.textColorPrimary, typedValue, true);
        int i11 = typedValue.resourceId;
        return i11 != 0 ? androidx.core.content.b.getColor(context, i11) : typedValue.data;
    }

    public static m k(Bundle bundle) {
        return (bundle == null || bundle.getString("display", null) == null) ? m.DEFAULT : m.valueOf(bundle.getString("display").toUpperCase(Locale.US));
    }

    public static y l(Bundle bundle) {
        return (bundle == null || bundle.getString("display", null) == null) ? y.DEFAULT : y.valueOf(bundle.getString("display").toUpperCase(Locale.US));
    }

    public static TimeZone m(Bundle bundle) {
        if (bundle != null && bundle.containsKey("timeZoneOffsetInMinutes")) {
            return new SimpleTimeZone(((int) bundle.getLong("timeZoneOffsetInMinutes")) * 60000, "GMT");
        }
        if (bundle != null && bundle.containsKey("timeZoneName")) {
            String string = bundle.getString("timeZoneName");
            if ("GMT".equals(string)) {
                return DesugarTimeZone.getTimeZone("GMT");
            }
            if (!"GMT".equals(DesugarTimeZone.getTimeZone(string).getID())) {
                return DesugarTimeZone.getTimeZone(string);
            }
            uo.c.e(null, "'" + string + "' does not exist in TimeZone.getAvailableIDs(). Falling back to TimeZone.getDefault()=" + TimeZone.getDefault().getID());
        }
        return TimeZone.getDefault();
    }

    public static long n(Bundle bundle) {
        if (!bundle.containsKey("maximumDate")) {
            return Long.MAX_VALUE;
        }
        Calendar calendar = Calendar.getInstance(m(bundle));
        calendar.setTimeInMillis(bundle.getLong("maximumDate"));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public static long o(Bundle bundle) {
        if (!bundle.containsKey("minimumDate")) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance(m(bundle));
        calendar.setTimeInMillis(bundle.getLong("minimumDate"));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    @NonNull
    public static DialogInterface.OnShowListener p(final AlertDialog alertDialog, final boolean z11) {
        return new DialogInterface.OnShowListener() { // from class: com.reactcommunity.rndatetimepicker.c
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                d.b(z11, alertDialog, dialogInterface);
            }
        };
    }

    private static void q(Bundle bundle, AlertDialog alertDialog, int i11, DialogInterface.OnClickListener onClickListener) {
        if (bundle == null || bundle.getString(AnnotatedPrivateKey.LABEL) == null) {
            return;
        }
        alertDialog.setButton(i11, bundle.getString(AnnotatedPrivateKey.LABEL), onClickListener);
    }

    @NonNull
    public static DialogInterface.OnShowListener r(@NonNull final Context context, final AlertDialog alertDialog, final Bundle bundle, final boolean z11) {
        return new DialogInterface.OnShowListener() { // from class: com.reactcommunity.rndatetimepicker.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                d.c(alertDialog, context, bundle, z11, dialogInterface);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(@NonNull Bundle bundle, AlertDialog alertDialog, DialogInterface.OnClickListener onClickListener) {
        Bundle bundle2 = bundle.getBundle("dialogButtons");
        if (bundle2 == null) {
            return;
        }
        q(bundle2.getBundle("neutral"), alertDialog, -3, onClickListener);
        DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) alertDialog;
        q(bundle2.getBundle("positive"), alertDialog, -1, onClickListener2);
        q(bundle2.getBundle("negative"), alertDialog, -2, onClickListener2);
    }

    private static void t(Button button, String str, Bundle bundle, boolean z11, int i11) {
        if (button == null) {
            return;
        }
        Integer numI = i(bundle, str);
        if (z11 || numI != null) {
            if (numI != null) {
                i11 = numI.intValue();
            }
            button.setTextColor(i11);
        }
    }
}

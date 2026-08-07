package yh0;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0006\u001a\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0006\"\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0007*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Landroid/content/Context;", "", "b", "(Landroid/content/Context;)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Z", "Landroidx/appcompat/app/c;", "g", "(Landroid/content/Context;)Landroidx/appcompat/app/c;", "Landroidx/lifecycle/LifecycleOwner;", "h", "(Landroid/content/Context;)Landroidx/lifecycle/LifecycleOwner;", "Ljn0/h0;", "c", "(Landroid/content/Context;)V", IntegerTokenConverter.CONVERTER_KEY, "f", "e", "a", "activity", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f {
    public static final androidx.appcompat.app.c a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        if (context instanceof androidx.appcompat.app.c) {
            return (androidx.appcompat.app.c) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        p013kotlin.jvm.internal.s.j(baseContext, "getBaseContext(...)");
        return a(baseContext);
    }

    public static final String b(Context context) {
        String string;
        p013kotlin.jvm.internal.s.k(context, "<this>");
        int i11 = context.getApplicationInfo().labelRes;
        if (i11 == 0) {
            try {
                CharSequence charSequence = context.getApplicationInfo().nonLocalizedLabel;
                return (charSequence == null || (string = charSequence.toString()) == null) ? context.getApplicationInfo().loadLabel(context.getPackageManager()).toString() : string;
            } catch (PackageManager.NameNotFoundException unused) {
                return "";
            }
        }
        String string2 = context.getString(i11);
        p013kotlin.jvm.internal.s.h(string2);
        return string2;
    }

    public static final void c(Context context) {
        View currentFocus;
        p013kotlin.jvm.internal.s.k(context, "<this>");
        androidx.appcompat.app.c cVarA = a(context);
        if (cVarA == null || (currentFocus = cVarA.getCurrentFocus()) == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static final boolean d(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static final boolean e(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean f(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isEnabled();
    }

    public static final androidx.appcompat.app.c g(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        androidx.appcompat.app.c cVarA = a(context);
        if (cVarA != null) {
            return cVarA;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final LifecycleOwner h(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        androidx.appcompat.app.c cVarA = a(context);
        if (cVarA != null) {
            return cVarA;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void i(Context context) {
        View currentFocus;
        p013kotlin.jvm.internal.s.k(context, "<this>");
        androidx.appcompat.app.c cVarA = a(context);
        if (cVarA == null || (currentFocus = cVarA.getCurrentFocus()) == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(currentFocus, 1);
        }
    }
}

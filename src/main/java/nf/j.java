package nf;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.material.textfield.TextInputLayout;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\u000b\u001a\u00020\u0005*\u00020\b2\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0005*\u00020\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0005*\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\u0005*\u00020\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/google/android/material/textfield/TextInputLayout;", "", "styleResId", "Landroid/content/Context;", "localizedContext", "Ljn0/h0;", "g", "(Lcom/google/android/material/textfield/TextInputLayout;ILandroid/content/Context;)V", "Landroid/widget/TextView;", "", "formatHyperLink", "h", "(Landroid/widget/TextView;ILandroid/content/Context;Z)V", "", "replacementToken", "", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;", "a", "(Ljava/lang/String;)Ljava/lang/CharSequence;", AnalyticsAttribute.Error, "j", "(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "(Lcom/google/android/material/textfield/TextInputLayout;)V", "Landroid/view/View;", "e", "(Landroid/view/View;)V", "f", "ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class j {
    public static final CharSequence a(String str) {
        s.k(str, "<this>");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new URLSpan(""), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static final CharSequence b(String str, String replacementToken) {
        s.k(str, "<this>");
        s.k(replacementToken, "replacementToken");
        if (t.f1(str, new String[]{replacementToken}, false, 0, 6, null).size() - 1 != 2) {
            return str;
        }
        int iR0 = t.r0(str, replacementToken, 0, true);
        int iC0 = t.C0(str, replacementToken, 0, false, 6, null) - replacementToken.length();
        SpannableString spannableString = new SpannableString(t.T(str, replacementToken, "", true));
        spannableString.setSpan(new URLSpan(""), iR0, iC0, 33);
        return spannableString;
    }

    public static /* synthetic */ CharSequence c(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "%#";
        }
        return b(str, str2);
    }

    public static final void d(TextInputLayout textInputLayout) {
        s.k(textInputLayout, "<this>");
        textInputLayout.setError(null);
        textInputLayout.setErrorEnabled(false);
    }

    public static final void e(View view) {
        s.k(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final void f(View view) {
        s.k(view, "<this>");
        view.requestFocus();
        view.clearFocus();
    }

    public static final void g(TextInputLayout textInputLayout, int i11, Context localizedContext) {
        s.k(textInputLayout, "<this>");
        s.k(localizedContext, "localizedContext");
        TypedArray typedArrayObtainStyledAttributes = localizedContext.obtainStyledAttributes(i11, new int[]{R.attr.hint});
        s.j(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        textInputLayout.setHint(typedArrayObtainStyledAttributes.getString(0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.TextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final void h(TextView textView, int i11, Context localizedContext, boolean z11) {
        String str;
        s.k(textView, "<this>");
        s.k(localizedContext, "localizedContext");
        TypedArray typedArrayObtainStyledAttributes = localizedContext.obtainStyledAttributes(i11, new int[]{R.attr.text});
        s.j(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(0);
        ?? C = string;
        if (string == null) {
            str = "";
        }
        if (z11) {
            C = str;
            C = c(C, null, 1, null);
        }
        C = str;
        textView.setText(C);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void i(TextView textView, int i11, Context context, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        h(textView, i11, context, z11);
    }

    public static final void j(TextInputLayout textInputLayout, String error) {
        s.k(textInputLayout, "<this>");
        s.k(error, "error");
        textInputLayout.setErrorEnabled(true);
        textInputLayout.setError(error);
    }
}

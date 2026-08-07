package v80;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.widget.ProgressBar;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import q80.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0007J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 J%\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\bH\u0001¢\u0006\u0004\b)\u0010\u000b¨\u0006*"}, d2 = {"Lv80/a;", "", "<init>", "()V", "", "hexColor", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", OrcaFlavourKeys.FONT_SIZE, "g", "(I)I", "dimension", "f", InquiryField.StringField.TYPE, "h", "Landroid/widget/ProgressBar;", "progressBar", "Lq80/q;", "uiCustomization", "Ljn0/h0;", "a", "(Landroid/widget/ProgressBar;Lq80/q;)V", "Landroidx/appcompat/app/c;", "activity", "statusBarColor", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/appcompat/app/c;I)V", "color", "", "factor", DateTokenConverter.CONVERTER_KEY, "(IF)I", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "text", "Lq80/c;", "customization", "Landroid/text/SpannableString;", "b", "(Landroid/content/Context;Ljava/lang/String;Lq80/c;)Landroid/text/SpannableString;", "c", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f118417a = new a();

    private a() {
    }

    public static final String e(String hexColor) {
        Object objB;
        s.k(hexColor, "hexColor");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Color.parseColor(hexColor);
            objB = jn0.s.b(hexColor);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.e(objB) == null) {
            return (String) objB;
        }
        throw new InvalidInputException("Unable to parse color: " + hexColor, null, 2, null);
    }

    public static final int f(int dimension) {
        if (dimension >= 0) {
            return dimension;
        }
        throw new InvalidInputException("Dimension must be greater or equal to 0", null, 2, null);
    }

    public static final int g(int fontSize) {
        if (fontSize > 0) {
            return fontSize;
        }
        throw new InvalidInputException("Font size must be greater than 0", null, 2, null);
    }

    public static final String h(String string) {
        s.k(string, "string");
        if (p013kotlin.text.t.y0(string)) {
            throw new InvalidInputException("String must not be null or empty", null, 2, null);
        }
        return string;
    }

    public final void a(ProgressBar progressBar, q uiCustomization) {
        String strA;
        s.k(progressBar, "progressBar");
        if (uiCustomization == null || (strA = uiCustomization.a()) == null) {
            return;
        }
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor(strA)));
    }

    public final SpannableString b(Context context, String text, q80.c customization) {
        s.k(context, "context");
        s.k(text, "text");
        s.k(customization, "customization");
        SpannableString spannableString = new SpannableString(text);
        String strF = customization.f();
        if (strF != null) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(strF)), 0, spannableString.length(), 0);
        }
        Integer numValueOf = Integer.valueOf(customization.v());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, numValueOf.intValue(), context.getResources().getDisplayMetrics())), 0, spannableString.length(), 0);
        }
        String strR = customization.r();
        if (strR != null) {
            spannableString.setSpan(new TypefaceSpan(strR), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    public final int c(int color) {
        return d(color, 0.8f);
    }

    public final int d(int color, float factor) {
        return Color.argb(Color.alpha(color), Math.min(Math.max((int) (Color.red(color) * factor), 0), 255), Math.min(Math.max((int) (Color.green(color) * factor), 0), 255), Math.min(Math.max((int) (Color.blue(color) * factor), 0), 255));
    }

    public final void i(androidx.appcompat.app.c activity, int statusBarColor) {
        s.k(activity, "activity");
        activity.getWindow().setStatusBarColor(statusBarColor);
    }
}

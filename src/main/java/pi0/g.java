package pi0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.Base64;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import oi0.n5;
import oi0.o5;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aE\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0016\u001a\u00020\u0010*\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001d\"\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001e¨\u0006 "}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lql0/e;", "c", "(Landroid/content/Context;)Lql0/e;", "Loi0/n5;", "T", "", "Lco0/d;", "type", "Lkotlin/Function1;", "", "predicate", "a", "(Ljava/util/List;Lco0/d;Lwn0/l;)Loi0/n5;", "Landroid/widget/TextView;", "", "text", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/widget/TextView;Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "e", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "", "defaultColor", "textSizeWidth", "Landroid/graphics/drawable/Drawable;", "b", "(Landroid/content/Context;II)Landroid/graphics/drawable/Drawable;", "Lql0/e;", "markwon", "ui-step-renderer_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ql0.e f103057a;

    public static final <T extends n5> T a(List<? extends n5> list, co0.d<T> type, wn0.l<? super T, Boolean> predicate) {
        T t11;
        s.k(list, "<this>");
        s.k(type, "type");
        s.k(predicate, "predicate");
        Iterator<? extends n5> it = list.iterator();
        while (it.hasNext()) {
            T t12 = (T) it.next();
            if (type.j(t12)) {
                s.i(t12, "null cannot be cast to non-null type T of com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt.findFirst");
                if (predicate.invoke(t12).booleanValue()) {
                    return t12;
                }
            } else if ((t12 instanceof o5) && (t11 = (T) a(((o5) t12).getChildren(), type, predicate)) != null) {
                return t11;
            }
        }
        return null;
    }

    public static final Drawable b(Context context, int i11, int i12) {
        s.k(context, "context");
        int color = androidx.core.content.b.getColor(context, qh0.b.f105536a);
        int color2 = androidx.core.content.b.getColor(context, qh0.b.f105537b);
        double d11 = k5.d.d(i11, color);
        double d12 = k5.d.d(i11, color2);
        float fA = (float) yh0.h.a(8.0d);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (d11 < d12) {
            color = color2;
        }
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadii(new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
        gradientDrawable.setSize(i12 + ((int) yh0.h.a(24.0d)), gradientDrawable.getMinimumHeight());
        return new InsetDrawable((Drawable) gradientDrawable, (int) yh0.h.a(4.0d));
    }

    private static final ql0.e c(Context context) {
        ql0.e eVar = f103057a;
        if (eVar != null) {
            return eVar;
        }
        ql0.e eVarB = ql0.e.b(context);
        f103057a = eVarB;
        s.j(eVarB, "also(...)");
        return eVarB;
    }

    public static final void d(TextView textView, String text) {
        s.k(textView, "<this>");
        s.k(text, "text");
        Context context = textView.getContext();
        s.j(context, "getContext(...)");
        ql0.e eVarC = c(context);
        Spanned spannedE = eVarC.e(text);
        s.j(spannedE, "toMarkdown(...)");
        eVarC.d(textView, spannedE);
        if (spannedE.getSpans(0, spannedE.length(), tl0.g.class).length == 0 && spannedE.getSpans(0, spannedE.length(), URLSpan.class).length == 0) {
            textView.setMovementMethod(null);
        }
    }

    public static final String e(Bitmap bitmap) {
        s.k(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 3);
        s.h(strEncodeToString);
        return strEncodeToString;
    }
}

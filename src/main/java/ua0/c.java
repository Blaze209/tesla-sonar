package ua0;

import android.content.Context;
import ie0.k;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "", "b", "(Landroid/content/Context;)Ljava/lang/String;", "a", "app_prodGlobalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final String a(Context context) {
        s.k(context, "<this>");
        k kVar = k.f77594a;
        String strB = kVar.b(context);
        if (strB == null) {
            strB = kVar.a(context);
        }
        if (strB != null && !s.f(strB, "")) {
            String upperCase = strB.toUpperCase(Locale.ROOT);
            s.j(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        String country = context.getResources().getConfiguration().getLocales().get(0).getCountry();
        s.j(country, "getCountry(...)");
        String upperCase2 = country.toUpperCase(Locale.ROOT);
        s.j(upperCase2, "toUpperCase(...)");
        return upperCase2;
    }

    public static final String b(Context context) {
        s.k(context, "<this>");
        String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        s.j(language, "getLanguage(...)");
        return language;
    }
}

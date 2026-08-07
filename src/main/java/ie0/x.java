package ie0;

import android.content.Context;
import androidx.core.os.LocaleListCompat;
import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Lie0/x;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "c", "(Landroid/content/Context;)Ljava/lang/String;", "b", "()Ljava/lang/String;", "locale", "a", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/util/Set;", "SUPPORTED_LANGUAGES", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f77622a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Set<String> SUPPORTED_LANGUAGES = d1.i("ar", "ca", "cs", "da", "de", "en", "en_GB", "el", "es", "fi", "fr_CA", "fr", "hr", "hu", "he", "is", "it", "ja", "ko", "nb", "nl", "pl", "pt", "ro", "sl", "sv", "th", "tr", "zh_Hans_CN", "zh_Hant_HK", "zh_Hant_TW");

    private x() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x009a  */
    public final String a(String locale) {
        String strV;
        p013kotlin.jvm.internal.s.k(locale, "locale");
        switch (locale) {
            case "zh-Hans":
                strV = "zh_Hans_CN";
                break;
            case "zh-Hant":
                strV = "zh_Hant_HK";
                break;
            case "en-GB":
                strV = "en_GB";
                break;
            case "es-PR":
                strV = "es";
                break;
            case "fr-CA":
                strV = "fr_CA";
                break;
            case "zh-CN":
                strV = "zh_Hans_CN";
                break;
            case "zh-HK":
            case "zh-MO":
                strV = "zh_Hant_HK";
                break;
            case "zh-TW":
                strV = "zh_Hant_TW";
                break;
            case "zh-Hans-CN":
                strV = "zh_Hans_CN";
                break;
            case "zh-Hant-MO":
                strV = "zh_Hant_HK";
                break;
            case "zh-Hant-TW":
                strV = "zh_Hant_TW";
                break;
            default:
                strV = p013kotlin.text.t.V(locale, "-", "_", false, 4, null);
                break;
        }
        String str = strV;
        Set<String> set = SUPPORTED_LANGUAGES;
        if (set.contains(str)) {
            return str;
        }
        String str2 = (String) p013kotlin.collections.v.o0(p013kotlin.text.t.f1(str, new String[]{"_"}, false, 0, 6, null));
        return set.contains(str2) ? str2 : "en";
    }

    public final String b() {
        String languageTag;
        LocaleListCompat localeListCompatE = LocaleListCompat.e();
        p013kotlin.jvm.internal.s.j(localeListCompatE, "getDefault(...)");
        Locale localeC = localeListCompatE.c(0);
        return (localeC == null || (languageTag = localeC.toLanguageTag()) == null) ? "en" : a(languageTag);
    }

    public final String c(Context context) {
        Locale localeC;
        String country;
        p013kotlin.jvm.internal.s.k(context, "context");
        LocaleListCompat localeListCompatA = q5.f.a(context.getApplicationContext().getResources().getConfiguration());
        if (localeListCompatA.h() <= 0) {
            localeListCompatA = null;
        }
        return (localeListCompatA == null || (localeC = localeListCompatA.c(0)) == null || (country = localeC.getCountry()) == null) ? "-" : country;
    }
}

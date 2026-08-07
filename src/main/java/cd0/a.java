package cd0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.common.Scopes;
import ie0.r;
import java.util.List;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u00072\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"", "a", "(Ljava/lang/String;)Ljava/lang/String;", Scopes.EMAIL, "", "b", "(Ljava/lang/String;)Z", "", "unauthorizedVINs", "unauthorizedEnergySiteIds", "isFeedbackEligible", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)Ljava/lang/String;", "contents", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/util/List;)Z", "e", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "f", "logging-filter_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final String a(String str) {
        String str2;
        s.k(str, "<this>");
        if (str.length() < 84) {
            return str;
        }
        int i11 = 83;
        int i12 = 83;
        while (i11 < str.length()) {
            int i13 = i11;
            while (i13 < str.length() && p013kotlin.text.a.c(str.charAt(i13))) {
                i13++;
            }
            if (i13 >= str.length() || str.charAt(i13) != '[') {
                break;
            }
            str2 = str;
            int iU0 = t.u0(str2, ']', i13, false, 4, null);
            if (iU0 != -1) {
                i12 = iU0 + 1;
                i11 = i12;
                str = str2;
            }
            String strSubstring = str2.substring(0, i12);
            s.j(strSubstring, "substring(...)");
            return strSubstring;
        }
        str2 = str;
        String strSubstring2 = str2.substring(0, i12);
        s.j(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    public static final boolean b(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            s.j(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                return t.L(lowerCase, "@tesla.com", false, 2, null);
            }
        }
        return false;
    }

    public static final String c(String str, String email, List<String> unauthorizedVINs, List<String> unauthorizedEnergySiteIds, boolean z11) {
        s.k(str, "<this>");
        s.k(email, "email");
        s.k(unauthorizedVINs, "unauthorizedVINs");
        s.k(unauthorizedEnergySiteIds, "unauthorizedEnergySiteIds");
        if (r.c() || str.length() == 0) {
            return str;
        }
        if (d(str, unauthorizedVINs)) {
            return a(str) + " REDACTED due to unauthorized vehicle information";
        }
        if (e(str, email, z11)) {
            return a(str) + " REDACTED due to location information";
        }
        if (!f(str, unauthorizedEnergySiteIds)) {
            return str;
        }
        return a(str) + " REDACTED due to unauthorized energy site information";
    }

    private static final boolean d(String str, List<String> list) {
        if (list.isEmpty() || str.length() == 0) {
            return false;
        }
        for (String str2 : list) {
            String strSubstring = str2.substring(str2.length() - 6);
            s.j(strSubstring, "substring(...)");
            if (t.h0(str, strSubstring, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean e(String str, String str2, boolean z11) {
        if (b(str2) || z11) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return t.h0(lowerCase, OrcaKeys.LATITUDE, false, 2, null) || t.h0(lowerCase, OrcaKeys.LONGITUDE, false, 2, null) || t.h0(lowerCase, "\"lat\":", false, 2, null) || t.h0(lowerCase, "\"lon\":", false, 2, null);
    }

    private static final boolean f(String str, List<String> list) {
        for (String str2 : list) {
            if (str2.length() > 0 && t.h0(str, str2, false, 2, null)) {
                return true;
            }
        }
        return false;
    }
}

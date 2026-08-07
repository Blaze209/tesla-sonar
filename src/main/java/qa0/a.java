package qa0;

import cc0.f;
import cc0.g;
import cc0.h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007\u001a\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\u0004*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcc0/f;", "g", "()Lcc0/f;", "b", "", AnalyticsAttribute.Reason, "e", "(Ljava/lang/String;)Lcc0/f;", AnalyticsAttribute.Error, "a", "", "statusCode", DateTokenConverter.CONVERTER_KEY, "(I)Lcc0/f;", "Lic0/h;", "result", "f", "(Lic0/h;)Lcc0/f;", "c", "(Ljava/lang/String;)Ljava/lang/String;", "formatted", "analytics_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final f a(String error) {
        s.k(error, "error");
        return new f(g.ERROR, null, null, null, new h(c(error), null, 2, null), null, 46, null);
    }

    public static final f b() {
        return new f(g.SUCCESS, new cc0.a(false, null, 2, null), null, null, null, null, 60, null);
    }

    public static final String c(String str) {
        s.k(str, "<this>");
        Locale US = Locale.US;
        s.j(US, "US");
        String lowerCase = str.toLowerCase(US);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final f d(int i11) {
        return new f(g.REASON, null, null, null, new h("ownerapi: {{" + i11 + "}}", null, 2, null), null, 46, null);
    }

    public static final f e(String reason) {
        s.k(reason, "reason");
        return new f(g.REASON, null, null, null, new h(c(reason), null, 2, null), null, 46, null);
    }

    public static final f f(ic0.h result) {
        s.k(result, "result");
        return new f(g.COMMAND_RESULT, null, null, null, new h(c(t.r1(result.name(), "COMMAND_", null, 2, null)), null, 2, null), null, 46, null);
    }

    public static final f g() {
        return new f(g.SUCCESS, new cc0.a(true, null, 2, null), null, null, null, null, 60, null);
    }
}

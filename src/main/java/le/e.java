package le;

import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lle/e;", "", "<init>", "()V", "", InquiryField.DateField.TYPE, "Ljava/util/Locale;", "shopperLocale", "inputFormat", "c", "(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Calendar;", "calendar", "pattern", "a", "(Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f89948a = new e();

    private e() {
    }

    public static /* synthetic */ String b(e eVar, Calendar calendar, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "yyyy-MM-dd'T'HH:mm:ss";
        }
        return eVar.a(calendar, str);
    }

    public static /* synthetic */ String d(e eVar, String str, Locale locale, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = "yyyy-MM-dd'T'HH:mm:ss";
        }
        return eVar.c(str, locale, str2);
    }

    public final String a(Calendar calendar, String pattern) {
        s.k(calendar, "calendar");
        s.k(pattern, "pattern");
        try {
            return new SimpleDateFormat(pattern, Locale.US).format(calendar.getTime());
        } catch (IllegalArgumentException e11) {
            me.a aVar = me.a.ERROR;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = e.class.getName();
                s.h(name);
                String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = t.W0(strU1, "Kt");
                }
                me.b bVarA = companion.a();
                bVarA.b(aVar, "CO." + name, "Provided pattern " + pattern + " is invalid", e11);
            }
            return null;
        }
    }

    public final String c(String date, Locale shopperLocale, String inputFormat) {
        s.k(date, "date");
        s.k(shopperLocale, "shopperLocale");
        s.k(inputFormat, "inputFormat");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(inputFormat, shopperLocale);
            DateFormat dateInstance = DateFormat.getDateInstance(3, shopperLocale);
            Date date2 = simpleDateFormat.parse(date);
            if (date2 != null) {
                return dateInstance.format(date2);
            }
            return null;
        } catch (ParseException e11) {
            me.a aVar = me.a.ERROR;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = e.class.getName();
                s.h(name);
                String strU1 = t.u1(t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = t.W0(strU1, "Kt");
                }
                me.b bVarA = companion.a();
                bVarA.b(aVar, "CO." + name, "Provided date " + date + " does not match the given format " + inputFormat, e11);
            }
            return null;
        }
    }
}

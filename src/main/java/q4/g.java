package q4;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import i4.a0;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lq4/g;", "Li4/a0;", "<init>", "()V", "", InquiryField.StringField.TYPE, "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "locale", "a", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements a0 {
    @Override // i4.a0
    public String a(String string, Locale locale) {
        String lowerCase = string.toLowerCase(locale);
        p013kotlin.jvm.internal.s.j(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}

package p4;

import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001c\u0010\u0006\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004*\n\u0010\u0007\"\u00020\u00002\u00020\u0000¨\u0006\b"}, d2 = {"Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "", "a", "(Ljava/util/Locale;)Ljava/lang/String;", "b", "region", "PlatformLocale", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final String a(Locale locale) {
        return locale.toLanguageTag();
    }

    public static final String b(Locale locale) {
        return locale.getCountry();
    }
}

package s30;

import androidx.core.os.LocaleListCompat;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ls30/a;", "", "<init>", "()V", "", "enableLogging", "Lo30/d;", "b", "(Z)Lo30/d;", "Ljava/util/Locale;", "a", "()Ljava/util/Locale;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {
    public final Locale a() {
        LocaleListCompat localeListCompatD = LocaleListCompat.d();
        if (localeListCompatD.g()) {
            localeListCompatD = null;
        }
        if (localeListCompatD != null) {
            return localeListCompatD.c(0);
        }
        return null;
    }

    public final o30.d b(boolean enableLogging) {
        return o30.d.INSTANCE.a(enableLogging);
    }
}

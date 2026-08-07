package re;

import java.util.IllformedLocaleException;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lre/b;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "", "a", "(Ljava/util/Locale;)Z", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f107853a = new b();

    private b() {
    }

    public static final boolean a(Locale locale) {
        s.k(locale, "locale");
        try {
            new Locale.Builder().setLocale(locale).build();
            return true;
        } catch (IllformedLocaleException unused) {
            return false;
        }
    }
}

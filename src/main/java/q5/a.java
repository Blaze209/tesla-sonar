package q5;

import android.os.Build;
import android.os.ext.SdkExtensions;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lq5/a;", "", "<init>", "()V", "", "codename", "buildCodename", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "c", "()Z", "", "b", "I", "R_EXTENSION_INT", "S_EXTENSION_INT", DateTokenConverter.CONVERTER_KEY, "T_EXTENSION_INT", "e", "AD_SERVICES_EXTENSION_INT", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f104815a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int R_EXTENSION_INT;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int S_EXTENSION_INT;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final int T_EXTENSION_INT;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final int AD_SERVICES_EXTENSION_INT;

    /* JADX INFO: renamed from: q5.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq5/a$a;", "", "<init>", "()V", "", "extension", "a", "(I)I", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class C2213a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2213a f104820a = new C2213a();

        private C2213a() {
        }

        public final int a(int extension) {
            return SdkExtensions.getExtensionVersion(extension);
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i11 >= 30 ? C2213a.f104820a.a(30) : 0;
        S_EXTENSION_INT = i11 >= 30 ? C2213a.f104820a.a(31) : 0;
        T_EXTENSION_INT = i11 >= 30 ? C2213a.f104820a.a(33) : 0;
        AD_SERVICES_EXTENSION_INT = i11 >= 30 ? C2213a.f104820a.a(1000000) : 0;
    }

    private a() {
    }

    public static final boolean a(String codename, String buildCodename) {
        s.k(codename, "codename");
        s.k(buildCodename, "buildCodename");
        if (s.f("REL", buildCodename)) {
            return false;
        }
        Integer numB = b(buildCodename);
        Integer numB2 = b(codename);
        if (numB != null && numB2 != null) {
            return numB.intValue() >= numB2.intValue();
        }
        if (numB != null || numB2 != null) {
            return numB != null;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        s.j(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        s.j(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    private static final Integer b(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        s.j(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return s.f(upperCase, "BAKLAVA") ? 0 : null;
    }

    @jn0.e
    public static final boolean c() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            return true;
        }
        if (i11 < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        s.j(CODENAME, "CODENAME");
        return a("VanillaIceCream", CODENAME);
    }
}

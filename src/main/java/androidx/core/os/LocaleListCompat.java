package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleListCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final LocaleListCompat f7630b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.core.os.a f7631a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Locale[] f7632a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private LocaleListCompat(androidx.core.os.a aVar) {
        this.f7631a = aVar;
    }

    public static LocaleListCompat a(Locale... localeArr) {
        return k(b.a(localeArr));
    }

    public static LocaleListCompat b(String str) {
        if (str == null || str.isEmpty()) {
            return f();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i11 = 0; i11 < length; i11++) {
            localeArr[i11] = a.a(strArrSplit[i11]);
        }
        return a(localeArr);
    }

    public static LocaleListCompat d() {
        return k(b.b());
    }

    public static LocaleListCompat e() {
        return k(b.c());
    }

    public static LocaleListCompat f() {
        return f7630b;
    }

    public static LocaleListCompat k(LocaleList localeList) {
        return new LocaleListCompat(new androidx.core.os.b(localeList));
    }

    public Locale c(int i11) {
        return this.f7631a.get(i11);
    }

    public boolean equals(Object obj) {
        return (obj instanceof LocaleListCompat) && this.f7631a.equals(((LocaleListCompat) obj).f7631a);
    }

    public boolean g() {
        return this.f7631a.isEmpty();
    }

    public int h() {
        return this.f7631a.size();
    }

    public int hashCode() {
        return this.f7631a.hashCode();
    }

    public String i() {
        return this.f7631a.a();
    }

    public Object j() {
        return this.f7631a.b();
    }

    public String toString() {
        return this.f7631a.toString();
    }
}

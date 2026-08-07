package ie0;

import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0006J\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0006R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014¨\u0006#"}, d2 = {"Lie0/y;", "", "<init>", "()V", "", "c", "()Z", DateTokenConverter.CONVERTER_KEY, "e", "a", "f", "b", "h", "g", "Ljava/lang/Boolean;", "cachedIsOHOS", "", "", "Ljava/util/List;", "getHuaweiBrands", "()Ljava/util/List;", "huaweiBrands", "getHonorBrands", "honorBrands", "getXiaomiBrands", "xiaomiBrands", "getOppoBrands", "oppoBrands", "getVivoBrands", "vivoBrands", "getGoogleBrands", "googleBrands", IntegerTokenConverter.CONVERTER_KEY, "getSamsungBrands", "samsungBrands", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Boolean cachedIsOHOS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f77624a = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final List<String> huaweiBrands = p013kotlin.collections.v.e("huawei");

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final List<String> honorBrands = p013kotlin.collections.v.e("honor");

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final List<String> xiaomiBrands = p013kotlin.collections.v.p("xiaomi", "redmi", "blackshark", "poco");

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final List<String> oppoBrands = p013kotlin.collections.v.p("oppo", "realme", "oneplus");

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final List<String> vivoBrands = p013kotlin.collections.v.p("vivo", "iqoo");

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final List<String> googleBrands = p013kotlin.collections.v.e("google");

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final List<String> samsungBrands = p013kotlin.collections.v.e("samsung");

    private y() {
    }

    public final boolean a() {
        List<String> list = oppoBrands;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            String BRAND = Build.BRAND;
            p013kotlin.jvm.internal.s.j(BRAND, "BRAND");
            if (p013kotlin.text.t.f0(BRAND, str, true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        List<String> list = googleBrands;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            String BRAND = Build.BRAND;
            p013kotlin.jvm.internal.s.j(BRAND, "BRAND");
            if (p013kotlin.text.t.f0(BRAND, str, true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        try {
            Class.forName("ohos.utils.system.SystemCapability");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean d() {
        List<String> list = huaweiBrands;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            String BRAND = Build.BRAND;
            p013kotlin.jvm.internal.s.j(BRAND, "BRAND");
            if (p013kotlin.text.t.f0(BRAND, str, true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        List<String> list = xiaomiBrands;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            String BRAND = Build.BRAND;
            p013kotlin.jvm.internal.s.j(BRAND, "BRAND");
            if (p013kotlin.text.t.f0(BRAND, str, true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        List<String> list = vivoBrands;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            String BRAND = Build.BRAND;
            p013kotlin.jvm.internal.s.j(BRAND, "BRAND");
            if (p013kotlin.text.t.f0(BRAND, str, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    public final boolean g() {
        Object objB;
        boolean z11;
        if (cachedIsOHOS == null) {
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(sn0.h.n(new File("/proc/self/cgroup"), null, 1, null));
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            if (jn0.s.g(objB)) {
                objB = null;
            }
            String str = (String) objB;
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
                z11 = lowerCase != null && p013kotlin.text.t.h0(lowerCase, "isulad", false, 2, null);
            }
            cachedIsOHOS = Boolean.valueOf(z11);
        }
        Boolean bool = cachedIsOHOS;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean h() {
        List<String> list = samsungBrands;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str : list) {
            String BRAND = Build.BRAND;
            p013kotlin.jvm.internal.s.j(BRAND, "BRAND");
            if (p013kotlin.text.t.f0(BRAND, str, true)) {
                return true;
            }
        }
        return false;
    }
}

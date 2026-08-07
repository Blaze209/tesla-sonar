package s8;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p7.y;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f110532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f110533d;

    public interface a {
        e a(y yVar);
    }

    public interface b {
        default boolean a(String str) {
            return true;
        }

        default com.google.common.collect.y<String, String> b() {
            return com.google.common.collect.y.x();
        }

        default int c(int i11) {
            return -2147483647;
        }
    }

    public e(String str, String str2, b bVar, int i11) {
        boolean z11 = true;
        s7.a.a(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z11 = false;
        }
        s7.a.a(z11);
        s7.a.f(bVar);
        this.f110530a = str;
        this.f110531b = str2;
        this.f110532c = bVar;
        this.f110533d = i11;
    }

    public boolean a() {
        return this.f110532c.a("br");
    }

    public boolean b() {
        return this.f110532c.a("bl");
    }

    public boolean c() {
        return this.f110532c.a("bs");
    }

    public boolean d() {
        return this.f110532c.a("cid");
    }

    public boolean e() {
        return this.f110532c.a("dl");
    }

    public boolean f() {
        return this.f110532c.a("rtp");
    }

    public boolean g() {
        return this.f110532c.a("mtp");
    }

    public boolean h() {
        return this.f110532c.a("nor");
    }

    public boolean i() {
        return this.f110532c.a("nrr");
    }

    public boolean j() {
        return this.f110532c.a(DateTokenConverter.CONVERTER_KEY);
    }

    public boolean k() {
        return this.f110532c.a("ot");
    }

    public boolean l() {
        return this.f110532c.a("pr");
    }

    public boolean m() {
        return this.f110532c.a("sid");
    }

    public boolean n() {
        return this.f110532c.a("su");
    }

    public boolean o() {
        return this.f110532c.a("st");
    }

    public boolean p() {
        return this.f110532c.a("sf");
    }

    public boolean q() {
        return this.f110532c.a("tb");
    }
}

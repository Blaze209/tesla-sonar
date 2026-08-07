package kb;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements kb.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<a> f85788c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f85789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f85790b;

    /* JADX INFO: renamed from: kb.a$a, reason: collision with other inner class name */
    private static class C1828a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Set<String> f85791a = new HashSet(Arrays.asList(p.d().a()));
    }

    public static class b extends a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean b() {
            return true;
        }
    }

    public static class c extends a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean b() {
            return true;
        }
    }

    public static class d extends a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean b() {
            return false;
        }
    }

    public static class e extends a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    public static class f extends a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class g extends a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class h extends a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class i extends a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f85789a = str;
        this.f85790b = str2;
        f85788c.add(this);
    }

    public static Set<a> d() {
        return Collections.unmodifiableSet(f85788c);
    }

    @Override // kb.e
    public String a() {
        return this.f85789a;
    }

    public abstract boolean b();

    public boolean c() {
        return oq0.a.b(C1828a.f85791a, this.f85790b);
    }

    @Override // kb.e
    public boolean isSupported() {
        return b() || c();
    }
}

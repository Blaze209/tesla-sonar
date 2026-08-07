package pk;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f103128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C2189a f103129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C2189a f103130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f103131d;

        /* JADX INFO: renamed from: pk.i$a$a, reason: collision with other inner class name */
        private static final class C2189a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f103132a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f103133b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            C2189a f103134c;

            private C2189a() {
            }
        }

        private C2189a d() {
            C2189a c2189a = new C2189a();
            this.f103130c.f103134c = c2189a;
            this.f103130c = c2189a;
            return c2189a;
        }

        private a e(String str, Object obj) {
            C2189a c2189aD = d();
            c2189aD.f103133b = obj;
            c2189aD.f103132a = (String) k.g(str);
            return this;
        }

        public a a(String str, int i11) {
            return e(str, String.valueOf(i11));
        }

        public a b(String str, Object obj) {
            return e(str, obj);
        }

        public a c(String str, boolean z11) {
            return e(str, String.valueOf(z11));
        }

        public String toString() {
            boolean z11 = this.f103131d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f103128a);
            sb2.append(CoreConstants.CURLY_LEFT);
            String str = "";
            for (C2189a c2189a = this.f103129b.f103134c; c2189a != null; c2189a = c2189a.f103134c) {
                Object obj = c2189a.f103133b;
                if (!z11 || obj != null) {
                    sb2.append(str);
                    String str2 = c2189a.f103132a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append(CoreConstants.CURLY_RIGHT);
            return sb2.toString();
        }

        private a(String str) {
            C2189a c2189a = new C2189a();
            this.f103129b = c2189a;
            this.f103130c = c2189a;
            this.f103131d = false;
            this.f103128a = (String) k.g(str);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static a b(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}

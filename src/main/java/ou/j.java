package ou;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f100007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C2123b f100008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C2123b f100009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f100010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f100011e;

        private static final class a extends C2123b {
            private a() {
            }
        }

        /* JADX INFO: renamed from: ou.j$b$b, reason: collision with other inner class name */
        static class C2123b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f100012a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f100013b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            C2123b f100014c;

            C2123b() {
            }
        }

        private C2123b d() {
            C2123b c2123b = new C2123b();
            this.f100009c.f100014c = c2123b;
            this.f100009c = c2123b;
            return c2123b;
        }

        private b e(Object obj) {
            d().f100013b = obj;
            return this;
        }

        private b f(String str, Object obj) {
            C2123b c2123bD = d();
            c2123bD.f100013b = obj;
            c2123bD.f100012a = (String) p.m(str);
            return this;
        }

        private a g() {
            a aVar = new a();
            this.f100009c.f100014c = aVar;
            this.f100009c = aVar;
            return aVar;
        }

        private b h(String str, Object obj) {
            a aVarG = g();
            aVarG.f100013b = obj;
            aVarG.f100012a = (String) p.m(str);
            return this;
        }

        private static boolean j(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof m) {
                return !((m) obj).c();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, int i11) {
            return h(str, String.valueOf(i11));
        }

        public b b(String str, long j11) {
            return h(str, String.valueOf(j11));
        }

        public b c(String str, Object obj) {
            return f(str, obj);
        }

        public b i(Object obj) {
            return e(obj);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code duplicated, block: B:19:0x005d  */
        public String toString() {
            String str;
            boolean z11 = this.f100010d;
            boolean z12 = this.f100011e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f100007a);
            sb2.append(CoreConstants.CURLY_LEFT);
            String str2 = "";
            for (C2123b c2123b = this.f100008b.f100014c; c2123b != null; c2123b = c2123b.f100014c) {
                Object obj = c2123b.f100013b;
                if (c2123b instanceof a) {
                    sb2.append(str2);
                    str = c2123b.f100012a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z11) {
                        sb2.append(str2);
                        str = c2123b.f100012a;
                        if (str != null) {
                            sb2.append(str);
                            sb2.append('=');
                        }
                        if (obj == null) {
                            sb2.append(obj);
                        } else {
                            sb2.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z12 || !j(obj)) {
                    sb2.append(str2);
                    str = c2123b.f100012a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null) {
                        sb2.append(obj);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb2.append(CoreConstants.CURLY_RIGHT);
            return sb2.toString();
        }

        private b(String str) {
            C2123b c2123b = new C2123b();
            this.f100008b = c2123b;
            this.f100009c = c2123b;
            this.f100010d = false;
            this.f100011e = false;
            this.f100007a = (String) p.m(str);
        }
    }

    public static <T> T a(T t11, T t12) {
        if (t11 != null) {
            return t11;
        }
        if (t12 != null) {
            return t12;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}

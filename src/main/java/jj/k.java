package jj;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, List<j>> f83855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map<String, String> f83856d;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f83857d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Map<String, List<j>> f83858e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f83859a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, List<j>> f83860b = f83858e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f83861c = true;

        static {
            String strG = g();
            f83857d = strG;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strG)) {
                map.put("User-Agent", Collections.singletonList(new b(strG)));
            }
            f83858e = Collections.unmodifiableMap(map);
        }

        private Map<String, List<j>> d() {
            HashMap map = new HashMap(this.f83860b.size());
            for (Map.Entry<String, List<j>> entry : this.f83860b.entrySet()) {
                map.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return map;
        }

        private void e() {
            if (this.f83859a) {
                this.f83859a = false;
                this.f83860b = d();
            }
        }

        private List<j> f(String str) {
            List<j> list = this.f83860b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f83860b.put(str, arrayList);
            return arrayList;
        }

        static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = property.charAt(i11);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public a a(@NonNull String str, @NonNull String str2) {
            return b(str, new b(str2));
        }

        public a b(@NonNull String str, @NonNull j jVar) {
            if (this.f83861c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public k c() {
            this.f83859a = true;
            return new k(this.f83860b);
        }

        public a h(@NonNull String str, j jVar) {
            e();
            if (jVar == null) {
                this.f83860b.remove(str);
            } else {
                List<j> listF = f(str);
                listF.clear();
                listF.add(jVar);
            }
            if (this.f83861c && "User-Agent".equalsIgnoreCase(str)) {
                this.f83861c = false;
            }
            return this;
        }
    }

    static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final String f83862a;

        b(@NonNull String str) {
            this.f83862a = str;
        }

        @Override // jj.j
        public String a() {
            return this.f83862a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f83862a.equals(((b) obj).f83862a);
            }
            return false;
        }

        public int hashCode() {
            return this.f83862a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f83862a + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
        }
    }

    k(Map<String, List<j>> map) {
        this.f83855c = Collections.unmodifiableMap(map);
    }

    @NonNull
    private String a(@NonNull List<j> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strA = list.get(i11).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i11 != list.size() - 1) {
                    sb2.append(CoreConstants.COMMA_CHAR);
                }
            }
        }
        return sb2.toString();
    }

    private Map<String, String> c() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.f83855c.entrySet()) {
            String strA = a(entry.getValue());
            if (!TextUtils.isEmpty(strA)) {
                map.put(entry.getKey(), strA);
            }
        }
        return map;
    }

    @Override // jj.i
    public Map<String, String> b() {
        if (this.f83856d == null) {
            synchronized (this) {
                try {
                    if (this.f83856d == null) {
                        this.f83856d = Collections.unmodifiableMap(c());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f83856d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f83855c.equals(((k) obj).f83855c);
        }
        return false;
    }

    public int hashCode() {
        return this.f83855c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f83855c + CoreConstants.CURLY_RIGHT;
    }
}

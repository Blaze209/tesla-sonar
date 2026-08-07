package com.fourthline.orca.internal;

import java.util.List;
import java.util.Map;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface Cl {

    public static final class a implements Cl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f25232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f25233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f25234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f25235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C3842t5 f25236f;

        public a(String alias, b method, String path, Map headers, List parameters, C3842t5 body) {
            p013kotlin.jvm.internal.s.k(alias, "alias");
            p013kotlin.jvm.internal.s.k(method, "method");
            p013kotlin.jvm.internal.s.k(path, "path");
            p013kotlin.jvm.internal.s.k(headers, "headers");
            p013kotlin.jvm.internal.s.k(parameters, "parameters");
            p013kotlin.jvm.internal.s.k(body, "body");
            this.f25231a = alias;
            this.f25232b = method;
            this.f25233c = path;
            this.f25234d = headers;
            this.f25235e = parameters;
            this.f25236f = body;
        }

        public final a a(String alias, b method, String path, Map headers, List parameters, C3842t5 body) {
            p013kotlin.jvm.internal.s.k(alias, "alias");
            p013kotlin.jvm.internal.s.k(method, "method");
            p013kotlin.jvm.internal.s.k(path, "path");
            p013kotlin.jvm.internal.s.k(headers, "headers");
            p013kotlin.jvm.internal.s.k(parameters, "parameters");
            p013kotlin.jvm.internal.s.k(body, "body");
            return new a(alias, method, path, headers, parameters, body);
        }

        public Map b() {
            return this.f25234d;
        }

        public final b c() {
            return this.f25232b;
        }

        public List d() {
            return this.f25235e;
        }

        public String e() {
            return this.f25233c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f25231a, aVar.f25231a) && this.f25232b == aVar.f25232b && p013kotlin.jvm.internal.s.f(this.f25233c, aVar.f25233c) && p013kotlin.jvm.internal.s.f(this.f25234d, aVar.f25234d) && p013kotlin.jvm.internal.s.f(this.f25235e, aVar.f25235e) && p013kotlin.jvm.internal.s.f(this.f25236f, aVar.f25236f);
        }

        @Override // com.fourthline.orca.internal.Cl
        public String getAlias() {
            return this.f25231a;
        }

        public int hashCode() {
            return (((((((((this.f25231a.hashCode() * 31) + this.f25232b.hashCode()) * 31) + this.f25233c.hashCode()) * 31) + this.f25234d.hashCode()) * 31) + this.f25235e.hashCode()) * 31) + this.f25236f.hashCode();
        }

        public String toString() {
            return "Default(alias=" + this.f25231a + ", method=" + this.f25232b + ", path=" + this.f25233c + ", headers=" + this.f25234d + ", parameters=" + this.f25235e + ", body=" + this.f25236f + ")";
        }

        public static /* synthetic */ a a(a aVar, String str, b bVar, String str2, Map map, List list, C3842t5 c3842t5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aVar.f25231a;
            }
            if ((i11 & 2) != 0) {
                bVar = aVar.f25232b;
            }
            if ((i11 & 4) != 0) {
                str2 = aVar.f25233c;
            }
            if ((i11 & 8) != 0) {
                map = aVar.f25234d;
            }
            if ((i11 & 16) != 0) {
                list = aVar.f25235e;
            }
            if ((i11 & 32) != 0) {
                c3842t5 = aVar.f25236f;
            }
            List list2 = list;
            C3842t5 c3842t6 = c3842t5;
            return aVar.a(str, bVar, str2, map, list2, c3842t6);
        }

        public final C3842t5 a() {
            return this.f25236f;
        }

        public /* synthetic */ a(String str, b bVar, String str2, Map map, List list, C3842t5 c3842t5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bVar, str2, (i11 & 8) != 0 ? p013kotlin.collections.v0.i() : map, (i11 & 16) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 32) != 0 ? C3842t5.f35548b.a() : c3842t5);
        }
    }

    public enum b {
        GET,
        POST,
        PUT;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f25241e = on0.a.a(a());
    }

    public static final class c implements Cl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f25243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f25244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f25245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f25246e;

        public c(String alias, String path, Map headers, List parameters, List body) {
            p013kotlin.jvm.internal.s.k(alias, "alias");
            p013kotlin.jvm.internal.s.k(path, "path");
            p013kotlin.jvm.internal.s.k(headers, "headers");
            p013kotlin.jvm.internal.s.k(parameters, "parameters");
            p013kotlin.jvm.internal.s.k(body, "body");
            this.f25242a = alias;
            this.f25243b = path;
            this.f25244c = headers;
            this.f25245d = parameters;
            this.f25246e = body;
        }

        public final c a(String alias, String path, Map headers, List parameters, List body) {
            p013kotlin.jvm.internal.s.k(alias, "alias");
            p013kotlin.jvm.internal.s.k(path, "path");
            p013kotlin.jvm.internal.s.k(headers, "headers");
            p013kotlin.jvm.internal.s.k(parameters, "parameters");
            p013kotlin.jvm.internal.s.k(body, "body");
            return new c(alias, path, headers, parameters, body);
        }

        public Map b() {
            return this.f25244c;
        }

        public List c() {
            return this.f25245d;
        }

        public String d() {
            return this.f25243b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p013kotlin.jvm.internal.s.f(this.f25242a, cVar.f25242a) && p013kotlin.jvm.internal.s.f(this.f25243b, cVar.f25243b) && p013kotlin.jvm.internal.s.f(this.f25244c, cVar.f25244c) && p013kotlin.jvm.internal.s.f(this.f25245d, cVar.f25245d) && p013kotlin.jvm.internal.s.f(this.f25246e, cVar.f25246e);
        }

        @Override // com.fourthline.orca.internal.Cl
        public String getAlias() {
            return this.f25242a;
        }

        public int hashCode() {
            return (((((((this.f25242a.hashCode() * 31) + this.f25243b.hashCode()) * 31) + this.f25244c.hashCode()) * 31) + this.f25245d.hashCode()) * 31) + this.f25246e.hashCode();
        }

        public String toString() {
            return "Multipart(alias=" + this.f25242a + ", path=" + this.f25243b + ", headers=" + this.f25244c + ", parameters=" + this.f25245d + ", body=" + this.f25246e + ")";
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, Map map, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cVar.f25242a;
            }
            if ((i11 & 2) != 0) {
                str2 = cVar.f25243b;
            }
            if ((i11 & 4) != 0) {
                map = cVar.f25244c;
            }
            if ((i11 & 8) != 0) {
                list = cVar.f25245d;
            }
            if ((i11 & 16) != 0) {
                list2 = cVar.f25246e;
            }
            List list3 = list2;
            Map map2 = map;
            return cVar.a(str, str2, map2, list, list3);
        }

        public final List a() {
            return this.f25246e;
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f25247a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final C3842t5 f25248b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Map f25249c;

            public a(String key, C3842t5 value, Map headers) {
                p013kotlin.jvm.internal.s.k(key, "key");
                p013kotlin.jvm.internal.s.k(value, "value");
                p013kotlin.jvm.internal.s.k(headers, "headers");
                this.f25247a = key;
                this.f25248b = value;
                this.f25249c = headers;
            }

            public final Map a() {
                return this.f25249c;
            }

            public final String b() {
                return this.f25247a;
            }

            public final C3842t5 c() {
                return this.f25248b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return p013kotlin.jvm.internal.s.f(this.f25247a, aVar.f25247a) && p013kotlin.jvm.internal.s.f(this.f25248b, aVar.f25248b) && p013kotlin.jvm.internal.s.f(this.f25249c, aVar.f25249c);
            }

            public int hashCode() {
                return (((this.f25247a.hashCode() * 31) + this.f25248b.hashCode()) * 31) + this.f25249c.hashCode();
            }

            public String toString() {
                return "BodyPart(key=" + this.f25247a + ", value=" + this.f25248b + ", headers=" + this.f25249c + ")";
            }

            public /* synthetic */ a(String str, C3842t5 c3842t5, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, c3842t5, (i11 & 4) != 0 ? p013kotlin.collections.v0.i() : map);
            }
        }

        public /* synthetic */ c(String str, String str2, Map map, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, map, (i11 & 8) != 0 ? p013kotlin.collections.v.m() : list, list2);
        }
    }

    String getAlias();
}

package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface X3 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f29655c;

        public a(String alias, String url, String destination) {
            p013kotlin.jvm.internal.s.k(alias, "alias");
            p013kotlin.jvm.internal.s.k(url, "url");
            p013kotlin.jvm.internal.s.k(destination, "destination");
            this.f29653a = alias;
            this.f29654b = url;
            this.f29655c = destination;
        }

        public final String a() {
            return this.f29653a;
        }

        public final String b() {
            return this.f29655c;
        }

        public final String c() {
            return this.f29654b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f29653a, aVar.f29653a) && p013kotlin.jvm.internal.s.f(this.f29654b, aVar.f29654b) && p013kotlin.jvm.internal.s.f(this.f29655c, aVar.f29655c);
        }

        public int hashCode() {
            return (((this.f29653a.hashCode() * 31) + this.f29654b.hashCode()) * 31) + this.f29655c.hashCode();
        }

        public String toString() {
            return "Input(alias=" + this.f29653a + ", url=" + this.f29654b + ", destination=" + this.f29655c + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f29656a;

            public a(boolean z11) {
                this.f29656a = z11;
            }

            public final boolean a() {
                return this.f29656a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f29656a == ((a) obj).f29656a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f29656a);
            }

            public String toString() {
                return "Succeed(skipped=" + this.f29656a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

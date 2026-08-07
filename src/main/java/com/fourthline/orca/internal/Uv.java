package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface Uv {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Coordinate f28858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f28859c;

        public a(String signatureId, Coordinate location, String languageCode) {
            p013kotlin.jvm.internal.s.k(signatureId, "signatureId");
            p013kotlin.jvm.internal.s.k(location, "location");
            p013kotlin.jvm.internal.s.k(languageCode, "languageCode");
            this.f28857a = signatureId;
            this.f28858b = location;
            this.f28859c = languageCode;
        }

        public final String a() {
            return this.f28859c;
        }

        public final Coordinate b() {
            return this.f28858b;
        }

        public final String c() {
            return this.f28857a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f28857a, aVar.f28857a) && p013kotlin.jvm.internal.s.f(this.f28858b, aVar.f28858b) && p013kotlin.jvm.internal.s.f(this.f28859c, aVar.f28859c);
        }

        public int hashCode() {
            return (((this.f28857a.hashCode() * 31) + this.f28858b.hashCode()) * 31) + this.f28859c.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f28857a + ", location=" + this.f28858b + ", languageCode=" + this.f28859c + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f28860a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1061262212;
            }

            public String toString() {
                return "KycRequired";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Uv$b$b, reason: collision with other inner class name */
        public static final class C0525b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0525b f28861a = new C0525b();

            private C0525b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0525b);
            }

            public int hashCode() {
                return 1273180278;
            }

            public String toString() {
                return "Rejected";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f28862a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -111140065;
            }

            public String toString() {
                return "SelfieRequired";
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f28863a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1604987798;
            }

            public String toString() {
                return "UserConsentRequired";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

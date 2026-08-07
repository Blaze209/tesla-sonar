package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3746qv {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qv$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0603a f34897a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qv$a$a, reason: collision with other inner class name */
        public static final class C0603a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f34898a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f34899b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f34900c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final List f34901d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final c f34902e;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.qv$a$a$a, reason: collision with other inner class name */
            public static final class C0604a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f34903a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f34904b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final int f34905c;

                public C0604a(String id2, String text, int i11) {
                    p013kotlin.jvm.internal.s.k(id2, "id");
                    p013kotlin.jvm.internal.s.k(text, "text");
                    this.f34903a = id2;
                    this.f34904b = text;
                    this.f34905c = i11;
                }

                public final String a() {
                    return this.f34903a;
                }

                public final String b() {
                    return this.f34904b;
                }

                public final int c() {
                    return this.f34905c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0604a)) {
                        return false;
                    }
                    C0604a c0604a = (C0604a) obj;
                    return p013kotlin.jvm.internal.s.f(this.f34903a, c0604a.f34903a) && p013kotlin.jvm.internal.s.f(this.f34904b, c0604a.f34904b) && this.f34905c == c0604a.f34905c;
                }

                public int hashCode() {
                    return (((this.f34903a.hashCode() * 31) + this.f34904b.hashCode()) * 31) + Integer.hashCode(this.f34905c);
                }

                public String toString() {
                    return "Clauses(id=" + this.f34903a + ", text=" + this.f34904b + ", version=" + this.f34905c + ")";
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.qv$a$a$b */
            public static final class b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f34906a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f34907b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final int f34908c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private final String f34909d;

                public b(String id2, String displayName, int i11, String url) {
                    p013kotlin.jvm.internal.s.k(id2, "id");
                    p013kotlin.jvm.internal.s.k(displayName, "displayName");
                    p013kotlin.jvm.internal.s.k(url, "url");
                    this.f34906a = id2;
                    this.f34907b = displayName;
                    this.f34908c = i11;
                    this.f34909d = url;
                }

                public final String a() {
                    return this.f34907b;
                }

                public final String b() {
                    return this.f34906a;
                }

                public final String c() {
                    return this.f34909d;
                }

                public final int d() {
                    return this.f34908c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return p013kotlin.jvm.internal.s.f(this.f34906a, bVar.f34906a) && p013kotlin.jvm.internal.s.f(this.f34907b, bVar.f34907b) && this.f34908c == bVar.f34908c && p013kotlin.jvm.internal.s.f(this.f34909d, bVar.f34909d);
                }

                public int hashCode() {
                    return (((((this.f34906a.hashCode() * 31) + this.f34907b.hashCode()) * 31) + Integer.hashCode(this.f34908c)) * 31) + this.f34909d.hashCode();
                }

                public String toString() {
                    return "LegalDocumentDetails(id=" + this.f34906a + ", displayName=" + this.f34907b + ", version=" + this.f34908c + ", url=" + this.f34909d + ")";
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.qv$a$a$c */
            public static final class c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f34910a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f34911b;

                public c(String validation, int i11) {
                    p013kotlin.jvm.internal.s.k(validation, "validation");
                    this.f34910a = validation;
                    this.f34911b = i11;
                }

                public final int a() {
                    return this.f34911b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return p013kotlin.jvm.internal.s.f(this.f34910a, cVar.f34910a) && this.f34911b == cVar.f34911b;
                }

                public int hashCode() {
                    return (this.f34910a.hashCode() * 31) + Integer.hashCode(this.f34911b);
                }

                public String toString() {
                    return "OtpSettings(validation=" + this.f34910a + ", length=" + this.f34911b + ")";
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.qv$a$a$d */
            public static final class d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f34912a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f34913b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final String f34914c;

                public d(String id2, String fileName, String displayName) {
                    p013kotlin.jvm.internal.s.k(id2, "id");
                    p013kotlin.jvm.internal.s.k(fileName, "fileName");
                    p013kotlin.jvm.internal.s.k(displayName, "displayName");
                    this.f34912a = id2;
                    this.f34913b = fileName;
                    this.f34914c = displayName;
                }

                public final String a() {
                    return this.f34914c;
                }

                public final String b() {
                    return this.f34913b;
                }

                public final String c() {
                    return this.f34912a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return p013kotlin.jvm.internal.s.f(this.f34912a, dVar.f34912a) && p013kotlin.jvm.internal.s.f(this.f34913b, dVar.f34913b) && p013kotlin.jvm.internal.s.f(this.f34914c, dVar.f34914c);
                }

                public int hashCode() {
                    return (((this.f34912a.hashCode() * 31) + this.f34913b.hashCode()) * 31) + this.f34914c.hashCode();
                }

                public String toString() {
                    return "SignDocumentDetails(id=" + this.f34912a + ", fileName=" + this.f34913b + ", displayName=" + this.f34914c + ")";
                }
            }

            public C0603a(String maskedPhoneNumber, List signDocuments, List legalDocuments, List list, c otpSettings) {
                p013kotlin.jvm.internal.s.k(maskedPhoneNumber, "maskedPhoneNumber");
                p013kotlin.jvm.internal.s.k(signDocuments, "signDocuments");
                p013kotlin.jvm.internal.s.k(legalDocuments, "legalDocuments");
                p013kotlin.jvm.internal.s.k(otpSettings, "otpSettings");
                this.f34898a = maskedPhoneNumber;
                this.f34899b = signDocuments;
                this.f34900c = legalDocuments;
                this.f34901d = list;
                this.f34902e = otpSettings;
            }

            public final List a() {
                return this.f34901d;
            }

            public final List b() {
                return this.f34900c;
            }

            public final String c() {
                return this.f34898a;
            }

            public final c d() {
                return this.f34902e;
            }

            public final List e() {
                return this.f34899b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0603a)) {
                    return false;
                }
                C0603a c0603a = (C0603a) obj;
                return p013kotlin.jvm.internal.s.f(this.f34898a, c0603a.f34898a) && p013kotlin.jvm.internal.s.f(this.f34899b, c0603a.f34899b) && p013kotlin.jvm.internal.s.f(this.f34900c, c0603a.f34900c) && p013kotlin.jvm.internal.s.f(this.f34901d, c0603a.f34901d) && p013kotlin.jvm.internal.s.f(this.f34902e, c0603a.f34902e);
            }

            public int hashCode() {
                int iHashCode = ((((this.f34898a.hashCode() * 31) + this.f34899b.hashCode()) * 31) + this.f34900c.hashCode()) * 31;
                List list = this.f34901d;
                return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f34902e.hashCode();
            }

            public String toString() {
                return "SignatureDetails(maskedPhoneNumber=" + this.f34898a + ", signDocuments=" + this.f34899b + ", legalDocuments=" + this.f34900c + ", clauses=" + this.f34901d + ", otpSettings=" + this.f34902e + ")";
            }
        }

        public a(C0603a signatureDetails) {
            p013kotlin.jvm.internal.s.k(signatureDetails, "signatureDetails");
            this.f34897a = signatureDetails;
        }

        public final C0603a a() {
            return this.f34897a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f34897a, ((a) obj).f34897a);
        }

        public int hashCode() {
            return this.f34897a.hashCode();
        }

        public String toString() {
            return "Output(signatureDetails=" + this.f34897a + ")";
        }
    }

    Object a(InterfaceC3788rv.a aVar, Continuation continuation);
}

package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3788rv {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rv$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35154a;

        public a(String signatureId) {
            p013kotlin.jvm.internal.s.k(signatureId, "signatureId");
            this.f35154a = signatureId;
        }

        public final String a() {
            return this.f35154a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f35154a, ((a) obj).f35154a);
        }

        public int hashCode() {
            return this.f35154a.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f35154a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rv$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f35155a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.rv$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f35156a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f35157b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f35158c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final List f35159d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final InterfaceC3746qv.a.C0603a.c f35160e;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.rv$b$a$a, reason: collision with other inner class name */
            public static final class C0610a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f35161a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f35162b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final String f35163c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private final String f35164d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private final int f35165e;

                public C0610a(String id2, String name, String filePath, String url, int i11) {
                    p013kotlin.jvm.internal.s.k(id2, "id");
                    p013kotlin.jvm.internal.s.k(name, "name");
                    p013kotlin.jvm.internal.s.k(filePath, "filePath");
                    p013kotlin.jvm.internal.s.k(url, "url");
                    this.f35161a = id2;
                    this.f35162b = name;
                    this.f35163c = filePath;
                    this.f35164d = url;
                    this.f35165e = i11;
                }

                public String a() {
                    return this.f35163c;
                }

                public String b() {
                    return this.f35161a;
                }

                public String c() {
                    return this.f35162b;
                }

                public final String d() {
                    return this.f35164d;
                }

                public final int e() {
                    return this.f35165e;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0610a)) {
                        return false;
                    }
                    C0610a c0610a = (C0610a) obj;
                    return p013kotlin.jvm.internal.s.f(this.f35161a, c0610a.f35161a) && p013kotlin.jvm.internal.s.f(this.f35162b, c0610a.f35162b) && p013kotlin.jvm.internal.s.f(this.f35163c, c0610a.f35163c) && p013kotlin.jvm.internal.s.f(this.f35164d, c0610a.f35164d) && this.f35165e == c0610a.f35165e;
                }

                public int hashCode() {
                    return (((((((this.f35161a.hashCode() * 31) + this.f35162b.hashCode()) * 31) + this.f35163c.hashCode()) * 31) + this.f35164d.hashCode()) * 31) + Integer.hashCode(this.f35165e);
                }

                public String toString() {
                    return "LegalDocument(id=" + this.f35161a + ", name=" + this.f35162b + ", filePath=" + this.f35163c + ", url=" + this.f35164d + ", version=" + this.f35165e + ")";
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.rv$b$a$b, reason: collision with other inner class name */
            public static final class C0611b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f35166a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f35167b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final String f35168c;

                public C0611b(String id2, String name, String filePath) {
                    p013kotlin.jvm.internal.s.k(id2, "id");
                    p013kotlin.jvm.internal.s.k(name, "name");
                    p013kotlin.jvm.internal.s.k(filePath, "filePath");
                    this.f35166a = id2;
                    this.f35167b = name;
                    this.f35168c = filePath;
                }

                public String a() {
                    return this.f35168c;
                }

                public String b() {
                    return this.f35166a;
                }

                public String c() {
                    return this.f35167b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0611b)) {
                        return false;
                    }
                    C0611b c0611b = (C0611b) obj;
                    return p013kotlin.jvm.internal.s.f(this.f35166a, c0611b.f35166a) && p013kotlin.jvm.internal.s.f(this.f35167b, c0611b.f35167b) && p013kotlin.jvm.internal.s.f(this.f35168c, c0611b.f35168c);
                }

                public int hashCode() {
                    return (((this.f35166a.hashCode() * 31) + this.f35167b.hashCode()) * 31) + this.f35168c.hashCode();
                }

                public String toString() {
                    return "SignDocument(id=" + this.f35166a + ", name=" + this.f35167b + ", filePath=" + this.f35168c + ")";
                }
            }

            public a(String maskedPhoneNumber, List signDocuments, List legalDocuments, List list, InterfaceC3746qv.a.C0603a.c otpSettings) {
                p013kotlin.jvm.internal.s.k(maskedPhoneNumber, "maskedPhoneNumber");
                p013kotlin.jvm.internal.s.k(signDocuments, "signDocuments");
                p013kotlin.jvm.internal.s.k(legalDocuments, "legalDocuments");
                p013kotlin.jvm.internal.s.k(otpSettings, "otpSettings");
                this.f35156a = maskedPhoneNumber;
                this.f35157b = signDocuments;
                this.f35158c = legalDocuments;
                this.f35159d = list;
                this.f35160e = otpSettings;
            }

            public final List a() {
                return this.f35159d;
            }

            public final List b() {
                return this.f35158c;
            }

            public final String c() {
                return this.f35156a;
            }

            public final InterfaceC3746qv.a.C0603a.c d() {
                return this.f35160e;
            }

            public final List e() {
                return this.f35157b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return p013kotlin.jvm.internal.s.f(this.f35156a, aVar.f35156a) && p013kotlin.jvm.internal.s.f(this.f35157b, aVar.f35157b) && p013kotlin.jvm.internal.s.f(this.f35158c, aVar.f35158c) && p013kotlin.jvm.internal.s.f(this.f35159d, aVar.f35159d) && p013kotlin.jvm.internal.s.f(this.f35160e, aVar.f35160e);
            }

            public int hashCode() {
                int iHashCode = ((((this.f35156a.hashCode() * 31) + this.f35157b.hashCode()) * 31) + this.f35158c.hashCode()) * 31;
                List list = this.f35159d;
                return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f35160e.hashCode();
            }

            public String toString() {
                return "SignatureDetails(maskedPhoneNumber=" + this.f35156a + ", signDocuments=" + this.f35157b + ", legalDocuments=" + this.f35158c + ", clauses=" + this.f35159d + ", otpSettings=" + this.f35160e + ")";
            }
        }

        public b(a signatureDetails) {
            p013kotlin.jvm.internal.s.k(signatureDetails, "signatureDetails");
            this.f35155a = signatureDetails;
        }

        public final a a() {
            return this.f35155a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f35155a, ((b) obj).f35155a);
        }

        public int hashCode() {
            return this.f35155a.hashCode();
        }

        public String toString() {
            return "Output(signatureDetails=" + this.f35155a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

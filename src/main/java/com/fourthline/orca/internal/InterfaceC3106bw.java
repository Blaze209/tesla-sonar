package com.fourthline.orca.internal;

import com.fourthline.core.internal.ExtensionsKt;
import java.io.File;
import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3106bw {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.bw$b */
    public interface b {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.bw$b$a */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30728a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1788657508;
            }

            public String toString() {
                return "Succeed";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.bw$b$b, reason: collision with other inner class name */
        public static final class C0547b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0547b f30729a = new C0547b();

            private C0547b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0547b);
            }

            public int hashCode() {
                return 473096851;
            }

            public String toString() {
                return "TooManyAttempts";
            }
        }
    }

    Object a(a aVar, Continuation continuation);

    /* JADX INFO: renamed from: com.fourthline.orca.internal.bw$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f30719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f30720c;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.bw$a$b */
        public static final class b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0546a f30725c = new C0546a(null);

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f30726a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f30727b;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.bw$a$b$a, reason: collision with other inner class name */
            public static final class C0546a {
                public /* synthetic */ C0546a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(String documentId, String documentPath) {
                    p013kotlin.jvm.internal.s.k(documentId, "documentId");
                    p013kotlin.jvm.internal.s.k(documentPath, "documentPath");
                    return new b(documentId, ExtensionsKt.sha256(sn0.h.i(new File(documentPath))));
                }

                private C0546a() {
                }
            }

            public b(String documentId, String documentHash) {
                p013kotlin.jvm.internal.s.k(documentId, "documentId");
                p013kotlin.jvm.internal.s.k(documentHash, "documentHash");
                this.f30726a = documentId;
                this.f30727b = documentHash;
            }

            public final String a() {
                return this.f30727b;
            }

            public final String b() {
                return this.f30726a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p013kotlin.jvm.internal.s.f(this.f30726a, bVar.f30726a) && p013kotlin.jvm.internal.s.f(this.f30727b, bVar.f30727b);
            }

            public int hashCode() {
                return (this.f30726a.hashCode() * 31) + this.f30727b.hashCode();
            }

            public String toString() {
                return "AuthorisedDocument(documentId=" + this.f30726a + ", documentHash=" + this.f30727b + ")";
            }
        }

        public a(String signatureId, List authorisedDocuments, List legalDocumentAccepted) {
            p013kotlin.jvm.internal.s.k(signatureId, "signatureId");
            p013kotlin.jvm.internal.s.k(authorisedDocuments, "authorisedDocuments");
            p013kotlin.jvm.internal.s.k(legalDocumentAccepted, "legalDocumentAccepted");
            this.f30718a = signatureId;
            this.f30719b = authorisedDocuments;
            this.f30720c = legalDocumentAccepted;
        }

        public final List a() {
            return this.f30719b;
        }

        public final List b() {
            return this.f30720c;
        }

        public final String c() {
            return this.f30718a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f30718a, aVar.f30718a) && p013kotlin.jvm.internal.s.f(this.f30719b, aVar.f30719b) && p013kotlin.jvm.internal.s.f(this.f30720c, aVar.f30720c);
        }

        public int hashCode() {
            return (((this.f30718a.hashCode() * 31) + this.f30719b.hashCode()) * 31) + this.f30720c.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f30718a + ", authorisedDocuments=" + this.f30719b + ", legalDocumentAccepted=" + this.f30720c + ")";
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.bw$a$a, reason: collision with other inner class name */
        public static final class C0545a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f30721a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f30722b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f30723c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f30724d;

            public C0545a(String id2, String str, int i11, String str2) {
                p013kotlin.jvm.internal.s.k(id2, "id");
                this.f30721a = id2;
                this.f30722b = str;
                this.f30723c = i11;
                this.f30724d = str2;
            }

            public final String a() {
                return this.f30724d;
            }

            public final String b() {
                return this.f30721a;
            }

            public final String c() {
                return this.f30722b;
            }

            public final int d() {
                return this.f30723c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0545a)) {
                    return false;
                }
                C0545a c0545a = (C0545a) obj;
                return p013kotlin.jvm.internal.s.f(this.f30721a, c0545a.f30721a) && p013kotlin.jvm.internal.s.f(this.f30722b, c0545a.f30722b) && this.f30723c == c0545a.f30723c && p013kotlin.jvm.internal.s.f(this.f30724d, c0545a.f30724d);
            }

            public int hashCode() {
                int iHashCode = this.f30721a.hashCode() * 31;
                String str = this.f30722b;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f30723c)) * 31;
                String str2 = this.f30724d;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AcceptedLegalDocument(id=" + this.f30721a + ", url=" + this.f30722b + ", version=" + this.f30723c + ", displayName=" + this.f30724d + ")";
            }

            public /* synthetic */ C0545a(String str, String str2, int i11, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i12 & 2) != 0 ? null : str2, i11, (i12 & 8) != 0 ? null : str3);
            }
        }
    }
}

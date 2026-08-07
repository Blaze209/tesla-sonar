package com.fourthline.nfc.internal;

import android.nfc.Tag;
import com.fourthline.core.DocumentType;
import com.fourthline.nfc.NfcSecurityCheck;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface I0 extends InterfaceC2825o {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f24578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final DocumentType f24579c;

        public a(String nfcDocumentType, String str, DocumentType documentType) {
            p013kotlin.jvm.internal.s.k(nfcDocumentType, "nfcDocumentType");
            this.f24577a = nfcDocumentType;
            this.f24578b = str;
            this.f24579c = documentType;
        }

        public final DocumentType a() {
            return this.f24579c;
        }

        public final String b() {
            return this.f24578b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f24577a, aVar.f24577a) && p013kotlin.jvm.internal.s.f(this.f24578b, aVar.f24578b) && this.f24579c == aVar.f24579c;
        }

        public int hashCode() {
            int iHashCode = this.f24577a.hashCode() * 31;
            String str = this.f24578b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DocumentType documentType = this.f24579c;
            return iHashCode2 + (documentType != null ? documentType.hashCode() : 0);
        }

        public String toString() {
            return "DocumentSummary(nfcDocumentType=" + this.f24577a + ", issuingCountry=" + this.f24578b + ", documentType=" + this.f24579c + ")";
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24580a;

        public static final class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f24581b = new a();

            private a() {
                super("aa", null);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.nfc.internal.I0$b$b, reason: collision with other inner class name */
        public static final class C0469b extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0469b f24582b = new C0469b();

            private C0469b() {
                super("bac", null);
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f24583b = new c();

            private c() {
                super("bap", null);
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f24584b = new d();

            private d() {
                super("ca", null);
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List f24585b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f24586c;

            public /* synthetic */ e(List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : str);
            }

            public final List b() {
                return this.f24585b;
            }

            public final String c() {
                return this.f24586c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return p013kotlin.jvm.internal.s.f(this.f24585b, eVar.f24585b) && p013kotlin.jvm.internal.s.f(this.f24586c, eVar.f24586c);
            }

            public int hashCode() {
                List list = this.f24585b;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                String str = this.f24586c;
                return iHashCode + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "Pace(availableConfigs=" + this.f24585b + ", selectedConfig=" + this.f24586c + ")";
            }

            public e(List list, String str) {
                super("pace", null);
                this.f24585b = list;
                this.f24586c = str;
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f24587b = new f();

            private f() {
                super("pace-cam", null);
            }
        }

        public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String a() {
            return this.f24580a;
        }

        private b(String str) {
            this.f24580a = str;
        }
    }

    NfcSecurityCheck a();

    void a(Tag tag);

    void b();

    List c();

    void close();
}

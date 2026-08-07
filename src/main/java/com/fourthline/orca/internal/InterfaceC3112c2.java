package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: renamed from: com.fourthline.orca.internal.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3112c2 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c2$a */
    public static final class a implements InterfaceC3112c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer f30762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f30763b;

        public a(Integer num) {
            this.f30762a = num;
            this.f30763b = num == null ? QA.b.f27435b : QA.a.a(QA.f27433a, num.intValue(), 0, 2, null);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        public BavIbanCountryConfig a() {
            return b.a(this);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        public QA b() {
            return this.f30763b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f30762a, ((a) obj).f30762a);
        }

        public int hashCode() {
            Integer num = this.f30762a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "Continue(suggestedTextResource=" + this.f30762a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c2$b */
    public static final class b {
        public static BavIbanCountryConfig a(InterfaceC3112c2 interfaceC3112c2) {
            return null;
        }

        public static QA b(InterfaceC3112c2 interfaceC3112c2) {
            return QA.b.f27435b;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c2$c */
    public static final class c implements InterfaceC3112c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f30764a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final QA.d f30765b = QA.a.a(QA.f27433a, R.string.shared_validation_iban_country_not_supported, 0, 2, null);

        private c() {
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        public BavIbanCountryConfig a() {
            return b.a(this);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public QA.d b() {
            return f30765b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -610640224;
        }

        public String toString() {
            return "InvalidCountry";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c2$d */
    public static final class d implements InterfaceC3112c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f30766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BavIbanCountryConfig f30767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA.d f30768c = QA.a.a(QA.f27433a, 0, 1, null);

        public d(boolean z11, BavIbanCountryConfig bavIbanCountryConfig) {
            this.f30766a = z11;
            this.f30767b = bavIbanCountryConfig;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        public BavIbanCountryConfig a() {
            return this.f30767b;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public QA.d b() {
            return this.f30768c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f30766a == dVar.f30766a && p013kotlin.jvm.internal.s.f(this.f30767b, dVar.f30767b);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f30766a) * 31;
            BavIbanCountryConfig bavIbanCountryConfig = this.f30767b;
            return iHashCode + (bavIbanCountryConfig == null ? 0 : bavIbanCountryConfig.hashCode());
        }

        public String toString() {
            return "InvalidFormat(isDefinitive=" + this.f30766a + ", countryConfig=" + this.f30767b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c2$e */
    public static final class e implements InterfaceC3112c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f30769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BavIbanCountryConfig f30770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA.c f30771c;

        public e(boolean z11, BavIbanCountryConfig countryConfig) {
            p013kotlin.jvm.internal.s.k(countryConfig, "countryConfig");
            this.f30769a = z11;
            this.f30770b = countryConfig;
            this.f30771c = QA.f27433a.a(R.string.shared_validation_iban_length, a().getCountryCode(), String.valueOf(a().getLength()));
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        public BavIbanCountryConfig a() {
            return this.f30770b;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public QA.c b() {
            return this.f30771c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f30769a == eVar.f30769a && p013kotlin.jvm.internal.s.f(this.f30770b, eVar.f30770b);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f30769a) * 31) + this.f30770b.hashCode();
        }

        public String toString() {
            return "InvalidLength(isDefinitive=" + this.f30769a + ", countryConfig=" + this.f30770b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c2$f */
    public static final class f implements InterfaceC3112c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f30772a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final QA.d f30773b = QA.a.a(QA.f27433a, R.string.shared_validation_iban_country_code, 0, 2, null);

        private f() {
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        public BavIbanCountryConfig a() {
            return b.a(this);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public QA.d b() {
            return f30773b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1130330769;
        }

        public String toString() {
            return "MissingCountryStart";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c2$g */
    public static final class g implements InterfaceC3112c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f30774a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final QA.d f30775b = QA.a.b(QA.f27433a, 0, 1, null);

        private g() {
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        public BavIbanCountryConfig a() {
            return b.a(this);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public QA.d b() {
            return f30775b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 710047072;
        }

        public String toString() {
            return "Required";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c2$h */
    public static final class h implements InterfaceC3112c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BavIbanCountryConfig f30776a;

        public h(BavIbanCountryConfig countryConfig) {
            p013kotlin.jvm.internal.s.k(countryConfig, "countryConfig");
            this.f30776a = countryConfig;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        public BavIbanCountryConfig a() {
            return this.f30776a;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3112c2
        public QA b() {
            return b.b(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && p013kotlin.jvm.internal.s.f(this.f30776a, ((h) obj).f30776a);
        }

        public int hashCode() {
            return this.f30776a.hashCode();
        }

        public String toString() {
            return "Success(countryConfig=" + this.f30776a + ")";
        }
    }

    BavIbanCountryConfig a();

    QA b();
}

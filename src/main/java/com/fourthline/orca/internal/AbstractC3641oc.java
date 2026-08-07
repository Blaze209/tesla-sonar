package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3641oc extends Bo {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oc$a */
    public static final class a extends AbstractC3641oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34194a = new a();

        private a() {
            super("document_expired", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -367181138;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DocumentExpired";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oc$b */
    public static final class b extends AbstractC3641oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f34195a = new b();

        private b() {
            super("document_side_not_matching", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 984877121;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DocumentFileSideNotCorrect";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oc$c */
    public static final class c extends AbstractC3641oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f34196a = new c();

        private c() {
            super("document_not_detected", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1671409282;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DocumentNotDetected";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oc$d */
    public static final class d extends AbstractC3641oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f34197a = new d();

        private d() {
            super("document_type_not_matching", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1339481407;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DocumentTypeMismatch";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oc$e */
    public static final class e extends AbstractC3641oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f34198a = new e();

        private e() {
            super("document_type_not_supported", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1841426956;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DocumentTypeNotSupported";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oc$f */
    public static final class f extends AbstractC3641oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f34199a = new f();

        private f() {
            super("issuing_country_not_matching", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -1661650006;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IssuingCountryMismatch";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oc$g */
    public static final class g extends AbstractC3641oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f34200a = new g();

        private g() {
            super("issuing_country_not_supported", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 778380023;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IssuingCountryNotSupported";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oc$h */
    public static final class h extends AbstractC3641oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f34201a = new h();

        private h() {
            super("document_type_not_detected", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return -1141005183;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IssuingCountryOrDocumentTypeNotDetected";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oc$i */
    public static final class i extends AbstractC3641oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f34202a = new i();

        private i() {
            super("nationality_not_supported", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return -1742605285;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NationalityNotSupported";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oc$j */
    public static final class j extends AbstractC3641oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f34203a = new j();

        private j() {
            super("person_underage", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 2043690872;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PersonNotAdult";
        }
    }

    public /* synthetic */ AbstractC3641oc(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AbstractC3641oc(String str) {
        super(null, null, str);
    }
}

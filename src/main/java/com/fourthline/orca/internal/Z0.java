package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Z0 extends Bo {

    public static final class a extends Z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29958a = new a();

        private a() {
            super("bav_iban_account_holder_mismatch", null, null, 6, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 404313736;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "AccountHolderNameMismatch";
        }
    }

    public static final class b extends Z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29959a = new b();

        private b() {
            super("bav_iban_country_not_supported", null, null, 6, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 916863649;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IbanCountryNotSupported";
        }
    }

    public static final class c extends Z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f29960a = new c();

        private c() {
            super("bav_iban_sepa_not_supported", null, null, 6, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1686837166;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IbanSepaNotSupported";
        }
    }

    public /* synthetic */ Z0(String str, Throwable th2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2, str2);
    }

    public /* synthetic */ Z0(String str, Throwable th2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2, (i11 & 4) != 0 ? "document_scanner_error" : str2, null);
    }

    private Z0(String str, Throwable th2, String str2) {
        super(str, th2, str2);
    }
}

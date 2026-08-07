package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3292gB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f31972f;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gB$a */
    public static final class a extends AbstractC3292gB {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f31973g = new a();

        private a() {
            super(R.string.step_tin_details_label_tin_esp, R.string.step_tin_details_hint_esp, R.string.step_tin_details_validation_invalid_tin_esp, R.string.shared_validation_invalid_length_NIE_number_accessibility, R.string.shared_validation_required_NIE_number_accessibility, R.string.shared_validation_invalid_NIE_number_accessibility, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1948464268;
        }

        public String toString() {
            return "ESP";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gB$b */
    public static final class b extends AbstractC3292gB {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f31974g = new b();

        private b() {
            super(R.string.step_tin_details_label_tin_ita, R.string.step_tin_details_hint_ita, R.string.step_tin_details_validation_invalid_tin_ita, R.string.shared_validation_invalid_length_codice_fiscale_number_accessibility, R.string.shared_validation_required_codice_fiscal_number_accessibility, R.string.shared_validation_invalid_codice_fiscal_number_accessibility, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1948468128;
        }

        public String toString() {
            return "ITA";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gB$c */
    public static final class c extends AbstractC3292gB {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f31975g = new c();

        private c() {
            super(R.string.step_tin_details_label_tin_nld, R.string.step_tin_details_hint_nld, R.string.step_tin_details_validation_invalid_tin_nld, R.string.shared_validation_invalid_length_BSN_number_accessibility, R.string.shared_validation_required_BSN_number_accessibility, R.string.shared_validation_invalid_BSN_number_accessibility, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1948472688;
        }

        public String toString() {
            return "NLD";
        }
    }

    public /* synthetic */ AbstractC3292gB(int i11, int i12, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, i14, i15, i16);
    }

    public final int a() {
        return this.f31968b;
    }

    public final int b() {
        return this.f31972f;
    }

    public final int c() {
        return this.f31970d;
    }

    public final int d() {
        return this.f31969c;
    }

    public final int e() {
        return this.f31971e;
    }

    public final int f() {
        return this.f31967a;
    }

    private AbstractC3292gB(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f31967a = i11;
        this.f31968b = i12;
        this.f31969c = i13;
        this.f31970d = i14;
        this.f31971e = i15;
        this.f31972f = i16;
    }
}

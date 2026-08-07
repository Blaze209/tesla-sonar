package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Th extends Bo {

    public static abstract class a extends Th {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Th$a$a, reason: collision with other inner class name */
        public static final class C0520a extends a {
            public C0520a() {
                super("document_expired", null);
            }
        }

        public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private a(String str) {
            super(str, null);
        }
    }

    public static abstract class b extends Th {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final G5 f27909a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final T9 f27910b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(G5 country) {
                super("nationality_not_matching", null);
                p013kotlin.jvm.internal.s.k(country, "country");
                this.f27909a = country;
                this.f27910b = T9.f27850a;
            }

            public final G5 a() {
                return this.f27909a;
            }

            public final T9 b() {
                return this.f27910b;
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Th$b$b, reason: collision with other inner class name */
        public static final class C0521b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final G5 f27911a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final KycError.NationalityNotSupported f27912b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0521b(G5 country) {
                super("nationality_not_supported", null);
                p013kotlin.jvm.internal.s.k(country, "country");
                this.f27911a = country;
                this.f27912b = KycError.NationalityNotSupported.INSTANCE;
            }

            public final G5 a() {
                return this.f27911a;
            }

            public final KycError.NationalityNotSupported b() {
                return this.f27912b;
            }
        }

        public static final class c extends b {
            public c() {
                super("person_underage", null);
            }
        }

        public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private b(String str) {
            super(str, null);
        }
    }

    public static final class c extends Th {
        public c() {
            super("empty", null);
        }
    }

    public static final class d extends Th {
        public d() {
            super("invalid", null);
        }
    }

    public /* synthetic */ Th(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private Th(String str) {
        super(null, null, str, 3, null);
    }
}

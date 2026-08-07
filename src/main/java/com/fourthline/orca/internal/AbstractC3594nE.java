package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3594nE extends Bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f33879a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f33880b = new d("InvalidValidationCode");

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nE$a */
    public static final class a extends AbstractC3594nE {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f33881c = new a();

        private a() {
            super(null, null, "canceled", 3, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1530842592;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Canceled";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nE$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return AbstractC3594nE.f33880b;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nE$c */
    public static final class c extends AbstractC3594nE {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f33882c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String message) {
            super(message, null, "configuration_not_supported", 2, null);
            p013kotlin.jvm.internal.s.k(message, "message");
            this.f33882c = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f33882c, ((c) obj).f33882c);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f33882c;
        }

        public int hashCode() {
            return this.f33882c.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ConfigurationNotSupported(message=" + this.f33882c + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nE$d */
    public static final class d extends AbstractC3594nE {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f33883c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String message) {
            super(message, null, "invalid_session", 2, null);
            p013kotlin.jvm.internal.s.k(message, "message");
            this.f33883c = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f33883c, ((d) obj).f33883c);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f33883c;
        }

        public int hashCode() {
            return this.f33883c.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidSession(message=" + this.f33883c + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nE$e */
    public static final class e extends AbstractC3594nE {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f33884c = new e();

        private e() {
            super(null, null, "invalid_workflow_status", 3, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1178980417;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidWorkflowStatus";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nE$f */
    public static final class f extends AbstractC3594nE {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f33885c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String moduleName) {
            super(null, null, "kyc_required", 3, null);
            p013kotlin.jvm.internal.s.k(moduleName, "moduleName");
            this.f33885c = moduleName;
        }

        public final String b() {
            return this.f33885c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && p013kotlin.jvm.internal.s.f(this.f33885c, ((f) obj).f33885c);
        }

        public int hashCode() {
            return this.f33885c.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "KycRequired(moduleName=" + this.f33885c + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nE$g */
    public static final class g extends AbstractC3594nE {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f33886c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String moduleName) {
            super(null, null, "pending_verification", 3, null);
            p013kotlin.jvm.internal.s.k(moduleName, "moduleName");
            this.f33886c = moduleName;
        }

        public final String b() {
            return this.f33886c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && p013kotlin.jvm.internal.s.f(this.f33886c, ((g) obj).f33886c);
        }

        public int hashCode() {
            return this.f33886c.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PendingVerification(moduleName=" + this.f33886c + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nE$h */
    public static final class h extends AbstractC3594nE {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f33887e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f33888f = 8;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f33889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Throwable f33890d;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.nE$h$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final h a(String description, Throwable th2) {
                p013kotlin.jvm.internal.s.k(description, "description");
                return new h(description, th2, null);
            }

            private a() {
            }

            public static /* synthetic */ h a(a aVar, String str, Throwable th2, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    th2 = null;
                }
                return aVar.a(str, th2);
            }
        }

        public /* synthetic */ h(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th2);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f33890d;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f33889c;
        }

        private h(String str, Throwable th2) {
            super(str, th2, "unexpected", null);
            this.f33889c = str;
            this.f33890d = th2;
        }
    }

    public /* synthetic */ AbstractC3594nE(String str, Throwable th2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2, str2);
    }

    public /* synthetic */ AbstractC3594nE(String str, Throwable th2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2, str2, null);
    }

    private AbstractC3594nE(String str, Throwable th2, String str2) {
        super(str, th2, str2);
    }
}

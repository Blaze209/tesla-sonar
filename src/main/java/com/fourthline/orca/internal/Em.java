package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Em extends Bo {

    public static final class a extends Em {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25605a = new a();

        private a() {
            super(null, null, "connection_lost", 3, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1649399982;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ConnectionLost";
        }
    }

    public static final class b extends Em {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25606a = new b();

        private b() {
            super(null, null, "nfc_not_enabled", 3, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1106165267;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NfcNotEnabled";
        }
    }

    public static final class c extends Em {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f25607a = new c();

        private c() {
            super(null, null, "nfc_not_supported", 3, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1556049830;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NfcNotSupported";
        }
    }

    public static final class d extends Em {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f25608c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f25609d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f25611b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String description, Throwable th2) {
                p013kotlin.jvm.internal.s.k(description, "description");
                return new d(description, th2, null);
            }

            private a() {
            }

            public static /* synthetic */ d a(a aVar, String str, Throwable th2, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    th2 = null;
                }
                return aVar.a(str, th2);
            }
        }

        public /* synthetic */ d(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th2);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f25611b;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f25610a;
        }

        private d(String str, Throwable th2) {
            super(str, th2, "unexpected", null);
            this.f25610a = str;
            this.f25611b = th2;
        }
    }

    public static final class e extends Em {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Jn f25612a;

        public e(Jn jn2) {
            super(null, null, "authentication_failed", 3, null);
            this.f25612a = jn2;
        }

        public final Jn a() {
            return this.f25612a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f25612a, ((e) obj).f25612a);
        }

        public int hashCode() {
            Jn jn2 = this.f25612a;
            if (jn2 == null) {
                return 0;
            }
            return jn2.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "WrongUnlockKey(key=" + this.f25612a + ")";
        }
    }

    public /* synthetic */ Em(String str, Throwable th2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2, str2);
    }

    public /* synthetic */ Em(String str, Throwable th2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2, str2, null);
    }

    private Em(String str, Throwable th2, String str2) {
        super(str, th2, str2);
    }
}

package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3703pv {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pv$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34641a;

        public a(String signatureId) {
            p013kotlin.jvm.internal.s.k(signatureId, "signatureId");
            this.f34641a = signatureId;
        }

        public final String a() {
            return this.f34641a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f34641a, ((a) obj).f34641a);
        }

        public int hashCode() {
            return this.f34641a.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f34641a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pv$b */
    public interface b {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pv$b$a */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34642a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1763433550;
            }

            public String toString() {
                return "DoAuthorizeAgain";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pv$b$b, reason: collision with other inner class name */
        public static final class C0597b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0597b f34643a = new C0597b();

            private C0597b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0597b);
            }

            public int hashCode() {
                return 1387736818;
            }

            public String toString() {
                return "Succeed";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pv$b$c */
        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f34644a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1152785129;
            }

            public String toString() {
                return "TooManyAttempts";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

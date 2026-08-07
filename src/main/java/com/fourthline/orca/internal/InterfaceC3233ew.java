package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3233ew {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ew$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f31547b;

        public a(String signatureId, String otp) {
            p013kotlin.jvm.internal.s.k(signatureId, "signatureId");
            p013kotlin.jvm.internal.s.k(otp, "otp");
            this.f31546a = signatureId;
            this.f31547b = otp;
        }

        public final String a() {
            return this.f31547b;
        }

        public final String b() {
            return this.f31546a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f31546a, aVar.f31546a) && p013kotlin.jvm.internal.s.f(this.f31547b, aVar.f31547b);
        }

        public int hashCode() {
            return (this.f31546a.hashCode() * 31) + this.f31547b.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f31546a + ", otp=" + this.f31547b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ew$b */
    public interface b {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ew$b$a */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f31548a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ew$b$b, reason: collision with other inner class name */
        public static final class C0558b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0558b f31549a = new C0558b();

            private C0558b() {
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ew$b$c */
        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f31550a = new c();

            private c() {
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

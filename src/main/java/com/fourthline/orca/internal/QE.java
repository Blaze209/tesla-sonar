package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface QE {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27444b;

        public a(String validationCode, String languageCode) {
            p013kotlin.jvm.internal.s.k(validationCode, "validationCode");
            p013kotlin.jvm.internal.s.k(languageCode, "languageCode");
            this.f27443a = validationCode;
            this.f27444b = languageCode;
        }

        public final String a() {
            return this.f27444b;
        }

        public final String b() {
            return this.f27443a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f27443a, aVar.f27443a) && p013kotlin.jvm.internal.s.f(this.f27444b, aVar.f27444b);
        }

        public int hashCode() {
            return (this.f27443a.hashCode() * 31) + this.f27444b.hashCode();
        }

        public String toString() {
            return "Input(validationCode=" + this.f27443a + ", languageCode=" + this.f27444b + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AbstractC3594nE f27445a;

            public a(AbstractC3594nE error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f27445a = error;
            }

            public final AbstractC3594nE a() {
                return this.f27445a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f27445a, ((a) obj).f27445a);
            }

            public int hashCode() {
                return this.f27445a.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.f27445a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.QE$b$b, reason: collision with other inner class name */
        public static final class C0514b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final PE f27446a;

            public C0514b(PE session) {
                p013kotlin.jvm.internal.s.k(session, "session");
                this.f27446a = session;
            }

            public final PE a() {
                return this.f27446a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0514b) && p013kotlin.jvm.internal.s.f(this.f27446a, ((C0514b) obj).f27446a);
            }

            public int hashCode() {
                return this.f27446a.hashCode();
            }

            public String toString() {
                return "Succeed(session=" + this.f27446a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

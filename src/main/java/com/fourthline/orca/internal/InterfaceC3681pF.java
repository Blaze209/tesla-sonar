package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3681pF {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pF$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34472b;

        public a(String validationCode, String languageCode) {
            p013kotlin.jvm.internal.s.k(validationCode, "validationCode");
            p013kotlin.jvm.internal.s.k(languageCode, "languageCode");
            this.f34471a = validationCode;
            this.f34472b = languageCode;
        }

        public final String a() {
            return this.f34472b;
        }

        public final String b() {
            return this.f34471a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f34471a, aVar.f34471a) && p013kotlin.jvm.internal.s.f(this.f34472b, aVar.f34472b);
        }

        public int hashCode() {
            return (this.f34471a.hashCode() * 31) + this.f34472b.hashCode();
        }

        public String toString() {
            return "Input(validationCode=" + this.f34471a + ", languageCode=" + this.f34472b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pF$b */
    public interface b {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pF$b$a */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f34473a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1179510839;
            }

            public String toString() {
                return "InvalidValidationCode";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pF$b$b, reason: collision with other inner class name */
        public static final class C0596b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WorkflowStartSessionResponse f34474a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final NetworkEnvironment f34475b;

            public C0596b(WorkflowStartSessionResponse session, NetworkEnvironment networkEnvironment) {
                p013kotlin.jvm.internal.s.k(session, "session");
                p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
                this.f34474a = session;
                this.f34475b = networkEnvironment;
            }

            public final NetworkEnvironment a() {
                return this.f34475b;
            }

            public final WorkflowStartSessionResponse b() {
                return this.f34474a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0596b)) {
                    return false;
                }
                C0596b c0596b = (C0596b) obj;
                return p013kotlin.jvm.internal.s.f(this.f34474a, c0596b.f34474a) && p013kotlin.jvm.internal.s.f(this.f34475b, c0596b.f34475b);
            }

            public int hashCode() {
                return (this.f34474a.hashCode() * 31) + this.f34475b.hashCode();
            }

            public String toString() {
                return "Succeed(session=" + this.f34474a + ", networkEnvironment=" + this.f34475b + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

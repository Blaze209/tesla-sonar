package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface Gg {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f25953b;

        public a(String validationCode, String languageCode) {
            p013kotlin.jvm.internal.s.k(validationCode, "validationCode");
            p013kotlin.jvm.internal.s.k(languageCode, "languageCode");
            this.f25952a = validationCode;
            this.f25953b = languageCode;
        }

        public final String a() {
            return this.f25953b;
        }

        public final String b() {
            return this.f25952a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f25952a, aVar.f25952a) && p013kotlin.jvm.internal.s.f(this.f25953b, aVar.f25953b);
        }

        public int hashCode() {
            return (this.f25952a.hashCode() * 31) + this.f25953b.hashCode();
        }

        public String toString() {
            return "Input(validationCode=" + this.f25952a + ", languageCode=" + this.f25953b + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Fg f25954a;

        public b(Fg session) {
            p013kotlin.jvm.internal.s.k(session, "session");
            this.f25954a = session;
        }

        public final Fg a() {
            return this.f25954a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f25954a, ((b) obj).f25954a);
        }

        public int hashCode() {
            return this.f25954a.hashCode();
        }

        public String toString() {
            return "Output(session=" + this.f25954a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface Vu {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29213a;

        public a(String signatureId) {
            p013kotlin.jvm.internal.s.k(signatureId, "signatureId");
            this.f29213a = signatureId;
        }

        public final String a() {
            return this.f29213a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f29213a, ((a) obj).f29213a);
        }

        public int hashCode() {
            return this.f29213a.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f29213a + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC3319gw f29214a;

        public b(EnumC3319gw status) {
            p013kotlin.jvm.internal.s.k(status, "status");
            this.f29214a = status;
        }

        public final EnumC3319gw a() {
            return this.f29214a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f29214a == ((b) obj).f29214a;
        }

        public int hashCode() {
            return this.f29214a.hashCode();
        }

        public String toString() {
            return "Output(status=" + this.f29214a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

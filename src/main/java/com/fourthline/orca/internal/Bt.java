package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface Bt {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f25127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f25128c;

        public a(String signatureId, String documentId, String documentName) {
            p013kotlin.jvm.internal.s.k(signatureId, "signatureId");
            p013kotlin.jvm.internal.s.k(documentId, "documentId");
            p013kotlin.jvm.internal.s.k(documentName, "documentName");
            this.f25126a = signatureId;
            this.f25127b = documentId;
            this.f25128c = documentName;
        }

        public final String a() {
            return this.f25127b;
        }

        public final String b() {
            return this.f25128c;
        }

        public final String c() {
            return this.f25126a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f25126a, aVar.f25126a) && p013kotlin.jvm.internal.s.f(this.f25127b, aVar.f25127b) && p013kotlin.jvm.internal.s.f(this.f25128c, aVar.f25128c);
        }

        public int hashCode() {
            return (((this.f25126a.hashCode() * 31) + this.f25127b.hashCode()) * 31) + this.f25128c.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f25126a + ", documentId=" + this.f25127b + ", documentName=" + this.f25128c + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

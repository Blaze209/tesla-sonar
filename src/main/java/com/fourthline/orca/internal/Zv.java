package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface Zv {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f30134b;

        public a(String signatureId, Bitmap selfie) {
            p013kotlin.jvm.internal.s.k(signatureId, "signatureId");
            p013kotlin.jvm.internal.s.k(selfie, "selfie");
            this.f30133a = signatureId;
            this.f30134b = selfie;
        }

        public final Bitmap a() {
            return this.f30134b;
        }

        public final String b() {
            return this.f30133a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f30133a, aVar.f30133a) && p013kotlin.jvm.internal.s.f(this.f30134b, aVar.f30134b);
        }

        public int hashCode() {
            return (this.f30133a.hashCode() * 31) + this.f30134b.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f30133a + ", selfie=" + this.f30134b + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30135a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Zv$b$b, reason: collision with other inner class name */
        public static final class C0538b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0538b f30136a = new C0538b();

            private C0538b() {
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

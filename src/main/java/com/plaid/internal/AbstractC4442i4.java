package com.plaid.internal;

import java.io.IOException;

/* JADX INFO: renamed from: com.plaid.internal.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4442i4<T, U> {

    /* JADX INFO: renamed from: com.plaid.internal.i4$a */
    public static final class a<U> extends AbstractC4442i4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final U f47733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47734b;

        public a(U u11, int i11) {
            this.f47733a = u11;
            this.f47734b = i11;
        }

        public final int b() {
            return this.f47734b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f47733a, aVar.f47733a) && this.f47734b == aVar.f47734b;
        }

        public final int hashCode() {
            U u11 = this.f47733a;
            return Integer.hashCode(this.f47734b) + ((u11 == null ? 0 : u11.hashCode()) * 31);
        }

        public final String toString() {
            return "HttpError(body=" + this.f47733a + ", code=" + this.f47734b + ")";
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.i4$b */
    public static final class b extends AbstractC4442i4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IOException f47735a;

        public b(IOException error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f47735a = error;
        }

        public final IOException b() {
            return this.f47735a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f47735a, ((b) obj).f47735a);
        }

        public final int hashCode() {
            return this.f47735a.hashCode();
        }

        public final String toString() {
            return "NetworkError(error=" + this.f47735a + ")";
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.i4$c */
    public static final class c<T> extends AbstractC4442i4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f47736a;

        public c(T body) {
            p013kotlin.jvm.internal.s.k(body, "body");
            this.f47736a = body;
        }

        public final T b() {
            return this.f47736a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f47736a, ((c) obj).f47736a);
        }

        public final int hashCode() {
            return this.f47736a.hashCode();
        }

        public final String toString() {
            return "Success(body=" + this.f47736a + ")";
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.i4$d */
    public static final class d extends AbstractC4442i4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f47737a;

        public d(Throwable th2) {
            this.f47737a = th2;
        }

        public final Throwable b() {
            return this.f47737a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f47737a, ((d) obj).f47737a);
        }

        public final int hashCode() {
            Throwable th2 = this.f47737a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        public final String toString() {
            return "UnknownError(error=" + this.f47737a + ")";
        }
    }

    public final boolean a() {
        return !(this instanceof c);
    }
}

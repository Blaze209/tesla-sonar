package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface FD {

    public static final class a implements FD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Of f25795a;

        public a(Of flowAction) {
            p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
            this.f25795a = flowAction;
        }

        public final Of a() {
            return this.f25795a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f25795a, ((a) obj).f25795a);
        }

        public int hashCode() {
            return this.f25795a.hashCode();
        }

        public String toString() {
            return "Completed(flowAction=" + this.f25795a + ")";
        }
    }

    public static final class b implements FD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bo f25796a;

        public b(Bo error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f25796a = error;
        }

        public final Bo a() {
            return this.f25796a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f25796a, ((b) obj).f25796a);
        }

        public int hashCode() {
            return this.f25796a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f25796a + ")";
        }
    }

    public static final class c implements FD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25797a;

        public c(int i11) {
            this.f25797a = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f25797a == ((c) obj).f25797a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f25797a);
        }

        public String toString() {
            return "Running(progress=" + this.f25797a + ")";
        }

        public /* synthetic */ c(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? -1 : i11);
        }
    }

    public static final class d implements FD {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f25798a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -799290734;
        }

        public String toString() {
            return "Started";
        }
    }
}

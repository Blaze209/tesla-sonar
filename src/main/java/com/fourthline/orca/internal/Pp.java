package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public interface Pp extends Of {

    public static final class a implements Pp, Of.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rf f27376a;

        public a(Rf rf2) {
            this.f27376a = rf2;
        }

        @Override // com.fourthline.orca.internal.Of.b
        public Rf a() {
            return this.f27376a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f27376a, ((a) obj).f27376a);
        }

        public int hashCode() {
            Rf rf2 = this.f27376a;
            if (rf2 == null) {
                return 0;
            }
            return rf2.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f27376a + ")";
        }

        public /* synthetic */ a(Rf rf2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : rf2);
        }

        @Override // com.fourthline.orca.internal.Of.b
        public void a(Rf rf2) {
            this.f27376a = rf2;
        }
    }

    public static final class b implements Pp, Of.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27377a = new b();

        private b() {
        }
    }

    public static final class c implements Pp, Of.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27378a = new c();

        private c() {
        }
    }
}

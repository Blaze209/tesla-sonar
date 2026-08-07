package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3172dd extends Of {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dd$a */
    public static final class a implements InterfaceC3172dd, Of.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rf f31144a;

        public a(Rf rf2) {
            this.f31144a = rf2;
        }

        @Override // com.fourthline.orca.internal.Of.b
        public Rf a() {
            return this.f31144a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f31144a, ((a) obj).f31144a);
        }

        public int hashCode() {
            Rf rf2 = this.f31144a;
            if (rf2 == null) {
                return 0;
            }
            return rf2.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f31144a + ")";
        }

        public /* synthetic */ a(Rf rf2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : rf2);
        }

        @Override // com.fourthline.orca.internal.Of.b
        public void a(Rf rf2) {
            this.f31144a = rf2;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dd$b */
    public static final class b implements InterfaceC3172dd, Of.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31145a = new b();

        private b() {
        }
    }
}

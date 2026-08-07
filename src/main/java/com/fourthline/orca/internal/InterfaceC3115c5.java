package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3115c5 extends Of {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c5$a */
    public static final class a implements InterfaceC3115c5, Of.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rf f30786a;

        public a(Rf rf2) {
            this.f30786a = rf2;
        }

        @Override // com.fourthline.orca.internal.Of.b
        public Rf a() {
            return this.f30786a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f30786a, ((a) obj).f30786a);
        }

        public int hashCode() {
            Rf rf2 = this.f30786a;
            if (rf2 == null) {
                return 0;
            }
            return rf2.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f30786a + ")";
        }

        public /* synthetic */ a(Rf rf2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : rf2);
        }

        @Override // com.fourthline.orca.internal.Of.b
        public void a(Rf rf2) {
            this.f30786a = rf2;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c5$b */
    public static final class b implements InterfaceC3115c5, Of.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30787a = new b();

        private b() {
        }
    }
}

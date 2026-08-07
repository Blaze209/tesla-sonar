package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ux, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3919ux extends Of {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ux$a */
    public static final class a implements InterfaceC3919ux, Of.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35968a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ux$b */
    public static final class b implements InterfaceC3919ux, Of.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rf f35969a;

        public b(Rf rf2) {
            this.f35969a = rf2;
        }

        @Override // com.fourthline.orca.internal.Of.b
        public Rf a() {
            return this.f35969a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f35969a, ((b) obj).f35969a);
        }

        public int hashCode() {
            Rf rf2 = this.f35969a;
            if (rf2 == null) {
                return 0;
            }
            return rf2.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f35969a + ")";
        }

        public /* synthetic */ b(Rf rf2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : rf2);
        }

        @Override // com.fourthline.orca.internal.Of.b
        public void a(Rf rf2) {
            this.f35969a = rf2;
        }
    }
}

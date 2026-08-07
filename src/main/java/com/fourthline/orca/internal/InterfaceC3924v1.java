package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3924v1 extends Of {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.v1$a */
    public static final class a implements InterfaceC3924v1, Of.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35983a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.v1$b */
    public static final class b implements InterfaceC3924v1, Of.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rf f35984a;

        public b(Rf rf2) {
            this.f35984a = rf2;
        }

        @Override // com.fourthline.orca.internal.Of.b
        public Rf a() {
            return this.f35984a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f35984a, ((b) obj).f35984a);
        }

        public int hashCode() {
            Rf rf2 = this.f35984a;
            if (rf2 == null) {
                return 0;
            }
            return rf2.hashCode();
        }

        public String toString() {
            return "FinishFlow(nextFlow=" + this.f35984a + ")";
        }

        public /* synthetic */ b(Rf rf2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : rf2);
        }

        @Override // com.fourthline.orca.internal.Of.b
        public void a(Rf rf2) {
            this.f35984a = rf2;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.v1$c */
    public static final class c implements InterfaceC3924v1, Of.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f35985a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.v1$d */
    public static final class d implements InterfaceC3924v1, Of.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f35986a = new d();

        private d() {
        }
    }
}

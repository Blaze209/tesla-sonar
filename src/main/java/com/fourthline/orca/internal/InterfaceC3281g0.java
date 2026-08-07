package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3281g0 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.g0$a */
    public static final class a implements InterfaceC3281g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31907a = new a();

        private a() {
        }

        @Override // com.fourthline.orca.internal.InterfaceC3281g0
        public boolean a(AbstractC3641oc error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            return true;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1464701444;
        }

        public String toString() {
            return "Default";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.g0$b */
    public static final class b implements InterfaceC3281g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31908a = new b();

        private b() {
        }

        @Override // com.fourthline.orca.internal.InterfaceC3281g0
        public boolean a(AbstractC3641oc error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            if (p013kotlin.jvm.internal.s.f(error, AbstractC3641oc.g.f34200a) || p013kotlin.jvm.internal.s.f(error, AbstractC3641oc.f.f34199a) || p013kotlin.jvm.internal.s.f(error, AbstractC3641oc.e.f34198a) || p013kotlin.jvm.internal.s.f(error, AbstractC3641oc.d.f34197a)) {
                return false;
            }
            p013kotlin.jvm.internal.s.f(error, AbstractC3641oc.h.f34201a);
            return true;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 2012375287;
        }

        public String toString() {
            return "SkipCountryAndType";
        }
    }

    boolean a(AbstractC3641oc abstractC3641oc);
}

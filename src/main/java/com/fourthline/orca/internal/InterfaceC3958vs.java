package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3958vs {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vs$a */
    public static final class a implements InterfaceC3958vs {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3807sD f36287a;

        public a(InterfaceC3807sD intent) {
            p013kotlin.jvm.internal.s.k(intent, "intent");
            this.f36287a = intent;
        }

        public final InterfaceC3807sD a() {
            return this.f36287a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f36287a, ((a) obj).f36287a);
        }

        public int hashCode() {
            return this.f36287a.hashCode();
        }

        public String toString() {
            return "OnPrimaryClicked(intent=" + this.f36287a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vs$b */
    public static final class b implements InterfaceC3958vs {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3807sD f36288a;

        public b(InterfaceC3807sD intent) {
            p013kotlin.jvm.internal.s.k(intent, "intent");
            this.f36288a = intent;
        }

        public final InterfaceC3807sD a() {
            return this.f36288a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f36288a, ((b) obj).f36288a);
        }

        public int hashCode() {
            return this.f36288a.hashCode();
        }

        public String toString() {
            return "OnSecondaryClicked(intent=" + this.f36288a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vs$c */
    public static final class c implements InterfaceC3958vs {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f36289a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 186832769;
        }

        public String toString() {
            return "Skip";
        }
    }
}

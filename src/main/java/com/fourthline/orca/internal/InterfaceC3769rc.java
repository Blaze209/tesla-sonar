package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3769rc extends PD, InterfaceC2923Qb {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rc$a */
    public static final class a implements InterfaceC3769rc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35041a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rc$b */
    public static final class b implements InterfaceC3769rc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3726qb f35042a;

        public b(InterfaceC3726qb flowAction) {
            p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
            this.f35042a = flowAction;
        }

        public final InterfaceC3726qb c() {
            return this.f35042a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f35042a, ((b) obj).f35042a);
        }

        public int hashCode() {
            return this.f35042a.hashCode();
        }

        public String toString() {
            return "Forward(flowAction=" + this.f35042a + ")";
        }
    }
}

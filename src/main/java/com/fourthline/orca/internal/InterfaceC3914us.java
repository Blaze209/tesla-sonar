package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3914us {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.us$a */
    public static final class a implements InterfaceC3914us {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35946a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -200614319;
        }

        public String toString() {
            return "Hide";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.us$b */
    public static final class b implements InterfaceC3914us {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC4001ws f35947a;

        public b(InterfaceC4001ws state) {
            p013kotlin.jvm.internal.s.k(state, "state");
            this.f35947a = state;
        }

        public final InterfaceC4001ws a() {
            return this.f35947a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f35947a, ((b) obj).f35947a);
        }

        public int hashCode() {
            return this.f35947a.hashCode();
        }

        public String toString() {
            return "Show(state=" + this.f35947a + ")";
        }
    }
}

package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3779rm extends MD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rm$a */
    public static final class a implements InterfaceC3779rm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35108a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1875097321;
        }

        public String toString() {
            return "Back";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rm$b */
    public static final class b implements InterfaceC3779rm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35109a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1009475435;
        }

        public String toString() {
            return "Forward";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rm$c */
    public static final class c implements InterfaceC3779rm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Sl f35110a;

        public c(Sl flowAction) {
            p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
            this.f35110a = flowAction;
        }

        public final Sl c() {
            return this.f35110a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f35110a, ((c) obj).f35110a);
        }

        public int hashCode() {
            return this.f35110a.hashCode();
        }

        public String toString() {
            return "Skip(flowAction=" + this.f35110a + ")";
        }
    }
}

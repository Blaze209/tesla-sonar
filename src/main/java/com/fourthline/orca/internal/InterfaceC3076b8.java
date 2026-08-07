package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3076b8 extends PD, MD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.b8$a */
    public static final class a implements InterfaceC3076b8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Of f30570a;

        public a(Of flowAction) {
            p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
            this.f30570a = flowAction;
        }

        public final Of c() {
            return this.f30570a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f30570a, ((a) obj).f30570a);
        }

        public int hashCode() {
            return this.f30570a.hashCode();
        }

        public String toString() {
            return "Forward(flowAction=" + this.f30570a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.b8$b */
    public static final class b implements InterfaceC3076b8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30571a = new b();

        private b() {
        }
    }
}

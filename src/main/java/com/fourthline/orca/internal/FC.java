package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface FC extends PD, MD {

    public static final class a implements FC {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25793a = new a();

        private a() {
        }
    }

    public static final class b implements FC {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Of f25794a;

        public b(Of flowAction) {
            p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
            this.f25794a = flowAction;
        }

        public final Of c() {
            return this.f25794a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f25794a, ((b) obj).f25794a);
        }

        public int hashCode() {
            return this.f25794a.hashCode();
        }

        public String toString() {
            return "FinishWithSuccess(flowAction=" + this.f25794a + ")";
        }
    }
}

package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2864Ee extends InterfaceC3556md {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ee$a */
    public static final class a implements InterfaceC2864Ee {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bo f25593a;

        public a(Bo error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f25593a = error;
        }

        public final Bo c() {
            return this.f25593a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f25593a, ((a) obj).f25593a);
        }

        public int hashCode() {
            return this.f25593a.hashCode();
        }

        public String toString() {
            return "FinishWithError(error=" + this.f25593a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ee$b */
    public static final class b implements InterfaceC2864Ee {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Of f25594a;

        public b(Of flowAction) {
            p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
            this.f25594a = flowAction;
        }

        public final Of c() {
            return this.f25594a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f25594a, ((b) obj).f25594a);
        }

        public int hashCode() {
            return this.f25594a.hashCode();
        }

        public String toString() {
            return "FinishWithSuccess(flowAction=" + this.f25594a + ")";
        }
    }
}

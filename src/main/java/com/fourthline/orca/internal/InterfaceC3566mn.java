package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3566mn extends PD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mn$a */
    public interface a extends InterfaceC3566mn, MD {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mn$a$a, reason: collision with other inner class name */
        public static final class C0583a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0583a f33619a = new C0583a();

            private C0583a() {
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mn$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f33620a = new b();

            private b() {
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.mn$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Im f33621a;

            public c(Im flowAction) {
                p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
                this.f33621a = flowAction;
            }

            public final Im c() {
                return this.f33621a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f33621a, ((c) obj).f33621a);
            }

            public int hashCode() {
                return this.f33621a.hashCode();
            }

            public String toString() {
                return "Skip(flowAction=" + this.f33621a + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mn$b */
    public static final class b implements InterfaceC3566mn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33622a = new b();

        private b() {
        }
    }
}

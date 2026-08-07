package com.fourthline.orca.internal;

import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: com.fourthline.orca.internal.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3500l6 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.l6$a */
    public interface a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.l6$a$a, reason: collision with other inner class name */
        public static final class C0576a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0576a f33229a = new C0576a();

            private C0576a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0576a);
            }

            public int hashCode() {
                return 2002997084;
            }

            public String toString() {
                return "Active";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.l6$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f33230a;

            public b(Throwable error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f33230a = error;
            }

            public final Throwable a() {
                return this.f33230a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f33230a, ((b) obj).f33230a);
            }

            public int hashCode() {
                return this.f33230a.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.f33230a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.l6$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f33231a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1817716279;
            }

            public String toString() {
                return "Queued";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.l6$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f33232a;

            public d(Object result) {
                p013kotlin.jvm.internal.s.k(result, "result");
                this.f33232a = result;
            }

            public final Object a() {
                return this.f33232a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f33232a, ((d) obj).f33232a);
            }

            public int hashCode() {
                return this.f33232a.hashCode();
            }

            public String toString() {
                return "Success(result=" + this.f33232a + ")";
            }
        }
    }

    Flow a(String str);

    void a(InterfaceC3543m6 interfaceC3543m6);
}

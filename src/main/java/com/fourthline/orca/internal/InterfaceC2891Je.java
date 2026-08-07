package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2891Je {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Je$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26463a;

        public a(String workflowId) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            this.f26463a = workflowId;
        }

        public final String a() {
            return this.f26463a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f26463a, ((a) obj).f26463a);
        }

        public int hashCode() {
            return this.f26463a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f26463a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Je$b */
    public interface b {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Je$b$a */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f26464a;

            public a(String tokenUrl) {
                p013kotlin.jvm.internal.s.k(tokenUrl, "tokenUrl");
                this.f26464a = tokenUrl;
            }

            public final String a() {
                return this.f26464a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f26464a, ((a) obj).f26464a);
            }

            public int hashCode() {
                return this.f26464a.hashCode();
            }

            public String toString() {
                return "Success(tokenUrl=" + this.f26464a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

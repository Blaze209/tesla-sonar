package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface G2 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25892a;

        public a(String workflowId) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            this.f25892a = workflowId;
        }

        public final String a() {
            return this.f25892a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f25892a, ((a) obj).f25892a);
        }

        public int hashCode() {
            return this.f25892a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f25892a + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BavStatus f25893a;

        public b(BavStatus status) {
            p013kotlin.jvm.internal.s.k(status, "status");
            this.f25893a = status;
        }

        public final BavStatus a() {
            return this.f25893a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f25893a, ((b) obj).f25893a);
        }

        public int hashCode() {
            return this.f25893a.hashCode();
        }

        public String toString() {
            return "Output(status=" + this.f25893a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

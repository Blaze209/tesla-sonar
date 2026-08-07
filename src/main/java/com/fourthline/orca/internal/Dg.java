package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface Dg {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f25466b;

        public a(String workflowId, String documentId) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            p013kotlin.jvm.internal.s.k(documentId, "documentId");
            this.f25465a = workflowId;
            this.f25466b = documentId;
        }

        public final String a() {
            return this.f25466b;
        }

        public final String b() {
            return this.f25465a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f25465a, aVar.f25465a) && p013kotlin.jvm.internal.s.f(this.f25466b, aVar.f25466b);
        }

        public int hashCode() {
            return (this.f25465a.hashCode() * 31) + this.f25466b.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f25465a + ", documentId=" + this.f25466b + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final GetDocumentAnalysisResultResponse f25467a;

            public a(GetDocumentAnalysisResultResponse value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                this.f25467a = value;
            }

            public final GetDocumentAnalysisResultResponse a() {
                return this.f25467a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f25467a, ((a) obj).f25467a);
            }

            public int hashCode() {
                return this.f25467a.hashCode();
            }

            public String toString() {
                return "Succeed(value=" + this.f25467a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

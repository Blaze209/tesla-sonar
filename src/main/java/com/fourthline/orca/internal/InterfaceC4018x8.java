package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4018x8 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.x8$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36681a;

        public a(String workflowId) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            this.f36681a = workflowId;
        }

        public final String a() {
            return this.f36681a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f36681a, ((a) obj).f36681a);
        }

        public int hashCode() {
            return this.f36681a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f36681a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.x8$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DocumentFlowConfig f36682a;

        public b(DocumentFlowConfig flowConfig) {
            p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
            this.f36682a = flowConfig;
        }

        public final DocumentFlowConfig a() {
            return this.f36682a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f36682a, ((b) obj).f36682a);
        }

        public int hashCode() {
            return this.f36682a.hashCode();
        }

        public String toString() {
            return "Output(flowConfig=" + this.f36682a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3508lE {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lE$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33263a;

        public a(String workflowId) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            this.f33263a = workflowId;
        }

        public final String a() {
            return this.f33263a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f33263a, ((a) obj).f33263a);
        }

        public int hashCode() {
            return this.f33263a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f33263a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lE$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WorkflowConfigurationResponse f33264a;

        public b(WorkflowConfigurationResponse config) {
            p013kotlin.jvm.internal.s.k(config, "config");
            this.f33264a = config;
        }

        public final WorkflowConfigurationResponse a() {
            return this.f33264a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f33264a, ((b) obj).f33264a);
        }

        public int hashCode() {
            return this.f33264a.hashCode();
        }

        public String toString() {
            return "Output(config=" + this.f33264a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

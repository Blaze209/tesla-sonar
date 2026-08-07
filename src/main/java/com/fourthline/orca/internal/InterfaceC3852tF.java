package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3852tF {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tF$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35626a;

        public a(String workflowId) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            this.f35626a = workflowId;
        }

        public final String a() {
            return this.f35626a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f35626a, ((a) obj).f35626a);
        }

        public int hashCode() {
            return this.f35626a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f35626a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tF$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3724qF f35627a;

        public b(C3724qF status) {
            p013kotlin.jvm.internal.s.k(status, "status");
            this.f35627a = status;
        }

        public final C3724qF a() {
            return this.f35627a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f35627a, ((b) obj).f35627a);
        }

        public int hashCode() {
            return this.f35627a.hashCode();
        }

        public String toString() {
            return "Output(status=" + this.f35627a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

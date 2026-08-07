package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface CC {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25194a;

        public a(String workflowId) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            this.f25194a = workflowId;
        }

        public final String a() {
            return this.f25194a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f25194a, ((a) obj).f25194a);
        }

        public int hashCode() {
            return this.f25194a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f25194a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

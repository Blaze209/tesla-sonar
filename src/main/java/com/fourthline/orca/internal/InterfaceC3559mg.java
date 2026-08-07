package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3559mg {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mg$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f33584b;

        public a(String workflowId, String flowVariantName) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            p013kotlin.jvm.internal.s.k(flowVariantName, "flowVariantName");
            this.f33583a = workflowId;
            this.f33584b = flowVariantName;
        }

        public final String a() {
            return this.f33584b;
        }

        public final String b() {
            return this.f33583a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f33583a, aVar.f33583a) && p013kotlin.jvm.internal.s.f(this.f33584b, aVar.f33584b);
        }

        public int hashCode() {
            return (this.f33583a.hashCode() * 31) + this.f33584b.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f33583a + ", flowVariantName=" + this.f33584b + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

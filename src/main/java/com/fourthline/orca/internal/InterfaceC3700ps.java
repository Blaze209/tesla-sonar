package com.fourthline.orca.internal;

import java.util.Set;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3700ps {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ps$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f34635b;

        public a(String workflowId, Set acceptableStatuses) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            p013kotlin.jvm.internal.s.k(acceptableStatuses, "acceptableStatuses");
            this.f34634a = workflowId;
            this.f34635b = acceptableStatuses;
        }

        public final Set a() {
            return this.f34635b;
        }

        public final String b() {
            return this.f34634a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f34634a, aVar.f34634a) && p013kotlin.jvm.internal.s.f(this.f34635b, aVar.f34635b);
        }

        public int hashCode() {
            return (this.f34634a.hashCode() * 31) + this.f34635b.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f34634a + ", acceptableStatuses=" + this.f34635b + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

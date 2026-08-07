package com.fourthline.orca.internal;

import java.util.Set;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3617nv {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nv$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f33999b;

        public a(String signatureId, Set acceptableStatuses) {
            p013kotlin.jvm.internal.s.k(signatureId, "signatureId");
            p013kotlin.jvm.internal.s.k(acceptableStatuses, "acceptableStatuses");
            this.f33998a = signatureId;
            this.f33999b = acceptableStatuses;
        }

        public final Set a() {
            return this.f33999b;
        }

        public final String b() {
            return this.f33998a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f33998a, aVar.f33998a) && p013kotlin.jvm.internal.s.f(this.f33999b, aVar.f33999b);
        }

        public int hashCode() {
            return (this.f33998a.hashCode() * 31) + this.f33999b.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f33998a + ", acceptableStatuses=" + this.f33999b + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

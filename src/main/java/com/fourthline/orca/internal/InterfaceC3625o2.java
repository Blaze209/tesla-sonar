package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3625o2 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.o2$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34047a;

        public a(String workflowId) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            this.f34047a = workflowId;
        }

        public final String a() {
            return this.f34047a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f34047a, ((a) obj).f34047a);
        }

        public int hashCode() {
            return this.f34047a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f34047a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.o2$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34048a;

        public b(String redirectUrl) {
            p013kotlin.jvm.internal.s.k(redirectUrl, "redirectUrl");
            this.f34048a = redirectUrl;
        }

        public final String a() {
            return this.f34048a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f34048a, ((b) obj).f34048a);
        }

        public int hashCode() {
            return this.f34048a.hashCode();
        }

        public String toString() {
            return "Output(redirectUrl=" + this.f34048a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3087bd {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.bd$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30619a;

        public a(String workflowId) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            this.f30619a = workflowId;
        }

        public final String a() {
            return this.f30619a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f30619a, ((a) obj).f30619a);
        }

        public int hashCode() {
            return this.f30619a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f30619a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.bd$b */
    public interface b {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.bd$b$a */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30620a = new a();

            private a() {
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

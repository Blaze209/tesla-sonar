package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface XC {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29713a;

        public a(String workflowId) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            this.f29713a = workflowId;
        }

        public final String a() {
            return this.f29713a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f29713a, ((a) obj).f29713a);
        }

        public int hashCode() {
            return this.f29713a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f29713a + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f29714a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 337729013;
            }

            public String toString() {
                return "Succeed";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

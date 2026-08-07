package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4049xx {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xx$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36846a;

        public a(String workflowId) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            this.f36846a = workflowId;
        }

        public final String a() {
            return this.f36846a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f36846a, ((a) obj).f36846a);
        }

        public int hashCode() {
            return this.f36846a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f36846a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xx$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C4006wx f36847a;

        public b(C4006wx flowConfig) {
            p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
            this.f36847a = flowConfig;
        }

        public final C4006wx a() {
            return this.f36847a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f36847a, ((b) obj).f36847a);
        }

        public int hashCode() {
            return this.f36847a.hashCode();
        }

        public String toString() {
            return "Output(flowConfig=" + this.f36847a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

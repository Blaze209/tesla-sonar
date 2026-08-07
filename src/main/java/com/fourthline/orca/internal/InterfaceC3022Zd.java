package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3022Zd {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Zd$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30019a;

        public a(String workflowId) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            this.f30019a = workflowId;
        }

        public final String a() {
            return this.f30019a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f30019a, ((a) obj).f30019a);
        }

        public int hashCode() {
            return this.f30019a.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f30019a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Zd$b */
    public interface b {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Zd$b$a */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f30020a;

            public a(List accessRights) {
                p013kotlin.jvm.internal.s.k(accessRights, "accessRights");
                this.f30020a = accessRights;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f30020a, ((a) obj).f30020a);
            }

            public int hashCode() {
                return this.f30020a.hashCode();
            }

            public String toString() {
                return "Success(accessRights=" + this.f30020a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

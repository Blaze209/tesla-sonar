package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidAuthEvent;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3814se {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.se$a */
    public interface a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.se$a$a, reason: collision with other inner class name */
        public static final class C0612a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final EidAuthEvent f35300a;

            public C0612a(EidAuthEvent eidAuthEvent) {
                p013kotlin.jvm.internal.s.k(eidAuthEvent, "eidAuthEvent");
                this.f35300a = eidAuthEvent;
            }

            public final EidAuthEvent a() {
                return this.f35300a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0612a) && p013kotlin.jvm.internal.s.f(this.f35300a, ((C0612a) obj).f35300a);
            }

            public int hashCode() {
                return this.f35300a.hashCode();
            }

            public String toString() {
                return "Eid(eidAuthEvent=" + this.f35300a + ")";
            }
        }
    }

    Object a(Continuation continuation);
}

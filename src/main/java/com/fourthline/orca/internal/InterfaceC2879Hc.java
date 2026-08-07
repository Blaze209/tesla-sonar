package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2879Hc {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Hc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f26104a;

        public a(List accessRights) {
            p013kotlin.jvm.internal.s.k(accessRights, "accessRights");
            this.f26104a = accessRights;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f26104a, ((a) obj).f26104a);
        }

        public int hashCode() {
            return this.f26104a.hashCode();
        }

        public String toString() {
            return "Input(accessRights=" + this.f26104a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}

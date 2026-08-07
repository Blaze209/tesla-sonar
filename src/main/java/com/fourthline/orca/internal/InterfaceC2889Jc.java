package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2889Jc {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Jc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26457a;

        public a(String tcTokenUrl) {
            p013kotlin.jvm.internal.s.k(tcTokenUrl, "tcTokenUrl");
            this.f26457a = tcTokenUrl;
        }

        public final String a() {
            return this.f26457a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f26457a, ((a) obj).f26457a);
        }

        public int hashCode() {
            return this.f26457a.hashCode();
        }

        public String toString() {
            return "Input(tcTokenUrl=" + this.f26457a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Jc$b */
    public interface b {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Jc$b$a */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final List f26458a;

            public a(List accessRights) {
                p013kotlin.jvm.internal.s.k(accessRights, "accessRights");
                this.f26458a = accessRights;
            }

            public final List a() {
                return this.f26458a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f26458a, ((a) obj).f26458a);
            }

            public int hashCode() {
                return this.f26458a.hashCode();
            }

            public String toString() {
                return "Success(accessRights=" + this.f26458a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}

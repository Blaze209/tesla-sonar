package com.fourthline.orca.internal;

import kotlinx.serialization.json.JsonElement;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.orca.internal.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3457k6 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.k6$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f32899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC0569a f32900c;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.k6$a$a, reason: collision with other inner class name */
        public interface InterfaceC0569a {

            /* JADX INFO: renamed from: com.fourthline.orca.internal.k6$a$a$a, reason: collision with other inner class name */
            public static final class C0570a implements InterfaceC0569a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final JsonElement f32901a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f32902b;

                public C0570a(JsonElement data, String str) {
                    p013kotlin.jvm.internal.s.k(data, "data");
                    this.f32901a = data;
                    this.f32902b = str;
                }

                public final JsonElement a() {
                    return this.f32901a;
                }

                public final String b() {
                    return this.f32902b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0570a)) {
                        return false;
                    }
                    C0570a c0570a = (C0570a) obj;
                    return p013kotlin.jvm.internal.s.f(this.f32901a, c0570a.f32901a) && p013kotlin.jvm.internal.s.f(this.f32902b, c0570a.f32902b);
                }

                public int hashCode() {
                    int iHashCode = this.f32901a.hashCode() * 31;
                    String str = this.f32902b;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "Json(data=" + this.f32901a + ", type=" + this.f32902b + ")";
                }
            }
        }

        public a(String workflowId, String fileName, InterfaceC0569a data) {
            p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
            p013kotlin.jvm.internal.s.k(fileName, "fileName");
            p013kotlin.jvm.internal.s.k(data, "data");
            this.f32898a = workflowId;
            this.f32899b = fileName;
            this.f32900c = data;
        }

        public final InterfaceC0569a a() {
            return this.f32900c;
        }

        public final String b() {
            return this.f32899b;
        }

        public final String c() {
            return this.f32898a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f32898a, aVar.f32898a) && p013kotlin.jvm.internal.s.f(this.f32899b, aVar.f32899b) && p013kotlin.jvm.internal.s.f(this.f32900c, aVar.f32900c);
        }

        public int hashCode() {
            return (((this.f32898a.hashCode() * 31) + this.f32899b.hashCode()) * 31) + this.f32900c.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f32898a + ", fileName=" + this.f32899b + ", data=" + this.f32900c + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.k6$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32903a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1212235419;
        }

        public String toString() {
            return "Output";
        }
    }

    Object a(a aVar, Continuation continuation);
}

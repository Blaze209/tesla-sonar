package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerResult;
import java.util.List;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3364hy extends PD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.hy$a */
    public interface a extends InterfaceC3364hy, MD {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.hy$a$a, reason: collision with other inner class name */
        public static final class C0567a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0567a f32378a = new C0567a();

            private C0567a() {
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.hy$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Bo f32379a;

            public b(Bo error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f32379a = error;
            }

            public final Bo c() {
                return this.f32379a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f32379a, ((b) obj).f32379a);
            }

            public int hashCode() {
                return this.f32379a.hashCode();
            }

            public String toString() {
                return "FinishWithError(error=" + this.f32379a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.hy$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f32380c = SelfieScannerResult.$stable;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final InterfaceC3919ux f32381a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SelfieScannerResult f32382b;

            public c(InterfaceC3919ux flowAction, SelfieScannerResult result) {
                p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
                p013kotlin.jvm.internal.s.k(result, "result");
                this.f32381a = flowAction;
                this.f32382b = result;
            }

            public final InterfaceC3919ux c() {
                return this.f32381a;
            }

            public final SelfieScannerResult d() {
                return this.f32382b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return p013kotlin.jvm.internal.s.f(this.f32381a, cVar.f32381a) && p013kotlin.jvm.internal.s.f(this.f32382b, cVar.f32382b);
            }

            public int hashCode() {
                return (this.f32381a.hashCode() * 31) + this.f32382b.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f32381a + ", result=" + this.f32382b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.hy$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f32383a = new d();

            private d() {
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.hy$b */
    public static final class b implements InterfaceC3364hy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32384a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.hy$c */
    public static final class c implements InterfaceC3364hy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f32385a;

        public c(List permissions) {
            p013kotlin.jvm.internal.s.k(permissions, "permissions");
            this.f32385a = permissions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f32385a, ((c) obj).f32385a);
        }

        public int hashCode() {
            return this.f32385a.hashCode();
        }

        public String toString() {
            return "RequestPermissions(permissions=" + this.f32385a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.hy$d */
    public static final class d implements InterfaceC3364hy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f32386a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.hy$d$a */
        public enum a {
            LONG,
            TICK;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f32390d = on0.a.a(a());
        }

        public d(a type) {
            p013kotlin.jvm.internal.s.k(type, "type");
            this.f32386a = type;
        }

        public final a a() {
            return this.f32386a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f32386a == ((d) obj).f32386a;
        }

        public int hashCode() {
            return this.f32386a.hashCode();
        }

        public String toString() {
            return "Vibrate(type=" + this.f32386a + ")";
        }

        public /* synthetic */ d(a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? a.LONG : aVar);
        }
    }
}

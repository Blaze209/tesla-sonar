package com.fourthline.orca.internal;

import java.util.Map;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3318gv extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gv$a */
    public static final class a implements InterfaceC3318gv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32095a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gv$b */
    public static final class b implements InterfaceC3318gv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f32096a;

        public b(Map attributes) {
            p013kotlin.jvm.internal.s.k(attributes, "attributes");
            this.f32096a = attributes;
        }

        public final Map a() {
            return this.f32096a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f32096a, ((b) obj).f32096a);
        }

        public int hashCode() {
            return this.f32096a.hashCode();
        }

        public String toString() {
            return "OnDocumentClosed(attributes=" + this.f32096a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gv$c */
    public static final class c implements InterfaceC3318gv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32097a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gv$d */
    public static final class d implements InterfaceC3318gv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f32098a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gv$e */
    public static final class e implements InterfaceC3318gv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f32099a = new e();

        private e() {
        }
    }
}

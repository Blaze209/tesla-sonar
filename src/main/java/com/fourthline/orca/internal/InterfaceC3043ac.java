package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3043ac extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ac$a */
    public static final class a implements InterfaceC3043ac {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30369a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ac$b */
    public static final class b implements InterfaceC3043ac {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30370a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ac$c */
    public static final class c implements InterfaceC3043ac {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f30371a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ac$d */
    public static final class d implements InterfaceC3043ac {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DocumentType f30372a;

        public d(DocumentType documentType) {
            p013kotlin.jvm.internal.s.k(documentType, "documentType");
            this.f30372a = documentType;
        }

        public final DocumentType a() {
            return this.f30372a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f30372a == ((d) obj).f30372a;
        }

        public int hashCode() {
            return this.f30372a.hashCode();
        }

        public String toString() {
            return "OnOptionClicked(documentType=" + this.f30372a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ac$e */
    public static final class e implements InterfaceC3043ac {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f30373a = new e();

        private e() {
        }
    }
}

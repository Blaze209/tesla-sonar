package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3812sc extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sc$a */
    public static final class a implements InterfaceC3812sc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35288a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sc$b */
    public static final class b implements InterfaceC3812sc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35289a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sc$c */
    public static final class c implements InterfaceC3812sc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DocumentType f35290a;

        public c(DocumentType documentType) {
            p013kotlin.jvm.internal.s.k(documentType, "documentType");
            this.f35290a = documentType;
        }

        public final DocumentType a() {
            return this.f35290a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f35290a == ((c) obj).f35290a;
        }

        public int hashCode() {
            return this.f35290a.hashCode();
        }

        public String toString() {
            return "OnOptionClicked(documentType=" + this.f35290a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sc$d */
    public static final class d implements InterfaceC3812sc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f35291a = new d();

        private d() {
        }
    }
}

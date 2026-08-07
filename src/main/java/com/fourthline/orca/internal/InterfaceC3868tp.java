package com.fourthline.orca.internal;

import com.fourthline.orca.core.flavor.OrcaFlavor;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3868tp {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tp$a */
    public static final class a implements InterfaceC3868tp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OrcaFlavor f35694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f35695b;

        public a(OrcaFlavor flavor, boolean z11) {
            p013kotlin.jvm.internal.s.k(flavor, "flavor");
            this.f35694a = flavor;
            this.f35695b = z11;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3868tp
        public boolean a() {
            return this.f35695b;
        }

        public final OrcaFlavor b() {
            return this.f35694a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f35694a, aVar.f35694a) && this.f35695b == aVar.f35695b;
        }

        public int hashCode() {
            return (this.f35694a.hashCode() * 31) + Boolean.hashCode(this.f35695b);
        }

        public String toString() {
            return "Legacy(flavor=" + this.f35694a + ", isBackButtonOnTopEnabled=" + this.f35695b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.tp$b */
    public static final class b implements InterfaceC3868tp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OrcaStyling f35696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OrcaFlavor f35697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f35698c;

        public b(OrcaStyling styling, OrcaFlavor legacy, boolean z11) {
            p013kotlin.jvm.internal.s.k(styling, "styling");
            p013kotlin.jvm.internal.s.k(legacy, "legacy");
            this.f35696a = styling;
            this.f35697b = legacy;
            this.f35698c = z11;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3868tp
        public boolean a() {
            return this.f35698c;
        }

        public final OrcaFlavor b() {
            return this.f35697b;
        }

        public final OrcaStyling c() {
            return this.f35696a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f35696a, bVar.f35696a) && p013kotlin.jvm.internal.s.f(this.f35697b, bVar.f35697b) && this.f35698c == bVar.f35698c;
        }

        public int hashCode() {
            return (((this.f35696a.hashCode() * 31) + this.f35697b.hashCode()) * 31) + Boolean.hashCode(this.f35698c);
        }

        public String toString() {
            return "Styling(styling=" + this.f35696a + ", legacy=" + this.f35697b + ", isBackButtonOnTopEnabled=" + this.f35698c + ")";
        }
    }

    boolean a();
}

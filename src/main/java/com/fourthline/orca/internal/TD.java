package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class TD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3903uh f27861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC3136ck f27862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f27863c;

    public TD(InterfaceC3903uh maskImageSource, EnumC3136ck animationOrientation, a aVar) {
        p013kotlin.jvm.internal.s.k(maskImageSource, "maskImageSource");
        p013kotlin.jvm.internal.s.k(animationOrientation, "animationOrientation");
        this.f27861a = maskImageSource;
        this.f27862b = animationOrientation;
        this.f27863c = aVar;
    }

    public final TD a(InterfaceC3903uh maskImageSource, EnumC3136ck animationOrientation, a aVar) {
        p013kotlin.jvm.internal.s.k(maskImageSource, "maskImageSource");
        p013kotlin.jvm.internal.s.k(animationOrientation, "animationOrientation");
        return new TD(maskImageSource, animationOrientation, aVar);
    }

    public final InterfaceC3903uh b() {
        return this.f27861a;
    }

    public final a c() {
        return this.f27863c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TD)) {
            return false;
        }
        TD td2 = (TD) obj;
        return p013kotlin.jvm.internal.s.f(this.f27861a, td2.f27861a) && this.f27862b == td2.f27862b && p013kotlin.jvm.internal.s.f(this.f27863c, td2.f27863c);
    }

    public int hashCode() {
        int iHashCode = ((this.f27861a.hashCode() * 31) + this.f27862b.hashCode()) * 31;
        a aVar = this.f27863c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "VisionScannerMaskState(maskImageSource=" + this.f27861a + ", animationOrientation=" + this.f27862b + ", overlay=" + this.f27863c + ")";
    }

    public static /* synthetic */ TD a(TD td2, InterfaceC3903uh interfaceC3903uh, EnumC3136ck enumC3136ck, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC3903uh = td2.f27861a;
        }
        if ((i11 & 2) != 0) {
            enumC3136ck = td2.f27862b;
        }
        if ((i11 & 4) != 0) {
            aVar = td2.f27863c;
        }
        return td2.a(interfaceC3903uh, enumC3136ck, aVar);
    }

    public interface a {

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final InterfaceC3903uh f27867a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f27868b;

            public b(InterfaceC3903uh imageSource, boolean z11) {
                p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
                this.f27867a = imageSource;
                this.f27868b = z11;
            }

            @Override // com.fourthline.orca.internal.TD.a
            public InterfaceC3903uh a() {
                return this.f27867a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p013kotlin.jvm.internal.s.f(this.f27867a, bVar.f27867a) && this.f27868b == bVar.f27868b;
            }

            public int hashCode() {
                return (this.f27867a.hashCode() * 31) + Boolean.hashCode(this.f27868b);
            }

            public String toString() {
                return "Default(imageSource=" + this.f27867a + ", isWarning=" + this.f27868b + ")";
            }

            public /* synthetic */ b(InterfaceC3903uh interfaceC3903uh, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(interfaceC3903uh, (i11 & 2) != 0 ? false : z11);
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final InterfaceC3903uh f27869a;

            public c(InterfaceC3903uh imageSource) {
                p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
                this.f27869a = imageSource;
            }

            @Override // com.fourthline.orca.internal.TD.a
            public InterfaceC3903uh a() {
                return this.f27869a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f27869a, ((c) obj).f27869a);
            }

            public int hashCode() {
                return this.f27869a.hashCode();
            }

            public String toString() {
                return "Success(imageSource=" + this.f27869a + ")";
            }
        }

        InterfaceC3903uh a();

        /* JADX INFO: renamed from: com.fourthline.orca.internal.TD$a$a, reason: collision with other inner class name */
        public static final class C0517a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final InterfaceC3903uh f27864a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final boolean f27865b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f27866c;

            public C0517a(InterfaceC3903uh imageSource, boolean z11, boolean z12) {
                p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
                this.f27864a = imageSource;
                this.f27865b = z11;
                this.f27866c = z12;
            }

            @Override // com.fourthline.orca.internal.TD.a
            public InterfaceC3903uh a() {
                return this.f27864a;
            }

            public final boolean b() {
                return this.f27866c;
            }

            public final boolean c() {
                return this.f27865b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0517a)) {
                    return false;
                }
                C0517a c0517a = (C0517a) obj;
                return p013kotlin.jvm.internal.s.f(this.f27864a, c0517a.f27864a) && this.f27865b == c0517a.f27865b && this.f27866c == c0517a.f27866c;
            }

            public int hashCode() {
                return (((this.f27864a.hashCode() * 31) + Boolean.hashCode(this.f27865b)) * 31) + Boolean.hashCode(this.f27866c);
            }

            public String toString() {
                return "AutoDetect(imageSource=" + this.f27864a + ", isWarning=" + this.f27865b + ", isAnimating=" + this.f27866c + ")";
            }

            public /* synthetic */ C0517a(InterfaceC3903uh interfaceC3903uh, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(interfaceC3903uh, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? true : z12);
            }
        }
    }

    public final EnumC3136ck a() {
        return this.f27862b;
    }
}

package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Jo, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002\u0014!B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u001a¨\u0006*"}, d2 = {"Lcom/fourthline/orca/internal/Jo;", "", "", "thinOutlineThickness", "boldOutlineThickness", "viewMargins", "popupCornerRadius", "borderWidth", "<init>", "(IIIII)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(IIIIIILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Jo;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getThinOutlineThickness", "b", "getBoldOutlineThickness", "c", "getViewMargins", DateTokenConverter.CONVERTER_KEY, "getPopupCornerRadius", "e", "getBorderWidth", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class OrcaInternalDefaults {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int thinOutlineThickness;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int boldOutlineThickness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int viewMargins;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int popupCornerRadius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int borderWidth;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Jo$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26494b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f26493a = aVar;
            f26494b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.OrcaInternalDefaults", aVar, 5);
            m1Var.o("thinOutlineThickness", true);
            m1Var.o("boldOutlineThickness", true);
            m1Var.o("viewMargins", true);
            m1Var.o("popupCornerRadius", true);
            m1Var.o("borderWidth", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrcaInternalDefaults deserialize(uo0.e decoder) {
            int iE;
            int iE2;
            int iE3;
            int i11;
            int i12;
            int i13;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            if (cVarB.i()) {
                iE = cVarB.e(fVar, 0);
                int iE4 = cVarB.e(fVar, 1);
                int iE5 = cVarB.e(fVar, 2);
                iE2 = cVarB.e(fVar, 3);
                iE3 = cVarB.e(fVar, 4);
                i11 = iE5;
                i12 = iE4;
                i13 = 31;
            } else {
                boolean z11 = true;
                iE = 0;
                int iE6 = 0;
                int iE7 = 0;
                int iE8 = 0;
                int iE9 = 0;
                int i14 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        iE = cVarB.e(fVar, 0);
                        i14 |= 1;
                    } else if (iA == 1) {
                        iE9 = cVarB.e(fVar, 1);
                        i14 |= 2;
                    } else if (iA == 2) {
                        iE8 = cVarB.e(fVar, 2);
                        i14 |= 4;
                    } else if (iA == 3) {
                        iE6 = cVarB.e(fVar, 3);
                        i14 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        iE7 = cVarB.e(fVar, 4);
                        i14 |= 16;
                    }
                }
                iE2 = iE6;
                iE3 = iE7;
                i11 = iE8;
                i12 = iE9;
                i13 = i14;
            }
            int i15 = iE;
            cVarB.c(fVar);
            return new OrcaInternalDefaults(i13, i15, i12, i11, iE2, iE3, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            vo0.j0 j0Var = vo0.j0.f119632a;
            return new ro0.d[]{j0Var, j0Var, j0Var, j0Var, j0Var};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, OrcaInternalDefaults value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            OrcaInternalDefaults.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Jo$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<OrcaInternalDefaults> serializer() {
            return a.f26493a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OrcaInternalDefaults(int i11, int i12, int i13, int i14, int i15, int i16, vo0.v1 v1Var) {
        this.thinOutlineThickness = (i11 & 1) == 0 ? 1 : i12;
        if ((i11 & 2) == 0) {
            this.boldOutlineThickness = 2;
        } else {
            this.boldOutlineThickness = i13;
        }
        if ((i11 & 4) == 0) {
            this.viewMargins = 32;
        } else {
            this.viewMargins = i14;
        }
        if ((i11 & 8) == 0) {
            this.popupCornerRadius = 20;
        } else {
            this.popupCornerRadius = i15;
        }
        if ((i11 & 16) == 0) {
            this.borderWidth = 2;
        } else {
            this.borderWidth = i16;
        }
    }

    public static final /* synthetic */ void a(OrcaInternalDefaults self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.thinOutlineThickness != 1) {
            output.x(serialDesc, 0, self.thinOutlineThickness);
        }
        if (output.G(serialDesc, 1) || self.boldOutlineThickness != 2) {
            output.x(serialDesc, 1, self.boldOutlineThickness);
        }
        if (output.G(serialDesc, 2) || self.viewMargins != 32) {
            output.x(serialDesc, 2, self.viewMargins);
        }
        if (output.G(serialDesc, 3) || self.popupCornerRadius != 20) {
            output.x(serialDesc, 3, self.popupCornerRadius);
        }
        if (!output.G(serialDesc, 4) && self.borderWidth == 2) {
            return;
        }
        output.x(serialDesc, 4, self.borderWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaInternalDefaults)) {
            return false;
        }
        OrcaInternalDefaults orcaInternalDefaults = (OrcaInternalDefaults) other;
        return this.thinOutlineThickness == orcaInternalDefaults.thinOutlineThickness && this.boldOutlineThickness == orcaInternalDefaults.boldOutlineThickness && this.viewMargins == orcaInternalDefaults.viewMargins && this.popupCornerRadius == orcaInternalDefaults.popupCornerRadius && this.borderWidth == orcaInternalDefaults.borderWidth;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.thinOutlineThickness) * 31) + Integer.hashCode(this.boldOutlineThickness)) * 31) + Integer.hashCode(this.viewMargins)) * 31) + Integer.hashCode(this.popupCornerRadius)) * 31) + Integer.hashCode(this.borderWidth);
    }

    public String toString() {
        return "OrcaInternalDefaults(thinOutlineThickness=" + this.thinOutlineThickness + ", boldOutlineThickness=" + this.boldOutlineThickness + ", viewMargins=" + this.viewMargins + ", popupCornerRadius=" + this.popupCornerRadius + ", borderWidth=" + this.borderWidth + ")";
    }

    public OrcaInternalDefaults(int i11, int i12, int i13, int i14, int i15) {
        this.thinOutlineThickness = i11;
        this.boldOutlineThickness = i12;
        this.viewMargins = i13;
        this.popupCornerRadius = i14;
        this.borderWidth = i15;
    }

    public /* synthetic */ OrcaInternalDefaults(int i11, int i12, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 1 : i11, (i16 & 2) != 0 ? 2 : i12, (i16 & 4) != 0 ? 32 : i13, (i16 & 8) != 0 ? 20 : i14, (i16 & 16) != 0 ? 2 : i15);
    }
}

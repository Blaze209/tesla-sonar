package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lp, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002\u001c'B]\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\nj\u0002`\u000b0\u0002j\u0002`\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bg\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R'\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b)\u0010(R+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\nj\u0002`\u000b0\u0002j\u0002`\f8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/fourthline/orca/internal/lp;", "", "", "", "Lcom/fourthline/orca/internal/Ro;", "Lcom/fourthline/orca/core/internal/styling/OrcaColorDefaults;", "colors", "Lcom/fourthline/orca/internal/xp;", "Lcom/fourthline/orca/core/internal/styling/OrcaTypographyDefaults;", "typography", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lcom/fourthline/orca/core/internal/styling/OrcaRadiusDefaults;", "radius", "Lcom/fourthline/orca/internal/Jo;", "internal", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/fourthline/orca/internal/Jo;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/fourthline/orca/internal/Jo;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/lp;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "()Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "c", "Lcom/fourthline/orca/internal/Jo;", "getInternal", "()Lcom/fourthline/orca/internal/Jo;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class OrcaStylingDefaults {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f33378e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d[] f33379f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map colors;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map typography;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map radius;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrcaInternalDefaults internal;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lp$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33385b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f33384a = aVar;
            f33385b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.OrcaStylingDefaults", aVar, 4);
            m1Var.o("colors", false);
            m1Var.o("typography", false);
            m1Var.o("radius", false);
            m1Var.o("internal", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrcaStylingDefaults deserialize(uo0.e decoder) {
            int i11;
            Map map;
            Map map2;
            Map map3;
            OrcaInternalDefaults orcaInternalDefaults;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = OrcaStylingDefaults.f33379f;
            Map map4 = null;
            if (cVarB.i()) {
                Map map5 = (Map) cVarB.n(fVar, 0, dVarArr[0], null);
                Map map6 = (Map) cVarB.n(fVar, 1, dVarArr[1], null);
                map3 = (Map) cVarB.n(fVar, 2, dVarArr[2], null);
                map = map5;
                orcaInternalDefaults = (OrcaInternalDefaults) cVarB.n(fVar, 3, OrcaInternalDefaults.a.f26493a, null);
                i11 = 15;
                map2 = map6;
            } else {
                boolean z11 = true;
                int i12 = 0;
                Map map7 = null;
                Map map8 = null;
                OrcaInternalDefaults orcaInternalDefaults2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        map4 = (Map) cVarB.n(fVar, 0, dVarArr[0], map4);
                        i12 |= 1;
                    } else if (iA == 1) {
                        map7 = (Map) cVarB.n(fVar, 1, dVarArr[1], map7);
                        i12 |= 2;
                    } else if (iA == 2) {
                        map8 = (Map) cVarB.n(fVar, 2, dVarArr[2], map8);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        orcaInternalDefaults2 = (OrcaInternalDefaults) cVarB.n(fVar, 3, OrcaInternalDefaults.a.f26493a, orcaInternalDefaults2);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                map = map4;
                map2 = map7;
                map3 = map8;
                orcaInternalDefaults = orcaInternalDefaults2;
            }
            cVarB.c(fVar);
            return new OrcaStylingDefaults(i11, map, map2, map3, orcaInternalDefaults, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = OrcaStylingDefaults.f33379f;
            return new ro0.d[]{dVarArr[0], dVarArr[1], dVarArr[2], OrcaInternalDefaults.a.f26493a};
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
        public final void serialize(uo0.f encoder, OrcaStylingDefaults value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            OrcaStylingDefaults.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lp$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<OrcaStylingDefaults> serializer() {
            return a.f33384a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        vo0.z1 z1Var = vo0.z1.f119730a;
        f33379f = new ro0.d[]{new vo0.m0(z1Var, OrcaPaletteColor.INSTANCE.serializer()), new vo0.m0(z1Var, OrcaTypographyDefinition.a.f36784a), new vo0.m0(z1Var, vo0.j0.f119632a), null};
    }

    public /* synthetic */ OrcaStylingDefaults(int i11, Map map, Map map2, Map map3, OrcaInternalDefaults orcaInternalDefaults, vo0.v1 v1Var) {
        if (7 != (i11 & 7)) {
            vo0.h1.b(i11, 7, a.f33384a.getDescriptor());
        }
        this.colors = map;
        this.typography = map2;
        this.radius = map3;
        if ((i11 & 8) != 0) {
            this.internal = orcaInternalDefaults;
            return;
        }
        this.internal = new OrcaInternalDefaults(0, 0, 0, 0, 0, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Map getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Map getTypography() {
        return this.typography;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaStylingDefaults)) {
            return false;
        }
        OrcaStylingDefaults orcaStylingDefaults = (OrcaStylingDefaults) other;
        return p013kotlin.jvm.internal.s.f(this.colors, orcaStylingDefaults.colors) && p013kotlin.jvm.internal.s.f(this.typography, orcaStylingDefaults.typography) && p013kotlin.jvm.internal.s.f(this.radius, orcaStylingDefaults.radius) && p013kotlin.jvm.internal.s.f(this.internal, orcaStylingDefaults.internal);
    }

    public int hashCode() {
        return (((((this.colors.hashCode() * 31) + this.typography.hashCode()) * 31) + this.radius.hashCode()) * 31) + this.internal.hashCode();
    }

    public String toString() {
        return "OrcaStylingDefaults(colors=" + this.colors + ", typography=" + this.typography + ", radius=" + this.radius + ", internal=" + this.internal + ")";
    }

    public static final /* synthetic */ void a(OrcaStylingDefaults self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f33379f;
        output.D(serialDesc, 0, dVarArr[0], self.colors);
        output.D(serialDesc, 1, dVarArr[1], self.typography);
        output.D(serialDesc, 2, dVarArr[2], self.radius);
        if (!output.G(serialDesc, 3)) {
            if (p013kotlin.jvm.internal.s.f(self.internal, new OrcaInternalDefaults(0, 0, 0, 0, 0, 31, (DefaultConstructorMarker) null))) {
                return;
            }
        }
        output.D(serialDesc, 3, OrcaInternalDefaults.a.f26493a, self.internal);
    }

    public OrcaStylingDefaults(Map colors, Map typography, Map radius, OrcaInternalDefaults internal) {
        p013kotlin.jvm.internal.s.k(colors, "colors");
        p013kotlin.jvm.internal.s.k(typography, "typography");
        p013kotlin.jvm.internal.s.k(radius, "radius");
        p013kotlin.jvm.internal.s.k(internal, "internal");
        this.colors = colors;
        this.typography = typography;
        this.radius = radius;
        this.internal = internal;
    }

    public /* synthetic */ OrcaStylingDefaults(Map map, Map map2, Map map3, OrcaInternalDefaults orcaInternalDefaults, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 8) != 0) {
            orcaInternalDefaults = new OrcaInternalDefaults(0, 0, 0, 0, 0, 31, (DefaultConstructorMarker) null);
        }
        this(map, map2, map3, orcaInternalDefaults);
    }
}

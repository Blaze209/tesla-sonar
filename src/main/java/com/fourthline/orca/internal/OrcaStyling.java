package com.fourthline.orca.internal;

import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kp, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\u001f\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u0013\u0010\"¨\u0006$"}, d2 = {"Lcom/fourthline/orca/internal/kp;", "", "Lcom/fourthline/orca/internal/lp;", "palettes", "Lcom/fourthline/orca/internal/mp;", "elements", "<init>", "(Lcom/fourthline/orca/internal/lp;Lcom/fourthline/orca/internal/mp;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/lp;Lcom/fourthline/orca/internal/mp;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/kp;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/lp;", "b", "()Lcom/fourthline/orca/internal/lp;", "Lcom/fourthline/orca/internal/mp;", "()Lcom/fourthline/orca/internal/mp;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class OrcaStyling {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f33033c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrcaStylingDefaults palettes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrcaStylingElements elements;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kp$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33037b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f33036a = aVar;
            f33037b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.styling.OrcaStyling", aVar, 2);
            m1Var.o("palettes", false);
            m1Var.o("elements", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrcaStyling deserialize(uo0.e decoder) {
            OrcaStylingDefaults orcaStylingDefaults;
            OrcaStylingElements orcaStylingElements;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                orcaStylingDefaults = (OrcaStylingDefaults) cVarB.n(fVar, 0, OrcaStylingDefaults.a.f33384a, null);
                orcaStylingElements = (OrcaStylingElements) cVarB.n(fVar, 1, OrcaStylingElements.a.f33647a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                orcaStylingDefaults = null;
                OrcaStylingElements orcaStylingElements2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        orcaStylingDefaults = (OrcaStylingDefaults) cVarB.n(fVar, 0, OrcaStylingDefaults.a.f33384a, orcaStylingDefaults);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        orcaStylingElements2 = (OrcaStylingElements) cVarB.n(fVar, 1, OrcaStylingElements.a.f33647a, orcaStylingElements2);
                        i12 |= 2;
                    }
                }
                orcaStylingElements = orcaStylingElements2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new OrcaStyling(i11, orcaStylingDefaults, orcaStylingElements, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{OrcaStylingDefaults.a.f33384a, OrcaStylingElements.a.f33647a};
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
        public final void serialize(uo0.f encoder, OrcaStyling value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            OrcaStyling.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kp$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String b(String str) {
            File file = new File(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), p013kotlin.text.d.UTF_8), PKIFailureInfo.certRevoked);
            try {
                String strF = sn0.r.f(bufferedReader);
                sn0.b.a(bufferedReader, null);
                return strF;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(bufferedReader, th2);
                    throw th3;
                }
            }
        }

        public final Map a(String path) {
            p013kotlin.jvm.internal.s.k(path, "path");
            String strB = b(path);
            wo0.b bVarA = Ki.a();
            bVarA.getSerializersModule();
            JsonObject jsonObjectO = wo0.j.o(Ki.a(wo0.j.o(Ki.a((JsonObject) bVarA.d(JsonObject.INSTANCE.serializer(), strB), "palettes")), OrcaFlavourKeys.FONTS));
            wo0.b bVarA2 = Ki.a();
            bVarA2.getSerializersModule();
            return (Map) bVarA2.c(new vo0.m0(vo0.z1.f119730a, OrcaFontDefinition.INSTANCE.serializer()), jsonObjectO);
        }

        public final ro0.d<OrcaStyling> serializer() {
            return a.f33036a;
        }

        private Companion() {
        }

        public final OrcaStyling a(String path, Map fontDefaults, String fontPath) {
            p013kotlin.jvm.internal.s.k(path, "path");
            p013kotlin.jvm.internal.s.k(fontDefaults, "fontDefaults");
            p013kotlin.jvm.internal.s.k(fontPath, "fontPath");
            String strB = b(path);
            wo0.b bVarA = Ki.a();
            bVarA.getSerializersModule();
            JsonObject jsonObject = (JsonObject) bVarA.d(JsonObject.INSTANCE.serializer(), strB);
            JsonObject jsonObjectO = wo0.j.o(Ki.a(jsonObject, "palettes"));
            JsonObject jsonObjectO2 = wo0.j.o(Ki.a(jsonObject, "elements"));
            wo0.b bVarA2 = Ki.a();
            JsonElement jsonElementA = Ki.a(jsonObjectO, "colors");
            bVarA2.getSerializersModule();
            vo0.z1 z1Var = vo0.z1.f119730a;
            Map map = (Map) bVarA2.c(new vo0.m0(z1Var, OrcaPaletteColor.INSTANCE.serializer()), jsonElementA);
            Map map2 = (Map) Ki.a().c(new C3998wp(fontDefaults, fontPath), Ki.a(jsonObjectO, "typography"));
            wo0.b bVarA3 = Ki.a();
            JsonElement jsonElementA2 = Ki.a(jsonObjectO, "radius");
            bVarA3.getSerializersModule();
            OrcaStylingDefaults orcaStylingDefaults = new OrcaStylingDefaults(map, map2, (Map) bVarA3.c(new vo0.m0(z1Var, vo0.j0.f119632a), jsonElementA2), (OrcaInternalDefaults) null, 8, (DefaultConstructorMarker) null);
            C3328h4.f32188b.a(orcaStylingDefaults.getColors());
            C3731qg.f34834b.a(orcaStylingDefaults.getTypography());
            C4134zw.f37370b.a(orcaStylingDefaults.getRadius());
            wo0.b bVarA4 = Ki.a();
            bVarA4.getSerializersModule();
            return new OrcaStyling(orcaStylingDefaults, (OrcaStylingElements) bVarA4.c(OrcaStylingElements.INSTANCE.serializer(), jsonObjectO2));
        }
    }

    public /* synthetic */ OrcaStyling(int i11, OrcaStylingDefaults orcaStylingDefaults, OrcaStylingElements orcaStylingElements, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f33036a.getDescriptor());
        }
        this.palettes = orcaStylingDefaults;
        this.elements = orcaStylingElements;
    }

    public static final /* synthetic */ void a(OrcaStyling self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, OrcaStylingDefaults.a.f33384a, self.palettes);
        output.D(serialDesc, 1, OrcaStylingElements.a.f33647a, self.elements);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OrcaStylingDefaults getPalettes() {
        return this.palettes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaStyling)) {
            return false;
        }
        OrcaStyling orcaStyling = (OrcaStyling) other;
        return p013kotlin.jvm.internal.s.f(this.palettes, orcaStyling.palettes) && p013kotlin.jvm.internal.s.f(this.elements, orcaStyling.elements);
    }

    public int hashCode() {
        return (this.palettes.hashCode() * 31) + this.elements.hashCode();
    }

    public String toString() {
        return "OrcaStyling(palettes=" + this.palettes + ", elements=" + this.elements + ")";
    }

    public OrcaStyling(OrcaStylingDefaults palettes, OrcaStylingElements elements) {
        p013kotlin.jvm.internal.s.k(palettes, "palettes");
        p013kotlin.jvm.internal.s.k(elements, "elements");
        this.palettes = palettes;
        this.elements = elements;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OrcaStylingElements getElements() {
        return this.elements;
    }
}

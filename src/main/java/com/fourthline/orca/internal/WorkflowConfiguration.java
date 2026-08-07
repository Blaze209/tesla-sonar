package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fE, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0081\b\u0018\u0000 B2\u00020\u0001:\u0002\u001d*BU\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B]\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R!\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b*\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010.\u001a\u0004\b/\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010.\u001a\u0004\b5\u00106R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010.\u001a\u0004\b:\u0010;R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010.\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/fourthline/orca/internal/fE;", "", "", "", "Lcom/fourthline/orca/core/internal/backend/model/WorkflowModuleType;", "order", "Lcom/fourthline/orca/internal/eh;", "idv", "Lcom/fourthline/orca/internal/Bv;", "qes", "Lcom/fourthline/orca/internal/r2;", "bav", "Lcom/fourthline/orca/internal/Y3;", "idr", "Lcom/fourthline/orca/internal/V3;", "ccr", "<init>", "(Ljava/util/List;Lcom/fourthline/orca/internal/eh;Lcom/fourthline/orca/internal/Bv;Lcom/fourthline/orca/internal/r2;Lcom/fourthline/orca/internal/Y3;Lcom/fourthline/orca/internal/V3;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/fourthline/orca/internal/eh;Lcom/fourthline/orca/internal/Bv;Lcom/fourthline/orca/internal/r2;Lcom/fourthline/orca/internal/Y3;Lcom/fourthline/orca/internal/V3;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/fE;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOrder", "()Ljava/util/List;", "b", "Lcom/fourthline/orca/internal/eh;", "()Lcom/fourthline/orca/internal/eh;", "getIdv$annotations", "()V", "c", "Lcom/fourthline/orca/internal/Bv;", "()Lcom/fourthline/orca/internal/Bv;", "getQes$annotations", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/r2;", "getBav", "()Lcom/fourthline/orca/internal/r2;", "getBav$annotations", "e", "Lcom/fourthline/orca/internal/Y3;", "getIdr", "()Lcom/fourthline/orca/internal/Y3;", "getIdr$annotations", "f", "Lcom/fourthline/orca/internal/V3;", "getCcr", "()Lcom/fourthline/orca/internal/V3;", "getCcr$annotations", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class WorkflowConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f31683g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ro0.d[] f31684h = {new vo0.e(vo0.z1.f119730a), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List order;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdvSettings idv;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final QesSettings qes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BavSettings bav;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CdrSettings idr;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final CcrSettings ccr;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fE$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31692b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f31691a = aVar;
            f31692b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.WorkflowConfiguration", aVar, 6);
            m1Var.o("order", false);
            m1Var.o("IDV", true);
            m1Var.o("QES", true);
            m1Var.o("BAV", true);
            m1Var.o("CDR", true);
            m1Var.o("CCR", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorkflowConfiguration deserialize(uo0.e decoder) {
            int i11;
            List list;
            IdvSettings c3218eh;
            QesSettings bv2;
            BavSettings c3753r2;
            CdrSettings y11;
            CcrSettings v11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = WorkflowConfiguration.f31684h;
            int i12 = 5;
            int i13 = 0;
            List list2 = null;
            if (cVarB.i()) {
                List list3 = (List) cVarB.n(fVar, 0, dVarArr[0], null);
                IdvSettings c3218eh2 = (IdvSettings) cVarB.v(fVar, 1, IdvSettings.a.f31436a, null);
                QesSettings bv3 = (QesSettings) cVarB.v(fVar, 2, QesSettings.a.f25142a, null);
                BavSettings c3753r3 = (BavSettings) cVarB.v(fVar, 3, BavSettings.a.f34963a, null);
                CdrSettings y12 = (CdrSettings) cVarB.v(fVar, 4, CdrSettings.a.f29807a, null);
                list = list3;
                c3218eh = c3218eh2;
                v11 = (CcrSettings) cVarB.v(fVar, 5, CcrSettings.a.f28956a, null);
                c3753r2 = c3753r3;
                y11 = y12;
                bv2 = bv3;
                i11 = 63;
            } else {
                int i14 = 1;
                int i15 = 0;
                IdvSettings c3218eh3 = null;
                QesSettings bv4 = null;
                BavSettings c3753r4 = null;
                CdrSettings y13 = null;
                CcrSettings v12 = null;
                while (i14 != 0) {
                    int i16 = i13;
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            i13 = i16;
                            i14 = i13;
                            i12 = 5;
                            break;
                        case 0:
                            list2 = (List) cVarB.n(fVar, i16, dVarArr[i16], list2);
                            i15 |= 1;
                            i13 = i16;
                            i12 = 5;
                            break;
                        case 1:
                            c3218eh3 = (IdvSettings) cVarB.v(fVar, 1, IdvSettings.a.f31436a, c3218eh3);
                            i15 |= 2;
                            i13 = i16;
                            break;
                        case 2:
                            bv4 = (QesSettings) cVarB.v(fVar, 2, QesSettings.a.f25142a, bv4);
                            i15 |= 4;
                            i13 = i16;
                            break;
                        case 3:
                            c3753r4 = (BavSettings) cVarB.v(fVar, 3, BavSettings.a.f34963a, c3753r4);
                            i15 |= 8;
                            i13 = i16;
                            break;
                        case 4:
                            y13 = (CdrSettings) cVarB.v(fVar, 4, CdrSettings.a.f29807a, y13);
                            i15 |= 16;
                            i13 = i16;
                            break;
                        case 5:
                            v12 = (CcrSettings) cVarB.v(fVar, i12, CcrSettings.a.f28956a, v12);
                            i15 |= 32;
                            i13 = i16;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i15;
                list = list2;
                c3218eh = c3218eh3;
                bv2 = bv4;
                c3753r2 = c3753r4;
                y11 = y13;
                v11 = v12;
            }
            cVarB.c(fVar);
            return new WorkflowConfiguration(i11, list, c3218eh, bv2, c3753r2, y11, v11, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{WorkflowConfiguration.f31684h[0], so0.a.p(IdvSettings.a.f31436a), so0.a.p(QesSettings.a.f25142a), so0.a.p(BavSettings.a.f34963a), so0.a.p(CdrSettings.a.f29807a), so0.a.p(CcrSettings.a.f28956a)};
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
        public final void serialize(uo0.f encoder, WorkflowConfiguration value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            WorkflowConfiguration.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fE$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<WorkflowConfiguration> serializer() {
            return a.f31691a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WorkflowConfiguration(int i11, List list, IdvSettings c3218eh, QesSettings bv2, BavSettings c3753r2, CdrSettings y11, CcrSettings v11, vo0.v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f31691a.getDescriptor());
        }
        this.order = list;
        if ((i11 & 2) == 0) {
            this.idv = null;
        } else {
            this.idv = c3218eh;
        }
        if ((i11 & 4) == 0) {
            this.qes = null;
        } else {
            this.qes = bv2;
        }
        if ((i11 & 8) == 0) {
            this.bav = null;
        } else {
            this.bav = c3753r2;
        }
        if ((i11 & 16) == 0) {
            this.idr = null;
        } else {
            this.idr = y11;
        }
        if ((i11 & 32) == 0) {
            this.ccr = null;
        } else {
            this.ccr = v11;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final IdvSettings getIdv() {
        return this.idv;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final QesSettings getQes() {
        return this.qes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowConfiguration)) {
            return false;
        }
        WorkflowConfiguration workflowConfiguration = (WorkflowConfiguration) other;
        return p013kotlin.jvm.internal.s.f(this.order, workflowConfiguration.order) && p013kotlin.jvm.internal.s.f(this.idv, workflowConfiguration.idv) && p013kotlin.jvm.internal.s.f(this.qes, workflowConfiguration.qes) && p013kotlin.jvm.internal.s.f(this.bav, workflowConfiguration.bav) && p013kotlin.jvm.internal.s.f(this.idr, workflowConfiguration.idr) && p013kotlin.jvm.internal.s.f(this.ccr, workflowConfiguration.ccr);
    }

    public int hashCode() {
        int iHashCode = this.order.hashCode() * 31;
        IdvSettings c3218eh = this.idv;
        int iHashCode2 = (iHashCode + (c3218eh == null ? 0 : c3218eh.hashCode())) * 31;
        QesSettings bv2 = this.qes;
        int iHashCode3 = (iHashCode2 + (bv2 == null ? 0 : bv2.hashCode())) * 31;
        BavSettings c3753r2 = this.bav;
        int iHashCode4 = (iHashCode3 + (c3753r2 == null ? 0 : c3753r2.hashCode())) * 31;
        CdrSettings y11 = this.idr;
        int iHashCode5 = (iHashCode4 + (y11 == null ? 0 : y11.hashCode())) * 31;
        CcrSettings v11 = this.ccr;
        return iHashCode5 + (v11 != null ? v11.hashCode() : 0);
    }

    public String toString() {
        return "WorkflowConfiguration(order=" + this.order + ", idv=" + this.idv + ", qes=" + this.qes + ", bav=" + this.bav + ", idr=" + this.idr + ", ccr=" + this.ccr + ")";
    }

    public WorkflowConfiguration(List order, IdvSettings c3218eh, QesSettings bv2, BavSettings c3753r2, CdrSettings y11, CcrSettings v11) {
        p013kotlin.jvm.internal.s.k(order, "order");
        this.order = order;
        this.idv = c3218eh;
        this.qes = bv2;
        this.bav = c3753r2;
        this.idr = y11;
        this.ccr = v11;
    }

    public static final /* synthetic */ void a(WorkflowConfiguration self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, f31684h[0], self.order);
        if (output.G(serialDesc, 1) || self.idv != null) {
            output.y(serialDesc, 1, IdvSettings.a.f31436a, self.idv);
        }
        if (output.G(serialDesc, 2) || self.qes != null) {
            output.y(serialDesc, 2, QesSettings.a.f25142a, self.qes);
        }
        if (output.G(serialDesc, 3) || self.bav != null) {
            output.y(serialDesc, 3, BavSettings.a.f34963a, self.bav);
        }
        if (output.G(serialDesc, 4) || self.idr != null) {
            output.y(serialDesc, 4, CdrSettings.a.f29807a, self.idr);
        }
        if (!output.G(serialDesc, 5) && self.ccr == null) {
            return;
        }
        output.y(serialDesc, 5, CcrSettings.a.f28956a, self.ccr);
    }

    public /* synthetic */ WorkflowConfiguration(List list, IdvSettings c3218eh, QesSettings bv2, BavSettings c3753r2, CdrSettings y11, CcrSettings v11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : c3218eh, (i11 & 4) != 0 ? null : bv2, (i11 & 8) != 0 ? null : c3753r2, (i11 & 16) != 0 ? null : y11, (i11 & 32) != 0 ? null : v11);
    }
}

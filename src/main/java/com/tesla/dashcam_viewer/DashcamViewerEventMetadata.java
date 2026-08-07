package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.m2;
import vo0.z1;

/* JADX INFO: renamed from: com.tesla.dashcam_viewer.k, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 62\u00020\u0001:\u0002$'Bm\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b'\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b,\u0010.R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b/\u00101\"\u0004\b2\u00103R*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00100\u001a\u0004\b4\u00101\"\u0004\b5\u00103¨\u00067"}, d2 = {"Lcom/tesla/dashcam_viewer/k;", "", "", "seen0", "", "Name", "Ljn0/c0;", "EventEpochTimeMs", "TotalDurationMs", "EarliestClipTimeMs", "Lcom/tesla/dashcam_viewer/p;", "EventMetadata", "", "", "Thumbnail", "TotalAvailableCameras", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljn0/c0;Ljn0/c0;Ljn0/c0;Lcom/tesla/dashcam_viewer/p;Ljava/util/List;Ljava/util/List;Lvo0/v1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "j", "(Lcom/tesla/dashcam_viewer/k;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "J", "c", "()J", "h", DateTokenConverter.CONVERTER_KEY, "Lcom/tesla/dashcam_viewer/p;", "()Lcom/tesla/dashcam_viewer/p;", "f", "Ljava/util/List;", "()Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)V", "g", "setTotalAvailableCameras", "Companion", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class DashcamViewerEventMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ro0.d<Object>[] f55897h = {null, null, null, null, null, new vo0.e(vo0.k.f119637a), new vo0.e(z1.f119730a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String Name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long EventEpochTimeMs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long TotalDurationMs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long EarliestClipTimeMs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final EventMetadata EventMetadata;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private List<Byte> Thumbnail;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private List<String> TotalAvailableCameras;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.k$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/tesla/dashcam_viewer/DashcamViewerEventMetadata.$serializer", "Lvo0/e0;", "Lcom/tesla/dashcam_viewer/k;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/tesla/dashcam_viewer/k;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/tesla/dashcam_viewer/k;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a implements vo0.e0<DashcamViewerEventMetadata> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f55905a;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f55905a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.tesla.dashcam_viewer.DashcamViewerEventMetadata", aVar, 7);
            m1Var.o("Name", true);
            m1Var.o("EventEpochTimeMs", false);
            m1Var.o("TotalDurationMs", false);
            m1Var.o("EarliestClipTimeMs", false);
            m1Var.o("EventMetadata", false);
            m1Var.o("Thumbnail", true);
            m1Var.o("TotalAvailableCameras", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DashcamViewerEventMetadata deserialize(uo0.e decoder) {
            int i11;
            List list;
            List list2;
            String str;
            jn0.c0 c0Var;
            jn0.c0 c0Var2;
            jn0.c0 c0Var3;
            EventMetadata eventMetadata;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = DashcamViewerEventMetadata.f55897h;
            int i12 = 3;
            String str2 = null;
            if (cVarB.i()) {
                String str3 = (String) cVarB.v(fVar, 0, z1.f119730a, null);
                m2 m2Var = m2.f119659a;
                jn0.c0 c0Var4 = (jn0.c0) cVarB.n(fVar, 1, m2Var, null);
                jn0.c0 c0Var5 = (jn0.c0) cVarB.n(fVar, 2, m2Var, null);
                jn0.c0 c0Var6 = (jn0.c0) cVarB.n(fVar, 3, m2Var, null);
                EventMetadata eventMetadata2 = (EventMetadata) cVarB.n(fVar, 4, EventMetadata.a.f55961a, null);
                List list3 = (List) cVarB.v(fVar, 5, dVarArr[5], null);
                list = (List) cVarB.v(fVar, 6, dVarArr[6], null);
                str = str3;
                c0Var3 = c0Var6;
                eventMetadata = eventMetadata2;
                c0Var2 = c0Var5;
                i11 = 127;
                list2 = list3;
                c0Var = c0Var4;
            } else {
                boolean z11 = true;
                int i13 = 0;
                List list4 = null;
                List list5 = null;
                jn0.c0 c0Var7 = null;
                jn0.c0 c0Var8 = null;
                jn0.c0 c0Var9 = null;
                EventMetadata eventMetadata3 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            i12 = 3;
                            break;
                        case 0:
                            str2 = (String) cVarB.v(fVar, 0, z1.f119730a, str2);
                            i13 |= 1;
                            i12 = 3;
                            break;
                        case 1:
                            c0Var7 = (jn0.c0) cVarB.n(fVar, 1, m2.f119659a, c0Var7);
                            i13 |= 2;
                            i12 = 3;
                            break;
                        case 2:
                            c0Var8 = (jn0.c0) cVarB.n(fVar, 2, m2.f119659a, c0Var8);
                            i13 |= 4;
                            i12 = 3;
                            break;
                        case 3:
                            c0Var9 = (jn0.c0) cVarB.n(fVar, i12, m2.f119659a, c0Var9);
                            i13 |= 8;
                            break;
                        case 4:
                            eventMetadata3 = (EventMetadata) cVarB.n(fVar, 4, EventMetadata.a.f55961a, eventMetadata3);
                            i13 |= 16;
                            break;
                        case 5:
                            list5 = (List) cVarB.v(fVar, 5, dVarArr[5], list5);
                            i13 |= 32;
                            break;
                        case 6:
                            list4 = (List) cVarB.v(fVar, 6, dVarArr[6], list4);
                            i13 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i13;
                list = list4;
                list2 = list5;
                str = str2;
                c0Var = c0Var7;
                c0Var2 = c0Var8;
                c0Var3 = c0Var9;
                eventMetadata = eventMetadata3;
            }
            cVarB.c(fVar);
            return new DashcamViewerEventMetadata(i11, str, c0Var, c0Var2, c0Var3, eventMetadata, list2, list, null, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, DashcamViewerEventMetadata value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            DashcamViewerEventMetadata.j(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            ro0.d[] dVarArr = DashcamViewerEventMetadata.f55897h;
            ro0.d<?> dVarP = so0.a.p(z1.f119730a);
            ro0.d<?> dVarP2 = so0.a.p(dVarArr[5]);
            ro0.d<?> dVarP3 = so0.a.p(dVarArr[6]);
            m2 m2Var = m2.f119659a;
            return new ro0.d[]{dVarP, m2Var, m2Var, m2Var, EventMetadata.a.f55961a, dVarP2, dVarP3};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/dashcam_viewer/k$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/tesla/dashcam_viewer/k;", "serializer", "()Lro0/d;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<DashcamViewerEventMetadata> serializer() {
            return a.f55905a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DashcamViewerEventMetadata(int i11, String str, jn0.c0 c0Var, jn0.c0 c0Var2, jn0.c0 c0Var3, EventMetadata eventMetadata, List list, List list2, vo0.v1 v1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, c0Var, c0Var2, c0Var3, eventMetadata, list, list2, v1Var);
    }

    public static final /* synthetic */ void j(DashcamViewerEventMetadata self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f55897h;
        if (output.G(serialDesc, 0) || self.Name != null) {
            output.y(serialDesc, 0, z1.f119730a, self.Name);
        }
        m2 m2Var = m2.f119659a;
        output.D(serialDesc, 1, m2Var, jn0.c0.a(self.EventEpochTimeMs));
        output.D(serialDesc, 2, m2Var, jn0.c0.a(self.TotalDurationMs));
        output.D(serialDesc, 3, m2Var, jn0.c0.a(self.EarliestClipTimeMs));
        output.D(serialDesc, 4, EventMetadata.a.f55961a, self.EventMetadata);
        if (output.G(serialDesc, 5) || self.Thumbnail != null) {
            output.y(serialDesc, 5, dVarArr[5], self.Thumbnail);
        }
        if (!output.G(serialDesc, 6) && self.TotalAvailableCameras == null) {
            return;
        }
        output.y(serialDesc, 6, dVarArr[6], self.TotalAvailableCameras);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEarliestClipTimeMs() {
        return this.EarliestClipTimeMs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getEventEpochTimeMs() {
        return this.EventEpochTimeMs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EventMetadata getEventMetadata() {
        return this.EventMetadata;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.Name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashcamViewerEventMetadata)) {
            return false;
        }
        DashcamViewerEventMetadata dashcamViewerEventMetadata = (DashcamViewerEventMetadata) other;
        return p013kotlin.jvm.internal.s.f(this.Name, dashcamViewerEventMetadata.Name) && this.EventEpochTimeMs == dashcamViewerEventMetadata.EventEpochTimeMs && this.TotalDurationMs == dashcamViewerEventMetadata.TotalDurationMs && this.EarliestClipTimeMs == dashcamViewerEventMetadata.EarliestClipTimeMs && p013kotlin.jvm.internal.s.f(this.EventMetadata, dashcamViewerEventMetadata.EventMetadata) && p013kotlin.jvm.internal.s.f(this.Thumbnail, dashcamViewerEventMetadata.Thumbnail) && p013kotlin.jvm.internal.s.f(this.TotalAvailableCameras, dashcamViewerEventMetadata.TotalAvailableCameras);
    }

    public final List<Byte> f() {
        return this.Thumbnail;
    }

    public final List<String> g() {
        return this.TotalAvailableCameras;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getTotalDurationMs() {
        return this.TotalDurationMs;
    }

    public int hashCode() {
        String str = this.Name;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + jn0.c0.e(this.EventEpochTimeMs)) * 31) + jn0.c0.e(this.TotalDurationMs)) * 31) + jn0.c0.e(this.EarliestClipTimeMs)) * 31) + this.EventMetadata.hashCode()) * 31;
        List<Byte> list = this.Thumbnail;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.TotalAvailableCameras;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void i(List<Byte> list) {
        this.Thumbnail = list;
    }

    public String toString() {
        return "DashcamViewerEventMetadata(Name=" + this.Name + ", EventEpochTimeMs=" + jn0.c0.f(this.EventEpochTimeMs) + ", TotalDurationMs=" + jn0.c0.f(this.TotalDurationMs) + ", EarliestClipTimeMs=" + jn0.c0.f(this.EarliestClipTimeMs) + ", EventMetadata=" + this.EventMetadata + ", Thumbnail=" + this.Thumbnail + ", TotalAvailableCameras=" + this.TotalAvailableCameras + ")";
    }

    private /* synthetic */ DashcamViewerEventMetadata(int i11, String str, jn0.c0 c0Var, jn0.c0 c0Var2, jn0.c0 c0Var3, EventMetadata eventMetadata, List list, List list2, vo0.v1 v1Var) {
        if (30 != (i11 & 30)) {
            vo0.h1.b(i11, 30, a.f55905a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.Name = null;
        } else {
            this.Name = str;
        }
        this.EventEpochTimeMs = c0Var.getData();
        this.TotalDurationMs = c0Var2.getData();
        this.EarliestClipTimeMs = c0Var3.getData();
        this.EventMetadata = eventMetadata;
        if ((i11 & 32) == 0) {
            this.Thumbnail = null;
        } else {
            this.Thumbnail = list;
        }
        if ((i11 & 64) == 0) {
            this.TotalAvailableCameras = null;
        } else {
            this.TotalAvailableCameras = list2;
        }
    }
}

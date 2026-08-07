package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.z1;

/* JADX INFO: renamed from: com.tesla.dashcam_viewer.l, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002\u001d B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0016\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/tesla/dashcam_viewer/l;", "", "Lcom/tesla/dashcam_viewer/k;", OrcaKeys.METADATA, "", "thumbnail", "<init>", "(Lcom/tesla/dashcam_viewer/k;Ljava/lang/String;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/tesla/dashcam_viewer/k;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/tesla/dashcam_viewer/l;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/tesla/dashcam_viewer/k;", "()Lcom/tesla/dashcam_viewer/k;", "b", "Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "Companion", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class DashcamViewerEventMetadataForJS {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DashcamViewerEventMetadata metadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String thumbnail;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.l$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/tesla/dashcam_viewer/DashcamViewerEventMetadataForJS.$serializer", "Lvo0/e0;", "Lcom/tesla/dashcam_viewer/l;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/tesla/dashcam_viewer/l;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/tesla/dashcam_viewer/l;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a implements vo0.e0<DashcamViewerEventMetadataForJS> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f55913a;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f55913a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.tesla.dashcam_viewer.DashcamViewerEventMetadataForJS", aVar, 2);
            m1Var.o(OrcaKeys.METADATA, false);
            m1Var.o("thumbnail", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DashcamViewerEventMetadataForJS deserialize(uo0.e decoder) {
            DashcamViewerEventMetadata dashcamViewerEventMetadata;
            String str;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                dashcamViewerEventMetadata = (DashcamViewerEventMetadata) cVarB.n(fVar, 0, DashcamViewerEventMetadata.a.f55905a, null);
                str = (String) cVarB.v(fVar, 1, z1.f119730a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                dashcamViewerEventMetadata = null;
                String str2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        dashcamViewerEventMetadata = (DashcamViewerEventMetadata) cVarB.n(fVar, 0, DashcamViewerEventMetadata.a.f55905a, dashcamViewerEventMetadata);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        str2 = (String) cVarB.v(fVar, 1, z1.f119730a, str2);
                        i12 |= 2;
                    }
                }
                str = str2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new DashcamViewerEventMetadataForJS(i11, dashcamViewerEventMetadata, str, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, DashcamViewerEventMetadataForJS value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            DashcamViewerEventMetadataForJS.d(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            return new ro0.d[]{DashcamViewerEventMetadata.a.f55905a, so0.a.p(z1.f119730a)};
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

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/dashcam_viewer/l$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/tesla/dashcam_viewer/l;", "serializer", "()Lro0/d;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<DashcamViewerEventMetadataForJS> serializer() {
            return a.f55913a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DashcamViewerEventMetadataForJS(int i11, DashcamViewerEventMetadata dashcamViewerEventMetadata, String str, vo0.v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f55913a.getDescriptor());
        }
        this.metadata = dashcamViewerEventMetadata;
        if ((i11 & 2) == 0) {
            this.thumbnail = null;
        } else {
            this.thumbnail = str;
        }
    }

    public static final /* synthetic */ void d(DashcamViewerEventMetadataForJS self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, DashcamViewerEventMetadata.a.f55905a, self.metadata);
        if (!output.G(serialDesc, 1) && self.thumbnail == null) {
            return;
        }
        output.y(serialDesc, 1, z1.f119730a, self.thumbnail);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DashcamViewerEventMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final void c(String str) {
        this.thumbnail = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashcamViewerEventMetadataForJS)) {
            return false;
        }
        DashcamViewerEventMetadataForJS dashcamViewerEventMetadataForJS = (DashcamViewerEventMetadataForJS) other;
        return p013kotlin.jvm.internal.s.f(this.metadata, dashcamViewerEventMetadataForJS.metadata) && p013kotlin.jvm.internal.s.f(this.thumbnail, dashcamViewerEventMetadataForJS.thumbnail);
    }

    public int hashCode() {
        int iHashCode = this.metadata.hashCode() * 31;
        String str = this.thumbnail;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DashcamViewerEventMetadataForJS(metadata=" + this.metadata + ", thumbnail=" + this.thumbnail + ")";
    }

    public DashcamViewerEventMetadataForJS(DashcamViewerEventMetadata metadata, String str) {
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        this.metadata = metadata;
        this.thumbnail = str;
    }

    public /* synthetic */ DashcamViewerEventMetadataForJS(DashcamViewerEventMetadata dashcamViewerEventMetadata, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dashcamViewerEventMetadata, (i11 & 2) != 0 ? null : str);
    }
}

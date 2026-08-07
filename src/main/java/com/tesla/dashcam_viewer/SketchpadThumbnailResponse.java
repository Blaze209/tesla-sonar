package com.tesla.dashcam_viewer;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.m2;
import vo0.z1;

/* JADX INFO: renamed from: com.tesla.dashcam_viewer.l1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@ro0.o("sketchpad_thumbnail")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002\u001e!B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006%"}, d2 = {"Lcom/tesla/dashcam_viewer/l1;", "Lcom/tesla/dashcam_viewer/k1;", "", "seen0", "", "Id", "Filename", "Ljn0/c0;", "Epoch", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljn0/c0;Lvo0/v1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "c", "(Lcom/tesla/dashcam_viewer/l1;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "J", "()J", "Companion", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class SketchpadThumbnailResponse implements k1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String Id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String Filename;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long Epoch;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.l1$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/tesla/dashcam_viewer/SketchpadThumbnailResponse.$serializer", "Lvo0/e0;", "Lcom/tesla/dashcam_viewer/l1;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/tesla/dashcam_viewer/l1;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/tesla/dashcam_viewer/l1;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a implements vo0.e0<SketchpadThumbnailResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f55921a;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f55921a = aVar;
            vo0.m1 m1Var = new vo0.m1("sketchpad_thumbnail", aVar, 3);
            m1Var.o("Id", true);
            m1Var.o("Filename", false);
            m1Var.o("Epoch", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SketchpadThumbnailResponse deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            jn0.c0 c0Var;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(fVar, 0);
                String strT3 = cVarB.t(fVar, 1);
                str = strT2;
                c0Var = (jn0.c0) cVarB.n(fVar, 2, m2.f119659a, null);
                str2 = strT3;
                i11 = 7;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String strT4 = null;
                jn0.c0 c0Var2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(fVar, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        strT4 = cVarB.t(fVar, 1);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        c0Var2 = (jn0.c0) cVarB.n(fVar, 2, m2.f119659a, c0Var2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                str = strT;
                str2 = strT4;
                c0Var = c0Var2;
            }
            cVarB.c(fVar);
            return new SketchpadThumbnailResponse(i11, str, str2, c0Var, null, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, SketchpadThumbnailResponse value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            SketchpadThumbnailResponse.c(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            z1 z1Var = z1.f119730a;
            return new ro0.d[]{z1Var, z1Var, m2.f119659a};
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

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.l1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/dashcam_viewer/l1$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/tesla/dashcam_viewer/l1;", "serializer", "()Lro0/d;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<SketchpadThumbnailResponse> serializer() {
            return a.f55921a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SketchpadThumbnailResponse(int i11, String str, String str2, jn0.c0 c0Var, vo0.v1 v1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, c0Var, v1Var);
    }

    public static final /* synthetic */ void c(SketchpadThumbnailResponse self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.getId(), "sketchpad_thumbnail")) {
            output.e(serialDesc, 0, self.getId());
        }
        output.e(serialDesc, 1, self.Filename);
        output.D(serialDesc, 2, m2.f119659a, jn0.c0.a(self.Epoch));
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEpoch() {
        return this.Epoch;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFilename() {
        return this.Filename;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SketchpadThumbnailResponse)) {
            return false;
        }
        SketchpadThumbnailResponse sketchpadThumbnailResponse = (SketchpadThumbnailResponse) other;
        return p013kotlin.jvm.internal.s.f(this.Id, sketchpadThumbnailResponse.Id) && p013kotlin.jvm.internal.s.f(this.Filename, sketchpadThumbnailResponse.Filename) && this.Epoch == sketchpadThumbnailResponse.Epoch;
    }

    @Override // com.tesla.dashcam_viewer.k1
    public String getId() {
        return this.Id;
    }

    public int hashCode() {
        return (((this.Id.hashCode() * 31) + this.Filename.hashCode()) * 31) + jn0.c0.e(this.Epoch);
    }

    public String toString() {
        return "SketchpadThumbnailResponse(Id=" + this.Id + ", Filename=" + this.Filename + ", Epoch=" + jn0.c0.f(this.Epoch) + ")";
    }

    private /* synthetic */ SketchpadThumbnailResponse(int i11, String str, String str2, jn0.c0 c0Var, vo0.v1 v1Var) {
        if (6 != (i11 & 6)) {
            vo0.h1.b(i11, 6, a.f55921a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.Id = "sketchpad_thumbnail";
        } else {
            this.Id = str;
        }
        this.Filename = str2;
        this.Epoch = c0Var.getData();
    }
}

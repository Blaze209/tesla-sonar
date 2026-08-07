package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.m2;
import vo0.z1;

/* JADX INFO: renamed from: com.tesla.dashcam_viewer.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u001d\u001fB7\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Lcom/tesla/dashcam_viewer/f;", "", "", "seen0", "", "Filename", "Ljn0/c0;", "Epoch", "", "isInternal", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljn0/c0;ZLvo0/v1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/tesla/dashcam_viewer/f;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "c", "Z", "()Z", "Companion", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class CreationsFileMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String Filename;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long Epoch;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInternal;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.f$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/tesla/dashcam_viewer/CreationsFileMetadata.$serializer", "Lvo0/e0;", "Lcom/tesla/dashcam_viewer/f;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/tesla/dashcam_viewer/f;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/tesla/dashcam_viewer/f;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a implements vo0.e0<CreationsFileMetadata> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f55838a;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f55838a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.tesla.dashcam_viewer.CreationsFileMetadata", aVar, 3);
            m1Var.o("Filename", false);
            m1Var.o("Epoch", false);
            m1Var.o("isInternal", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CreationsFileMetadata deserialize(uo0.e decoder) {
            boolean zW;
            int i11;
            String str;
            jn0.c0 c0Var;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            if (cVarB.i()) {
                String strT = cVarB.t(fVar, 0);
                jn0.c0 c0Var2 = (jn0.c0) cVarB.n(fVar, 1, m2.f119659a, null);
                str = strT;
                zW = cVarB.w(fVar, 2);
                c0Var = c0Var2;
                i11 = 7;
            } else {
                boolean z11 = true;
                boolean zW2 = false;
                String strT2 = null;
                jn0.c0 c0Var3 = null;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT2 = cVarB.t(fVar, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        c0Var3 = (jn0.c0) cVarB.n(fVar, 1, m2.f119659a, c0Var3);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        zW2 = cVarB.w(fVar, 2);
                        i12 |= 4;
                    }
                }
                zW = zW2;
                i11 = i12;
                str = strT2;
                c0Var = c0Var3;
            }
            cVarB.c(fVar);
            return new CreationsFileMetadata(i11, str, c0Var, zW, null, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, CreationsFileMetadata value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            CreationsFileMetadata.d(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            return new ro0.d[]{z1.f119730a, m2.f119659a, vo0.h.f119620a};
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

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/dashcam_viewer/f$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/tesla/dashcam_viewer/f;", "serializer", "()Lro0/d;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<CreationsFileMetadata> serializer() {
            return a.f55838a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreationsFileMetadata(int i11, String str, jn0.c0 c0Var, boolean z11, vo0.v1 v1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, c0Var, z11, v1Var);
    }

    public static final /* synthetic */ void d(CreationsFileMetadata self, uo0.d output, to0.f serialDesc) {
        output.e(serialDesc, 0, self.Filename);
        output.D(serialDesc, 1, m2.f119659a, jn0.c0.a(self.Epoch));
        if (output.G(serialDesc, 2) || self.isInternal) {
            output.A(serialDesc, 2, self.isInternal);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEpoch() {
        return this.Epoch;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFilename() {
        return this.Filename;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsInternal() {
        return this.isInternal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreationsFileMetadata)) {
            return false;
        }
        CreationsFileMetadata creationsFileMetadata = (CreationsFileMetadata) other;
        return p013kotlin.jvm.internal.s.f(this.Filename, creationsFileMetadata.Filename) && this.Epoch == creationsFileMetadata.Epoch && this.isInternal == creationsFileMetadata.isInternal;
    }

    public int hashCode() {
        return (((this.Filename.hashCode() * 31) + jn0.c0.e(this.Epoch)) * 31) + Boolean.hashCode(this.isInternal);
    }

    public String toString() {
        return "CreationsFileMetadata(Filename=" + this.Filename + ", Epoch=" + jn0.c0.f(this.Epoch) + ", isInternal=" + this.isInternal + ")";
    }

    private /* synthetic */ CreationsFileMetadata(int i11, String str, jn0.c0 c0Var, boolean z11, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f55838a.getDescriptor());
        }
        this.Filename = str;
        this.Epoch = c0Var.getData();
        if ((i11 & 4) == 0) {
            this.isInternal = false;
        } else {
            this.isInternal = z11;
        }
    }
}

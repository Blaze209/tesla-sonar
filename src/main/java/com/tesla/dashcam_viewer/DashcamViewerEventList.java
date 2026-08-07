package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.z1;

/* JADX INFO: renamed from: com.tesla.dashcam_viewer.j, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002 $Be\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b'\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/tesla/dashcam_viewer/j;", "", "", "seen0", "", "Lcom/tesla/dashcam_viewer/i;", "SentryClips", "SavedClips", "EmergencyClips", "InternalClips", "", "Error", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lcom/tesla/dashcam_viewer/j;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "e", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "Companion", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class DashcamViewerEventList {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d<Object>[] f55885f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DashcamViewerEvent> SentryClips;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DashcamViewerEvent> SavedClips;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DashcamViewerEvent> EmergencyClips;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DashcamViewerEvent> InternalClips;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String Error;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.j$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/tesla/dashcam_viewer/DashcamViewerEventList.$serializer", "Lvo0/e0;", "Lcom/tesla/dashcam_viewer/j;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/tesla/dashcam_viewer/j;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/tesla/dashcam_viewer/j;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a implements vo0.e0<DashcamViewerEventList> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f55891a;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f55891a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.tesla.dashcam_viewer.DashcamViewerEventList", aVar, 5);
            m1Var.o("SentryClips", false);
            m1Var.o("SavedClips", false);
            m1Var.o("EmergencyClips", false);
            m1Var.o("InternalClips", false);
            m1Var.o("Error", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DashcamViewerEventList deserialize(uo0.e decoder) {
            int i11;
            List list;
            List list2;
            List list3;
            List list4;
            String str;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = DashcamViewerEventList.f55885f;
            int i12 = 0;
            List list5 = null;
            if (cVarB.i()) {
                List list6 = (List) cVarB.n(fVar, 0, dVarArr[0], null);
                List list7 = (List) cVarB.n(fVar, 1, dVarArr[1], null);
                List list8 = (List) cVarB.n(fVar, 2, dVarArr[2], null);
                list4 = (List) cVarB.n(fVar, 3, dVarArr[3], null);
                list = list6;
                str = (String) cVarB.v(fVar, 4, z1.f119730a, null);
                i11 = 31;
                list3 = list8;
                list2 = list7;
            } else {
                int i13 = 1;
                int i14 = 0;
                List list9 = null;
                List list10 = null;
                List list11 = null;
                String str2 = null;
                while (i13 != 0) {
                    int iA = cVarB.A(fVar);
                    int i15 = i12;
                    if (iA == -1) {
                        i12 = i15;
                        i13 = i12;
                    } else if (iA != 0) {
                        if (iA == 1) {
                            list9 = (List) cVarB.n(fVar, 1, dVarArr[1], list9);
                            i14 |= 2;
                        } else if (iA == 2) {
                            list10 = (List) cVarB.n(fVar, 2, dVarArr[2], list10);
                            i14 |= 4;
                        } else if (iA == 3) {
                            list11 = (List) cVarB.n(fVar, 3, dVarArr[3], list11);
                            i14 |= 8;
                        } else {
                            if (iA != 4) {
                                throw new UnknownFieldException(iA);
                            }
                            str2 = (String) cVarB.v(fVar, 4, z1.f119730a, str2);
                            i14 |= 16;
                        }
                        i12 = i15;
                    } else {
                        list5 = (List) cVarB.n(fVar, i15, dVarArr[i15], list5);
                        i14 |= 1;
                        i12 = i15;
                    }
                }
                i11 = i14;
                list = list5;
                list2 = list9;
                list3 = list10;
                list4 = list11;
                str = str2;
            }
            cVarB.c(fVar);
            return new DashcamViewerEventList(i11, list, list2, list3, list4, str, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, DashcamViewerEventList value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            DashcamViewerEventList.g(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = DashcamViewerEventList.f55885f;
            return new ro0.d[]{dVarArr[0], dVarArr[1], dVarArr[2], dVarArr[3], so0.a.p(z1.f119730a)};
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

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.j$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/dashcam_viewer/j$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/tesla/dashcam_viewer/j;", "serializer", "()Lro0/d;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<DashcamViewerEventList> serializer() {
            return a.f55891a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DashcamViewerEvent.a aVar = DashcamViewerEvent.a.f55879a;
        f55885f = new ro0.d[]{new vo0.e(aVar), new vo0.e(aVar), new vo0.e(aVar), new vo0.e(aVar), null};
    }

    public /* synthetic */ DashcamViewerEventList(int i11, List list, List list2, List list3, List list4, String str, vo0.v1 v1Var) {
        if (15 != (i11 & 15)) {
            vo0.h1.b(i11, 15, a.f55891a.getDescriptor());
        }
        this.SentryClips = list;
        this.SavedClips = list2;
        this.EmergencyClips = list3;
        this.InternalClips = list4;
        if ((i11 & 16) == 0) {
            this.Error = null;
        } else {
            this.Error = str;
        }
    }

    public static final /* synthetic */ void g(DashcamViewerEventList self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f55885f;
        output.D(serialDesc, 0, dVarArr[0], self.SentryClips);
        output.D(serialDesc, 1, dVarArr[1], self.SavedClips);
        output.D(serialDesc, 2, dVarArr[2], self.EmergencyClips);
        output.D(serialDesc, 3, dVarArr[3], self.InternalClips);
        if (!output.G(serialDesc, 4) && self.Error == null) {
            return;
        }
        output.y(serialDesc, 4, z1.f119730a, self.Error);
    }

    public final List<DashcamViewerEvent> b() {
        return this.EmergencyClips;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getError() {
        return this.Error;
    }

    public final List<DashcamViewerEvent> d() {
        return this.InternalClips;
    }

    public final List<DashcamViewerEvent> e() {
        return this.SavedClips;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashcamViewerEventList)) {
            return false;
        }
        DashcamViewerEventList dashcamViewerEventList = (DashcamViewerEventList) other;
        return p013kotlin.jvm.internal.s.f(this.SentryClips, dashcamViewerEventList.SentryClips) && p013kotlin.jvm.internal.s.f(this.SavedClips, dashcamViewerEventList.SavedClips) && p013kotlin.jvm.internal.s.f(this.EmergencyClips, dashcamViewerEventList.EmergencyClips) && p013kotlin.jvm.internal.s.f(this.InternalClips, dashcamViewerEventList.InternalClips) && p013kotlin.jvm.internal.s.f(this.Error, dashcamViewerEventList.Error);
    }

    public final List<DashcamViewerEvent> f() {
        return this.SentryClips;
    }

    public int hashCode() {
        int iHashCode = ((((((this.SentryClips.hashCode() * 31) + this.SavedClips.hashCode()) * 31) + this.EmergencyClips.hashCode()) * 31) + this.InternalClips.hashCode()) * 31;
        String str = this.Error;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DashcamViewerEventList(SentryClips=" + this.SentryClips + ", SavedClips=" + this.SavedClips + ", EmergencyClips=" + this.EmergencyClips + ", InternalClips=" + this.InternalClips + ", Error=" + this.Error + ")";
    }
}

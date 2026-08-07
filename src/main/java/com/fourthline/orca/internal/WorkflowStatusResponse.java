package com.fourthline.orca.internal;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sF, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002\u0013\u001fB5\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006#"}, d2 = {"Lcom/fourthline/orca/internal/sF;", "", "", "seen0", "", "onboardingStatus", "", "Lcom/fourthline/orca/internal/AC;", "moduleStatuses", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/sF;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class WorkflowStatusResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35274c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ro0.d[] f35275d = {null, new vo0.e(UnparsedModuleStatus.a.f24914a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onboardingStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List moduleStatuses;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sF$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f35279b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f35278a = aVar;
            f35279b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.WorkflowStatusResponse", aVar, 2);
            m1Var.o("onboardingStatus", false);
            m1Var.o("moduleStatuses", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorkflowStatusResponse deserialize(uo0.e decoder) {
            List list;
            String strT;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = WorkflowStatusResponse.f35275d;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                strT = cVarB.t(fVar, 0);
                list = (List) cVarB.n(fVar, 1, dVarArr[1], null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                List list2 = null;
                String strT2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT2 = cVarB.t(fVar, 0);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        list2 = (List) cVarB.n(fVar, 1, dVarArr[1], list2);
                        i12 |= 2;
                    }
                }
                list = list2;
                strT = strT2;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new WorkflowStatusResponse(i11, strT, list, v1Var);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{vo0.z1.f119730a, WorkflowStatusResponse.f35275d[1]};
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
        public final void serialize(uo0.f encoder, WorkflowStatusResponse value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            WorkflowStatusResponse.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sF$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<WorkflowStatusResponse> serializer() {
            return a.f35278a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WorkflowStatusResponse(int i11, String str, List list, vo0.v1 v1Var) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f35278a.getDescriptor());
        }
        this.onboardingStatus = str;
        this.moduleStatuses = list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getModuleStatuses() {
        return this.moduleStatuses;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOnboardingStatus() {
        return this.onboardingStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowStatusResponse)) {
            return false;
        }
        WorkflowStatusResponse workflowStatusResponse = (WorkflowStatusResponse) other;
        return p013kotlin.jvm.internal.s.f(this.onboardingStatus, workflowStatusResponse.onboardingStatus) && p013kotlin.jvm.internal.s.f(this.moduleStatuses, workflowStatusResponse.moduleStatuses);
    }

    public int hashCode() {
        return (this.onboardingStatus.hashCode() * 31) + this.moduleStatuses.hashCode();
    }

    public String toString() {
        return "WorkflowStatusResponse(onboardingStatus=" + this.onboardingStatus + ", moduleStatuses=" + this.moduleStatuses + ")";
    }

    public static final /* synthetic */ void a(WorkflowStatusResponse self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f35275d;
        output.e(serialDesc, 0, self.onboardingStatus);
        output.D(serialDesc, 1, dVarArr[1], self.moduleStatuses);
    }
}

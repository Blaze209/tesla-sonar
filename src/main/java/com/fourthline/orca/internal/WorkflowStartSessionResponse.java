package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.oF, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002\u0017#B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b#\u0010'¨\u0006)"}, d2 = {"Lcom/fourthline/orca/internal/oF;", "", "", "workflowId", "workflowName", "", "Lcom/fourthline/orca/internal/TE;", "modules", "Lcom/fourthline/orca/internal/a;", "accessTokens", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/oF;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "getWorkflowName", "c", "Ljava/util/List;", "()Ljava/util/List;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class WorkflowStartSessionResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f34124e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ro0.d[] f34125f = {null, null, new vo0.e(WorkflowModule.a.f27871a), new vo0.e(AccessToken.C0539a.f30253a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String workflowId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String workflowName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List modules;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List accessTokens;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oF$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34131b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f34130a = aVar;
            f34131b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.WorkflowStartSessionResponse", aVar, 4);
            m1Var.o("workflowId", false);
            m1Var.o("workflowName", false);
            m1Var.o("modules", false);
            m1Var.o("accessTokens", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorkflowStartSessionResponse deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            List list;
            List list2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = WorkflowStartSessionResponse.f34125f;
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(fVar, 0);
                String strT3 = cVarB.t(fVar, 1);
                List list3 = (List) cVarB.n(fVar, 2, dVarArr[2], null);
                list2 = (List) cVarB.n(fVar, 3, dVarArr[3], null);
                str = strT2;
                i11 = 15;
                list = list3;
                str2 = strT3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String strT4 = null;
                List list4 = null;
                List list5 = null;
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
                    } else if (iA == 2) {
                        list4 = (List) cVarB.n(fVar, 2, dVarArr[2], list4);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        list5 = (List) cVarB.n(fVar, 3, dVarArr[3], list5);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                str = strT;
                str2 = strT4;
                list = list4;
                list2 = list5;
            }
            cVarB.c(fVar);
            return new WorkflowStartSessionResponse(i11, str, str2, list, list2, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            ro0.d[] dVarArr = WorkflowStartSessionResponse.f34125f;
            ro0.d dVar = dVarArr[2];
            ro0.d dVar2 = dVarArr[3];
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{z1Var, z1Var, dVar, dVar2};
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
        public final void serialize(uo0.f encoder, WorkflowStartSessionResponse value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            WorkflowStartSessionResponse.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.oF$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<WorkflowStartSessionResponse> serializer() {
            return a.f34130a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WorkflowStartSessionResponse(int i11, String str, String str2, List list, List list2, vo0.v1 v1Var) {
        if (15 != (i11 & 15)) {
            vo0.h1.b(i11, 15, a.f34130a.getDescriptor());
        }
        this.workflowId = str;
        this.workflowName = str2;
        this.modules = list;
        this.accessTokens = list2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getAccessTokens() {
        return this.accessTokens;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getModules() {
        return this.modules;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getWorkflowId() {
        return this.workflowId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowStartSessionResponse)) {
            return false;
        }
        WorkflowStartSessionResponse workflowStartSessionResponse = (WorkflowStartSessionResponse) other;
        return p013kotlin.jvm.internal.s.f(this.workflowId, workflowStartSessionResponse.workflowId) && p013kotlin.jvm.internal.s.f(this.workflowName, workflowStartSessionResponse.workflowName) && p013kotlin.jvm.internal.s.f(this.modules, workflowStartSessionResponse.modules) && p013kotlin.jvm.internal.s.f(this.accessTokens, workflowStartSessionResponse.accessTokens);
    }

    public int hashCode() {
        return (((((this.workflowId.hashCode() * 31) + this.workflowName.hashCode()) * 31) + this.modules.hashCode()) * 31) + this.accessTokens.hashCode();
    }

    public String toString() {
        return "WorkflowStartSessionResponse(workflowId=" + this.workflowId + ", workflowName=" + this.workflowName + ", modules=" + this.modules + ", accessTokens=" + this.accessTokens + ")";
    }

    public WorkflowStartSessionResponse(String workflowId, String workflowName, List modules, List accessTokens) {
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(workflowName, "workflowName");
        p013kotlin.jvm.internal.s.k(modules, "modules");
        p013kotlin.jvm.internal.s.k(accessTokens, "accessTokens");
        this.workflowId = workflowId;
        this.workflowName = workflowName;
        this.modules = modules;
        this.accessTokens = accessTokens;
    }

    public static final /* synthetic */ void a(WorkflowStartSessionResponse self, uo0.d output, to0.f serialDesc) {
        ro0.d[] dVarArr = f34125f;
        output.e(serialDesc, 0, self.workflowId);
        output.e(serialDesc, 1, self.workflowName);
        output.D(serialDesc, 2, dVarArr[2], self.modules);
        output.D(serialDesc, 3, dVarArr[3], self.accessTokens);
    }
}

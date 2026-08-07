package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nF, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002\u0015!B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u0018¨\u0006*"}, d2 = {"Lcom/fourthline/orca/internal/nF;", "", "", "formality", "locale", "sdkVersion", "userAgent", "platform", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/nF;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFormality", "b", "getLocale", "c", "getSdkVersion", DateTokenConverter.CONVERTER_KEY, "getUserAgent", "e", "getPlatform", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class WorkflowStartSessionRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formality;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String locale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sdkVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String userAgent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String platform;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nF$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33897b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f33896a = aVar;
            f33897b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.WorkflowStartSessionRequest", aVar, 5);
            m1Var.o("formality", false);
            m1Var.o("locale", false);
            m1Var.o("sdkVersion", false);
            m1Var.o("userAgent", false);
            m1Var.o("platform", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorkflowStartSessionRequest deserialize(uo0.e decoder) {
            String strT;
            String strT2;
            String strT3;
            String str;
            String str2;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            if (cVarB.i()) {
                strT = cVarB.t(fVar, 0);
                String strT4 = cVarB.t(fVar, 1);
                String strT5 = cVarB.t(fVar, 2);
                strT2 = cVarB.t(fVar, 3);
                strT3 = cVarB.t(fVar, 4);
                str = strT5;
                str2 = strT4;
                i11 = 31;
            } else {
                strT = null;
                String strT6 = null;
                String strT7 = null;
                String strT8 = null;
                String strT9 = null;
                boolean z11 = true;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(fVar, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        strT9 = cVarB.t(fVar, 1);
                        i12 |= 2;
                    } else if (iA == 2) {
                        strT8 = cVarB.t(fVar, 2);
                        i12 |= 4;
                    } else if (iA == 3) {
                        strT6 = cVarB.t(fVar, 3);
                        i12 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        strT7 = cVarB.t(fVar, 4);
                        i12 |= 16;
                    }
                }
                strT2 = strT6;
                strT3 = strT7;
                str = strT8;
                str2 = strT9;
                i11 = i12;
            }
            String str3 = strT;
            cVarB.c(fVar);
            return new WorkflowStartSessionRequest(i11, str3, str2, str, strT2, strT3, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{z1Var, z1Var, z1Var, z1Var, z1Var};
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
        public final void serialize(uo0.f encoder, WorkflowStartSessionRequest value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            WorkflowStartSessionRequest.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.nF$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<WorkflowStartSessionRequest> serializer() {
            return a.f33896a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WorkflowStartSessionRequest(int i11, String str, String str2, String str3, String str4, String str5, vo0.v1 v1Var) {
        if (31 != (i11 & 31)) {
            vo0.h1.b(i11, 31, a.f33896a.getDescriptor());
        }
        this.formality = str;
        this.locale = str2;
        this.sdkVersion = str3;
        this.userAgent = str4;
        this.platform = str5;
    }

    public static final /* synthetic */ void a(WorkflowStartSessionRequest self, uo0.d output, to0.f serialDesc) {
        output.e(serialDesc, 0, self.formality);
        output.e(serialDesc, 1, self.locale);
        output.e(serialDesc, 2, self.sdkVersion);
        output.e(serialDesc, 3, self.userAgent);
        output.e(serialDesc, 4, self.platform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowStartSessionRequest)) {
            return false;
        }
        WorkflowStartSessionRequest workflowStartSessionRequest = (WorkflowStartSessionRequest) other;
        return p013kotlin.jvm.internal.s.f(this.formality, workflowStartSessionRequest.formality) && p013kotlin.jvm.internal.s.f(this.locale, workflowStartSessionRequest.locale) && p013kotlin.jvm.internal.s.f(this.sdkVersion, workflowStartSessionRequest.sdkVersion) && p013kotlin.jvm.internal.s.f(this.userAgent, workflowStartSessionRequest.userAgent) && p013kotlin.jvm.internal.s.f(this.platform, workflowStartSessionRequest.platform);
    }

    public int hashCode() {
        return (((((((this.formality.hashCode() * 31) + this.locale.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + this.userAgent.hashCode()) * 31) + this.platform.hashCode();
    }

    public String toString() {
        return "WorkflowStartSessionRequest(formality=" + this.formality + ", locale=" + this.locale + ", sdkVersion=" + this.sdkVersion + ", userAgent=" + this.userAgent + ", platform=" + this.platform + ")";
    }

    public WorkflowStartSessionRequest(String formality, String locale, String sdkVersion, String userAgent, String platform) {
        p013kotlin.jvm.internal.s.k(formality, "formality");
        p013kotlin.jvm.internal.s.k(locale, "locale");
        p013kotlin.jvm.internal.s.k(sdkVersion, "sdkVersion");
        p013kotlin.jvm.internal.s.k(userAgent, "userAgent");
        p013kotlin.jvm.internal.s.k(platform, "platform");
        this.formality = formality;
        this.locale = locale;
        this.sdkVersion = sdkVersion;
        this.userAgent = userAgent;
        this.platform = platform;
    }
}

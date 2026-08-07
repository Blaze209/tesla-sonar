package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kE, reason: case insensitive filesystem and from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u0000 52\u00020\u0001:\u0002\u001b'BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001b\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b'\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b-\u00104¨\u00066"}, d2 = {"Lcom/fourthline/orca/internal/kE;", "", "", "name", "Lcom/fourthline/orca/internal/jE;", "analytics", "Lcom/fourthline/orca/internal/F6;", "deviceDataCollection", "Lcom/fourthline/orca/internal/Hw;", "remoteAssets", "Lcom/fourthline/orca/internal/F0;", "backButtonOnTop", "Lcom/fourthline/orca/internal/Zc;", "eId", "<init>", "(Ljava/lang/String;Lcom/fourthline/orca/internal/jE;Lcom/fourthline/orca/internal/F6;Lcom/fourthline/orca/internal/Hw;Lcom/fourthline/orca/internal/F0;Lcom/fourthline/orca/internal/Zc;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/fourthline/orca/internal/jE;Lcom/fourthline/orca/internal/F6;Lcom/fourthline/orca/internal/Hw;Lcom/fourthline/orca/internal/F0;Lcom/fourthline/orca/internal/Zc;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/kE;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lcom/fourthline/orca/internal/jE;", "()Lcom/fourthline/orca/internal/jE;", "c", "Lcom/fourthline/orca/internal/F6;", "()Lcom/fourthline/orca/internal/F6;", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/orca/internal/Hw;", "f", "()Lcom/fourthline/orca/internal/Hw;", "Lcom/fourthline/orca/internal/F0;", "()Lcom/fourthline/orca/internal/F0;", "Lcom/fourthline/orca/internal/Zc;", "()Lcom/fourthline/orca/internal/Zc;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class WorkflowConfigurationTenantSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final WorkflowConfigurationTenantAnalytics analytics;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeviceDataCollection deviceDataCollection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final RemoteAssetsConfig remoteAssets;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BackButtonOnTopConfig backButtonOnTop;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final EidConfig eId;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kE$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f32947b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f32946a = aVar;
            f32947b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.backend.model.WorkflowConfigurationTenantSettings", aVar, 6);
            m1Var.o("name", false);
            m1Var.o("analytics", true);
            m1Var.o("deviceDataCollection", true);
            m1Var.o("remoteAssets", true);
            m1Var.o("backButtonOnTop", true);
            m1Var.o("eId", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorkflowConfigurationTenantSettings deserialize(uo0.e decoder) {
            int i11;
            String str;
            WorkflowConfigurationTenantAnalytics workflowConfigurationTenantAnalytics;
            DeviceDataCollection f11;
            RemoteAssetsConfig hw2;
            BackButtonOnTopConfig f12;
            EidConfig c3021Zc;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(fVar, 0);
                WorkflowConfigurationTenantAnalytics workflowConfigurationTenantAnalytics2 = (WorkflowConfigurationTenantAnalytics) cVarB.n(fVar, 1, WorkflowConfigurationTenantAnalytics.a.f32702a, null);
                DeviceDataCollection f13 = (DeviceDataCollection) cVarB.n(fVar, 2, DeviceDataCollection.a.f25746a, null);
                RemoteAssetsConfig hw3 = (RemoteAssetsConfig) cVarB.n(fVar, 3, RemoteAssetsConfig.a.f26152a, null);
                BackButtonOnTopConfig f14 = (BackButtonOnTopConfig) cVarB.n(fVar, 4, BackButtonOnTopConfig.a.f25690a, null);
                str = strT2;
                c3021Zc = (EidConfig) cVarB.n(fVar, 5, EidConfig.a.f30017a, null);
                hw2 = hw3;
                f12 = f14;
                f11 = f13;
                workflowConfigurationTenantAnalytics = workflowConfigurationTenantAnalytics2;
                i11 = 63;
            } else {
                boolean z11 = true;
                int i12 = 0;
                WorkflowConfigurationTenantAnalytics workflowConfigurationTenantAnalytics3 = null;
                DeviceDataCollection f15 = null;
                RemoteAssetsConfig hw4 = null;
                BackButtonOnTopConfig f16 = null;
                EidConfig c3021Zc2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            continue;
                        case 0:
                            strT = cVarB.t(fVar, 0);
                            i12 |= 1;
                            continue;
                        case 1:
                            workflowConfigurationTenantAnalytics3 = (WorkflowConfigurationTenantAnalytics) cVarB.n(fVar, 1, WorkflowConfigurationTenantAnalytics.a.f32702a, workflowConfigurationTenantAnalytics3);
                            i12 |= 2;
                            break;
                        case 2:
                            f15 = (DeviceDataCollection) cVarB.n(fVar, 2, DeviceDataCollection.a.f25746a, f15);
                            i12 |= 4;
                            break;
                        case 3:
                            hw4 = (RemoteAssetsConfig) cVarB.n(fVar, 3, RemoteAssetsConfig.a.f26152a, hw4);
                            i12 |= 8;
                            break;
                        case 4:
                            f16 = (BackButtonOnTopConfig) cVarB.n(fVar, 4, BackButtonOnTopConfig.a.f25690a, f16);
                            i12 |= 16;
                            break;
                        case 5:
                            c3021Zc2 = (EidConfig) cVarB.n(fVar, 5, EidConfig.a.f30017a, c3021Zc2);
                            i12 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i12;
                str = strT;
                workflowConfigurationTenantAnalytics = workflowConfigurationTenantAnalytics3;
                f11 = f15;
                hw2 = hw4;
                f12 = f16;
                c3021Zc = c3021Zc2;
            }
            cVarB.c(fVar);
            return new WorkflowConfigurationTenantSettings(i11, str, workflowConfigurationTenantAnalytics, f11, hw2, f12, c3021Zc, (vo0.v1) null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            return new ro0.d[]{vo0.z1.f119730a, WorkflowConfigurationTenantAnalytics.a.f32702a, DeviceDataCollection.a.f25746a, RemoteAssetsConfig.a.f26152a, BackButtonOnTopConfig.a.f25690a, EidConfig.a.f30017a};
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
        public final void serialize(uo0.f encoder, WorkflowConfigurationTenantSettings value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            WorkflowConfigurationTenantSettings.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kE$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<WorkflowConfigurationTenantSettings> serializer() {
            return a.f32946a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ WorkflowConfigurationTenantSettings(int i11, String str, WorkflowConfigurationTenantAnalytics workflowConfigurationTenantAnalytics, DeviceDataCollection f11, RemoteAssetsConfig hw2, BackButtonOnTopConfig f12, EidConfig c3021Zc, vo0.v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f32946a.getDescriptor());
        }
        this.name = str;
        this.analytics = (i11 & 2) == 0 ? new WorkflowConfigurationTenantAnalytics(true) : workflowConfigurationTenantAnalytics;
        if ((i11 & 4) == 0) {
            this.deviceDataCollection = new DeviceDataCollection(false, 0L, (DeviceDataCollection.Depth) null, (DeviceDataCollection.Motion) null, (DeviceDataCollection.Environment) null, (DeviceDataCollection.Gps) null, (DeviceDataCollection.Cellular) null, (DeviceDataCollection.Network) null, (DeviceDataCollection.Hardware) null, (DeviceDataCollection.Screen) null, (DeviceDataCollection.Battery) null, (DeviceDataCollection.Locale) null, (DeviceDataCollection.System) null, 8190, (DefaultConstructorMarker) null);
        } else {
            this.deviceDataCollection = f11;
        }
        boolean z11 = false;
        this.remoteAssets = (i11 & 8) == 0 ? new RemoteAssetsConfig(false) : hw2;
        this.backButtonOnTop = (i11 & 16) == 0 ? new BackButtonOnTopConfig(false) : f12;
        this.eId = (i11 & 32) == 0 ? new EidConfig(z11, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : c3021Zc;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void a(WorkflowConfigurationTenantSettings self, uo0.d output, to0.f serialDesc) {
        boolean z11 = false;
        output.e(serialDesc, 0, self.name);
        if (output.G(serialDesc, 1) || !p013kotlin.jvm.internal.s.f(self.analytics, new WorkflowConfigurationTenantAnalytics(true))) {
            output.D(serialDesc, 1, WorkflowConfigurationTenantAnalytics.a.f32702a, self.analytics);
        }
        int i11 = 2;
        if (output.G(serialDesc, 2)) {
            output.D(serialDesc, 2, DeviceDataCollection.a.f25746a, self.deviceDataCollection);
        } else {
            if (!p013kotlin.jvm.internal.s.f(self.deviceDataCollection, new DeviceDataCollection(false, 0L, (DeviceDataCollection.Depth) null, (DeviceDataCollection.Motion) null, (DeviceDataCollection.Environment) null, (DeviceDataCollection.Gps) null, (DeviceDataCollection.Cellular) null, (DeviceDataCollection.Network) null, (DeviceDataCollection.Hardware) null, (DeviceDataCollection.Screen) null, (DeviceDataCollection.Battery) null, (DeviceDataCollection.Locale) null, (DeviceDataCollection.System) null, 8190, (DefaultConstructorMarker) null))) {
                output.D(serialDesc, 2, DeviceDataCollection.a.f25746a, self.deviceDataCollection);
            }
        }
        if (output.G(serialDesc, 3) || !p013kotlin.jvm.internal.s.f(self.remoteAssets, new RemoteAssetsConfig(false))) {
            output.D(serialDesc, 3, RemoteAssetsConfig.a.f26152a, self.remoteAssets);
        }
        if (output.G(serialDesc, 4) || !p013kotlin.jvm.internal.s.f(self.backButtonOnTop, new BackButtonOnTopConfig(false))) {
            output.D(serialDesc, 4, BackButtonOnTopConfig.a.f25690a, self.backButtonOnTop);
        }
        if (!output.G(serialDesc, 5) && p013kotlin.jvm.internal.s.f(self.eId, new EidConfig(z11, (String) null, i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            return;
        }
        output.D(serialDesc, 5, EidConfig.a.f30017a, self.eId);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BackButtonOnTopConfig getBackButtonOnTop() {
        return this.backButtonOnTop;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DeviceDataCollection getDeviceDataCollection() {
        return this.deviceDataCollection;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EidConfig getEId() {
        return this.eId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowConfigurationTenantSettings)) {
            return false;
        }
        WorkflowConfigurationTenantSettings workflowConfigurationTenantSettings = (WorkflowConfigurationTenantSettings) other;
        return p013kotlin.jvm.internal.s.f(this.name, workflowConfigurationTenantSettings.name) && p013kotlin.jvm.internal.s.f(this.analytics, workflowConfigurationTenantSettings.analytics) && p013kotlin.jvm.internal.s.f(this.deviceDataCollection, workflowConfigurationTenantSettings.deviceDataCollection) && p013kotlin.jvm.internal.s.f(this.remoteAssets, workflowConfigurationTenantSettings.remoteAssets) && p013kotlin.jvm.internal.s.f(this.backButtonOnTop, workflowConfigurationTenantSettings.backButtonOnTop) && p013kotlin.jvm.internal.s.f(this.eId, workflowConfigurationTenantSettings.eId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final RemoteAssetsConfig getRemoteAssets() {
        return this.remoteAssets;
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.analytics.hashCode()) * 31) + this.deviceDataCollection.hashCode()) * 31) + this.remoteAssets.hashCode()) * 31) + this.backButtonOnTop.hashCode()) * 31) + this.eId.hashCode();
    }

    public String toString() {
        return "WorkflowConfigurationTenantSettings(name=" + this.name + ", analytics=" + this.analytics + ", deviceDataCollection=" + this.deviceDataCollection + ", remoteAssets=" + this.remoteAssets + ", backButtonOnTop=" + this.backButtonOnTop + ", eId=" + this.eId + ")";
    }

    public WorkflowConfigurationTenantSettings(String name, WorkflowConfigurationTenantAnalytics analytics, DeviceDataCollection deviceDataCollection, RemoteAssetsConfig remoteAssets, BackButtonOnTopConfig backButtonOnTop, EidConfig eId) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(deviceDataCollection, "deviceDataCollection");
        p013kotlin.jvm.internal.s.k(remoteAssets, "remoteAssets");
        p013kotlin.jvm.internal.s.k(backButtonOnTop, "backButtonOnTop");
        p013kotlin.jvm.internal.s.k(eId, "eId");
        this.name = name;
        this.analytics = analytics;
        this.deviceDataCollection = deviceDataCollection;
        this.remoteAssets = remoteAssets;
        this.backButtonOnTop = backButtonOnTop;
        this.eId = eId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final WorkflowConfigurationTenantAnalytics getAnalytics() {
        return this.analytics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ WorkflowConfigurationTenantSettings(String str, WorkflowConfigurationTenantAnalytics workflowConfigurationTenantAnalytics, DeviceDataCollection f11, RemoteAssetsConfig hw2, BackButtonOnTopConfig f12, EidConfig c3021Zc, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        EidConfig c3021Zc2;
        WorkflowConfigurationTenantAnalytics workflowConfigurationTenantAnalytics2 = (i11 & 2) != 0 ? new WorkflowConfigurationTenantAnalytics(true) : workflowConfigurationTenantAnalytics;
        DeviceDataCollection f13 = (i11 & 4) != 0 ? new DeviceDataCollection(false, 0L, (DeviceDataCollection.Depth) null, (DeviceDataCollection.Motion) null, (DeviceDataCollection.Environment) null, (DeviceDataCollection.Gps) null, (DeviceDataCollection.Cellular) null, (DeviceDataCollection.Network) null, (DeviceDataCollection.Hardware) null, (DeviceDataCollection.Screen) null, (DeviceDataCollection.Battery) null, (DeviceDataCollection.Locale) null, (DeviceDataCollection.System) null, 8190, (DefaultConstructorMarker) null) : f11;
        boolean z11 = false;
        RemoteAssetsConfig hw3 = (i11 & 8) != 0 ? new RemoteAssetsConfig(false) : hw2;
        BackButtonOnTopConfig f14 = (i11 & 16) != 0 ? new BackButtonOnTopConfig(false) : f12;
        if ((i11 & 32) != 0) {
            c3021Zc2 = new EidConfig(z11, (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            c3021Zc2 = c3021Zc;
        }
        this(str, workflowConfigurationTenantAnalytics2, f13, hw3, f14, c3021Zc2);
    }
}

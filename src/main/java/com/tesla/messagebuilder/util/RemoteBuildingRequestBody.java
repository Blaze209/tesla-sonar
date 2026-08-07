package com.tesla.messagebuilder.util;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import com.tesla.sessionmanager.VehicleSessionInfo;
import ic0.a;
import ic0.m;
import ic0.n;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB1\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\f\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JX\u0010!\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b\b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b\t\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010 ¨\u00062"}, d2 = {"Lcom/tesla/messagebuilder/util/RemoteBuildingRequestBody;", "", "Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;", "sessionInfo", "", "publicKey", "", "generateCommand", "isBackupKey", "isFleetKey", "Lcom/tesla/messagebuilder/util/Parameters;", "parameters", "<init>", "(Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/tesla/messagebuilder/util/Parameters;)V", "Lic0/a;", "addKeyPayload", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "vehicleSessionInfo", "Lic0/m;", "remoteServiceAccessRequestPayload", "Lic0/n;", "serviceDiagnosticRequestPayload", "(Lic0/a;Lcom/tesla/sessionmanager/VehicleSessionInfo;Lic0/m;Lic0/n;)V", "component1", "()Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "()Lcom/tesla/messagebuilder/util/Parameters;", "copy", "(Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/tesla/messagebuilder/util/Parameters;)Lcom/tesla/messagebuilder/util/RemoteBuildingRequestBody;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/tesla/messagebuilder/util/VehicleSessionInfoDataBody;", "getSessionInfo", "Ljava/lang/String;", "getPublicKey", "Ljava/lang/Boolean;", "getGenerateCommand", "Lcom/tesla/messagebuilder/util/Parameters;", "getParameters", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RemoteBuildingRequestBody {
    private final Boolean generateCommand;
    private final Boolean isBackupKey;
    private final Boolean isFleetKey;
    private final Parameters parameters;
    private final String publicKey;
    private final VehicleSessionInfoDataBody sessionInfo;

    public RemoteBuildingRequestBody(@g(name = "session_info") VehicleSessionInfoDataBody vehicleSessionInfoDataBody, @g(name = "public_key") String str, @g(name = "generate_command") Boolean bool, @g(name = "backup") Boolean bool2, @g(name = "fleet") Boolean bool3, @g(name = "params") Parameters parameters) {
        this.sessionInfo = vehicleSessionInfoDataBody;
        this.publicKey = str;
        this.generateCommand = bool;
        this.isBackupKey = bool2;
        this.isFleetKey = bool3;
        this.parameters = parameters;
    }

    public static /* synthetic */ RemoteBuildingRequestBody copy$default(RemoteBuildingRequestBody remoteBuildingRequestBody, VehicleSessionInfoDataBody vehicleSessionInfoDataBody, String str, Boolean bool, Boolean bool2, Boolean bool3, Parameters parameters, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            vehicleSessionInfoDataBody = remoteBuildingRequestBody.sessionInfo;
        }
        if ((i11 & 2) != 0) {
            str = remoteBuildingRequestBody.publicKey;
        }
        if ((i11 & 4) != 0) {
            bool = remoteBuildingRequestBody.generateCommand;
        }
        if ((i11 & 8) != 0) {
            bool2 = remoteBuildingRequestBody.isBackupKey;
        }
        if ((i11 & 16) != 0) {
            bool3 = remoteBuildingRequestBody.isFleetKey;
        }
        if ((i11 & 32) != 0) {
            parameters = remoteBuildingRequestBody.parameters;
        }
        Boolean bool4 = bool3;
        Parameters parameters2 = parameters;
        return remoteBuildingRequestBody.copy(vehicleSessionInfoDataBody, str, bool, bool2, bool4, parameters2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VehicleSessionInfoDataBody getSessionInfo() {
        return this.sessionInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getGenerateCommand() {
        return this.generateCommand;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsBackupKey() {
        return this.isBackupKey;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsFleetKey() {
        return this.isFleetKey;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Parameters getParameters() {
        return this.parameters;
    }

    public final RemoteBuildingRequestBody copy(@g(name = "session_info") VehicleSessionInfoDataBody sessionInfo, @g(name = "public_key") String publicKey, @g(name = "generate_command") Boolean generateCommand, @g(name = "backup") Boolean isBackupKey, @g(name = "fleet") Boolean isFleetKey, @g(name = "params") Parameters parameters) {
        return new RemoteBuildingRequestBody(sessionInfo, publicKey, generateCommand, isBackupKey, isFleetKey, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteBuildingRequestBody)) {
            return false;
        }
        RemoteBuildingRequestBody remoteBuildingRequestBody = (RemoteBuildingRequestBody) other;
        return s.f(this.sessionInfo, remoteBuildingRequestBody.sessionInfo) && s.f(this.publicKey, remoteBuildingRequestBody.publicKey) && s.f(this.generateCommand, remoteBuildingRequestBody.generateCommand) && s.f(this.isBackupKey, remoteBuildingRequestBody.isBackupKey) && s.f(this.isFleetKey, remoteBuildingRequestBody.isFleetKey) && s.f(this.parameters, remoteBuildingRequestBody.parameters);
    }

    public final Boolean getGenerateCommand() {
        return this.generateCommand;
    }

    public final Parameters getParameters() {
        return this.parameters;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final VehicleSessionInfoDataBody getSessionInfo() {
        return this.sessionInfo;
    }

    public int hashCode() {
        VehicleSessionInfoDataBody vehicleSessionInfoDataBody = this.sessionInfo;
        int iHashCode = (vehicleSessionInfoDataBody == null ? 0 : vehicleSessionInfoDataBody.hashCode()) * 31;
        String str = this.publicKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.generateCommand;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBackupKey;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isFleetKey;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Parameters parameters = this.parameters;
        return iHashCode5 + (parameters != null ? parameters.hashCode() : 0);
    }

    public final Boolean isBackupKey() {
        return this.isBackupKey;
    }

    public final Boolean isFleetKey() {
        return this.isFleetKey;
    }

    public String toString() {
        return "RemoteBuildingRequestBody(sessionInfo=" + this.sessionInfo + ", publicKey=" + this.publicKey + ", generateCommand=" + this.generateCommand + ", isBackupKey=" + this.isBackupKey + ", isFleetKey=" + this.isFleetKey + ", parameters=" + this.parameters + ")";
    }

    public RemoteBuildingRequestBody(a aVar, VehicleSessionInfo vehicleSessionInfo, m mVar, n nVar) {
        k publicKey;
        byte[] bArrJ;
        this(new VehicleSessionInfoDataBody(vehicleSessionInfo), (aVar == null || (publicKey = aVar.getPublicKey()) == null || (bArrJ = publicKey.J()) == null) ? null : ie0.n.c(bArrJ, 0, 1, null), aVar != null ? Boolean.TRUE : null, aVar != null ? Boolean.valueOf(aVar.getIsBackupKey()) : null, aVar != null ? Boolean.valueOf(aVar.getIsFleetKey()) : null, new Parameters(mVar, nVar));
    }
}

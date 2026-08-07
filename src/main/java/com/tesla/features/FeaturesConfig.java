package com.tesla.features;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003JO\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010,\u001a\u00020!2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00062"}, d2 = {"Lcom/tesla/features/FeaturesConfig;", "", "signaling", "Lcom/tesla/features/Signaling;", "authRejection", "Lcom/tesla/features/AuthConfig;", "sessionInfoValidation", "Lcom/tesla/features/SessionInfoValidation;", "signedCommandsTransport", "Lcom/tesla/features/SignedCommandsTransport;", "hermesConnection", "Lcom/tesla/features/HermesConnection;", "autoDrivenotes", "Lcom/tesla/features/AutoDriveNotes;", "signingGate", "Lcom/tesla/features/SigningGate;", "<init>", "(Lcom/tesla/features/Signaling;Lcom/tesla/features/AuthConfig;Lcom/tesla/features/SessionInfoValidation;Lcom/tesla/features/SignedCommandsTransport;Lcom/tesla/features/HermesConnection;Lcom/tesla/features/AutoDriveNotes;Lcom/tesla/features/SigningGate;)V", "getSignaling", "()Lcom/tesla/features/Signaling;", "getAuthRejection", "()Lcom/tesla/features/AuthConfig;", "getSessionInfoValidation", "()Lcom/tesla/features/SessionInfoValidation;", "getSignedCommandsTransport", "()Lcom/tesla/features/SignedCommandsTransport;", "getHermesConnection", "()Lcom/tesla/features/HermesConnection;", "getAutoDrivenotes", "()Lcom/tesla/features/AutoDriveNotes;", "getSigningGate", "()Lcom/tesla/features/SigningGate;", "hasSignedOapiTransportAndConnectHermesOnDemand", "", "getHasSignedOapiTransportAndConnectHermesOnDemand", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FeaturesConfig {

    @g(name = "auth_rejection")
    private final AuthConfig authRejection;

    @g(name = "auto_drivenotes")
    private final AutoDriveNotes autoDrivenotes;

    @g(name = "hermes_connection")
    private final HermesConnection hermesConnection;

    @g(name = "session_info_validation")
    private final SessionInfoValidation sessionInfoValidation;

    @g(name = "signaling")
    private final Signaling signaling;

    @g(name = "signed_commands_transport")
    private final SignedCommandsTransport signedCommandsTransport;

    @g(name = "signing_gate")
    private final SigningGate signingGate;

    public FeaturesConfig() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ FeaturesConfig copy$default(FeaturesConfig featuresConfig, Signaling signaling, AuthConfig authConfig, SessionInfoValidation sessionInfoValidation, SignedCommandsTransport signedCommandsTransport, HermesConnection hermesConnection, AutoDriveNotes autoDriveNotes, SigningGate signingGate, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            signaling = featuresConfig.signaling;
        }
        if ((i11 & 2) != 0) {
            authConfig = featuresConfig.authRejection;
        }
        if ((i11 & 4) != 0) {
            sessionInfoValidation = featuresConfig.sessionInfoValidation;
        }
        if ((i11 & 8) != 0) {
            signedCommandsTransport = featuresConfig.signedCommandsTransport;
        }
        if ((i11 & 16) != 0) {
            hermesConnection = featuresConfig.hermesConnection;
        }
        if ((i11 & 32) != 0) {
            autoDriveNotes = featuresConfig.autoDrivenotes;
        }
        if ((i11 & 64) != 0) {
            signingGate = featuresConfig.signingGate;
        }
        AutoDriveNotes autoDriveNotes2 = autoDriveNotes;
        SigningGate signingGate2 = signingGate;
        HermesConnection hermesConnection2 = hermesConnection;
        SessionInfoValidation sessionInfoValidation2 = sessionInfoValidation;
        return featuresConfig.copy(signaling, authConfig, sessionInfoValidation2, signedCommandsTransport, hermesConnection2, autoDriveNotes2, signingGate2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Signaling getSignaling() {
        return this.signaling;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AuthConfig getAuthRejection() {
        return this.authRejection;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SessionInfoValidation getSessionInfoValidation() {
        return this.sessionInfoValidation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SignedCommandsTransport getSignedCommandsTransport() {
        return this.signedCommandsTransport;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HermesConnection getHermesConnection() {
        return this.hermesConnection;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AutoDriveNotes getAutoDrivenotes() {
        return this.autoDrivenotes;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SigningGate getSigningGate() {
        return this.signingGate;
    }

    public final FeaturesConfig copy(Signaling signaling, AuthConfig authRejection, SessionInfoValidation sessionInfoValidation, SignedCommandsTransport signedCommandsTransport, HermesConnection hermesConnection, AutoDriveNotes autoDrivenotes, SigningGate signingGate) {
        s.k(signaling, "signaling");
        s.k(authRejection, "authRejection");
        s.k(sessionInfoValidation, "sessionInfoValidation");
        s.k(signedCommandsTransport, "signedCommandsTransport");
        s.k(hermesConnection, "hermesConnection");
        s.k(autoDrivenotes, "autoDrivenotes");
        s.k(signingGate, "signingGate");
        return new FeaturesConfig(signaling, authRejection, sessionInfoValidation, signedCommandsTransport, hermesConnection, autoDrivenotes, signingGate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturesConfig)) {
            return false;
        }
        FeaturesConfig featuresConfig = (FeaturesConfig) other;
        return s.f(this.signaling, featuresConfig.signaling) && s.f(this.authRejection, featuresConfig.authRejection) && s.f(this.sessionInfoValidation, featuresConfig.sessionInfoValidation) && s.f(this.signedCommandsTransport, featuresConfig.signedCommandsTransport) && s.f(this.hermesConnection, featuresConfig.hermesConnection) && s.f(this.autoDrivenotes, featuresConfig.autoDrivenotes) && s.f(this.signingGate, featuresConfig.signingGate);
    }

    public final AuthConfig getAuthRejection() {
        return this.authRejection;
    }

    public final AutoDriveNotes getAutoDrivenotes() {
        return this.autoDrivenotes;
    }

    public final boolean getHasSignedOapiTransportAndConnectHermesOnDemand() {
        return this.signedCommandsTransport.getUseSignedOapiTransport() && this.hermesConnection.getUseConnectOnDemand();
    }

    public final HermesConnection getHermesConnection() {
        return this.hermesConnection;
    }

    public final SessionInfoValidation getSessionInfoValidation() {
        return this.sessionInfoValidation;
    }

    public final Signaling getSignaling() {
        return this.signaling;
    }

    public final SignedCommandsTransport getSignedCommandsTransport() {
        return this.signedCommandsTransport;
    }

    public final SigningGate getSigningGate() {
        return this.signingGate;
    }

    public int hashCode() {
        return (((((((((((this.signaling.hashCode() * 31) + this.authRejection.hashCode()) * 31) + this.sessionInfoValidation.hashCode()) * 31) + this.signedCommandsTransport.hashCode()) * 31) + this.hermesConnection.hashCode()) * 31) + this.autoDrivenotes.hashCode()) * 31) + this.signingGate.hashCode();
    }

    public String toString() {
        return "FeaturesConfig(signaling=" + this.signaling + ", authRejection=" + this.authRejection + ", sessionInfoValidation=" + this.sessionInfoValidation + ", signedCommandsTransport=" + this.signedCommandsTransport + ", hermesConnection=" + this.hermesConnection + ", autoDrivenotes=" + this.autoDrivenotes + ", signingGate=" + this.signingGate + ")";
    }

    public FeaturesConfig(Signaling signaling, AuthConfig authRejection, SessionInfoValidation sessionInfoValidation, SignedCommandsTransport signedCommandsTransport, HermesConnection hermesConnection, AutoDriveNotes autoDrivenotes, SigningGate signingGate) {
        s.k(signaling, "signaling");
        s.k(authRejection, "authRejection");
        s.k(sessionInfoValidation, "sessionInfoValidation");
        s.k(signedCommandsTransport, "signedCommandsTransport");
        s.k(hermesConnection, "hermesConnection");
        s.k(autoDrivenotes, "autoDrivenotes");
        s.k(signingGate, "signingGate");
        this.signaling = signaling;
        this.authRejection = authRejection;
        this.sessionInfoValidation = sessionInfoValidation;
        this.signedCommandsTransport = signedCommandsTransport;
        this.hermesConnection = hermesConnection;
        this.autoDrivenotes = autoDrivenotes;
        this.signingGate = signingGate;
    }

    public /* synthetic */ FeaturesConfig(Signaling signaling, AuthConfig authConfig, SessionInfoValidation sessionInfoValidation, SignedCommandsTransport signedCommandsTransport, HermesConnection hermesConnection, AutoDriveNotes autoDriveNotes, SigningGate signingGate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Signaling(false, 1, null) : signaling, (i11 & 2) != 0 ? new AuthConfig(false, 0, 3, null) : authConfig, (i11 & 4) != 0 ? new SessionInfoValidation(false, 0, false, 7, null) : sessionInfoValidation, (i11 & 8) != 0 ? new SignedCommandsTransport(false, 0, false, 7, null) : signedCommandsTransport, (i11 & 16) != 0 ? new HermesConnection(false, 0, false, 7, null) : hermesConnection, (i11 & 32) != 0 ? new AutoDriveNotes(false, 1, null) : autoDriveNotes, (i11 & 64) != 0 ? new SigningGate(false, 0, 3, null) : signingGate);
    }
}

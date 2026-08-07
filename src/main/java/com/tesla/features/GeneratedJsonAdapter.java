package com.tesla.features;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.tesla.features.FeaturesConfigJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/tesla/features/FeaturesConfigJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/tesla/features/FeaturesConfig;", "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/squareup/moshi/u;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/tesla/features/FeaturesConfig;", "Lcom/squareup/moshi/r;", "writer", "value_", "Ljn0/h0;", "b", "(Lcom/squareup/moshi/r;Lcom/tesla/features/FeaturesConfig;)V", "Lcom/squareup/moshi/k$b;", "Lcom/squareup/moshi/k$b;", "options", "Lcom/tesla/features/Signaling;", "Lcom/squareup/moshi/h;", "signalingAdapter", "Lcom/tesla/features/AuthConfig;", "c", "authConfigAdapter", "Lcom/tesla/features/SessionInfoValidation;", DateTokenConverter.CONVERTER_KEY, "sessionInfoValidationAdapter", "Lcom/tesla/features/SignedCommandsTransport;", "e", "signedCommandsTransportAdapter", "Lcom/tesla/features/HermesConnection;", "f", "hermesConnectionAdapter", "Lcom/tesla/features/AutoDriveNotes;", "g", "autoDriveNotesAdapter", "Lcom/tesla/features/SigningGate;", "h", "signingGateAdapter", "Ljava/lang/reflect/Constructor;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/reflect/Constructor;", "constructorRef", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<FeaturesConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h<Signaling> signalingAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h<AuthConfig> authConfigAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h<SessionInfoValidation> sessionInfoValidationAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h<SignedCommandsTransport> signedCommandsTransportAdapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h<HermesConnection> hermesConnectionAdapter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h<AutoDriveNotes> autoDriveNotesAdapter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h<SigningGate> signingGateAdapter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private volatile Constructor<FeaturesConfig> constructorRef;

    public GeneratedJsonAdapter(u moshi) {
        s.k(moshi, "moshi");
        k.b bVarA = k.b.a("signaling", "auth_rejection", "session_info_validation", "signed_commands_transport", "hermes_connection", "auto_drivenotes", "signing_gate");
        s.j(bVarA, "of(...)");
        this.options = bVarA;
        h<Signaling> hVarF = moshi.f(Signaling.class, d1.d(), "signaling");
        s.j(hVarF, "adapter(...)");
        this.signalingAdapter = hVarF;
        h<AuthConfig> hVarF2 = moshi.f(AuthConfig.class, d1.d(), "authRejection");
        s.j(hVarF2, "adapter(...)");
        this.authConfigAdapter = hVarF2;
        h<SessionInfoValidation> hVarF3 = moshi.f(SessionInfoValidation.class, d1.d(), "sessionInfoValidation");
        s.j(hVarF3, "adapter(...)");
        this.sessionInfoValidationAdapter = hVarF3;
        h<SignedCommandsTransport> hVarF4 = moshi.f(SignedCommandsTransport.class, d1.d(), "signedCommandsTransport");
        s.j(hVarF4, "adapter(...)");
        this.signedCommandsTransportAdapter = hVarF4;
        h<HermesConnection> hVarF5 = moshi.f(HermesConnection.class, d1.d(), "hermesConnection");
        s.j(hVarF5, "adapter(...)");
        this.hermesConnectionAdapter = hVarF5;
        h<AutoDriveNotes> hVarF6 = moshi.f(AutoDriveNotes.class, d1.d(), "autoDrivenotes");
        s.j(hVarF6, "adapter(...)");
        this.autoDriveNotesAdapter = hVarF6;
        h<SigningGate> hVarF7 = moshi.f(SigningGate.class, d1.d(), "signingGate");
        s.j(hVarF7, "adapter(...)");
        this.signingGateAdapter = hVarF7;
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FeaturesConfig fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        s.k(reader, "reader");
        reader.h();
        int i11 = -1;
        Signaling signalingFromJson = null;
        AuthConfig authConfigFromJson = null;
        SessionInfoValidation sessionInfoValidationFromJson = null;
        SignedCommandsTransport signedCommandsTransportFromJson = null;
        HermesConnection hermesConnectionFromJson = null;
        AutoDriveNotes autoDriveNotesFromJson = null;
        SigningGate signingGateFromJson = null;
        while (reader.hasNext()) {
            switch (reader.T(this.options)) {
                case -1:
                    reader.e0();
                    reader.F();
                    break;
                case 0:
                    signalingFromJson = this.signalingAdapter.fromJson(reader);
                    if (signalingFromJson == null) {
                        throw v20.c.x("signaling", "signaling", reader);
                    }
                    i11 &= -2;
                    break;
                    break;
                case 1:
                    authConfigFromJson = this.authConfigAdapter.fromJson(reader);
                    if (authConfigFromJson == null) {
                        throw v20.c.x("authRejection", "auth_rejection", reader);
                    }
                    i11 &= -3;
                    break;
                    break;
                case 2:
                    sessionInfoValidationFromJson = this.sessionInfoValidationAdapter.fromJson(reader);
                    if (sessionInfoValidationFromJson == null) {
                        throw v20.c.x("sessionInfoValidation", "session_info_validation", reader);
                    }
                    i11 &= -5;
                    break;
                    break;
                case 3:
                    signedCommandsTransportFromJson = this.signedCommandsTransportAdapter.fromJson(reader);
                    if (signedCommandsTransportFromJson == null) {
                        throw v20.c.x("signedCommandsTransport", "signed_commands_transport", reader);
                    }
                    i11 &= -9;
                    break;
                    break;
                case 4:
                    hermesConnectionFromJson = this.hermesConnectionAdapter.fromJson(reader);
                    if (hermesConnectionFromJson == null) {
                        throw v20.c.x("hermesConnection", "hermes_connection", reader);
                    }
                    i11 &= -17;
                    break;
                    break;
                case 5:
                    autoDriveNotesFromJson = this.autoDriveNotesAdapter.fromJson(reader);
                    if (autoDriveNotesFromJson == null) {
                        throw v20.c.x("autoDrivenotes", "auto_drivenotes", reader);
                    }
                    i11 &= -33;
                    break;
                    break;
                case 6:
                    signingGateFromJson = this.signingGateAdapter.fromJson(reader);
                    if (signingGateFromJson == null) {
                        throw v20.c.x("signingGate", "signing_gate", reader);
                    }
                    i11 &= -65;
                    break;
                    break;
            }
        }
        reader.j();
        if (i11 != -128) {
            Constructor<FeaturesConfig> declaredConstructor = this.constructorRef;
            if (declaredConstructor == null) {
                declaredConstructor = FeaturesConfig.class.getDeclaredConstructor(Signaling.class, AuthConfig.class, SessionInfoValidation.class, SignedCommandsTransport.class, HermesConnection.class, AutoDriveNotes.class, SigningGate.class, Integer.TYPE, v20.c.f117643c);
                this.constructorRef = declaredConstructor;
                s.j(declaredConstructor, "also(...)");
            }
            FeaturesConfig featuresConfigNewInstance = declaredConstructor.newInstance(signalingFromJson, authConfigFromJson, sessionInfoValidationFromJson, signedCommandsTransportFromJson, hermesConnectionFromJson, autoDriveNotesFromJson, signingGateFromJson, Integer.valueOf(i11), null);
            s.j(featuresConfigNewInstance, "newInstance(...)");
            return featuresConfigNewInstance;
        }
        s.i(signalingFromJson, "null cannot be cast to non-null type com.tesla.features.Signaling");
        s.i(authConfigFromJson, "null cannot be cast to non-null type com.tesla.features.AuthConfig");
        s.i(sessionInfoValidationFromJson, "null cannot be cast to non-null type com.tesla.features.SessionInfoValidation");
        s.i(signedCommandsTransportFromJson, "null cannot be cast to non-null type com.tesla.features.SignedCommandsTransport");
        s.i(hermesConnectionFromJson, "null cannot be cast to non-null type com.tesla.features.HermesConnection");
        s.i(autoDriveNotesFromJson, "null cannot be cast to non-null type com.tesla.features.AutoDriveNotes");
        s.i(signingGateFromJson, "null cannot be cast to non-null type com.tesla.features.SigningGate");
        SigningGate signingGate = signingGateFromJson;
        AutoDriveNotes autoDriveNotes = autoDriveNotesFromJson;
        HermesConnection hermesConnection = hermesConnectionFromJson;
        SignedCommandsTransport signedCommandsTransport = signedCommandsTransportFromJson;
        return new FeaturesConfig(signalingFromJson, authConfigFromJson, sessionInfoValidationFromJson, signedCommandsTransport, hermesConnection, autoDriveNotes, signingGate);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(r writer, FeaturesConfig value_) {
        s.k(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.o();
        writer.b0("signaling");
        this.signalingAdapter.toJson(writer, value_.getSignaling());
        writer.b0("auth_rejection");
        this.authConfigAdapter.toJson(writer, value_.getAuthRejection());
        writer.b0("session_info_validation");
        this.sessionInfoValidationAdapter.toJson(writer, value_.getSessionInfoValidation());
        writer.b0("signed_commands_transport");
        this.signedCommandsTransportAdapter.toJson(writer, value_.getSignedCommandsTransport());
        writer.b0("hermes_connection");
        this.hermesConnectionAdapter.toJson(writer, value_.getHermesConnection());
        writer.b0("auto_drivenotes");
        this.autoDriveNotesAdapter.toJson(writer, value_.getAutoDrivenotes());
        writer.b0("signing_gate");
        this.signingGateAdapter.toJson(writer, value_.getSigningGate());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FeaturesConfig");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }
}

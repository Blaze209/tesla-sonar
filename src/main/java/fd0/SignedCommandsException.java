package fd0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.oapi.OwnerApiStatusCode;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: fd0.m, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b+\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b-\u0010\u0016¨\u0006."}, d2 = {"Lfd0/m;", "", "Lfd0/h;", "params", "Lcom/tesla/oapi/OwnerApiStatusCode;", "statusCode", "Lorg/json/JSONObject;", "response", "Lic0/h;", "result", "", "message", "cause", "<init>", "(Lfd0/h;Lcom/tesla/oapi/OwnerApiStatusCode;Lorg/json/JSONObject;Lic0/h;Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "()Lfd0/h;", "b", "()Lic0/h;", "c", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Throwable;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfd0/h;", "getParams", "Lcom/tesla/oapi/OwnerApiStatusCode;", "g", "()Lcom/tesla/oapi/OwnerApiStatusCode;", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "Lic0/h;", "f", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SignedCommandsException extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProtoRequestBuildParams params;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OwnerApiStatusCode statusCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final JSONObject response;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ic0.h result;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Throwable cause;

    public /* synthetic */ SignedCommandsException(ProtoRequestBuildParams protoRequestBuildParams, OwnerApiStatusCode ownerApiStatusCode, JSONObject jSONObject, ic0.h hVar, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : protoRequestBuildParams, (i11 & 2) != 0 ? null : ownerApiStatusCode, (i11 & 4) != 0 ? null : jSONObject, (i11 & 8) != 0 ? null : hVar, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : th2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ProtoRequestBuildParams getParams() {
        return this.params;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ic0.h getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Throwable getCause() {
        return this.cause;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final JSONObject getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignedCommandsException)) {
            return false;
        }
        SignedCommandsException signedCommandsException = (SignedCommandsException) other;
        return s.f(this.params, signedCommandsException.params) && this.statusCode == signedCommandsException.statusCode && s.f(this.response, signedCommandsException.response) && this.result == signedCommandsException.result && s.f(this.message, signedCommandsException.message) && s.f(this.cause, signedCommandsException.cause);
    }

    public final ic0.h f() {
        return this.result;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final OwnerApiStatusCode getStatusCode() {
        return this.statusCode;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        ProtoRequestBuildParams protoRequestBuildParams = this.params;
        int iHashCode = (protoRequestBuildParams == null ? 0 : protoRequestBuildParams.hashCode()) * 31;
        OwnerApiStatusCode ownerApiStatusCode = this.statusCode;
        int iHashCode2 = (iHashCode + (ownerApiStatusCode == null ? 0 : ownerApiStatusCode.hashCode())) * 31;
        JSONObject jSONObject = this.response;
        int iHashCode3 = (iHashCode2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        ic0.h hVar = this.result;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str = this.message;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th2 = this.cause;
        return iHashCode5 + (th2 != null ? th2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SignedCommandsException(params=" + this.params + ", statusCode=" + this.statusCode + ", response=" + this.response + ", result=" + this.result + ", message=" + this.message + ", cause=" + this.cause + ")";
    }

    public SignedCommandsException(ProtoRequestBuildParams protoRequestBuildParams, OwnerApiStatusCode ownerApiStatusCode, JSONObject jSONObject, ic0.h hVar, String str, Throwable th2) {
        super(str, th2);
        this.params = protoRequestBuildParams;
        this.statusCode = ownerApiStatusCode;
        this.response = jSONObject;
        this.result = hVar;
        this.message = str;
        this.cause = th2;
    }
}

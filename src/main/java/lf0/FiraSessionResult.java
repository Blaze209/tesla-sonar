package lf0;

import mf0.h;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.v0;

/* JADX INFO: renamed from: lf0.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, d2 = {"Llf0/a;", "", "", "vin", "Lvc0/v0;", "response", "<init>", "(Ljava/lang/String;Lvc0/v0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getVin", "b", "Lvc0/v0;", "()Lvc0/v0;", "c", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FiraSessionResult {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final v0 response;

    /* JADX INFO: renamed from: lf0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llf0/a$a;", "", "<init>", "()V", "", "vin", "", "sessionId", "Lkf0/a;", "e", "Llf0/a;", "a", "(Ljava/lang/String;ILkf0/a;)Llf0/a;", "b", "(Ljava/lang/String;I)Llf0/a;", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FiraSessionResult a(String vin, int sessionId, kf0.a e11) {
            s.k(vin, "vin");
            s.k(e11, "e");
            return new FiraSessionResult(vin, new v0(sessionId, null, e11.b(), null, 10, null));
        }

        public final FiraSessionResult b(String vin, int sessionId) {
            s.k(vin, "vin");
            return new FiraSessionResult(vin, new v0(sessionId, h.INSTANCE.e(vin, sessionId), null, null, 12, null));
        }

        private Companion() {
        }
    }

    public FiraSessionResult(String vin, v0 response) {
        s.k(vin, "vin");
        s.k(response, "response");
        this.vin = vin;
        this.response = response;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v0 getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiraSessionResult)) {
            return false;
        }
        FiraSessionResult firaSessionResult = (FiraSessionResult) other;
        return s.f(this.vin, firaSessionResult.vin) && s.f(this.response, firaSessionResult.response);
    }

    public int hashCode() {
        return (this.vin.hashCode() * 31) + this.response.hashCode();
    }

    public String toString() {
        return "FiraSessionResult(vin=" + this.vin + ", response=" + this.response + ")";
    }
}

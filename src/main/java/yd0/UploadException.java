package yd0;

import com.tesla.oapi.OwnerApiStatusCode;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: yd0.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lyd0/a;", "", "Lcom/tesla/oapi/OwnerApiStatusCode;", "statusCode", "", "message", "<init>", "(Lcom/tesla/oapi/OwnerApiStatusCode;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/tesla/oapi/OwnerApiStatusCode;", "()Lcom/tesla/oapi/OwnerApiStatusCode;", "b", "Ljava/lang/String;", "getMessage", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UploadException extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OwnerApiStatusCode statusCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    public /* synthetic */ UploadException(OwnerApiStatusCode ownerApiStatusCode, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : ownerApiStatusCode, (i11 & 2) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OwnerApiStatusCode getStatusCode() {
        return this.statusCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadException)) {
            return false;
        }
        UploadException uploadException = (UploadException) other;
        return this.statusCode == uploadException.statusCode && s.f(this.message, uploadException.message);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        OwnerApiStatusCode ownerApiStatusCode = this.statusCode;
        int iHashCode = (ownerApiStatusCode == null ? 0 : ownerApiStatusCode.hashCode()) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "UploadException(statusCode=" + this.statusCode + ", message=" + this.message + ")";
    }

    public UploadException(OwnerApiStatusCode ownerApiStatusCode, String str) {
        this.statusCode = ownerApiStatusCode;
        this.message = str;
    }
}

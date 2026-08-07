package rc;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: rc.e, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lrc/e;", "Lrc/j;", "Lec/n;", "image", "Lrc/g;", "request", "", "throwable", "<init>", "(Lec/n;Lrc/g;Ljava/lang/Throwable;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "Lec/n;", "getImage", "()Lec/n;", "b", "Lrc/g;", "getRequest", "()Lrc/g;", "c", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ErrorResult implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ec.n image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ImageRequest request;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Throwable throwable;

    public ErrorResult(ec.n nVar, ImageRequest imageRequest, Throwable th2) {
        this.image = nVar;
        this.request = imageRequest;
        this.throwable = th2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResult)) {
            return false;
        }
        ErrorResult errorResult = (ErrorResult) other;
        return p013kotlin.jvm.internal.s.f(this.image, errorResult.image) && p013kotlin.jvm.internal.s.f(this.request, errorResult.request) && p013kotlin.jvm.internal.s.f(this.throwable, errorResult.throwable);
    }

    @Override // rc.j
    public ec.n getImage() {
        return this.image;
    }

    @Override // rc.j
    public ImageRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        ec.n nVar = this.image;
        return ((((nVar == null ? 0 : nVar.hashCode()) * 31) + this.request.hashCode()) * 31) + this.throwable.hashCode();
    }

    public String toString() {
        return "ErrorResult(image=" + this.image + ", request=" + this.request + ", throwable=" + this.throwable + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

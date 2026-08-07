package po0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpo0/i;", "", "", "position", "Lkotlin/Function0;", "", "message", "<init>", "(ILwn0/a;)V", "a", "I", "b", "()I", "Lwn0/a;", "()Lwn0/a;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int position;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> message;

    public i(int i11, wn0.a<String> message) {
        p013kotlin.jvm.internal.s.k(message, "message");
        this.position = i11;
        this.message = message;
    }

    public final wn0.a<String> a() {
        return this.message;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPosition() {
        return this.position;
    }
}

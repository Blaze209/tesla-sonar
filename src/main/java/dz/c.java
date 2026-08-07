package dz;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006\u0010"}, d2 = {"Ldz/c;", "", "", "domain", "id", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "getMessage", "code", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class c extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String domain;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String message;

    public /* synthetic */ c(String str, String str2, String str3, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : th2);
    }

    public final String a() {
        return this.domain + "/" + this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String domain, String id2, String message, Throwable th2) {
        super("[" + domain + "/" + id2 + "] " + message, th2);
        p013kotlin.jvm.internal.s.k(domain, "domain");
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(message, "message");
        this.domain = domain;
        this.id = id2;
        this.message = message;
    }
}

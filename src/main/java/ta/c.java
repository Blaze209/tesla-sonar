package ta;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lta/c;", "Lya/c;", "Lza/d;", "openHelper", "<init>", "(Lza/d;)V", "", "fileName", "Lta/a;", "c", "(Ljava/lang/String;)Lta/a;", "a", "Lza/d;", "b", "()Lza/d;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements ya.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final za.d openHelper;

    public c(za.d openHelper) {
        s.k(openHelper, "openHelper");
        this.openHelper = openHelper;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final za.d getOpenHelper() {
        return this.openHelper;
    }

    @Override // ya.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(String fileName) {
        s.k(fileName, "fileName");
        return new a(this.openHelper.getWritableDatabase());
    }
}

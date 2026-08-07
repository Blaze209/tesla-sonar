package al;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lal/a;", "Lal/b;", "<init>", "()V", "Lzk/a;", "tag", "", "message", "", "", "args", "Ljn0/h0;", "a", "(Lzk/a;Ljava/lang/String;[Ljava/lang/Object;)V", "b", "(Lzk/a;Ljava/lang/String;)V", "", "c", "(Lzk/a;)Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1754a = new a();

    private a() {
    }

    @Override // al.b
    public void a(zk.a tag, String message, Object... args) {
        s.k(tag, "tag");
        s.k(message, "message");
        s.k(args, "args");
    }

    @Override // al.b
    public void b(zk.a tag, String message) {
        s.k(tag, "tag");
        s.k(message, "message");
    }

    @Override // al.b
    public boolean c(zk.a tag) {
        s.k(tag, "tag");
        return false;
    }
}

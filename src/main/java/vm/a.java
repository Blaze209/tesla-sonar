package vm;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lvm/a;", "", "<init>", "()V", "", "tag", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/Object;", "token", "e", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "Ljn0/h0;", "f", "(Ljava/lang/Object;)V", "", "th", "c", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Ljava/lang/Runnable;", "runnable", "a", "(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;", "", "b", "()Z", "isTracing", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f119572a = new a();

    private a() {
    }

    public static final boolean b() {
        return false;
    }

    public static final void c(Object token, Throwable th2) {
        s.k(th2, "th");
    }

    public static final Object d(String tag) {
        return null;
    }

    public static final Object e(Object token, String tag) {
        return null;
    }

    public static final void f(Object token) {
    }

    public static final Runnable a(Runnable runnable, String tag) {
        return runnable;
    }
}

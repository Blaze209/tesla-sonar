package ko;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00102\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lko/d;", "TResult", "", "<init>", "()V", "", "e", "()Z", "result", "g", "(Ljava/lang/Object;)Z", "Ljava/lang/Exception;", "Lkotlin/Exception;", AnalyticsAttribute.Error, "f", "(Ljava/lang/Exception;)Z", "Ljn0/h0;", "b", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", "c", "(Ljava/lang/Exception;)V", "Lko/c;", "a", "Lko/c;", "()Lko/c;", "task", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c<TResult> task = new c<>();

    public final c<TResult> a() {
        return this.task;
    }

    public final void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public final void c(Exception error) {
        if (!f(error)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public final void d(TResult result) {
        if (!g(result)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public final boolean e() {
        return this.task.x();
    }

    public final boolean f(Exception error) {
        return this.task.y(error);
    }

    public final boolean g(TResult result) {
        return this.task.z(result);
    }
}

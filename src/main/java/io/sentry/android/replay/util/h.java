package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lio/sentry/android/replay/util/h;", "", "Landroid/os/Looper;", "looper", "<init>", "(Landroid/os/Looper;)V", "Ljava/lang/Runnable;", "runnable", "", "b", "(Ljava/lang/Runnable;)Z", "", "delay", "c", "(Ljava/lang/Runnable;J)Z", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Runnable;)V", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "()Landroid/os/Handler;", "handler", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    public h(Looper looper) {
        s.k(looper, "looper");
        this.handler = new Handler(looper);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    public final boolean b(Runnable runnable) {
        s.k(runnable, "runnable");
        return this.handler.post(runnable);
    }

    public final boolean c(Runnable runnable, long delay) {
        Handler handler = this.handler;
        if (runnable == null) {
            return false;
        }
        return handler.postDelayed(runnable, delay);
    }

    public final void d(Runnable runnable) {
        Handler handler = this.handler;
        if (runnable == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h(Looper looper, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            looper = Looper.getMainLooper();
            s.j(looper, "getMainLooper(...)");
        }
        this(looper);
    }
}

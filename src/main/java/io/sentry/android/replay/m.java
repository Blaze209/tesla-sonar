package io.sentry.android.replay;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/sentry/android/replay/m;", "", "<init>", "()V", "Lio/sentry/android/replay/n;", "newState", "", "b", "(Lio/sentry/android/replay/n;)Z", "c", "()Z", "a", "Lio/sentry/android/replay/n;", "()Lio/sentry/android/replay/n;", DateTokenConverter.CONVERTER_KEY, "(Lio/sentry/android/replay/n;)V", "currentState", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private volatile n currentState = n.INITIAL;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80076a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f80076a = iArr;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getCurrentState() {
        return this.currentState;
    }

    public final boolean b(n newState) {
        p013kotlin.jvm.internal.s.k(newState, "newState");
        switch (a.f80076a[this.currentState.ordinal()]) {
            case 1:
                return newState == n.STARTED || newState == n.CLOSED;
            case 2:
                return newState == n.PAUSED || newState == n.STOPPED || newState == n.CLOSED;
            case 3:
                return newState == n.PAUSED || newState == n.STOPPED || newState == n.CLOSED;
            case 4:
                return newState == n.RESUMED || newState == n.STOPPED || newState == n.CLOSED;
            case 5:
                return newState == n.STARTED || newState == n.CLOSED;
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean c() {
        return this.currentState == n.STARTED || this.currentState == n.RESUMED;
    }

    public final void d(n nVar) {
        p013kotlin.jvm.internal.s.k(nVar, "<set-?>");
        this.currentState = nVar;
    }
}

package io.sentry.android.replay.util;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.TextLayoutResult;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/sentry/android/replay/util/b;", "Lio/sentry/android/replay/util/p;", "Li4/m0;", "layout", "", "hasFillModifier", "<init>", "(Li4/m0;Z)V", "", "line", "offset", "", DateTokenConverter.CONVERTER_KEY, "(II)F", "h", "(I)I", "g", "a", "c", "b", "Li4/m0;", "getLayout$sentry_android_replay_release", "()Li4/m0;", "Z", "e", "()I", "lineCount", "f", "()Ljava/lang/Integer;", "dominantTextColor", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f80164c = TextLayoutResult.f75762g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult layout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean hasFillModifier;

    public b(TextLayoutResult layout, boolean z11) {
        s.k(layout, "layout");
        this.layout = layout;
        this.hasFillModifier = z11;
    }

    @Override // io.sentry.android.replay.util.p
    public int a(int line) {
        return yn0.a.d(this.layout.v(line));
    }

    @Override // io.sentry.android.replay.util.p
    public int b(int line) {
        return this.layout.u(line);
    }

    @Override // io.sentry.android.replay.util.p
    public int c(int line) {
        return yn0.a.d(this.layout.m(line));
    }

    @Override // io.sentry.android.replay.util.p
    public float d(int line, int offset) {
        float fJ = this.layout.j(offset, true);
        return (this.hasFillModifier || e() != 1) ? fJ : fJ - this.layout.s(line);
    }

    @Override // io.sentry.android.replay.util.p
    public int e() {
        return this.layout.n();
    }

    @Override // io.sentry.android.replay.util.p
    public Integer f() {
        return null;
    }

    @Override // io.sentry.android.replay.util.p
    public int g(int line) {
        return this.layout.o(line, true);
    }

    @Override // io.sentry.android.replay.util.p
    public int h(int line) {
        return this.layout.D(line) ? 1 : 0;
    }
}

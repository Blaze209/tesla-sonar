package jn;

import ezvcard.property.Gender;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "a", "J", "MIN_TIME_BETWEEN_SAMPLES_NS", "", "b", Gender.FEMALE, "SHAKING_WINDOW_NS", "ReactAndroid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f84023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f84024b;

    static {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        f84023a = timeUnit.convert(20L, TimeUnit.MILLISECONDS);
        f84024b = timeUnit.convert(3L, TimeUnit.SECONDS);
    }
}

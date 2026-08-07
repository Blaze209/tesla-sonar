package tc;

import gc.j;
import okio.k;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lgc/j;", "Lokio/j;", "source", "", "a", "(Lgc/j;Lokio/j;)Z", "Lokio/k;", "Lokio/k;", "SVG_TAG", "b", "LEFT_ANGLE_BRACKET", "coil-svg_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f113115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k f113116b;

    static {
        k.Companion companion = k.INSTANCE;
        f113115a = companion.f("<svg");
        f113116b = companion.f("<");
    }

    public static final boolean a(j jVar, okio.j jVar2) {
        return jVar2.l0(0L, f113116b) && uc.e.a(jVar2, f113115a, 0L, 1024L) != -1;
    }
}

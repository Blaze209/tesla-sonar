package j60;

import p009i2.s;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lj60/c;", "", "<init>", "()V", "", "isDark", "Lj60/b;", "a", "(Z)Lj60/b;", "b", "Lj60/b;", "colorsLight", "c", "colorsDark", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f82745a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final LinkColors colorsLight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final LinkColors colorsDark;

    static {
        LinkColors linkColors = new LinkColors(a.f82729c, a.f82728b, a.f82730d, a.f82731e, s.h(a.f82727a, 0L, a.f82735i, 0L, a.f82734h, a.f82734h, 0L, a.f82732f, a.f82733g, 0L, 0L, 0L, 3658, null), null);
        colorsLight = linkColors;
        colorsDark = LinkColors.b(linkColors, 0L, 0L, 0L, 0L, s.d(a.f82727a, 0L, a.f82739m, 0L, a.f82738l, a.f82738l, 0L, a.f82736j, a.f82737k, 0L, 0L, 0L, 3658, null), 15, null);
    }

    private c() {
    }

    public final LinkColors a(boolean isDark) {
        return isDark ? colorsDark : colorsLight;
    }
}

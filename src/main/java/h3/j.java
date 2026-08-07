package h3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import j3.m;
import p013kotlin.Metadata;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lh3/j;", "Lh3/b;", "<init>", "()V", "Lj3/m;", "b", "J", "()J", "size", "Lw4/t;", "c", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "layoutDirection", "Lw4/d;", DateTokenConverter.CONVERTER_KEY, "Lw4/d;", "getDensity", "()Lw4/d;", "density", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f70567a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long size = m.INSTANCE.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final t layoutDirection = t.Ltr;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final w4.d density = w4.f.a(1.0f, 1.0f);

    private j() {
    }

    @Override // h3.b
    public long b() {
        return size;
    }

    @Override // h3.b
    public w4.d getDensity() {
        return density;
    }

    @Override // h3.b
    public t getLayoutDirection() {
        return layoutDirection;
    }
}

package p016o2;

import a2.a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import q2.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lo2/d0;", "", "<init>", "()V", "La2/a;", "b", "La2/a;", "()La2/a;", "ExtraSmall", "c", "e", "Small", DateTokenConverter.CONVERTER_KEY, "Medium", "Large", "f", "a", "ExtraLarge", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f95835a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final a ExtraSmall;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final a Small;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final a Medium;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final a Large;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final a ExtraLarge;

    static {
        j jVar = j.f104546a;
        ExtraSmall = jVar.b();
        Small = jVar.e();
        Medium = jVar.d();
        Large = jVar.c();
        ExtraLarge = jVar.a();
    }

    private d0() {
    }

    public final a a() {
        return ExtraLarge;
    }

    public final a b() {
        return ExtraSmall;
    }

    public final a c() {
        return Large;
    }

    public final a d() {
        return Medium;
    }

    public final a e() {
        return Small;
    }
}

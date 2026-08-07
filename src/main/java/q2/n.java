package q2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p014n4.FontWeight;
import p014n4.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\n\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\r\u0010\u0010¨\u0006\u0016"}, d2 = {"Lq2/n;", "", "<init>", "()V", "Ln4/j0;", "b", "Ln4/j0;", "a", "()Ln4/j0;", "Brand", "c", "Plain", "Ln4/f0;", DateTokenConverter.CONVERTER_KEY, "Ln4/f0;", "getWeightBold", "()Ln4/f0;", "WeightBold", "e", "WeightMedium", "f", "WeightRegular", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f104641a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final j0 Brand;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final j0 Plain;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight WeightBold;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight WeightMedium;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight WeightRegular;

    static {
        p014n4.q.Companion companion = p014n4.q.INSTANCE;
        Brand = companion.b();
        Plain = companion.b();
        FontWeight.Companion companion2 = FontWeight.INSTANCE;
        WeightBold = companion2.a();
        WeightMedium = companion2.c();
        WeightRegular = companion2.d();
    }

    private n() {
    }

    public final j0 a() {
        return Brand;
    }

    public final j0 b() {
        return Plain;
    }

    public final FontWeight c() {
        return WeightMedium;
    }

    public final FontWeight d() {
        return WeightRegular;
    }
}

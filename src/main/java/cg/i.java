package cg;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bg.h f19263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bg.d f19264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19265d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, bg.h hVar, bg.d dVar, boolean z11) {
        this.f19262a = aVar;
        this.f19263b = hVar;
        this.f19264c = dVar;
        this.f19265d = z11;
    }

    public a a() {
        return this.f19262a;
    }

    public bg.h b() {
        return this.f19263b;
    }

    public bg.d c() {
        return this.f19264c;
    }

    public boolean d() {
        return this.f19265d;
    }
}

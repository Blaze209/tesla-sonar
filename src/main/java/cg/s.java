package cg;

import android.graphics.Paint;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bg.b f19309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<bg.b> f19310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bg.a f19311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bg.d f19312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bg.b f19313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f19314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f19315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f19316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f19317j;

    public enum a {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int iOrdinal = ordinal();
            if (iOrdinal != 0) {
                return iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum b {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return Paint.Join.MITER;
            }
            if (iOrdinal == 1) {
                return Paint.Join.ROUND;
            }
            if (iOrdinal != 2) {
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public s(String str, bg.b bVar, List<bg.b> list, bg.a aVar, bg.d dVar, bg.b bVar2, a aVar2, b bVar3, float f11, boolean z11) {
        this.f19308a = str;
        this.f19309b = bVar;
        this.f19310c = list;
        this.f19311d = aVar;
        this.f19312e = dVar;
        this.f19313f = bVar2;
        this.f19314g = aVar2;
        this.f19315h = bVar3;
        this.f19316i = f11;
        this.f19317j = z11;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return new vf.t(pVar, bVar, this);
    }

    public a b() {
        return this.f19314g;
    }

    public bg.a c() {
        return this.f19311d;
    }

    public bg.b d() {
        return this.f19309b;
    }

    public b e() {
        return this.f19315h;
    }

    public List<bg.b> f() {
        return this.f19310c;
    }

    public float g() {
        return this.f19316i;
    }

    public String h() {
        return this.f19308a;
    }

    public bg.d i() {
        return this.f19312e;
    }

    public bg.b j() {
        return this.f19313f;
    }

    public boolean k() {
        return this.f19317j;
    }
}

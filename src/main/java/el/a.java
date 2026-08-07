package el;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ll.i;

/* JADX INFO: loaded from: classes3.dex */
public class a implements tm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f63026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tm.a f63027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tm.a f63028c;

    public a(Resources resources, tm.a aVar, tm.a aVar2) {
        this.f63026a = resources;
        this.f63027b = aVar;
        this.f63028c = aVar2;
    }

    private static boolean c(um.f fVar) {
        return (fVar.L0() == 1 || fVar.L0() == 0) ? false : true;
    }

    private static boolean d(um.f fVar) {
        return (fVar.U2() == 0 || fVar.U2() == -1) ? false : true;
    }

    @Override // tm.a
    public Drawable a(um.e eVar) {
        try {
            if (bn.b.d()) {
                bn.b.a("DefaultDrawableFactory#createDrawable");
            }
            if (eVar instanceof um.f) {
                um.f fVar = (um.f) eVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f63026a, fVar.t3());
                if (!d(fVar) && !c(fVar)) {
                    if (bn.b.d()) {
                        bn.b.b();
                    }
                    return bitmapDrawable;
                }
                i iVar = new i(bitmapDrawable, fVar.U2(), fVar.L0());
                if (bn.b.d()) {
                    bn.b.b();
                }
                return iVar;
            }
            tm.a aVar = this.f63027b;
            if (aVar != null && aVar.b(eVar)) {
                Drawable drawableA = this.f63027b.a(eVar);
                if (bn.b.d()) {
                    bn.b.b();
                }
                return drawableA;
            }
            tm.a aVar2 = this.f63028c;
            if (aVar2 == null || !aVar2.b(eVar)) {
                if (bn.b.d()) {
                    bn.b.b();
                }
                return null;
            }
            Drawable drawableA2 = this.f63028c.a(eVar);
            if (bn.b.d()) {
                bn.b.b();
            }
            return drawableA2;
        } catch (Throwable th2) {
            if (bn.b.d()) {
                bn.b.b();
            }
            throw th2;
        }
    }

    @Override // tm.a
    public boolean b(um.e eVar) {
        return true;
    }
}

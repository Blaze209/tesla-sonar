package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class a implements c {
    a() {
    }

    private d p(b bVar) {
        return (d) bVar.d();
    }

    @Override // androidx.cardview.widget.c
    public float a(b bVar) {
        return p(bVar).d();
    }

    @Override // androidx.cardview.widget.c
    public float b(b bVar) {
        return p(bVar).c();
    }

    @Override // androidx.cardview.widget.c
    public float c(b bVar) {
        return a(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public float d(b bVar) {
        return bVar.f().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public void e(b bVar) {
        if (!bVar.b()) {
            bVar.a(0, 0, 0, 0);
            return;
        }
        float fB = b(bVar);
        float fA = a(bVar);
        int iCeil = (int) Math.ceil(e.a(fB, fA, bVar.e()));
        int iCeil2 = (int) Math.ceil(e.b(fB, fA, bVar.e()));
        bVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.c
    public float f(b bVar) {
        return a(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void g(b bVar, float f11) {
        p(bVar).g(f11, bVar.b(), bVar.e());
        e(bVar);
    }

    @Override // androidx.cardview.widget.c
    public void h(b bVar, float f11) {
        p(bVar).h(f11);
    }

    @Override // androidx.cardview.widget.c
    public void i(b bVar, float f11) {
        bVar.f().setElevation(f11);
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList j(b bVar) {
        return p(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public void k(b bVar) {
        g(bVar, b(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void l(b bVar, Context context, ColorStateList colorStateList, float f11, float f12, float f13) {
        bVar.c(new d(colorStateList, f11));
        View viewF = bVar.f();
        viewF.setClipToOutline(true);
        viewF.setElevation(f12);
        g(bVar, f13);
    }

    @Override // androidx.cardview.widget.c
    public void m(b bVar) {
        g(bVar, b(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void n() {
    }

    @Override // androidx.cardview.widget.c
    public void o(b bVar, ColorStateList colorStateList) {
        p(bVar).f(colorStateList);
    }
}

package py;

import android.view.View;
import com.henninghall.date_picker.l;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f104078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f104079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f104080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f104081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f104082e = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f104083f;

    public f(l lVar, View view) {
        this.f104078a = lVar;
        this.f104079b = view;
        this.f104080c = new j(lVar, view);
        a();
    }

    private void a() {
        h hVar = new h(this.f104080c, this.f104078a, this, this.f104079b);
        this.f104083f = hVar;
        this.f104080c.j(new qy.a(hVar));
    }

    void b(Calendar calendar) {
        this.f104080c.k(new qy.e(calendar));
        this.f104080c.l(new qy.b(calendar));
    }

    SimpleDateFormat c() {
        return new SimpleDateFormat(this.f104080c.u(), this.f104078a.y());
    }

    String d() {
        return this.f104080c.t();
    }

    public void e(int i11, int i12) {
        this.f104082e.a(this.f104080c.y(this.f104078a.f45233q.b().get(i11)), i12);
    }

    public void f() {
        this.f104080c.j(new qy.e(this.f104078a.E()));
    }

    public void g() {
        this.f104080c.j(new qy.d());
    }

    public void h() {
        this.f104080c.B();
    }

    public void i() {
        if (this.f104078a.f45233q.g()) {
            return;
        }
        b bVar = new b(this.f104078a, this.f104079b);
        this.f104081d = bVar;
        bVar.a();
    }

    public void j() {
        this.f104080c.C();
    }

    public void k(Calendar calendar) {
        this.f104078a.J(calendar);
    }

    public void l() {
        this.f104080c.j(new qy.h(this.f104078a.G()));
    }

    public void m() {
        this.f104080c.D();
    }

    public void n() {
        this.f104080c.l(new qy.c());
    }

    public void o() {
        this.f104080c.j(new qy.i());
    }
}

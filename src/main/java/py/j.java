package py;

import android.view.View;
import com.henninghall.date_picker.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f104090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dc.a f104091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dc.a f104092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ry.d f104093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ry.c f104094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ry.e f104095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ry.a f104096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ry.b f104097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ry.f f104098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ry.h f104099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f104100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c f104101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HashMap<ny.d, ry.g> f104102m = z();

    class a implements com.henninghall.date_picker.pickers.a.b {
        a() {
        }

        @Override // com.henninghall.date_picker.pickers.a.b
        public void a(com.henninghall.date_picker.pickers.a aVar, int i11, int i12) {
            if (j.this.f104090a.f45233q.i()) {
                String strN = j.this.f104093d.n(i11);
                String strN2 = j.this.f104093d.n(i12);
                if ((strN.equals("12") && strN2.equals("11")) || (strN.equals("11") && strN2.equals("12"))) {
                    j.this.f104096g.f109246d.b((j.this.f104096g.f109246d.getValue() + 1) % 2, false);
                }
            }
        }
    }

    class b extends HashMap<ny.d, ry.g> {
        b() {
            put(ny.d.DAY, j.this.f104094e);
            put(ny.d.YEAR, j.this.f104099j);
            put(ny.d.MONTH, j.this.f104098i);
            put(ny.d.DATE, j.this.f104097h);
            put(ny.d.HOUR, j.this.f104093d);
            put(ny.d.MINUTE, j.this.f104095f);
            put(ny.d.AM_PM, j.this.f104096g);
        }
    }

    j(l lVar, View view) {
        this.f104090a = lVar;
        this.f104100k = view;
        this.f104101l = new c(view);
        this.f104099j = new ry.h(w(com.henninghall.date_picker.j.f45214l), lVar);
        this.f104098i = new ry.f(w(com.henninghall.date_picker.j.f45210h), lVar);
        this.f104097h = new ry.b(w(com.henninghall.date_picker.j.f45204b), lVar);
        this.f104094e = new ry.c(w(com.henninghall.date_picker.j.f45205c), lVar);
        this.f104095f = new ry.e(w(com.henninghall.date_picker.j.f45209g), lVar);
        this.f104096g = new ry.a(w(com.henninghall.date_picker.j.f45203a), lVar);
        this.f104093d = new ry.d(w(com.henninghall.date_picker.j.f45208f), lVar);
        this.f104091b = (dc.a) view.findViewById(com.henninghall.date_picker.j.f45207e);
        this.f104092c = (dc.a) view.findViewById(com.henninghall.date_picker.j.f45206d);
        m();
    }

    private void i() {
        Iterator<ny.d> it = this.f104090a.f45233q.b().iterator();
        while (it.hasNext()) {
            this.f104101l.a(y(it.next()).f109246d.getView());
        }
    }

    private void m() {
        this.f104093d.f109246d.setOnValueChangeListenerInScrolling(new a());
    }

    private List<ry.g> n() {
        return new ArrayList(Arrays.asList(this.f104099j, this.f104098i, this.f104097h, this.f104094e, this.f104093d, this.f104095f, this.f104096g));
    }

    private String o() {
        ArrayList<ry.g> arrayListV = v();
        if (this.f104090a.D() != ny.b.date) {
            return this.f104094e.e();
        }
        return arrayListV.get(0).e() + " " + arrayListV.get(1).e() + " " + arrayListV.get(2).e();
    }

    private String p(int i11) {
        ArrayList<ry.g> arrayListV = v();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < 3; i12++) {
            if (i12 != 0) {
                sb2.append(" ");
            }
            ry.g gVar = arrayListV.get(i12);
            if (gVar instanceof ry.b) {
                sb2.append(gVar.j(i11));
            } else {
                sb2.append(gVar.m());
            }
        }
        return sb2.toString();
    }

    private String q(int i11) {
        return this.f104090a.D() == ny.b.date ? p(i11) : this.f104094e.m();
    }

    private ArrayList<ry.g> v() {
        ArrayList<ry.g> arrayList = new ArrayList<>();
        Iterator<ny.d> it = this.f104090a.f45233q.b().iterator();
        while (it.hasNext()) {
            arrayList.add(y(it.next()));
        }
        return arrayList;
    }

    private com.henninghall.date_picker.pickers.a w(int i11) {
        return (com.henninghall.date_picker.pickers.a) this.f104100k.findViewById(i11);
    }

    private HashMap<ny.d, ry.g> z() {
        return new b();
    }

    public boolean A() {
        Iterator<ry.g> it = n().iterator();
        while (it.hasNext()) {
            if (it.next().f109246d.a()) {
                return true;
            }
        }
        return false;
    }

    void B() {
        int iR = this.f104090a.r();
        j(new qy.f(iR));
        if (this.f104090a.I() == ny.c.iosClone) {
            this.f104091b.setDividerHeight(iR);
            this.f104092c.setDividerHeight(iR);
        }
    }

    void C() {
        int iE = this.f104090a.f45233q.e();
        j(new qy.g(iE));
        if (this.f104090a.I() == ny.c.iosClone) {
            this.f104091b.setShownCount(iE);
            this.f104092c.setShownCount(iE);
        }
    }

    void D() {
        this.f104101l.b();
        ny.c cVarI = this.f104090a.I();
        ny.c cVar = ny.c.iosClone;
        if (cVarI == cVar) {
            this.f104101l.a(this.f104091b);
        }
        i();
        if (this.f104090a.I() == cVar) {
            this.f104101l.a(this.f104092c);
        }
    }

    void j(qy.j jVar) {
        Iterator<ry.g> it = n().iterator();
        while (it.hasNext()) {
            jVar.a(it.next());
        }
    }

    void k(qy.j jVar) {
        for (ry.g gVar : n()) {
            if (!gVar.v()) {
                jVar.a(gVar);
            }
        }
    }

    void l(qy.j jVar) {
        for (ry.g gVar : n()) {
            if (gVar.v()) {
                jVar.a(gVar);
            }
        }
    }

    String r() {
        return s(0);
    }

    String s(int i11) {
        return q(i11) + " " + x();
    }

    String t() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<ry.g> it = v().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
        }
        return sb2.toString();
    }

    public String u() {
        return o() + " " + this.f104093d.e() + " " + this.f104095f.e() + this.f104096g.e();
    }

    String x() {
        return this.f104093d.m() + " " + this.f104095f.m() + this.f104096g.m();
    }

    ry.g y(ny.d dVar) {
        return this.f104102m.get(dVar);
    }
}

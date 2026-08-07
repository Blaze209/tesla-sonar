package fg;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final gg.c.a f65908f = gg.c.a.a("ef");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final gg.c.a f65909g = gg.c.a.a("nm", "v");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bg.a f65910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bg.b f65911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private bg.b f65912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bg.b f65913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bg.b f65914e;

    private void a(gg.c cVar, tf.i iVar) {
        cVar.h();
        String strO = "";
        while (cVar.hasNext()) {
            int iT = cVar.t(f65909g);
            if (iT != 0) {
                if (iT == 1) {
                    strO.getClass();
                    switch (strO) {
                        case "Distance":
                            this.f65913d = d.e(cVar, iVar);
                            break;
                        case "Opacity":
                            this.f65911b = d.f(cVar, iVar, false);
                            break;
                        case "Direction":
                            this.f65912c = d.f(cVar, iVar, false);
                            break;
                        case "Shadow Color":
                            this.f65910a = d.c(cVar, iVar);
                            break;
                        case "Softness":
                            this.f65914e = d.e(cVar, iVar);
                            break;
                        default:
                            cVar.F();
                            break;
                    }
                } else {
                    cVar.B();
                    cVar.F();
                }
            } else {
                strO = cVar.O();
            }
        }
        cVar.j();
    }

    j b(gg.c cVar, tf.i iVar) {
        bg.b bVar;
        bg.b bVar2;
        bg.b bVar3;
        bg.b bVar4;
        while (cVar.hasNext()) {
            if (cVar.t(f65908f) != 0) {
                cVar.B();
                cVar.F();
            } else {
                cVar.f();
                while (cVar.hasNext()) {
                    a(cVar, iVar);
                }
                cVar.e();
            }
        }
        bg.a aVar = this.f65910a;
        if (aVar == null || (bVar = this.f65911b) == null || (bVar2 = this.f65912c) == null || (bVar3 = this.f65913d) == null || (bVar4 = this.f65914e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}

package fg;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class i implements n0<ag.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f65899a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gg.c.a f65900b = gg.c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private i() {
    }

    @Override // fg.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ag.b a(gg.c cVar, float f11) {
        ag.b.a aVar = ag.b.a.CENTER;
        cVar.h();
        ag.b.a aVar2 = aVar;
        String strO = null;
        String strO2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zNextBoolean = true;
        while (cVar.hasNext()) {
            switch (cVar.t(f65900b)) {
                case 0:
                    strO = cVar.O();
                    break;
                case 1:
                    strO2 = cVar.O();
                    break;
                case 2:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = cVar.nextInt();
                    aVar2 = ag.b.a.CENTER;
                    if (iNextInt2 <= aVar2.ordinal() && iNextInt2 >= 0) {
                        aVar2 = ag.b.a.values()[iNextInt2];
                    }
                    break;
                case 4:
                    iNextInt = cVar.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) cVar.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) cVar.nextDouble();
                    break;
                case 7:
                    iD = s.d(cVar);
                    break;
                case 8:
                    iD2 = s.d(cVar);
                    break;
                case 9:
                    fNextDouble4 = (float) cVar.nextDouble();
                    break;
                case 10:
                    zNextBoolean = cVar.nextBoolean();
                    break;
                case 11:
                    cVar.f();
                    PointF pointF3 = new PointF(((float) cVar.nextDouble()) * f11, ((float) cVar.nextDouble()) * f11);
                    cVar.e();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.f();
                    PointF pointF4 = new PointF(((float) cVar.nextDouble()) * f11, ((float) cVar.nextDouble()) * f11);
                    cVar.e();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.B();
                    cVar.F();
                    break;
            }
        }
        cVar.j();
        return new ag.b(strO, strO2, fNextDouble, aVar2, iNextInt, fNextDouble2, fNextDouble3, iD, iD2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}

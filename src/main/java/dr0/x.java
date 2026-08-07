package dr0;

import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes10.dex */
public class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f60999c = Logger.getLogger("org.jmrtd.protocol");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zo0.e f61000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f61001b = 0;

    public x(zo0.e eVar) {
        this.f61000a = eVar;
    }

    protected void a(zo0.a aVar) {
        Collection<zo0.b> collectionB = this.f61000a.b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        Iterator<zo0.b> it = collectionB.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
    }

    public zo0.j b(zo0.c cVar, zo0.f fVar) throws Throwable {
        zo0.f fVarA = cVar != null ? cVar.a(fVar) : fVar;
        zo0.j jVarF = this.f61000a.f(fVarA);
        short sD = (short) jVarF.d();
        if (cVar == null) {
            int i11 = this.f61001b + 1;
            this.f61001b = i11;
            a(new zo0.a(this, "PLAIN", i11, fVarA, jVarF));
            return jVarF;
        }
        if ((sD & 26368) == 26368) {
            String type = cVar.getType();
            int i12 = this.f61001b + 1;
            this.f61001b = i12;
            a(new yq0.p(this, type, i12, fVar, jVarF, fVarA, jVarF));
            return jVarF;
        }
        try {
            try {
                if (jVarF.b().length <= 2) {
                    throw new CardServiceException("Exception during transmission of wrapped APDU, C=" + bp0.a.b(fVar.c()), sD);
                }
                try {
                    zo0.j jVarB = cVar.b(jVarF);
                    String type2 = cVar.getType();
                    int i13 = this.f61001b + 1;
                    this.f61001b = i13;
                    a(new yq0.p(this, type2, i13, fVar, jVarB, fVarA, jVarF));
                    return jVarB;
                } catch (CardServiceException e11) {
                    e = e11;
                } catch (Exception e12) {
                    e = e12;
                    throw new CardServiceException("Exception during transmission of wrapped APDU, C=" + bp0.a.b(fVar.c()), e, sD);
                } catch (Throwable th2) {
                    th = th2;
                    jVarF = jVarF;
                    Throwable th3 = th;
                    String type3 = cVar.getType();
                    int i14 = this.f61001b + 1;
                    this.f61001b = i14;
                    a(new yq0.p(this, type3, i14, fVar, jVarF, fVarA, jVarF));
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (CardServiceException e13) {
            e = e13;
        } catch (Exception e14) {
            e = e14;
        }
        throw e;
    }
}

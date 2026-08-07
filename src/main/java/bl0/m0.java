package bl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldl0/x;", "parameters", "Lbl0/x;", DateTokenConverter.CONVERTER_KEY, "(Ldl0/x;)Lbl0/x;", "Ldl0/w;", "Lbl0/y;", "e", "(Ldl0/w;)Lbl0/y;", "Ljn0/h0;", "b", "(Ldl0/x;Ldl0/x;)V", "c", "(Ldl0/x;Ldl0/w;)V", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m0 {
    private static final void b(dl0.x xVar, dl0.x xVar2) {
        for (String str : xVar2.names()) {
            List<String> listB = xVar2.b(str);
            if (listB == null) {
                listB = p013kotlin.collections.v.m();
            }
            String strK = a.k(str, 0, 0, false, null, 15, null);
            List<String> list = listB;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a.k((String) it.next(), 0, 0, true, null, 11, null));
            }
            xVar.d(strK, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(dl0.x xVar, dl0.w wVar) {
        for (String str : wVar.names()) {
            List<String> listB = wVar.b(str);
            if (listB == null) {
                listB = p013kotlin.collections.v.m();
            }
            String strM = a.m(str, false, 1, null);
            List<String> list = listB;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a.n((String) it.next()));
            }
            xVar.d(strM, arrayList);
        }
    }

    public static final x d(dl0.x parameters) {
        p013kotlin.jvm.internal.s.k(parameters, "parameters");
        y yVarB = b0.b(0, 1, null);
        b(yVarB, parameters);
        return yVarB.build();
    }

    public static final y e(dl0.w parameters) {
        p013kotlin.jvm.internal.s.k(parameters, "parameters");
        y yVarB = b0.b(0, 1, null);
        c(yVarB, parameters);
        return yVarB;
    }
}

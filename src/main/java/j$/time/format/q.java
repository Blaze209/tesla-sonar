package j$.time.format;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.p f82130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f82131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f82132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile i f82133d;

    public q(j$.time.temporal.p pVar, e0 e0Var, z zVar) {
        this.f82130a = pVar;
        this.f82131b = e0Var;
        this.f82132c = zVar;
    }

    @Override // j$.time.format.e
    public final boolean s(w wVar, StringBuilder sb2) {
        String strC;
        Long lA = wVar.a(this.f82130a);
        DateTimeFormatter dateTimeFormatter = wVar.f82155b;
        if (lA == null) {
            return false;
        }
        j$.time.chrono.l lVar = (j$.time.chrono.l) wVar.f82154a.b(j$.time.temporal.q.f82215b);
        if (lVar == null || lVar == j$.time.chrono.s.f82037c) {
            strC = this.f82132c.c(this.f82130a, lA.longValue(), this.f82131b, dateTimeFormatter.f82060b);
        } else {
            strC = this.f82132c.b(lVar, this.f82130a, lA.longValue(), this.f82131b, dateTimeFormatter.f82060b);
        }
        if (strC != null) {
            sb2.append(strC);
            return true;
        }
        if (this.f82133d == null) {
            this.f82133d = new i(this.f82130a, 1, 19, d0.NORMAL);
        }
        return this.f82133d.s(wVar, sb2);
    }

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i11) {
        Iterator itE;
        z zVar = this.f82132c;
        j$.time.temporal.p pVar = this.f82130a;
        int length = charSequence.length();
        if (i11 >= 0 && i11 <= length) {
            boolean z11 = uVar.f82147c;
            DateTimeFormatter dateTimeFormatter = uVar.f82145a;
            e0 e0Var = z11 ? this.f82131b : null;
            j$.time.chrono.l lVar = uVar.c().f82079c;
            if (lVar == null && (lVar = uVar.f82145a.f82063e) == null) {
                lVar = j$.time.chrono.s.f82037c;
            }
            j$.time.chrono.l lVar2 = lVar;
            if (lVar2 == null || lVar2 == j$.time.chrono.s.f82037c) {
                itE = zVar.e(pVar, e0Var, dateTimeFormatter.f82060b);
            } else {
                itE = zVar.d(lVar2, pVar, e0Var, dateTimeFormatter.f82060b);
            }
            Iterator it = itE;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (uVar.g(str, 0, charSequence, i11, str.length())) {
                        return uVar.f(this.f82130a, ((Long) entry.getValue()).longValue(), i11, str.length() + i11);
                    }
                }
                if (pVar == j$.time.temporal.a.ERA && !uVar.f82147c) {
                    for (j$.time.chrono.m mVar : lVar2.v()) {
                        String string = mVar.toString();
                        if (uVar.g(string, 0, charSequence, i11, string.length())) {
                            return uVar.f(this.f82130a, mVar.getValue(), i11, string.length() + i11);
                        }
                    }
                }
                if (uVar.f82147c) {
                    return ~i11;
                }
            }
            if (this.f82133d == null) {
                this.f82133d = new i(this.f82130a, 1, 19, d0.NORMAL);
            }
            return this.f82133d.w(uVar, charSequence, i11);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        e0 e0Var = e0.FULL;
        j$.time.temporal.p pVar = this.f82130a;
        e0 e0Var2 = this.f82131b;
        if (e0Var2 == e0Var) {
            return "Text(" + pVar + ")";
        }
        return "Text(" + pVar + "," + e0Var2 + ")";
    }
}

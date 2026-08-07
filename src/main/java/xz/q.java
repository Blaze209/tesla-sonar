package xz;

/* JADX INFO: loaded from: classes6.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final r f124215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f124216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final r f124217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f124218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f124219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    q f124220f;

    q(r rVar, r rVar2, r rVar3, int i11, String str) {
        this.f124215a = rVar;
        this.f124216b = rVar2;
        this.f124217c = rVar3;
        this.f124218d = i11;
        this.f124219e = str;
    }

    static int a(q qVar) {
        int i11 = 0;
        while (qVar != null) {
            i11++;
            qVar = qVar.f124220f;
        }
        return i11;
    }

    static int b(q qVar) {
        return (a(qVar) * 8) + 2;
    }

    static void c(q qVar, d dVar) {
        dVar.k(a(qVar));
        while (qVar != null) {
            dVar.k(qVar.f124215a.f124225d).k(qVar.f124216b.f124225d).k(qVar.f124217c.f124225d).k(qVar.f124218d);
            qVar = qVar.f124220f;
        }
    }

    static q d(q qVar, r rVar, r rVar2) {
        if (qVar == null) {
            return null;
        }
        q qVarD = d(qVar.f124220f, rVar, rVar2);
        qVar.f124220f = qVarD;
        r rVar3 = qVar.f124215a;
        int i11 = rVar3.f124225d;
        r rVar4 = qVar.f124216b;
        int i12 = rVar4.f124225d;
        int i13 = rVar.f124225d;
        int i14 = rVar2 == null ? Integer.MAX_VALUE : rVar2.f124225d;
        if (i13 >= i12 || i14 <= i11) {
            return qVar;
        }
        if (i13 <= i11) {
            return i14 >= i12 ? qVarD : new q(qVar, rVar2, rVar4);
        }
        if (i14 >= i12) {
            return new q(qVar, rVar3, rVar);
        }
        qVar.f124220f = new q(qVar, rVar2, rVar4);
        return new q(qVar, qVar.f124215a, rVar);
    }

    q(q qVar, r rVar, r rVar2) {
        this(rVar, rVar2, qVar.f124217c, qVar.f124218d, qVar.f124219e);
        this.f124220f = qVar.f124220f;
    }
}

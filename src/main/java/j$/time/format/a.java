package j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f82074d;

    public a(y yVar) {
        this.f82074d = yVar;
    }

    @Override // j$.time.format.z
    public final String b(j$.time.chrono.l lVar, j$.time.temporal.p pVar, long j11, e0 e0Var, Locale locale) {
        return this.f82074d.a(j11, e0Var);
    }

    @Override // j$.time.format.z
    public final String c(j$.time.temporal.p pVar, long j11, e0 e0Var, Locale locale) {
        return this.f82074d.a(j11, e0Var);
    }

    @Override // j$.time.format.z
    public final Iterator d(j$.time.chrono.l lVar, j$.time.temporal.p pVar, e0 e0Var, Locale locale) {
        List list = (List) ((HashMap) this.f82074d.f82158b).get(e0Var);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    @Override // j$.time.format.z
    public final Iterator e(j$.time.temporal.p pVar, e0 e0Var, Locale locale) {
        List list = (List) ((HashMap) this.f82074d.f82158b).get(e0Var);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}

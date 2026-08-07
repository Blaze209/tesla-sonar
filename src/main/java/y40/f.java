package y40;

import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements d.InterfaceC2702d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f124949a;

    f(e eVar) {
        this.f124949a = eVar;
    }

    public static i<d.InterfaceC2702d> b(e eVar) {
        return qj0.f.a(new f(eVar));
    }

    @Override // y40.d.InterfaceC2702d
    public d a(InstitutionPickerState institutionPickerState) {
        return this.f124949a.b(institutionPickerState);
    }
}

package o40;

import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f96677a;

    f(e eVar) {
        this.f96677a = eVar;
    }

    public static i<d.b> b(e eVar) {
        return qj0.f.a(new f(eVar));
    }

    @Override // o40.d.b
    public d a(AccountPickerState accountPickerState) {
        return this.f96677a.b(accountPickerState);
    }
}

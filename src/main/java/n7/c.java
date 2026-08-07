package n7;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import p013kotlin.Metadata;
import p020r2.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"n7/d", "n7/e"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class c {
    public static final <VM extends c1> VM a(f1 f1Var, co0.d<VM> dVar, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        return (VM) d.a(f1Var, dVar, str, factory, creationExtras);
    }

    public static final <VM extends c1> VM b(co0.d<VM> dVar, f1 f1Var, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, l lVar, int i11, int i12) {
        return (VM) d.b(dVar, f1Var, str, factory, creationExtras, lVar, i11, i12);
    }

    public static final <VM extends c1> VM c(Class<VM> cls, f1 f1Var, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, l lVar, int i11, int i12) {
        return (VM) e.a(cls, f1Var, str, factory, creationExtras, lVar, i11, i12);
    }
}

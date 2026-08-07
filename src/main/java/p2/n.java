package p2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p019p1.f0;
import p019p1.g0;
import p019p1.l1;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lp2/d;", "Lp1/g0;", "", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
public final class n extends u implements q<l1.b<d>, p020r2.l, Integer, g0<Float>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f100862c = new n();

    public n() {
        super(3);
    }

    public final g0<Float> a(l1.b<d> bVar, p020r2.l lVar, int i11) {
        g0<Float> g0VarK;
        lVar.o(-1154662212);
        if (p020r2.o.J()) {
            p020r2.o.S(-1154662212, i11, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:367)");
        }
        d dVar = d.Focused;
        d dVar2 = d.UnfocusedEmpty;
        if (bVar.b(dVar, dVar2)) {
            g0VarK = p019p1.j.l(67, 0, f0.d(), 2, null);
        } else {
            g0VarK = (bVar.b(dVar2, dVar) || bVar.b(d.UnfocusedNotEmpty, dVar2)) ? p019p1.j.k(83, 67, f0.d()) : p019p1.j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return g0VarK;
    }

    @Override // wn0.q
    public /* bridge */ /* synthetic */ g0<Float> invoke(l1.b<d> bVar, p020r2.l lVar, Integer num) {
        return a(bVar, lVar, num.intValue());
    }
}

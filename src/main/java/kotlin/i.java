package kotlin;

import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lr2/l;I)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
public final class i extends u implements p<l, Integer, String> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ k0 f15597c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k0 k0Var) {
        super(2);
        this.f15597c = k0Var;
    }

    public final String a(l lVar, int i11) {
        lVar.o(-1451087197);
        if (o.J()) {
            o.S(-1451087197, i11, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:98)");
        }
        String strResolvedString = this.f15597c.resolvedString(lVar, 0);
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return strResolvedString;
    }

    @Override // wn0.p
    public /* bridge */ /* synthetic */ String invoke(l lVar, Integer num) {
        return a(lVar, num.intValue());
    }
}

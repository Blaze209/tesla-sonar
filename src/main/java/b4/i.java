package b4;

import com.google.android.gms.common.internal.ImagesContract;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Lb4/h;", "Lr2/u;", ImagesContract.LOCAL, "a", "(Lb4/h;Lr2/u;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {
    public static final <T> T a(h hVar, p020r2.u<T> uVar) {
        if (!hVar.getNode().getIsAttached()) {
            y3.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) k.m(hVar).getCompositionLocalMap().b(uVar);
    }
}

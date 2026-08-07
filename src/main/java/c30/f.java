package c30;

import a30.j0;
import a30.k0;
import a30.n;
import android.view.View;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroid/view/View;", "", "b", "(Landroid/view/View;)Ljava/lang/String;", "getNamedKey$annotations", "(Landroid/view/View;)V", "namedKey", "wf1-container-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(View view) {
        j0<?> j0VarD = k0.d(view);
        Object objC = j0VarD == null ? null : j0VarD.c();
        n nVar = objC == null ? null : (n) objC;
        String compatibilityKey = nVar != null ? nVar.getCompatibilityKey() : null;
        if (compatibilityKey != null) {
            return compatibilityKey;
        }
        throw new IllegalStateException(("Expected " + view + " to be showing a " + ((Object) n.class.getSimpleName()) + "<*> rendering, found " + nVar).toString());
    }
}

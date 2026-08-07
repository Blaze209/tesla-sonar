package gh0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgh0/d;", "Lgh0/f;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/android/play/core/integrity/a;", "a", "(Landroid/content/Context;)Lcom/google/android/play/core/integrity/a;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements f {
    @Override // gh0.f
    public com.google.android.play.core.integrity.a a(Context context) {
        s.k(context, "context");
        com.google.android.play.core.integrity.a aVarA = zt.a.a(context);
        s.j(aVarA, "createStandard(...)");
        return aVarA;
    }
}

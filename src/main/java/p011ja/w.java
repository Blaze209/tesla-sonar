package p011ja;

import android.content.Context;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelStore;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lja/w;", "Lja/n;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "q0", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "r0", "(Landroidx/lifecycle/ViewModelStore;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class w extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context) {
        super(context);
        s.k(context, "context");
    }

    @Override // p011ja.n
    public final void q0(LifecycleOwner owner) {
        s.k(owner, "owner");
        super.q0(owner);
    }

    @Override // p011ja.n
    public final void r0(ViewModelStore viewModelStore) {
        s.k(viewModelStore, "viewModelStore");
        super.r0(viewModelStore);
    }
}

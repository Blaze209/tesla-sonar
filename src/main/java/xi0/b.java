package xi0;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oi0.e0;
import oi0.n5;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lxi0/b;", "Landroid/view/View;", "Lxi0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "", "", "componentParams", "", "triggeringComponentIsHidden", "Ljn0/h0;", "a", "(Ljava/util/Map;Z)V", "", "Ljava/lang/ref/WeakReference;", "Loi0/n5;", "Ljava/util/List;", "getAssociatedComponents", "()Ljava/util/List;", "associatedComponents", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends View implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<WeakReference<n5>> associatedComponents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        s.k(context, "context");
        this.associatedComponents = new ArrayList();
    }

    @Override // xi0.a
    public void a(Map<String, ? extends Object> componentParams, boolean triggeringComponentIsHidden) {
        boolean zBooleanValue;
        Boolean value;
        s.k(componentParams, "componentParams");
        if (triggeringComponentIsHidden) {
            setVisibility(8);
            return;
        }
        Iterator<T> it = this.associatedComponents.iterator();
        loop0: while (true) {
            zBooleanValue = false;
            while (it.hasNext()) {
                n5 n5Var = (n5) ((WeakReference) it.next()).get();
                e0 e0Var = n5Var instanceof e0 ? (e0) n5Var : null;
                JsonLogicBoolean hidden = e0Var != null ? e0Var.getHidden() : null;
                if (hidden != null && (value = hidden.getValue(componentParams, n5Var)) != null) {
                    zBooleanValue = value.booleanValue();
                }
            }
            break loop0;
        }
        setVisibility(zBooleanValue ? 8 : 0);
    }

    public final List<WeakReference<n5>> getAssociatedComponents() {
        return this.associatedComponents;
    }
}

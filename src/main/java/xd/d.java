package xd;

import android.content.Context;
import android.view.LayoutInflater;
import ch.qos.logback.core.CoreConstants;
import kf.f;
import kf.q;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import zd.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxd/d;", "Lkf/q;", "<init>", "()V", "Lkf/f;", "viewType", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkf/e;", "a", "(Lkf/f;Landroid/content/Context;)Lkf/e;", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f123270a = new d();

    private d() {
    }

    @Override // kf.q
    public kf.e a(f viewType, Context context) {
        s.k(viewType, "viewType");
        s.k(context, "context");
        if (viewType == a.INPUT) {
            return new l(context, null, 0, 6, null);
        }
        if (viewType != a.CONFIRMATION) {
            throw new IllegalArgumentException("Unsupported view type");
        }
        return new zd.a(context, null, 0, 6, null);
    }

    @Override // kf.q
    public kf.e b(f fVar, LayoutInflater layoutInflater) {
        return q.a.a(this, fVar, layoutInflater);
    }
}

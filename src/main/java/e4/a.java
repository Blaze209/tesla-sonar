package e4;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import k3.r1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Le4/a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "id", "Lk3/p1;", "a", "(Landroid/content/Context;I)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f61674a = new a();

    private a() {
    }

    public final long a(Context context, int id2) {
        return r1.b(context.getResources().getColor(id2, context.getTheme()));
    }
}

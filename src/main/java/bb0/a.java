package bb0;

import android.app.Notification;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.x;
import nd0.k;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbb0/a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lic0/c;", "commands", "Lkotlin/Pair;", "", "Landroid/app/Notification;", "a", "(Landroid/content/Context;Ljava/util/List;)Lkotlin/Pair;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16947a = new a();

    private a() {
    }

    public final Pair<Integer, Notification> a(Context context, List<ic0.c> commands) {
        s.k(context, "context");
        s.k(commands, "commands");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = commands.iterator();
        while (it.hasNext()) {
            String strA = cb0.d.a((ic0.c) it.next(), context);
            if (strA != null) {
                arrayList.add(strA);
            }
        }
        String strY0 = v.y0(arrayList, ", ", null, null, 0, null, null, 62, null);
        return x.a(998328, k.INSTANCE.b(context).h("phone_key_service_channel").m(context.getString(bc0.a.S) + " " + strY0).B(0, 0, true).A(2).c());
    }
}

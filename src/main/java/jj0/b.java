package jj0;

import android.content.Context;
import androidx.camera.view.i;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import hj0.NotificationData;
import java.util.concurrent.atomic.AtomicReference;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0017\u0010 \u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Ljj0/b;", "", "<init>", "()V", "Ljj0/a;", "notificationDependencies", "Ljn0/h0;", "c", "(Ljj0/a;)V", "Lhj0/f;", "notification", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lhj0/a;", "type", DateTokenConverter.CONVERTER_KEY, "(Lhj0/f;Landroid/content/Context;Lhj0/a;)V", "", "token", "e", "(Landroid/content/Context;Ljava/lang/String;)V", "a", "(Landroid/content/Context;)Ljava/lang/String;", "", "b", "()I", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", ActionConst.REF_ATTRIBUTE, "Ljava/lang/String;", "getJpushAppKey", "()Ljava/lang/String;", "jpushAppKey", "react-native-notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f83920a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AtomicReference<a> ref;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String jpushAppKey;

    static {
        String strD;
        AtomicReference<a> atomicReference = new AtomicReference<>();
        ref = atomicReference;
        a aVar = atomicReference.get();
        if (aVar == null || (strD = aVar.d()) == null) {
            strD = "";
        }
        jpushAppKey = strD;
    }

    private b() {
    }

    public static final String a(Context context) {
        s.k(context, "context");
        return ref.get().a(context);
    }

    public static final int b() {
        return ref.get().b();
    }

    public static final void c(a notificationDependencies) {
        s.k(notificationDependencies, "notificationDependencies");
        i.a(ref, null, notificationDependencies);
    }

    public static final void d(NotificationData notification, Context context, hj0.a type) {
        s.k(notification, "notification");
        s.k(context, "context");
        s.k(type, "type");
        ref.get().e(notification, context, type);
    }

    public static final void e(Context context, String token) {
        s.k(context, "context");
        ref.get().c(context, token);
    }
}

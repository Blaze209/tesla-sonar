package gg0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import jn0.m;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b\"\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "Lgg0/a;", "b", "()Lkotlinx/coroutines/flow/Flow;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)V", "f", "Landroid/content/BroadcastReceiver;", "a", "Lkotlin/Lazy;", "c", "()Landroid/content/BroadcastReceiver;", "threatEventReceiver", "appdome-threatevents_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f68906a = m.b(new wn0.a() { // from class: gg0.b
        @Override // wn0.a
        public final Object invoke() {
            return c.e();
        }
    });

    public static final Flow<ThreatEventState> b() {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.appdomethreatevents.impl.ThreatEventFlow").getConstructor(null).newInstance(null);
            s.i(objNewInstance, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventState>");
            return (StateFlow) objNewInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    private static final BroadcastReceiver c() {
        return (BroadcastReceiver) f68906a.getValue();
    }

    public static final void d(Context context) {
        s.k(context, "context");
        Context applicationContext = context.getApplicationContext();
        BroadcastReceiver broadcastReceiverC = c();
        if (c() == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        Iterator<T> it = ThreatEventState.INSTANCE.a().iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            applicationContext.registerReceiver(broadcastReceiverC, intentFilter, null, null, 4);
        } else {
            applicationContext.registerReceiver(broadcastReceiverC, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BroadcastReceiver e() {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.appdomethreatevents.impl.ThreatEventReceiver").getConstructor(null).newInstance(null);
            s.i(objNewInstance, "null cannot be cast to non-null type android.content.BroadcastReceiver");
            return (BroadcastReceiver) objNewInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void f(Context context) {
        s.k(context, "context");
        Context applicationContext = context.getApplicationContext();
        BroadcastReceiver broadcastReceiverC = c();
        if (c() == null) {
            return;
        }
        try {
            applicationContext.unregisterReceiver(broadcastReceiverC);
        } catch (Exception unused) {
        }
    }
}

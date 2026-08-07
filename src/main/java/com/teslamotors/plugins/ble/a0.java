package com.teslamotors.plugins.ble;

import android.bluetooth.le.ScanResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/teslamotors/plugins/ble/a0;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Intent;", "", "Landroid/bluetooth/le/ScanResult;", "c", "(Landroid/content/Intent;)Ljava/util/List;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, AnalyticsAttribute.Intent, "Ljn0/h0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "b", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.tesla.logging.g f56707b = com.tesla.logging.g.INSTANCE.a("BleScanReceiver");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile List<ScanResult> f56708c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile WeakReference<b> f56709d;

    /* JADX INFO: renamed from: com.teslamotors.plugins.ble.a0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/teslamotors/plugins/ble/a0$a;", "", "<init>", "()V", "Lcom/teslamotors/plugins/ble/a0$b;", "callback", "Ljn0/h0;", "b", "(Lcom/teslamotors/plugins/ble/a0$b;)V", "a", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "", "Landroid/bluetooth/le/ScanResult;", "currentResults", "Ljava/util/List;", "Ljava/lang/ref/WeakReference;", "callbackRef", "Ljava/lang/ref/WeakReference;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            a0.f56709d = null;
        }

        public final void b(b callback) {
            a0.f56709d = new WeakReference(callback);
            if (callback != null) {
                callback.a(a0.f56708c);
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/teslamotors/plugins/ble/a0$b;", "", "", "Landroid/bluetooth/le/ScanResult;", "results", "Ljn0/h0;", "a", "(Ljava/util/List;)V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a(List<ScanResult> results);
    }

    private final List<ScanResult> c(Intent intent) {
        ArrayList arrayListA = androidx.core.content.c.a(intent, "android.bluetooth.le.extra.LIST_SCAN_RESULT", ScanResult.class);
        return arrayListA != null ? arrayListA : p013kotlin.collections.v.m();
    }

    public static final void d() {
        INSTANCE.a();
    }

    public static final void e(b bVar) {
        INSTANCE.b(bVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        WeakReference<b> weakReference;
        b bVar;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(intent, "intent");
        List<ScanResult> listC = c(intent);
        f56707b.j("Received system scan result intent, size: " + listC.size());
        f56708c = listC;
        if (f56708c.isEmpty() || (weakReference = f56709d) == null || (bVar = weakReference.get()) == null) {
            return;
        }
        bVar.a(listC);
    }
}

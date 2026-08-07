package j20;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import h20.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import k20.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lj20/a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "namespace", "Lk20/e;", "network", "", "Lk20/a;", "configurations", "Ll20/a;", "a", "(Landroid/content/Context;Ljava/lang/String;Lk20/e;[Lk20/a;)Ll20/a;", "Lh20/j;", "serviceProvider", "", "b", "(Lh20/j;)Z", "Lh20/j;", "defaultServiceProvider", "", "c", "Ljava/util/Map;", "serviceProviderInstances", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static j defaultServiceProvider;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f82428a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<String, j> serviceProviderInstances = new HashMap();

    private a() {
    }

    public static final l20.a a(Context context, String namespace, e network, k20.a... configurations) {
        s.k(context, "context");
        s.k(namespace, "namespace");
        s.k(network, "network");
        s.k(configurations, "configurations");
        j jVar = serviceProviderInstances.get(namespace);
        if (jVar != null) {
            ArrayList arrayList = new ArrayList(v.p(Arrays.copyOf(configurations, configurations.length)));
            arrayList.add(network);
            jVar.s(arrayList);
        } else {
            jVar = new j(context, namespace, network, v.p(Arrays.copyOf(configurations, configurations.length)));
            b(jVar);
        }
        return jVar.i();
    }

    private static final synchronized boolean b(j serviceProvider) {
        boolean z11;
        z11 = serviceProviderInstances.put(serviceProvider.getNamespace(), serviceProvider) != null;
        if (defaultServiceProvider == null) {
            defaultServiceProvider = serviceProvider;
        }
        return z11;
    }
}

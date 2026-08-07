package d6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\bJ'\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR*\u0010!\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R.\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00068G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010%R.\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00068G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010%¨\u0006+"}, d2 = {"Ld6/q;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ld6/p;", "g", "()Ld6/p;", "f", "", "", "classNames", "e", "(Ljava/util/List;Landroid/content/Context;)Ld6/p;", "a", "(Landroid/content/Context;)Ljava/util/List;", "request", "", "shouldFallbackToPreU", "b", "(Ljava/lang/Object;Z)Ld6/p;", "c", "(Z)Ld6/p;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<set-?>", "Z", "getTestMode", "()Z", "setTestMode", "(Z)V", "testMode", "Ld6/p;", "getTestPostUProvider", "setTestPostUProvider", "(Ld6/p;)V", "testPostUProvider", DateTokenConverter.CONVERTER_KEY, "getTestPreUProvider", "setTestPreUProvider", "testPreUProvider", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean testMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private p testPostUProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p testPreUProvider;

    public q(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
    }

    private final List<String> a(Context context) throws PackageManager.NameNotFoundException {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            p013kotlin.jvm.internal.s.h(serviceInfoArr);
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        return p013kotlin.collections.v.m1(arrayList);
    }

    public static /* synthetic */ p d(q qVar, Object obj, boolean z11, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return qVar.b(obj, z11);
    }

    private final p e(List<String> classNames, Context context) {
        Iterator<String> it = classNames.iterator();
        p pVar = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName(it.next()).getConstructor(Context.class).newInstance(context);
                p013kotlin.jvm.internal.s.i(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                p pVar2 = (p) objNewInstance;
                if (!pVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (pVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    pVar = pVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return pVar;
    }

    private final p f() {
        if (!this.testMode) {
            w wVar = new w(this.context);
            if (wVar.isAvailableOnDevice()) {
                return wVar;
            }
            return null;
        }
        p pVar = this.testPostUProvider;
        if (pVar == null) {
            return null;
        }
        p013kotlin.jvm.internal.s.h(pVar);
        if (pVar.isAvailableOnDevice()) {
            return this.testPostUProvider;
        }
        return null;
    }

    private final p g() throws PackageManager.NameNotFoundException {
        if (!this.testMode) {
            List<String> listA = a(this.context);
            if (listA.isEmpty()) {
                return null;
            }
            return e(listA, this.context);
        }
        p pVar = this.testPreUProvider;
        if (pVar == null) {
            return null;
        }
        p013kotlin.jvm.internal.s.h(pVar);
        if (pVar.isAvailableOnDevice()) {
            return this.testPreUProvider;
        }
        return null;
    }

    public final p b(Object request, boolean shouldFallbackToPreU) {
        p013kotlin.jvm.internal.s.k(request, "request");
        if ((request instanceof h) || p013kotlin.jvm.internal.s.f(request, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return g();
        }
        if (request instanceof b0) {
            for (o oVar : ((b0) request).a()) {
                if ((oVar instanceof g0) || (oVar instanceof e0)) {
                    return g();
                }
            }
        }
        return c(shouldFallbackToPreU);
    }

    public final p c(boolean shouldFallbackToPreU) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            p pVarF = f();
            return (pVarF == null && shouldFallbackToPreU) ? g() : pVarF;
        }
        if (i11 <= 33) {
            return g();
        }
        return null;
    }
}

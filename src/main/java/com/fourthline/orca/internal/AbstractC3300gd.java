package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.eid.EidServiceProvider;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3300gd {
    public static final boolean a(Context context) {
        Object objB;
        p013kotlin.jvm.internal.s.k(context, "<this>");
        try {
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                Object objNewInstance = Class.forName("com.fourthline.eid.RealEidServiceProvider").getConstructor(Context.class, CoroutineScope.class).newInstance(context, CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate()));
                p013kotlin.jvm.internal.s.i(objNewInstance, "null cannot be cast to non-null type com.fourthline.core.eid.EidServiceProvider");
                objB = jn0.s.b(Boolean.valueOf(((EidServiceProvider) objNewInstance).isAvailable()));
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            Boolean bool = Boolean.FALSE;
            if (jn0.s.g(objB)) {
                objB = bool;
            }
            return ((Boolean) objB).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }
}

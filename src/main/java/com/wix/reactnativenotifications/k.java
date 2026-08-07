package com.wix.reactnativenotifications;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.i0;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.wix.reactnativenotifications.fcm.FcmInstanceIdRefreshHandlerService;
import ezvcard.property.Kind;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J-\u0010%\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020#\u0012\b\u0012\u0006\u0012\u0002\b\u00030$0\"0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010!¨\u0006&"}, d2 = {"Lcom/wix/reactnativenotifications/k;", "Lcom/facebook/react/p0;", "<init>", "()V", "Landroid/app/Application;", Kind.APPLICATION, "Ljn0/h0;", "h", "(Landroid/app/Application;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "k", "(Landroid/content/Context;)V", "", "extraFlag", "r", "(Landroid/content/Context;Ljava/lang/String;)V", "", IntegerTokenConverter.CONVERTER_KEY, "()Z", "isAllowed", "s", "(Z)V", "j", "(Landroid/content/Context;)Z", "Lcom/facebook/react/bridge/WritableMap;", "g", "(Landroid/content/Context;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "Lcom/facebook/react/uimanager/ViewManager;", "Landroid/view/View;", "Lcom/facebook/react/uimanager/i0;", "createViewManagers", "react-native-notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f58819a = new k();

    private k() {
    }

    public static final WritableMap g(Context context) {
        s.k(context, "context");
        return null;
    }

    public static final void h(Application application) {
        s.k(application, "application");
        com.google.firebase.f.q(application.getApplicationContext());
    }

    public static final boolean i() {
        return true;
    }

    public static final boolean j(Context context) {
        s.k(context, "context");
        return false;
    }

    public static final void k(Context context) {
        s.k(context, "context");
        Task<Void> taskJ = com.google.firebase.installations.c.s().j();
        final l lVar = new l() { // from class: com.wix.reactnativenotifications.e
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return k.l((Void) obj);
            }
        };
        taskJ.addOnSuccessListener(new OnSuccessListener() { // from class: com.wix.reactnativenotifications.f
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                k.m(lVar, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.wix.reactnativenotifications.g
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                k.n(exc);
            }
        });
        Task<Void> taskN = FirebaseMessaging.q().n();
        final l lVar2 = new l() { // from class: com.wix.reactnativenotifications.h
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return k.o((Void) obj);
            }
        };
        taskN.addOnSuccessListener(new OnSuccessListener() { // from class: com.wix.reactnativenotifications.i
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                k.p(lVar2, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.wix.reactnativenotifications.j
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                k.q(exc);
            }
        });
        kj0.b.e(context).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(Void r11) {
        c.a("ReactNativeNotifs", "[FCM] Installations revocation success");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Exception it) {
        s.k(it, "it");
        c.a("ReactNativeNotifs", "[FCM] Installations revocation failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 o(Void r11) {
        c.a("ReactNativeNotifs", "[FCM] Token revocation success");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Exception it) {
        s.k(it, "it");
        c.a("ReactNativeNotifs", "[FCM] Token revocation failed");
    }

    public static final void r(Context context, String extraFlag) {
        s.k(context, "context");
        s.k(extraFlag, "extraFlag");
        Intent intent = new Intent(context, (Class<?>) FcmInstanceIdRefreshHandlerService.class);
        intent.putExtra(extraFlag, true);
        FcmInstanceIdRefreshHandlerService.j(context, intent);
    }

    public static final void s(boolean isAllowed) {
    }

    @Override // com.facebook.react.p0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        return v.m();
    }

    @Override // com.facebook.react.p0
    public List<ViewManager<View, i0<?>>> createViewManagers(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        return v.m();
    }
}

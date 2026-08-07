package com.tesla.TeslaV4.reactnative.module;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/ProfileBackupNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", "result", "Ljn0/h0;", "rewrapVault", "(Lcom/facebook/react/bridge/Promise;)V", "Lsd0/a;", "profileBackupService$delegate", "Lkotlin/Lazy;", "getProfileBackupService", "()Lsd0/a;", "profileBackupService", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProfileBackupNativeModule extends ReactContextBaseJavaModule {

    /* JADX INFO: renamed from: profileBackupService$delegate, reason: from kotlin metadata */
    private final Lazy profileBackupService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileBackupNativeModule(ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.profileBackupService = jn0.m.b(new wn0.a() { // from class: com.tesla.TeslaV4.reactnative.module.f0
            @Override // wn0.a
            public final Object invoke() {
                return ProfileBackupNativeModule.profileBackupService_delegate$lambda$0(this.f55690a);
            }
        });
    }

    private final sd0.a getProfileBackupService() {
        return (sd0.a) this.profileBackupService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sd0.a profileBackupService_delegate$lambda$0(ProfileBackupNativeModule profileBackupNativeModule) {
        sd0.a.Companion companion = sd0.a.INSTANCE;
        Context applicationContext = profileBackupNativeModule.getReactApplicationContext().getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        return companion.a(applicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ProfileBackupModule";
    }

    @ReactMethod
    public final void rewrapVault(Promise result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        getProfileBackupService().f();
    }
}

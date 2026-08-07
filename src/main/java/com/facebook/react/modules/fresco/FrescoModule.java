package com.facebook.react.modules.fresco;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.h;
import com.facebook.react.modules.network.i;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import el.b;
import go.c;
import go.d;
import java.util.HashSet;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import pm.n;
import pm.t;
import pm.u;
import xn.a;

/* JADX INFO: loaded from: classes3.dex */
@a(name = FrescoModule.NAME, needsEagerInit = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001$B)\b\u0007\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/fresco/FrescoModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "clearOnDestroy", "Lpm/u;", "imagePipelineConfig", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;ZLpm/u;)V", "Lpm/t;", "imagePipeline", "hasBeenInitializedExternally", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lpm/t;ZZ)V", "Ljn0/h0;", "initialize", "()V", "", "getName", "()Ljava/lang/String;", "clearSensitiveData", "onHostResume", "onHostPause", "onHostDestroy", "invalidate", "Z", "config", "Lpm/u;", "pipeline", "Lpm/t;", "getImagePipeline", "()Lpm/t;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, TurboModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String NAME = "FrescoModule";
    private static boolean hasBeenInitialized;
    private final boolean clearOnDestroy;
    private u config;
    private t pipeline;

    /* JADX INFO: renamed from: com.facebook.react.modules.fresco.FrescoModule$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/fresco/FrescoModule$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpm/u;", "b", "(Lcom/facebook/react/bridge/ReactContext;)Lpm/u;", "", DateTokenConverter.CONVERTER_KEY, "()Z", "Lpm/u$a;", "c", "(Lcom/facebook/react/bridge/ReactContext;)Lpm/u$a;", "", "NAME", "Ljava/lang/String;", "hasBeenInitialized", "Z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final u b(ReactContext context) {
            return c(context).a();
        }

        public final u.a c(ReactContext context) {
            s.k(context, "context");
            HashSet hashSet = new HashSet();
            hashSet.add(new d());
            OkHttpClient okHttpClientA = h.a();
            i.a(okHttpClientA).b(new JavaNetCookieJar(new com.facebook.react.modules.network.d()));
            Context applicationContext = context.getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            u.a aVarT = lm.a.a(applicationContext, okHttpClientA).S(new c(okHttpClientA)).R(n.AUTO).T(hashSet);
            aVarT.getExperimentsBuilder().d(true);
            return aVarT;
        }

        public final boolean d() {
            return FrescoModule.hasBeenInitialized;
        }

        private Companion() {
        }
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, false, null, 6, null);
    }

    public static final u.a getDefaultConfigBuilder(ReactContext reactContext) {
        return INSTANCE.c(reactContext);
    }

    private final t getImagePipeline() {
        if (this.pipeline == null) {
            this.pipeline = el.d.a();
        }
        return this.pipeline;
    }

    public static final boolean hasBeenInitialized() {
        return INSTANCE.d();
    }

    public void clearSensitiveData() {
        t imagePipeline = getImagePipeline();
        if (imagePipeline != null) {
            imagePipeline.c();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.addLifecycleEventListener(this);
        Companion companion = INSTANCE;
        if (!companion.d()) {
            u uVarB = this.config;
            if (uVarB == null) {
                s.h(reactApplicationContext);
                uVarB = companion.b(reactApplicationContext);
            }
            b.a aVarE = b.e();
            s.j(aVarE, "newBuilder(...)");
            el.d.c(reactApplicationContext.getApplicationContext(), uVarB, aVarE.e());
            hasBeenInitialized = true;
        } else if (this.config != null) {
            qk.a.I("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.config = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        t imagePipeline;
        if (INSTANCE.d() && this.clearOnDestroy && (imagePipeline = getImagePipeline()) != null) {
            imagePipeline.e();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, t tVar) {
        this(reactApplicationContext, tVar, false, false, 12, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, t tVar, boolean z11) {
        this(reactApplicationContext, tVar, z11, false, 8, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z11) {
        this(reactApplicationContext, z11, null, 4, null);
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, boolean z11, u uVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? null : uVar);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z11, u uVar) {
        super(reactApplicationContext);
        this.clearOnDestroy = z11;
        this.config = uVar;
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, t tVar, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, tVar, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? false : z12);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, t tVar, boolean z11, boolean z12) {
        this(reactApplicationContext, z11, null, 4, null);
        this.pipeline = tVar;
        if (z12) {
            hasBeenInitialized = true;
        }
    }
}

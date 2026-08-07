package tn;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsCxxInterop;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0003\b\u0087\u0001\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u0010\u0006J\u000f\u00100\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\u0006R\u0018\u00104\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0018\u00108\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00103R\u0018\u0010:\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00103R\u0018\u0010<\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00103R\u0018\u0010>\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00103R\u0018\u0010@\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00103R\u0018\u0010B\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00103R\u0018\u0010D\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00103R\u0018\u0010F\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00103R\u0018\u0010H\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00103R\u0018\u0010J\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00103R\u0018\u0010L\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00103R\u0018\u0010N\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00103R\u0018\u0010P\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00103R\u0018\u0010R\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u00103R\u0018\u0010T\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u00103R\u0018\u0010V\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u00103R\u0018\u0010X\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u00103R\u0018\u0010Z\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00103R\u0018\u0010\\\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00103R\u0018\u0010^\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u00103R\u0018\u0010`\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u00103R\u0018\u0010b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u00103R\u0018\u0010d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u00103R\u0018\u0010f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u00103R\u0018\u0010h\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u00103R\u0018\u0010j\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u00103R\u0018\u0010l\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u00103R\u0018\u0010n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u00103R\u0018\u0010p\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u00103R\u0018\u0010r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u00103R\u0018\u0010t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u00103R\u0018\u0010v\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u00103R\u0018\u0010x\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u00103R\u0018\u0010z\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u00103R\u0018\u0010|\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u00103R\u0018\u0010~\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u00103R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u00103R\u001a\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u00103R\u001a\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u00103R\u001a\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u00103R\u001a\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u00103R\u001a\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u00103¨\u0006\u008b\u0001"}, d2 = {"Ltn/d;", "Ltn/c;", "<init>", "()V", "", "commonTestFlag", "()Z", "disableMountItemReorderingAndroid", "enableAccumulatedUpdatesInRawPropsAndroid", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableEagerRootViewAttachment", "enableFabricLogs", "enableFabricRenderer", "enableIOSViewClipToPaddingBox", "enableImagePrefetchingAndroid", "enableJSRuntimeGCOnMemoryPressureOnIOS", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableLongTaskAPI", "enableNativeCSSParsing", "enableNewBackgroundAndBorderDrawables", "enablePreciseSchedulingForPremountItemsOnAndroid", "enablePropsUpdateReconciliationAndroid", "enableReportEventPaintTime", "enableSynchronousStateUpdates", "enableUIConsistency", "enableViewCulling", "enableViewRecycling", "enableViewRecyclingForText", "enableViewRecyclingForView", "excludeYogaFromRawProps", "fixDifferentiatorEmittingUpdatesWithWrongParentTag", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fixMountingCoordinatorReportedPendingTransactionsOnAndroid", "fuseboxEnabledRelease", "fuseboxNetworkInspectionEnabled", "lazyAnimationCallbacks", "removeTurboModuleManagerDelegateMutex", "throwExceptionInsteadOfDeadlockOnTurboModuleSetupDuringSyncRenderIOS", "traceTurboModulePromiseRejectionsOnAndroid", "updateRuntimeShadowNodeReferencesOnCommit", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useNativeViewConfigsInBridgelessMode", "useOptimizedEventBatchingOnAndroid", "useRawPropsJsiValue", "useShadowNodeStateOnClone", "useTurboModuleInterop", "useTurboModules", "a", "Ljava/lang/Boolean;", "commonTestFlagCache", "b", "disableMountItemReorderingAndroidCache", "c", "enableAccumulatedUpdatesInRawPropsAndroidCache", DateTokenConverter.CONVERTER_KEY, "enableBridgelessArchitectureCache", "e", "enableCppPropsIteratorSetterCache", "f", "enableEagerRootViewAttachmentCache", "g", "enableFabricLogsCache", "h", "enableFabricRendererCache", IntegerTokenConverter.CONVERTER_KEY, "enableIOSViewClipToPaddingBoxCache", "j", "enableImagePrefetchingAndroidCache", "k", "enableJSRuntimeGCOnMemoryPressureOnIOSCache", "l", "enableLayoutAnimationsOnAndroidCache", "m", "enableLayoutAnimationsOnIOSCache", "n", "enableLongTaskAPICache", "o", "enableNativeCSSParsingCache", "p", "enableNewBackgroundAndBorderDrawablesCache", "q", "enablePreciseSchedulingForPremountItemsOnAndroidCache", "r", "enablePropsUpdateReconciliationAndroidCache", "s", "enableReportEventPaintTimeCache", "t", "enableSynchronousStateUpdatesCache", "u", "enableUIConsistencyCache", "v", "enableViewCullingCache", "w", "enableViewRecyclingCache", "x", "enableViewRecyclingForTextCache", "y", "enableViewRecyclingForViewCache", "z", "excludeYogaFromRawPropsCache", "A", "fixDifferentiatorEmittingUpdatesWithWrongParentTagCache", "B", "fixMappingOfEventPrioritiesBetweenFabricAndReactCache", "C", "fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache", "D", "fuseboxEnabledReleaseCache", "E", "fuseboxNetworkInspectionEnabledCache", Gender.FEMALE, "lazyAnimationCallbacksCache", "G", "removeTurboModuleManagerDelegateMutexCache", "H", "throwExceptionInsteadOfDeadlockOnTurboModuleSetupDuringSyncRenderIOSCache", "I", "traceTurboModulePromiseRejectionsOnAndroidCache", "J", "updateRuntimeShadowNodeReferencesOnCommitCache", "K", "useAlwaysAvailableJSErrorHandlingCache", "L", "useFabricInteropCache", Gender.MALE, "useNativeViewConfigsInBridgelessModeCache", Gender.NONE, "useOptimizedEventBatchingOnAndroidCache", Gender.OTHER, "useRawPropsJsiValueCache", "P", "useShadowNodeStateOnCloneCache", "Q", "useTurboModuleInteropCache", "R", "useTurboModulesCache", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Boolean fixDifferentiatorEmittingUpdatesWithWrongParentTagCache;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private Boolean fixMappingOfEventPrioritiesBetweenFabricAndReactCache;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private Boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private Boolean fuseboxEnabledReleaseCache;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private Boolean fuseboxNetworkInspectionEnabledCache;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Boolean lazyAnimationCallbacksCache;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private Boolean removeTurboModuleManagerDelegateMutexCache;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private Boolean throwExceptionInsteadOfDeadlockOnTurboModuleSetupDuringSyncRenderIOSCache;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private Boolean traceTurboModulePromiseRejectionsOnAndroidCache;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private Boolean updateRuntimeShadowNodeReferencesOnCommitCache;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private Boolean useAlwaysAvailableJSErrorHandlingCache;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private Boolean useFabricInteropCache;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private Boolean useNativeViewConfigsInBridgelessModeCache;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private Boolean useOptimizedEventBatchingOnAndroidCache;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private Boolean useRawPropsJsiValueCache;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private Boolean useShadowNodeStateOnCloneCache;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private Boolean useTurboModuleInteropCache;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private Boolean useTurboModulesCache;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Boolean commonTestFlagCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Boolean disableMountItemReorderingAndroidCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Boolean enableAccumulatedUpdatesInRawPropsAndroidCache;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Boolean enableBridgelessArchitectureCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Boolean enableCppPropsIteratorSetterCache;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Boolean enableEagerRootViewAttachmentCache;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Boolean enableFabricLogsCache;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Boolean enableFabricRendererCache;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Boolean enableIOSViewClipToPaddingBoxCache;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Boolean enableImagePrefetchingAndroidCache;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Boolean enableJSRuntimeGCOnMemoryPressureOnIOSCache;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Boolean enableLayoutAnimationsOnAndroidCache;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Boolean enableLayoutAnimationsOnIOSCache;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Boolean enableLongTaskAPICache;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Boolean enableNativeCSSParsingCache;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Boolean enableNewBackgroundAndBorderDrawablesCache;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Boolean enablePreciseSchedulingForPremountItemsOnAndroidCache;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Boolean enablePropsUpdateReconciliationAndroidCache;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Boolean enableReportEventPaintTimeCache;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Boolean enableSynchronousStateUpdatesCache;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Boolean enableUIConsistencyCache;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Boolean enableViewCullingCache;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Boolean enableViewRecyclingCache;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private Boolean enableViewRecyclingForTextCache;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private Boolean enableViewRecyclingForViewCache;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Boolean excludeYogaFromRawPropsCache;

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean commonTestFlag() {
        Boolean boolValueOf = this.commonTestFlagCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.commonTestFlag());
            this.commonTestFlagCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean disableMountItemReorderingAndroid() {
        Boolean boolValueOf = this.disableMountItemReorderingAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.disableMountItemReorderingAndroid());
            this.disableMountItemReorderingAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableAccumulatedUpdatesInRawPropsAndroid() {
        Boolean boolValueOf = this.enableAccumulatedUpdatesInRawPropsAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableAccumulatedUpdatesInRawPropsAndroid());
            this.enableAccumulatedUpdatesInRawPropsAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableBridgelessArchitecture() {
        Boolean boolValueOf = this.enableBridgelessArchitectureCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableBridgelessArchitecture());
            this.enableBridgelessArchitectureCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableCppPropsIteratorSetter() {
        Boolean boolValueOf = this.enableCppPropsIteratorSetterCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableCppPropsIteratorSetter());
            this.enableCppPropsIteratorSetterCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableEagerRootViewAttachment() {
        Boolean boolValueOf = this.enableEagerRootViewAttachmentCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableEagerRootViewAttachment());
            this.enableEagerRootViewAttachmentCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricLogs() {
        Boolean boolValueOf = this.enableFabricLogsCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricLogs());
            this.enableFabricLogsCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableFabricRenderer() {
        Boolean boolValueOf = this.enableFabricRendererCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableFabricRenderer());
            this.enableFabricRendererCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableIOSViewClipToPaddingBox() {
        Boolean boolValueOf = this.enableIOSViewClipToPaddingBoxCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableIOSViewClipToPaddingBox());
            this.enableIOSViewClipToPaddingBoxCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableImagePrefetchingAndroid() {
        Boolean boolValueOf = this.enableImagePrefetchingAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableImagePrefetchingAndroid());
            this.enableImagePrefetchingAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableJSRuntimeGCOnMemoryPressureOnIOS() {
        Boolean boolValueOf = this.enableJSRuntimeGCOnMemoryPressureOnIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableJSRuntimeGCOnMemoryPressureOnIOS());
            this.enableJSRuntimeGCOnMemoryPressureOnIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnAndroid() {
        Boolean boolValueOf = this.enableLayoutAnimationsOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLayoutAnimationsOnAndroid());
            this.enableLayoutAnimationsOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLayoutAnimationsOnIOS() {
        Boolean boolValueOf = this.enableLayoutAnimationsOnIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLayoutAnimationsOnIOS());
            this.enableLayoutAnimationsOnIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableLongTaskAPI() {
        Boolean boolValueOf = this.enableLongTaskAPICache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableLongTaskAPI());
            this.enableLongTaskAPICache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNativeCSSParsing() {
        Boolean boolValueOf = this.enableNativeCSSParsingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableNativeCSSParsing());
            this.enableNativeCSSParsingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableNewBackgroundAndBorderDrawables() {
        Boolean boolValueOf = this.enableNewBackgroundAndBorderDrawablesCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableNewBackgroundAndBorderDrawables());
            this.enableNewBackgroundAndBorderDrawablesCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePreciseSchedulingForPremountItemsOnAndroid() {
        Boolean boolValueOf = this.enablePreciseSchedulingForPremountItemsOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enablePreciseSchedulingForPremountItemsOnAndroid());
            this.enablePreciseSchedulingForPremountItemsOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enablePropsUpdateReconciliationAndroid() {
        Boolean boolValueOf = this.enablePropsUpdateReconciliationAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enablePropsUpdateReconciliationAndroid());
            this.enablePropsUpdateReconciliationAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableReportEventPaintTime() {
        Boolean boolValueOf = this.enableReportEventPaintTimeCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableReportEventPaintTime());
            this.enableReportEventPaintTimeCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableSynchronousStateUpdates() {
        Boolean boolValueOf = this.enableSynchronousStateUpdatesCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableSynchronousStateUpdates());
            this.enableSynchronousStateUpdatesCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableUIConsistency() {
        Boolean boolValueOf = this.enableUIConsistencyCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableUIConsistency());
            this.enableUIConsistencyCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewCulling() {
        Boolean boolValueOf = this.enableViewCullingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewCulling());
            this.enableViewCullingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecycling() {
        Boolean boolValueOf = this.enableViewRecyclingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecycling());
            this.enableViewRecyclingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForText() {
        Boolean boolValueOf = this.enableViewRecyclingForTextCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecyclingForText());
            this.enableViewRecyclingForTextCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean enableViewRecyclingForView() {
        Boolean boolValueOf = this.enableViewRecyclingForViewCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.enableViewRecyclingForView());
            this.enableViewRecyclingForViewCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean excludeYogaFromRawProps() {
        Boolean boolValueOf = this.excludeYogaFromRawPropsCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.excludeYogaFromRawProps());
            this.excludeYogaFromRawPropsCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixDifferentiatorEmittingUpdatesWithWrongParentTag() {
        Boolean boolValueOf = this.fixDifferentiatorEmittingUpdatesWithWrongParentTagCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixDifferentiatorEmittingUpdatesWithWrongParentTag());
            this.fixDifferentiatorEmittingUpdatesWithWrongParentTagCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMappingOfEventPrioritiesBetweenFabricAndReact() {
        Boolean boolValueOf = this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMappingOfEventPrioritiesBetweenFabricAndReact());
            this.fixMappingOfEventPrioritiesBetweenFabricAndReactCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid() {
        Boolean boolValueOf = this.fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fixMountingCoordinatorReportedPendingTransactionsOnAndroid());
            this.fixMountingCoordinatorReportedPendingTransactionsOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxEnabledRelease() {
        Boolean boolValueOf = this.fuseboxEnabledReleaseCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxEnabledRelease());
            this.fuseboxEnabledReleaseCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean fuseboxNetworkInspectionEnabled() {
        Boolean boolValueOf = this.fuseboxNetworkInspectionEnabledCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.fuseboxNetworkInspectionEnabled());
            this.fuseboxNetworkInspectionEnabledCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean lazyAnimationCallbacks() {
        Boolean boolValueOf = this.lazyAnimationCallbacksCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.lazyAnimationCallbacks());
            this.lazyAnimationCallbacksCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean removeTurboModuleManagerDelegateMutex() {
        Boolean boolValueOf = this.removeTurboModuleManagerDelegateMutexCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.removeTurboModuleManagerDelegateMutex());
            this.removeTurboModuleManagerDelegateMutexCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean throwExceptionInsteadOfDeadlockOnTurboModuleSetupDuringSyncRenderIOS() {
        Boolean boolValueOf = this.throwExceptionInsteadOfDeadlockOnTurboModuleSetupDuringSyncRenderIOSCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.throwExceptionInsteadOfDeadlockOnTurboModuleSetupDuringSyncRenderIOS());
            this.throwExceptionInsteadOfDeadlockOnTurboModuleSetupDuringSyncRenderIOSCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean traceTurboModulePromiseRejectionsOnAndroid() {
        Boolean boolValueOf = this.traceTurboModulePromiseRejectionsOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.traceTurboModulePromiseRejectionsOnAndroid());
            this.traceTurboModulePromiseRejectionsOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean updateRuntimeShadowNodeReferencesOnCommit() {
        Boolean boolValueOf = this.updateRuntimeShadowNodeReferencesOnCommitCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.updateRuntimeShadowNodeReferencesOnCommit());
            this.updateRuntimeShadowNodeReferencesOnCommitCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useAlwaysAvailableJSErrorHandling() {
        Boolean boolValueOf = this.useAlwaysAvailableJSErrorHandlingCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useAlwaysAvailableJSErrorHandling());
            this.useAlwaysAvailableJSErrorHandlingCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useFabricInterop() {
        Boolean boolValueOf = this.useFabricInteropCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useFabricInterop());
            this.useFabricInteropCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useNativeViewConfigsInBridgelessMode() {
        Boolean boolValueOf = this.useNativeViewConfigsInBridgelessModeCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useNativeViewConfigsInBridgelessMode());
            this.useNativeViewConfigsInBridgelessModeCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useOptimizedEventBatchingOnAndroid() {
        Boolean boolValueOf = this.useOptimizedEventBatchingOnAndroidCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useOptimizedEventBatchingOnAndroid());
            this.useOptimizedEventBatchingOnAndroidCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useRawPropsJsiValue() {
        Boolean boolValueOf = this.useRawPropsJsiValueCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useRawPropsJsiValue());
            this.useRawPropsJsiValueCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useShadowNodeStateOnClone() {
        Boolean boolValueOf = this.useShadowNodeStateOnCloneCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useShadowNodeStateOnClone());
            this.useShadowNodeStateOnCloneCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModuleInterop() {
        Boolean boolValueOf = this.useTurboModuleInteropCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useTurboModuleInterop());
            this.useTurboModuleInteropCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // tn.c, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
    public boolean useTurboModules() {
        Boolean boolValueOf = this.useTurboModulesCache;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ReactNativeFeatureFlagsCxxInterop.useTurboModules());
            this.useTurboModulesCache = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}

package com.facebook.react.internal.featureflags;

import in.a;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0005\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0003H'J\b\u0010\u0007\u001a\u00020\u0003H'J\b\u0010\b\u001a\u00020\u0003H'J\b\u0010\t\u001a\u00020\u0003H'J\b\u0010\n\u001a\u00020\u0003H'J\b\u0010\u000b\u001a\u00020\u0003H'J\b\u0010\f\u001a\u00020\u0003H'J\b\u0010\r\u001a\u00020\u0003H'J\b\u0010\u000e\u001a\u00020\u0003H'J\b\u0010\u000f\u001a\u00020\u0003H'J\b\u0010\u0010\u001a\u00020\u0003H'J\b\u0010\u0011\u001a\u00020\u0003H'J\b\u0010\u0012\u001a\u00020\u0003H'J\b\u0010\u0013\u001a\u00020\u0003H'J\b\u0010\u0014\u001a\u00020\u0003H'J\b\u0010\u0015\u001a\u00020\u0003H'J\b\u0010\u0016\u001a\u00020\u0003H'J\b\u0010\u0017\u001a\u00020\u0003H'J\b\u0010\u0018\u001a\u00020\u0003H'J\b\u0010\u0019\u001a\u00020\u0003H'J\b\u0010\u001a\u001a\u00020\u0003H'J\b\u0010\u001b\u001a\u00020\u0003H'J\b\u0010\u001c\u001a\u00020\u0003H'J\b\u0010\u001d\u001a\u00020\u0003H'J\b\u0010\u001e\u001a\u00020\u0003H'J\b\u0010\u001f\u001a\u00020\u0003H'J\b\u0010 \u001a\u00020\u0003H'J\b\u0010!\u001a\u00020\u0003H'J\b\u0010\"\u001a\u00020\u0003H'J\b\u0010#\u001a\u00020\u0003H'J\b\u0010$\u001a\u00020\u0003H'J\b\u0010%\u001a\u00020\u0003H'J\b\u0010&\u001a\u00020\u0003H'J\b\u0010'\u001a\u00020\u0003H'J\b\u0010(\u001a\u00020\u0003H'J\b\u0010)\u001a\u00020\u0003H'J\b\u0010*\u001a\u00020\u0003H'J\b\u0010+\u001a\u00020\u0003H'J\b\u0010,\u001a\u00020\u0003H'J\b\u0010-\u001a\u00020\u0003H'J\b\u0010.\u001a\u00020\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "", "commonTestFlag", "", "disableMountItemReorderingAndroid", "enableAccumulatedUpdatesInRawPropsAndroid", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableEagerRootViewAttachment", "enableFabricLogs", "enableFabricRenderer", "enableIOSViewClipToPaddingBox", "enableImagePrefetchingAndroid", "enableJSRuntimeGCOnMemoryPressureOnIOS", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableLongTaskAPI", "enableNativeCSSParsing", "enableNewBackgroundAndBorderDrawables", "enablePreciseSchedulingForPremountItemsOnAndroid", "enablePropsUpdateReconciliationAndroid", "enableReportEventPaintTime", "enableSynchronousStateUpdates", "enableUIConsistency", "enableViewCulling", "enableViewRecycling", "enableViewRecyclingForText", "enableViewRecyclingForView", "excludeYogaFromRawProps", "fixDifferentiatorEmittingUpdatesWithWrongParentTag", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fixMountingCoordinatorReportedPendingTransactionsOnAndroid", "fuseboxEnabledRelease", "fuseboxNetworkInspectionEnabled", "lazyAnimationCallbacks", "removeTurboModuleManagerDelegateMutex", "throwExceptionInsteadOfDeadlockOnTurboModuleSetupDuringSyncRenderIOS", "traceTurboModulePromiseRejectionsOnAndroid", "updateRuntimeShadowNodeReferencesOnCommit", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useNativeViewConfigsInBridgelessMode", "useOptimizedEventBatchingOnAndroid", "useRawPropsJsiValue", "useShadowNodeStateOnClone", "useTurboModuleInterop", "useTurboModules", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ReactNativeFeatureFlagsProvider {
    @a
    boolean commonTestFlag();

    @a
    boolean disableMountItemReorderingAndroid();

    @a
    boolean enableAccumulatedUpdatesInRawPropsAndroid();

    @a
    boolean enableBridgelessArchitecture();

    @a
    boolean enableCppPropsIteratorSetter();

    @a
    boolean enableEagerRootViewAttachment();

    @a
    boolean enableFabricLogs();

    @a
    boolean enableFabricRenderer();

    @a
    boolean enableIOSViewClipToPaddingBox();

    @a
    boolean enableImagePrefetchingAndroid();

    @a
    boolean enableJSRuntimeGCOnMemoryPressureOnIOS();

    @a
    boolean enableLayoutAnimationsOnAndroid();

    @a
    boolean enableLayoutAnimationsOnIOS();

    @a
    boolean enableLongTaskAPI();

    @a
    boolean enableNativeCSSParsing();

    @a
    boolean enableNewBackgroundAndBorderDrawables();

    @a
    boolean enablePreciseSchedulingForPremountItemsOnAndroid();

    @a
    boolean enablePropsUpdateReconciliationAndroid();

    @a
    boolean enableReportEventPaintTime();

    @a
    boolean enableSynchronousStateUpdates();

    @a
    boolean enableUIConsistency();

    @a
    boolean enableViewCulling();

    @a
    boolean enableViewRecycling();

    @a
    boolean enableViewRecyclingForText();

    @a
    boolean enableViewRecyclingForView();

    @a
    boolean excludeYogaFromRawProps();

    @a
    boolean fixDifferentiatorEmittingUpdatesWithWrongParentTag();

    @a
    boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    @a
    boolean fixMountingCoordinatorReportedPendingTransactionsOnAndroid();

    @a
    boolean fuseboxEnabledRelease();

    @a
    boolean fuseboxNetworkInspectionEnabled();

    @a
    boolean lazyAnimationCallbacks();

    @a
    boolean removeTurboModuleManagerDelegateMutex();

    @a
    boolean throwExceptionInsteadOfDeadlockOnTurboModuleSetupDuringSyncRenderIOS();

    @a
    boolean traceTurboModulePromiseRejectionsOnAndroid();

    @a
    boolean updateRuntimeShadowNodeReferencesOnCommit();

    @a
    boolean useAlwaysAvailableJSErrorHandling();

    @a
    boolean useFabricInterop();

    @a
    boolean useNativeViewConfigsInBridgelessMode();

    @a
    boolean useOptimizedEventBatchingOnAndroid();

    @a
    boolean useRawPropsJsiValue();

    @a
    boolean useShadowNodeStateOnClone();

    @a
    boolean useTurboModuleInterop();

    @a
    boolean useTurboModules();
}

package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import ezvcard.property.Gender;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ç\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u000bè\u0001é\u0001ê\u0001ë\u0001ì\u0001:B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"J\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J7\u0010+\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0014¢\u0006\u0004\b4\u00105J\u001d\u00106\u001a\u00020\b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0014¢\u0006\u0004\b6\u00105J7\u0010;\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000bH\u0014¢\u0006\u0004\b;\u0010,J\u0017\u0010?\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u0015H\u0000¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u0015¢\u0006\u0004\bA\u0010>J\r\u0010B\u001a\u00020\u0015¢\u0006\u0004\bB\u0010CJ!\u0010G\u001a\u00020\b2\u0006\u0010D\u001a\u00020\u000b2\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bG\u0010HJ\u0015\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\b2\b\u0010N\u001a\u0004\u0018\u00010M¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u000b¢\u0006\u0004\bR\u0010\u001eJ\r\u0010S\u001a\u00020\b¢\u0006\u0004\bS\u0010\nJ\r\u0010T\u001a\u00020\b¢\u0006\u0004\bT\u0010\nJ\u0019\u0010W\u001a\u00020\u00152\b\u0010V\u001a\u0004\u0018\u00010UH\u0017¢\u0006\u0004\bW\u0010XJ\u001f\u0010Z\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0015H\u0000¢\u0006\u0004\bY\u0010\"J\u000f\u0010[\u001a\u00020\bH\u0014¢\u0006\u0004\b[\u0010\nJ\u000f\u0010]\u001a\u00020\bH\u0000¢\u0006\u0004\b\\\u0010\nJ\u000f\u0010_\u001a\u00020\bH\u0000¢\u0006\u0004\b^\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010`\u001a\u0004\ba\u0010bR$\u0010d\u001a\u0004\u0018\u00010c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u00103\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR(\u0010J\u001a\u0004\u0018\u00010I2\b\u0010p\u001a\u0004\u0018\u00010I8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010q\u001a\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\"\u0010w\u001a\u00020v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R&\u0010~\u001a\u00020}8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R&\u0010\u008b\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010u\u001a\u0005\b\u008b\u0001\u0010C\"\u0005\b\u008c\u0001\u0010>R+\u0010N\u001a\u0004\u0018\u00010\u000b2\b\u0010p\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bN\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0090\u0001\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0005\b\u0094\u0001\u0010PR+\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0095\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R&\u0010\u009a\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010u\u001a\u0005\b\u009a\u0001\u0010C\"\u0005\b\u009b\u0001\u0010>R&\u0010\u009c\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010u\u001a\u0005\b\u009c\u0001\u0010C\"\u0005\b\u009d\u0001\u0010>R\u0018\u0010\u009e\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010uR3\u0010 \u0001\u001a\u00030\u009f\u00012\u0007\u0010p\u001a\u00030\u009f\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R&\u0010¦\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010u\u001a\u0005\b§\u0001\u0010C\"\u0005\b¨\u0001\u0010>R1\u0010«\u0001\u001a\n\u0012\u0005\u0012\u00030ª\u00010©\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R(\u0010±\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0005\bµ\u0001\u0010\u001eR(\u0010¶\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¶\u0001\u0010²\u0001\u001a\u0006\b·\u0001\u0010´\u0001\"\u0005\b¸\u0001\u0010\u001eR&\u0010¹\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¹\u0001\u0010u\u001a\u0005\bº\u0001\u0010C\"\u0005\b»\u0001\u0010>R*\u0010¼\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010¡\u0001\u001a\u0006\b½\u0001\u0010£\u0001\"\u0006\b¾\u0001\u0010¥\u0001R&\u0010¿\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¿\u0001\u0010u\u001a\u0005\bÀ\u0001\u0010C\"\u0005\bÁ\u0001\u0010>R7\u0010Ã\u0001\u001a\u0005\u0018\u00010Â\u00012\t\u0010p\u001a\u0005\u0018\u00010Â\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R5\u0010É\u0001\u001a\u0004\u0018\u00010M2\t\u0010É\u0001\u001a\u0004\u0018\u00010M8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\bÉ\u0001\u0010\u0091\u0001\u001a\u0006\bÊ\u0001\u0010\u0093\u0001\"\u0005\bË\u0001\u0010PR6\u0010Í\u0001\u001a\u0004\u0018\u00010\u00152\t\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00158\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010\u0096\u0001\u001a\u0006\bÍ\u0001\u0010\u0097\u0001\"\u0006\bÎ\u0001\u0010\u0099\u0001R6\u0010Ð\u0001\u001a\u0004\u0018\u00010\u00152\t\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00158\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010\u0096\u0001\u001a\u0006\bÐ\u0001\u0010\u0097\u0001\"\u0006\bÑ\u0001\u0010\u0099\u0001R&\u0010Ò\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÒ\u0001\u0010u\u001a\u0005\bÓ\u0001\u0010C\"\u0005\bÔ\u0001\u0010>R\u0016\u0010Õ\u0001\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010CR\u0015\u0010×\u0001\u001a\u0004\u0018\u00010#8F¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010%R\u001d\u0010Û\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010Ø\u00018F¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0017\u0010ß\u0001\u001a\u0005\u0018\u00010Ü\u00018F¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u0017\u0010ã\u0001\u001a\u0005\u0018\u00010à\u00018F¢\u0006\b\u001a\u0006\bá\u0001\u0010â\u0001R\u0016\u0010æ\u0001\u001a\u0004\u0018\u00010-8F¢\u0006\b\u001a\u0006\bä\u0001\u0010å\u0001¨\u0006í\u0001"}, d2 = {"Lcom/swmansion/rnscreens/t;", "Lcom/swmansion/rnscreens/g;", "Lcom/swmansion/rnscreens/w$a;", "Lcom/swmansion/rnscreens/gamma/common/b;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Ljn0/h0;", "triggerPostponedEnterTransitionIfNeeded", "()V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "updateScreenSizePaper", "(II)V", "offsetY", "dispatchShadowStateUpdate", "(III)V", "Landroid/view/ViewGroup;", "viewGroup", "", "hasWebView", "(Landroid/view/ViewGroup;)Z", "parent", "endTransitionRecursive", "(Landroid/view/ViewGroup;)V", "startTransitionRecursive", "headerHeight", "notifyHeaderHeightChange", "(I)V", "detentIndex", "isStable", "dispatchSheetDetentChanged", "(IZ)V", "Landroidx/fragment/app/Fragment;", "getAssociatedFragment", "()Landroidx/fragment/app/Fragment;", "changed", "left", "top", "right", "bottom", "onContentWrapperLayout", "(ZIIII)V", "Lcom/swmansion/rnscreens/w;", "wrapper", "registerLayoutCallbackForWrapper", "(Lcom/swmansion/rnscreens/w;)V", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "container", "dispatchSaveInstanceState", "(Landroid/util/SparseArray;)V", "dispatchRestoreInstanceState", "l", "t", "r", "b", "onLayout", "coordinatorLayoutDidChange", "onBottomSheetBehaviorDidLayout$react_native_screens_release", "(Z)V", "onBottomSheetBehaviorDidLayout", "transitioning", "setTransitioning", "isTranslucent", "()Z", "layerType", "Landroid/graphics/Paint;", "paint", "setLayerType", "(ILandroid/graphics/Paint;)V", "Lcom/swmansion/rnscreens/t$a;", "activityState", "setActivityState", "(Lcom/swmansion/rnscreens/t$a;)V", "", "screenOrientation", "setScreenOrientation", "(Ljava/lang/String;)V", "mode", "changeAccessibilityMode", "startRemovalTransition", "endRemovalTransition", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onSheetDetentChanged$react_native_screens_release", "onSheetDetentChanged", "onAttachedToWindow", "onFinalizePropsUpdate$react_native_screens_release", "onFinalizePropsUpdate", "onSheetCornerRadiusChange$react_native_screens_release", "onSheetCornerRadiusChange", "Lcom/facebook/react/uimanager/v0;", "getReactContext", "()Lcom/facebook/react/uimanager/v0;", "Lcom/swmansion/rnscreens/b0;", "fragmentWrapper", "Lcom/swmansion/rnscreens/b0;", "getFragmentWrapper", "()Lcom/swmansion/rnscreens/b0;", "setFragmentWrapper", "(Lcom/swmansion/rnscreens/b0;)V", "Lcom/swmansion/rnscreens/v;", "Lcom/swmansion/rnscreens/v;", "getContainer", "()Lcom/swmansion/rnscreens/v;", "setContainer", "(Lcom/swmansion/rnscreens/v;)V", "value", "Lcom/swmansion/rnscreens/t$a;", "getActivityState", "()Lcom/swmansion/rnscreens/t$a;", "isTransitioning", "Z", "Lcom/swmansion/rnscreens/t$e;", "stackPresentation", "Lcom/swmansion/rnscreens/t$e;", "getStackPresentation", "()Lcom/swmansion/rnscreens/t$e;", "setStackPresentation", "(Lcom/swmansion/rnscreens/t$e;)V", "Lcom/swmansion/rnscreens/t$c;", "replaceAnimation", "Lcom/swmansion/rnscreens/t$c;", "getReplaceAnimation", "()Lcom/swmansion/rnscreens/t$c;", "setReplaceAnimation", "(Lcom/swmansion/rnscreens/t$c;)V", "Lcom/swmansion/rnscreens/t$d;", "stackAnimation", "Lcom/swmansion/rnscreens/t$d;", "getStackAnimation", "()Lcom/swmansion/rnscreens/t$d;", "setStackAnimation", "(Lcom/swmansion/rnscreens/t$d;)V", "isGestureEnabled", "setGestureEnabled", "Ljava/lang/Integer;", "getScreenOrientation", "()Ljava/lang/Integer;", "screenId", "Ljava/lang/String;", "getScreenId", "()Ljava/lang/String;", "setScreenId", "isStatusBarAnimated", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setStatusBarAnimated", "(Ljava/lang/Boolean;)V", "isBeingRemoved", "setBeingRemoved", "isSheetGrabberVisible", "setSheetGrabberVisible", "shouldUpdateSheetCornerRadius", "", "sheetCornerRadius", Gender.FEMALE, "getSheetCornerRadius", "()F", "setSheetCornerRadius", "(F)V", "sheetExpandsWhenScrolledToEdge", "getSheetExpandsWhenScrolledToEdge", "setSheetExpandsWhenScrolledToEdge", "", "", "sheetDetents", "Ljava/util/List;", "getSheetDetents", "()Ljava/util/List;", "setSheetDetents", "(Ljava/util/List;)V", "sheetLargestUndimmedDetentIndex", "I", "getSheetLargestUndimmedDetentIndex", "()I", "setSheetLargestUndimmedDetentIndex", "sheetInitialDetentIndex", "getSheetInitialDetentIndex", "setSheetInitialDetentIndex", "sheetClosesOnTouchOutside", "getSheetClosesOnTouchOutside", "setSheetClosesOnTouchOutside", "sheetElevation", "getSheetElevation", "setSheetElevation", "shouldTriggerPostponedTransitionAfterLayout", "getShouldTriggerPostponedTransitionAfterLayout", "setShouldTriggerPostponedTransitionAfterLayout", "Lcom/swmansion/rnscreens/y;", Footer.type, "Lcom/swmansion/rnscreens/y;", "getFooter", "()Lcom/swmansion/rnscreens/y;", "setFooter", "(Lcom/swmansion/rnscreens/y;)V", "statusBarStyle", "getStatusBarStyle", "setStatusBarStyle", "statusBarHidden", "isStatusBarHidden", "setStatusBarHidden", "navigationBarHidden", "isNavigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "getNativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "isNativeStackScreen", "getFragment", "fragment", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "sheetBehavior", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getReactEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "reactEventDispatcher", "Lcom/swmansion/rnscreens/w0;", "getHeaderConfig", "()Lcom/swmansion/rnscreens/w0;", "headerConfig", "getContentWrapper", "()Lcom/swmansion/rnscreens/w;", "contentWrapper", "Companion", "e", DateTokenConverter.CONVERTER_KEY, "c", "a", "g", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class t extends com.swmansion.rnscreens.g implements w.a, com.swmansion.rnscreens.gamma.common.b {
    public static final double SHEET_FIT_TO_CONTENTS = -1.0d;
    public static final String TAG = "Screen";
    private a activityState;
    private v container;
    private y footer;
    private b0 fragmentWrapper;
    private boolean isBeingRemoved;
    private boolean isGestureEnabled;
    private Boolean isNavigationBarHidden;
    private boolean isSheetGrabberVisible;
    private Boolean isStatusBarAnimated;
    private Boolean isStatusBarHidden;
    private boolean isTransitioning;
    private boolean nativeBackButtonDismissalEnabled;
    private final com.facebook.react.uimanager.v0 reactContext;
    private c replaceAnimation;
    private String screenId;
    private Integer screenOrientation;
    private boolean sheetClosesOnTouchOutside;
    private float sheetCornerRadius;
    private List<Double> sheetDetents;
    private float sheetElevation;
    private boolean sheetExpandsWhenScrolledToEdge;
    private int sheetInitialDetentIndex;
    private int sheetLargestUndimmedDetentIndex;
    private boolean shouldTriggerPostponedTransitionAfterLayout;
    private boolean shouldUpdateSheetCornerRadius;
    private d stackAnimation;
    private e stackPresentation;
    private String statusBarStyle;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/swmansion/rnscreens/t$a;", "", "<init>", "(Ljava/lang/String;I)V", "INACTIVE", "TRANSITIONING_OR_BELOW_TOP", "ON_TOP", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        INACTIVE,
        TRANSITIONING_OR_BELOW_TOP,
        ON_TOP;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/swmansion/rnscreens/t$c;", "", "<init>", "(Ljava/lang/String;I)V", "PUSH", "POP", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum c {
        PUSH,
        POP;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/swmansion/rnscreens/t$d;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "NONE", "FADE", "SLIDE_FROM_BOTTOM", "SLIDE_FROM_RIGHT", "SLIDE_FROM_LEFT", "FADE_FROM_BOTTOM", "IOS_FROM_RIGHT", "IOS_FROM_LEFT", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum d {
        DEFAULT,
        NONE,
        FADE,
        SLIDE_FROM_BOTTOM,
        SLIDE_FROM_RIGHT,
        SLIDE_FROM_LEFT,
        FADE_FROM_BOTTOM,
        IOS_FROM_RIGHT,
        IOS_FROM_LEFT;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/swmansion/rnscreens/t$e;", "", "<init>", "(Ljava/lang/String;I)V", "PUSH", "MODAL", "TRANSPARENT_MODAL", "FORM_SHEET", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum e {
        PUSH,
        MODAL,
        TRANSPARENT_MODAL,
        FORM_SHEET;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.TRANSPARENT_MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.FORM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/swmansion/rnscreens/t$g;", "", "<init>", "(Ljava/lang/String;I)V", "ORIENTATION", "STYLE", "HIDDEN", "ANIMATED", "NAVIGATION_BAR_HIDDEN", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum g {
        ORIENTATION,
        STYLE,
        HIDDEN,
        ANIMATED,
        NAVIGATION_BAR_HIDDEN;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<g> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/swmansion/rnscreens/t$h", "Lcom/facebook/react/bridge/GuardedRunnable;", "Ljn0/h0;", "runGuarded", "()V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends GuardedRunnable {
        final /* synthetic */ int $height;
        final /* synthetic */ int $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i11, int i12, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            this.$width = i11;
            this.$height = i12;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule uIManagerModule = (UIManagerModule) t.this.getReactContext().getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.updateNodeSize(t.this.getId(), this.$width, this.$height);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.facebook.react.uimanager.v0 reactContext) {
        super(reactContext);
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.stackPresentation = e.PUSH;
        this.replaceAnimation = c.POP;
        this.stackAnimation = d.DEFAULT;
        this.isGestureEnabled = true;
        this.sheetExpandsWhenScrolledToEdge = true;
        this.sheetDetents = p013kotlin.collections.v.s(Double.valueOf(1.0d));
        this.sheetLargestUndimmedDetentIndex = -1;
        this.sheetClosesOnTouchOutside = true;
        this.sheetElevation = 24.0f;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.nativeBackButtonDismissalEnabled = true;
    }

    private final void dispatchShadowStateUpdate(int width, int height, int offsetY) {
        updateScreenSizePaper(width, height);
    }

    private final void dispatchSheetDetentChanged(int detentIndex, boolean isStable) {
        int iE = com.facebook.react.uimanager.b1.e(this.reactContext);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.h(new com.swmansion.rnscreens.events.s(iE, getId(), detentIndex, isStable));
        }
    }

    private final void endTransitionRecursive(ViewGroup parent) {
        for (View view : androidx.core.view.s0.a(parent)) {
            parent.endViewTransition(view);
            if (view instanceof w0) {
                endTransitionRecursive(((w0) view).getToolbar());
            }
            if (view instanceof ViewGroup) {
                endTransitionRecursive((ViewGroup) view);
            }
        }
    }

    private final boolean hasWebView(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && hasWebView((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isNativeStackScreen() {
        return this.container instanceof m0;
    }

    private final void notifyHeaderHeightChange(int headerHeight) {
        Context context = getContext();
        p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iE = com.facebook.react.uimanager.b1.e(reactContext);
        EventDispatcher eventDispatcherC = com.facebook.react.uimanager.b1.c(reactContext, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new com.swmansion.rnscreens.events.d(iE, getId(), headerHeight));
        }
    }

    private final void startTransitionRecursive(ViewGroup parent) {
        if (parent != null) {
            int childCount = parent.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = parent.getChildAt(i11);
                if ((parent instanceof androidx.swiperefreshlayout.widget.c) && (childAt instanceof ImageView)) {
                    parent.addView(new View(getContext()), i11);
                } else if (childAt != null) {
                    parent.startViewTransition(childAt);
                }
                if (childAt instanceof w0) {
                    startTransitionRecursive(((w0) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    startTransitionRecursive((ViewGroup) childAt);
                }
            }
        }
    }

    private final void triggerPostponedEnterTransitionIfNeeded() {
        if (this.shouldTriggerPostponedTransitionAfterLayout) {
            this.shouldTriggerPostponedTransitionAfterLayout = false;
            Fragment fragment = getFragment();
            if (fragment != null) {
                fragment.startPostponedEnterTransition();
            }
        }
    }

    private final void updateScreenSizePaper(int width, int height) {
        com.facebook.react.uimanager.v0 v0Var = this.reactContext;
        v0Var.runOnNativeModulesQueueThread(new h(width, height, v0Var.getExceptionHandler()));
    }

    public final void changeAccessibilityMode(int mode) {
        com.swmansion.rnscreens.d toolbar;
        setImportantForAccessibility(mode);
        w0 headerConfig = getHeaderConfig();
        if (headerConfig == null || (toolbar = headerConfig.getToolbar()) == null) {
            return;
        }
        toolbar.setImportantForAccessibility(mode);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        p013kotlin.jvm.internal.s.k(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        p013kotlin.jvm.internal.s.k(container, "container");
    }

    public final void endRemovalTransition() {
        if (this.isBeingRemoved) {
            this.isBeingRemoved = false;
            endTransitionRecursive(this);
        }
    }

    public final a getActivityState() {
        return this.activityState;
    }

    @Override // com.swmansion.rnscreens.gamma.common.b
    public Fragment getAssociatedFragment() {
        return getFragment();
    }

    public final v getContainer() {
        return this.container;
    }

    public final w getContentWrapper() {
        View next;
        Iterator<View> it = androidx.core.view.s0.a(this).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof w));
        if (next instanceof w) {
            return (w) next;
        }
        return null;
    }

    public final y getFooter() {
        return this.footer;
    }

    public final Fragment getFragment() {
        b0 b0Var = this.fragmentWrapper;
        if (b0Var != null) {
            return b0Var.getFragment();
        }
        return null;
    }

    public final b0 getFragmentWrapper() {
        return this.fragmentWrapper;
    }

    public final w0 getHeaderConfig() {
        View next;
        Iterator<View> it = androidx.core.view.s0.a(this).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof w0));
        if (next instanceof w0) {
            return (w0) next;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.nativeBackButtonDismissalEnabled;
    }

    public final com.facebook.react.uimanager.v0 getReactContext() {
        return this.reactContext;
    }

    public final EventDispatcher getReactEventDispatcher() {
        return com.facebook.react.uimanager.b1.c(this.reactContext, getId());
    }

    public final c getReplaceAnimation() {
        return this.replaceAnimation;
    }

    public final String getScreenId() {
        return this.screenId;
    }

    public final Integer getScreenOrientation() {
        return this.screenOrientation;
    }

    public final BottomSheetBehavior<t> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        CoordinatorLayout.c cVarF = fVar != null ? fVar.f() : null;
        if (cVarF instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarF;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.sheetClosesOnTouchOutside;
    }

    public final float getSheetCornerRadius() {
        return this.sheetCornerRadius;
    }

    public final List<Double> getSheetDetents() {
        return this.sheetDetents;
    }

    public final float getSheetElevation() {
        return this.sheetElevation;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.sheetExpandsWhenScrolledToEdge;
    }

    public final int getSheetInitialDetentIndex() {
        return this.sheetInitialDetentIndex;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.sheetLargestUndimmedDetentIndex;
    }

    public final boolean getShouldTriggerPostponedTransitionAfterLayout() {
        return this.shouldTriggerPostponedTransitionAfterLayout;
    }

    public final d getStackAnimation() {
        return this.stackAnimation;
    }

    public final e getStackPresentation() {
        return this.stackPresentation;
    }

    public final String getStatusBarStyle() {
        return this.statusBarStyle;
    }

    /* JADX INFO: renamed from: isBeingRemoved, reason: from getter */
    public final boolean getIsBeingRemoved() {
        return this.isBeingRemoved;
    }

    /* JADX INFO: renamed from: isGestureEnabled, reason: from getter */
    public final boolean getIsGestureEnabled() {
        return this.isGestureEnabled;
    }

    /* JADX INFO: renamed from: isNavigationBarHidden, reason: from getter */
    public final Boolean getIsNavigationBarHidden() {
        return this.isNavigationBarHidden;
    }

    /* JADX INFO: renamed from: isSheetGrabberVisible, reason: from getter */
    public final boolean getIsSheetGrabberVisible() {
        return this.isSheetGrabberVisible;
    }

    /* JADX INFO: renamed from: isStatusBarAnimated, reason: from getter */
    public final Boolean getIsStatusBarAnimated() {
        return this.isStatusBarAnimated;
    }

    /* JADX INFO: renamed from: isStatusBarHidden, reason: from getter */
    public final Boolean getIsStatusBarHidden() {
        return this.isStatusBarHidden;
    }

    public final boolean isTranslucent() {
        int i11 = f.$EnumSwitchMapping$0[this.stackPresentation.ordinal()];
        return i11 == 1 || i11 == 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Fragment fragment;
        t0 t0VarAsScreenStackFragment;
        com.swmansion.rnscreens.bottomsheet.h sheetDelegate$react_native_screens_release;
        super.onAttachedToWindow();
        if (!com.swmansion.rnscreens.bottomsheet.j.usesFormSheetPresentation(this) || (fragment = getFragment()) == null || (t0VarAsScreenStackFragment = aa0.a.asScreenStackFragment(fragment)) == null || (sheetDelegate$react_native_screens_release = t0VarAsScreenStackFragment.getSheetDelegate()) == null) {
            return;
        }
        j.INSTANCE.addOnApplyWindowInsetsListener(sheetDelegate$react_native_screens_release);
    }

    public final void onBottomSheetBehaviorDidLayout$react_native_screens_release(boolean coordinatorLayoutDidChange) {
        if (com.swmansion.rnscreens.bottomsheet.j.usesFormSheetPresentation(this) && isNativeStackScreen()) {
            if (coordinatorLayoutDidChange) {
                dispatchShadowStateUpdate(getWidth(), getHeight(), getTop());
            }
            y yVar = this.footer;
            if (yVar != null) {
                int left = getLeft();
                int top = getTop();
                int right = getRight();
                int bottom = getBottom();
                v vVar = this.container;
                p013kotlin.jvm.internal.s.h(vVar);
                yVar.onParentLayout(coordinatorLayoutDidChange, left, top, right, bottom, vVar.getHeight());
            }
            triggerPostponedEnterTransitionIfNeeded();
        }
    }

    @Override // com.swmansion.rnscreens.w.a
    public void onContentWrapperLayout(boolean changed, int left, int top, int right, int bottom) {
        BottomSheetBehavior<t> sheetBehavior;
        int i11 = bottom - top;
        if (com.swmansion.rnscreens.bottomsheet.j.usesFormSheetPresentation(this)) {
            if (com.swmansion.rnscreens.bottomsheet.j.isSheetFitToContents(this) && (sheetBehavior = getSheetBehavior()) != null) {
                com.swmansion.rnscreens.bottomsheet.a.useSingleDetent$default(sheetBehavior, Integer.valueOf(i11), false, 2, null);
            }
            this.shouldTriggerPostponedTransitionAfterLayout = true;
            ViewGroup viewGroupParentAsViewGroup = aa0.c.parentAsViewGroup(this);
            if (viewGroupParentAsViewGroup == null || viewGroupParentAsViewGroup.isInLayout()) {
                return;
            }
            viewGroupParentAsViewGroup.requestLayout();
        }
    }

    public final void onFinalizePropsUpdate$react_native_screens_release() {
        if (this.shouldUpdateSheetCornerRadius) {
            this.shouldUpdateSheetCornerRadius = false;
            onSheetCornerRadiusChange$react_native_screens_release();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        if (changed && isNativeStackScreen() && !com.swmansion.rnscreens.bottomsheet.j.usesFormSheetPresentation(this)) {
            dispatchShadowStateUpdate(r11 - l11, b11 - t11, t11);
            notifyHeaderHeightChange(t11);
        }
    }

    public final void onSheetCornerRadiusChange$react_native_screens_release() {
        if (this.stackPresentation != e.FORM_SHEET || getBackground() == null) {
            return;
        }
        Drawable background = getBackground();
        st.g gVar = background instanceof st.g ? (st.g) background : null;
        if (gVar != null) {
            float fMax = Math.max(com.facebook.react.uimanager.w.f(this.sheetCornerRadius), BitmapDescriptorFactory.HUE_RED);
            st.k.b bVar = new st.k.b();
            bVar.B(0, fMax);
            bVar.G(0, fMax);
            gVar.setShapeAppearanceModel(bVar.m());
        }
    }

    public final void onSheetDetentChanged$react_native_screens_release(int detentIndex, boolean isStable) {
        dispatchSheetDetentChanged(detentIndex, isStable);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        if (com.swmansion.rnscreens.bottomsheet.j.usesFormSheetPresentation(this)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void registerLayoutCallbackForWrapper(w wrapper) {
        p013kotlin.jvm.internal.s.k(wrapper, "wrapper");
        wrapper.setDelegate$react_native_screens_release(this);
    }

    public final void setActivityState(a activityState) {
        p013kotlin.jvm.internal.s.k(activityState, "activityState");
        a aVar = this.activityState;
        if (activityState == aVar) {
            return;
        }
        if ((this.container instanceof m0) && aVar != null) {
            p013kotlin.jvm.internal.s.h(aVar);
            if (activityState.compareTo(aVar) < 0) {
                throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
            }
        }
        this.activityState = activityState;
        v vVar = this.container;
        if (vVar != null) {
            vVar.onChildUpdate();
        }
    }

    public final void setBeingRemoved(boolean z11) {
        this.isBeingRemoved = z11;
    }

    public final void setContainer(v vVar) {
        this.container = vVar;
    }

    public final void setFooter(y yVar) {
        BottomSheetBehavior<t> sheetBehavior;
        if (yVar == null && this.footer != null) {
            BottomSheetBehavior<t> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                y yVar2 = this.footer;
                p013kotlin.jvm.internal.s.h(yVar2);
                yVar2.unregisterWithSheetBehavior(sheetBehavior2);
            }
        } else if (yVar != null && (sheetBehavior = getSheetBehavior()) != null) {
            yVar.registerWithSheetBehavior(sheetBehavior);
        }
        this.footer = yVar;
    }

    public final void setFragmentWrapper(b0 b0Var) {
        this.fragmentWrapper = b0Var;
    }

    public final void setGestureEnabled(boolean z11) {
        this.isGestureEnabled = z11;
    }

    @Override // android.view.View
    public void setLayerType(int layerType, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z11) {
        this.nativeBackButtonDismissalEnabled = z11;
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            c1.INSTANCE.applyDidSetNavigationBarAppearance$react_native_screens_release();
        }
        this.isNavigationBarHidden = bool;
        b0 b0Var = this.fragmentWrapper;
        if (b0Var != null) {
            c1.INSTANCE.setNavigationBarHidden$react_native_screens_release(this, b0Var.tryGetActivity());
        }
    }

    public final void setReplaceAnimation(c cVar) {
        p013kotlin.jvm.internal.s.k(cVar, "<set-?>");
        this.replaceAnimation = cVar;
    }

    public final void setScreenId(String str) {
        this.screenId = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    public final void setScreenOrientation(String screenOrientation) {
        int i11;
        if (screenOrientation == null) {
            this.screenOrientation = null;
            return;
        }
        c1 c1Var = c1.INSTANCE;
        c1Var.applyDidSetOrientation$react_native_screens_release();
        switch (screenOrientation) {
            case "portrait_down":
                i11 = 9;
                break;
            case "all":
                i11 = 10;
                break;
            case "portrait":
                i11 = 7;
                break;
            case "landscape":
                i11 = 6;
                break;
            case "portrait_up":
                i11 = 1;
                break;
            case "landscape_left":
                i11 = 8;
                break;
            case "landscape_right":
                i11 = 0;
                break;
            default:
                i11 = -1;
                break;
        }
        this.screenOrientation = Integer.valueOf(i11);
        b0 b0Var = this.fragmentWrapper;
        if (b0Var != null) {
            c1Var.setOrientation$react_native_screens_release(this, b0Var.tryGetActivity());
        }
    }

    public final void setSheetClosesOnTouchOutside(boolean z11) {
        this.sheetClosesOnTouchOutside = z11;
    }

    public final void setSheetCornerRadius(float f11) {
        if (this.sheetCornerRadius == f11) {
            return;
        }
        this.sheetCornerRadius = f11;
        this.shouldUpdateSheetCornerRadius = true;
    }

    public final void setSheetDetents(List<Double> list) {
        p013kotlin.jvm.internal.s.k(list, "<set-?>");
        this.sheetDetents = list;
    }

    public final void setSheetElevation(float f11) {
        this.sheetElevation = f11;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z11) {
        this.sheetExpandsWhenScrolledToEdge = z11;
    }

    public final void setSheetGrabberVisible(boolean z11) {
        this.isSheetGrabberVisible = z11;
    }

    public final void setSheetInitialDetentIndex(int i11) {
        this.sheetInitialDetentIndex = i11;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i11) {
        this.sheetLargestUndimmedDetentIndex = i11;
    }

    public final void setShouldTriggerPostponedTransitionAfterLayout(boolean z11) {
        this.shouldTriggerPostponedTransitionAfterLayout = z11;
    }

    public final void setStackAnimation(d dVar) {
        p013kotlin.jvm.internal.s.k(dVar, "<set-?>");
        this.stackAnimation = dVar;
    }

    public final void setStackPresentation(e eVar) {
        p013kotlin.jvm.internal.s.k(eVar, "<set-?>");
        this.stackPresentation = eVar;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.isStatusBarAnimated = bool;
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            c1.INSTANCE.applyDidSetStatusBarAppearance$react_native_screens_release();
        }
        this.isStatusBarHidden = bool;
        b0 b0Var = this.fragmentWrapper;
        if (b0Var != null) {
            c1.INSTANCE.setHidden$react_native_screens_release(this, b0Var.tryGetActivity());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            c1.INSTANCE.applyDidSetStatusBarAppearance$react_native_screens_release();
        }
        this.statusBarStyle = str;
        b0 b0Var = this.fragmentWrapper;
        if (b0Var != null) {
            c1.INSTANCE.setStyle$react_native_screens_release(this, b0Var.tryGetActivity(), b0Var.tryGetContext());
        }
    }

    public final void setTransitioning(boolean transitioning) {
        if (this.isTransitioning == transitioning) {
            return;
        }
        this.isTransitioning = transitioning;
        boolean zHasWebView = hasWebView(this);
        if (!zHasWebView || getLayerType() == 2) {
            super.setLayerType((!transitioning || zHasWebView) ? 0 : 2, null);
        }
    }

    public final void startRemovalTransition() {
        if (this.isBeingRemoved) {
            return;
        }
        this.isBeingRemoved = true;
        startTransitionRecursive(this);
    }
}

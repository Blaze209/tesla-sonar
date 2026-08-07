package com.swmansion.gesturehandler.react;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.s0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.l1;
import com.facebook.react.uimanager.v0;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import vo.q;

/* JADX INFO: loaded from: classes7.dex */
@xn.a(name = RNGestureHandlerButtonViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002?@B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001a\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001bH\u0017¢\u0006\u0004\b$\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001bH\u0017¢\u0006\u0004\b&\u0010\u001eJ\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u001bH\u0017¢\u0006\u0004\b(\u0010\u001eJ!\u0010*\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b0\u0010+J\u001f\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0013H\u0017¢\u0006\u0004\b2\u0010\u0016J\u001f\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u000eH\u0017¢\u0006\u0004\b4\u0010\u0012J\u001f\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000eH\u0017¢\u0006\u0004\b6\u0010\u0012J\u0017\u00107\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000109H\u0014¢\u0006\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "Lvo/q;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "view", "", "useDrawableOnForeground", "Ljn0/h0;", "setForeground", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Z)V", "", "backgroundColor", "setBackgroundColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;I)V", "useBorderlessDrawable", "setBorderless", "enabled", "setEnabled", "", Snapshot.BORDER_RADIUS, "setBorderRadius", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;F)V", Snapshot.BORDER_TOP_LEFT_RADIUS, "setBorderTopLeftRadius", Snapshot.BORDER_TOP_RIGHT_RADIUS, "setBorderTopRightRadius", Snapshot.BORDER_BOTTOM_LEFT_RADIUS, "setBorderBottomLeftRadius", Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, "setBorderBottomRightRadius", "borderWidth", "setBorderWidth", "borderColor", "setBorderColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/Integer;)V", "borderStyle", "setBorderStyle", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/String;)V", "rippleColor", "setRippleColor", "rippleRadius", "setRippleRadius", "exclusive", "setExclusive", "touchSoundDisabled", "setTouchSoundDisabled", "onAfterUpdateTransaction", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;)V", "Lcom/facebook/react/uimanager/l1;", "getDelegate", "()Lcom/facebook/react/uimanager/l1;", "mDelegate", "Lcom/facebook/react/uimanager/l1;", "Companion", "a", "b", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> implements q<a> {
    public static final String REACT_CLASS = "RNGestureHandlerButton";
    private final l1<a> mDelegate = new vo.p(this);

    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 12\u00020\u00012\u00020\u0002:\u0001FB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001a2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b0\u0010/J\r\u00101\u001a\u00020\u0012¢\u0006\u0004\b1\u0010\u0019J7\u00104\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u00103\u001a\u00020\rH\u0014¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020\u00122\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u000206H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b;\u0010/J\u0017\u00103\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b3\u0010<J!\u0010?\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001aH\u0016¢\u0006\u0004\bA\u0010\u001cJ\u0017\u0010C\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u001aH\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00122\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u000206H\u0016¢\u0006\u0004\bE\u0010:R.\u0010L\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR.\u0010P\u001a\u0004\u0018\u00010\r2\b\u0010M\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010G\u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR*\u0010U\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010R\u001a\u0004\bS\u0010\u001c\"\u0004\bT\u0010DR\"\u0010Y\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010R\u001a\u0004\bW\u0010\u001c\"\u0004\bX\u0010DR*\u0010`\u001a\u0002062\u0006\u0010M\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R*\u0010d\u001a\u0002062\u0006\u0010M\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010[\u001a\u0004\bb\u0010]\"\u0004\bc\u0010_R*\u0010h\u001a\u0002062\u0006\u0010M\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010[\u001a\u0004\bf\u0010]\"\u0004\bg\u0010_R*\u0010l\u001a\u0002062\u0006\u0010M\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010[\u001a\u0004\bj\u0010]\"\u0004\bk\u0010_R*\u0010p\u001a\u0002062\u0006\u0010M\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010[\u001a\u0004\bn\u0010]\"\u0004\bo\u0010_R*\u0010t\u001a\u0002062\u0006\u0010q\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010[\u001a\u0004\br\u0010]\"\u0004\bs\u0010_R.\u0010w\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010G\u001a\u0004\bu\u0010I\"\u0004\bv\u0010KR.\u0010\u007f\u001a\u0004\u0018\u00010x2\b\u0010y\u001a\u0004\u0018\u00010x8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R%\u0010\u0082\u0001\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0017\u0010R\u001a\u0005\b\u0080\u0001\u0010\u001c\"\u0005\b\u0081\u0001\u0010DR\u0019\u0010\u0085\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010RR\u0019\u0010\u0089\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0010\u0088\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0084\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010RR%\u0010\u008d\u0001\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u001b\u0010R\u001a\u0005\b\u008d\u0001\u0010\u001c\"\u0005\b\u008e\u0001\u0010DR\u0016\u0010\u0090\u0001\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010\u001c¨\u0006\u0091\u0001"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "Landroid/view/ViewGroup;", "Lcom/swmansion/gesturehandler/core/e$e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "j", "()[F", "Landroid/graphics/PathEffect;", "k", "()Landroid/graphics/PathEffect;", "", "backgroundColor", "Landroid/graphics/drawable/Drawable;", "borderDrawable", "selectable", "Ljn0/h0;", "u", "(ILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "l", "()Landroid/graphics/drawable/Drawable;", "m", "r", "()V", "", "s", "()Z", "Lho0/i;", "Landroid/view/View;", "children", "p", "(Lho0/i;)Z", "Lcom/swmansion/gesturehandler/react/m;", "o", "()Lcom/swmansion/gesturehandler/react/m;", "color", "setBackgroundColor", "(I)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "Landroid/view/MotionEvent;", "event", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "t", "changed", "b", "onLayout", "(ZIIII)V", "", "x", "y", "drawableHotspotChanged", "(FF)V", "c", "(Landroid/view/MotionEvent;)V", "keyCode", "Landroid/view/KeyEvent;", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "performClick", "pressed", "setPressed", "(Z)V", "dispatchDrawableHotspotChanged", "a", "Ljava/lang/Integer;", "getRippleColor", "()Ljava/lang/Integer;", "setRippleColor", "(Ljava/lang/Integer;)V", "rippleColor", "radius", "getRippleRadius", "setRippleRadius", "rippleRadius", "useForeground", "Z", "getUseDrawableOnForeground", "setUseDrawableOnForeground", "useDrawableOnForeground", DateTokenConverter.CONVERTER_KEY, "getUseBorderlessDrawable", "setUseBorderlessDrawable", "useBorderlessDrawable", "e", Gender.FEMALE, "getBorderRadius", "()F", "setBorderRadius", "(F)V", Snapshot.BORDER_RADIUS, "f", "getBorderTopLeftRadius", "setBorderTopLeftRadius", Snapshot.BORDER_TOP_LEFT_RADIUS, "g", "getBorderTopRightRadius", "setBorderTopRightRadius", Snapshot.BORDER_TOP_RIGHT_RADIUS, "h", "getBorderBottomLeftRadius", "setBorderBottomLeftRadius", Snapshot.BORDER_BOTTOM_LEFT_RADIUS, IntegerTokenConverter.CONVERTER_KEY, "getBorderBottomRightRadius", "setBorderBottomRightRadius", Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.WIDTH, "getBorderWidth", "setBorderWidth", "borderWidth", "getBorderColor", "setBorderColor", "borderColor", "", "style", "Ljava/lang/String;", "getBorderStyle", "()Ljava/lang/String;", "setBorderStyle", "(Ljava/lang/String;)V", "borderStyle", "getExclusive", "setExclusive", "exclusive", "n", "I", "buttonBackgroundColor", "needBackgroundUpdate", "", "J", "lastEventTime", "q", "lastAction", "receivedKeyEvent", "isTouched", "setTouched", "getHasBorderRadii", "hasBorderRadii", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ViewGroup implements com.swmansion.gesturehandler.core.e.InterfaceC1111e {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static a f55385v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static a f55386w;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Integer rippleColor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Integer rippleRadius;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean useDrawableOnForeground;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean useBorderlessDrawable;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private float borderRadius;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private float borderTopLeftRadius;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private float borderTopRightRadius;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private float borderBottomLeftRadius;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private float borderBottomRightRadius;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private float borderWidth;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Integer borderColor;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private String borderStyle;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private boolean exclusive;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private int buttonBackgroundColor;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private boolean needBackgroundUpdate;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private long lastEventTime;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private int lastAction;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private boolean receivedKeyEvent;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private boolean isTouched;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static TypedValue f55384u = new TypedValue();

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static View.OnClickListener f55387x = new View.OnClickListener() { // from class: com.swmansion.gesturehandler.react.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RNGestureHandlerButtonViewManager.a.n(view);
            }
        };

        public a(Context context) {
            super(context);
            this.borderStyle = "solid";
            this.exclusive = true;
            this.lastEventTime = -1L;
            this.lastAction = -1;
            setOnClickListener(f55387x);
            setClickable(true);
            setFocusable(true);
            this.needBackgroundUpdate = true;
            setClipChildren(false);
        }

        private final boolean getHasBorderRadii() {
            return (this.borderRadius == BitmapDescriptorFactory.HUE_RED && this.borderTopLeftRadius == BitmapDescriptorFactory.HUE_RED && this.borderTopRightRadius == BitmapDescriptorFactory.HUE_RED && this.borderBottomLeftRadius == BitmapDescriptorFactory.HUE_RED && this.borderBottomRightRadius == BitmapDescriptorFactory.HUE_RED) ? false : true;
        }

        private final float[] j() {
            float f11 = this.borderTopLeftRadius;
            float f12 = this.borderTopRightRadius;
            float f13 = this.borderBottomRightRadius;
            float f14 = this.borderBottomLeftRadius;
            float[] fArr = {f11, f11, f12, f12, f13, f13, f14, f14};
            ArrayList arrayList = new ArrayList(8);
            for (int i11 = 0; i11 < 8; i11++) {
                float f15 = fArr[i11];
                if (f15 == BitmapDescriptorFactory.HUE_RED) {
                    f15 = this.borderRadius;
                }
                arrayList.add(Float.valueOf(f15));
            }
            return v.j1(arrayList);
        }

        private final PathEffect k() {
            String str = this.borderStyle;
            if (s.f(str, "dotted")) {
                float f11 = this.borderWidth;
                return new DashPathEffect(new float[]{f11, f11, f11, f11}, BitmapDescriptorFactory.HUE_RED);
            }
            if (!s.f(str, "dashed")) {
                return null;
            }
            float f12 = this.borderWidth;
            float f13 = 3;
            return new DashPathEffect(new float[]{f12 * f13, f12 * f13, f12 * f13, f12 * f13}, BitmapDescriptorFactory.HUE_RED);
        }

        private final Drawable l() {
            PaintDrawable paintDrawable = new PaintDrawable(0);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(j());
            }
            if (this.borderWidth > BitmapDescriptorFactory.HUE_RED) {
                Paint paint = paintDrawable.getPaint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.borderWidth);
                Integer num = this.borderColor;
                paint.setColor(num != null ? num.intValue() : -16777216);
                paint.setPathEffect(k());
            }
            return paintDrawable;
        }

        private final Drawable m() {
            ColorStateList colorStateList;
            Integer num = this.rippleColor;
            if (num != null && num.intValue() == 0) {
                return null;
            }
            int[][] iArr = {new int[]{R.attr.state_enabled}};
            Integer num2 = this.rippleRadius;
            Integer num3 = this.rippleColor;
            if (num3 != null) {
                s.h(num3);
                colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
            } else {
                getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, f55384u, true);
                colorStateList = new ColorStateList(iArr, new int[]{f55384u.data});
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, this.useBorderlessDrawable ? null : new ShapeDrawable(new RectShape()));
            if (num2 != null) {
                rippleDrawable.setRadius((int) w.h(num2.intValue()));
            }
            return rippleDrawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(View view) {
        }

        private final m o() {
            m mVar = null;
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof m) {
                    mVar = (m) parent;
                }
            }
            return mVar;
        }

        private final boolean p(ho0.i<? extends View> children) {
            for (View view : children) {
                if (view instanceof a) {
                    a aVar = (a) view;
                    if (aVar.isTouched || aVar.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && p(s0.a((ViewGroup) view))) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ boolean q(a aVar, ho0.i iVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iVar = s0.a(aVar);
            }
            return aVar.p(iVar);
        }

        private final void r() {
            if (f55385v == this) {
                f55385v = null;
                f55386w = this;
            }
        }

        private final boolean s() {
            if (q(this, null, 1, null)) {
                return false;
            }
            a aVar = f55385v;
            if (aVar == null) {
                f55385v = this;
                return true;
            }
            if (this.exclusive) {
                return aVar == this;
            }
            return !(aVar != null ? aVar.exclusive : false);
        }

        private final void u(int backgroundColor, Drawable borderDrawable, Drawable selectable) {
            PaintDrawable paintDrawable = new PaintDrawable(backgroundColor);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(j());
            }
            setBackground(new LayerDrawable(selectable != null ? new Drawable[]{paintDrawable, selectable, borderDrawable} : new Drawable[]{paintDrawable, borderDrawable}));
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean a() {
            return com.swmansion.gesturehandler.core.e.InterfaceC1111e.a.f(this);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void b(MotionEvent event) {
            s.k(event, "event");
            r();
            this.isTouched = false;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean c(MotionEvent event) {
            s.k(event, "event");
            if (event.getAction() == 3 || event.getAction() == 1 || event.getActionMasked() == 6) {
                return false;
            }
            boolean zS = s();
            if (zS) {
                this.isTouched = true;
                setPressed(true);
            }
            return zS;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean d() {
            return com.swmansion.gesturehandler.core.e.InterfaceC1111e.a.h(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float x11, float y11) {
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float x11, float y11) {
            a aVar = f55385v;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(x11, y11);
            }
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public boolean e(View view) {
            return com.swmansion.gesturehandler.core.e.InterfaceC1111e.a.b(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean f(View view, MotionEvent motionEvent) {
            return com.swmansion.gesturehandler.core.e.InterfaceC1111e.a.e(this, view, motionEvent);
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public void g(MotionEvent motionEvent) {
            com.swmansion.gesturehandler.core.e.InterfaceC1111e.a.d(this, motionEvent);
        }

        public final float getBorderBottomLeftRadius() {
            return this.borderBottomLeftRadius;
        }

        public final float getBorderBottomRightRadius() {
            return this.borderBottomRightRadius;
        }

        public final Integer getBorderColor() {
            return this.borderColor;
        }

        public final float getBorderRadius() {
            return this.borderRadius;
        }

        public final String getBorderStyle() {
            return this.borderStyle;
        }

        public final float getBorderTopLeftRadius() {
            return this.borderTopLeftRadius;
        }

        public final float getBorderTopRightRadius() {
            return this.borderTopRightRadius;
        }

        public final float getBorderWidth() {
            return this.borderWidth;
        }

        public final boolean getExclusive() {
            return this.exclusive;
        }

        public final Integer getRippleColor() {
            return this.rippleColor;
        }

        public final Integer getRippleRadius() {
            return this.rippleRadius;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.useBorderlessDrawable;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.useDrawableOnForeground;
        }

        @Override // com.swmansion.gesturehandler.core.e.InterfaceC1111e
        public Boolean h(GestureHandler gestureHandler) {
            return com.swmansion.gesturehandler.core.e.InterfaceC1111e.a.g(this, gestureHandler);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            s.k(info, "info");
            super.onInitializeAccessibilityNodeInfo(info);
            Object tag = super.getTag(com.facebook.react.m.f22670t);
            if (tag instanceof String) {
                info.setViewIdResourceName((String) tag);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            s.k(event, "event");
            if (super.onInterceptTouchEvent(event)) {
                return true;
            }
            onTouchEvent(event);
            return isPressed();
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int keyCode, KeyEvent event) {
            this.receivedKeyEvent = true;
            return super.onKeyUp(keyCode, event);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        }

        @Override // android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent event) {
            s.k(event, "event");
            long eventTime = event.getEventTime();
            int action = event.getAction();
            a aVar = f55385v;
            if (aVar != null && aVar != this) {
                s.h(aVar);
                if (aVar.exclusive) {
                    if (isPressed()) {
                        setPressed(false);
                    }
                    this.lastEventTime = eventTime;
                    this.lastAction = action;
                    return false;
                }
            }
            if (event.getAction() == 3) {
                r();
            }
            if (this.lastEventTime == eventTime && this.lastAction == action && action != 3) {
                return false;
            }
            this.lastEventTime = eventTime;
            this.lastAction = action;
            return super.onTouchEvent(event);
        }

        @Override // android.view.View
        public boolean performClick() {
            if (!q(this, null, 1, null)) {
                Context context = getContext();
                s.j(context, "getContext(...)");
                if (com.swmansion.gesturehandler.react.a.c(context)) {
                    m mVarO = o();
                    if (mVarO != null) {
                        mVarO.h(this);
                    }
                } else if (this.receivedKeyEvent) {
                    m mVarO2 = o();
                    if (mVarO2 != null) {
                        mVarO2.h(this);
                    }
                    this.receivedKeyEvent = false;
                }
                if (f55386w == this) {
                    r();
                    f55386w = null;
                    return super.performClick();
                }
            }
            return false;
        }

        @Override // android.view.View
        public void setBackgroundColor(int color) {
            this.buttonBackgroundColor = color;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderBottomLeftRadius(float f11) {
            this.borderBottomLeftRadius = f11 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderBottomRightRadius(float f11) {
            this.borderBottomRightRadius = f11 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderColor(Integer num) {
            this.borderColor = num;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderRadius(float f11) {
            this.borderRadius = f11 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderStyle(String str) {
            this.borderStyle = str;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderTopLeftRadius(float f11) {
            this.borderTopLeftRadius = f11 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderTopRightRadius(float f11) {
            this.borderTopRightRadius = f11 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderWidth(float f11) {
            this.borderWidth = f11 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setExclusive(boolean z11) {
            this.exclusive = z11;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0017  */
        @Override // android.view.View
        public void setPressed(boolean pressed) {
            boolean z11;
            if (!this.exclusive) {
                a aVar = f55385v;
                z11 = (aVar == null || !aVar.exclusive) && !q(this, null, 1, null);
            }
            if (!pressed || f55385v == this || z11) {
                this.isTouched = pressed;
                super.setPressed(pressed);
            }
            if (pressed || f55385v != this) {
                return;
            }
            this.isTouched = false;
        }

        public final void setRippleColor(Integer num) {
            this.rippleColor = num;
            this.needBackgroundUpdate = true;
        }

        public final void setRippleRadius(Integer num) {
            this.rippleRadius = num;
            this.needBackgroundUpdate = true;
        }

        public final void setTouched(boolean z11) {
            this.isTouched = z11;
        }

        public final void setUseBorderlessDrawable(boolean z11) {
            this.useBorderlessDrawable = z11;
        }

        public final void setUseDrawableOnForeground(boolean z11) {
            this.useDrawableOnForeground = z11;
            this.needBackgroundUpdate = true;
        }

        public final void t() {
            if (this.needBackgroundUpdate) {
                this.needBackgroundUpdate = false;
                if (this.buttonBackgroundColor == 0) {
                    setBackground(null);
                }
                setForeground(null);
                Drawable drawableM = m();
                Drawable drawableL = l();
                if (getHasBorderRadii() && (drawableM instanceof RippleDrawable)) {
                    PaintDrawable paintDrawable = new PaintDrawable(-1);
                    paintDrawable.setCornerRadii(j());
                    ((RippleDrawable) drawableM).setDrawableByLayerId(R.id.mask, paintDrawable);
                }
                if (this.useDrawableOnForeground) {
                    setForeground(drawableM);
                    int i11 = this.buttonBackgroundColor;
                    if (i11 != 0) {
                        u(i11, drawableL, null);
                        return;
                    }
                    return;
                }
                int i12 = this.buttonBackgroundColor;
                if (i12 == 0 && this.rippleColor == null) {
                    setBackground(new LayerDrawable(new Drawable[]{drawableM, drawableL}));
                } else {
                    u(i12, drawableL, drawableM);
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(v0 context) {
        s.k(context, "context");
        return new a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a view) {
        s.k(view, "view");
        super.onAfterUpdateTransaction(view);
        view.t();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(name = "backgroundColor")
    public void setBackgroundColor(a view, int backgroundColor) {
        s.k(view, "view");
        view.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(name = Snapshot.BORDER_BOTTOM_LEFT_RADIUS)
    public void setBorderBottomLeftRadius(a view, float borderBottomLeftRadius) {
        s.k(view, "view");
        view.setBorderBottomLeftRadius(borderBottomLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(name = Snapshot.BORDER_BOTTOM_RIGHT_RADIUS)
    public void setBorderBottomRightRadius(a view, float borderBottomRightRadius) {
        s.k(view, "view");
        view.setBorderBottomRightRadius(borderBottomRightRadius);
    }

    @Override // vo.q
    @no.a(name = "borderColor")
    public void setBorderColor(a view, Integer borderColor) {
        s.k(view, "view");
        view.setBorderColor(borderColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(name = Snapshot.BORDER_RADIUS)
    public void setBorderRadius(a view, float borderRadius) {
        s.k(view, "view");
        view.setBorderRadius(borderRadius);
    }

    @Override // vo.q
    @no.a(name = "borderStyle")
    public void setBorderStyle(a view, String borderStyle) {
        s.k(view, "view");
        view.setBorderStyle(borderStyle);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(name = Snapshot.BORDER_TOP_LEFT_RADIUS)
    public void setBorderTopLeftRadius(a view, float borderTopLeftRadius) {
        s.k(view, "view");
        view.setBorderTopLeftRadius(borderTopLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(name = Snapshot.BORDER_TOP_RIGHT_RADIUS)
    public void setBorderTopRightRadius(a view, float borderTopRightRadius) {
        s.k(view, "view");
        view.setBorderTopRightRadius(borderTopRightRadius);
    }

    @Override // vo.q
    @no.a(name = "borderWidth")
    public void setBorderWidth(a view, float borderWidth) {
        s.k(view, "view");
        view.setBorderWidth(borderWidth);
    }

    @Override // vo.q
    @no.a(name = "borderless")
    public void setBorderless(a view, boolean useBorderlessDrawable) {
        s.k(view, "view");
        view.setUseBorderlessDrawable(useBorderlessDrawable);
    }

    @Override // vo.q
    @no.a(name = "enabled")
    public void setEnabled(a view, boolean enabled) {
        s.k(view, "view");
        view.setEnabled(enabled);
    }

    @Override // vo.q
    @no.a(name = "exclusive")
    public void setExclusive(a view, boolean exclusive) {
        s.k(view, "view");
        view.setExclusive(exclusive);
    }

    @Override // vo.q
    @no.a(name = "foreground")
    @TargetApi(23)
    public void setForeground(a view, boolean useDrawableOnForeground) {
        s.k(view, "view");
        view.setUseDrawableOnForeground(useDrawableOnForeground);
    }

    @Override // vo.q
    @no.a(name = "rippleColor")
    public void setRippleColor(a view, Integer rippleColor) {
        s.k(view, "view");
        view.setRippleColor(rippleColor);
    }

    @Override // vo.q
    @no.a(name = "rippleRadius")
    public void setRippleRadius(a view, int rippleRadius) {
        s.k(view, "view");
        view.setRippleRadius(Integer.valueOf(rippleRadius));
    }

    @Override // vo.q
    @no.a(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(a view, boolean touchSoundDisabled) {
        s.k(view, "view");
        view.setSoundEffectsEnabled(!touchSoundDisabled);
    }
}

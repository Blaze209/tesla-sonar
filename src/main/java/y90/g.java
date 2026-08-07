package y90;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.gesturehandler.core.GestureHandler;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 j2\u00020\u0001:\u0001NB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\fJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u0016J\u001f\u0010&\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b(\u0010$J'\u0010-\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J/\u00102\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b4\u0010\u001cJ/\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b6\u00107J/\u00108\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b8\u00103J\u0017\u00109\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b9\u0010$J\u0017\u0010:\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b:\u0010$J\u0015\u0010;\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b;\u0010<J\u001d\u0010>\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010=2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b>\u0010?J%\u0010B\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020+2\u0006\u0010A\u001a\u00020+¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0010¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\bF\u0010GJ\u001f\u0010J\u001a\u00020H2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010Z\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bV\u0010YR$\u0010^\u001a\u0012\u0012\u0004\u0012\u00020\u000e0=j\b\u0012\u0004\u0012\u00020\u000e`[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R$\u0010_\u001a\u0012\u0012\u0004\u0012\u00020\u000e0=j\b\u0012\u0004\u0012\u00020\u000e`[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010]R$\u0010a\u001a\u0012\u0012\u0004\u0012\u00020\u000e0=j\b\u0012\u0004\u0012\u00020\u000e`[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010]R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020+0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010cR\u0016\u0010f\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010eR\u0016\u0010g\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0016\u0010h\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010eR\u0016\u0010i\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00100¨\u0006k"}, d2 = {"Ly90/g;", "", "Landroid/view/ViewGroup;", "wrapperView", "Ly90/h;", "handlerRegistry", "Ly90/p;", "viewConfigHelper", "<init>", "(Landroid/view/ViewGroup;Ly90/h;Ly90/p;)V", "Ljn0/h0;", "E", "()V", "l", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "", "u", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Z", "H", "G", Gender.MALE, "(Lcom/swmansion/gesturehandler/core/GestureHandler;)V", "k", "z", "Landroid/view/MotionEvent;", "event", "o", "(Landroid/view/MotionEvent;)V", "j", "sourceEvent", "n", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Landroid/view/MotionEvent;)V", "Landroid/view/View;", "view", "x", "(Landroid/view/View;)Z", "h", "C", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Landroid/view/View;)V", "y", "", "coords", "", "pointerId", "p", "(Landroid/view/View;[FI)Z", "action", "I", "(Lcom/swmansion/gesturehandler/core/GestureHandler;I)Z", "D", "(Landroid/view/View;[FILandroid/view/MotionEvent;)Z", "q", "viewGroup", "r", "(Landroid/view/ViewGroup;[FILandroid/view/MotionEvent;)Z", "L", IntegerTokenConverter.CONVERTER_KEY, "w", "B", "(Landroid/view/MotionEvent;)Z", "Ljava/util/ArrayList;", "s", "(Landroid/view/View;)Ljava/util/ArrayList;", "newState", "prevState", "A", "(Lcom/swmansion/gesturehandler/core/GestureHandler;II)V", "v", "()Z", "J", "(Landroid/view/View;Landroid/view/MotionEvent;)Landroid/view/MotionEvent;", "Landroid/graphics/PointF;", "point", "K", "(Landroid/view/View;Landroid/graphics/PointF;)Landroid/graphics/PointF;", "f", "(Landroid/view/View;)V", "a", "Landroid/view/ViewGroup;", "b", "Ly90/h;", "c", "Ly90/p;", "", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "getMinimumAlphaForTraversal", "()F", "(F)V", "minimumAlphaForTraversal", "Lkotlin/collections/ArrayList;", "e", "Ljava/util/ArrayList;", "gestureHandlers", "awaitingHandlers", "g", "preparedHandlers", "Ljava/util/HashSet;", "Ljava/util/HashSet;", "awaitingHandlersTags", "Z", "isHandlingTouch", "handlingChangeSemaphore", "finishedHandlersCleanupScheduled", "activationIndex", "m", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PointF f125287n = new PointF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float[] f125288o = new float[2];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Matrix f125289p = new Matrix();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float[] f125290q = new float[2];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Comparator<GestureHandler> f125291r = new Comparator() { // from class: y90.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return g.t((GestureHandler) obj, (GestureHandler) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup wrapperView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h handlerRegistry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p viewConfigHelper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float minimumAlphaForTraversal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<GestureHandler> gestureHandlers;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<GestureHandler> awaitingHandlers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<GestureHandler> preparedHandlers;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final HashSet<Integer> awaitingHandlersTags;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isHandlingTouch;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int handlingChangeSemaphore;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean finishedHandlersCleanupScheduled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int activationIndex;

    /* JADX INFO: renamed from: y90.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001cJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Ly90/g$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "coords", "", "m", "(Landroid/view/View;[F)Z", "", "x", "y", "Landroid/view/ViewGroup;", "parent", "child", "Landroid/graphics/PointF;", "outLocalPoint", "Ljn0/h0;", "n", "(FFLandroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/PointF;)V", "j", "(FFLandroid/view/View;)Z", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "other", "l", "(Lcom/swmansion/gesturehandler/core/GestureHandler;Lcom/swmansion/gesturehandler/core/GestureHandler;)Z", "a", "b", "h", "k", "", "state", IntegerTokenConverter.CONVERTER_KEY, "(I)Z", "DEFAULT_MIN_ALPHA_FOR_TRAVERSAL", Gender.FEMALE, "tempPoint", "Landroid/graphics/PointF;", "matrixTransformCoords", "[F", "Landroid/graphics/Matrix;", "inverseMatrix", "Landroid/graphics/Matrix;", "tempCoords", "Ljava/util/Comparator;", "handlersComparator", "Ljava/util/Comparator;", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean h(GestureHandler a11, GestureHandler b11) {
            return a11 == b11 || a11.L0(b11) || b11.L0(a11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean i(int state) {
            return state == 3 || state == 1 || state == 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float x11, float y11, View child) {
            return BitmapDescriptorFactory.HUE_RED <= x11 && x11 <= ((float) child.getWidth()) && BitmapDescriptorFactory.HUE_RED <= y11 && y11 <= ((float) child.getHeight());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(GestureHandler handler, GestureHandler other) {
            if (!handler.Y(other) || h(handler, other)) {
                return false;
            }
            if (handler == other) {
                return true;
            }
            if (handler.getIsAwaiting() || handler.getState() == 4) {
                return handler.K0(other);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l(GestureHandler handler, GestureHandler other) {
            if (handler != other) {
                return handler.N0(other) || other.M0(handler);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(View view, float[] coords) {
            return !((view instanceof ViewGroup) && view.getBackground() == null) && j(coords[0], coords[1], view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n(float x11, float y11, ViewGroup parent, View child, PointF outLocalPoint) {
            float scrollX = (x11 + parent.getScrollX()) - child.getLeft();
            float scrollY = (y11 + parent.getScrollY()) - child.getTop();
            Matrix matrix = child.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = g.f125288o;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(g.f125289p);
                g.f125289p.mapPoints(fArr);
                float f11 = fArr[0];
                scrollY = fArr[1];
                scrollX = f11;
            }
            outLocalPoint.set(scrollX, scrollY);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125304a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.BOX_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f125304a = iArr;
        }
    }

    public g(ViewGroup wrapperView, h handlerRegistry, p viewConfigHelper) {
        s.k(wrapperView, "wrapperView");
        s.k(handlerRegistry, "handlerRegistry");
        s.k(viewConfigHelper, "viewConfigHelper");
        this.wrapperView = wrapperView;
        this.handlerRegistry = handlerRegistry;
        this.viewConfigHelper = viewConfigHelper;
        this.gestureHandlers = new ArrayList<>();
        this.awaitingHandlers = new ArrayList<>();
        this.preparedHandlers = new ArrayList<>();
        this.awaitingHandlersTags = new HashSet<>();
    }

    private final void C(GestureHandler handler, View view) {
        if (this.gestureHandlers.contains(handler)) {
            return;
        }
        this.gestureHandlers.add(handler);
        handler.w0(false);
        handler.x0(false);
        handler.v0(Integer.MAX_VALUE);
        handler.q0(view, this);
    }

    private final boolean D(View view, float[] coords, int pointerId, MotionEvent event) {
        boolean z11;
        ArrayList<GestureHandler> arrayListA = this.handlerRegistry.a(view);
        if (arrayListA != null) {
            synchronized (arrayListA) {
                try {
                    Iterator<GestureHandler> it = arrayListA.iterator();
                    s.j(it, "iterator(...)");
                    z11 = false;
                    while (it.hasNext()) {
                        GestureHandler next = it.next();
                        if (next.getIsEnabled() && next.g0(view, coords[0], coords[1]) && !I(next, event.getAction())) {
                            C(next, view);
                            next.O0(pointerId);
                            z11 = true;
                        }
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            z11 = false;
        }
        float width = view.getWidth();
        float f11 = coords[0];
        if (BitmapDescriptorFactory.HUE_RED <= f11 && f11 <= width) {
            float height = view.getHeight();
            float f12 = coords[1];
            if (BitmapDescriptorFactory.HUE_RED <= f12 && f12 <= height && y(view) && p(view, coords, pointerId)) {
                return true;
            }
        }
        return z11;
    }

    private final void E() {
        if (this.isHandlingTouch || this.handlingChangeSemaphore != 0) {
            this.finishedHandlersCleanupScheduled = true;
        } else {
            l();
        }
    }

    private final boolean G(GestureHandler handler) {
        ArrayList<GestureHandler> arrayList = this.gestureHandlers;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (GestureHandler gestureHandler : arrayList) {
            if (handler.Y(gestureHandler) && gestureHandler.getState() == 4 && !INSTANCE.h(handler, gestureHandler) && handler.c0(gestureHandler)) {
                return true;
            }
        }
        return false;
    }

    private final boolean H(GestureHandler handler) {
        ArrayList<GestureHandler> arrayList = this.gestureHandlers;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (GestureHandler gestureHandler : arrayList) {
            if (INSTANCE.l(handler, gestureHandler) && gestureHandler.getState() == 5) {
                return true;
            }
        }
        return false;
    }

    private final boolean I(GestureHandler handler, int action) {
        return ((handler instanceof com.swmansion.gesturehandler.core.b) || (handler instanceof com.swmansion.gesturehandler.react.l.b) || !v.p(10, 9, 7).contains(Integer.valueOf(action))) ? false : true;
    }

    private final boolean L(View view, float[] coords, int pointerId, MotionEvent event) {
        int i11 = b.f125304a[this.viewConfigHelper.c(view).ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return D(view, coords, pointerId, event) || INSTANCE.m(view, coords);
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return D(view, coords, pointerId, event) || (view instanceof ViewGroup ? r((ViewGroup) view, coords, pointerId, event) : false) || INSTANCE.m(view, coords);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(view instanceof ViewGroup)) {
            if (view instanceof EditText) {
                return D(view, coords, pointerId, event);
            }
            return false;
        }
        boolean zR = r((ViewGroup) view, coords, pointerId, event);
        if (zR) {
            D(view, coords, pointerId, event);
        }
        return zR;
    }

    private final void M(GestureHandler handler) {
        if (H(handler) || G(handler)) {
            handler.q();
        } else if (u(handler)) {
            h(handler);
        } else {
            z(handler);
            handler.x0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 g(GestureHandler gestureHandler) {
        gestureHandler.p();
        gestureHandler.k();
        gestureHandler.B();
        return h0.f84049a;
    }

    private final void h(GestureHandler handler) {
        if (this.awaitingHandlers.contains(handler)) {
            return;
        }
        this.awaitingHandlers.add(handler);
        this.awaitingHandlersTags.add(Integer.valueOf(handler.getTag()));
        handler.x0(true);
        int i11 = this.activationIndex;
        this.activationIndex = i11 + 1;
        handler.v0(i11);
    }

    private final boolean i(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.minimumAlphaForTraversal;
    }

    private final void j() {
        Iterator it = v.m1(v.W(this.awaitingHandlers)).iterator();
        while (it.hasNext()) {
            ((GestureHandler) it.next()).q();
        }
        this.preparedHandlers.clear();
        this.preparedHandlers.addAll(this.gestureHandlers);
        Iterator it2 = v.W(this.gestureHandlers).iterator();
        while (it2.hasNext()) {
            ((GestureHandler) it2.next()).q();
        }
    }

    private final void k() {
        for (GestureHandler gestureHandler : v.m1(this.awaitingHandlers)) {
            if (!gestureHandler.getIsAwaiting()) {
                this.awaitingHandlers.remove(gestureHandler);
                this.awaitingHandlersTags.remove(Integer.valueOf(gestureHandler.getTag()));
            }
        }
    }

    private final void l() {
        for (GestureHandler gestureHandler : v.W(this.gestureHandlers)) {
            if (INSTANCE.i(gestureHandler.getState()) && !gestureHandler.getIsAwaiting()) {
                gestureHandler.r0();
                gestureHandler.w0(false);
                gestureHandler.x0(false);
                gestureHandler.v0(Integer.MAX_VALUE);
            }
        }
        v.L(this.gestureHandlers, new wn0.l() { // from class: y90.e
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(g.m((GestureHandler) obj));
            }
        });
        this.finishedHandlersCleanupScheduled = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(GestureHandler it) {
        s.k(it, "it");
        return INSTANCE.i(it.getState()) && !it.getIsAwaiting();
    }

    private final void n(GestureHandler handler, MotionEvent sourceEvent) {
        if (!x(handler.getView())) {
            handler.q();
            return;
        }
        if (handler.S0(sourceEvent)) {
            int actionMasked = sourceEvent.getActionMasked();
            View view = handler.getView();
            MotionEvent motionEventObtain = MotionEvent.obtain(sourceEvent);
            s.j(motionEventObtain, "obtain(...)");
            MotionEvent motionEventJ = J(view, motionEventObtain);
            if (handler.getNeedsPointerData() && handler.getState() != 0) {
                handler.R0(motionEventJ, sourceEvent);
            }
            if (!handler.getIsAwaiting() || actionMasked != 2) {
                boolean z11 = handler.getState() == 0;
                handler.X(motionEventJ, sourceEvent);
                if (handler.getIsActive()) {
                    if (handler.getShouldResetProgress()) {
                        handler.H0(false);
                        handler.t0();
                    }
                    handler.v(motionEventJ);
                }
                if (handler.getNeedsPointerData() && z11) {
                    handler.R0(motionEventJ, sourceEvent);
                }
                if (actionMasked == 1 || actionMasked == 6 || actionMasked == 10) {
                    handler.P0(motionEventJ.getPointerId(motionEventJ.getActionIndex()));
                }
            }
            motionEventJ.recycle();
        }
    }

    private final void o(MotionEvent event) {
        this.preparedHandlers.clear();
        this.preparedHandlers.addAll(this.gestureHandlers);
        v.C(this.preparedHandlers, f125291r);
        Iterator<GestureHandler> it = this.preparedHandlers.iterator();
        s.j(it, "iterator(...)");
        while (it.hasNext()) {
            n(it.next(), event);
        }
    }

    private final boolean p(View view, float[] coords, int pointerId) {
        boolean z11 = false;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ArrayList<GestureHandler> arrayListA = this.handlerRegistry.a((View) parent);
                if (arrayListA != null) {
                    synchronized (arrayListA) {
                        try {
                            Iterator<GestureHandler> it = arrayListA.iterator();
                            s.j(it, "iterator(...)");
                            while (it.hasNext()) {
                                GestureHandler next = it.next();
                                if (next.getIsEnabled() && next.g0(view, coords[0], coords[1])) {
                                    C(next, viewGroup);
                                    next.O0(pointerId);
                                    z11 = true;
                                }
                            }
                            h0 h0Var = h0.f84049a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return z11;
    }

    private final void q(MotionEvent event) {
        int actionIndex = event.getActionIndex();
        int pointerId = event.getPointerId(actionIndex);
        float[] fArr = f125290q;
        fArr[0] = event.getX(actionIndex);
        fArr[1] = event.getY(actionIndex);
        L(this.wrapperView, fArr, pointerId, event);
        r(this.wrapperView, fArr, pointerId, event);
    }

    private final boolean r(ViewGroup viewGroup, float[] coords, int pointerId, MotionEvent event) {
        ViewGroup viewGroup2;
        int childCount = viewGroup.getChildCount() - 1;
        while (-1 < childCount) {
            View viewB = this.viewConfigHelper.b(viewGroup, childCount);
            if (i(viewB)) {
                PointF pointF = f125287n;
                Companion companion = INSTANCE;
                viewGroup2 = viewGroup;
                companion.n(coords[0], coords[1], viewGroup2, viewB, pointF);
                float f11 = coords[0];
                float f12 = coords[1];
                coords[0] = pointF.x;
                coords[1] = pointF.y;
                boolean zL = (!w(viewB) || companion.j(coords[0], coords[1], viewB)) ? L(viewB, coords, pointerId, event) : false;
                coords[0] = f11;
                coords[1] = f12;
                if (zL) {
                    return true;
                }
            } else {
                viewGroup2 = viewGroup;
            }
            childCount--;
            viewGroup = viewGroup2;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(GestureHandler gestureHandler, GestureHandler gestureHandler2) {
        if ((gestureHandler.getIsActive() && gestureHandler2.getIsActive()) || (gestureHandler.getIsAwaiting() && gestureHandler2.getIsAwaiting())) {
            return Integer.signum(gestureHandler2.getActivationIndex() - gestureHandler.getActivationIndex());
        }
        if (gestureHandler.getIsActive()) {
            return -1;
        }
        if (gestureHandler2.getIsActive()) {
            return 1;
        }
        if (gestureHandler.getIsAwaiting()) {
            return -1;
        }
        return gestureHandler2.getIsAwaiting() ? 1 : 0;
    }

    private final boolean u(GestureHandler handler) {
        ArrayList<GestureHandler> arrayList = this.gestureHandlers;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (GestureHandler gestureHandler : arrayList) {
            Companion companion = INSTANCE;
            if (!companion.i(gestureHandler.getState()) && companion.l(handler, gestureHandler)) {
                return true;
            }
        }
        return false;
    }

    private final boolean w(View view) {
        return !(view instanceof ViewGroup) || this.viewConfigHelper.a((ViewGroup) view);
    }

    private final boolean x(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.wrapperView) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.wrapperView) {
            parent = parent.getParent();
        }
        return parent == this.wrapperView;
    }

    private final boolean y(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = f125288o;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        return left < BitmapDescriptorFactory.HUE_RED || left + ((float) view.getWidth()) > ((float) viewGroup.getWidth()) || top < BitmapDescriptorFactory.HUE_RED || top + ((float) view.getHeight()) > ((float) viewGroup.getHeight());
    }

    private final void z(GestureHandler handler) {
        int state = handler.getState();
        handler.x0(false);
        handler.w0(true);
        handler.H0(true);
        int i11 = this.activationIndex;
        this.activationIndex = i11 + 1;
        handler.v0(i11);
        for (GestureHandler gestureHandler : v.W(this.gestureHandlers)) {
            if (INSTANCE.k(gestureHandler, handler)) {
                gestureHandler.q();
            }
        }
        for (GestureHandler gestureHandler2 : v.W(this.awaitingHandlers)) {
            if (INSTANCE.k(gestureHandler2, handler)) {
                gestureHandler2.x0(false);
            }
        }
        k();
        if (state == 1 || state == 3) {
            return;
        }
        handler.w(4, 2);
        if (state != 4) {
            handler.w(5, 4);
            if (state != 5) {
                handler.w(0, 5);
            }
        }
    }

    public final void A(GestureHandler handler, int newState, int prevState) {
        s.k(handler, "handler");
        this.handlingChangeSemaphore++;
        if (INSTANCE.i(newState)) {
            for (GestureHandler gestureHandler : v.m1(this.awaitingHandlers)) {
                if (INSTANCE.l(gestureHandler, handler) && this.awaitingHandlersTags.contains(Integer.valueOf(gestureHandler.getTag()))) {
                    if (newState == 5) {
                        gestureHandler.q();
                        if (gestureHandler.getState() == 5) {
                            gestureHandler.w(3, 2);
                        }
                        gestureHandler.x0(false);
                    } else {
                        M(gestureHandler);
                    }
                }
            }
            k();
        }
        if (newState == 4) {
            M(handler);
        } else if (prevState == 4 || prevState == 5) {
            if (handler.getIsActive()) {
                handler.w(newState, prevState);
            } else if (prevState == 4 && (newState == 3 || newState == 1)) {
                handler.w(newState, 2);
            }
        } else if (prevState != 0 || newState != 3) {
            handler.w(newState, prevState);
        }
        this.handlingChangeSemaphore--;
        E();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    public final boolean B(MotionEvent event) {
        s.k(event, "event");
        this.isHandlingTouch = true;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            q(event);
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5 || actionMasked == 7) {
            q(event);
        }
        o(event);
        this.isHandlingTouch = false;
        if (this.finishedHandlersCleanupScheduled && this.handlingChangeSemaphore == 0) {
            l();
        }
        return true;
    }

    public final void F(float f11) {
        this.minimumAlphaForTraversal = f11;
    }

    public final MotionEvent J(View view, MotionEvent event) {
        s.k(event, "event");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!s.f(viewGroup, this.wrapperView)) {
                J(viewGroup, event);
            }
            if (viewGroup != null) {
                event.setLocation((event.getX() + viewGroup.getScrollX()) - view.getLeft(), (event.getY() + viewGroup.getScrollY()) - view.getTop());
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = f125289p;
                matrix.invert(matrix2);
                event.transform(matrix2);
            }
        }
        return event;
    }

    public final PointF K(View view, PointF point) {
        s.k(point, "point");
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (!s.f(viewGroup, this.wrapperView)) {
                K(viewGroup, point);
            }
            if (viewGroup != null) {
                point.x += viewGroup.getScrollX() - view.getLeft();
                point.y += viewGroup.getScrollY() - view.getTop();
            }
            if (!view.getMatrix().isIdentity()) {
                Matrix matrix = view.getMatrix();
                Matrix matrix2 = f125289p;
                matrix.invert(matrix2);
                float[] fArr = f125290q;
                fArr[0] = point.x;
                fArr[1] = point.y;
                matrix2.mapPoints(fArr);
                point.x = fArr[0];
                point.y = fArr[1];
            }
        }
        return point;
    }

    public final void f(View view) {
        s.k(view, "view");
        ArrayList<GestureHandler> arrayListA = this.handlerRegistry.a(view);
        if (arrayListA != null) {
            for (final GestureHandler gestureHandler : arrayListA) {
                if (gestureHandler instanceof com.swmansion.gesturehandler.core.e) {
                    C(gestureHandler, view);
                    gestureHandler.T0(new wn0.a() { // from class: y90.f
                        @Override // wn0.a
                        public final Object invoke() {
                            return g.g(gestureHandler);
                        }
                    });
                }
            }
        }
    }

    public final ArrayList<GestureHandler> s(View view) {
        s.k(view, "view");
        return this.handlerRegistry.a(view);
    }

    public final boolean v() {
        ArrayList<GestureHandler> arrayList = this.gestureHandlers;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (((GestureHandler) it.next()).getState() == 4) {
                return true;
            }
        }
        return false;
    }
}

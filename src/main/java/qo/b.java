package qo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import co0.m;
import com.facebook.react.uimanager.t0;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.z;
import p013kotlin.properties.ObservableProperty;
import so.BorderRadiusStyle;
import so.ColorEdges;
import so.ComputedBorderRadius;
import so.CornerRadii;
import so.n;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJO\u0010'\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010(J_\u00102\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u0014H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u001aH\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001eH\u0002¢\u0006\u0004\b;\u0010<J!\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010=\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b?\u0010@JW\u0010L\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020A2\u0006\u0010E\u001a\u00020A2\u0006\u0010F\u001a\u00020A2\u0006\u0010G\u001a\u00020A2\u0006\u0010H\u001a\u00020A2\u0006\u0010I\u001a\u00020A2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u001aH\u0002¢\u0006\u0004\bN\u0010:J\u001f\u0010Q\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020\u001eH\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u001aH\u0016¢\u0006\u0004\bS\u0010:J\u0017\u0010V\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020TH\u0014¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u001a2\u0006\u0010X\u001a\u00020\u001eH\u0016¢\u0006\u0004\bY\u0010<J\u0019\u0010\\\u001a\u00020\u001a2\b\u0010[\u001a\u0004\u0018\u00010ZH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u001eH\u0017¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b`\u0010\u001cJ\u001d\u0010c\u001a\u00020\u001a2\u0006\u0010a\u001a\u00020\u001e2\u0006\u0010b\u001a\u00020\u0014¢\u0006\u0004\bc\u0010dJ\u001f\u0010f\u001a\u00020\u001a2\u0006\u0010a\u001a\u00020e2\b\u0010O\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\bf\u0010gJ\u0015\u0010h\u001a\u00020\u001e2\u0006\u0010a\u001a\u00020e¢\u0006\u0004\bh\u0010iR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u0010l\u001a\u0004\bm\u0010nR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR/\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010y\u001a\u0004\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u0080\u0001R\u0019\u0010\u0084\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bh\u0010\u0083\u0001R\u001b\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b{\u0010\u0086\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bL\u0010\u0088\u0001R\u0016\u0010\u008b\u0001\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0007\n\u0005\b7\u0010\u008a\u0001R\u001b\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010\u008d\u0001R\u0017\u0010\u0091\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010\u0090\u0001R\u0019\u0010\u0094\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u0093\u0001R\u001b\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bQ\u0010\u008d\u0001R\u001b\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bf\u0010\u008d\u0001R\u001b\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bw\u0010\u008d\u0001R\u001b\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\br\u0010\u008d\u0001R/\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u008c\u00012\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b}\u0010\u008d\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001a\u0010\u009e\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bc\u0010\u009d\u0001R\u001a\u0010\u009f\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bN\u0010\u009d\u0001R\u001a\u0010 \u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b9\u0010\u009d\u0001R\u001a\u0010¡\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010\u009d\u0001R\u001b\u0010¤\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001b\u0010¦\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010£\u0001R\u001b\u0010¨\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010£\u0001¨\u0006©\u0001"}, d2 = {"Lqo/b;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/uimanager/t0;", "borderWidth", "Lso/e;", Snapshot.BORDER_RADIUS, "Lso/c;", "borderInsets", "Lso/f;", "borderStyle", "<init>", "(Landroid/content/Context;Lcom/facebook/react/uimanager/t0;Lso/e;Lso/c;Lso/f;)V", "T", "initialValue", "Lkotlin/properties/d;", "", "m", "(Ljava/lang/Object;)Lkotlin/properties/d;", "", "computedRadius", "k", "(FF)F", "Landroid/graphics/Canvas;", "canvas", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/graphics/Canvas;)V", "e", "", "borderLeft", "borderTop", "borderRight", "borderBottom", "colorLeft", "colorTop", "colorRight", "colorBottom", "f", "(IIIIIIII)I", "fillColor", "x1", "y1", "x2", "y2", "x3", "y3", "x4", "y4", "c", "(Landroid/graphics/Canvas;IFFFFFFFF)V", "Landroid/graphics/RectF;", "b", "()Landroid/graphics/RectF;", "j", "()F", "u", "()V", "v", "(I)V", "style", "Landroid/graphics/PathEffect;", "l", "(Lso/f;F)Landroid/graphics/PathEffect;", "", "ellipseBoundsLeft", "ellipseBoundsTop", "ellipseBoundsRight", "ellipseBoundsBottom", "lineStartX", "lineStartY", "lineEndX", "lineEndY", "Landroid/graphics/PointF;", "result", IntegerTokenConverter.CONVERTER_KEY, "(DDDDDDDDLandroid/graphics/PointF;)V", "t", "color", "rawAlpha", "n", "(II)I", "invalidateSelf", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "alpha", "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "draw", "position", Snapshot.WIDTH, "s", "(IF)V", "Lso/n;", "o", "(Lso/n;Ljava/lang/Integer;)V", "g", "(Lso/n;)I", "a", "Landroid/content/Context;", "Lcom/facebook/react/uimanager/t0;", "getBorderWidth", "()Lcom/facebook/react/uimanager/t0;", "Lso/e;", "getBorderRadius", "()Lso/e;", "q", "(Lso/e;)V", "Lso/c;", "getBorderInsets", "()Lso/c;", "p", "(Lso/c;)V", "<set-?>", "Lkotlin/properties/d;", "h", "()Lso/f;", "r", "(Lso/f;)V", "Lso/b;", "[Ljava/lang/Integer;", "borderColors", "Lso/h;", "Lso/h;", "computedBorderColors", "Lso/j;", "Lso/j;", "computedBorderRadius", "I", "borderAlpha", Gender.FEMALE, "gapBetweenPaths", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "pathForBorder", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "borderPaint", "", "Z", "needUpdatePath", "pathForSingleBorder", "pathForOutline", "centerDrawPath", "outerClipPathForBorderRadius", "value", "getInnerClipPathForBorderRadius", "()Landroid/graphics/Path;", "innerClipPathForBorderRadius", "Landroid/graphics/PointF;", "innerBottomLeftCorner", "innerBottomRightCorner", "innerTopLeftCorner", "innerTopRightCorner", "w", "Landroid/graphics/RectF;", "innerClipTempRectForBorderRadius", "x", "outerClipTempRectForBorderRadius", "y", "tempRectForCenterDrawPath", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends Drawable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f105703z = {o0.f(new z(b.class, "borderStyle", "getBorderStyle()Lcom/facebook/react/uimanager/style/BorderStyle;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t0 borderWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BorderRadiusStyle borderRadius;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private so.c borderInsets;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d borderStyle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Integer[] borderColors;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ColorEdges computedBorderColors;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ComputedBorderRadius computedBorderRadius;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int borderAlpha;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float gapBetweenPaths;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Path pathForBorder;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Paint borderPaint;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean needUpdatePath;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Path pathForSingleBorder;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Path pathForOutline;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Path centerDrawPath;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Path outerClipPathForBorderRadius;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Path innerClipPathForBorderRadius;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private PointF innerBottomLeftCorner;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private PointF innerBottomRightCorner;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private PointF innerTopLeftCorner;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private PointF innerTopRightCorner;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private RectF innerClipTempRectForBorderRadius;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private RectF outerClipTempRectForBorderRadius;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private RectF tempRectForCenterDrawPath;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105729a;

        static {
            int[] iArr = new int[so.f.values().length];
            try {
                iArr[so.f.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[so.f.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[so.f.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f105729a = iArr;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: qo.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"qo/b$b", "Lkotlin/properties/b;", "Lco0/m;", "property", "oldValue", "newValue", "Ljn0/h0;", "afterChange", "(Lco0/m;Ljava/lang/Object;Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2245b<T> extends ObservableProperty<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f105730a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2245b(T t11, b bVar) {
            super(t11);
            this.f105730a = bVar;
        }

        @Override // p013kotlin.properties.ObservableProperty
        protected void afterChange(m<?> property, T oldValue, T newValue) {
            s.k(property, "property");
            if (s.f(oldValue, newValue)) {
                return;
            }
            this.f105730a.needUpdatePath = true;
            this.f105730a.invalidateSelf();
        }
    }

    public b(Context context, t0 t0Var, BorderRadiusStyle borderRadiusStyle, so.c cVar, so.f fVar) {
        s.k(context, "context");
        this.context = context;
        this.borderWidth = t0Var;
        this.borderRadius = borderRadiusStyle;
        this.borderInsets = cVar;
        this.borderStyle = m(fVar);
        this.computedBorderColors = new ColorEdges(0, 0, 0, 0, 15, null);
        this.borderAlpha = 255;
        this.gapBetweenPaths = 0.8f;
        this.borderPaint = new Paint(1);
        this.needUpdatePath = true;
    }

    private final RectF b() {
        RectF rectFA;
        so.c cVar = this.borderInsets;
        float fB = BitmapDescriptorFactory.HUE_RED;
        if (cVar == null || (rectFA = cVar.a(getLayoutDirection(), this.context)) == null) {
            return new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        float fB2 = Float.isNaN(rectFA.left) ? 0.0f : w.f23413a.b(rectFA.left);
        float fB3 = Float.isNaN(rectFA.top) ? 0.0f : w.f23413a.b(rectFA.top);
        float fB4 = Float.isNaN(rectFA.right) ? 0.0f : w.f23413a.b(rectFA.right);
        if (!Float.isNaN(rectFA.bottom)) {
            fB = w.f23413a.b(rectFA.bottom);
        }
        return new RectF(fB2, fB3, fB4, fB);
    }

    private final void c(Canvas canvas, int fillColor, float x11, float y11, float x12, float y12, float x13, float y13, float x14, float y14) {
        if (fillColor == 0) {
            return;
        }
        if (this.pathForBorder == null) {
            this.pathForBorder = new Path();
        }
        this.borderPaint.setColor(n(fillColor, this.borderAlpha));
        Path path = this.pathForBorder;
        if (path != null) {
            path.reset();
        }
        Path path2 = this.pathForBorder;
        if (path2 != null) {
            path2.moveTo(x11, y11);
        }
        Path path3 = this.pathForBorder;
        if (path3 != null) {
            path3.lineTo(x12, y12);
        }
        Path path4 = this.pathForBorder;
        if (path4 != null) {
            path4.lineTo(x13, y13);
        }
        Path path5 = this.pathForBorder;
        if (path5 != null) {
            path5.lineTo(x14, y14);
        }
        Path path6 = this.pathForBorder;
        if (path6 != null) {
            path6.lineTo(x11, y11);
        }
        Path path7 = this.pathForBorder;
        if (path7 != null) {
            canvas.drawPath(path7, this.borderPaint);
        }
    }

    private final void d(Canvas canvas) {
        RectF rectFB = b();
        int iD = yn0.a.d(rectFB.left);
        int iD2 = yn0.a.d(rectFB.top);
        int iD3 = yn0.a.d(rectFB.right);
        int iD4 = yn0.a.d(rectFB.bottom);
        if (iD > 0 || iD3 > 0 || iD2 > 0 || iD4 > 0) {
            Rect bounds = getBounds();
            s.j(bounds, "getBounds(...)");
            int i11 = bounds.left;
            int i12 = bounds.top;
            int iF = f(iD, iD2, iD3, iD4, this.computedBorderColors.getLeft(), this.computedBorderColors.getTop(), this.computedBorderColors.getRight(), this.computedBorderColors.getBottom());
            if (iF == 0) {
                this.borderPaint.setAntiAlias(false);
                int iWidth = bounds.width();
                int iHeight = bounds.height();
                if (iD > 0) {
                    float f11 = i11;
                    float f12 = i11 + iD;
                    int i13 = i12 + iHeight;
                    c(canvas, this.computedBorderColors.getLeft(), f11, i12, f12, i12 + iD2, f12, i13 - iD4, f11, i13);
                }
                if (iD2 > 0) {
                    float f13 = i12;
                    float f14 = i11 + iD;
                    float f15 = i12 + iD2;
                    int i14 = i11 + iWidth;
                    c(canvas, this.computedBorderColors.getTop(), i11, f13, f14, f15, i14 - iD3, f15, i14, f13);
                }
                if (iD3 > 0) {
                    int i15 = i11 + iWidth;
                    float f16 = i15;
                    int i16 = i12 + iHeight;
                    float f17 = i15 - iD3;
                    c(canvas, this.computedBorderColors.getRight(), f16, i12, f16, i16, f17, i16 - iD4, f17, i12 + iD2);
                }
                if (iD4 > 0) {
                    int i17 = i12 + iHeight;
                    float f18 = i17;
                    int i18 = i11 + iWidth;
                    float f19 = i17 - iD4;
                    c(canvas, this.computedBorderColors.getBottom(), i11, f18, i18, f18, i18 - iD3, f19, i11 + iD, f19);
                }
                this.borderPaint.setAntiAlias(true);
                return;
            }
            if (Color.alpha(iF) != 0) {
                int i19 = bounds.right;
                int i21 = bounds.bottom;
                this.borderPaint.setColor(n(iF, this.borderAlpha));
                this.borderPaint.setStyle(Paint.Style.STROKE);
                Path path = new Path();
                this.pathForSingleBorder = path;
                if (iD > 0) {
                    path.reset();
                    int iD5 = yn0.a.d(rectFB.left);
                    v(iD5);
                    this.borderPaint.setStrokeWidth(iD5);
                    Path path2 = this.pathForSingleBorder;
                    if (path2 != null) {
                        path2.moveTo((iD5 / 2) + i11, i12);
                    }
                    Path path3 = this.pathForSingleBorder;
                    if (path3 != null) {
                        path3.lineTo((iD5 / 2) + i11, i21);
                    }
                    Path path4 = this.pathForSingleBorder;
                    if (path4 != null) {
                        canvas.drawPath(path4, this.borderPaint);
                    }
                }
                if (iD2 > 0) {
                    Path path5 = this.pathForSingleBorder;
                    if (path5 != null) {
                        path5.reset();
                    }
                    int iD6 = yn0.a.d(rectFB.top);
                    v(iD6);
                    this.borderPaint.setStrokeWidth(iD6);
                    Path path6 = this.pathForSingleBorder;
                    if (path6 != null) {
                        path6.moveTo(i11, (iD6 / 2) + i12);
                    }
                    Path path7 = this.pathForSingleBorder;
                    if (path7 != null) {
                        path7.lineTo(i19, (iD6 / 2) + i12);
                    }
                    Path path8 = this.pathForSingleBorder;
                    if (path8 != null) {
                        canvas.drawPath(path8, this.borderPaint);
                    }
                }
                if (iD3 > 0) {
                    Path path9 = this.pathForSingleBorder;
                    if (path9 != null) {
                        path9.reset();
                    }
                    int iD7 = yn0.a.d(rectFB.right);
                    v(iD7);
                    this.borderPaint.setStrokeWidth(iD7);
                    Path path10 = this.pathForSingleBorder;
                    if (path10 != null) {
                        path10.moveTo(i19 - (iD7 / 2), i12);
                    }
                    Path path11 = this.pathForSingleBorder;
                    if (path11 != null) {
                        path11.lineTo(i19 - (iD7 / 2), i21);
                    }
                    Path path12 = this.pathForSingleBorder;
                    if (path12 != null) {
                        canvas.drawPath(path12, this.borderPaint);
                    }
                }
                if (iD4 > 0) {
                    Path path13 = this.pathForSingleBorder;
                    if (path13 != null) {
                        path13.reset();
                    }
                    int iD8 = yn0.a.d(rectFB.bottom);
                    v(iD8);
                    this.borderPaint.setStrokeWidth(iD8);
                    Path path14 = this.pathForSingleBorder;
                    if (path14 != null) {
                        path14.moveTo(i11, i21 - (iD8 / 2));
                    }
                    Path path15 = this.pathForSingleBorder;
                    if (path15 != null) {
                        path15.lineTo(i19, i21 - (iD8 / 2));
                    }
                    Path path16 = this.pathForSingleBorder;
                    if (path16 != null) {
                        canvas.drawPath(path16, this.borderPaint);
                    }
                }
            }
        }
    }

    private final void e(Canvas canvas) {
        PointF pointF;
        PointF pointF2;
        CornerRadii topLeft;
        CornerRadii cornerRadiiC;
        CornerRadii topLeft2;
        CornerRadii cornerRadiiC2;
        t();
        canvas.save();
        Path path = this.outerClipPathForBorderRadius;
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        canvas.clipPath(path);
        RectF rectFB = b();
        float f11 = rectFB.top;
        float vertical = BitmapDescriptorFactory.HUE_RED;
        if (f11 > BitmapDescriptorFactory.HUE_RED || rectFB.bottom > BitmapDescriptorFactory.HUE_RED || rectFB.left > BitmapDescriptorFactory.HUE_RED || rectFB.right > BitmapDescriptorFactory.HUE_RED) {
            float fJ = j();
            int iG = g(n.ALL);
            if (rectFB.top != fJ || rectFB.bottom != fJ || rectFB.left != fJ || rectFB.right != fJ || this.computedBorderColors.getLeft() != iG || this.computedBorderColors.getTop() != iG || this.computedBorderColors.getRight() != iG || this.computedBorderColors.getBottom() != iG) {
                this.borderPaint.setStyle(Paint.Style.FILL);
                if (Build.VERSION.SDK_INT >= 26) {
                    Path path2 = this.innerClipPathForBorderRadius;
                    if (path2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.clipOutPath(path2);
                } else {
                    Path path3 = this.innerClipPathForBorderRadius;
                    if (path3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.clipPath(path3, Region.Op.DIFFERENCE);
                }
                RectF rectF = this.outerClipTempRectForBorderRadius;
                if (rectF == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                float f12 = rectF.left;
                float f13 = rectF.right;
                float f14 = rectF.top;
                float f15 = rectF.bottom;
                PointF pointF3 = this.innerTopLeftCorner;
                if (pointF3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                PointF pointF4 = this.innerTopRightCorner;
                if (pointF4 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                PointF pointF5 = this.innerBottomLeftCorner;
                if (pointF5 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                PointF pointF6 = this.innerBottomRightCorner;
                if (pointF6 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (rectFB.left > BitmapDescriptorFactory.HUE_RED) {
                    float f16 = this.gapBetweenPaths;
                    float f17 = f16 + f15;
                    pointF2 = pointF6;
                    pointF = pointF4;
                    c(canvas, this.computedBorderColors.getLeft(), f12, f14 - f16, pointF3.x, pointF3.y - f16, pointF5.x, pointF5.y + f16, f12, f17);
                } else {
                    pointF = pointF4;
                    pointF2 = pointF6;
                }
                if (rectFB.top > vertical) {
                    float f18 = this.gapBetweenPaths;
                    c(canvas, this.computedBorderColors.getTop(), f12 - f18, f14, pointF3.x - f18, pointF3.y, pointF.x + f18, pointF.y, f13 + f18, f14);
                }
                if (rectFB.right > vertical) {
                    float f19 = this.gapBetweenPaths;
                    c(canvas, this.computedBorderColors.getRight(), f13, f14 - f19, pointF.x, pointF.y - f19, pointF2.x, pointF2.y + f19, f13, f15 + f19);
                }
                if (rectFB.bottom > 0) {
                    float f21 = this.gapBetweenPaths;
                    c(canvas, this.computedBorderColors.getBottom(), f12 - f21, f15, pointF5.x - f21, pointF5.y, pointF2.x + f21, pointF2.y, f13 + f21, f15);
                }
            } else if (fJ > BitmapDescriptorFactory.HUE_RED) {
                this.borderPaint.setColor(n(iG, this.borderAlpha));
                this.borderPaint.setStyle(Paint.Style.STROKE);
                this.borderPaint.setStrokeWidth(fJ);
                ComputedBorderRadius computedBorderRadius = this.computedBorderRadius;
                if (computedBorderRadius == null || !computedBorderRadius.f()) {
                    Path path4 = this.centerDrawPath;
                    if (path4 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path4, this.borderPaint);
                } else {
                    RectF rectF2 = this.tempRectForCenterDrawPath;
                    if (rectF2 != null) {
                        ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
                        float horizontal = ((computedBorderRadius2 == null || (topLeft2 = computedBorderRadius2.getTopLeft()) == null || (cornerRadiiC2 = topLeft2.c()) == null) ? 0.0f : cornerRadiiC2.getHorizontal()) - (rectFB.left * 0.5f);
                        ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
                        if (computedBorderRadius3 != null && (topLeft = computedBorderRadius3.getTopLeft()) != null && (cornerRadiiC = topLeft.c()) != null) {
                            vertical = cornerRadiiC.getVertical();
                        }
                        canvas.drawRoundRect(rectF2, horizontal, vertical - (rectFB.top * 0.5f), this.borderPaint);
                    }
                }
            }
        }
        canvas.restore();
    }

    private final int f(int borderLeft, int borderTop, int borderRight, int borderBottom, int colorLeft, int colorTop, int colorRight, int colorBottom) {
        int i11 = (borderBottom > 0 ? colorBottom : -1) & (borderLeft > 0 ? colorLeft : -1) & (borderTop > 0 ? colorTop : -1) & (borderRight > 0 ? colorRight : -1);
        if (borderLeft <= 0) {
            colorLeft = 0;
        }
        if (borderTop <= 0) {
            colorTop = 0;
        }
        int i12 = colorLeft | colorTop;
        if (borderRight <= 0) {
            colorRight = 0;
        }
        int i13 = i12 | colorRight;
        if (borderBottom <= 0) {
            colorBottom = 0;
        }
        if (i11 == (i13 | colorBottom)) {
            return i11;
        }
        return 0;
    }

    private final void i(double ellipseBoundsLeft, double ellipseBoundsTop, double ellipseBoundsRight, double ellipseBoundsBottom, double lineStartX, double lineStartY, double lineEndX, double lineEndY, PointF result) {
        double d11 = 2;
        double d12 = (ellipseBoundsLeft + ellipseBoundsRight) / d11;
        double d13 = (ellipseBoundsTop + ellipseBoundsBottom) / d11;
        double d14 = lineStartX - d12;
        double d15 = lineStartY - d13;
        double dAbs = Math.abs(ellipseBoundsRight - ellipseBoundsLeft) / d11;
        double dAbs2 = Math.abs(ellipseBoundsBottom - ellipseBoundsTop) / d11;
        double d16 = ((lineEndY - d13) - d15) / ((lineEndX - d12) - d14);
        double d17 = d15 - (d14 * d16);
        double d18 = dAbs2 * dAbs2;
        double d19 = dAbs * dAbs;
        double d21 = d18 + (d19 * d16 * d16);
        double d22 = d11 * dAbs * dAbs * d17 * d16;
        double d23 = d11 * d21;
        double dSqrt = ((-d22) / d23) - Math.sqrt(((-(d19 * ((d17 * d17) - d18))) / d21) + Math.pow(d22 / d23, 2.0d));
        double d24 = (d16 * dSqrt) + d17;
        double d25 = dSqrt + d12;
        double d26 = d24 + d13;
        if (Double.isNaN(d25) || Double.isNaN(d26)) {
            return;
        }
        result.x = (float) d25;
        result.y = (float) d26;
    }

    private final float j() {
        t0 t0Var = this.borderWidth;
        float fB = t0Var != null ? t0Var.b(8) : Float.NaN;
        return !Float.isNaN(fB) ? fB : BitmapDescriptorFactory.HUE_RED;
    }

    private final float k(float computedRadius, float borderWidth) {
        return bo0.n.e(computedRadius - borderWidth, BitmapDescriptorFactory.HUE_RED);
    }

    private final PathEffect l(so.f style, float borderWidth) {
        int i11 = a.f105729a[style.ordinal()];
        if (i11 == 1) {
            return null;
        }
        if (i11 == 2) {
            float f11 = borderWidth * 3;
            return new DashPathEffect(new float[]{f11, f11, f11, f11}, BitmapDescriptorFactory.HUE_RED);
        }
        if (i11 == 3) {
            return new DashPathEffect(new float[]{borderWidth, borderWidth, borderWidth, borderWidth}, BitmapDescriptorFactory.HUE_RED);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final <T> p013kotlin.properties.d<Object, T> m(T initialValue) {
        return new C2245b(initialValue, this);
    }

    private final int n(int color, int rawAlpha) {
        if (rawAlpha == 255) {
            return color;
        }
        if (rawAlpha == 0) {
            return color & 16777215;
        }
        return (color & 16777215) | ((((color >>> 24) * ((rawAlpha + (rawAlpha >> 7)) >> 7)) >> 8) << 24);
    }

    /* JADX WARN: Code duplicated, block: B:148:0x02f8  */
    private final void t() {
        ComputedBorderRadius computedBorderRadiusD;
        CornerRadii cornerRadii;
        CornerRadii cornerRadii2;
        CornerRadii cornerRadii3;
        CornerRadii cornerRadii4;
        char c11;
        char c12;
        Path path;
        int i11;
        Path path2;
        Path path3;
        CornerRadii bottomRight;
        CornerRadii bottomLeft;
        CornerRadii topRight;
        CornerRadii topLeft;
        if (this.needUpdatePath) {
            this.needUpdatePath = false;
            Path path4 = this.innerClipPathForBorderRadius;
            if (path4 == null) {
                path4 = new Path();
            }
            this.innerClipPathForBorderRadius = path4;
            Path path5 = this.outerClipPathForBorderRadius;
            if (path5 == null) {
                path5 = new Path();
            }
            this.outerClipPathForBorderRadius = path5;
            this.pathForOutline = new Path();
            RectF rectF = this.innerClipTempRectForBorderRadius;
            if (rectF == null) {
                rectF = new RectF();
            }
            this.innerClipTempRectForBorderRadius = rectF;
            RectF rectF2 = this.outerClipTempRectForBorderRadius;
            if (rectF2 == null) {
                rectF2 = new RectF();
            }
            this.outerClipTempRectForBorderRadius = rectF2;
            RectF rectF3 = this.tempRectForCenterDrawPath;
            if (rectF3 == null) {
                rectF3 = new RectF();
            }
            this.tempRectForCenterDrawPath = rectF3;
            Path path6 = this.innerClipPathForBorderRadius;
            if (path6 != null) {
                path6.reset();
                h0 h0Var = h0.f84049a;
            }
            Path path7 = this.outerClipPathForBorderRadius;
            if (path7 != null) {
                path7.reset();
                h0 h0Var2 = h0.f84049a;
            }
            RectF rectF4 = this.innerClipTempRectForBorderRadius;
            if (rectF4 != null) {
                rectF4.set(getBounds());
                h0 h0Var3 = h0.f84049a;
            }
            RectF rectF5 = this.outerClipTempRectForBorderRadius;
            if (rectF5 != null) {
                rectF5.set(getBounds());
                h0 h0Var4 = h0.f84049a;
            }
            RectF rectF6 = this.tempRectForCenterDrawPath;
            if (rectF6 != null) {
                rectF6.set(getBounds());
                h0 h0Var5 = h0.f84049a;
            }
            RectF rectFB = b();
            if (Color.alpha(this.computedBorderColors.getLeft()) != 0 || Color.alpha(this.computedBorderColors.getTop()) != 0 || Color.alpha(this.computedBorderColors.getRight()) != 0 || Color.alpha(this.computedBorderColors.getBottom()) != 0) {
                RectF rectF7 = this.innerClipTempRectForBorderRadius;
                if (rectF7 != null) {
                    rectF7.top = rectF7 != null ? rectF7.top + rectFB.top : 0.0f;
                    h0 h0Var6 = h0.f84049a;
                }
                if (rectF7 != null) {
                    rectF7.bottom = rectF7 != null ? rectF7.bottom - rectFB.bottom : 0.0f;
                    h0 h0Var7 = h0.f84049a;
                }
                if (rectF7 != null) {
                    rectF7.left = rectF7 != null ? rectF7.left + rectFB.left : 0.0f;
                    h0 h0Var8 = h0.f84049a;
                }
                if (rectF7 != null) {
                    rectF7.right = rectF7 != null ? rectF7.right - rectFB.right : 0.0f;
                    h0 h0Var9 = h0.f84049a;
                }
            }
            RectF rectF8 = this.tempRectForCenterDrawPath;
            if (rectF8 != null) {
                rectF8.top = rectF8 != null ? rectF8.top + (rectFB.top * 0.5f) : 0.0f;
                h0 h0Var10 = h0.f84049a;
            }
            if (rectF8 != null) {
                rectF8.bottom = rectF8 != null ? rectF8.bottom - (rectFB.bottom * 0.5f) : 0.0f;
                h0 h0Var11 = h0.f84049a;
            }
            if (rectF8 != null) {
                rectF8.left = rectF8 != null ? rectF8.left + (rectFB.left * 0.5f) : 0.0f;
                h0 h0Var12 = h0.f84049a;
            }
            if (rectF8 != null) {
                rectF8.right = rectF8 != null ? rectF8.right - (rectFB.right * 0.5f) : 0.0f;
                h0 h0Var13 = h0.f84049a;
            }
            BorderRadiusStyle borderRadiusStyle = this.borderRadius;
            if (borderRadiusStyle != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.context;
                RectF rectF9 = this.outerClipTempRectForBorderRadius;
                float fD = rectF9 != null ? w.f23413a.d(rectF9.width()) : 0.0f;
                RectF rectF10 = this.outerClipTempRectForBorderRadius;
                computedBorderRadiusD = borderRadiusStyle.d(layoutDirection, context, fD, rectF10 != null ? w.f23413a.d(rectF10.height()) : 0.0f);
            } else {
                computedBorderRadiusD = null;
            }
            this.computedBorderRadius = computedBorderRadiusD;
            if (computedBorderRadiusD == null || (topLeft = computedBorderRadiusD.getTopLeft()) == null || (cornerRadii = topLeft.c()) == null) {
                cornerRadii = new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            ComputedBorderRadius computedBorderRadius = this.computedBorderRadius;
            if (computedBorderRadius == null || (topRight = computedBorderRadius.getTopRight()) == null || (cornerRadii2 = topRight.c()) == null) {
                cornerRadii2 = new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
            if (computedBorderRadius2 == null || (bottomLeft = computedBorderRadius2.getBottomLeft()) == null || (cornerRadii3 = bottomLeft.c()) == null) {
                cornerRadii3 = new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
            if (computedBorderRadius3 == null || (bottomRight = computedBorderRadius3.getBottomRight()) == null || (cornerRadii4 = bottomRight.c()) == null) {
                cornerRadii4 = new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            float fK = k(cornerRadii.getHorizontal(), rectFB.left);
            float fK2 = k(cornerRadii.getVertical(), rectFB.top);
            float fK3 = k(cornerRadii2.getHorizontal(), rectFB.right);
            float fK4 = k(cornerRadii2.getVertical(), rectFB.top);
            float fK5 = k(cornerRadii4.getHorizontal(), rectFB.right);
            float fK6 = k(cornerRadii4.getVertical(), rectFB.bottom);
            float fK7 = k(cornerRadii3.getHorizontal(), rectFB.left);
            float fK8 = k(cornerRadii3.getVertical(), rectFB.bottom);
            RectF rectF11 = this.innerClipTempRectForBorderRadius;
            if (rectF11 == null || (path3 = this.innerClipPathForBorderRadius) == null) {
                c11 = 7;
            } else {
                c11 = 7;
                path3.addRoundRect(rectF11, new float[]{fK, fK2, fK3, fK4, fK5, fK6, fK7, fK8}, Path.Direction.CW);
                h0 h0Var14 = h0.f84049a;
            }
            RectF rectF12 = this.outerClipTempRectForBorderRadius;
            if (rectF12 == null || (path2 = this.outerClipPathForBorderRadius) == null) {
                c12 = 5;
            } else {
                float horizontal = cornerRadii.getHorizontal();
                float vertical = cornerRadii.getVertical();
                float horizontal2 = cornerRadii2.getHorizontal();
                float vertical2 = cornerRadii2.getVertical();
                float horizontal3 = cornerRadii4.getHorizontal();
                float vertical3 = cornerRadii4.getVertical();
                float horizontal4 = cornerRadii3.getHorizontal();
                float vertical4 = cornerRadii3.getVertical();
                c12 = 5;
                float[] fArr = new float[8];
                fArr[0] = horizontal;
                fArr[1] = vertical;
                fArr[2] = horizontal2;
                fArr[3] = vertical2;
                fArr[4] = horizontal3;
                fArr[5] = vertical3;
                fArr[6] = horizontal4;
                fArr[c11] = vertical4;
                path2.addRoundRect(rectF12, fArr, Path.Direction.CW);
                h0 h0Var15 = h0.f84049a;
            }
            t0 t0Var = this.borderWidth;
            float fA = t0Var != null ? t0Var.a(8) / 2.0f : BitmapDescriptorFactory.HUE_RED;
            Path path8 = this.pathForOutline;
            if (path8 != null) {
                RectF rectF13 = new RectF(getBounds());
                float horizontal5 = cornerRadii.getHorizontal() + fA;
                float vertical5 = cornerRadii.getVertical() + fA;
                float horizontal6 = cornerRadii2.getHorizontal() + fA;
                float vertical6 = cornerRadii2.getVertical() + fA;
                float horizontal7 = cornerRadii4.getHorizontal() + fA;
                float vertical7 = cornerRadii4.getVertical() + fA;
                float horizontal8 = cornerRadii3.getHorizontal() + fA;
                float vertical8 = cornerRadii3.getVertical() + fA;
                float[] fArr2 = new float[8];
                fArr2[0] = horizontal5;
                fArr2[1] = vertical5;
                fArr2[2] = horizontal6;
                fArr2[3] = vertical6;
                fArr2[4] = horizontal7;
                fArr2[c12] = vertical7;
                fArr2[r13] = horizontal8;
                fArr2[c11] = vertical8;
                path8.addRoundRect(rectF13, fArr2, Path.Direction.CW);
                h0 h0Var16 = h0.f84049a;
            }
            ComputedBorderRadius computedBorderRadius4 = this.computedBorderRadius;
            if (computedBorderRadius4 == null || !computedBorderRadius4.f()) {
                Path path9 = this.centerDrawPath;
                if (path9 == null) {
                    path9 = new Path();
                }
                this.centerDrawPath = path9;
                path9.reset();
                h0 h0Var17 = h0.f84049a;
                RectF rectF14 = this.tempRectForCenterDrawPath;
                if (rectF14 == null || (path = this.centerDrawPath) == null) {
                    i11 = 2;
                } else {
                    float horizontal9 = cornerRadii.getHorizontal() - (rectFB.left * 0.5f);
                    float vertical9 = cornerRadii.getVertical() - (rectFB.top * 0.5f);
                    float horizontal10 = cornerRadii2.getHorizontal() - (rectFB.right * 0.5f);
                    float vertical10 = cornerRadii2.getVertical() - (rectFB.top * 0.5f);
                    float horizontal11 = cornerRadii4.getHorizontal() - (rectFB.right * 0.5f);
                    float vertical11 = cornerRadii4.getVertical() - (rectFB.bottom * 0.5f);
                    i11 = 2;
                    float horizontal12 = cornerRadii3.getHorizontal() - (rectFB.left * 0.5f);
                    float vertical12 = cornerRadii3.getVertical() - (rectFB.bottom * 0.5f);
                    float[] fArr3 = new float[8];
                    fArr3[0] = horizontal9;
                    fArr3[1] = vertical9;
                    fArr3[2] = horizontal10;
                    fArr3[3] = vertical10;
                    fArr3[4] = horizontal11;
                    fArr3[c12] = vertical11;
                    fArr3[r13] = horizontal12;
                    fArr3[c11] = vertical12;
                    path.addRoundRect(rectF14, fArr3, Path.Direction.CW);
                    h0 h0Var18 = h0.f84049a;
                }
            } else {
                i11 = 2;
            }
            RectF rectF15 = this.innerClipTempRectForBorderRadius;
            RectF rectF16 = this.outerClipTempRectForBorderRadius;
            if (rectF15 == null || rectF16 == null) {
                return;
            }
            PointF pointF = this.innerTopLeftCorner;
            if (pointF == null) {
                pointF = new PointF();
            }
            this.innerTopLeftCorner = pointF;
            pointF.x = rectF15.left;
            h0 h0Var19 = h0.f84049a;
            pointF.y = rectF15.top;
            h0 h0Var20 = h0.f84049a;
            float f11 = rectF15.left;
            float f12 = rectF15.top;
            float f13 = i11;
            i(f11, f12, (fK * f13) + f11, (f13 * fK2) + f12, rectF16.left, rectF16.top, f11, f12, pointF);
            h0 h0Var21 = h0.f84049a;
            PointF pointF2 = this.innerBottomLeftCorner;
            if (pointF2 == null) {
                pointF2 = new PointF();
            }
            this.innerBottomLeftCorner = pointF2;
            pointF2.x = rectF15.left;
            h0 h0Var22 = h0.f84049a;
            pointF2.y = rectF15.bottom;
            h0 h0Var23 = h0.f84049a;
            float f14 = rectF15.left;
            float f15 = rectF15.bottom;
            float f16 = 2;
            i(f14, f15 - (fK8 * f16), (f16 * fK7) + f14, f15, rectF16.left, rectF16.bottom, f14, f15, pointF2);
            h0 h0Var24 = h0.f84049a;
            PointF pointF3 = this.innerTopRightCorner;
            if (pointF3 == null) {
                pointF3 = new PointF();
            }
            this.innerTopRightCorner = pointF3;
            pointF3.x = rectF15.right;
            h0 h0Var25 = h0.f84049a;
            pointF3.y = rectF15.top;
            h0 h0Var26 = h0.f84049a;
            float f17 = rectF15.right;
            float f18 = 2;
            float f19 = rectF15.top;
            i(f17 - (fK3 * f18), f19, f17, (f18 * fK4) + f19, rectF16.right, rectF16.top, f17, f19, pointF3);
            h0 h0Var27 = h0.f84049a;
            PointF pointF4 = this.innerBottomRightCorner;
            if (pointF4 == null) {
                pointF4 = new PointF();
            }
            this.innerBottomRightCorner = pointF4;
            pointF4.x = rectF15.right;
            h0 h0Var28 = h0.f84049a;
            pointF4.y = rectF15.bottom;
            h0 h0Var29 = h0.f84049a;
            float f21 = rectF15.right;
            float f22 = 2;
            float f23 = rectF15.bottom;
            i(f21 - (fK5 * f22), f23 - (f22 * fK6), f21, f23, rectF16.right, rectF16.bottom, f21, f23, pointF4);
            h0 h0Var30 = h0.f84049a;
        }
    }

    private final void u() {
        so.f fVarH = h();
        if (fVarH != null) {
            this.borderPaint.setPathEffect(h() != null ? l(fVarH, j()) : null);
        }
    }

    private final void v(int borderWidth) {
        so.f fVarH = h();
        if (fVarH != null) {
            this.borderPaint.setPathEffect(h() != null ? l(fVarH, borderWidth) : null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ColorEdges colorEdgesC;
        s.k(canvas, "canvas");
        u();
        Integer[] numArr = this.borderColors;
        if (numArr == null || (colorEdgesC = so.b.c(numArr, getLayoutDirection(), this.context)) == null) {
            colorEdgesC = this.computedBorderColors;
        }
        this.computedBorderColors = colorEdgesC;
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle == null || !borderRadiusStyle.c()) {
            d(canvas);
        } else {
            e(canvas);
        }
    }

    public final int g(n position) {
        Integer num;
        s.k(position, "position");
        Integer[] numArr = this.borderColors;
        if (numArr == null || (num = numArr[position.ordinal()]) == null) {
            return -16777216;
        }
        return num.intValue();
    }

    @Override // android.graphics.drawable.Drawable
    @jn0.e
    public int getOpacity() {
        if (mn0.a.h(Color.alpha(n(this.computedBorderColors.getLeft(), this.borderAlpha)), Color.alpha(n(this.computedBorderColors.getTop(), this.borderAlpha)), Color.alpha(n(this.computedBorderColors.getRight(), this.borderAlpha)), Color.alpha(n(this.computedBorderColors.getBottom(), this.borderAlpha))) == 0) {
            return -2;
        }
        return mn0.a.k(Color.alpha(n(this.computedBorderColors.getLeft(), this.borderAlpha)), Color.alpha(n(this.computedBorderColors.getTop(), this.borderAlpha)), Color.alpha(n(this.computedBorderColors.getRight(), this.borderAlpha)), Color.alpha(n(this.computedBorderColors.getBottom(), this.borderAlpha))) == 255 ? -1 : -3;
    }

    public final so.f h() {
        return (so.f) this.borderStyle.getValue(this, f105703z[0]);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.needUpdatePath = true;
        super.invalidateSelf();
    }

    public final void o(n position, Integer color) {
        s.k(position, "position");
        Integer[] numArrB = this.borderColors;
        if (numArrB == null) {
            numArrB = so.b.b(null, 1, null);
        }
        this.borderColors = numArrB;
        if (numArrB != null) {
            numArrB[position.ordinal()] = color;
        }
        this.needUpdatePath = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        s.k(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.needUpdatePath = true;
    }

    public final void p(so.c cVar) {
        this.borderInsets = cVar;
    }

    public final void q(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    public final void r(so.f fVar) {
        this.borderStyle.setValue(this, f105703z[0], fVar);
    }

    public final void s(int position, float width) {
        t0 t0Var = this.borderWidth;
        if (com.facebook.react.uimanager.f.b(t0Var != null ? Float.valueOf(t0Var.b(position)) : null, Float.valueOf(width))) {
            return;
        }
        t0 t0Var2 = this.borderWidth;
        if (t0Var2 != null) {
            t0Var2.c(position, width);
        }
        if (position == 0 || position == 1 || position == 2 || position == 3 || position == 4 || position == 5 || position == 8) {
            this.needUpdatePath = true;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.borderAlpha = alpha;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

package n3;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import k3.b1;
import k3.b4;
import k3.e0;
import k3.f0;
import k3.j1;
import k3.k1;
import k3.p1;
import k3.q1;
import k3.r1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 :2\u00020\u0001:\u00017B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J*\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010#\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J;\u0010\u001a\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000e0+H\u0016¢\u0006\u0004\b\u001a\u0010.J\u0017\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010I\u001a\n F*\u0004\u0018\u00010E0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010U\u001a\u0004\u0018\u00010R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010>R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\u000fR\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010\u000fR\u001c\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b]\u0010:R\u0016\u0010_\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010^R\"\u0010a\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010^\u001a\u0004\ba\u0010\u0015\"\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010^R\u0016\u0010f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010^R\u001a\u0010h\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010:\u001a\u0004\bg\u0010<R0\u0010n\u001a\u00020i2\u0006\u0010j\u001a\u00020i8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bk\u0010\u000f\u001a\u0004\b]\u0010l\"\u0004\bm\u0010\u0010R.\u0010u\u001a\u0004\u0018\u00010o2\b\u0010j\u001a\u0004\u0018\u00010o8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\bB\u0010r\"\u0004\bs\u0010tR0\u0010\r\u001a\u00020\f2\u0006\u0010j\u001a\u00020\f8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bv\u0010\u000f\u001a\u0004\b\u001b\u0010l\"\u0004\bw\u0010\u0010R*\u0010~\u001a\u00020x2\u0006\u0010j\u001a\u00020x8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b7\u0010{\"\u0004\b|\u0010}R\u0016\u0010\u007f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010^R5\u0010\u0083\u0001\u001a\u00030\u0080\u00012\u0007\u0010j\u001a\u00030\u0080\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\b\u001b\u0010:\u001a\u0005\b\u0081\u0001\u0010<\"\u0005\bz\u0010\u0082\u0001R-\u0010\u0086\u0001\u001a\u00020x2\u0006\u0010j\u001a\u00020x8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0084\u0001\u0010z\u001a\u0005\b\u0085\u0001\u0010{\"\u0004\bY\u0010}R-\u0010\u0089\u0001\u001a\u00020x2\u0006\u0010j\u001a\u00020x8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0087\u0001\u0010z\u001a\u0005\b\u0088\u0001\u0010{\"\u0004\b[\u0010}R,\u0010\u008a\u0001\u001a\u00020x2\u0006\u0010j\u001a\u00020x8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b\u001e\u0010z\u001a\u0005\b\u0087\u0001\u0010{\"\u0004\b\\\u0010}R-\u0010\u008c\u0001\u001a\u00020x2\u0006\u0010j\u001a\u00020x8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u008b\u0001\u0010z\u001a\u0005\b\u0084\u0001\u0010{\"\u0004\b=\u0010}R+\u0010\u008d\u0001\u001a\u00020x2\u0006\u0010j\u001a\u00020x8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bb\u0010z\u001a\u0004\by\u0010{\"\u0004\bv\u0010}R6\u0010\u0090\u0001\u001a\u00030\u008e\u00012\u0007\u0010j\u001a\u00030\u008e\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\b1\u0010:\u001a\u0005\b\u008b\u0001\u0010<\"\u0006\b\u008f\u0001\u0010\u0082\u0001R5\u0010\u0092\u0001\u001a\u00030\u008e\u00012\u0007\u0010j\u001a\u00030\u008e\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\bz\u0010:\u001a\u0004\bd\u0010<\"\u0006\b\u0091\u0001\u0010\u0082\u0001R,\u0010\u0094\u0001\u001a\u00020x2\u0006\u0010j\u001a\u00020x8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\bw\u0010z\u001a\u0005\b\u0093\u0001\u0010{\"\u0004\bK\u0010}R-\u0010\u0096\u0001\u001a\u00020x2\u0006\u0010j\u001a\u00020x8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0095\u0001\u0010z\u001a\u0005\b\u0095\u0001\u0010{\"\u0004\bO\u0010}R+\u0010\u0097\u0001\u001a\u00020x2\u0006\u0010j\u001a\u00020x8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010z\u001a\u0004\b:\u0010{\"\u0004\bS\u0010}R%\u0010\u0098\u0001\u001a\u00020x2\u0006\u0010j\u001a\u00020x8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bk\u0010{\"\u0004\bG\u0010}R&\u0010\u009a\u0001\u001a\u00020\u00132\u0006\u0010j\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\r\u001a\u0005\b\u0099\u0001\u0010\u0015\"\u0004\bp\u0010cR5\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00012\t\u0010j\u001a\u0005\u0018\u00010\u009b\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0005\b`\u0010\u009e\u0001\"\u0005\bV\u0010\u009f\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 \u0001"}, d2 = {"Ln3/h;", "Ln3/d;", "Lo3/a;", "layerContainer", "", "ownerId", "Lk3/k1;", "canvasHolder", "Lm3/a;", "canvasDrawScope", "<init>", "(Lo3/a;JLk3/k1;Lm3/a;)V", "Ln3/b;", "compositingStrategy", "Ljn0/h0;", "I", "(I)V", Gender.UNKNOWN, "()V", "", "P", "()Z", "S", Gender.MALE, "T", "", "x", "y", "Lw4/r;", "size", "B", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "s", "(Landroid/graphics/Outline;J)V", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "Ln3/c;", "layer", "Lkotlin/Function1;", "Lm3/f;", "block", "(Lw4/d;Lw4/t;Ln3/c;Lwn0/l;)V", "Lk3/j1;", "canvas", "E", "(Lk3/j1;)V", "Landroid/graphics/Matrix;", "r", "()Landroid/graphics/Matrix;", "o", "b", "Lo3/a;", "c", "J", "getOwnerId", "()J", DateTokenConverter.CONVERTER_KEY, "Lk3/k1;", "getCanvasHolder", "()Lk3/k1;", "Ln3/t;", "e", "Ln3/t;", "viewLayer", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "f", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/Rect;", "g", "Landroid/graphics/Rect;", "clipRect", "Landroid/graphics/Paint;", "h", "Landroid/graphics/Paint;", "layerPaint", "Landroid/graphics/Picture;", IntegerTokenConverter.CONVERTER_KEY, "Landroid/graphics/Picture;", "picture", "j", "Lm3/a;", "pictureDrawScope", "k", "pictureCanvasHolder", "l", "m", "n", "Z", "clipBoundsInvalidated", "p", "isInvalidated", "D", "(Z)V", "q", "outlineIsProvided", "clipToBounds", "getLayerId", "layerId", "Lk3/b1;", "value", "t", "()I", "setBlendMode-s9anfk8", "blendMode", "Lk3/q1;", "u", "Lk3/q1;", "()Lk3/q1;", "setColorFilter", "(Lk3/q1;)V", "colorFilter", "v", "G", "", "w", Gender.FEMALE, "()F", "a", "(F)V", "alpha", "shouldManuallySetCenterPivot", "Lj3/g;", "getPivotOffset-F1C5BW0", "(J)V", "pivotOffset", "z", Gender.OTHER, "scaleX", "A", "R", "scaleY", "translationX", "C", "translationY", "shadowElevation", "Lk3/p1;", "L", "ambientShadowColor", Gender.NONE, "spotShadowColor", "Q", "rotationX", "H", "rotationY", "rotationZ", "cameraDistance", "K", "clip", "Lk3/b4;", "renderEffect", "Lk3/b4;", "()Lk3/b4;", "(Lk3/b4;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements d {
    private static final boolean K = !s.f92859a.a();
    private static final Canvas L = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private long spotShadowColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o3.a layerContainer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long ownerId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k1 canvasHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t viewLayer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Resources resources;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Rect clipRect;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Paint layerPaint;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Picture picture;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final m3.a pictureDrawScope;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k1 pictureCanvasHolder;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int x;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int y;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean clipBoundsInvalidated;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean outlineIsProvided;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long layerId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private q1 colorFilter;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"n3/h$a", "Landroid/graphics/Canvas;", "", "isHardwareAccelerated", "()Z", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Canvas {
        a() {
        }

        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    public h(o3.a aVar, long j11, k1 k1Var, m3.a aVar2) {
        this.layerContainer = aVar;
        this.ownerId = j11;
        this.canvasHolder = k1Var;
        t tVar = new t(aVar, k1Var, aVar2);
        this.viewLayer = tVar;
        this.resources = aVar.getResources();
        this.clipRect = new Rect();
        boolean z11 = K;
        this.picture = z11 ? new Picture() : null;
        this.pictureDrawScope = z11 ? new m3.a() : null;
        this.pictureCanvasHolder = z11 ? new k1() : null;
        aVar.addView(tVar);
        tVar.setClipBounds(null);
        this.size = w4.r.INSTANCE.a();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = b1.INSTANCE.B();
        this.compositingStrategy = b.INSTANCE.a();
        this.alpha = 1.0f;
        this.pivotOffset = j3.g.INSTANCE.c();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        p1.Companion companion = p1.INSTANCE;
        this.ambientShadowColor = companion.a();
        this.spotShadowColor = companion.a();
    }

    private final void I(int compositingStrategy) {
        t tVar = this.viewLayer;
        b.Companion companion = b.INSTANCE;
        boolean z11 = true;
        if (b.e(compositingStrategy, companion.c())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else if (b.e(compositingStrategy, companion.b())) {
            this.viewLayer.setLayerType(0, this.layerPaint);
            z11 = false;
        } else {
            this.viewLayer.setLayerType(0, this.layerPaint);
        }
        tVar.setCanUseCompositingLayer$ui_graphics_release(z11);
    }

    private final void M() {
        try {
            k1 k1Var = this.canvasHolder;
            Canvas canvas = L;
            Canvas internalCanvas = k1Var.getAndroidCanvas().getInternalCanvas();
            k1Var.getAndroidCanvas().z(canvas);
            e0 androidCanvas = k1Var.getAndroidCanvas();
            o3.a aVar = this.layerContainer;
            t tVar = this.viewLayer;
            aVar.a(androidCanvas, tVar, tVar.getDrawingTime());
            k1Var.getAndroidCanvas().z(internalCanvas);
        } catch (Throwable unused) {
        }
    }

    private final boolean P() {
        return b.e(getCompositingStrategy(), b.INSTANCE.c()) || S();
    }

    private final boolean S() {
        return (b1.E(getBlendMode(), b1.INSTANCE.B()) && getColorFilter() == null) ? false : true;
    }

    private final void T() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            t tVar = this.viewLayer;
            if (!K() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            tVar.setClipBounds(rect);
        }
    }

    private final void U() {
        if (P()) {
            I(b.INSTANCE.c());
        } else {
            I(getCompositingStrategy());
        }
    }

    @Override // n3.d
    /* JADX INFO: renamed from: A, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // n3.d
    public void B(int x11, int y11, long size) {
        if (w4.r.e(this.size, size)) {
            int i11 = this.x;
            if (i11 != x11) {
                this.viewLayer.offsetLeftAndRight(x11 - i11);
            }
            int i12 = this.y;
            if (i12 != y11) {
                this.viewLayer.offsetTopAndBottom(y11 - i12);
            }
        } else {
            if (K()) {
                this.clipBoundsInvalidated = true;
            }
            this.viewLayer.layout(x11, y11, w4.r.g(size) + x11, w4.r.f(size) + y11);
            this.size = size;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(w4.r.g(size) / 2.0f);
                this.viewLayer.setPivotY(w4.r.f(size) / 2.0f);
            }
        }
        this.x = x11;
        this.y = y11;
    }

    @Override // n3.d
    /* JADX INFO: renamed from: C, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // n3.d
    public void D(boolean z11) {
        this.isInvalidated = z11;
    }

    @Override // n3.d
    public void E(j1 canvas) {
        T();
        Canvas canvasD = f0.d(canvas);
        if (canvasD.isHardwareAccelerated()) {
            o3.a aVar = this.layerContainer;
            t tVar = this.viewLayer;
            aVar.a(canvas, tVar, tVar.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                canvasD.drawPicture(picture);
            }
        }
    }

    @Override // n3.d
    public void F(long j11) {
        this.pivotOffset = j11;
        if (!j3.h.d(j11)) {
            this.shouldManuallySetCenterPivot = false;
            this.viewLayer.setPivotX(j3.g.m(j11));
            this.viewLayer.setPivotY(j3.g.n(j11));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                u.f92872a.a(this.viewLayer);
                return;
            }
            this.shouldManuallySetCenterPivot = true;
            this.viewLayer.setPivotX(w4.r.g(this.size) / 2.0f);
            this.viewLayer.setPivotY(w4.r.f(this.size) / 2.0f);
        }
    }

    @Override // n3.d
    public void G(int i11) {
        this.compositingStrategy = i11;
        U();
    }

    @Override // n3.d
    /* JADX INFO: renamed from: H, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // n3.d
    /* JADX INFO: renamed from: J, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    public boolean K() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
    }

    @Override // n3.d
    public void L(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j11;
            u.f92872a.b(this.viewLayer, r1.k(j11));
        }
    }

    @Override // n3.d
    public void N(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j11;
            u.f92872a.c(this.viewLayer, r1.k(j11));
        }
    }

    @Override // n3.d
    /* JADX INFO: renamed from: O, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // n3.d
    /* JADX INFO: renamed from: Q, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // n3.d
    /* JADX INFO: renamed from: R, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // n3.d
    public void a(float f11) {
        this.alpha = f11;
        this.viewLayer.setAlpha(f11);
    }

    @Override // n3.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // n3.d
    public void d(float f11) {
        this.translationY = f11;
        this.viewLayer.setTranslationY(f11);
    }

    @Override // n3.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public q1 getColorFilter() {
        return this.colorFilter;
    }

    @Override // n3.d
    public void f(float f11) {
        this.viewLayer.setCameraDistance(f11 * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // n3.d
    public void g(float f11) {
        this.rotationX = f11;
        this.viewLayer.setRotationX(f11);
    }

    @Override // n3.d
    public void h(float f11) {
        this.rotationY = f11;
        this.viewLayer.setRotationY(f11);
    }

    @Override // n3.d
    public void i(float f11) {
        this.rotationZ = f11;
        this.viewLayer.setRotation(f11);
    }

    @Override // n3.d
    public void j(b4 b4Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            v.f92873a.a(this.viewLayer, b4Var);
        }
    }

    @Override // n3.d
    public void k(float f11) {
        this.scaleX = f11;
        this.viewLayer.setScaleX(f11);
    }

    @Override // n3.d
    public void l(float f11) {
        this.scaleY = f11;
        this.viewLayer.setScaleY(f11);
    }

    @Override // n3.d
    public void m(float f11) {
        this.translationX = f11;
        this.viewLayer.setTranslationX(f11);
    }

    @Override // n3.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // n3.d
    public void o() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // n3.d
    public b4 p() {
        return null;
    }

    @Override // n3.d
    /* JADX INFO: renamed from: q, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // n3.d
    public Matrix r() {
        return this.viewLayer.getMatrix();
    }

    @Override // n3.d
    public void s(Outline outline, long outlineSize) {
        boolean zC = this.viewLayer.c(outline);
        if (K() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (zC) {
            return;
        }
        this.viewLayer.invalidate();
        M();
    }

    @Override // n3.d
    /* JADX INFO: renamed from: t */
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @Override // n3.d
    public void u(boolean z11) {
        boolean z12 = false;
        this.clipToBounds = z11 && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        t tVar = this.viewLayer;
        if (z11 && this.outlineIsProvided) {
            z12 = true;
        }
        tVar.setClipToOutline(z12);
    }

    @Override // n3.d
    public void v(float f11) {
        this.shadowElevation = f11;
        this.viewLayer.setElevation(f11);
    }

    @Override // n3.d
    /* JADX INFO: renamed from: w, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // n3.d
    public void x(w4.d density, w4.t layoutDirection, c layer, wn0.l<? super m3.f, h0> block) {
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.setDrawParams(density, layoutDirection, layer, block);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            M();
            Picture picture = this.picture;
            if (picture != null) {
                Canvas canvasBeginRecording = picture.beginRecording(w4.r.g(this.size), w4.r.f(this.size));
                try {
                    k1 k1Var = this.pictureCanvasHolder;
                    if (k1Var != null) {
                        Canvas internalCanvas = k1Var.getAndroidCanvas().getInternalCanvas();
                        k1Var.getAndroidCanvas().z(canvasBeginRecording);
                        e0 androidCanvas = k1Var.getAndroidCanvas();
                        m3.a aVar = this.pictureDrawScope;
                        if (aVar != null) {
                            long jD = w4.s.d(this.size);
                            m3.a.DrawParams drawParams = aVar.getDrawParams();
                            w4.d density2 = drawParams.getDensity();
                            w4.t layoutDirection2 = drawParams.getLayoutDirection();
                            j1 canvas = drawParams.getCanvas();
                            long size = drawParams.getSize();
                            m3.a.DrawParams drawParams2 = aVar.getDrawParams();
                            drawParams2.j(density);
                            drawParams2.k(layoutDirection);
                            drawParams2.i(androidCanvas);
                            drawParams2.l(jD);
                            androidCanvas.u();
                            block.invoke(aVar);
                            androidCanvas.o();
                            m3.a.DrawParams drawParams3 = aVar.getDrawParams();
                            drawParams3.j(density2);
                            drawParams3.k(layoutDirection2);
                            drawParams3.i(canvas);
                            drawParams3.l(size);
                        }
                        k1Var.getAndroidCanvas().z(internalCanvas);
                        h0 h0Var = h0.f84049a;
                    }
                } finally {
                    picture.endRecording();
                }
            }
        }
    }

    @Override // n3.d
    /* JADX INFO: renamed from: y, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // n3.d
    /* JADX INFO: renamed from: z, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    public /* synthetic */ h(o3.a aVar, long j11, k1 k1Var, m3.a aVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j11, (i11 & 4) != 0 ? new k1() : k1Var, (i11 & 8) != 0 ? new m3.a() : aVar2);
    }
}

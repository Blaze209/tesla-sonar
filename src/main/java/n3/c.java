package n3;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.l0;
import androidx.collection.w0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import jn0.h0;
import k3.b1;
import k3.b4;
import k3.f0;
import k3.j1;
import k3.o1;
import k3.p1;
import k3.p3;
import k3.q0;
import k3.q1;
import k3.r0;
import k3.r3;
import k3.t3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0098\u00012\u00020\u0001:\u0001AB\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u0010J\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u0010J<\u0010/\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f0,ø\u0001\u0000¢\u0006\u0004\b/\u00100J!\u00104\u001a\u00020\f2\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\fH\u0000¢\u0006\u0004\b6\u0010\u0010J\u000f\u00107\u001a\u00020\fH\u0000¢\u0006\u0004\b7\u0010\u0010J\u0015\u00108\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b8\u00109J.\u0010>\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020:2\b\b\u0002\u0010\u000b\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020<ø\u0001\u0000¢\u0006\u0004\b>\u0010?J$\u0010@\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020:2\b\b\u0002\u0010\u000b\u001a\u00020;ø\u0001\u0000¢\u0006\u0004\b@\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010J\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010IR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010LR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010OR\u001c\u0010R\u001a\u00020:8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010QR\u001c\u0010T\u001a\u00020;8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bS\u0010QR\u0016\u0010V\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010\u000fR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0016\u0010a\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010OR\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010h\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010'R\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR$\u0010q\u001a\u00020N2\u0006\u0010m\u001a\u00020N8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bn\u0010O\u001a\u0004\bo\u0010pR0\u0010\t\u001a\u00020\b2\u0006\u0010r\u001a\u00020\b8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bs\u0010Q\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR0\u0010\u000b\u001a\u00020\n2\u0006\u0010r\u001a\u00020\n8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bx\u0010Q\u001a\u0004\by\u0010u\"\u0004\bz\u0010wR0\u0010}\u001a\u00020:2\u0006\u0010r\u001a\u00020:8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b{\u0010Q\u001a\u0004\bc\u0010u\"\u0004\b|\u0010wR2\u0010\u0081\u0001\u001a\u00020N2\u0006\u0010r\u001a\u00020N8F@FX\u0086\u000e¢\u0006\u0019\n\u0004\by\u0010O\u0012\u0005\b\u0080\u0001\u0010\u0010\u001a\u0004\bX\u0010p\"\u0004\b~\u0010\u007fR\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bt\u0010\u0082\u0001R0\u0010\u0088\u0001\u001a\u00030\u0084\u00012\u0007\u0010r\u001a\u00030\u0084\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\u001a\u0005\b^\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R'\u0010\u008b\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bS\u0010\u0089\u0001\"\u0005\bQ\u0010\u008a\u0001R0\u0010\u008e\u0001\u001a\u00030\u008c\u00012\u0007\u0010r\u001a\u00030\u008c\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\u001a\u0005\bU\u0010\u0085\u0001\"\u0006\b\u008d\u0001\u0010\u0087\u0001R.\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008f\u00012\t\u0010r\u001a\u0005\u0018\u00010\u008f\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b[\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R(\u0010\u0095\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bs\u0010\u0089\u0001\"\u0006\b\u0094\u0001\u0010\u008a\u0001R(\u0010\u0097\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bx\u0010\u0089\u0001\"\u0006\b\u0096\u0001\u0010\u008a\u0001R)\u0010\u009a\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0098\u0001\u0010\u0089\u0001\"\u0006\b\u0099\u0001\u0010\u008a\u0001R)\u0010\u009d\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009b\u0001\u0010\u0089\u0001\"\u0006\b\u009c\u0001\u0010\u008a\u0001R'\u0010\u009e\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b{\u0010\u0089\u0001\"\u0005\bO\u0010\u008a\u0001R(\u0010 \u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bg\u0010\u0089\u0001\"\u0006\b\u009f\u0001\u0010\u008a\u0001R(\u0010¢\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bj\u0010\u0089\u0001\"\u0006\b¡\u0001\u0010\u008a\u0001R(\u0010¤\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bn\u0010\u0089\u0001\"\u0006\b£\u0001\u0010\u008a\u0001R)\u0010§\u0001\u001a\u00020<2\u0006\u0010r\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¥\u0001\u0010\u0089\u0001\"\u0006\b¦\u0001\u0010\u008a\u0001R/\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¨\u00012\t\u0010r\u001a\u0005\u0018\u00010¨\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u0013\u0010¯\u0001\u001a\u00020W8F¢\u0006\u0007\u001a\u0005\b`\u0010®\u0001R/\u0010³\u0001\u001a\u00030°\u00012\u0007\u0010r\u001a\u00030°\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b±\u0001\u0010u\"\u0005\b²\u0001\u0010wR/\u0010¶\u0001\u001a\u00030°\u00012\u0007\u0010r\u001a\u00030°\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b´\u0001\u0010u\"\u0005\bµ\u0001\u0010w\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006·\u0001"}, d2 = {"Ln3/c;", "", "Ln3/d;", "impl", "Ln3/i;", "layerManager", "<init>", "(Ln3/d;Ln3/i;)V", "Lw4/n;", "topLeft", "Lw4/r;", "size", "Ljn0/h0;", "Q", "(JJ)V", Gender.FEMALE, "()V", "graphicsLayer", DateTokenConverter.CONVERTER_KEY, "(Ln3/c;)V", "Landroid/graphics/Canvas;", "androidCanvas", "f0", "(Landroid/graphics/Canvas;)V", "G", "C", "D", "Landroid/graphics/RectF;", "B", "()Landroid/graphics/RectF;", "e", "Lk3/t3;", "path", "Landroid/graphics/Outline;", "g0", "(Lk3/t3;)Landroid/graphics/Outline;", "A", "()Landroid/graphics/Outline;", "f", "I", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "Lkotlin/Function1;", "Lm3/f;", "block", "E", "(Lw4/d;Lw4/t;JLwn0/l;)V", "Lk3/j1;", "canvas", "parentLayer", "h", "(Lk3/j1;Ln3/c;)V", "H", "g", Gender.OTHER, "(Lk3/t3;)V", "Lj3/g;", "Lj3/m;", "", "cornerRadius", "W", "(JJF)V", "R", "a", "Ln3/d;", "getImpl$ui_graphics_release", "()Ln3/d;", "b", "Lw4/d;", "c", "Lw4/t;", "Lwn0/l;", "drawBlock", "clipDrawBlock", "Landroid/graphics/Outline;", "androidOutline", "", "Z", "outlineDirty", "J", "roundRectOutlineTopLeft", IntegerTokenConverter.CONVERTER_KEY, "roundRectOutlineSize", "j", "roundRectCornerRadius", "Lk3/p3;", "k", "Lk3/p3;", "internalOutline", "l", "Lk3/t3;", "outlinePath", "m", "roundRectClipPath", "n", "usePathForClip", "Lk3/r3;", "o", "Lk3/r3;", "softwareLayerPaint", "", "p", "parentLayerUsages", "Ln3/a;", "q", "Ln3/a;", "childDependenciesTracker", "<set-?>", "r", "z", "()Z", "isReleased", "value", "s", "w", "()J", "c0", "(J)V", "t", "v", "a0", "u", "P", "pivotOffset", Gender.MALE, "(Z)V", "getClip$annotations", "clip", "Landroid/graphics/RectF;", "pathBounds", "Ln3/b;", "()I", Gender.NONE, "(I)V", "compositingStrategy", "()F", "(F)V", "alpha", "Lk3/b1;", "setBlendMode-s9anfk8", "blendMode", "Lk3/q1;", "()Lk3/q1;", "setColorFilter", "(Lk3/q1;)V", "colorFilter", "X", "scaleX", "Y", "scaleY", "x", "d0", "translationX", "y", "e0", "translationY", "shadowElevation", "T", "rotationX", Gender.UNKNOWN, "rotationY", "V", "rotationZ", "getCameraDistance", "L", "cameraDistance", "Lk3/b4;", "getRenderEffect", "()Lk3/b4;", "S", "(Lk3/b4;)V", "renderEffect", "()Lk3/p3;", "outline", "Lk3/p1;", "getAmbientShadowColor-0d7_KjU", "K", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "b0", "spotShadowColor", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final j f92744y;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d impl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Outline androidOutline;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long roundRectOutlineTopLeft;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long roundRectOutlineSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float roundRectCornerRadius;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private p3 internalOutline;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private t3 outlinePath;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private t3 roundRectClipPath;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean usePathForClip;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private r3 softwareLayerPaint;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int parentLayerUsages;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final a childDependenciesTracker;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isReleased;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long topLeft;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private RectF pathBounds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private w4.d density = m3.e.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private w4.t layoutDirection = w4.t.Ltr;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super m3.f, h0> drawBlock = C1981c.f92769c;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<m3.f, h0> clipDrawBlock = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean outlineDirty = true;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<m3.f, h0> {
        b() {
            super(1);
        }

        public final void a(m3.f fVar) {
            t3 t3Var = c.this.outlinePath;
            if (!c.this.usePathForClip || !c.this.getClip() || t3Var == null) {
                c.this.drawBlock.invoke(fVar);
                return;
            }
            wn0.l lVar = c.this.drawBlock;
            int iB = o1.INSTANCE.b();
            m3.d drawContext = fVar.getDrawContext();
            long jB = drawContext.b();
            drawContext.a().u();
            try {
                drawContext.getTransform().d(t3Var, iB);
                lVar.invoke(fVar);
            } finally {
                drawContext.a().o();
                drawContext.f(jB);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m3.f fVar) {
            a(fVar);
            return h0.f84049a;
        }
    }

    static {
        j jVar;
        if (i.INSTANCE.a()) {
            jVar = k.f92851a;
        } else if (Build.VERSION.SDK_INT >= 28) {
            jVar = m.f92853a;
        } else {
            jVar = s.f92859a.a() ? l.f92852a : k.f92851a;
        }
        f92744y = jVar;
    }

    public c(d dVar, i iVar) {
        this.impl = dVar;
        j3.g.Companion companion = j3.g.INSTANCE;
        this.roundRectOutlineTopLeft = companion.c();
        this.roundRectOutlineSize = j3.m.INSTANCE.a();
        this.childDependenciesTracker = new a();
        dVar.u(false);
        this.topLeft = w4.n.INSTANCE.a();
        this.size = w4.r.INSTANCE.a();
        this.pivotOffset = companion.b();
    }

    private final Outline A() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final RectF B() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void C() {
        this.parentLayerUsages++;
    }

    private final void D() {
        this.parentLayerUsages--;
        f();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091 A[LOOP:0: B:20:0x005a->B:30:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[EDGE_INSN: B:34:0x0094->B:31:0x0094 BREAK  A[LOOP:0: B:20:0x005a->B:30:0x0091], SYNTHETIC] */
    private final void F() {
        a aVar = this.childDependenciesTracker;
        aVar.oldDependency = aVar.dependency;
        l0 l0Var = aVar.dependenciesSet;
        if (l0Var != null && l0Var.e()) {
            l0 l0VarA = aVar.oldDependenciesSet;
            if (l0VarA == null) {
                l0VarA = w0.a();
                aVar.oldDependenciesSet = l0VarA;
            }
            l0VarA.i(l0Var);
            l0Var.m();
        }
        aVar.trackingInProgress = true;
        this.impl.x(this.density, this.layoutDirection, this, this.clipDrawBlock);
        aVar.trackingInProgress = false;
        c cVar = aVar.oldDependency;
        if (cVar != null) {
            cVar.D();
        }
        l0 l0Var2 = aVar.oldDependenciesSet;
        if (l0Var2 == null || !l0Var2.e()) {
            return;
        }
        Object[] objArr = l0Var2.elements;
        long[] jArr = l0Var2.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            ((c) objArr[(i11 << 3) + i13]).D();
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        l0Var2.m();
    }

    private final void G() {
        if (this.impl.c()) {
            return;
        }
        try {
            F();
        } catch (Throwable unused) {
        }
    }

    private final void I() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = j3.m.INSTANCE.a();
        this.roundRectOutlineTopLeft = j3.g.INSTANCE.c();
        this.roundRectCornerRadius = BitmapDescriptorFactory.HUE_RED;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    private final void Q(long topLeft, long size) {
        this.impl.B(w4.n.h(topLeft), w4.n.i(topLeft), size);
    }

    private final void a0(long j11) {
        if (w4.r.e(this.size, j11)) {
            return;
        }
        this.size = j11;
        Q(this.topLeft, j11);
        if (this.roundRectOutlineSize == 9205357640488583168L) {
            this.outlineDirty = true;
            e();
        }
    }

    private final void d(c graphicsLayer) {
        if (this.childDependenciesTracker.i(graphicsLayer)) {
            graphicsLayer.C();
        }
    }

    private final void e() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (this.clip || u() > BitmapDescriptorFactory.HUE_RED) {
                t3 t3Var = this.outlinePath;
                if (t3Var != null) {
                    RectF rectFB = B();
                    if (!(t3Var instanceof r0)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((r0) t3Var).getInternalPath().computeBounds(rectFB, false);
                    Outline outlineG0 = g0(t3Var);
                    if (outlineG0 != null) {
                        outlineG0.setAlpha(i());
                        outline = outlineG0;
                    }
                    this.impl.s(outline, w4.s.a(Math.round(rectFB.width()), Math.round(rectFB.height())));
                    if (this.usePathForClip && this.clip) {
                        this.impl.u(false);
                        this.impl.o();
                    } else {
                        this.impl.u(this.clip);
                    }
                } else {
                    this.impl.u(this.clip);
                    j3.m.INSTANCE.b();
                    Outline outlineA = A();
                    long jD = w4.s.d(this.size);
                    long j11 = this.roundRectOutlineTopLeft;
                    long j12 = this.roundRectOutlineSize;
                    long j13 = j12 == 9205357640488583168L ? jD : j12;
                    outlineA.setRoundRect(Math.round(j3.g.m(j11)), Math.round(j3.g.n(j11)), Math.round(j3.g.m(j11) + j3.m.k(j13)), Math.round(j3.g.n(j11) + j3.m.i(j13)), this.roundRectCornerRadius);
                    outlineA.setAlpha(i());
                    this.impl.s(outlineA, w4.s.c(j13));
                }
            } else {
                this.impl.u(false);
                this.impl.s(null, w4.r.INSTANCE.a());
            }
        }
        this.outlineDirty = false;
    }

    private final void f() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            g();
        }
    }

    private final void f0(Canvas androidCanvas) {
        Canvas canvas;
        float fH = w4.n.h(this.topLeft);
        float fI = w4.n.i(this.topLeft);
        float fH2 = w4.n.h(this.topLeft) + w4.r.g(this.size);
        float fI2 = w4.n.i(this.topLeft) + w4.r.f(this.size);
        float fI3 = i();
        q1 q1VarL = l();
        int iJ = j();
        if (fI3 < 1.0f || !b1.E(iJ, b1.INSTANCE.B()) || q1VarL != null || n3.b.e(m(), n3.b.INSTANCE.c())) {
            r3 r3VarA = this.softwareLayerPaint;
            if (r3VarA == null) {
                r3VarA = q0.a();
                this.softwareLayerPaint = r3VarA;
            }
            r3VarA.a(fI3);
            r3VarA.D(iJ);
            r3VarA.t(q1VarL);
            canvas = androidCanvas;
            canvas.saveLayer(fH, fI, fH2, fI2, r3VarA.getInternalPaint());
        } else {
            androidCanvas.save();
            canvas = androidCanvas;
        }
        canvas.translate(fH, fI);
        canvas.concat(this.impl.r());
    }

    private final Outline g0(t3 path) {
        Outline outline;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 28 || path.n()) {
            Outline outlineA = A();
            if (i11 >= 30) {
                o.f92855a.a(outlineA, path);
            } else {
                if (!(path instanceof r0)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineA.setConvexPath(((r0) path).getInternalPath());
            }
            this.usePathForClip = !outlineA.canClip();
            outline = outlineA;
        } else {
            Outline outline2 = this.androidOutline;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.D(true);
            outline = null;
        }
        this.outlinePath = path;
        return outline;
    }

    public final void E(w4.d density, w4.t layoutDirection, long size, wn0.l<? super m3.f, h0> block) {
        a0(size);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = block;
        this.impl.D(true);
        F();
    }

    public final void H() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        f();
    }

    public final void J(float f11) {
        if (this.impl.getAlpha() == f11) {
            return;
        }
        this.impl.a(f11);
    }

    public final void K(long j11) {
        if (p1.r(j11, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.L(j11);
    }

    public final void L(float f11) {
        if (this.impl.getCameraDistance() == f11) {
            return;
        }
        this.impl.f(f11);
    }

    public final void M(boolean z11) {
        if (this.clip != z11) {
            this.clip = z11;
            this.outlineDirty = true;
            e();
        }
    }

    public final void N(int i11) {
        if (n3.b.e(this.impl.getCompositingStrategy(), i11)) {
            return;
        }
        this.impl.G(i11);
    }

    public final void O(t3 path) {
        I();
        this.outlinePath = path;
        e();
    }

    public final void P(long j11) {
        if (j3.g.j(this.pivotOffset, j11)) {
            return;
        }
        this.pivotOffset = j11;
        this.impl.F(j11);
    }

    public final void R(long topLeft, long size) {
        W(topLeft, size, BitmapDescriptorFactory.HUE_RED);
    }

    public final void S(b4 b4Var) {
        this.impl.p();
        if (p013kotlin.jvm.internal.s.f(null, b4Var)) {
            return;
        }
        this.impl.j(b4Var);
    }

    public final void T(float f11) {
        if (this.impl.getRotationX() == f11) {
            return;
        }
        this.impl.g(f11);
    }

    public final void U(float f11) {
        if (this.impl.getRotationY() == f11) {
            return;
        }
        this.impl.h(f11);
    }

    public final void V(float f11) {
        if (this.impl.getRotationZ() == f11) {
            return;
        }
        this.impl.i(f11);
    }

    public final void W(long topLeft, long size, float cornerRadius) {
        if (j3.g.j(this.roundRectOutlineTopLeft, topLeft) && j3.m.h(this.roundRectOutlineSize, size) && this.roundRectCornerRadius == cornerRadius && this.outlinePath == null) {
            return;
        }
        I();
        this.roundRectOutlineTopLeft = topLeft;
        this.roundRectOutlineSize = size;
        this.roundRectCornerRadius = cornerRadius;
        e();
    }

    public final void X(float f11) {
        if (this.impl.getScaleX() == f11) {
            return;
        }
        this.impl.k(f11);
    }

    public final void Y(float f11) {
        if (this.impl.getScaleY() == f11) {
            return;
        }
        this.impl.l(f11);
    }

    public final void Z(float f11) {
        if (this.impl.getShadowElevation() == f11) {
            return;
        }
        this.impl.v(f11);
        this.outlineDirty = true;
        e();
    }

    public final void b0(long j11) {
        if (p1.r(j11, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.N(j11);
    }

    public final void c0(long j11) {
        if (w4.n.g(this.topLeft, j11)) {
            return;
        }
        this.topLeft = j11;
        Q(j11, this.size);
    }

    public final void d0(float f11) {
        if (this.impl.getTranslationX() == f11) {
            return;
        }
        this.impl.m(f11);
    }

    public final void e0(float f11) {
        if (this.impl.getTranslationY() == f11) {
            return;
        }
        this.impl.d(f11);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[LOOP:0: B:10:0x0020->B:20:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[EDGE_INSN: B:25:0x005a->B:21:0x005a BREAK  A[LOOP:0: B:10:0x0020->B:20:0x0057], SYNTHETIC] */
    public final void g() {
        a aVar = this.childDependenciesTracker;
        c cVar = aVar.dependency;
        if (cVar != null) {
            cVar.D();
            aVar.dependency = null;
        }
        l0 l0Var = aVar.dependenciesSet;
        if (l0Var != null) {
            Object[] objArr = l0Var.elements;
            long[] jArr = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                ((c) objArr[(i11 << 3) + i13]).D();
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
            l0Var.m();
        }
        this.impl.o();
    }

    public final void h(j1 canvas, c parentLayer) {
        if (this.isReleased) {
            return;
        }
        e();
        G();
        boolean z11 = u() > BitmapDescriptorFactory.HUE_RED;
        if (z11) {
            canvas.p();
        }
        Canvas canvasD = f0.d(canvas);
        boolean zIsHardwareAccelerated = canvasD.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            canvasD.save();
            f0(canvasD);
        }
        boolean z12 = !zIsHardwareAccelerated && this.clip;
        if (z12) {
            canvas.u();
            p3 p3VarN = n();
            if (p3VarN instanceof p3.b) {
                j1.w(canvas, p3VarN.getRect(), 0, 2, null);
            } else if (p3VarN instanceof p3.c) {
                t3 t3VarA = this.roundRectClipPath;
                if (t3VarA != null) {
                    t3VarA.m();
                } else {
                    t3VarA = k3.w0.a();
                    this.roundRectClipPath = t3VarA;
                }
                t3.d(t3VarA, ((p3.c) p3VarN).getRoundRect(), null, 2, null);
                j1.g(canvas, t3VarA, 0, 2, null);
            } else if (p3VarN instanceof p3.a) {
                j1.g(canvas, ((p3.a) p3VarN).getPath(), 0, 2, null);
            }
        }
        if (parentLayer != null) {
            parentLayer.d(this);
        }
        this.impl.E(canvas);
        if (z12) {
            canvas.o();
        }
        if (z11) {
            canvas.j();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasD.restore();
    }

    public final float i() {
        return this.impl.getAlpha();
    }

    public final int j() {
        return this.impl.getBlendMode();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    public final q1 l() {
        return this.impl.getColorFilter();
    }

    public final int m() {
        return this.impl.getCompositingStrategy();
    }

    public final p3 n() {
        p3 p3Var = this.internalOutline;
        t3 t3Var = this.outlinePath;
        if (p3Var != null) {
            return p3Var;
        }
        if (t3Var != null) {
            p3.a aVar = new p3.a(t3Var);
            this.internalOutline = aVar;
            return aVar;
        }
        long jD = w4.s.d(this.size);
        long j11 = this.roundRectOutlineTopLeft;
        long j12 = this.roundRectOutlineSize;
        if (j12 != 9205357640488583168L) {
            jD = j12;
        }
        float fM = j3.g.m(j11);
        float fN = j3.g.n(j11);
        float fK = fM + j3.m.k(jD);
        float fI = fN + j3.m.i(jD);
        float f11 = this.roundRectCornerRadius;
        p3 cVar = f11 > BitmapDescriptorFactory.HUE_RED ? new p3.c(j3.l.c(fM, fN, fK, fI, j3.b.b(f11, BitmapDescriptorFactory.HUE_RED, 2, null))) : new p3.b(new j3.i(fM, fN, fK, fI));
        this.internalOutline = cVar;
        return cVar;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    public final float p() {
        return this.impl.getRotationX();
    }

    public final float q() {
        return this.impl.getRotationY();
    }

    public final float r() {
        return this.impl.getRotationZ();
    }

    public final float s() {
        return this.impl.getScaleX();
    }

    public final float t() {
        return this.impl.getScaleY();
    }

    public final float u() {
        return this.impl.getShadowElevation();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    public final float x() {
        return this.impl.getTranslationX();
    }

    public final float y() {
        return this.impl.getTranslationY();
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    /* JADX INFO: renamed from: n3.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class C1981c extends p013kotlin.jvm.internal.u implements wn0.l<m3.f, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1981c f92769c = new C1981c();

        C1981c() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m3.f fVar) {
            a(fVar);
            return h0.f84049a;
        }

        public final void a(m3.f fVar) {
        }
    }
}

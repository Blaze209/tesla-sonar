package zf0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import cg0.ViewfinderInfo;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.Task;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ]2\u00020\u0001:\u0003K&\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u00020)*\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020)*\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010+J\u001b\u0010-\u001a\u00020)*\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010+J\u001b\u0010/\u001a\u00020)*\u00020.2\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u00100J\u0013\u00102\u001a\u00020\u0006*\u000201H\u0002¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u0002052\u0006\u00104\u001a\u00020)¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u0002052\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u001d\u0010?\u001a\u00020>2\u0006\u0010\u0005\u001a\u00020<2\u0006\u0010=\u001a\u00020\u000b¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020>2\u0006\u0010\u0005\u001a\u00020A¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020>2\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\bD\u0010EJ\u001d\u0010H\u001a\u0002052\u0006\u0010F\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0006¢\u0006\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010OR\u0016\u0010R\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010QR\u0016\u0010T\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010SR\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010Y\u001a\u0004\bZ\u0010[¨\u0006^"}, d2 = {"Lzf0/v0;", "", "<init>", "()V", "Lzf0/i0;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ldg0/a;", "k", "(Lzf0/i0;Landroid/graphics/Rect;)Ldg0/a;", "", "x", "y", "angleInDegrees", "b", "(III)I", "degrees", IntegerTokenConverter.CONVERTER_KEY, "(I)I", "h", "Ljava/nio/ByteBuffer;", "yPlaneBuffer", "imageWidth", "imageHeight", "region", "", "n", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)F", "Lzf0/v0$b;", "type", "Landroid/graphics/Bitmap;", "bitmap", "Lzf0/t0;", "m", "(Lzf0/v0$b;Landroid/graphics/Bitmap;)Lzf0/t0;", "imageToAnalyze", "poseType", "c", "(Lzf0/i0;Lzf0/v0$b;)Lzf0/t0;", "imageRect", "", "p", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z", "q", "r", "Lzx/a;", "o", "(Lzx/a;Landroid/graphics/Rect;)Z", "Lwx/a;", "j", "(Lwx/a;)Landroid/graphics/Rect;", "requireStrictSelfie", "Ljn0/h0;", "s", "(Z)V", "Lzf0/v0$c;", "pose", "t", "(Lzf0/v0$c;)V", "Landroid/media/Image;", "rotationDegrees", "Ldg0/c;", DateTokenConverter.CONVERTER_KEY, "(Landroid/media/Image;I)Ldg0/c;", "Landroidx/camera/core/n;", "e", "(Landroidx/camera/core/n;)Ldg0/c;", "f", "(Lzf0/i0;)Ldg0/c;", "rect", "previewRect", "u", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "", "a", "D", "minFaceRatio", "Lcg0/c;", "Lcg0/c;", "viewfinderInfo", "Lzf0/v0$c;", "targetPose", "Landroid/graphics/Rect;", "tempRect", "", "[B", "byteArr", "Lzx/d;", "Lkotlin/Lazy;", "l", "()Lzx/d;", "faceDetector", "g", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ViewfinderInfo viewfinderInfo;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private double minFaceRatio = 0.35d;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private c targetPose = c.All;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Rect tempRect = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final byte[] byteArr = new byte[32768];

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy faceDetector = jn0.m.b(new wn0.a() { // from class: zf0.u0
        @Override // wn0.a
        public final Object invoke() {
            return v0.g();
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzf0/v0$b;", "", "<init>", "(Ljava/lang/String;I)V", "Center", "Left", "Right", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        Center,
        Left,
        Right;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lzf0/v0$c;", "", "<init>", "(Ljava/lang/String;I)V", "Center", "Left", "Right", "All", "None", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum c {
        Center,
        Left,
        Right,
        All,
        None;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128328a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f128328a = iArr;
        }
    }

    private final int b(int x11, int y11, int angleInDegrees) {
        int i11 = x11 - 1;
        int i12 = y11 - 1;
        return (((i12 * h(angleInDegrees)) + (i11 * i(angleInDegrees)) + 1) * 3) + ((h(angleInDegrees) * i11) - (i(angleInDegrees) * i12)) + 1;
    }

    private final t0 c(i0 imageToAnalyze, b poseType) {
        Bitmap bitmapA = imageToAnalyze.a();
        if (bitmapA != null) {
            return m(poseType, bitmapA);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zx.d g() {
        zx.d dVarA = zx.c.a(new zx.e.a().e(0.35f).d(2).a());
        p013kotlin.jvm.internal.s.j(dVarA, "getClient(...)");
        return dVarA;
    }

    private final int h(int degrees) {
        return i(degrees + 90);
    }

    private final int i(int degrees) {
        int iAbs = Math.abs(degrees / 90) % 4;
        if (iAbs == 0) {
            return 0;
        }
        if (iAbs == 1) {
            return 1;
        }
        if (iAbs == 2) {
            return 0;
        }
        if (iAbs == 3) {
            return -1;
        }
        throw new IllegalStateException("unreachable");
    }

    private final Rect j(wx.a aVar) {
        return (aVar.l() == 90 || aVar.l() == 270) ? new Rect(0, 0, aVar.i(), aVar.m()) : new Rect(0, 0, aVar.m(), aVar.i());
    }

    private final dg0.a k(i0 image, Rect viewfinderRect) {
        Image.Plane plane;
        int width = image.getImage().getWidth();
        int height = image.getImage().getHeight();
        Image.Plane[] planes = image.getImage().getPlanes();
        if (width == 0 || height == 0 || planes == null || (plane = planes[0]) == null) {
            return null;
        }
        ByteBuffer buffer = plane.getBuffer();
        if (viewfinderRect == null) {
            viewfinderRect = new Rect(0, 0, width, height);
        }
        viewfinderRect.width();
        int iWidth = viewfinderRect.width() / 3;
        int iHeight = viewfinderRect.height() / 3;
        Rect rect = this.tempRect;
        int i11 = viewfinderRect.left;
        int i12 = viewfinderRect.top;
        rect.set(i11, i12, i11 + iWidth, i12 + iHeight);
        Float[] fArr = new Float[9];
        for (int i13 = 0; i13 < 9; i13++) {
            fArr[i13] = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        }
        for (int i14 = 0; i14 < 3; i14++) {
            for (int i15 = 0; i15 < 3; i15++) {
                int iB = b(i15, i14, image.getRotationDegrees());
                p013kotlin.jvm.internal.s.h(buffer);
                fArr[iB] = Float.valueOf(n(buffer, width, height, this.tempRect));
                Rect rect2 = this.tempRect;
                rect2.left += iWidth;
                rect2.right += iWidth;
            }
            Rect rect3 = this.tempRect;
            rect3.left = viewfinderRect.left;
            rect3.right = viewfinderRect.left + iWidth;
            rect3.top += iHeight;
            rect3.bottom += iHeight;
        }
        buffer.rewind();
        return new dg0.a(fArr);
    }

    private final zx.d l() {
        return (zx.d) this.faceDetector.getValue();
    }

    private final t0 m(b type, Bitmap bitmap) {
        int i11 = d.f128328a[type.ordinal()];
        if (i11 == 1) {
            return new t0.a(bitmap);
        }
        if (i11 == 2) {
            return new t0.b(bitmap);
        }
        if (i11 == 3) {
            return new t0.c(bitmap);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final float n(ByteBuffer yPlaneBuffer, int imageWidth, int imageHeight, Rect region) {
        yPlaneBuffer.rewind();
        int iWidth = region.width();
        int iHeight = region.height() * iWidth;
        if (iWidth > 32768) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        bo0.h hVarU = bo0.n.u(bo0.n.w(region.top, region.bottom), 2);
        int first = hVarU.getFirst();
        int last = hVarU.getLast();
        int step = hVarU.getStep();
        long j11 = 0;
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                yPlaneBuffer.position((first * imageWidth) + region.left);
                yPlaneBuffer.get(this.byteArr, 0, iWidth);
                for (int i11 = 0; i11 < iWidth; i11++) {
                    j11 += (long) (this.byteArr[i11] & 255);
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        return ((j11 / iHeight) / 255.0f) * 2;
    }

    private final boolean o(zx.a aVar, Rect rect) {
        int iWidth = rect.width();
        int iHeight = rect.height();
        zx.f fVarE = aVar.e(6);
        if (fVarE == null) {
            return false;
        }
        double d11 = iWidth / 2;
        double dMin = (((double) Math.min(iWidth, iHeight)) * 0.4d) / ((double) 2);
        double d12 = iHeight / 2;
        return new Rect((int) (d11 - dMin), (int) (d12 - dMin), (int) (d11 + dMin), (int) (d12 + dMin)).contains((int) fVarE.a().x, (int) fVarE.a().y);
    }

    private final boolean p(Rect rect, Rect rect2) {
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        int i11 = iWidth / 2;
        int i12 = iHeight / 2;
        int iMin = Math.min(iWidth, iHeight) / 2;
        Rect rect3 = new Rect(0, 0, iWidth, iHeight);
        rect3.inset(25, 25);
        return rect3.contains(rect) && ((double) Math.abs(bo0.n.f(rect2.width() - rect.right, 1) - bo0.n.f(rect.left, 1))) / ((double) rect2.width()) <= 0.3d && rect.left > i11 - iMin && rect.right < i11 + iMin && rect.top > i12 - iMin && rect.bottom < i12 + iMin;
    }

    private final boolean q(Rect rect, Rect rect2) {
        return ((double) Math.max(rect.width(), rect.height())) > ((double) Math.min(rect2.width(), rect2.height())) * 0.8d;
    }

    private final boolean r(Rect rect, Rect rect2) {
        return ((double) Math.max(rect.width(), rect.height())) < ((double) Math.min(rect2.width(), rect2.height())) * this.minFaceRatio;
    }

    public final dg0.c d(Image image, int rotationDegrees) {
        p013kotlin.jvm.internal.s.k(image, "image");
        return f(l0.d(image, rotationDegrees));
    }

    public final dg0.c e(androidx.camera.core.n image) {
        p013kotlin.jvm.internal.s.k(image, "image");
        i0 i0VarE = l0.e(image);
        return i0VarE == null ? new dg0.c(null, dg0.b.Other, 0, false, false, false, BitmapDescriptorFactory.HUE_RED, null) : f(i0VarE);
    }

    public final dg0.c f(i0 imageToAnalyze) {
        dg0.b bVar;
        t0 t0VarC;
        t0 t0Var;
        dg0.b bVar2;
        p013kotlin.jvm.internal.s.k(imageToAnalyze, "imageToAnalyze");
        ViewfinderInfo viewfinderInfo = this.viewfinderInfo;
        Rect rectA = viewfinderInfo != null ? cg0.d.a(viewfinderInfo, imageToAnalyze) : null;
        wx.a aVarB = imageToAnalyze.b();
        Rect rectJ = j(aVarB);
        dg0.a aVarK = k(imageToAnalyze, rectA);
        Task<List<zx.a>> taskProcess = l().process(aVarB);
        p013kotlin.jvm.internal.s.j(taskProcess, "process(...)");
        try {
            List<zx.a> result = taskProcess.getResult();
            if (result.isEmpty()) {
                return new dg0.c(null, dg0.b.FaceNotFound, result.size(), false, false, false, BitmapDescriptorFactory.HUE_RED, aVarK);
            }
            if (result.size() > 1) {
                return new dg0.c(null, dg0.b.MultipleFaces, result.size(), false, false, false, BitmapDescriptorFactory.HUE_RED, aVarK);
            }
            p013kotlin.jvm.internal.s.h(result);
            zx.a aVar = (zx.a) p013kotlin.collections.v.o0(result);
            Rect rectA2 = aVar.a();
            p013kotlin.jvm.internal.s.j(rectA2, "getBoundingBox(...)");
            boolean zQ = q(rectA2, rectJ);
            Rect rectA3 = aVar.a();
            p013kotlin.jvm.internal.s.j(rectA3, "getBoundingBox(...)");
            boolean zR = r(rectA3, rectJ);
            Rect rectA4 = aVar.a();
            p013kotlin.jvm.internal.s.j(rectA4, "getBoundingBox(...)");
            boolean zP = p(rectA4, rectJ);
            float fD = aVar.d();
            if (zQ) {
                bVar = dg0.b.FaceTooClose;
            } else if (zR) {
                bVar = dg0.b.FaceTooFar;
            } else {
                if (zP) {
                    if (-10.0f < fD && fD < 10.0f) {
                        p013kotlin.jvm.internal.s.h(aVar);
                        if (o(aVar, rectJ)) {
                            c cVar = this.targetPose;
                            if (cVar == c.Center || cVar == c.All) {
                                t0VarC = c(imageToAnalyze, b.Center);
                                t0Var = t0VarC;
                                bVar2 = null;
                            } else {
                                bVar = dg0.b.IncorrectPose;
                            }
                        } else {
                            bVar = dg0.b.FaceNotCentered;
                        }
                    } else if (fD < -15.0f) {
                        c cVar2 = this.targetPose;
                        if (cVar2 == c.Right || cVar2 == c.All) {
                            t0VarC = c(imageToAnalyze, b.Right);
                            t0Var = t0VarC;
                            bVar2 = null;
                        } else {
                            bVar = dg0.b.IncorrectPose;
                        }
                    } else if (15.0f < fD) {
                        c cVar3 = this.targetPose;
                        if (cVar3 == c.Left || cVar3 == c.All) {
                            t0VarC = c(imageToAnalyze, b.Left);
                            t0Var = t0VarC;
                            bVar2 = null;
                        } else {
                            bVar = dg0.b.IncorrectPose;
                        }
                    } else {
                        bVar = dg0.b.IncorrectPose;
                    }
                    return new dg0.c(t0Var, bVar2, result.size(), zQ, zR, zP, fD, aVarK);
                }
                bVar = dg0.b.FaceNotCentered;
            }
            bVar2 = bVar;
            t0Var = null;
            return new dg0.c(t0Var, bVar2, result.size(), zQ, zR, zP, fD, aVarK);
        } catch (ExecutionException unused) {
            return new dg0.c(null, dg0.b.FaceDetectionUnsupported, 0, false, false, false, BitmapDescriptorFactory.HUE_RED, aVarK);
        }
    }

    public final void s(boolean requireStrictSelfie) {
        this.minFaceRatio = requireStrictSelfie ? 0.45d : 0.35d;
    }

    public final void t(c pose) {
        p013kotlin.jvm.internal.s.k(pose, "pose");
        this.targetPose = pose;
    }

    public final void u(Rect rect, Rect previewRect) {
        p013kotlin.jvm.internal.s.k(rect, "rect");
        p013kotlin.jvm.internal.s.k(previewRect, "previewRect");
        this.viewfinderInfo = new ViewfinderInfo(rect, previewRect);
    }
}

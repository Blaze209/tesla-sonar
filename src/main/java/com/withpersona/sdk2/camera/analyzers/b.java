package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Bitmap;
import android.graphics.Rect;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.tasks.Task;
import com.google.android.renderscript.Toolkit;
import java.util.List;
import java.util.concurrent.ExecutionException;
import jn0.m;
import jn0.t;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import zf0.i0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/b;", "Lag0/b;", "<init>", "()V", "Landroid/graphics/Bitmap;", "original", "e", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Lzf0/i0;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljn0/s;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "a", "(Lzf0/i0;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsx/a;", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "()Lsx/a;", "barcodeDetector", "b", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements ag0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f57163c = {-0.15f, -0.15f, -0.15f, -0.15f, 2.2f, -0.15f, -0.15f, -0.15f, -0.15f};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy barcodeDetector = m.b(new wn0.a() { // from class: ag0.a
        @Override // wn0.a
        public final Object invoke() {
            return com.withpersona.sdk2.camera.analyzers.b.c();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final sx.a c() {
        sx.a aVarB = sx.c.b(new sx.b.a().b(2048, new int[0]).a());
        s.j(aVarB, "getClient(...)");
        return aVarB;
    }

    private final sx.a d() {
        return (sx.a) this.barcodeDetector.getValue();
    }

    private final Bitmap e(Bitmap original) {
        try {
            return Toolkit.b(Toolkit.f43205a, original, f57163c, null, 4, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        }
    }

    @Override // ag0.b
    public Object a(i0 i0Var, Rect rect, Continuation<? super jn0.s<? extends a>> continuation) {
        Bitmap bitmapA = i0Var.a();
        if (bitmapA == null) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(a.b.f57156a);
        }
        Bitmap bitmapE = e(bitmapA);
        if (bitmapE != null) {
            bitmapA = bitmapE;
        }
        wx.a aVarA = wx.a.a(bitmapA, i0Var.b().l());
        s.j(aVarA, "fromBitmap(...)");
        Task<List<tx.a>> taskProcess = d().process(aVarA);
        s.j(taskProcess, "process(...)");
        try {
            List<tx.a> result = taskProcess.getResult();
            s.j(result, "getResult(...)");
            tx.a aVar = (tx.a) v.r0(result, 0);
            if (aVar == null) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                return jn0.s.b(a.b.f57156a);
            }
            String strD = aVar.d();
            if (strD == null) {
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                return jn0.s.b(a.b.f57156a);
            }
            if (aVar.c() != 2048) {
                jn0.s.Companion companion4 = jn0.s.INSTANCE;
                return jn0.s.b(a.b.f57156a);
            }
            zf0.g.Pdf417BarcodeInfo pdf417BarcodeInfo = new zf0.g.Pdf417BarcodeInfo(strD);
            Rect rect2 = new Rect(0, 0, i0Var.b().m(), i0Var.b().i());
            Rect rectA = aVar.a();
            if (rectA == null) {
                jn0.s.Companion companion5 = jn0.s.INSTANCE;
                return jn0.s.b(a.b.f57156a);
            }
            rect2.inset(1, 1);
            if (rect2.contains(rectA)) {
                jn0.s.Companion companion6 = jn0.s.INSTANCE;
                return jn0.s.b(new a.C1154a(pdf417BarcodeInfo));
            }
            jn0.s.Companion companion7 = jn0.s.INSTANCE;
            return jn0.s.b(a.b.f57156a);
        } catch (ExecutionException unused) {
            jn0.s.Companion companion8 = jn0.s.INSTANCE;
            return jn0.s.b(t.a(new AnalysisError.GooglePlayError()));
        }
    }
}

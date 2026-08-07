package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import jn0.m;
import jn0.t;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import zf0.ImageIdMetadata;
import zf0.i0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/d;", "Lag0/b;", "<init>", "()V", "Lzf0/i0;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljn0/s;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "a", "(Lzf0/i0;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzx/d;", "Lkotlin/Lazy;", "e", "()Lzx/d;", "faceDetector", "Ldy/c;", "b", "f", "()Ldy/c;", "textDetector", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements ag0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy faceDetector = m.b(new wn0.a() { // from class: ag0.c
        @Override // wn0.a
        public final Object invoke() {
            return com.withpersona.sdk2.camera.analyzers.d.d();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy textDetector = m.b(new wn0.a() { // from class: ag0.d
        @Override // wn0.a
        public final Object invoke() {
            return com.withpersona.sdk2.camera.analyzers.d.g();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final zx.d d() {
        zx.d dVarA = zx.c.a(new zx.e.a().e(0.1f).a());
        s.j(dVarA, "getClient(...)");
        return dVarA;
    }

    private final zx.d e() {
        return (zx.d) this.faceDetector.getValue();
    }

    private final dy.c f() {
        return (dy.c) this.textDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dy.c g() {
        dy.c cVarA = dy.b.a(fy.a.f66714d);
        s.j(cVarA, "getClient(...)");
        return cVarA;
    }

    @Override // ag0.b
    public Object a(i0 i0Var, Rect rect, Continuation<? super jn0.s<? extends a>> continuation) {
        wx.a aVarB = i0Var.b();
        Task<List<zx.a>> taskProcess = e().process(aVarB);
        s.j(taskProcess, "process(...)");
        Task<dy.a> taskProcess2 = f().process(aVarB);
        s.j(taskProcess2, "process(...)");
        try {
            List<zx.a> result = taskProcess.getResult();
            s.j(result, "getResult(...)");
            zx.a aVar = (zx.a) v.r0(result, 0);
            if (aVar == null) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(a.b.f57156a);
            }
            List<dy.a.e> listB = taskProcess2.getResult().b();
            s.j(listB, "getTextBlocks(...)");
            List<dy.a.e> list = listB;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<dy.a.b> listD = ((dy.a.e) it.next()).d();
                s.j(listD, "getLines(...)");
                List<dy.a.b> list2 = listD;
                ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((dy.a.b) it2.next()).d());
                }
                arrayList.add(arrayList2);
            }
            if (v.A(arrayList).size() < 5) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                return jn0.s.b(a.b.f57156a);
            }
            Rect rect2 = new Rect(0, 0, aVarB.m(), aVarB.i());
            rect2.inset(1, 1);
            if (!rect2.contains(aVar.a())) {
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                return jn0.s.b(a.b.f57156a);
            }
            jn0.s.Companion companion4 = jn0.s.INSTANCE;
            String strA = taskProcess2.getResult().a();
            s.j(strA, "getText(...)");
            return jn0.s.b(new a.d(new ImageIdMetadata(strA)));
        } catch (ExecutionException unused) {
            jn0.s.Companion companion5 = jn0.s.INSTANCE;
            return jn0.s.b(t.a(new AnalysisError.DetectorError()));
        }
    }
}

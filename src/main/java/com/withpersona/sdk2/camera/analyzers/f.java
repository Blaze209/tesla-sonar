package com.withpersona.sdk2.camera.analyzers;

import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutionException;
import jn0.m;
import jn0.t;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import zf0.MrzExtraction;
import zf0.i0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/camera/analyzers/f;", "Lag0/b;", "<init>", "()V", "Lzf0/i0;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljn0/s;", "Lcom/withpersona/sdk2/camera/analyzers/a;", "a", "(Lzf0/i0;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldy/c;", "Lkotlin/Lazy;", "c", "()Ldy/c;", "textDetector", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements ag0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy textDetector = m.b(new wn0.a() { // from class: ag0.e
        @Override // wn0.a
        public final Object invoke() {
            return com.withpersona.sdk2.camera.analyzers.f.d();
        }
    });

    private final dy.c c() {
        return (dy.c) this.textDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dy.c d() {
        dy.c cVarA = dy.b.a(fy.a.f66714d);
        s.j(cVarA, "getClient(...)");
        return cVarA;
    }

    @Override // ag0.b
    public Object a(i0 i0Var, Rect rect, Continuation<? super jn0.s<? extends a>> continuation) {
        Task<dy.a> taskProcess = c().process(i0Var.b());
        s.j(taskProcess, "process(...)");
        try {
            String strA = taskProcess.getResult().a();
            s.j(strA, "getText(...)");
            if (s.f(strA, "")) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(a.b.f57156a);
            }
            MrzExtraction o0VarE = MrzExtraction.INSTANCE.e(strA);
            if (o0VarE == null) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                return jn0.s.b(a.b.f57156a);
            }
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            return jn0.s.b(new a.C1154a(new zf0.g.MrzBarcodeInfo(o0VarE.getRawText(), o0VarE.getIdentificationNumber(), o0VarE.getBirthdate(), o0VarE.getExpirationDate())));
        } catch (ExecutionException unused) {
            jn0.s.Companion companion4 = jn0.s.INSTANCE;
            return jn0.s.b(t.a(new AnalysisError.GooglePlayError()));
        }
    }
}

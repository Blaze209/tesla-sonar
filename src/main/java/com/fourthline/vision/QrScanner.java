package com.fourthline.vision;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.Closeable;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/fourthline/vision/QrScanner;", "Ljava/io/Closeable;", "<init>", "()V", "Landroid/graphics/Bitmap;", "image", "", "scan", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "close", "Lsx/a;", "a", "Lsx/a;", "barcodeScanner", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QrScanner implements Closeable {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sx.a barcodeScanner;

    static final class a implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f37536a;

        a(l function) {
            s.k(function, "function");
            this.f37536a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f37536a.invoke(obj);
        }
    }

    static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f37537a;

        b(Continuation<? super String> continuation) {
            this.f37537a = continuation;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<tx.a>) obj);
            return h0.f84049a;
        }

        public final void invoke(List<tx.a> list) {
            Continuation continuation = this.f37537a;
            s.h(list);
            tx.a aVar = (tx.a) v.q0(list);
            continuation.resumeWith(jn0.s.b(aVar != null ? aVar.d() : null));
        }
    }

    static final class c implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f37538a;

        c(Continuation<? super String> continuation) {
            this.f37538a = continuation;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc) {
            s.k(exc, "<unused var>");
            this.f37538a.resumeWith(jn0.s.b(null));
        }
    }

    public QrScanner() {
        sx.a aVarA = sx.c.a();
        s.j(aVarA, "getClient(...)");
        this.barcodeScanner = aVarA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.barcodeScanner.close();
    }

    public final Object scan(Bitmap bitmap, Continuation<? super String> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        this.barcodeScanner.process(wx.a.a(bitmap, 0)).addOnSuccessListener(new a(new b(safeContinuation))).addOnFailureListener(new c(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}

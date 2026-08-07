package com.fourthline.vision.internal;

import android.view.Surface;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.vision.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4291u implements H6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4257p f38930a;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.u$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38931a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38933c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38931a = obj;
            this.f38933c |= Integer.MIN_VALUE;
            return C4291u.this.start(null, this);
        }
    }

    public C4291u(C4257p camera2) {
        p013kotlin.jvm.internal.s.k(camera2, "camera2");
        this.f38930a = camera2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try start$lambda$0(Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return TryKt.failure(new AbstractC4255o4.a(it instanceof AbstractC4277s.d ? EnumC4241m4.CAMERA_NOT_AVAILABLE : EnumC4241m4.UNKNOWN, null, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.vision.internal.H6
    public Object start(List<? extends Surface> list, Continuation<? super Try<jn0.h0>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f38933c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f38933c = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInitializeCamera$fourthline_vision_release = aVar.f38931a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f38933c;
        if (i12 == 0) {
            jn0.t.b(objInitializeCamera$fourthline_vision_release);
            C4257p c4257p = this.f38930a;
            aVar.f38933c = 1;
            objInitializeCamera$fourthline_vision_release = c4257p.initializeCamera$fourthline_vision_release(list, aVar);
            if (objInitializeCamera$fourthline_vision_release == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objInitializeCamera$fourthline_vision_release);
        }
        return TryKt.handleErrorWith((Try) objInitializeCamera$fourthline_vision_release, new wn0.l() { // from class: com.fourthline.vision.internal.nb
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4291u.start$lambda$0((Throwable) obj);
            }
        });
    }

    @Override // com.fourthline.vision.internal.H6
    public void stop() {
        this.f38930a.closeCamera$fourthline_vision_release();
    }
}

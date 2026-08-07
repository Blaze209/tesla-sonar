package xf;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J:\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0080\u0001\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lxf/b;", "Lxf/h;", "Ltf/i;", "composition", "", ReactProgressBarViewManager.PROP_PROGRESS, "", "iteration", "", "resetLastFrameNanos", "Ljn0/h0;", "x", "(Ltf/i;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "iterations", "reverseOnRepeat", "speed", "Lxf/j;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Lxf/i;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "j", "(Ltf/i;IIZFLxf/j;FZLxf/i;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b extends h {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(b bVar, tf.i iVar, int i11, int i12, boolean z11, float f11, j jVar, float f12, boolean z12, i iVar2, boolean z13, boolean z14, Continuation continuation, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            int iW = (i13 & 2) != 0 ? bVar.w() : i11;
            int iL = (i13 & 4) != 0 ? bVar.l() : i12;
            boolean zV = (i13 & 8) != 0 ? bVar.v() : z11;
            float fM = (i13 & 16) != 0 ? bVar.m() : f11;
            j jVarY = (i13 & 32) != 0 ? bVar.y() : jVar;
            return bVar.j(iVar, iW, iL, zV, fM, jVarY, (i13 & 64) != 0 ? d.c(iVar, jVarY, fM) : f12, (i13 & 128) != 0 ? false : z12, (i13 & 256) != 0 ? i.Immediately : iVar2, (i13 & 512) != 0 ? false : z13, (i13 & 1024) != 0 ? false : z14, continuation);
        }

        public static /* synthetic */ Object b(b bVar, tf.i iVar, float f11, int i11, boolean z11, Continuation continuation, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
            }
            if ((i12 & 1) != 0) {
                iVar = bVar.s();
            }
            if ((i12 & 2) != 0) {
                f11 = bVar.getProgress();
            }
            if ((i12 & 4) != 0) {
                i11 = bVar.w();
            }
            if ((i12 & 8) != 0) {
                z11 = !(f11 == bVar.getProgress());
            }
            return bVar.x(iVar, f11, i11, z11, continuation);
        }
    }

    Object j(tf.i iVar, int i11, int i12, boolean z11, float f11, j jVar, float f12, boolean z12, i iVar2, boolean z13, boolean z14, Continuation<? super h0> continuation);

    Object x(tf.i iVar, float f11, int i11, boolean z11, Continuation<? super h0> continuation);
}

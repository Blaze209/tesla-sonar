package i3;

import androidx.collection.k0;
import androidx.collection.u0;
import androidx.compose.ui.focus.FocusTargetNode;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R,\u0010\u001c\u001a\u0004\u0018\u00010\n*\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Li3/t;", "", "<init>", "()V", "Ljn0/h0;", "f", "h", "g", "Landroidx/collection/k0;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Li3/p;", "a", "Landroidx/collection/k0;", "states", "Lt2/b;", "Lkotlin/Function0;", "b", "Lt2/b;", "cancellationListener", "", "c", "Z", "ongoingTransaction", "value", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/focus/FocusTargetNode;)Li3/p;", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;Li3/p;)V", "uncommittedFocusState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k0<FocusTargetNode, p> states = u0.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t2.b<wn0.a<h0>> cancellationListener = new t2.b<>(new wn0.a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean ongoingTransaction;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.ongoingTransaction = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        this.states.i();
        int i11 = 0;
        this.ongoingTransaction = false;
        t2.b<wn0.a<h0>> bVar = this.cancellationListener;
        int size = bVar.getSize();
        if (size > 0) {
            wn0.a<h0>[] aVarArrM = bVar.m();
            do {
                aVarArrM[i11].invoke();
                i11++;
            } while (i11 < size);
        }
        this.cancellationListener.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    public final void h() {
        k0<FocusTargetNode, p> k0Var = this.states;
        Object[] objArr = k0Var.keys;
        long[] jArr = k0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
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
                            ((FocusTargetNode) objArr[(i11 << 3) + i13]).B2();
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
        this.states.i();
        this.ongoingTransaction = false;
        this.cancellationListener.h();
    }

    public final p i(FocusTargetNode focusTargetNode) {
        return this.states.c(focusTargetNode);
    }

    public final void j(FocusTargetNode focusTargetNode, p pVar) {
        k0<FocusTargetNode, p> k0Var = this.states;
        if (pVar != null) {
            k0Var.s(focusTargetNode, pVar);
        } else {
            y3.a.c("requires a non-null focus state");
            throw new KotlinNothingValueException();
        }
    }
}

package e2;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.e3;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0014\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Le2/c;", "", "<init>", "()V", "Lb2/b0;", "legacyTextFieldState", "Lh2/h0;", "textFieldSelectionManager", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Landroidx/compose/ui/platform/e3;", "viewConfiguration", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "Lkotlin/Function1;", "Lo4/i;", "Ljn0/h0;", "editCommandConsumer", "b", "(Lb2/b0;Lh2/h0;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/ui/platform/e3;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;Lwn0/l;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "", DateTokenConverter.CONVERTER_KEY, "(Lb2/b0;Lh2/h0;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f61479a = new c();

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(IntConsumer intConsumer, int i11) {
        intConsumer.accept(i11);
    }

    public final void b(kotlin.b0 legacyTextFieldState, p007h2.h0 textFieldSelectionManager, HandwritingGesture gesture, e3 viewConfiguration, Executor executor, final IntConsumer consumer, wn0.l<? super o4.i, jn0.h0> editCommandConsumer) {
        final int iL = legacyTextFieldState != null ? i0.f61492a.l(legacyTextFieldState, gesture, textFieldSelectionManager, viewConfiguration, editCommandConsumer) : 3;
        if (consumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: e2.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.c(consumer, iL);
                }
            });
        } else {
            consumer.accept(iL);
        }
    }

    public final boolean d(kotlin.b0 legacyTextFieldState, p007h2.h0 textFieldSelectionManager, PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        if (legacyTextFieldState != null) {
            return i0.f61492a.D(legacyTextFieldState, gesture, textFieldSelectionManager, cancellationSignal);
        }
        return false;
    }
}

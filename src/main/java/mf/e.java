package mf;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.CancellationException;
import com.google.android.material.button.MaterialButton;
import gf.i;
import kotlinx.coroutines.CoroutineScope;
import nf.j;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001d"}, d2 = {"Lmf/e;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkf/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "Ljn0/h0;", "z", "(Landroid/content/Context;)V", "Lje/b;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "b", "(Lje/b;Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;)V", "a", "()V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lhf/d;", "Lhf/d;", "binding", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e extends ConstraintLayout implements kf.e {

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final hf.d binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(je.b delegate, View view) {
        s.k(delegate, "$delegate");
        ((je.a) delegate).r(new CancellationException("Payment in progress was cancelled"));
    }

    private final void z(Context localizedContext) {
        hf.d dVar = this.binding;
        TextView textViewPaymentInProgressTitle = dVar.f72642e;
        s.j(textViewPaymentInProgressTitle, "textViewPaymentInProgressTitle");
        j.i(textViewPaymentInProgressTitle, i.f68837d, localizedContext, false, 4, null);
        TextView textViewPaymentInProgressDescription = dVar.f72641d;
        s.j(textViewPaymentInProgressDescription, "textViewPaymentInProgressDescription");
        j.i(textViewPaymentInProgressDescription, i.f68836c, localizedContext, false, 4, null);
        MaterialButton buttonPaymentInProgressCancel = dVar.f72639b;
        s.j(buttonPaymentInProgressCancel, "buttonPaymentInProgressCancel");
        j.i(buttonPaymentInProgressCancel, i.f68835b, localizedContext, false, 4, null);
    }

    @Override // kf.e
    public void b(final je.b delegate, CoroutineScope coroutineScope, Context localizedContext) {
        s.k(delegate, "delegate");
        s.k(coroutineScope, "coroutineScope");
        s.k(localizedContext, "localizedContext");
        if (!(delegate instanceof je.a)) {
            throw new IllegalArgumentException("Unsupported delegate type");
        }
        z(localizedContext);
        this.binding.f72639b.setOnClickListener(new View.OnClickListener() { // from class: mf.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.A(delegate, view);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        hf.d dVarB = hf.d.b(LayoutInflater.from(context), this);
        s.j(dVarB, "inflate(...)");
        this.binding = dVarB;
    }

    @Override // kf.e
    public void a() {
    }

    @Override // kf.e
    public View getView() {
        return this;
    }
}

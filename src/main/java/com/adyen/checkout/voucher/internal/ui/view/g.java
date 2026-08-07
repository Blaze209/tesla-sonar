package com.adyen.checkout.voucher.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.ui.core.internal.ui.LogoSize;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import nf.j;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import sf.VoucherOutputData;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\f2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020(8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010-R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/view/g;", "Landroid/widget/LinearLayout;", "Lkf/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "Ljn0/h0;", "e", "(Landroid/content/Context;)V", "Lrf/c;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "h", "(Lrf/c;Lkotlinx/coroutines/CoroutineScope;)V", "Lsf/b;", "outputData", IntegerTokenConverter.CONVERTER_KEY, "(Lsf/b;)V", "", Action.PAYMENT_METHOD_TYPE, "g", "(Ljava/lang/String;)V", "introductionTextResource", "j", "(Ljava/lang/Integer;)V", "Lje/b;", "b", "(Lje/b;Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;)V", "a", "()V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lpf/c;", "Lpf/c;", "getBinding", "()Lpf/c;", "binding", "Landroid/content/Context;", "c", "Lrf/c;", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class g extends LinearLayout implements kf.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pf.c binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Context localizedContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private rf.c delegate;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsf/b;", "it", "Ljn0/h0;", "<anonymous>", "(Lsf/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.voucher.internal.ui.view.SimpleVoucherView$observeDelegate$1", f = "SimpleVoucherView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<VoucherOutputData, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f19817n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f19818o;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(VoucherOutputData voucherOutputData, Continuation<? super h0> continuation) {
            return ((a) create(voucherOutputData, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f19818o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f19817n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            g.this.i((VoucherOutputData) this.f19818o);
            return h0.f84049a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    private final void e(Context localizedContext) {
        TextView textViewDownload = this.binding.f102202d;
        s.j(textViewDownload, "textViewDownload");
        j.i(textViewDownload, of.d.f97274d, localizedContext, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(je.b delegate, g this$0, View view) {
        s.k(delegate, "$delegate");
        s.k(this$0, "this$0");
        Context context = this$0.getContext();
        s.j(context, "getContext(...)");
        ((rf.c) delegate).n(context);
    }

    private final void g(String paymentMethodType) {
        if (paymentMethodType == null || paymentMethodType.length() == 0) {
            return;
        }
        ImageView imageViewLogo = this.binding.f102200b;
        s.j(imageViewLogo, "imageViewLogo");
        rf.c cVar = this.delegate;
        if (cVar == null) {
            s.B("delegate");
            cVar = null;
        }
        kf.h.i(imageViewLogo, cVar.e().getEnvironment(), paymentMethodType, null, LogoSize.MEDIUM, null, 0, 0, 116, null);
    }

    private final void h(rf.c delegate, CoroutineScope coroutineScope) {
        FlowKt.launchIn(FlowKt.onEach(delegate.h(), new a(null)), coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(VoucherOutputData outputData) {
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = getClass().getName();
            s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "outputDataChanged", null);
        }
        g(outputData.getPaymentMethodType());
        j(outputData.getIntroductionTextResource());
    }

    private final void j(Integer introductionTextResource) {
        if (introductionTextResource == null) {
            return;
        }
        TextView textView = this.binding.f102201c;
        Context context = this.localizedContext;
        if (context == null) {
            s.B("localizedContext");
            context = null;
        }
        textView.setText(context.getString(introductionTextResource.intValue()));
    }

    @Override // kf.e
    public void a() {
    }

    @Override // kf.e
    public void b(final je.b delegate, CoroutineScope coroutineScope, Context localizedContext) {
        s.k(delegate, "delegate");
        s.k(coroutineScope, "coroutineScope");
        s.k(localizedContext, "localizedContext");
        if (!(delegate instanceof rf.c)) {
            throw new IllegalArgumentException("Unsupported delegate type");
        }
        rf.c cVar = (rf.c) delegate;
        this.delegate = cVar;
        this.localizedContext = localizedContext;
        e(localizedContext);
        h(cVar, coroutineScope);
        this.binding.f102202d.setOnClickListener(new View.OnClickListener() { // from class: com.adyen.checkout.voucher.internal.ui.view.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.f(delegate, this, view);
            }
        });
    }

    protected final pf.c getBinding() {
        return this.binding;
    }

    @Override // kf.e
    public View getView() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ g(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        pf.c cVarB = pf.c.b(LayoutInflater.from(context), this);
        s.j(cVarB, "inflate(...)");
        this.binding = cVarB;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(gf.d.f68798b);
        setPadding(dimension, dimension, dimension, dimension);
    }
}

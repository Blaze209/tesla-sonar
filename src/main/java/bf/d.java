package bf;

import af.QRCodeOutputData;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.action.Action;
import com.google.android.material.button.MaterialButton;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import jn0.t;
import ke.TimerData;
import kf.e;
import kf.h;
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
import ve.f;
import ve.g;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b%\u0010\u001eJ'\u0010'\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010/R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u00101R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lbf/d;", "Landroid/widget/LinearLayout;", "Lkf/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "Ljn0/h0;", "h", "(Landroid/content/Context;)V", "Lze/b;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "j", "(Lze/b;Lkotlinx/coroutines/CoroutineScope;)V", "Laf/a;", "outputData", "l", "(Laf/a;)V", "", Action.PAYMENT_METHOD_TYPE, "g", "(Ljava/lang/String;)Ljava/lang/Integer;", "m", "(Ljava/lang/String;)V", "n", "Lke/o;", "timerData", "k", "(Lke/o;)V", "qrCodeData", "f", "Lje/b;", "b", "(Lje/b;Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "a", "()V", "Lwe/b;", "Lwe/b;", "binding", "Landroid/content/Context;", "c", "Lze/b;", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends LinearLayout implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final we.b binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Context localizedContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ze.b delegate;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laf/a;", "it", "Ljn0/h0;", "<anonymous>", "(Laf/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.qrcode.internal.ui.view.SimpleQRCodeView$observeDelegate$1", f = "SimpleQRCodeView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<QRCodeOutputData, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17086n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f17087o;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(QRCodeOutputData qRCodeOutputData, Continuation<? super h0> continuation) {
            return ((a) create(qRCodeOutputData, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f17087o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f17086n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            d.this.l((QRCodeOutputData) this.f17087o);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lke/o;", "it", "Ljn0/h0;", "<anonymous>", "(Lke/o;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.qrcode.internal.ui.view.SimpleQRCodeView$observeDelegate$2", f = "SimpleQRCodeView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<TimerData, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17089n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f17090o;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TimerData timerData, Continuation<? super h0> continuation) {
            return ((b) create(timerData, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = d.this.new b(continuation);
            bVar.f17090o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f17089n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            d.this.k((TimerData) this.f17090o);
            return h0.f84049a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    private final void f(String qrCodeData) {
        if (qrCodeData == null) {
            return;
        }
        Context context = getContext();
        s.j(context, "getContext(...)");
        Context context2 = this.localizedContext;
        if (context2 == null) {
            s.B("localizedContext");
            context2 = null;
        }
        le.c.a(context, "Pix Code", qrCodeData, context2.getString(f.f119067a));
    }

    private final Integer g(String paymentMethodType) {
        if (s.f(paymentMethodType, "pix")) {
            return Integer.valueOf(f.f119074h);
        }
        return null;
    }

    private final void h(Context localizedContext) {
        MaterialButton copyButton = this.binding.f121708b;
        s.j(copyButton, "copyButton");
        j.i(copyButton, g.f119079a, localizedContext, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(d this$0, je.b delegate, View view) {
        s.k(this$0, "this$0");
        s.k(delegate, "$delegate");
        this$0.f(((ze.b) delegate).c().getQrCodeData());
    }

    private final void j(ze.b delegate, CoroutineScope coroutineScope) {
        FlowKt.launchIn(FlowKt.onEach(delegate.h(), new a(null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(delegate.u(), new b(null)), coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(TimerData timerData) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long minutes = timeUnit.toMinutes(timerData.getMillisUntilFinished());
        long seconds = timeUnit.toSeconds(timerData.getMillisUntilFinished()) % TimeUnit.MINUTES.toSeconds(1L);
        Context context = this.localizedContext;
        Context context2 = null;
        if (context == null) {
            s.B("localizedContext");
            context = null;
        }
        String string = context.getString(f.f119076j, Long.valueOf(minutes), Long.valueOf(seconds));
        s.j(string, "getString(...)");
        TextView textView = this.binding.f121711e;
        Context context3 = this.localizedContext;
        if (context3 == null) {
            s.B("localizedContext");
        } else {
            context2 = context3;
        }
        textView.setText(context2.getString(f.f119077k, string));
        this.binding.f121710d.setProgress(timerData.getProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(QRCodeOutputData outputData) {
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = d.class.getName();
            s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "outputDataChanged", null);
        }
        n(outputData.getPaymentMethodType());
        m(outputData.getPaymentMethodType());
    }

    private final void m(String paymentMethodType) {
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        ze.b bVar = null;
        if (companion.a().a(aVar)) {
            String name = d.class.getName();
            s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            me.b bVarA = companion.a();
            bVarA.b(aVar, "CO." + name, "updateLogo - " + paymentMethodType, null);
        }
        if (paymentMethodType == null || paymentMethodType.length() == 0) {
            return;
        }
        ImageView imageViewLogo = this.binding.f121709c;
        s.j(imageViewLogo, "imageViewLogo");
        ze.b bVar2 = this.delegate;
        if (bVar2 == null) {
            s.B("delegate");
        } else {
            bVar = bVar2;
        }
        h.i(imageViewLogo, bVar.getComponentParams().getEnvironment(), paymentMethodType, null, null, null, 0, 0, 124, null);
    }

    private final void n(String paymentMethodType) {
        Integer numG = g(paymentMethodType);
        if (numG != null) {
            int iIntValue = numG.intValue();
            TextView textView = this.binding.f121712f;
            Context context = this.localizedContext;
            if (context == null) {
                s.B("localizedContext");
                context = null;
            }
            textView.setText(context.getString(iIntValue));
        }
    }

    @Override // kf.e
    public void b(final je.b delegate, CoroutineScope coroutineScope, Context localizedContext) {
        s.k(delegate, "delegate");
        s.k(coroutineScope, "coroutineScope");
        s.k(localizedContext, "localizedContext");
        if (!(delegate instanceof ze.b)) {
            throw new IllegalArgumentException("Unsupported delegate type");
        }
        ze.b bVar = (ze.b) delegate;
        this.delegate = bVar;
        this.localizedContext = localizedContext;
        h(localizedContext);
        j(bVar, coroutineScope);
        this.binding.f121708b.setOnClickListener(new View.OnClickListener() { // from class: bf.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.i(this.f17081a, delegate, view);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        we.b bVarB = we.b.b(LayoutInflater.from(context), this);
        s.j(bVarB, "inflate(...)");
        this.binding = bVarB;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(gf.d.f68797a);
        setPadding(dimension, dimension, dimension, dimension);
    }

    @Override // kf.e
    public void a() {
    }

    @Override // kf.e
    public View getView() {
        return this;
    }
}

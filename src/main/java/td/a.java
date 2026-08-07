package td;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.paymentmethod.BlikPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.MBWayPaymentMethod;
import gf.d;
import jn0.h0;
import jn0.t;
import kf.e;
import kf.h;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import nf.j;
import od.f;
import od.g;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import rd.b;
import sd.AwaitOutputData;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010+R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Ltd/a;", "Landroid/widget/LinearLayout;", "Lkf/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "Ljn0/h0;", "e", "(Landroid/content/Context;)V", "Lrd/b;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "f", "(Lrd/b;Lkotlinx/coroutines/CoroutineScope;)V", "Lsd/a;", "outputData", "g", "(Lsd/a;)V", "", Action.PAYMENT_METHOD_TYPE, IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "h", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/Integer;", "Lje/b;", "b", "(Lje/b;Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;)V", "a", "()V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lpd/a;", "Lpd/a;", "binding", "Landroid/content/Context;", "c", "Lrd/b;", "await_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a extends LinearLayout implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pd.a binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Context localizedContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private b delegate;

    /* JADX INFO: renamed from: td.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsd/a;", "it", "Ljn0/h0;", "<anonymous>", "(Lsd/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.await.internal.ui.view.AwaitView$observeDelegate$1", f = "AwaitView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C2416a extends SuspendLambda implements p<AwaitOutputData, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f113186n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f113187o;

        C2416a(Continuation<? super C2416a> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AwaitOutputData awaitOutputData, Continuation<? super h0> continuation) {
            return ((C2416a) create(awaitOutputData, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C2416a c2416a = a.this.new C2416a(continuation);
            c2416a.f113187o = obj;
            return c2416a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f113186n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            a.this.g((AwaitOutputData) this.f113187o);
            return h0.f84049a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    private final Integer d(String paymentMethodType) {
        if (paymentMethodType == null) {
            return null;
        }
        int iHashCode = paymentMethodType.hashCode();
        if (iHashCode == -2116042983) {
            if (paymentMethodType.equals("upi_collect")) {
                return Integer.valueOf(f.f97124c);
            }
            return null;
        }
        if (iHashCode == 3026668) {
            if (paymentMethodType.equals(BlikPaymentMethod.PAYMENT_METHOD_TYPE)) {
                return Integer.valueOf(f.f97122a);
            }
            return null;
        }
        if (iHashCode == 103700794 && paymentMethodType.equals(MBWayPaymentMethod.PAYMENT_METHOD_TYPE)) {
            return Integer.valueOf(f.f97123b);
        }
        return null;
    }

    private final void e(Context localizedContext) {
        TextView textViewWaitingConfirmation = this.binding.f102107d;
        s.j(textViewWaitingConfirmation, "textViewWaitingConfirmation");
        j.i(textViewWaitingConfirmation, g.f97125a, localizedContext, false, 4, null);
    }

    private final void f(b delegate, CoroutineScope coroutineScope) {
        FlowKt.launchIn(FlowKt.onEach(delegate.h(), new C2416a(null)), coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(AwaitOutputData outputData) {
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = a.class.getName();
            s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "outputDataChanged", null);
        }
        i(outputData.getPaymentMethodType());
        h(outputData.getPaymentMethodType());
    }

    private final void h(String paymentMethodType) {
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        b bVar = null;
        if (companion.a().a(aVar)) {
            String name = a.class.getName();
            s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            me.b bVarA = companion.a();
            bVarA.b(aVar, "CO." + name, "updateLogo - " + paymentMethodType, null);
        }
        if (paymentMethodType != null) {
            ImageView imageViewLogo = this.binding.f102105b;
            s.j(imageViewLogo, "imageViewLogo");
            b bVar2 = this.delegate;
            if (bVar2 == null) {
                s.B("delegate");
            } else {
                bVar = bVar2;
            }
            h.i(imageViewLogo, bVar.e().getEnvironment(), paymentMethodType, null, null, null, 0, 0, 124, null);
        }
    }

    private final void i(String paymentMethodType) {
        Integer numD = d(paymentMethodType);
        if (numD != null) {
            int iIntValue = numD.intValue();
            TextView textView = this.binding.f102106c;
            Context context = this.localizedContext;
            if (context == null) {
                s.B("localizedContext");
                context = null;
            }
            textView.setText(context.getString(iIntValue));
        }
    }

    @Override // kf.e
    public void b(je.b delegate, CoroutineScope coroutineScope, Context localizedContext) {
        s.k(delegate, "delegate");
        s.k(coroutineScope, "coroutineScope");
        s.k(localizedContext, "localizedContext");
        if (!(delegate instanceof b)) {
            throw new IllegalArgumentException("Unsupported delegate type");
        }
        b bVar = (b) delegate;
        this.delegate = bVar;
        this.localizedContext = localizedContext;
        e(localizedContext);
        f(bVar, coroutineScope);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        pd.a aVarB = pd.a.b(LayoutInflater.from(context), this);
        s.j(aVarB, "inflate(...)");
        this.binding = aVarB;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(d.f68797a);
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

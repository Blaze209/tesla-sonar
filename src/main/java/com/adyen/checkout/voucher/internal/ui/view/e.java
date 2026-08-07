package com.adyen.checkout.voucher.internal.ui.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.ui.core.internal.ui.LogoSize;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.button.MaterialButton;
import ezvcard.property.Gender;
import java.util.List;
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
import sf.VoucherInformationField;
import sf.VoucherOutputData;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001@B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\f2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b%\u0010\u001cJ\u0019\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\f2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u00100J\u0019\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b3\u0010\u001cJ\u0017\u00105\u001a\u00020\f2\u0006\u00104\u001a\u00020\u0019H\u0002¢\u0006\u0004\b5\u0010\u001cJ\u000f\u00106\u001a\u00020\fH\u0002¢\u0006\u0004\b6\u00100J\u000f\u00107\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u00100J\u0019\u00108\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b8\u0010\u001cJ\u0017\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J'\u0010>\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020=2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\fH\u0016¢\u0006\u0004\b@\u00100J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/view/e;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkf/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "localizedContext", "Ljn0/h0;", "J", "(Landroid/content/Context;)V", "Lrf/c;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", Gender.OTHER, "(Lrf/c;Lkotlinx/coroutines/CoroutineScope;)V", "Lsf/b;", "outputData", "S", "(Lsf/b;)V", "", Action.PAYMENT_METHOD_TYPE, Gender.NONE, "(Ljava/lang/String;)V", "introductionTextResource", "X", "(Ljava/lang/Integer;)V", "Lcom/adyen/checkout/components/core/Amount;", "amount", Gender.UNKNOWN, "(Lcom/adyen/checkout/components/core/Amount;)V", "codeReference", "V", "Lsf/e;", "storeAction", "a0", "(Lsf/e;)V", "", "Lsf/a;", "informationFields", "W", "(Ljava/util/List;)V", "P", "()V", "R", "instructionUrl", "Y", ImagesContract.URL, "Q", "I", "T", "G", "Lsf/f;", "event", "H", "(Lsf/f;)V", "Lje/b;", "b", "(Lje/b;Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;)V", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lpf/b;", "z", "Lpf/b;", "binding", "A", "Landroid/content/Context;", "B", "Lrf/c;", "Lcom/adyen/checkout/voucher/internal/ui/view/h;", "C", "Lcom/adyen/checkout/voucher/internal/ui/view/h;", "informationFieldsAdapter", "D", "Lkotlinx/coroutines/CoroutineScope;", "E", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e extends ConstraintLayout implements kf.e {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Context localizedContext;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private rf.c delegate;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private h informationFieldsAdapter;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final pf.b binding;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsf/b;", "it", "Ljn0/h0;", "<anonymous>", "(Lsf/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.voucher.internal.ui.view.FullVoucherView$observeDelegate$1", f = "FullVoucherView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<VoucherOutputData, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f19805n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f19806o;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(VoucherOutputData voucherOutputData, Continuation<? super h0> continuation) {
            return ((b) create(voucherOutputData, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = e.this.new b(continuation);
            bVar.f19806o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f19805n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            e.this.S((VoucherOutputData) this.f19806o);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsf/f;", "it", "Ljn0/h0;", "<anonymous>", "(Lsf/f;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.voucher.internal.ui.view.FullVoucherView$observeDelegate$2", f = "FullVoucherView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<sf.f, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f19808n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f19809o;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sf.f fVar, Continuation<? super h0> continuation) {
            return ((c) create(fVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = e.this.new c(continuation);
            cVar.f19809o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f19808n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            e.this.H((sf.f) this.f19809o);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/adyen/checkout/voucher/internal/ui/view/e$d", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Ljn0/h0;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements View.OnLayoutChangeListener {
        public d() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            rf.c cVar = e.this.delegate;
            if (cVar == null) {
                s.B("delegate");
                cVar = null;
            }
            Context context = e.this.getContext();
            s.j(context, "getContext(...)");
            cVar.q(context, e.this);
            e.this.T();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    private final void G(String codeReference) {
        if (codeReference == null) {
            return;
        }
        Context context = getContext();
        s.j(context, "getContext(...)");
        Context context2 = this.localizedContext;
        if (context2 == null) {
            s.B("localizedContext");
            context2 = null;
        }
        le.c.a(context, "Voucher code reference", codeReference, context2.getString(of.c.f97259b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(sf.f event) {
        if (s.f(event, sf.f.c.f111137a)) {
            Context context = getContext();
            s.j(context, "getContext(...)");
            Context context2 = this.localizedContext;
            if (context2 == null) {
                s.B("localizedContext");
                context2 = null;
            }
            String string = context2.getString(of.c.f97263f);
            s.j(string, "getString(...)");
            le.c.d(context, string, 0, 2, null);
            return;
        }
        if (s.f(event, sf.f.b.f111136a)) {
            Context context3 = getContext();
            s.j(context3, "getContext(...)");
            Context context4 = this.localizedContext;
            if (context4 == null) {
                s.B("localizedContext");
                context4 = null;
            }
            String string2 = context4.getString(of.c.f97267j);
            s.j(string2, "getString(...)");
            le.c.d(context3, string2, 0, 2, null);
            return;
        }
        if (event instanceof sf.f.Failure) {
            Context context5 = getContext();
            s.j(context5, "getContext(...)");
            Context context6 = this.localizedContext;
            if (context6 == null) {
                s.B("localizedContext");
                context6 = null;
            }
            String string3 = context6.getString(of.c.f97262e);
            s.j(string3, "getString(...)");
            le.c.d(context5, string3, 0, 2, null);
        }
    }

    private final void I() {
        MaterialButton buttonCopyCode = this.binding.f102184b;
        s.j(buttonCopyCode, "buttonCopyCode");
        buttonCopyCode.setVisibility(8);
        a0(null);
    }

    private final void J(Context localizedContext) {
        pf.b bVar = this.binding;
        TextView textViewPaymentReference = bVar.f102196n;
        s.j(textViewPaymentReference, "textViewPaymentReference");
        j.i(textViewPaymentReference, of.d.f97275e, localizedContext, false, 4, null);
        MaterialButton buttonCopyCode = bVar.f102184b;
        s.j(buttonCopyCode, "buttonCopyCode");
        j.i(buttonCopyCode, of.d.f97271a, localizedContext, false, 4, null);
        MaterialButton buttonDownloadPdf = bVar.f102185c;
        s.j(buttonDownloadPdf, "buttonDownloadPdf");
        j.i(buttonDownloadPdf, of.d.f97272b, localizedContext, false, 4, null);
        MaterialButton buttonSaveImage = bVar.f102186d;
        s.j(buttonSaveImage, "buttonSaveImage");
        j.i(buttonSaveImage, of.d.f97273c, localizedContext, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(e this$0, je.b delegate, View view) {
        s.k(this$0, "this$0");
        s.k(delegate, "$delegate");
        this$0.G(((rf.c) delegate).c().getReference());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(e this$0, View view) {
        s.k(this$0, "this$0");
        this$0.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(e this$0, View view) {
        s.k(this$0, "this$0");
        this$0.R();
    }

    private final void N(String paymentMethodType) {
        if (paymentMethodType == null || paymentMethodType.length() == 0) {
            return;
        }
        RoundCornerImageView imageViewLogo = this.binding.f102187e;
        s.j(imageViewLogo, "imageViewLogo");
        rf.c cVar = this.delegate;
        if (cVar == null) {
            s.B("delegate");
            cVar = null;
        }
        kf.h.i(imageViewLogo, cVar.e().getEnvironment(), paymentMethodType, null, LogoSize.MEDIUM, null, 0, 0, 116, null);
    }

    private final void O(rf.c delegate, CoroutineScope coroutineScope) {
        FlowKt.launchIn(FlowKt.onEach(delegate.h(), new b(null)), coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(delegate.a(), new c(null)), coroutineScope);
    }

    private final void P() {
        rf.c cVar = this.delegate;
        if (cVar == null) {
            s.B("delegate");
            cVar = null;
        }
        Context context = getContext();
        s.j(context, "getContext(...)");
        cVar.n(context);
    }

    private final void Q(String url) {
        nf.a aVar = nf.a.f94865a;
        Context context = getContext();
        s.j(context, "getContext(...)");
        Uri uri = Uri.parse(url);
        s.j(uri, "parse(...)");
        if (aVar.c(context, uri)) {
            me.a aVar2 = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar2)) {
                String name = e.class.getName();
                s.h(name);
                String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = p013kotlin.text.t.W0(strU1, "Kt");
                }
                companion.a().b(aVar2, "CO." + name, "Successfully opened instructions in custom tab", null);
                return;
            }
            return;
        }
        me.a aVar3 = me.a.ERROR;
        me.b.Companion companion2 = me.b.INSTANCE;
        if (companion2.a().a(aVar3)) {
            String name2 = e.class.getName();
            s.h(name2);
            String strU2 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU2.length() != 0) {
                name2 = p013kotlin.text.t.W0(strU2, "Kt");
            }
            companion2.a().b(aVar3, "CO." + name2, "Couldn't open instructions in custom tab", null);
        }
    }

    private final void R() {
        I();
        addOnLayoutChangeListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(VoucherOutputData outputData) {
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = e.class.getName();
            s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "outputDataChanged", null);
        }
        N(outputData.getPaymentMethodType());
        X(outputData.getIntroductionTextResource());
        U(outputData.getTotalAmount());
        V(outputData.getReference());
        a0(outputData.getStoreAction());
        W(outputData.a());
        Y(outputData.getInstructionUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        MaterialButton buttonCopyCode = this.binding.f102184b;
        s.j(buttonCopyCode, "buttonCopyCode");
        buttonCopyCode.setVisibility(0);
        rf.c cVar = this.delegate;
        if (cVar == null) {
            s.B("delegate");
            cVar = null;
        }
        a0(cVar.c().getStoreAction());
    }

    private final void U(Amount amount) {
        pf.b bVar = this.binding;
        if (amount == null || le.a.a(amount)) {
            TextView textViewAmount = bVar.f102194l;
            s.j(textViewAmount, "textViewAmount");
            textViewAmount.setVisibility(8);
            return;
        }
        le.d dVar = le.d.f89947a;
        rf.c cVar = this.delegate;
        if (cVar == null) {
            s.B("delegate");
            cVar = null;
        }
        String strB = dVar.b(amount, cVar.e().getShopperLocale());
        TextView textViewAmount2 = bVar.f102194l;
        s.j(textViewAmount2, "textViewAmount");
        textViewAmount2.setVisibility(0);
        bVar.f102194l.setText(strB);
    }

    private final void V(String codeReference) {
        pf.b bVar = this.binding;
        bVar.f102198p.setText(codeReference);
        boolean z11 = codeReference == null || codeReference.length() == 0;
        TextView textViewReferenceCode = bVar.f102198p;
        s.j(textViewReferenceCode, "textViewReferenceCode");
        textViewReferenceCode.setVisibility(!z11 ? 0 : 8);
        MaterialButton buttonCopyCode = bVar.f102184b;
        s.j(buttonCopyCode, "buttonCopyCode");
        buttonCopyCode.setVisibility(z11 ? 8 : 0);
    }

    private final void W(List<VoucherInformationField> informationFields) {
        List<VoucherInformationField> list = informationFields;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.informationFieldsAdapter == null) {
            Context context = getContext();
            s.j(context, "getContext(...)");
            Context context2 = this.localizedContext;
            if (context2 == null) {
                s.B("localizedContext");
                context2 = null;
            }
            h hVar = new h(context, context2);
            this.informationFieldsAdapter = hVar;
            this.binding.f102191i.setAdapter(hVar);
        }
        h hVar2 = this.informationFieldsAdapter;
        if (hVar2 != null) {
            hVar2.submitList(informationFields);
        }
    }

    private final void X(Integer introductionTextResource) {
        if (introductionTextResource == null) {
            return;
        }
        TextView textView = this.binding.f102195m;
        Context context = this.localizedContext;
        if (context == null) {
            s.B("localizedContext");
            context = null;
        }
        textView.setText(context.getString(introductionTextResource.intValue()));
    }

    private final void Y(final String instructionUrl) {
        TextView textViewReadInstructions = this.binding.f102197o;
        s.j(textViewReadInstructions, "textViewReadInstructions");
        textViewReadInstructions.setVisibility(instructionUrl != null ? 0 : 8);
        if (instructionUrl != null) {
            TextView textView = this.binding.f102197o;
            Context context = this.localizedContext;
            if (context == null) {
                s.B("localizedContext");
                context = null;
            }
            String string = context.getString(of.c.f97269l);
            s.j(string, "getString(...)");
            textView.setText(j.a(string));
            this.binding.f102197o.setOnClickListener(new View.OnClickListener() { // from class: com.adyen.checkout.voucher.internal.ui.view.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.Z(this.f19802a, instructionUrl, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(e this$0, String str, View view) {
        s.k(this$0, "this$0");
        this$0.Q(str);
    }

    private final void a0(sf.e storeAction) {
        pf.b bVar = this.binding;
        MaterialButton buttonDownloadPdf = bVar.f102185c;
        s.j(buttonDownloadPdf, "buttonDownloadPdf");
        buttonDownloadPdf.setVisibility(storeAction instanceof sf.e.DownloadPdf ? 0 : 8);
        MaterialButton buttonSaveImage = bVar.f102186d;
        s.j(buttonSaveImage, "buttonSaveImage");
        buttonSaveImage.setVisibility(storeAction instanceof sf.e.b ? 0 : 8);
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
        J(localizedContext);
        O(cVar, coroutineScope);
        this.coroutineScope = coroutineScope;
        this.binding.f102184b.setOnClickListener(new View.OnClickListener() { // from class: com.adyen.checkout.voucher.internal.ui.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.K(this.f19798a, delegate, view);
            }
        });
        this.binding.f102185c.setOnClickListener(new View.OnClickListener() { // from class: com.adyen.checkout.voucher.internal.ui.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.L(this.f19800a, view);
            }
        });
        this.binding.f102186d.setOnClickListener(new View.OnClickListener() { // from class: com.adyen.checkout.voucher.internal.ui.view.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.M(this.f19801a, view);
            }
        });
    }

    @Override // kf.e
    public View getView() {
        return this;
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
        pf.b bVarB = pf.b.b(LayoutInflater.from(context), this);
        s.j(bVarB, "inflate(...)");
        this.binding = bVarB;
        int dimension = (int) getResources().getDimension(gf.d.f68798b);
        setPadding(dimension, dimension, dimension, dimension);
    }
}

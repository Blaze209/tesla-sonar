package a30;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"La30/t;", "Landroid/widget/EditText;", "view", "Ljn0/h0;", "b", "(La30/t;Landroid/widget/EditText;)V", "Landroid/widget/TextView;", "Lkotlin/Function1;", "", "handler", "", "c", "(Landroid/widget/TextView;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1", f = "TextControllerControlEditText.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f222n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f223o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ t f224p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ EditText f225q;

        /* JADX INFO: renamed from: a30.u$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "textValue", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1$1", f = "TextControllerControlEditText.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C0014a extends SuspendLambda implements wn0.p<String, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f226n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f227o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ EditText f228p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0014a(EditText editText, Continuation<? super C0014a> continuation) {
                super(2, continuation);
                this.f228p = editText;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, Continuation<? super jn0.h0> continuation) {
                return ((C0014a) create(str, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                C0014a c0014a = new C0014a(this.f228p, continuation);
                c0014a.f227o = obj;
                return c0014a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f226n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                String str = (String) this.f227o;
                if (!p013kotlin.jvm.internal.s.f(str, this.f228p.getText().toString())) {
                    this.f228p.setText(str);
                }
                return jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "updatedText", "Ljn0/h0;", "a", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {1, 6, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.l<CharSequence, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ t f229c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(t tVar) {
                super(1);
                this.f229c = tVar;
            }

            public final void a(CharSequence charSequence) {
                t tVar = this.f229c;
                String string = charSequence == null ? null : charSequence.toString();
                if (string == null) {
                    string = "";
                }
                tVar.a(string);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(CharSequence charSequence) {
                a(charSequence);
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t tVar, EditText editText, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f224p = tVar;
            this.f225q = editText;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f224p, this.f225q, continuation);
            aVar.f223o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f222n;
            if (i11 == 0) {
                jn0.t.b(obj);
                FlowKt.launchIn(FlowKt.onEach(this.f224p.b(), new C0014a(this.f225q, null)), (CoroutineScope) this.f223o);
                EditText editText = this.f225q;
                b bVar = new b(this.f224p);
                this.f222n = 1;
                if (u.c(editText, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt", f = "TextControllerControlEditText.kt", i = {0, 0}, l = {91}, m = "listenForTextChangesUntilCancelled", n = {"$this$listenForTextChangesUntilCancelled", "handler"}, s = {"L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f230n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f231o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f232p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f233q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f232p = obj;
            this.f233q |= Integer.MIN_VALUE;
            return u.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f235d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(TextView textView, d dVar) {
            super(1);
            this.f234c = textView;
            this.f235d = dVar;
        }

        public final void a(Throwable th2) {
            this.f234c.removeTextChangedListener(this.f235d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Throwable th2) {
            a(th2);
            return jn0.h0.f84049a;
        }
    }

    public static final void b(t tVar, EditText view) {
        Job subscription;
        p013kotlin.jvm.internal.s.k(tVar, "<this>");
        p013kotlin.jvm.internal.s.k(view, "view");
        Object tag = view.getTag(q.f190a);
        x xVar = tag instanceof x ? (x) tag : null;
        if ((xVar == null ? null : xVar.getController()) == tVar && xVar.getSubscription().isActive()) {
            return;
        }
        if (xVar != null && (subscription = xVar.getSubscription()) != null) {
            Job.DefaultImpls.cancel$default(subscription, (CancellationException) null, 1, (Object) null);
        }
        view.setText(tVar.c());
        view.setTag(q.f190a, new x(tVar, d0.c(view, null, new a(tVar, view, null), 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(TextView textView, wn0.l<? super CharSequence, jn0.h0> lVar, Continuation<?> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f233q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f233q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f232p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f233q;
        if (i12 == 0) {
            jn0.t.b(obj);
            bVar.f230n = textView;
            bVar.f231o = lVar;
            bVar.f233q = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(bVar), 1);
            cancellableContinuationImpl.initCancellability();
            d dVar = new d(lVar);
            textView.addTextChangedListener(dVar);
            cancellableContinuationImpl.invokeOnCancellation(new c(textView, dVar));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(bVar);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"a30/u$d", "Landroid/text/TextWatcher;", "", "s", "", "start", "before", "count", "Ljn0/h0;", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "after", "beforeTextChanged", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class d implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.l<CharSequence, jn0.h0> f236a;

        /* JADX WARN: Multi-variable type inference failed */
        d(wn0.l<? super CharSequence, jn0.h0> lVar) {
            this.f236a = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            p013kotlin.jvm.internal.s.k(s11, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
            this.f236a.invoke(s11);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
        }
    }
}

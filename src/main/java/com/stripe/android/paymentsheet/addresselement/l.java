package com.stripe.android.paymentsheet.addresselement;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.paymentsheet.y;
import java.util.Map;
import javax.inject.Provider;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p017o70.AddressDetails;
import wn0.p;
import z80.LayoutSpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u0001HB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u00020\u00152\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\rH\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010-R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010/R\u001f\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010/R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00103R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010/R\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;018\u0006¢\u0006\f\n\u0004\b>\u00103\u001a\u0004\b%\u00105R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010/R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u0010018\u0006¢\u0006\f\n\u0004\bB\u00103\u001a\u0004\b)\u00105R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010/R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u0010018\u0006¢\u0006\f\n\u0004\bF\u00103\u001a\u0004\bG\u00105¨\u0006I"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/l;", "Landroidx/lifecycle/c1;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;", "args", "Lcom/stripe/android/paymentsheet/addresselement/a;", "navigator", "Lp70/b;", "eventReporter", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/addresselement/j$a;", "formControllerProvider", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;Lcom/stripe/android/paymentsheet/addresselement/a;Lp70/b;Ljavax/inject/Provider;)V", "Lo70/a;", "r", "()Lo70/a;", "", "condensedForm", "Lz80/p1;", "k", "(Z)Lz80/p1;", "Ljn0/h0;", "v", "()V", "", "Li90/g0;", "Ln90/a;", "completedFormValues", "checkboxChecked", "m", "(Ljava/util/Map;Z)V", "addressDetails", "n", "(Lo70/a;)V", "newValue", "l", "(Z)V", "s", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;", "o", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;", "t", "Lcom/stripe/android/paymentsheet/addresselement/a;", "u", "()Lcom/stripe/android/paymentsheet/addresselement/a;", "Lp70/b;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_collectedAddress", "Lkotlinx/coroutines/flow/StateFlow;", "w", "Lkotlinx/coroutines/flow/StateFlow;", "q", "()Lkotlinx/coroutines/flow/StateFlow;", "collectedAddress", "x", "_forceExpandedForm", "y", "forceExpandedForm", "Lo70/h;", "z", "_formController", "A", "formController", "B", "_formEnabled", "C", "formEnabled", "D", "_checkboxChecked", "E", "p", DateTokenConverter.CONVERTER_KEY, "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l extends c1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final StateFlow<p017o70.h> formController;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final MutableStateFlow<Boolean> _formEnabled;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final StateFlow<Boolean> formEnabled;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final MutableStateFlow<Boolean> _checkboxChecked;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final StateFlow<Boolean> checkboxChecked;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final AddressElementActivityContract.Args args;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.addresselement.a navigator;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final p70.b eventReporter;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<AddressDetails> _collectedAddress;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<AddressDetails> collectedAddress;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _forceExpandedForm;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> forceExpandedForm;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<p017o70.h> _formController;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$1", f = "InputAddressViewModel.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52518n;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo70/a;", "it", "Ljn0/h0;", "a", "(Lo70/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C0992a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f52520a;

            C0992a(l lVar) {
                this.f52520a = lVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AddressDetails addressDetails, Continuation<? super h0> continuation) {
                String name;
                y.Address address;
                String phoneNumber;
                Boolean isCheckboxSelected;
                AddressDetails addressDetails2 = (AddressDetails) this.f52520a._collectedAddress.getValue();
                Boolean isCheckboxSelected2 = null;
                if (addressDetails2 == null || (name = addressDetails2.getName()) == null) {
                    name = addressDetails != null ? addressDetails.getName() : null;
                }
                if (addressDetails == null || (address = addressDetails.getAddress()) == null) {
                    address = addressDetails2 != null ? addressDetails2.getAddress() : null;
                }
                if (addressDetails2 == null || (phoneNumber = addressDetails2.getPhoneNumber()) == null) {
                    phoneNumber = addressDetails != null ? addressDetails.getPhoneNumber() : null;
                }
                if (addressDetails2 != null && (isCheckboxSelected = addressDetails2.getIsCheckboxSelected()) != null) {
                    isCheckboxSelected2 = isCheckboxSelected;
                } else if (addressDetails != null) {
                    isCheckboxSelected2 = addressDetails.getIsCheckboxSelected();
                }
                Object objEmit = this.f52520a._collectedAddress.emit(new AddressDetails(name, address, phoneNumber, isCheckboxSelected2), continuation);
                return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52518n;
            if (i11 == 0) {
                t.b(obj);
                Flow flowC = l.this.getNavigator().c("AddressDetails");
                if (flowC != null) {
                    C0992a c0992a = new C0992a(l.this);
                    this.f52518n = 1;
                    if (flowC.collect(c0992a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$2", f = "InputAddressViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52521n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f52523a;

            a(l lVar) {
                this.f52523a = lVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Boolean bool, Continuation<? super h0> continuation) {
                Object objEmit = this.f52523a._forceExpandedForm.emit(bool, continuation);
                return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52521n;
            if (i11 == 0) {
                t.b(obj);
                Flow flowC = l.this.getNavigator().c("force_expanded_form");
                if (flowC != null) {
                    a aVar = new a(l.this);
                    this.f52521n = 1;
                    if (flowC.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$3", f = "InputAddressViewModel.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52524n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Provider<j.a> f52526p;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo70/a;", "collectedAddress", "", "forceExpandedForm", "Lkotlin/Pair;", "a", "(Lo70/a;Ljava/lang/Boolean;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements p<AddressDetails, Boolean, Pair<? extends AddressDetails, ? extends Boolean>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f52527c = new a();

            a() {
                super(2);
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pair<AddressDetails, Boolean> invoke(AddressDetails addressDetails, Boolean bool) {
                return new Pair<>(addressDetails, bool);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lo70/a;", "", "<name for destructuring parameter 0>", "Ljn0/h0;", "a", "(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class b<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f52528a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Provider<j.a> f52529b;

            b(l lVar, Provider<j.a> provider) {
                this.f52528a = lVar;
                this.f52529b = provider;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Pair<AddressDetails, Boolean> pair, Continuation<? super h0> continuation) {
                Map<IdentifierSpec, String> mapI;
                y.Address address;
                AddressDetails addressDetailsA = pair.a();
                Boolean boolB = pair.b();
                boolean z11 = false;
                boolean zBooleanValue = boolB != null ? boolB.booleanValue() : false;
                String line1 = null;
                if (addressDetailsA == null || (mapI = p017o70.b.c(addressDetailsA, null, 1, null)) == null) {
                    mapI = v0.i();
                }
                MutableStateFlow mutableStateFlow = this.f52528a._formController;
                j.a aVarC = this.f52529b.get().b(d1.a(this.f52528a)).d(null).a("").c(null);
                l lVar = this.f52528a;
                if (!zBooleanValue) {
                    if (addressDetailsA != null && (address = addressDetailsA.getAddress()) != null) {
                        line1 = address.getLine1();
                    }
                    if (line1 == null) {
                        z11 = true;
                    }
                }
                mutableStateFlow.setValue(aVarC.f(lVar.k(z11)).e(mapI).build().a());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Provider<j.a> provider, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f52526p = provider;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new c(this.f52526p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52524n;
            if (i11 == 0) {
                t.b(obj);
                StateFlow stateFlowH = r90.g.h(l.this.q(), l.this.forceExpandedForm, a.f52527c);
                b bVar = new b(l.this, this.f52526p);
                this.f52524n = 1;
                if (stateFlowH.collect(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/l$d;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Ljavax/inject/Provider;", "Lv70/l$a;", "inputAddressViewModelSubcomponentBuilderProvider", "<init>", "(Ljavax/inject/Provider;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "a", "Ljavax/inject/Provider;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Provider<v70.l.a> inputAddressViewModelSubcomponentBuilderProvider;

        public d(Provider<v70.l.a> inputAddressViewModelSubcomponentBuilderProvider) {
            s.k(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
            this.inputAddressViewModelSubcomponentBuilderProvider = inputAddressViewModelSubcomponentBuilderProvider;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass) {
            s.k(modelClass, "modelClass");
            l lVarA = this.inputAddressViewModelSubcomponentBuilderProvider.get().build().a();
            s.i(lVarA, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.InputAddressViewModel.Factory.create");
            return lVarA;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class e extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
        e(Object obj) {
            super(0, obj, l.class, "navigateToAutocompleteScreen", "navigateToAutocompleteScreen()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            o();
            return h0.f84049a;
        }

        public final void o() {
            ((l) this.receiver).v();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.InputAddressViewModel$navigateToAutocompleteScreen$1", f = "InputAddressViewModel.kt", i = {0}, l = {166}, m = "invokeSuspend", n = {"addressDetails"}, s = {"L$0"})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52531n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f52532o;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AddressDetails addressDetailsR;
            AddressDetails addressDetails;
            y.Address address;
            String country;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52532o;
            if (i11 == 0) {
                t.b(obj);
                addressDetailsR = l.this.r();
                if (addressDetailsR != null) {
                    MutableStateFlow mutableStateFlow = l.this._collectedAddress;
                    this.f52531n = addressDetailsR;
                    this.f52532o = 1;
                    if (mutableStateFlow.emit(addressDetailsR, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    addressDetails = addressDetailsR;
                }
                if (addressDetailsR != null && (address = addressDetailsR.getAddress()) != null && (country = address.getCountry()) != null) {
                    l.this.getNavigator().d(new com.stripe.android.paymentsheet.addresselement.b.a(country));
                }
                return h0.f84049a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            addressDetails = (AddressDetails) this.f52531n;
            t.b(obj);
            addressDetailsR = addressDetails;
            if (addressDetailsR != null) {
                l.this.getNavigator().d(new com.stripe.android.paymentsheet.addresselement.b.a(country));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public l(AddressElementActivityContract.Args args, com.stripe.android.paymentsheet.addresselement.a navigator, p70.b eventReporter, Provider<j.a> formControllerProvider) {
        AddressDetails address;
        Boolean isCheckboxSelected;
        s.k(args, "args");
        s.k(navigator, "navigator");
        s.k(eventReporter, "eventReporter");
        s.k(formControllerProvider, "formControllerProvider");
        this.args = args;
        this.navigator = navigator;
        this.eventReporter = eventReporter;
        com.stripe.android.paymentsheet.addresselement.d.Configuration config = args.getConfig();
        MutableStateFlow<AddressDetails> MutableStateFlow = StateFlowKt.MutableStateFlow(config != null ? config.getAddress() : null);
        this._collectedAddress = MutableStateFlow;
        this.collectedAddress = MutableStateFlow;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this._forceExpandedForm = MutableStateFlow2;
        this.forceExpandedForm = MutableStateFlow2;
        MutableStateFlow<p017o70.h> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this._formController = MutableStateFlow3;
        this.formController = MutableStateFlow3;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this._formEnabled = MutableStateFlow4;
        this.formEnabled = MutableStateFlow4;
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(bool);
        this._checkboxChecked = MutableStateFlow5;
        this.checkboxChecked = MutableStateFlow5;
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new a(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new b(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new c(formControllerProvider, null), 3, null);
        com.stripe.android.paymentsheet.addresselement.d.Configuration config2 = args.getConfig();
        if (config2 == null || (address = config2.getAddress()) == null || (isCheckboxSelected = address.getIsCheckboxSelected()) == null) {
            return;
        }
        MutableStateFlow5.setValue(isCheckboxSelected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutSpec k(boolean condensedForm) {
        return new LayoutSpec(v.e(com.stripe.android.paymentsheet.addresselement.f.f52405a.a(condensedForm, this.args.getConfig(), new e(this))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressDetails r() {
        StateFlow<Map<IdentifierSpec, FormFieldEntry>> stateFlowC;
        Map<IdentifierSpec, FormFieldEntry> value;
        p017o70.h value2 = this.formController.getValue();
        if (value2 == null || (stateFlowC = value2.c()) == null || (value = stateFlowC.getValue()) == null) {
            return null;
        }
        IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
        FormFieldEntry formFieldEntry = value.get(companion.r());
        String value3 = formFieldEntry != null ? formFieldEntry.getValue() : null;
        FormFieldEntry formFieldEntry2 = value.get(companion.k());
        String value4 = formFieldEntry2 != null ? formFieldEntry2.getValue() : null;
        FormFieldEntry formFieldEntry3 = value.get(companion.l());
        String value5 = formFieldEntry3 != null ? formFieldEntry3.getValue() : null;
        FormFieldEntry formFieldEntry4 = value.get(companion.p());
        String value6 = formFieldEntry4 != null ? formFieldEntry4.getValue() : null;
        FormFieldEntry formFieldEntry5 = value.get(companion.q());
        String value7 = formFieldEntry5 != null ? formFieldEntry5.getValue() : null;
        FormFieldEntry formFieldEntry6 = value.get(companion.u());
        String value8 = formFieldEntry6 != null ? formFieldEntry6.getValue() : null;
        FormFieldEntry formFieldEntry7 = value.get(companion.z());
        y.Address address = new y.Address(value4, value5, value6, value7, value8, formFieldEntry7 != null ? formFieldEntry7.getValue() : null);
        FormFieldEntry formFieldEntry8 = value.get(companion.t());
        return new AddressDetails(value3, address, formFieldEntry8 != null ? formFieldEntry8.getValue() : null, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new f(null), 3, null);
    }

    public final void l(boolean newValue) {
        this._checkboxChecked.setValue(Boolean.valueOf(newValue));
    }

    public final void m(Map<IdentifierSpec, FormFieldEntry> completedFormValues, boolean checkboxChecked) {
        FormFieldEntry formFieldEntry;
        FormFieldEntry formFieldEntry2;
        FormFieldEntry formFieldEntry3;
        FormFieldEntry formFieldEntry4;
        FormFieldEntry formFieldEntry5;
        FormFieldEntry formFieldEntry6;
        FormFieldEntry formFieldEntry7;
        FormFieldEntry formFieldEntry8;
        this._formEnabled.setValue(Boolean.FALSE);
        String value = null;
        String value2 = (completedFormValues == null || (formFieldEntry8 = completedFormValues.get(IdentifierSpec.INSTANCE.r())) == null) ? null : formFieldEntry8.getValue();
        y.Address address = new y.Address((completedFormValues == null || (formFieldEntry7 = completedFormValues.get(IdentifierSpec.INSTANCE.k())) == null) ? null : formFieldEntry7.getValue(), (completedFormValues == null || (formFieldEntry6 = completedFormValues.get(IdentifierSpec.INSTANCE.l())) == null) ? null : formFieldEntry6.getValue(), (completedFormValues == null || (formFieldEntry5 = completedFormValues.get(IdentifierSpec.INSTANCE.p())) == null) ? null : formFieldEntry5.getValue(), (completedFormValues == null || (formFieldEntry4 = completedFormValues.get(IdentifierSpec.INSTANCE.q())) == null) ? null : formFieldEntry4.getValue(), (completedFormValues == null || (formFieldEntry3 = completedFormValues.get(IdentifierSpec.INSTANCE.u())) == null) ? null : formFieldEntry3.getValue(), (completedFormValues == null || (formFieldEntry2 = completedFormValues.get(IdentifierSpec.INSTANCE.z())) == null) ? null : formFieldEntry2.getValue());
        if (completedFormValues != null && (formFieldEntry = completedFormValues.get(IdentifierSpec.INSTANCE.t())) != null) {
            value = formFieldEntry.getValue();
        }
        n(new AddressDetails(value2, address, value, Boolean.valueOf(checkboxChecked)));
    }

    public final void n(AddressDetails addressDetails) {
        String country;
        y.Address address;
        s.k(addressDetails, "addressDetails");
        y.Address address2 = addressDetails.getAddress();
        if (address2 != null && (country = address2.getCountry()) != null) {
            p70.b bVar = this.eventReporter;
            AddressDetails value = this.collectedAddress.getValue();
            bVar.a(country, ((value == null || (address = value.getAddress()) == null) ? null : address.getLine1()) != null, Integer.valueOf(p017o70.f.b(addressDetails, this.collectedAddress.getValue())));
        }
        this.navigator.a(new com.stripe.android.paymentsheet.addresselement.e.Succeeded(addressDetails));
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final AddressElementActivityContract.Args getArgs() {
        return this.args;
    }

    public final StateFlow<Boolean> p() {
        return this.checkboxChecked;
    }

    public final StateFlow<AddressDetails> q() {
        return this.collectedAddress;
    }

    public final StateFlow<p017o70.h> s() {
        return this.formController;
    }

    public final StateFlow<Boolean> t() {
        return this.formEnabled;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final com.stripe.android.paymentsheet.addresselement.a getNavigator() {
        return this.navigator;
    }
}

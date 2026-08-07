package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import b90.AutocompletePrediction;
import b90.FetchPlaceResponse;
import b90.FindAutocompletePredictionsResponse;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.Address;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import f30.y;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Provider;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p010i90.q1;
import p010i90.r1;
import p010i90.w1;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p017o70.AddressDetails;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 O2\u00020\u0001:\u0004PQRSB;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R0\u00106\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u0001010)8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010,\u0012\u0004\b5\u0010\u001a\u001a\u0004\b3\u00104R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001f\u0010L\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010*0A8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020.0A8F¢\u0006\u0006\u001a\u0004\bM\u0010K¨\u0006T"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/i;", "Landroidx/lifecycle/b;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;", "args", "Lcom/stripe/android/paymentsheet/addresselement/a;", "navigator", "La90/b;", "placesClient", "Lcom/stripe/android/paymentsheet/addresselement/i$c;", "autocompleteArgs", "Lp70/b;", "eventReporter", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;Lcom/stripe/android/paymentsheet/addresselement/a;La90/b;Lcom/stripe/android/paymentsheet/addresselement/i$c;Lp70/b;Landroid/app/Application;)V", "Lo70/a;", "addressDetails", "Ljn0/h0;", "u", "(Lo70/a;)V", "Lb90/d;", "prediction", "t", "(Lb90/d;)V", "r", "()V", "s", "m", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;", "getArgs", "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$a;", "Lcom/stripe/android/paymentsheet/addresselement/a;", "getNavigator", "()Lcom/stripe/android/paymentsheet/addresselement/a;", "v", "La90/b;", "w", "Lcom/stripe/android/paymentsheet/addresselement/i$c;", "x", "Lp70/b;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "y", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_predictions", "", "z", "_loading", "Ljn0/s;", "A", "n", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getAddressResult$annotations", "addressResult", "Li90/q1;", "B", "Li90/q1;", "config", "Li90/r1;", "C", "Li90/r1;", "q", "()Li90/r1;", "textFieldController", "Lkotlinx/coroutines/flow/StateFlow;", "", "D", "Lkotlinx/coroutines/flow/StateFlow;", "queryFlow", "Lcom/stripe/android/paymentsheet/addresselement/i$e;", "E", "Lcom/stripe/android/paymentsheet/addresselement/i$e;", "debouncer", "p", "()Lkotlinx/coroutines/flow/StateFlow;", "predictions", "o", "loading", Gender.FEMALE, "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i extends androidx.p003lifecycle.b {
    public static final int G = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final MutableStateFlow<s<AddressDetails>> addressResult;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final q1 config;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final r1 textFieldController;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final StateFlow<String> queryFlow;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final e debouncer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AddressElementActivityContract.Args args;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.paymentsheet.addresselement.a navigator;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final a90.b placesClient;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Args autocompleteArgs;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final p70.b eventReporter;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<List<AutocompletePrediction>> _predictions;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> _loading;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<String, h0> {

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$1$1", f = "AutocompleteViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
        static final class C0986a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f52442n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ i f52443o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f52444p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0986a(i iVar, String str, Continuation<? super C0986a> continuation) {
                super(2, continuation);
                this.f52443o = iVar;
                this.f52444p = str;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C0986a(this.f52443o, this.f52444p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f52442n;
                if (i11 == 0) {
                    t.b(obj);
                    a90.b bVar = this.f52443o.placesClient;
                    if (bVar != null) {
                        String str = this.f52444p;
                        String country = this.f52443o.autocompleteArgs.getCountry();
                        if (country == null) {
                            throw new IllegalStateException("Country cannot be empty");
                        }
                        this.f52442n = 1;
                        objB = bVar.b(str, country, 4, this);
                        if (objB == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return h0.f84049a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                objB = ((s) obj).getValue();
                i iVar = this.f52443o;
                Throwable thE = s.e(objB);
                if (thE == null) {
                    iVar._loading.setValue(Boxing.boxBoolean(false));
                    iVar._predictions.setValue(((FindAutocompletePredictionsResponse) objB).a());
                } else {
                    iVar._loading.setValue(Boxing.boxBoolean(false));
                    iVar.n().setValue(s.a(s.b(t.a(thE))));
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C0986a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        a() {
            super(1);
        }

        public final void a(String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            BuildersKt__Builders_commonKt.launch$default(d1.a(i.this), null, null, new C0986a(i.this, it, null), 3, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(String str) {
            a(str);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$2", f = "AutocompleteViewModel.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52445n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f52447a;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.i$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
            static final class C0987a extends u implements wn0.a<h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ i f52448c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0987a(i iVar) {
                    super(0);
                    this.f52448c = iVar;
                }

                public final void b() {
                    this.f52448c.m();
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    b();
                    return h0.f84049a;
                }
            }

            a(i iVar) {
                this.f52447a = iVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, Continuation<? super h0> continuation) {
                if (str.length() == 0) {
                    MutableStateFlow<w1> mutableStateFlowF = this.f52447a.config.f();
                    while (!mutableStateFlowF.compareAndSet(mutableStateFlowF.getValue(), null)) {
                    }
                } else {
                    MutableStateFlow<w1> mutableStateFlowF2 = this.f52447a.config.f();
                    while (!mutableStateFlowF2.compareAndSet(mutableStateFlowF2.getValue(), new w1.Trailing(y.O, null, true, new C0987a(this.f52447a), 2, null))) {
                    }
                }
                return h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return i.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52445n;
            if (i11 == 0) {
                t.b(obj);
                StateFlow stateFlow = i.this.queryFlow;
                a aVar = new a(i.this);
                this.f52445n = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.i$c, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/i$c;", "", "", PlaceTypes.COUNTRY, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String country;

        public Args(String str) {
            this.country = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && p013kotlin.jvm.internal.s.f(this.country, ((Args) other).country);
        }

        public int hashCode() {
            String str = this.country;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Args(country=" + this.country + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/i$e;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/flow/StateFlow;", "", "queryFlow", "Lkotlin/Function1;", "Ljn0/h0;", "onValidQuery", "c", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/StateFlow;Lwn0/l;)V", "Lkotlinx/coroutines/Job;", "a", "Lkotlinx/coroutines/Job;", "searchJob", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Job searchJob;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$Debouncer$startWatching$1", f = "AutocompleteViewModel.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f52451n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f52452o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ StateFlow<String> f52453p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ e f52454q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ wn0.l<String, h0> f52455r;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.i$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", SearchIntents.EXTRA_QUERY, "Ljn0/h0;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            static final class C0988a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ e f52456a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ CoroutineScope f52457b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ wn0.l<String, h0> f52458c;

                /* JADX INFO: renamed from: com.stripe.android.paymentsheet.addresselement.i$e$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$Debouncer$startWatching$1$1$1$1", f = "AutocompleteViewModel.kt", i = {0}, l = {200}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
                static final class C0989a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f52459n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    private /* synthetic */ Object f52460o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    final /* synthetic */ wn0.l<String, h0> f52461p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ String f52462q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0989a(wn0.l<? super String, h0> lVar, String str, Continuation<? super C0989a> continuation) {
                        super(2, continuation);
                        this.f52461p = lVar;
                        this.f52462q = str;
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                        C0989a c0989a = new C0989a(this.f52461p, this.f52462q, continuation);
                        c0989a.f52460o = obj;
                        return c0989a;
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineScope coroutineScope;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i11 = this.f52459n;
                        if (i11 == 0) {
                            t.b(obj);
                            CoroutineScope coroutineScope2 = (CoroutineScope) this.f52460o;
                            this.f52460o = coroutineScope2;
                            this.f52459n = 1;
                            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coroutineScope = coroutineScope2;
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            coroutineScope = (CoroutineScope) this.f52460o;
                            t.b(obj);
                        }
                        if (CoroutineScopeKt.isActive(coroutineScope)) {
                            this.f52461p.invoke(this.f52462q);
                        }
                        return h0.f84049a;
                    }

                    @Override // wn0.p
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                        return ((C0989a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C0988a(e eVar, CoroutineScope coroutineScope, wn0.l<? super String, h0> lVar) {
                    this.f52456a = eVar;
                    this.f52457b = coroutineScope;
                    this.f52458c = lVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(String str, Continuation<? super h0> continuation) {
                    if (str != null) {
                        e eVar = this.f52456a;
                        CoroutineScope coroutineScope = this.f52457b;
                        wn0.l<String, h0> lVar = this.f52458c;
                        Job job = eVar.searchJob;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        if (str.length() > 3) {
                            eVar.searchJob = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0989a(lVar, str, null), 3, null);
                        }
                    }
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(StateFlow<String> stateFlow, e eVar, wn0.l<? super String, h0> lVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f52453p = stateFlow;
                this.f52454q = eVar;
                this.f52455r = lVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f52453p, this.f52454q, this.f52455r, continuation);
                aVar.f52452o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f52451n;
                if (i11 == 0) {
                    t.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f52452o;
                    StateFlow<String> stateFlow = this.f52453p;
                    C0988a c0988a = new C0988a(this.f52454q, coroutineScope, this.f52455r);
                    this.f52451n = 1;
                    if (stateFlow.collect(c0988a, this) == coroutine_suspended) {
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
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        public final void c(CoroutineScope coroutineScope, StateFlow<String> queryFlow, wn0.l<? super String, h0> onValidQuery) {
            p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
            p013kotlin.jvm.internal.s.k(queryFlow, "queryFlow");
            p013kotlin.jvm.internal.s.k(onValidQuery, "onValidQuery");
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(queryFlow, this, onValidQuery, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/i$f;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Ljavax/inject/Provider;", "Lv70/e$a;", "autoCompleteViewModelSubcomponentBuilderProvider", "Lcom/stripe/android/paymentsheet/addresselement/i$c;", "args", "Lkotlin/Function0;", "Landroid/app/Application;", "applicationSupplier", "<init>", "(Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/addresselement/i$c;Lwn0/a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "a", "Ljavax/inject/Provider;", "b", "Lcom/stripe/android/paymentsheet/addresselement/i$c;", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Provider<v70.e.a> autoCompleteViewModelSubcomponentBuilderProvider;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Args args;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<Application> applicationSupplier;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Provider<v70.e.a> autoCompleteViewModelSubcomponentBuilderProvider, Args args, wn0.a<? extends Application> applicationSupplier) {
            p013kotlin.jvm.internal.s.k(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
            p013kotlin.jvm.internal.s.k(args, "args");
            p013kotlin.jvm.internal.s.k(applicationSupplier, "applicationSupplier");
            this.autoCompleteViewModelSubcomponentBuilderProvider = autoCompleteViewModelSubcomponentBuilderProvider;
            this.args = args;
            this.applicationSupplier = applicationSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass) {
            p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
            i iVarA = this.autoCompleteViewModelSubcomponentBuilderProvider.get().a(this.applicationSupplier.invoke()).b(this.args).build().a();
            p013kotlin.jvm.internal.s.i(iVarA, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel.Factory.create");
            return iVarA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel$selectPrediction$1", f = "AutocompleteViewModel.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52466n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ AutocompletePrediction f52468p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(AutocompletePrediction autocompletePrediction, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f52468p = autocompletePrediction;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return i.this.new g(this.f52468p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52466n;
            if (i11 == 0) {
                t.b(obj);
                i.this._loading.setValue(Boxing.boxBoolean(true));
                a90.b bVar = i.this.placesClient;
                if (bVar != null) {
                    String placeId = this.f52468p.getPlaceId();
                    this.f52466n = 1;
                    objA = bVar.a(placeId, this);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return h0.f84049a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            objA = ((s) obj).getValue();
            i iVar = i.this;
            Throwable thE = s.e(objA);
            if (thE == null) {
                iVar._loading.setValue(Boxing.boxBoolean(false));
                Address addressF = b90.h.f(((FetchPlaceResponse) objA).getPlace(), iVar.f());
                iVar.n().setValue(s.a(s.b(new AddressDetails(null, new com.stripe.android.paymentsheet.y.Address(addressF.getCity(), addressF.getCountry(), addressF.getLine1(), addressF.getLine2(), addressF.getPostalCode(), addressF.getState()), null, null, 13, null))));
                i.v(iVar, null, 1, null);
            } else {
                iVar._loading.setValue(Boxing.boxBoolean(false));
                iVar.n().setValue(s.a(s.b(t.a(thE))));
                i.v(iVar, null, 1, null);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(AddressElementActivityContract.Args args, com.stripe.android.paymentsheet.addresselement.a navigator, a90.b bVar, Args autocompleteArgs, p70.b eventReporter, Application application) {
        super(application);
        p013kotlin.jvm.internal.s.k(args, "args");
        p013kotlin.jvm.internal.s.k(navigator, "navigator");
        p013kotlin.jvm.internal.s.k(autocompleteArgs, "autocompleteArgs");
        p013kotlin.jvm.internal.s.k(eventReporter, "eventReporter");
        p013kotlin.jvm.internal.s.k(application, "application");
        this.args = args;
        this.navigator = navigator;
        this.placesClient = bVar;
        this.autocompleteArgs = autocompleteArgs;
        this.eventReporter = eventReporter;
        this._predictions = StateFlowKt.MutableStateFlow(null);
        this._loading = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.addressResult = StateFlowKt.MutableStateFlow(null);
        q1 q1Var = new q1(Integer.valueOf(f90.h.f64613a), 0, 0, StateFlowKt.MutableStateFlow(null), 6, null);
        this.config = q1Var;
        Object[] objArr = 0 == true ? 1 : 0;
        r1 r1Var = new r1(q1Var, objArr, null, 6, null);
        this.textFieldController = r1Var;
        StateFlow<String> stateFlowP = r1Var.p();
        this.queryFlow = stateFlowP;
        e eVar = new e();
        this.debouncer = eVar;
        eVar.c(d1.a(this), stateFlowP, new a());
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new b(null), 3, null);
        String country = autocompleteArgs.getCountry();
        if (country != null) {
            eventReporter.b(country);
        }
    }

    private final void u(AddressDetails addressDetails) {
        if (addressDetails != null) {
            this.navigator.h("AddressDetails", addressDetails);
        } else {
            s<AddressDetails> value = this.addressResult.getValue();
            if (value != null) {
                Object value2 = value.getValue();
                if (s.e(value2) == null) {
                    this.navigator.h("AddressDetails", (AddressDetails) value2);
                } else {
                    this.navigator.h("AddressDetails", null);
                }
            }
        }
        this.navigator.e();
    }

    static /* synthetic */ void v(i iVar, AddressDetails addressDetails, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            addressDetails = null;
        }
        iVar.u(addressDetails);
    }

    public final void m() {
        this.textFieldController.t("");
        this._predictions.setValue(null);
    }

    public final MutableStateFlow<s<AddressDetails>> n() {
        return this.addressResult;
    }

    public final StateFlow<Boolean> o() {
        return this._loading;
    }

    public final StateFlow<List<AutocompletePrediction>> p() {
        return this._predictions;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final r1 getTextFieldController() {
        return this.textFieldController;
    }

    public final void r() {
        u(!p013kotlin.text.t.y0(this.queryFlow.getValue()) ? new AddressDetails(null, new com.stripe.android.paymentsheet.y.Address(null, null, this.queryFlow.getValue(), null, null, null, 59, null), null, null, 13, null) : null);
    }

    public final void s() {
        this.navigator.h("force_expanded_form", Boolean.TRUE);
        u(new AddressDetails(null, new com.stripe.android.paymentsheet.y.Address(null, null, this.queryFlow.getValue(), null, null, null, 59, null), null, null, 13, null));
    }

    public final void t(AutocompletePrediction prediction) {
        p013kotlin.jvm.internal.s.k(prediction, "prediction");
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new g(prediction, null), 3, null);
    }
}

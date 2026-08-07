package com.stripe.android.googlepaylauncher;

import android.app.Application;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p003lifecycle.r;
import androidx.p003lifecycle.x;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import f30.PaymentConfiguration;
import java.util.Locale;
import java.util.Set;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.m;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w30.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0006+\u001e#012BS\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B)\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010\u0019J#\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010#\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010.¨\u00063"}, d2 = {"Lcom/stripe/android/googlepaylauncher/f;", "", "Lkotlinx/coroutines/CoroutineScope;", "lifecycleScope", "Lcom/stripe/android/googlepaylauncher/f$f;", "config", "Lcom/stripe/android/googlepaylauncher/f$g;", "readyCallback", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$a;", "activityResultLauncher", "Lkotlin/Function1;", "La60/d;", "Lcom/stripe/android/googlepaylauncher/l;", "googlePayRepositoryFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lw30/c;", "analyticsRequestExecutor", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/googlepaylauncher/f$f;Lcom/stripe/android/googlepaylauncher/f$g;Landroidx/activity/result/ActivityResultLauncher;Lwn0/l;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lw30/c;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/stripe/android/googlepaylauncher/f$i;", "resultCallback", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/googlepaylauncher/f$f;Lcom/stripe/android/googlepaylauncher/f$g;Lcom/stripe/android/googlepaylauncher/f$i;)V", "", "clientSecret", AnnotatedPrivateKey.LABEL, "Ljn0/h0;", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "currencyCode", "", "amount", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "a", "Lcom/stripe/android/googlepaylauncher/f$f;", "b", "Lcom/stripe/android/googlepaylauncher/f$g;", "c", "Landroidx/activity/result/ActivityResultLauncher;", DateTokenConverter.CONVERTER_KEY, "Lwn0/l;", "", "Z", "isReady", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f50775g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Config config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g readyCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<GooglePayLauncherContract.a> activityResultLauncher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<a60.d, l> googlePayRepositoryFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isReady;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a implements ActivityResultCallback, m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f50781a;

        a(i iVar) {
            this.f50781a = iVar;
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(h p11) {
            s.k(p11, "p0");
            this.f50781a.a(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof m)) {
                return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return new p(1, this.f50781a, i.class, "onResult", "onResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La60/d;", "it", "Lcom/stripe/android/googlepaylauncher/l;", "a", "(La60/d;)Lcom/stripe/android/googlepaylauncher/l;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<a60.d, l> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f50782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Config f50783d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Fragment fragment, Config config) {
            super(1);
            this.f50782c = fragment;
            this.f50783d = config;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l invoke(a60.d it) {
            s.k(it, "it");
            Application application = this.f50782c.requireActivity().getApplication();
            s.h(application);
            return new com.stripe.android.googlepaylauncher.c(application, this.f50783d.getEnvironment(), com.stripe.android.googlepaylauncher.a.a(this.f50783d.getBillingAddressConfig()), this.f50783d.getExistingPaymentMethodRequired(), this.f50783d.getAllowCreditCards(), null, h70.h.INSTANCE.a(application, d1.c("GooglePayLauncher")), null, 160, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayLauncher$5", f = "GooglePayLauncher.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50784n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f50785o;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50785o;
            if (i11 == 0) {
                t.b(obj);
                l lVar = (l) f.this.googlePayRepositoryFactory.invoke(f.this.config.getEnvironment());
                g gVar2 = f.this.readyCallback;
                Flow<Boolean> flowIsReady = lVar.isReady();
                this.f50784n = gVar2;
                this.f50785o = 1;
                obj = FlowKt.first(flowIsReady, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gVar = gVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (g) this.f50784n;
                t.b(obj);
            }
            Boolean bool = (Boolean) obj;
            f.this.isReady = bool.booleanValue();
            gVar.a(bool.booleanValue());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.f$d, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lcom/stripe/android/googlepaylauncher/f$d;", "Landroid/os/Parcelable;", "", "isRequired", "Lcom/stripe/android/googlepaylauncher/f$d$b;", "format", "isPhoneNumberRequired", "<init>", "(ZLcom/stripe/android/googlepaylauncher/f$d$b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "c", "()Z", "b", "Lcom/stripe/android/googlepaylauncher/f$d$b;", "()Lcom/stripe/android/googlepaylauncher/f$d$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BillingAddressConfig implements Parcelable {
        public static final Parcelable.Creator<BillingAddressConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRequired;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b format;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPhoneNumberRequired;

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.f$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BillingAddressConfig> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BillingAddressConfig createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new BillingAddressConfig(parcel.readInt() != 0, b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BillingAddressConfig[] newArray(int i11) {
                return new BillingAddressConfig[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.f$d$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/f$d$b;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "Min", "Full", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum b {
            Min("MIN"),
            Full("FULL");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String code;

            b(String str) {
                this.code = str;
            }

            public static EnumEntries<b> getEntries() {
                return $ENTRIES;
            }

            /* JADX INFO: renamed from: getCode$payments_core_release, reason: from getter */
            public final String getCode() {
                return this.code;
            }
        }

        public BillingAddressConfig() {
            this(false, null, false, 7, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getFormat() {
            return this.format;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsPhoneNumberRequired() {
            return this.isPhoneNumberRequired;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingAddressConfig)) {
                return false;
            }
            BillingAddressConfig billingAddressConfig = (BillingAddressConfig) other;
            return this.isRequired == billingAddressConfig.isRequired && this.format == billingAddressConfig.format && this.isPhoneNumberRequired == billingAddressConfig.isPhoneNumberRequired;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isRequired) * 31) + this.format.hashCode()) * 31) + Boolean.hashCode(this.isPhoneNumberRequired);
        }

        public String toString() {
            return "BillingAddressConfig(isRequired=" + this.isRequired + ", format=" + this.format + ", isPhoneNumberRequired=" + this.isPhoneNumberRequired + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(this.isRequired ? 1 : 0);
            parcel.writeString(this.format.name());
            parcel.writeInt(this.isPhoneNumberRequired ? 1 : 0);
        }

        public BillingAddressConfig(boolean z11, b format, boolean z12) {
            s.k(format, "format");
            this.isRequired = z11;
            this.format = format;
            this.isPhoneNumberRequired = z12;
        }

        public /* synthetic */ BillingAddressConfig(boolean z11, b bVar, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? b.Min : bVar, (i11 & 4) != 0 ? false : z12);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.f$f, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b&\u0010\u0010R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010-\u001a\u0004\b#\u0010.\"\u0004\b/\u00100R\"\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010(\u001a\u0004\b'\u0010*\"\u0004\b1\u0010,R\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010(\u001a\u0004\b\u001f\u0010*\"\u0004\b2\u0010,R\u0014\u00104\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010*¨\u00065"}, d2 = {"Lcom/stripe/android/googlepaylauncher/f$f;", "Landroid/os/Parcelable;", "La60/d;", AnalyticsAttribute.Environment, "", "merchantCountryCode", "merchantName", "", "isEmailRequired", "Lcom/stripe/android/googlepaylauncher/f$d;", "billingAddressConfig", "existingPaymentMethodRequired", "allowCreditCards", "<init>", "(La60/d;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/googlepaylauncher/f$d;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "La60/d;", "c", "()La60/d;", "b", "Ljava/lang/String;", "e", "f", DateTokenConverter.CONVERTER_KEY, "Z", "g", "()Z", "setEmailRequired", "(Z)V", "Lcom/stripe/android/googlepaylauncher/f$d;", "()Lcom/stripe/android/googlepaylauncher/f$d;", "setBillingAddressConfig", "(Lcom/stripe/android/googlepaylauncher/f$d;)V", "setExistingPaymentMethodRequired", "setAllowCreditCards", "h", "isJcbEnabled", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config implements Parcelable {
        public static final Parcelable.Creator<Config> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a60.d environment;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String merchantCountryCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String merchantName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isEmailRequired;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private BillingAddressConfig billingAddressConfig;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean existingPaymentMethodRequired;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean allowCreditCards;

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.f$f$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Config> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Config createFromParcel(Parcel parcel) {
                boolean z11;
                boolean z12;
                s.k(parcel, "parcel");
                a60.d dVarValueOf = a60.d.valueOf(parcel.readString());
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z13 = false;
                if (parcel.readInt() != 0) {
                    z13 = true;
                }
                BillingAddressConfig billingAddressConfigCreateFromParcel = BillingAddressConfig.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z11 = true;
                    z12 = true;
                } else {
                    z11 = true;
                    z12 = z13;
                }
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                return new Config(dVarValueOf, string, string2, z13, billingAddressConfigCreateFromParcel, z12, z11);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Config[] newArray(int i11) {
                return new Config[i11];
            }
        }

        public Config(a60.d environment, String merchantCountryCode, String merchantName, boolean z11, BillingAddressConfig billingAddressConfig, boolean z12, boolean z13) {
            s.k(environment, "environment");
            s.k(merchantCountryCode, "merchantCountryCode");
            s.k(merchantName, "merchantName");
            s.k(billingAddressConfig, "billingAddressConfig");
            this.environment = environment;
            this.merchantCountryCode = merchantCountryCode;
            this.merchantName = merchantName;
            this.isEmailRequired = z11;
            this.billingAddressConfig = billingAddressConfig;
            this.existingPaymentMethodRequired = z12;
            this.allowCreditCards = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAllowCreditCards() {
            return this.allowCreditCards;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BillingAddressConfig getBillingAddressConfig() {
            return this.billingAddressConfig;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a60.d getEnvironment() {
            return this.environment;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getExistingPaymentMethodRequired() {
            return this.existingPaymentMethodRequired;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getMerchantCountryCode() {
            return this.merchantCountryCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return this.environment == config.environment && s.f(this.merchantCountryCode, config.merchantCountryCode) && s.f(this.merchantName, config.merchantName) && this.isEmailRequired == config.isEmailRequired && s.f(this.billingAddressConfig, config.billingAddressConfig) && this.existingPaymentMethodRequired == config.existingPaymentMethodRequired && this.allowCreditCards == config.allowCreditCards;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsEmailRequired() {
            return this.isEmailRequired;
        }

        public final boolean h() {
            return p013kotlin.text.t.M(this.merchantCountryCode, Locale.JAPAN.getCountry(), true);
        }

        public int hashCode() {
            return (((((((((((this.environment.hashCode() * 31) + this.merchantCountryCode.hashCode()) * 31) + this.merchantName.hashCode()) * 31) + Boolean.hashCode(this.isEmailRequired)) * 31) + this.billingAddressConfig.hashCode()) * 31) + Boolean.hashCode(this.existingPaymentMethodRequired)) * 31) + Boolean.hashCode(this.allowCreditCards);
        }

        public String toString() {
            return "Config(environment=" + this.environment + ", merchantCountryCode=" + this.merchantCountryCode + ", merchantName=" + this.merchantName + ", isEmailRequired=" + this.isEmailRequired + ", billingAddressConfig=" + this.billingAddressConfig + ", existingPaymentMethodRequired=" + this.existingPaymentMethodRequired + ", allowCreditCards=" + this.allowCreditCards + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.environment.name());
            parcel.writeString(this.merchantCountryCode);
            parcel.writeString(this.merchantName);
            parcel.writeInt(this.isEmailRequired ? 1 : 0);
            this.billingAddressConfig.writeToParcel(parcel, flags);
            parcel.writeInt(this.existingPaymentMethodRequired ? 1 : 0);
            parcel.writeInt(this.allowCreditCards ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/f$g;", "", "", "isReady", "Ljn0/h0;", "a", "(Z)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface g {
        void a(boolean isReady);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/f$h;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "c", "Lcom/stripe/android/googlepaylauncher/f$h$a;", "Lcom/stripe/android/googlepaylauncher/f$h$b;", "Lcom/stripe/android/googlepaylauncher/f$h$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class h implements Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/googlepaylauncher/f$h$a;", "Lcom/stripe/android/googlepaylauncher/f$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f50797a = new a();
            public static final Parcelable.Creator<a> CREATOR = new C0852a();

            /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.f$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0852a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return a.f50797a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            private a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1700832601;
            }

            public String toString() {
                return "Canceled";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/googlepaylauncher/f$h$b;", "Lcom/stripe/android/googlepaylauncher/f$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f50798a = new b();
            public static final Parcelable.Creator<b> CREATOR = new a();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return b.f50798a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i11) {
                    return new b[i11];
                }
            }

            private b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -693310069;
            }

            public String toString() {
                return "Completed";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.f$h$c, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/f$h$c;", "Lcom/stripe/android/googlepaylauncher/f$h;", "", AnalyticsAttribute.Error, "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Failed extends h {
            public static final Parcelable.Creator<Failed> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Throwable error;

            /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.f$h$c$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Failed> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Failed createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new Failed((Throwable) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Failed[] newArray(int i11) {
                    return new Failed[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(Throwable error) {
                super(null);
                s.k(error, "error");
                this.error = error;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failed) && s.f(this.error, ((Failed) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeSerializable(this.error);
            }
        }

        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private h() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/f$i;", "", "Lcom/stripe/android/googlepaylauncher/f$h;", "result", "Ljn0/h0;", "a", "(Lcom/stripe/android/googlepaylauncher/f$h;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface i {
        void a(h result);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(CoroutineScope lifecycleScope, Config config, g readyCallback, ActivityResultLauncher<GooglePayLauncherContract.a> activityResultLauncher, wn0.l<? super a60.d, ? extends l> googlePayRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, w30.c analyticsRequestExecutor) {
        s.k(lifecycleScope, "lifecycleScope");
        s.k(config, "config");
        s.k(readyCallback, "readyCallback");
        s.k(activityResultLauncher, "activityResultLauncher");
        s.k(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.config = config;
        this.readyCallback = readyCallback;
        this.activityResultLauncher = activityResultLauncher;
        this.googlePayRepositoryFactory = googlePayRepositoryFactory;
        analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.GooglePayLauncherInit, null, null, null, null, null, 62, null));
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new c(null), 3, null);
    }

    public final void e(String clientSecret, String label) {
        s.k(clientSecret, "clientSecret");
        if (!this.isReady) {
            throw new IllegalStateException("presentForPaymentIntent() may only be called when Google Pay is available on this device.");
        }
        this.activityResultLauncher.b(new GooglePayLauncherContract.PaymentIntentArgs(clientSecret, this.config, label));
    }

    public final void f(String clientSecret, String currencyCode, Long amount, String label) {
        s.k(clientSecret, "clientSecret");
        s.k(currencyCode, "currencyCode");
        if (!this.isReady) {
            throw new IllegalStateException("presentForSetupIntent() may only be called when Google Pay is available on this device.");
        }
        this.activityResultLauncher.b(new GooglePayLauncherContract.SetupIntentArgs(clientSecret, this.config, currencyCode, amount, label));
    }

    public f(Fragment fragment, Config config, g readyCallback, i resultCallback) {
        s.k(fragment, "fragment");
        s.k(config, "config");
        s.k(readyCallback, "readyCallback");
        s.k(resultCallback, "resultCallback");
        r rVarA = x.a(fragment);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new GooglePayLauncherContract(), new a(resultCallback));
        s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        b bVar = new b(fragment, config);
        Context contextRequireContext = fragment.requireContext();
        s.j(contextRequireContext, "requireContext(...)");
        PaymentConfiguration.Companion companion = PaymentConfiguration.INSTANCE;
        Context contextRequireContext2 = fragment.requireContext();
        s.j(contextRequireContext2, "requireContext(...)");
        this(rVarA, config, readyCallback, activityResultLauncherRegisterForActivityResult, bVar, new PaymentAnalyticsRequestFactory(contextRequireContext, companion.a(contextRequireContext2).getPublishableKey(), (Set<String>) d1.c("GooglePayLauncher")), new o());
    }
}

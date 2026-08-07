package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.r;
import androidx.p003lifecycle.x;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentMethod;
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
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w30.o;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 &2\u00020\u0001:\u0006,.02&4Bq\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B)\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0017\u0010\u001dB7\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u001eJ9\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/¨\u00065"}, d2 = {"Lcom/stripe/android/googlepaylauncher/h;", "", "Lkotlinx/coroutines/CoroutineScope;", "lifecycleScope", "Lcom/stripe/android/googlepaylauncher/h$e;", "config", "Lcom/stripe/android/googlepaylauncher/h$f;", "readyCallback", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "activityResultLauncher", "", "skipReadyCheck", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "La60/d;", "Lcom/stripe/android/googlepaylauncher/l;", "googlePayRepositoryFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lw30/c;", "analyticsRequestExecutor", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/googlepaylauncher/h$e;Lcom/stripe/android/googlepaylauncher/h$f;Landroidx/activity/result/ActivityResultLauncher;ZLandroid/content/Context;Lwn0/l;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lw30/c;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/stripe/android/googlepaylauncher/h$h;", "resultCallback", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/googlepaylauncher/h$e;Lcom/stripe/android/googlepaylauncher/h$f;Lcom/stripe/android/googlepaylauncher/h$h;)V", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Landroidx/activity/result/ActivityResultLauncher;Lcom/stripe/android/googlepaylauncher/h$e;Lcom/stripe/android/googlepaylauncher/h$f;)V", "", "currencyCode", "", "amount", "transactionId", AnnotatedPrivateKey.LABEL, "Ljn0/h0;", "g", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "a", "Lcom/stripe/android/googlepaylauncher/h$e;", "b", "Lcom/stripe/android/googlepaylauncher/h$f;", "c", "Landroidx/activity/result/ActivityResultLauncher;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "Lwn0/l;", "f", "isReady", "h", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50837h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Config config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f readyCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean skipReadyCheck;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<a60.d, l> googlePayRepositoryFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isReady;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La60/d;", "it", "Lcom/stripe/android/googlepaylauncher/l;", "a", "(La60/d;)Lcom/stripe/android/googlepaylauncher/l;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<a60.d, l> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f50844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Config f50845d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, Config config) {
            super(1);
            this.f50844c = context;
            this.f50845d = config;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l invoke(a60.d it) {
            s.k(it, "it");
            return new c(this.f50844c, this.f50845d.getEnvironment(), com.stripe.android.googlepaylauncher.a.b(this.f50845d.getBillingAddressConfig()), this.f50845d.getExistingPaymentMethodRequired(), this.f50845d.getAllowCreditCards(), null, h70.h.INSTANCE.a(this.f50844c, d1.c("GooglePayPaymentMethodLauncher")), null, 160, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$4", f = "GooglePayPaymentMethodLauncher.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50846n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f50847o;

        b(Continuation<b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return h.this.new b(continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return invoke2(coroutineScope, (Continuation<h0>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            f fVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50847o;
            if (i11 == 0) {
                t.b(obj);
                l lVar = (l) h.this.googlePayRepositoryFactory.invoke(h.this.config.getEnvironment());
                f fVar2 = h.this.readyCallback;
                Flow<Boolean> flowIsReady = lVar.isReady();
                this.f50846n = fVar2;
                this.f50847o = 1;
                obj = FlowKt.first(flowIsReady, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fVar = fVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (f) this.f50846n;
                t.b(obj);
            }
            Boolean bool = (Boolean) obj;
            h.this.isReady = bool.booleanValue();
            fVar.a(bool.booleanValue());
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.h$c, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lcom/stripe/android/googlepaylauncher/h$c;", "Landroid/os/Parcelable;", "", "isRequired", "Lcom/stripe/android/googlepaylauncher/h$c$b;", "format", "isPhoneNumberRequired", "<init>", "(ZLcom/stripe/android/googlepaylauncher/h$c$b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "c", "()Z", "b", "Lcom/stripe/android/googlepaylauncher/h$c$b;", "()Lcom/stripe/android/googlepaylauncher/h$c$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BillingAddressConfig implements Parcelable {
        public static final Parcelable.Creator<BillingAddressConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRequired;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b format;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPhoneNumberRequired;

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.h$c$a */
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

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.h$c$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/h$c$b;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "Min", "Full", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/h$f;", "", "", "isReady", "Ljn0/h0;", "a", "(Z)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface f {
        void a(boolean isReady);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/h$g;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "c", "Lcom/stripe/android/googlepaylauncher/h$g$a;", "Lcom/stripe/android/googlepaylauncher/h$g$b;", "Lcom/stripe/android/googlepaylauncher/h$g$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class g implements Parcelable {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/googlepaylauncher/h$g$a;", "Lcom/stripe/android/googlepaylauncher/h$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f50859a = new a();
            public static final Parcelable.Creator<a> CREATOR = new C0854a();

            /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.h$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0854a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return a.f50859a;
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
                return -299418266;
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

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.h$g$b, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/googlepaylauncher/h$g$b;", "Lcom/stripe/android/googlepaylauncher/h$g;", "Lcom/stripe/android/model/v0;", "paymentMethod", "<init>", "(Lcom/stripe/android/model/v0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/v0;", "Z2", "()Lcom/stripe/android/model/v0;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Completed extends g {
            public static final Parcelable.Creator<Completed> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentMethod paymentMethod;

            /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.h$g$b$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Completed> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Completed createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new Completed(PaymentMethod.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Completed[] newArray(int i11) {
                    return new Completed[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Completed(PaymentMethod paymentMethod) {
                super(null);
                s.k(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }

            /* JADX INFO: renamed from: Z2, reason: from getter */
            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Completed) && s.f(this.paymentMethod, ((Completed) other).paymentMethod);
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "Completed(paymentMethod=" + this.paymentMethod + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                this.paymentMethod.writeToParcel(parcel, flags);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.h$g$c, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/googlepaylauncher/h$g$c;", "Lcom/stripe/android/googlepaylauncher/h$g;", "", AnalyticsAttribute.Error, "", "errorCode", "<init>", "(Ljava/lang/Throwable;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "b", "I", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Failed extends g {
            public static final Parcelable.Creator<Failed> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Throwable error;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int errorCode;

            /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.h$g$c$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Failed> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Failed createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new Failed((Throwable) parcel.readSerializable(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Failed[] newArray(int i11) {
                    return new Failed[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(Throwable error, int i11) {
                super(null);
                s.k(error, "error");
                this.error = error;
                this.errorCode = i11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getErrorCode() {
                return this.errorCode;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failed)) {
                    return false;
                }
                Failed failed = (Failed) other;
                return s.f(this.error, failed.error) && this.errorCode == failed.errorCode;
            }

            public int hashCode() {
                return (this.error.hashCode() * 31) + Integer.hashCode(this.errorCode);
            }

            public String toString() {
                return "Failed(error=" + this.error + ", errorCode=" + this.errorCode + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeSerializable(this.error);
                parcel.writeInt(this.errorCode);
            }
        }

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private g() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.h$h, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/h$h;", "", "Lcom/stripe/android/googlepaylauncher/h$g;", "result", "Ljn0/h0;", "a", "(Lcom/stripe/android/googlepaylauncher/h$g;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface InterfaceC0855h {
        void a(g result);
    }

    public h(CoroutineScope lifecycleScope, Config config, f readyCallback, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher, boolean z11, Context context, wn0.l<a60.d, l> googlePayRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, w30.c analyticsRequestExecutor) {
        s.k(lifecycleScope, "lifecycleScope");
        s.k(config, "config");
        s.k(readyCallback, "readyCallback");
        s.k(activityResultLauncher, "activityResultLauncher");
        s.k(context, "context");
        s.k(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.config = config;
        this.readyCallback = readyCallback;
        this.activityResultLauncher = activityResultLauncher;
        this.skipReadyCheck = z11;
        this.googlePayRepositoryFactory = googlePayRepositoryFactory;
        analyticsRequestExecutor.a(PaymentAnalyticsRequestFactory.w(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.GooglePayPaymentMethodLauncherInit, null, null, null, null, null, 62, null));
        if (z11) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC0855h resultCallback, g gVar) {
        s.k(resultCallback, "$resultCallback");
        s.h(gVar);
        resultCallback.a(gVar);
    }

    public final void g(String currencyCode, long amount, String transactionId, String label) {
        s.k(currencyCode, "currencyCode");
        if (!this.skipReadyCheck && !this.isReady) {
            throw new IllegalStateException("present() may only be called when Google Pay is available on this device.");
        }
        this.activityResultLauncher.b(new GooglePayPaymentMethodLauncherContractV2.Args(this.config, currencyCode, amount, label, transactionId));
    }

    /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.h$e, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b&\u0010\u0010R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010-\u001a\u0004\b#\u0010.\"\u0004\b/\u00100R\"\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010(\u001a\u0004\b'\u0010*\"\u0004\b1\u0010,R\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010(\u001a\u0004\b\u001f\u0010*\"\u0004\b2\u0010,R\u0014\u00104\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010*¨\u00065"}, d2 = {"Lcom/stripe/android/googlepaylauncher/h$e;", "Landroid/os/Parcelable;", "La60/d;", AnalyticsAttribute.Environment, "", "merchantCountryCode", "merchantName", "", "isEmailRequired", "Lcom/stripe/android/googlepaylauncher/h$c;", "billingAddressConfig", "existingPaymentMethodRequired", "allowCreditCards", "<init>", "(La60/d;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/googlepaylauncher/h$c;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "La60/d;", "c", "()La60/d;", "b", "Ljava/lang/String;", "e", "f", DateTokenConverter.CONVERTER_KEY, "Z", "g", "()Z", "setEmailRequired", "(Z)V", "Lcom/stripe/android/googlepaylauncher/h$c;", "()Lcom/stripe/android/googlepaylauncher/h$c;", "setBillingAddressConfig", "(Lcom/stripe/android/googlepaylauncher/h$c;)V", "setExistingPaymentMethodRequired", "setAllowCreditCards", "h", "isJcbEnabled", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.h$e$a */
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

        public /* synthetic */ Config(a60.d dVar, String str, String str2, boolean z11, BillingAddressConfig billingAddressConfig, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, str, str2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? new BillingAddressConfig(false, null, false, 7, null) : billingAddressConfig, (i11 & 32) != 0 ? true : z12, (i11 & 64) != 0 ? true : z13);
        }
    }

    public /* synthetic */ h(CoroutineScope coroutineScope, Config config, f fVar, ActivityResultLauncher activityResultLauncher, boolean z11, Context context, wn0.l lVar, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, w30.c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, config, fVar, activityResultLauncher, z11, context, lVar, (i11 & 128) != 0 ? new PaymentAnalyticsRequestFactory(context, PaymentConfiguration.INSTANCE.a(context).getPublishableKey(), (Set<String>) d1.c("GooglePayPaymentMethodLauncher")) : paymentAnalyticsRequestFactory, (i11 & 256) != 0 ? new o() : cVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Fragment fragment, Config config, f readyCallback, final InterfaceC0855h resultCallback) {
        s.k(fragment, "fragment");
        s.k(config, "config");
        s.k(readyCallback, "readyCallback");
        s.k(resultCallback, "resultCallback");
        Context contextRequireContext = fragment.requireContext();
        s.j(contextRequireContext, "requireContext(...)");
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        s.j(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        r rVarA = x.a(viewLifecycleOwner);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new GooglePayPaymentMethodLauncherContractV2(), new ActivityResultCallback() { // from class: a60.f
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                com.stripe.android.googlepaylauncher.h.b(resultCallback, (com.stripe.android.googlepaylauncher.h.g) obj);
            }
        });
        s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this(contextRequireContext, rVarA, activityResultLauncherRegisterForActivityResult, config, readyCallback);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Context context, CoroutineScope lifecycleScope, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher, Config config, f readyCallback) {
        this(lifecycleScope, config, readyCallback, activityResultLauncher, false, context, new a(context, config), null, null, KyberEngine.KyberPolyBytes, null);
        s.k(context, "context");
        s.k(lifecycleScope, "lifecycleScope");
        s.k(activityResultLauncher, "activityResultLauncher");
        s.k(config, "config");
        s.k(readyCallback, "readyCallback");
    }
}

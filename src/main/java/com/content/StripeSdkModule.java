package com.content;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r0;
import androidx.fragment.app.u;
import androidx.p002activity.result.ActivityResultRegistry;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.googlepaylauncher.f;
import com.stripe.android.model.Address;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.n;
import com.stripe.android.paymentsheet.y;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import f30.PaymentConfiguration;
import f30.h0;
import f30.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o30.AppInfo;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import wn0.q;
import xn.a;

/* JADX INFO: loaded from: classes6.dex */
@a(name = StripeSdkModule.NAME)
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006*\u0002\u008f\u0001\b\u0007\u0018\u0000 \u0096\u00012\u00020\u0001:\u0002\u0097\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\"\u0010\u0015J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b#\u0010\u0015J\u001f\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b%\u0010\u0015J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b(\u0010'J\u001f\u0010)\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b)\u0010\u0015J'\u0010*\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b,\u0010\u0015J\u001f\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b1\u0010/J\u001f\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b3\u0010/J1\u00104\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b7\u0010/J\u001f\u00108\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b8\u0010/J/\u00109\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b9\u00105J!\u0010:\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b:\u0010\u0015J/\u0010=\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b=\u0010>J'\u0010@\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020;2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bB\u0010\u0015J\u001f\u0010C\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bC\u0010\u0015J/\u0010D\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020;2\u0006\u00106\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bD\u0010EJ/\u0010F\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020;2\u0006\u00106\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bF\u0010EJ\u001f\u0010G\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bG\u0010/J\u001f\u0010H\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bH\u0010/J'\u0010J\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bJ\u0010+J\u001f\u0010K\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bK\u0010\u0015J\u0017\u0010L\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bL\u0010'J\u001f\u0010O\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020M2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bR\u0010\u0015J\u001f\u0010S\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bS\u0010\u0015J\u0017\u0010T\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bT\u0010'J!\u0010V\u001a\u00020\u000b2\b\u0010U\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bV\u0010/J\u001f\u0010W\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\bW\u0010/J\u0017\u0010Y\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u001bH\u0007¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\\\u0010]J'\u0010b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020^2\u0006\u0010X\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020_H\u0000¢\u0006\u0004\b`\u0010aR$\u0010d\u001a\u0004\u0018\u00010c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010k\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0016\u0010r\u001a\u00020q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010v\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010uR\u0018\u0010w\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010z\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010uR\u0018\u0010{\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010yR\u0016\u0010|\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R(\u0010\u008a\u0001\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0005\b\u008e\u0001\u0010]R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0\u0092\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0098\u0001"}, d2 = {"Lcom/reactnativestripesdk/StripeSdkModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "Ljn0/h0;", "dispatchActivityResultsToFragments", "(IILandroid/content/Intent;)V", "Lcom/facebook/react/bridge/ReadableMap;", "params", "configure3dSecure", "(Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "createTokenFromPii", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "createTokenFromBankAccount", "createTokenFromCard", "Landroidx/fragment/app/u;", "getCurrentActivityOrResolveWithError", "(Lcom/facebook/react/bridge/Promise;)Landroidx/fragment/app/u;", "", "getName", "()Ljava/lang/String;", "", "", "getConstants", "()Ljava/util/Map;", "initialise", "initPaymentSheet", "options", "presentPaymentSheet", "confirmPaymentSheetPayment", "(Lcom/facebook/react/bridge/Promise;)V", "resetPaymentSheetCustomer", "intentCreationCallback", "createPaymentMethod", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "createToken", "cvc", "createTokenForCVCUpdate", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "paymentIntentClientSecret", "handleNextAction", "setupIntentClientSecret", "handleNextActionForSetup", "confirmPayment", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "clientSecret", "retrievePaymentIntent", "retrieveSetupIntent", "confirmSetupIntent", "isPlatformPaySupported", "", "isPaymentIntent", "confirmPlatformPay", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;ZLcom/facebook/react/bridge/Promise;)V", "usesDeprecatedTokenFlow", "createPlatformPayPaymentMethod", "(Lcom/facebook/react/bridge/ReadableMap;ZLcom/facebook/react/bridge/Promise;)V", "canAddCardToWallet", "isCardInWallet", "collectBankAccount", "(ZLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "verifyMicrodeposits", "collectBankAccountToken", "collectFinancialConnectionsAccounts", "customerAdapterOverrides", "initCustomerSheet", "presentCustomerSheet", "retrieveCustomerSheetPaymentOptionSelection", "Lcom/facebook/react/bridge/ReadableArray;", "paymentMethodJsonObjects", "customerAdapterFetchPaymentMethodsCallback", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "paymentMethodJson", "customerAdapterAttachPaymentMethodCallback", "customerAdapterDetachPaymentMethodCallback", "customerAdapterSetSelectedPaymentOptionCallback", "paymentOption", "customerAdapterFetchSelectedPaymentOptionCallback", "customerAdapterSetupIntentClientSecretForCustomerAttachCallback", "eventName", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "(I)V", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/bridge/WritableMap;", "sendEvent$stripe_stripe_react_native_release", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "sendEvent", "Lcom/reactnativestripesdk/k;", "cardFieldView", "Lcom/reactnativestripesdk/k;", "getCardFieldView", "()Lcom/reactnativestripesdk/k;", "setCardFieldView", "(Lcom/reactnativestripesdk/k;)V", "Lcom/reactnativestripesdk/v;", "cardFormView", "Lcom/reactnativestripesdk/v;", "getCardFormView", "()Lcom/reactnativestripesdk/v;", "setCardFormView", "(Lcom/reactnativestripesdk/v;)V", "Lf30/h0;", "stripe", "Lf30/h0;", "publishableKey", "Ljava/lang/String;", "stripeAccountId", "urlScheme", "confirmPromise", "Lcom/facebook/react/bridge/Promise;", "confirmPaymentClientSecret", "createPlatformPayPaymentMethodPromise", "platformPayUsesDeprecatedTokenFlow", "Z", "Lcom/reactnativestripesdk/x0;", "paymentSheetFragment", "Lcom/reactnativestripesdk/x0;", "Lcom/reactnativestripesdk/q0;", "paymentLauncherFragment", "Lcom/reactnativestripesdk/q0;", "Lcom/reactnativestripesdk/y;", "collectBankAccountLauncherFragment", "Lcom/reactnativestripesdk/y;", "Lcom/reactnativestripesdk/b0;", "customerSheetFragment", "Lcom/reactnativestripesdk/b0;", "eventListenerCount", "I", "getEventListenerCount$stripe_stripe_react_native_release", "()I", "setEventListenerCount$stripe_stripe_react_native_release", "com/reactnativestripesdk/StripeSdkModule$i", "mActivityEventListener", "Lcom/reactnativestripesdk/StripeSdkModule$i;", "", "getAllStripeFragmentTags", "()Ljava/util/List;", "allStripeFragmentTags", "Companion", "a", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StripeSdkModule extends ReactContextBaseJavaModule {
    public static final String NAME = "StripeSdk";
    private com.content.k cardFieldView;
    private v cardFormView;
    private y collectBankAccountLauncherFragment;
    private String confirmPaymentClientSecret;
    private Promise confirmPromise;
    private Promise createPlatformPayPaymentMethodPromise;
    private b0 customerSheetFragment;
    private int eventListenerCount;
    private final i mActivityEventListener;
    private q0 paymentLauncherFragment;
    private x0 paymentSheetFragment;
    private boolean platformPayUsesDeprecatedTokenFlow;
    private String publishableKey;
    private h0 stripe;
    private String stripeAccountId;
    private String urlScheme;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativestripesdk/StripeSdkModule$b", "Lf30/a;", "Lcom/stripe/android/model/u0;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ljn0/h0;", "onError", "(Ljava/lang/Exception;)V", "result", "b", "(Lcom/stripe/android/model/u0;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements f30.a<PaymentIntent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f48695a;

        b(Promise promise) {
            this.f48695a = promise;
        }

        @Override // f30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentIntent result) {
            s.k(result, "result");
            this.f48695a.resolve(s10.i.d("paymentIntent", s10.i.v(result)));
        }

        @Override // f30.a
        public void onError(Exception e11) {
            s.k(e11, "e");
            this.f48695a.resolve(s10.i.d("paymentIntent", new WritableNativeMap()));
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativestripesdk/StripeSdkModule$c", "Lf30/a;", "Lcom/stripe/android/model/d1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ljn0/h0;", "onError", "(Ljava/lang/Exception;)V", "result", "b", "(Lcom/stripe/android/model/d1;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements f30.a<SetupIntent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f48696a;

        c(Promise promise) {
            this.f48696a = promise;
        }

        @Override // f30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(SetupIntent result) {
            s.k(result, "result");
            this.f48696a.resolve(s10.i.d("setupIntent", s10.i.y(result)));
        }

        @Override // f30.a
        public void onError(Exception e11) {
            s.k(e11, "e");
            this.f48696a.resolve(s10.i.d("setupIntent", new WritableNativeMap()));
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativestripesdk/StripeSdkModule$d", "Lf30/a;", "Lcom/stripe/android/model/v0;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ljn0/h0;", "onError", "(Ljava/lang/Exception;)V", "result", "b", "(Lcom/stripe/android/model/v0;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements f30.a<PaymentMethod> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f48697a;

        d(Promise promise) {
            this.f48697a = promise;
        }

        @Override // f30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentMethod result) {
            s.k(result, "result");
            this.f48697a.resolve(s10.i.d("paymentMethod", s10.i.w(result)));
        }

        @Override // f30.a
        public void onError(Exception e11) {
            s.k(e11, "e");
            this.f48697a.resolve(s10.e.c("Failed", e11));
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativestripesdk/StripeSdkModule$e", "Lf30/a;", "Lcom/stripe/android/model/p1;", "result", "Ljn0/h0;", "b", "(Lcom/stripe/android/model/p1;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "onError", "(Ljava/lang/Exception;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements f30.a<Token> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f48698a;

        e(Promise promise) {
            this.f48698a = promise;
        }

        @Override // f30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Token result) {
            s.k(result, "result");
            String id2 = result.getId();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("tokenId", id2);
            this.f48698a.resolve(writableNativeMap);
        }

        @Override // f30.a
        public void onError(Exception e11) {
            s.k(e11, "e");
            this.f48698a.resolve(s10.e.c("Failed", e11));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativestripesdk.StripeSdkModule$createTokenFromBankAccount$1", f = "StripeSdkModule.kt", i = {}, l = {EnumC4419g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f48699n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f48700o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ BankAccountTokenParams f48702q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Promise f48703r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(BankAccountTokenParams bankAccountTokenParams, Promise promise, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f48702q = bankAccountTokenParams;
            this.f48703r = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            f fVar = StripeSdkModule.this.new f(this.f48702q, this.f48703r, continuation);
            fVar.f48700o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Promise promise;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f48699n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    StripeSdkModule stripeSdkModule = StripeSdkModule.this;
                    BankAccountTokenParams bankAccountTokenParams = this.f48702q;
                    Promise promise2 = this.f48703r;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    h0 h0Var = stripeSdkModule.stripe;
                    if (h0Var == null) {
                        s.B("stripe");
                        h0Var = null;
                    }
                    String str = stripeSdkModule.stripeAccountId;
                    this.f48700o = promise2;
                    this.f48699n = 1;
                    obj = k0.a(h0Var, bankAccountTokenParams, null, str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    promise = promise2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    promise = (Promise) this.f48700o;
                    t.b(obj);
                }
                promise.resolve(s10.i.d("token", s10.i.A((Token) obj)));
                objB = jn0.s.b(jn0.h0.f84049a);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            Promise promise3 = this.f48703r;
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                promise3.resolve(s10.e.d(s10.c.Failed.toString(), thE.getMessage()));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativestripesdk.StripeSdkModule$createTokenFromCard$1", f = "StripeSdkModule.kt", i = {}, l = {EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f48704n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ CardParams f48706p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f48707q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(CardParams cardParams, Promise promise, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f48706p = cardParams;
            this.f48707q = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return StripeSdkModule.this.new g(this.f48706p, this.f48707q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            g gVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f48704n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    try {
                        h0 h0Var = StripeSdkModule.this.stripe;
                        if (h0Var == null) {
                            s.B("stripe");
                            h0Var = null;
                        }
                        h0 h0Var2 = h0Var;
                        CardParams cardParams = this.f48706p;
                        String str = StripeSdkModule.this.stripeAccountId;
                        this.f48704n = 1;
                        gVar = this;
                        try {
                            obj = k0.c(h0Var2, cardParams, null, str, gVar, 2, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            exc = e;
                            gVar.f48707q.resolve(s10.e.d(s10.c.Failed.toString(), exc.getMessage()));
                        }
                    } catch (Exception e12) {
                        e = e12;
                        gVar = this;
                        exc = e;
                        gVar.f48707q.resolve(s10.e.d(s10.c.Failed.toString(), exc.getMessage()));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    gVar = this;
                }
                gVar.f48707q.resolve(s10.i.d("token", s10.i.A((Token) obj)));
            } catch (Exception e13) {
                exc = e13;
                gVar = this;
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativestripesdk.StripeSdkModule$createTokenFromPii$1$1", f = "StripeSdkModule.kt", i = {}, l = {EnumC4419g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f48708n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f48709o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f48711q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Promise f48712r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, Promise promise, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f48711q = str;
            this.f48712r = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            h hVar = StripeSdkModule.this.new h(this.f48711q, this.f48712r, continuation);
            hVar.f48709o = obj;
            return hVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Promise promise;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f48708n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    StripeSdkModule stripeSdkModule = StripeSdkModule.this;
                    String str = this.f48711q;
                    Promise promise2 = this.f48712r;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    h0 h0Var = stripeSdkModule.stripe;
                    if (h0Var == null) {
                        s.B("stripe");
                        h0Var = null;
                    }
                    String str2 = stripeSdkModule.stripeAccountId;
                    this.f48709o = promise2;
                    this.f48708n = 1;
                    obj = k0.d(h0Var, str, null, str2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    promise = promise2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    promise = (Promise) this.f48709o;
                    t.b(obj);
                }
                promise.resolve(s10.i.d("token", s10.i.A((Token) obj)));
                objB = jn0.s.b(jn0.h0.f84049a);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            Promise promise3 = this.f48712r;
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                promise3.resolve(s10.e.d(s10.c.Failed.toString(), thE.getMessage()));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativestripesdk/StripeSdkModule$i", "Lcom/facebook/react/bridge/BaseActivityEventListener;", "Landroid/app/Activity;", "activity", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "Ljn0/h0;", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends BaseActivityEventListener {
        i() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
            h0 h0Var;
            s.k(activity, "activity");
            if (StripeSdkModule.this.stripe != null) {
                if (requestCode != 414243) {
                    StripeSdkModule.this.dispatchActivityResultsToFragments(requestCode, resultCode, data);
                    return;
                }
                Promise promise = StripeSdkModule.this.createPlatformPayPaymentMethodPromise;
                if (promise == null) {
                    Log.d("StripeReactNative", "No promise was found, Google Pay result went unhandled,");
                    return;
                }
                StripeSdkModule stripeSdkModule = StripeSdkModule.this;
                o0.Companion companion = o0.INSTANCE;
                h0 h0Var2 = stripeSdkModule.stripe;
                if (h0Var2 == null) {
                    s.B("stripe");
                    h0Var = null;
                } else {
                    h0Var = h0Var2;
                }
                companion.f(resultCode, data, h0Var, stripeSdkModule.platformPayUsesDeprecatedTokenFlow, promise);
                stripeSdkModule.createPlatformPayPaymentMethodPromise = null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativestripesdk.StripeSdkModule$retrievePaymentIntent$1", f = "StripeSdkModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f48714n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f48716p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f48717q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Promise promise, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f48716p = str;
            this.f48717q = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return StripeSdkModule.this.new j(this.f48716p, this.f48717q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f48714n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            h0 h0Var = StripeSdkModule.this.stripe;
            if (h0Var == null) {
                s.B("stripe");
                h0Var = null;
            }
            this.f48717q.resolve(s10.i.d("paymentIntent", s10.i.v(h0.r(h0Var, this.f48716p, null, null, 6, null))));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativestripesdk.StripeSdkModule$retrieveSetupIntent$1", f = "StripeSdkModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f48718n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f48720p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f48721q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, Promise promise, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f48720p = str;
            this.f48721q = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return StripeSdkModule.this.new k(this.f48720p, this.f48721q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f48718n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            h0 h0Var = StripeSdkModule.this.stripe;
            if (h0Var == null) {
                s.B("stripe");
                h0Var = null;
            }
            this.f48721q.resolve(s10.i.d("setupIntent", s10.i.y(h0.u(h0Var, this.f48720p, null, null, 6, null))));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativestripesdk/StripeSdkModule$l", "Lf30/a;", "Lcom/stripe/android/model/u0;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ljn0/h0;", "onError", "(Ljava/lang/Exception;)V", "result", "b", "(Lcom/stripe/android/model/u0;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l implements f30.a<PaymentIntent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f48722a;

        l(Promise promise) {
            this.f48722a = promise;
        }

        @Override // f30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentIntent result) {
            s.k(result, "result");
            this.f48722a.resolve(s10.i.d("paymentIntent", s10.i.v(result)));
        }

        @Override // f30.a
        public void onError(Exception e11) {
            s.k(e11, "e");
            this.f48722a.resolve(s10.e.c(s10.d.Failed.toString(), e11));
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/reactnativestripesdk/StripeSdkModule$m", "Lf30/a;", "Lcom/stripe/android/model/d1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ljn0/h0;", "onError", "(Ljava/lang/Exception;)V", "result", "b", "(Lcom/stripe/android/model/d1;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m implements f30.a<SetupIntent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f48723a;

        m(Promise promise) {
            this.f48723a = promise;
        }

        @Override // f30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(SetupIntent result) {
            s.k(result, "result");
            this.f48723a.resolve(s10.i.d("setupIntent", s10.i.y(result)));
        }

        @Override // f30.a
        public void onError(Exception e11) {
            s.k(e11, "e");
            this.f48723a.resolve(s10.e.c(s10.d.Failed.toString(), e11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        i iVar = new i();
        this.mActivityEventListener = iVar;
        reactContext.addActivityEventListener(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 canAddCardToWallet$lambda$25$lambda$24(StripeSdkModule stripeSdkModule, Promise promise, boolean z11, WritableMap writableMap, WritableMap writableMap2) {
        WritableNativeMap writableNativeMapB;
        if (writableMap2 == null || (writableNativeMapB = s10.i.b(false, "MISSING_CONFIGURATION", null)) == null) {
            writableNativeMapB = s10.i.b(!z11, z11 ? "CARD_ALREADY_EXISTS" : null, writableMap);
        }
        promise.resolve(writableNativeMapB);
        return jn0.h0.f84049a;
    }

    private final void configure3dSecure(ReadableMap params) {
        f30.l.Stripe3ds2Config.a aVar = new f30.l.Stripe3ds2Config.a();
        if (params.hasKey("timeout")) {
            aVar.b(params.getInt("timeout"));
        }
        f30.l.INSTANCE.b(new f30.l.a().b(aVar.c(s10.i.R(params)).a()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 confirmPlatformPay$lambda$18$lambda$17(Promise promise, boolean z11, StripeSdkModule stripeSdkModule, String str, com.stripe.android.googlepaylauncher.f.h hVar, WritableMap writableMap) {
        if (writableMap != null) {
            promise.resolve(writableMap);
        } else if (hVar != null) {
            if (s.f(hVar, com.stripe.android.googlepaylauncher.f.h.b.f50798a)) {
                h0 h0Var = null;
                if (z11) {
                    h0 h0Var2 = stripeSdkModule.stripe;
                    if (h0Var2 == null) {
                        s.B("stripe");
                    } else {
                        h0Var = h0Var2;
                    }
                    h0Var.p(str, stripeSdkModule.stripeAccountId, v.e("payment_method"), new b(promise));
                } else {
                    h0 h0Var3 = stripeSdkModule.stripe;
                    if (h0Var3 == null) {
                        s.B("stripe");
                    } else {
                        h0Var = h0Var3;
                    }
                    h0Var.s(str, stripeSdkModule.stripeAccountId, v.e("payment_method"), new c(promise));
                }
            } else if (s.f(hVar, com.stripe.android.googlepaylauncher.f.h.a.f50797a)) {
                promise.resolve(s10.e.d(s10.h.Canceled.toString(), "Google Pay has been canceled"));
            } else {
                if (!(hVar instanceof com.stripe.android.googlepaylauncher.f.h.Failed)) {
                    throw new NoWhenBranchMatchedException();
                }
                promise.resolve(s10.e.e(s10.h.Failed.toString(), ((com.stripe.android.googlepaylauncher.f.h.Failed) hVar).getError()));
            }
        }
        return jn0.h0.f84049a;
    }

    private final void createTokenFromBankAccount(ReadableMap params, Promise promise) {
        String strI = s10.i.i(params, "accountHolderName", null);
        String strI2 = s10.i.i(params, "accountHolderType", null);
        String strI3 = s10.i.i(params, "accountNumber", null);
        String strI4 = s10.i.i(params, PlaceTypes.COUNTRY, null);
        String strI5 = s10.i.i(params, "currency", null);
        String strI6 = s10.i.i(params, "routingNumber", null);
        s.h(strI4);
        s.h(strI5);
        s.h(strI3);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new f(new BankAccountTokenParams(strI4, strI5, strI3, s10.i.J(strI2), strI, strI6), promise, null), 3, null);
    }

    private final void createTokenFromCard(ReadableMap params, Promise promise) {
        PaymentMethodCreateParams.Card cardParams;
        Map<String, Object> mapC3;
        Address cardAddress;
        com.content.k kVar = this.cardFieldView;
        if (kVar == null || (cardParams = kVar.getCardParams()) == null) {
            v vVar = this.cardFormView;
            cardParams = vVar != null ? vVar.getCardParams() : null;
        }
        if (cardParams == null || (mapC3 = cardParams.c3()) == null) {
            promise.resolve(s10.e.d(s10.c.Failed.toString(), "Card details not complete"));
            return;
        }
        com.content.k kVar2 = this.cardFieldView;
        if (kVar2 == null || (cardAddress = kVar2.getCardAddress()) == null) {
            v vVar2 = this.cardFormView;
            cardAddress = vVar2 != null ? vVar2.getCardAddress() : null;
        }
        ReadableMap readableMapG = s10.i.g(params, PlaceTypes.ADDRESS);
        Object obj = mapC3.get(InquiryField.FloatField.TYPE2);
        s.i(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = mapC3.get("exp_month");
        s.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = mapC3.get("exp_year");
        s.i(obj3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj3).intValue();
        Object obj4 = mapC3.get("cvc");
        s.i(obj4, "null cannot be cast to non-null type kotlin.String");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new g(new CardParams(str, iIntValue, iIntValue2, (String) obj4, s10.i.i(params, "name", null), s10.i.I(readableMapG, cardAddress), s10.i.i(params, "currency", null), null, 128, null), promise, null), 3, null);
    }

    private final void createTokenFromPii(ReadableMap params, Promise promise) {
        String strI = s10.i.i(params, "personalId", null);
        if (strI == null || BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new h(strI, promise, null), 3, null) == null) {
            promise.resolve(s10.e.d(s10.c.Failed.toString(), "personalId parameter is required"));
            jn0.h0 h0Var = jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchActivityResultsToFragments(int requestCode, int resultCode, Intent data) {
        FragmentManager supportFragmentManager;
        u activity;
        ActivityResultRegistry activityResultRegistry;
        u currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(null);
        if (currentActivityOrResolveWithError == null || (supportFragmentManager = currentActivityOrResolveWithError.getSupportFragmentManager()) == null) {
            return;
        }
        Iterator<String> it = getAllStripeFragmentTags().iterator();
        while (it.hasNext()) {
            Fragment fragmentO0 = supportFragmentManager.o0(it.next());
            if (fragmentO0 != null && (activity = fragmentO0.getActivity()) != null && (activityResultRegistry = activity.getActivityResultRegistry()) != null) {
                activityResultRegistry.e(requestCode, resultCode, data);
            }
        }
    }

    private final List<String> getAllStripeFragmentTags() {
        return v.p("payment_sheet_launch_fragment", "payment_launcher_fragment", "collect_bank_account_launcher_fragment", "financial_connections_sheet_launch_fragment", "address_launcher_fragment", "google_pay_launcher_fragment", "customer_sheet_launch_fragment");
    }

    private final u getCurrentActivityOrResolveWithError(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        u uVar = currentActivity instanceof u ? (u) currentActivity : null;
        if (uVar != null) {
            return uVar;
        }
        if (promise != null) {
            promise.resolve(s10.e.f());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 isCardInWallet$lambda$29$lambda$28(StripeSdkModule stripeSdkModule, Promise promise, boolean z11, WritableMap writableMap, WritableMap writableMap2) {
        if (writableMap2 == null) {
            writableMap2 = new WritableNativeMap();
            writableMap2.putBoolean("isInWallet", z11);
            writableMap2.putMap("token", writableMap);
        }
        promise.resolve(writableMap2);
        return jn0.h0.f84049a;
    }

    @ReactMethod
    public final void addListener(String eventName) {
        s.k(eventName, "eventName");
        this.eventListenerCount++;
    }

    @ReactMethod
    public final void canAddCardToWallet(ReadableMap params, final Promise promise) {
        s.k(params, "params");
        s.k(promise, "promise");
        String strI = s10.i.i(params, "cardLastFour", null);
        if (strI == null) {
            promise.resolve(s10.e.d("Failed", "You must provide cardLastFour"));
            return;
        }
        if (s10.g.b(params, "supportsTapToPay", true)) {
            com.content.pushprovisioning.f fVar = com.content.pushprovisioning.f.f48883a;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            s.j(reactApplicationContext, "getReactApplicationContext(...)");
            if (!fVar.g(reactApplicationContext)) {
                promise.resolve(s10.i.c(false, "UNSUPPORTED_DEVICE", null, 4, null));
                return;
            }
        }
        u currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            com.content.pushprovisioning.f.f48883a.f(currentActivityOrResolveWithError, strI, new q() { // from class: com.reactnativestripesdk.a1
                @Override // wn0.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return StripeSdkModule.canAddCardToWallet$lambda$25$lambda$24(this.f48731a, promise, ((Boolean) obj).booleanValue(), (WritableMap) obj2, (WritableMap) obj3);
                }
            });
        }
    }

    @ReactMethod
    public final void collectBankAccount(boolean isPaymentIntent, String clientSecret, ReadableMap params, Promise promise) {
        String str;
        s.k(clientSecret, "clientSecret");
        s.k(params, "params");
        s.k(promise, "promise");
        ReadableMap readableMapG = s10.i.g(params, "paymentMethodData");
        if (s10.i.N(s10.i.i(params, Action.PAYMENT_METHOD_TYPE, null)) != PaymentMethod.p.USBankAccount) {
            promise.resolve(s10.e.d(s10.d.Failed.toString(), "collectBankAccount currently only accepts the USBankAccount payment method type."));
            return;
        }
        ReadableMap readableMapG2 = s10.i.g(readableMapG, "billingDetails");
        String string = readableMapG2 != null ? readableMapG2.getString("name") : null;
        if (string == null || string.length() == 0) {
            promise.resolve(s10.e.d(s10.d.Failed.toString(), "You must provide a name when collecting US bank account details."));
            return;
        }
        b70.a.USBankAccount uSBankAccount = new b70.a.USBankAccount(string, readableMapG2.getString(Scopes.EMAIL));
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        String str2 = this.publishableKey;
        if (str2 == null) {
            s.B("publishableKey");
            str = null;
        } else {
            str = str2;
        }
        this.collectBankAccountLauncherFragment = new y(reactApplicationContext, str, this.stripeAccountId, clientSecret, isPaymentIntent, uSBankAccount, promise);
        u currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            try {
                r0 r0VarR = currentActivityOrResolveWithError.getSupportFragmentManager().r();
                y yVar = this.collectBankAccountLauncherFragment;
                s.h(yVar);
                r0VarR.e(yVar, "collect_bank_account_launcher_fragment").g();
            } catch (IllegalStateException e11) {
                promise.resolve(s10.e.d(s10.d.Failed.toString(), e11.getMessage()));
                jn0.h0 h0Var = jn0.h0.f84049a;
            }
        }
    }

    @ReactMethod
    public final void collectBankAccountToken(String clientSecret, Promise promise) {
        s.k(clientSecret, "clientSecret");
        s.k(promise, "promise");
        if (this.stripe == null) {
            promise.resolve(s10.e.g());
            return;
        }
        d0 d0Var = new d0();
        d0.b bVar = d0.b.ForToken;
        String str = this.publishableKey;
        if (str == null) {
            s.B("publishableKey");
            str = null;
        }
        String str2 = this.stripeAccountId;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        d0Var.k(clientSecret, bVar, str, str2, promise, reactApplicationContext);
    }

    @ReactMethod
    public final void collectFinancialConnectionsAccounts(String clientSecret, Promise promise) {
        s.k(clientSecret, "clientSecret");
        s.k(promise, "promise");
        if (this.stripe == null) {
            promise.resolve(s10.e.g());
            return;
        }
        d0 d0Var = new d0();
        d0.b bVar = d0.b.ForSession;
        String str = this.publishableKey;
        if (str == null) {
            s.B("publishableKey");
            str = null;
        }
        String str2 = this.stripeAccountId;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        d0Var.k(clientSecret, bVar, str, str2, promise, reactApplicationContext);
    }

    @ReactMethod
    public final void confirmPayment(String paymentIntentClientSecret, ReadableMap params, ReadableMap options, Promise promise) throws Exception {
        PaymentMethod.p pVarN;
        Promise promise2;
        PaymentMethodCreateParamsException paymentMethodCreateParamsException;
        h0 h0Var;
        String str;
        s.k(paymentIntentClientSecret, "paymentIntentClientSecret");
        s.k(options, "options");
        s.k(promise, "promise");
        ReadableMap readableMapG = s10.i.g(params, "paymentMethodData");
        if (params != null) {
            pVarN = s10.i.N(params.getString(Action.PAYMENT_METHOD_TYPE));
            if (pVarN == null) {
                promise.resolve(s10.e.d(s10.a.Failed.toString(), "You must provide paymentMethodType"));
                return;
            }
        } else {
            pVarN = null;
        }
        try {
            n nVarS = new r0(readableMapG, options, this.cardFieldView, this.cardFormView).s(paymentIntentClientSecret, pVarN, true);
            s.i(nVarS, "null cannot be cast to non-null type com.stripe.android.model.ConfirmPaymentIntentParams");
            ConfirmPaymentIntentParams confirmPaymentIntentParams = (ConfirmPaymentIntentParams) nVarS;
            String str2 = this.urlScheme;
            if (str2 != null) {
                try {
                    confirmPaymentIntentParams.L3(s10.i.P(str2));
                } catch (PaymentMethodCreateParamsException e11) {
                    paymentMethodCreateParamsException = e11;
                    promise2 = promise;
                    promise2.resolve(s10.e.c(s10.a.Failed.toString(), paymentMethodCreateParamsException));
                }
            }
            confirmPaymentIntentParams.h(s10.i.Q(s10.i.g(readableMapG, "shippingDetails")));
            q0.Companion companion = q0.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            s.j(reactApplicationContext, "getReactApplicationContext(...)");
            h0 h0Var2 = this.stripe;
            if (h0Var2 == null) {
                s.B("stripe");
                h0Var = null;
            } else {
                h0Var = h0Var2;
            }
            String str3 = this.publishableKey;
            if (str3 == null) {
                s.B("publishableKey");
                str = null;
            } else {
                str = str3;
            }
            promise2 = promise;
            try {
                this.paymentLauncherFragment = companion.d(reactApplicationContext, h0Var, str, this.stripeAccountId, promise2, paymentIntentClientSecret, confirmPaymentIntentParams);
            } catch (PaymentMethodCreateParamsException e12) {
                e = e12;
                paymentMethodCreateParamsException = e;
                promise2.resolve(s10.e.c(s10.a.Failed.toString(), paymentMethodCreateParamsException));
            }
        } catch (PaymentMethodCreateParamsException e13) {
            e = e13;
            promise2 = promise;
        }
    }

    @ReactMethod
    public final void confirmPaymentSheetPayment(Promise promise) {
        s.k(promise, "promise");
        x0 x0Var = this.paymentSheetFragment;
        if (x0Var == null) {
            promise.resolve(x0.f48938y.g());
        } else if (x0Var != null) {
            x0Var.l(promise);
        }
    }

    @ReactMethod
    public final void confirmPlatformPay(final String clientSecret, ReadableMap params, final boolean isPaymentIntent, final Promise promise) {
        s.k(clientSecret, "clientSecret");
        s.k(params, "params");
        s.k(promise, "promise");
        if (this.stripe == null) {
            promise.resolve(s10.e.g());
            return;
        }
        ReadableMap map = params.getMap("googlePay");
        if (map == null) {
            promise.resolve(s10.e.d(s10.h.Failed.toString(), "You must provide the `googlePay` parameter."));
            return;
        }
        k0 k0Var = new k0();
        k0.b bVar = isPaymentIntent ? k0.b.ForPayment : k0.b.ForSetup;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        k0Var.i(clientSecret, bVar, map, reactApplicationContext, new p() { // from class: com.reactnativestripesdk.c1
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return StripeSdkModule.confirmPlatformPay$lambda$18$lambda$17(promise, isPaymentIntent, this, clientSecret, (f.h) obj, (WritableMap) obj2);
            }
        });
    }

    @ReactMethod
    public final void confirmSetupIntent(String setupIntentClientSecret, ReadableMap params, ReadableMap options, Promise promise) throws Exception {
        PaymentMethod.p pVarN;
        Promise promise2;
        PaymentMethodCreateParamsException paymentMethodCreateParamsException;
        h0 h0Var;
        String str;
        s.k(setupIntentClientSecret, "setupIntentClientSecret");
        s.k(params, "params");
        s.k(options, "options");
        s.k(promise, "promise");
        String strJ = s10.i.j(params, Action.PAYMENT_METHOD_TYPE, null, 4, null);
        if (strJ == null || (pVarN = s10.i.N(strJ)) == null) {
            promise.resolve(s10.e.d(s10.a.Failed.toString(), "You must provide paymentMethodType"));
            return;
        }
        try {
            n nVarS = new r0(s10.i.g(params, "paymentMethodData"), options, this.cardFieldView, this.cardFormView).s(setupIntentClientSecret, pVarN, false);
            s.i(nVarS, "null cannot be cast to non-null type com.stripe.android.model.ConfirmSetupIntentParams");
            ConfirmSetupIntentParams confirmSetupIntentParams = (ConfirmSetupIntentParams) nVarS;
            String str2 = this.urlScheme;
            if (str2 != null) {
                try {
                    confirmSetupIntentParams.L3(s10.i.P(str2));
                } catch (PaymentMethodCreateParamsException e11) {
                    paymentMethodCreateParamsException = e11;
                    promise2 = promise;
                    promise2.resolve(s10.e.c(s10.a.Failed.toString(), paymentMethodCreateParamsException));
                }
            }
            q0.Companion companion = q0.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            s.j(reactApplicationContext, "getReactApplicationContext(...)");
            h0 h0Var2 = this.stripe;
            if (h0Var2 == null) {
                s.B("stripe");
                h0Var = null;
            } else {
                h0Var = h0Var2;
            }
            String str3 = this.publishableKey;
            if (str3 == null) {
                s.B("publishableKey");
                str = null;
            } else {
                str = str3;
            }
            promise2 = promise;
            try {
                this.paymentLauncherFragment = companion.e(reactApplicationContext, h0Var, str, this.stripeAccountId, promise2, setupIntentClientSecret, confirmSetupIntentParams);
            } catch (PaymentMethodCreateParamsException e12) {
                e = e12;
                paymentMethodCreateParamsException = e;
                promise2.resolve(s10.e.c(s10.a.Failed.toString(), paymentMethodCreateParamsException));
            }
        } catch (PaymentMethodCreateParamsException e13) {
            e = e13;
            promise2 = promise;
        }
    }

    @ReactMethod
    public final void createPaymentMethod(ReadableMap data, ReadableMap options, Promise promise) throws Exception {
        PaymentMethod.p pVarN;
        h0 h0Var;
        s.k(data, "data");
        s.k(options, "options");
        s.k(promise, "promise");
        String strJ = s10.i.j(data, Action.PAYMENT_METHOD_TYPE, null, 4, null);
        if (strJ == null || (pVarN = s10.i.N(strJ)) == null) {
            promise.resolve(s10.e.d(s10.a.Failed.toString(), "You must provide paymentMethodType"));
            return;
        }
        try {
            PaymentMethodCreateParams paymentMethodCreateParamsU = new r0(s10.i.g(data, "paymentMethodData"), options, this.cardFieldView, this.cardFormView).u(pVarN);
            h0 h0Var2 = this.stripe;
            if (h0Var2 == null) {
                s.B("stripe");
                h0Var = null;
            } else {
                h0Var = h0Var2;
            }
            h0.h(h0Var, paymentMethodCreateParamsU, null, null, new d(promise), 6, null);
        } catch (PaymentMethodCreateParamsException e11) {
            promise.resolve(s10.e.c(s10.a.Failed.toString(), e11));
        }
    }

    @ReactMethod
    public final void createPlatformPayPaymentMethod(ReadableMap params, boolean usesDeprecatedTokenFlow, Promise promise) {
        s.k(params, "params");
        s.k(promise, "promise");
        ReadableMap map = params.getMap("googlePay");
        if (map == null) {
            promise.resolve(s10.e.d(s10.h.Failed.toString(), "You must provide the `googlePay` parameter."));
            return;
        }
        this.platformPayUsesDeprecatedTokenFlow = usesDeprecatedTokenFlow;
        this.createPlatformPayPaymentMethodPromise = promise;
        u currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            o0.Companion companion = o0.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            s.j(reactApplicationContext, "getReactApplicationContext(...)");
            companion.d(companion.e(currentActivityOrResolveWithError, new f30.i(reactApplicationContext, false, 2, null), map), currentActivityOrResolveWithError);
        }
    }

    @ReactMethod
    public final void createToken(ReadableMap params, Promise promise) {
        s.k(params, "params");
        s.k(promise, "promise");
        String strI = s10.i.i(params, "type", null);
        if (strI == null) {
            promise.resolve(s10.e.d(s10.c.Failed.toString(), "type parameter is required"));
            return;
        }
        int iHashCode = strI.hashCode();
        if (iHashCode != 80240) {
            if (iHashCode != 2092848) {
                if (iHashCode == 811305009 && strI.equals("BankAccount")) {
                    createTokenFromBankAccount(params, promise);
                    return;
                }
            } else if (strI.equals("Card")) {
                createTokenFromCard(params, promise);
                return;
            }
        } else if (strI.equals("Pii")) {
            createTokenFromPii(params, promise);
            return;
        }
        promise.resolve(s10.e.d(s10.c.Failed.toString(), strI + " type is not supported yet"));
    }

    @ReactMethod
    public final void createTokenForCVCUpdate(String cvc, Promise promise) {
        s.k(cvc, "cvc");
        s.k(promise, "promise");
        h0 h0Var = this.stripe;
        if (h0Var == null) {
            s.B("stripe");
            h0Var = null;
        }
        h0.f(h0Var, cvc, null, null, new e(promise), 6, null);
    }

    @ReactMethod
    public final void customerAdapterAttachPaymentMethodCallback(ReadableMap paymentMethodJson, Promise promise) {
        CompletableDeferred<PaymentMethod> completableDeferredG;
        s.k(paymentMethodJson, "paymentMethodJson");
        s.k(promise, "promise");
        b0 b0Var = this.customerSheetFragment;
        if (b0Var != null) {
            PaymentMethod.Companion companion = PaymentMethod.INSTANCE;
            HashMap<String, Object> hashMap = paymentMethodJson.toHashMap();
            s.i(hashMap, "null cannot be cast to non-null type java.util.HashMap<*, *>");
            PaymentMethod paymentMethodA = companion.a(new JSONObject(hashMap));
            if (paymentMethodA == null) {
                Log.e("StripeReactNative", "There was an error converting Payment Method JSON to a Stripe Payment Method");
                return;
            } else {
                r10.a customerAdapter = b0Var.getCustomerAdapter();
                if (((customerAdapter == null || (completableDeferredG = customerAdapter.g()) == null) ? null : Boolean.valueOf(completableDeferredG.complete(paymentMethodA))) != null) {
                    return;
                }
            }
        }
        promise.resolve(b0.INSTANCE.k());
    }

    @ReactMethod
    public final void customerAdapterDetachPaymentMethodCallback(ReadableMap paymentMethodJson, Promise promise) {
        CompletableDeferred<PaymentMethod> completableDeferredH;
        s.k(paymentMethodJson, "paymentMethodJson");
        s.k(promise, "promise");
        b0 b0Var = this.customerSheetFragment;
        if (b0Var != null) {
            PaymentMethod.Companion companion = PaymentMethod.INSTANCE;
            HashMap<String, Object> hashMap = paymentMethodJson.toHashMap();
            s.i(hashMap, "null cannot be cast to non-null type java.util.HashMap<*, *>");
            PaymentMethod paymentMethodA = companion.a(new JSONObject(hashMap));
            if (paymentMethodA == null) {
                Log.e("StripeReactNative", "There was an error converting Payment Method JSON to a Stripe Payment Method");
                return;
            } else {
                r10.a customerAdapter = b0Var.getCustomerAdapter();
                if (((customerAdapter == null || (completableDeferredH = customerAdapter.h()) == null) ? null : Boolean.valueOf(completableDeferredH.complete(paymentMethodA))) != null) {
                    return;
                }
            }
        }
        promise.resolve(b0.INSTANCE.k());
    }

    @ReactMethod
    public final void customerAdapterFetchPaymentMethodsCallback(ReadableArray paymentMethodJsonObjects, Promise promise) {
        CompletableDeferred<List<PaymentMethod>> completableDeferredI;
        s.k(paymentMethodJsonObjects, "paymentMethodJsonObjects");
        s.k(promise, "promise");
        b0 b0Var = this.customerSheetFragment;
        if (b0Var != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = paymentMethodJsonObjects.toArrayList().iterator();
            s.j(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                PaymentMethod.Companion companion = PaymentMethod.INSTANCE;
                s.i(next, "null cannot be cast to non-null type java.util.HashMap<*, *>");
                PaymentMethod paymentMethodA = companion.a(new JSONObject((HashMap) next));
                if (paymentMethodA != null) {
                    arrayList.add(paymentMethodA);
                } else {
                    Log.e("StripeReactNative", "There was an error converting Payment Method JSON to a Stripe Payment Method");
                }
            }
            r10.a customerAdapter = b0Var.getCustomerAdapter();
            if (((customerAdapter == null || (completableDeferredI = customerAdapter.i()) == null) ? null : Boolean.valueOf(completableDeferredI.complete(arrayList))) != null) {
                return;
            }
        }
        promise.resolve(b0.INSTANCE.k());
    }

    @ReactMethod
    public final void customerAdapterFetchSelectedPaymentOptionCallback(String paymentOption, Promise promise) {
        CompletableDeferred<String> completableDeferredJ;
        s.k(promise, "promise");
        b0 b0Var = this.customerSheetFragment;
        if (b0Var != null) {
            r10.a customerAdapter = b0Var.getCustomerAdapter();
            if (((customerAdapter == null || (completableDeferredJ = customerAdapter.j()) == null) ? null : Boolean.valueOf(completableDeferredJ.complete(paymentOption))) != null) {
                return;
            }
        }
        promise.resolve(b0.INSTANCE.k());
    }

    @ReactMethod
    public final void customerAdapterSetSelectedPaymentOptionCallback(Promise promise) {
        CompletableDeferred<jn0.h0> completableDeferredK;
        s.k(promise, "promise");
        b0 b0Var = this.customerSheetFragment;
        if (b0Var != null) {
            r10.a customerAdapter = b0Var.getCustomerAdapter();
            if (((customerAdapter == null || (completableDeferredK = customerAdapter.k()) == null) ? null : Boolean.valueOf(completableDeferredK.complete(jn0.h0.f84049a))) != null) {
                return;
            }
        }
        promise.resolve(b0.INSTANCE.k());
    }

    @ReactMethod
    public final void customerAdapterSetupIntentClientSecretForCustomerAttachCallback(String clientSecret, Promise promise) {
        CompletableDeferred<String> completableDeferredL;
        s.k(clientSecret, "clientSecret");
        s.k(promise, "promise");
        b0 b0Var = this.customerSheetFragment;
        if (b0Var != null) {
            r10.a customerAdapter = b0Var.getCustomerAdapter();
            if (((customerAdapter == null || (completableDeferredL = customerAdapter.l()) == null) ? null : Boolean.valueOf(completableDeferredL.complete(clientSecret))) != null) {
                return;
            }
        }
        promise.resolve(b0.INSTANCE.k());
    }

    public final com.content.k getCardFieldView() {
        return this.cardFieldView;
    }

    public final v getCardFormView() {
        return this.cardFormView;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return v0.k(x.a("API_VERSIONS", v0.k(x.a("CORE", "2020-03-02"), x.a("ISSUING", com.content.pushprovisioning.f.f48883a.d()))));
    }

    /* JADX INFO: renamed from: getEventListenerCount$stripe_stripe_react_native_release, reason: from getter */
    public final int getEventListenerCount() {
        return this.eventListenerCount;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void handleNextAction(String paymentIntentClientSecret, Promise promise) {
        s.k(paymentIntentClientSecret, "paymentIntentClientSecret");
        s.k(promise, "promise");
        q0.Companion companion = q0.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        h0 h0Var = this.stripe;
        if (h0Var == null) {
            s.B("stripe");
            h0Var = null;
        }
        String str = this.publishableKey;
        if (str == null) {
            s.B("publishableKey");
            str = null;
        }
        this.paymentLauncherFragment = companion.b(reactApplicationContext, h0Var, str, this.stripeAccountId, promise, paymentIntentClientSecret);
    }

    @ReactMethod
    public final void handleNextActionForSetup(String setupIntentClientSecret, Promise promise) {
        s.k(setupIntentClientSecret, "setupIntentClientSecret");
        s.k(promise, "promise");
        q0.Companion companion = q0.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        h0 h0Var = this.stripe;
        if (h0Var == null) {
            s.B("stripe");
            h0Var = null;
        }
        String str = this.publishableKey;
        if (str == null) {
            s.B("publishableKey");
            str = null;
        }
        this.paymentLauncherFragment = companion.c(reactApplicationContext, h0Var, str, this.stripeAccountId, promise, setupIntentClientSecret);
    }

    @ReactMethod
    public final void initCustomerSheet(ReadableMap params, ReadableMap customerAdapterOverrides, Promise promise) {
        s.k(params, "params");
        s.k(customerAdapterOverrides, "customerAdapterOverrides");
        s.k(promise, "promise");
        if (this.stripe == null) {
            promise.resolve(s10.e.g());
            return;
        }
        u currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            b0 b0Var = this.customerSheetFragment;
            if (b0Var != null) {
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                s.j(reactApplicationContext, "getReactApplicationContext(...)");
                s10.g.d(b0Var, reactApplicationContext);
            }
            b0 b0Var2 = new b0();
            b0Var2.q(getReactApplicationContext());
            b0Var2.r(promise);
            Bundle bundleV = s10.i.V(params);
            bundleV.putBundle("customerAdapter", s10.i.V(customerAdapterOverrides));
            b0Var2.setArguments(bundleV);
            this.customerSheetFragment = b0Var2;
            try {
                r0 r0VarR = currentActivityOrResolveWithError.getSupportFragmentManager().r();
                b0 b0Var3 = this.customerSheetFragment;
                s.h(b0Var3);
                r0VarR.e(b0Var3, "customer_sheet_launch_fragment").g();
            } catch (IllegalStateException e11) {
                promise.resolve(s10.e.d(s10.d.Failed.toString(), e11.getMessage()));
                jn0.h0 h0Var = jn0.h0.f84049a;
            }
        }
    }

    @ReactMethod
    public final void initPaymentSheet(ReadableMap params, Promise promise) {
        s.k(params, "params");
        s.k(promise, "promise");
        u currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            x0 x0Var = this.paymentSheetFragment;
            if (x0Var != null) {
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                s.j(reactApplicationContext, "getReactApplicationContext(...)");
                s10.g.d(x0Var, reactApplicationContext);
            }
            ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
            s.j(reactApplicationContext2, "getReactApplicationContext(...)");
            x0 x0Var2 = new x0(reactApplicationContext2, promise);
            x0Var2.setArguments(s10.i.V(params));
            this.paymentSheetFragment = x0Var2;
            try {
                r0 r0VarR = currentActivityOrResolveWithError.getSupportFragmentManager().r();
                x0 x0Var3 = this.paymentSheetFragment;
                s.h(x0Var3);
                r0VarR.e(x0Var3, "payment_sheet_launch_fragment").g();
            } catch (IllegalStateException e11) {
                promise.resolve(s10.e.d(s10.d.Failed.toString(), e11.getMessage()));
                jn0.h0 h0Var = jn0.h0.f84049a;
            }
        }
    }

    @ReactMethod
    public final void initialise(ReadableMap params, Promise promise) {
        s.k(params, "params");
        s.k(promise, "promise");
        String strI = s10.i.i(params, "publishableKey", null);
        s.i(strI, "null cannot be cast to non-null type kotlin.String");
        ReadableMap readableMapG = s10.i.g(params, "appInfo");
        s.i(readableMapG, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
        this.stripeAccountId = s10.i.i(params, "stripeAccountId", null);
        String strI2 = s10.i.i(params, "urlScheme", null);
        if (!s10.i.e(params, "setReturnUrlSchemeOnAndroid")) {
            strI2 = null;
        }
        this.urlScheme = strI2;
        ReadableMap readableMapG2 = s10.i.g(params, "threeDSecureParams");
        if (readableMapG2 != null) {
            configure3dSecure(readableMapG2);
        }
        this.publishableKey = strI;
        com.content.addresssheet.a.INSTANCE.a(strI);
        String strI3 = s10.i.i(readableMapG, "name", "");
        s.i(strI3, "null cannot be cast to non-null type kotlin.String");
        h0.INSTANCE.c(AppInfo.INSTANCE.a(strI3, s10.i.i(readableMapG, "version", ""), s10.i.i(readableMapG, ImagesContract.URL, ""), s10.i.i(readableMapG, "partnerId", "")));
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        this.stripe = new h0(reactApplicationContext, strI, this.stripeAccountId, false, null, 24, null);
        PaymentConfiguration.Companion companion = PaymentConfiguration.INSTANCE;
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        s.j(reactApplicationContext2, "getReactApplicationContext(...)");
        companion.b(reactApplicationContext2, strI, this.stripeAccountId);
        promise.resolve(null);
    }

    @ReactMethod
    public final void intentCreationCallback(ReadableMap params, Promise promise) {
        CompletableDeferred<ReadableMap> completableDeferredM;
        s.k(params, "params");
        s.k(promise, "promise");
        x0 x0Var = this.paymentSheetFragment;
        if (x0Var == null) {
            promise.resolve(x0.f48938y.g());
        } else {
            if (x0Var == null || (completableDeferredM = x0Var.m()) == null) {
                return;
            }
            completableDeferredM.complete(params);
        }
    }

    @ReactMethod
    public final void isCardInWallet(ReadableMap params, final Promise promise) {
        s.k(params, "params");
        s.k(promise, "promise");
        String strI = s10.i.i(params, "cardLastFour", null);
        if (strI == null) {
            promise.resolve(s10.e.d("Failed", "You must provide cardLastFour"));
            return;
        }
        u currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            com.content.pushprovisioning.f.f48883a.f(currentActivityOrResolveWithError, strI, new q() { // from class: com.reactnativestripesdk.b1
                @Override // wn0.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return StripeSdkModule.isCardInWallet$lambda$29$lambda$28(this.f48779a, promise, ((Boolean) obj).booleanValue(), (WritableMap) obj2, (WritableMap) obj3);
                }
            });
        }
    }

    @ReactMethod
    public final void isPlatformPaySupported(ReadableMap params, Promise promise) {
        s.k(promise, "promise");
        ReadableMap map = params != null ? params.getMap("googlePay") : null;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        n0 n0Var = new n0(reactApplicationContext, s10.i.e(map, "testEnv"), s10.i.e(map, "existingPaymentMethodRequired"), promise);
        u currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError != null) {
            try {
                currentActivityOrResolveWithError.getSupportFragmentManager().r().e(n0Var, "google_pay_support_fragment").g();
            } catch (IllegalStateException e11) {
                promise.resolve(s10.e.d(s10.d.Failed.toString(), e11.getMessage()));
                jn0.h0 h0Var = jn0.h0.f84049a;
            }
        }
    }

    @ReactMethod
    public final void presentCustomerSheet(ReadableMap params, Promise promise) {
        s.k(params, "params");
        s.k(promise, "promise");
        Long lValueOf = params.hasKey("timeout") ? Long.valueOf(params.getInt("timeout")) : null;
        b0 b0Var = this.customerSheetFragment;
        if (b0Var != null) {
            b0Var.l(lValueOf, promise);
        } else {
            promise.resolve(b0.INSTANCE.k());
        }
    }

    @ReactMethod
    public final void presentPaymentSheet(ReadableMap options, Promise promise) {
        s.k(options, "options");
        s.k(promise, "promise");
        if (this.paymentSheetFragment == null) {
            promise.resolve(x0.f48938y.g());
            return;
        }
        if (options.hasKey("timeout")) {
            x0 x0Var = this.paymentSheetFragment;
            if (x0Var != null) {
                x0Var.r(options.getInt("timeout"), promise);
                return;
            }
            return;
        }
        x0 x0Var2 = this.paymentSheetFragment;
        if (x0Var2 != null) {
            x0Var2.q(promise);
        }
    }

    @ReactMethod
    public final void removeListeners(int count) {
        int i11 = this.eventListenerCount - count;
        this.eventListenerCount = i11;
        if (i11 < 0) {
            this.eventListenerCount = 0;
        }
    }

    @ReactMethod
    public final void resetPaymentSheetCustomer(Promise promise) {
        s.k(promise, "promise");
        y.Companion companion = y.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        companion.a(reactApplicationContext);
        promise.resolve(null);
    }

    @ReactMethod
    public final void retrieveCustomerSheetPaymentOptionSelection(Promise promise) {
        s.k(promise, "promise");
        b0 b0Var = this.customerSheetFragment;
        if (b0Var != null) {
            b0Var.p(promise);
        } else {
            promise.resolve(b0.INSTANCE.k());
        }
    }

    @ReactMethod
    public final void retrievePaymentIntent(String clientSecret, Promise promise) {
        s.k(clientSecret, "clientSecret");
        s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new j(clientSecret, promise, null), 3, null);
    }

    @ReactMethod
    public final void retrieveSetupIntent(String clientSecret, Promise promise) {
        s.k(clientSecret, "clientSecret");
        s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new k(clientSecret, promise, null), 3, null);
    }

    public final void sendEvent$stripe_stripe_react_native_release(ReactContext reactContext, String eventName, WritableMap params) {
        s.k(reactContext, "reactContext");
        s.k(eventName, "eventName");
        s.k(params, "params");
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
    }

    public final void setCardFieldView(com.content.k kVar) {
        this.cardFieldView = kVar;
    }

    public final void setCardFormView(v vVar) {
        this.cardFormView = vVar;
    }

    public final void setEventListenerCount$stripe_stripe_react_native_release(int i11) {
        this.eventListenerCount = i11;
    }

    @ReactMethod
    public final void verifyMicrodeposits(boolean isPaymentIntent, String clientSecret, ReadableMap params, Promise promise) {
        s.k(clientSecret, "clientSecret");
        s.k(params, "params");
        s.k(promise, "promise");
        ReadableArray array = params.getArray("amounts");
        String string = params.getString("descriptorCode");
        if ((array != null && string != null) || (array == null && string == null)) {
            promise.resolve(s10.e.d(s10.d.Failed.toString(), "You must provide either amounts OR descriptorCode, not both."));
            return;
        }
        l lVar = new l(promise);
        m mVar = new m(promise);
        h0 h0Var = null;
        if (array == null) {
            if (string != null) {
                if (isPaymentIntent) {
                    h0 h0Var2 = this.stripe;
                    if (h0Var2 == null) {
                        s.B("stripe");
                    } else {
                        h0Var = h0Var2;
                    }
                    h0Var.w(clientSecret, string, lVar);
                    return;
                }
                h0 h0Var3 = this.stripe;
                if (h0Var3 == null) {
                    s.B("stripe");
                } else {
                    h0Var = h0Var3;
                }
                h0Var.y(clientSecret, string, mVar);
                return;
            }
            return;
        }
        if (array.size() != 2) {
            promise.resolve(s10.e.d(s10.d.Failed.toString(), "Expected 2 integers in the amounts array, but received " + array.size()));
            return;
        }
        if (isPaymentIntent) {
            h0 h0Var4 = this.stripe;
            if (h0Var4 == null) {
                s.B("stripe");
            } else {
                h0Var = h0Var4;
            }
            h0Var.v(clientSecret, array.getInt(0), array.getInt(1), lVar);
            return;
        }
        h0 h0Var5 = this.stripe;
        if (h0Var5 == null) {
            s.B("stripe");
        } else {
            h0Var = h0Var5;
        }
        h0Var.x(clientSecret, array.getInt(0), array.getInt(1), mVar);
    }
}

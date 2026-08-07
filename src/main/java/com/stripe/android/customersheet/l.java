package com.stripe.android.customersheet;

import a40.CustomerPermissions;
import android.app.Application;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.a1;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import f30.PaymentConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Provider;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import m60.InlineSignupViewState;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import t60.SupportedPaymentMethod;
import u60.PaymentMethodMetadata;
import u70.FormFieldValues;
import y70.FormArguments;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u008e\u00012\u00020\u0001:\bî\u0001ï\u0001ð\u0001ñ\u0001B»\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*B\u0093\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010+J\u0015\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u001d¢\u0006\u0004\b1\u00102J\u001d\u00107\u001a\u0002062\u000e\u00105\u001a\n\u0018\u000103j\u0004\u0018\u0001`4¢\u0006\u0004\b7\u00108J\u001d\u0010=\u001a\u00020.2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020.H\u0082@¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020.H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020.H\u0002¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020.H\u0002¢\u0006\u0004\bD\u0010BJ\u000f\u0010E\u001a\u00020.H\u0002¢\u0006\u0004\bE\u0010BJ\u000f\u0010F\u001a\u00020.H\u0002¢\u0006\u0004\bF\u0010BJ\u0017\u0010I\u001a\u00020.2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u0019\u0010M\u001a\u00020.2\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020.2\u0006\u0010H\u001a\u00020OH\u0002¢\u0006\u0004\bP\u0010QJ\u001e\u0010S\u001a\b\u0012\u0004\u0012\u00020O0R2\u0006\u0010H\u001a\u00020OH\u0082@¢\u0006\u0004\bS\u0010TJ&\u0010W\u001a\b\u0012\u0004\u0012\u00020O0R2\u0006\u0010H\u001a\u00020O2\u0006\u0010V\u001a\u00020UH\u0082@¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020.2\u0006\u0010H\u001a\u00020OH\u0002¢\u0006\u0004\bY\u0010QJ\u0019\u0010[\u001a\u00020.2\b\u0010Z\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020.2\u0006\u0010H\u001a\u00020OH\u0002¢\u0006\u0004\b]\u0010QJ\u0017\u0010^\u001a\u00020.2\u0006\u0010H\u001a\u00020OH\u0002¢\u0006\u0004\b^\u0010QJ\u0017\u0010`\u001a\u00020.2\u0006\u0010_\u001a\u00020OH\u0002¢\u0006\u0004\b`\u0010QJ\u0019\u0010b\u001a\u00020.2\b\u0010a\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020.H\u0002¢\u0006\u0004\bd\u0010BJ\u0017\u0010g\u001a\u00020.2\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u00020.2\u0006\u0010i\u001a\u00020\u001dH\u0002¢\u0006\u0004\bj\u0010kJ\u0019\u0010o\u001a\u00020n2\b\u0010m\u001a\u0004\u0018\u00010lH\u0002¢\u0006\u0004\bo\u0010pJ'\u0010t\u001a\u00020.2\u0016\u0010s\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010r\u0012\u0006\u0012\u0004\u0018\u00010r0qH\u0002¢\u0006\u0004\bt\u0010uJ!\u0010x\u001a\u00020.2\b\u0010v\u001a\u0004\u0018\u0001062\u0006\u0010w\u001a\u00020\u001dH\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010|\u001a\u00020.2\u0006\u0010{\u001a\u00020zH\u0002¢\u0006\u0004\b|\u0010}J\u001a\u0010\u0080\u0001\u001a\u00020.2\u0006\u0010\u007f\u001a\u00020~H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020.H\u0002¢\u0006\u0005\b\u0082\u0001\u0010BJ\u001d\u0010\u0084\u0001\u001a\u00020.2\t\u0010\u0083\u0001\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00020.H\u0002¢\u0006\u0005\b\u0086\u0001\u0010BJ(\u0010\u0089\u0001\u001a\u00020.2\u0015\u0010\u0088\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0087\u0001\u0012\u0005\u0012\u00030\u0087\u00010qH\u0002¢\u0006\u0005\b\u0089\u0001\u0010uJ(\u0010\u008b\u0001\u001a\u00020.2\u0015\u0010\u0088\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0005\u0012\u00030\u008a\u00010qH\u0002¢\u0006\u0005\b\u008b\u0001\u0010uJ)\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020O0\u008d\u00012\u0007\u0010\u008c\u0001\u001a\u00020eH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0019\u0010\u0090\u0001\u001a\u00020.2\u0006\u0010H\u001a\u00020OH\u0002¢\u0006\u0005\b\u0090\u0001\u0010QJ\u001a\u0010\u0091\u0001\u001a\u00020.2\u0006\u0010H\u001a\u00020OH\u0082@¢\u0006\u0005\b\u0091\u0001\u0010TJ,\u0010\u0093\u0001\u001a\u00020.2\u0006\u0010m\u001a\u00020l2\u0007\u0010\u0092\u0001\u001a\u0002032\u0006\u0010H\u001a\u00020OH\u0082@¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001c\u0010\u0096\u0001\u001a\u00020.2\u0007\u0010\u0095\u0001\u001a\u000203H\u0082@¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001b\u0010\u0099\u0001\u001a\u00020.2\u0007\u0010\u0098\u0001\u001a\u00020OH\u0082@¢\u0006\u0005\b\u0099\u0001\u0010TJ\u001e\u0010\u009c\u0001\u001a\u00020.2\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u0001H\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0011\u0010\u009e\u0001\u001a\u00020.H\u0002¢\u0006\u0005\b\u009e\u0001\u0010BJ'\u0010 \u0001\u001a\u00020.2\b\u0010a\u001a\u0004\u0018\u00010\u00042\t\u0010\u009f\u0001\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J;\u0010¤\u0001\u001a\u00020.2\b\u0010a\u001a\u0004\u0018\u00010\u00042\t\u0010\u009f\u0001\u001a\u0004\u0018\u0001032\b\u0010£\u0001\u001a\u00030¢\u00012\b\u0010Z\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J'\u0010©\u0001\u001a\u00020.2\b\u0010§\u0001\u001a\u00030¦\u00012\t\b\u0002\u0010¨\u0001\u001a\u00020\u001dH\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0012\u0010«\u0001\u001a\u00020\nH\u0082@¢\u0006\u0005\b«\u0001\u0010@J\u0012\u0010¬\u0001\u001a\u00020\fH\u0082@¢\u0006\u0005\b¬\u0001\u0010@J\u0012\u0010\u00ad\u0001\u001a\u00020\u000eH\u0082@¢\u0006\u0005\b\u00ad\u0001\u0010@R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010³\u0001R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010³\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0016\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R&\u0010Ó\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¦\u00010Ñ\u00010Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010Ò\u0001R$\u0010Ø\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010Ô\u00018\u0006¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001R!\u0010Ú\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ù\u00010Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010Ò\u0001R&\u0010Ü\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ù\u00010Ô\u00018\u0006¢\u0006\u0010\n\u0006\b¬\u0001\u0010Õ\u0001\u001a\u0006\bÛ\u0001\u0010×\u0001R\u0018\u0010ß\u0001\u001a\u00030Ý\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010Þ\u0001R\u001e\u0010à\u0001\u001a\t\u0012\u0004\u0012\u00020\u001d0Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010Ò\u0001R\u001e\u0010á\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010Ð\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010Ò\u0001R\u001f\u0010â\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010Ò\u0001R\u001f\u0010ä\u0001\u001a\n\u0012\u0005\u0012\u00030ã\u00010Ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010Õ\u0001R\u001a\u0010æ\u0001\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bg\u0010å\u0001R\u001f\u0010é\u0001\u001a\t\u0012\u0004\u0012\u00020G0ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bo\u0010è\u0001R\u001f\u0010í\u0001\u001a\u0005\u0018\u00010ê\u0001*\u00030¦\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010ì\u0001\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006ò\u0001"}, d2 = {"Lcom/stripe/android/customersheet/l;", "Landroidx/lifecycle/c1;", "Landroid/app/Application;", Kind.APPLICATION, "Lw70/j;", "originalPaymentSelection", "Ljavax/inject/Provider;", "Lf30/o;", "paymentConfigurationProvider", "Lkotlinx/coroutines/Deferred;", "Lc40/n;", "paymentMethodDataSourceProvider", "Lc40/m;", "intentDataSourceProvider", "Lc40/o;", "savedSelectionDataSourceProvider", "Lcom/stripe/android/customersheet/d$c;", "configuration", "Lcom/stripe/android/customersheet/g$c;", "integrationType", "Lo30/d;", "logger", "Lz60/g;", "stripeRepository", "Lb40/b;", "eventReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lkotlin/Function0;", "", "isLiveModeProvider", "Lcom/stripe/android/paymentsheet/h$d;", "intentConfirmationHandlerFactory", "Lcom/stripe/android/customersheet/h;", "customerSheetLoader", "Ll70/d;", "isFinancialConnectionsAvailable", "Lh80/t$a;", "editInteractorFactory", "Lh70/h;", "errorReporter", "<init>", "(Landroid/app/Application;Lw70/j;Ljavax/inject/Provider;Lkotlinx/coroutines/Deferred;Lkotlinx/coroutines/Deferred;Lkotlinx/coroutines/Deferred;Lcom/stripe/android/customersheet/d$c;Lcom/stripe/android/customersheet/g$c;Lo30/d;Lz60/g;Lb40/b;Lkotlin/coroutines/CoroutineContext;Lwn0/a;Lcom/stripe/android/paymentsheet/h$d;Lcom/stripe/android/customersheet/h;Ll70/d;Lh80/t$a;Lh70/h;)V", "(Landroid/app/Application;Lw70/j;Ljavax/inject/Provider;Lcom/stripe/android/customersheet/d$c;Lcom/stripe/android/customersheet/g$c;Lo30/d;Lz60/g;Lb40/b;Lkotlin/coroutines/CoroutineContext;Lwn0/a;Lcom/stripe/android/paymentsheet/h$d;Lcom/stripe/android/customersheet/h;Ll70/d;Lh80/t$a;Lh70/h;)V", "Lcom/stripe/android/customersheet/k;", "viewAction", "Ljn0/h0;", "b0", "(Lcom/stripe/android/customersheet/k;)V", "P", "()Z", "", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "Lx30/c;", "t0", "(Ljava/lang/String;)Lx30/c;", "Lh/b;", "activityResultCaller", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "v0", "(Lh/b;Landroidx/lifecycle/LifecycleOwner;)V", "c0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "F0", "()V", "e0", "l0", "g0", "m0", "Lt60/g;", "paymentMethod", "f0", "(Lt60/g;)V", "Lu70/c;", "formFieldValues", "o0", "(Lu70/c;)V", "Lcom/stripe/android/model/v0;", "p0", "(Lcom/stripe/android/model/v0;)V", "Lc40/j;", "w0", "(Lcom/stripe/android/model/v0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/h;", "brand", "d0", "(Lcom/stripe/android/model/v0;Lcom/stripe/android/model/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Z", "displayMessage", "Y", "(Ljava/lang/String;)V", "r0", "x0", "updatedMethod", "I0", "paymentSelection", "q0", "(Lw70/j;)V", "s0", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "S", "(Lcom/stripe/android/model/w0;)V", "isFirstPaymentMethod", "E0", "(Z)V", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Lz70/d;", "T", "(Lcom/stripe/android/model/StripeIntent;)Lz70/d;", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "callback", "G0", "(Lwn0/l;)V", "mandateText", "showAbove", "H0", "(Lx30/c;Z)V", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "bankAccountResult", "j0", "(Lcom/stripe/android/payments/bankaccount/navigation/e;)V", "Lw70/j$e$d;", "usBankAccount", "k0", "(Lw70/j$e$d;)V", "i0", AnalyticsAttribute.Error, "n0", "(Lx30/c;)V", "h0", "Lcom/stripe/android/customersheet/l$f;", "update", "A0", "Lcom/stripe/android/customersheet/l$h;", "B0", "createParams", "Ljn0/s;", Gender.UNKNOWN, "(Lcom/stripe/android/model/w0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "K", "L", "clientSecret", "a0", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/model/v0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "J", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newPaymentMethod", "u0", "Lw70/j$f;", "savedPaymentSelection", "z0", "(Lw70/j$f;)V", "y0", "type", "Q", "(Lw70/j;Ljava/lang/String;)V", "", "cause", "R", "(Lw70/j;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "Lcom/stripe/android/customersheet/n;", "to", "reset", "C0", "(Lcom/stripe/android/customersheet/n;Z)V", Gender.NONE, Gender.MALE, Gender.OTHER, "s", "Lw70/j;", "t", "Ljavax/inject/Provider;", "u", "Lkotlinx/coroutines/Deferred;", "v", "w", "x", "Lcom/stripe/android/customersheet/d$c;", "y", "Lcom/stripe/android/customersheet/g$c;", "z", "Lo30/d;", "A", "Lz60/g;", "B", "Lb40/b;", "C", "Lkotlin/coroutines/CoroutineContext;", "D", "Lwn0/a;", "E", "Lcom/stripe/android/customersheet/h;", Gender.FEMALE, "Ll70/d;", "G", "Lh80/t$a;", "H", "Lh70/h;", "Lh30/j;", "I", "Lh30/j;", "cardAccountRangeRepositoryFactory", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "backStack", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "X", "()Lkotlinx/coroutines/flow/StateFlow;", "viewState", "Lcom/stripe/android/customersheet/p;", "_result", "W", "result", "Lcom/stripe/android/paymentsheet/h;", "Lcom/stripe/android/paymentsheet/h;", "intentConfirmationHandler", "isEditing", "selectionConfirmationState", "customerState", "Lcom/stripe/android/customersheet/n$d;", "selectPaymentMethodState", "Lt60/g;", "previouslySelectedPaymentMethod", "", "Ljava/util/List;", "supportedPaymentMethods", "Lb40/b$c;", "V", "(Lcom/stripe/android/customersheet/n;)Lb40/b$c;", "eventReporterScreen", "e", "f", "g", "h", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l extends c1 {
    private static final e U = new e(null);
    public static final int V = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final z60.g stripeRepository;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final b40.b eventReporter;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final wn0.a<Boolean> isLiveModeProvider;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final h customerSheetLoader;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final l70.d isFinancialConnectionsAvailable;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final h80.t.a editInteractorFactory;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final h30.j cardAccountRangeRepositoryFactory;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final MutableStateFlow<List<com.stripe.android.customersheet.n>> backStack;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final StateFlow<com.stripe.android.customersheet.n> viewState;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final MutableStateFlow<com.stripe.android.customersheet.p> _result;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final StateFlow<com.stripe.android.customersheet.p> result;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final com.stripe.android.paymentsheet.h intentConfirmationHandler;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final MutableStateFlow<Boolean> isEditing;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final MutableStateFlow<SelectionConfirmationState> selectionConfirmationState;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final MutableStateFlow<CustomerState> customerState;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final StateFlow<com.stripe.android.customersheet.n.SelectPaymentMethod> selectPaymentMethodState;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private SupportedPaymentMethod previouslySelectedPaymentMethod;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private List<SupportedPaymentMethod> supportedPaymentMethods;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private w70.j originalPaymentSelection;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Deferred<c40.n> paymentMethodDataSourceProvider;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Deferred<c40.m> intentDataSourceProvider;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Deferred<c40.o> savedSelectionDataSourceProvider;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.customersheet.d.Configuration configuration;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.customersheet.g.c integrationType;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$1", f = "CustomerSheetViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49841n;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f49841n;
            if (i11 == 0) {
                jn0.t.b(obj);
                l lVar = l.this;
                this.f49841n = 1;
                if (lVar.c0(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm60/e;", "it", "Ljn0/h0;", "a", "(Lm60/e;)V"}, k = 3, mv = {1, 9, 0})
    static final class a0 extends p013kotlin.jvm.internal.u implements wn0.l<InlineSignupViewState, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a0 f49843c = new a0();

        a0() {
            super(1);
        }

        public final void a(InlineSignupViewState it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            throw new IllegalStateException("`CustomerSheet` does not implement `Link` and should not receive `InlineSignUpViewState` updates");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(InlineSignupViewState inlineSignupViewState) {
            a(inlineSignupViewState);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$2", f = "CustomerSheetViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49844n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/customersheet/n$d;", "selectPaymentMethodState", "Ljn0/h0;", "<anonymous>", "(Lcom/stripe/android/customersheet/n$d;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$2$1", f = "CustomerSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<com.stripe.android.customersheet.n.SelectPaymentMethod, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f49846n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f49847o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ l f49848p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f49848p = lVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.stripe.android.customersheet.n.SelectPaymentMethod selectPaymentMethod, Continuation<? super jn0.h0> continuation) {
                return ((a) create(selectPaymentMethod, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f49848p, continuation);
                aVar.f49847o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                ArrayList arrayList;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f49846n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                com.stripe.android.customersheet.n.SelectPaymentMethod selectPaymentMethod = (com.stripe.android.customersheet.n.SelectPaymentMethod) this.f49847o;
                MutableStateFlow mutableStateFlow = this.f49848p.backStack;
                do {
                    value = mutableStateFlow.getValue();
                    List<com.stripe.android.customersheet.n> list = (List) value;
                    arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
                    for (com.stripe.android.customersheet.n nVar : list) {
                        if (nVar instanceof com.stripe.android.customersheet.n.SelectPaymentMethod) {
                            nVar = selectPaymentMethod;
                        }
                        arrayList.add(nVar);
                    }
                } while (!mutableStateFlow.compareAndSet(value, arrayList));
                return jn0.h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f49844n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow stateFlow = l.this.selectPaymentMethodState;
                a aVar = new a(l.this, null);
                this.f49844n = 1;
                if (FlowKt.collectLatest(stateFlow, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$onItemRemoved$1", f = "CustomerSheetViewModel.kt", i = {}, l = {501}, m = "invokeSuspend", n = {}, s = {})
    static final class b0 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49849n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ PaymentMethod f49851p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(PaymentMethod paymentMethod, Continuation<? super b0> continuation) {
            super(2, continuation);
            this.f49851p = paymentMethod;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new b0(this.f49851p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f49849n;
            if (i11 == 0) {
                jn0.t.b(obj);
                l lVar = l.this;
                PaymentMethod paymentMethod = this.f49851p;
                this.f49849n = 1;
                obj = lVar.w0(paymentMethod, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            c40.j jVar = (c40.j) obj;
            l lVar2 = l.this;
            if (jVar instanceof c40.j.Failure) {
                c40.j.Failure failure = (c40.j.Failure) jVar;
                failure.getCause();
                lVar2.Y(failure.getDisplayMessage());
            } else {
                if (!(jVar instanceof c40.j.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                lVar2.x0((PaymentMethod) ((c40.j.Success) jVar).b());
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b0) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$3", f = "CustomerSheetViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49852n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/customersheet/l$f;", "state", "Ljn0/h0;", "<anonymous>", "(Lcom/stripe/android/customersheet/l$f;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$3$1", f = "CustomerSheetViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CustomerState, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f49854n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f49855o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ l f49856p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f49856p = lVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CustomerState customerState, Continuation<? super jn0.h0> continuation) {
                return ((a) create(customerState, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f49856p, continuation);
                aVar.f49855o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f49854n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    if (!((CustomerState) this.f49855o).getCanShowSavedPaymentMethods() && (this.f49856p.X().getValue() instanceof com.stripe.android.customersheet.n.SelectPaymentMethod)) {
                        this.f49854n = 1;
                        if (DelayKt.delay(50L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return jn0.h0.f84049a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                this.f49856p.E0(true);
                this.f49856p.selectionConfirmationState.setValue(new SelectionConfirmationState(false, null));
                return jn0.h0.f84049a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f49852n;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableStateFlow mutableStateFlow = l.this.customerState;
                a aVar = new a(l.this, null);
                this.f49852n = 1;
                if (FlowKt.collectLatest(mutableStateFlow, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/customersheet/l$f;", "state", "a", "(Lcom/stripe/android/customersheet/l$f;)Lcom/stripe/android/customersheet/l$f;"}, k = 3, mv = {1, 9, 0})
    static final class c0 extends p013kotlin.jvm.internal.u implements wn0.l<CustomerState, CustomerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w70.j f49857c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(w70.j jVar) {
            super(1);
            this.f49857c = jVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CustomerState invoke(CustomerState state) {
            p013kotlin.jvm.internal.s.k(state, "state");
            return CustomerState.b(state, null, this.f49857c, null, null, null, 29, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$4", f = "CustomerSheetViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49858n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/customersheet/l$f;", "state", "Ljn0/h0;", "<anonymous>", "(Lcom/stripe/android/customersheet/l$f;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$4$1", f = "CustomerSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CustomerState, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f49860n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f49861o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ l f49862p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f49862p = lVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CustomerState customerState, Continuation<? super jn0.h0> continuation) {
                return ((a) create(customerState, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f49862p, continuation);
                aVar.f49861o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f49860n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                if (!((CustomerState) this.f49861o).getCanEdit() && ((Boolean) this.f49862p.isEditing.getValue()).booleanValue()) {
                    this.f49862p.isEditing.setValue(Boxing.boxBoolean(false));
                }
                return jn0.h0.f84049a;
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f49858n;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableStateFlow mutableStateFlow = l.this.customerState;
                a aVar = new a(l.this, null);
                this.f49858n = 1;
                if (FlowKt.collectLatest(mutableStateFlow, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh80/n$a;", "event", "Ljn0/h0;", "a", "(Lh80/n$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class d0 extends p013kotlin.jvm.internal.u implements wn0.l<h80.n.a, jn0.h0> {
        d0() {
            super(1);
        }

        public final void a(h80.n.a event) {
            p013kotlin.jvm.internal.s.k(event, "event");
            if (event instanceof h80.n.a.ShowBrands) {
                l.this.eventReporter.d(b40.b.EnumC0322b.Edit, ((h80.n.a.ShowBrands) event).getBrand());
            } else if (event instanceof h80.n.a.HideBrands) {
                l.this.eventReporter.h(b40.b.EnumC0322b.Edit, ((h80.n.a.HideBrands) event).getBrand());
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(h80.n.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/customersheet/l$e;", "", "<init>", "()V", "", "REMOVAL_TRANSITION_DELAY", "J", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/v0;", "pm", "", "<anonymous>", "(Lcom/stripe/android/model/v0;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$onModifyItem$2", f = "CustomerSheetViewModel.kt", i = {0}, l = {594}, m = "invokeSuspend", n = {"pm"}, s = {"L$0"})
    static final class e0 extends SuspendLambda implements wn0.p<PaymentMethod, Continuation<? super Throwable>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49864n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f49865o;

        e0(Continuation<? super e0> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentMethod paymentMethod, Continuation<? super Throwable> continuation) {
            return ((e0) create(paymentMethod, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            e0 e0Var = l.this.new e0(continuation);
            e0Var.f49865o = obj;
            return e0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PaymentMethod paymentMethod;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f49864n;
            if (i11 == 0) {
                jn0.t.b(obj);
                PaymentMethod paymentMethod2 = (PaymentMethod) this.f49865o;
                l lVar = l.this;
                this.f49865o = paymentMethod2;
                this.f49864n = 1;
                Object objW0 = lVar.w0(paymentMethod2, this);
                if (objW0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                paymentMethod = paymentMethod2;
                obj = objW0;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paymentMethod = (PaymentMethod) this.f49865o;
                jn0.t.b(obj);
            }
            c40.j jVar = (c40.j) obj;
            l lVar2 = l.this;
            if (jVar instanceof c40.j.Success) {
                lVar2.g0();
                lVar2.Z(paymentMethod);
            }
            c40.j.Failure failureA = c40.k.a(jVar);
            if (failureA != null) {
                return failureA.getCause();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.l$f, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00101\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b&\u00100R\u0017\u00105\u001a\u0002028\u0006¢\u0006\f\n\u0004\b \u00103\u001a\u0004\b.\u00104R\u0017\u00106\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b$\u0010/\u001a\u0004\b\"\u00100R\u0017\u00107\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001c\u0010/\u001a\u0004\b*\u00100¨\u00068"}, d2 = {"Lcom/stripe/android/customersheet/l$f;", "", "", "Lcom/stripe/android/model/v0;", "paymentMethods", "Lw70/j;", "currentSelection", "Lu60/e;", OrcaKeys.METADATA, "La40/b;", "permissions", "Lcom/stripe/android/customersheet/d$c;", "configuration", "<init>", "(Ljava/util/List;Lw70/j;Lu60/e;La40/b;Lcom/stripe/android/customersheet/d$c;)V", "a", "(Ljava/util/List;Lw70/j;Lu60/e;La40/b;Lcom/stripe/android/customersheet/d$c;)Lcom/stripe/android/customersheet/l$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "b", "Lw70/j;", "g", "()Lw70/j;", "c", "Lu60/e;", "h", "()Lu60/e;", DateTokenConverter.CONVERTER_KEY, "La40/b;", "getPermissions", "()La40/b;", "e", "Lcom/stripe/android/customersheet/d$c;", "getConfiguration", "()Lcom/stripe/android/customersheet/d$c;", "f", "Z", "()Z", "canRemove", "Lx80/a;", "Lx80/a;", "()Lx80/a;", "cbcEligibility", "canEdit", "canShowSavedPaymentMethods", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final /* data */ class CustomerState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PaymentMethod> paymentMethods;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.j currentSelection;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentMethodMetadata metadata;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CustomerPermissions permissions;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.customersheet.d.Configuration configuration;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean canRemove;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final x80.a cbcEligibility;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final boolean canEdit;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final boolean canShowSavedPaymentMethods;

        /* JADX WARN: Code duplicated, block: B:11:0x0039  */
        public CustomerState(List<PaymentMethod> paymentMethods, w70.j jVar, PaymentMethodMetadata paymentMethodMetadata, CustomerPermissions permissions, com.stripe.android.customersheet.d.Configuration configuration) {
            boolean canRemovePaymentMethods;
            boolean z11;
            PaymentMethodMetadata paymentMethodMetadata2;
            x80.a cbcEligibility;
            p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
            p013kotlin.jvm.internal.s.k(permissions, "permissions");
            p013kotlin.jvm.internal.s.k(configuration, "configuration");
            this.paymentMethods = paymentMethods;
            this.currentSelection = jVar;
            this.metadata = paymentMethodMetadata;
            this.permissions = permissions;
            this.configuration = configuration;
            int size = paymentMethods.size();
            boolean z12 = false;
            if (size == 0) {
                canRemovePaymentMethods = false;
            } else if (size != 1) {
                canRemovePaymentMethods = permissions.getCanRemovePaymentMethods();
            } else if (configuration.getAllowsRemovalOfLastSavedPaymentMethod() && permissions.getCanRemovePaymentMethods()) {
                canRemovePaymentMethods = true;
            } else {
                canRemovePaymentMethods = false;
            }
            this.canRemove = canRemovePaymentMethods;
            this.cbcEligibility = (paymentMethodMetadata == null || (cbcEligibility = paymentMethodMetadata.getCbcEligibility()) == null) ? x80.a.c.f123091a : cbcEligibility;
            if (canRemovePaymentMethods) {
                z11 = true;
            } else {
                List<PaymentMethod> list = paymentMethods;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (a40.e.a((PaymentMethod) it.next(), this.cbcEligibility)) {
                                z11 = true;
                            }
                        }
                    }
                }
                z11 = false;
            }
            this.canEdit = z11;
            if (!this.paymentMethods.isEmpty() || ((paymentMethodMetadata2 = this.metadata) != null && paymentMethodMetadata2.getIsGooglePayReady())) {
                z12 = true;
            }
            this.canShowSavedPaymentMethods = z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomerState b(CustomerState customerState, List list, w70.j jVar, PaymentMethodMetadata paymentMethodMetadata, CustomerPermissions customerPermissions, com.stripe.android.customersheet.d.Configuration configuration, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = customerState.paymentMethods;
            }
            if ((i11 & 2) != 0) {
                jVar = customerState.currentSelection;
            }
            if ((i11 & 4) != 0) {
                paymentMethodMetadata = customerState.metadata;
            }
            if ((i11 & 8) != 0) {
                customerPermissions = customerState.permissions;
            }
            if ((i11 & 16) != 0) {
                configuration = customerState.configuration;
            }
            com.stripe.android.customersheet.d.Configuration configuration2 = configuration;
            PaymentMethodMetadata paymentMethodMetadata2 = paymentMethodMetadata;
            return customerState.a(list, jVar, paymentMethodMetadata2, customerPermissions, configuration2);
        }

        public final CustomerState a(List<PaymentMethod> paymentMethods, w70.j currentSelection, PaymentMethodMetadata metadata, CustomerPermissions permissions, com.stripe.android.customersheet.d.Configuration configuration) {
            p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
            p013kotlin.jvm.internal.s.k(permissions, "permissions");
            p013kotlin.jvm.internal.s.k(configuration, "configuration");
            return new CustomerState(paymentMethods, currentSelection, metadata, permissions, configuration);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getCanEdit() {
            return this.canEdit;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getCanRemove() {
            return this.canRemove;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getCanShowSavedPaymentMethods() {
            return this.canShowSavedPaymentMethods;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerState)) {
                return false;
            }
            CustomerState customerState = (CustomerState) other;
            return p013kotlin.jvm.internal.s.f(this.paymentMethods, customerState.paymentMethods) && p013kotlin.jvm.internal.s.f(this.currentSelection, customerState.currentSelection) && p013kotlin.jvm.internal.s.f(this.metadata, customerState.metadata) && p013kotlin.jvm.internal.s.f(this.permissions, customerState.permissions) && p013kotlin.jvm.internal.s.f(this.configuration, customerState.configuration);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final x80.a getCbcEligibility() {
            return this.cbcEligibility;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final w70.j getCurrentSelection() {
            return this.currentSelection;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final PaymentMethodMetadata getMetadata() {
            return this.metadata;
        }

        public int hashCode() {
            int iHashCode = this.paymentMethods.hashCode() * 31;
            w70.j jVar = this.currentSelection;
            int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
            PaymentMethodMetadata paymentMethodMetadata = this.metadata;
            return ((((iHashCode2 + (paymentMethodMetadata != null ? paymentMethodMetadata.hashCode() : 0)) * 31) + this.permissions.hashCode()) * 31) + this.configuration.hashCode();
        }

        public final List<PaymentMethod> i() {
            return this.paymentMethods;
        }

        public String toString() {
            return "CustomerState(paymentMethods=" + this.paymentMethods + ", currentSelection=" + this.currentSelection + ", metadata=" + this.metadata + ", permissions=" + this.permissions + ", configuration=" + this.configuration + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/model/v0;", "method", "Lcom/stripe/android/model/h;", "brand", "Ljn0/s;", "<anonymous>", "(Lcom/stripe/android/model/v0;Lcom/stripe/android/model/h;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$onModifyItem$3", f = "CustomerSheetViewModel.kt", i = {}, l = {600}, m = "invokeSuspend", n = {}, s = {})
    static final class f0 extends SuspendLambda implements wn0.q<PaymentMethod, com.stripe.android.model.h, Continuation<? super jn0.s<? extends PaymentMethod>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49876n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f49877o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f49878p;

        f0(Continuation<? super f0> continuation) {
            super(3, continuation);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PaymentMethod paymentMethod, com.stripe.android.model.h hVar, Continuation<? super jn0.s<PaymentMethod>> continuation) {
            f0 f0Var = l.this.new f0(continuation);
            f0Var.f49877o = paymentMethod;
            f0Var.f49878p = hVar;
            return f0Var.invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f49876n;
            if (i11 == 0) {
                jn0.t.b(obj);
                PaymentMethod paymentMethod = (PaymentMethod) this.f49877o;
                com.stripe.android.model.h hVar = (com.stripe.android.model.h) this.f49878p;
                l lVar = l.this;
                this.f49877o = null;
                this.f49876n = 1;
                obj = lVar.d0(paymentMethod, hVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            c40.j jVar = (c40.j) obj;
            if (jVar instanceof c40.j.Success) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(((c40.j.Success) jVar).b());
            } else {
                if (!(jVar instanceof c40.j.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(((c40.j.Failure) jVar).getCause()));
            }
            return jn0.s.a(objB);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/customersheet/l$g;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/customersheet/CustomerSheetContract$a;", "args", "<init>", "(Lcom/stripe/android/customersheet/CustomerSheetContract$a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Lcom/stripe/android/customersheet/CustomerSheetContract$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final CustomerSheetContract.Args args;

        public g(CustomerSheetContract.Args args) {
            p013kotlin.jvm.internal.s.k(args, "args");
            this.args = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
            p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
            p013kotlin.jvm.internal.s.k(extras, "extras");
            l lVarA = e40.e0.a().a(z30.b.a(extras)).c(this.args.getConfiguration()).e(this.args.getIntegrationType()).d(this.args.getStatusBarColor()).b(v0.a(extras)).build().a();
            p013kotlin.jvm.internal.s.i(lVarA, "null cannot be cast to non-null type T of com.stripe.android.customersheet.CustomerSheetViewModel.Factory.create");
            return lVarA;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/customersheet/l$h;", "state", "a", "(Lcom/stripe/android/customersheet/l$h;)Lcom/stripe/android/customersheet/l$h;"}, k = 3, mv = {1, 9, 0})
    static final class g0 extends p013kotlin.jvm.internal.u implements wn0.l<SelectionConfirmationState, SelectionConfirmationState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g0 f49881c = new g0();

        g0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelectionConfirmationState invoke(SelectionConfirmationState state) {
            p013kotlin.jvm.internal.s.k(state, "state");
            return SelectionConfirmationState.b(state, true, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.l$h, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/customersheet/l$h;", "", "", "isConfirming", "", AnalyticsAttribute.Error, "<init>", "(ZLjava/lang/String;)V", "a", "(ZLjava/lang/String;)Lcom/stripe/android/customersheet/l$h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "Ljava/lang/String;", "c", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final /* data */ class SelectionConfirmationState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isConfirming;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String error;

        public SelectionConfirmationState(boolean z11, String str) {
            this.isConfirming = z11;
            this.error = str;
        }

        public static /* synthetic */ SelectionConfirmationState b(SelectionConfirmationState selectionConfirmationState, boolean z11, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = selectionConfirmationState.isConfirming;
            }
            if ((i11 & 2) != 0) {
                str = selectionConfirmationState.error;
            }
            return selectionConfirmationState.a(z11, str);
        }

        public final SelectionConfirmationState a(boolean isConfirming, String error) {
            return new SelectionConfirmationState(isConfirming, error);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsConfirming() {
            return this.isConfirming;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionConfirmationState)) {
                return false;
            }
            SelectionConfirmationState selectionConfirmationState = (SelectionConfirmationState) other;
            return this.isConfirming == selectionConfirmationState.isConfirming && p013kotlin.jvm.internal.s.f(this.error, selectionConfirmationState.error);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isConfirming) * 31;
            String str = this.error;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SelectionConfirmationState(isConfirming=" + this.isConfirming + ", error=" + this.error + ")";
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0, 0, 1, 1}, l = {1076, 1076}, m = "refreshAndUpdatePaymentMethods", n = {"this", "newPaymentMethod", "this", "newPaymentMethod"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class h0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f49884n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f49885o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f49886p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f49888r;

        h0(Continuation<? super h0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49886p = obj;
            this.f49888r |= Integer.MIN_VALUE;
            return l.this.u0(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {1049, 1049, 1054}, m = "attachPaymentMethod", n = {"this", "id", "this", "id", "this", "id", "$this$onSuccess$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f49889n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f49890o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f49891p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f49892q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f49894s;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49892q = obj;
            this.f49894s |= Integer.MIN_VALUE;
            return l.this.J(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/customersheet/l$f;", "state", "a", "(Lcom/stripe/android/customersheet/l$f;)Lcom/stripe/android/customersheet/l$f;"}, k = 3, mv = {1, 9, 0})
    static final class i0 extends p013kotlin.jvm.internal.u implements wn0.l<CustomerState, CustomerState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<PaymentMethod> f49895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PaymentMethod f49896d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(List<PaymentMethod> list, PaymentMethod paymentMethod) {
            super(1);
            this.f49895c = list;
            this.f49896d = paymentMethod;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CustomerState invoke(CustomerState state) {
            Object next;
            p013kotlin.jvm.internal.s.k(state, "state");
            List<PaymentMethod> list = this.f49895c;
            PaymentMethod paymentMethod = this.f49896d;
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p013kotlin.jvm.internal.s.f(paymentMethod.id, ((PaymentMethod) next).id));
            PaymentMethod paymentMethod2 = (PaymentMethod) next;
            w70.j saved = paymentMethod2 != null ? new w70.j.Saved(paymentMethod2, null, null, 6, null) : state.getCurrentSelection();
            return CustomerState.b(state, g40.d.b(this.f49895c, saved instanceof w70.j.Saved ? (w70.j.Saved) saved : null), saved, null, null, null, 28, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$attachPaymentMethodToCustomer$1", f = "CustomerSheetViewModel.kt", i = {}, l = {949, 950, 952}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49897n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ PaymentMethod f49899p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(PaymentMethod paymentMethod, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f49899p = paymentMethod;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new j(this.f49899p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        
            if (r6.L(r1, r5) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        
            if (r6.J(r1, r5) == r0) goto L22;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f49897n
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                jn0.t.b(r6)
                goto L57
            L1e:
                jn0.t.b(r6)
                goto L30
            L22:
                jn0.t.b(r6)
                com.stripe.android.customersheet.l r6 = com.stripe.android.customersheet.l.this
                r5.f49897n = r4
                java.lang.Object r6 = com.stripe.android.customersheet.l.g(r6, r5)
                if (r6 != r0) goto L30
                goto L56
            L30:
                c40.m r6 = (c40.m) r6
                boolean r6 = r6.getCanCreateSetupIntents()
                if (r6 == 0) goto L45
                com.stripe.android.customersheet.l r6 = com.stripe.android.customersheet.l.this
                com.stripe.android.model.v0 r1 = r5.f49899p
                r5.f49897n = r3
                java.lang.Object r6 = com.stripe.android.customersheet.l.f(r6, r1, r5)
                if (r6 != r0) goto L57
                goto L56
            L45:
                com.stripe.android.customersheet.l r6 = com.stripe.android.customersheet.l.this
                com.stripe.android.model.v0 r1 = r5.f49899p
                java.lang.String r1 = r1.id
                p013kotlin.jvm.internal.s.h(r1)
                r5.f49897n = r2
                java.lang.Object r6 = com.stripe.android.customersheet.l.a(r6, r1, r5)
                if (r6 != r0) goto L57
            L56:
                return r0
            L57:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.l.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0, 0, 1, 1}, l = {511, 511}, m = "removePaymentMethod", n = {"this", "paymentMethod", "this", "paymentMethod"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class j0 extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f49900n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f49901o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f49902p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f49904r;

        j0(Continuation<? super j0> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49902p = obj;
            this.f49904r |= Integer.MIN_VALUE;
            return l.this.w0(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3}, l = {958, 958, 960, 968}, m = "attachWithSetupIntent", n = {"this", "paymentMethod", "this", "paymentMethod", "this", "paymentMethod", "clientSecret", "this", "paymentMethod"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1"})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f49905n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f49906o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f49907p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f49908q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f49909r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f49911t;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49909r = obj;
            this.f49911t |= Integer.MIN_VALUE;
            return l.this.L(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$selectGooglePay$1", f = "CustomerSheetViewModel.kt", i = {}, l = {1130, 1130}, m = "invokeSuspend", n = {}, s = {})
    static final class k0 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49912n;

        k0(Continuation<? super k0> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new k0(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f49912n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L39
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                jn0.t.b(r6)
                goto L2c
            L1e:
                jn0.t.b(r6)
                com.stripe.android.customersheet.l r6 = com.stripe.android.customersheet.l.this
                r5.f49912n = r3
                java.lang.Object r6 = com.stripe.android.customersheet.l.h(r6, r5)
                if (r6 != r0) goto L2c
                goto L38
            L2c:
                c40.o r6 = (c40.o) r6
                w70.m$a r1 = w70.m.a.f121198a
                r5.f49912n = r2
                java.lang.Object r6 = r6.g(r1, r5)
                if (r6 != r0) goto L39
            L38:
                return r0
            L39:
                c40.j r6 = (c40.j) r6
                com.stripe.android.customersheet.l r0 = com.stripe.android.customersheet.l.this
                boolean r1 = r6 instanceof c40.j.Success
                java.lang.String r2 = "google_pay"
                if (r1 == 0) goto L51
                r1 = r6
                c40.j$d r1 = (c40.j.Success) r1
                java.lang.Object r1 = r1.b()
                jn0.h0 r1 = (jn0.h0) r1
                w70.j$c r1 = w70.j.c.f121146b
                com.stripe.android.customersheet.l.i(r0, r1, r2)
            L51:
                com.stripe.android.customersheet.l r0 = com.stripe.android.customersheet.l.this
                c40.j$c r6 = c40.k.a(r6)
                if (r6 == 0) goto L83
                java.lang.String r1 = r6.getDisplayMessage()
                if (r1 != 0) goto L7a
                java.lang.Throwable r1 = r6.getCause()
                boolean r3 = r1 instanceof com.stripe.android.core.exception.StripeException
                r4 = 0
                if (r3 == 0) goto L6b
                com.stripe.android.core.exception.StripeException r1 = (com.stripe.android.core.exception.StripeException) r1
                goto L6c
            L6b:
                r1 = r4
            L6c:
                if (r1 == 0) goto L79
                o30.f r1 = r1.getStripeError()
                if (r1 == 0) goto L79
                java.lang.String r1 = r1.getMessage()
                goto L7a
            L79:
                r1 = r4
            L7a:
                java.lang.Throwable r6 = r6.getCause()
                w70.j$c r3 = w70.j.c.f121146b
                com.stripe.android.customersheet.l.j(r0, r3, r2, r6, r1)
            L83:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.l.k0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((k0) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.l$l, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/customersheet/l$h;", "state", "a", "(Lcom/stripe/android/customersheet/l$h;)Lcom/stripe/android/customersheet/l$h;"}, k = 3, mv = {1, 9, 0})
    static final class C0809l extends p013kotlin.jvm.internal.u implements wn0.l<SelectionConfirmationState, SelectionConfirmationState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f49914c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0809l(String str) {
            super(1);
            this.f49914c = str;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelectionConfirmationState invoke(SelectionConfirmationState state) {
            p013kotlin.jvm.internal.s.k(state, "state");
            return state.a(false, this.f49914c);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/stripe/android/customersheet/l$f;", "customerState", "Lcom/stripe/android/customersheet/l$h;", "selectionConfirmationState", "", "editing", "Lcom/stripe/android/customersheet/n$d;", "a", "(Lcom/stripe/android/customersheet/l$f;Lcom/stripe/android/customersheet/l$h;Z)Lcom/stripe/android/customersheet/n$d;"}, k = 3, mv = {1, 9, 0})
    static final class l0 extends p013kotlin.jvm.internal.u implements wn0.q<CustomerState, SelectionConfirmationState, Boolean, com.stripe.android.customersheet.n.SelectPaymentMethod> {
        l0() {
            super(3);
        }

        public final com.stripe.android.customersheet.n.SelectPaymentMethod a(CustomerState customerState, SelectionConfirmationState selectionConfirmationState, boolean z11) {
            x30.c cVarC;
            p013kotlin.jvm.internal.s.k(customerState, "customerState");
            p013kotlin.jvm.internal.s.k(selectionConfirmationState, "selectionConfirmationState");
            List<PaymentMethod> listI = customerState.i();
            PaymentMethodMetadata metadata = customerState.getMetadata();
            w70.j currentSelection = customerState.getCurrentSelection();
            boolean z12 = z11 && customerState.getCanEdit();
            boolean z13 = (z12 || p013kotlin.jvm.internal.s.f(l.this.originalPaymentSelection, currentSelection)) ? false : true;
            String headerTextForSelectionScreen = l.this.configuration.getHeaderTextForSelectionScreen();
            boolean zBooleanValue = ((Boolean) l.this.isLiveModeProvider.invoke()).booleanValue();
            boolean canRemove = customerState.getCanRemove();
            boolean z14 = metadata != null && metadata.getIsGooglePayReady();
            return new com.stripe.android.customersheet.n.SelectPaymentMethod(headerTextForSelectionScreen, listI, currentSelection, zBooleanValue, selectionConfirmationState.getIsConfirming(), z12, z14, z13, customerState.getCanEdit(), canRemove, selectionConfirmationState.getError(), (currentSelection == null || (cVarC = currentSelection.c(l.this.configuration.getMerchantDisplayName(), false)) == null || !z13) ? null : cVarC, customerState.getCbcEligibility() instanceof x80.a.Eligible);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ com.stripe.android.customersheet.n.SelectPaymentMethod invoke(CustomerState customerState, SelectionConfirmationState selectionConfirmationState, Boolean bool) {
            return a(customerState, selectionConfirmationState, bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$createAndAttach$1", f = "CustomerSheetViewModel.kt", i = {}, l = {746}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49916n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ PaymentMethodCreateParams f49918p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f49918p = paymentMethodCreateParams;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new m(this.f49918p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            ArrayList arrayList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f49916n;
            if (i11 == 0) {
                jn0.t.b(obj);
                l lVar = l.this;
                PaymentMethodCreateParams paymentMethodCreateParams = this.f49918p;
                this.f49916n = 1;
                Object objU = lVar.U(paymentMethodCreateParams, this);
                if (objU == coroutine_suspended) {
                    return coroutine_suspended;
                }
                value = objU;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                value = ((jn0.s) obj).getValue();
            }
            l lVar2 = l.this;
            if (jn0.s.h(value)) {
                PaymentMethod paymentMethod = (PaymentMethod) value;
                if (g40.e.a(paymentMethod)) {
                    lVar2._result.tryEmit(new com.stripe.android.customersheet.p.Selected(new w70.j.Saved(paymentMethod, null, null, 6, null)));
                } else {
                    lVar2.K(paymentMethod);
                }
            }
            l lVar3 = l.this;
            PaymentMethodCreateParams paymentMethodCreateParams2 = this.f49918p;
            Throwable thE = jn0.s.e(value);
            if (thE != null) {
                lVar3.logger.error("Failed to create payment method for " + paymentMethodCreateParams2.i(), thE);
                MutableStateFlow mutableStateFlow = lVar3.backStack;
                do {
                    value2 = mutableStateFlow.getValue();
                    List<Object> list = (List) value2;
                    arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
                    for (Object objF : list) {
                        if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                            com.stripe.android.customersheet.n.AddPaymentMethod addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                            objF = com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, null, null, null, null, null, false, false, false, l30.a.b(thE), false, null, addPaymentMethod.getFormFieldValues() != null, null, null, false, false, null, null, 1038847, null);
                        }
                        arrayList.add(objF);
                    }
                } while (!mutableStateFlow.compareAndSet(value2, arrayList));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$selectSavedPaymentMethod$1", f = "CustomerSheetViewModel.kt", i = {}, l = {1110, 1110}, m = "invokeSuspend", n = {}, s = {})
    static final class m0 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49919n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ w70.j.Saved f49921p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(w70.j.Saved saved, Continuation<? super m0> continuation) {
            super(2, continuation);
            this.f49921p = saved;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new m0(this.f49921p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        
            if (r6 == r0) goto L19;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f49919n
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                jn0.t.b(r6)
                goto L42
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                jn0.t.b(r6)
                goto L2d
            L1f:
                jn0.t.b(r6)
                com.stripe.android.customersheet.l r6 = com.stripe.android.customersheet.l.this
                r5.f49919n = r3
                java.lang.Object r6 = com.stripe.android.customersheet.l.h(r6, r5)
                if (r6 != r0) goto L2d
                goto L41
            L2d:
                c40.o r6 = (c40.o) r6
                w70.j$f r1 = r5.f49921p
                if (r1 == 0) goto L38
                w70.m r1 = w70.n.a(r1)
                goto L39
            L38:
                r1 = r4
            L39:
                r5.f49919n = r2
                java.lang.Object r6 = r6.g(r1, r5)
                if (r6 != r0) goto L42
            L41:
                return r0
            L42:
                c40.j r6 = (c40.j) r6
                com.stripe.android.customersheet.l r0 = com.stripe.android.customersheet.l.this
                w70.j$f r1 = r5.f49921p
                boolean r2 = r6 instanceof c40.j.Success
                if (r2 == 0) goto L68
                r2 = r6
                c40.j$d r2 = (c40.j.Success) r2
                java.lang.Object r2 = r2.b()
                jn0.h0 r2 = (jn0.h0) r2
                if (r1 == 0) goto L64
                com.stripe.android.model.v0 r2 = r1.getPaymentMethod()
                if (r2 == 0) goto L64
                com.stripe.android.model.v0$p r2 = r2.type
                if (r2 == 0) goto L64
                java.lang.String r2 = r2.code
                goto L65
            L64:
                r2 = r4
            L65:
                com.stripe.android.customersheet.l.i(r0, r1, r2)
            L68:
                com.stripe.android.customersheet.l r0 = com.stripe.android.customersheet.l.this
                w70.j$f r1 = r5.f49921p
                c40.j$c r6 = c40.k.a(r6)
                if (r6 == 0) goto La7
                java.lang.String r2 = r6.getDisplayMessage()
                if (r2 != 0) goto L92
                java.lang.Throwable r2 = r6.getCause()
                boolean r3 = r2 instanceof com.stripe.android.core.exception.StripeException
                if (r3 == 0) goto L83
                com.stripe.android.core.exception.StripeException r2 = (com.stripe.android.core.exception.StripeException) r2
                goto L84
            L83:
                r2 = r4
            L84:
                if (r2 == 0) goto L91
                o30.f r2 = r2.getStripeError()
                if (r2 == 0) goto L91
                java.lang.String r2 = r2.getMessage()
                goto L92
            L91:
                r2 = r4
            L92:
                java.lang.Throwable r6 = r6.getCause()
                if (r1 == 0) goto La4
                com.stripe.android.model.v0 r3 = r1.getPaymentMethod()
                if (r3 == 0) goto La4
                com.stripe.android.model.v0$p r3 = r3.type
                if (r3 == 0) goto La4
                java.lang.String r4 = r3.code
            La4:
                com.stripe.android.customersheet.l.j(r0, r1, r4, r6, r2)
            La7:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.l.m0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((m0) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx30/c;", "mandate", "", "showAbove", "Ljn0/h0;", "a", "(Lx30/c;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.p<x30.c, Boolean, jn0.h0> {
        n() {
            super(2);
        }

        public final void a(x30.c cVar, boolean z11) {
            l.this.b0(new com.stripe.android.customersheet.k.q(cVar, z11));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(x30.c cVar, Boolean bool) {
            a(cVar, bool.booleanValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm60/e;", "it", "Ljn0/h0;", "a", "(Lm60/e;)V"}, k = 3, mv = {1, 9, 0})
    static final class n0 extends p013kotlin.jvm.internal.u implements wn0.l<InlineSignupViewState, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n0 f49923c = new n0();

        n0() {
            super(1);
        }

        public final void a(InlineSignupViewState it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            throw new IllegalStateException("`CustomerSheet` does not implement `Link` and should not receive `InlineSignUpViewState` updates");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(InlineSignupViewState inlineSignupViewState) {
            a(inlineSignupViewState);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw70/j$e$d;", "it", "Ljn0/h0;", "a", "(Lw70/j$e$d;)V"}, k = 3, mv = {1, 9, 0})
    static final class o extends p013kotlin.jvm.internal.u implements wn0.l<w70.j.e.USBankAccount, jn0.h0> {
        o() {
            super(1);
        }

        public final void a(w70.j.e.USBankAccount it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            l.this.b0(new com.stripe.android.customersheet.k.g(it));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w70.j.e.USBankAccount uSBankAccount) {
            a(uSBankAccount);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$updatePaymentMethodInState$1", f = "CustomerSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class o0 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49925n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ PaymentMethod f49927p;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/customersheet/l$f;", "state", "a", "(Lcom/stripe/android/customersheet/l$f;)Lcom/stripe/android/customersheet/l$f;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<CustomerState, CustomerState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<PaymentMethod> f49928c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ w70.j f49929d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<PaymentMethod> list, w70.j jVar) {
                super(1);
                this.f49928c = list;
                this.f49929d = jVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CustomerState invoke(CustomerState state) {
                p013kotlin.jvm.internal.s.k(state, "state");
                return CustomerState.b(state, this.f49928c, this.f49929d, null, null, null, 28, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(PaymentMethod paymentMethod, Continuation<? super o0> continuation) {
            super(2, continuation);
            this.f49927p = paymentMethod;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new o0(this.f49927p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f49925n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            CustomerState customerState = (CustomerState) l.this.customerState.getValue();
            List<PaymentMethod> listI = customerState.i();
            PaymentMethod paymentMethod = this.f49927p;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listI, 10));
            for (PaymentMethod paymentMethod2 : listI) {
                String str = paymentMethod2.id;
                String str2 = paymentMethod.id;
                if (str2 != null && str != null && p013kotlin.jvm.internal.s.f(str2, str)) {
                    paymentMethod2 = paymentMethod;
                }
                arrayList.add(paymentMethod2);
            }
            w70.j jVarF = l.this.originalPaymentSelection;
            w70.j currentSelection = customerState.getCurrentSelection();
            l lVar = l.this;
            if (jVarF instanceof w70.j.Saved) {
                w70.j.Saved saved = (w70.j.Saved) jVarF;
                if (p013kotlin.jvm.internal.s.f(saved.getPaymentMethod().id, this.f49927p.id)) {
                    jVarF = w70.j.Saved.f(saved, this.f49927p, null, null, 6, null);
                }
            }
            lVar.originalPaymentSelection = jVarF;
            if (currentSelection instanceof w70.j.Saved) {
                w70.j.Saved saved2 = (w70.j.Saved) currentSelection;
                if (p013kotlin.jvm.internal.s.f(saved2.getPaymentMethod().id, this.f49927p.id)) {
                    currentSelection = w70.j.Saved.f(saved2, this.f49927p, null, null, 6, null);
                }
            }
            l.this.A0(new a(arrayList, currentSelection));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((o0) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/e;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/payments/bankaccount/navigation/e;)V"}, k = 3, mv = {1, 9, 0})
    static final class p extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.payments.bankaccount.navigation.e, jn0.h0> {
        p() {
            super(1);
        }

        public final void a(com.stripe.android.payments.bankaccount.navigation.e it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            l.this.b0(new com.stripe.android.customersheet.k.f(it));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(com.stripe.android.payments.bankaccount.navigation.e eVar) {
            a(eVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/stripe/android/customersheet/n;", "it", "a", "(Ljava/util/List;)Lcom/stripe/android/customersheet/n;"}, k = 3, mv = {1, 9, 0})
    static final class p0 extends p013kotlin.jvm.internal.u implements wn0.l<List<? extends com.stripe.android.customersheet.n>, com.stripe.android.customersheet.n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p0 f49931c = new p0();

        p0() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.customersheet.n invoke(List<? extends com.stripe.android.customersheet.n> it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return (com.stripe.android.customersheet.n) p013kotlin.collections.v.A0(it);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$b;", "it", "Ljn0/h0;", "a", "(Lwn0/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class q extends p013kotlin.jvm.internal.u implements wn0.l<wn0.l<? super PrimaryButton.UIState, ? extends PrimaryButton.UIState>, jn0.h0> {
        q() {
            super(1);
        }

        public final void a(wn0.l<? super PrimaryButton.UIState, PrimaryButton.UIState> it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            l.this.b0(new com.stripe.android.customersheet.k.p(it));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(wn0.l<? super PrimaryButton.UIState, ? extends PrimaryButton.UIState> lVar) {
            a(lVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.l<PrimaryButton.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f49933c = new r();

        r() {
            super(1);
        }

        public final void a(PrimaryButton.a it) {
            p013kotlin.jvm.internal.s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(PrimaryButton.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx30/c;", AnalyticsAttribute.Error, "Ljn0/h0;", "a", "(Lx30/c;)V"}, k = 3, mv = {1, 9, 0})
    static final class s extends p013kotlin.jvm.internal.u implements wn0.l<x30.c, jn0.h0> {
        s() {
            super(1);
        }

        public final void a(x30.c cVar) {
            l.this.b0(new com.stripe.android.customersheet.k.j(cVar));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(x30.c cVar) {
            a(cVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {}, l = {938}, m = "createPaymentMethod-gIAlu-s", n = {}, s = {})
    static final class t extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f49935n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f49937p;

        t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49935n = obj;
            this.f49937p |= Integer.MIN_VALUE;
            Object objU = l.this.U(null, this);
            return objU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objU : jn0.s.a(objU);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/stripe/android/customersheet/l$h;", "state", "a", "(Lcom/stripe/android/customersheet/l$h;)Lcom/stripe/android/customersheet/l$h;"}, k = 3, mv = {1, 9, 0})
    static final class u extends p013kotlin.jvm.internal.u implements wn0.l<SelectionConfirmationState, SelectionConfirmationState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f49938c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str) {
            super(1);
            this.f49938c = str;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelectionConfirmationState invoke(SelectionConfirmationState state) {
            p013kotlin.jvm.internal.s.k(state, "state");
            return state.a(false, this.f49938c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$handlePaymentMethodRemovedFromEditScreen$1", f = "CustomerSheetViewModel.kt", i = {}, l = {553}, m = "invokeSuspend", n = {}, s = {})
    static final class v extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49939n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ PaymentMethod f49941p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(PaymentMethod paymentMethod, Continuation<? super v> continuation) {
            super(2, continuation);
            this.f49941p = paymentMethod;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new v(this.f49941p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f49939n;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f49939n = 1;
                if (DelayKt.delay(600L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            l.this.x0(this.f49941p);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0, 0}, l = {1009, 1015}, m = "handleStripeIntent", n = {"this", "paymentMethod"}, s = {"L$0", "L$1"})
    static final class w extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f49942n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f49943o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f49944p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f49946r;

        w(Continuation<? super w> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49944p = obj;
            this.f49946r |= Integer.MIN_VALUE;
            return l.this.a0(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0}, l = {336}, m = "loadCustomerSheetState", n = {"this"}, s = {"L$0"})
    static final class x extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f49947n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f49948o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f49950q;

        x(Continuation<? super x> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49948o = obj;
            this.f49950q |= Integer.MIN_VALUE;
            return l.this.c0(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lcom/stripe/android/customersheet/j;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$loadCustomerSheetState$result$1", f = "CustomerSheetViewModel.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
    static final class y extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.s<? extends Full>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49951n;

        y(Continuation<? super y> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new y(continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.s<? extends Full>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super jn0.s<Full>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f49951n;
            if (i11 == 0) {
                jn0.t.b(obj);
                h hVar = l.this.customerSheetLoader;
                com.stripe.android.customersheet.d.Configuration configuration = l.this.configuration;
                this.f49951n = 1;
                objA = hVar.a(configuration, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objA = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objA);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super jn0.s<Full>> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0, 0, 0, 1, 1}, l = {528, 528}, m = "modifyCardPaymentMethod", n = {"this", "paymentMethod", "brand", "this", "brand"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class z extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f49953n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f49954o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f49955p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f49956q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f49958s;

        z(Continuation<? super z> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49956q = obj;
            this.f49958s |= Integer.MIN_VALUE;
            return l.this.d0(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(Application application, w70.j jVar, Provider<PaymentConfiguration> paymentConfigurationProvider, Deferred<? extends c40.n> paymentMethodDataSourceProvider, Deferred<? extends c40.m> intentDataSourceProvider, Deferred<? extends c40.o> savedSelectionDataSourceProvider, com.stripe.android.customersheet.d.Configuration configuration, com.stripe.android.customersheet.g.c integrationType, o30.d logger, z60.g stripeRepository, b40.b eventReporter, CoroutineContext workContext, wn0.a<Boolean> isLiveModeProvider, com.stripe.android.paymentsheet.h.d intentConfirmationHandlerFactory, h customerSheetLoader, l70.d isFinancialConnectionsAvailable, h80.t.a editInteractorFactory, h70.h errorReporter) {
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(paymentConfigurationProvider, "paymentConfigurationProvider");
        p013kotlin.jvm.internal.s.k(paymentMethodDataSourceProvider, "paymentMethodDataSourceProvider");
        p013kotlin.jvm.internal.s.k(intentDataSourceProvider, "intentDataSourceProvider");
        p013kotlin.jvm.internal.s.k(savedSelectionDataSourceProvider, "savedSelectionDataSourceProvider");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(integrationType, "integrationType");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        p013kotlin.jvm.internal.s.k(eventReporter, "eventReporter");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(isLiveModeProvider, "isLiveModeProvider");
        p013kotlin.jvm.internal.s.k(intentConfirmationHandlerFactory, "intentConfirmationHandlerFactory");
        p013kotlin.jvm.internal.s.k(customerSheetLoader, "customerSheetLoader");
        p013kotlin.jvm.internal.s.k(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        p013kotlin.jvm.internal.s.k(editInteractorFactory, "editInteractorFactory");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        this.originalPaymentSelection = jVar;
        this.paymentConfigurationProvider = paymentConfigurationProvider;
        this.paymentMethodDataSourceProvider = paymentMethodDataSourceProvider;
        this.intentDataSourceProvider = intentDataSourceProvider;
        this.savedSelectionDataSourceProvider = savedSelectionDataSourceProvider;
        this.configuration = configuration;
        this.integrationType = integrationType;
        this.logger = logger;
        this.stripeRepository = stripeRepository;
        this.eventReporter = eventReporter;
        this.workContext = workContext;
        this.isLiveModeProvider = isLiveModeProvider;
        this.customerSheetLoader = customerSheetLoader;
        this.isFinancialConnectionsAvailable = isFinancialConnectionsAvailable;
        this.editInteractorFactory = editInteractorFactory;
        this.errorReporter = errorReporter;
        this.cardAccountRangeRepositoryFactory = new h30.j(application);
        MutableStateFlow<List<com.stripe.android.customersheet.n>> MutableStateFlow = StateFlowKt.MutableStateFlow(p013kotlin.collections.v.e(new com.stripe.android.customersheet.n.Loading(isLiveModeProvider.invoke().booleanValue())));
        this.backStack = MutableStateFlow;
        StateFlow<com.stripe.android.customersheet.n> stateFlowM = r90.g.m(MutableStateFlow, p0.f49931c);
        this.viewState = stateFlowM;
        MutableStateFlow<com.stripe.android.customersheet.p> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._result = MutableStateFlow2;
        this.result = MutableStateFlow2;
        this.intentConfirmationHandler = intentConfirmationHandlerFactory.d(CoroutineScopeKt.plus(d1.a(this), workContext));
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.isEditing = MutableStateFlow3;
        MutableStateFlow<SelectionConfirmationState> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new SelectionConfirmationState(false, null));
        this.selectionConfirmationState = MutableStateFlow4;
        MutableStateFlow<CustomerState> MutableStateFlow5 = StateFlowKt.MutableStateFlow(new CustomerState(p013kotlin.collections.v.m(), this.originalPaymentSelection, null, new CustomerPermissions(false), configuration));
        this.customerState = MutableStateFlow5;
        this.selectPaymentMethodState = r90.g.g(MutableStateFlow5, MutableStateFlow4, MutableStateFlow3, new l0());
        this.supportedPaymentMethods = new ArrayList();
        com.stripe.android.paymentsheet.z.b(configuration.getAppearance());
        eventReporter.q(configuration, integrationType);
        if (stateFlowM.getValue() instanceof com.stripe.android.customersheet.n.Loading) {
            BuildersKt__Builders_commonKt.launch$default(d1.a(this), workContext, null, new a(null), 2, null);
        }
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new b(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new c(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new d(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(wn0.l<? super CustomerState, CustomerState> update) {
        MutableStateFlow<CustomerState> mutableStateFlow = this.customerState;
        mutableStateFlow.setValue(update.invoke(mutableStateFlow.getValue()));
    }

    private final void B0(wn0.l<? super SelectionConfirmationState, SelectionConfirmationState> update) {
        MutableStateFlow<SelectionConfirmationState> mutableStateFlow = this.selectionConfirmationState;
        mutableStateFlow.setValue(update.invoke(mutableStateFlow.getValue()));
    }

    private final void C0(com.stripe.android.customersheet.n to2, boolean reset) {
        List<com.stripe.android.customersheet.n> value;
        if (to2 instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
            this.eventReporter.i(b40.b.c.AddPaymentMethod);
        } else if (to2 instanceof com.stripe.android.customersheet.n.SelectPaymentMethod) {
            this.eventReporter.i(b40.b.c.SelectPaymentMethod);
        } else if (to2 instanceof com.stripe.android.customersheet.n.EditPaymentMethod) {
            this.eventReporter.i(b40.b.c.EditPaymentMethod);
        }
        MutableStateFlow<List<com.stripe.android.customersheet.n>> mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, reset ? p013kotlin.collections.v.e(to2) : p013kotlin.collections.v.Q0(value, to2)));
    }

    static /* synthetic */ void D0(l lVar, com.stripe.android.customersheet.n nVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        lVar.C0(nVar, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(boolean isFirstPaymentMethod) {
        String code;
        PaymentMethodMetadata metadata = this.customerState.getValue().getMetadata();
        if (metadata == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        SupportedPaymentMethod supportedPaymentMethod = this.previouslySelectedPaymentMethod;
        if ((supportedPaymentMethod == null || (code = supportedPaymentMethod.getCode()) == null) && (code = (String) p013kotlin.collections.v.q0(metadata.K())) == null) {
            code = PaymentMethod.p.Card.code;
        }
        String str = code;
        FormArguments formArgumentsA = u70.b.f115807a.a(str, metadata);
        SupportedPaymentMethod supportedPaymentMethodG = this.previouslySelectedPaymentMethod;
        if (supportedPaymentMethodG == null && (supportedPaymentMethodG = metadata.G(str)) == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        StripeIntent stripeIntent = metadata.getStripeIntent();
        List<p010i90.d0> listD = metadata.d(supportedPaymentMethodG.getCode(), new u60.k.a.InterfaceC2488a.C2489a(this.cardAccountRangeRepositoryFactory, null, n0.f49923c, null, null, 24, null));
        if (listD == null) {
            listD = p013kotlin.collections.v.m();
        }
        C0(new com.stripe.android.customersheet.n.AddPaymentMethod(str, this.supportedPaymentMethods, null, listD, formArgumentsA, T(stripeIntent), null, true, this.isLiveModeProvider.invoke().booleanValue(), false, null, isFirstPaymentMethod, x30.d.a(n70.x.f93511e0), false, null, null, false, false, null, this.errorReporter, 230400, null), isFirstPaymentMethod);
    }

    private final void F0() {
        if (this.customerState.getValue().getCanShowSavedPaymentMethods()) {
            C0(this.selectPaymentMethodState.getValue(), true);
        } else {
            E0(true);
        }
    }

    private final void G0(wn0.l<? super PrimaryButton.UIState, PrimaryButton.UIState> callback) {
        Object value;
        ArrayList arrayList;
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            for (Object objF : list) {
                if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                    com.stripe.android.customersheet.n.AddPaymentMethod addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                    PrimaryButton.UIState uIStateInvoke = callback.invoke(addPaymentMethod.getCustomPrimaryButtonUiState());
                    objF = uIStateInvoke != null ? com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, null, null, null, null, null, false, false, false, null, false, null, uIStateInvoke.getEnabled(), uIStateInvoke, null, false, false, null, null, 1023999, null) : com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, null, null, null, null, null, false, false, false, null, false, null, (addPaymentMethod.getFormFieldValues() == null || addPaymentMethod.getIsProcessing()) ? false : true, null, null, false, false, null, null, 1023999, null);
                }
                arrayList.add(objF);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }

    private final void H0(x30.c mandateText, boolean showAbove) {
        Object value;
        ArrayList arrayList;
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            for (Object objF : list) {
                if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                    objF = com.stripe.android.customersheet.n.AddPaymentMethod.f((com.stripe.android.customersheet.n.AddPaymentMethod) objF, null, null, null, null, null, null, null, false, false, false, null, false, null, false, null, mandateText, showAbove, false, null, null, 950271, null);
                }
                arrayList.add(objF);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }

    private final void I0(PaymentMethod updatedMethod) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new o0(updatedMethod, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:50:0x0123  */
    /* JADX WARN: Code duplicated, block: B:52:0x012d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x0144  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object J(String str, Continuation<? super jn0.h0> continuation) {
        i iVar;
        String str2;
        Object objN;
        l lVar;
        String str3;
        l lVar2;
        c40.j jVar;
        PaymentMethod paymentMethod;
        c40.j jVar2;
        l lVar3;
        c40.j.Failure failureA;
        String displayMessage;
        MutableStateFlow mutableStateFlow;
        Object value;
        ArrayList arrayList;
        com.stripe.android.customersheet.n.AddPaymentMethod addPaymentMethod;
        x30.c cVarB;
        boolean z11;
        Throwable cause;
        StripeException stripeException;
        StripeError stripeError;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f49894s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f49894s = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj = iVar.f49892q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = iVar.f49894s;
        if (i12 == 0) {
            jn0.t.b(obj);
            iVar.f49889n = this;
            str2 = str;
            iVar.f49890o = str2;
            iVar.f49894s = 1;
            objN = N(iVar);
            if (objN != coroutine_suspended) {
                lVar = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            String str4 = (String) iVar.f49890o;
            lVar = (l) iVar.f49889n;
            jn0.t.b(obj);
            objN = obj;
            str2 = str4;
        } else {
            if (i12 == 2) {
                str3 = (String) iVar.f49890o;
                lVar2 = (l) iVar.f49889n;
                jn0.t.b(obj);
                jVar = (c40.j) obj;
                if (jVar instanceof c40.j.Success) {
                    paymentMethod = (PaymentMethod) ((c40.j.Success) jVar).b();
                    lVar2.eventReporter.l(b40.b.a.CreateAttach);
                    iVar.f49889n = lVar2;
                    iVar.f49890o = str3;
                    iVar.f49891p = jVar;
                    iVar.f49894s = 3;
                    if (lVar2.u0(paymentMethod, iVar) != coroutine_suspended) {
                        jVar2 = jVar;
                        lVar3 = lVar2;
                    }
                    return coroutine_suspended;
                }
                failureA = c40.k.a(jVar);
                if (failureA != null) {
                    displayMessage = failureA.getDisplayMessage();
                    if (displayMessage == null) {
                        cause = failureA.getCause();
                        if (cause instanceof StripeException) {
                            stripeException = (StripeException) cause;
                        } else {
                            stripeException = null;
                        }
                        if (stripeException != null || (stripeError = stripeException.getStripeError()) == null) {
                            displayMessage = null;
                        } else {
                            displayMessage = stripeError.getMessage();
                        }
                    }
                    Throwable cause2 = failureA.getCause();
                    lVar2.eventReporter.k(b40.b.a.CreateAttach);
                    lVar2.logger.error("Failed to attach payment method " + str3 + " to customer", cause2);
                    mutableStateFlow = lVar2.backStack;
                    do {
                        value = mutableStateFlow.getValue();
                        List<Object> list = (List) value;
                        arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
                        for (Object objF : list) {
                            if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                                addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                                if (displayMessage != null) {
                                    cVarB = x30.d.b(displayMessage);
                                } else {
                                    cVarB = null;
                                }
                                if (addPaymentMethod.getFormFieldValues() != null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objF = com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, null, null, null, null, null, false, false, false, cVarB, false, null, z11, null, null, false, false, null, null, 1038847, null);
                            }
                            arrayList.add(objF);
                        }
                    } while (!mutableStateFlow.compareAndSet(value, arrayList));
                }
                return jn0.h0.f84049a;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar2 = (c40.j) iVar.f49891p;
            str3 = (String) iVar.f49890o;
            lVar3 = (l) iVar.f49889n;
            jn0.t.b(obj);
        }
        lVar2 = lVar3;
        jVar = jVar2;
        failureA = c40.k.a(jVar);
        if (failureA != null) {
            displayMessage = failureA.getDisplayMessage();
            if (displayMessage == null) {
                cause = failureA.getCause();
                if (cause instanceof StripeException) {
                    stripeException = (StripeException) cause;
                } else {
                    stripeException = null;
                }
                if (stripeException != null) {
                    displayMessage = null;
                } else {
                    displayMessage = null;
                }
            }
            Throwable cause3 = failureA.getCause();
            lVar2.eventReporter.k(b40.b.a.CreateAttach);
            lVar2.logger.error("Failed to attach payment method " + str3 + " to customer", cause3);
            mutableStateFlow = lVar2.backStack;
            do {
                value = mutableStateFlow.getValue();
                List<Object> list2 = (List) value;
                arrayList = new ArrayList(p013kotlin.collections.v.y(list2, 10));
                while (r5.hasNext()) {
                    if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                        addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                        if (displayMessage != null) {
                            cVarB = x30.d.b(displayMessage);
                        } else {
                            cVarB = null;
                        }
                        if (addPaymentMethod.getFormFieldValues() != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, null, null, null, null, null, false, false, false, cVarB, false, null, z11, null, null, false, false, null, null, 1038847, null);
                    }
                    arrayList.add(objF);
                }
            } while (!mutableStateFlow.compareAndSet(value, arrayList));
        }
        return jn0.h0.f84049a;
        iVar.f49889n = lVar;
        iVar.f49890o = str2;
        iVar.f49894s = 2;
        Object objD = ((c40.n) objN).d(str2, iVar);
        if (objD != coroutine_suspended) {
            str3 = str2;
            obj = objD;
            lVar2 = lVar;
            jVar = (c40.j) obj;
            if (jVar instanceof c40.j.Success) {
                paymentMethod = (PaymentMethod) ((c40.j.Success) jVar).b();
                lVar2.eventReporter.l(b40.b.a.CreateAttach);
                iVar.f49889n = lVar2;
                iVar.f49890o = str3;
                iVar.f49891p = jVar;
                iVar.f49894s = 3;
                if (lVar2.u0(paymentMethod, iVar) != coroutine_suspended) {
                    jVar2 = jVar;
                    lVar3 = lVar2;
                    lVar2 = lVar3;
                    jVar = jVar2;
                }
            }
            failureA = c40.k.a(jVar);
            if (failureA != null) {
                displayMessage = failureA.getDisplayMessage();
                if (displayMessage == null) {
                    cause = failureA.getCause();
                    if (cause instanceof StripeException) {
                        stripeException = (StripeException) cause;
                    } else {
                        stripeException = null;
                    }
                    if (stripeException != null) {
                        displayMessage = null;
                    } else {
                        displayMessage = null;
                    }
                }
                Throwable cause4 = failureA.getCause();
                lVar2.eventReporter.k(b40.b.a.CreateAttach);
                lVar2.logger.error("Failed to attach payment method " + str3 + " to customer", cause4);
                mutableStateFlow = lVar2.backStack;
                do {
                    value = mutableStateFlow.getValue();
                    List<Object> list3 = (List) value;
                    arrayList = new ArrayList(p013kotlin.collections.v.y(list3, 10));
                    while (r5.hasNext()) {
                        if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                            addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                            if (displayMessage != null) {
                                cVarB = x30.d.b(displayMessage);
                            } else {
                                cVarB = null;
                            }
                            if (addPaymentMethod.getFormFieldValues() != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF = com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, null, null, null, null, null, false, false, false, cVarB, false, null, z11, null, null, false, false, null, null, 1038847, null);
                        }
                        arrayList.add(objF);
                    }
                } while (!mutableStateFlow.compareAndSet(value, arrayList));
            }
            return jn0.h0.f84049a;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(PaymentMethod paymentMethod) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), this.workContext, null, new j(paymentMethod, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:46:0x011f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:57:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0153  */
    /* JADX WARN: Code duplicated, block: B:63:0x0169  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0177  */
    /* JADX WARN: Code duplicated, block: B:68:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01db  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:99:0x0234  */
    public final Object L(PaymentMethod paymentMethod, Continuation<? super jn0.h0> continuation) {
        k kVar;
        PaymentMethod paymentMethod2;
        Object objM;
        l lVar;
        PaymentMethod paymentMethod3;
        l lVar2;
        c40.j jVar;
        PaymentMethod paymentMethod4;
        l lVar3;
        c40.j.Companion companion;
        String str;
        Object objC;
        String str2;
        c40.j jVarA;
        c40.j.Companion companion2;
        Object objB;
        c40.j.Failure failureA;
        String displayMessage;
        Throwable cause;
        MutableStateFlow mutableStateFlow;
        Object value;
        ArrayList arrayList;
        com.stripe.android.customersheet.n.AddPaymentMethod addPaymentMethod;
        x30.c cVarB;
        boolean z11;
        Throwable cause2;
        StripeException stripeException;
        StripeError stripeError;
        Throwable thE;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f49911t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f49911t = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        k kVar2 = kVar;
        Object obj = kVar2.f49909r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kVar2.f49911t;
        String message = null;
        if (i12 == 0) {
            jn0.t.b(obj);
            kVar2.f49905n = this;
            paymentMethod2 = paymentMethod;
            kVar2.f49906o = paymentMethod2;
            kVar2.f49911t = 1;
            objM = M(kVar2);
            if (objM != coroutine_suspended) {
                lVar = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            PaymentMethod paymentMethod5 = (PaymentMethod) kVar2.f49906o;
            lVar = (l) kVar2.f49905n;
            jn0.t.b(obj);
            objM = obj;
            paymentMethod2 = paymentMethod5;
        } else {
            if (i12 == 2) {
                PaymentMethod paymentMethod6 = (PaymentMethod) kVar2.f49906o;
                l lVar4 = (l) kVar2.f49905n;
                jn0.t.b(obj);
                paymentMethod3 = paymentMethod6;
                lVar2 = lVar4;
                jVar = (c40.j) obj;
                if (jVar instanceof c40.j.Success) {
                    try {
                        jn0.s.Companion companion3 = jn0.s.INSTANCE;
                        companion = c40.j.INSTANCE;
                        str = (String) ((c40.j.Success) jVar).b();
                        z60.g gVar = lVar2.stripeRepository;
                        w30.l.Options options = new w30.l.Options(lVar2.paymentConfigurationProvider.get().getPublishableKey(), lVar2.paymentConfigurationProvider.get().getStripeAccountId(), null, 4, null);
                        kVar2.f49905n = lVar2;
                        kVar2.f49906o = paymentMethod3;
                        kVar2.f49907p = companion;
                        kVar2.f49908q = str;
                        kVar2.f49911t = 3;
                        objC = z60.g.a.c(gVar, str, options, null, kVar2, 4, null);
                        if (objC != coroutine_suspended) {
                            str2 = str;
                            lVar3 = lVar2;
                            jn0.t.b(objC);
                            kVar2.f49905n = lVar3;
                            kVar2.f49906o = paymentMethod3;
                            kVar2.f49907p = companion;
                            kVar2.f49908q = null;
                            kVar2.f49911t = 4;
                            if (lVar3.a0((SetupIntent) objC, str2, paymentMethod3, kVar2) != coroutine_suspended) {
                                paymentMethod4 = paymentMethod3;
                                companion2 = companion;
                                objB = jn0.s.b(companion2.b(jn0.h0.f84049a));
                                paymentMethod3 = paymentMethod4;
                                lVar2 = lVar3;
                                thE = jn0.s.e(objB);
                                if (thE == null) {
                                    jVarA = (c40.j.Success) objB;
                                } else {
                                    jVarA = c40.j.INSTANCE.a(thE, null);
                                }
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        paymentMethod4 = paymentMethod3;
                        lVar3 = lVar2;
                        jn0.s.Companion companion4 = jn0.s.INSTANCE;
                        objB = jn0.s.b(jn0.t.a(th));
                        paymentMethod3 = paymentMethod4;
                        lVar2 = lVar3;
                        thE = jn0.s.e(objB);
                        if (thE == null) {
                            jVarA = (c40.j.Success) objB;
                        } else {
                            jVarA = c40.j.INSTANCE.a(thE, null);
                        }
                        failureA = c40.k.a(jVarA);
                        if (failureA != null) {
                            displayMessage = failureA.getDisplayMessage();
                            if (displayMessage == null) {
                                cause2 = failureA.getCause();
                                if (cause2 instanceof StripeException) {
                                    stripeException = (StripeException) cause2;
                                } else {
                                    stripeException = null;
                                }
                                if (stripeException != null) {
                                    message = stripeError.getMessage();
                                }
                            } else {
                                message = displayMessage;
                            }
                            cause = failureA.getCause();
                            lVar2.eventReporter.k(b40.b.a.SetupIntent);
                            lVar2.logger.error("Failed to attach payment method to SetupIntent: " + paymentMethod3, cause);
                            mutableStateFlow = lVar2.backStack;
                            do {
                                value = mutableStateFlow.getValue();
                                List<Object> list = (List) value;
                                arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
                                for (Object objF : list) {
                                    if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                                        addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                                        if (message != null) {
                                            cVarB = l30.a.b(cause);
                                        } else {
                                            cVarB = l30.a.b(cause);
                                        }
                                        x30.c cVar = cVarB;
                                        if (addPaymentMethod.getFormFieldValues() != null) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        objF = com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, null, null, null, null, null, true, false, false, cVar, false, null, z11, null, null, false, false, null, null, 1038719, null);
                                    }
                                    arrayList.add(objF);
                                }
                            } while (!mutableStateFlow.compareAndSet(value, arrayList));
                        }
                        return jn0.h0.f84049a;
                    }
                }
                if (jVar instanceof c40.j.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                c40.j.Failure failure = (c40.j.Failure) jVar;
                jVarA = c40.j.INSTANCE.a(failure.getCause(), failure.getDisplayMessage());
                failureA = c40.k.a(jVarA);
                if (failureA != null) {
                    displayMessage = failureA.getDisplayMessage();
                    if (displayMessage == null) {
                        cause2 = failureA.getCause();
                        if (cause2 instanceof StripeException) {
                            stripeException = (StripeException) cause2;
                        } else {
                            stripeException = null;
                        }
                        if (stripeException != null) {
                            message = stripeError.getMessage();
                        }
                    } else {
                        message = displayMessage;
                    }
                    cause = failureA.getCause();
                    lVar2.eventReporter.k(b40.b.a.SetupIntent);
                    lVar2.logger.error("Failed to attach payment method to SetupIntent: " + paymentMethod3, cause);
                    mutableStateFlow = lVar2.backStack;
                    do {
                        value = mutableStateFlow.getValue();
                        List<Object> list2 = (List) value;
                        arrayList = new ArrayList(p013kotlin.collections.v.y(list2, 10));
                        while (r4.hasNext()) {
                            if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                                addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                                if (message != null) {
                                    cVarB = l30.a.b(cause);
                                } else {
                                    cVarB = l30.a.b(cause);
                                }
                                x30.c cVar2 = cVarB;
                                if (addPaymentMethod.getFormFieldValues() != null) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                objF = com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, null, null, null, null, null, true, false, false, cVar2, false, null, z11, null, null, false, false, null, null, 1038719, null);
                            }
                            arrayList.add(objF);
                        }
                    } while (!mutableStateFlow.compareAndSet(value, arrayList));
                }
                return jn0.h0.f84049a;
            }
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion2 = (c40.j.Companion) kVar2.f49907p;
                paymentMethod4 = (PaymentMethod) kVar2.f49906o;
                lVar3 = (l) kVar2.f49905n;
                try {
                    jn0.t.b(obj);
                    objB = jn0.s.b(companion2.b(jn0.h0.f84049a));
                } catch (Throwable th3) {
                    th = th3;
                    jn0.s.Companion companion5 = jn0.s.INSTANCE;
                    objB = jn0.s.b(jn0.t.a(th));
                }
                paymentMethod3 = paymentMethod4;
                lVar2 = lVar3;
                thE = jn0.s.e(objB);
                if (thE == null) {
                    jVarA = (c40.j.Success) objB;
                } else {
                    jVarA = c40.j.INSTANCE.a(thE, null);
                }
                failureA = c40.k.a(jVarA);
                if (failureA != null) {
                    displayMessage = failureA.getDisplayMessage();
                    if (displayMessage == null) {
                        cause2 = failureA.getCause();
                        if (cause2 instanceof StripeException) {
                            stripeException = (StripeException) cause2;
                        } else {
                            stripeException = null;
                        }
                        if (stripeException != null && (stripeError = stripeException.getStripeError()) != null) {
                            message = stripeError.getMessage();
                        }
                    } else {
                        message = displayMessage;
                    }
                    cause = failureA.getCause();
                    lVar2.eventReporter.k(b40.b.a.SetupIntent);
                    lVar2.logger.error("Failed to attach payment method to SetupIntent: " + paymentMethod3, cause);
                    mutableStateFlow = lVar2.backStack;
                    do {
                        value = mutableStateFlow.getValue();
                        List<Object> list3 = (List) value;
                        arrayList = new ArrayList(p013kotlin.collections.v.y(list3, 10));
                        while (r4.hasNext()) {
                            if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                                addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                                if (message != null || (cVarB = x30.d.b(message)) == null) {
                                    cVarB = l30.a.b(cause);
                                }
                                x30.c cVar3 = cVarB;
                                if (addPaymentMethod.getFormFieldValues() != null || addPaymentMethod.getIsProcessing()) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                objF = com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, null, null, null, null, null, true, false, false, cVar3, false, null, z11, null, null, false, false, null, null, 1038719, null);
                            }
                            arrayList.add(objF);
                        }
                    } while (!mutableStateFlow.compareAndSet(value, arrayList));
                }
                return jn0.h0.f84049a;
            }
            str2 = (String) kVar2.f49908q;
            c40.j.Companion companion6 = (c40.j.Companion) kVar2.f49907p;
            PaymentMethod paymentMethod7 = (PaymentMethod) kVar2.f49906o;
            l lVar5 = (l) kVar2.f49905n;
            try {
                jn0.t.b(obj);
                objC = ((jn0.s) obj).getValue();
                companion = companion6;
                paymentMethod3 = paymentMethod7;
                lVar3 = lVar5;
                try {
                    jn0.t.b(objC);
                    kVar2.f49905n = lVar3;
                    kVar2.f49906o = paymentMethod3;
                    kVar2.f49907p = companion;
                    kVar2.f49908q = null;
                    kVar2.f49911t = 4;
                    if (lVar3.a0((SetupIntent) objC, str2, paymentMethod3, kVar2) != coroutine_suspended) {
                        paymentMethod4 = paymentMethod3;
                        companion2 = companion;
                        objB = jn0.s.b(companion2.b(jn0.h0.f84049a));
                        paymentMethod3 = paymentMethod4;
                        lVar2 = lVar3;
                        thE = jn0.s.e(objB);
                        if (thE == null) {
                            jVarA = (c40.j.Success) objB;
                        } else {
                            jVarA = c40.j.INSTANCE.a(thE, null);
                        }
                        failureA = c40.k.a(jVarA);
                        if (failureA != null) {
                            displayMessage = failureA.getDisplayMessage();
                            if (displayMessage == null) {
                                cause2 = failureA.getCause();
                                if (cause2 instanceof StripeException) {
                                    stripeException = (StripeException) cause2;
                                } else {
                                    stripeException = null;
                                }
                                if (stripeException != null) {
                                    message = stripeError.getMessage();
                                }
                            } else {
                                message = displayMessage;
                            }
                            cause = failureA.getCause();
                            lVar2.eventReporter.k(b40.b.a.SetupIntent);
                            lVar2.logger.error("Failed to attach payment method to SetupIntent: " + paymentMethod3, cause);
                            mutableStateFlow = lVar2.backStack;
                            do {
                                value = mutableStateFlow.getValue();
                                List<Object> list4 = (List) value;
                                arrayList = new ArrayList(p013kotlin.collections.v.y(list4, 10));
                                while (r4.hasNext()) {
                                    if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                                        addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                                        if (message != null) {
                                            cVarB = l30.a.b(cause);
                                        } else {
                                            cVarB = l30.a.b(cause);
                                        }
                                        x30.c cVar4 = cVarB;
                                        if (addPaymentMethod.getFormFieldValues() != null) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        objF = com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, null, null, null, null, null, true, false, false, cVar4, false, null, z11, null, null, false, false, null, null, 1038719, null);
                                    }
                                    arrayList.add(objF);
                                }
                            } while (!mutableStateFlow.compareAndSet(value, arrayList));
                        }
                        return jn0.h0.f84049a;
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th = th4;
                    paymentMethod4 = paymentMethod3;
                    jn0.s.Companion companion7 = jn0.s.INSTANCE;
                    objB = jn0.s.b(jn0.t.a(th));
                }
            } catch (Throwable th5) {
                th = th5;
                paymentMethod4 = paymentMethod7;
                lVar3 = lVar5;
                jn0.s.Companion companion8 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th));
                paymentMethod3 = paymentMethod4;
                lVar2 = lVar3;
                thE = jn0.s.e(objB);
                if (thE == null) {
                    jVarA = (c40.j.Success) objB;
                } else {
                    jVarA = c40.j.INSTANCE.a(thE, null);
                }
                failureA = c40.k.a(jVarA);
                if (failureA != null) {
                    displayMessage = failureA.getDisplayMessage();
                    if (displayMessage == null) {
                        cause2 = failureA.getCause();
                        if (cause2 instanceof StripeException) {
                            stripeException = (StripeException) cause2;
                        } else {
                            stripeException = null;
                        }
                        if (stripeException != null) {
                            message = stripeError.getMessage();
                        }
                    } else {
                        message = displayMessage;
                    }
                    cause = failureA.getCause();
                    lVar2.eventReporter.k(b40.b.a.SetupIntent);
                    lVar2.logger.error("Failed to attach payment method to SetupIntent: " + paymentMethod3, cause);
                    mutableStateFlow = lVar2.backStack;
                    do {
                        value = mutableStateFlow.getValue();
                        List<Object> list5 = (List) value;
                        arrayList = new ArrayList(p013kotlin.collections.v.y(list5, 10));
                        while (r4.hasNext()) {
                            if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                                addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                                if (message != null) {
                                    cVarB = l30.a.b(cause);
                                } else {
                                    cVarB = l30.a.b(cause);
                                }
                                x30.c cVar5 = cVarB;
                                if (addPaymentMethod.getFormFieldValues() != null) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                objF = com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, null, null, null, null, null, true, false, false, cVar5, false, null, z11, null, null, false, false, null, null, 1038719, null);
                            }
                            arrayList.add(objF);
                        }
                    } while (!mutableStateFlow.compareAndSet(value, arrayList));
                }
                return jn0.h0.f84049a;
            }
        }
        kVar2.f49905n = lVar;
        kVar2.f49906o = paymentMethod2;
        kVar2.f49911t = 2;
        Object objF2 = ((c40.m) objM).f(kVar2);
        if (objF2 != coroutine_suspended) {
            paymentMethod3 = paymentMethod2;
            obj = objF2;
            lVar2 = lVar;
            jVar = (c40.j) obj;
            if (jVar instanceof c40.j.Success) {
                jn0.s.Companion companion9 = jn0.s.INSTANCE;
                companion = c40.j.INSTANCE;
                str = (String) ((c40.j.Success) jVar).b();
                z60.g gVar2 = lVar2.stripeRepository;
                w30.l.Options options2 = new w30.l.Options(lVar2.paymentConfigurationProvider.get().getPublishableKey(), lVar2.paymentConfigurationProvider.get().getStripeAccountId(), null, 4, null);
                kVar2.f49905n = lVar2;
                kVar2.f49906o = paymentMethod3;
                kVar2.f49907p = companion;
                kVar2.f49908q = str;
                kVar2.f49911t = 3;
                objC = z60.g.a.c(gVar2, str, options2, null, kVar2, 4, null);
                if (objC != coroutine_suspended) {
                    str2 = str;
                    lVar3 = lVar2;
                    jn0.t.b(objC);
                    kVar2.f49905n = lVar3;
                    kVar2.f49906o = paymentMethod3;
                    kVar2.f49907p = companion;
                    kVar2.f49908q = null;
                    kVar2.f49911t = 4;
                    if (lVar3.a0((SetupIntent) objC, str2, paymentMethod3, kVar2) != coroutine_suspended) {
                        paymentMethod4 = paymentMethod3;
                        companion2 = companion;
                        objB = jn0.s.b(companion2.b(jn0.h0.f84049a));
                        paymentMethod3 = paymentMethod4;
                        lVar2 = lVar3;
                        thE = jn0.s.e(objB);
                        if (thE == null) {
                            jVarA = (c40.j.Success) objB;
                        } else {
                            jVarA = c40.j.INSTANCE.a(thE, null);
                        }
                    }
                }
            } else {
                if (jVar instanceof c40.j.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                c40.j.Failure failure2 = (c40.j.Failure) jVar;
                jVarA = c40.j.INSTANCE.a(failure2.getCause(), failure2.getDisplayMessage());
            }
            failureA = c40.k.a(jVarA);
            if (failureA != null) {
                displayMessage = failureA.getDisplayMessage();
                if (displayMessage == null) {
                    cause2 = failureA.getCause();
                    if (cause2 instanceof StripeException) {
                        stripeException = (StripeException) cause2;
                    } else {
                        stripeException = null;
                    }
                    if (stripeException != null) {
                        message = stripeError.getMessage();
                    }
                } else {
                    message = displayMessage;
                }
                cause = failureA.getCause();
                lVar2.eventReporter.k(b40.b.a.SetupIntent);
                lVar2.logger.error("Failed to attach payment method to SetupIntent: " + paymentMethod3, cause);
                mutableStateFlow = lVar2.backStack;
                do {
                    value = mutableStateFlow.getValue();
                    List<Object> list6 = (List) value;
                    arrayList = new ArrayList(p013kotlin.collections.v.y(list6, 10));
                    while (r4.hasNext()) {
                        if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                            addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                            if (message != null) {
                                cVarB = l30.a.b(cause);
                            } else {
                                cVarB = l30.a.b(cause);
                            }
                            x30.c cVar6 = cVarB;
                            if (addPaymentMethod.getFormFieldValues() != null) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            objF = com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, null, null, null, null, null, true, false, false, cVar6, false, null, z11, null, null, false, false, null, null, 1038719, null);
                        }
                        arrayList.add(objF);
                    }
                } while (!mutableStateFlow.compareAndSet(value, arrayList));
            }
            return jn0.h0.f84049a;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M(Continuation<? super c40.m> continuation) {
        return this.intentDataSourceProvider.await(continuation);
    }

    private final Object N(Continuation<? super c40.n> continuation) {
        return this.paymentMethodDataSourceProvider.await(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O(Continuation<? super c40.o> continuation) {
        return this.savedSelectionDataSourceProvider.await(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(w70.j paymentSelection, String type) {
        if (type != null) {
            this.eventReporter.n(type);
        }
        this._result.tryEmit(new com.stripe.android.customersheet.p.Selected(paymentSelection));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(w70.j paymentSelection, String type, Throwable cause, String displayMessage) {
        if (type != null) {
            this.eventReporter.j(type);
        }
        this.logger.error("Failed to persist payment selection: " + paymentSelection, cause);
        B0(new C0809l(displayMessage));
    }

    private final void S(PaymentMethodCreateParams paymentMethodCreateParams) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), this.workContext, null, new m(paymentMethodCreateParams, null), 2, null);
    }

    private final p027z70.d T(StripeIntent stripeIntent) {
        return new p027z70.d(false, null, null, false, false, false, stripeIntent != null ? stripeIntent.getId() : null, stripeIntent != null ? stripeIntent.getClientSecret() : null, "customer_sheet", null, null, new n(), new o(), new p(), new q(), r.f49933c, new s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super jn0.s<PaymentMethod>> continuation) {
        t tVar;
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i11 = tVar.f49937p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tVar.f49937p = i11 - Integer.MIN_VALUE;
            } else {
                tVar = new t(continuation);
            }
        } else {
            tVar = new t(continuation);
        }
        Object obj = tVar.f49935n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tVar.f49937p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        z60.g gVar = this.stripeRepository;
        w30.l.Options options = new w30.l.Options(this.paymentConfigurationProvider.get().getPublishableKey(), this.paymentConfigurationProvider.get().getStripeAccountId(), null, 4, null);
        tVar.f49937p = 1;
        Object objJ = gVar.j(paymentMethodCreateParams, options, tVar);
        return objJ == coroutine_suspended ? coroutine_suspended : objJ;
    }

    private final b40.b.c V(com.stripe.android.customersheet.n nVar) {
        if (nVar instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
            return b40.b.c.AddPaymentMethod;
        }
        if (nVar instanceof com.stripe.android.customersheet.n.SelectPaymentMethod) {
            return b40.b.c.SelectPaymentMethod;
        }
        if (nVar instanceof com.stripe.android.customersheet.n.EditPaymentMethod) {
            return b40.b.c.EditPaymentMethod;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(String displayMessage) {
        B0(new u(displayMessage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(PaymentMethod paymentMethod) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), this.workContext, null, new v(paymentMethod, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r5.u0(r1, r3) == r4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(com.stripe.android.model.StripeIntent r35, java.lang.String r36, com.stripe.android.model.PaymentMethod r37, p013kotlin.coroutines.Continuation<? super jn0.h0> r38) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.l.a0(com.stripe.android.model.StripeIntent, java.lang.String, com.stripe.android.model.v0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c0(Continuation<? super jn0.h0> continuation) {
        x xVar;
        l lVar;
        if (continuation instanceof x) {
            xVar = (x) continuation;
            int i11 = xVar.f49950q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f49950q = i11 - Integer.MIN_VALUE;
            } else {
                xVar = new x(continuation);
            }
        } else {
            xVar = new x(continuation);
        }
        Object objWithContext = xVar.f49948o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = xVar.f49950q;
        if (i12 == 0) {
            jn0.t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            y yVar = new y(null);
            xVar.f49947n = this;
            xVar.f49950q = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, yVar, xVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            lVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (l) xVar.f49947n;
            jn0.t.b(objWithContext);
        }
        Object value = ((jn0.s) objWithContext).getValue();
        Throwable thE = jn0.s.e(value);
        if (thE == null) {
            Full full = (Full) value;
            if (full.getValidationError() != null) {
                MutableStateFlow<com.stripe.android.customersheet.p> mutableStateFlow = lVar._result;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.stripe.android.customersheet.p.c(full.getValidationError()))) {
                }
            } else {
                lVar.supportedPaymentMethods.clear();
                lVar.supportedPaymentMethods.addAll(full.e());
                lVar.originalPaymentSelection = full.getPaymentSelection();
                lVar.customerState.setValue(new CustomerState(full.a(), full.getPaymentSelection(), full.getPaymentMethodMetadata(), full.getCustomerPermissions(), lVar.configuration));
                lVar.F0();
            }
        } else {
            MutableStateFlow<com.stripe.android.customersheet.p> mutableStateFlow2 = lVar._result;
            while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new com.stripe.android.customersheet.p.c(thE))) {
            }
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d0(PaymentMethod paymentMethod, com.stripe.android.model.h hVar, Continuation<? super c40.j<PaymentMethod>> continuation) {
        z zVar;
        PaymentMethod paymentMethod2;
        com.stripe.android.model.h hVar2;
        Object objN;
        l lVar;
        com.stripe.android.model.h hVar3;
        l lVar2;
        c40.j jVar;
        c40.j.Failure failureA;
        StripeException stripeException;
        StripeError stripeError;
        if (continuation instanceof z) {
            zVar = (z) continuation;
            int i11 = zVar.f49958s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zVar.f49958s = i11 - Integer.MIN_VALUE;
            } else {
                zVar = new z(continuation);
            }
        } else {
            zVar = new z(continuation);
        }
        Object objE = zVar.f49956q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = zVar.f49958s;
        if (i12 == 0) {
            jn0.t.b(objE);
            zVar.f49953n = this;
            paymentMethod2 = paymentMethod;
            zVar.f49954o = paymentMethod2;
            hVar2 = hVar;
            zVar.f49955p = hVar2;
            zVar.f49958s = 1;
            objN = N(zVar);
            if (objN != coroutine_suspended) {
                lVar = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            hVar2 = (com.stripe.android.model.h) zVar.f49955p;
            PaymentMethod paymentMethod3 = (PaymentMethod) zVar.f49954o;
            lVar = (l) zVar.f49953n;
            jn0.t.b(objE);
            objN = objE;
            paymentMethod2 = paymentMethod3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar3 = (com.stripe.android.model.h) zVar.f49954o;
            lVar2 = (l) zVar.f49953n;
            jn0.t.b(objE);
        }
        jVar = (c40.j) objE;
        if (jVar instanceof c40.j.Success) {
            PaymentMethod paymentMethod4 = (PaymentMethod) ((c40.j.Success) jVar).b();
            lVar2.g0();
            lVar2.I0(paymentMethod4);
            lVar2.eventReporter.b(hVar3);
        }
        failureA = c40.k.a(jVar);
        if (failureA != null) {
            if (failureA.getDisplayMessage() == null) {
                Throwable cause = failureA.getCause();
                stripeException = cause instanceof StripeException ? (StripeException) cause : null;
                if (stripeException != null && (stripeError = stripeException.getStripeError()) != null) {
                    stripeError.getMessage();
                }
            }
            lVar2.eventReporter.c(hVar3, failureA.getCause());
        }
        return jVar;
        String str = paymentMethod2.id;
        p013kotlin.jvm.internal.s.h(str);
        a1 a1VarB = a1.Companion.b(a1.INSTANCE, null, null, new a1.a.c(hVar2.getCode()), null, null, p013kotlin.collections.d1.c("CustomerSheet"), 27, null);
        zVar.f49953n = lVar;
        zVar.f49954o = hVar2;
        zVar.f49955p = null;
        zVar.f49958s = 2;
        objE = ((c40.n) objN).e(str, a1VarB, zVar);
        if (objE != coroutine_suspended) {
            hVar3 = hVar2;
            lVar2 = lVar;
            jVar = (c40.j) objE;
            if (jVar instanceof c40.j.Success) {
                PaymentMethod paymentMethod5 = (PaymentMethod) ((c40.j.Success) jVar).b();
                lVar2.g0();
                lVar2.I0(paymentMethod5);
                lVar2.eventReporter.b(hVar3);
            }
            failureA = c40.k.a(jVar);
            if (failureA != null) {
                if (failureA.getDisplayMessage() == null) {
                    Throwable cause2 = failureA.getCause();
                    if (cause2 instanceof StripeException) {
                    }
                    if (stripeException != null) {
                        stripeError.getMessage();
                    }
                }
                lVar2.eventReporter.c(hVar3, failureA.getCause());
            }
            return jVar;
        }
        return coroutine_suspended;
    }

    private final void e0() {
        E0(false);
    }

    private final void f0(SupportedPaymentMethod paymentMethod) {
        Object value;
        ArrayList arrayList;
        com.stripe.android.customersheet.n value2 = this.viewState.getValue();
        com.stripe.android.customersheet.n.AddPaymentMethod addPaymentMethod = value2 instanceof com.stripe.android.customersheet.n.AddPaymentMethod ? (com.stripe.android.customersheet.n.AddPaymentMethod) value2 : null;
        if (addPaymentMethod == null || !p013kotlin.jvm.internal.s.f(addPaymentMethod.getPaymentMethodCode(), paymentMethod.getCode())) {
            PaymentMethodMetadata metadata = this.customerState.getValue().getMetadata();
            if (metadata == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.eventReporter.e(paymentMethod.getCode());
            this.previouslySelectedPaymentMethod = paymentMethod;
            MutableStateFlow mutableStateFlow = this.backStack;
            do {
                value = mutableStateFlow.getValue();
                List<Object> list = (List) value;
                arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
                for (Object objF : list) {
                    if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                        com.stripe.android.customersheet.n.AddPaymentMethod addPaymentMethod2 = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                        String code = paymentMethod.getCode();
                        FormArguments formArgumentsA = u70.b.f115807a.a(paymentMethod.getCode(), metadata);
                        List<p010i90.d0> listD = metadata.d(paymentMethod.getCode(), new u60.k.a.InterfaceC2488a.C2489a(this.cardAccountRangeRepositoryFactory, null, a0.f49843c, null, null, 24, null));
                        if (listD == null) {
                            listD = p013kotlin.collections.v.m();
                        }
                        List<p010i90.d0> list2 = listD;
                        x30.c cVarA = (!p013kotlin.jvm.internal.s.f(paymentMethod.getCode(), PaymentMethod.p.USBankAccount.code) || (addPaymentMethod2.getBankAccountResult() instanceof com.stripe.android.payments.bankaccount.navigation.e.Completed)) ? x30.d.a(n70.x.f93511e0) : x30.d.a(w80.n.f121526o);
                        w70.j draftPaymentSelection = addPaymentMethod2.getDraftPaymentSelection();
                        objF = com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod2, code, null, null, list2, formArgumentsA, null, null, false, false, false, null, false, cVarA, (addPaymentMethod2.getFormFieldValues() == null || addPaymentMethod2.getIsProcessing()) ? false : true, null, draftPaymentSelection != null ? draftPaymentSelection.c(this.configuration.getMerchantDisplayName(), true) : null, false, false, null, null, 1003494, null);
                    }
                    arrayList.add(objF);
                }
            } while (!mutableStateFlow.compareAndSet(value, arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        List<com.stripe.android.customersheet.n> value;
        List<com.stripe.android.customersheet.n> list;
        if (this.backStack.getValue().size() == 1) {
            this._result.tryEmit(new com.stripe.android.customersheet.p.Canceled(this.originalPaymentSelection));
            return;
        }
        MutableStateFlow<List<com.stripe.android.customersheet.n>> mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            list = value;
            b40.b.c cVarV = V((com.stripe.android.customersheet.n) p013kotlin.collections.v.A0(list));
            if (cVarV != null) {
                this.eventReporter.f(cVarV);
            }
        } while (!mutableStateFlow.compareAndSet(value, p013kotlin.collections.v.j0(list, 1)));
    }

    private final void h0() {
        Object value;
        ArrayList arrayList;
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            for (Object objF : list) {
                if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                    objF = com.stripe.android.customersheet.n.AddPaymentMethod.f((com.stripe.android.customersheet.n.AddPaymentMethod) objF, null, null, null, null, null, null, null, false, false, false, null, false, null, false, null, null, false, false, null, null, 917503, null);
                }
                arrayList.add(objF);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }

    private final void i0() {
        this.eventReporter.a();
    }

    private final void j0(com.stripe.android.payments.bankaccount.navigation.e bankAccountResult) {
        Object value;
        ArrayList arrayList;
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            for (Object objF : list) {
                if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                    objF = com.stripe.android.customersheet.n.AddPaymentMethod.f((com.stripe.android.customersheet.n.AddPaymentMethod) objF, null, null, null, null, null, null, null, false, false, false, null, false, bankAccountResult instanceof com.stripe.android.payments.bankaccount.navigation.e.Completed ? x30.d.a(n70.x.f93511e0) : x30.d.a(w80.n.f121526o), false, null, null, false, false, bankAccountResult, null, 782335, null);
                }
                arrayList.add(objF);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }

    private final void k0(w70.j.e.USBankAccount usBankAccount) {
        S(usBankAccount.getPaymentMethodCreateParams());
    }

    private final void l0() {
        MutableStateFlow<com.stripe.android.customersheet.p> mutableStateFlow = this._result;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.stripe.android.customersheet.p.Canceled(this.originalPaymentSelection))) {
        }
    }

    private final void m0() {
        if (this.customerState.getValue().getCanEdit()) {
            boolean zBooleanValue = this.isEditing.getValue().booleanValue();
            if (zBooleanValue) {
                this.eventReporter.p();
            } else {
                this.eventReporter.g();
            }
            this.isEditing.setValue(Boolean.valueOf(!zBooleanValue));
        }
    }

    private final void n0(x30.c error) {
        Object value;
        ArrayList arrayList;
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            for (Object objF : list) {
                if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                    objF = com.stripe.android.customersheet.n.AddPaymentMethod.f((com.stripe.android.customersheet.n.AddPaymentMethod) objF, null, null, null, null, null, null, null, false, false, false, error, false, null, false, null, null, false, false, null, null, 1047551, null);
                }
                arrayList.add(objF);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }

    private final void o0(FormFieldValues formFieldValues) {
        PaymentMethodMetadata paymentMethodMetadata;
        MutableStateFlow mutableStateFlow;
        Object obj;
        ArrayList arrayList;
        w70.j jVarG;
        SupportedPaymentMethod supportedPaymentMethod;
        PaymentMethodMetadata metadata = this.customerState.getValue().getMetadata();
        if (metadata == null) {
            return;
        }
        MutableStateFlow mutableStateFlow2 = this.backStack;
        while (true) {
            Object value = mutableStateFlow2.getValue();
            List<Object> list = (List) value;
            ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(list, 10));
            for (Object objF : list) {
                if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                    com.stripe.android.customersheet.n.AddPaymentMethod addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) objF;
                    boolean z11 = (formFieldValues == null || addPaymentMethod.getIsProcessing()) ? false : true;
                    if (formFieldValues != null) {
                        Iterator<T> it = addPaymentMethod.u().iterator();
                        do {
                            if (!it.hasNext()) {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            supportedPaymentMethod = (SupportedPaymentMethod) it.next();
                        } while (!p013kotlin.jvm.internal.s.f(supportedPaymentMethod.getCode(), addPaymentMethod.getPaymentMethodCode()));
                        jVarG = p008h80.c.g(formFieldValues, supportedPaymentMethod, metadata);
                    } else {
                        jVarG = null;
                    }
                    paymentMethodMetadata = metadata;
                    mutableStateFlow = mutableStateFlow2;
                    obj = value;
                    arrayList = arrayList2;
                    objF = com.stripe.android.customersheet.n.AddPaymentMethod.f(addPaymentMethod, null, null, formFieldValues, null, null, null, jVarG, false, false, false, null, false, null, z11, null, null, false, false, null, null, 1040315, null);
                } else {
                    paymentMethodMetadata = metadata;
                    mutableStateFlow = mutableStateFlow2;
                    obj = value;
                    arrayList = arrayList2;
                }
                arrayList.add(objF);
                formFieldValues = formFieldValues;
                arrayList2 = arrayList;
                metadata = paymentMethodMetadata;
                mutableStateFlow2 = mutableStateFlow;
                value = obj;
            }
            PaymentMethodMetadata paymentMethodMetadata2 = metadata;
            MutableStateFlow mutableStateFlow3 = mutableStateFlow2;
            if (mutableStateFlow3.compareAndSet(value, arrayList2)) {
                return;
            }
            mutableStateFlow2 = mutableStateFlow3;
            metadata = paymentMethodMetadata2;
        }
    }

    private final void p0(PaymentMethod paymentMethod) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), this.workContext, null, new b0(paymentMethod, null), 2, null);
    }

    private final void q0(w70.j paymentSelection) {
        if (paymentSelection instanceof w70.j.c ? true : paymentSelection instanceof w70.j.Saved) {
            if (this.isEditing.getValue().booleanValue()) {
                return;
            }
            A0(new c0(paymentSelection));
        } else {
            throw new IllegalStateException(("Unsupported payment selection " + paymentSelection).toString());
        }
    }

    private final void r0(PaymentMethod paymentMethod) {
        CustomerState value = this.customerState.getValue();
        h80.t.a aVar = this.editInteractorFactory;
        PaymentMethod.p pVar = paymentMethod.type;
        x30.c cVarT0 = t0(pVar != null ? pVar.code : null);
        boolean canRemove = value.getCanRemove();
        PaymentMethodMetadata metadata = value.getMetadata();
        if (metadata == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        D0(this, new com.stripe.android.customersheet.n.EditPaymentMethod(aVar.a(paymentMethod, new d0(), new e0(null), new f0(null), cVarT0, canRemove, metadata.getStripeIntent().getIsLiveMode()), this.isLiveModeProvider.invoke().booleanValue()), false, 2, null);
    }

    private final void s0() {
        Object value;
        ArrayList arrayList;
        com.stripe.android.customersheet.n value2 = this.viewState.getValue();
        if (!(value2 instanceof com.stripe.android.customersheet.n.AddPaymentMethod)) {
            if (!(value2 instanceof com.stripe.android.customersheet.n.SelectPaymentMethod)) {
                throw new IllegalStateException((this.viewState.getValue() + " is not supported").toString());
            }
            B0(g0.f49881c);
            w70.j paymentSelection = ((com.stripe.android.customersheet.n.SelectPaymentMethod) value2).getPaymentSelection();
            if (paymentSelection instanceof w70.j.c) {
                y0();
                return;
            }
            if (paymentSelection instanceof w70.j.Saved) {
                z0((w70.j.Saved) paymentSelection);
                return;
            } else {
                if (paymentSelection == null) {
                    z0(null);
                    return;
                }
                throw new IllegalStateException((paymentSelection + " is not supported").toString());
            }
        }
        com.stripe.android.customersheet.n.AddPaymentMethod addPaymentMethod = (com.stripe.android.customersheet.n.AddPaymentMethod) value2;
        if (addPaymentMethod.getCustomPrimaryButtonUiState() != null) {
            addPaymentMethod.getCustomPrimaryButtonUiState().f().invoke();
            return;
        }
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            for (Object objF : list) {
                if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                    objF = com.stripe.android.customersheet.n.AddPaymentMethod.f((com.stripe.android.customersheet.n.AddPaymentMethod) objF, null, null, null, null, null, null, null, false, false, true, null, false, null, false, null, null, false, false, null, null, 1039743, null);
                }
                arrayList.add(objF);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
        FormFieldValues formFieldValues = addPaymentMethod.getFormFieldValues();
        if (formFieldValues == null) {
            throw new IllegalStateException("completeFormValues cannot be null");
        }
        String paymentMethodCode = addPaymentMethod.getPaymentMethodCode();
        PaymentMethodMetadata metadata = this.customerState.getValue().getMetadata();
        if (metadata == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        S(p008h80.c.e(formFieldValues, paymentMethodCode, metadata));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u0(PaymentMethod paymentMethod, Continuation<? super jn0.h0> continuation) {
        h0 h0Var;
        l lVar;
        l lVar2;
        c40.j jVar;
        c40.j.Failure failureA;
        Throwable cause;
        StripeException stripeException;
        StripeError stripeError;
        if (continuation instanceof h0) {
            h0Var = (h0) continuation;
            int i11 = h0Var.f49888r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h0Var.f49888r = i11 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(continuation);
            }
        } else {
            h0Var = new h0(continuation);
        }
        Object objN = h0Var.f49886p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = h0Var.f49888r;
        if (i12 == 0) {
            jn0.t.b(objN);
            h0Var.f49884n = this;
            h0Var.f49885o = paymentMethod;
            h0Var.f49888r = 1;
            objN = N(h0Var);
            if (objN != coroutine_suspended) {
                lVar = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            paymentMethod = (PaymentMethod) h0Var.f49885o;
            lVar = (l) h0Var.f49884n;
            jn0.t.b(objN);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentMethod = (PaymentMethod) h0Var.f49885o;
            lVar2 = (l) h0Var.f49884n;
            jn0.t.b(objN);
        }
        jVar = (c40.j) objN;
        if (jVar instanceof c40.j.Success) {
            List list = (List) ((c40.j.Success) jVar).b();
            h70.h.b.a(lVar2.errorReporter, h70.h.e.CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS, null, null, 6, null);
            lVar2.A0(new i0(list, paymentMethod));
            lVar2.C0(lVar2.selectPaymentMethodState.getValue(), true);
        }
        failureA = c40.k.a(jVar);
        if (failureA != null) {
            if (failureA.getDisplayMessage() == null) {
                cause = failureA.getCause();
                if (cause instanceof StripeException) {
                    stripeException = (StripeException) cause;
                } else {
                    stripeException = null;
                }
                if (stripeException != null && (stripeError = stripeException.getStripeError()) != null) {
                    stripeError.getMessage();
                }
            }
            h70.h.b.a(lVar2.errorReporter, h70.h.d.CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE, StripeException.INSTANCE.b(failureA.getCause()), null, 4, null);
            lVar2.l0();
        }
        return jn0.h0.f84049a;
        h0Var.f49884n = lVar;
        h0Var.f49885o = paymentMethod;
        h0Var.f49888r = 2;
        objN = ((c40.n) objN).a(h0Var);
        if (objN != coroutine_suspended) {
            lVar2 = lVar;
            jVar = (c40.j) objN;
            if (jVar instanceof c40.j.Success) {
                List list2 = (List) ((c40.j.Success) jVar).b();
                h70.h.b.a(lVar2.errorReporter, h70.h.e.CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS, null, null, 6, null);
                lVar2.A0(new i0(list2, paymentMethod));
                lVar2.C0(lVar2.selectPaymentMethodState.getValue(), true);
            }
            failureA = c40.k.a(jVar);
            if (failureA != null) {
                if (failureA.getDisplayMessage() == null) {
                    cause = failureA.getCause();
                    if (cause instanceof StripeException) {
                        stripeException = (StripeException) cause;
                    } else {
                        stripeException = null;
                    }
                    if (stripeException != null) {
                        stripeError.getMessage();
                    }
                }
                h70.h.b.a(lVar2.errorReporter, h70.h.d.CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE, StripeException.INSTANCE.b(failureA.getCause()), null, 4, null);
                lVar2.l0();
            }
            return jn0.h0.f84049a;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w0(PaymentMethod paymentMethod, Continuation<? super c40.j<PaymentMethod>> continuation) {
        j0 j0Var;
        l lVar;
        l lVar2;
        c40.j jVar;
        c40.j.Failure failureA;
        Throwable cause;
        StripeException stripeException;
        StripeError stripeError;
        if (continuation instanceof j0) {
            j0Var = (j0) continuation;
            int i11 = j0Var.f49904r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j0Var.f49904r = i11 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(continuation);
            }
        } else {
            j0Var = new j0(continuation);
        }
        Object objN = j0Var.f49902p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = j0Var.f49904r;
        if (i12 == 0) {
            jn0.t.b(objN);
            j0Var.f49900n = this;
            j0Var.f49901o = paymentMethod;
            j0Var.f49904r = 1;
            objN = N(j0Var);
            if (objN != coroutine_suspended) {
                lVar = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            paymentMethod = (PaymentMethod) j0Var.f49901o;
            lVar = (l) j0Var.f49900n;
            jn0.t.b(objN);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentMethod = (PaymentMethod) j0Var.f49901o;
            lVar2 = (l) j0Var.f49900n;
            jn0.t.b(objN);
        }
        jVar = (c40.j) objN;
        if (jVar instanceof c40.j.Success) {
            lVar2.eventReporter.m();
        }
        failureA = c40.k.a(jVar);
        if (failureA != null) {
            if (failureA.getDisplayMessage() == null) {
                cause = failureA.getCause();
                if (cause instanceof StripeException) {
                    stripeException = (StripeException) cause;
                } else {
                    stripeException = null;
                }
                if (stripeException != null && (stripeError = stripeException.getStripeError()) != null) {
                    stripeError.getMessage();
                }
            }
            Throwable cause2 = failureA.getCause();
            lVar2.eventReporter.o();
            lVar2.logger.error("Failed to detach payment method: " + paymentMethod, cause2);
        }
        return jVar;
        String str = paymentMethod.id;
        p013kotlin.jvm.internal.s.h(str);
        j0Var.f49900n = lVar;
        j0Var.f49901o = paymentMethod;
        j0Var.f49904r = 2;
        objN = ((c40.n) objN).b(str, j0Var);
        if (objN != coroutine_suspended) {
            lVar2 = lVar;
            jVar = (c40.j) objN;
            if (jVar instanceof c40.j.Success) {
                lVar2.eventReporter.m();
            }
            failureA = c40.k.a(jVar);
            if (failureA != null) {
                if (failureA.getDisplayMessage() == null) {
                    cause = failureA.getCause();
                    if (cause instanceof StripeException) {
                        stripeException = (StripeException) cause;
                    } else {
                        stripeException = null;
                    }
                    if (stripeException != null) {
                        stripeError.getMessage();
                    }
                }
                Throwable cause3 = failureA.getCause();
                lVar2.eventReporter.o();
                lVar2.logger.error("Failed to detach payment method: " + paymentMethod, cause3);
            }
            return jVar;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(PaymentMethod paymentMethod) {
        CustomerState value = this.customerState.getValue();
        List<PaymentMethod> listI = value.i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            String str = ((PaymentMethod) obj).id;
            String str2 = paymentMethod.id;
            p013kotlin.jvm.internal.s.h(str2);
            if (!p013kotlin.jvm.internal.s.f(str, str2)) {
                arrayList.add(obj);
            }
        }
        w70.j currentSelection = value.getCurrentSelection();
        w70.j jVar = this.originalPaymentSelection;
        boolean z11 = (currentSelection instanceof w70.j.Saved) && p013kotlin.jvm.internal.s.f(((w70.j.Saved) currentSelection).getPaymentMethod().id, paymentMethod.id);
        if ((jVar instanceof w70.j.Saved) && p013kotlin.jvm.internal.s.f(((w70.j.Saved) jVar).getPaymentMethod().id, paymentMethod.id)) {
            this.originalPaymentSelection = null;
        }
        MutableStateFlow<CustomerState> mutableStateFlow = this.customerState;
        if (z11) {
            currentSelection = null;
        }
        if (currentSelection == null) {
            currentSelection = this.originalPaymentSelection;
        }
        mutableStateFlow.setValue(CustomerState.b(value, arrayList, currentSelection, null, null, null, 28, null));
    }

    private final void y0() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), this.workContext, null, new k0(null), 2, null);
    }

    private final void z0(w70.j.Saved savedPaymentSelection) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), this.workContext, null, new m0(savedPaymentSelection, null), 2, null);
    }

    public final boolean P() {
        Object value;
        ArrayList arrayList;
        if (!this.viewState.getValue().c(this.isFinancialConnectionsAvailable)) {
            return true;
        }
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            for (Object objF : list) {
                if (objF instanceof com.stripe.android.customersheet.n.AddPaymentMethod) {
                    objF = com.stripe.android.customersheet.n.AddPaymentMethod.f((com.stripe.android.customersheet.n.AddPaymentMethod) objF, null, null, null, null, null, null, null, false, false, false, null, false, null, false, null, null, false, true, null, null, 917503, null);
                }
                arrayList.add(objF);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
        return false;
    }

    public final StateFlow<com.stripe.android.customersheet.p> W() {
        return this.result;
    }

    public final StateFlow<com.stripe.android.customersheet.n> X() {
        return this.viewState;
    }

    public final void b0(com.stripe.android.customersheet.k viewAction) {
        p013kotlin.jvm.internal.s.k(viewAction, "viewAction");
        if (viewAction instanceof com.stripe.android.customersheet.k.h) {
            l0();
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.a) {
            e0();
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.e) {
            i0();
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.c) {
            g0();
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.i) {
            m0();
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.l) {
            p0(((com.stripe.android.customersheet.k.l) viewAction).getPaymentMethod());
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.n) {
            r0(((com.stripe.android.customersheet.k.n) viewAction).getPaymentMethod());
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.m) {
            q0(((com.stripe.android.customersheet.k.m) viewAction).getSelection());
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.o) {
            s0();
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.b) {
            f0(((com.stripe.android.customersheet.k.b) viewAction).getPaymentMethod());
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.C0808k) {
            o0(((com.stripe.android.customersheet.k.C0808k) viewAction).getFormFieldValues());
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.p) {
            G0(((com.stripe.android.customersheet.k.p) viewAction).a());
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.q) {
            com.stripe.android.customersheet.k.q qVar = (com.stripe.android.customersheet.k.q) viewAction;
            H0(qVar.getMandateText(), qVar.getShowAbovePrimaryButton());
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.f) {
            j0(((com.stripe.android.customersheet.k.f) viewAction).getBankAccountResult());
            return;
        }
        if (viewAction instanceof com.stripe.android.customersheet.k.g) {
            k0(((com.stripe.android.customersheet.k.g) viewAction).getUsBankAccount());
        } else if (viewAction instanceof com.stripe.android.customersheet.k.j) {
            n0(((com.stripe.android.customersheet.k.j) viewAction).getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String());
        } else if (viewAction instanceof com.stripe.android.customersheet.k.d) {
            h0();
        }
    }

    public final x30.c t0(String code) {
        x30.c displayName = null;
        if (code != null) {
            PaymentMethodMetadata metadata = this.customerState.getValue().getMetadata();
            SupportedPaymentMethod supportedPaymentMethodG = metadata != null ? metadata.G(code) : null;
            if (supportedPaymentMethodG != null) {
                displayName = supportedPaymentMethodG.getDisplayName();
            }
        }
        return x30.d.c(displayName);
    }

    public final void v0(h.b activityResultCaller, LifecycleOwner lifecycleOwner) {
        p013kotlin.jvm.internal.s.k(activityResultCaller, "activityResultCaller");
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        this.intentConfirmationHandler.P(activityResultCaller, lifecycleOwner);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(Application application, w70.j jVar, Provider<PaymentConfiguration> paymentConfigurationProvider, com.stripe.android.customersheet.d.Configuration configuration, com.stripe.android.customersheet.g.c integrationType, o30.d logger, z60.g stripeRepository, b40.b eventReporter, CoroutineContext workContext, wn0.a<Boolean> isLiveModeProvider, com.stripe.android.paymentsheet.h.d intentConfirmationHandlerFactory, h customerSheetLoader, l70.d isFinancialConnectionsAvailable, h80.t.a editInteractorFactory, h70.h errorReporter) {
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(paymentConfigurationProvider, "paymentConfigurationProvider");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(integrationType, "integrationType");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        p013kotlin.jvm.internal.s.k(eventReporter, "eventReporter");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(isLiveModeProvider, "isLiveModeProvider");
        p013kotlin.jvm.internal.s.k(intentConfirmationHandlerFactory, "intentConfirmationHandlerFactory");
        p013kotlin.jvm.internal.s.k(customerSheetLoader, "customerSheetLoader");
        p013kotlin.jvm.internal.s.k(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        p013kotlin.jvm.internal.s.k(editInteractorFactory, "editInteractorFactory");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        g40.a aVar = g40.a.f67321a;
        this(application, jVar, paymentConfigurationProvider, aVar.d(), aVar.c(), aVar.e(), configuration, integrationType, logger, stripeRepository, eventReporter, workContext, isLiveModeProvider, intentConfirmationHandlerFactory, customerSheetLoader, isFinancialConnectionsAvailable, editInteractorFactory, errorReporter);
    }
}

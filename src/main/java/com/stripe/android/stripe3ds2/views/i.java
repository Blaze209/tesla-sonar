package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w0;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.j0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import ezvcard.property.Gender;
import java.util.Map;
import jn0.h0;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.o0;
import u80.ErrorData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 S2\u00020\u0001:\u0001qBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b/\u0010.J\u0017\u00102\u001a\u00020\u001a2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J!\u00108\u001a\u00020\u001a2\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u001aH\u0016¢\u0006\u0004\b:\u0010\u001eJ\r\u0010;\u001a\u00020\u001a¢\u0006\u0004\b;\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010CR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010HR\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bR\u0010M\u001a\u0004\bS\u0010TR\u001b\u0010Y\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010M\u001a\u0004\bR\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001b\u0010a\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010M\u001a\u0004\b_\u0010`R\u001b\u0010e\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010M\u001a\u0004\bI\u0010dR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00148@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bN\u0010M\u001a\u0004\b[\u0010fR\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00168@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bg\u0010M\u001a\u0004\bW\u0010hR\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00188@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bi\u0010M\u001a\u0004\bc\u0010jR\u0014\u0010m\u001a\u00020k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010lR\u0014\u0010o\u001a\u00020Z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010nR\u0014\u0010p\u001a\u00020K8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010O¨\u0006r"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/i;", "Landroidx/fragment/app/Fragment;", "Lq80/m;", "uiCustomization", "Lt80/v;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/k;", "errorRequestExecutor", "Lr80/c;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/b;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transactions/d;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lq80/m;Lt80/v;Lcom/stripe/android/stripe3ds2/transaction/k;Lr80/c;Lcom/stripe/android/stripe3ds2/transaction/b;Lcom/stripe/android/stripe3ds2/transactions/d;Lcom/stripe/android/stripe3ds2/transaction/n;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/stripe3ds2/views/o;", "challengeZoneTextView", "Lcom/stripe/android/stripe3ds2/views/n;", "challengeZoneSelectView", "Lcom/stripe/android/stripe3ds2/views/q;", "challengeZoneWebView", "Ljn0/h0;", "n", "(Lcom/stripe/android/stripe3ds2/views/o;Lcom/stripe/android/stripe3ds2/views/n;Lcom/stripe/android/stripe3ds2/views/q;)V", "L", "()V", "t", "q", "Lcom/stripe/android/stripe3ds2/transaction/d;", "result", Gender.FEMALE, "(Lcom/stripe/android/stripe3ds2/transaction/d;)V", "Lcom/stripe/android/stripe3ds2/transactions/a;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/b;", "cresData", "I", "(Lcom/stripe/android/stripe3ds2/transactions/a;Lcom/stripe/android/stripe3ds2/transactions/b;)V", "Lu80/a;", "data", "H", "(Lu80/a;)V", "J", "", "throwable", "G", "(Ljava/lang/Throwable;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "K", "m", "Lq80/m;", "Lt80/v;", "o", "Lcom/stripe/android/stripe3ds2/transaction/k;", "p", "Lr80/c;", "Lcom/stripe/android/stripe3ds2/transaction/b;", "r", "Lcom/stripe/android/stripe3ds2/transactions/d;", "s", "Lcom/stripe/android/stripe3ds2/transaction/n;", "Lkotlin/coroutines/CoroutineContext;", "u", "Lcom/stripe/android/stripe3ds2/transactions/b;", "", "v", "Lkotlin/Lazy;", "B", "()Ljava/lang/String;", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/views/d;", "w", "E", "()Lcom/stripe/android/stripe3ds2/views/d;", "viewModel", "Lcom/stripe/android/stripe3ds2/views/e;", "x", "()Lcom/stripe/android/stripe3ds2/views/e;", "challengeEntryViewFactory", "Lo80/c;", "y", "Lo80/c;", "_viewBinding", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "z", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "challengeZoneView", "Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "A", "()Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "brandZoneView", "()Lcom/stripe/android/stripe3ds2/views/o;", "C", "()Lcom/stripe/android/stripe3ds2/views/n;", "D", "()Lcom/stripe/android/stripe3ds2/views/q;", "Lcom/stripe/android/stripe3ds2/transaction/a;", "()Lcom/stripe/android/stripe3ds2/transaction/a;", "challengeAction", "()Lo80/c;", "viewBinding", "userEntry", "a", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i extends Fragment {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final Lazy brandZoneView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Lazy challengeZoneTextView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final Lazy challengeZoneSelectView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final Lazy challengeZoneWebView;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final q80.m uiCustomization;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final t80.v transactionTimer;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.transaction.b challengeActionHandler;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.transactions.d initialUiType;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final IntentData intentData;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private ChallengeResponseData cresData;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy uiTypeCode;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy challengeEntryViewFactory;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private o80.c _viewBinding;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy challengeZoneView;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54267a;

        static {
            int[] iArr = new int[com.stripe.android.stripe3ds2.transactions.d.values().length];
            try {
                iArr[com.stripe.android.stripe3ds2.transactions.d.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.stripe.android.stripe3ds2.transactions.d.SingleSelect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.stripe.android.stripe3ds2.transactions.d.MultiSelect.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.stripe.android.stripe3ds2.transactions.d.Html.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.stripe.android.stripe3ds2.transactions.d.OutOfBand.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f54267a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "b", "()Lcom/stripe/android/stripe3ds2/views/BrandZoneView;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<BrandZoneView> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BrandZoneView invoke() {
            BrandZoneView caBrandZone = i.this.D().f96849b;
            p013kotlin.jvm.internal.s.j(caBrandZone, "caBrandZone");
            return caBrandZone;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/e;", "b", "()Lcom/stripe/android/stripe3ds2/views/e;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<com.stripe.android.stripe3ds2.views.e> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.e invoke() {
            androidx.fragment.app.u uVarRequireActivity = i.this.requireActivity();
            p013kotlin.jvm.internal.s.j(uVarRequireActivity, "requireActivity(...)");
            return new com.stripe.android.stripe3ds2.views.e(uVarRequireActivity);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/n;", "b", "()Lcom/stripe/android/stripe3ds2/views/n;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<com.stripe.android.stripe3ds2.views.n> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.n invoke() {
            ChallengeResponseData challengeResponseData = i.this.cresData;
            ChallengeResponseData challengeResponseData2 = null;
            if (challengeResponseData == null) {
                p013kotlin.jvm.internal.s.B("cresData");
                challengeResponseData = null;
            }
            if (challengeResponseData.getUiType() != com.stripe.android.stripe3ds2.transactions.d.SingleSelect) {
                ChallengeResponseData challengeResponseData3 = i.this.cresData;
                if (challengeResponseData3 == null) {
                    p013kotlin.jvm.internal.s.B("cresData");
                    challengeResponseData3 = null;
                }
                if (challengeResponseData3.getUiType() != com.stripe.android.stripe3ds2.transactions.d.MultiSelect) {
                    return null;
                }
            }
            com.stripe.android.stripe3ds2.views.e eVarW = i.this.w();
            ChallengeResponseData challengeResponseData4 = i.this.cresData;
            if (challengeResponseData4 == null) {
                p013kotlin.jvm.internal.s.B("cresData");
            } else {
                challengeResponseData2 = challengeResponseData4;
            }
            return eVarW.a(challengeResponseData2, i.this.uiCustomization);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/o;", "b", "()Lcom/stripe/android/stripe3ds2/views/o;"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<com.stripe.android.stripe3ds2.views.o> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.o invoke() {
            ChallengeResponseData challengeResponseData = i.this.cresData;
            ChallengeResponseData challengeResponseData2 = null;
            if (challengeResponseData == null) {
                p013kotlin.jvm.internal.s.B("cresData");
                challengeResponseData = null;
            }
            if (challengeResponseData.getUiType() != com.stripe.android.stripe3ds2.transactions.d.Text) {
                return null;
            }
            com.stripe.android.stripe3ds2.views.e eVarW = i.this.w();
            ChallengeResponseData challengeResponseData3 = i.this.cresData;
            if (challengeResponseData3 == null) {
                p013kotlin.jvm.internal.s.B("cresData");
            } else {
                challengeResponseData2 = challengeResponseData3;
            }
            return eVarW.b(challengeResponseData2, i.this.uiCustomization);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "b", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.a<ChallengeZoneView> {
        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChallengeZoneView invoke() {
            ChallengeZoneView caChallengeZone = i.this.D().f96850c;
            p013kotlin.jvm.internal.s.j(caChallengeZone, "caChallengeZone");
            return caChallengeZone;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/q;", "b", "()Lcom/stripe/android/stripe3ds2/views/q;"}, k = 3, mv = {1, 9, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.a<com.stripe.android.stripe3ds2.views.q> {
        h() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.stripe3ds2.views.q invoke() {
            ChallengeResponseData challengeResponseData = i.this.cresData;
            ChallengeResponseData challengeResponseData2 = null;
            if (challengeResponseData == null) {
                p013kotlin.jvm.internal.s.B("cresData");
                challengeResponseData = null;
            }
            if (challengeResponseData.getUiType() != com.stripe.android.stripe3ds2.transactions.d.Html) {
                return null;
            }
            com.stripe.android.stripe3ds2.views.e eVarW = i.this.w();
            ChallengeResponseData challengeResponseData3 = i.this.cresData;
            if (challengeResponseData3 == null) {
                p013kotlin.jvm.internal.s.B("cresData");
            } else {
                challengeResponseData2 = challengeResponseData3;
            }
            return eVarW.c(challengeResponseData2);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.views.i$i, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "challengeText", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class C1086i extends p013kotlin.jvm.internal.u implements wn0.l<String, h0> {
        C1086i() {
            super(1);
        }

        public final void a(String str) {
            com.stripe.android.stripe3ds2.views.o oVarY = i.this.y();
            if (oVarY != null) {
                p013kotlin.jvm.internal.s.h(str);
                oVarY.setText(str);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(String str) {
            a(str);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljn0/h0;", "kotlin.jvm.PlatformType", "it", "a", "(Ljn0/h0;)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.l<h0, h0> {
        j() {
            super(1);
        }

        public final void a(h0 h0Var) {
            i.this.K();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(h0 h0Var) {
            a(h0Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/d;", "kotlin.jvm.PlatformType", "challengeRequestResult", "Ljn0/h0;", "a", "(Lcom/stripe/android/stripe3ds2/transaction/d;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.l<com.stripe.android.stripe3ds2.transaction.d, h0> {
        k() {
            super(1);
        }

        public final void a(com.stripe.android.stripe3ds2.transaction.d dVar) {
            if (dVar != null) {
                i.this.F(dVar);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(com.stripe.android.stripe3ds2.transaction.d dVar) {
            a(dVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class l implements j0, p013kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ wn0.l f54277a;

        l(wn0.l function) {
            p013kotlin.jvm.internal.s.k(function, "function");
            this.f54277a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof j0) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return p013kotlin.jvm.internal.s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return this.f54277a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p003lifecycle.j0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f54277a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class m extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f54278c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Fragment fragment) {
            super(0);
            this.f54278c = fragment;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.f54278c.requireActivity().getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
            p013kotlin.jvm.internal.s.j(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class n extends p013kotlin.jvm.internal.u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f54279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Fragment f54280d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(wn0.a aVar, Fragment fragment) {
            super(0);
            this.f54279c = aVar;
            this.f54280d = fragment;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f54279c;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.f54280d.requireActivity().getDefaultViewModelCreationExtras();
            p013kotlin.jvm.internal.s.j(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class o extends p013kotlin.jvm.internal.u implements wn0.a<String> {
        o() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            ChallengeResponseData challengeResponseData = i.this.cresData;
            if (challengeResponseData == null) {
                p013kotlin.jvm.internal.s.B("cresData");
                challengeResponseData = null;
            }
            com.stripe.android.stripe3ds2.transactions.d uiType = challengeResponseData.getUiType();
            String code = uiType != null ? uiType.getCode() : null;
            return code == null ? "" : code;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "bitmap", "Ljn0/h0;", "a", "(Landroid/graphics/Bitmap;)V"}, k = 3, mv = {1, 9, 0})
    static final class p extends p013kotlin.jvm.internal.u implements wn0.l<Bitmap, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f54282c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(ImageView imageView) {
            super(1);
            this.f54282c = imageView;
        }

        public final void a(Bitmap bitmap) {
            if (bitmap == null) {
                this.f54282c.setVisibility(8);
            } else {
                this.f54282c.setVisibility(0);
                this.f54282c.setImageBitmap(bitmap);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Bitmap bitmap) {
            a(bitmap);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class q extends p013kotlin.jvm.internal.u implements wn0.a<ViewModelProvider.Factory> {
        q() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return new com.stripe.android.stripe3ds2.views.d.b(i.this.challengeActionHandler, i.this.transactionTimer, i.this.errorReporter, i.this.workContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q80.m uiCustomization, t80.v transactionTimer, com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor, r80.c errorReporter, com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, com.stripe.android.stripe3ds2.transactions.d dVar, IntentData intentData, CoroutineContext workContext) {
        super(n80.e.f93660c);
        p013kotlin.jvm.internal.s.k(uiCustomization, "uiCustomization");
        p013kotlin.jvm.internal.s.k(transactionTimer, "transactionTimer");
        p013kotlin.jvm.internal.s.k(errorRequestExecutor, "errorRequestExecutor");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(challengeActionHandler, "challengeActionHandler");
        p013kotlin.jvm.internal.s.k(intentData, "intentData");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.uiCustomization = uiCustomization;
        this.transactionTimer = transactionTimer;
        this.errorRequestExecutor = errorRequestExecutor;
        this.errorReporter = errorReporter;
        this.challengeActionHandler = challengeActionHandler;
        this.initialUiType = dVar;
        this.intentData = intentData;
        this.workContext = workContext;
        this.uiTypeCode = jn0.m.b(new o());
        this.viewModel = w0.b(this, o0.b(com.stripe.android.stripe3ds2.views.d.class), new m(this), new n(null, this), new q());
        this.challengeEntryViewFactory = jn0.m.b(new d());
        this.challengeZoneView = jn0.m.b(new g());
        this.brandZoneView = jn0.m.b(new c());
        this.challengeZoneTextView = jn0.m.b(new f());
        this.challengeZoneSelectView = jn0.m.b(new e());
        this.challengeZoneWebView = jn0.m.b(new h());
    }

    private final String B() {
        return (String) this.uiTypeCode.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(com.stripe.android.stripe3ds2.transaction.d result) {
        if (result instanceof com.stripe.android.stripe3ds2.transaction.d.Success) {
            com.stripe.android.stripe3ds2.transaction.d.Success success = (com.stripe.android.stripe3ds2.transaction.d.Success) result;
            I(success.getCreqData(), success.getCresData());
        } else if (result instanceof com.stripe.android.stripe3ds2.transaction.d.ProtocolError) {
            H(((com.stripe.android.stripe3ds2.transaction.d.ProtocolError) result).getData());
        } else if (result instanceof com.stripe.android.stripe3ds2.transaction.d.RuntimeError) {
            G(((com.stripe.android.stripe3ds2.transaction.d.RuntimeError) result).getThrowable());
        } else if (result instanceof com.stripe.android.stripe3ds2.transaction.d.Timeout) {
            J(((com.stripe.android.stripe3ds2.transaction.d.Timeout) result).getData());
        }
    }

    private final void G(Throwable throwable) {
        E().q(new com.stripe.android.stripe3ds2.transaction.h.RuntimeError(throwable, this.initialUiType, this.intentData));
    }

    private final void H(ErrorData data) {
        E().q(new com.stripe.android.stripe3ds2.transaction.h.ProtocolError(data, this.initialUiType, this.intentData));
        E().w();
        this.errorRequestExecutor.a(data);
    }

    private final void I(ChallengeRequestData creqData, ChallengeResponseData cresData) {
        com.stripe.android.stripe3ds2.transaction.h succeeded;
        if (!cresData.getIsChallengeCompleted()) {
            E().s(cresData);
            return;
        }
        E().w();
        if (creqData.getCancelReason() != null) {
            succeeded = new com.stripe.android.stripe3ds2.transaction.h.Canceled(B(), this.initialUiType, this.intentData);
        } else {
            String transStatus = cresData.getTransStatus();
            if (transStatus == null) {
                transStatus = "";
            }
            succeeded = p013kotlin.jvm.internal.s.f("Y", transStatus) ? new com.stripe.android.stripe3ds2.transaction.h.Succeeded(B(), this.initialUiType, this.intentData) : new com.stripe.android.stripe3ds2.transaction.h.Failed(B(), this.initialUiType, this.intentData);
        }
        E().q(succeeded);
    }

    private final void J(ErrorData data) {
        E().w();
        this.errorRequestExecutor.a(data);
        E().q(new com.stripe.android.stripe3ds2.transaction.h.Timeout(B(), this.initialUiType, this.intentData));
    }

    private final void L() {
        BrandZoneView caBrandZone = D().f96849b;
        p013kotlin.jvm.internal.s.j(caBrandZone, "caBrandZone");
        ImageView issuerImageView = caBrandZone.getIssuerImageView();
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            p013kotlin.jvm.internal.s.B("cresData");
            challengeResponseData = null;
        }
        Pair pairA = jn0.x.a(issuerImageView, challengeResponseData.getIssuerImage());
        ImageView paymentSystemImageView = caBrandZone.getPaymentSystemImageView();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            p013kotlin.jvm.internal.s.B("cresData");
        } else {
            challengeResponseData2 = challengeResponseData3;
        }
        for (Map.Entry entry : v0.m(pairA, jn0.x.a(paymentSystemImageView, challengeResponseData2.getPaymentSystemImage())).entrySet()) {
            E().j((ChallengeResponseData.Image) entry.getValue(), getResources().getDisplayMetrics().densityDpi).observe(getViewLifecycleOwner(), new l(new p((ImageView) entry.getKey())));
        }
    }

    private final void n(com.stripe.android.stripe3ds2.views.o challengeZoneTextView, com.stripe.android.stripe3ds2.views.n challengeZoneSelectView, com.stripe.android.stripe3ds2.views.q challengeZoneWebView) {
        ChallengeResponseData challengeResponseData = null;
        if (challengeZoneTextView != null) {
            z().setChallengeEntryView(challengeZoneTextView);
            ChallengeZoneView challengeZoneViewZ = z();
            ChallengeResponseData challengeResponseData2 = this.cresData;
            if (challengeResponseData2 == null) {
                p013kotlin.jvm.internal.s.B("cresData");
                challengeResponseData2 = null;
            }
            challengeZoneViewZ.setSubmitButton(challengeResponseData2.getSubmitAuthenticationLabel(), this.uiCustomization.c(q80.q.a.SUBMIT));
            ChallengeZoneView challengeZoneViewZ2 = z();
            ChallengeResponseData challengeResponseData3 = this.cresData;
            if (challengeResponseData3 == null) {
                p013kotlin.jvm.internal.s.B("cresData");
            } else {
                challengeResponseData = challengeResponseData3;
            }
            challengeZoneViewZ2.setResendButtonLabel(challengeResponseData.getResendInformationLabel(), this.uiCustomization.c(q80.q.a.RESEND));
        } else if (challengeZoneSelectView != null) {
            z().setChallengeEntryView(challengeZoneSelectView);
            ChallengeZoneView challengeZoneViewZ3 = z();
            ChallengeResponseData challengeResponseData4 = this.cresData;
            if (challengeResponseData4 == null) {
                p013kotlin.jvm.internal.s.B("cresData");
                challengeResponseData4 = null;
            }
            challengeZoneViewZ3.setSubmitButton(challengeResponseData4.getSubmitAuthenticationLabel(), this.uiCustomization.c(q80.q.a.NEXT));
            ChallengeZoneView challengeZoneViewZ4 = z();
            ChallengeResponseData challengeResponseData5 = this.cresData;
            if (challengeResponseData5 == null) {
                p013kotlin.jvm.internal.s.B("cresData");
            } else {
                challengeResponseData = challengeResponseData5;
            }
            challengeZoneViewZ4.setResendButtonLabel(challengeResponseData.getResendInformationLabel(), this.uiCustomization.c(q80.q.a.RESEND));
        } else if (challengeZoneWebView != null) {
            z().setChallengeEntryView(challengeZoneWebView);
            z().setInfoHeaderText(null, null);
            z().setInfoText(null, null);
            z().setSubmitButton(null, null);
            challengeZoneWebView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.p(this.f54250a, view);
                }
            });
            u().setVisibility(8);
        } else {
            ChallengeResponseData challengeResponseData6 = this.cresData;
            if (challengeResponseData6 == null) {
                p013kotlin.jvm.internal.s.B("cresData");
                challengeResponseData6 = null;
            }
            if (challengeResponseData6.getUiType() == com.stripe.android.stripe3ds2.transactions.d.OutOfBand) {
                ChallengeZoneView challengeZoneViewZ5 = z();
                ChallengeResponseData challengeResponseData7 = this.cresData;
                if (challengeResponseData7 == null) {
                    p013kotlin.jvm.internal.s.B("cresData");
                } else {
                    challengeResponseData = challengeResponseData7;
                }
                challengeZoneViewZ5.setSubmitButton(challengeResponseData.getOobContinueLabel(), this.uiCustomization.c(q80.q.a.CONTINUE));
            }
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(i this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        this$0.E().u(this$0.v());
    }

    private final void q() {
        ChallengeZoneView challengeZoneViewZ = z();
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            p013kotlin.jvm.internal.s.B("cresData");
            challengeResponseData = null;
        }
        challengeZoneViewZ.setInfoHeaderText(challengeResponseData.getChallengeInfoHeader(), this.uiCustomization.d());
        ChallengeZoneView challengeZoneViewZ2 = z();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            p013kotlin.jvm.internal.s.B("cresData");
            challengeResponseData3 = null;
        }
        challengeZoneViewZ2.setInfoText(challengeResponseData3.getChallengeInfoText(), this.uiCustomization.d());
        ChallengeZoneView challengeZoneViewZ3 = z();
        ChallengeResponseData challengeResponseData4 = this.cresData;
        if (challengeResponseData4 == null) {
            p013kotlin.jvm.internal.s.B("cresData");
            challengeResponseData4 = null;
        }
        challengeZoneViewZ3.setInfoTextIndicator(challengeResponseData4.getShouldShowChallengeInfoTextIndicator() ? n80.c.f93627d : 0);
        ChallengeZoneView challengeZoneViewZ4 = z();
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            p013kotlin.jvm.internal.s.B("cresData");
        } else {
            challengeResponseData2 = challengeResponseData5;
        }
        challengeZoneViewZ4.setWhitelistingLabel(challengeResponseData2.getWhitelistingInfoText(), this.uiCustomization.d(), this.uiCustomization.c(q80.q.a.SELECT));
        z().setSubmitButtonClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.r(this.f54251a, view);
            }
        });
        z().setResendButtonClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.s(this.f54252a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(i this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        this$0.E().u(this$0.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(i this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        this$0.E().x(com.stripe.android.stripe3ds2.transaction.a.e.f53963a);
    }

    private final void t() {
        InformationZoneView caInformationZone = D().f96851d;
        p013kotlin.jvm.internal.s.j(caInformationZone, "caInformationZone");
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            p013kotlin.jvm.internal.s.B("cresData");
            challengeResponseData = null;
        }
        String whyInfoLabel = challengeResponseData.getWhyInfoLabel();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            p013kotlin.jvm.internal.s.B("cresData");
            challengeResponseData3 = null;
        }
        caInformationZone.setWhyInfo(whyInfoLabel, challengeResponseData3.getWhyInfoText(), this.uiCustomization.d());
        ChallengeResponseData challengeResponseData4 = this.cresData;
        if (challengeResponseData4 == null) {
            p013kotlin.jvm.internal.s.B("cresData");
            challengeResponseData4 = null;
        }
        String expandInfoLabel = challengeResponseData4.getExpandInfoLabel();
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            p013kotlin.jvm.internal.s.B("cresData");
        } else {
            challengeResponseData2 = challengeResponseData5;
        }
        caInformationZone.setExpandInfo(expandInfoLabel, challengeResponseData2.getExpandInfoText(), this.uiCustomization.d());
        String strA = this.uiCustomization.a();
        if (strA != null) {
            caInformationZone.setToggleColor$3ds2sdk_release(Color.parseColor(strA));
        }
    }

    private final BrandZoneView u() {
        return (BrandZoneView) this.brandZoneView.getValue();
    }

    private final com.stripe.android.stripe3ds2.transaction.a v() {
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData == null) {
            p013kotlin.jvm.internal.s.B("cresData");
            challengeResponseData = null;
        }
        com.stripe.android.stripe3ds2.transactions.d uiType = challengeResponseData.getUiType();
        int i11 = uiType == null ? -1 : b.f54267a[uiType.ordinal()];
        if (i11 != 4) {
            return i11 != 5 ? new com.stripe.android.stripe3ds2.transaction.a.NativeForm(C()) : com.stripe.android.stripe3ds2.transaction.a.d.f53962a;
        }
        return new com.stripe.android.stripe3ds2.transaction.a.HtmlForm(C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.stripe3ds2.views.e w() {
        return (com.stripe.android.stripe3ds2.views.e) this.challengeEntryViewFactory.getValue();
    }

    private final ChallengeZoneView z() {
        return (ChallengeZoneView) this.challengeZoneView.getValue();
    }

    public final com.stripe.android.stripe3ds2.views.q A() {
        return (com.stripe.android.stripe3ds2.views.q) this.challengeZoneWebView.getValue();
    }

    public final String C() {
        ChallengeResponseData challengeResponseData = this.cresData;
        String userEntry = null;
        if (challengeResponseData == null) {
            p013kotlin.jvm.internal.s.B("cresData");
            challengeResponseData = null;
        }
        com.stripe.android.stripe3ds2.transactions.d uiType = challengeResponseData.getUiType();
        int i11 = uiType == null ? -1 : b.f54267a[uiType.ordinal()];
        if (i11 == 1) {
            com.stripe.android.stripe3ds2.views.o oVarY = y();
            if (oVarY != null) {
                userEntry = oVarY.getUserEntry();
            }
        } else if (i11 == 2 || i11 == 3) {
            com.stripe.android.stripe3ds2.views.n nVarX = x();
            if (nVarX != null) {
                userEntry = nVarX.getUserEntry();
            }
        } else if (i11 != 4) {
            userEntry = "";
        } else {
            com.stripe.android.stripe3ds2.views.q qVarA = A();
            if (qVarA != null) {
                userEntry = qVarA.getUserEntry();
            }
        }
        return userEntry == null ? "" : userEntry;
    }

    public final o80.c D() {
        o80.c cVar = this._viewBinding;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final com.stripe.android.stripe3ds2.views.d E() {
        return (com.stripe.android.stripe3ds2.views.d) this.viewModel.getValue();
    }

    public final void K() {
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            p013kotlin.jvm.internal.s.B("cresData");
            challengeResponseData = null;
        }
        if (challengeResponseData.getUiType() == com.stripe.android.stripe3ds2.transactions.d.Html) {
            ChallengeResponseData challengeResponseData3 = this.cresData;
            if (challengeResponseData3 == null) {
                p013kotlin.jvm.internal.s.B("cresData");
                challengeResponseData3 = null;
            }
            String acsHtmlRefresh = challengeResponseData3.getAcsHtmlRefresh();
            if (acsHtmlRefresh != null && !p013kotlin.text.t.y0(acsHtmlRefresh)) {
                com.stripe.android.stripe3ds2.views.q qVarA = A();
                if (qVarA != null) {
                    ChallengeResponseData challengeResponseData4 = this.cresData;
                    if (challengeResponseData4 == null) {
                        p013kotlin.jvm.internal.s.B("cresData");
                    } else {
                        challengeResponseData2 = challengeResponseData4;
                    }
                    qVarA.c(challengeResponseData2.getAcsHtmlRefresh());
                    return;
                }
                return;
            }
        }
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            p013kotlin.jvm.internal.s.B("cresData");
            challengeResponseData5 = null;
        }
        if (challengeResponseData5.getUiType() == com.stripe.android.stripe3ds2.transactions.d.OutOfBand) {
            ChallengeResponseData challengeResponseData6 = this.cresData;
            if (challengeResponseData6 == null) {
                p013kotlin.jvm.internal.s.B("cresData");
                challengeResponseData6 = null;
            }
            String challengeAdditionalInfoText = challengeResponseData6.getChallengeAdditionalInfoText();
            if (challengeAdditionalInfoText == null || p013kotlin.text.t.y0(challengeAdditionalInfoText)) {
                return;
            }
            ChallengeZoneView challengeZoneViewZ = z();
            ChallengeResponseData challengeResponseData7 = this.cresData;
            if (challengeResponseData7 == null) {
                p013kotlin.jvm.internal.s.B("cresData");
            } else {
                challengeResponseData2 = challengeResponseData7;
            }
            challengeZoneViewZ.setInfoText(challengeResponseData2.getChallengeAdditionalInfoText(), this.uiCustomization.d());
            z().setInfoTextIndicator(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._viewBinding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        p013kotlin.jvm.internal.s.k(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        ChallengeResponseData challengeResponseData = arguments != null ? (ChallengeResponseData) q5.c.a(arguments, "arg_cres", ChallengeResponseData.class) : null;
        if (challengeResponseData == null) {
            G(new IllegalArgumentException("Could not start challenge screen. Challenge response data was null."));
            return;
        }
        this.cresData = challengeResponseData;
        this._viewBinding = o80.c.a(view);
        E().i().observe(getViewLifecycleOwner(), new l(new C1086i()));
        E().l().observe(getViewLifecycleOwner(), new l(new j()));
        E().h().observe(getViewLifecycleOwner(), new l(new k()));
        L();
        n(y(), x(), A());
        t();
    }

    public final com.stripe.android.stripe3ds2.views.n x() {
        return (com.stripe.android.stripe3ds2.views.n) this.challengeZoneSelectView.getValue();
    }

    public final com.stripe.android.stripe3ds2.views.o y() {
        return (com.stripe.android.stripe3ds2.views.o) this.challengeZoneTextView.getValue();
    }
}

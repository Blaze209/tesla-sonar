package i50;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.URLUtil;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.PartnerAuthError;
import com.stripe.android.financialconnections.exception.WebAuthFlowFailedException;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.Display;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import ezvcard.property.Gender;
import h50.NoticeSheetState;
import j40.FinancialConnectionsEvent;
import java.util.Date;
import java.util.Iterator;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import m50.MixedOAuthParams;
import n40.b1;
import n40.l1;
import n40.p0;
import n40.x0;
import n40.z0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import q50.TopAppBarStateUpdate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\b\u0000\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003jklB\u0095\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0001\u0010!\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010(J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010,J\u0017\u0010/\u001a\u00020*2\u0006\u0010.\u001a\u00020\rH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020*2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u0004\u0018\u00010\r*\u000201H\u0002¢\u0006\u0004\b5\u00106J*\u0010:\u001a\u00020*2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\b\u00109\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0004\b:\u0010;J\u001a\u0010<\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u00020*2\u0006\u00102\u001a\u000201H\u0082@¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020*2\u0006\u00107\u001a\u00020\rH\u0082@¢\u0006\u0004\b@\u0010=J\u000f\u0010A\u001a\u00020*H\u0002¢\u0006\u0004\bA\u0010,J\u0019\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010B\u001a\u00020\u0002H\u0016¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020*¢\u0006\u0004\bF\u0010,J\u0015\u0010I\u001a\u00020*2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020&2\u0006\u0010K\u001a\u00020\r¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020*¢\u0006\u0004\bN\u0010,J\r\u0010O\u001a\u00020&¢\u0006\u0004\bO\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010fR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010gR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010hR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010i¨\u0006m"}, d2 = {"Li50/b;", "Ls50/i;", "Li50/e;", "Ln40/g;", "completeAuthorizationSession", "Ln40/b1;", "createAuthorizationSession", "Ln40/e;", "cancelAuthorizationSession", "Ln40/l1;", "retrieveAuthorizationSession", "Lj40/f;", "eventTracker", "", "applicationId", "Lz50/p;", "uriUtils", "Ln40/z0;", "postAuthSessionEvent", "Ln40/b0;", "getOrFetchSync", "Lk40/a;", "browserManager", "Ln40/d0;", "handleError", "Lo50/f;", "navigationManager", "Ln40/x0;", "pollAuthorizationSessionOAuthResults", "Lo30/d;", "logger", "Lh50/f;", "presentSheet", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "<init>", "(Ln40/g;Ln40/b1;Ln40/e;Ln40/l1;Lj40/f;Ljava/lang/String;Lz50/p;Ln40/z0;Ln40/b0;Lk40/a;Ln40/d0;Lo50/f;Ln40/x0;Lo30/d;Lh50/f;Li50/e;Ln40/p0;)V", "Lkotlinx/coroutines/Job;", "W", "()Lkotlinx/coroutines/Job;", Gender.UNKNOWN, "Ljn0/h0;", "L", "()V", "J", "sessionId", "V", "(Ljava/lang/String;)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "authSession", "K", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V", "G", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)Ljava/lang/String;", ImagesContract.URL, "message", AnalyticsAttribute.Reason, Gender.NONE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Gender.MALE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "H", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "T", "state", "Lq50/c;", "X", "(Li50/e;)Lq50/c;", "Q", "Ls50/j;", "webStatus", "S", "(Ls50/j;)V", "uri", "P", "(Ljava/lang/String;)Lkotlinx/coroutines/Job;", "R", Gender.OTHER, "v", "Ln40/g;", "w", "Ln40/b1;", "x", "Ln40/e;", "y", "Ln40/l1;", "z", "Lj40/f;", "A", "Ljava/lang/String;", "B", "Lz50/p;", "C", "Ln40/z0;", "D", "Ln40/b0;", "E", "Lk40/a;", Gender.FEMALE, "Ln40/d0;", "Lo50/f;", "Ln40/x0;", "Lo30/d;", "Lh50/f;", "a", "b", "c", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b extends s50.i<SharedPartnerAuthState> {

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int L = 8;
    private static final FinancialConnectionsSessionManifest.Pane M = FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final String applicationId;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final z50.p uriUtils;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final z0 postAuthSessionEvent;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final n40.b0 getOrFetchSync;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final k40.a browserManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final n40.d0 handleError;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final x0 pollAuthorizationSessionOAuthResults;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final h50.f presentSheet;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final n40.g completeAuthorizationSession;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final b1 createAuthorizationSession;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final n40.e cancelAuthorizationSession;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final l1 retrieveAuthorizationSession;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: i50.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Li50/b$a;", "Landroid/os/Parcelable;", "", "inModal", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "<init>", "(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "()Z", "b", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new C1584a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean inModal;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FinancialConnectionsSessionManifest.Pane pane;

        /* JADX INFO: renamed from: i50.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C1584a implements Parcelable.Creator<Args> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Args createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Args(parcel.readInt() != 0, FinancialConnectionsSessionManifest.Pane.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(boolean z11, FinancialConnectionsSessionManifest.Pane pane) {
            p013kotlin.jvm.internal.s.k(pane, "pane");
            this.inModal = z11;
            this.pane = pane;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getInModal() {
            return this.inModal;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FinancialConnectionsSessionManifest.Pane getPane() {
            return this.pane;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.inModal == args.inModal && this.pane == args.pane;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.inModal) * 31) + this.pane.hashCode();
        }

        public String toString() {
            return "Args(inModal=" + this.inModal + ", pane=" + this.pane + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeInt(this.inModal ? 1 : 0);
            parcel.writeString(this.pane.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onWebAuthFlowFinished$1", f = "PartnerAuthViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class a0 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75905n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ s50.j f75906o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b f75907p;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e;", "a", "(Li50/e;)Li50/e;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, SharedPartnerAuthState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f75908c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SharedPartnerAuthState invoke(SharedPartnerAuthState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return SharedPartnerAuthState.b(setState, null, null, null, new s50.a.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.EnumC1587a.AUTHENTICATING)), false, 23, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(s50.j jVar, b bVar, Continuation<? super a0> continuation) {
            super(2, continuation);
            this.f75906o = jVar;
            this.f75907p = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a0(this.f75906o, this.f75907p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        
            if (r1.M(r6, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        
            if (r1.N(r6, r2, r4, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        
            if (r6.I(r1, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
        
            return r0;
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
                int r1 = r5.f75905n
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
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
                goto L89
            L1e:
                jn0.t.b(r6)
                s50.j r6 = r5.f75906o
                boolean r1 = r6 instanceof s50.j.Canceled
                if (r1 == 0) goto L38
                i50.b r1 = r5.f75907p
                s50.j$a r6 = (s50.j.Canceled) r6
                java.lang.String r6 = r6.getUrl()
                r5.f75905n = r4
                java.lang.Object r6 = i50.b.B(r1, r6, r5)
                if (r6 != r0) goto L89
                goto L83
            L38:
                boolean r1 = r6 instanceof s50.j.Failed
                if (r1 == 0) goto L5d
                i50.b r1 = r5.f75907p
                s50.j$b r6 = (s50.j.Failed) r6
                java.lang.String r6 = r6.getUrl()
                s50.j r2 = r5.f75906o
                s50.j$b r2 = (s50.j.Failed) r2
                java.lang.String r2 = r2.getMessage()
                s50.j r4 = r5.f75906o
                s50.j$b r4 = (s50.j.Failed) r4
                java.lang.String r4 = r4.getReason()
                r5.f75905n = r3
                java.lang.Object r6 = i50.b.C(r1, r6, r2, r4, r5)
                if (r6 != r0) goto L89
                goto L83
            L5d:
                s50.j$c r1 = s50.j.c.f110332a
                boolean r1 = p013kotlin.jvm.internal.s.f(r6, r1)
                if (r1 == 0) goto L6d
                i50.b r6 = r5.f75907p
                i50.b$a0$a r0 = i50.b.a0.a.f75908c
                i50.b.F(r6, r0)
                goto L89
            L6d:
                boolean r1 = r6 instanceof s50.j.Success
                if (r1 == 0) goto L84
                i50.b r6 = r5.f75907p
                s50.j r1 = r5.f75906o
                s50.j$d r1 = (s50.j.Success) r1
                java.lang.String r1 = r1.getUrl()
                r5.f75905n = r2
                java.lang.Object r6 = i50.b.p(r6, r1, r5)
                if (r6 != r0) goto L89
            L83:
                return r0
            L84:
                s50.j$e r0 = s50.j.e.f110334a
                p013kotlin.jvm.internal.s.f(r6, r0)
            L89:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: i50.b.a0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a0) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: i50.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Li50/b$b;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Li50/b$a;", "args", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;Li50/b$a;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: i50.b$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Li50/b;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Li50/b;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<CreationExtras, b> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f75909c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Args f75910d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar, Args args) {
                super(1);
                this.f75909c = pVar;
                this.f75910d = args;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b invoke(CreationExtras initializer) {
                p013kotlin.jvm.internal.s.k(initializer, "$this$initializer");
                return this.f75909c.b().a(new SharedPartnerAuthState(this.f75910d));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent, Args args) {
            p013kotlin.jvm.internal.s.k(parentComponent, "parentComponent");
            p013kotlin.jvm.internal.s.k(args, "args");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(b.class), new a(parentComponent, args));
            return bVar.b();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e$c;", "<anonymous>", "()Li50/e$c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$recreateAuthSession$1", f = "PartnerAuthViewModel.kt", i = {0, 1, 1}, l = {132, 134}, m = "invokeSuspend", n = {"launchedEvent", "launchedEvent", "manifest"}, s = {"L$0", "L$0", "L$1"})
    static final class b0 extends SuspendLambda implements wn0.l<Continuation<? super SharedPartnerAuthState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75911n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f75912o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f75913p;

        b0(Continuation<? super b0> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return b.this.new b0(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0094  */
        /* JADX WARN: Code duplicated, block: B:24:0x009b  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:31:0x00cf  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            j40.b.Launched launched;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
            FinancialConnectionsInstitution activeInstitution;
            Boolean isStripeDirect;
            boolean zBooleanValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f75913p;
            if (i11 == 0) {
                jn0.t.b(obj);
                j40.b.Launched launched2 = new j40.b.Launched(new Date());
                n40.b0 b0Var = b.this.getOrFetchSync;
                this.f75911n = launched2;
                this.f75913p = 1;
                Object objB = n40.b0.b(b0Var, null, this, 1, null);
                if (objB != coroutine_suspended) {
                    launched = launched2;
                    obj = objB;
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                launched = (j40.b.Launched) this.f75911n;
                jn0.t.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.f75912o;
                launched = (j40.b.Launched) this.f75911n;
                jn0.t.b(obj);
            }
            financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) obj;
            b.this.logger.debug("Created auth session " + financialConnectionsAuthorizationSession.getId());
            activeInstitution = financialConnectionsSessionManifest.getActiveInstitution();
            if (activeInstitution != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            isStripeDirect = financialConnectionsSessionManifest.getIsStripeDirect();
            if (isStripeDirect != null) {
                zBooleanValue = isStripeDirect.booleanValue();
            } else {
                zBooleanValue = false;
            }
            SharedPartnerAuthState.Payload payload = new SharedPartnerAuthState.Payload(zBooleanValue, activeInstitution, financialConnectionsAuthorizationSession);
            b.this.postAuthSessionEvent.e(financialConnectionsAuthorizationSession.getId(), p013kotlin.collections.v.r(launched, financialConnectionsAuthorizationSession.g() ? new j40.b.Loaded(new Date()) : null));
            return payload;
            SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
            FinancialConnectionsSessionManifest manifest = synchronizeSessionResponse.getManifest();
            b1 b1Var = b.this.createAuthorizationSession;
            FinancialConnectionsInstitution activeInstitution2 = manifest.getActiveInstitution();
            if (activeInstitution2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.f75911n = launched;
            this.f75912o = manifest;
            this.f75913p = 2;
            obj = b1Var.a(activeInstitution2, synchronizeSessionResponse, this);
            if (obj != coroutine_suspended) {
                financialConnectionsSessionManifest = manifest;
                financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) obj;
                b.this.logger.debug("Created auth session " + financialConnectionsAuthorizationSession.getId());
                activeInstitution = financialConnectionsSessionManifest.getActiveInstitution();
                if (activeInstitution != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                isStripeDirect = financialConnectionsSessionManifest.getIsStripeDirect();
                if (isStripeDirect != null) {
                    zBooleanValue = isStripeDirect.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                SharedPartnerAuthState.Payload payload2 = new SharedPartnerAuthState.Payload(zBooleanValue, activeInstitution, financialConnectionsAuthorizationSession);
                b.this.postAuthSessionEvent.e(financialConnectionsAuthorizationSession.getId(), p013kotlin.collections.v.r(launched, financialConnectionsAuthorizationSession.g() ? new j40.b.Loaded(new Date()) : null));
                return payload2;
            }
            return coroutine_suspended;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super SharedPartnerAuthState.Payload> continuation) {
            return ((b0) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li50/b$c;", "", "Li50/e;", "initialState", "Li50/b;", "a", "(Li50/e;)Li50/b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        b a(SharedPartnerAuthState initialState);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel", f = "PartnerAuthViewModel.kt", i = {0, 0}, l = {363}, m = "cancelAuthSessionAndContinue", n = {"this", "authSession"}, s = {"L$0", "L$1"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75916n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f75917o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f75918p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f75920r;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75918p = obj;
            this.f75920r |= Integer.MIN_VALUE;
            return b.this.H(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li50/e;", "Ls50/a;", "Li50/e$c;", "it", "a", "(Li50/e;Ls50/a;)Li50/e;"}, k = 3, mv = {1, 9, 0})
    static final class d0 extends p013kotlin.jvm.internal.u implements wn0.p<SharedPartnerAuthState, s50.a<? extends SharedPartnerAuthState.Payload>, SharedPartnerAuthState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d0 f75921c = new d0();

        d0() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPartnerAuthState invoke(SharedPartnerAuthState execute, s50.a<SharedPartnerAuthState.Payload> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            return SharedPartnerAuthState.b(execute, null, it, null, null, false, 29, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e;", "a", "(Li50/e;)Li50/e;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, SharedPartnerAuthState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f75922c = new e();

        e() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPartnerAuthState invoke(SharedPartnerAuthState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return SharedPartnerAuthState.b(setState, null, null, null, s50.a.d.f110198b, false, 23, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e$c;", "<anonymous>", "()Li50/e$c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$restoreOrCreateAuthSession$1", f = "PartnerAuthViewModel.kt", i = {1}, l = {115, 117}, m = "invokeSuspend", n = {"manifest"}, s = {"L$0"})
    static final class e0 extends SuspendLambda implements wn0.l<Continuation<? super SharedPartnerAuthState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75923n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f75924o;

        e0(Continuation<? super e0> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return b.this.new e0(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006e  */
        /* JADX WARN: Code duplicated, block: B:27:0x0073  */
        /* JADX WARN: Code duplicated, block: B:30:0x007a  */
        /* JADX WARN: Code duplicated, block: B:32:0x007e  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            FinancialConnectionsSessionManifest manifest;
            FinancialConnectionsAuthorizationSession activeAuthSession;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            Boolean isStripeDirect;
            boolean zBooleanValue;
            FinancialConnectionsInstitution activeInstitution;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f75924o;
            if (i11 == 0) {
                jn0.t.b(obj);
                n40.b0 b0Var = b.this.getOrFetchSync;
                this.f75924o = 1;
                obj = n40.b0.b(b0Var, null, this, 1, null);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                jn0.t.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.f75923n;
                jn0.t.b(obj);
            }
            activeAuthSession = (FinancialConnectionsAuthorizationSession) obj;
            manifest = financialConnectionsSessionManifest;
            isStripeDirect = manifest.getIsStripeDirect();
            if (isStripeDirect != null) {
                zBooleanValue = isStripeDirect.booleanValue();
            } else {
                zBooleanValue = false;
            }
            activeInstitution = manifest.getActiveInstitution();
            if (activeInstitution != null) {
                return new SharedPartnerAuthState.Payload(zBooleanValue, activeInstitution, activeAuthSession);
            }
            throw new IllegalArgumentException("Required value was null.");
            SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
            manifest = synchronizeSessionResponse.getManifest();
            activeAuthSession = manifest.getActiveAuthSession();
            if (activeAuthSession == null) {
                b1 b1Var = b.this.createAuthorizationSession;
                FinancialConnectionsInstitution activeInstitution2 = manifest.getActiveInstitution();
                if (activeInstitution2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.f75923n = manifest;
                this.f75924o = 2;
                obj = b1Var.a(activeInstitution2, synchronizeSessionResponse, this);
                if (obj != coroutine_suspended) {
                    financialConnectionsSessionManifest = manifest;
                    activeAuthSession = (FinancialConnectionsAuthorizationSession) obj;
                    manifest = financialConnectionsSessionManifest;
                }
                return coroutine_suspended;
            }
            isStripeDirect = manifest.getIsStripeDirect();
            if (isStripeDirect != null) {
                zBooleanValue = isStripeDirect.booleanValue();
            } else {
                zBooleanValue = false;
            }
            activeInstitution = manifest.getActiveInstitution();
            if (activeInstitution != null) {
                return new SharedPartnerAuthState.Payload(zBooleanValue, activeInstitution, activeAuthSession);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super SharedPartnerAuthState.Payload> continuation) {
            return ((e0) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel", f = "PartnerAuthViewModel.kt", i = {0, 0, 1, 1, 2}, l = {386, HttpStatusCode.UNAUTHORIZED_401, DownloaderService.STATUS_FORBIDDEN}, m = "completeAuthorizationSession", n = {"this", ImagesContract.URL, "this", "authSession", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75926n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f75927o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f75928p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f75930r;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75928p = obj;
            this.f75930r |= Integer.MIN_VALUE;
            return b.this.I(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li50/e;", "Ls50/a;", "Li50/e$c;", "it", "a", "(Li50/e;Ls50/a;)Li50/e;"}, k = 3, mv = {1, 9, 0})
    static final class f0 extends p013kotlin.jvm.internal.u implements wn0.p<SharedPartnerAuthState, s50.a<? extends SharedPartnerAuthState.Payload>, SharedPartnerAuthState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f0 f75931c = new f0();

        f0() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPartnerAuthState invoke(SharedPartnerAuthState execute, s50.a<SharedPartnerAuthState.Payload> it) {
            p013kotlin.jvm.internal.s.k(execute, "$this$execute");
            p013kotlin.jvm.internal.s.k(it, "it");
            return SharedPartnerAuthState.b(execute, null, it, null, null, false, 29, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e;", "a", "(Li50/e;)Li50/e;"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, SharedPartnerAuthState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f75932c = new g();

        g() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPartnerAuthState invoke(SharedPartnerAuthState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return SharedPartnerAuthState.b(setState, null, null, null, new s50.a.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.EnumC1587a.AUTHENTICATING)), false, 23, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e;", "a", "(Li50/e;)Li50/e;"}, k = 3, mv = {1, 9, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, SharedPartnerAuthState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f75933c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Throwable th2) {
            super(1);
            this.f75933c = th2;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPartnerAuthState invoke(SharedPartnerAuthState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return SharedPartnerAuthState.b(setState, null, null, null, new s50.a.Fail(this.f75933c), false, 23, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li50/e$c;", "it", "Ljn0/h0;", "<anonymous>", "(Li50/e$c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$handleErrors$2", f = "PartnerAuthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements wn0.p<SharedPartnerAuthState.Payload, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75935n;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SharedPartnerAuthState.Payload payload, Continuation<? super h0> continuation) {
            return ((j) create(payload, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new j(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f75935n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            b.this.eventTracker.a(new FinancialConnectionsEvent.w(b.M));
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$handleErrors$3", f = "PartnerAuthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75937n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f75938o;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            k kVar = b.this.new k(continuation);
            kVar.f75938o = obj;
            return kVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f75937n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            b.this.handleError.a("Error fetching payload / posting AuthSession", (Throwable) this.f75938o, b.M, true);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((k) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$handleErrors$5", f = "PartnerAuthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements wn0.p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75941n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f75942o;

        m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            m mVar = b.this.new m(continuation);
            mVar.f75942o = obj;
            return mVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f75941n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            Throwable th2 = (Throwable) this.f75942o;
            b.this.handleError.a("Error with authentication status", th2 instanceof FinancialConnectionsError ? (FinancialConnectionsError) th2 : new PartnerAuthError(th2.getMessage()), b.M, true);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((m) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e;", "a", "(Li50/e;)Li50/e;"}, k = 3, mv = {1, 9, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, SharedPartnerAuthState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f75944c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str) {
            super(1);
            this.f75944c = str;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPartnerAuthState invoke(SharedPartnerAuthState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return SharedPartnerAuthState.b(setState, null, null, new SharedPartnerAuthState.d.OpenPartnerAuth(this.f75944c), null, false, 27, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li50/e$c;", "it", "Ljn0/h0;", "<anonymous>", "(Li50/e$c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$launchBrowserIfNonOauth$2", f = "PartnerAuthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends SuspendLambda implements wn0.p<SharedPartnerAuthState.Payload, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75946n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f75947o;

        p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SharedPartnerAuthState.Payload payload, Continuation<? super h0> continuation) {
            return ((p) create(payload, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            p pVar = b.this.new p(continuation);
            pVar.f75947o = obj;
            return pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f75946n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            SharedPartnerAuthState.Payload payload = (SharedPartnerAuthState.Payload) this.f75947o;
            if (!payload.getAuthSession().g()) {
                b.this.K(payload.getAuthSession());
            }
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel", f = "PartnerAuthViewModel.kt", i = {0, 0, 1, 1, 1, 2, 2, 3, 3}, l = {EnumC4419g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, EnumC4419g.SDK_ASSET_ICON_UPLOAD_VALUE, 337, 344}, m = "onAuthCancelled", n = {"this", ImagesContract.URL, "this", ImagesContract.URL, "authSession", "this", ImagesContract.URL, "this", ImagesContract.URL}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"})
    static final class q extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75949n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f75950o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f75951p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f75952q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f75954s;

        q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75952q = obj;
            this.f75954s |= Integer.MIN_VALUE;
            return b.this.M(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e;", "a", "(Li50/e;)Li50/e;"}, k = 3, mv = {1, 9, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, SharedPartnerAuthState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f75955c = new r();

        r() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPartnerAuthState invoke(SharedPartnerAuthState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return SharedPartnerAuthState.b(setState, null, null, null, new s50.a.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.EnumC1587a.AUTHENTICATING)), false, 23, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e;", "a", "(Li50/e;)Li50/e;"}, k = 3, mv = {1, 9, 0})
    static final class s extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, SharedPartnerAuthState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f75956c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(Throwable th2) {
            super(1);
            this.f75956c = th2;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPartnerAuthState invoke(SharedPartnerAuthState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return SharedPartnerAuthState.b(setState, null, null, null, new s50.a.Fail(this.f75956c), false, 23, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel", f = "PartnerAuthViewModel.kt", i = {0, 0, 0, 1, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, m = "onAuthFailed", n = {"this", ImagesContract.URL, AnalyticsAttribute.Error, "this", AnalyticsAttribute.Error}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class t extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75957n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f75958o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f75959p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f75960q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f75962s;

        t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75960q = obj;
            this.f75962s |= Integer.MIN_VALUE;
            return b.this.N(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e;", "a", "(Li50/e;)Li50/e;"}, k = 3, mv = {1, 9, 0})
    static final class u extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, SharedPartnerAuthState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebAuthFlowFailedException f75963c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(WebAuthFlowFailedException webAuthFlowFailedException) {
            super(1);
            this.f75963c = webAuthFlowFailedException;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPartnerAuthState invoke(SharedPartnerAuthState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return SharedPartnerAuthState.b(setState, null, null, null, new s50.a.Fail(this.f75963c), false, 23, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onCancelClick$1", f = "PartnerAuthViewModel.kt", i = {}, l = {469, 471}, m = "invokeSuspend", n = {}, s = {})
    static final class v extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75964n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f75965o;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e;", "a", "(Li50/e;)Li50/e;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, SharedPartnerAuthState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f75967c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SharedPartnerAuthState invoke(SharedPartnerAuthState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return SharedPartnerAuthState.b(setState, null, null, null, new s50.a.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.EnumC1587a.CANCELLING)), false, 23, null);
            }
        }

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            v vVar = b.this.new v(continuation);
            vVar.f75965o = obj;
            return vVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        
            if (r6 == r0) goto L23;
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
                int r1 = r5.f75964n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                jn0.t.b(r6)     // Catch: java.lang.Throwable -> L12
                goto L67
            L12:
                r6 = move-exception
                goto L75
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                java.lang.Object r1 = r5.f75965o
                i50.b r1 = (i50.b) r1
                jn0.t.b(r6)     // Catch: java.lang.Throwable -> L12
                goto L47
            L24:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.f75965o
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                i50.b r6 = i50.b.this
                i50.b$v$a r1 = i50.b.v.a.f75967c
                i50.b.F(r6, r1)
                i50.b r1 = i50.b.this
                jn0.s$a r6 = jn0.s.INSTANCE     // Catch: java.lang.Throwable -> L12
                n40.b0 r6 = i50.b.t(r1)     // Catch: java.lang.Throwable -> L12
                n40.b0$a$b r4 = n40.b0.a.b.f93054a     // Catch: java.lang.Throwable -> L12
                r5.f75965o = r1     // Catch: java.lang.Throwable -> L12
                r5.f75964n = r3     // Catch: java.lang.Throwable -> L12
                java.lang.Object r6 = r6.a(r4, r5)     // Catch: java.lang.Throwable -> L12
                if (r6 != r0) goto L47
                goto L66
            L47:
                com.stripe.android.financialconnections.model.k0 r6 = (com.stripe.android.financialconnections.model.SynchronizeSessionResponse) r6     // Catch: java.lang.Throwable -> L12
                com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest r6 = r6.getManifest()     // Catch: java.lang.Throwable -> L12
                com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession r6 = r6.getActiveAuthSession()     // Catch: java.lang.Throwable -> L12
                if (r6 == 0) goto L6d
                n40.e r1 = i50.b.q(r1)     // Catch: java.lang.Throwable -> L12
                java.lang.String r6 = r6.getId()     // Catch: java.lang.Throwable -> L12
                r3 = 0
                r5.f75965o = r3     // Catch: java.lang.Throwable -> L12
                r5.f75964n = r2     // Catch: java.lang.Throwable -> L12
                java.lang.Object r6 = r1.a(r6, r5)     // Catch: java.lang.Throwable -> L12
                if (r6 != r0) goto L67
            L66:
                return r0
            L67:
                com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession r6 = (com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession) r6     // Catch: java.lang.Throwable -> L12
                jn0.s.b(r6)     // Catch: java.lang.Throwable -> L12
                goto L7e
            L6d:
                java.lang.String r6 = "Required value was null."
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L12
                r0.<init>(r6)     // Catch: java.lang.Throwable -> L12
                throw r0     // Catch: java.lang.Throwable -> L12
            L75:
                jn0.s$a r0 = jn0.s.INSTANCE
                java.lang.Object r6 = jn0.t.a(r6)
                jn0.s.b(r6)
            L7e:
                i50.b r6 = i50.b.this
                o50.f r6 = i50.b.w(r6)
                r6.c()
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: i50.b.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$onClickableTextClick$1", f = "PartnerAuthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class w extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75968n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f75970p;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e;", "a", "(Li50/e;)Li50/e;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, SharedPartnerAuthState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f75971c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f75971c = str;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SharedPartnerAuthState invoke(SharedPartnerAuthState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return SharedPartnerAuthState.b(setState, null, null, new SharedPartnerAuthState.d.OpenUrl(this.f75971c, new Date().getTime()), null, false, 27, null);
            }
        }

        /* JADX INFO: renamed from: i50.b$w$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class C1586b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f75972a;

            static {
                int[] iArr = new int[SharedPartnerAuthState.b.values().length];
                try {
                    iArr[SharedPartnerAuthState.b.DATA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f75972a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f75970p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new w(this.f75970p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SharedPartnerAuthState.b next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f75968n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            String strB = b.this.uriUtils.b(this.f75970p, "eventName");
            if (strB != null) {
                b.this.eventTracker.a(new FinancialConnectionsEvent.h(strB, b.M));
            }
            if (URLUtil.isNetworkUrl(this.f75970p)) {
                b.this.k(new a(this.f75970p));
            } else {
                EnumEntries<SharedPartnerAuthState.b> entries = SharedPartnerAuthState.b.getEntries();
                b bVar = b.this;
                String str = this.f75970p;
                Iterator<SharedPartnerAuthState.b> it = entries.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!bVar.uriUtils.a(next.getValue(), str));
                SharedPartnerAuthState.b bVar2 = next;
                int i11 = bVar2 == null ? -1 : C1586b.f75972a[bVar2.ordinal()];
                if (i11 == -1) {
                    o30.d.b.a(b.this.logger, "Unrecognized clickable text: " + this.f75970p, null, 2, null);
                } else if (i11 == 1) {
                    b.this.T();
                }
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e;", "a", "(Li50/e;)Li50/e;"}, k = 3, mv = {1, 9, 0})
    static final class x extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, SharedPartnerAuthState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f75973c = new x();

        x() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPartnerAuthState invoke(SharedPartnerAuthState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return SharedPartnerAuthState.b(setState, null, null, null, new s50.a.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.EnumC1587a.AUTHENTICATING)), false, 23, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li50/e;", "state", "Ljn0/h0;", "a", "(Li50/e;)V"}, k = 3, mv = {1, 9, 0})
    static final class y extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, h0> {
        y() {
            super(1);
        }

        public final void a(SharedPartnerAuthState state) {
            p013kotlin.jvm.internal.s.k(state, "state");
            SharedPartnerAuthState.Payload payloadA = state.f().a();
            FinancialConnectionsAuthorizationSession authSession = payloadA != null ? payloadA.getAuthSession() : null;
            if (authSession == null) {
                throw new IllegalArgumentException("Payload shouldn't be null when the user launches the auth flow");
            }
            b.this.V(authSession.getId());
            b.this.K(authSession);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(SharedPartnerAuthState sharedPartnerAuthState) {
            a(sharedPartnerAuthState);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li50/e;", "a", "(Li50/e;)Li50/e;"}, k = 3, mv = {1, 9, 0})
    static final class z extends p013kotlin.jvm.internal.u implements wn0.l<SharedPartnerAuthState, SharedPartnerAuthState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f75975c = new z();

        z() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPartnerAuthState invoke(SharedPartnerAuthState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return SharedPartnerAuthState.b(setState, null, null, null, null, false, 27, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n40.g completeAuthorizationSession, b1 createAuthorizationSession, n40.e cancelAuthorizationSession, l1 retrieveAuthorizationSession, j40.f eventTracker, String applicationId, z50.p uriUtils, z0 postAuthSessionEvent, n40.b0 getOrFetchSync, k40.a browserManager, n40.d0 handleError, o50.f navigationManager, x0 pollAuthorizationSessionOAuthResults, o30.d logger, h50.f presentSheet, SharedPartnerAuthState initialState, p0 nativeAuthFlowCoordinator) {
        super(initialState, nativeAuthFlowCoordinator);
        p013kotlin.jvm.internal.s.k(completeAuthorizationSession, "completeAuthorizationSession");
        p013kotlin.jvm.internal.s.k(createAuthorizationSession, "createAuthorizationSession");
        p013kotlin.jvm.internal.s.k(cancelAuthorizationSession, "cancelAuthorizationSession");
        p013kotlin.jvm.internal.s.k(retrieveAuthorizationSession, "retrieveAuthorizationSession");
        p013kotlin.jvm.internal.s.k(eventTracker, "eventTracker");
        p013kotlin.jvm.internal.s.k(applicationId, "applicationId");
        p013kotlin.jvm.internal.s.k(uriUtils, "uriUtils");
        p013kotlin.jvm.internal.s.k(postAuthSessionEvent, "postAuthSessionEvent");
        p013kotlin.jvm.internal.s.k(getOrFetchSync, "getOrFetchSync");
        p013kotlin.jvm.internal.s.k(browserManager, "browserManager");
        p013kotlin.jvm.internal.s.k(handleError, "handleError");
        p013kotlin.jvm.internal.s.k(navigationManager, "navigationManager");
        p013kotlin.jvm.internal.s.k(pollAuthorizationSessionOAuthResults, "pollAuthorizationSessionOAuthResults");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(presentSheet, "presentSheet");
        p013kotlin.jvm.internal.s.k(initialState, "initialState");
        p013kotlin.jvm.internal.s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        this.completeAuthorizationSession = completeAuthorizationSession;
        this.createAuthorizationSession = createAuthorizationSession;
        this.cancelAuthorizationSession = cancelAuthorizationSession;
        this.retrieveAuthorizationSession = retrieveAuthorizationSession;
        this.eventTracker = eventTracker;
        this.applicationId = applicationId;
        this.uriUtils = uriUtils;
        this.postAuthSessionEvent = postAuthSessionEvent;
        this.getOrFetchSync = getOrFetchSync;
        this.browserManager = browserManager;
        this.handleError = handleError;
        this.navigationManager = navigationManager;
        this.pollAuthorizationSessionOAuthResults = pollAuthorizationSessionOAuthResults;
        this.logger = logger;
        this.presentSheet = presentSheet;
        J();
        L();
        W();
    }

    private final String G(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession) {
        String url = financialConnectionsAuthorizationSession.getUrl();
        if (url == null) {
            return null;
        }
        return p013kotlin.text.t.X(url, "stripe-auth://native-redirect/" + this.applicationId + "/", "", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, Continuation<? super h0> continuation) {
        d dVar;
        b bVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f75920r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f75920r = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objA = dVar.f75918p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f75920r;
        if (i12 == 0) {
            jn0.t.b(objA);
            n40.e eVar = this.cancelAuthorizationSession;
            String id2 = financialConnectionsAuthorizationSession.getId();
            dVar.f75916n = this;
            dVar.f75917o = financialConnectionsAuthorizationSession;
            dVar.f75920r = 1;
            objA = eVar.a(id2, dVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            bVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) dVar.f75917o;
            bVar = (b) dVar.f75916n;
            jn0.t.b(objA);
        }
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) objA;
        if (financialConnectionsAuthorizationSession.g()) {
            bVar.logger.debug("Creating a new session for this OAuth institution");
            bVar.postAuthSessionEvent.d(financialConnectionsAuthorizationSession.getId(), new j40.b.Retry(new Date()));
            bVar.k(e.f75922c);
            bVar.U();
        } else {
            bVar.postAuthSessionEvent.d(financialConnectionsAuthorizationSession.getId(), new j40.b.Cancel(new Date()));
            o50.f.a.a(bVar.navigationManager, o50.b.k(o50.d.a(financialConnectionsAuthorizationSession2.getNextPane()), M, null, 2, null), new o50.i.Current(true), false, 4, null);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0148  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [i50.b] */
    /* JADX WARN: Type inference failed for: r2v12, types: [i50.b] */
    /* JADX WARN: Type inference failed for: r2v15, types: [i50.b] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [i50.b, s50.i] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final Object I(String str, Continuation<? super h0> continuation) {
        f fVar;
        ?? r11;
        Object objB;
        ?? r12;
        Throwable thE;
        b bVar;
        String str2;
        String strK;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
        ?? r13;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f75930r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f75930r = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objA = fVar.f75928p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f75930r;
        try {
            if (i12 == 0) {
                jn0.t.b(objA);
                try {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    k(g.f75932c);
                    n40.b0 b0Var = this.getOrFetchSync;
                    n40.b0.a.b bVar2 = n40.b0.a.b.f93054a;
                    fVar.f75926n = this;
                    fVar.f75927o = str;
                    fVar.f75930r = 1;
                    objA = b0Var.a(bVar2, fVar);
                    if (objA != coroutine_suspended) {
                        bVar = this;
                        str2 = str;
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    r11 = this;
                    jn0.s.Companion companion2 = jn0.s.INSTANCE;
                    objB = jn0.s.b(jn0.t.a(th));
                    r12 = r11;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r11 = (b) fVar.f75926n;
                        try {
                            jn0.t.b(objA);
                            r13 = r11;
                            r13.logger.debug("Session authorized!");
                            strK = o50.b.k(o50.d.a(((FinancialConnectionsAuthorizationSession) objA).getNextPane()), M, null, 2, null);
                            r11 = r13;
                            String str3 = strK;
                            i40.a.c(i40.a.f75822a, j40.FinancialConnectionsEvent.c.INSTITUTION_AUTHORIZED, null, 2, null);
                            o50.f.a.a(r11.navigationManager, str3, null, false, 6, null);
                            objB = jn0.s.b(h0.f84049a);
                            r12 = r11;
                        } catch (Throwable th3) {
                            th = th3;
                            jn0.s.Companion companion3 = jn0.s.INSTANCE;
                            objB = jn0.s.b(jn0.t.a(th));
                            r12 = r11;
                        }
                        thE = jn0.s.e(objB);
                        if (thE != null) {
                            j40.h.b(r12.eventTracker, "failed authorizing session", thE, r12.logger, M);
                            r12.k(new h(thE));
                        }
                        return h0.f84049a;
                    }
                    financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) fVar.f75927o;
                    bVar = (b) fVar.f75926n;
                    jn0.t.b(objA);
                    bVar.logger.debug("OAuth results received! completing session");
                    n40.g gVar = bVar.completeAuthorizationSession;
                    String id2 = financialConnectionsAuthorizationSession.getId();
                    String publicToken = ((MixedOAuthParams) objA).getPublicToken();
                    fVar.f75926n = bVar;
                    fVar.f75927o = null;
                    fVar.f75930r = 3;
                    objA = gVar.a(id2, publicToken, fVar);
                    if (objA != coroutine_suspended) {
                        r13 = bVar;
                        r13.logger.debug("Session authorized!");
                        strK = o50.b.k(o50.d.a(((FinancialConnectionsAuthorizationSession) objA).getNextPane()), M, null, 2, null);
                        r11 = r13;
                        String str4 = strK;
                        i40.a.c(i40.a.f75822a, j40.FinancialConnectionsEvent.c.INSTITUTION_AUTHORIZED, null, 2, null);
                        o50.f.a.a(r11.navigationManager, str4, null, false, 6, null);
                        objB = jn0.s.b(h0.f84049a);
                        r12 = r11;
                        thE = jn0.s.e(objB);
                        if (thE != null) {
                            j40.h.b(r12.eventTracker, "failed authorizing session", thE, r12.logger, M);
                            r12.k(new h(thE));
                        }
                        return h0.f84049a;
                    }
                    return coroutine_suspended;
                }
                str2 = (String) fVar.f75927o;
                bVar = (b) fVar.f75926n;
                jn0.t.b(objA);
            }
            FinancialConnectionsAuthorizationSession activeAuthSession = ((SynchronizeSessionResponse) objA).getManifest().getActiveAuthSession();
            j40.f fVar2 = bVar.eventTracker;
            FinancialConnectionsSessionManifest.Pane pane = M;
            fVar2.a(new FinancialConnectionsEvent.g(pane, str2, "success", activeAuthSession != null ? activeAuthSession.getId() : null));
            if (activeAuthSession == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            bVar.postAuthSessionEvent.d(activeAuthSession.getId(), new j40.b.Success(new Date()));
            if (activeAuthSession.g()) {
                bVar.logger.debug("Web AuthFlow completed! waiting for oauth results");
                x0 x0Var = bVar.pollAuthorizationSessionOAuthResults;
                fVar.f75926n = bVar;
                fVar.f75927o = activeAuthSession;
                fVar.f75930r = 2;
                Object objC = x0Var.c(activeAuthSession, fVar);
                if (objC != coroutine_suspended) {
                    financialConnectionsAuthorizationSession = activeAuthSession;
                    objA = objC;
                    bVar.logger.debug("OAuth results received! completing session");
                    n40.g gVar2 = bVar.completeAuthorizationSession;
                    String id3 = financialConnectionsAuthorizationSession.getId();
                    String publicToken2 = ((MixedOAuthParams) objA).getPublicToken();
                    fVar.f75926n = bVar;
                    fVar.f75927o = null;
                    fVar.f75930r = 3;
                    objA = gVar2.a(id3, publicToken2, fVar);
                    if (objA != coroutine_suspended) {
                        r13 = bVar;
                        r13.logger.debug("Session authorized!");
                        strK = o50.b.k(o50.d.a(((FinancialConnectionsAuthorizationSession) objA).getNextPane()), M, null, 2, null);
                        r11 = r13;
                    }
                }
                return coroutine_suspended;
            }
            strK = o50.b.k(o50.b.a.f96734i, pane, null, 2, null);
            r11 = bVar;
            String str5 = strK;
            i40.a.c(i40.a.f75822a, j40.FinancialConnectionsEvent.c.INSTITUTION_AUTHORIZED, null, 2, null);
            o50.f.a.a(r11.navigationManager, str5, null, false, 6, null);
            objB = jn0.s.b(h0.f84049a);
            r12 = r11;
            thE = jn0.s.e(objB);
            if (thE != null) {
                j40.h.b(r12.eventTracker, "failed authorizing session", thE, r12.logger, M);
                r12.k(new h(thE));
            }
            return h0.f84049a;
        } catch (Throwable th4) {
            th = th4;
            r11 = 1;
        }
    }

    private final void J() {
        i(new p013kotlin.jvm.internal.f0() { // from class: i50.b.i
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((SharedPartnerAuthState) obj).f();
            }
        }, new j(null), new k(null));
        s50.i.j(this, new p013kotlin.jvm.internal.f0() { // from class: i50.b.l
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((SharedPartnerAuthState) obj).c();
            }
        }, null, new m(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(FinancialConnectionsAuthorizationSession authSession) {
        String strG = G(authSession);
        if (strG != null) {
            k(new n(strG));
            this.eventTracker.a(new FinancialConnectionsEvent.C1725e(M, authSession.getFlow(), this.browserManager.e(Uri.parse(strG)), authSession.getId()));
        }
    }

    private final void L() {
        s50.i.j(this, new p013kotlin.jvm.internal.f0() { // from class: i50.b.o
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((SharedPartnerAuthState) obj).f();
            }
        }, new p(null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:53:0x00dc, B:55:0x00f4, B:58:0x0103, B:28:0x006c, B:39:0x0099, B:44:0x00af, B:46:0x00b5, B:48:0x00c1, B:50:0x00c7, B:60:0x012c, B:65:0x0141, B:66:0x0148), top: B:77:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:53:0x00dc, B:55:0x00f4, B:58:0x0103, B:28:0x006c, B:39:0x0099, B:44:0x00af, B:46:0x00b5, B:48:0x00c1, B:50:0x00c7, B:60:0x012c, B:65:0x0141, B:66:0x0148), top: B:77:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:53:0x00dc, B:55:0x00f4, B:58:0x0103, B:28:0x006c, B:39:0x0099, B:44:0x00af, B:46:0x00b5, B:48:0x00c1, B:50:0x00c7, B:60:0x012c, B:65:0x0141, B:66:0x0148), top: B:77:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc A[Catch: all -> 0x0070, PHI: r0 r4 r7 r10
      0x00dc: PHI (r0v19 java.lang.Object) = (r0v18 java.lang.Object), (r0v1 java.lang.Object) binds: [B:51:0x00d9, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r4v7 java.lang.String) = (r4v5 java.lang.String), (r4v17 java.lang.String) binds: [B:51:0x00d9, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r7v4 i50.b) = (r7v2 i50.b), (r7v9 i50.b) binds: [B:51:0x00d9, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r10v4 com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession) = 
      (r10v3 com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession)
      (r10v5 com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession)
     binds: [B:51:0x00d9, B:23:0x005b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0070, blocks: (B:53:0x00dc, B:55:0x00f4, B:58:0x0103, B:28:0x006c, B:39:0x0099, B:44:0x00af, B:46:0x00b5, B:48:0x00c1, B:50:0x00c7, B:60:0x012c, B:65:0x0141, B:66:0x0148), top: B:77:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:53:0x00dc, B:55:0x00f4, B:58:0x0103, B:28:0x006c, B:39:0x0099, B:44:0x00af, B:46:0x00b5, B:48:0x00c1, B:50:0x00c7, B:60:0x012c, B:65:0x0141, B:66:0x0148), top: B:77:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0102  */
    /* JADX WARN: Code duplicated, block: B:58:0x0103 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:53:0x00dc, B:55:0x00f4, B:58:0x0103, B:28:0x006c, B:39:0x0099, B:44:0x00af, B:46:0x00b5, B:48:0x00c1, B:50:0x00c7, B:60:0x012c, B:65:0x0141, B:66:0x0148), top: B:77:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:60:0x012c A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:53:0x00dc, B:55:0x00f4, B:58:0x0103, B:28:0x006c, B:39:0x0099, B:44:0x00af, B:46:0x00b5, B:48:0x00c1, B:50:0x00c7, B:60:0x012c, B:65:0x0141, B:66:0x0148), top: B:77:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0141 A[Catch: all -> 0x0070, TRY_ENTER, TryCatch #0 {all -> 0x0070, blocks: (B:53:0x00dc, B:55:0x00f4, B:58:0x0103, B:28:0x006c, B:39:0x0099, B:44:0x00af, B:46:0x00b5, B:48:0x00c1, B:50:0x00c7, B:60:0x012c, B:65:0x0141, B:66:0x0148), top: B:77:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
    
        if (r7.H(r10, r2) == r3) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(java.lang.String r19, p013kotlin.coroutines.Continuation<? super jn0.h0> r20) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i50.b.M(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x0087 A[Catch: all -> 0x0036, TryCatch #2 {all -> 0x0036, blocks: (B:13:0x0031, B:41:0x00d4, B:29:0x0077, B:31:0x0087, B:33:0x008d, B:35:0x00a2, B:40:0x00cd), top: B:55:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2 A[Catch: all -> 0x0036, TryCatch #2 {all -> 0x0036, blocks: (B:13:0x0031, B:41:0x00d4, B:29:0x0077, B:31:0x0087, B:33:0x008d, B:35:0x00a2, B:40:0x00cd), top: B:55:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd A[Catch: all -> 0x0036, TryCatch #2 {all -> 0x0036, blocks: (B:13:0x0031, B:41:0x00d4, B:29:0x0077, B:31:0x0087, B:33:0x008d, B:35:0x00a2, B:40:0x00cd), top: B:55:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11, types: [s50.i] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v3, types: [i50.b] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public final Object N(String str, String str2, String str3, Continuation<? super h0> continuation) {
        t tVar;
        Object objB;
        ?? r12;
        WebAuthFlowFailedException webAuthFlowFailedException;
        Object obj;
        b bVar;
        FinancialConnectionsAuthorizationSession activeAuthSession;
        String id2;
        n40.e eVar;
        String id3;
        WebAuthFlowFailedException webAuthFlowFailedException2;
        b bVar2;
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i11 = tVar.f75962s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tVar.f75962s = i11 - Integer.MIN_VALUE;
            } else {
                tVar = new t(continuation);
            }
        } else {
            tVar = new t(continuation);
        }
        Object obj2 = tVar.f75960q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = tVar.f75962s;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    WebAuthFlowFailedException webAuthFlowFailedException3 = (WebAuthFlowFailedException) tVar.f75959p;
                    String str4 = (String) tVar.f75958o;
                    b bVar3 = (b) tVar.f75957n;
                    try {
                        jn0.t.b(obj2);
                        webAuthFlowFailedException = webAuthFlowFailedException3;
                        str = str4;
                        bVar = bVar3;
                        obj = obj2;
                        activeAuthSession = ((SynchronizeSessionResponse) obj).getManifest().getActiveAuthSession();
                        j40.f fVar = bVar.eventTracker;
                        FinancialConnectionsSessionManifest.Pane pane = M;
                        if (activeAuthSession != null) {
                            id2 = activeAuthSession.getId();
                        } else {
                            id2 = null;
                        }
                        fVar.a(new FinancialConnectionsEvent.g(pane, str, "failed", id2));
                        j40.h.b(bVar.eventTracker, "Auth failed, cancelling AuthSession", webAuthFlowFailedException, bVar.logger, pane);
                        if (activeAuthSession != null) {
                            bVar.postAuthSessionEvent.d(activeAuthSession.getId(), new j40.b.Failure(new Date(), webAuthFlowFailedException));
                            eVar = bVar.cancelAuthorizationSession;
                            id3 = activeAuthSession.getId();
                            tVar.f75957n = bVar;
                            tVar.f75958o = webAuthFlowFailedException;
                            tVar.f75959p = null;
                            tVar.f75962s = 2;
                            if (eVar.a(id3, tVar) != coroutine_suspended) {
                                webAuthFlowFailedException2 = webAuthFlowFailedException;
                                bVar2 = bVar;
                            }
                            return coroutine_suspended;
                        }
                        bVar.logger.debug("Could not find AuthSession to cancel.");
                        str2 = bVar;
                        str2.k(new u(webAuthFlowFailedException));
                        objB = jn0.s.b(h0.f84049a);
                        r12 = str2;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = bVar3;
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        objB = jn0.s.b(jn0.t.a(th));
                        r12 = str2;
                    }
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    webAuthFlowFailedException2 = (WebAuthFlowFailedException) tVar.f75958o;
                    b bVar4 = (b) tVar.f75957n;
                    jn0.t.b(obj2);
                    bVar2 = bVar4;
                }
                webAuthFlowFailedException = webAuthFlowFailedException2;
                str2 = bVar2;
                str2.k(new u(webAuthFlowFailedException));
                objB = jn0.s.b(h0.f84049a);
                r12 = str2;
            } else {
                jn0.t.b(obj2);
                webAuthFlowFailedException = new WebAuthFlowFailedException(str2, str3);
                try {
                    jn0.s.Companion companion2 = jn0.s.INSTANCE;
                    n40.b0 b0Var = this.getOrFetchSync;
                    tVar.f75957n = this;
                    tVar.f75958o = str;
                    tVar.f75959p = webAuthFlowFailedException;
                    tVar.f75962s = 1;
                    Object objB2 = n40.b0.b(b0Var, null, tVar, 1, null);
                    if (objB2 != coroutine_suspended) {
                        obj = objB2;
                        bVar = this;
                        activeAuthSession = ((SynchronizeSessionResponse) obj).getManifest().getActiveAuthSession();
                        j40.f fVar2 = bVar.eventTracker;
                        FinancialConnectionsSessionManifest.Pane pane2 = M;
                        if (activeAuthSession != null) {
                            id2 = activeAuthSession.getId();
                        } else {
                            id2 = null;
                        }
                        fVar2.a(new FinancialConnectionsEvent.g(pane2, str, "failed", id2));
                        j40.h.b(bVar.eventTracker, "Auth failed, cancelling AuthSession", webAuthFlowFailedException, bVar.logger, pane2);
                        if (activeAuthSession != null) {
                            bVar.postAuthSessionEvent.d(activeAuthSession.getId(), new j40.b.Failure(new Date(), webAuthFlowFailedException));
                            eVar = bVar.cancelAuthorizationSession;
                            id3 = activeAuthSession.getId();
                            tVar.f75957n = bVar;
                            tVar.f75958o = webAuthFlowFailedException;
                            tVar.f75959p = null;
                            tVar.f75962s = 2;
                            if (eVar.a(id3, tVar) != coroutine_suspended) {
                                webAuthFlowFailedException2 = webAuthFlowFailedException;
                                bVar2 = bVar;
                                webAuthFlowFailedException = webAuthFlowFailedException2;
                                str2 = bVar2;
                            }
                        } else {
                            bVar.logger.debug("Could not find AuthSession to cancel.");
                            str2 = bVar;
                        }
                        str2.k(new u(webAuthFlowFailedException));
                        objB = jn0.s.b(h0.f84049a);
                        r12 = str2;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = this;
                    jn0.s.Companion companion3 = jn0.s.INSTANCE;
                    objB = jn0.s.b(jn0.t.a(th));
                    r12 = str2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            j40.h.b(r12.eventTracker, "failed cancelling session after failed web flow", thE, r12.logger, M);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        Display display;
        TextUpdate text;
        ConsentPane consent;
        DataAccessNotice dataAccessNotice;
        SharedPartnerAuthState.Payload payloadA = h().getValue().f().a();
        FinancialConnectionsAuthorizationSession authSession = payloadA != null ? payloadA.getAuthSession() : null;
        if (authSession == null || (display = authSession.getDisplay()) == null || (text = display.getText()) == null || (consent = text.getConsent()) == null || (dataAccessNotice = consent.getDataAccessNotice()) == null) {
            return;
        }
        this.presentSheet.a(new NoticeSheetState.a.DataAccess(dataAccessNotice), M);
    }

    private final Job U() {
        return f(new b0(null), new p013kotlin.jvm.internal.f0() { // from class: i50.b.c0
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((SharedPartnerAuthState) obj).f();
            }
        }, d0.f75921c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(String sessionId) {
        this.postAuthSessionEvent.d(sessionId, new j40.b.OAuthLaunched(new Date()));
        this.eventTracker.a(new FinancialConnectionsEvent.z(M));
    }

    private final Job W() {
        return s50.i.g(this, new e0(null), null, f0.f75931c, 1, null);
    }

    public final Job O() {
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new v(null), 3, null);
    }

    public final Job P(String uri) {
        p013kotlin.jvm.internal.s.k(uri, "uri");
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new w(uri, null), 3, null);
    }

    public final void Q() {
        k(x.f75973c);
        n(new y());
    }

    public final void R() {
        k(z.f75975c);
    }

    public final void S(s50.j webStatus) {
        p013kotlin.jvm.internal.s.k(webStatus, "webStatus");
        this.logger.debug("Web AuthFlow status received " + webStatus);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new a0(webStatus, this, null), 3, null);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(SharedPartnerAuthState state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        if (state.getInModal()) {
            return null;
        }
        return new TopAppBarStateUpdate(M, state.d(), z50.n.a(state.f()), null, false, 24, null);
    }
}

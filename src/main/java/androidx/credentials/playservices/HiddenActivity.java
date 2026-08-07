package androidx.credentials.playservices;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u0000 $2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\bJ)\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/credentials/playservices/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "x", "(Landroid/os/Bundle;)V", "r", "Landroid/os/ResultReceiver;", "resultReceiver", "", "errName", "errMsg", "y", "(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V", "u", "l", "o", "onCreate", "outState", "onSaveInstanceState", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "a", "Landroid/os/ResultReceiver;", "", "b", "Z", "mWaitingForActivityResult", "c", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class HiddenActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ResultReceiver resultReceiver;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean mWaitingForActivityResult;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/auth/api/identity/BeginSignInResult;", "kotlin.jvm.PlatformType", "it", "Ljn0/h0;", "a", "(Lcom/google/android/gms/auth/api/identity/BeginSignInResult;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<BeginSignInResult, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7999d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(1);
            this.f7999d = i11;
        }

        public final void a(BeginSignInResult beginSignInResult) {
            try {
                HiddenActivity.this.mWaitingForActivityResult = true;
                HiddenActivity.this.startIntentSenderForResult(beginSignInResult.getPendingIntent().getIntentSender(), this.f7999d, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e11) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
                s.h(resultReceiver);
                hiddenActivity.y(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e11.getMessage());
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(BeginSignInResult beginSignInResult) {
            a(beginSignInResult);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/auth/api/identity/SavePasswordResult;", "kotlin.jvm.PlatformType", "it", "Ljn0/h0;", "a", "(Lcom/google/android/gms/auth/api/identity/SavePasswordResult;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<SavePasswordResult, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8001d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11) {
            super(1);
            this.f8001d = i11;
        }

        public final void a(SavePasswordResult savePasswordResult) {
            try {
                HiddenActivity.this.mWaitingForActivityResult = true;
                HiddenActivity.this.startIntentSenderForResult(savePasswordResult.getPendingIntent().getIntentSender(), this.f8001d, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e11) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
                s.h(resultReceiver);
                hiddenActivity.y(resultReceiver, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e11.getMessage());
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(SavePasswordResult savePasswordResult) {
            a(savePasswordResult);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/app/PendingIntent;", "result", "Ljn0/h0;", "a", "(Landroid/app/PendingIntent;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements l<PendingIntent, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8003d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11) {
            super(1);
            this.f8003d = i11;
        }

        public final void a(PendingIntent result) {
            s.k(result, "result");
            try {
                HiddenActivity.this.mWaitingForActivityResult = true;
                HiddenActivity.this.startIntentSenderForResult(result.getIntentSender(), this.f8003d, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e11) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
                s.h(resultReceiver);
                hiddenActivity.y(resultReceiver, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e11.getMessage());
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(PendingIntent pendingIntent) {
            a(pendingIntent);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "it", "Ljn0/h0;", "a", "(Landroid/app/PendingIntent;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements l<PendingIntent, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8005d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11) {
            super(1);
            this.f8005d = i11;
        }

        public final void a(PendingIntent pendingIntent) {
            try {
                HiddenActivity.this.mWaitingForActivityResult = true;
                HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f8005d, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e11) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
                s.h(resultReceiver);
                hiddenActivity.y(resultReceiver, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e11.getMessage());
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(PendingIntent pendingIntent) {
            a(pendingIntent);
            return h0.f84049a;
        }
    }

    private final void l() {
        Task<BeginSignInResult> taskAddOnFailureListener;
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (beginSignInRequest != null) {
            Task<BeginSignInResult> taskBeginSignIn = Identity.getSignInClient((Activity) this).beginSignIn(beginSignInRequest);
            final b bVar = new b(intExtra);
            taskAddOnFailureListener = taskBeginSignIn.addOnSuccessListener(new OnSuccessListener() { // from class: g6.g
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.m(bVar, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: g6.h
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.n(this.f67451a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HiddenActivity hiddenActivity, Exception e11) {
        s.k(e11, "e");
        String str = ((e11 instanceof ApiException) && h6.a.INSTANCE.d().contains(Integer.valueOf(((ApiException) e11).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        s.h(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During begin sign in, failure response from one tap: " + e11.getMessage());
    }

    private final void o() {
        Task<SavePasswordResult> taskAddOnFailureListener;
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (savePasswordRequest != null) {
            Task<SavePasswordResult> taskSavePassword = Identity.getCredentialSavingClient((Activity) this).savePassword(savePasswordRequest);
            final c cVar = new c(intExtra);
            taskAddOnFailureListener = taskSavePassword.addOnSuccessListener(new OnSuccessListener() { // from class: g6.c
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.p(cVar, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: g6.d
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.q(this.f67447a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HiddenActivity hiddenActivity, Exception e11) {
        s.k(e11, "e");
        String str = ((e11 instanceof ApiException) && h6.a.INSTANCE.d().contains(Integer.valueOf(((ApiException) e11).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        s.h(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During save password, found password failure response from one tap " + e11.getMessage());
    }

    private final void r() {
        Task<PendingIntent> taskAddOnFailureListener;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (publicKeyCredentialCreationOptions != null) {
            Task<PendingIntent> registerPendingIntent = Fido.getFido2ApiClient((Activity) this).getRegisterPendingIntent(publicKeyCredentialCreationOptions);
            final d dVar = new d(intExtra);
            taskAddOnFailureListener = registerPendingIntent.addOnSuccessListener(new OnSuccessListener() { // from class: g6.a
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.s(dVar, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: g6.b
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.t(this.f67445a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(HiddenActivity hiddenActivity, Exception e11) {
        s.k(e11, "e");
        String str = ((e11 instanceof ApiException) && h6.a.INSTANCE.d().contains(Integer.valueOf(((ApiException) e11).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        s.h(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During create public key credential, fido registration failure: " + e11.getMessage());
    }

    private final void u() {
        Task<PendingIntent> taskAddOnFailureListener;
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (getSignInIntentRequest != null) {
            Task<PendingIntent> signInIntent = Identity.getSignInClient((Activity) this).getSignInIntent(getSignInIntentRequest);
            final e eVar = new e(intExtra);
            taskAddOnFailureListener = signInIntent.addOnSuccessListener(new OnSuccessListener() { // from class: g6.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.v(eVar, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: g6.f
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.w(this.f67449a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(HiddenActivity hiddenActivity, Exception e11) {
        s.k(e11, "e");
        String str = ((e11 instanceof ApiException) && h6.a.INSTANCE.d().contains(Integer.valueOf(((ApiException) e11).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        s.h(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + e11.getMessage());
    }

    private final void x(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            this.mWaitingForActivityResult = savedInstanceState.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(ResultReceiver resultReceiver, String errName, String errMsg) {
        h6.a.INSTANCE.e(resultReceiver, errName, errMsg);
        finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            h6.a.INSTANCE.f(resultReceiver, requestCode, resultCode, data);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        x(savedInstanceState);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        l();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        r();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        o();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        u();
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        s.k(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.mWaitingForActivityResult);
        super.onSaveInstanceState(outState);
    }
}
